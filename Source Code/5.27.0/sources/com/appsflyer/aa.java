package com.appsflyer;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.Build.VERSION;
import android.telephony.TelephonyManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

final class aa {

    static final class a {
        private static String kZ;
        private static String lc;
        private final String lO;
        private final String lw;
        private final String lx;

        a(@NonNull String str, @Nullable String str2, @Nullable String str3) {
            this.lO = str;
            this.lw = str2;
            this.lx = str3;
        }

        /* Access modifiers changed, original: final */
        public final String dD() {
            return this.lO;
        }

        /* Access modifiers changed, original: final */
        @Nullable
        public final String dl() {
            return this.lw;
        }

        /* Access modifiers changed, original: final */
        @Nullable
        public final String dk() {
            return this.lx;
        }

        a() {
        }

        static void H(String str) {
            lc = str;
            StringBuilder stringBuilder = new StringBuilder();
            int i = 0;
            while (i < str.length()) {
                if (i == 0 || i == str.length() - 1) {
                    stringBuilder.append(str.charAt(i));
                } else {
                    stringBuilder.append("*");
                }
                i++;
            }
            kZ = stringBuilder.toString();
        }

        static void ae(String str) {
            if (lc == null) {
                H(m.dw().getString("AppsFlyerKey"));
            }
            String str2 = lc;
            if (str2 != null && str.contains(str2)) {
                AFLogger.J(str.replace(lc, kZ));
            }
        }
    }

    static final class b {
        static final aa mD = new aa();
    }

    aa() {
    }

    static a C(@NonNull Context context) {
        String simOperatorName;
        Throwable th;
        String str = "unknown";
        String str2 = null;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            String str3 = "MOBILE";
            String str4 = "WIFI";
            if (connectivityManager != null) {
                int i = 0;
                if (21 <= VERSION.SDK_INT) {
                    Network[] allNetworks = connectivityManager.getAllNetworks();
                    int length = allNetworks.length;
                    int i2 = 0;
                    while (i2 < length) {
                        NetworkInfo networkInfo = connectivityManager.getNetworkInfo(allNetworks[i2]);
                        Object obj = (networkInfo == null || !networkInfo.isConnectedOrConnecting()) ? null : 1;
                        if (obj == null) {
                            i2++;
                        } else if (1 != networkInfo.getType()) {
                            if (networkInfo.getType() == 0) {
                                str = str3;
                            }
                        }
                    }
                } else {
                    NetworkInfo networkInfo2 = connectivityManager.getNetworkInfo(1);
                    Object obj2 = (networkInfo2 == null || !networkInfo2.isConnectedOrConnecting()) ? null : 1;
                    if (obj2 == null) {
                        networkInfo2 = connectivityManager.getNetworkInfo(0);
                        obj2 = (networkInfo2 == null || !networkInfo2.isConnectedOrConnecting()) ? null : 1;
                        if (obj2 == null) {
                            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                            if (activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting()) {
                                i = 1;
                            }
                            if (i != 0) {
                                if (1 != activeNetworkInfo.getType()) {
                                    if (activeNetworkInfo.getType() == 0) {
                                    }
                                }
                            }
                        }
                        str = str3;
                    }
                }
                str = str4;
            }
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            simOperatorName = telephonyManager.getSimOperatorName();
            try {
                str2 = telephonyManager.getNetworkOperatorName();
                if ((str2 == null || str2.isEmpty()) && 2 == telephonyManager.getPhoneType()) {
                    str2 = "CDMA";
                }
            } catch (Throwable th2) {
                th = th2;
                AFLogger.c("Exception while collecting network info. ", th);
                return new a(str, str2, simOperatorName);
            }
        } catch (Throwable th3) {
            th = th3;
            simOperatorName = null;
            AFLogger.c("Exception while collecting network info. ", th);
            return new a(str, str2, simOperatorName);
        }
        return new a(str, str2, simOperatorName);
    }
}
