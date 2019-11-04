package com.google.android.gms.internal.clearcut;

import android.content.SharedPreferences;
import android.util.Log;

final class zzak extends zzae<String> {
    zzak(zzao zzao, String str, String str2) {
        super(zzao, str, str2, null);
    }

    private final String zzc(SharedPreferences sharedPreferences) {
        try {
            return sharedPreferences.getString(this.zzds, null);
        } catch (ClassCastException e) {
            String str = "Invalid string value in SharedPreferences for ";
            String valueOf = String.valueOf(this.zzds);
            Log.e("PhenotypeFlag", valueOf.length() != 0 ? str.concat(valueOf) : new String(str), e);
            return null;
        }
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ Object zza(SharedPreferences sharedPreferences) {
        return zzc(sharedPreferences);
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ Object zzb(String str) {
        return str;
    }
}
