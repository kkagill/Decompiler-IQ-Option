package com.google.android.gms.tagmanager;

import android.util.Base64;
import com.google.android.gms.internal.gtm.zza;
import com.google.android.gms.internal.gtm.zzb;
import com.google.android.gms.internal.gtm.zzl;
import java.util.Map;

final class zzbk extends zzbq {
    private static final String ID = zza.ENCODE.toString();
    private static final String zzags = zzb.ARG0.toString();
    private static final String zzagt = zzb.NO_PADDING.toString();
    private static final String zzagu = zzb.INPUT_FORMAT.toString();
    private static final String zzagv = zzb.OUTPUT_FORMAT.toString();

    public zzbk() {
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
        Object obj;
        Object obj2;
        String zzc = zzgj.zzc(zzl);
        zzl zzl2 = (zzl) map.get(zzagu);
        String str = "text";
        if (zzl2 == null) {
            obj = str;
        } else {
            obj = zzgj.zzc(zzl2);
        }
        zzl zzl3 = (zzl) map.get(zzagv);
        String str2 = "base16";
        if (zzl3 == null) {
            obj2 = str2;
        } else {
            obj2 = zzgj.zzc(zzl3);
        }
        int i = 2;
        zzl zzl4 = (zzl) map.get(zzagt);
        if (zzl4 != null && zzgj.zzg(zzl4).booleanValue()) {
            i = 3;
        }
        try {
            byte[] bytes;
            String str3;
            Object encode;
            boolean equals = str.equals(obj);
            str = "base64url";
            String str4 = "base64";
            if (equals) {
                bytes = zzc.getBytes();
            } else if (str2.equals(obj)) {
                bytes = zzo.decode(zzc);
            } else if (str4.equals(obj)) {
                bytes = Base64.decode(zzc, i);
            } else if (str.equals(obj)) {
                bytes = Base64.decode(zzc, i | 8);
            } else {
                str3 = "Encode: unknown input format: ";
                zzc = String.valueOf(obj);
                zzdi.zzav(zzc.length() != 0 ? str3.concat(zzc) : new String(str3));
                return zzgj.zzkc();
            }
            if (str2.equals(obj2)) {
                encode = zzo.encode(bytes);
            } else if (str4.equals(obj2)) {
                encode = Base64.encodeToString(bytes, i);
            } else if (str.equals(obj2)) {
                encode = Base64.encodeToString(bytes, i | 8);
            } else {
                str3 = "Encode: unknown output format: ";
                zzc = String.valueOf(obj2);
                zzdi.zzav(zzc.length() != 0 ? str3.concat(zzc) : new String(str3));
                return zzgj.zzkc();
            }
            return zzgj.zzi(encode);
        } catch (IllegalArgumentException unused) {
            zzdi.zzav("Encode: invalid input:");
            return zzgj.zzkc();
        }
    }
}
