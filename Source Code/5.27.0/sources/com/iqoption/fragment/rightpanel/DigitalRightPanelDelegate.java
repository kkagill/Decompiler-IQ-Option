package com.iqoption.fragment.rightpanel;

import android.text.format.DateUtils;
import android.text.style.AbsoluteSizeSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LiveData;
import androidx.transition.Transition;
import androidx.transition.TransitionInflater;
import androidx.transition.TransitionListenerAdapter;
import androidx.transition.TransitionManager;
import com.iqoption.activity.TradeRoomActivity;
import com.iqoption.analytics.EventManager;
import com.iqoption.app.managers.a.e.d;
import com.iqoption.app.managers.l;
import com.iqoption.app.managers.tab.TabHelper;
import com.iqoption.app.managers.tab.TabHelper.i;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.dto.Event;
import com.iqoption.dto.entity.ActiveQuote;
import com.iqoption.dto.entity.expiration.Expiration;
import com.iqoption.e.xx;
import com.iqoption.fragment.ah;
import com.iqoption.fragment.j;
import com.iqoption.gl.NativeHandler;
import com.iqoption.service.e.k;
import com.iqoption.system.a.e;
import com.iqoption.system.a.g;
import com.iqoption.util.ae;
import com.iqoption.util.ai;
import com.iqoption.x.R;
import java.util.concurrent.TimeUnit;

public final class DigitalRightPanelDelegate extends EnabledInstrumentDelegate implements com.iqoption.view.a.b.a {
    private static final String TAG = "DigitalRightPanelDelegate";
    private Integer activeId;
    private Expiration anH;
    private double bmw;
    private final com.iqoption.p.a.a dkU;
    private r dkW;
    private e dkX;
    private int dkY;
    private int dkZ;
    private int dla;
    private boolean dlb;
    private final a dnk = new a(this, null);
    private final b dnl = new b(this);
    private r dnm;
    private r dnn;
    private int dno;
    private xx dnp;
    private h dnq;
    private com.iqoption.core.ui.b.a dnr = new com.iqoption.core.ui.b.a();
    private com.iqoption.core.ui.b.a dnt = new com.iqoption.core.ui.b.a();
    private com.iqoption.core.ui.b.a dnu;
    private View dnv;
    private View dnw;
    private Transition dnx;
    private InstrumentType instrumentType;

    public static final class c {
        private final c dlo;
        private final DigitalRightPanelDelegate dnD;

        public c(DigitalRightPanelDelegate digitalRightPanelDelegate) {
            this.dnD = digitalRightPanelDelegate;
            this.dlo = new c(digitalRightPanelDelegate);
        }

        public void aFu() {
            j.a(this.dnD.getFragmentManager(), (int) R.id.fragment);
            EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "traderoom_expiration-time").build());
        }

        public void aFv() {
            EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "deal-keyboard_keyboard").setValue(Double.valueOf(com.iqoption.fragment.a.b.b(this.dnD.getFragmentManager(), R.id.fragment, this.dnD.ZC(), this.dnD.aFd()[0]) ? 1.0d : 0.0d)).build());
        }

        public void bB(View view) {
            if (this.dnD.aFp() != null) {
                this.dnD.bA(view);
            }
            this.dnD.dQ(true);
            this.dlo.aFB();
        }

        public void bC(View view) {
            if (this.dnD.aFp() != null) {
                this.dnD.bA(view);
            }
            this.dnD.dQ(false);
            this.dlo.aFB();
        }

        public void aFy() {
            this.dnD.aFm();
            this.dlo.aFC();
        }

        public void aFz() {
            this.dnD.aFm();
        }

        public void aFA() {
            Expiration Jg = TabHelper.IM().Jg();
            if (Jg != null) {
                this.dnD.j(Jg);
            }
        }
    }

    public static final class a extends e<DigitalRightPanelDelegate> {
        /* synthetic */ a(DigitalRightPanelDelegate digitalRightPanelDelegate, AnonymousClass1 anonymousClass1) {
            this(digitalRightPanelDelegate);
        }

        private a(DigitalRightPanelDelegate digitalRightPanelDelegate) {
            super(digitalRightPanelDelegate);
        }

        @com.google.common.b.e
        public void onInitializationCompletedEvent(TabHelper.e eVar) {
            com.iqoption.core.c.a.biN.execute(new Runnable() {
                public void run() {
                    DigitalRightPanelDelegate digitalRightPanelDelegate = (DigitalRightPanelDelegate) a.this.dUo.get();
                    if (digitalRightPanelDelegate != null) {
                        digitalRightPanelDelegate.aFj();
                    }
                }
            });
        }

        @com.google.common.b.e
        public void onAmountChangedIQKeyboardEvent(final com.iqoption.fragment.a.b.a aVar) {
            com.iqoption.core.c.a.biN.execute(new Runnable() {
                public void run() {
                    DigitalRightPanelDelegate digitalRightPanelDelegate = (DigitalRightPanelDelegate) a.this.dUo.get();
                    if (digitalRightPanelDelegate != null) {
                        digitalRightPanelDelegate.J(((Double) aVar.getValue()).doubleValue());
                    }
                }
            });
        }

        @com.google.common.b.e
        public void onShowedIQKeyboardEvent(final com.iqoption.fragment.a.b.b bVar) {
            com.iqoption.core.c.a.biN.execute(new Runnable() {
                public void run() {
                    DigitalRightPanelDelegate digitalRightPanelDelegate = (DigitalRightPanelDelegate) a.this.dUo.get();
                    if (digitalRightPanelDelegate != null) {
                        digitalRightPanelDelegate.dP(((Boolean) bVar.getValue()).booleanValue());
                    }
                }
            });
        }

        @com.google.common.b.e
        public void onShowedExpirationFragmentEvent(final d dVar) {
            com.iqoption.core.c.a.biN.execute(new Runnable() {
                public void run() {
                    DigitalRightPanelDelegate digitalRightPanelDelegate = (DigitalRightPanelDelegate) a.this.dUo.get();
                    if (digitalRightPanelDelegate != null) {
                        digitalRightPanelDelegate.dO(dVar.ajQ);
                    }
                }
            });
        }

        @com.google.common.b.e
        public void onChangeExpirationEvent(final com.iqoption.app.managers.a.e.a aVar) {
            if (aVar.avF == TabHelper.IM().Ji()) {
                com.iqoption.core.c.a.biN.execute(new Runnable() {
                    public void run() {
                        DigitalRightPanelDelegate digitalRightPanelDelegate = (DigitalRightPanelDelegate) a.this.dUo.get();
                        if (digitalRightPanelDelegate != null) {
                            digitalRightPanelDelegate.j(aVar.anH);
                        }
                    }
                });
            }
        }

        @com.google.common.b.e
        public void onChangeStrikeEvent(final com.iqoption.app.managers.a.e.b bVar) {
            if (bVar.avF == TabHelper.IM().Ji()) {
                com.iqoption.core.c.a.biN.execute(new Runnable() {
                    public void run() {
                        DigitalRightPanelDelegate digitalRightPanelDelegate = (DigitalRightPanelDelegate) a.this.dUo.get();
                        if (digitalRightPanelDelegate != null) {
                            digitalRightPanelDelegate.c((com.iqoption.core.microservices.tradingengine.response.instrument.e) bVar.getValue());
                        }
                    }
                });
            }
        }
    }

    public static class b extends g<DigitalRightPanelDelegate> {
        public b(DigitalRightPanelDelegate digitalRightPanelDelegate) {
            super(digitalRightPanelDelegate);
        }

        @com.google.common.b.e
        public void onChangeBalanceType(com.iqoption.service.e.b bVar) {
            com.iqoption.core.c.a.biN.execute(new Runnable() {
                public void run() {
                    DigitalRightPanelDelegate digitalRightPanelDelegate = (DigitalRightPanelDelegate) b.this.dUo.get();
                    if (digitalRightPanelDelegate != null) {
                        digitalRightPanelDelegate.K(digitalRightPanelDelegate.Fd());
                    }
                }
            });
        }

        @com.google.common.b.e
        public void onUpdateBalanceValue(k kVar) {
            com.iqoption.core.c.a.biN.execute(new Runnable() {
                public void run() {
                    DigitalRightPanelDelegate digitalRightPanelDelegate = (DigitalRightPanelDelegate) b.this.dUo.get();
                    if (digitalRightPanelDelegate != null) {
                        digitalRightPanelDelegate.aFj();
                    }
                }
            });
        }

        @com.google.common.b.e
        public void onChangeCurrentCurrency(com.iqoption.service.e.c cVar) {
            com.iqoption.core.c.a.biN.execute(new Runnable() {
                public void run() {
                    DigitalRightPanelDelegate digitalRightPanelDelegate = (DigitalRightPanelDelegate) b.this.dUo.get();
                    if (digitalRightPanelDelegate != null) {
                        digitalRightPanelDelegate.aFi();
                    }
                }
            });
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

    public DigitalRightPanelDelegate(RightPanelFragment rightPanelFragment, com.iqoption.core.microservices.tradingengine.response.active.a aVar) {
        super(rightPanelFragment);
        this.activeId = Integer.valueOf(aVar.getActiveId());
        this.instrumentType = aVar.getInstrumentType();
        this.dkU = new com.iqoption.p.a.a(aVar.getPrecision());
        this.dkY = ContextCompat.getColor(getContext(), R.color.red);
        this.dkZ = ContextCompat.getColor(getContext(), R.color.white);
        this.dla = rightPanelFragment.fA(R.dimen.dp24);
        this.dno = rightPanelFragment.fA(R.dimen.sp10);
        this.dnk.register();
        this.dnl.register();
        com.iqoption.view.a.b.aYv().a((com.iqoption.view.a.b.a) this, Integer.valueOf(5));
    }

    public boolean aFe() {
        return com.iqoption.l.b.aTS().aUa() ^ 1;
    }

    public void aFf() {
        this.dnp.csu.setType(aFh());
        this.dkX.ak(this.dnp.csu);
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

    public void J(double d) {
        K(d);
    }

    public double ZC() {
        return this.bmw;
    }

    public double[] aFd() {
        return com.iqoption.util.j.ae(getInstrumentType());
    }

    public void onTick(long j) {
        com.iqoption.core.microservices.tradingengine.response.active.a IZ = TabHelper.IM().IZ();
        if (!S(IZ)) {
            return;
        }
        if (com.iqoption.util.c.a.d(IZ, j)) {
            if (this.dkX.bE(this.dnp.crC)) {
                if (b(IZ, j)) {
                    this.dnp.crC.setTimeToClose(DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(this.anH.expValue.longValue() - j)));
                } else {
                    aFm();
                }
            } else if (b(IZ, j)) {
                aFn();
            } else {
                aGQ();
            }
            if (this.dkX.bE(this.dnp.csu)) {
                ActiveQuote dY = com.iqoption.app.managers.c.GS().dY(this.activeId.intValue());
                if (dY != null) {
                    this.dnp.csu.setLevel(this.dkU.format(dY.getVal()));
                } else {
                    this.dnp.csu.setLevel(null);
                }
            }
            if (this.dpm && !l.HZ().Ie()) {
                this.dnq.aFa();
                this.dnq.aFc();
            }
            xx xxVar = this.dnp;
            if (xxVar != null && this.dkX.bE(xxVar.csu)) {
                Expiration expiration = this.anH;
                this.dnp.csu.setExpiration(com.iqoption.app.managers.a.e.a(getContext(), j, expiration != null ? expiration.expValue.longValue() : 0));
                return;
            }
            return;
        }
        com.iqoption.view.a.b.aYv().b((com.iqoption.view.a.b.a) this);
        aFr().ac(IZ);
    }

    private boolean b(@NonNull com.iqoption.core.microservices.tradingengine.response.active.a aVar, long j) {
        if (j <= this.anH.expValue.longValue() - com.iqoption.app.managers.a.e.Ig().c(aVar, this.anH) || j >= this.anH.expValue.longValue()) {
            return false;
        }
        return com.iqoption.app.managers.c.GS().b(new com.iqoption.mobbtech.connect.response.options.d(Long.valueOf(this.anH.expValue.longValue() / 1000), Integer.valueOf(aVar.getActiveId()), aVar.getInstrumentType())) ^ 1;
    }

    private boolean S(@Nullable com.iqoption.core.microservices.tradingengine.response.active.a aVar) {
        return aVar != null && ae.equals(aVar.getInstrumentType(), this.instrumentType) && aVar.getActiveId() == this.activeId.intValue();
    }

    /* Access modifiers changed, original: 0000 */
    @NonNull
    public View e(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        this.dnp = (xx) DataBindingUtil.inflate(layoutInflater, R.layout.right_panel_delegate_digital, viewGroup, false);
        final c cVar = new c(this);
        this.dnp.a(cVar);
        h hVar = new h(layoutInflater, this.dnp.csz);
        this.dnq = hVar;
        this.dnp.csz.addView(this.dnq.getView(), 0);
        this.dnt.clone((ConstraintLayout) this.dnq.getView());
        this.dnr.clone(getContext(), R.layout.right_panel_delegate_spot);
        this.dnu = this.dnt;
        this.dnv = hVar.getView().findViewById(R.id.buttonPutProfitFrameBackground);
        this.dnw = hVar.getView().findViewById(R.id.buttonCallProfitFrameBackground);
        this.dnx = TransitionInflater.from(getContext()).inflateTransition(R.transition.spot);
        this.dnx.addListener(new TransitionListenerAdapter() {
            public void onTransitionStart(@NonNull Transition transition) {
                super.onTransitionStart(transition);
                DigitalRightPanelDelegate.this.dnq.ec(true);
            }

            public void onTransitionEnd(@NonNull Transition transition) {
                super.onTransitionEnd(transition);
                DigitalRightPanelDelegate.this.dnq.ec(false);
            }
        });
        cVar.getClass();
        hVar.a(new -$$Lambda$YV18weD7XLgA_4_tlZeXFrCZ3x4(cVar));
        cVar.getClass();
        hVar.b(new -$$Lambda$5TWe6wfSB5SkrcqZOKGn_h9xa1I(cVar));
        this.dkX = new e(this.dla, hVar.getView(), this.dnp.csu, this.dnp.crC);
        this.dnm = new r(this.dnp.caj, this.dnp.csv);
        this.dnn = new r(this.dnp.csC, this.dnp.csB);
        this.dkW = new r(this.dnp.crv, this.dnp.crs);
        this.dnp.csu.setConfirmListener(new com.iqoption.view.d.b(1000) {
            public void M(View view) {
                cVar.aFy();
            }
        });
        this.dnp.csu.setCancelListener(new com.iqoption.view.d.b() {
            public void M(View view) {
                cVar.aFz();
            }
        });
        this.dnp.crC.setBuyNewListener(new com.iqoption.view.d.b() {
            public void M(View view) {
                cVar.aFA();
            }
        });
        K(Fd());
        j(TabHelper.IM().Jd());
        c(TabHelper.IM().Jb());
        return this.dnp.getRoot();
    }

    /* Access modifiers changed, original: 0000 */
    public void T(@NonNull com.iqoption.core.microservices.tradingengine.response.active.a aVar) {
        super.T(aVar);
        this.activeId = Integer.valueOf(aVar.getActiveId());
        this.instrumentType = aVar.getInstrumentType();
        this.dkU.ht(aVar.getPrecision());
        aFm();
    }

    /* Access modifiers changed, original: 0000 */
    public void destroy() {
        super.destroy();
        this.dnk.unregister();
        this.dnl.unregister();
        com.iqoption.view.a.b.aYv().b((com.iqoption.view.a.b.a) this);
    }

    /* Access modifiers changed, original: 0000 */
    public void K(double d) {
        if (d < 0.0d) {
            d = 0.0d;
        }
        this.bmw = d;
        if (this.dnp != null) {
            String a = com.iqoption.util.j.a(d, this.dkQ);
            this.dnp.crv.setText(a);
            this.dnp.csu.setInvest(a);
        }
        aFj();
        aGQ();
    }

    private void aFi() {
        this.dnp.crv.setText(com.iqoption.util.j.a(this.bmw, this.dkQ));
    }

    private void aFj() {
        if (this.dnp != null) {
            double doubleValue = com.iqoption.app.b.DG().DI().doubleValue();
            double[] aFd = aFd();
            double d = this.bmw;
            if (d > doubleValue || d > aFd[1] || d < aFd[0]) {
                this.dnp.crv.setTextColor(this.dkY);
            } else {
                this.dnp.crv.setTextColor(this.dkZ);
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void j(Expiration expiration) {
        this.anH = expiration;
        aFk();
    }

    private void aFk() {
        if (this.dnp != null) {
            com.iqoption.core.microservices.tradingengine.response.active.a IZ = TabHelper.IM().IZ();
            if (S(IZ)) {
                this.dnp.caj.setText(com.iqoption.app.managers.a.e.Ig().a(IZ, this.anH.expValue.longValue()));
            } else {
                this.dnp.caj.setText(null);
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void c(com.iqoption.core.microservices.tradingengine.response.instrument.e eVar) {
        if (this.dnp != null) {
            Double valueOf;
            if (eVar != null) {
                valueOf = Double.valueOf(eVar.aiD() ? eVar.aiz() : eVar.getValue());
            } else {
                valueOf = null;
            }
            if (valueOf != null) {
                String format = this.dkU.format(valueOf.doubleValue());
                this.dnp.csC.setText(new ai().cs(new AbsoluteSizeSpan(this.dno)).jP(format.substring(0, format.length() - 3)).aWX().jP(" ").O(format.subSequence(format.length() - 3, format.length())).anA());
            } else {
                this.dnp.csC.setText(null);
            }
            if (eVar == null) {
                return;
            }
            if (eVar.aiD()) {
                aGS();
            } else {
                aGR();
            }
        }
    }

    private void aGQ() {
        if (this.dnp != null) {
            com.iqoption.core.microservices.tradingengine.response.instrument.e Jb = TabHelper.IM().Jb();
            if (Jb != null) {
                double ZC = ZC();
                com.iqoption.core.microservices.tradingengine.response.a c = com.iqoption.app.managers.c.GS().c(Jb.aiA().getId(), InstrumentType.DIGITAL_INSTRUMENT);
                if (com.iqoption.core.microservices.tradingengine.response.a.g(c)) {
                    this.dnq.j(c.m(ZC), c.ahK());
                    this.dnq.aEZ();
                } else {
                    this.dnq.aGO();
                    this.dnq.aFa();
                }
                com.iqoption.core.microservices.tradingengine.response.a c2 = com.iqoption.app.managers.c.GS().c(Jb.aiB().getId(), InstrumentType.DIGITAL_INSTRUMENT);
                if (com.iqoption.core.microservices.tradingengine.response.a.g(c2)) {
                    this.dnq.k(c2.m(ZC), c2.ahK());
                    this.dnq.aFb();
                } else {
                    this.dnq.aGP();
                    this.dnq.aFc();
                }
                NativeHandler.instance().singleThreadExecutor.execute(new -$$Lambda$DigitalRightPanelDelegate$EVBZm8-HIddUSyy8N7iNDOItiZU(Jb, c, c2));
                return;
            }
            this.dnq.aGO();
            this.dnq.aGP();
            this.dnq.aFa();
            this.dnq.aFc();
        }
    }

    private void dO(boolean z) {
        this.dnp.csx.setSelected(z);
        this.dnp.csw.setSelected(z);
        if (z) {
            this.dnm.select();
            this.dnn.select();
            return;
        }
        this.dnm.aHN();
        this.dnn.aHN();
    }

    private void dP(boolean z) {
        this.dnp.cru.setSelected(z);
        this.dnp.crt.setSelected(z);
        if (z) {
            this.dkW.select();
        } else {
            this.dkW.aHN();
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void aFm() {
        this.dkX.ak(this.dnq.getView());
    }

    private void aGR() {
        com.iqoption.core.ui.b.a aVar = this.dnu;
        if (aVar != null) {
            com.iqoption.core.ui.b.a aVar2 = this.dnt;
            if (aVar != aVar2) {
                this.dnu = aVar2;
                TransitionManager.beginDelayedTransition((ConstraintLayout) this.dnq.getView(), this.dnx);
                this.dnt.applyTo((ConstraintLayout) this.dnq.getView());
                this.dnv.setVisibility(0);
                this.dnw.setVisibility(0);
            }
        }
    }

    private void aGS() {
        com.iqoption.core.ui.b.a aVar = this.dnu;
        if (aVar != null) {
            com.iqoption.core.ui.b.a aVar2 = this.dnr;
            if (aVar != aVar2) {
                this.dnu = aVar2;
                TransitionManager.beginDelayedTransition((ConstraintLayout) this.dnq.getView(), this.dnx);
                this.dnr.applyTo((ConstraintLayout) this.dnq.getView());
                this.dnv.setVisibility(8);
                this.dnw.setVisibility(8);
            }
        }
    }

    private void aFn() {
        this.dkX.ak(this.dnp.crC);
    }

    /* Access modifiers changed, original: 0000 */
    public void dQ(boolean z) {
        this.dlb = z;
    }

    @Nullable
    public InstrumentType getInstrumentType() {
        return this.instrumentType;
    }
}
