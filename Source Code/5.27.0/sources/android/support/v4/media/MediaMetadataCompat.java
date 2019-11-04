package android.support.v4.media;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.collection.ArrayMap;

public final class MediaMetadataCompat implements Parcelable {
    public static final Creator<MediaMetadataCompat> CREATOR = new Creator<MediaMetadataCompat>() {
        /* renamed from: e */
        public MediaMetadataCompat createFromParcel(Parcel parcel) {
            return new MediaMetadataCompat(parcel);
        }

        /* renamed from: g */
        public MediaMetadataCompat[] newArray(int i) {
            return new MediaMetadataCompat[i];
        }
    };
    static final ArrayMap<String, Integer> aw = new ArrayMap();
    private static final String[] ax = new String[]{"android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER"};
    private static final String[] ay;
    private static final String[] az;
    private Object aA;
    final Bundle mBundle;

    public int describeContents() {
        return 0;
    }

    static {
        ArrayMap arrayMap = aw;
        Integer valueOf = Integer.valueOf(1);
        arrayMap.put("android.media.metadata.TITLE", valueOf);
        aw.put("android.media.metadata.ARTIST", valueOf);
        arrayMap = aw;
        Integer valueOf2 = Integer.valueOf(0);
        arrayMap.put("android.media.metadata.DURATION", valueOf2);
        aw.put("android.media.metadata.ALBUM", valueOf);
        aw.put("android.media.metadata.AUTHOR", valueOf);
        aw.put("android.media.metadata.WRITER", valueOf);
        aw.put("android.media.metadata.COMPOSER", valueOf);
        aw.put("android.media.metadata.COMPILATION", valueOf);
        aw.put("android.media.metadata.DATE", valueOf);
        aw.put("android.media.metadata.YEAR", valueOf2);
        aw.put("android.media.metadata.GENRE", valueOf);
        aw.put("android.media.metadata.TRACK_NUMBER", valueOf2);
        aw.put("android.media.metadata.NUM_TRACKS", valueOf2);
        aw.put("android.media.metadata.DISC_NUMBER", valueOf2);
        aw.put("android.media.metadata.ALBUM_ARTIST", valueOf);
        arrayMap = aw;
        Integer valueOf3 = Integer.valueOf(2);
        String str = "android.media.metadata.ART";
        arrayMap.put(str, valueOf3);
        String str2 = "android.media.metadata.ART_URI";
        aw.put(str2, valueOf);
        String str3 = "android.media.metadata.ALBUM_ART";
        aw.put(str3, valueOf3);
        String str4 = "android.media.metadata.ALBUM_ART_URI";
        aw.put(str4, valueOf);
        arrayMap = aw;
        Integer valueOf4 = Integer.valueOf(3);
        arrayMap.put("android.media.metadata.USER_RATING", valueOf4);
        aw.put("android.media.metadata.RATING", valueOf4);
        aw.put("android.media.metadata.DISPLAY_TITLE", valueOf);
        aw.put("android.media.metadata.DISPLAY_SUBTITLE", valueOf);
        aw.put("android.media.metadata.DISPLAY_DESCRIPTION", valueOf);
        String str5 = "android.media.metadata.DISPLAY_ICON";
        aw.put(str5, valueOf3);
        String str6 = "android.media.metadata.DISPLAY_ICON_URI";
        aw.put(str6, valueOf);
        aw.put("android.media.metadata.MEDIA_ID", valueOf);
        aw.put("android.media.metadata.BT_FOLDER_TYPE", valueOf2);
        aw.put("android.media.metadata.MEDIA_URI", valueOf);
        aw.put("android.media.metadata.ADVERTISEMENT", valueOf2);
        aw.put("android.media.metadata.DOWNLOAD_STATUS", valueOf2);
        ay = new String[]{str5, str, str3};
        az = new String[]{str6, str2, str4};
    }

    MediaMetadataCompat(Parcel parcel) {
        this.mBundle = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.mBundle);
    }

    public static MediaMetadataCompat r(Object obj) {
        if (obj == null || VERSION.SDK_INT < 21) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        MediaMetadataCompatApi21.a(obj, obtain, 0);
        obtain.setDataPosition(0);
        MediaMetadataCompat mediaMetadataCompat = (MediaMetadataCompat) CREATOR.createFromParcel(obtain);
        obtain.recycle();
        mediaMetadataCompat.aA = obj;
        return mediaMetadataCompat;
    }
}
