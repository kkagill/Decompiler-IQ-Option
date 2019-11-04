package com.google.android.gms.vision.face.internal.client;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;

@Class(creator = "FaceSettingsParcelCreator")
@Reserved({1})
public final class zze extends AbstractSafeParcelable {
    public static final Creator<zze> CREATOR = new zzf();
    @Field(id = 3)
    public int landmarkType;
    @Field(id = 2)
    public int mode;
    @Field(defaultValue = "-1", id = 7)
    public float proportionalMinFaceSize;
    @Field(id = 6)
    public boolean trackingEnabled;
    @Field(id = 5)
    public boolean zzcm;
    @Field(id = 4)
    public int zzcn;

    @Constructor
    public zze(@Param(id = 2) int i, @Param(id = 3) int i2, @Param(id = 4) int i3, @Param(id = 5) boolean z, @Param(id = 6) boolean z2, @Param(id = 7) float f) {
        this.mode = i;
        this.landmarkType = i2;
        this.zzcn = i3;
        this.zzcm = z;
        this.trackingEnabled = z2;
        this.proportionalMinFaceSize = f;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.mode);
        SafeParcelWriter.writeInt(parcel, 3, this.landmarkType);
        SafeParcelWriter.writeInt(parcel, 4, this.zzcn);
        SafeParcelWriter.writeBoolean(parcel, 5, this.zzcm);
        SafeParcelWriter.writeBoolean(parcel, 6, this.trackingEnabled);
        SafeParcelWriter.writeFloat(parcel, 7, this.proportionalMinFaceSize);
        SafeParcelWriter.finishObjectHeader(parcel, i);
    }
}
