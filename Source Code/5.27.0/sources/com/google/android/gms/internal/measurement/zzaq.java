package com.google.android.gms.internal.measurement;

import com.google.android.gms.dynamic.ObjectWrapper;

final class zzaq extends zzb {
    private final /* synthetic */ zzz zzaa;
    private final /* synthetic */ int zzbd = 5;
    private final /* synthetic */ String zzbe;
    private final /* synthetic */ Object zzbf;
    private final /* synthetic */ Object zzbg;
    private final /* synthetic */ Object zzbh;

    zzaq(zzz zzz, boolean z, int i, String str, Object obj, Object obj2, Object obj3) {
        this.zzaa = zzz;
        this.zzbe = str;
        this.zzbf = obj;
        this.zzbg = null;
        this.zzbh = null;
        super(false);
    }

    /* Access modifiers changed, original: final */
    public final void zzf() {
        this.zzaa.zzar.logHealthData(this.zzbd, this.zzbe, ObjectWrapper.wrap(this.zzbf), ObjectWrapper.wrap(this.zzbg), ObjectWrapper.wrap(this.zzbh));
    }
}
