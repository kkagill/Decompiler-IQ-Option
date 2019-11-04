package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.HashMap;
import java.util.Map;

@ShowFirstParty
@VisibleForTesting
public class zzcw {
    private static String zzahj;
    @VisibleForTesting
    static Map<String, String> zzahk = new HashMap();

    public static void zzbe(String str) {
        synchronized (zzcw.class) {
            zzahj = str;
        }
    }

    static void zzd(Context context, String str) {
        zzft.zza(context, "gtm_install_referrer", "referrer", str);
        zzf(context, str);
    }

    public static String zze(Context context, String str) {
        if (zzahj == null) {
            synchronized (zzcw.class) {
                if (zzahj == null) {
                    SharedPreferences sharedPreferences = context.getSharedPreferences("gtm_install_referrer", 0);
                    if (sharedPreferences != null) {
                        zzahj = sharedPreferences.getString("referrer", "");
                    } else {
                        zzahj = "";
                    }
                }
            }
        }
        return zze(zzahj, str);
    }

    public static void zzf(Context context, String str) {
        String zze = zze(str, "conv");
        if (zze != null && zze.length() > 0) {
            zzahk.put(zze, str);
            zzft.zza(context, "gtm_click_referrers", zze, str);
        }
    }

    public static String zze(String str, String str2) {
        if (str2 == null) {
            return str.length() > 0 ? str : null;
        } else {
            String str3 = "http://hostname/?";
            str = String.valueOf(str);
            return Uri.parse(str.length() != 0 ? str3.concat(str) : new String(str3)).getQueryParameter(str2);
        }
    }
}
