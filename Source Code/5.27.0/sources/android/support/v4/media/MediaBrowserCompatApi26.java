package android.support.v4.media;

import android.media.browse.MediaBrowser.MediaItem;
import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.util.List;

@RequiresApi(26)
class MediaBrowserCompatApi26 {

    interface SubscriptionCallback extends SubscriptionCallback {
        void onChildrenLoaded(@NonNull String str, List<?> list, @NonNull Bundle bundle);

        void onError(@NonNull String str, @NonNull Bundle bundle);
    }

    static class SubscriptionCallbackProxy<T extends SubscriptionCallback> extends SubscriptionCallbackProxy<T> {
        SubscriptionCallbackProxy(T t) {
            super(t);
        }

        public void onChildrenLoaded(@NonNull String str, List<MediaItem> list, @NonNull Bundle bundle) {
            MediaSessionCompat.d(bundle);
            ((SubscriptionCallback) this.aq).onChildrenLoaded(str, list, bundle);
        }

        public void onError(@NonNull String str, @NonNull Bundle bundle) {
            MediaSessionCompat.d(bundle);
            ((SubscriptionCallback) this.aq).onError(str, bundle);
        }
    }

    static Object a(SubscriptionCallback subscriptionCallback) {
        return new SubscriptionCallbackProxy(subscriptionCallback);
    }
}
