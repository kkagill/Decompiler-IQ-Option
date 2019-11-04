package com.facebook.share.b;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.Nullable;

/* compiled from: ShareLinkContent */
public final class c extends a<c, Object> {
    public static final Creator<c> CREATOR = new Creator<c>() {
        /* renamed from: H */
        public c createFromParcel(Parcel parcel) {
            return new c(parcel);
        }

        /* renamed from: an */
        public c[] newArray(int i) {
            return new c[i];
        }
    };
    @Deprecated
    private final String Dw;
    @Deprecated
    private final String Dx;
    private final String Dy;
    @Deprecated
    private final Uri zi;

    public int describeContents() {
        return 0;
    }

    c(Parcel parcel) {
        super(parcel);
        this.Dw = parcel.readString();
        this.Dx = parcel.readString();
        this.zi = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.Dy = parcel.readString();
    }

    @Nullable
    public String mp() {
        return this.Dy;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.Dw);
        parcel.writeString(this.Dx);
        parcel.writeParcelable(this.zi, 0);
        parcel.writeString(this.Dy);
    }
}
