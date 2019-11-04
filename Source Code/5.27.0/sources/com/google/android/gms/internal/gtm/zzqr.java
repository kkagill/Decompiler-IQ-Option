package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzrc.zzc;
import java.util.Map.Entry;

final class zzqr extends zzqq<Object> {
    zzqr() {
    }

    /* Access modifiers changed, original: final */
    public final boolean zze(zzsk zzsk) {
        return zzsk instanceof zzc;
    }

    /* Access modifiers changed, original: final */
    public final zzqt<Object> zzr(Object obj) {
        return ((zzc) obj).zzbaq;
    }

    /* Access modifiers changed, original: final */
    public final zzqt<Object> zzs(Object obj) {
        zzc zzc = (zzc) obj;
        if (zzc.zzbaq.isImmutable()) {
            zzc.zzbaq = (zzqt) zzc.zzbaq.clone();
        }
        return zzc.zzbaq;
    }

    /* Access modifiers changed, original: final */
    public final void zzt(Object obj) {
        zzr(obj).zzmi();
    }

    /* Access modifiers changed, original: final */
    public final <UT, UB> UB zza(zzsy zzsy, Object obj, zzqp zzqp, zzqt<Object> zzqt, UB ub, zztr<UT, UB> zztr) {
        throw new NoSuchMethodError();
    }

    /* Access modifiers changed, original: final */
    public final int zzb(Entry<?, ?> entry) {
        entry.getKey();
        throw new NoSuchMethodError();
    }

    /* Access modifiers changed, original: final */
    public final void zza(zzum zzum, Entry<?, ?> entry) {
        entry.getKey();
        throw new NoSuchMethodError();
    }

    /* Access modifiers changed, original: final */
    public final Object zza(zzqp zzqp, zzsk zzsk, int i) {
        return zzqp.zza(zzsk, i);
    }

    /* Access modifiers changed, original: final */
    public final void zza(zzsy zzsy, Object obj, zzqp zzqp, zzqt<Object> zzqt) {
        throw new NoSuchMethodError();
    }

    /* Access modifiers changed, original: final */
    public final void zza(zzps zzps, Object obj, zzqp zzqp, zzqt<Object> zzqt) {
        throw new NoSuchMethodError();
    }
}
