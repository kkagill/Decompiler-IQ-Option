package com.facebook.share.b;

import android.net.Uri;
import android.os.Parcel;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: ShareContent */
public abstract class a<P extends a, E> implements e {
    private final Uri Dq;
    private final List<String> Dr;
    private final String Ds;
    private final String Dt;
    private final b Du;
    private final String placeId;

    public int describeContents() {
        return 0;
    }

    protected a(Parcel parcel) {
        this.Dq = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.Dr = E(parcel);
        this.placeId = parcel.readString();
        this.Ds = parcel.readString();
        this.Dt = parcel.readString();
        this.Du = new com.facebook.share.b.b.a().G(parcel).mo();
    }

    @Nullable
    public Uri ml() {
        return this.Dq;
    }

    @Nullable
    public b mm() {
        return this.Du;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.Dq, 0);
        parcel.writeStringList(this.Dr);
        parcel.writeString(this.placeId);
        parcel.writeString(this.Ds);
        parcel.writeString(this.Dt);
        parcel.writeParcelable(this.Du, 0);
    }

    private List<String> E(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        return arrayList.size() == 0 ? null : Collections.unmodifiableList(arrayList);
    }
}
