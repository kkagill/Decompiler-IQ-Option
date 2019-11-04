package com.google.android.gms.internal.clearcut;

import android.content.SharedPreferences;
import android.util.Log;

final class zzaj extends zzae<Boolean> {
    zzaj(zzao zzao, String str, Boolean bool) {
        super(zzao, str, bool, null);
    }

    private final Boolean zzb(SharedPreferences sharedPreferences) {
        try {
            return Boolean.valueOf(sharedPreferences.getBoolean(this.zzds, false));
        } catch (ClassCastException e) {
            String str = "Invalid boolean value in SharedPreferences for ";
            String valueOf = String.valueOf(this.zzds);
            Log.e("PhenotypeFlag", valueOf.length() != 0 ? str.concat(valueOf) : new String(str), e);
            return null;
        }
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ Object zza(SharedPreferences sharedPreferences) {
        return zzb(sharedPreferences);
    }
}
