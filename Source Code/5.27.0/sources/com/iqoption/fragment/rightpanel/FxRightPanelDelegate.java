package com.iqoption.fragment.rightpanel;

import android.text.format.DateUtils;
import android.text.style.AbsoluteSizeSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LiveData;
import com.iqoption.activity.TradeRoomActivity;
import com.iqoption.app.managers.a.e.d;
import com.iqoption.app.managers.l;
import com.iqoption.app.managers.tab.TabHelper;
import com.iqoption.app.managers.tab.TabHelper.i;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.microservices.tradingengine.response.instrument.e;
import com.iqoption.core.util.w;
import com.iqoption.dto.entity.ActiveQuote;
import com.iqoption.dto.entity.expiration.Expiration;
import com.iqoption.e.yn;
import com.iqoption.fragment.ah;
import com.iqoption.fragment.n;
import com.iqoption.gl.NativeHandler;
import com.iqoption.gl.NativeHandler.h;
import com.iqoption.service.e.k;
import com.iqoption.system.a.g;
import com.iqoption.util.ai;
import com.iqoption.util.j;
import com.iqoption.x.R;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class FxRightPanelDelegate extends EnabledInstrumentDelegate implements com.iqoption.view.a.b.a {
    private com.iqoption.core.microservices.tradingengine.response.active.a anF;
    private Expiration anH;
    private double bmw;
    private final com.iqoption.p.a.a dkU;
    private r dkW;
    private e dkX;
    private final int dkY;
    private final int dkZ;
    private final int dla;
    private boolean dlb;
    private yn dnE;
    private final a dnF = new a(this, null);
    private final b dnG = new b(this);
    private final boolean dnH;
    private final Map<Long, Double> dnI;
    private boolean dnJ = false;
    private long dnK;
    @Nullable
    private e dnL;
    private r dnm;
    private r dnn;
    private final int dno;

    public static class c {
        private final FxRightPanelDelegate dnO;
        private final c dnP;

        c(FxRightPanelDelegate fxRightPanelDelegate) {
            this.dnO = fxRightPanelDelegate;
            this.dnP = new c(fxRightPanelDelegate);
        }

        public void aFu() {
            n.a(this.dnO.getFragmentManager(), (int) R.id.fragment);
        }

        public void aFv() {
            com.iqoption.fragment.a.b.b(this.dnO.getFragmentManager(), R.id.fragment, this.dnO.ZC(), this.dnO.aFd()[0]);
        }

        public void bB(View view) {
            if (this.dnO.aGU()) {
                if (this.dnO.aFp() != null) {
                    this.dnO.bA(view);
                }
                this.dnO.dQ(true);
                this.dnP.aFB();
            }
        }

        public void bC(View view) {
            if (this.dnO.aGU()) {
                if (this.dnO.aFp() != null) {
                    this.dnO.bA(view);
                }
                this.dnO.dQ(false);
                this.dnP.aFB();
            }
        }

        public void aFy() {
            this.dnO.aFm();
            this.dnP.aFC();
        }

        public void aFz() {
            this.dnO.aFm();
        }

        public void aFA() {
            TabHelper.IM().Jg();
        }
    }

    private static class a extends com.iqoption.system.a.e<FxRightPanelDelegate> {
        /* synthetic */ a(FxRightPanelDelegate fxRightPanelDelegate, AnonymousClass1 anonymousClass1) {
            this(fxRightPanelDelegate);
        }

        private a(FxRightPanelDelegate fxRightPanelDelegate) {
            super(fxRightPanelDelegate);
        }

        @com.google.common.b.e
        public void onInitializationCompletedEvent(TabHelper.e eVar) {
            com.iqoption.core.c.a.biN.execute(new -$$Lambda$FxRightPanelDelegate$a$CIxw5-q2WvxhIq0RNuUB1Y2Yz2E(this));
        }

        private /* synthetic */ void aGV() {
            FxRightPanelDelegate fxRightPanelDelegate = (FxRightPanelDelegate) this.dUo.get();
            if (fxRightPanelDelegate != null) {
                fxRightPanelDelegate.aFj();
            }
        }

        @com.google.common.b.e
        public void onAmountChangedIQKeyboardEvent(com.iqoption.fragment.a.b.a aVar) {
            com.iqoption.core.c.a.biN.execute(new -$$Lambda$FxRightPanelDelegate$a$ZnFv1_HLpSfeyoy9pb-RsJ_-m8I(this, aVar));
        }

        @com.google.common.b.e
        public void onShowedIQKeyboardEvent(com.iqoption.fragment.a.b.b bVar) {
            com.iqoption.core.c.a.biN.execute(new -$$Lambda$FxRightPanelDelegate$a$DHHYuBJ-rcp1uH7KttLahwfeimg(this, bVar));
        }

        @com.google.common.b.e
        public void onShowedExpirationFragmentEvent(d dVar) {
            com.iqoption.core.c.a.biN.execute(new -$$Lambda$FxRightPanelDelegate$a$ZuUIVN-CsDDnXs5njkkow0Kwkgg(this, dVar));
        }

        @com.google.common.b.e
        public void onChangeExpirationEvent(com.iqoption.app.managers.a.e.a aVar) {
            if (aVar.avF == TabHelper.IM().Ji()) {
                com.iqoption.core.c.a.biN.execute(new -$$Lambda$FxRightPanelDelegate$a$Ms_EZ10hW9SnhrGs4Gm5-Y0D0as(this, aVar));
            }
        }

        private /* synthetic */ void d(com.iqoption.app.managers.a.e.a aVar) {
            FxRightPanelDelegate fxRightPanelDelegate = (FxRightPanelDelegate) this.dUo.get();
            if (fxRightPanelDelegate != null) {
                fxRightPanelDelegate.j(aVar.anH);
                fxRightPanelDelegate.aGT();
                fxRightPanelDelegate.aFj();
            }
        }

        @com.google.common.b.e
        public void onChangeStrikeEvent(com.iqoption.app.managers.a.e.b bVar) {
            if (bVar.avF == TabHelper.IM().Ji()) {
                com.iqoption.core.c.a.biN.execute(new -$$Lambda$FxRightPanelDelegate$a$yo88s28P53H8mSMZmkDaQEvwWW0(this, bVar));
            }
        }

        @com.google.common.b.e
        public void onExpirationCrossScreenBorderEvent(h hVar) {
            com.iqoption.core.c.a.biN.execute(new -$$Lambda$FxRightPanelDelegate$a$u9-BUl7Ca7Csgukh2F_m1ElNlBM(this, hVar));
        }
    }

    public static class b extends g<FxRightPanelDelegate> {
        public b(FxRightPanelDelegate fxRightPanelDelegate) {
            super(fxRightPanelDelegate);
        }

        @com.google.common.b.e
        public void onChangeBalanceType(com.iqoption.service.e.b bVar) {
            com.iqoption.core.c.a.biN.execute(new -$$Lambda$FxRightPanelDelegate$b$XpXe-ar4OhxtIVIC4ipNxo-zKxw(this));
        }

        private /* synthetic */ void aGY() {
            FxRightPanelDelegate fxRightPanelDelegate = (FxRightPanelDelegate) this.dUo.get();
            if (fxRightPanelDelegate != null) {
                fxRightPanelDelegate.K(fxRightPanelDelegate.Fd());
            }
        }

        @com.google.common.b.e
        public void onUpdateBalanceValue(k kVar) {
            com.iqoption.core.c.a.biN.execute(new -$$Lambda$FxRightPanelDelegate$b$jFRc-c6OJjqGCHLMdkYs7xKfzOI(this));
        }

        private /* synthetic */ void aGX() {
            FxRightPanelDelegate fxRightPanelDelegate = (FxRightPanelDelegate) this.dUo.get();
            if (fxRightPanelDelegate != null) {
                fxRightPanelDelegate.aFj();
            }
        }

        @com.google.common.b.e
        public void onChangeCurrentCurrency(com.iqoption.service.e.c cVar) {
            com.iqoption.core.c.a.biN.execute(new -$$Lambda$FxRightPanelDelegate$b$wFbtdd7c0Zi1Quoj9tsTaIaet3E(this));
        }

        private /* synthetic */ void aGW() {
            FxRightPanelDelegate fxRightPanelDelegate = (FxRightPanelDelegate) this.dUo.get();
            if (fxRightPanelDelegate != null) {
                fxRightPanelDelegate.aFi();
            }
        }
    }

    public /* bridge */ /* synthetic */ boolean aFo() {
        return super.aFo();
    }

    @Nullable
    public /* bridge */ /* synthetic */ com.iqoption.core.microservices.kyc.response.restriction.b aFp() {
        return super.aFp();
    }

    public /* bridge */ /* synthetic */ LiveData aFq() {
        return super.aFq();
    }

    public /* bridge */ /* synthetic */ RightPanelFragment aFr() {
        return super.aFr();
    }

    public /* bridge */ /* synthetic */ TradeRoomActivity aFs() {
        return super.aFs();
    }

    public /* bridge */ /* synthetic */ void aFt() {
        super.aFt();
    }

    public /* bridge */ /* synthetic */ void bA(View view) {
        super.bA(view);
    }

    @NonNull
    public /* bridge */ /* synthetic */ Lifecycle getLifecycle() {
        return super.getLifecycle();
    }

    public /* bridge */ /* synthetic */ ah getTradeFragment() {
        return super.getTradeFragment();
    }

    FxRightPanelDelegate(RightPanelFragment rightPanelFragment, com.iqoption.core.microservices.tradingengine.response.active.a aVar) {
        super(rightPanelFragment);
        this.anF = aVar;
        this.dkU = new com.iqoption.p.a.a(aVar.getPrecision());
        this.dnI = com.iqoption.app.managers.feature.a.Il();
        this.dnH = com.iqoption.app.managers.feature.a.ef("fx-show-expiration-line-mode");
        this.dkY = ContextCompat.getColor(getContext(), R.color.red);
        this.dkZ = ContextCompat.getColor(getContext(), R.color.white);
        this.dla = rightPanelFragment.getResources().getDimensionPixelSize(R.dimen.dp24);
        this.dno = rightPanelFragment.getResources().getDimensionPixelSize(R.dimen.sp10);
        this.dnF.register();
        this.dnG.register();
        com.iqoption.view.a.b.aYv().a((com.iqoption.view.a.b.a) this, Integer.valueOf(5));
    }

    public boolean aFe() {
        return com.iqoption.l.b.aTS().aUa() ^ 1;
    }

    public void aFf() {
        boolean aFh = aFh();
        this.dnE.csu.b(this.bmw, this.dkQ);
        this.dkX.ak(this.dnE.csu);
        com.iqoption.gl.c.aIy().onConfirmationPanelOpen(aFh);
    }

    public void aFg() {
        i Jh = TabHelper.IM().Jh();
        if (Jh != null) {
            com.iqoption.mobbtech.connect.request.api.a.b.a(Jh.Jz(), Jh.Jv(), this.bmw, com.iqoption.app.b.DG().DH(), this.dlb);
        }
    }

    public boolean aFh() {
        return this.dlb;
    }

    public double ZC() {
        return this.bmw;
    }

    public double[] aFd() {
        double[] ae = j.ae(getInstrumentType());
        if (!w.C(this.dnI)) {
            Expiration expiration = this.anH;
            if (!(expiration == null || expiration.expInterval == null)) {
                Double d = (Double) this.dnI.get(this.anH.expInterval);
                if (d != null) {
                    ae[0] = j.P(d.doubleValue());
                }
            }
        }
        return ae;
    }

    /* Access modifiers changed, original: 0000 */
    @NonNull
    public View e(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        final c cVar = new c(this);
        this.dnE = (yn) DataBindingUtil.inflate(layoutInflater, R.layout.right_panel_fx_delegate, viewGroup, false);
        this.dnE.a(cVar);
        this.dnm = new r(this.dnE.ctJ, this.dnE.csv);
        this.dnn = new r(this.dnE.csC, this.dnE.csB);
        this.dkW = new r(this.dnE.crv, this.dnE.crs);
        this.dkX = new e(this.dla, this.dnE.ctF, this.dnE.csu, this.dnE.crC);
        this.dnE.csu.setConfirmListener(new com.iqoption.view.d.b(1000) {
            public void M(View view) {
                cVar.aFy();
            }
        });
        this.dnE.csu.setCancelListener(new com.iqoption.view.d.b() {
            public void M(View view) {
                cVar.aFz();
            }
        });
        this.dnE.crC.setBuyNewListener(new com.iqoption.view.d.b() {
            public void M(View view) {
                cVar.aFA();
            }
        });
        this.dnE.ctD.setOnClickListener(new com.iqoption.view.d.b() {
            public void M(View view) {
                cVar.bB(view);
            }
        });
        this.dnE.ctE.setOnClickListener(new com.iqoption.view.d.b() {
            public void M(View view) {
                cVar.bC(view);
            }
        });
        K(Fd());
        j(TabHelper.IM().Jd());
        c(TabHelper.IM().Jb());
        this.dnE.csu.setTypeVisibility(false);
        return this.dnE.getRoot();
    }

    /* Access modifiers changed, original: 0000 */
    public void T(@NonNull com.iqoption.core.microservices.tradingengine.response.active.a aVar) {
        super.T(this.anF);
        this.anF = aVar;
        this.dkU.ht(aVar.getPrecision());
        aFm();
    }

    /* Access modifiers changed, original: 0000 */
    public void j(Expiration expiration) {
        this.anH = expiration;
        aFk();
    }

    private void aGT() {
        if (this.dnH) {
            Expiration expiration = this.anH;
            if (expiration != null && expiration.expInterval != null && TimeUnit.HOURS.toMillis(1) <= this.anH.expInterval.longValue()) {
                i Jh = TabHelper.IM().Jh();
                if (Jh != null) {
                    Jh.eh(60);
                }
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void K(double d) {
        if (d < 0.0d) {
            d = 0.0d;
        }
        this.bmw = d;
        if (this.dnE != null) {
            String a = j.a(d, this.dkQ);
            this.dnE.crv.setText(a);
            this.dnE.csu.setInvest(a);
        }
        aFj();
        aGQ();
    }

    /* Access modifiers changed, original: 0000 */
    public void c(e eVar) {
        this.dnL = eVar;
        if (this.dnE != null) {
            Double f = f(eVar);
            if (f != null) {
                String format = this.dkU.format(f.doubleValue());
                this.dnE.csC.setText(new ai().cs(new AbsoluteSizeSpan(this.dno)).jP(format.substring(0, format.length() - 3)).aWX().jP(" ").O(format.subSequence(format.length() - 3, format.length())).anA());
                return;
            }
            this.dnE.csC.setText(null);
        }
    }

    private Double f(e eVar) {
        if (eVar == null) {
            return null;
        }
        return Double.valueOf(eVar.aiD() ? eVar.aiz() : eVar.getValue());
    }

    private void onExpirationCrossScreenBorder(boolean z) {
        if (this.dnJ != z) {
            this.dnJ = z;
            aFk();
        }
    }

    private void aFk() {
        if (this.dnE != null) {
            if (this.dnJ) {
                this.dnE.ctJ.E(com.iqoption.app.managers.a.e.Ig().a(this.anF, this.anH.expValue.longValue()));
            } else {
                this.dnE.ctJ.D(com.iqoption.app.managers.a.e.a(getContext(), this.dnK, this.anH.expValue.longValue()));
            }
            if (this.dkX.bE(this.dnE.csu)) {
                this.dnE.csu.setExpiration(com.iqoption.app.managers.a.e.a(getContext(), this.dnK, this.anH.expValue.longValue()));
            }
        }
    }

    private void aFj() {
        if (this.dnE != null) {
            double doubleValue = com.iqoption.app.b.DG().DI().doubleValue();
            double[] aFd = aFd();
            double d = this.bmw;
            if (d > doubleValue || d > aFd[1] || d < aFd[0]) {
                this.dnE.crv.setTextColor(this.dkY);
            } else {
                this.dnE.crv.setTextColor(this.dkZ);
            }
        }
    }

    private boolean aGU() {
        double doubleValue = com.iqoption.app.b.DG().DI().doubleValue();
        double[] aFd = aFd();
        double d = this.bmw;
        if (d > doubleValue) {
            aFt();
            return false;
        } else if (d > aFd[1]) {
            b(true, aFd[1]);
            return false;
        } else if (d >= aFd[0]) {
            return true;
        } else {
            b(false, aFd[0]);
            return false;
        }
    }

    private void dQ(boolean z) {
        this.dlb = z;
    }

    private void aGQ() {
        if (this.dnE != null) {
            e Jb = TabHelper.IM().Jb();
            if (Jb != null) {
                com.iqoption.core.microservices.tradingengine.response.a c = com.iqoption.app.managers.c.GS().c(Jb.aiA().getId(), InstrumentType.FX_INSTRUMENT);
                if (g(c)) {
                    RightPanelDelegate.bH(this.dnE.ctD);
                } else {
                    RightPanelDelegate.bI(this.dnE.ctD);
                }
                com.iqoption.core.microservices.tradingengine.response.a c2 = com.iqoption.app.managers.c.GS().c(Jb.aiB().getId(), InstrumentType.FX_INSTRUMENT);
                if (g(c2)) {
                    RightPanelDelegate.bH(this.dnE.ctE);
                } else {
                    RightPanelDelegate.bI(this.dnE.ctE);
                }
                NativeHandler.instance().singleThreadExecutor.execute(new -$$Lambda$FxRightPanelDelegate$AbGBkbpOLIrMXWjdX668jBsT7xs(Jb, c, c2));
                return;
            }
            RightPanelDelegate.bI(this.dnE.ctD);
            RightPanelDelegate.bI(this.dnE.ctE);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void destroy() {
        super.destroy();
        this.dnF.unregister();
        this.dnG.unregister();
        com.iqoption.view.a.b.aYv().b((com.iqoption.view.a.b.a) this);
        com.iqoption.gl.c.aIy().onConfirmationPanelClose();
    }

    @Nullable
    public InstrumentType getInstrumentType() {
        com.iqoption.core.microservices.tradingengine.response.active.a aVar = this.anF;
        return aVar != null ? aVar.instrumentType : null;
    }

    public void onTick(long j) {
        this.dnK = j;
        if (com.iqoption.util.c.a.d(this.anF, j)) {
            if (this.dkX.bE(this.dnE.crC)) {
                if (b(this.anF, j)) {
                    this.dnE.crC.setTimeToClose(DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(this.anH.expValue.longValue() - j)));
                } else {
                    aFm();
                }
            } else if (b(this.anF, j)) {
                aFn();
            } else {
                aGQ();
            }
            if (this.dkX.bE(this.dnE.csu)) {
                ActiveQuote dY = com.iqoption.app.managers.c.GS().dY(this.anF.getActiveId());
                Double d = null;
                if (dY != null) {
                    this.dnE.csu.setLevel(this.dkU.format(dY.getVal()));
                } else {
                    this.dnE.csu.setLevel(null);
                }
                boolean aFh = aFh();
                if (this.dnL != null) {
                    com.iqoption.core.microservices.tradingengine.response.a c;
                    if (aFh) {
                        c = com.iqoption.app.managers.c.GS().c(this.dnL.aiA().getId(), this.dnL.getInstrumentType());
                        if (!(!this.dnL.aiA().isEnabled() || c == null || c.getAskPrice() == 0.0d)) {
                            d = Double.valueOf(c.getAskPrice());
                        }
                    } else {
                        c = com.iqoption.app.managers.c.GS().c(this.dnL.aiB().getId(), this.dnL.getInstrumentType());
                        if (!(!this.dnL.aiB().isEnabled() || c == null || c.getAskPrice() == 0.0d)) {
                            d = Double.valueOf(c.getAskPrice());
                        }
                    }
                }
                if (d != null) {
                    this.dnE.csu.setPrice(this.dkU.format(d.doubleValue()));
                } else {
                    this.dnE.csu.aXR();
                }
                Double f = f(this.dnL);
                if (f == null || dY == null || d == null) {
                    this.dnE.csu.aXS();
                } else {
                    double doubleValue;
                    if (aFh) {
                        doubleValue = f.doubleValue() + d.doubleValue();
                    } else {
                        doubleValue = f.doubleValue() - d.doubleValue();
                    }
                    this.dnE.csu.setBep(this.dkU.format(doubleValue));
                }
            }
            if (this.dpm && !l.HZ().Ie()) {
                RightPanelDelegate.bI(this.dnE.ctD);
                RightPanelDelegate.bI(this.dnE.ctE);
            }
            aFk();
            return;
        }
        com.iqoption.view.a.b.aYv().b((com.iqoption.view.a.b.a) this);
        aFr().ac(this.anF);
    }

    private boolean b(@NonNull com.iqoption.core.microservices.tradingengine.response.active.a aVar, long j) {
        if (j <= this.anH.expValue.longValue() - com.iqoption.app.managers.a.e.Ig().c(aVar, this.anH) || j >= this.anH.expValue.longValue()) {
            return false;
        }
        return com.iqoption.app.managers.c.GS().b(new com.iqoption.mobbtech.connect.response.options.d(Long.valueOf(this.anH.expValue.longValue() / 1000), Integer.valueOf(aVar.getActiveId()), aVar.getInstrumentType())) ^ 1;
    }

    /* Access modifiers changed, original: 0000 */
    public void aFm() {
        this.dkX.ak(this.dnE.ctF);
        com.iqoption.gl.c.aIy().onConfirmationPanelClose();
    }

    /* Access modifiers changed, original: 0000 */
    public void aFn() {
        this.dkX.ak(this.dnE.crC);
    }

    private void aFi() {
        this.dnE.crv.setText(j.a(this.bmw, this.dkQ));
    }

    /* Access modifiers changed, original: 0000 */
    public void dO(boolean z) {
        this.dnE.csx.setSelected(z);
        this.dnE.csw.setSelected(z);
        if (z) {
            this.dnm.select();
            this.dnn.select();
            return;
        }
        this.dnm.aHN();
        this.dnn.aHN();
    }

    /* Access modifiers changed, original: 0000 */
    public void dP(boolean z) {
        this.dnE.cru.setSelected(z);
        this.dnE.crt.setSelected(z);
        if (z) {
            this.dkW.select();
        } else {
            this.dkW.aHN();
        }
    }

    private static boolean g(com.iqoption.core.microservices.tradingengine.response.a aVar) {
        return (aVar == null || aVar.getAskPrice() == 0.0d || aVar.ahJ() <= 0.0d) ? false : true;
    }
}
