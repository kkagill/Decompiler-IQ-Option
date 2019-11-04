package com.google.android.gms.internal.gtm;

import com.google.android.gms.analytics.zzi;
import com.google.android.gms.common.internal.ShowFirstParty;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

@ShowFirstParty
public final class zzs extends zzi<zzs> {
    private Map<Integer, String> zzuh = new HashMap(4);

    public final String toString() {
        HashMap hashMap = new HashMap();
        for (Entry entry : this.zzuh.entrySet()) {
            String valueOf = String.valueOf(entry.getKey());
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 9);
            stringBuilder.append("dimension");
            stringBuilder.append(valueOf);
            hashMap.put(stringBuilder.toString(), entry.getValue());
        }
        return zzi.zza((Object) hashMap);
    }

    public final Map<Integer, String> zzbk() {
        return Collections.unmodifiableMap(this.zzuh);
    }

    public final /* synthetic */ void zzb(zzi zzi) {
        ((zzs) zzi).zzuh.putAll(this.zzuh);
    }
}
