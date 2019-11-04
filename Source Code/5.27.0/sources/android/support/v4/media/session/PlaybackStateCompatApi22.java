package android.support.v4.media.session;

import android.media.session.PlaybackState;
import android.os.Bundle;
import androidx.annotation.RequiresApi;

@RequiresApi(22)
class PlaybackStateCompatApi22 {
    public static Bundle e(Object obj) {
        return ((PlaybackState) obj).getExtras();
    }
}
