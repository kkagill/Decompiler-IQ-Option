package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.gtm.zzl;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

final class zzgn {
    static zzdz<zzl> zza(zzdz<zzl> zzdz, int... iArr) {
        zzdz zzdz2;
        for (int i : iArr) {
            if (!(zzgj.zzh((zzl) zzdz2.getObject()) instanceof String)) {
                zzdi.zzav("Escaping can only be applied to strings.");
            } else if (i != 12) {
                StringBuilder stringBuilder = new StringBuilder(39);
                stringBuilder.append("Unsupported Value Escaping: ");
                stringBuilder.append(i);
                zzdi.zzav(stringBuilder.toString());
            } else {
                zzdz2 = zza(zzdz2);
            }
        }
        return zzdz2;
    }

    static String zzbs(String str) {
        return URLEncoder.encode(str, "UTF-8").replaceAll("\\+", "%20");
    }

    private static zzdz<zzl> zza(zzdz<zzl> zzdz) {
        try {
            return new zzdz(zzgj.zzi(zzbs(zzgj.zzc((zzl) zzdz.getObject()))), zzdz.zziu());
        } catch (UnsupportedEncodingException e) {
            zzdi.zza("Escape URI: unsupported encoding", e);
            return zzdz;
        }
    }
}
