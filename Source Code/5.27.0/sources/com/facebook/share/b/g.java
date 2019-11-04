package com.facebook.share.b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.Nullable;
import com.facebook.share.b.f.a;

/* compiled from: ShareOpenGraphContent */
public final class g extends a<g, Object> {
    public static final Creator<g> CREATOR = new Creator<g>() {
        /* renamed from: K */
        public g createFromParcel(Parcel parcel) {
            return new g(parcel);
        }

        /* renamed from: ap */
        public g[] newArray(int i) {
            return new g[i];
        }
    };
    private final f DA;
    private final String DB;

    public int describeContents() {
        return 0;
    }

    g(Parcel parcel) {
        super(parcel);
        this.DA = new a().J(parcel).mr();
        this.DB = parcel.readString();
    }

    @Nullable
    public f ms() {
        return this.DA;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.DA, 0);
        parcel.writeString(this.DB);
    }
}
