package com.google.android.gms.internal.gtm;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

final class zztb {
    private static final Class<?> zzbdu = zzqy();
    private static final zztr<?, ?> zzbdv = zzl(false);
    private static final zztr<?, ?> zzbdw = zzl(true);
    private static final zztr<?, ?> zzbdx = new zztt();

    public static void zzj(Class<?> cls) {
        if (!zzrc.class.isAssignableFrom(cls)) {
            Class cls2 = zzbdu;
            if (cls2 != null && !cls2.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            }
        }
    }

    public static void zza(int i, List<Double> list, zzum zzum, boolean z) {
        if (list != null && !list.isEmpty()) {
            zzum.zzg(i, list, z);
        }
    }

    public static void zzb(int i, List<Float> list, zzum zzum, boolean z) {
        if (list != null && !list.isEmpty()) {
            zzum.zzf(i, list, z);
        }
    }

    public static void zzc(int i, List<Long> list, zzum zzum, boolean z) {
        if (list != null && !list.isEmpty()) {
            zzum.zzc(i, list, z);
        }
    }

    public static void zzd(int i, List<Long> list, zzum zzum, boolean z) {
        if (list != null && !list.isEmpty()) {
            zzum.zzd(i, list, z);
        }
    }

    public static void zze(int i, List<Long> list, zzum zzum, boolean z) {
        if (list != null && !list.isEmpty()) {
            zzum.zzn(i, list, z);
        }
    }

    public static void zzf(int i, List<Long> list, zzum zzum, boolean z) {
        if (list != null && !list.isEmpty()) {
            zzum.zze(i, list, z);
        }
    }

    public static void zzg(int i, List<Long> list, zzum zzum, boolean z) {
        if (list != null && !list.isEmpty()) {
            zzum.zzl(i, list, z);
        }
    }

    public static void zzh(int i, List<Integer> list, zzum zzum, boolean z) {
        if (list != null && !list.isEmpty()) {
            zzum.zza(i, (List) list, z);
        }
    }

    public static void zzi(int i, List<Integer> list, zzum zzum, boolean z) {
        if (list != null && !list.isEmpty()) {
            zzum.zzj(i, list, z);
        }
    }

    public static void zzj(int i, List<Integer> list, zzum zzum, boolean z) {
        if (list != null && !list.isEmpty()) {
            zzum.zzm(i, list, z);
        }
    }

    public static void zzk(int i, List<Integer> list, zzum zzum, boolean z) {
        if (list != null && !list.isEmpty()) {
            zzum.zzb(i, (List) list, z);
        }
    }

    public static void zzl(int i, List<Integer> list, zzum zzum, boolean z) {
        if (list != null && !list.isEmpty()) {
            zzum.zzk(i, list, z);
        }
    }

    public static void zzm(int i, List<Integer> list, zzum zzum, boolean z) {
        if (list != null && !list.isEmpty()) {
            zzum.zzh(i, list, z);
        }
    }

    public static void zzn(int i, List<Boolean> list, zzum zzum, boolean z) {
        if (list != null && !list.isEmpty()) {
            zzum.zzi(i, list, z);
        }
    }

    public static void zza(int i, List<String> list, zzum zzum) {
        if (list != null && !list.isEmpty()) {
            zzum.zza(i, (List) list);
        }
    }

    public static void zzb(int i, List<zzps> list, zzum zzum) {
        if (list != null && !list.isEmpty()) {
            zzum.zzb(i, (List) list);
        }
    }

    public static void zza(int i, List<?> list, zzum zzum, zzsz zzsz) {
        if (list != null && !list.isEmpty()) {
            zzum.zza(i, (List) list, zzsz);
        }
    }

    public static void zzb(int i, List<?> list, zzum zzum, zzsz zzsz) {
        if (list != null && !list.isEmpty()) {
            zzum.zzb(i, (List) list, zzsz);
        }
    }

    static int zzw(List<Long> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        int i2;
        if (list instanceof zzry) {
            zzry zzry = (zzry) list;
            i2 = 0;
            while (i < size) {
                i2 += zzqj.zzs(zzry.getLong(i));
                i++;
            }
        } else {
            i2 = 0;
            while (i < size) {
                i2 += zzqj.zzs(((Long) list.get(i)).longValue());
                i++;
            }
        }
        return i2;
    }

    static int zzo(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return zzw(list) + (list.size() * zzqj.zzbb(i));
    }

    static int zzx(List<Long> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        int i2;
        if (list instanceof zzry) {
            zzry zzry = (zzry) list;
            i2 = 0;
            while (i < size) {
                i2 += zzqj.zzt(zzry.getLong(i));
                i++;
            }
        } else {
            i2 = 0;
            while (i < size) {
                i2 += zzqj.zzt(((Long) list.get(i)).longValue());
                i++;
            }
        }
        return i2;
    }

    static int zzp(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzx(list) + (size * zzqj.zzbb(i));
    }

    static int zzy(List<Long> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        int i2;
        if (list instanceof zzry) {
            zzry zzry = (zzry) list;
            i2 = 0;
            while (i < size) {
                i2 += zzqj.zzu(zzry.getLong(i));
                i++;
            }
        } else {
            i2 = 0;
            while (i < size) {
                i2 += zzqj.zzu(((Long) list.get(i)).longValue());
                i++;
            }
        }
        return i2;
    }

    static int zzq(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzy(list) + (size * zzqj.zzbb(i));
    }

    static int zzz(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        int i2;
        if (list instanceof zzrd) {
            zzrd zzrd = (zzrd) list;
            i2 = 0;
            while (i < size) {
                i2 += zzqj.zzbh(zzrd.getInt(i));
                i++;
            }
        } else {
            i2 = 0;
            while (i < size) {
                i2 += zzqj.zzbh(((Integer) list.get(i)).intValue());
                i++;
            }
        }
        return i2;
    }

    static int zzr(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzz(list) + (size * zzqj.zzbb(i));
    }

    static int zzaa(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        int i2;
        if (list instanceof zzrd) {
            zzrd zzrd = (zzrd) list;
            i2 = 0;
            while (i < size) {
                i2 += zzqj.zzbc(zzrd.getInt(i));
                i++;
            }
        } else {
            i2 = 0;
            while (i < size) {
                i2 += zzqj.zzbc(((Integer) list.get(i)).intValue());
                i++;
            }
        }
        return i2;
    }

    static int zzs(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzaa(list) + (size * zzqj.zzbb(i));
    }

    static int zzab(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        int i2;
        if (list instanceof zzrd) {
            zzrd zzrd = (zzrd) list;
            i2 = 0;
            while (i < size) {
                i2 += zzqj.zzbd(zzrd.getInt(i));
                i++;
            }
        } else {
            i2 = 0;
            while (i < size) {
                i2 += zzqj.zzbd(((Integer) list.get(i)).intValue());
                i++;
            }
        }
        return i2;
    }

    static int zzt(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzab(list) + (size * zzqj.zzbb(i));
    }

    static int zzac(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        int i2;
        if (list instanceof zzrd) {
            zzrd zzrd = (zzrd) list;
            i2 = 0;
            while (i < size) {
                i2 += zzqj.zzbe(zzrd.getInt(i));
                i++;
            }
        } else {
            i2 = 0;
            while (i < size) {
                i2 += zzqj.zzbe(((Integer) list.get(i)).intValue());
                i++;
            }
        }
        return i2;
    }

    static int zzu(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzac(list) + (size * zzqj.zzbb(i));
    }

    static int zzad(List<?> list) {
        return list.size() << 2;
    }

    static int zzv(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzqj.zzl(i, 0);
    }

    static int zzae(List<?> list) {
        return list.size() << 3;
    }

    static int zzw(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzqj.zzg(i, 0);
    }

    static int zzaf(List<?> list) {
        return list.size();
    }

    static int zzx(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzqj.zzc(i, true);
    }

    static int zzc(int i, List<?> list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        i = zzqj.zzbb(i) * size;
        Object zzbn;
        int zzb;
        if (list instanceof zzrt) {
            zzrt zzrt = (zzrt) list;
            while (i2 < size) {
                zzbn = zzrt.zzbn(i2);
                if (zzbn instanceof zzps) {
                    zzb = zzqj.zzb((zzps) zzbn);
                } else {
                    zzb = zzqj.zzda((String) zzbn);
                }
                i += zzb;
                i2++;
            }
        } else {
            while (i2 < size) {
                zzbn = list.get(i2);
                if (zzbn instanceof zzps) {
                    zzb = zzqj.zzb((zzps) zzbn);
                } else {
                    zzb = zzqj.zzda((String) zzbn);
                }
                i += zzb;
                i2++;
            }
        }
        return i;
    }

    static int zzc(int i, Object obj, zzsz zzsz) {
        if (obj instanceof zzrr) {
            return zzqj.zza(i, (zzrr) obj);
        }
        return zzqj.zzb(i, (zzsk) obj, zzsz);
    }

    static int zzc(int i, List<?> list, zzsz zzsz) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        i = zzqj.zzbb(i) * size;
        while (i2 < size) {
            int zza;
            Object obj = list.get(i2);
            if (obj instanceof zzrr) {
                zza = zzqj.zza((zzrr) obj);
            } else {
                zza = zzqj.zzb((zzsk) obj, zzsz);
            }
            i += zza;
            i2++;
        }
        return i;
    }

    static int zzd(int i, List<zzps> list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        size *= zzqj.zzbb(i);
        while (i2 < list.size()) {
            size += zzqj.zzb((zzps) list.get(i2));
            i2++;
        }
        return size;
    }

    static int zzd(int i, List<zzsk> list, zzsz zzsz) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int i3 = 0;
        while (i2 < size) {
            i3 += zzqj.zzc(i, (zzsk) list.get(i2), zzsz);
            i2++;
        }
        return i3;
    }

    public static zztr<?, ?> zzqv() {
        return zzbdv;
    }

    public static zztr<?, ?> zzqw() {
        return zzbdw;
    }

    public static zztr<?, ?> zzqx() {
        return zzbdx;
    }

    private static zztr<?, ?> zzl(boolean z) {
        try {
            Class zzqz = zzqz();
            if (zzqz == null) {
                return null;
            }
            return (zztr) zzqz.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> zzqy() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> zzqz() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean zze(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    static <T> void zza(zzsf zzsf, T t, T t2, long j) {
        zztx.zza((Object) t, j, zzsf.zzc(zztx.zzp(t, j), zztx.zzp(t2, j)));
    }

    static <T, FT extends zzqv<FT>> void zza(zzqq<FT> zzqq, T t, T t2) {
        zzqt zzr = zzqq.zzr(t2);
        if (!zzr.zzaxo.isEmpty()) {
            zzqq.zzs(t).zza(zzr);
        }
    }

    static <T, UT, UB> void zza(zztr<UT, UB> zztr, T t, T t2) {
        zztr.zzf(t, zztr.zzh(zztr.zzag(t), zztr.zzag(t2)));
    }

    static <UT, UB> UB zza(int i, List<Integer> list, zzrh zzrh, UB ub, zztr<UT, UB> zztr) {
        if (zzrh == null) {
            return ub;
        }
        UB ub2;
        int intValue;
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            loop1:
            while (true) {
                ub2 = ub;
                while (it.hasNext()) {
                    intValue = ((Integer) it.next()).intValue();
                    if (!zzrh.zzb(intValue)) {
                        ub = zza(i, intValue, (Object) ub2, (zztr) zztr);
                        it.remove();
                    }
                }
                break loop1;
            }
        }
        int size = list.size();
        ub2 = ub;
        intValue = 0;
        for (int i2 = 0; i2 < size; i2++) {
            int intValue2 = ((Integer) list.get(i2)).intValue();
            if (zzrh.zzb(intValue2)) {
                if (i2 != intValue) {
                    list.set(intValue, Integer.valueOf(intValue2));
                }
                intValue++;
            } else {
                ub2 = zza(i, intValue2, (Object) ub2, (zztr) zztr);
            }
        }
        if (intValue != size) {
            list.subList(intValue, size).clear();
        }
        return ub2;
    }

    static <UT, UB> UB zza(int i, int i2, UB ub, zztr<UT, UB> zztr) {
        Object ub2;
        if (ub2 == null) {
            ub2 = zztr.zzri();
        }
        zztr.zza(ub2, i, (long) i2);
        return ub2;
    }
}
