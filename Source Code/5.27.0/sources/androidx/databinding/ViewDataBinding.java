package androidx.databinding;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.util.SparseLongArray;
import android.view.Choreographer;
import android.view.Choreographer.FrameCallback;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewGroup;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.RestrictTo.Scope;
import androidx.databinding.CallbackRegistry.NotifierCallback;
import androidx.databinding.Observable.OnPropertyChangedCallback;
import androidx.databinding.ObservableList.OnListChangedCallback;
import androidx.databinding.ObservableMap.OnMapChangedCallback;
import androidx.databinding.library.R;
import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.OnLifecycleEvent;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;

public abstract class ViewDataBinding extends BaseObservable {
    private static final int BINDING_NUMBER_START = 8;
    public static final String BINDING_TAG_PREFIX = "binding_";
    private static final CreateWeakListener CREATE_LIST_LISTENER = new CreateWeakListener() {
        public WeakListener create(ViewDataBinding viewDataBinding, int i) {
            return new WeakListListener(viewDataBinding, i).getListener();
        }
    };
    private static final CreateWeakListener CREATE_LIVE_DATA_LISTENER = new CreateWeakListener() {
        public WeakListener create(ViewDataBinding viewDataBinding, int i) {
            return new LiveDataListener(viewDataBinding, i).getListener();
        }
    };
    private static final CreateWeakListener CREATE_MAP_LISTENER = new CreateWeakListener() {
        public WeakListener create(ViewDataBinding viewDataBinding, int i) {
            return new WeakMapListener(viewDataBinding, i).getListener();
        }
    };
    private static final CreateWeakListener CREATE_PROPERTY_LISTENER = new CreateWeakListener() {
        public WeakListener create(ViewDataBinding viewDataBinding, int i) {
            return new WeakPropertyListener(viewDataBinding, i).getListener();
        }
    };
    private static final int HALTED = 2;
    private static final int REBIND = 1;
    private static final NotifierCallback<OnRebindCallback, ViewDataBinding, Void> REBIND_NOTIFIER = new NotifierCallback<OnRebindCallback, ViewDataBinding, Void>() {
        public void onNotifyCallback(OnRebindCallback onRebindCallback, ViewDataBinding viewDataBinding, int i, Void voidR) {
            if (i != 1) {
                if (i == 2) {
                    onRebindCallback.onCanceled(viewDataBinding);
                } else if (i == 3) {
                    onRebindCallback.onBound(viewDataBinding);
                }
            } else if (!onRebindCallback.onPreBind(viewDataBinding)) {
                viewDataBinding.mRebindHalted = true;
            }
        }
    };
    private static final int REBOUND = 3;
    private static final OnAttachStateChangeListener ROOT_REATTACHED_LISTENER;
    static int SDK_INT = VERSION.SDK_INT;
    private static final boolean USE_CHOREOGRAPHER = (SDK_INT >= 16);
    private static final ReferenceQueue<ViewDataBinding> sReferenceQueue = new ReferenceQueue();
    protected final DataBindingComponent mBindingComponent;
    private Choreographer mChoreographer;
    private ViewDataBinding mContainingBinding;
    private final FrameCallback mFrameCallback;
    private boolean mInLiveDataRegisterObserver;
    private boolean mIsExecutingPendingBindings;
    private LifecycleOwner mLifecycleOwner;
    private WeakListener[] mLocalFieldObservers;
    private OnStartListener mOnStartListener;
    private boolean mPendingRebind;
    private CallbackRegistry<OnRebindCallback, ViewDataBinding, Void> mRebindCallbacks;
    private boolean mRebindHalted;
    private final Runnable mRebindRunnable;
    private final View mRoot;
    private Handler mUIThreadHandler;

    private interface CreateWeakListener {
        WeakListener create(ViewDataBinding viewDataBinding, int i);
    }

    protected static class IncludedLayouts {
        public final int[][] indexes;
        public final int[][] layoutIds;
        public final String[][] layouts;

        public IncludedLayouts(int i) {
            this.layouts = new String[i][];
            this.indexes = new int[i][];
            this.layoutIds = new int[i][];
        }

        public void setIncludes(int i, String[] strArr, int[] iArr, int[] iArr2) {
            this.layouts[i] = strArr;
            this.indexes[i] = iArr;
            this.layoutIds[i] = iArr2;
        }
    }

    private interface ObservableReference<T> {
        void addListener(T t);

        WeakListener<T> getListener();

        void removeListener(T t);

        void setLifecycleOwner(LifecycleOwner lifecycleOwner);
    }

    private static class WeakListener<T> extends WeakReference<ViewDataBinding> {
        protected final int mLocalFieldId;
        private final ObservableReference<T> mObservable;
        private T mTarget;

        public WeakListener(ViewDataBinding viewDataBinding, int i, ObservableReference<T> observableReference) {
            super(viewDataBinding, ViewDataBinding.sReferenceQueue);
            this.mLocalFieldId = i;
            this.mObservable = observableReference;
        }

        public void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
            this.mObservable.setLifecycleOwner(lifecycleOwner);
        }

        public void setTarget(T t) {
            unregister();
            this.mTarget = t;
            Object obj = this.mTarget;
            if (obj != null) {
                this.mObservable.addListener(obj);
            }
        }

        public boolean unregister() {
            boolean z;
            Object obj = this.mTarget;
            if (obj != null) {
                this.mObservable.removeListener(obj);
                z = true;
            } else {
                z = false;
            }
            this.mTarget = null;
            return z;
        }

        public T getTarget() {
            return this.mTarget;
        }

        /* Access modifiers changed, original: protected */
        public ViewDataBinding getBinder() {
            ViewDataBinding viewDataBinding = (ViewDataBinding) get();
            if (viewDataBinding == null) {
                unregister();
            }
            return viewDataBinding;
        }
    }

    private static class LiveDataListener implements ObservableReference<LiveData<?>>, Observer {
        LifecycleOwner mLifecycleOwner;
        final WeakListener<LiveData<?>> mListener;

        public LiveDataListener(ViewDataBinding viewDataBinding, int i) {
            this.mListener = new WeakListener(viewDataBinding, i, this);
        }

        public void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
            LiveData liveData = (LiveData) this.mListener.getTarget();
            if (liveData != null) {
                if (this.mLifecycleOwner != null) {
                    liveData.removeObserver(this);
                }
                if (lifecycleOwner != null) {
                    liveData.observe(lifecycleOwner, this);
                }
            }
            this.mLifecycleOwner = lifecycleOwner;
        }

        public WeakListener<LiveData<?>> getListener() {
            return this.mListener;
        }

        public void addListener(LiveData<?> liveData) {
            LifecycleOwner lifecycleOwner = this.mLifecycleOwner;
            if (lifecycleOwner != null) {
                liveData.observe(lifecycleOwner, this);
            }
        }

        public void removeListener(LiveData<?> liveData) {
            liveData.removeObserver(this);
        }

        public void onChanged(@Nullable Object obj) {
            ViewDataBinding binder = this.mListener.getBinder();
            if (binder != null) {
                binder.handleFieldChange(this.mListener.mLocalFieldId, this.mListener.getTarget(), 0);
            }
        }
    }

    static class OnStartListener implements LifecycleObserver {
        final WeakReference<ViewDataBinding> mBinding;

        /* synthetic */ OnStartListener(ViewDataBinding viewDataBinding, AnonymousClass1 anonymousClass1) {
            this(viewDataBinding);
        }

        private OnStartListener(ViewDataBinding viewDataBinding) {
            this.mBinding = new WeakReference(viewDataBinding);
        }

        @OnLifecycleEvent(Event.ON_START)
        public void onStart() {
            ViewDataBinding viewDataBinding = (ViewDataBinding) this.mBinding.get();
            if (viewDataBinding != null) {
                viewDataBinding.executePendingBindings();
            }
        }
    }

    protected static abstract class PropertyChangedInverseListener extends OnPropertyChangedCallback implements InverseBindingListener {
        final int mPropertyId;

        public PropertyChangedInverseListener(int i) {
            this.mPropertyId = i;
        }

        public void onPropertyChanged(Observable observable, int i) {
            if (i == this.mPropertyId || i == 0) {
                onChange();
            }
        }
    }

    private static class WeakListListener extends OnListChangedCallback implements ObservableReference<ObservableList> {
        final WeakListener<ObservableList> mListener;

        public void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        }

        public WeakListListener(ViewDataBinding viewDataBinding, int i) {
            this.mListener = new WeakListener(viewDataBinding, i, this);
        }

        public WeakListener<ObservableList> getListener() {
            return this.mListener;
        }

        public void addListener(ObservableList observableList) {
            observableList.addOnListChangedCallback(this);
        }

        public void removeListener(ObservableList observableList) {
            observableList.removeOnListChangedCallback(this);
        }

        public void onChanged(ObservableList observableList) {
            ViewDataBinding binder = this.mListener.getBinder();
            if (binder != null) {
                ObservableList observableList2 = (ObservableList) this.mListener.getTarget();
                if (observableList2 == observableList) {
                    binder.handleFieldChange(this.mListener.mLocalFieldId, observableList2, 0);
                }
            }
        }

        public void onItemRangeChanged(ObservableList observableList, int i, int i2) {
            onChanged(observableList);
        }

        public void onItemRangeInserted(ObservableList observableList, int i, int i2) {
            onChanged(observableList);
        }

        public void onItemRangeMoved(ObservableList observableList, int i, int i2, int i3) {
            onChanged(observableList);
        }

        public void onItemRangeRemoved(ObservableList observableList, int i, int i2) {
            onChanged(observableList);
        }
    }

    private static class WeakMapListener extends OnMapChangedCallback implements ObservableReference<ObservableMap> {
        final WeakListener<ObservableMap> mListener;

        public void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        }

        public WeakMapListener(ViewDataBinding viewDataBinding, int i) {
            this.mListener = new WeakListener(viewDataBinding, i, this);
        }

        public WeakListener<ObservableMap> getListener() {
            return this.mListener;
        }

        public void addListener(ObservableMap observableMap) {
            observableMap.addOnMapChangedCallback(this);
        }

        public void removeListener(ObservableMap observableMap) {
            observableMap.removeOnMapChangedCallback(this);
        }

        public void onMapChanged(ObservableMap observableMap, Object obj) {
            ViewDataBinding binder = this.mListener.getBinder();
            if (binder != null && observableMap == this.mListener.getTarget()) {
                binder.handleFieldChange(this.mListener.mLocalFieldId, observableMap, 0);
            }
        }
    }

    private static class WeakPropertyListener extends OnPropertyChangedCallback implements ObservableReference<Observable> {
        final WeakListener<Observable> mListener;

        public void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        }

        public WeakPropertyListener(ViewDataBinding viewDataBinding, int i) {
            this.mListener = new WeakListener(viewDataBinding, i, this);
        }

        public WeakListener<Observable> getListener() {
            return this.mListener;
        }

        public void addListener(Observable observable) {
            observable.addOnPropertyChangedCallback(this);
        }

        public void removeListener(Observable observable) {
            observable.removeOnPropertyChangedCallback(this);
        }

        public void onPropertyChanged(Observable observable, int i) {
            ViewDataBinding binder = this.mListener.getBinder();
            if (binder != null && ((Observable) this.mListener.getTarget()) == observable) {
                binder.handleFieldChange(this.mListener.mLocalFieldId, observable, i);
            }
        }
    }

    public abstract void executeBindings();

    public abstract boolean hasPendingBindings();

    public abstract void invalidateAll();

    public abstract boolean onFieldChange(int i, Object obj, int i2);

    public abstract boolean setVariable(int i, @Nullable Object obj);

    static {
        if (VERSION.SDK_INT < 19) {
            ROOT_REATTACHED_LISTENER = null;
        } else {
            ROOT_REATTACHED_LISTENER = new OnAttachStateChangeListener() {
                public void onViewDetachedFromWindow(View view) {
                }

                @TargetApi(19)
                public void onViewAttachedToWindow(View view) {
                    ViewDataBinding.getBinding(view).mRebindRunnable.run();
                    view.removeOnAttachStateChangeListener(this);
                }
            };
        }
    }

    protected ViewDataBinding(DataBindingComponent dataBindingComponent, View view, int i) {
        this.mRebindRunnable = new Runnable() {
            public void run() {
                synchronized (this) {
                    ViewDataBinding.this.mPendingRebind = false;
                }
                ViewDataBinding.processReferenceQueue();
                if (VERSION.SDK_INT < 19 || ViewDataBinding.this.mRoot.isAttachedToWindow()) {
                    ViewDataBinding.this.executePendingBindings();
                    return;
                }
                ViewDataBinding.this.mRoot.removeOnAttachStateChangeListener(ViewDataBinding.ROOT_REATTACHED_LISTENER);
                ViewDataBinding.this.mRoot.addOnAttachStateChangeListener(ViewDataBinding.ROOT_REATTACHED_LISTENER);
            }
        };
        this.mPendingRebind = false;
        this.mRebindHalted = false;
        this.mBindingComponent = dataBindingComponent;
        this.mLocalFieldObservers = new WeakListener[i];
        this.mRoot = view;
        if (Looper.myLooper() == null) {
            throw new IllegalStateException("DataBinding must be created in view's UI Thread");
        } else if (USE_CHOREOGRAPHER) {
            this.mChoreographer = Choreographer.getInstance();
            this.mFrameCallback = new FrameCallback() {
                public void doFrame(long j) {
                    ViewDataBinding.this.mRebindRunnable.run();
                }
            };
        } else {
            this.mFrameCallback = null;
            this.mUIThreadHandler = new Handler(Looper.myLooper());
        }
    }

    protected ViewDataBinding(Object obj, View view, int i) {
        this(checkAndCastToBindingComponent(obj), view, i);
    }

    private static DataBindingComponent checkAndCastToBindingComponent(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof DataBindingComponent) {
            return (DataBindingComponent) obj;
        }
        throw new IllegalArgumentException("The provided bindingComponent parameter must be an instance of DataBindingComponent. See  https://issuetracker.google.com/issues/116541301 for details of why this parameter is not defined as DataBindingComponent");
    }

    /* Access modifiers changed, original: protected */
    public void setRootTag(View view) {
        view.setTag(R.id.dataBinding, this);
    }

    /* Access modifiers changed, original: protected */
    public void setRootTag(View[] viewArr) {
        for (View tag : viewArr) {
            tag.setTag(R.id.dataBinding, this);
        }
    }

    public static int getBuildSdkInt() {
        return SDK_INT;
    }

    @MainThread
    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        LifecycleOwner lifecycleOwner2 = this.mLifecycleOwner;
        if (lifecycleOwner2 != lifecycleOwner) {
            if (lifecycleOwner2 != null) {
                lifecycleOwner2.getLifecycle().removeObserver(this.mOnStartListener);
            }
            this.mLifecycleOwner = lifecycleOwner;
            if (lifecycleOwner != null) {
                if (this.mOnStartListener == null) {
                    this.mOnStartListener = new OnStartListener(this, null);
                }
                lifecycleOwner.getLifecycle().addObserver(this.mOnStartListener);
            }
            for (WeakListener weakListener : this.mLocalFieldObservers) {
                if (weakListener != null) {
                    weakListener.setLifecycleOwner(lifecycleOwner);
                }
            }
        }
    }

    @Nullable
    public LifecycleOwner getLifecycleOwner() {
        return this.mLifecycleOwner;
    }

    public void addOnRebindCallback(@NonNull OnRebindCallback onRebindCallback) {
        if (this.mRebindCallbacks == null) {
            this.mRebindCallbacks = new CallbackRegistry(REBIND_NOTIFIER);
        }
        this.mRebindCallbacks.add(onRebindCallback);
    }

    public void removeOnRebindCallback(@NonNull OnRebindCallback onRebindCallback) {
        CallbackRegistry callbackRegistry = this.mRebindCallbacks;
        if (callbackRegistry != null) {
            callbackRegistry.remove(onRebindCallback);
        }
    }

    public void executePendingBindings() {
        ViewDataBinding viewDataBinding = this.mContainingBinding;
        if (viewDataBinding == null) {
            executeBindingsInternal();
        } else {
            viewDataBinding.executePendingBindings();
        }
    }

    private void executeBindingsInternal() {
        if (this.mIsExecutingPendingBindings) {
            requestRebind();
        } else if (hasPendingBindings()) {
            this.mIsExecutingPendingBindings = true;
            this.mRebindHalted = false;
            CallbackRegistry callbackRegistry = this.mRebindCallbacks;
            if (callbackRegistry != null) {
                callbackRegistry.notifyCallbacks(this, 1, null);
                if (this.mRebindHalted) {
                    this.mRebindCallbacks.notifyCallbacks(this, 2, null);
                }
            }
            if (!this.mRebindHalted) {
                executeBindings();
                CallbackRegistry callbackRegistry2 = this.mRebindCallbacks;
                if (callbackRegistry2 != null) {
                    callbackRegistry2.notifyCallbacks(this, 3, null);
                }
            }
            this.mIsExecutingPendingBindings = false;
        }
    }

    protected static void executeBindingsOn(ViewDataBinding viewDataBinding) {
        viewDataBinding.executeBindingsInternal();
    }

    /* Access modifiers changed, original: 0000 */
    public void forceExecuteBindings() {
        executeBindings();
    }

    public void unbind() {
        for (WeakListener weakListener : this.mLocalFieldObservers) {
            if (weakListener != null) {
                weakListener.unregister();
            }
        }
    }

    static ViewDataBinding getBinding(View view) {
        return view != null ? (ViewDataBinding) view.getTag(R.id.dataBinding) : null;
    }

    @NonNull
    public View getRoot() {
        return this.mRoot;
    }

    private void handleFieldChange(int i, Object obj, int i2) {
        if (!this.mInLiveDataRegisterObserver && onFieldChange(i, obj, i2)) {
            requestRebind();
        }
    }

    /* Access modifiers changed, original: protected */
    public boolean unregisterFrom(int i) {
        WeakListener weakListener = this.mLocalFieldObservers[i];
        return weakListener != null ? weakListener.unregister() : false;
    }

    /* Access modifiers changed, original: protected */
    /* JADX WARNING: Missing block: B:17:0x002a, code skipped:
            if (USE_CHOREOGRAPHER == false) goto L_0x0034;
     */
    /* JADX WARNING: Missing block: B:18:0x002c, code skipped:
            r2.mChoreographer.postFrameCallback(r2.mFrameCallback);
     */
    /* JADX WARNING: Missing block: B:19:0x0034, code skipped:
            r2.mUIThreadHandler.post(r2.mRebindRunnable);
     */
    public void requestRebind() {
        /*
        r2 = this;
        r0 = r2.mContainingBinding;
        if (r0 == 0) goto L_0x0008;
    L_0x0004:
        r0.requestRebind();
        goto L_0x003b;
    L_0x0008:
        r0 = r2.mLifecycleOwner;
        if (r0 == 0) goto L_0x001d;
    L_0x000c:
        r0 = r0.getLifecycle();
        r0 = r0.getCurrentState();
        r1 = androidx.lifecycle.Lifecycle.State.STARTED;
        r0 = r0.isAtLeast(r1);
        if (r0 != 0) goto L_0x001d;
    L_0x001c:
        return;
    L_0x001d:
        monitor-enter(r2);
        r0 = r2.mPendingRebind;	 Catch:{ all -> 0x003c }
        if (r0 == 0) goto L_0x0024;
    L_0x0022:
        monitor-exit(r2);	 Catch:{ all -> 0x003c }
        return;
    L_0x0024:
        r0 = 1;
        r2.mPendingRebind = r0;	 Catch:{ all -> 0x003c }
        monitor-exit(r2);	 Catch:{ all -> 0x003c }
        r0 = USE_CHOREOGRAPHER;
        if (r0 == 0) goto L_0x0034;
    L_0x002c:
        r0 = r2.mChoreographer;
        r1 = r2.mFrameCallback;
        r0.postFrameCallback(r1);
        goto L_0x003b;
    L_0x0034:
        r0 = r2.mUIThreadHandler;
        r1 = r2.mRebindRunnable;
        r0.post(r1);
    L_0x003b:
        return;
    L_0x003c:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x003c }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.databinding.ViewDataBinding.requestRebind():void");
    }

    /* Access modifiers changed, original: protected */
    public Object getObservedField(int i) {
        WeakListener weakListener = this.mLocalFieldObservers[i];
        if (weakListener == null) {
            return null;
        }
        return weakListener.getTarget();
    }

    private boolean updateRegistration(int i, Object obj, CreateWeakListener createWeakListener) {
        if (obj == null) {
            return unregisterFrom(i);
        }
        WeakListener weakListener = this.mLocalFieldObservers[i];
        if (weakListener == null) {
            registerTo(i, obj, createWeakListener);
            return true;
        } else if (weakListener.getTarget() == obj) {
            return false;
        } else {
            unregisterFrom(i);
            registerTo(i, obj, createWeakListener);
            return true;
        }
    }

    /* Access modifiers changed, original: protected */
    public boolean updateRegistration(int i, Observable observable) {
        return updateRegistration(i, observable, CREATE_PROPERTY_LISTENER);
    }

    /* Access modifiers changed, original: protected */
    public boolean updateRegistration(int i, ObservableList observableList) {
        return updateRegistration(i, observableList, CREATE_LIST_LISTENER);
    }

    /* Access modifiers changed, original: protected */
    public boolean updateRegistration(int i, ObservableMap observableMap) {
        return updateRegistration(i, observableMap, CREATE_MAP_LISTENER);
    }

    /* Access modifiers changed, original: protected */
    public boolean updateLiveDataRegistration(int i, LiveData<?> liveData) {
        this.mInLiveDataRegisterObserver = true;
        try {
            boolean updateRegistration = updateRegistration(i, liveData, CREATE_LIVE_DATA_LISTENER);
            return updateRegistration;
        } finally {
            this.mInLiveDataRegisterObserver = false;
        }
    }

    /* Access modifiers changed, original: protected */
    public void ensureBindingComponentIsNotNull(Class<?> cls) {
        if (this.mBindingComponent == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Required DataBindingComponent is null in class ");
            stringBuilder.append(getClass().getSimpleName());
            stringBuilder.append(". A BindingAdapter in ");
            stringBuilder.append(cls.getCanonicalName());
            stringBuilder.append(" is not static and requires an object to use, retrieved from the DataBindingComponent. If you don't use an inflation method taking a DataBindingComponent, use DataBindingUtil.setDefaultComponent or make all BindingAdapter methods static.");
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: protected */
    public void registerTo(int i, Object obj, CreateWeakListener createWeakListener) {
        if (obj != null) {
            WeakListener weakListener = this.mLocalFieldObservers[i];
            if (weakListener == null) {
                weakListener = createWeakListener.create(this, i);
                this.mLocalFieldObservers[i] = weakListener;
                LifecycleOwner lifecycleOwner = this.mLifecycleOwner;
                if (lifecycleOwner != null) {
                    weakListener.setLifecycleOwner(lifecycleOwner);
                }
            }
            weakListener.setTarget(obj);
        }
    }

    protected static ViewDataBinding bind(Object obj, View view, int i) {
        return DataBindingUtil.bind(checkAndCastToBindingComponent(obj), view, i);
    }

    protected static Object[] mapBindings(DataBindingComponent dataBindingComponent, View view, int i, IncludedLayouts includedLayouts, SparseIntArray sparseIntArray) {
        Object[] objArr = new Object[i];
        mapBindings(dataBindingComponent, view, objArr, includedLayouts, sparseIntArray, true);
        return objArr;
    }

    protected static boolean parse(String str, boolean z) {
        return str == null ? z : Boolean.parseBoolean(str);
    }

    protected static byte parse(String str, byte b) {
        try {
            return Byte.parseByte(str);
        } catch (NumberFormatException unused) {
            return b;
        }
    }

    protected static short parse(String str, short s) {
        try {
            return Short.parseShort(str);
        } catch (NumberFormatException unused) {
            return s;
        }
    }

    protected static int parse(String str, int i) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    protected static long parse(String str, long j) {
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j;
        }
    }

    protected static float parse(String str, float f) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException unused) {
            return f;
        }
    }

    protected static double parse(String str, double d) {
        try {
            return Double.parseDouble(str);
        } catch (NumberFormatException unused) {
            return d;
        }
    }

    protected static char parse(String str, char c) {
        return (str == null || str.isEmpty()) ? c : str.charAt(0);
    }

    protected static int getColorFromResource(View view, int i) {
        if (VERSION.SDK_INT >= 23) {
            return view.getContext().getColor(i);
        }
        return view.getResources().getColor(i);
    }

    protected static ColorStateList getColorStateListFromResource(View view, int i) {
        if (VERSION.SDK_INT >= 23) {
            return view.getContext().getColorStateList(i);
        }
        return view.getResources().getColorStateList(i);
    }

    protected static Drawable getDrawableFromResource(View view, int i) {
        if (VERSION.SDK_INT >= 21) {
            return view.getContext().getDrawable(i);
        }
        return view.getResources().getDrawable(i);
    }

    protected static <T> T getFromArray(T[] tArr, int i) {
        return (tArr == null || i < 0 || i >= tArr.length) ? null : tArr[i];
    }

    protected static <T> void setTo(T[] tArr, int i, T t) {
        if (tArr != null && i >= 0 && i < tArr.length) {
            tArr[i] = t;
        }
    }

    protected static boolean getFromArray(boolean[] zArr, int i) {
        return (zArr == null || i < 0 || i >= zArr.length) ? false : zArr[i];
    }

    protected static void setTo(boolean[] zArr, int i, boolean z) {
        if (zArr != null && i >= 0 && i < zArr.length) {
            zArr[i] = z;
        }
    }

    protected static byte getFromArray(byte[] bArr, int i) {
        return (bArr == null || i < 0 || i >= bArr.length) ? (byte) 0 : bArr[i];
    }

    protected static void setTo(byte[] bArr, int i, byte b) {
        if (bArr != null && i >= 0 && i < bArr.length) {
            bArr[i] = b;
        }
    }

    protected static short getFromArray(short[] sArr, int i) {
        return (sArr == null || i < 0 || i >= sArr.length) ? (short) 0 : sArr[i];
    }

    protected static void setTo(short[] sArr, int i, short s) {
        if (sArr != null && i >= 0 && i < sArr.length) {
            sArr[i] = s;
        }
    }

    protected static char getFromArray(char[] cArr, int i) {
        return (cArr == null || i < 0 || i >= cArr.length) ? 0 : cArr[i];
    }

    protected static void setTo(char[] cArr, int i, char c) {
        if (cArr != null && i >= 0 && i < cArr.length) {
            cArr[i] = c;
        }
    }

    protected static int getFromArray(int[] iArr, int i) {
        return (iArr == null || i < 0 || i >= iArr.length) ? 0 : iArr[i];
    }

    protected static void setTo(int[] iArr, int i, int i2) {
        if (iArr != null && i >= 0 && i < iArr.length) {
            iArr[i] = i2;
        }
    }

    protected static long getFromArray(long[] jArr, int i) {
        return (jArr == null || i < 0 || i >= jArr.length) ? 0 : jArr[i];
    }

    protected static void setTo(long[] jArr, int i, long j) {
        if (jArr != null && i >= 0 && i < jArr.length) {
            jArr[i] = j;
        }
    }

    protected static float getFromArray(float[] fArr, int i) {
        return (fArr == null || i < 0 || i >= fArr.length) ? 0.0f : fArr[i];
    }

    protected static void setTo(float[] fArr, int i, float f) {
        if (fArr != null && i >= 0 && i < fArr.length) {
            fArr[i] = f;
        }
    }

    protected static double getFromArray(double[] dArr, int i) {
        return (dArr == null || i < 0 || i >= dArr.length) ? 0.0d : dArr[i];
    }

    protected static void setTo(double[] dArr, int i, double d) {
        if (dArr != null && i >= 0 && i < dArr.length) {
            dArr[i] = d;
        }
    }

    protected static <T> T getFromList(List<T> list, int i) {
        return (list == null || i < 0 || i >= list.size()) ? null : list.get(i);
    }

    protected static <T> void setTo(List<T> list, int i, T t) {
        if (list != null && i >= 0 && i < list.size()) {
            list.set(i, t);
        }
    }

    protected static <T> T getFromList(SparseArray<T> sparseArray, int i) {
        return (sparseArray == null || i < 0) ? null : sparseArray.get(i);
    }

    protected static <T> void setTo(SparseArray<T> sparseArray, int i, T t) {
        if (sparseArray != null && i >= 0 && i < sparseArray.size()) {
            sparseArray.put(i, t);
        }
    }

    @TargetApi(16)
    protected static <T> T getFromList(LongSparseArray<T> longSparseArray, int i) {
        return (longSparseArray == null || i < 0) ? null : longSparseArray.get((long) i);
    }

    @TargetApi(16)
    protected static <T> void setTo(LongSparseArray<T> longSparseArray, int i, T t) {
        if (longSparseArray != null && i >= 0 && i < longSparseArray.size()) {
            longSparseArray.put((long) i, t);
        }
    }

    protected static <T> T getFromList(androidx.collection.LongSparseArray<T> longSparseArray, int i) {
        return (longSparseArray == null || i < 0) ? null : longSparseArray.get((long) i);
    }

    protected static <T> void setTo(androidx.collection.LongSparseArray<T> longSparseArray, int i, T t) {
        if (longSparseArray != null && i >= 0 && i < longSparseArray.size()) {
            longSparseArray.put((long) i, t);
        }
    }

    protected static boolean getFromList(SparseBooleanArray sparseBooleanArray, int i) {
        return (sparseBooleanArray == null || i < 0) ? false : sparseBooleanArray.get(i);
    }

    protected static void setTo(SparseBooleanArray sparseBooleanArray, int i, boolean z) {
        if (sparseBooleanArray != null && i >= 0 && i < sparseBooleanArray.size()) {
            sparseBooleanArray.put(i, z);
        }
    }

    protected static int getFromList(SparseIntArray sparseIntArray, int i) {
        return (sparseIntArray == null || i < 0) ? 0 : sparseIntArray.get(i);
    }

    protected static void setTo(SparseIntArray sparseIntArray, int i, int i2) {
        if (sparseIntArray != null && i >= 0 && i < sparseIntArray.size()) {
            sparseIntArray.put(i, i2);
        }
    }

    @TargetApi(18)
    protected static long getFromList(SparseLongArray sparseLongArray, int i) {
        return (sparseLongArray == null || i < 0) ? 0 : sparseLongArray.get(i);
    }

    @TargetApi(18)
    protected static void setTo(SparseLongArray sparseLongArray, int i, long j) {
        if (sparseLongArray != null && i >= 0 && i < sparseLongArray.size()) {
            sparseLongArray.put(i, j);
        }
    }

    protected static <K, T> T getFrom(Map<K, T> map, K k) {
        return map == null ? null : map.get(k);
    }

    protected static <K, T> void setTo(Map<K, T> map, K k, T t) {
        if (map != null) {
            map.put(k, t);
        }
    }

    protected static void setBindingInverseListener(ViewDataBinding viewDataBinding, InverseBindingListener inverseBindingListener, PropertyChangedInverseListener propertyChangedInverseListener) {
        if (inverseBindingListener != propertyChangedInverseListener) {
            if (inverseBindingListener != null) {
                viewDataBinding.removeOnPropertyChangedCallback((PropertyChangedInverseListener) inverseBindingListener);
            }
            if (propertyChangedInverseListener != null) {
                viewDataBinding.addOnPropertyChangedCallback(propertyChangedInverseListener);
            }
        }
    }

    protected static int safeUnbox(Integer num) {
        return num == null ? 0 : num.intValue();
    }

    protected static long safeUnbox(Long l) {
        return l == null ? 0 : l.longValue();
    }

    protected static short safeUnbox(Short sh) {
        return sh == null ? (short) 0 : sh.shortValue();
    }

    protected static byte safeUnbox(Byte b) {
        return b == null ? (byte) 0 : b.byteValue();
    }

    protected static char safeUnbox(Character ch) {
        return ch == null ? 0 : ch.charValue();
    }

    protected static double safeUnbox(Double d) {
        return d == null ? 0.0d : d.doubleValue();
    }

    protected static float safeUnbox(Float f) {
        return f == null ? 0.0f : f.floatValue();
    }

    protected static boolean safeUnbox(Boolean bool) {
        return bool == null ? false : bool.booleanValue();
    }

    /* Access modifiers changed, original: protected */
    public void setContainedBinding(ViewDataBinding viewDataBinding) {
        if (viewDataBinding != null) {
            viewDataBinding.mContainingBinding = this;
        }
    }

    protected static Object[] mapBindings(DataBindingComponent dataBindingComponent, View[] viewArr, int i, IncludedLayouts includedLayouts, SparseIntArray sparseIntArray) {
        Object[] objArr = new Object[i];
        for (View mapBindings : viewArr) {
            mapBindings(dataBindingComponent, mapBindings, objArr, includedLayouts, sparseIntArray, true);
        }
        return objArr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:73:0x010e A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0101  */
    private static void mapBindings(androidx.databinding.DataBindingComponent r16, android.view.View r17, java.lang.Object[] r18, androidx.databinding.ViewDataBinding.IncludedLayouts r19, android.util.SparseIntArray r20, boolean r21) {
        /*
        r6 = r16;
        r0 = r17;
        r7 = r19;
        r8 = r20;
        r1 = getBinding(r17);
        if (r1 == 0) goto L_0x000f;
    L_0x000e:
        return;
    L_0x000f:
        r1 = r17.getTag();
        r2 = r1 instanceof java.lang.String;
        if (r2 == 0) goto L_0x001a;
    L_0x0017:
        r1 = (java.lang.String) r1;
        goto L_0x001b;
    L_0x001a:
        r1 = 0;
    L_0x001b:
        r9 = "layout";
        r2 = -1;
        r11 = 1;
        if (r21 == 0) goto L_0x004c;
    L_0x0021:
        if (r1 == 0) goto L_0x004c;
    L_0x0023:
        r3 = r1.startsWith(r9);
        if (r3 == 0) goto L_0x004c;
    L_0x0029:
        r3 = 95;
        r3 = r1.lastIndexOf(r3);
        if (r3 <= 0) goto L_0x0048;
    L_0x0031:
        r3 = r3 + r11;
        r4 = isNumeric(r1, r3);
        if (r4 == 0) goto L_0x0048;
    L_0x0038:
        r1 = parseTagInt(r1, r3);
        r3 = r18[r1];
        if (r3 != 0) goto L_0x0042;
    L_0x0040:
        r18[r1] = r0;
    L_0x0042:
        if (r7 != 0) goto L_0x0045;
    L_0x0044:
        r1 = -1;
    L_0x0045:
        r3 = r1;
        r1 = 1;
        goto L_0x004a;
    L_0x0048:
        r1 = 0;
        r3 = -1;
    L_0x004a:
        r12 = r3;
        goto L_0x006a;
    L_0x004c:
        if (r1 == 0) goto L_0x0068;
    L_0x004e:
        r3 = "binding_";
        r3 = r1.startsWith(r3);
        if (r3 == 0) goto L_0x0068;
    L_0x0056:
        r3 = BINDING_NUMBER_START;
        r1 = parseTagInt(r1, r3);
        r3 = r18[r1];
        if (r3 != 0) goto L_0x0062;
    L_0x0060:
        r18[r1] = r0;
    L_0x0062:
        if (r7 != 0) goto L_0x0065;
    L_0x0064:
        r1 = -1;
    L_0x0065:
        r12 = r1;
        r1 = 1;
        goto L_0x006a;
    L_0x0068:
        r1 = 0;
        r12 = -1;
    L_0x006a:
        if (r1 != 0) goto L_0x0080;
    L_0x006c:
        r1 = r17.getId();
        if (r1 <= 0) goto L_0x0080;
    L_0x0072:
        if (r8 == 0) goto L_0x0080;
    L_0x0074:
        r1 = r8.get(r1, r2);
        if (r1 < 0) goto L_0x0080;
    L_0x007a:
        r2 = r18[r1];
        if (r2 != 0) goto L_0x0080;
    L_0x007e:
        r18[r1] = r0;
    L_0x0080:
        r1 = r0 instanceof android.view.ViewGroup;
        if (r1 == 0) goto L_0x0116;
    L_0x0084:
        r13 = r0;
        r13 = (android.view.ViewGroup) r13;
        r14 = r13.getChildCount();
        r0 = 0;
        r1 = 0;
    L_0x008d:
        if (r0 >= r14) goto L_0x0116;
    L_0x008f:
        r2 = r13.getChildAt(r0);
        if (r12 < 0) goto L_0x00fc;
    L_0x0095:
        r3 = r2.getTag();
        r3 = r3 instanceof java.lang.String;
        if (r3 == 0) goto L_0x00fc;
    L_0x009d:
        r3 = r2.getTag();
        r3 = (java.lang.String) r3;
        r4 = "_0";
        r4 = r3.endsWith(r4);
        if (r4 == 0) goto L_0x00fc;
    L_0x00ab:
        r4 = r3.startsWith(r9);
        if (r4 == 0) goto L_0x00fc;
    L_0x00b1:
        r4 = 47;
        r4 = r3.indexOf(r4);
        if (r4 <= 0) goto L_0x00fc;
    L_0x00b9:
        r3 = findIncludeIndex(r3, r1, r7, r12);
        if (r3 < 0) goto L_0x00fc;
    L_0x00bf:
        r1 = r3 + 1;
        r4 = r7.indexes;
        r4 = r4[r12];
        r4 = r4[r3];
        r5 = r7.layoutIds;
        r5 = r5[r12];
        r3 = r5[r3];
        r5 = findLastMatching(r13, r0);
        if (r5 != r0) goto L_0x00dc;
    L_0x00d3:
        r3 = androidx.databinding.DataBindingUtil.bind(r6, r2, r3);
        r18[r4] = r3;
        r10 = r0;
        r15 = r1;
        goto L_0x00ff;
    L_0x00dc:
        r5 = r5 - r0;
        r5 = r5 + r11;
        r15 = new android.view.View[r5];
        r10 = 0;
    L_0x00e1:
        if (r10 >= r5) goto L_0x00ef;
    L_0x00e3:
        r11 = r0 + r10;
        r11 = r13.getChildAt(r11);
        r15[r10] = r11;
        r10 = r10 + 1;
        r11 = 1;
        goto L_0x00e1;
    L_0x00ef:
        r3 = androidx.databinding.DataBindingUtil.bind(r6, r15, r3);
        r18[r4] = r3;
        r5 = r5 + -1;
        r0 = r0 + r5;
        r10 = r0;
        r15 = r1;
        r11 = 1;
        goto L_0x00ff;
    L_0x00fc:
        r10 = r0;
        r15 = r1;
        r11 = 0;
    L_0x00ff:
        if (r11 != 0) goto L_0x010e;
    L_0x0101:
        r5 = 0;
        r0 = r16;
        r1 = r2;
        r2 = r18;
        r3 = r19;
        r4 = r20;
        mapBindings(r0, r1, r2, r3, r4, r5);
    L_0x010e:
        r0 = 1;
        r1 = r10 + 1;
        r0 = r1;
        r1 = r15;
        r11 = 1;
        goto L_0x008d;
    L_0x0116:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.databinding.ViewDataBinding.mapBindings(androidx.databinding.DataBindingComponent, android.view.View, java.lang.Object[], androidx.databinding.ViewDataBinding$IncludedLayouts, android.util.SparseIntArray, boolean):void");
    }

    private static int findIncludeIndex(String str, int i, IncludedLayouts includedLayouts, int i2) {
        CharSequence subSequence = str.subSequence(str.indexOf(47) + 1, str.length() - 2);
        String[] strArr = includedLayouts.layouts[i2];
        i2 = strArr.length;
        while (i < i2) {
            if (TextUtils.equals(subSequence, strArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    private static int findLastMatching(ViewGroup viewGroup, int i) {
        String str = (String) viewGroup.getChildAt(i).getTag();
        String substring = str.substring(0, str.length() - 1);
        int length = substring.length();
        int childCount = viewGroup.getChildCount();
        for (int i2 = i + 1; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            String str2 = childAt.getTag() instanceof String ? (String) childAt.getTag() : null;
            if (str2 != null && str2.startsWith(substring)) {
                if (str2.length() == str.length() && str2.charAt(str2.length() - 1) == '0') {
                    return i;
                }
                if (isNumeric(str2, length)) {
                    i = i2;
                }
            }
        }
        return i;
    }

    private static boolean isNumeric(String str, int i) {
        int length = str.length();
        if (length == i) {
            return false;
        }
        while (i < length) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
            i++;
        }
        return true;
    }

    private static int parseTagInt(String str, int i) {
        int i2 = 0;
        while (i < str.length()) {
            i2 = (i2 * 10) + (str.charAt(i) - 48);
            i++;
        }
        return i2;
    }

    private static void processReferenceQueue() {
        while (true) {
            Reference poll = sReferenceQueue.poll();
            if (poll == null) {
                return;
            }
            if (poll instanceof WeakListener) {
                ((WeakListener) poll).unregister();
            }
        }
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    protected static <T extends ViewDataBinding> T inflateInternal(@NonNull LayoutInflater layoutInflater, int i, @Nullable ViewGroup viewGroup, boolean z, @Nullable Object obj) {
        return DataBindingUtil.inflate(layoutInflater, i, viewGroup, z, checkAndCastToBindingComponent(obj));
    }
}
