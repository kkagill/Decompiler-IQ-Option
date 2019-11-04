package com.google.android.gms.internal.gtm;

final class zztt extends zztr<zzts, zzts> {
    zztt() {
    }

    /* Access modifiers changed, original: final */
    public final boolean zza(zzsy zzsy) {
        return false;
    }

    private static void zza(Object obj, zzts zzts) {
        ((zzrc) obj).zzbak = zzts;
    }

    /* Access modifiers changed, original: final */
    public final void zzt(Object obj) {
        ((zzrc) obj).zzbak.zzmi();
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ int zzad(Object obj) {
        return ((zzts) obj).zzpe();
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ int zzai(Object obj) {
        return ((zzts) obj).zzrl();
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ Object zzh(Object obj, Object obj2) {
        zzts zzts = (zzts) obj;
        zzts zzts2 = (zzts) obj2;
        if (zzts2.equals(zzts.zzrj())) {
            return zzts;
        }
        return zzts.zza(zzts, zzts2);
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ void zzc(Object obj, zzum zzum) {
        ((zzts) obj).zza(zzum);
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ void zzg(Object obj, Object obj2) {
        zza(obj, (zzts) obj2);
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ Object zzah(Object obj) {
        zzts zzts = ((zzrc) obj).zzbak;
        if (zzts != zzts.zzrj()) {
            return zzts;
        }
        zzts = zzts.zzrk();
        zza(obj, zzts);
        return zzts;
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ Object zzag(Object obj) {
        return ((zzrc) obj).zzbak;
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ void zzf(Object obj, Object obj2) {
        zza(obj, (zzts) obj2);
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ Object zzaa(Object obj) {
        zzts zzts = (zzts) obj;
        zzts.zzmi();
        return zzts;
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ Object zzri() {
        return zzts.zzrk();
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ void zzb(Object obj, int i, long j) {
        ((zzts) obj).zzb((i << 3) | 1, Long.valueOf(j));
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ void zzc(Object obj, int i, int i2) {
        ((zzts) obj).zzb((i << 3) | 5, Integer.valueOf(i2));
    }
}
