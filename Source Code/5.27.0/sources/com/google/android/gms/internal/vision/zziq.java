package com.google.android.gms.internal.vision;

final class zziq extends zzio<zzip, zzip> {
    zziq() {
    }

    /* Access modifiers changed, original: final */
    public final boolean zza(zzhv zzhv) {
        return false;
    }

    private static void zza(Object obj, zzip zzip) {
        ((zzfy) obj).zzwj = zzip;
    }

    /* Access modifiers changed, original: final */
    public final void zze(Object obj) {
        ((zzfy) obj).zzwj.zzci();
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ int zzp(Object obj) {
        return ((zzip) obj).zzeq();
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ int zzv(Object obj) {
        return ((zzip) obj).zzhg();
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ Object zzg(Object obj, Object obj2) {
        zzip zzip = (zzip) obj;
        zzip zzip2 = (zzip) obj2;
        if (zzip2.equals(zzip.zzhe())) {
            return zzip;
        }
        return zzip.zza(zzip, zzip2);
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ void zzc(Object obj, zzjj zzjj) {
        ((zzip) obj).zza(zzjj);
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ void zzf(Object obj, Object obj2) {
        zza(obj, (zzip) obj2);
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ Object zzu(Object obj) {
        zzip zzip = ((zzfy) obj).zzwj;
        if (zzip != zzip.zzhe()) {
            return zzip;
        }
        zzip = zzip.zzhf();
        zza(obj, zzip);
        return zzip;
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ Object zzt(Object obj) {
        return ((zzfy) obj).zzwj;
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ void zze(Object obj, Object obj2) {
        zza(obj, (zzip) obj2);
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ Object zzm(Object obj) {
        zzip zzip = (zzip) obj;
        zzip.zzci();
        return zzip;
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ Object zzhd() {
        return zzip.zzhf();
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ void zzb(Object obj, int i, long j) {
        ((zzip) obj).zzb((i << 3) | 1, Long.valueOf(j));
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ void zzc(Object obj, int i, int i2) {
        ((zzip) obj).zzb((i << 3) | 5, Integer.valueOf(i2));
    }
}
