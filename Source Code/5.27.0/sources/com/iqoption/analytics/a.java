package com.iqoption.analytics;

import com.iqoption.app.IQApp;
import com.iqoption.core.data.d.b;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0007R\u0012\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0007"}, bng = {"Lcom/iqoption/analytics/DealsAnalyticsUtils;", "", "()V", "isTrialUserDepositClicked", "", "reportFirstRealDealIfNeeded", "", "app_optionXRelease"})
/* compiled from: DealsAnalyticsUtils.kt */
public final class a {
    public static boolean aqy;
    public static final a aqz = new a();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "run"})
    /* compiled from: DealsAnalyticsUtils.kt */
    static final class a implements Runnable {
        public static final a aqA = new a();

        a() {
        }

        public final void run() {
            b WB = b.bdk.WB();
            boolean Wx = WB.Wx();
            boolean Wv = WB.Wv();
            if (!Wx && Wv) {
                IQApp.a("first_deal_real", null);
            }
            WB.ct(true);
        }
    }

    private a() {
    }

    public static final void BN() {
        com.iqoption.app.b DG = com.iqoption.app.b.DG();
        kotlin.jvm.internal.i.e(DG, "account");
        if (DG.DJ() == 1 && !DG.Ej()) {
            com.iqoption.core.rx.i.akj().m(a.aqA);
        }
    }
}
