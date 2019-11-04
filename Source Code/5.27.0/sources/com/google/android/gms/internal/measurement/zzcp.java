package com.google.android.gms.internal.measurement;

import android.util.Log;

final class zzcp extends zzcm<Long> {
    zzcp(zzct zzct, String str, Long l) {
        super(zzct, str, l, null);
    }

    private final Long zzd(Object obj) {
        if (obj instanceof Long) {
            return (Long) obj;
        }
        if (obj instanceof String) {
            try {
                obj = Long.valueOf(Long.parseLong((String) obj));
                return obj;
            } catch (NumberFormatException unused) {
            }
        }
        String zzrm = super.zzrm();
        String valueOf = String.valueOf(obj);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(zzrm).length() + 25) + String.valueOf(valueOf).length());
        stringBuilder.append("Invalid long value for ");
        stringBuilder.append(zzrm);
        stringBuilder.append(": ");
        stringBuilder.append(valueOf);
        Log.e("PhenotypeFlag", stringBuilder.toString());
        return null;
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ Object zzc(Object obj) {
        return zzd(obj);
    }
}
