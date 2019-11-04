package android.support.v4.media.session;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession.QueueItem;
import android.media.session.MediaSession.Token;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.view.KeyEvent;
import androidx.annotation.RequiresApi;
import java.util.List;

@RequiresApi(21)
class MediaControllerCompatApi21 {

    public interface Callback {
        void a(int i, int i2, int i3, int i4, int i5);

        void onExtrasChanged(Bundle bundle);

        void onQueueChanged(List<?> list);

        void onQueueTitleChanged(CharSequence charSequence);

        void onSessionDestroyed();

        void onSessionEvent(String str, Bundle bundle);

        void s(Object obj);

        void t(Object obj);
    }

    static class CallbackProxy<T extends Callback> extends android.media.session.MediaController.Callback {
        protected final T aU;

        public CallbackProxy(T t) {
            this.aU = t;
        }

        public void onSessionDestroyed() {
            this.aU.onSessionDestroyed();
        }

        public void onSessionEvent(String str, Bundle bundle) {
            MediaSessionCompat.d(bundle);
            this.aU.onSessionEvent(str, bundle);
        }

        public void onPlaybackStateChanged(PlaybackState playbackState) {
            this.aU.s(playbackState);
        }

        public void onMetadataChanged(MediaMetadata mediaMetadata) {
            this.aU.t(mediaMetadata);
        }

        public void onQueueChanged(List<QueueItem> list) {
            this.aU.onQueueChanged(list);
        }

        public void onQueueTitleChanged(CharSequence charSequence) {
            this.aU.onQueueTitleChanged(charSequence);
        }

        public void onExtrasChanged(Bundle bundle) {
            MediaSessionCompat.d(bundle);
            this.aU.onExtrasChanged(bundle);
        }

        public void onAudioInfoChanged(android.media.session.MediaController.PlaybackInfo playbackInfo) {
            this.aU.a(playbackInfo.getPlaybackType(), PlaybackInfo.v(playbackInfo), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume());
        }
    }

    public static class PlaybackInfo {
        public static AudioAttributes u(Object obj) {
            return ((android.media.session.MediaController.PlaybackInfo) obj).getAudioAttributes();
        }

        public static int v(Object obj) {
            return a(u(obj));
        }

        private static int a(AudioAttributes audioAttributes) {
            if ((audioAttributes.getFlags() & 1) == 1) {
                return 7;
            }
            if ((audioAttributes.getFlags() & 4) == 4) {
                return 6;
            }
            switch (audioAttributes.getUsage()) {
                case 1:
                case 11:
                case 12:
                case 14:
                    return 3;
                case 2:
                    return 0;
                case 3:
                    return 8;
                case 4:
                    return 4;
                case 5:
                case 7:
                case 8:
                case 9:
                case 10:
                    return 5;
                case 6:
                    return 2;
                case 13:
                    return 1;
                default:
                    return 3;
            }
        }
    }

    public static Object a(Context context, Object obj) {
        return new MediaController(context, (Token) obj);
    }

    public static Object a(Callback callback) {
        return new CallbackProxy(callback);
    }

    public static boolean a(Object obj, KeyEvent keyEvent) {
        return ((MediaController) obj).dispatchMediaButtonEvent(keyEvent);
    }

    public static void a(Object obj, String str, Bundle bundle, ResultReceiver resultReceiver) {
        ((MediaController) obj).sendCommand(str, bundle, resultReceiver);
    }
}
