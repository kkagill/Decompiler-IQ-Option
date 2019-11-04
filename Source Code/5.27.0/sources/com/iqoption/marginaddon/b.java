package com.iqoption.marginaddon;

import java.util.List;
import kotlin.d;
import kotlin.i;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\r\u001a\u00020\u0005H\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0007J\b\u0010\u0010\u001a\u00020\u000fH\u0007J\b\u0010\u0011\u001a\u00020\u0012H\u0007J\b\u0010\u0013\u001a\u00020\u000fH\u0007R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000R#\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u00078BX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, bng = {"Lcom/iqoption/marginaddon/MarginAddOnInfoHelper;", "", "()V", "DEALS_FOR_SHOW", "", "", "preferences", "Lcom/iqoption/app/Preferences;", "kotlin.jvm.PlatformType", "getPreferences", "()Lcom/iqoption/app/Preferences;", "preferences$delegate", "Lkotlin/Lazy;", "getDealsCount", "incrementMarginAddOnDialogShown", "", "incrementOpenedPosition", "isMarginAddOnInfoNeeded", "", "setMarginAddOnWasEnabled", "app_optionXRelease"})
/* compiled from: MarginAddOnInfoHelper.kt */
public final class b {
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(b.class), "preferences", "getPreferences()Lcom/iqoption/app/Preferences;"))};
    private static final List<Integer> dEZ = u.T(ak.N(Integer.valueOf(0), Integer.valueOf(5), Integer.valueOf(10), Integer.valueOf(20), Integer.valueOf(35), Integer.valueOf(55)));
    private static final d dFa = g.c(MarginAddOnInfoHelper$preferences$2.dFc);
    public static final b dFb = new b();

    private final com.iqoption.app.d aNy() {
        d dVar = dFa;
        j jVar = anY[0];
        return (com.iqoption.app.d) dVar.getValue();
    }

    private b() {
    }

    public static final boolean aNz() {
        int aNA = dFb.aNA();
        com.iqoption.app.d aNy = dFb.aNy();
        String str = "preferences";
        kotlin.jvm.internal.i.e(aNy, str);
        int Gk = aNy.Gk();
        com.iqoption.l.b aTS = com.iqoption.l.b.aTS();
        kotlin.jvm.internal.i.e(aTS, "SettingsManager.instance()");
        if (aTS.Fn()) {
            return false;
        }
        com.iqoption.app.d aNy2 = dFb.aNy();
        kotlin.jvm.internal.i.e(aNy2, str);
        if (!aNy2.Gh() && Gk < dEZ.size() && ((Number) dEZ.get(Gk)).intValue() == aNA) {
            return true;
        }
        return false;
    }

    private final int aNA() {
        com.iqoption.app.d aNy = aNy();
        kotlin.jvm.internal.i.e(aNy, "preferences");
        return aNy.Gi();
    }

    public static final void aNB() {
        dFb.aNy().Gj();
    }

    public static final void aNC() {
        com.iqoption.app.d aNy = dFb.aNy();
        String str = "preferences";
        kotlin.jvm.internal.i.e(aNy, str);
        int Gi = aNy.Gi();
        com.iqoption.app.d aNy2 = dFb.aNy();
        kotlin.jvm.internal.i.e(aNy2, str);
        aNy2.dS(Gi + 1);
    }

    public static final void aND() {
        com.iqoption.app.d aNy = dFb.aNy();
        kotlin.jvm.internal.i.e(aNy, "preferences");
        aNy.bt(true);
    }
}
