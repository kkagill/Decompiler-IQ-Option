package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Map;
import java.util.Map.Entry;

public class zzci extends zzan {
    private static zzci zzabl;

    public zzci(zzap zzap) {
        super(zzap);
    }

    /* Access modifiers changed, original: protected|final */
    public final void zzaw() {
        synchronized (zzci.class) {
            zzabl = this;
        }
    }

    public static zzci zzfn() {
        return zzabl;
    }

    public final void zza(zzcd zzcd, String str) {
        Object zzcd2 = zzcd != null ? zzcd.toString() : "no hit data";
        String str2 = "Discarding hit. ";
        str = String.valueOf(str);
        zzd(str.length() != 0 ? str2.concat(str) : new String(str2), zzcd2);
    }

    public final void zza(Map<String, String> map, String str) {
        Object stringBuilder;
        if (map != null) {
            StringBuilder stringBuilder2 = new StringBuilder();
            for (Entry entry : map.entrySet()) {
                if (stringBuilder2.length() > 0) {
                    stringBuilder2.append(',');
                }
                stringBuilder2.append((String) entry.getKey());
                stringBuilder2.append('=');
                stringBuilder2.append((String) entry.getValue());
            }
            stringBuilder = stringBuilder2.toString();
        } else {
            stringBuilder = "no hit data";
        }
        String str2 = "Discarding hit. ";
        str = String.valueOf(str);
        zzd(str.length() != 0 ? str2.concat(str) : new String(str2), stringBuilder);
    }

    public final synchronized void zzb(int i, String str, Object obj, Object obj2, Object obj3) {
        Preconditions.checkNotNull(str);
        if (i < 0) {
            i = 0;
        }
        if (i >= 9) {
            i = 8;
        }
        char c = zzcp().zzem() ? 'C' : 'c';
        char charAt = "01VDIWEA?".charAt(i);
        String str2 = zzao.VERSION;
        str = zzam.zzc(str, zzd(obj), zzd(obj2), zzd(obj3));
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str2).length() + 4) + String.valueOf(str).length());
        stringBuilder.append("3");
        stringBuilder.append(charAt);
        stringBuilder.append(c);
        stringBuilder.append(str2);
        stringBuilder.append(":");
        stringBuilder.append(str);
        String stringBuilder2 = stringBuilder.toString();
        if (stringBuilder2.length() > 1024) {
            stringBuilder2 = stringBuilder2.substring(0, 1024);
        }
        zzcm zzdf = zzcm().zzdf();
        if (zzdf != null) {
            zzdf.zzga().zzae(stringBuilder2);
        }
    }

    @VisibleForTesting
    private static String zzd(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf((long) ((Integer) obj).intValue());
        }
        String str = "-";
        if (obj instanceof Long) {
            Long l = (Long) obj;
            if (Math.abs(l.longValue()) < 100) {
                return String.valueOf(obj);
            }
            if (String.valueOf(obj).charAt(0) != '-') {
                str = "";
            }
            String valueOf = String.valueOf(Math.abs(l.longValue()));
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(Math.round(Math.pow(10.0d, (double) (valueOf.length() - 1))));
            stringBuilder.append("...");
            stringBuilder.append(str);
            stringBuilder.append(Math.round(Math.pow(10.0d, (double) valueOf.length()) - 1.0d));
            return stringBuilder.toString();
        } else if (obj instanceof Boolean) {
            return String.valueOf(obj);
        } else {
            return obj instanceof Throwable ? obj.getClass().getCanonicalName() : str;
        }
    }
}
