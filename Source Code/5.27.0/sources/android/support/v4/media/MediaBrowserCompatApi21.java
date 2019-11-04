package android.support.v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.util.List;

@RequiresApi(21)
class MediaBrowserCompatApi21 {

    interface ConnectionCallback {
        void onConnected();

        void onConnectionFailed();

        void onConnectionSuspended();
    }

    static class ConnectionCallbackProxy<T extends ConnectionCallback> extends android.media.browse.MediaBrowser.ConnectionCallback {
        protected final T ap;

        public ConnectionCallbackProxy(T t) {
            this.ap = t;
        }

        public void onConnected() {
            this.ap.onConnected();
        }

        public void onConnectionSuspended() {
            this.ap.onConnectionSuspended();
        }

        public void onConnectionFailed() {
            this.ap.onConnectionFailed();
        }
    }

    static class MediaItem {
        public static int g(Object obj) {
            return ((android.media.browse.MediaBrowser.MediaItem) obj).getFlags();
        }

        public static Object h(Object obj) {
            return ((android.media.browse.MediaBrowser.MediaItem) obj).getDescription();
        }
    }

    interface SubscriptionCallback {
        void onChildrenLoaded(@NonNull String str, List<?> list);

        void onError(@NonNull String str);
    }

    static class SubscriptionCallbackProxy<T extends SubscriptionCallback> extends android.media.browse.MediaBrowser.SubscriptionCallback {
        protected final T aq;

        public SubscriptionCallbackProxy(T t) {
            this.aq = t;
        }

        public void onChildrenLoaded(@NonNull String str, List<android.media.browse.MediaBrowser.MediaItem> list) {
            this.aq.onChildrenLoaded(str, list);
        }

        public void onError(@NonNull String str) {
            this.aq.onError(str);
        }
    }

    public static Object a(ConnectionCallback connectionCallback) {
        return new ConnectionCallbackProxy(connectionCallback);
    }

    public static Object a(Context context, ComponentName componentName, Object obj, Bundle bundle) {
        return new MediaBrowser(context, componentName, (android.media.browse.MediaBrowser.ConnectionCallback) obj, bundle);
    }

    public static void c(Object obj) {
        ((MediaBrowser) obj).connect();
    }

    public static void d(Object obj) {
        ((MediaBrowser) obj).disconnect();
    }

    public static Bundle e(Object obj) {
        return ((MediaBrowser) obj).getExtras();
    }

    public static Object f(Object obj) {
        return ((MediaBrowser) obj).getSessionToken();
    }

    public static Object a(SubscriptionCallback subscriptionCallback) {
        return new SubscriptionCallbackProxy(subscriptionCallback);
    }
}
