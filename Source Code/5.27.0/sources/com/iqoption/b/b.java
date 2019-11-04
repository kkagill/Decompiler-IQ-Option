package com.iqoption.b;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.appsflyer.h;
import com.google.common.util.concurrent.aa;
import com.iqoption.app.IQApp;
import com.iqoption.app.d;
import com.iqoption.core.util.af;
import com.iqoption.dto.Event;
import com.iqoption.dto.Event.Builder;
import java.util.Map;

/* compiled from: AppsFlyerListener */
public class b implements h {
    private final aa<a> awQ;
    private final Builder awR = Event.Builder(Event.CATEGORY_SYSTEM, "appsflyer_install");
    private final Runnable awS = new -$$Lambda$b$nV-KWKF5Gnvv8S0-Fx_5xFRErwM(this);

    /* compiled from: AppsFlyerListener */
    public static class a {
        public boolean awT;
        public Event awU;

        public a(boolean z, Event event) {
            this.awT = z;
            this.awU = event;
        }
    }

    public void M(String str) {
    }

    public void e(Map<String, String> map) {
    }

    public b(aa aaVar) {
        this.awQ = aaVar;
        com.iqoption.core.c.a.biN.postDelayed(this.awS, 20000);
    }

    private /* synthetic */ void JN() {
        this.awQ.set(new a(false, this.awR.calcDuration().setValue(Double.valueOf(0.0d)).build()));
    }

    public void d(Map<String, String> map) {
        c(IQApp.Eu(), map);
        v(map);
        if (this.awQ.set(new a(true, this.awR.calcDuration().setValue(Double.valueOf(1.0d)).build()))) {
            com.iqoption.core.c.a.biN.removeCallbacks(this.awS);
        }
    }

    public void L(String str) {
        this.awQ.set(new a(false, this.awR.calcDuration().setValue(Double.valueOf(0.0d)).build()));
    }

    private static void c(Context context, Map<String, String> map) {
        boolean z;
        String str;
        String str2 = (String) map.get("pid");
        if (af.isEmpty(str2)) {
            str2 = (String) map.get("media_source");
            if (TextUtils.isEmpty(str2)) {
                str2 = (String) map.get("agency");
            }
        }
        String str3 = "organic";
        String str4 = "\\d+";
        if (af.isEmpty(str2)) {
            str2 = str3;
            z = false;
        } else {
            z = str2.matches(str4);
        }
        String str5 = (String) map.get("c");
        if (af.isEmpty(str5)) {
            str5 = (String) map.get("campaign");
        }
        if (!af.isEmpty(str5)) {
            str3 = str5;
        }
        str5 = "_";
        String[] split = str3.split(str5);
        boolean matches = str3.matches(str4);
        String str6 = (String) map.get("Adset");
        if (af.isEmpty(str6)) {
            str6 = (String) map.get("adset");
        }
        String str7 = "";
        String str8 = "googleadwords_int";
        String str9 = "Facebook Ads";
        String str10 = !TextUtils.isEmpty(str7) ? str7 : z ? str2 : split[0].matches(str4) ? split[0] : (str2.equalsIgnoreCase(str9) && split[1].matches(str4)) ? split[1] : (str2.contains(str8) && matches) ? "38933" : "175";
        if (!z) {
            StringBuilder stringBuilder;
            if (str2.equalsIgnoreCase(str9) && split[1].matches(str4)) {
                if (!af.isEmpty(str6)) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(str3);
                    stringBuilder.append(str5);
                    stringBuilder.append(str6);
                    str3 = stringBuilder.toString();
                }
            } else if (str2.equalsIgnoreCase("iqoption_int")) {
                str = (String) map.get("af_sub5");
                if (!af.isEmpty(str)) {
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append(str3);
                    stringBuilder2.append("__");
                    stringBuilder2.append(str);
                    str3 = stringBuilder2.toString();
                }
            } else if (str2.contains(str8) && matches) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("mob_googleadwords_int_");
                stringBuilder.append(str3);
                str3 = stringBuilder.toString();
                if (!af.isEmpty(str6)) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(str3);
                    stringBuilder.append(str5);
                    stringBuilder.append(str6);
                    str3 = stringBuilder.toString();
                }
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append("mob_");
                stringBuilder.append(str2);
                stringBuilder.append(str5);
                stringBuilder.append(str3);
                str3 = stringBuilder.toString();
                if (!af.isEmpty(str6)) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(str3);
                    stringBuilder.append(str5);
                    stringBuilder.append(str6);
                    str3 = stringBuilder.toString();
                }
            }
        }
        str = str3.replace(" ", str5).replaceAll("[^A-Za-z0-9 _-]", str7);
        d aP = d.aP(context);
        aP.dM(str10);
        aP.dN(str);
    }

    private static void v(@Nullable Map<String, String> map) {
        if (map != null && Boolean.TRUE.toString().equals(map.get("is_first_launch"))) {
            String str = (String) map.get("af_dp");
            if (str != null) {
                try {
                    a.awL = Uri.parse(str);
                } catch (Exception unused) {
                }
            }
        }
    }
}
