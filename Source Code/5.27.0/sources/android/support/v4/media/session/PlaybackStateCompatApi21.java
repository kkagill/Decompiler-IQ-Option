package android.support.v4.media.session;

import android.media.session.PlaybackState;
import android.os.Bundle;
import androidx.annotation.RequiresApi;
import java.util.List;

@RequiresApi(21)
class PlaybackStateCompatApi21 {

    static final class CustomAction {
        public static String L(Object obj) {
            return ((android.media.session.PlaybackState.CustomAction) obj).getAction();
        }

        public static CharSequence M(Object obj) {
            return ((android.media.session.PlaybackState.CustomAction) obj).getName();
        }

        public static int N(Object obj) {
            return ((android.media.session.PlaybackState.CustomAction) obj).getIcon();
        }

        public static Bundle e(Object obj) {
            return ((android.media.session.PlaybackState.CustomAction) obj).getExtras();
        }
    }

    public static int C(Object obj) {
        return ((PlaybackState) obj).getState();
    }

    public static long D(Object obj) {
        return ((PlaybackState) obj).getPosition();
    }

    public static long E(Object obj) {
        return ((PlaybackState) obj).getBufferedPosition();
    }

    public static float F(Object obj) {
        return ((PlaybackState) obj).getPlaybackSpeed();
    }

    public static long G(Object obj) {
        return ((PlaybackState) obj).getActions();
    }

    public static CharSequence H(Object obj) {
        return ((PlaybackState) obj).getErrorMessage();
    }

    public static long I(Object obj) {
        return ((PlaybackState) obj).getLastPositionUpdateTime();
    }

    public static List<Object> J(Object obj) {
        return ((PlaybackState) obj).getCustomActions();
    }

    public static long K(Object obj) {
        return ((PlaybackState) obj).getActiveQueueItemId();
    }
}
