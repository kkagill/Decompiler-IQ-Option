package com.google.android.gms.internal.measurement;

final class zzhr extends zzhp<zzhs, zzhs> {
    zzhr() {
    }

    /* Access modifiers changed, original: final */
    public final boolean zza(zzgy zzgy) {
        return false;
    }

    private static void zza(Object obj, zzhs zzhs) {
        ((zzey) obj).zzahz = zzhs;
    }

    /* Access modifiers changed, original: final */
    public final void zzj(Object obj) {
        ((zzey) obj).zzahz.zzry();
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ int zzt(Object obj) {
        return ((zzhs) obj).zzuk();
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ int zzz(Object obj) {
        return ((zzhs) obj).zzws();
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ Object zzg(Object obj, Object obj2) {
        zzhs zzhs = (zzhs) obj;
        zzhs zzhs2 = (zzhs) obj2;
        if (zzhs2.equals(zzhs.zzwq())) {
            return zzhs;
        }
        return zzhs.zza(zzhs, zzhs2);
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ void zzc(Object obj, zzim zzim) {
        ((zzhs) obj).zza(zzim);
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ void zzf(Object obj, Object obj2) {
        zza(obj, (zzhs) obj2);
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ Object zzy(Object obj) {
        zzhs zzhs = ((zzey) obj).zzahz;
        if (zzhs != zzhs.zzwq()) {
            return zzhs;
        }
        zzhs = zzhs.zzwr();
        zza(obj, zzhs);
        return zzhs;
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ Object zzx(Object obj) {
        return ((zzey) obj).zzahz;
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ void zze(Object obj, Object obj2) {
        zza(obj, (zzhs) obj2);
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ Object zzp(Object obj) {
        zzhs zzhs = (zzhs) obj;
        zzhs.zzry();
        return zzhs;
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ Object zzwp() {
        return zzhs.zzwr();
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ void zzb(Object obj, int i, long j) {
        ((zzhs) obj).zzb((i << 3) | 1, Long.valueOf(j));
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ void zzc(Object obj, int i, int i2) {
        ((zzhs) obj).zzb((i << 3) | 5, Integer.valueOf(i2));
    }
}
