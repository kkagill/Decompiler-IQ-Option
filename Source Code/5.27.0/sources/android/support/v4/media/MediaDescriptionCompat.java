package android.support.v4.media;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import androidx.annotation.Nullable;

public final class MediaDescriptionCompat implements Parcelable {
    public static final Creator<MediaDescriptionCompat> CREATOR = new Creator<MediaDescriptionCompat>() {
        /* renamed from: c */
        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            if (VERSION.SDK_INT < 21) {
                return new MediaDescriptionCompat(parcel);
            }
            return MediaDescriptionCompat.i(MediaDescriptionCompatApi21.d(parcel));
        }

        /* renamed from: f */
        public MediaDescriptionCompat[] newArray(int i) {
            return new MediaDescriptionCompat[i];
        }
    };
    private final String N;
    private final CharSequence ar;
    private final Bitmap as;
    private final Uri at;
    private final Uri au;
    private Object av;
    private final Bundle mExtras;
    private final CharSequence mSubtitle;
    private final CharSequence mTitle;

    public static final class Builder {
        private String N;
        private CharSequence ar;
        private Bitmap as;
        private Uri at;
        private Uri au;
        private Bundle mExtras;
        private CharSequence mSubtitle;
        private CharSequence mTitle;

        public Builder g(@Nullable String str) {
            this.N = str;
            return this;
        }

        public Builder b(@Nullable CharSequence charSequence) {
            this.mTitle = charSequence;
            return this;
        }

        public Builder c(@Nullable CharSequence charSequence) {
            this.mSubtitle = charSequence;
            return this;
        }

        public Builder d(@Nullable CharSequence charSequence) {
            this.ar = charSequence;
            return this;
        }

        public Builder a(@Nullable Bitmap bitmap) {
            this.as = bitmap;
            return this;
        }

        public Builder a(@Nullable Uri uri) {
            this.at = uri;
            return this;
        }

        public Builder c(@Nullable Bundle bundle) {
            this.mExtras = bundle;
            return this;
        }

        public Builder b(@Nullable Uri uri) {
            this.au = uri;
            return this;
        }

        public MediaDescriptionCompat w() {
            return new MediaDescriptionCompat(this.N, this.mTitle, this.mSubtitle, this.ar, this.as, this.at, this.mExtras, this.au);
        }
    }

    public int describeContents() {
        return 0;
    }

    MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.N = str;
        this.mTitle = charSequence;
        this.mSubtitle = charSequence2;
        this.ar = charSequence3;
        this.as = bitmap;
        this.at = uri;
        this.mExtras = bundle;
        this.au = uri2;
    }

    MediaDescriptionCompat(Parcel parcel) {
        this.N = parcel.readString();
        this.mTitle = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.mSubtitle = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.ar = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        ClassLoader classLoader = getClass().getClassLoader();
        this.as = (Bitmap) parcel.readParcelable(classLoader);
        this.at = (Uri) parcel.readParcelable(classLoader);
        this.mExtras = parcel.readBundle(classLoader);
        this.au = (Uri) parcel.readParcelable(classLoader);
    }

    @Nullable
    public String getMediaId() {
        return this.N;
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (VERSION.SDK_INT < 21) {
            parcel.writeString(this.N);
            TextUtils.writeToParcel(this.mTitle, parcel, i);
            TextUtils.writeToParcel(this.mSubtitle, parcel, i);
            TextUtils.writeToParcel(this.ar, parcel, i);
            parcel.writeParcelable(this.as, i);
            parcel.writeParcelable(this.at, i);
            parcel.writeBundle(this.mExtras);
            parcel.writeParcelable(this.au, i);
            return;
        }
        MediaDescriptionCompatApi21.a(v(), parcel, i);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.mTitle);
        String str = ", ";
        stringBuilder.append(str);
        stringBuilder.append(this.mSubtitle);
        stringBuilder.append(str);
        stringBuilder.append(this.ar);
        return stringBuilder.toString();
    }

    public Object v() {
        if (this.av != null || VERSION.SDK_INT < 21) {
            return this.av;
        }
        Object newInstance = Builder.newInstance();
        Builder.a(newInstance, this.N);
        Builder.a(newInstance, this.mTitle);
        Builder.b(newInstance, this.mSubtitle);
        Builder.c(newInstance, this.ar);
        Builder.a(newInstance, this.as);
        Builder.a(newInstance, this.at);
        Bundle bundle = this.mExtras;
        if (VERSION.SDK_INT < 23 && this.au != null) {
            if (bundle == null) {
                bundle = new Bundle();
                bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
            }
            bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", this.au);
        }
        Builder.a(newInstance, bundle);
        if (VERSION.SDK_INT >= 23) {
            Builder.b(newInstance, this.au);
        }
        this.av = Builder.p(newInstance);
        return this.av;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0069  */
    public static android.support.v4.media.MediaDescriptionCompat i(java.lang.Object r8) {
        /*
        r0 = 0;
        if (r8 == 0) goto L_0x0080;
    L_0x0003:
        r1 = android.os.Build.VERSION.SDK_INT;
        r2 = 21;
        if (r1 < r2) goto L_0x0080;
    L_0x0009:
        r1 = new android.support.v4.media.MediaDescriptionCompat$Builder;
        r1.<init>();
        r2 = android.support.v4.media.MediaDescriptionCompatApi21.j(r8);
        r1.g(r2);
        r2 = android.support.v4.media.MediaDescriptionCompatApi21.k(r8);
        r1.b(r2);
        r2 = android.support.v4.media.MediaDescriptionCompatApi21.l(r8);
        r1.c(r2);
        r2 = android.support.v4.media.MediaDescriptionCompatApi21.m(r8);
        r1.d(r2);
        r2 = android.support.v4.media.MediaDescriptionCompatApi21.n(r8);
        r1.a(r2);
        r2 = android.support.v4.media.MediaDescriptionCompatApi21.o(r8);
        r1.a(r2);
        r2 = android.support.v4.media.MediaDescriptionCompatApi21.e(r8);
        r3 = "android.support.v4.media.description.MEDIA_URI";
        if (r2 == 0) goto L_0x004a;
    L_0x0040:
        android.support.v4.media.session.MediaSessionCompat.d(r2);
        r4 = r2.getParcelable(r3);
        r4 = (android.net.Uri) r4;
        goto L_0x004b;
    L_0x004a:
        r4 = r0;
    L_0x004b:
        if (r4 == 0) goto L_0x0063;
    L_0x004d:
        r5 = "android.support.v4.media.description.NULL_BUNDLE_FLAG";
        r6 = r2.containsKey(r5);
        if (r6 == 0) goto L_0x005d;
    L_0x0055:
        r6 = r2.size();
        r7 = 2;
        if (r6 != r7) goto L_0x005d;
    L_0x005c:
        goto L_0x0064;
    L_0x005d:
        r2.remove(r3);
        r2.remove(r5);
    L_0x0063:
        r0 = r2;
    L_0x0064:
        r1.c(r0);
        if (r4 == 0) goto L_0x006d;
    L_0x0069:
        r1.b(r4);
        goto L_0x007a;
    L_0x006d:
        r0 = android.os.Build.VERSION.SDK_INT;
        r2 = 23;
        if (r0 < r2) goto L_0x007a;
    L_0x0073:
        r0 = android.support.v4.media.MediaDescriptionCompatApi23.q(r8);
        r1.b(r0);
    L_0x007a:
        r0 = r1.w();
        r0.av = r8;
    L_0x0080:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.MediaDescriptionCompat.i(java.lang.Object):android.support.v4.media.MediaDescriptionCompat");
    }
}
