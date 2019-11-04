package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;
import java.util.Arrays;
import java.util.Comparator;

@Class(creator = "FlagCreator")
@Reserved({1})
public final class zzi extends AbstractSafeParcelable implements Comparable<zzi> {
    public static final Creator<zzi> CREATOR = new zzk();
    private static final Comparator<zzi> zzai = new zzj();
    @Field(id = 2)
    public final String name;
    @Field(id = 3)
    private final long zzab;
    @Field(id = 4)
    private final boolean zzac;
    @Field(id = 5)
    private final double zzad;
    @Field(id = 6)
    private final String zzae;
    @Field(id = 7)
    private final byte[] zzaf;
    @Field(id = 8)
    private final int zzag;
    @Field(id = 9)
    public final int zzah;

    @Constructor
    public zzi(@Param(id = 2) String str, @Param(id = 3) long j, @Param(id = 4) boolean z, @Param(id = 5) double d, @Param(id = 6) String str2, @Param(id = 7) byte[] bArr, @Param(id = 8) int i, @Param(id = 9) int i2) {
        this.name = str;
        this.zzab = j;
        this.zzac = z;
        this.zzad = d;
        this.zzae = str2;
        this.zzaf = bArr;
        this.zzag = i;
        this.zzah = i2;
    }

    private static int compare(int i, int i2) {
        return i < i2 ? -1 : i == i2 ? 0 : 1;
    }

    public final /* synthetic */ int compareTo(Object obj) {
        zzi zzi = (zzi) obj;
        int compareTo = this.name.compareTo(zzi.name);
        if (compareTo != 0) {
            return compareTo;
        }
        compareTo = compare(this.zzag, zzi.zzag);
        if (compareTo != 0) {
            return compareTo;
        }
        compareTo = this.zzag;
        int i = 0;
        if (compareTo == 1) {
            long j = this.zzab;
            long j2 = zzi.zzab;
            return j < j2 ? -1 : j == j2 ? 0 : 1;
        } else if (compareTo == 2) {
            boolean z = this.zzac;
            return z == zzi.zzac ? 0 : z ? 1 : -1;
        } else if (compareTo == 3) {
            return Double.compare(this.zzad, zzi.zzad);
        } else {
            if (compareTo == 4) {
                String str = this.zzae;
                String str2 = zzi.zzae;
                return str == str2 ? 0 : str == null ? -1 : str2 == null ? 1 : str.compareTo(str2);
            } else if (compareTo == 5) {
                byte[] bArr = this.zzaf;
                byte[] bArr2 = zzi.zzaf;
                if (bArr == bArr2) {
                    return 0;
                }
                if (bArr == null) {
                    return -1;
                }
                if (bArr2 == null) {
                    return 1;
                }
                while (i < Math.min(this.zzaf.length, zzi.zzaf.length)) {
                    compareTo = this.zzaf[i] - zzi.zzaf[i];
                    if (compareTo != 0) {
                        return compareTo;
                    }
                    i++;
                }
                return compare(this.zzaf.length, zzi.zzaf.length);
            } else {
                StringBuilder stringBuilder = new StringBuilder(31);
                stringBuilder.append("Invalid enum value: ");
                stringBuilder.append(compareTo);
                throw new AssertionError(stringBuilder.toString());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzi) {
            zzi zzi = (zzi) obj;
            if (zzn.equals(this.name, zzi.name)) {
                int i = this.zzag;
                if (i == zzi.zzag && this.zzah == zzi.zzah) {
                    if (i != 1) {
                        if (i == 2) {
                            return this.zzac == zzi.zzac;
                        } else {
                            if (i == 3) {
                                return this.zzad == zzi.zzad;
                            } else {
                                if (i == 4) {
                                    return zzn.equals(this.zzae, zzi.zzae);
                                }
                                if (i == 5) {
                                    return Arrays.equals(this.zzaf, zzi.zzaf);
                                }
                                StringBuilder stringBuilder = new StringBuilder(31);
                                stringBuilder.append("Invalid enum value: ");
                                stringBuilder.append(i);
                                throw new AssertionError(stringBuilder.toString());
                            }
                        }
                    } else if (this.zzab == zzi.zzab) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Flag(");
        stringBuilder.append(this.name);
        String str = ", ";
        stringBuilder.append(str);
        int i = this.zzag;
        if (i == 1) {
            stringBuilder.append(this.zzab);
        } else if (i == 2) {
            stringBuilder.append(this.zzac);
        } else if (i != 3) {
            String str2;
            String str3 = "'";
            if (i == 4) {
                stringBuilder.append(str3);
                str2 = this.zzae;
            } else if (i != 5) {
                String str4 = this.name;
                StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(str4).length() + 27);
                stringBuilder2.append("Invalid type: ");
                stringBuilder2.append(str4);
                stringBuilder2.append(str);
                stringBuilder2.append(i);
                throw new AssertionError(stringBuilder2.toString());
            } else if (this.zzaf == null) {
                stringBuilder.append("null");
            } else {
                stringBuilder.append(str3);
                str2 = Base64.encodeToString(this.zzaf, 3);
            }
            stringBuilder.append(str2);
            stringBuilder.append(str3);
        } else {
            stringBuilder.append(this.zzad);
        }
        stringBuilder.append(str);
        stringBuilder.append(this.zzag);
        stringBuilder.append(str);
        stringBuilder.append(this.zzah);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.name, false);
        SafeParcelWriter.writeLong(parcel, 3, this.zzab);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zzac);
        SafeParcelWriter.writeDouble(parcel, 5, this.zzad);
        SafeParcelWriter.writeString(parcel, 6, this.zzae, false);
        SafeParcelWriter.writeByteArray(parcel, 7, this.zzaf, false);
        SafeParcelWriter.writeInt(parcel, 8, this.zzag);
        SafeParcelWriter.writeInt(parcel, 9, this.zzah);
        SafeParcelWriter.finishObjectHeader(parcel, i);
    }
}
