package com.google.android.gms.internal.clearcut;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import java.io.IOException;

final class zzal extends zzae<T> {
    private final Object lock = new Object();
    private String zzec;
    private T zzed;
    private final /* synthetic */ zzan zzee;

    zzal(zzao zzao, String str, Object obj, zzan zzan) {
        this.zzee = zzan;
        super(zzao, str, obj, null);
    }

    /* Access modifiers changed, original: protected|final */
    public final T zza(SharedPreferences sharedPreferences) {
        try {
            return zzb(sharedPreferences.getString(this.zzds, ""));
        } catch (ClassCastException e) {
            String str = "Invalid byte[] value in SharedPreferences for ";
            String valueOf = String.valueOf(this.zzds);
            Log.e("PhenotypeFlag", valueOf.length() != 0 ? str.concat(valueOf) : new String(str), e);
            return null;
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final T zzb(String str) {
        try {
            Object zzb;
            synchronized (this.lock) {
                if (!str.equals(this.zzec)) {
                    zzb = this.zzee.zzb(Base64.decode(str, 3));
                    this.zzec = str;
                    this.zzed = zzb;
                }
                zzb = this.zzed;
            }
            return zzb;
        } catch (IOException | IllegalArgumentException unused) {
            String str2 = this.zzds;
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(str2).length() + 27) + String.valueOf(str).length());
            stringBuilder.append("Invalid byte[] value for ");
            stringBuilder.append(str2);
            stringBuilder.append(": ");
            stringBuilder.append(str);
            Log.e("PhenotypeFlag", stringBuilder.toString());
            return null;
        }
    }
}
