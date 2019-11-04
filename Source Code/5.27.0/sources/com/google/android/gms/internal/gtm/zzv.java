package com.google.android.gms.internal.gtm;

import android.text.TextUtils;
import com.google.android.gms.analytics.zzi;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.HashMap;

@ShowFirstParty
@VisibleForTesting
public final class zzv extends zzi<zzv> {
    private String zzuj;
    public int zzuk;
    public int zzul;
    public int zzum;
    public int zzun;
    public int zzuo;

    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("language", this.zzuj);
        hashMap.put("screenColors", Integer.valueOf(this.zzuk));
        hashMap.put("screenWidth", Integer.valueOf(this.zzul));
        hashMap.put("screenHeight", Integer.valueOf(this.zzum));
        hashMap.put("viewportWidth", Integer.valueOf(this.zzun));
        hashMap.put("viewportHeight", Integer.valueOf(this.zzuo));
        return zzi.zza((Object) hashMap);
    }

    public final String getLanguage() {
        return this.zzuj;
    }

    public final void setLanguage(String str) {
        this.zzuj = str;
    }

    public final /* synthetic */ void zzb(zzi zzi) {
        zzv zzv = (zzv) zzi;
        int i = this.zzuk;
        if (i != 0) {
            zzv.zzuk = i;
        }
        i = this.zzul;
        if (i != 0) {
            zzv.zzul = i;
        }
        i = this.zzum;
        if (i != 0) {
            zzv.zzum = i;
        }
        i = this.zzun;
        if (i != 0) {
            zzv.zzun = i;
        }
        i = this.zzuo;
        if (i != 0) {
            zzv.zzuo = i;
        }
        if (!TextUtils.isEmpty(this.zzuj)) {
            zzv.zzuj = this.zzuj;
        }
    }
}
