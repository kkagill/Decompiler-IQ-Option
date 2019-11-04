package android.support.v4.media;

import android.media.MediaMetadata;
import android.os.Parcel;
import androidx.annotation.RequiresApi;

@RequiresApi(21)
class MediaMetadataCompatApi21 {
    public static void a(Object obj, Parcel parcel, int i) {
        ((MediaMetadata) obj).writeToParcel(parcel, i);
    }
}
