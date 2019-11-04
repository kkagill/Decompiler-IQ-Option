package android.support.v4.media.session;

import android.media.session.MediaSession.Token;
import androidx.annotation.RequiresApi;

@RequiresApi(21)
class MediaSessionCompatApi21 {

    static class QueueItem {
        public static Object h(Object obj) {
            return ((android.media.session.MediaSession.QueueItem) obj).getDescription();
        }

        public static long z(Object obj) {
            return ((android.media.session.MediaSession.QueueItem) obj).getQueueId();
        }
    }

    public static Object y(Object obj) {
        if (obj instanceof Token) {
            return obj;
        }
        throw new IllegalArgumentException("token is not a valid MediaSession.Token object");
    }
}
