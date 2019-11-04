package android.support.v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.RemoteException;
import android.support.v4.media.session.IMediaSession;
import android.support.v4.media.session.IMediaSession.Stub;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.MediaSessionCompat.Token;
import android.support.v4.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.collection.ArrayMap;
import androidx.core.app.BundleCompat;
import androidx.media.MediaBrowserCompatUtils;
import androidx.media.MediaBrowserProtocol;
import androidx.media.MediaBrowserServiceCompat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;

public final class MediaBrowserCompat {
    static final boolean DEBUG = Log.isLoggable("MediaBrowserCompat", 3);
    private final MediaBrowserImpl C;

    private static class CallbackHandler extends Handler {
        private final WeakReference<MediaBrowserServiceCallbackImpl> D;
        private WeakReference<Messenger> E;

        CallbackHandler(MediaBrowserServiceCallbackImpl mediaBrowserServiceCallbackImpl) {
            this.D = new WeakReference(mediaBrowserServiceCallbackImpl);
        }

        public void handleMessage(Message message) {
            String str = "MediaBrowserCompat";
            WeakReference weakReference = this.E;
            if (weakReference != null && weakReference.get() != null && this.D.get() != null) {
                Bundle data = message.getData();
                MediaSessionCompat.d(data);
                MediaBrowserServiceCallbackImpl mediaBrowserServiceCallbackImpl = (MediaBrowserServiceCallbackImpl) this.D.get();
                Messenger messenger = (Messenger) this.E.get();
                try {
                    int i = message.what;
                    String str2 = MediaBrowserProtocol.DATA_MEDIA_ITEM_ID;
                    if (i == 1) {
                        Bundle bundle = data.getBundle(MediaBrowserProtocol.DATA_ROOT_HINTS);
                        MediaSessionCompat.d(bundle);
                        mediaBrowserServiceCallbackImpl.a(messenger, data.getString(str2), (Token) data.getParcelable(MediaBrowserProtocol.DATA_MEDIA_SESSION_TOKEN), bundle);
                    } else if (i == 2) {
                        mediaBrowserServiceCallbackImpl.b(messenger);
                    } else if (i != 3) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Unhandled message: ");
                        stringBuilder.append(message);
                        stringBuilder.append("\n  Client version: ");
                        stringBuilder.append(1);
                        stringBuilder.append("\n  Service version: ");
                        stringBuilder.append(message.arg1);
                        Log.w(str, stringBuilder.toString());
                    } else {
                        Bundle bundle2 = data.getBundle(MediaBrowserProtocol.DATA_OPTIONS);
                        MediaSessionCompat.d(bundle2);
                        Bundle bundle3 = data.getBundle(MediaBrowserProtocol.DATA_NOTIFY_CHILDREN_CHANGED_OPTIONS);
                        MediaSessionCompat.d(bundle3);
                        mediaBrowserServiceCallbackImpl.a(messenger, data.getString(str2), data.getParcelableArrayList(MediaBrowserProtocol.DATA_MEDIA_ITEM_LIST), bundle2, bundle3);
                    }
                } catch (BadParcelableException unused) {
                    Log.e(str, "Could not unparcel the data.");
                    if (message.what == 1) {
                        mediaBrowserServiceCallbackImpl.b(messenger);
                    }
                }
            }
        }

        /* Access modifiers changed, original: 0000 */
        public void a(Messenger messenger) {
            this.E = new WeakReference(messenger);
        }
    }

    public static class ConnectionCallback {
        ConnectionCallbackInternal mConnectionCallbackInternal;
        final Object mConnectionCallbackObj;

        interface ConnectionCallbackInternal {
            void onConnected();

            void onConnectionFailed();

            void onConnectionSuspended();
        }

        private class StubApi21 implements ConnectionCallback {
            StubApi21() {
            }

            public void onConnected() {
                if (ConnectionCallback.this.mConnectionCallbackInternal != null) {
                    ConnectionCallback.this.mConnectionCallbackInternal.onConnected();
                }
                ConnectionCallback.this.onConnected();
            }

            public void onConnectionSuspended() {
                if (ConnectionCallback.this.mConnectionCallbackInternal != null) {
                    ConnectionCallback.this.mConnectionCallbackInternal.onConnectionSuspended();
                }
                ConnectionCallback.this.onConnectionSuspended();
            }

            public void onConnectionFailed() {
                if (ConnectionCallback.this.mConnectionCallbackInternal != null) {
                    ConnectionCallback.this.mConnectionCallbackInternal.onConnectionFailed();
                }
                ConnectionCallback.this.onConnectionFailed();
            }
        }

        public void onConnected() {
        }

        public void onConnectionFailed() {
        }

        public void onConnectionSuspended() {
        }

        public ConnectionCallback() {
            if (VERSION.SDK_INT >= 21) {
                this.mConnectionCallbackObj = MediaBrowserCompatApi21.a(new StubApi21());
            } else {
                this.mConnectionCallbackObj = null;
            }
        }

        /* Access modifiers changed, original: 0000 */
        public void setInternalConnectionCallback(ConnectionCallbackInternal connectionCallbackInternal) {
            this.mConnectionCallbackInternal = connectionCallbackInternal;
        }
    }

    public static abstract class CustomActionCallback {
        public void a(String str, Bundle bundle, Bundle bundle2) {
        }

        public void b(String str, Bundle bundle, Bundle bundle2) {
        }

        public void c(String str, Bundle bundle, Bundle bundle2) {
        }
    }

    public static abstract class ItemCallback {
        public void a(MediaItem mediaItem) {
        }

        public void onError(@NonNull String str) {
        }
    }

    interface MediaBrowserImpl {
        void connect();

        void disconnect();

        @NonNull
        Token getSessionToken();
    }

    interface MediaBrowserServiceCallbackImpl {
        void a(Messenger messenger, String str, Token token, Bundle bundle);

        void a(Messenger messenger, String str, List list, Bundle bundle, Bundle bundle2);

        void b(Messenger messenger);
    }

    public static class MediaItem implements Parcelable {
        public static final Creator<MediaItem> CREATOR = new Creator<MediaItem>() {
            /* renamed from: b */
            public MediaItem createFromParcel(Parcel parcel) {
                return new MediaItem(parcel);
            }

            /* renamed from: e */
            public MediaItem[] newArray(int i) {
                return new MediaItem[i];
            }
        };
        private final MediaDescriptionCompat aj;
        private final int mFlags;

        public int describeContents() {
            return 0;
        }

        public static MediaItem b(Object obj) {
            if (obj == null || VERSION.SDK_INT < 21) {
                return null;
            }
            return new MediaItem(MediaDescriptionCompat.i(MediaItem.h(obj)), MediaItem.g(obj));
        }

        public static List<MediaItem> b(List<?> list) {
            if (list == null || VERSION.SDK_INT < 21) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (Object b : list) {
                arrayList.add(b(b));
            }
            return arrayList;
        }

        public MediaItem(@NonNull MediaDescriptionCompat mediaDescriptionCompat, int i) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("description cannot be null");
            } else if (TextUtils.isEmpty(mediaDescriptionCompat.getMediaId())) {
                throw new IllegalArgumentException("description must have a non-empty media id");
            } else {
                this.mFlags = i;
                this.aj = mediaDescriptionCompat;
            }
        }

        MediaItem(Parcel parcel) {
            this.mFlags = parcel.readInt();
            this.aj = (MediaDescriptionCompat) MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.mFlags);
            this.aj.writeToParcel(parcel, i);
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder("MediaItem{");
            stringBuilder.append("mFlags=");
            stringBuilder.append(this.mFlags);
            stringBuilder.append(", mDescription=");
            stringBuilder.append(this.aj);
            stringBuilder.append('}');
            return stringBuilder.toString();
        }
    }

    public static abstract class SearchCallback {
        public void a(@NonNull String str, Bundle bundle, @NonNull List<MediaItem> list) {
        }

        public void onError(@NonNull String str, Bundle bundle) {
        }
    }

    private static class ServiceBinderWrapper {
        private Bundle S;
        private Messenger mMessenger;

        public ServiceBinderWrapper(IBinder iBinder, Bundle bundle) {
            this.mMessenger = new Messenger(iBinder);
            this.S = bundle;
        }

        /* Access modifiers changed, original: 0000 */
        public void a(Context context, Messenger messenger) {
            Bundle bundle = new Bundle();
            bundle.putString(MediaBrowserProtocol.DATA_PACKAGE_NAME, context.getPackageName());
            bundle.putBundle(MediaBrowserProtocol.DATA_ROOT_HINTS, this.S);
            a(1, bundle, messenger);
        }

        /* Access modifiers changed, original: 0000 */
        public void c(Messenger messenger) {
            a(2, null, messenger);
        }

        /* Access modifiers changed, original: 0000 */
        public void a(String str, IBinder iBinder, Bundle bundle, Messenger messenger) {
            Bundle bundle2 = new Bundle();
            bundle2.putString(MediaBrowserProtocol.DATA_MEDIA_ITEM_ID, str);
            BundleCompat.putBinder(bundle2, MediaBrowserProtocol.DATA_CALLBACK_TOKEN, iBinder);
            bundle2.putBundle(MediaBrowserProtocol.DATA_OPTIONS, bundle);
            a(3, bundle2, messenger);
        }

        /* Access modifiers changed, original: 0000 */
        public void b(Context context, Messenger messenger) {
            Bundle bundle = new Bundle();
            bundle.putString(MediaBrowserProtocol.DATA_PACKAGE_NAME, context.getPackageName());
            bundle.putBundle(MediaBrowserProtocol.DATA_ROOT_HINTS, this.S);
            a(6, bundle, messenger);
        }

        /* Access modifiers changed, original: 0000 */
        public void d(Messenger messenger) {
            a(7, null, messenger);
        }

        private void a(int i, Bundle bundle, Messenger messenger) {
            Message obtain = Message.obtain();
            obtain.what = i;
            obtain.arg1 = 1;
            obtain.setData(bundle);
            obtain.replyTo = messenger;
            this.mMessenger.send(obtain);
        }
    }

    private static class Subscription {
        private final List<Bundle> al = new ArrayList();
        private final List<SubscriptionCallback> mCallbacks = new ArrayList();

        public List<Bundle> t() {
            return this.al;
        }

        public List<SubscriptionCallback> u() {
            return this.mCallbacks;
        }

        public SubscriptionCallback b(Bundle bundle) {
            for (int i = 0; i < this.al.size(); i++) {
                if (MediaBrowserCompatUtils.areSameOptions((Bundle) this.al.get(i), bundle)) {
                    return (SubscriptionCallback) this.mCallbacks.get(i);
                }
            }
            return null;
        }
    }

    public static abstract class SubscriptionCallback {
        final Object am;
        WeakReference<Subscription> an;
        final IBinder mToken = new Binder();

        private class StubApi21 implements SubscriptionCallback {
            StubApi21() {
            }

            public void onChildrenLoaded(@NonNull String str, List<?> list) {
                Subscription subscription = SubscriptionCallback.this.an == null ? null : (Subscription) SubscriptionCallback.this.an.get();
                if (subscription == null) {
                    SubscriptionCallback.this.onChildrenLoaded(str, MediaItem.b((List) list));
                    return;
                }
                List b = MediaItem.b((List) list);
                List u = subscription.u();
                List t = subscription.t();
                for (int i = 0; i < u.size(); i++) {
                    Bundle bundle = (Bundle) t.get(i);
                    if (bundle == null) {
                        SubscriptionCallback.this.onChildrenLoaded(str, b);
                    } else {
                        SubscriptionCallback.this.onChildrenLoaded(str, applyOptions(b, bundle), bundle);
                    }
                }
            }

            public void onError(@NonNull String str) {
                SubscriptionCallback.this.onError(str);
            }

            /* Access modifiers changed, original: 0000 */
            public List<MediaItem> applyOptions(List<MediaItem> list, Bundle bundle) {
                if (list == null) {
                    return null;
                }
                int i = bundle.getInt("android.media.browse.extra.PAGE", -1);
                int i2 = bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
                if (i == -1 && i2 == -1) {
                    return list;
                }
                int i3 = i2 * i;
                int i4 = i3 + i2;
                if (i < 0 || i2 < 1 || i3 >= list.size()) {
                    return Collections.emptyList();
                }
                if (i4 > list.size()) {
                    i4 = list.size();
                }
                return list.subList(i3, i4);
            }
        }

        private class StubApi26 extends StubApi21 implements SubscriptionCallback {
            StubApi26() {
                super();
            }

            public void onChildrenLoaded(@NonNull String str, List<?> list, @NonNull Bundle bundle) {
                SubscriptionCallback.this.onChildrenLoaded(str, MediaItem.b((List) list), bundle);
            }

            public void onError(@NonNull String str, @NonNull Bundle bundle) {
                SubscriptionCallback.this.onError(str, bundle);
            }
        }

        public void onChildrenLoaded(@NonNull String str, @NonNull List<MediaItem> list) {
        }

        public void onChildrenLoaded(@NonNull String str, @NonNull List<MediaItem> list, @NonNull Bundle bundle) {
        }

        public void onError(@NonNull String str) {
        }

        public void onError(@NonNull String str, @NonNull Bundle bundle) {
        }

        public SubscriptionCallback() {
            if (VERSION.SDK_INT >= 26) {
                this.am = MediaBrowserCompatApi26.a(new StubApi26());
            } else if (VERSION.SDK_INT >= 21) {
                this.am = MediaBrowserCompatApi21.a(new StubApi21());
            } else {
                this.am = null;
            }
        }
    }

    private static class CustomActionResultReceiver extends ResultReceiver {
        private final String J;
        private final CustomActionCallback K;
        private final Bundle mExtras;

        /* Access modifiers changed, original: protected */
        public void onReceiveResult(int i, Bundle bundle) {
            if (this.K != null) {
                MediaSessionCompat.d(bundle);
                if (i == -1) {
                    this.K.c(this.J, this.mExtras, bundle);
                } else if (i == 0) {
                    this.K.b(this.J, this.mExtras, bundle);
                } else if (i != 1) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Unknown result code: ");
                    stringBuilder.append(i);
                    stringBuilder.append(" (extras=");
                    stringBuilder.append(this.mExtras);
                    stringBuilder.append(", resultData=");
                    stringBuilder.append(bundle);
                    stringBuilder.append(")");
                    Log.w("MediaBrowserCompat", stringBuilder.toString());
                } else {
                    this.K.a(this.J, this.mExtras, bundle);
                }
            }
        }
    }

    private static class ItemReceiver extends ResultReceiver {
        private final String N;
        private final ItemCallback O;

        /* Access modifiers changed, original: protected */
        public void onReceiveResult(int i, Bundle bundle) {
            MediaSessionCompat.d(bundle);
            if (i == 0 && bundle != null) {
                String str = MediaBrowserServiceCompat.KEY_MEDIA_ITEM;
                if (bundle.containsKey(str)) {
                    Parcelable parcelable = bundle.getParcelable(str);
                    if (parcelable == null || (parcelable instanceof MediaItem)) {
                        this.O.a((MediaItem) parcelable);
                    } else {
                        this.O.onError(this.N);
                    }
                    return;
                }
            }
            this.O.onError(this.N);
        }
    }

    @RequiresApi(21)
    static class MediaBrowserImplApi21 implements ConnectionCallbackInternal, MediaBrowserImpl, MediaBrowserServiceCallbackImpl {
        protected final Object R;
        protected final Bundle S;
        protected final CallbackHandler T = new CallbackHandler(this);
        private final ArrayMap<String, Subscription> U = new ArrayMap();
        protected int V;
        protected ServiceBinderWrapper W;
        protected Messenger aa;
        private Token ab;
        private Bundle ac;
        final Context mContext;

        public void a(Messenger messenger, String str, Token token, Bundle bundle) {
        }

        public void b(Messenger messenger) {
        }

        public void onConnectionFailed() {
        }

        MediaBrowserImplApi21(Context context, ComponentName componentName, ConnectionCallback connectionCallback, Bundle bundle) {
            this.mContext = context;
            this.S = bundle != null ? new Bundle(bundle) : new Bundle();
            this.S.putInt(MediaBrowserProtocol.EXTRA_CLIENT_VERSION, 1);
            connectionCallback.setInternalConnectionCallback(this);
            this.R = MediaBrowserCompatApi21.a(context, componentName, connectionCallback.mConnectionCallbackObj, this.S);
        }

        public void connect() {
            MediaBrowserCompatApi21.c(this.R);
        }

        public void disconnect() {
            ServiceBinderWrapper serviceBinderWrapper = this.W;
            if (serviceBinderWrapper != null) {
                Messenger messenger = this.aa;
                if (messenger != null) {
                    try {
                        serviceBinderWrapper.d(messenger);
                    } catch (RemoteException unused) {
                        Log.i("MediaBrowserCompat", "Remote error unregistering client messenger.");
                    }
                }
            }
            MediaBrowserCompatApi21.d(this.R);
        }

        @NonNull
        public Token getSessionToken() {
            if (this.ab == null) {
                this.ab = Token.x(MediaBrowserCompatApi21.f(this.R));
            }
            return this.ab;
        }

        public void onConnected() {
            Bundle e = MediaBrowserCompatApi21.e(this.R);
            if (e != null) {
                this.V = e.getInt(MediaBrowserProtocol.EXTRA_SERVICE_VERSION, 0);
                IBinder binder = BundleCompat.getBinder(e, MediaBrowserProtocol.EXTRA_MESSENGER_BINDER);
                if (binder != null) {
                    this.W = new ServiceBinderWrapper(binder, this.S);
                    this.aa = new Messenger(this.T);
                    this.T.a(this.aa);
                    try {
                        this.W.b(this.mContext, this.aa);
                    } catch (RemoteException unused) {
                        Log.i("MediaBrowserCompat", "Remote error registering client messenger.");
                    }
                }
                IMediaSession b = Stub.b(BundleCompat.getBinder(e, MediaBrowserProtocol.EXTRA_SESSION_BINDER));
                if (b != null) {
                    this.ab = Token.a(MediaBrowserCompatApi21.f(this.R), b);
                }
            }
        }

        public void onConnectionSuspended() {
            this.W = null;
            this.aa = null;
            this.ab = null;
            this.T.a(null);
        }

        public void a(Messenger messenger, String str, List list, Bundle bundle, Bundle bundle2) {
            if (this.aa == messenger) {
                Subscription subscription = (Subscription) this.U.get(str);
                if (subscription == null) {
                    if (MediaBrowserCompat.DEBUG) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("onLoadChildren for id that isn't subscribed id=");
                        stringBuilder.append(str);
                        Log.d("MediaBrowserCompat", stringBuilder.toString());
                    }
                    return;
                }
                SubscriptionCallback b = subscription.b(bundle);
                if (b != null) {
                    if (bundle == null) {
                        if (list == null) {
                            b.onError(str);
                        } else {
                            this.ac = bundle2;
                            b.onChildrenLoaded(str, list);
                            this.ac = null;
                        }
                    } else if (list == null) {
                        b.onError(str, bundle);
                    } else {
                        this.ac = bundle2;
                        b.onChildrenLoaded(str, list, bundle);
                        this.ac = null;
                    }
                }
            }
        }
    }

    static class MediaBrowserImplBase implements MediaBrowserImpl, MediaBrowserServiceCallbackImpl {
        final Bundle S;
        final CallbackHandler T = new CallbackHandler(this);
        private final ArrayMap<String, Subscription> U = new ArrayMap();
        ServiceBinderWrapper W;
        Messenger aa;
        private Token ab;
        private Bundle ac;
        final ComponentName ad;
        final ConnectionCallback ae;
        MediaServiceConnection af;
        final Context mContext;
        private Bundle mExtras;
        private String mRootId;
        int mState = 1;

        private class MediaServiceConnection implements ServiceConnection {
            MediaServiceConnection() {
            }

            public void onServiceConnected(final ComponentName componentName, final IBinder iBinder) {
                postOrRun(new Runnable() {
                    public void run() {
                        StringBuilder stringBuilder;
                        String str = "ServiceCallbacks.onConnect...";
                        String str2 = "MediaBrowserCompat";
                        if (MediaBrowserCompat.DEBUG) {
                            stringBuilder = new StringBuilder();
                            stringBuilder.append("MediaServiceConnection.onServiceConnected name=");
                            stringBuilder.append(componentName);
                            stringBuilder.append(" binder=");
                            stringBuilder.append(iBinder);
                            Log.d(str2, stringBuilder.toString());
                            MediaBrowserImplBase.this.dump();
                        }
                        if (MediaServiceConnection.this.f("onServiceConnected")) {
                            MediaBrowserImplBase.this.W = new ServiceBinderWrapper(iBinder, MediaBrowserImplBase.this.S);
                            MediaBrowserImplBase.this.aa = new Messenger(MediaBrowserImplBase.this.T);
                            MediaBrowserImplBase.this.T.a(MediaBrowserImplBase.this.aa);
                            MediaBrowserImplBase.this.mState = 2;
                            try {
                                if (MediaBrowserCompat.DEBUG) {
                                    Log.d(str2, str);
                                    MediaBrowserImplBase.this.dump();
                                }
                                MediaBrowserImplBase.this.W.a(MediaBrowserImplBase.this.mContext, MediaBrowserImplBase.this.aa);
                            } catch (RemoteException unused) {
                                stringBuilder = new StringBuilder();
                                stringBuilder.append("RemoteException during connect for ");
                                stringBuilder.append(MediaBrowserImplBase.this.ad);
                                Log.w(str2, stringBuilder.toString());
                                if (MediaBrowserCompat.DEBUG) {
                                    Log.d(str2, str);
                                    MediaBrowserImplBase.this.dump();
                                }
                            }
                        }
                    }
                });
            }

            public void onServiceDisconnected(final ComponentName componentName) {
                postOrRun(new Runnable() {
                    public void run() {
                        if (MediaBrowserCompat.DEBUG) {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("MediaServiceConnection.onServiceDisconnected name=");
                            stringBuilder.append(componentName);
                            stringBuilder.append(" this=");
                            stringBuilder.append(this);
                            stringBuilder.append(" mServiceConnection=");
                            stringBuilder.append(MediaBrowserImplBase.this.af);
                            Log.d("MediaBrowserCompat", stringBuilder.toString());
                            MediaBrowserImplBase.this.dump();
                        }
                        if (MediaServiceConnection.this.f("onServiceDisconnected")) {
                            MediaBrowserImplBase.this.W = null;
                            MediaBrowserImplBase.this.aa = null;
                            MediaBrowserImplBase.this.T.a(null);
                            MediaBrowserImplBase.this.mState = 4;
                            MediaBrowserImplBase.this.ae.onConnectionSuspended();
                        }
                    }
                });
            }

            private void postOrRun(Runnable runnable) {
                if (Thread.currentThread() == MediaBrowserImplBase.this.T.getLooper().getThread()) {
                    runnable.run();
                } else {
                    MediaBrowserImplBase.this.T.post(runnable);
                }
            }

            /* Access modifiers changed, original: 0000 */
            public boolean f(String str) {
                if (MediaBrowserImplBase.this.af == this && MediaBrowserImplBase.this.mState != 0 && MediaBrowserImplBase.this.mState != 1) {
                    return true;
                }
                if (!(MediaBrowserImplBase.this.mState == 0 || MediaBrowserImplBase.this.mState == 1)) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(str);
                    stringBuilder.append(" for ");
                    stringBuilder.append(MediaBrowserImplBase.this.ad);
                    stringBuilder.append(" with mServiceConnection=");
                    stringBuilder.append(MediaBrowserImplBase.this.af);
                    stringBuilder.append(" this=");
                    stringBuilder.append(this);
                    Log.i("MediaBrowserCompat", stringBuilder.toString());
                }
                return false;
            }
        }

        public MediaBrowserImplBase(Context context, ComponentName componentName, ConnectionCallback connectionCallback, Bundle bundle) {
            if (context == null) {
                throw new IllegalArgumentException("context must not be null");
            } else if (componentName == null) {
                throw new IllegalArgumentException("service component must not be null");
            } else if (connectionCallback != null) {
                Bundle bundle2;
                this.mContext = context;
                this.ad = componentName;
                this.ae = connectionCallback;
                if (bundle == null) {
                    bundle2 = null;
                } else {
                    bundle2 = new Bundle(bundle);
                }
                this.S = bundle2;
            } else {
                throw new IllegalArgumentException("connection callback must not be null");
            }
        }

        public void connect() {
            int i = this.mState;
            if (i == 0 || i == 1) {
                this.mState = 2;
                this.T.post(new Runnable() {
                    public void run() {
                        String str = "MediaBrowserCompat";
                        if (MediaBrowserImplBase.this.mState != 0) {
                            MediaBrowserImplBase.this.mState = 2;
                            StringBuilder stringBuilder;
                            if (MediaBrowserCompat.DEBUG && MediaBrowserImplBase.this.af != null) {
                                stringBuilder = new StringBuilder();
                                stringBuilder.append("mServiceConnection should be null. Instead it is ");
                                stringBuilder.append(MediaBrowserImplBase.this.af);
                                throw new RuntimeException(stringBuilder.toString());
                            } else if (MediaBrowserImplBase.this.W != null) {
                                stringBuilder = new StringBuilder();
                                stringBuilder.append("mServiceBinderWrapper should be null. Instead it is ");
                                stringBuilder.append(MediaBrowserImplBase.this.W);
                                throw new RuntimeException(stringBuilder.toString());
                            } else if (MediaBrowserImplBase.this.aa == null) {
                                Intent intent = new Intent(MediaBrowserServiceCompat.SERVICE_INTERFACE);
                                intent.setComponent(MediaBrowserImplBase.this.ad);
                                MediaBrowserImplBase mediaBrowserImplBase = MediaBrowserImplBase.this;
                                mediaBrowserImplBase.af = new MediaServiceConnection();
                                boolean z = false;
                                try {
                                    z = MediaBrowserImplBase.this.mContext.bindService(intent, MediaBrowserImplBase.this.af, 1);
                                } catch (Exception unused) {
                                    stringBuilder = new StringBuilder();
                                    stringBuilder.append("Failed binding to service ");
                                    stringBuilder.append(MediaBrowserImplBase.this.ad);
                                    Log.e(str, stringBuilder.toString());
                                }
                                if (!z) {
                                    MediaBrowserImplBase.this.s();
                                    MediaBrowserImplBase.this.ae.onConnectionFailed();
                                }
                                if (MediaBrowserCompat.DEBUG) {
                                    Log.d(str, "connect...");
                                    MediaBrowserImplBase.this.dump();
                                }
                            } else {
                                stringBuilder = new StringBuilder();
                                stringBuilder.append("mCallbacksMessenger should be null. Instead it is ");
                                stringBuilder.append(MediaBrowserImplBase.this.aa);
                                throw new RuntimeException(stringBuilder.toString());
                            }
                        }
                    }
                });
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("connect() called while neigther disconnecting nor disconnected (state=");
            stringBuilder.append(d(this.mState));
            stringBuilder.append(")");
            throw new IllegalStateException(stringBuilder.toString());
        }

        public void disconnect() {
            this.mState = 0;
            this.T.post(new Runnable() {
                public void run() {
                    String str = "MediaBrowserCompat";
                    if (MediaBrowserImplBase.this.aa != null) {
                        try {
                            MediaBrowserImplBase.this.W.c(MediaBrowserImplBase.this.aa);
                        } catch (RemoteException unused) {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("RemoteException during connect for ");
                            stringBuilder.append(MediaBrowserImplBase.this.ad);
                            Log.w(str, stringBuilder.toString());
                        }
                    }
                    int i = MediaBrowserImplBase.this.mState;
                    MediaBrowserImplBase.this.s();
                    if (i != 0) {
                        MediaBrowserImplBase.this.mState = i;
                    }
                    if (MediaBrowserCompat.DEBUG) {
                        Log.d(str, "disconnect...");
                        MediaBrowserImplBase.this.dump();
                    }
                }
            });
        }

        /* Access modifiers changed, original: 0000 */
        public void s() {
            MediaServiceConnection mediaServiceConnection = this.af;
            if (mediaServiceConnection != null) {
                this.mContext.unbindService(mediaServiceConnection);
            }
            this.mState = 1;
            this.af = null;
            this.W = null;
            this.aa = null;
            this.T.a(null);
            this.mRootId = null;
            this.ab = null;
        }

        public boolean isConnected() {
            return this.mState == 3;
        }

        @NonNull
        public Token getSessionToken() {
            if (isConnected()) {
                return this.ab;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("getSessionToken() called while not connected(state=");
            stringBuilder.append(this.mState);
            stringBuilder.append(")");
            throw new IllegalStateException(stringBuilder.toString());
        }

        public void a(Messenger messenger, String str, Token token, Bundle bundle) {
            if (a(messenger, "onConnect")) {
                String str2 = "MediaBrowserCompat";
                if (this.mState != 2) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("onConnect from service while mState=");
                    stringBuilder.append(d(this.mState));
                    stringBuilder.append("... ignoring");
                    Log.w(str2, stringBuilder.toString());
                    return;
                }
                this.mRootId = str;
                this.ab = token;
                this.mExtras = bundle;
                this.mState = 3;
                if (MediaBrowserCompat.DEBUG) {
                    Log.d(str2, "ServiceCallbacks.onConnect...");
                    dump();
                }
                this.ae.onConnected();
                try {
                    for (Entry entry : this.U.entrySet()) {
                        String str3 = (String) entry.getKey();
                        Subscription subscription = (Subscription) entry.getValue();
                        List u = subscription.u();
                        List t = subscription.t();
                        for (int i = 0; i < u.size(); i++) {
                            this.W.a(str3, ((SubscriptionCallback) u.get(i)).mToken, (Bundle) t.get(i), this.aa);
                        }
                    }
                } catch (RemoteException unused) {
                    Log.d(str2, "addSubscription failed with RemoteException.");
                }
            }
        }

        public void b(Messenger messenger) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("onConnectFailed for ");
            stringBuilder.append(this.ad);
            String str = "MediaBrowserCompat";
            Log.e(str, stringBuilder.toString());
            if (!a(messenger, "onConnectFailed")) {
                return;
            }
            if (this.mState != 2) {
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("onConnect from service while mState=");
                stringBuilder2.append(d(this.mState));
                stringBuilder2.append("... ignoring");
                Log.w(str, stringBuilder2.toString());
                return;
            }
            s();
            this.ae.onConnectionFailed();
        }

        public void a(Messenger messenger, String str, List list, Bundle bundle, Bundle bundle2) {
            if (a(messenger, "onLoadChildren")) {
                StringBuilder stringBuilder;
                String str2 = "MediaBrowserCompat";
                if (MediaBrowserCompat.DEBUG) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("onLoadChildren for ");
                    stringBuilder.append(this.ad);
                    stringBuilder.append(" id=");
                    stringBuilder.append(str);
                    Log.d(str2, stringBuilder.toString());
                }
                Subscription subscription = (Subscription) this.U.get(str);
                if (subscription == null) {
                    if (MediaBrowserCompat.DEBUG) {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("onLoadChildren for id that isn't subscribed id=");
                        stringBuilder.append(str);
                        Log.d(str2, stringBuilder.toString());
                    }
                    return;
                }
                SubscriptionCallback b = subscription.b(bundle);
                if (b != null) {
                    if (bundle == null) {
                        if (list == null) {
                            b.onError(str);
                        } else {
                            this.ac = bundle2;
                            b.onChildrenLoaded(str, list);
                            this.ac = null;
                        }
                    } else if (list == null) {
                        b.onError(str, bundle);
                    } else {
                        this.ac = bundle2;
                        b.onChildrenLoaded(str, list, bundle);
                        this.ac = null;
                    }
                }
            }
        }

        private static String d(int i) {
            if (i == 0) {
                return "CONNECT_STATE_DISCONNECTING";
            }
            if (i == 1) {
                return "CONNECT_STATE_DISCONNECTED";
            }
            if (i == 2) {
                return "CONNECT_STATE_CONNECTING";
            }
            if (i == 3) {
                return "CONNECT_STATE_CONNECTED";
            }
            if (i == 4) {
                return "CONNECT_STATE_SUSPENDED";
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("UNKNOWN/");
            stringBuilder.append(i);
            return stringBuilder.toString();
        }

        private boolean a(Messenger messenger, String str) {
            int i;
            if (this.aa == messenger) {
                i = this.mState;
                if (!(i == 0 || i == 1)) {
                    return true;
                }
            }
            i = this.mState;
            if (!(i == 0 || i == 1)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" for ");
                stringBuilder.append(this.ad);
                stringBuilder.append(" with mCallbacksMessenger=");
                stringBuilder.append(this.aa);
                stringBuilder.append(" this=");
                stringBuilder.append(this);
                Log.i("MediaBrowserCompat", stringBuilder.toString());
            }
            return false;
        }

        /* Access modifiers changed, original: 0000 */
        public void dump() {
            String str = "MediaBrowserCompat";
            Log.d(str, "MediaBrowserCompat...");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("  mServiceComponent=");
            stringBuilder.append(this.ad);
            Log.d(str, stringBuilder.toString());
            stringBuilder = new StringBuilder();
            stringBuilder.append("  mCallback=");
            stringBuilder.append(this.ae);
            Log.d(str, stringBuilder.toString());
            stringBuilder = new StringBuilder();
            stringBuilder.append("  mRootHints=");
            stringBuilder.append(this.S);
            Log.d(str, stringBuilder.toString());
            stringBuilder = new StringBuilder();
            stringBuilder.append("  mState=");
            stringBuilder.append(d(this.mState));
            Log.d(str, stringBuilder.toString());
            stringBuilder = new StringBuilder();
            stringBuilder.append("  mServiceConnection=");
            stringBuilder.append(this.af);
            Log.d(str, stringBuilder.toString());
            stringBuilder = new StringBuilder();
            stringBuilder.append("  mServiceBinderWrapper=");
            stringBuilder.append(this.W);
            Log.d(str, stringBuilder.toString());
            stringBuilder = new StringBuilder();
            stringBuilder.append("  mCallbacksMessenger=");
            stringBuilder.append(this.aa);
            Log.d(str, stringBuilder.toString());
            stringBuilder = new StringBuilder();
            stringBuilder.append("  mRootId=");
            stringBuilder.append(this.mRootId);
            Log.d(str, stringBuilder.toString());
            stringBuilder = new StringBuilder();
            stringBuilder.append("  mMediaSessionToken=");
            stringBuilder.append(this.ab);
            Log.d(str, stringBuilder.toString());
        }
    }

    private static class SearchResultReceiver extends ResultReceiver {
        private final SearchCallback ak;
        private final Bundle mExtras;
        private final String mQuery;

        /* Access modifiers changed, original: protected */
        public void onReceiveResult(int i, Bundle bundle) {
            MediaSessionCompat.d(bundle);
            if (i == 0 && bundle != null) {
                String str = MediaBrowserServiceCompat.KEY_SEARCH_RESULTS;
                if (bundle.containsKey(str)) {
                    Parcelable[] parcelableArray = bundle.getParcelableArray(str);
                    List list = null;
                    if (parcelableArray != null) {
                        list = new ArrayList();
                        for (Parcelable parcelable : parcelableArray) {
                            list.add((MediaItem) parcelable);
                        }
                    }
                    this.ak.a(this.mQuery, this.mExtras, list);
                    return;
                }
            }
            this.ak.onError(this.mQuery, this.mExtras);
        }
    }

    @RequiresApi(23)
    static class MediaBrowserImplApi23 extends MediaBrowserImplApi21 {
        MediaBrowserImplApi23(Context context, ComponentName componentName, ConnectionCallback connectionCallback, Bundle bundle) {
            super(context, componentName, connectionCallback, bundle);
        }
    }

    @RequiresApi(26)
    static class MediaBrowserImplApi26 extends MediaBrowserImplApi23 {
        MediaBrowserImplApi26(Context context, ComponentName componentName, ConnectionCallback connectionCallback, Bundle bundle) {
            super(context, componentName, connectionCallback, bundle);
        }
    }

    public MediaBrowserCompat(Context context, ComponentName componentName, ConnectionCallback connectionCallback, Bundle bundle) {
        if (VERSION.SDK_INT >= 26) {
            this.C = new MediaBrowserImplApi26(context, componentName, connectionCallback, bundle);
        } else if (VERSION.SDK_INT >= 23) {
            this.C = new MediaBrowserImplApi23(context, componentName, connectionCallback, bundle);
        } else if (VERSION.SDK_INT >= 21) {
            this.C = new MediaBrowserImplApi21(context, componentName, connectionCallback, bundle);
        } else {
            this.C = new MediaBrowserImplBase(context, componentName, connectionCallback, bundle);
        }
    }

    public void connect() {
        this.C.connect();
    }

    public void disconnect() {
        this.C.disconnect();
    }

    @NonNull
    public Token getSessionToken() {
        return this.C.getSessionToken();
    }
}
