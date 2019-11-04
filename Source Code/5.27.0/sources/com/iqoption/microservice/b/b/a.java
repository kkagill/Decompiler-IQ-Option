package com.iqoption.microservice.b.b;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.SerializedName;

/* compiled from: KycDocumentsStatus */
public class a implements Parcelable {
    public static final Creator<a> CREATOR = new Creator<a>() {
        /* renamed from: ae */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        /* renamed from: gn */
        public a[] newArray(int i) {
            return new a[i];
        }
    };
    @SerializedName("isVerified")
    public boolean dGK;
    @SerializedName("documentsState")
    public String dGL;

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("KycDocumentsStatus{isVerified=");
        stringBuilder.append(this.dGK);
        stringBuilder.append(", documentsState='");
        stringBuilder.append(this.dGL);
        stringBuilder.append('\'');
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.dGK);
        parcel.writeString(this.dGL);
    }

    protected a(Parcel parcel) {
        this.dGK = parcel.readByte() != (byte) 0;
        this.dGL = parcel.readString();
    }
}
