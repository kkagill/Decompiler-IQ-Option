package com.google.android.gms.internal.measurement;

import android.util.Log;

final class zzcr extends zzcm<Double> {
    zzcr(zzct zzct, String str, Double d) {
        super(zzct, str, d, null);
    }

    private final Double zze(Object obj) {
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if (obj instanceof String) {
            try {
                obj = Double.valueOf(Double.parseDouble((String) obj));
                return obj;
            } catch (NumberFormatException unused) {
            }
        }
        String zzrm = super.zzrm();
        String valueOf = String.valueOf(obj);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(zzrm).length() + 27) + String.valueOf(valueOf).length());
        stringBuilder.append("Invalid double value for ");
        stringBuilder.append(zzrm);
        stringBuilder.append(": ");
        stringBuilder.append(valueOf);
        Log.e("PhenotypeFlag", stringBuilder.toString());
        return null;
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ Object zzc(Object obj) {
        return zze(obj);
    }
}
