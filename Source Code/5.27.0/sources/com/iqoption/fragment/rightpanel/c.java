package com.iqoption.fragment.rightpanel;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.appevents.AppEventsLogger;
import com.google.android.gms.analytics.HitBuilders.EventBuilder;
import com.google.android.gms.analytics.Tracker;
import com.iqoption.activity.TradeRoomActivity;
import com.iqoption.analytics.EventManager;
import com.iqoption.app.IQApp;
import com.iqoption.app.d;
import com.iqoption.app.managers.tab.TabHelper;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.microservices.kyc.response.restriction.b;
import com.iqoption.core.microservices.tradingengine.response.instrument.e;
import com.iqoption.core.util.u;
import com.iqoption.dto.Event;
import com.iqoption.fragment.ah;
import com.iqoption.util.MusicUtil;
import com.iqoption.util.MusicUtil.Sound;
import java.util.concurrent.TimeUnit;

/* compiled from: CallPutInteractor */
final class c {
    @NonNull
    private final a dlp;

    /* compiled from: CallPutInteractor */
    interface a {
        double ZC();

        double[] aFd();

        boolean aFe();

        void aFf();

        void aFg();

        boolean aFh();

        boolean aFo();

        @Nullable
        b aFp();

        TradeRoomActivity aFs();

        void aFt();

        void b(@NonNull b bVar);

        void b(boolean z, double d);

        Context getContext();

        InstrumentType getInstrumentType();

        ah getTradeFragment();
    }

    c(@NonNull a aVar) {
        this.dlp = aVar;
    }

    /* Access modifiers changed, original: final */
    public final void aFB() {
        b aFp = this.dlp.aFp();
        if (aFp != null) {
            this.dlp.b(aFp);
        } else if (this.dlp.aFe()) {
            this.dlp.aFf();
        } else {
            aFC();
        }
    }

    /* Access modifiers changed, original: final */
    public final boolean aFC() {
        com.iqoption.app.b DG = com.iqoption.app.b.DG();
        double doubleValue = DG.DI().doubleValue();
        double ZC = this.dlp.ZC();
        double[] aFd = this.dlp.aFd();
        if (ZC > doubleValue && !this.dlp.aFo()) {
            this.dlp.aFt();
            TradeRoomActivity aFs = this.dlp.aFs();
            if (!(aFs == null || doubleValue >= aFd[0] || com.iqoption.app.managers.c.GS().GV())) {
                if (DG.Ej()) {
                    com.iqoption.welcomeonboarding.a.d(aFs.getSupportFragmentManager());
                    EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "traderoom_open-account").build());
                } else if (DG.DJ() == 1) {
                    aFs.a(null, false);
                }
            }
            return false;
        } else if (ZC > aFd[1]) {
            this.dlp.b(true, aFd[1]);
            return false;
        } else if (ZC < aFd[0]) {
            this.dlp.b(false, aFd[0]);
            return false;
        } else {
            this.dlp.aFg();
            MusicUtil.a(this.dlp.getContext(), Sound.DO_BUY);
            com.iqoption.core.microservices.tradingengine.response.active.a IZ = TabHelper.IM().IZ();
            e Jb = TabHelper.IM().Jb();
            com.iqoption.core.c.a.biL.execute(new -$$Lambda$c$U1lF2vymXxF5BkBEAgnYYCMAHVU(this, ZC, this.dlp.aFh(), IZ, Jb));
            return true;
        }
    }

    private /* synthetic */ void b(double d, boolean z, com.iqoption.core.microservices.tradingengine.response.active.a aVar, e eVar) {
        a(d, z, aVar, eVar);
    }

    private void a(double d, boolean z, com.iqoption.core.microservices.tradingengine.response.active.a aVar, e eVar) {
        String str = "Deal";
        if (aVar != null) {
            try {
                Thread.sleep(100);
                d Fa = d.Fa();
                com.iqoption.app.b DG = com.iqoption.app.b.DG();
                IQApp Eu = IQApp.Eu();
                com.iqoption.analytics.a.BN();
                if (DG.DJ() == 4) {
                    IQApp.a("deal_demo", null);
                    com.iqoption.core.data.d.b WB = com.iqoption.core.data.d.b.WB();
                    if (WB.Wv() && !WB.Wy()) {
                        IQApp.a("first_deal_demo", null);
                        WB.cu(true);
                    }
                }
                int Fi = Fa.Fi();
                ah tradeFragment = this.dlp.getTradeFragment();
                if (!(tradeFragment == null || tradeFragment.cXD)) {
                    Tracker aO = IQApp.aO(this.dlp.getContext());
                    EventBuilder action = new EventBuilder().setCategory("Android").setAction(str);
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("activeId=");
                    stringBuilder.append(aVar.getActiveId());
                    aO.send(action.setLabel(stringBuilder.toString()).build());
                    tradeFragment.cXD = true;
                }
                if (Fi == 0) {
                    AppEventsLogger.O(Eu).aO("First Deal");
                } else if (Fi == 4) {
                    AppEventsLogger.O(Eu).aO("Fifth Deal");
                } else if (Fi == 19) {
                    AppEventsLogger.O(Eu).aO("Twentieth Deal");
                } else if (Fi >= 20 && !Fa.FP()) {
                    long FO = Fa.FO();
                    long currentTimeMillis = System.currentTimeMillis() - FO;
                    if (FO > 0 && currentTimeMillis <= TimeUnit.HOURS.toMillis(72)) {
                        AppEventsLogger.O(Eu).aO("fb_mobile_rate");
                        Fa.bi(true);
                    }
                }
                Fa.dL(Fi + 1);
                u.b o = u.anp().o("balance_type_id", Integer.valueOf(DG.Ej() ? 0 : DG.DJ())).o("instrument_type", aVar.getInstrumentType()).o("asset_id", Integer.valueOf(aVar.getActiveId()));
                if (eVar != null) {
                    o.o("strike_value", String.valueOf(eVar.getValue()));
                }
                EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, z ? "traderoom_deal-call" : "traderoom_deal-put").setValue(Double.valueOf(d)).setParameters(o.anr()).build());
            } catch (Exception unused) {
            }
        }
    }
}
