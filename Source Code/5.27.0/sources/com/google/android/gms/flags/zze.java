package com.google.android.gms.flags;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.flags.zza;
import com.google.android.gms.internal.flags.zzc;

public final class zze extends zza implements zzc {
    zze(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.flags.IFlagProvider");
    }

    public final void init(IObjectWrapper iObjectWrapper) {
        Parcel zza = zza();
        zzc.zza(zza, iObjectWrapper);
        zzb(1, zza);
    }

    public final boolean getBooleanFlagValue(String str, boolean z, int i) {
        Parcel zza = zza();
        zza.writeString(str);
        zzc.writeBoolean(zza, z);
        zza.writeInt(i);
        Parcel zza2 = zza(2, zza);
        z = zzc.zza(zza2);
        zza2.recycle();
        return z;
    }

    public final int getIntFlagValue(String str, int i, int i2) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeInt(i);
        zza.writeInt(i2);
        Parcel zza2 = zza(3, zza);
        i = zza2.readInt();
        zza2.recycle();
        return i;
    }

    public final long getLongFlagValue(String str, long j, int i) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeLong(j);
        zza.writeInt(i);
        Parcel zza2 = zza(4, zza);
        j = zza2.readLong();
        zza2.recycle();
        return j;
    }

    public final String getStringFlagValue(String str, String str2, int i) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zza.writeInt(i);
        Parcel zza2 = zza(5, zza);
        str2 = zza2.readString();
        zza2.recycle();
        return str2;
    }
}
