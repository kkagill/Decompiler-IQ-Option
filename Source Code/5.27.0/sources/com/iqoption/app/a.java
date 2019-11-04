package com.iqoption.app;

import android.text.TextUtils;
import com.iqoption.config.Platform;
import kotlin.i;
import kotlin.text.Regex;

@i(bne = {1, 1, 15}, bnf = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R(\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00048V@VX\u000e¢\u0006\f\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\r8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0007R\u0014\u0010\u0012\u001a\u00020\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0007R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\r8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u000fR\u0014\u0010\u0016\u001a\u00020\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0007R\u0014\u0010\u0018\u001a\u00020\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0007R\u000e\u0010\u001a\u001a\u00020\u001bX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\u00020\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0007R:\u0010\u001e\u001a(\u0012\f\u0012\n \u001f*\u0004\u0018\u00010\u00040\u0004 \u001f*\u0014\u0012\u000e\b\u0001\u0012\n \u001f*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\r0\r8VX\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u000fR\u0014\u0010!\u001a\u00020\"8VX\u0004¢\u0006\u0006\u001a\u0004\b!\u0010#R\u0014\u0010$\u001a\u00020\"8VX\u0004¢\u0006\u0006\u001a\u0004\b$\u0010#R\u0014\u0010%\u001a\u00020\"8VX\u0004¢\u0006\u0006\u001a\u0004\b%\u0010#R\u0014\u0010&\u001a\u00020\"8VX\u0004¢\u0006\u0006\u001a\u0004\b&\u0010#R\u0014\u0010'\u001a\u00020\"8VX\u0004¢\u0006\u0006\u001a\u0004\b'\u0010#R\u0014\u0010(\u001a\u00020\"8VX\u0004¢\u0006\u0006\u001a\u0004\b(\u0010#R\u0014\u0010)\u001a\u00020\"8VX\u0004¢\u0006\u0006\u001a\u0004\b)\u0010#R\u0014\u0010*\u001a\u00020\"8VX\u0004¢\u0006\u0006\u001a\u0004\b*\u0010#R\u0014\u0010+\u001a\u00020\"8VX\u0004¢\u0006\u0006\u001a\u0004\b,\u0010#R\u0014\u0010-\u001a\u00020\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b.\u0010\u0007R\u0014\u0010/\u001a\u0002008VX\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R(\u00103\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00048V@VX\u000e¢\u0006\f\u001a\u0004\b4\u0010\u0007\"\u0004\b5\u0010\tR\u001a\u00106\u001a\b\u0012\u0004\u0012\u00020\u00040\r8VX\u0004¢\u0006\u0006\u001a\u0004\b7\u0010\u000fR\u0014\u00108\u001a\u00020\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b9\u0010\u0007R\u0014\u0010:\u001a\u00020\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b;\u0010\u0007R\u0014\u0010<\u001a\u00020\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b=\u0010\u0007R\u0014\u0010>\u001a\u00020?8VX\u0004¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0014\u0010B\u001a\u00020\u00048VX\u0004¢\u0006\u0006\u001a\u0004\bC\u0010\u0007R\u0014\u0010D\u001a\u00020\u00048VX\u0004¢\u0006\u0006\u001a\u0004\bE\u0010\u0007¨\u0006F"}, bng = {"Lcom/iqoption/app/ConfigImpl;", "Lcom/iqoption/config/Config;", "()V", "value", "", "aff", "getAff", "()Ljava/lang/String;", "setAff", "(Ljava/lang/String;)V", "affTrack", "getAffTrack", "apiConfigGetUrls", "", "getApiConfigGetUrls", "()[Ljava/lang/String;", "apiConfigS3Iv", "getApiConfigS3Iv", "apiConfigS3Key", "getApiConfigS3Key", "apiConfigS3Urls", "getApiConfigS3Urls", "appId", "getAppId", "appsflyerId", "getAppsflyerId", "devAppRegex", "Lkotlin/text/Regex;", "googleRequestIdToken", "getGoogleRequestIdToken", "intApiConfigGetUrls", "kotlin.jvm.PlatformType", "getIntApiConfigGetUrls", "isBroker", "", "()Z", "isChina", "isDebug", "isDev", "isStaging", "isTest", "isWhiteLabel", "isWsRoute", "logApiCall", "getLogApiCall", "marketUrl", "getMarketUrl", "platform", "Lcom/iqoption/config/Platform;", "getPlatform", "()Lcom/iqoption/config/Platform;", "reTrack", "getReTrack", "setReTrack", "specificInstruments", "getSpecificInstruments", "staging", "getStaging", "staticAff", "getStaticAff", "togglesCategory", "getTogglesCategory", "versionCode", "", "getVersionCode", "()I", "versionName", "getVersionName", "wsRoute", "getWsRoute", "app_optionXRelease"})
/* compiled from: ConfigImpl.kt */
public final class a implements com.iqoption.config.a {
    private static final Regex aru = new Regex("com\\.iqoption\\.dev(\\.x)?");
    public static final a arv = new a();

    public String Dh() {
        return "1040069544216-sre2fg1f17mtt49ao5cc27ill5niot06.apps.googleusercontent.com";
    }

    public String Dj() {
        return "2vsMs7Z47mxCV7Uq";
    }

    public String Dk() {
        return "1f4fe72511c1541c0ee97c08";
    }

    public boolean Dp() {
        return true;
    }

    public boolean Ds() {
        return false;
    }

    public boolean Dt() {
        return false;
    }

    public boolean Du() {
        return false;
    }

    public String Dv() {
        return "com.iqoption.x";
    }

    public String Dy() {
        return "5.27.0";
    }

    public int getVersionCode() {
        return 465;
    }

    private a() {
    }

    public boolean Di() {
        return u.v("com.iqbroker", "com.iqoption.x", true);
    }

    public String[] Dl() {
        String[] strArr = com.iqoption.a.aiJ;
        kotlin.jvm.internal.i.e(strArr, "BuildConfig.API_CONFIG_GET_URLS");
        return strArr;
    }

    public String[] Dm() {
        String[] strArr = com.iqoption.a.aiK;
        kotlin.jvm.internal.i.e(strArr, "BuildConfig.API_CONFIG_S3_URLS");
        return strArr;
    }

    public String[] Dn() {
        return com.iqoption.a.aiL;
    }

    public String[] Do() {
        String[] strArr = com.iqoption.a.aiM;
        kotlin.jvm.internal.i.e(strArr, "BuildConfig.SPECIFIC_INSTRUMENT");
        return strArr;
    }

    public boolean Dq() {
        Object obj = (Ds() || Dr()) ? 1 : null;
        if (obj == null || !com.iqoption.core.data.d.a.bdi.Wp()) {
            return false;
        }
        return true;
    }

    public boolean Dr() {
        if (!Ds()) {
            if (!aru.L("com.iqoption.x")) {
                return false;
            }
        }
        return true;
    }

    public String Dw() {
        String str = "market://details?id=com.iqoption";
        return u.a(str, "/", false, 2, null) ? IQApp.Ev().fz(str) : str;
    }

    public Platform Dx() {
        return Platform.Companion.fromServerId(Integer.valueOf(17));
    }

    public String Dz() {
        d Fa = d.Fa();
        kotlin.jvm.internal.i.e(Fa, "Preferences.instance()");
        String FF = Fa.FF();
        if (TextUtils.isEmpty(FF)) {
            return "175";
        }
        kotlin.jvm.internal.i.e(FF, "stored");
        return FF;
    }

    public String DA() {
        String DA = com.iqoption.core.data.d.a.bdi.DA();
        if (TextUtils.isEmpty(DA)) {
            return null;
        }
        if (System.currentTimeMillis() - com.iqoption.core.data.d.a.bdi.VY() > 86400000) {
            DA = null;
        }
        return DA;
    }

    public String DB() {
        String str = "";
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        if (!Ds() || TextUtils.isEmpty(com.iqoption.debugmenu.debugmenu.a.cvr)) {
            str = com.iqoption.core.data.d.a.bdi.DB();
        } else {
            str = com.iqoption.debugmenu.debugmenu.a.cvr;
        }
        return str;
    }

    public boolean DC() {
        return com.iqoption.debugmenu.debugmenu.a.cvy.DC();
    }

    public String DD() {
        return com.iqoption.debugmenu.debugmenu.a.cvy.DD();
    }

    public boolean DE() {
        return com.iqoption.debugmenu.debugmenu.a.cvy.DE();
    }

    public String DF() {
        return com.iqoption.debugmenu.debugmenu.a.cvy.DF();
    }
}
