package com.google.android.gms.internal.vision;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;
import com.google.android.gms.vision.Frame;

@Class(creator = "FrameMetadataParcelCreator")
@Reserved({1})
public final class zzn extends AbstractSafeParcelable {
    public static final Creator<zzn> CREATOR = new zzo();
    @Field(id = 3)
    public int height;
    @Field(id = 4)
    public int id;
    @Field(id = 6)
    public int rotation;
    @Field(id = 2)
    public int width;
    @Field(id = 5)
    public long zzat;

    @Constructor
    public zzn(@Param(id = 2) int i, @Param(id = 3) int i2, @Param(id = 4) int i3, @Param(id = 5) long j, @Param(id = 6) int i4) {
        this.width = i;
        this.height = i2;
        this.id = i3;
        this.zzat = j;
        this.rotation = i4;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.width);
        SafeParcelWriter.writeInt(parcel, 3, this.height);
        SafeParcelWriter.writeInt(parcel, 4, this.id);
        SafeParcelWriter.writeLong(parcel, 5, this.zzat);
        SafeParcelWriter.writeInt(parcel, 6, this.rotation);
        SafeParcelWriter.finishObjectHeader(parcel, i);
    }

    public static zzn zzc(Frame frame) {
        zzn zzn = new zzn();
        zzn.width = frame.getMetadata().getWidth();
        zzn.height = frame.getMetadata().getHeight();
        zzn.rotation = frame.getMetadata().getRotation();
        zzn.id = frame.getMetadata().getId();
        zzn.zzat = frame.getMetadata().getTimestampMillis();
        return zzn;
    }
}
