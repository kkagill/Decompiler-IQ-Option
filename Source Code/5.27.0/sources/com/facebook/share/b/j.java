package com.facebook.share.b;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.Nullable;

/* compiled from: SharePhoto */
public final class j extends d {
    public static final Creator<j> CREATOR = new Creator<j>() {
        /* renamed from: M */
        public j createFromParcel(Parcel parcel) {
            return new j(parcel);
        }

        /* renamed from: ar */
        public j[] newArray(int i) {
            return new j[i];
        }
    };
    private final boolean DD;
    private final String DF;
    private final Bitmap bitmap;
    private final Uri zi;

    public int describeContents() {
        return 0;
    }

    j(Parcel parcel) {
        super(parcel);
        this.bitmap = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
        this.zi = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.DD = parcel.readByte() != (byte) 0;
        this.DF = parcel.readString();
    }

    @Nullable
    public Uri mt() {
        return this.zi;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.bitmap, 0);
        parcel.writeParcelable(this.zi, 0);
        parcel.writeByte((byte) this.DD);
        parcel.writeString(this.DF);
    }
}
