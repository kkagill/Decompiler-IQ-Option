package com.google.android.gms.tagmanager;

import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.gtm.zza;
import com.google.android.gms.internal.gtm.zzb;
import com.google.android.gms.internal.gtm.zzl;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

@VisibleForTesting
final class zzam extends zzbq {
    private static final String ID = zza.FUNCTION_CALL.toString();
    private static final String zzadw = zzb.ADDITIONAL_PARAMS.toString();
    private static final String zzafl = zzb.FUNCTION_CALL_NAME.toString();
    private final zzan zzafm;

    public zzam(zzan zzan) {
        super(ID, zzafl);
        this.zzafm = zzan;
    }

    public final boolean zzgw() {
        return false;
    }

    public final zzl zzb(Map<String, zzl> map) {
        String zzc = zzgj.zzc((zzl) map.get(zzafl));
        HashMap hashMap = new HashMap();
        zzl zzl = (zzl) map.get(zzadw);
        if (zzl != null) {
            Object zzh = zzgj.zzh(zzl);
            if (zzh instanceof Map) {
                for (Entry entry : ((Map) zzh).entrySet()) {
                    hashMap.put(entry.getKey().toString(), entry.getValue());
                }
            } else {
                zzdi.zzac("FunctionCallMacro: expected ADDITIONAL_PARAMS to be a map.");
                return zzgj.zzkc();
            }
        }
        try {
            return zzgj.zzi(this.zzafm.zza(zzc, hashMap));
        } catch (Exception e) {
            String message = e.getMessage();
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(zzc).length() + 34) + String.valueOf(message).length());
            stringBuilder.append("Custom macro/tag ");
            stringBuilder.append(zzc);
            stringBuilder.append(" threw exception ");
            stringBuilder.append(message);
            zzdi.zzac(stringBuilder.toString());
            return zzgj.zzkc();
        }
    }
}
