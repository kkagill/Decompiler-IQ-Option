package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;

@Class(creator = "EventParcelCreator")
@Reserved({1})
public final class zzai extends AbstractSafeParcelable {
    public static final Creator<zzai> CREATOR = new zzal();
    @Field(id = 2)
    public final String name;
    @Field(id = 4)
    public final String origin;
    @Field(id = 3)
    public final zzah zzfq;
    @Field(id = 5)
    public final long zzfu;

    @Constructor
    public zzai(@Param(id = 2) String str, @Param(id = 3) zzah zzah, @Param(id = 4) String str2, @Param(id = 5) long j) {
        this.name = str;
        this.zzfq = zzah;
        this.origin = str2;
        this.zzfu = j;
    }

    zzai(zzai zzai, long j) {
        Preconditions.checkNotNull(zzai);
        this.name = zzai.name;
        this.zzfq = zzai.zzfq;
        this.origin = zzai.origin;
        this.zzfu = j;
    }

    public final String toString() {
        String str = this.origin;
        String str2 = this.name;
        String valueOf = String.valueOf(this.zzfq);
        StringBuilder stringBuilder = new StringBuilder(((String.valueOf(str).length() + 21) + String.valueOf(str2).length()) + String.valueOf(valueOf).length());
        stringBuilder.append("origin=");
        stringBuilder.append(str);
        stringBuilder.append(",name=");
        stringBuilder.append(str2);
        stringBuilder.append(",params=");
        stringBuilder.append(valueOf);
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.name, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzfq, i, false);
        SafeParcelWriter.writeString(parcel, 4, this.origin, false);
        SafeParcelWriter.writeLong(parcel, 5, this.zzfu);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
