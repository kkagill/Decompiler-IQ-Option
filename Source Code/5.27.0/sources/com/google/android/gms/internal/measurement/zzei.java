package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzey.zzd;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

final class zzei implements zzim {
    private final zzee zzadn;

    public static zzei zza(zzee zzee) {
        if (zzee.zzaed != null) {
            return zzee.zzaed;
        }
        return new zzei(zzee);
    }

    private zzei(zzee zzee) {
        this.zzadn = (zzee) zzez.zza((Object) zzee, "output");
    }

    public final int zztk() {
        return zzd.zzaio;
    }

    public final void zzm(int i, int i2) {
        this.zzadn.zzf(i, i2);
    }

    public final void zzi(int i, long j) {
        this.zzadn.zza(i, j);
    }

    public final void zzj(int i, long j) {
        this.zzadn.zzc(i, j);
    }

    public final void zza(int i, float f) {
        this.zzadn.zza(i, f);
    }

    public final void zza(int i, double d) {
        this.zzadn.zza(i, d);
    }

    public final void zzn(int i, int i2) {
        this.zzadn.zzc(i, i2);
    }

    public final void zza(int i, long j) {
        this.zzadn.zza(i, j);
    }

    public final void zzc(int i, int i2) {
        this.zzadn.zzc(i, i2);
    }

    public final void zzc(int i, long j) {
        this.zzadn.zzc(i, j);
    }

    public final void zzf(int i, int i2) {
        this.zzadn.zzf(i, i2);
    }

    public final void zzb(int i, boolean z) {
        this.zzadn.zzb(i, z);
    }

    public final void zzb(int i, String str) {
        this.zzadn.zzb(i, str);
    }

    public final void zza(int i, zzdp zzdp) {
        this.zzadn.zza(i, zzdp);
    }

    public final void zzd(int i, int i2) {
        this.zzadn.zzd(i, i2);
    }

    public final void zze(int i, int i2) {
        this.zzadn.zze(i, i2);
    }

    public final void zzb(int i, long j) {
        this.zzadn.zzb(i, j);
    }

    public final void zza(int i, Object obj, zzgx zzgx) {
        this.zzadn.zza(i, (zzgi) obj, zzgx);
    }

    public final void zzb(int i, Object obj, zzgx zzgx) {
        zzee zzee = this.zzadn;
        zzgi zzgi = (zzgi) obj;
        zzee.zzb(i, 3);
        zzgx.zza(zzgi, zzee.zzaed);
        zzee.zzb(i, 4);
    }

    public final void zzbr(int i) {
        this.zzadn.zzb(i, 3);
    }

    public final void zzbs(int i) {
        this.zzadn.zzb(i, 4);
    }

    public final void zza(int i, Object obj) {
        if (obj instanceof zzdp) {
            this.zzadn.zzb(i, (zzdp) obj);
        } else {
            this.zzadn.zzb(i, (zzgi) obj);
        }
    }

    public final void zza(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.zzadn.zzb(i, 2);
            int i3 = 0;
            for (i = 0; i < list.size(); i++) {
                i3 += zzee.zzbj(((Integer) list.get(i)).intValue());
            }
            this.zzadn.zzbf(i3);
            while (i2 < list.size()) {
                this.zzadn.zzbe(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzadn.zzc(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public final void zzb(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.zzadn.zzb(i, 2);
            int i3 = 0;
            for (i = 0; i < list.size(); i++) {
                i3 += zzee.zzbm(((Integer) list.get(i)).intValue());
            }
            this.zzadn.zzbf(i3);
            while (i2 < list.size()) {
                this.zzadn.zzbh(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzadn.zzf(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public final void zzc(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.zzadn.zzb(i, 2);
            int i3 = 0;
            for (i = 0; i < list.size(); i++) {
                i3 += zzee.zzbq(((Long) list.get(i)).longValue());
            }
            this.zzadn.zzbf(i3);
            while (i2 < list.size()) {
                this.zzadn.zzbn(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzadn.zza(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public final void zzd(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.zzadn.zzb(i, 2);
            int i3 = 0;
            for (i = 0; i < list.size(); i++) {
                i3 += zzee.zzbr(((Long) list.get(i)).longValue());
            }
            this.zzadn.zzbf(i3);
            while (i2 < list.size()) {
                this.zzadn.zzbn(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzadn.zza(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public final void zze(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.zzadn.zzb(i, 2);
            int i3 = 0;
            for (i = 0; i < list.size(); i++) {
                i3 += zzee.zzbt(((Long) list.get(i)).longValue());
            }
            this.zzadn.zzbf(i3);
            while (i2 < list.size()) {
                this.zzadn.zzbp(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzadn.zzc(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public final void zzf(int i, List<Float> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.zzadn.zzb(i, 2);
            int i3 = 0;
            for (i = 0; i < list.size(); i++) {
                i3 += zzee.zzb(((Float) list.get(i)).floatValue());
            }
            this.zzadn.zzbf(i3);
            while (i2 < list.size()) {
                this.zzadn.zza(((Float) list.get(i2)).floatValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzadn.zza(i, ((Float) list.get(i2)).floatValue());
            i2++;
        }
    }

    public final void zzg(int i, List<Double> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.zzadn.zzb(i, 2);
            int i3 = 0;
            for (i = 0; i < list.size(); i++) {
                i3 += zzee.zze(((Double) list.get(i)).doubleValue());
            }
            this.zzadn.zzbf(i3);
            while (i2 < list.size()) {
                this.zzadn.zzd(((Double) list.get(i2)).doubleValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzadn.zza(i, ((Double) list.get(i2)).doubleValue());
            i2++;
        }
    }

    public final void zzh(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.zzadn.zzb(i, 2);
            int i3 = 0;
            for (i = 0; i < list.size(); i++) {
                i3 += zzee.zzbo(((Integer) list.get(i)).intValue());
            }
            this.zzadn.zzbf(i3);
            while (i2 < list.size()) {
                this.zzadn.zzbe(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzadn.zzc(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public final void zzi(int i, List<Boolean> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.zzadn.zzb(i, 2);
            int i3 = 0;
            for (i = 0; i < list.size(); i++) {
                i3 += zzee.zzr(((Boolean) list.get(i)).booleanValue());
            }
            this.zzadn.zzbf(i3);
            while (i2 < list.size()) {
                this.zzadn.zzq(((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzadn.zzb(i, ((Boolean) list.get(i2)).booleanValue());
            i2++;
        }
    }

    public final void zza(int i, List<String> list) {
        int i2 = 0;
        if (list instanceof zzfp) {
            zzfp zzfp = (zzfp) list;
            while (i2 < list.size()) {
                Object zzbw = zzfp.zzbw(i2);
                if (zzbw instanceof String) {
                    this.zzadn.zzb(i, (String) zzbw);
                } else {
                    this.zzadn.zza(i, (zzdp) zzbw);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzadn.zzb(i, (String) list.get(i2));
            i2++;
        }
    }

    public final void zzb(int i, List<zzdp> list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.zzadn.zza(i, (zzdp) list.get(i2));
        }
    }

    public final void zzj(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.zzadn.zzb(i, 2);
            int i3 = 0;
            for (i = 0; i < list.size(); i++) {
                i3 += zzee.zzbk(((Integer) list.get(i)).intValue());
            }
            this.zzadn.zzbf(i3);
            while (i2 < list.size()) {
                this.zzadn.zzbf(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzadn.zzd(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public final void zzk(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.zzadn.zzb(i, 2);
            int i3 = 0;
            for (i = 0; i < list.size(); i++) {
                i3 += zzee.zzbn(((Integer) list.get(i)).intValue());
            }
            this.zzadn.zzbf(i3);
            while (i2 < list.size()) {
                this.zzadn.zzbh(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzadn.zzf(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public final void zzl(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.zzadn.zzb(i, 2);
            int i3 = 0;
            for (i = 0; i < list.size(); i++) {
                i3 += zzee.zzbu(((Long) list.get(i)).longValue());
            }
            this.zzadn.zzbf(i3);
            while (i2 < list.size()) {
                this.zzadn.zzbp(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzadn.zzc(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public final void zzm(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.zzadn.zzb(i, 2);
            int i3 = 0;
            for (i = 0; i < list.size(); i++) {
                i3 += zzee.zzbl(((Integer) list.get(i)).intValue());
            }
            this.zzadn.zzbf(i3);
            while (i2 < list.size()) {
                this.zzadn.zzbg(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzadn.zze(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public final void zzn(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.zzadn.zzb(i, 2);
            int i3 = 0;
            for (i = 0; i < list.size(); i++) {
                i3 += zzee.zzbs(((Long) list.get(i)).longValue());
            }
            this.zzadn.zzbf(i3);
            while (i2 < list.size()) {
                this.zzadn.zzbo(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzadn.zzb(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public final void zza(int i, List<?> list, zzgx zzgx) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            zza(i, list.get(i2), zzgx);
        }
    }

    public final void zzb(int i, List<?> list, zzgx zzgx) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzb(i, list.get(i2), zzgx);
        }
    }

    public final <K, V> void zza(int i, zzfz<K, V> zzfz, Map<K, V> map) {
        for (Entry entry : map.entrySet()) {
            this.zzadn.zzb(i, 2);
            this.zzadn.zzbf(zzga.zza(zzfz, entry.getKey(), entry.getValue()));
            zzga.zza(this.zzadn, zzfz, entry.getKey(), entry.getValue());
        }
    }
}
