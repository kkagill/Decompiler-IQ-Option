package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;

@Class(creator = "CapCreator")
@Reserved({1})
public class Cap extends AbstractSafeParcelable {
    public static final Creator<Cap> CREATOR = new zzb();
    private static final String TAG = "Cap";
    @Field(getter = "getWrappedBitmapDescriptorImplBinder", id = 3, type = "android.os.IBinder")
    @Nullable
    private final BitmapDescriptor bitmapDescriptor;
    @Field(getter = "getType", id = 2)
    private final int type;
    @Field(getter = "getBitmapRefWidth", id = 4)
    @Nullable
    private final Float zzcm;

    protected Cap(int i) {
        this(i, null, null);
    }

    @Constructor
    Cap(@Param(id = 2) int i, @Param(id = 3) @Nullable IBinder iBinder, @Param(id = 4) @Nullable Float f) {
        this(i, iBinder == null ? null : new BitmapDescriptor(Stub.asInterface(iBinder)), f);
    }

    private Cap(int i, @Nullable BitmapDescriptor bitmapDescriptor, @Nullable Float f) {
        Object obj = (f == null || f.floatValue() <= 0.0f) ? null : 1;
        boolean z = (i == 3 && (bitmapDescriptor == null || obj == null)) ? false : true;
        Preconditions.checkArgument(z, String.format("Invalid Cap: type=%s bitmapDescriptor=%s bitmapRefWidth=%s", new Object[]{Integer.valueOf(i), bitmapDescriptor, f}));
        this.type = i;
        this.bitmapDescriptor = bitmapDescriptor;
        this.zzcm = f;
    }

    protected Cap(@NonNull BitmapDescriptor bitmapDescriptor, float f) {
        this(3, bitmapDescriptor, Float.valueOf(f));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Cap)) {
            return false;
        }
        Cap cap = (Cap) obj;
        return this.type == cap.type && Objects.equal(this.bitmapDescriptor, cap.bitmapDescriptor) && Objects.equal(this.zzcm, cap.zzcm);
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.type), this.bitmapDescriptor, this.zzcm);
    }

    public String toString() {
        int i = this.type;
        StringBuilder stringBuilder = new StringBuilder(23);
        stringBuilder.append("[Cap: type=");
        stringBuilder.append(i);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        i = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.type);
        BitmapDescriptor bitmapDescriptor = this.bitmapDescriptor;
        SafeParcelWriter.writeIBinder(parcel, 3, bitmapDescriptor == null ? null : bitmapDescriptor.zza().asBinder(), false);
        SafeParcelWriter.writeFloatObject(parcel, 4, this.zzcm, false);
        SafeParcelWriter.finishObjectHeader(parcel, i);
    }

    /* Access modifiers changed, original: final */
    public final Cap zzg() {
        int i = this.type;
        if (i == 0) {
            return new ButtCap();
        }
        if (i == 1) {
            return new SquareCap();
        }
        if (i == 2) {
            return new RoundCap();
        }
        if (i == 3) {
            return new CustomCap(this.bitmapDescriptor, this.zzcm.floatValue());
        }
        String str = TAG;
        StringBuilder stringBuilder = new StringBuilder(29);
        stringBuilder.append("Unknown Cap type: ");
        stringBuilder.append(i);
        Log.w(str, stringBuilder.toString());
        return this;
    }
}
