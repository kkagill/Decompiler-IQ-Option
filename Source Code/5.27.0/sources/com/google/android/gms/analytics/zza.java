package com.google.android.gms.analytics;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.gtm.zzad;
import com.google.android.gms.internal.gtm.zzap;
import com.google.android.gms.internal.gtm.zzz;
import java.util.ListIterator;

@VisibleForTesting
public class zza extends zzj<zza> {
    private final zzap zzrb;
    private boolean zzrc;

    @VisibleForTesting
    public zza(zzap zzap) {
        super(zzap.zzcq(), zzap.zzcn());
        this.zzrb = zzap;
    }

    /* Access modifiers changed, original: final */
    @VisibleForTesting
    public final zzap zzab() {
        return this.zzrb;
    }

    public final zzg zzac() {
        zzg zzai = this.zzso.zzai();
        zzai.zza(this.zzrb.zzcy().zzdv());
        zzai.zza(this.zzrb.zzcz().zzfa());
        zzd(zzai);
        return zzai;
    }

    /* Access modifiers changed, original: protected|final */
    public final void zza(zzg zzg) {
        zzz zzz = (zzz) zzg.zzb(zzz.class);
        if (TextUtils.isEmpty(zzz.zzbt())) {
            zzz.setClientId(this.zzrb.zzdh().zzeh());
        }
        if (this.zzrc && TextUtils.isEmpty(zzz.zzbv())) {
            zzad zzdg = this.zzrb.zzdg();
            zzz.zzm(zzdg.zzcd());
            zzz.zza(zzdg.zzbw());
        }
    }

    public final void enableAdvertisingIdCollection(boolean z) {
        this.zzrc = z;
    }

    public final void zza(String str) {
        Preconditions.checkNotEmpty(str);
        Uri zzb = zzb.zzb(str);
        ListIterator listIterator = this.zzso.zzak().listIterator();
        while (listIterator.hasNext()) {
            if (zzb.equals(((zzo) listIterator.next()).zzae())) {
                listIterator.remove();
            }
        }
        this.zzso.zzak().add(new zzb(this.zzrb, str));
    }
}
