package com.iqoption.debugmenu.debugmenu;

import android.text.TextUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import com.iqoption.core.connect.http.c;
import com.iqoption.core.d;
import com.iqoption.core.data.config.ApiConfig.Type;
import com.iqoption.core.data.config.g;
import com.iqoption.core.data.config.h;
import kotlin.i;
import kotlin.text.Regex;

@i(bne = {1, 1, 15}, bnf = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020#H\u0007J\u0018\u0010$\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020#H\u0007R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\u00068\u0006XD¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u00020\f8\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u00020\f8FX\u0004¢\u0006\f\u0012\u0004\b\u000f\u0010\u0002\u001a\u0004\b\u000e\u0010\u0010R\u0012\u0010\u0011\u001a\u00020\f8\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0012\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0013\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0014\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\u0015\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0010R$\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR$\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001b¨\u0006%"}, bng = {"Lcom/iqoption/debugmenu/debugmenu/DebugConsole;", "", "()V", "DEV_APP_ID_REGEX", "Lkotlin/text/Regex;", "INT", "", "PROD", "SANDBOX", "aff", "afftrack", "isAff", "", "isAfftrack", "isAvailable", "isAvailable$annotations", "()Z", "isCustomCoockie", "isCustomCoockieKey", "isCustomCoockieValue", "isStaging", "isWsRoute", "value", "staging", "getStaging", "()Ljava/lang/String;", "setStaging", "(Ljava/lang/String;)V", "wsRoute", "getWsRoute", "setWsRoute", "applyHost", "Lio/reactivex/Completable;", "newHost", "type", "Lcom/iqoption/core/data/config/ApiConfig$Type;", "changeHost", "debugmenu_release"})
/* compiled from: DebugConsole.kt */
public final class a {
    public static final String cvk = h.bbU;
    public static final String cvl = g.bbU;
    public static final String cvm = cvm;
    public static final Regex cvn = new Regex("com\\.iqoption\\.dev(\\.x)?");
    private static String cvo;
    private static String cvp;
    public static boolean cvq;
    public static String cvr;
    public static boolean cvs;
    public static String cvt;
    public static boolean cvu;
    public static String cvw;
    public static String cvx;
    public static final a cvy = new a();

    static {
        String str = "";
        cvo = str;
        cvp = str;
        cvr = str;
        cvt = str;
        cvw = str;
        cvx = str;
    }

    private a() {
    }

    public final boolean DE() {
        return kotlin.jvm.internal.i.y(cvo, "") ^ 1;
    }

    public final String DF() {
        return cvo;
    }

    public final void hz(String str) {
        kotlin.jvm.internal.i.f(str, ConditionalUserProperty.VALUE);
        cvo = str;
        c.baF.UI();
    }

    public final boolean DC() {
        return kotlin.jvm.internal.i.y(cvp, "") ^ 1;
    }

    public final String DD() {
        return cvp;
    }

    public static final boolean isAvailable() {
        if (!d.Un().Ds()) {
            if (!cvn.L(d.Un().Dv())) {
                return false;
            }
        }
        return true;
    }

    public static final io.reactivex.a b(String str, Type type) {
        kotlin.jvm.internal.i.f(str, "newHost");
        kotlin.jvm.internal.i.f(type, "type");
        if (!isAvailable() || TextUtils.isEmpty(str)) {
            io.reactivex.a bkL = io.reactivex.a.bkL();
            kotlin.jvm.internal.i.e(bkL, "Completable.complete()");
            return bkL;
        }
        io.reactivex.a c = c(str, type);
        com.iqoption.core.data.d.a.bdi.setHost(str);
        com.iqoption.core.data.d.a.bdi.b(type);
        c.UH().UR();
        c.UH().clear();
        return c;
    }

    public static final io.reactivex.a c(String str, Type type) {
        kotlin.jvm.internal.i.f(str, "newHost");
        kotlin.jvm.internal.i.f(type, "type");
        if (isAvailable() && !TextUtils.isEmpty(str)) {
            return d.EE().a(str, type);
        }
        io.reactivex.a bkL = io.reactivex.a.bkL();
        kotlin.jvm.internal.i.e(bkL, "Completable.complete()");
        return bkL;
    }
}
