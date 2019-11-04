package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;
import java.util.Iterator;

@Class(creator = "EventParamsCreator")
@Reserved({1})
public final class zzah extends AbstractSafeParcelable implements Iterable<String> {
    public static final Creator<zzah> CREATOR = new zzaj();
    @Field(getter = "z", id = 2)
    private final Bundle zzft;

    @Constructor
    zzah(@Param(id = 2) Bundle bundle) {
        this.zzft = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBundle(parcel, 2, zzcv(), false);
        SafeParcelWriter.finishObjectHeader(parcel, i);
    }

    /* Access modifiers changed, original: final */
    public final Object get(String str) {
        return this.zzft.get(str);
    }

    /* Access modifiers changed, original: final */
    public final Long getLong(String str) {
        return Long.valueOf(this.zzft.getLong(str));
    }

    /* Access modifiers changed, original: final */
    public final Double zzah(String str) {
        return Double.valueOf(this.zzft.getDouble(str));
    }

    /* Access modifiers changed, original: final */
    public final String getString(String str) {
        return this.zzft.getString(str);
    }

    public final int size() {
        return this.zzft.size();
    }

    public final String toString() {
        return this.zzft.toString();
    }

    public final Bundle zzcv() {
        return new Bundle(this.zzft);
    }

    public final Iterator<String> iterator() {
        return new zzag(this);
    }
}
