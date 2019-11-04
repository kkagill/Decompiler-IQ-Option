package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.gtm.zza;
import com.google.android.gms.internal.gtm.zzb;
import com.google.android.gms.internal.gtm.zzl;
import java.io.UnsupportedEncodingException;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

final class zzcx extends zzbq {
    private static final String ID = zza.JOINER.toString();
    private static final String zzags = zzb.ARG0.toString();
    private static final String zzahl = zzb.ITEM_SEPARATOR.toString();
    private static final String zzahm = zzb.KEY_VALUE_SEPARATOR.toString();
    private static final String zzahn = zzb.ESCAPE.toString();

    public zzcx() {
        super(ID, zzags);
    }

    public final boolean zzgw() {
        return true;
    }

    public final zzl zzb(Map<String, zzl> map) {
        zzl zzl = (zzl) map.get(zzags);
        if (zzl == null) {
            return zzgj.zzkc();
        }
        zzl zzl2 = (zzl) map.get(zzahl);
        String zzc = zzl2 != null ? zzgj.zzc(zzl2) : "";
        zzl zzl3 = (zzl) map.get(zzahm);
        String zzc2 = zzl3 != null ? zzgj.zzc(zzl3) : "=";
        int i = zzcz.zzahp;
        zzl zzl4 = (zzl) map.get(zzahn);
        Set set = null;
        if (zzl4 != null) {
            String zzc3 = zzgj.zzc(zzl4);
            if ("url".equals(zzc3)) {
                i = zzcz.zzahq;
            } else if ("backslash".equals(zzc3)) {
                i = zzcz.zzahr;
                set = new HashSet();
                zza(set, zzc);
                zza(set, zzc2);
                set.remove(Character.valueOf('\\'));
            } else {
                String str = "Joiner: unsupported escape type: ";
                zzc3 = String.valueOf(zzc3);
                zzdi.zzav(zzc3.length() != 0 ? str.concat(zzc3) : new String(str));
                return zzgj.zzkc();
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        int i2 = zzl.type;
        if (i2 == 2) {
            zzl[] zzlArr = zzl.zzqn;
            int length = zzlArr.length;
            i2 = 0;
            Object obj = 1;
            while (i2 < length) {
                zzl zzl5 = zzlArr[i2];
                if (obj == null) {
                    stringBuilder.append(zzc);
                }
                zza(stringBuilder, zzgj.zzc(zzl5), i, set);
                i2++;
                obj = null;
            }
        } else if (i2 != 3) {
            zza(stringBuilder, zzgj.zzc(zzl), i, set);
        } else {
            for (int i3 = 0; i3 < zzl.zzqo.length; i3++) {
                if (i3 > 0) {
                    stringBuilder.append(zzc);
                }
                String zzc4 = zzgj.zzc(zzl.zzqo[i3]);
                String zzc5 = zzgj.zzc(zzl.zzqp[i3]);
                zza(stringBuilder, zzc4, i, set);
                stringBuilder.append(zzc2);
                zza(stringBuilder, zzc5, i, set);
            }
        }
        return zzgj.zzi(stringBuilder.toString());
    }

    private static void zza(Set<Character> set, String str) {
        for (int i = 0; i < str.length(); i++) {
            set.add(Character.valueOf(str.charAt(i)));
        }
    }

    private static void zza(StringBuilder stringBuilder, String str, Integer num, Set<Character> set) {
        stringBuilder.append(zza(str, num, set));
    }

    private static String zza(String str, Integer num, Set<Character> set) {
        int i = zzcy.zzaho[num - 1];
        if (i == 1) {
            try {
                str = zzgn.zzbs(str);
                return str;
            } catch (UnsupportedEncodingException e) {
                zzdi.zza("Joiner: unsupported encoding", e);
                return str;
            }
        } else if (i != 2) {
            return str;
        } else {
            String str2 = "\\";
            str = str.replace(str2, "\\\\");
            for (Character ch : set) {
                String ch2 = ch.toString();
                String valueOf = String.valueOf(ch2);
                str = str.replace(ch2, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            }
            return str;
        }
    }
}
