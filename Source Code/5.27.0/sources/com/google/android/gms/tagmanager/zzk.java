package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import com.google.android.gms.internal.gtm.zza;
import com.google.android.gms.internal.gtm.zzl;
import java.util.Map;

final class zzk extends zzbq {
    private static final String ID = zza.APP_VERSION.toString();
    private final Context zzrm;

    public zzk(Context context) {
        super(ID, new String[0]);
        this.zzrm = context;
    }

    public final boolean zzgw() {
        return true;
    }

    public final zzl zzb(Map<String, zzl> map) {
        try {
            return zzgj.zzi(Integer.valueOf(this.zzrm.getPackageManager().getPackageInfo(this.zzrm.getPackageName(), 0).versionCode));
        } catch (NameNotFoundException e) {
            String packageName = this.zzrm.getPackageName();
            String message = e.getMessage();
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(packageName).length() + 25) + String.valueOf(message).length());
            stringBuilder.append("Package name ");
            stringBuilder.append(packageName);
            stringBuilder.append(" not found. ");
            stringBuilder.append(message);
            zzdi.zzav(stringBuilder.toString());
            return zzgj.zzkc();
        }
    }
}
