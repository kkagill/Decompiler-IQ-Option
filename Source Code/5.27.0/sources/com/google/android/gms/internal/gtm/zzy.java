package com.google.android.gms.internal.gtm;

import android.text.TextUtils;
import com.google.android.gms.analytics.zzi;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.plus.PlusShare;
import java.util.HashMap;

@ShowFirstParty
public final class zzy extends zzi<zzy> {
    public String zzuq;
    public boolean zzur;

    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put(PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_DESCRIPTION, this.zzuq);
        hashMap.put("fatal", Boolean.valueOf(this.zzur));
        return zzi.zza((Object) hashMap);
    }

    public final /* synthetic */ void zzb(zzi zzi) {
        zzy zzy = (zzy) zzi;
        if (!TextUtils.isEmpty(this.zzuq)) {
            zzy.zzuq = this.zzuq;
        }
        boolean z = this.zzur;
        if (z) {
            zzy.zzur = z;
        }
    }
}
