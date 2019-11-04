package com.google.android.gms.internal.vision;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

final class zzhy {
    private static final Class<?> zzaaa = zzgs();
    private static final zzio<?, ?> zzaab = zzk(false);
    private static final zzio<?, ?> zzaac = zzk(true);
    private static final zzio<?, ?> zzaad = new zziq();

    public static void zzg(Class<?> cls) {
        if (!zzfy.class.isAssignableFrom(cls)) {
            Class cls2 = zzaaa;
            if (cls2 != null && !cls2.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            }
        }
    }

    public static void zza(int i, List<Double> list, zzjj zzjj, boolean z) {
        if (list != null && !list.isEmpty()) {
            zzjj.zzg(i, list, z);
        }
    }

    public static void zzb(int i, List<Float> list, zzjj zzjj, boolean z) {
        if (list != null && !list.isEmpty()) {
            zzjj.zzf(i, list, z);
        }
    }

    public static void zzc(int i, List<Long> list, zzjj zzjj, boolean z) {
        if (list != null && !list.isEmpty()) {
            zzjj.zzc(i, list, z);
        }
    }

    public static void zzd(int i, List<Long> list, zzjj zzjj, boolean z) {
        if (list != null && !list.isEmpty()) {
            zzjj.zzd(i, list, z);
        }
    }

    public static void zze(int i, List<Long> list, zzjj zzjj, boolean z) {
        if (list != null && !list.isEmpty()) {
            zzjj.zzn(i, list, z);
        }
    }

    public static void zzf(int i, List<Long> list, zzjj zzjj, boolean z) {
        if (list != null && !list.isEmpty()) {
            zzjj.zze(i, list, z);
        }
    }

    public static void zzg(int i, List<Long> list, zzjj zzjj, boolean z) {
        if (list != null && !list.isEmpty()) {
            zzjj.zzl(i, list, z);
        }
    }

    public static void zzh(int i, List<Integer> list, zzjj zzjj, boolean z) {
        if (list != null && !list.isEmpty()) {
            zzjj.zza(i, (List) list, z);
        }
    }

    public static void zzi(int i, List<Integer> list, zzjj zzjj, boolean z) {
        if (list != null && !list.isEmpty()) {
            zzjj.zzj(i, list, z);
        }
    }

    public static void zzj(int i, List<Integer> list, zzjj zzjj, boolean z) {
        if (list != null && !list.isEmpty()) {
            zzjj.zzm(i, list, z);
        }
    }

    public static void zzk(int i, List<Integer> list, zzjj zzjj, boolean z) {
        if (list != null && !list.isEmpty()) {
            zzjj.zzb(i, (List) list, z);
        }
    }

    public static void zzl(int i, List<Integer> list, zzjj zzjj, boolean z) {
        if (list != null && !list.isEmpty()) {
            zzjj.zzk(i, list, z);
        }
    }

    public static void zzm(int i, List<Integer> list, zzjj zzjj, boolean z) {
        if (list != null && !list.isEmpty()) {
            zzjj.zzh(i, list, z);
        }
    }

    public static void zzn(int i, List<Boolean> list, zzjj zzjj, boolean z) {
        if (list != null && !list.isEmpty()) {
            zzjj.zzi(i, list, z);
        }
    }

    public static void zza(int i, List<String> list, zzjj zzjj) {
        if (list != null && !list.isEmpty()) {
            zzjj.zza(i, (List) list);
        }
    }

    public static void zzb(int i, List<zzeo> list, zzjj zzjj) {
        if (list != null && !list.isEmpty()) {
            zzjj.zzb(i, (List) list);
        }
    }

    public static void zza(int i, List<?> list, zzjj zzjj, zzhw zzhw) {
        if (list != null && !list.isEmpty()) {
            zzjj.zza(i, (List) list, zzhw);
        }
    }

    public static void zzb(int i, List<?> list, zzjj zzjj, zzhw zzhw) {
        if (list != null && !list.isEmpty()) {
            zzjj.zzb(i, (List) list, zzhw);
        }
    }

    static int zzq(List<Long> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        int i2;
        if (list instanceof zzgt) {
            zzgt zzgt = (zzgt) list;
            i2 = 0;
            while (i < size) {
                i2 += zzfe.zzh(zzgt.getLong(i));
                i++;
            }
        } else {
            i2 = 0;
            while (i < size) {
                i2 += zzfe.zzh(((Long) list.get(i)).longValue());
                i++;
            }
        }
        return i2;
    }

    static int zzo(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return zzq(list) + (list.size() * zzfe.zzav(i));
    }

    static int zzr(List<Long> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        int i2;
        if (list instanceof zzgt) {
            zzgt zzgt = (zzgt) list;
            i2 = 0;
            while (i < size) {
                i2 += zzfe.zzi(zzgt.getLong(i));
                i++;
            }
        } else {
            i2 = 0;
            while (i < size) {
                i2 += zzfe.zzi(((Long) list.get(i)).longValue());
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
        return zzr(list) + (size * zzfe.zzav(i));
    }

    static int zzs(List<Long> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        int i2;
        if (list instanceof zzgt) {
            zzgt zzgt = (zzgt) list;
            i2 = 0;
            while (i < size) {
                i2 += zzfe.zzj(zzgt.getLong(i));
                i++;
            }
        } else {
            i2 = 0;
            while (i < size) {
                i2 += zzfe.zzj(((Long) list.get(i)).longValue());
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
        return zzs(list) + (size * zzfe.zzav(i));
    }

    static int zzt(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        int i2;
        if (list instanceof zzfz) {
            zzfz zzfz = (zzfz) list;
            i2 = 0;
            while (i < size) {
                i2 += zzfe.zzbb(zzfz.getInt(i));
                i++;
            }
        } else {
            i2 = 0;
            while (i < size) {
                i2 += zzfe.zzbb(((Integer) list.get(i)).intValue());
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
        return zzt(list) + (size * zzfe.zzav(i));
    }

    static int zzu(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        int i2;
        if (list instanceof zzfz) {
            zzfz zzfz = (zzfz) list;
            i2 = 0;
            while (i < size) {
                i2 += zzfe.zzaw(zzfz.getInt(i));
                i++;
            }
        } else {
            i2 = 0;
            while (i < size) {
                i2 += zzfe.zzaw(((Integer) list.get(i)).intValue());
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
        return zzu(list) + (size * zzfe.zzav(i));
    }

    static int zzv(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        int i2;
        if (list instanceof zzfz) {
            zzfz zzfz = (zzfz) list;
            i2 = 0;
            while (i < size) {
                i2 += zzfe.zzax(zzfz.getInt(i));
                i++;
            }
        } else {
            i2 = 0;
            while (i < size) {
                i2 += zzfe.zzax(((Integer) list.get(i)).intValue());
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
        return zzv(list) + (size * zzfe.zzav(i));
    }

    static int zzw(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        int i2;
        if (list instanceof zzfz) {
            zzfz zzfz = (zzfz) list;
            i2 = 0;
            while (i < size) {
                i2 += zzfe.zzay(zzfz.getInt(i));
                i++;
            }
        } else {
            i2 = 0;
            while (i < size) {
                i2 += zzfe.zzay(((Integer) list.get(i)).intValue());
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
        return zzw(list) + (size * zzfe.zzav(i));
    }

    static int zzx(List<?> list) {
        return list.size() << 2;
    }

    static int zzv(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzfe.zzl(i, 0);
    }

    static int zzy(List<?> list) {
        return list.size() << 3;
    }

    static int zzw(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzfe.zzg(i, 0);
    }

    static int zzz(List<?> list) {
        return list.size();
    }

    static int zzx(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzfe.zzc(i, true);
    }

    static int zzc(int i, List<?> list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        i = zzfe.zzav(i) * size;
        Object raw;
        int zzb;
        if (list instanceof zzgo) {
            zzgo zzgo = (zzgo) list;
            while (i2 < size) {
                raw = zzgo.getRaw(i2);
                if (raw instanceof zzeo) {
                    zzb = zzfe.zzb((zzeo) raw);
                } else {
                    zzb = zzfe.zzn((String) raw);
                }
                i += zzb;
                i2++;
            }
        } else {
            while (i2 < size) {
                raw = list.get(i2);
                if (raw instanceof zzeo) {
                    zzb = zzfe.zzb((zzeo) raw);
                } else {
                    zzb = zzfe.zzn((String) raw);
                }
                i += zzb;
                i2++;
            }
        }
        return i;
    }

    static int zzc(int i, Object obj, zzhw zzhw) {
        if (obj instanceof zzgm) {
            return zzfe.zza(i, (zzgm) obj);
        }
        return zzfe.zzb(i, (zzhf) obj, zzhw);
    }

    static int zzc(int i, List<?> list, zzhw zzhw) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        i = zzfe.zzav(i) * size;
        while (i2 < size) {
            int zza;
            Object obj = list.get(i2);
            if (obj instanceof zzgm) {
                zza = zzfe.zza((zzgm) obj);
            } else {
                zza = zzfe.zzb((zzhf) obj, zzhw);
            }
            i += zza;
            i2++;
        }
        return i;
    }

    static int zzd(int i, List<zzeo> list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        size *= zzfe.zzav(i);
        while (i2 < list.size()) {
            size += zzfe.zzb((zzeo) list.get(i2));
            i2++;
        }
        return size;
    }

    static int zzd(int i, List<zzhf> list, zzhw zzhw) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int i3 = 0;
        while (i2 < size) {
            i3 += zzfe.zzc(i, (zzhf) list.get(i2), zzhw);
            i2++;
        }
        return i3;
    }

    public static zzio<?, ?> zzgp() {
        return zzaab;
    }

    public static zzio<?, ?> zzgq() {
        return zzaac;
    }

    public static zzio<?, ?> zzgr() {
        return zzaad;
    }

    private static zzio<?, ?> zzk(boolean z) {
        try {
            Class zzgt = zzgt();
            if (zzgt == null) {
                return null;
            }
            return (zzio) zzgt.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> zzgs() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> zzgt() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean zzd(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    static <T> void zza(zzha zzha, T t, T t2, long j) {
        zziu.zza((Object) t, j, zzha.zzb(zziu.zzp(t, j), zziu.zzp(t2, j)));
    }

    static <T, FT extends zzfr<FT>> void zza(zzfl<FT> zzfl, T t, T t2) {
        zzfp zzc = zzfl.zzc(t2);
        if (!zzc.isEmpty()) {
            zzfl.zzd(t).zza(zzc);
        }
    }

    static <T, UT, UB> void zza(zzio<UT, UB> zzio, T t, T t2) {
        zzio.zze(t, zzio.zzg(zzio.zzt(t), zzio.zzt(t2)));
    }

    static <UT, UB> UB zza(int i, List<Integer> list, zzgc<?> zzgc, UB ub, zzio<UT, UB> zzio) {
        if (zzgc == null) {
            return ub;
        }
        int size = list.size();
        Object obj = ub;
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            int intValue = ((Integer) list.get(i3)).intValue();
            if (zzgc.zzf(intValue) != null) {
                if (i3 != i2) {
                    list.set(i2, Integer.valueOf(intValue));
                }
                i2++;
            } else {
                obj = zza(i, intValue, obj, (zzio) zzio);
            }
        }
        if (i2 != size) {
            list.subList(i2, size).clear();
        }
        return obj;
    }

    static <UT, UB> UB zza(int i, List<Integer> list, zzgd zzgd, UB ub, zzio<UT, UB> zzio) {
        if (zzgd == null) {
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
                    if (!zzgd.zzh(intValue)) {
                        ub = zza(i, intValue, (Object) ub2, (zzio) zzio);
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
            if (zzgd.zzh(intValue2)) {
                if (i2 != intValue) {
                    list.set(intValue, Integer.valueOf(intValue2));
                }
                intValue++;
            } else {
                ub2 = zza(i, intValue2, (Object) ub2, (zzio) zzio);
            }
        }
        if (intValue != size) {
            list.subList(intValue, size).clear();
        }
        return ub2;
    }

    static <UT, UB> UB zza(int i, int i2, UB ub, zzio<UT, UB> zzio) {
        Object ub2;
        if (ub2 == null) {
            ub2 = zzio.zzhd();
        }
        zzio.zza(ub2, i, (long) i2);
        return ub2;
    }
}
