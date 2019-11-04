package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.measurement.AppMeasurement.UserProperty;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class b {
    private static final Set<String> abD = new HashSet(Arrays.asList(new String[]{"_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"}));
    private static final List<String> abE = Arrays.asList(new String[]{"_e", "_f", "_iap", "_s", "_au", "_ui", "_cd", "app_open"});
    private static final List<String> abF = Arrays.asList(new String[]{"auto", "app", "am"});
    private static final List<String> abG = Arrays.asList(new String[]{"_r", "_dbg"});
    private static final List<String> abH = Arrays.asList((String[]) ArrayUtils.concat(UserProperty.zzpp, UserProperty.zzpq));
    private static final List<String> abI = Arrays.asList(new String[]{"^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$"});

    public static boolean ca(@NonNull String str) {
        return !abF.contains(str);
    }

    public static boolean e(@NonNull String str, @Nullable Bundle bundle) {
        if (abE.contains(str)) {
            return false;
        }
        if (bundle != null) {
            for (String containsKey : abG) {
                if (bundle.containsKey(containsKey)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean N(@NonNull String str, @NonNull String str2) {
        String str3 = "fcm";
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            return str.equals(str3) || str.equals("frc");
        } else {
            if (UserProperty.FIREBASE_LAST_NOTIFICATION.equals(str2)) {
                return str.equals(str3) || str.equals("fiam");
            } else {
                if (abH.contains(str2)) {
                    return false;
                }
                for (String matches : abI) {
                    if (str2.matches(matches)) {
                        return false;
                    }
                }
                return true;
            }
        }
    }

    public static boolean b(@NonNull String str, @NonNull String str2, @Nullable Bundle bundle) {
        if (!"_cmp".equals(str2)) {
            return true;
        }
        if (!ca(str) || bundle == null) {
            return false;
        }
        for (String containsKey : abG) {
            if (bundle.containsKey(containsKey)) {
                return false;
            }
        }
        int i = -1;
        int hashCode = str.hashCode();
        if (hashCode != 101200) {
            if (hashCode != 101230) {
                if (hashCode == 3142703 && str.equals("fiam")) {
                    i = 2;
                }
            } else if (str.equals("fdl")) {
                i = 1;
            }
        } else if (str.equals("fcm")) {
            i = 0;
        }
        str = "_cis";
        if (i == 0) {
            bundle.putString(str, "fcm_integration");
            return true;
        } else if (i == 1) {
            bundle.putString(str, "fdl_integration");
            return true;
        } else if (i != 2) {
            return false;
        } else {
            bundle.putString(str, "fiam_integration");
            return true;
        }
    }
}
