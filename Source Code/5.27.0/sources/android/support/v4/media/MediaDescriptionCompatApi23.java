package android.support.v4.media;

import android.media.MediaDescription;
import android.net.Uri;
import androidx.annotation.RequiresApi;

@RequiresApi(23)
class MediaDescriptionCompatApi23 {

    static class Builder {
        public static void b(Object obj, Uri uri) {
            ((android.media.MediaDescription.Builder) obj).setMediaUri(uri);
        }
    }

    public static Uri q(Object obj) {
        return ((MediaDescription) obj).getMediaUri();
    }
}
