package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Base64;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@KeepForSdk
@Class(creator = "ExperimentTokensCreator")
@Reserved({1})
public class ExperimentTokens extends AbstractSafeParcelable {
    @KeepForSdk
    public static final Creator<ExperimentTokens> CREATOR = new zzh();
    private static final zza zzaa = new zzg();
    private static final byte[][] zzn = new byte[0][];
    private static final ExperimentTokens zzo;
    private static final zza zzx = new zzd();
    private static final zza zzy = new zze();
    private static final zza zzz = new zzf();
    @Field(id = 2)
    private final String zzp;
    @Field(id = 3)
    private final byte[] zzq;
    @Field(id = 4)
    private final byte[][] zzr;
    @Field(id = 5)
    private final byte[][] zzs;
    @Field(id = 6)
    private final byte[][] zzt;
    @Field(id = 7)
    private final byte[][] zzu;
    @Field(id = 8)
    private final int[] zzv;
    @Field(id = 9)
    private final byte[][] zzw;

    private interface zza {
    }

    static {
        byte[][] bArr = zzn;
        zzo = new ExperimentTokens("", null, bArr, bArr, bArr, bArr, null, null);
    }

    @Constructor
    public ExperimentTokens(@Param(id = 2) String str, @Param(id = 3) byte[] bArr, @Param(id = 4) byte[][] bArr2, @Param(id = 5) byte[][] bArr3, @Param(id = 6) byte[][] bArr4, @Param(id = 7) byte[][] bArr5, @Param(id = 8) int[] iArr, @Param(id = 9) byte[][] bArr6) {
        this.zzp = str;
        this.zzq = bArr;
        this.zzr = bArr2;
        this.zzs = bArr3;
        this.zzt = bArr4;
        this.zzu = bArr5;
        this.zzv = iArr;
        this.zzw = bArr6;
    }

    private static List<Integer> zza(int[] iArr) {
        if (iArr == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int valueOf : iArr) {
            arrayList.add(Integer.valueOf(valueOf));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static List<String> zza(byte[][] bArr) {
        if (bArr == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte[] encodeToString : bArr) {
            arrayList.add(Base64.encodeToString(encodeToString, 3));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static void zza(StringBuilder stringBuilder, String str, byte[][] bArr) {
        stringBuilder.append(str);
        stringBuilder.append("=");
        if (bArr == null) {
            str = "null";
        } else {
            stringBuilder.append("(");
            int length = bArr.length;
            int i = 0;
            Object obj = 1;
            while (i < length) {
                byte[] bArr2 = bArr[i];
                if (obj == null) {
                    stringBuilder.append(", ");
                }
                String str2 = "'";
                stringBuilder.append(str2);
                stringBuilder.append(Base64.encodeToString(bArr2, 3));
                stringBuilder.append(str2);
                i++;
                obj = null;
            }
            str = ")";
        }
        stringBuilder.append(str);
    }

    public boolean equals(Object obj) {
        if (obj instanceof ExperimentTokens) {
            ExperimentTokens experimentTokens = (ExperimentTokens) obj;
            if (zzn.equals(this.zzp, experimentTokens.zzp) && Arrays.equals(this.zzq, experimentTokens.zzq) && zzn.equals(zza(this.zzr), zza(experimentTokens.zzr)) && zzn.equals(zza(this.zzs), zza(experimentTokens.zzs)) && zzn.equals(zza(this.zzt), zza(experimentTokens.zzt)) && zzn.equals(zza(this.zzu), zza(experimentTokens.zzu)) && zzn.equals(zza(this.zzv), zza(experimentTokens.zzv)) && zzn.equals(zza(this.zzw), zza(experimentTokens.zzw))) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("ExperimentTokens");
        String str = "(";
        stringBuilder.append(str);
        String str2 = this.zzp;
        String str3 = "null";
        String str4 = "'";
        if (str2 == null) {
            str2 = str3;
        } else {
            StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(str2).length() + 2);
            stringBuilder2.append(str4);
            stringBuilder2.append(str2);
            stringBuilder2.append(str4);
            str2 = stringBuilder2.toString();
        }
        stringBuilder.append(str2);
        str2 = ", ";
        stringBuilder.append(str2);
        byte[] bArr = this.zzq;
        stringBuilder.append("direct");
        String str5 = "=";
        stringBuilder.append(str5);
        if (bArr == null) {
            stringBuilder.append(str3);
        } else {
            stringBuilder.append(str4);
            stringBuilder.append(Base64.encodeToString(bArr, 3));
            stringBuilder.append(str4);
        }
        stringBuilder.append(str2);
        zza(stringBuilder, "GAIA", this.zzr);
        stringBuilder.append(str2);
        zza(stringBuilder, "PSEUDO", this.zzs);
        stringBuilder.append(str2);
        zza(stringBuilder, "ALWAYS", this.zzt);
        stringBuilder.append(str2);
        zza(stringBuilder, "OTHER", this.zzu);
        stringBuilder.append(str2);
        int[] iArr = this.zzv;
        stringBuilder.append("weak");
        stringBuilder.append(str5);
        String str6 = ")";
        if (iArr == null) {
            stringBuilder.append(str3);
        } else {
            stringBuilder.append(str);
            int length = iArr.length;
            int i = 0;
            Object obj = 1;
            while (i < length) {
                int i2 = iArr[i];
                if (obj == null) {
                    stringBuilder.append(str2);
                }
                stringBuilder.append(i2);
                i++;
                obj = null;
            }
            stringBuilder.append(str6);
        }
        stringBuilder.append(str2);
        zza(stringBuilder, "directs", this.zzw);
        stringBuilder.append(str6);
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        i = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zzp, false);
        SafeParcelWriter.writeByteArray(parcel, 3, this.zzq, false);
        SafeParcelWriter.writeByteArrayArray(parcel, 4, this.zzr, false);
        SafeParcelWriter.writeByteArrayArray(parcel, 5, this.zzs, false);
        SafeParcelWriter.writeByteArrayArray(parcel, 6, this.zzt, false);
        SafeParcelWriter.writeByteArrayArray(parcel, 7, this.zzu, false);
        SafeParcelWriter.writeIntArray(parcel, 8, this.zzv, false);
        SafeParcelWriter.writeByteArrayArray(parcel, 9, this.zzw, false);
        SafeParcelWriter.finishObjectHeader(parcel, i);
    }
}
