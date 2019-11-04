package com.google.android.gms.tagmanager;

import android.content.Context;
import android.provider.Settings.Secure;
import com.google.android.gms.internal.gtm.zza;
import com.google.android.gms.internal.gtm.zzl;
import java.util.Map;

final class zzdm extends zzbq {
    private static final String ID = zza.MOBILE_ADWORDS_UNIQUE_ID.toString();
    private final Context zzrm;

    public zzdm(Context context) {
        super(ID, new String[0]);
        this.zzrm = context;
    }

    public final boolean zzgw() {
        return true;
    }

    public final zzl zzb(Map<String, zzl> map) {
        String string = Secure.getString(this.zzrm.getContentResolver(), "android_id");
        return string == null ? zzgj.zzkc() : zzgj.zzi(string);
    }
}
