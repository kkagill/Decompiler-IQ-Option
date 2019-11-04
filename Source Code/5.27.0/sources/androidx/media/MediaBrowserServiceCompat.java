package androidx.media;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.service.media.MediaBrowserService;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.MediaBrowserCompat.MediaItem;
import android.support.v4.media.session.IMediaSession;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.MediaSessionCompat.Token;
import android.support.v4.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.RestrictTo.Scope;
import androidx.collection.ArrayMap;
import androidx.core.app.BundleCompat;
import androidx.core.util.Pair;
import androidx.media.MediaBrowserServiceCompatApi21.ServiceCompatProxy;
import androidx.media.MediaSessionManager.RemoteUserInfo;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public abstract class MediaBrowserServiceCompat extends Service {
    static final boolean DEBUG = Log.isLoggable(TAG, 3);
    private static final float EPSILON = 1.0E-5f;
    @RestrictTo({Scope.LIBRARY})
    public static final String KEY_MEDIA_ITEM = "media_item";
    @RestrictTo({Scope.LIBRARY})
    public static final String KEY_SEARCH_RESULTS = "search_results";
    @RestrictTo({Scope.LIBRARY})
    public static final int RESULT_ERROR = -1;
    static final int RESULT_FLAG_ON_LOAD_ITEM_NOT_IMPLEMENTED = 2;
    static final int RESULT_FLAG_ON_SEARCH_NOT_IMPLEMENTED = 4;
    static final int RESULT_FLAG_OPTION_NOT_HANDLED = 1;
    @RestrictTo({Scope.LIBRARY})
    public static final int RESULT_OK = 0;
    @RestrictTo({Scope.LIBRARY})
    public static final int RESULT_PROGRESS_UPDATE = 1;
    public static final String SERVICE_INTERFACE = "android.media.browse.MediaBrowserService";
    static final String TAG = "MBServiceCompat";
    final ArrayMap<IBinder, ConnectionRecord> mConnections = new ArrayMap();
    ConnectionRecord mCurConnection;
    final ServiceHandler mHandler = new ServiceHandler();
    private MediaBrowserServiceImpl mImpl;
    Token mSession;

    public static final class BrowserRoot {
        public static final String EXTRA_OFFLINE = "android.service.media.extra.OFFLINE";
        public static final String EXTRA_RECENT = "android.service.media.extra.RECENT";
        public static final String EXTRA_SUGGESTED = "android.service.media.extra.SUGGESTED";
        @Deprecated
        public static final String EXTRA_SUGGESTION_KEYWORDS = "android.service.media.extra.SUGGESTION_KEYWORDS";
        private final Bundle mExtras;
        private final String mRootId;

        public BrowserRoot(@NonNull String str, @Nullable Bundle bundle) {
            if (str != null) {
                this.mRootId = str;
                this.mExtras = bundle;
                return;
            }
            throw new IllegalArgumentException("The root id in BrowserRoot cannot be null. Use null for BrowserRoot instead.");
        }

        public String getRootId() {
            return this.mRootId;
        }

        public Bundle getExtras() {
            return this.mExtras;
        }
    }

    private class ConnectionRecord implements DeathRecipient {
        public final RemoteUserInfo browserInfo;
        public final ServiceCallbacks callbacks;
        public final int pid;
        public final String pkg;
        public BrowserRoot root;
        public final Bundle rootHints;
        public final HashMap<String, List<Pair<IBinder, Bundle>>> subscriptions = new HashMap();
        public final int uid;

        ConnectionRecord(String str, int i, int i2, Bundle bundle, ServiceCallbacks serviceCallbacks) {
            this.pkg = str;
            this.pid = i;
            this.uid = i2;
            this.browserInfo = new RemoteUserInfo(str, i, i2);
            this.rootHints = bundle;
            this.callbacks = serviceCallbacks;
        }

        public void binderDied() {
            MediaBrowserServiceCompat.this.mHandler.post(new Runnable() {
                public void run() {
                    MediaBrowserServiceCompat.this.mConnections.remove(ConnectionRecord.this.callbacks.asBinder());
                }
            });
        }
    }

    interface MediaBrowserServiceImpl {
        Bundle getBrowserRootHints();

        RemoteUserInfo getCurrentBrowserInfo();

        void notifyChildrenChanged(RemoteUserInfo remoteUserInfo, String str, Bundle bundle);

        void notifyChildrenChanged(String str, Bundle bundle);

        IBinder onBind(Intent intent);

        void onCreate();

        void setSessionToken(Token token);
    }

    public static class Result<T> {
        private final Object mDebug;
        private boolean mDetachCalled;
        private int mFlags;
        private boolean mSendErrorCalled;
        private boolean mSendProgressUpdateCalled;
        private boolean mSendResultCalled;

        /* Access modifiers changed, original: 0000 */
        public void onResultSent(T t) {
        }

        Result(Object obj) {
            this.mDebug = obj;
        }

        public void sendResult(T t) {
            if (this.mSendResultCalled || this.mSendErrorCalled) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("sendResult() called when either sendResult() or sendError() had already been called for: ");
                stringBuilder.append(this.mDebug);
                throw new IllegalStateException(stringBuilder.toString());
            }
            this.mSendResultCalled = true;
            onResultSent(t);
        }

        public void sendProgressUpdate(Bundle bundle) {
            if (this.mSendResultCalled || this.mSendErrorCalled) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("sendProgressUpdate() called when either sendResult() or sendError() had already been called for: ");
                stringBuilder.append(this.mDebug);
                throw new IllegalStateException(stringBuilder.toString());
            }
            checkExtraFields(bundle);
            this.mSendProgressUpdateCalled = true;
            onProgressUpdateSent(bundle);
        }

        public void sendError(Bundle bundle) {
            if (this.mSendResultCalled || this.mSendErrorCalled) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("sendError() called when either sendResult() or sendError() had already been called for: ");
                stringBuilder.append(this.mDebug);
                throw new IllegalStateException(stringBuilder.toString());
            }
            this.mSendErrorCalled = true;
            onErrorSent(bundle);
        }

        public void detach() {
            StringBuilder stringBuilder;
            if (this.mDetachCalled) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("detach() called when detach() had already been called for: ");
                stringBuilder.append(this.mDebug);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.mSendResultCalled) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("detach() called when sendResult() had already been called for: ");
                stringBuilder.append(this.mDebug);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.mSendErrorCalled) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("detach() called when sendError() had already been called for: ");
                stringBuilder.append(this.mDebug);
                throw new IllegalStateException(stringBuilder.toString());
            } else {
                this.mDetachCalled = true;
            }
        }

        /* Access modifiers changed, original: 0000 */
        public boolean isDone() {
            return this.mDetachCalled || this.mSendResultCalled || this.mSendErrorCalled;
        }

        /* Access modifiers changed, original: 0000 */
        public void setFlags(int i) {
            this.mFlags = i;
        }

        /* Access modifiers changed, original: 0000 */
        public int getFlags() {
            return this.mFlags;
        }

        /* Access modifiers changed, original: 0000 */
        public void onProgressUpdateSent(Bundle bundle) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("It is not supported to send an interim update for ");
            stringBuilder.append(this.mDebug);
            throw new UnsupportedOperationException(stringBuilder.toString());
        }

        /* Access modifiers changed, original: 0000 */
        public void onErrorSent(Bundle bundle) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("It is not supported to send an error for ");
            stringBuilder.append(this.mDebug);
            throw new UnsupportedOperationException(stringBuilder.toString());
        }

        private void checkExtraFields(Bundle bundle) {
            if (bundle != null) {
                String str = "android.media.browse.extra.DOWNLOAD_PROGRESS";
                if (bundle.containsKey(str)) {
                    float f = bundle.getFloat(str);
                    if (f < -1.0E-5f || f > 1.00001f) {
                        throw new IllegalArgumentException("The value of the EXTRA_DOWNLOAD_PROGRESS field must be a float number within [0.0, 1.0].");
                    }
                }
            }
        }
    }

    private class ServiceBinderImpl {
        ServiceBinderImpl() {
        }

        public void connect(String str, int i, int i2, Bundle bundle, ServiceCallbacks serviceCallbacks) {
            if (MediaBrowserServiceCompat.this.isValidPackage(str, i2)) {
                final ServiceCallbacks serviceCallbacks2 = serviceCallbacks;
                final String str2 = str;
                final int i3 = i;
                final int i4 = i2;
                final Bundle bundle2 = bundle;
                MediaBrowserServiceCompat.this.mHandler.postOrRun(new Runnable() {
                    public void run() {
                        IBinder asBinder = serviceCallbacks2.asBinder();
                        MediaBrowserServiceCompat.this.mConnections.remove(asBinder);
                        ConnectionRecord connectionRecord = new ConnectionRecord(str2, i3, i4, bundle2, serviceCallbacks2);
                        MediaBrowserServiceCompat.this.mCurConnection = connectionRecord;
                        connectionRecord.root = MediaBrowserServiceCompat.this.onGetRoot(str2, i4, bundle2);
                        MediaBrowserServiceCompat.this.mCurConnection = null;
                        BrowserRoot browserRoot = connectionRecord.root;
                        String str = MediaBrowserServiceCompat.TAG;
                        if (browserRoot == null) {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("No root for client ");
                            stringBuilder.append(str2);
                            stringBuilder.append(" from service ");
                            stringBuilder.append(getClass().getName());
                            Log.i(str, stringBuilder.toString());
                            try {
                                serviceCallbacks2.onConnectFailed();
                                return;
                            } catch (RemoteException unused) {
                                stringBuilder = new StringBuilder();
                                stringBuilder.append("Calling onConnectFailed() failed. Ignoring. pkg=");
                                stringBuilder.append(str2);
                                Log.w(str, stringBuilder.toString());
                                return;
                            }
                        }
                        try {
                            MediaBrowserServiceCompat.this.mConnections.put(asBinder, connectionRecord);
                            asBinder.linkToDeath(connectionRecord, 0);
                            if (MediaBrowserServiceCompat.this.mSession != null) {
                                serviceCallbacks2.onConnect(connectionRecord.root.getRootId(), MediaBrowserServiceCompat.this.mSession, connectionRecord.root.getExtras());
                            }
                        } catch (RemoteException unused2) {
                            StringBuilder stringBuilder2 = new StringBuilder();
                            stringBuilder2.append("Calling onConnect() failed. Dropping client. pkg=");
                            stringBuilder2.append(str2);
                            Log.w(str, stringBuilder2.toString());
                            MediaBrowserServiceCompat.this.mConnections.remove(asBinder);
                        }
                    }
                });
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Package/uid mismatch: uid=");
            stringBuilder.append(i2);
            stringBuilder.append(" package=");
            stringBuilder.append(str);
            throw new IllegalArgumentException(stringBuilder.toString());
        }

        public void disconnect(final ServiceCallbacks serviceCallbacks) {
            MediaBrowserServiceCompat.this.mHandler.postOrRun(new Runnable() {
                public void run() {
                    ConnectionRecord connectionRecord = (ConnectionRecord) MediaBrowserServiceCompat.this.mConnections.remove(serviceCallbacks.asBinder());
                    if (connectionRecord != null) {
                        connectionRecord.callbacks.asBinder().unlinkToDeath(connectionRecord, 0);
                    }
                }
            });
        }

        public void addSubscription(String str, IBinder iBinder, Bundle bundle, ServiceCallbacks serviceCallbacks) {
            final ServiceCallbacks serviceCallbacks2 = serviceCallbacks;
            final String str2 = str;
            final IBinder iBinder2 = iBinder;
            final Bundle bundle2 = bundle;
            MediaBrowserServiceCompat.this.mHandler.postOrRun(new Runnable() {
                public void run() {
                    ConnectionRecord connectionRecord = (ConnectionRecord) MediaBrowserServiceCompat.this.mConnections.get(serviceCallbacks2.asBinder());
                    if (connectionRecord == null) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("addSubscription for callback that isn't registered id=");
                        stringBuilder.append(str2);
                        Log.w(MediaBrowserServiceCompat.TAG, stringBuilder.toString());
                        return;
                    }
                    MediaBrowserServiceCompat.this.addSubscription(str2, connectionRecord, iBinder2, bundle2);
                }
            });
        }

        public void removeSubscription(final String str, final IBinder iBinder, final ServiceCallbacks serviceCallbacks) {
            MediaBrowserServiceCompat.this.mHandler.postOrRun(new Runnable() {
                public void run() {
                    ConnectionRecord connectionRecord = (ConnectionRecord) MediaBrowserServiceCompat.this.mConnections.get(serviceCallbacks.asBinder());
                    String str = MediaBrowserServiceCompat.TAG;
                    StringBuilder stringBuilder;
                    if (connectionRecord == null) {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("removeSubscription for callback that isn't registered id=");
                        stringBuilder.append(str);
                        Log.w(str, stringBuilder.toString());
                        return;
                    }
                    if (!MediaBrowserServiceCompat.this.removeSubscription(str, connectionRecord, iBinder)) {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("removeSubscription called for ");
                        stringBuilder.append(str);
                        stringBuilder.append(" which is not subscribed");
                        Log.w(str, stringBuilder.toString());
                    }
                }
            });
        }

        public void getMediaItem(final String str, final ResultReceiver resultReceiver, final ServiceCallbacks serviceCallbacks) {
            if (!TextUtils.isEmpty(str) && resultReceiver != null) {
                MediaBrowserServiceCompat.this.mHandler.postOrRun(new Runnable() {
                    public void run() {
                        ConnectionRecord connectionRecord = (ConnectionRecord) MediaBrowserServiceCompat.this.mConnections.get(serviceCallbacks.asBinder());
                        if (connectionRecord == null) {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("getMediaItem for callback that isn't registered id=");
                            stringBuilder.append(str);
                            Log.w(MediaBrowserServiceCompat.TAG, stringBuilder.toString());
                            return;
                        }
                        MediaBrowserServiceCompat.this.performLoadItem(str, connectionRecord, resultReceiver);
                    }
                });
            }
        }

        public void registerCallbacks(ServiceCallbacks serviceCallbacks, String str, int i, int i2, Bundle bundle) {
            final ServiceCallbacks serviceCallbacks2 = serviceCallbacks;
            final String str2 = str;
            final int i3 = i;
            final int i4 = i2;
            final Bundle bundle2 = bundle;
            MediaBrowserServiceCompat.this.mHandler.postOrRun(new Runnable() {
                public void run() {
                    IBinder asBinder = serviceCallbacks2.asBinder();
                    MediaBrowserServiceCompat.this.mConnections.remove(asBinder);
                    ConnectionRecord connectionRecord = new ConnectionRecord(str2, i3, i4, bundle2, serviceCallbacks2);
                    MediaBrowserServiceCompat.this.mConnections.put(asBinder, connectionRecord);
                    try {
                        asBinder.linkToDeath(connectionRecord, 0);
                    } catch (RemoteException unused) {
                        Log.w(MediaBrowserServiceCompat.TAG, "IBinder is already dead.");
                    }
                }
            });
        }

        public void unregisterCallbacks(final ServiceCallbacks serviceCallbacks) {
            MediaBrowserServiceCompat.this.mHandler.postOrRun(new Runnable() {
                public void run() {
                    IBinder asBinder = serviceCallbacks.asBinder();
                    ConnectionRecord connectionRecord = (ConnectionRecord) MediaBrowserServiceCompat.this.mConnections.remove(asBinder);
                    if (connectionRecord != null) {
                        asBinder.unlinkToDeath(connectionRecord, 0);
                    }
                }
            });
        }

        public void search(String str, Bundle bundle, ResultReceiver resultReceiver, ServiceCallbacks serviceCallbacks) {
            if (!TextUtils.isEmpty(str) && resultReceiver != null) {
                final ServiceCallbacks serviceCallbacks2 = serviceCallbacks;
                final String str2 = str;
                final Bundle bundle2 = bundle;
                final ResultReceiver resultReceiver2 = resultReceiver;
                MediaBrowserServiceCompat.this.mHandler.postOrRun(new Runnable() {
                    public void run() {
                        ConnectionRecord connectionRecord = (ConnectionRecord) MediaBrowserServiceCompat.this.mConnections.get(serviceCallbacks2.asBinder());
                        if (connectionRecord == null) {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("search for callback that isn't registered query=");
                            stringBuilder.append(str2);
                            Log.w(MediaBrowserServiceCompat.TAG, stringBuilder.toString());
                            return;
                        }
                        MediaBrowserServiceCompat.this.performSearch(str2, bundle2, connectionRecord, resultReceiver2);
                    }
                });
            }
        }

        public void sendCustomAction(String str, Bundle bundle, ResultReceiver resultReceiver, ServiceCallbacks serviceCallbacks) {
            if (!TextUtils.isEmpty(str) && resultReceiver != null) {
                final ServiceCallbacks serviceCallbacks2 = serviceCallbacks;
                final String str2 = str;
                final Bundle bundle2 = bundle;
                final ResultReceiver resultReceiver2 = resultReceiver;
                MediaBrowserServiceCompat.this.mHandler.postOrRun(new Runnable() {
                    public void run() {
                        ConnectionRecord connectionRecord = (ConnectionRecord) MediaBrowserServiceCompat.this.mConnections.get(serviceCallbacks2.asBinder());
                        if (connectionRecord == null) {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("sendCustomAction for callback that isn't registered action=");
                            stringBuilder.append(str2);
                            stringBuilder.append(", extras=");
                            stringBuilder.append(bundle2);
                            Log.w(MediaBrowserServiceCompat.TAG, stringBuilder.toString());
                            return;
                        }
                        MediaBrowserServiceCompat.this.performCustomAction(str2, bundle2, connectionRecord, resultReceiver2);
                    }
                });
            }
        }
    }

    private interface ServiceCallbacks {
        IBinder asBinder();

        void onConnect(String str, Token token, Bundle bundle);

        void onConnectFailed();

        void onLoadChildren(String str, List<MediaItem> list, Bundle bundle, Bundle bundle2);
    }

    private final class ServiceHandler extends Handler {
        private final ServiceBinderImpl mServiceBinderImpl = new ServiceBinderImpl();

        ServiceHandler() {
        }

        public void handleMessage(Message message) {
            Bundle data = message.getData();
            int i = message.what;
            String str = MediaBrowserProtocol.DATA_CALLBACK_TOKEN;
            String str2 = MediaBrowserProtocol.DATA_CALLING_UID;
            String str3 = MediaBrowserProtocol.DATA_CALLING_PID;
            String str4 = MediaBrowserProtocol.DATA_PACKAGE_NAME;
            String str5 = MediaBrowserProtocol.DATA_ROOT_HINTS;
            String str6 = MediaBrowserProtocol.DATA_RESULT_RECEIVER;
            String str7 = MediaBrowserProtocol.DATA_MEDIA_ITEM_ID;
            Bundle bundle;
            switch (i) {
                case 1:
                    Bundle bundle2 = data.getBundle(str5);
                    MediaSessionCompat.d(bundle2);
                    this.mServiceBinderImpl.connect(data.getString(str4), data.getInt(str3), data.getInt(str2), bundle2, new ServiceCallbacksCompat(message.replyTo));
                    return;
                case 2:
                    this.mServiceBinderImpl.disconnect(new ServiceCallbacksCompat(message.replyTo));
                    return;
                case 3:
                    bundle = data.getBundle(MediaBrowserProtocol.DATA_OPTIONS);
                    MediaSessionCompat.d(bundle);
                    this.mServiceBinderImpl.addSubscription(data.getString(str7), BundleCompat.getBinder(data, str), bundle, new ServiceCallbacksCompat(message.replyTo));
                    return;
                case 4:
                    this.mServiceBinderImpl.removeSubscription(data.getString(str7), BundleCompat.getBinder(data, str), new ServiceCallbacksCompat(message.replyTo));
                    return;
                case 5:
                    this.mServiceBinderImpl.getMediaItem(data.getString(str7), (ResultReceiver) data.getParcelable(str6), new ServiceCallbacksCompat(message.replyTo));
                    return;
                case 6:
                    Bundle bundle3 = data.getBundle(str5);
                    MediaSessionCompat.d(bundle3);
                    this.mServiceBinderImpl.registerCallbacks(new ServiceCallbacksCompat(message.replyTo), data.getString(str4), data.getInt(str3), data.getInt(str2), bundle3);
                    return;
                case 7:
                    this.mServiceBinderImpl.unregisterCallbacks(new ServiceCallbacksCompat(message.replyTo));
                    return;
                case 8:
                    bundle = data.getBundle(MediaBrowserProtocol.DATA_SEARCH_EXTRAS);
                    MediaSessionCompat.d(bundle);
                    this.mServiceBinderImpl.search(data.getString(MediaBrowserProtocol.DATA_SEARCH_QUERY), bundle, (ResultReceiver) data.getParcelable(str6), new ServiceCallbacksCompat(message.replyTo));
                    return;
                case 9:
                    bundle = data.getBundle(MediaBrowserProtocol.DATA_CUSTOM_ACTION_EXTRAS);
                    MediaSessionCompat.d(bundle);
                    this.mServiceBinderImpl.sendCustomAction(data.getString(MediaBrowserProtocol.DATA_CUSTOM_ACTION), bundle, (ResultReceiver) data.getParcelable(str6), new ServiceCallbacksCompat(message.replyTo));
                    return;
                default:
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Unhandled message: ");
                    stringBuilder.append(message);
                    stringBuilder.append("\n  Service version: ");
                    stringBuilder.append(2);
                    stringBuilder.append("\n  Client version: ");
                    stringBuilder.append(message.arg1);
                    Log.w(MediaBrowserServiceCompat.TAG, stringBuilder.toString());
                    return;
            }
        }

        public boolean sendMessageAtTime(Message message, long j) {
            Bundle data = message.getData();
            data.setClassLoader(MediaBrowserCompat.class.getClassLoader());
            data.putInt(MediaBrowserProtocol.DATA_CALLING_UID, Binder.getCallingUid());
            data.putInt(MediaBrowserProtocol.DATA_CALLING_PID, Binder.getCallingPid());
            return super.sendMessageAtTime(message, j);
        }

        public void postOrRun(Runnable runnable) {
            if (Thread.currentThread() == getLooper().getThread()) {
                runnable.run();
            } else {
                post(runnable);
            }
        }
    }

    @RequiresApi(21)
    class MediaBrowserServiceImplApi21 implements MediaBrowserServiceImpl, ServiceCompatProxy {
        Messenger mMessenger;
        final List<Bundle> mRootExtrasList = new ArrayList();
        Object mServiceObj;

        MediaBrowserServiceImplApi21() {
        }

        public void onCreate() {
            this.mServiceObj = MediaBrowserServiceCompatApi21.createService(MediaBrowserServiceCompat.this, this);
            MediaBrowserServiceCompatApi21.onCreate(this.mServiceObj);
        }

        public IBinder onBind(Intent intent) {
            return MediaBrowserServiceCompatApi21.onBind(this.mServiceObj, intent);
        }

        public void setSessionToken(final Token token) {
            MediaBrowserServiceCompat.this.mHandler.postOrRun(new Runnable() {
                public void run() {
                    if (!MediaBrowserServiceImplApi21.this.mRootExtrasList.isEmpty()) {
                        IMediaSession M = token.M();
                        if (M != null) {
                            for (Bundle putBinder : MediaBrowserServiceImplApi21.this.mRootExtrasList) {
                                BundleCompat.putBinder(putBinder, MediaBrowserProtocol.EXTRA_SESSION_BINDER, M.asBinder());
                            }
                        }
                        MediaBrowserServiceImplApi21.this.mRootExtrasList.clear();
                    }
                    MediaBrowserServiceCompatApi21.setSessionToken(MediaBrowserServiceImplApi21.this.mServiceObj, token.L());
                }
            });
        }

        public void notifyChildrenChanged(String str, Bundle bundle) {
            notifyChildrenChangedForFramework(str, bundle);
            notifyChildrenChangedForCompat(str, bundle);
        }

        public void notifyChildrenChanged(RemoteUserInfo remoteUserInfo, String str, Bundle bundle) {
            notifyChildrenChangedForCompat(remoteUserInfo, str, bundle);
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0070  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x006f A:{RETURN} */
        public androidx.media.MediaBrowserServiceCompatApi21.BrowserRoot onGetRoot(java.lang.String r12, int r13, android.os.Bundle r14) {
            /*
            r11 = this;
            r0 = 0;
            if (r14 == 0) goto L_0x0052;
        L_0x0003:
            r1 = 0;
            r2 = "extra_client_version";
            r1 = r14.getInt(r2, r1);
            if (r1 == 0) goto L_0x0052;
        L_0x000c:
            r14.remove(r2);
            r1 = new android.os.Messenger;
            r2 = androidx.media.MediaBrowserServiceCompat.this;
            r2 = r2.mHandler;
            r1.<init>(r2);
            r11.mMessenger = r1;
            r1 = new android.os.Bundle;
            r1.<init>();
            r2 = 2;
            r3 = "extra_service_version";
            r1.putInt(r3, r2);
            r2 = r11.mMessenger;
            r2 = r2.getBinder();
            r3 = "extra_messenger";
            androidx.core.app.BundleCompat.putBinder(r1, r3, r2);
            r2 = androidx.media.MediaBrowserServiceCompat.this;
            r2 = r2.mSession;
            if (r2 == 0) goto L_0x004c;
        L_0x0036:
            r2 = androidx.media.MediaBrowserServiceCompat.this;
            r2 = r2.mSession;
            r2 = r2.M();
            if (r2 != 0) goto L_0x0042;
        L_0x0040:
            r2 = r0;
            goto L_0x0046;
        L_0x0042:
            r2 = r2.asBinder();
        L_0x0046:
            r3 = "extra_session_binder";
            androidx.core.app.BundleCompat.putBinder(r1, r3, r2);
            goto L_0x0053;
        L_0x004c:
            r2 = r11.mRootExtrasList;
            r2.add(r1);
            goto L_0x0053;
        L_0x0052:
            r1 = r0;
        L_0x0053:
            r9 = androidx.media.MediaBrowserServiceCompat.this;
            r10 = new androidx.media.MediaBrowserServiceCompat$ConnectionRecord;
            r5 = -1;
            r8 = 0;
            r2 = r10;
            r3 = r9;
            r4 = r12;
            r6 = r13;
            r7 = r14;
            r2.<init>(r4, r5, r6, r7, r8);
            r9.mCurConnection = r10;
            r2 = androidx.media.MediaBrowserServiceCompat.this;
            r12 = r2.onGetRoot(r12, r13, r14);
            r13 = androidx.media.MediaBrowserServiceCompat.this;
            r13.mCurConnection = r0;
            if (r12 != 0) goto L_0x0070;
        L_0x006f:
            return r0;
        L_0x0070:
            if (r1 != 0) goto L_0x0077;
        L_0x0072:
            r1 = r12.getExtras();
            goto L_0x0084;
        L_0x0077:
            r13 = r12.getExtras();
            if (r13 == 0) goto L_0x0084;
        L_0x007d:
            r13 = r12.getExtras();
            r1.putAll(r13);
        L_0x0084:
            r13 = new androidx.media.MediaBrowserServiceCompatApi21$BrowserRoot;
            r12 = r12.getRootId();
            r13.<init>(r12, r1);
            return r13;
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi21.onGetRoot(java.lang.String, int, android.os.Bundle):androidx.media.MediaBrowserServiceCompatApi21$BrowserRoot");
        }

        public void onLoadChildren(String str, final ResultWrapper<List<Parcel>> resultWrapper) {
            MediaBrowserServiceCompat.this.onLoadChildren(str, new Result<List<MediaItem>>(str) {
                /* Access modifiers changed, original: 0000 */
                public void onResultSent(List<MediaItem> list) {
                    Object arrayList;
                    if (list != null) {
                        arrayList = new ArrayList();
                        for (MediaItem mediaItem : list) {
                            Parcel obtain = Parcel.obtain();
                            mediaItem.writeToParcel(obtain, 0);
                            arrayList.add(obtain);
                        }
                    } else {
                        arrayList = null;
                    }
                    resultWrapper.sendResult(arrayList);
                }

                public void detach() {
                    resultWrapper.detach();
                }
            });
        }

        /* Access modifiers changed, original: 0000 */
        public void notifyChildrenChangedForFramework(String str, Bundle bundle) {
            MediaBrowserServiceCompatApi21.notifyChildrenChanged(this.mServiceObj, str);
        }

        /* Access modifiers changed, original: 0000 */
        public void notifyChildrenChangedForCompat(final String str, final Bundle bundle) {
            MediaBrowserServiceCompat.this.mHandler.post(new Runnable() {
                public void run() {
                    for (IBinder iBinder : MediaBrowserServiceCompat.this.mConnections.keySet()) {
                        MediaBrowserServiceImplApi21.this.notifyChildrenChangedForCompatOnHandler((ConnectionRecord) MediaBrowserServiceCompat.this.mConnections.get(iBinder), str, bundle);
                    }
                }
            });
        }

        /* Access modifiers changed, original: 0000 */
        public void notifyChildrenChangedForCompat(final RemoteUserInfo remoteUserInfo, final String str, final Bundle bundle) {
            MediaBrowserServiceCompat.this.mHandler.post(new Runnable() {
                public void run() {
                    for (int i = 0; i < MediaBrowserServiceCompat.this.mConnections.size(); i++) {
                        ConnectionRecord connectionRecord = (ConnectionRecord) MediaBrowserServiceCompat.this.mConnections.valueAt(i);
                        if (connectionRecord.browserInfo.equals(remoteUserInfo)) {
                            MediaBrowserServiceImplApi21.this.notifyChildrenChangedForCompatOnHandler(connectionRecord, str, bundle);
                        }
                    }
                }
            });
        }

        /* Access modifiers changed, original: 0000 */
        public void notifyChildrenChangedForCompatOnHandler(ConnectionRecord connectionRecord, String str, Bundle bundle) {
            List<Pair> list = (List) connectionRecord.subscriptions.get(str);
            if (list != null) {
                for (Pair pair : list) {
                    if (MediaBrowserCompatUtils.hasDuplicatedItems(bundle, (Bundle) pair.second)) {
                        MediaBrowserServiceCompat.this.performLoadChildren(str, connectionRecord, (Bundle) pair.second, bundle);
                    }
                }
            }
        }

        public Bundle getBrowserRootHints() {
            Bundle bundle = null;
            if (this.mMessenger == null) {
                return null;
            }
            if (MediaBrowserServiceCompat.this.mCurConnection != null) {
                if (MediaBrowserServiceCompat.this.mCurConnection.rootHints != null) {
                    bundle = new Bundle(MediaBrowserServiceCompat.this.mCurConnection.rootHints);
                }
                return bundle;
            }
            throw new IllegalStateException("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
        }

        public RemoteUserInfo getCurrentBrowserInfo() {
            if (MediaBrowserServiceCompat.this.mCurConnection != null) {
                return MediaBrowserServiceCompat.this.mCurConnection.browserInfo;
            }
            throw new IllegalStateException("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
        }
    }

    class MediaBrowserServiceImplBase implements MediaBrowserServiceImpl {
        private Messenger mMessenger;

        MediaBrowserServiceImplBase() {
        }

        public void onCreate() {
            this.mMessenger = new Messenger(MediaBrowserServiceCompat.this.mHandler);
        }

        public IBinder onBind(Intent intent) {
            return MediaBrowserServiceCompat.SERVICE_INTERFACE.equals(intent.getAction()) ? this.mMessenger.getBinder() : null;
        }

        public void setSessionToken(final Token token) {
            MediaBrowserServiceCompat.this.mHandler.post(new Runnable() {
                public void run() {
                    Iterator it = MediaBrowserServiceCompat.this.mConnections.values().iterator();
                    while (it.hasNext()) {
                        ConnectionRecord connectionRecord = (ConnectionRecord) it.next();
                        try {
                            connectionRecord.callbacks.onConnect(connectionRecord.root.getRootId(), token, connectionRecord.root.getExtras());
                        } catch (RemoteException unused) {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("Connection for ");
                            stringBuilder.append(connectionRecord.pkg);
                            stringBuilder.append(" is no longer valid.");
                            Log.w(MediaBrowserServiceCompat.TAG, stringBuilder.toString());
                            it.remove();
                        }
                    }
                }
            });
        }

        public void notifyChildrenChanged(@NonNull final String str, final Bundle bundle) {
            MediaBrowserServiceCompat.this.mHandler.post(new Runnable() {
                public void run() {
                    for (IBinder iBinder : MediaBrowserServiceCompat.this.mConnections.keySet()) {
                        MediaBrowserServiceImplBase.this.notifyChildrenChangedOnHandler((ConnectionRecord) MediaBrowserServiceCompat.this.mConnections.get(iBinder), str, bundle);
                    }
                }
            });
        }

        public void notifyChildrenChanged(@NonNull final RemoteUserInfo remoteUserInfo, @NonNull final String str, final Bundle bundle) {
            MediaBrowserServiceCompat.this.mHandler.post(new Runnable() {
                public void run() {
                    for (int i = 0; i < MediaBrowserServiceCompat.this.mConnections.size(); i++) {
                        ConnectionRecord connectionRecord = (ConnectionRecord) MediaBrowserServiceCompat.this.mConnections.valueAt(i);
                        if (connectionRecord.browserInfo.equals(remoteUserInfo)) {
                            MediaBrowserServiceImplBase.this.notifyChildrenChangedOnHandler(connectionRecord, str, bundle);
                            return;
                        }
                    }
                }
            });
        }

        /* Access modifiers changed, original: 0000 */
        public void notifyChildrenChangedOnHandler(ConnectionRecord connectionRecord, String str, Bundle bundle) {
            List<Pair> list = (List) connectionRecord.subscriptions.get(str);
            if (list != null) {
                for (Pair pair : list) {
                    if (MediaBrowserCompatUtils.hasDuplicatedItems(bundle, (Bundle) pair.second)) {
                        MediaBrowserServiceCompat.this.performLoadChildren(str, connectionRecord, (Bundle) pair.second, bundle);
                    }
                }
            }
        }

        public Bundle getBrowserRootHints() {
            if (MediaBrowserServiceCompat.this.mCurConnection != null) {
                return MediaBrowserServiceCompat.this.mCurConnection.rootHints == null ? null : new Bundle(MediaBrowserServiceCompat.this.mCurConnection.rootHints);
            } else {
                throw new IllegalStateException("This should be called inside of onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
            }
        }

        public RemoteUserInfo getCurrentBrowserInfo() {
            if (MediaBrowserServiceCompat.this.mCurConnection != null) {
                return MediaBrowserServiceCompat.this.mCurConnection.browserInfo;
            }
            throw new IllegalStateException("This should be called inside of onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
        }
    }

    private static class ServiceCallbacksCompat implements ServiceCallbacks {
        final Messenger mCallbacks;

        ServiceCallbacksCompat(Messenger messenger) {
            this.mCallbacks = messenger;
        }

        public IBinder asBinder() {
            return this.mCallbacks.getBinder();
        }

        public void onConnect(String str, Token token, Bundle bundle) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putInt(MediaBrowserProtocol.EXTRA_SERVICE_VERSION, 2);
            Bundle bundle2 = new Bundle();
            bundle2.putString(MediaBrowserProtocol.DATA_MEDIA_ITEM_ID, str);
            bundle2.putParcelable(MediaBrowserProtocol.DATA_MEDIA_SESSION_TOKEN, token);
            bundle2.putBundle(MediaBrowserProtocol.DATA_ROOT_HINTS, bundle);
            sendRequest(1, bundle2);
        }

        public void onConnectFailed() {
            sendRequest(2, null);
        }

        public void onLoadChildren(String str, List<MediaItem> list, Bundle bundle, Bundle bundle2) {
            Bundle bundle3 = new Bundle();
            bundle3.putString(MediaBrowserProtocol.DATA_MEDIA_ITEM_ID, str);
            bundle3.putBundle(MediaBrowserProtocol.DATA_OPTIONS, bundle);
            bundle3.putBundle(MediaBrowserProtocol.DATA_NOTIFY_CHILDREN_CHANGED_OPTIONS, bundle2);
            if (list != null) {
                bundle3.putParcelableArrayList(MediaBrowserProtocol.DATA_MEDIA_ITEM_LIST, list instanceof ArrayList ? (ArrayList) list : new ArrayList(list));
            }
            sendRequest(3, bundle3);
        }

        private void sendRequest(int i, Bundle bundle) {
            Message obtain = Message.obtain();
            obtain.what = i;
            obtain.arg1 = 2;
            obtain.setData(bundle);
            this.mCallbacks.send(obtain);
        }
    }

    @RequiresApi(23)
    class MediaBrowserServiceImplApi23 extends MediaBrowserServiceImplApi21 implements MediaBrowserServiceCompatApi23.ServiceCompatProxy {
        MediaBrowserServiceImplApi23() {
            super();
        }

        public void onCreate() {
            this.mServiceObj = MediaBrowserServiceCompatApi23.createService(MediaBrowserServiceCompat.this, this);
            MediaBrowserServiceCompatApi21.onCreate(this.mServiceObj);
        }

        public void onLoadItem(String str, final ResultWrapper<Parcel> resultWrapper) {
            MediaBrowserServiceCompat.this.onLoadItem(str, new Result<MediaItem>(str) {
                /* Access modifiers changed, original: 0000 */
                public void onResultSent(MediaItem mediaItem) {
                    if (mediaItem == null) {
                        resultWrapper.sendResult(null);
                        return;
                    }
                    Parcel obtain = Parcel.obtain();
                    mediaItem.writeToParcel(obtain, 0);
                    resultWrapper.sendResult(obtain);
                }

                public void detach() {
                    resultWrapper.detach();
                }
            });
        }
    }

    @RequiresApi(26)
    class MediaBrowserServiceImplApi26 extends MediaBrowserServiceImplApi23 implements MediaBrowserServiceCompatApi26.ServiceCompatProxy {
        MediaBrowserServiceImplApi26() {
            super();
        }

        public void onCreate() {
            this.mServiceObj = MediaBrowserServiceCompatApi26.createService(MediaBrowserServiceCompat.this, this);
            MediaBrowserServiceCompatApi21.onCreate(this.mServiceObj);
        }

        public void onLoadChildren(String str, final ResultWrapper resultWrapper, Bundle bundle) {
            MediaBrowserServiceCompat.this.onLoadChildren(str, new Result<List<MediaItem>>(str) {
                /* Access modifiers changed, original: 0000 */
                public void onResultSent(List<MediaItem> list) {
                    List arrayList;
                    if (list != null) {
                        arrayList = new ArrayList();
                        for (MediaItem mediaItem : list) {
                            Parcel obtain = Parcel.obtain();
                            mediaItem.writeToParcel(obtain, 0);
                            arrayList.add(obtain);
                        }
                    } else {
                        arrayList = null;
                    }
                    resultWrapper.sendResult(arrayList, getFlags());
                }

                public void detach() {
                    resultWrapper.detach();
                }
            }, bundle);
        }

        public Bundle getBrowserRootHints() {
            if (MediaBrowserServiceCompat.this.mCurConnection == null) {
                return MediaBrowserServiceCompatApi26.getBrowserRootHints(this.mServiceObj);
            }
            return MediaBrowserServiceCompat.this.mCurConnection.rootHints == null ? null : new Bundle(MediaBrowserServiceCompat.this.mCurConnection.rootHints);
        }

        /* Access modifiers changed, original: 0000 */
        public void notifyChildrenChangedForFramework(String str, Bundle bundle) {
            if (bundle != null) {
                MediaBrowserServiceCompatApi26.notifyChildrenChanged(this.mServiceObj, str, bundle);
            } else {
                super.notifyChildrenChangedForFramework(str, bundle);
            }
        }
    }

    @RequiresApi(28)
    class MediaBrowserServiceImplApi28 extends MediaBrowserServiceImplApi26 {
        MediaBrowserServiceImplApi28() {
            super();
        }

        public RemoteUserInfo getCurrentBrowserInfo() {
            if (MediaBrowserServiceCompat.this.mCurConnection != null) {
                return MediaBrowserServiceCompat.this.mCurConnection.browserInfo;
            }
            return new RemoteUserInfo(((MediaBrowserService) this.mServiceObj).getCurrentBrowserInfo());
        }
    }

    public void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    @Nullable
    public abstract BrowserRoot onGetRoot(@NonNull String str, int i, @Nullable Bundle bundle);

    public abstract void onLoadChildren(@NonNull String str, @NonNull Result<List<MediaItem>> result);

    @RestrictTo({Scope.LIBRARY_GROUP})
    public void onSubscribe(String str, Bundle bundle) {
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public void onUnsubscribe(String str) {
    }

    @RestrictTo({Scope.LIBRARY})
    public void attachToBaseContext(Context context) {
        attachBaseContext(context);
    }

    public void onCreate() {
        super.onCreate();
        if (VERSION.SDK_INT >= 28) {
            this.mImpl = new MediaBrowserServiceImplApi28();
        } else if (VERSION.SDK_INT >= 26) {
            this.mImpl = new MediaBrowserServiceImplApi26();
        } else if (VERSION.SDK_INT >= 23) {
            this.mImpl = new MediaBrowserServiceImplApi23();
        } else if (VERSION.SDK_INT >= 21) {
            this.mImpl = new MediaBrowserServiceImplApi21();
        } else {
            this.mImpl = new MediaBrowserServiceImplBase();
        }
        this.mImpl.onCreate();
    }

    public IBinder onBind(Intent intent) {
        return this.mImpl.onBind(intent);
    }

    public void onLoadChildren(@NonNull String str, @NonNull Result<List<MediaItem>> result, @NonNull Bundle bundle) {
        result.setFlags(1);
        onLoadChildren(str, result);
    }

    public void onLoadItem(String str, @NonNull Result<MediaItem> result) {
        result.setFlags(2);
        result.sendResult(null);
    }

    public void onSearch(@NonNull String str, Bundle bundle, @NonNull Result<List<MediaItem>> result) {
        result.setFlags(4);
        result.sendResult(null);
    }

    public void onCustomAction(@NonNull String str, Bundle bundle, @NonNull Result<Bundle> result) {
        result.sendError(null);
    }

    public void setSessionToken(Token token) {
        if (token == null) {
            throw new IllegalArgumentException("Session token may not be null.");
        } else if (this.mSession == null) {
            this.mSession = token;
            this.mImpl.setSessionToken(token);
        } else {
            throw new IllegalStateException("The session token has already been set.");
        }
    }

    @Nullable
    public Token getSessionToken() {
        return this.mSession;
    }

    public final Bundle getBrowserRootHints() {
        return this.mImpl.getBrowserRootHints();
    }

    @NonNull
    public final RemoteUserInfo getCurrentBrowserInfo() {
        return this.mImpl.getCurrentBrowserInfo();
    }

    public void notifyChildrenChanged(@NonNull String str) {
        if (str != null) {
            this.mImpl.notifyChildrenChanged(str, null);
            return;
        }
        throw new IllegalArgumentException("parentId cannot be null in notifyChildrenChanged");
    }

    public void notifyChildrenChanged(@NonNull String str, @NonNull Bundle bundle) {
        if (str == null) {
            throw new IllegalArgumentException("parentId cannot be null in notifyChildrenChanged");
        } else if (bundle != null) {
            this.mImpl.notifyChildrenChanged(str, bundle);
        } else {
            throw new IllegalArgumentException("options cannot be null in notifyChildrenChanged");
        }
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public void notifyChildrenChanged(@NonNull RemoteUserInfo remoteUserInfo, @NonNull String str, @NonNull Bundle bundle) {
        if (remoteUserInfo == null) {
            throw new IllegalArgumentException("remoteUserInfo cannot be null in notifyChildrenChanged");
        } else if (str == null) {
            throw new IllegalArgumentException("parentId cannot be null in notifyChildrenChanged");
        } else if (bundle != null) {
            this.mImpl.notifyChildrenChanged(remoteUserInfo, str, bundle);
        } else {
            throw new IllegalArgumentException("options cannot be null in notifyChildrenChanged");
        }
    }

    /* Access modifiers changed, original: 0000 */
    public boolean isValidPackage(String str, int i) {
        if (str == null) {
            return false;
        }
        for (String equals : getPackageManager().getPackagesForUid(i)) {
            if (equals.equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* Access modifiers changed, original: 0000 */
    public void addSubscription(String str, ConnectionRecord connectionRecord, IBinder iBinder, Bundle bundle) {
        List list = (List) connectionRecord.subscriptions.get(str);
        if (list == null) {
            list = new ArrayList();
        }
        for (Pair pair : list) {
            if (iBinder == pair.first && MediaBrowserCompatUtils.areSameOptions(bundle, (Bundle) pair.second)) {
                return;
            }
        }
        list.add(new Pair(iBinder, bundle));
        connectionRecord.subscriptions.put(str, list);
        performLoadChildren(str, connectionRecord, bundle, null);
        this.mCurConnection = connectionRecord;
        onSubscribe(str, bundle);
        this.mCurConnection = null;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean removeSubscription(String str, ConnectionRecord connectionRecord, IBinder iBinder) {
        boolean z = true;
        boolean z2 = false;
        if (iBinder == null) {
            try {
                if (connectionRecord.subscriptions.remove(str) == null) {
                    z = false;
                }
                this.mCurConnection = connectionRecord;
                onUnsubscribe(str);
                this.mCurConnection = null;
                return z;
            } catch (Throwable th) {
                this.mCurConnection = connectionRecord;
                onUnsubscribe(str);
                this.mCurConnection = null;
            }
        } else {
            List list = (List) connectionRecord.subscriptions.get(str);
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (iBinder == ((Pair) it.next()).first) {
                        it.remove();
                        z2 = true;
                    }
                }
                if (list.size() == 0) {
                    connectionRecord.subscriptions.remove(str);
                }
            }
            this.mCurConnection = connectionRecord;
            onUnsubscribe(str);
            this.mCurConnection = null;
            return z2;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void performLoadChildren(String str, ConnectionRecord connectionRecord, Bundle bundle, Bundle bundle2) {
        final ConnectionRecord connectionRecord2 = connectionRecord;
        final String str2 = str;
        final Bundle bundle3 = bundle;
        final Bundle bundle4 = bundle2;
        AnonymousClass1 anonymousClass1 = new Result<List<MediaItem>>(str) {
            /* Access modifiers changed, original: 0000 */
            public void onResultSent(List<MediaItem> list) {
                ConnectionRecord connectionRecord = MediaBrowserServiceCompat.this.mConnections.get(connectionRecord2.callbacks.asBinder());
                ConnectionRecord connectionRecord2 = connectionRecord2;
                String str = MediaBrowserServiceCompat.TAG;
                StringBuilder stringBuilder;
                if (connectionRecord != connectionRecord2) {
                    if (MediaBrowserServiceCompat.DEBUG) {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("Not sending onLoadChildren result for connection that has been disconnected. pkg=");
                        stringBuilder.append(connectionRecord2.pkg);
                        stringBuilder.append(" id=");
                        stringBuilder.append(str2);
                        Log.d(str, stringBuilder.toString());
                    }
                    return;
                }
                List list2;
                if ((getFlags() & 1) != 0) {
                    list2 = MediaBrowserServiceCompat.this.applyOptions(list2, bundle3);
                }
                try {
                    connectionRecord2.callbacks.onLoadChildren(str2, list2, bundle3, bundle4);
                } catch (RemoteException unused) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Calling onLoadChildren() failed for id=");
                    stringBuilder.append(str2);
                    stringBuilder.append(" package=");
                    stringBuilder.append(connectionRecord2.pkg);
                    Log.w(str, stringBuilder.toString());
                }
            }
        };
        this.mCurConnection = connectionRecord;
        if (bundle == null) {
            onLoadChildren(str, anonymousClass1);
        } else {
            onLoadChildren(str, anonymousClass1, bundle);
        }
        this.mCurConnection = null;
        if (!anonymousClass1.isDone()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("onLoadChildren must call detach() or sendResult() before returning for package=");
            stringBuilder.append(connectionRecord.pkg);
            stringBuilder.append(" id=");
            stringBuilder.append(str);
            throw new IllegalStateException(stringBuilder.toString());
        }
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

    /* Access modifiers changed, original: 0000 */
    public void performLoadItem(String str, ConnectionRecord connectionRecord, final ResultReceiver resultReceiver) {
        AnonymousClass2 anonymousClass2 = new Result<MediaItem>(str) {
            /* Access modifiers changed, original: 0000 */
            public void onResultSent(MediaItem mediaItem) {
                if ((getFlags() & 2) != 0) {
                    resultReceiver.send(-1, null);
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putParcelable(MediaBrowserServiceCompat.KEY_MEDIA_ITEM, mediaItem);
                resultReceiver.send(0, bundle);
            }
        };
        this.mCurConnection = connectionRecord;
        onLoadItem(str, anonymousClass2);
        this.mCurConnection = null;
        if (!anonymousClass2.isDone()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("onLoadItem must call detach() or sendResult() before returning for id=");
            stringBuilder.append(str);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void performSearch(String str, Bundle bundle, ConnectionRecord connectionRecord, final ResultReceiver resultReceiver) {
        AnonymousClass3 anonymousClass3 = new Result<List<MediaItem>>(str) {
            /* Access modifiers changed, original: 0000 */
            public void onResultSent(List<MediaItem> list) {
                if ((getFlags() & 4) != 0 || list == null) {
                    resultReceiver.send(-1, null);
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putParcelableArray(MediaBrowserServiceCompat.KEY_SEARCH_RESULTS, (Parcelable[]) list.toArray(new MediaItem[0]));
                resultReceiver.send(0, bundle);
            }
        };
        this.mCurConnection = connectionRecord;
        onSearch(str, bundle, anonymousClass3);
        this.mCurConnection = null;
        if (!anonymousClass3.isDone()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("onSearch must call detach() or sendResult() before returning for query=");
            stringBuilder.append(str);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void performCustomAction(String str, Bundle bundle, ConnectionRecord connectionRecord, final ResultReceiver resultReceiver) {
        AnonymousClass4 anonymousClass4 = new Result<Bundle>(str) {
            /* Access modifiers changed, original: 0000 */
            public void onResultSent(Bundle bundle) {
                resultReceiver.send(0, bundle);
            }

            /* Access modifiers changed, original: 0000 */
            public void onProgressUpdateSent(Bundle bundle) {
                resultReceiver.send(1, bundle);
            }

            /* Access modifiers changed, original: 0000 */
            public void onErrorSent(Bundle bundle) {
                resultReceiver.send(-1, bundle);
            }
        };
        this.mCurConnection = connectionRecord;
        onCustomAction(str, bundle, anonymousClass4);
        this.mCurConnection = null;
        if (!anonymousClass4.isDone()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("onCustomAction must call detach() or sendResult() or sendError() before returning for action=");
            stringBuilder.append(str);
            stringBuilder.append(" extras=");
            stringBuilder.append(bundle);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
