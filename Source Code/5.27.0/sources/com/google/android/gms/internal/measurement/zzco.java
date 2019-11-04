package com.google.android.gms.internal.measurement;

import android.util.Log;

final class zzco extends zzcm<Boolean> {
    zzco(zzct zzct, String str, Boolean bool) {
        super(zzct, str, bool, null);
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ Object zzc(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        String str;
        if (obj instanceof String) {
            str = (String) obj;
            if (zzbz.zzzw.matcher(str).matches()) {
                return Boolean.valueOf(true);
            }
            if (zzbz.zzzx.matcher(str).matches()) {
                return Boolean.valueOf(false);
            }
        }
        str = super.zzrm();
        String valueOf = String.valueOf(obj);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 28) + String.valueOf(valueOf).length());
        stringBuilder.append("Invalid boolean value for ");
        stringBuilder.append(str);
        stringBuilder.append(": ");
        stringBuilder.append(valueOf);
        Log.e("PhenotypeFlag", stringBuilder.toString());
        return null;
    }
}
