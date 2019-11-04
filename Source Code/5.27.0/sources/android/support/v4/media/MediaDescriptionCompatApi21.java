package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import androidx.annotation.RequiresApi;

@RequiresApi(21)
class MediaDescriptionCompatApi21 {

    static class Builder {
        public static Object newInstance() {
            return new android.media.MediaDescription.Builder();
        }

        public static void a(Object obj, String str) {
            ((android.media.MediaDescription.Builder) obj).setMediaId(str);
        }

        public static void a(Object obj, CharSequence charSequence) {
            ((android.media.MediaDescription.Builder) obj).setTitle(charSequence);
        }

        public static void b(Object obj, CharSequence charSequence) {
            ((android.media.MediaDescription.Builder) obj).setSubtitle(charSequence);
        }

        public static void c(Object obj, CharSequence charSequence) {
            ((android.media.MediaDescription.Builder) obj).setDescription(charSequence);
        }

        public static void a(Object obj, Bitmap bitmap) {
            ((android.media.MediaDescription.Builder) obj).setIconBitmap(bitmap);
        }

        public static void a(Object obj, Uri uri) {
            ((android.media.MediaDescription.Builder) obj).setIconUri(uri);
        }

        public static void a(Object obj, Bundle bundle) {
            ((android.media.MediaDescription.Builder) obj).setExtras(bundle);
        }

        public static Object p(Object obj) {
            return ((android.media.MediaDescription.Builder) obj).build();
        }
    }

    public static String j(Object obj) {
        return ((MediaDescription) obj).getMediaId();
    }

    public static CharSequence k(Object obj) {
        return ((MediaDescription) obj).getTitle();
    }

    public static CharSequence l(Object obj) {
        return ((MediaDescription) obj).getSubtitle();
    }

    public static CharSequence m(Object obj) {
        return ((MediaDescription) obj).getDescription();
    }

    public static Bitmap n(Object obj) {
        return ((MediaDescription) obj).getIconBitmap();
    }

    public static Uri o(Object obj) {
        return ((MediaDescription) obj).getIconUri();
    }

    public static Bundle e(Object obj) {
        return ((MediaDescription) obj).getExtras();
    }

    public static void a(Object obj, Parcel parcel, int i) {
        ((MediaDescription) obj).writeToParcel(parcel, i);
    }

    public static Object d(Parcel parcel) {
        return MediaDescription.CREATOR.createFromParcel(parcel);
    }
}
