package com.iqoption.core;

import android.content.Context;
import android.widget.Toast;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.PluralsRes;
import androidx.annotation.StringRes;
import com.google.gson.Gson;
import com.iqoption.core.connect.f;
import com.iqoption.core.connect.k;
import com.iqoption.core.data.config.ApiConfig;
import java.util.Arrays;
import java.util.Locale;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000¢\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0010\u0010<\u001a\u00020\u00112\b\b\u0001\u0010=\u001a\u00020\u0011\u001a\u0006\u0010>\u001a\u00020?\u001a\u0010\u0010@\u001a\u00020A2\b\b\u0001\u0010=\u001a\u00020\u0011\u001a1\u0010B\u001a\u00020?2\b\b\u0001\u0010=\u001a\u00020\u00112\u0006\u0010C\u001a\u00020\u00112\u0012\u0010D\u001a\n\u0012\u0006\b\u0001\u0012\u00020F0E\"\u00020F¢\u0006\u0002\u0010G\u001a\u0010\u0010H\u001a\u00020?2\b\b\u0001\u0010=\u001a\u00020\u0011\u001a)\u0010H\u001a\u00020?2\b\b\u0001\u0010=\u001a\u00020\u00112\u0012\u0010D\u001a\n\u0012\u0006\b\u0001\u0012\u00020F0E\"\u00020F¢\u0006\u0002\u0010I\u001a\u0006\u0010J\u001a\u00020K\u001a\u001c\u0010L\u001a\u00020M2\b\b\u0001\u0010=\u001a\u00020\u00112\b\b\u0002\u0010N\u001a\u00020\u0011H\u0007\u001a\u001a\u0010L\u001a\u00020M2\u0006\u0010O\u001a\u00020?2\b\b\u0002\u0010N\u001a\u00020\u0011H\u0007\u001a\u001e\u0010L\u001a\u00020M*\u00020\r2\u0006\u0010=\u001a\u00020\u00112\b\b\u0002\u0010N\u001a\u00020\u0011H\u0007\u001a\u001e\u0010L\u001a\u00020M*\u00020\r2\u0006\u0010O\u001a\u00020?2\b\b\u0002\u0010N\u001a\u00020\u0011H\u0007\"\u0011\u0010\u0000\u001a\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\"\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\"\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\"\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\"\u0011\u0010\u0014\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017\"\u0011\u0010\u0018\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\"\u0011\u0010\u001c\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f\"\u0015\u0010 \u001a\u0006\u0012\u0002\b\u00030!8F¢\u0006\u0006\u001a\u0004\b\"\u0010#\"\u0011\u0010$\u001a\u00020%8F¢\u0006\u0006\u001a\u0004\b&\u0010'\"\u0011\u0010(\u001a\u00020)8F¢\u0006\u0006\u001a\u0004\b*\u0010+\"\u0011\u0010,\u001a\u00020-8F¢\u0006\u0006\u001a\u0004\b.\u0010/\"\u0011\u00100\u001a\u0002018F¢\u0006\u0006\u001a\u0004\b2\u00103\"\u0011\u00104\u001a\u0002058F¢\u0006\u0006\u001a\u0004\b6\u00107\"\u0011\u00108\u001a\u0002098F¢\u0006\u0006\u001a\u0004\b:\u0010;¨\u0006P"}, bng = {"account", "Lcom/iqoption/core/IQAccount;", "getAccount", "()Lcom/iqoption/core/IQAccount;", "analytics", "Lcom/iqoption/core/analytics/IQAnalytics;", "getAnalytics", "()Lcom/iqoption/core/analytics/IQAnalytics;", "apiConfig", "Lcom/iqoption/core/data/config/ApiConfig;", "getApiConfig", "()Lcom/iqoption/core/data/config/ApiConfig;", "appContext", "Landroid/content/Context;", "getAppContext", "()Landroid/content/Context;", "appIcon", "", "getAppIcon", "()I", "config", "Lcom/iqoption/config/Config;", "getConfig", "()Lcom/iqoption/config/Config;", "connect", "Lcom/iqoption/core/IQConnect;", "getConnect", "()Lcom/iqoption/core/IQConnect;", "core", "Lcom/iqoption/core/Core;", "getCore", "()Lcom/iqoption/core/Core;", "defaultActivity", "Ljava/lang/Class;", "getDefaultActivity", "()Ljava/lang/Class;", "eventBuilderFactory", "Lcom/iqoption/core/connect/EventBuilderFactory;", "getEventBuilderFactory", "()Lcom/iqoption/core/connect/EventBuilderFactory;", "features", "Lcom/iqoption/core/features/FeaturesProvider;", "getFeatures", "()Lcom/iqoption/core/features/FeaturesProvider;", "gson", "Lcom/google/gson/Gson;", "getGson", "()Lcom/google/gson/Gson;", "iqbus", "Lcom/iqoption/core/connect/IQBus;", "getIqbus", "()Lcom/iqoption/core/connect/IQBus;", "requestBuilderFactory", "Lcom/iqoption/core/connect/RequestBuilderFactory;", "getRequestBuilderFactory", "()Lcom/iqoption/core/connect/RequestBuilderFactory;", "timeServer", "Lcom/iqoption/core/TimeServer;", "getTimeServer", "()Lcom/iqoption/core/TimeServer;", "getColor", "resId", "getLocale", "", "getPixels", "", "getPlural", "quantity", "args", "", "", "(II[Ljava/lang/Object;)Ljava/lang/String;", "getString", "(I[Ljava/lang/Object;)Ljava/lang/String;", "isChineLocale", "", "showToast", "", "duration", "message", "core_release"})
/* compiled from: Global.kt */
public final class d {

    @i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "run"})
    /* compiled from: Global.kt */
    static final class a implements Runnable {
        final /* synthetic */ Context aZr;
        final /* synthetic */ String aZs;
        final /* synthetic */ int aZt;

        a(Context context, String str, int i) {
            this.aZr = context;
            this.aZs = str;
            this.aZt = i;
        }

        public final void run() {
            d.e(this.aZr, this.aZs, this.aZt);
        }
    }

    public static final void eF(@StringRes int i) {
        a(i, 0, 2, null);
    }

    public static final b Um() {
        return b.aZo.Ul();
    }

    public static final com.iqoption.config.a Un() {
        return com.iqoption.config.a.aZl.Uk();
    }

    public static final ApiConfig EE() {
        return Um().EE();
    }

    public static final Context Uo() {
        return Um().getContext();
    }

    public static final Gson Ez() {
        return Um().Ez();
    }

    public static final f ED() {
        return Um().ED();
    }

    public static final f Up() {
        return ED().EU();
    }

    public static final k EV() {
        return ED().EV();
    }

    public static final com.iqoption.core.connect.d EW() {
        return ED().EW();
    }

    public static final e EA() {
        return Um().EA();
    }

    public static final l EB() {
        return Um().EB();
    }

    public static final com.iqoption.core.analytics.d EC() {
        return Um().EC();
    }

    public static final com.iqoption.core.features.a EH() {
        return Um().EH();
    }

    public static final int EJ() {
        return Um().EJ();
    }

    public static final Class<?> EK() {
        return Um().EK();
    }

    public static final void e(Context context, String str, int i) {
        kotlin.jvm.internal.i.f(context, "$this$showToast");
        kotlin.jvm.internal.i.f(str, "message");
        if (com.iqoption.core.ext.a.isMainThread()) {
            Toast.makeText(context, str, i).show();
        } else {
            kotlin.jvm.internal.i.e(com.iqoption.core.rx.i.akj().m(new a(context, str, i)), "ui.scheduleDirect { showToast(message, duration) }");
        }
    }

    public static /* synthetic */ void a(Context context, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 1;
        }
        a(context, i, i2);
    }

    public static final void a(Context context, int i, int i2) {
        kotlin.jvm.internal.i.f(context, "$this$showToast");
        String string = context.getString(i);
        kotlin.jvm.internal.i.e(string, "getString(resId)");
        e(context, string, i2);
    }

    public static final void z(String str, int i) {
        kotlin.jvm.internal.i.f(str, "message");
        e(Uo(), str, i);
    }

    public static final void ag(@StringRes int i, int i2) {
        z(getString(i), i2);
    }

    public static final String getString(@StringRes int i) {
        String string = Uo().getString(i);
        kotlin.jvm.internal.i.e(string, "appContext.getString(resId)");
        return string;
    }

    public static final String getString(@StringRes int i, Object... objArr) {
        kotlin.jvm.internal.i.f(objArr, "args");
        String string = Uo().getString(i, Arrays.copyOf(objArr, objArr.length));
        kotlin.jvm.internal.i.e(string, "appContext.getString(resId, *args)");
        return string;
    }

    public static final String b(@PluralsRes int i, int i2, Object... objArr) {
        kotlin.jvm.internal.i.f(objArr, "args");
        String quantityString = Uo().getResources().getQuantityString(i, i2, Arrays.copyOf(objArr, objArr.length));
        kotlin.jvm.internal.i.e(quantityString, "appContext.resources.get…g(resId, quantity, *args)");
        return quantityString;
    }

    public static final int getColor(@ColorRes int i) {
        return com.iqoption.core.ext.a.k(Uo(), i);
    }

    public static final float ey(@DimenRes int i) {
        return com.iqoption.core.ext.a.l(Uo(), i);
    }

    /* JADX WARNING: Missing block: B:29:0x0083, code skipped:
            if (r0.equals("in") != false) goto L_0x008e;
     */
    /* JADX WARNING: Missing block: B:31:0x008c, code skipped:
            if (r0.equals("id") != false) goto L_0x008e;
     */
    /* JADX WARNING: Missing block: B:52:?, code skipped:
            return "id_ID";
     */
    public static final java.lang.String getLocale() {
        /*
        r0 = java.util.Locale.getDefault();
        r1 = "Locale.getDefault()";
        kotlin.jvm.internal.i.e(r0, r1);
        r0 = r0.getLanguage();
        if (r0 != 0) goto L_0x0011;
    L_0x000f:
        goto L_0x00b2;
    L_0x0011:
        r1 = r0.hashCode();
        switch(r1) {
            case 3201: goto L_0x00a7;
            case 3246: goto L_0x009c;
            case 3276: goto L_0x0091;
            case 3355: goto L_0x0086;
            case 3365: goto L_0x007d;
            case 3371: goto L_0x0072;
            case 3428: goto L_0x0067;
            case 3588: goto L_0x005c;
            case 3651: goto L_0x0051;
            case 3666: goto L_0x0044;
            case 3700: goto L_0x0036;
            case 3710: goto L_0x0028;
            case 3886: goto L_0x001a;
            default: goto L_0x0018;
        };
    L_0x0018:
        goto L_0x00b2;
    L_0x001a:
        r1 = "zh";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x00b2;
    L_0x0023:
        r0 = "zh_CN";
        goto L_0x00b4;
    L_0x0028:
        r1 = "tr";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x00b2;
    L_0x0031:
        r0 = "tr_TR";
        goto L_0x00b4;
    L_0x0036:
        r1 = "th";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x00b2;
    L_0x003f:
        r0 = "th_TH";
        goto L_0x00b4;
    L_0x0044:
        r1 = "se";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x00b2;
    L_0x004c:
        r0 = "sv_SE";
        goto L_0x00b4;
    L_0x0051:
        r1 = "ru";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x00b2;
    L_0x0059:
        r0 = "ru_RU";
        goto L_0x00b4;
    L_0x005c:
        r1 = "pt";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x00b2;
    L_0x0064:
        r0 = "pt_PT";
        goto L_0x00b4;
    L_0x0067:
        r1 = "ko";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x00b2;
    L_0x006f:
        r0 = "ko_KO";
        goto L_0x00b4;
    L_0x0072:
        r1 = "it";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x00b2;
    L_0x007a:
        r0 = "it_IT";
        goto L_0x00b4;
    L_0x007d:
        r1 = "in";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x00b2;
    L_0x0085:
        goto L_0x008e;
    L_0x0086:
        r1 = "id";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x00b2;
    L_0x008e:
        r0 = "id_ID";
        goto L_0x00b4;
    L_0x0091:
        r1 = "fr";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x00b2;
    L_0x0099:
        r0 = "fr_FR";
        goto L_0x00b4;
    L_0x009c:
        r1 = "es";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x00b2;
    L_0x00a4:
        r0 = "es_ES";
        goto L_0x00b4;
    L_0x00a7:
        r1 = "de";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x00b2;
    L_0x00af:
        r0 = "de_DE";
        goto L_0x00b4;
    L_0x00b2:
        r0 = "en_US";
    L_0x00b4:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.core.d.getLocale():java.lang.String");
    }

    public static final boolean Uq() {
        Locale locale = Locale.getDefault();
        kotlin.jvm.internal.i.e(locale, "Locale.getDefault()");
        String language = locale.getLanguage();
        return language != null && language.hashCode() == 3886 && language.equals("zh");
    }
}
