package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.gtm.zza;
import com.google.android.gms.internal.gtm.zzb;
import com.google.android.gms.internal.gtm.zzl;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Map;

final class zzbv extends zzbq {
    private static final String ID = zza.HASH.toString();
    private static final String zzags = zzb.ARG0.toString();
    private static final String zzagu = zzb.INPUT_FORMAT.toString();
    private static final String zzagx = zzb.ALGORITHM.toString();

    public zzbv() {
        super(ID, zzags);
    }

    public final boolean zzgw() {
        return true;
    }

    public final zzl zzb(Map<String, zzl> map) {
        zzl zzl = (zzl) map.get(zzags);
        if (zzl == null || zzl == zzgj.zzkc()) {
            return zzgj.zzkc();
        }
        String str;
        Object obj;
        byte[] bytes;
        String valueOf;
        String zzc = zzgj.zzc(zzl);
        zzl zzl2 = (zzl) map.get(zzagx);
        if (zzl2 == null) {
            str = "MD5";
        } else {
            str = zzgj.zzc(zzl2);
        }
        zzl zzl3 = (zzl) map.get(zzagu);
        String str2 = "text";
        if (zzl3 == null) {
            obj = str2;
        } else {
            obj = zzgj.zzc(zzl3);
        }
        if (str2.equals(obj)) {
            bytes = zzc.getBytes();
        } else if ("base16".equals(obj)) {
            bytes = zzo.decode(zzc);
        } else {
            zzc = "Hash: unknown input format: ";
            valueOf = String.valueOf(obj);
            zzdi.zzav(valueOf.length() != 0 ? zzc.concat(valueOf) : new String(zzc));
            return zzgj.zzkc();
        }
        try {
            MessageDigest instance = MessageDigest.getInstance(str);
            instance.update(bytes);
            return zzgj.zzi(zzo.encode(instance.digest()));
        } catch (NoSuchAlgorithmException unused) {
            valueOf = "Hash: unknown algorithm: ";
            zzc = String.valueOf(str);
            zzdi.zzav(zzc.length() != 0 ? valueOf.concat(zzc) : new String(valueOf));
            return zzgj.zzkc();
        }
    }
}
