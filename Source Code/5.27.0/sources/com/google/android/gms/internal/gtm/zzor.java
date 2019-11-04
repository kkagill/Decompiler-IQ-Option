package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzc.zzb;
import com.google.android.gms.internal.gtm.zzc.zzd;
import com.google.android.gms.internal.gtm.zzc.zze;
import com.google.android.gms.internal.gtm.zzg.zza;
import com.google.android.gms.tagmanager.zzdi;
import com.google.android.gms.tagmanager.zzgj;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public final class zzor {
    public static zzov zza(zzi zzi) {
        int i;
        zzl[] zzlArr = new zzl[zzi.zzpj.length];
        int i2 = 0;
        for (int i3 = 0; i3 < zzi.zzpj.length; i3++) {
            zza(i3, zzi, zzlArr, new HashSet(0));
        }
        zzow zzmn = zzov.zzmn();
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < zzi.zzpm.length; i4++) {
            arrayList.add(zza(zzi.zzpm[i4], zzi, zzlArr, i4));
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i5 = 0; i5 < zzi.zzpn.length; i5++) {
            arrayList2.add(zza(zzi.zzpn[i5], zzi, zzlArr, i5));
        }
        ArrayList arrayList3 = new ArrayList();
        for (i = 0; i < zzi.zzpl.length; i++) {
            zzot zza = zza(zzi.zzpl[i], zzi, zzlArr, i);
            zzmn.zzc(zza);
            arrayList3.add(zza);
        }
        zze[] zzeArr = zzi.zzpo;
        i = zzeArr.length;
        while (i2 < i) {
            zze zze = zzeArr[i2];
            zzoy zzoy = new zzoy();
            for (Integer intValue : zze.zzn()) {
                zzoy.zzd((zzot) arrayList2.get(intValue.intValue()));
            }
            for (Integer intValue2 : zze.zzo()) {
                zzoy.zze((zzot) arrayList2.get(intValue2.intValue()));
            }
            for (Integer intValue22 : zze.zzp()) {
                zzoy.zzf((zzot) arrayList.get(intValue22.intValue()));
            }
            for (Integer intValue222 : zze.zzr()) {
                zzoy.zzct(zzi.zzpj[intValue222.intValue()].string);
            }
            for (Integer intValue2222 : zze.zzq()) {
                zzoy.zzg((zzot) arrayList.get(intValue2222.intValue()));
            }
            for (Integer intValue22222 : zze.zzs()) {
                zzoy.zzcu(zzi.zzpj[intValue22222.intValue()].string);
            }
            for (Integer intValue222222 : zze.zzt()) {
                zzoy.zzh((zzot) arrayList3.get(intValue222222.intValue()));
            }
            for (Integer intValue2222222 : zze.zzv()) {
                zzoy.zzcv(zzi.zzpj[intValue2222222.intValue()].string);
            }
            for (Integer intValue22222222 : zze.zzu()) {
                zzoy.zzi((zzot) arrayList3.get(intValue22222222.intValue()));
            }
            for (Integer intValue3 : zze.zzw()) {
                zzoy.zzcw(zzi.zzpj[intValue3.intValue()].string);
            }
            zzmn.zzb(zzoy.zzms());
            i2++;
        }
        zzmn.zzcs(zzi.version);
        zzmn.zzaf(zzi.zzpw);
        return zzmn.zzmp();
    }

    public static zzl zzk(zzl zzl) {
        zzl zzl2 = new zzl();
        zzl2.type = zzl.type;
        zzl2.zzqv = (int[]) zzl.zzqv.clone();
        if (zzl.zzqw) {
            zzl2.zzqw = zzl.zzqw;
        }
        return zzl2;
    }

    private static zzl zza(int i, zzi zzi, zzl[] zzlArr, Set<Integer> set) {
        StringBuilder stringBuilder;
        if (set.contains(Integer.valueOf(i))) {
            String valueOf = String.valueOf(set);
            stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 90);
            stringBuilder.append("Value cycle detected.  Current value reference: ");
            stringBuilder.append(i);
            stringBuilder.append(".  Previous value references: ");
            stringBuilder.append(valueOf);
            stringBuilder.append(".");
            zzcf(stringBuilder.toString());
        }
        zzl zzl = (zzl) zza(zzi.zzpj, i, "values");
        if (zzlArr[i] != null) {
            return zzlArr[i];
        }
        zzl zzl2 = null;
        set.add(Integer.valueOf(i));
        int i2 = 0;
        int length;
        int i3;
        int i4;
        zza zzl3;
        int[] iArr;
        switch (zzl.type) {
            case 1:
            case 5:
            case 6:
            case 8:
                zzl2 = zzl;
                break;
            case 2:
                zza zzl4 = zzl(zzl);
                zzl zzk = zzk(zzl);
                zzk.zzqn = new zzl[zzl4.zzpz.length];
                int[] iArr2 = zzl4.zzpz;
                length = iArr2.length;
                i3 = 0;
                while (i2 < length) {
                    i4 = i3 + 1;
                    zzk.zzqn[i3] = zza(iArr2[i2], zzi, zzlArr, (Set) set);
                    i2++;
                    i3 = i4;
                }
                zzl2 = zzk;
                break;
            case 3:
                zzl2 = zzk(zzl);
                zzl3 = zzl(zzl);
                if (zzl3.zzqa.length != zzl3.zzqb.length) {
                    length = zzl3.zzqa.length;
                    i3 = zzl3.zzqb.length;
                    StringBuilder stringBuilder2 = new StringBuilder(58);
                    stringBuilder2.append("Uneven map keys (");
                    stringBuilder2.append(length);
                    stringBuilder2.append(") and map values (");
                    stringBuilder2.append(i3);
                    stringBuilder2.append(")");
                    zzcf(stringBuilder2.toString());
                }
                zzl2.zzqo = new zzl[zzl3.zzqa.length];
                zzl2.zzqp = new zzl[zzl3.zzqa.length];
                int[] iArr3 = zzl3.zzqa;
                i3 = iArr3.length;
                int i5 = 0;
                int i6 = 0;
                while (i5 < i3) {
                    int i7 = i6 + 1;
                    zzl2.zzqo[i6] = zza(iArr3[i5], zzi, zzlArr, (Set) set);
                    i5++;
                    i6 = i7;
                }
                iArr = zzl3.zzqb;
                length = iArr.length;
                i3 = 0;
                while (i2 < length) {
                    i4 = i3 + 1;
                    zzl2.zzqp[i3] = zza(iArr[i2], zzi, zzlArr, (Set) set);
                    i2++;
                    i3 = i4;
                }
                break;
            case 4:
                zzl2 = zzk(zzl);
                zzl2.zzqq = zzgj.zzc(zza(zzl(zzl).zzqe, zzi, zzlArr, (Set) set));
                break;
            case 7:
                zzl2 = zzk(zzl);
                zzl3 = zzl(zzl);
                zzl2.zzqu = new zzl[zzl3.zzqd.length];
                iArr = zzl3.zzqd;
                length = iArr.length;
                i3 = 0;
                while (i2 < length) {
                    i4 = i3 + 1;
                    zzl2.zzqu[i3] = zza(iArr[i2], zzi, zzlArr, (Set) set);
                    i2++;
                    i3 = i4;
                }
                break;
        }
        if (zzl2 == null) {
            String valueOf2 = String.valueOf(zzl);
            stringBuilder = new StringBuilder(String.valueOf(valueOf2).length() + 15);
            stringBuilder.append("Invalid value: ");
            stringBuilder.append(valueOf2);
            zzcf(stringBuilder.toString());
        }
        zzlArr[i] = zzl2;
        set.remove(Integer.valueOf(i));
        return zzl2;
    }

    private static zza zzl(zzl zzl) {
        if (((zza) zzl.zza(zza.zzpx)) == null) {
            String valueOf = String.valueOf(zzl);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 54);
            stringBuilder.append("Expected a ServingValue and didn't get one. Value is: ");
            stringBuilder.append(valueOf);
            zzcf(stringBuilder.toString());
        }
        return (zza) zzl.zza(zza.zzpx);
    }

    private static void zzcf(String str) {
        zzdi.zzav(str);
        throw new zzoz(str);
    }

    private static <T> T zza(T[] tArr, int i, String str) {
        if (i < 0 || i >= tArr.length) {
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 45);
            stringBuilder.append("Index out of bounds detected: ");
            stringBuilder.append(i);
            stringBuilder.append(" in ");
            stringBuilder.append(str);
            zzcf(stringBuilder.toString());
        }
        return tArr[i];
    }

    private static zzot zza(zzb zzb, zzi zzi, zzl[] zzlArr, int i) {
        zzou zzml = zzot.zzml();
        for (Integer intValue : zzb.zze()) {
            zzd zzd = (zzd) zza(zzi.zzpk, intValue.intValue(), "properties");
            String str = (String) zza(zzi.zzpi, zzd.zzl(), "keys");
            zzl zzl = (zzl) zza(zzlArr, zzd.getValue(), "values");
            if (zzb.PUSH_AFTER_EVALUATE.toString().equals(str)) {
                zzml.zzm(zzl);
            } else {
                zzml.zzb(str, zzl);
            }
        }
        return zzml.zzmm();
    }

    public static void zza(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }
}
