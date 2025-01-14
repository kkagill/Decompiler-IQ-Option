package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region.Op;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup.OnHierarchyChangeListener;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.VisibleForTesting;
import androidx.coordinatorlayout.R;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.util.ObjectsCompat;
import androidx.core.util.Pools.Pool;
import androidx.core.util.Pools.SynchronizedPool;
import androidx.core.view.GravityCompat;
import androidx.core.view.NestedScrollingParent2;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.customview.view.AbsSavedState;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CoordinatorLayout extends ViewGroup implements NestedScrollingParent2 {
    static final Class<?>[] CONSTRUCTOR_PARAMS = new Class[]{Context.class, AttributeSet.class};
    static final int EVENT_NESTED_SCROLL = 1;
    static final int EVENT_PRE_DRAW = 0;
    static final int EVENT_VIEW_REMOVED = 2;
    static final String TAG = "CoordinatorLayout";
    static final Comparator<View> TOP_SORTED_CHILDREN_COMPARATOR;
    private static final int TYPE_ON_INTERCEPT = 0;
    private static final int TYPE_ON_TOUCH = 1;
    static final String WIDGET_PACKAGE_NAME;
    static final ThreadLocal<Map<String, Constructor<Behavior>>> sConstructors = new ThreadLocal();
    private static final Pool<Rect> sRectPool = new SynchronizedPool(12);
    private OnApplyWindowInsetsListener mApplyWindowInsetsListener;
    private View mBehaviorTouchView;
    private final DirectedAcyclicGraph<View> mChildDag;
    private final List<View> mDependencySortedChildren;
    private boolean mDisallowInterceptReset;
    private boolean mDrawStatusBarBackground;
    private boolean mIsAttachedToWindow;
    private int[] mKeylines;
    private WindowInsetsCompat mLastInsets;
    private boolean mNeedsPreDrawListener;
    private final NestedScrollingParentHelper mNestedScrollingParentHelper;
    private View mNestedScrollingTarget;
    OnHierarchyChangeListener mOnHierarchyChangeListener;
    private OnPreDrawListener mOnPreDrawListener;
    private Paint mScrimPaint;
    private Drawable mStatusBarBackground;
    private final List<View> mTempDependenciesList;
    private final int[] mTempIntPair;
    private final List<View> mTempList1;

    public interface AttachedBehavior {
        @NonNull
        Behavior getBehavior();
    }

    public static abstract class Behavior<V extends View> {
        public boolean getInsetDodgeRect(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull Rect rect) {
            return false;
        }

        @ColorInt
        public int getScrimColor(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v) {
            return ViewCompat.MEASURED_STATE_MASK;
        }

        @FloatRange(from = 0.0d, to = 1.0d)
        public float getScrimOpacity(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v) {
            return 0.0f;
        }

        public boolean layoutDependsOn(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view) {
            return false;
        }

        @NonNull
        public WindowInsetsCompat onApplyWindowInsets(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull WindowInsetsCompat windowInsetsCompat) {
            return windowInsetsCompat;
        }

        public void onAttachedToLayoutParams(@NonNull LayoutParams layoutParams) {
        }

        public boolean onDependentViewChanged(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view) {
            return false;
        }

        public void onDependentViewRemoved(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view) {
        }

        public void onDetachedFromLayoutParams() {
        }

        public boolean onInterceptTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull MotionEvent motionEvent) {
            return false;
        }

        public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, int i) {
            return false;
        }

        public boolean onMeasureChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, int i, int i2, int i3, int i4) {
            return false;
        }

        public boolean onNestedFling(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, float f, float f2, boolean z) {
            return false;
        }

        public boolean onNestedPreFling(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, float f, float f2) {
            return false;
        }

        @Deprecated
        public void onNestedPreScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i, int i2, @NonNull int[] iArr) {
        }

        @Deprecated
        public void onNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i, int i2, int i3, int i4) {
        }

        @Deprecated
        public void onNestedScrollAccepted(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, @NonNull View view2, int i) {
        }

        public boolean onRequestChildRectangleOnScreen(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull Rect rect, boolean z) {
            return false;
        }

        public void onRestoreInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull Parcelable parcelable) {
        }

        @Deprecated
        public boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, @NonNull View view2, int i) {
            return false;
        }

        @Deprecated
        public void onStopNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view) {
        }

        public boolean onTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull MotionEvent motionEvent) {
            return false;
        }

        public Behavior(Context context, AttributeSet attributeSet) {
        }

        public boolean blocksInteractionBelow(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v) {
            return getScrimOpacity(coordinatorLayout, v) > 0.0f;
        }

        public static void setTag(@NonNull View view, @Nullable Object obj) {
            ((LayoutParams) view.getLayoutParams()).mBehaviorTag = obj;
        }

        @Nullable
        public static Object getTag(@NonNull View view) {
            return ((LayoutParams) view.getLayoutParams()).mBehaviorTag;
        }

        public boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, @NonNull View view2, int i, int i2) {
            return i2 == 0 ? onStartNestedScroll(coordinatorLayout, v, view, view2, i) : false;
        }

        public void onNestedScrollAccepted(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, @NonNull View view2, int i, int i2) {
            if (i2 == 0) {
                onNestedScrollAccepted(coordinatorLayout, v, view, view2, i);
            }
        }

        public void onStopNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i) {
            if (i == 0) {
                onStopNestedScroll(coordinatorLayout, v, view);
            }
        }

        public void onNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i, int i2, int i3, int i4, int i5) {
            if (i5 == 0) {
                onNestedScroll(coordinatorLayout, v, view, i, i2, i3, i4);
            }
        }

        public void onNestedPreScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i, int i2, @NonNull int[] iArr, int i3) {
            if (i3 == 0) {
                onNestedPreScroll(coordinatorLayout, v, view, i, i2, iArr);
            }
        }

        @Nullable
        public Parcelable onSaveInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v) {
            return BaseSavedState.EMPTY_STATE;
        }
    }

    @Deprecated
    @Retention(RetentionPolicy.RUNTIME)
    public @interface DefaultBehavior {
        Class<? extends Behavior> value();
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface DispatchChangeEvent {
    }

    private class HierarchyChangeListener implements OnHierarchyChangeListener {
        HierarchyChangeListener() {
        }

        public void onChildViewAdded(View view, View view2) {
            if (CoordinatorLayout.this.mOnHierarchyChangeListener != null) {
                CoordinatorLayout.this.mOnHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.onChildViewsChanged(2);
            if (CoordinatorLayout.this.mOnHierarchyChangeListener != null) {
                CoordinatorLayout.this.mOnHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public static class LayoutParams extends MarginLayoutParams {
        public int anchorGravity = 0;
        public int dodgeInsetEdges = 0;
        public int gravity = 0;
        public int insetEdge = 0;
        public int keyline = -1;
        View mAnchorDirectChild;
        int mAnchorId = -1;
        View mAnchorView;
        Behavior mBehavior;
        boolean mBehaviorResolved = false;
        Object mBehaviorTag;
        private boolean mDidAcceptNestedScrollNonTouch;
        private boolean mDidAcceptNestedScrollTouch;
        private boolean mDidBlockInteraction;
        private boolean mDidChangeAfterNestedScroll;
        int mInsetOffsetX;
        int mInsetOffsetY;
        final Rect mLastChildRect = new Rect();

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        LayoutParams(@NonNull Context context, @Nullable AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CoordinatorLayout_Layout);
            this.gravity = obtainStyledAttributes.getInteger(R.styleable.CoordinatorLayout_Layout_android_layout_gravity, 0);
            this.mAnchorId = obtainStyledAttributes.getResourceId(R.styleable.CoordinatorLayout_Layout_layout_anchor, -1);
            this.anchorGravity = obtainStyledAttributes.getInteger(R.styleable.CoordinatorLayout_Layout_layout_anchorGravity, 0);
            this.keyline = obtainStyledAttributes.getInteger(R.styleable.CoordinatorLayout_Layout_layout_keyline, -1);
            this.insetEdge = obtainStyledAttributes.getInt(R.styleable.CoordinatorLayout_Layout_layout_insetEdge, 0);
            this.dodgeInsetEdges = obtainStyledAttributes.getInt(R.styleable.CoordinatorLayout_Layout_layout_dodgeInsetEdges, 0);
            this.mBehaviorResolved = obtainStyledAttributes.hasValue(R.styleable.CoordinatorLayout_Layout_layout_behavior);
            if (this.mBehaviorResolved) {
                this.mBehavior = CoordinatorLayout.parseBehavior(context, attributeSet, obtainStyledAttributes.getString(R.styleable.CoordinatorLayout_Layout_layout_behavior));
            }
            obtainStyledAttributes.recycle();
            Behavior behavior = this.mBehavior;
            if (behavior != null) {
                behavior.onAttachedToLayoutParams(this);
            }
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        @IdRes
        public int getAnchorId() {
            return this.mAnchorId;
        }

        public void setAnchorId(@IdRes int i) {
            invalidateAnchor();
            this.mAnchorId = i;
        }

        @Nullable
        public Behavior getBehavior() {
            return this.mBehavior;
        }

        public void setBehavior(@Nullable Behavior behavior) {
            Behavior behavior2 = this.mBehavior;
            if (behavior2 != behavior) {
                if (behavior2 != null) {
                    behavior2.onDetachedFromLayoutParams();
                }
                this.mBehavior = behavior;
                this.mBehaviorTag = null;
                this.mBehaviorResolved = true;
                if (behavior != null) {
                    behavior.onAttachedToLayoutParams(this);
                }
            }
        }

        /* Access modifiers changed, original: 0000 */
        public void setLastChildRect(Rect rect) {
            this.mLastChildRect.set(rect);
        }

        /* Access modifiers changed, original: 0000 */
        public Rect getLastChildRect() {
            return this.mLastChildRect;
        }

        /* Access modifiers changed, original: 0000 */
        public boolean checkAnchorChanged() {
            return this.mAnchorView == null && this.mAnchorId != -1;
        }

        /* Access modifiers changed, original: 0000 */
        public boolean didBlockInteraction() {
            if (this.mBehavior == null) {
                this.mDidBlockInteraction = false;
            }
            return this.mDidBlockInteraction;
        }

        /* Access modifiers changed, original: 0000 */
        public boolean isBlockingInteractionBelow(CoordinatorLayout coordinatorLayout, View view) {
            boolean z = this.mDidBlockInteraction;
            if (z) {
                return true;
            }
            Behavior behavior = this.mBehavior;
            int blocksInteractionBelow = (behavior != null ? behavior.blocksInteractionBelow(coordinatorLayout, view) : 0) | z;
            this.mDidBlockInteraction = blocksInteractionBelow;
            return blocksInteractionBelow;
        }

        /* Access modifiers changed, original: 0000 */
        public void resetTouchBehaviorTracking() {
            this.mDidBlockInteraction = false;
        }

        /* Access modifiers changed, original: 0000 */
        public void resetNestedScroll(int i) {
            setNestedScrollAccepted(i, false);
        }

        /* Access modifiers changed, original: 0000 */
        public void setNestedScrollAccepted(int i, boolean z) {
            if (i == 0) {
                this.mDidAcceptNestedScrollTouch = z;
            } else if (i == 1) {
                this.mDidAcceptNestedScrollNonTouch = z;
            }
        }

        /* Access modifiers changed, original: 0000 */
        public boolean isNestedScrollAccepted(int i) {
            if (i != 0) {
                return i != 1 ? false : this.mDidAcceptNestedScrollNonTouch;
            } else {
                return this.mDidAcceptNestedScrollTouch;
            }
        }

        /* Access modifiers changed, original: 0000 */
        public boolean getChangedAfterNestedScroll() {
            return this.mDidChangeAfterNestedScroll;
        }

        /* Access modifiers changed, original: 0000 */
        public void setChangedAfterNestedScroll(boolean z) {
            this.mDidChangeAfterNestedScroll = z;
        }

        /* Access modifiers changed, original: 0000 */
        public void resetChangedAfterNestedScroll() {
            this.mDidChangeAfterNestedScroll = false;
        }

        /* Access modifiers changed, original: 0000 */
        public boolean dependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (!(view2 == this.mAnchorDirectChild || shouldDodge(view2, ViewCompat.getLayoutDirection(coordinatorLayout)))) {
                Behavior behavior = this.mBehavior;
                if (behavior == null || !behavior.layoutDependsOn(coordinatorLayout, view, view2)) {
                    return false;
                }
            }
            return true;
        }

        /* Access modifiers changed, original: 0000 */
        public void invalidateAnchor() {
            this.mAnchorDirectChild = null;
            this.mAnchorView = null;
        }

        /* Access modifiers changed, original: 0000 */
        public View findAnchorView(CoordinatorLayout coordinatorLayout, View view) {
            if (this.mAnchorId == -1) {
                this.mAnchorDirectChild = null;
                this.mAnchorView = null;
                return null;
            }
            if (this.mAnchorView == null || !verifyAnchorView(view, coordinatorLayout)) {
                resolveAnchorView(view, coordinatorLayout);
            }
            return this.mAnchorView;
        }

        private void resolveAnchorView(View view, CoordinatorLayout coordinatorLayout) {
            this.mAnchorView = coordinatorLayout.findViewById(this.mAnchorId);
            View view2 = this.mAnchorView;
            if (view2 != null) {
                if (view2 != coordinatorLayout) {
                    View parent = view2.getParent();
                    while (parent != coordinatorLayout && parent != null) {
                        if (parent != view) {
                            if (parent instanceof View) {
                                view2 = parent;
                            }
                            parent = parent.getParent();
                        } else if (coordinatorLayout.isInEditMode()) {
                            this.mAnchorDirectChild = null;
                            this.mAnchorView = null;
                            return;
                        } else {
                            throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                        }
                    }
                    this.mAnchorDirectChild = view2;
                } else if (coordinatorLayout.isInEditMode()) {
                    this.mAnchorDirectChild = null;
                    this.mAnchorView = null;
                } else {
                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
            } else if (coordinatorLayout.isInEditMode()) {
                this.mAnchorDirectChild = null;
                this.mAnchorView = null;
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Could not find CoordinatorLayout descendant view with id ");
                stringBuilder.append(coordinatorLayout.getResources().getResourceName(this.mAnchorId));
                stringBuilder.append(" to anchor view ");
                stringBuilder.append(view);
                throw new IllegalStateException(stringBuilder.toString());
            }
        }

        private boolean verifyAnchorView(View view, CoordinatorLayout coordinatorLayout) {
            if (this.mAnchorView.getId() != this.mAnchorId) {
                return false;
            }
            View view2 = this.mAnchorView;
            View parent = view2.getParent();
            while (parent != coordinatorLayout) {
                if (parent == null || parent == view) {
                    this.mAnchorDirectChild = null;
                    this.mAnchorView = null;
                    return false;
                }
                if (parent instanceof View) {
                    view2 = parent;
                }
                parent = parent.getParent();
            }
            this.mAnchorDirectChild = view2;
            return true;
        }

        private boolean shouldDodge(View view, int i) {
            int absoluteGravity = GravityCompat.getAbsoluteGravity(((LayoutParams) view.getLayoutParams()).insetEdge, i);
            return absoluteGravity != 0 && (GravityCompat.getAbsoluteGravity(this.dodgeInsetEdges, i) & absoluteGravity) == absoluteGravity;
        }
    }

    class OnPreDrawListener implements android.view.ViewTreeObserver.OnPreDrawListener {
        OnPreDrawListener() {
        }

        public boolean onPreDraw() {
            CoordinatorLayout.this.onChildViewsChanged(0);
            return true;
        }
    }

    static class ViewElevationComparator implements Comparator<View> {
        ViewElevationComparator() {
        }

        public int compare(View view, View view2) {
            float z = ViewCompat.getZ(view);
            float z2 = ViewCompat.getZ(view2);
            if (z > z2) {
                return -1;
            }
            return z < z2 ? 1 : 0;
        }
    }

    protected static class SavedState extends AbsSavedState {
        public static final Creator<SavedState> CREATOR = new ClassLoaderCreator<SavedState>() {
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };
        SparseArray<Parcelable> behaviorStates;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.behaviorStates = new SparseArray(readInt);
            for (int i = 0; i < readInt; i++) {
                this.behaviorStates.append(iArr[i], readParcelableArray[i]);
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            SparseArray sparseArray = this.behaviorStates;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = this.behaviorStates.keyAt(i2);
                parcelableArr[i2] = (Parcelable) this.behaviorStates.valueAt(i2);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }
    }

    private static int clamp(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    private static int resolveAnchoredChildGravity(int i) {
        return i == 0 ? 17 : i;
    }

    private static int resolveGravity(int i) {
        if ((i & 7) == 0) {
            i |= GravityCompat.START;
        }
        return (i & 112) == 0 ? i | 48 : i;
    }

    private static int resolveKeylineGravity(int i) {
        return i == 0 ? 8388661 : i;
    }

    static {
        Package packageR = CoordinatorLayout.class.getPackage();
        WIDGET_PACKAGE_NAME = packageR != null ? packageR.getName() : null;
        if (VERSION.SDK_INT >= 21) {
            TOP_SORTED_CHILDREN_COMPARATOR = new ViewElevationComparator();
        } else {
            TOP_SORTED_CHILDREN_COMPARATOR = null;
        }
    }

    @NonNull
    private static Rect acquireTempRect() {
        Rect rect = (Rect) sRectPool.acquire();
        return rect == null ? new Rect() : rect;
    }

    private static void releaseTempRect(@NonNull Rect rect) {
        rect.setEmpty();
        sRectPool.release(rect);
    }

    public CoordinatorLayout(@NonNull Context context) {
        this(context, null);
    }

    public CoordinatorLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.coordinatorLayoutStyle);
    }

    public CoordinatorLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i) {
        TypedArray obtainStyledAttributes;
        super(context, attributeSet, i);
        this.mDependencySortedChildren = new ArrayList();
        this.mChildDag = new DirectedAcyclicGraph();
        this.mTempList1 = new ArrayList();
        this.mTempDependenciesList = new ArrayList();
        this.mTempIntPair = new int[2];
        this.mNestedScrollingParentHelper = new NestedScrollingParentHelper(this);
        int i2 = 0;
        if (i == 0) {
            obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CoordinatorLayout, 0, R.style.Widget_Support_CoordinatorLayout);
        } else {
            obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CoordinatorLayout, i, 0);
        }
        i = obtainStyledAttributes.getResourceId(R.styleable.CoordinatorLayout_keylines, 0);
        if (i != 0) {
            Resources resources = context.getResources();
            this.mKeylines = resources.getIntArray(i);
            float f = resources.getDisplayMetrics().density;
            i = this.mKeylines.length;
            while (i2 < i) {
                int[] iArr = this.mKeylines;
                iArr[i2] = (int) (((float) iArr[i2]) * f);
                i2++;
            }
        }
        this.mStatusBarBackground = obtainStyledAttributes.getDrawable(R.styleable.CoordinatorLayout_statusBarBackground);
        obtainStyledAttributes.recycle();
        setupForInsets();
        super.setOnHierarchyChangeListener(new HierarchyChangeListener());
    }

    public void setOnHierarchyChangeListener(OnHierarchyChangeListener onHierarchyChangeListener) {
        this.mOnHierarchyChangeListener = onHierarchyChangeListener;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        resetTouchBehaviors(false);
        if (this.mNeedsPreDrawListener) {
            if (this.mOnPreDrawListener == null) {
                this.mOnPreDrawListener = new OnPreDrawListener();
            }
            getViewTreeObserver().addOnPreDrawListener(this.mOnPreDrawListener);
        }
        if (this.mLastInsets == null && ViewCompat.getFitsSystemWindows(this)) {
            ViewCompat.requestApplyInsets(this);
        }
        this.mIsAttachedToWindow = true;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        resetTouchBehaviors(false);
        if (this.mNeedsPreDrawListener && this.mOnPreDrawListener != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.mOnPreDrawListener);
        }
        View view = this.mNestedScrollingTarget;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.mIsAttachedToWindow = false;
    }

    public void setStatusBarBackground(@Nullable Drawable drawable) {
        Drawable drawable2 = this.mStatusBarBackground;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.mStatusBarBackground = drawable3;
            drawable = this.mStatusBarBackground;
            if (drawable != null) {
                if (drawable.isStateful()) {
                    this.mStatusBarBackground.setState(getDrawableState());
                }
                DrawableCompat.setLayoutDirection(this.mStatusBarBackground, ViewCompat.getLayoutDirection(this));
                this.mStatusBarBackground.setVisible(getVisibility() == 0, false);
                this.mStatusBarBackground.setCallback(this);
            }
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    @Nullable
    public Drawable getStatusBarBackground() {
        return this.mStatusBarBackground;
    }

    /* Access modifiers changed, original: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.mStatusBarBackground;
        int i = 0;
        if (drawable != null && drawable.isStateful()) {
            i = 0 | drawable.setState(drawableState);
        }
        if (i != 0) {
            invalidate();
        }
    }

    /* Access modifiers changed, original: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.mStatusBarBackground;
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.mStatusBarBackground;
        if (drawable != null && drawable.isVisible() != z) {
            this.mStatusBarBackground.setVisible(z, false);
        }
    }

    public void setStatusBarBackgroundResource(@DrawableRes int i) {
        setStatusBarBackground(i != 0 ? ContextCompat.getDrawable(getContext(), i) : null);
    }

    public void setStatusBarBackgroundColor(@ColorInt int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    /* Access modifiers changed, original: final */
    public final WindowInsetsCompat setWindowInsets(WindowInsetsCompat windowInsetsCompat) {
        if (ObjectsCompat.equals(this.mLastInsets, windowInsetsCompat)) {
            return windowInsetsCompat;
        }
        this.mLastInsets = windowInsetsCompat;
        boolean z = true;
        boolean z2 = windowInsetsCompat != null && windowInsetsCompat.getSystemWindowInsetTop() > 0;
        this.mDrawStatusBarBackground = z2;
        if (this.mDrawStatusBarBackground || getBackground() != null) {
            z = false;
        }
        setWillNotDraw(z);
        windowInsetsCompat = dispatchApplyWindowInsetsToBehaviors(windowInsetsCompat);
        requestLayout();
        return windowInsetsCompat;
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public final WindowInsetsCompat getLastWindowInsets() {
        return this.mLastInsets;
    }

    private void resetTouchBehaviors(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            Behavior behavior = ((LayoutParams) childAt.getLayoutParams()).getBehavior();
            if (behavior != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    behavior.onInterceptTouchEvent(this, childAt, obtain);
                } else {
                    behavior.onTouchEvent(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((LayoutParams) getChildAt(i2).getLayoutParams()).resetTouchBehaviorTracking();
        }
        this.mBehaviorTouchView = null;
        this.mDisallowInterceptReset = false;
    }

    private void getTopSortedChildren(List<View> list) {
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        int i = childCount - 1;
        while (i >= 0) {
            list.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i) : i));
            i--;
        }
        Comparator comparator = TOP_SORTED_CHILDREN_COMPARATOR;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    private boolean performIntercept(MotionEvent motionEvent, int i) {
        MotionEvent motionEvent2 = motionEvent;
        int i2 = i;
        int actionMasked = motionEvent.getActionMasked();
        List list = this.mTempList1;
        getTopSortedChildren(list);
        int size = list.size();
        MotionEvent motionEvent3 = null;
        boolean z = false;
        Object obj = null;
        for (int i3 = 0; i3 < size; i3++) {
            View view = (View) list.get(i3);
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Behavior behavior = layoutParams.getBehavior();
            Object obj2 = 1;
            if ((!z && obj == null) || actionMasked == 0) {
                if (!(z || behavior == null)) {
                    if (i2 == 0) {
                        z = behavior.onInterceptTouchEvent(this, view, motionEvent2);
                    } else if (i2 == 1) {
                        z = behavior.onTouchEvent(this, view, motionEvent2);
                    }
                    if (z) {
                        this.mBehaviorTouchView = view;
                    }
                }
                boolean didBlockInteraction = layoutParams.didBlockInteraction();
                boolean isBlockingInteractionBelow = layoutParams.isBlockingInteractionBelow(this, view);
                if (!isBlockingInteractionBelow || didBlockInteraction) {
                    obj2 = null;
                }
                if (isBlockingInteractionBelow && obj2 == null) {
                    break;
                }
                obj = obj2;
            } else if (behavior != null) {
                if (motionEvent3 == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent3 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i2 == 0) {
                    behavior.onInterceptTouchEvent(this, view, motionEvent3);
                } else if (i2 == 1) {
                    behavior.onTouchEvent(this, view, motionEvent3);
                }
            }
        }
        list.clear();
        return z;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            resetTouchBehaviors(true);
        }
        boolean performIntercept = performIntercept(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            resetTouchBehaviors(true);
        }
        return performIntercept;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004c  */
    /* JADX WARNING: Missing block: B:3:0x0012, code skipped:
            if (r3 != false) goto L_0x0016;
     */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
        r17 = this;
        r0 = r17;
        r1 = r18;
        r2 = r18.getActionMasked();
        r3 = r0.mBehaviorTouchView;
        r4 = 1;
        r5 = 0;
        if (r3 != 0) goto L_0x0015;
    L_0x000e:
        r3 = r0.performIntercept(r1, r4);
        if (r3 == 0) goto L_0x002b;
    L_0x0014:
        goto L_0x0016;
    L_0x0015:
        r3 = 0;
    L_0x0016:
        r6 = r0.mBehaviorTouchView;
        r6 = r6.getLayoutParams();
        r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r6;
        r6 = r6.getBehavior();
        if (r6 == 0) goto L_0x002b;
    L_0x0024:
        r7 = r0.mBehaviorTouchView;
        r6 = r6.onTouchEvent(r0, r7, r1);
        goto L_0x002c;
    L_0x002b:
        r6 = 0;
    L_0x002c:
        r7 = r0.mBehaviorTouchView;
        r8 = 0;
        if (r7 != 0) goto L_0x0037;
    L_0x0031:
        r1 = super.onTouchEvent(r18);
        r6 = r6 | r1;
        goto L_0x004a;
    L_0x0037:
        if (r3 == 0) goto L_0x004a;
    L_0x0039:
        r11 = android.os.SystemClock.uptimeMillis();
        r13 = 3;
        r14 = 0;
        r15 = 0;
        r16 = 0;
        r9 = r11;
        r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16);
        super.onTouchEvent(r8);
    L_0x004a:
        if (r8 == 0) goto L_0x004f;
    L_0x004c:
        r8.recycle();
    L_0x004f:
        if (r2 == r4) goto L_0x0054;
    L_0x0051:
        r1 = 3;
        if (r2 != r1) goto L_0x0057;
    L_0x0054:
        r0.resetTouchBehaviors(r5);
    L_0x0057:
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z && !this.mDisallowInterceptReset) {
            resetTouchBehaviors(false);
            this.mDisallowInterceptReset = true;
        }
    }

    private int getKeyline(int i) {
        int[] iArr = this.mKeylines;
        String str = TAG;
        StringBuilder stringBuilder;
        if (iArr == null) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("No keylines defined for ");
            stringBuilder.append(this);
            stringBuilder.append(" - attempted index lookup ");
            stringBuilder.append(i);
            Log.e(str, stringBuilder.toString());
            return 0;
        } else if (i >= 0 && i < iArr.length) {
            return iArr[i];
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Keyline index ");
            stringBuilder.append(i);
            stringBuilder.append(" out of range for ");
            stringBuilder.append(this);
            Log.e(str, stringBuilder.toString());
            return 0;
        }
    }

    static Behavior parseBehavior(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        StringBuilder stringBuilder;
        Object str2;
        if (str2.startsWith(".")) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(context.getPackageName());
            stringBuilder.append(str2);
            str2 = stringBuilder.toString();
        } else if (str2.indexOf(46) < 0 && !TextUtils.isEmpty(WIDGET_PACKAGE_NAME)) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(WIDGET_PACKAGE_NAME);
            stringBuilder2.append('.');
            stringBuilder2.append(str2);
            str2 = stringBuilder2.toString();
        }
        try {
            Map map = (Map) sConstructors.get();
            if (map == null) {
                map = new HashMap();
                sConstructors.set(map);
            }
            Constructor constructor = (Constructor) map.get(str2);
            if (constructor == null) {
                constructor = context.getClassLoader().loadClass(str2).getConstructor(CONSTRUCTOR_PARAMS);
                constructor.setAccessible(true);
                map.put(str2, constructor);
            }
            return (Behavior) constructor.newInstance(new Object[]{context, attributeSet});
        } catch (Exception e) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Could not inflate Behavior subclass ");
            stringBuilder.append(str2);
            throw new RuntimeException(stringBuilder.toString(), e);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public LayoutParams getResolvedLayoutParams(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (!layoutParams.mBehaviorResolved) {
            boolean z = view instanceof AttachedBehavior;
            String str = TAG;
            if (z) {
                Behavior behavior = ((AttachedBehavior) view).getBehavior();
                if (behavior == null) {
                    Log.e(str, "Attached behavior class is null");
                }
                layoutParams.setBehavior(behavior);
                layoutParams.mBehaviorResolved = true;
            } else {
                DefaultBehavior defaultBehavior = null;
                for (Class cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    defaultBehavior = (DefaultBehavior) cls.getAnnotation(DefaultBehavior.class);
                    if (defaultBehavior != null) {
                        break;
                    }
                }
                if (defaultBehavior != null) {
                    try {
                        layoutParams.setBehavior((Behavior) defaultBehavior.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception e) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Default behavior class ");
                        stringBuilder.append(defaultBehavior.value().getName());
                        stringBuilder.append(" could not be instantiated. Did you forget");
                        stringBuilder.append(" a default constructor?");
                        Log.e(str, stringBuilder.toString(), e);
                    }
                }
                layoutParams.mBehaviorResolved = true;
            }
        }
        return layoutParams;
    }

    private void prepareChildren() {
        this.mDependencySortedChildren.clear();
        this.mChildDag.clear();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            LayoutParams resolvedLayoutParams = getResolvedLayoutParams(childAt);
            resolvedLayoutParams.findAnchorView(this, childAt);
            this.mChildDag.addNode(childAt);
            for (int i2 = 0; i2 < childCount; i2++) {
                if (i2 != i) {
                    View childAt2 = getChildAt(i2);
                    if (resolvedLayoutParams.dependsOn(this, childAt, childAt2)) {
                        if (!this.mChildDag.contains(childAt2)) {
                            this.mChildDag.addNode(childAt2);
                        }
                        this.mChildDag.addEdge(childAt2, childAt);
                    }
                }
            }
        }
        this.mDependencySortedChildren.addAll(this.mChildDag.getSortedList());
        Collections.reverse(this.mDependencySortedChildren);
    }

    /* Access modifiers changed, original: 0000 */
    public void getDescendantRect(View view, Rect rect) {
        ViewGroupUtils.getDescendantRect(this, view, rect);
    }

    /* Access modifiers changed, original: protected */
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    /* Access modifiers changed, original: protected */
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    public void onMeasureChild(View view, int i, int i2, int i3, int i4) {
        measureChildWithMargins(view, i, i2, i3, i4);
    }

    /* Access modifiers changed, original: protected */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x011c  */
    /* JADX WARNING: Missing block: B:41:0x0119, code skipped:
            if (r0.onMeasureChild(r30, r20, r11, r21, r23, 0) == false) goto L_0x0128;
     */
    public void onMeasure(int r31, int r32) {
        /*
        r30 = this;
        r7 = r30;
        r30.prepareChildren();
        r30.ensurePreDrawListener();
        r8 = r30.getPaddingLeft();
        r0 = r30.getPaddingTop();
        r9 = r30.getPaddingRight();
        r1 = r30.getPaddingBottom();
        r10 = androidx.core.view.ViewCompat.getLayoutDirection(r30);
        r2 = 1;
        if (r10 != r2) goto L_0x0021;
    L_0x001f:
        r12 = 1;
        goto L_0x0022;
    L_0x0021:
        r12 = 0;
    L_0x0022:
        r13 = android.view.View.MeasureSpec.getMode(r31);
        r14 = android.view.View.MeasureSpec.getSize(r31);
        r15 = android.view.View.MeasureSpec.getMode(r32);
        r16 = android.view.View.MeasureSpec.getSize(r32);
        r17 = r8 + r9;
        r18 = r0 + r1;
        r0 = r30.getSuggestedMinimumWidth();
        r1 = r30.getSuggestedMinimumHeight();
        r3 = r7.mLastInsets;
        if (r3 == 0) goto L_0x004b;
    L_0x0042:
        r3 = androidx.core.view.ViewCompat.getFitsSystemWindows(r30);
        if (r3 == 0) goto L_0x004b;
    L_0x0048:
        r19 = 1;
        goto L_0x004d;
    L_0x004b:
        r19 = 0;
    L_0x004d:
        r2 = r7.mDependencySortedChildren;
        r6 = r2.size();
        r4 = r0;
        r2 = r1;
        r3 = 0;
        r5 = 0;
    L_0x0057:
        if (r5 >= r6) goto L_0x016e;
    L_0x0059:
        r0 = r7.mDependencySortedChildren;
        r0 = r0.get(r5);
        r20 = r0;
        r20 = (android.view.View) r20;
        r0 = r20.getVisibility();
        r1 = 8;
        if (r0 != r1) goto L_0x0071;
    L_0x006b:
        r22 = r5;
        r29 = r6;
        goto L_0x0168;
    L_0x0071:
        r0 = r20.getLayoutParams();
        r1 = r0;
        r1 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r1;
        r0 = r1.keyline;
        if (r0 < 0) goto L_0x00ba;
    L_0x007c:
        if (r13 == 0) goto L_0x00ba;
    L_0x007e:
        r0 = r1.keyline;
        r0 = r7.getKeyline(r0);
        r11 = r1.gravity;
        r11 = resolveKeylineGravity(r11);
        r11 = androidx.core.view.GravityCompat.getAbsoluteGravity(r11, r10);
        r11 = r11 & 7;
        r22 = r2;
        r2 = 3;
        if (r11 != r2) goto L_0x0097;
    L_0x0095:
        if (r12 == 0) goto L_0x009c;
    L_0x0097:
        r2 = 5;
        if (r11 != r2) goto L_0x00a8;
    L_0x009a:
        if (r12 == 0) goto L_0x00a8;
    L_0x009c:
        r2 = r14 - r9;
        r2 = r2 - r0;
        r0 = 0;
        r2 = java.lang.Math.max(r0, r2);
        r21 = r2;
        r11 = 0;
        goto L_0x00bf;
    L_0x00a8:
        if (r11 != r2) goto L_0x00ac;
    L_0x00aa:
        if (r12 == 0) goto L_0x00b1;
    L_0x00ac:
        r2 = 3;
        if (r11 != r2) goto L_0x00bc;
    L_0x00af:
        if (r12 == 0) goto L_0x00bc;
    L_0x00b1:
        r0 = r0 - r8;
        r11 = 0;
        r0 = java.lang.Math.max(r11, r0);
        r21 = r0;
        goto L_0x00bf;
    L_0x00ba:
        r22 = r2;
    L_0x00bc:
        r11 = 0;
        r21 = 0;
    L_0x00bf:
        if (r19 == 0) goto L_0x00f1;
    L_0x00c1:
        r0 = androidx.core.view.ViewCompat.getFitsSystemWindows(r20);
        if (r0 != 0) goto L_0x00f1;
    L_0x00c7:
        r0 = r7.mLastInsets;
        r0 = r0.getSystemWindowInsetLeft();
        r2 = r7.mLastInsets;
        r2 = r2.getSystemWindowInsetRight();
        r0 = r0 + r2;
        r2 = r7.mLastInsets;
        r2 = r2.getSystemWindowInsetTop();
        r11 = r7.mLastInsets;
        r11 = r11.getSystemWindowInsetBottom();
        r2 = r2 + r11;
        r0 = r14 - r0;
        r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r13);
        r2 = r16 - r2;
        r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r15);
        r11 = r0;
        r23 = r2;
        goto L_0x00f5;
    L_0x00f1:
        r11 = r31;
        r23 = r32;
    L_0x00f5:
        r0 = r1.getBehavior();
        if (r0 == 0) goto L_0x011c;
    L_0x00fb:
        r24 = 0;
        r2 = r1;
        r1 = r30;
        r26 = r2;
        r25 = r22;
        r2 = r20;
        r27 = r3;
        r3 = r11;
        r28 = r4;
        r4 = r21;
        r22 = r5;
        r5 = r23;
        r29 = r6;
        r6 = r24;
        r0 = r0.onMeasureChild(r1, r2, r3, r4, r5, r6);
        if (r0 != 0) goto L_0x0135;
    L_0x011b:
        goto L_0x0128;
    L_0x011c:
        r26 = r1;
        r27 = r3;
        r28 = r4;
        r29 = r6;
        r25 = r22;
        r22 = r5;
    L_0x0128:
        r5 = 0;
        r0 = r30;
        r1 = r20;
        r2 = r11;
        r3 = r21;
        r4 = r23;
        r0.onMeasureChild(r1, r2, r3, r4, r5);
    L_0x0135:
        r0 = r20.getMeasuredWidth();
        r0 = r17 + r0;
        r1 = r26;
        r2 = r1.leftMargin;
        r0 = r0 + r2;
        r2 = r1.rightMargin;
        r0 = r0 + r2;
        r2 = r28;
        r0 = java.lang.Math.max(r2, r0);
        r2 = r20.getMeasuredHeight();
        r2 = r18 + r2;
        r3 = r1.topMargin;
        r2 = r2 + r3;
        r1 = r1.bottomMargin;
        r2 = r2 + r1;
        r1 = r25;
        r1 = java.lang.Math.max(r1, r2);
        r2 = r20.getMeasuredState();
        r11 = r27;
        r2 = android.view.View.combineMeasuredStates(r11, r2);
        r4 = r0;
        r3 = r2;
        r2 = r1;
    L_0x0168:
        r5 = r22 + 1;
        r6 = r29;
        goto L_0x0057;
    L_0x016e:
        r1 = r2;
        r11 = r3;
        r2 = r4;
        r0 = -16777216; // 0xffffffffff000000 float:-1.7014118E38 double:NaN;
        r0 = r0 & r11;
        r3 = r31;
        r0 = android.view.View.resolveSizeAndState(r2, r3, r0);
        r2 = r11 << 16;
        r3 = r32;
        r1 = android.view.View.resolveSizeAndState(r1, r3, r2);
        r7.setMeasuredDimension(r0, r1);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    private WindowInsetsCompat dispatchApplyWindowInsetsToBehaviors(WindowInsetsCompat windowInsetsCompat) {
        if (windowInsetsCompat.isConsumed()) {
            return windowInsetsCompat;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (ViewCompat.getFitsSystemWindows(childAt)) {
                Behavior behavior = ((LayoutParams) childAt.getLayoutParams()).getBehavior();
                if (behavior != null) {
                    windowInsetsCompat = behavior.onApplyWindowInsets(this, childAt, windowInsetsCompat);
                    if (windowInsetsCompat.isConsumed()) {
                        break;
                    }
                } else {
                    continue;
                }
            }
        }
        return windowInsetsCompat;
    }

    public void onLayoutChild(@NonNull View view, int i) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (layoutParams.checkAnchorChanged()) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        } else if (layoutParams.mAnchorView != null) {
            layoutChildWithAnchor(view, layoutParams.mAnchorView, i);
        } else if (layoutParams.keyline >= 0) {
            layoutChildWithKeyline(view, layoutParams.keyline, i);
        } else {
            layoutChild(view, i);
        }
    }

    /* Access modifiers changed, original: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int layoutDirection = ViewCompat.getLayoutDirection(this);
        i = this.mDependencySortedChildren.size();
        for (i2 = 0; i2 < i; i2++) {
            View view = (View) this.mDependencySortedChildren.get(i2);
            if (view.getVisibility() != 8) {
                Behavior behavior = ((LayoutParams) view.getLayoutParams()).getBehavior();
                if (behavior == null || !behavior.onLayoutChild(this, view, layoutDirection)) {
                    onLayoutChild(view, layoutDirection);
                }
            }
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.mDrawStatusBarBackground && this.mStatusBarBackground != null) {
            WindowInsetsCompat windowInsetsCompat = this.mLastInsets;
            int systemWindowInsetTop = windowInsetsCompat != null ? windowInsetsCompat.getSystemWindowInsetTop() : 0;
            if (systemWindowInsetTop > 0) {
                this.mStatusBarBackground.setBounds(0, 0, getWidth(), systemWindowInsetTop);
                this.mStatusBarBackground.draw(canvas);
            }
        }
    }

    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        setupForInsets();
    }

    /* Access modifiers changed, original: 0000 */
    public void recordLastChildRect(View view, Rect rect) {
        ((LayoutParams) view.getLayoutParams()).setLastChildRect(rect);
    }

    /* Access modifiers changed, original: 0000 */
    public void getLastChildRect(View view, Rect rect) {
        rect.set(((LayoutParams) view.getLayoutParams()).getLastChildRect());
    }

    /* Access modifiers changed, original: 0000 */
    public void getChildRect(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
            return;
        }
        if (z) {
            getDescendantRect(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    private void getDesiredAnchoredChildRectWithoutConstraints(View view, int i, Rect rect, Rect rect2, LayoutParams layoutParams, int i2, int i3) {
        int absoluteGravity = GravityCompat.getAbsoluteGravity(resolveAnchoredChildGravity(layoutParams.gravity), i);
        i = GravityCompat.getAbsoluteGravity(resolveGravity(layoutParams.anchorGravity), i);
        int i4 = absoluteGravity & 7;
        absoluteGravity &= 112;
        int i5 = i & 7;
        i &= 112;
        if (i5 == 1) {
            i5 = rect.left + (rect.width() / 2);
        } else if (i5 != 5) {
            i5 = rect.left;
        } else {
            i5 = rect.right;
        }
        if (i == 16) {
            i = rect.top + (rect.height() / 2);
        } else if (i != 80) {
            i = rect.top;
        } else {
            i = rect.bottom;
        }
        if (i4 == 1) {
            i5 -= i2 / 2;
        } else if (i4 != 5) {
            i5 -= i2;
        }
        if (absoluteGravity == 16) {
            i -= i3 / 2;
        } else if (absoluteGravity != 80) {
            i -= i3;
        }
        rect2.set(i5, i, i2 + i5, i3 + i);
    }

    private void constrainChildRect(LayoutParams layoutParams, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        width = Math.max(getPaddingLeft() + layoutParams.leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - layoutParams.rightMargin));
        int max = Math.max(getPaddingTop() + layoutParams.topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - layoutParams.bottomMargin));
        rect.set(width, max, i + width, i2 + max);
    }

    /* Access modifiers changed, original: 0000 */
    public void getDesiredAnchoredChildRect(View view, int i, Rect rect, Rect rect2) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        getDesiredAnchoredChildRectWithoutConstraints(view, i, rect, rect2, layoutParams, measuredWidth, measuredHeight);
        constrainChildRect(layoutParams, rect2, measuredWidth, measuredHeight);
    }

    private void layoutChildWithAnchor(View view, View view2, int i) {
        Rect acquireTempRect = acquireTempRect();
        Rect acquireTempRect2 = acquireTempRect();
        try {
            getDescendantRect(view2, acquireTempRect);
            getDesiredAnchoredChildRect(view, i, acquireTempRect, acquireTempRect2);
            view.layout(acquireTempRect2.left, acquireTempRect2.top, acquireTempRect2.right, acquireTempRect2.bottom);
        } finally {
            releaseTempRect(acquireTempRect);
            releaseTempRect(acquireTempRect2);
        }
    }

    private void layoutChildWithKeyline(View view, int i, int i2) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int absoluteGravity = GravityCompat.getAbsoluteGravity(resolveKeylineGravity(layoutParams.gravity), i2);
        int i3 = absoluteGravity & 7;
        absoluteGravity &= 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i2 == 1) {
            i = width - i;
        }
        i = getKeyline(i) - measuredWidth;
        i2 = 0;
        if (i3 == 1) {
            i += measuredWidth / 2;
        } else if (i3 == 5) {
            i += measuredWidth;
        }
        if (absoluteGravity == 16) {
            i2 = 0 + (measuredHeight / 2);
        } else if (absoluteGravity == 80) {
            i2 = measuredHeight + 0;
        }
        i = Math.max(getPaddingLeft() + layoutParams.leftMargin, Math.min(i, ((width - getPaddingRight()) - measuredWidth) - layoutParams.rightMargin));
        i2 = Math.max(getPaddingTop() + layoutParams.topMargin, Math.min(i2, ((height - getPaddingBottom()) - measuredHeight) - layoutParams.bottomMargin));
        view.layout(i, i2, measuredWidth + i, measuredHeight + i2);
    }

    private void layoutChild(View view, int i) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        Rect acquireTempRect = acquireTempRect();
        acquireTempRect.set(getPaddingLeft() + layoutParams.leftMargin, getPaddingTop() + layoutParams.topMargin, (getWidth() - getPaddingRight()) - layoutParams.rightMargin, (getHeight() - getPaddingBottom()) - layoutParams.bottomMargin);
        if (!(this.mLastInsets == null || !ViewCompat.getFitsSystemWindows(this) || ViewCompat.getFitsSystemWindows(view))) {
            acquireTempRect.left += this.mLastInsets.getSystemWindowInsetLeft();
            acquireTempRect.top += this.mLastInsets.getSystemWindowInsetTop();
            acquireTempRect.right -= this.mLastInsets.getSystemWindowInsetRight();
            acquireTempRect.bottom -= this.mLastInsets.getSystemWindowInsetBottom();
        }
        Rect acquireTempRect2 = acquireTempRect();
        GravityCompat.apply(resolveGravity(layoutParams.gravity), view.getMeasuredWidth(), view.getMeasuredHeight(), acquireTempRect, acquireTempRect2, i);
        view.layout(acquireTempRect2.left, acquireTempRect2.top, acquireTempRect2.right, acquireTempRect2.bottom);
        releaseTempRect(acquireTempRect);
        releaseTempRect(acquireTempRect2);
    }

    /* Access modifiers changed, original: protected */
    public boolean drawChild(Canvas canvas, View view, long j) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (layoutParams.mBehavior != null) {
            float scrimOpacity = layoutParams.mBehavior.getScrimOpacity(this, view);
            if (scrimOpacity > 0.0f) {
                if (this.mScrimPaint == null) {
                    this.mScrimPaint = new Paint();
                }
                this.mScrimPaint.setColor(layoutParams.mBehavior.getScrimColor(this, view));
                this.mScrimPaint.setAlpha(clamp(Math.round(scrimOpacity * 255.0f), 0, 255));
                int save = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect((float) view.getLeft(), (float) view.getTop(), (float) view.getRight(), (float) view.getBottom(), Op.DIFFERENCE);
                }
                canvas.drawRect((float) getPaddingLeft(), (float) getPaddingTop(), (float) (getWidth() - getPaddingRight()), (float) (getHeight() - getPaddingBottom()), this.mScrimPaint);
                canvas.restoreToCount(save);
            }
        }
        return super.drawChild(canvas, view, j);
    }

    /* Access modifiers changed, original: final */
    public final void onChildViewsChanged(int i) {
        int i2 = i;
        int layoutDirection = ViewCompat.getLayoutDirection(this);
        int size = this.mDependencySortedChildren.size();
        Rect acquireTempRect = acquireTempRect();
        Rect acquireTempRect2 = acquireTempRect();
        Rect acquireTempRect3 = acquireTempRect();
        for (int i3 = 0; i3 < size; i3++) {
            View view = (View) this.mDependencySortedChildren.get(i3);
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (i2 != 0 || view.getVisibility() != 8) {
                int absoluteGravity;
                for (int i4 = 0; i4 < i3; i4++) {
                    if (layoutParams.mAnchorDirectChild == ((View) this.mDependencySortedChildren.get(i4))) {
                        offsetChildToAnchor(view, layoutDirection);
                    }
                }
                getChildRect(view, true, acquireTempRect2);
                if (!(layoutParams.insetEdge == 0 || acquireTempRect2.isEmpty())) {
                    absoluteGravity = GravityCompat.getAbsoluteGravity(layoutParams.insetEdge, layoutDirection);
                    int i5 = absoluteGravity & 112;
                    if (i5 == 48) {
                        acquireTempRect.top = Math.max(acquireTempRect.top, acquireTempRect2.bottom);
                    } else if (i5 == 80) {
                        acquireTempRect.bottom = Math.max(acquireTempRect.bottom, getHeight() - acquireTempRect2.top);
                    }
                    absoluteGravity &= 7;
                    if (absoluteGravity == 3) {
                        acquireTempRect.left = Math.max(acquireTempRect.left, acquireTempRect2.right);
                    } else if (absoluteGravity == 5) {
                        acquireTempRect.right = Math.max(acquireTempRect.right, getWidth() - acquireTempRect2.left);
                    }
                }
                if (layoutParams.dodgeInsetEdges != 0 && view.getVisibility() == 0) {
                    offsetChildByInset(view, acquireTempRect, layoutDirection);
                }
                if (i2 != 2) {
                    getLastChildRect(view, acquireTempRect3);
                    if (!acquireTempRect3.equals(acquireTempRect2)) {
                        recordLastChildRect(view, acquireTempRect2);
                    }
                }
                for (absoluteGravity = i3 + 1; absoluteGravity < size; absoluteGravity++) {
                    View view2 = (View) this.mDependencySortedChildren.get(absoluteGravity);
                    LayoutParams layoutParams2 = (LayoutParams) view2.getLayoutParams();
                    Behavior behavior = layoutParams2.getBehavior();
                    if (behavior != null && behavior.layoutDependsOn(this, view2, view)) {
                        if (i2 == 0 && layoutParams2.getChangedAfterNestedScroll()) {
                            layoutParams2.resetChangedAfterNestedScroll();
                        } else {
                            boolean onDependentViewChanged;
                            if (i2 != 2) {
                                onDependentViewChanged = behavior.onDependentViewChanged(this, view2, view);
                            } else {
                                behavior.onDependentViewRemoved(this, view2, view);
                                onDependentViewChanged = true;
                            }
                            if (i2 == 1) {
                                layoutParams2.setChangedAfterNestedScroll(onDependentViewChanged);
                            }
                        }
                    }
                }
            }
        }
        releaseTempRect(acquireTempRect);
        releaseTempRect(acquireTempRect2);
        releaseTempRect(acquireTempRect3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00fe  */
    private void offsetChildByInset(android.view.View r9, android.graphics.Rect r10, int r11) {
        /*
        r8 = this;
        r0 = androidx.core.view.ViewCompat.isLaidOut(r9);
        if (r0 != 0) goto L_0x0007;
    L_0x0006:
        return;
    L_0x0007:
        r0 = r9.getWidth();
        if (r0 <= 0) goto L_0x0104;
    L_0x000d:
        r0 = r9.getHeight();
        if (r0 > 0) goto L_0x0015;
    L_0x0013:
        goto L_0x0104;
    L_0x0015:
        r0 = r9.getLayoutParams();
        r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r0;
        r1 = r0.getBehavior();
        r2 = acquireTempRect();
        r3 = acquireTempRect();
        r4 = r9.getLeft();
        r5 = r9.getTop();
        r6 = r9.getRight();
        r7 = r9.getBottom();
        r3.set(r4, r5, r6, r7);
        if (r1 == 0) goto L_0x0070;
    L_0x003c:
        r1 = r1.getInsetDodgeRect(r8, r9, r2);
        if (r1 == 0) goto L_0x0070;
    L_0x0042:
        r1 = r3.contains(r2);
        if (r1 == 0) goto L_0x0049;
    L_0x0048:
        goto L_0x0073;
    L_0x0049:
        r9 = new java.lang.IllegalArgumentException;
        r10 = new java.lang.StringBuilder;
        r10.<init>();
        r11 = "Rect should be within the child's bounds. Rect:";
        r10.append(r11);
        r11 = r2.toShortString();
        r10.append(r11);
        r11 = " | Bounds:";
        r10.append(r11);
        r11 = r3.toShortString();
        r10.append(r11);
        r10 = r10.toString();
        r9.<init>(r10);
        throw r9;
    L_0x0070:
        r2.set(r3);
    L_0x0073:
        releaseTempRect(r3);
        r1 = r2.isEmpty();
        if (r1 == 0) goto L_0x0080;
    L_0x007c:
        releaseTempRect(r2);
        return;
    L_0x0080:
        r1 = r0.dodgeInsetEdges;
        r11 = androidx.core.view.GravityCompat.getAbsoluteGravity(r1, r11);
        r1 = r11 & 48;
        r3 = 48;
        r4 = 1;
        r5 = 0;
        if (r1 != r3) goto L_0x00a2;
    L_0x008e:
        r1 = r2.top;
        r3 = r0.topMargin;
        r1 = r1 - r3;
        r3 = r0.mInsetOffsetY;
        r1 = r1 - r3;
        r3 = r10.top;
        if (r1 >= r3) goto L_0x00a2;
    L_0x009a:
        r3 = r10.top;
        r3 = r3 - r1;
        r8.setInsetOffsetY(r9, r3);
        r1 = 1;
        goto L_0x00a3;
    L_0x00a2:
        r1 = 0;
    L_0x00a3:
        r3 = r11 & 80;
        r6 = 80;
        if (r3 != r6) goto L_0x00c1;
    L_0x00a9:
        r3 = r8.getHeight();
        r6 = r2.bottom;
        r3 = r3 - r6;
        r6 = r0.bottomMargin;
        r3 = r3 - r6;
        r6 = r0.mInsetOffsetY;
        r3 = r3 + r6;
        r6 = r10.bottom;
        if (r3 >= r6) goto L_0x00c1;
    L_0x00ba:
        r1 = r10.bottom;
        r3 = r3 - r1;
        r8.setInsetOffsetY(r9, r3);
        r1 = 1;
    L_0x00c1:
        if (r1 != 0) goto L_0x00c6;
    L_0x00c3:
        r8.setInsetOffsetY(r9, r5);
    L_0x00c6:
        r1 = r11 & 3;
        r3 = 3;
        if (r1 != r3) goto L_0x00df;
    L_0x00cb:
        r1 = r2.left;
        r3 = r0.leftMargin;
        r1 = r1 - r3;
        r3 = r0.mInsetOffsetX;
        r1 = r1 - r3;
        r3 = r10.left;
        if (r1 >= r3) goto L_0x00df;
    L_0x00d7:
        r3 = r10.left;
        r3 = r3 - r1;
        r8.setInsetOffsetX(r9, r3);
        r1 = 1;
        goto L_0x00e0;
    L_0x00df:
        r1 = 0;
    L_0x00e0:
        r3 = 5;
        r11 = r11 & r3;
        if (r11 != r3) goto L_0x00fc;
    L_0x00e4:
        r11 = r8.getWidth();
        r3 = r2.right;
        r11 = r11 - r3;
        r3 = r0.rightMargin;
        r11 = r11 - r3;
        r0 = r0.mInsetOffsetX;
        r11 = r11 + r0;
        r0 = r10.right;
        if (r11 >= r0) goto L_0x00fc;
    L_0x00f5:
        r10 = r10.right;
        r11 = r11 - r10;
        r8.setInsetOffsetX(r9, r11);
        r1 = 1;
    L_0x00fc:
        if (r1 != 0) goto L_0x0101;
    L_0x00fe:
        r8.setInsetOffsetX(r9, r5);
    L_0x0101:
        releaseTempRect(r2);
    L_0x0104:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.offsetChildByInset(android.view.View, android.graphics.Rect, int):void");
    }

    private void setInsetOffsetX(View view, int i) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (layoutParams.mInsetOffsetX != i) {
            ViewCompat.offsetLeftAndRight(view, i - layoutParams.mInsetOffsetX);
            layoutParams.mInsetOffsetX = i;
        }
    }

    private void setInsetOffsetY(View view, int i) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (layoutParams.mInsetOffsetY != i) {
            ViewCompat.offsetTopAndBottom(view, i - layoutParams.mInsetOffsetY);
            layoutParams.mInsetOffsetY = i;
        }
    }

    public void dispatchDependentViewsChanged(@NonNull View view) {
        List incomingEdges = this.mChildDag.getIncomingEdges(view);
        if (incomingEdges != null && !incomingEdges.isEmpty()) {
            for (int i = 0; i < incomingEdges.size(); i++) {
                View view2 = (View) incomingEdges.get(i);
                Behavior behavior = ((LayoutParams) view2.getLayoutParams()).getBehavior();
                if (behavior != null) {
                    behavior.onDependentViewChanged(this, view2, view);
                }
            }
        }
    }

    @NonNull
    public List<View> getDependencies(@NonNull View view) {
        List outgoingEdges = this.mChildDag.getOutgoingEdges(view);
        this.mTempDependenciesList.clear();
        if (outgoingEdges != null) {
            this.mTempDependenciesList.addAll(outgoingEdges);
        }
        return this.mTempDependenciesList;
    }

    @NonNull
    public List<View> getDependents(@NonNull View view) {
        List incomingEdges = this.mChildDag.getIncomingEdges(view);
        this.mTempDependenciesList.clear();
        if (incomingEdges != null) {
            this.mTempDependenciesList.addAll(incomingEdges);
        }
        return this.mTempDependenciesList;
    }

    /* Access modifiers changed, original: final */
    @VisibleForTesting
    public final List<View> getDependencySortedChildren() {
        prepareChildren();
        return Collections.unmodifiableList(this.mDependencySortedChildren);
    }

    /* Access modifiers changed, original: 0000 */
    public void ensurePreDrawListener() {
        int childCount = getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            if (hasDependencies(getChildAt(i))) {
                z = true;
                break;
            }
        }
        if (z == this.mNeedsPreDrawListener) {
            return;
        }
        if (z) {
            addPreDrawListener();
        } else {
            removePreDrawListener();
        }
    }

    private boolean hasDependencies(View view) {
        return this.mChildDag.hasOutgoingEdges(view);
    }

    /* Access modifiers changed, original: 0000 */
    public void addPreDrawListener() {
        if (this.mIsAttachedToWindow) {
            if (this.mOnPreDrawListener == null) {
                this.mOnPreDrawListener = new OnPreDrawListener();
            }
            getViewTreeObserver().addOnPreDrawListener(this.mOnPreDrawListener);
        }
        this.mNeedsPreDrawListener = true;
    }

    /* Access modifiers changed, original: 0000 */
    public void removePreDrawListener() {
        if (this.mIsAttachedToWindow && this.mOnPreDrawListener != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.mOnPreDrawListener);
        }
        this.mNeedsPreDrawListener = false;
    }

    /* Access modifiers changed, original: 0000 */
    public void offsetChildToAnchor(View view, int i) {
        View view2 = view;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (layoutParams.mAnchorView != null) {
            Rect acquireTempRect = acquireTempRect();
            Rect acquireTempRect2 = acquireTempRect();
            Rect acquireTempRect3 = acquireTempRect();
            getDescendantRect(layoutParams.mAnchorView, acquireTempRect);
            boolean z = false;
            getChildRect(view2, false, acquireTempRect2);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            i = measuredHeight;
            getDesiredAnchoredChildRectWithoutConstraints(view, i, acquireTempRect, acquireTempRect3, layoutParams, measuredWidth, measuredHeight);
            if (!(acquireTempRect3.left == acquireTempRect2.left && acquireTempRect3.top == acquireTempRect2.top)) {
                z = true;
            }
            constrainChildRect(layoutParams, acquireTempRect3, measuredWidth, i);
            int i2 = acquireTempRect3.left - acquireTempRect2.left;
            int i3 = acquireTempRect3.top - acquireTempRect2.top;
            if (i2 != 0) {
                ViewCompat.offsetLeftAndRight(view2, i2);
            }
            if (i3 != 0) {
                ViewCompat.offsetTopAndBottom(view2, i3);
            }
            if (z) {
                Behavior behavior = layoutParams.getBehavior();
                if (behavior != null) {
                    behavior.onDependentViewChanged(this, view2, layoutParams.mAnchorView);
                }
            }
            releaseTempRect(acquireTempRect);
            releaseTempRect(acquireTempRect2);
            releaseTempRect(acquireTempRect3);
        }
    }

    public boolean isPointInChildBounds(@NonNull View view, int i, int i2) {
        Rect acquireTempRect = acquireTempRect();
        getDescendantRect(view, acquireTempRect);
        try {
            boolean contains = acquireTempRect.contains(i, i2);
            return contains;
        } finally {
            releaseTempRect(acquireTempRect);
        }
    }

    public boolean doViewsOverlap(@NonNull View view, @NonNull View view2) {
        boolean z = false;
        if (view.getVisibility() != 0 || view2.getVisibility() != 0) {
            return false;
        }
        Rect acquireTempRect = acquireTempRect();
        getChildRect(view, view.getParent() != this, acquireTempRect);
        Rect acquireTempRect2 = acquireTempRect();
        getChildRect(view2, view2.getParent() != this, acquireTempRect2);
        try {
            if (acquireTempRect.left <= acquireTempRect2.right && acquireTempRect.top <= acquireTempRect2.bottom && acquireTempRect.right >= acquireTempRect2.left && acquireTempRect.bottom >= acquireTempRect2.top) {
                z = true;
            }
            releaseTempRect(acquireTempRect);
            releaseTempRect(acquireTempRect2);
            return z;
        } catch (Throwable th) {
            releaseTempRect(acquireTempRect);
            releaseTempRect(acquireTempRect2);
        }
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* Access modifiers changed, original: protected */
    public LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            return new LayoutParams((LayoutParams) layoutParams);
        }
        if (layoutParams instanceof MarginLayoutParams) {
            return new LayoutParams((MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    /* Access modifiers changed, original: protected */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    /* Access modifiers changed, original: protected */
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return onStartNestedScroll(view, view2, i, 0);
    }

    public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        int i3 = i2;
        int childCount = getChildCount();
        int i4 = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                Behavior behavior = layoutParams.getBehavior();
                if (behavior != null) {
                    boolean onStartNestedScroll = behavior.onStartNestedScroll(this, childAt, view, view2, i, i2);
                    int i6 = i4 | onStartNestedScroll;
                    layoutParams.setNestedScrollAccepted(i3, onStartNestedScroll);
                    i4 = i6;
                } else {
                    layoutParams.setNestedScrollAccepted(i3, false);
                }
            }
        }
        return i4;
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        onNestedScrollAccepted(view, view2, i, 0);
    }

    public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        this.mNestedScrollingParentHelper.onNestedScrollAccepted(view, view2, i, i2);
        this.mNestedScrollingTarget = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (layoutParams.isNestedScrollAccepted(i2)) {
                Behavior behavior = layoutParams.getBehavior();
                if (behavior != null) {
                    behavior.onNestedScrollAccepted(this, childAt, view, view2, i, i2);
                }
            }
        }
    }

    public void onStopNestedScroll(View view) {
        onStopNestedScroll(view, 0);
    }

    public void onStopNestedScroll(View view, int i) {
        this.mNestedScrollingParentHelper.onStopNestedScroll(view, i);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (layoutParams.isNestedScrollAccepted(i)) {
                Behavior behavior = layoutParams.getBehavior();
                if (behavior != null) {
                    behavior.onStopNestedScroll(this, childAt, view, i);
                }
                layoutParams.resetNestedScroll(i);
                layoutParams.resetChangedAfterNestedScroll();
            }
        }
        this.mNestedScrollingTarget = null;
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        onNestedScroll(view, i, i2, i3, i4, 0);
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        int childCount = getChildCount();
        Object obj = null;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() == 8) {
                int i7 = i5;
            } else {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.isNestedScrollAccepted(i5)) {
                    Behavior behavior = layoutParams.getBehavior();
                    if (behavior != null) {
                        behavior.onNestedScroll(this, childAt, view, i, i2, i3, i4, i5);
                        obj = 1;
                    }
                }
            }
        }
        if (obj != null) {
            onChildViewsChanged(1);
        }
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        onNestedPreScroll(view, i, i2, iArr, 0);
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        int childCount = getChildCount();
        Object obj = null;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() == 8) {
                int i7 = i3;
            } else {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.isNestedScrollAccepted(i3)) {
                    Behavior behavior = layoutParams.getBehavior();
                    if (behavior != null) {
                        int max;
                        int max2;
                        int[] iArr2 = this.mTempIntPair;
                        iArr2[1] = 0;
                        iArr2[0] = 0;
                        behavior.onNestedPreScroll(this, childAt, view, i, i2, iArr2, i3);
                        if (i > 0) {
                            max = Math.max(i4, this.mTempIntPair[0]);
                        } else {
                            max = Math.min(i4, this.mTempIntPair[0]);
                        }
                        if (i2 > 0) {
                            max2 = Math.max(i5, this.mTempIntPair[1]);
                        } else {
                            max2 = Math.min(i5, this.mTempIntPair[1]);
                        }
                        i4 = max;
                        i5 = max2;
                        obj = 1;
                    }
                }
            }
        }
        iArr[0] = i4;
        iArr[1] = i5;
        if (obj != null) {
            onChildViewsChanged(1);
        }
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        int childCount = getChildCount();
        int i = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.isNestedScrollAccepted(0)) {
                    Behavior behavior = layoutParams.getBehavior();
                    if (behavior != null) {
                        i |= behavior.onNestedFling(this, childAt, view, f, f2, z);
                    }
                }
            }
        }
        if (i != 0) {
            onChildViewsChanged(1);
        }
        return i;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        int childCount = getChildCount();
        int i = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.isNestedScrollAccepted(0)) {
                    Behavior behavior = layoutParams.getBehavior();
                    if (behavior != null) {
                        i |= behavior.onNestedPreFling(this, childAt, view, f, f2);
                    }
                }
            }
        }
        return i;
    }

    public int getNestedScrollAxes() {
        return this.mNestedScrollingParentHelper.getNestedScrollAxes();
    }

    /* Access modifiers changed, original: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            super.onRestoreInstanceState(savedState.getSuperState());
            SparseArray sparseArray = savedState.behaviorStates;
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                int id = childAt.getId();
                Behavior behavior = getResolvedLayoutParams(childAt).getBehavior();
                if (!(id == -1 || behavior == null)) {
                    Parcelable parcelable2 = (Parcelable) sparseArray.get(id);
                    if (parcelable2 != null) {
                        behavior.onRestoreInstanceState(this, childAt, parcelable2);
                    }
                }
            }
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    /* Access modifiers changed, original: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            Behavior behavior = ((LayoutParams) childAt.getLayoutParams()).getBehavior();
            if (!(id == -1 || behavior == null)) {
                Parcelable onSaveInstanceState = behavior.onSaveInstanceState(this, childAt);
                if (onSaveInstanceState != null) {
                    sparseArray.append(id, onSaveInstanceState);
                }
            }
        }
        savedState.behaviorStates = sparseArray;
        return savedState;
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        Behavior behavior = ((LayoutParams) view.getLayoutParams()).getBehavior();
        if (behavior == null || !behavior.onRequestChildRectangleOnScreen(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    private void setupForInsets() {
        if (VERSION.SDK_INT >= 21) {
            if (ViewCompat.getFitsSystemWindows(this)) {
                if (this.mApplyWindowInsetsListener == null) {
                    this.mApplyWindowInsetsListener = new OnApplyWindowInsetsListener() {
                        public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                            return CoordinatorLayout.this.setWindowInsets(windowInsetsCompat);
                        }
                    };
                }
                ViewCompat.setOnApplyWindowInsetsListener(this, this.mApplyWindowInsetsListener);
                setSystemUiVisibility(1280);
            } else {
                ViewCompat.setOnApplyWindowInsetsListener(this, null);
            }
        }
    }
}
