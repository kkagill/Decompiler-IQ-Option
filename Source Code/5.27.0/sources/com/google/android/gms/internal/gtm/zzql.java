package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzrc.zze;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

final class zzql implements zzum {
    private final zzqj zzawd;

    public static zzql zza(zzqj zzqj) {
        if (zzqj.zzawu != null) {
            return zzqj.zzawu;
        }
        return new zzql(zzqj);
    }

    private zzql(zzqj zzqj) {
        this.zzawd = (zzqj) zzre.zza(zzqj, "output");
    }

    public final int zzol() {
        return zze.zzbbc;
    }

    public final void zzo(int i, int i2) {
        this.zzawd.zzh(i, i2);
    }

    public final void zzi(int i, long j) {
        this.zzawd.zza(i, j);
    }

    public final void zzj(int i, long j) {
        this.zzawd.zzc(i, j);
    }

    public final void zza(int i, float f) {
        this.zzawd.zza(i, f);
    }

    public final void zza(int i, double d) {
        this.zzawd.zza(i, d);
    }

    public final void zzp(int i, int i2) {
        this.zzawd.zze(i, i2);
    }

    public final void zza(int i, long j) {
        this.zzawd.zza(i, j);
    }

    public final void zze(int i, int i2) {
        this.zzawd.zze(i, i2);
    }

    public final void zzc(int i, long j) {
        this.zzawd.zzc(i, j);
    }

    public final void zzh(int i, int i2) {
        this.zzawd.zzh(i, i2);
    }

    public final void zzb(int i, boolean z) {
        this.zzawd.zzb(i, z);
    }

    public final void zza(int i, String str) {
        this.zzawd.zza(i, str);
    }

    public final void zza(int i, zzps zzps) {
        this.zzawd.zza(i, zzps);
    }

    public final void zzf(int i, int i2) {
        this.zzawd.zzf(i, i2);
    }

    public final void zzg(int i, int i2) {
        this.zzawd.zzg(i, i2);
    }

    public final void zzb(int i, long j) {
        this.zzawd.zzb(i, j);
    }

    public final void zza(int i, Object obj, zzsz zzsz) {
        this.zzawd.zza(i, (zzsk) obj, zzsz);
    }

    public final void zzb(int i, Object obj, zzsz zzsz) {
        zzqj zzqj = this.zzawd;
        zzsk zzsk = (zzsk) obj;
        zzqj.zzd(i, 3);
        zzsz.zza(zzsk, zzqj.zzawu);
        zzqj.zzd(i, 4);
    }

    public final void zzbk(int i) {
        this.zzawd.zzd(i, 3);
    }

    public final void zzbl(int i) {
        this.zzawd.zzd(i, 4);
    }

    public final void zza(int i, Object obj) {
        if (obj instanceof zzps) {
            this.zzawd.zzb(i, (zzps) obj);
        } else {
            this.zzawd.zzb(i, (zzsk) obj);
        }
    }

    public final void zza(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.zzawd.zzd(i, 2);
            int i3 = 0;
            for (i = 0; i < list.size(); i++) {
                i3 += zzqj.zzbc(((Integer) list.get(i)).intValue());
            }
            this.zzawd.zzay(i3);
            while (i2 < list.size()) {
                this.zzawd.zzax(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzawd.zze(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public final void zzb(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.zzawd.zzd(i, 2);
            int i3 = 0;
            for (i = 0; i < list.size(); i++) {
                i3 += zzqj.zzbf(((Integer) list.get(i)).intValue());
            }
            this.zzawd.zzay(i3);
            while (i2 < list.size()) {
                this.zzawd.zzba(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzawd.zzh(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public final void zzc(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.zzawd.zzd(i, 2);
            int i3 = 0;
            for (i = 0; i < list.size(); i++) {
                i3 += zzqj.zzs(((Long) list.get(i)).longValue());
            }
            this.zzawd.zzay(i3);
            while (i2 < list.size()) {
                this.zzawd.zzp(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzawd.zza(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public final void zzd(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.zzawd.zzd(i, 2);
            int i3 = 0;
            for (i = 0; i < list.size(); i++) {
                i3 += zzqj.zzt(((Long) list.get(i)).longValue());
            }
            this.zzawd.zzay(i3);
            while (i2 < list.size()) {
                this.zzawd.zzp(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzawd.zza(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public final void zze(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.zzawd.zzd(i, 2);
            int i3 = 0;
            for (i = 0; i < list.size(); i++) {
                i3 += zzqj.zzv(((Long) list.get(i)).longValue());
            }
            this.zzawd.zzay(i3);
            while (i2 < list.size()) {
                this.zzawd.zzr(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzawd.zzc(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public final void zzf(int i, List<Float> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.zzawd.zzd(i, 2);
            int i3 = 0;
            for (i = 0; i < list.size(); i++) {
                i3 += zzqj.zzb(((Float) list.get(i)).floatValue());
            }
            this.zzawd.zzay(i3);
            while (i2 < list.size()) {
                this.zzawd.zza(((Float) list.get(i2)).floatValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzawd.zza(i, ((Float) list.get(i2)).floatValue());
            i2++;
        }
    }

    public final void zzg(int i, List<Double> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.zzawd.zzd(i, 2);
            int i3 = 0;
            for (i = 0; i < list.size(); i++) {
                i3 += zzqj.zzc(((Double) list.get(i)).doubleValue());
            }
            this.zzawd.zzay(i3);
            while (i2 < list.size()) {
                this.zzawd.zzb(((Double) list.get(i2)).doubleValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzawd.zza(i, ((Double) list.get(i2)).doubleValue());
            i2++;
        }
    }

    public final void zzh(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.zzawd.zzd(i, 2);
            int i3 = 0;
            for (i = 0; i < list.size(); i++) {
                i3 += zzqj.zzbh(((Integer) list.get(i)).intValue());
            }
            this.zzawd.zzay(i3);
            while (i2 < list.size()) {
                this.zzawd.zzax(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzawd.zze(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public final void zzi(int i, List<Boolean> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.zzawd.zzd(i, 2);
            int i3 = 0;
            for (i = 0; i < list.size(); i++) {
                i3 += zzqj.zzj(((Boolean) list.get(i)).booleanValue());
            }
            this.zzawd.zzay(i3);
            while (i2 < list.size()) {
                this.zzawd.zzi(((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzawd.zzb(i, ((Boolean) list.get(i2)).booleanValue());
            i2++;
        }
    }

    public final void zza(int i, List<String> list) {
        int i2 = 0;
        if (list instanceof zzrt) {
            zzrt zzrt = (zzrt) list;
            while (i2 < list.size()) {
                Object zzbn = zzrt.zzbn(i2);
                if (zzbn instanceof String) {
                    this.zzawd.zza(i, (String) zzbn);
                } else {
                    this.zzawd.zza(i, (zzps) zzbn);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzawd.zza(i, (String) list.get(i2));
            i2++;
        }
    }

    public final void zzb(int i, List<zzps> list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.zzawd.zza(i, (zzps) list.get(i2));
        }
    }

    public final void zzj(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.zzawd.zzd(i, 2);
            int i3 = 0;
            for (i = 0; i < list.size(); i++) {
                i3 += zzqj.zzbd(((Integer) list.get(i)).intValue());
            }
            this.zzawd.zzay(i3);
            while (i2 < list.size()) {
                this.zzawd.zzay(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzawd.zzf(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public final void zzk(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.zzawd.zzd(i, 2);
            int i3 = 0;
            for (i = 0; i < list.size(); i++) {
                i3 += zzqj.zzbg(((Integer) list.get(i)).intValue());
            }
            this.zzawd.zzay(i3);
            while (i2 < list.size()) {
                this.zzawd.zzba(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzawd.zzh(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public final void zzl(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.zzawd.zzd(i, 2);
            int i3 = 0;
            for (i = 0; i < list.size(); i++) {
                i3 += zzqj.zzw(((Long) list.get(i)).longValue());
            }
            this.zzawd.zzay(i3);
            while (i2 < list.size()) {
                this.zzawd.zzr(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzawd.zzc(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public final void zzm(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.zzawd.zzd(i, 2);
            int i3 = 0;
            for (i = 0; i < list.size(); i++) {
                i3 += zzqj.zzbe(((Integer) list.get(i)).intValue());
            }
            this.zzawd.zzay(i3);
            while (i2 < list.size()) {
                this.zzawd.zzaz(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzawd.zzg(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public final void zzn(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.zzawd.zzd(i, 2);
            int i3 = 0;
            for (i = 0; i < list.size(); i++) {
                i3 += zzqj.zzu(((Long) list.get(i)).longValue());
            }
            this.zzawd.zzay(i3);
            while (i2 < list.size()) {
                this.zzawd.zzq(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzawd.zzb(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public final void zza(int i, List<?> list, zzsz zzsz) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            zza(i, list.get(i2), zzsz);
        }
    }

    public final void zzb(int i, List<?> list, zzsz zzsz) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzb(i, list.get(i2), zzsz);
        }
    }

    public final <K, V> void zza(int i, zzsd<K, V> zzsd, Map<K, V> map) {
        for (Entry entry : map.entrySet()) {
            this.zzawd.zzd(i, 2);
            this.zzawd.zzay(zzsc.zza(zzsd, entry.getKey(), entry.getValue()));
            zzsc.zza(this.zzawd, zzsd, entry.getKey(), entry.getValue());
        }
    }
}
