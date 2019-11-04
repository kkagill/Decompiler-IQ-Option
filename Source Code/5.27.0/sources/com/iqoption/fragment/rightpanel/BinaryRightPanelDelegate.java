package com.iqoption.fragment.rightpanel;

import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.res.ResourcesCompat;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LiveData;
import com.iqoption.activity.TradeRoomActivity;
import com.iqoption.analytics.EventManager;
import com.iqoption.app.managers.a.e.d;
import com.iqoption.app.managers.tab.TabHelper;
import com.iqoption.app.managers.tab.TabHelper.i;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.dto.Event;
import com.iqoption.dto.entity.ActiveQuote;
import com.iqoption.dto.entity.expiration.Expiration;
import com.iqoption.e.yj;
import com.iqoption.fragment.ah;
import com.iqoption.fragment.l;
import com.iqoption.service.e.k;
import com.iqoption.system.a.e;
import com.iqoption.system.a.g;
import com.iqoption.util.ae;
import com.iqoption.util.j;
import com.iqoption.x.R;
import java.util.concurrent.TimeUnit;

public final class BinaryRightPanelDelegate extends EnabledInstrumentDelegate implements com.iqoption.view.a.b.a {
    private Integer activeId;
    private double bmw;
    private int commission;
    private final a dkS = new a(this, null);
    private final b dkT = new b(this);
    private final com.iqoption.p.a.a dkU;
    private r dkV;
    private r dkW;
    private e dkX;
    private int dkY;
    private int dkZ;
    private int dla;
    private boolean dlb;
    private yj dlc;
    private p dld;
    private final boolean dle;
    private long expiration;
    private InstrumentType instrumentType;

    public static final class c {
        private final BinaryRightPanelDelegate dln;
        private final c dlo;

        public c(BinaryRightPanelDelegate binaryRightPanelDelegate) {
            this.dln = binaryRightPanelDelegate;
            this.dlo = new c(binaryRightPanelDelegate);
        }

        public void aFu() {
            l.a(this.dln.getFragmentManager(), R.id.fragment);
            EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "traderoom_expiration-time").build());
        }

        public void aFv() {
            EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "deal-keyboard_keyboard").setValue(Double.valueOf(com.iqoption.fragment.a.b.b(this.dln.getFragmentManager(), R.id.fragment, this.dln.ZC(), this.dln.aFd()[0]) ? 1.0d : 0.0d)).build());
        }

        public void aFw() {
            BinaryRightPanelDelegate binaryRightPanelDelegate = this.dln;
            binaryRightPanelDelegate.K(binaryRightPanelDelegate.ZC() - 1.0d);
            EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "traderoom_deal-minus").build());
        }

        public void aFx() {
            BinaryRightPanelDelegate binaryRightPanelDelegate = this.dln;
            binaryRightPanelDelegate.K(binaryRightPanelDelegate.ZC() + 1.0d);
            EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "traderoom_deal-plus").build());
        }

        public void bB(View view) {
            if (this.dln.aFp() != null) {
                this.dln.bA(view);
            }
            this.dln.dQ(true);
            this.dlo.aFB();
        }

        public void bC(View view) {
            if (this.dln.aFp() != null) {
                this.dln.bA(view);
            }
            this.dln.dQ(false);
            this.dlo.aFB();
        }

        public void aFy() {
            this.dln.aFm();
            this.dlo.aFC();
        }

        public void aFz() {
            this.dln.aFm();
        }

        public void aFA() {
            TabHelper.IM().Jg();
        }
    }

    public static final class a extends e<BinaryRightPanelDelegate> {
        /* synthetic */ a(BinaryRightPanelDelegate binaryRightPanelDelegate, AnonymousClass1 anonymousClass1) {
            this(binaryRightPanelDelegate);
        }

        private a(BinaryRightPanelDelegate binaryRightPanelDelegate) {
            super(binaryRightPanelDelegate);
        }

        @com.google.common.b.e
        public void onInitializationCompletedEvent(TabHelper.e eVar) {
            com.iqoption.core.c.a.biN.execute(new Runnable() {
                public void run() {
                    BinaryRightPanelDelegate binaryRightPanelDelegate = (BinaryRightPanelDelegate) a.this.dUo.get();
                    if (binaryRightPanelDelegate != null) {
                        binaryRightPanelDelegate.aFj();
                    }
                }
            });
        }

        @com.google.common.b.e
        public void onAmountChangedIQKeyboardEvent(final com.iqoption.fragment.a.b.a aVar) {
            com.iqoption.core.c.a.biN.execute(new Runnable() {
                public void run() {
                    BinaryRightPanelDelegate binaryRightPanelDelegate = (BinaryRightPanelDelegate) a.this.dUo.get();
                    if (binaryRightPanelDelegate != null) {
                        binaryRightPanelDelegate.J(((Double) aVar.getValue()).doubleValue());
                    }
                }
            });
        }

        @com.google.common.b.e
        public void onShowedIQKeyboardEvent(final com.iqoption.fragment.a.b.b bVar) {
            com.iqoption.core.c.a.biN.execute(new Runnable() {
                public void run() {
                    BinaryRightPanelDelegate binaryRightPanelDelegate = (BinaryRightPanelDelegate) a.this.dUo.get();
                    if (binaryRightPanelDelegate != null) {
                        binaryRightPanelDelegate.dP(((Boolean) bVar.getValue()).booleanValue());
                    }
                }
            });
        }

        @com.google.common.b.e
        public void onShowedExpirationFragmentEvent(final d dVar) {
            com.iqoption.core.c.a.biN.execute(new Runnable() {
                public void run() {
                    BinaryRightPanelDelegate binaryRightPanelDelegate = (BinaryRightPanelDelegate) a.this.dUo.get();
                    if (binaryRightPanelDelegate != null) {
                        binaryRightPanelDelegate.dO(dVar.ajQ);
                    }
                }
            });
        }

        @com.google.common.b.e
        public void onChangeCurrentActiveCommissionEvent(com.iqoption.app.helpers.a.c cVar) {
            com.iqoption.core.c.a.biN.execute(new Runnable() {
                public void run() {
                    BinaryRightPanelDelegate binaryRightPanelDelegate = (BinaryRightPanelDelegate) a.this.dUo.get();
                    if (binaryRightPanelDelegate != null) {
                        com.iqoption.core.microservices.tradingengine.response.active.a IZ = TabHelper.IM().IZ();
                        if (IZ != null) {
                            binaryRightPanelDelegate.fb(IZ.ahR());
                        }
                    }
                }
            });
        }

        @com.google.common.b.e
        public void onChangeExpirationEvent(final com.iqoption.app.managers.a.e.a aVar) {
            if (aVar.avF == TabHelper.IM().Ji()) {
                com.iqoption.core.c.a.biN.execute(new Runnable() {
                    public void run() {
                        BinaryRightPanelDelegate binaryRightPanelDelegate = (BinaryRightPanelDelegate) a.this.dUo.get();
                        if (binaryRightPanelDelegate != null) {
                            binaryRightPanelDelegate.bI(aVar.anH.expValue.longValue());
                            binaryRightPanelDelegate.aFj();
                        }
                    }
                });
            }
        }
    }

    public static class b extends g<BinaryRightPanelDelegate> {
        public b(BinaryRightPanelDelegate binaryRightPanelDelegate) {
            super(binaryRightPanelDelegate);
        }

        @com.google.common.b.e
        public void onChangeBalanceType(com.iqoption.service.e.b bVar) {
            com.iqoption.core.c.a.biN.execute(new Runnable() {
                public void run() {
                    BinaryRightPanelDelegate binaryRightPanelDelegate = (BinaryRightPanelDelegate) b.this.dUo.get();
                    if (binaryRightPanelDelegate != null) {
                        binaryRightPanelDelegate.K(binaryRightPanelDelegate.Fd());
                    }
                }
            });
        }

        @com.google.common.b.e
        public void onUpdateBalanceValue(k kVar) {
            com.iqoption.core.c.a.biN.execute(new Runnable() {
                public void run() {
                    BinaryRightPanelDelegate binaryRightPanelDelegate = (BinaryRightPanelDelegate) b.this.dUo.get();
                    if (binaryRightPanelDelegate != null) {
                        binaryRightPanelDelegate.aFj();
                    }
                }
            });
        }

        @com.google.common.b.e
        public void onChangeCurrentCurrency(com.iqoption.service.e.c cVar) {
            com.iqoption.core.c.a.biN.execute(new Runnable() {
                public void run() {
                    BinaryRightPanelDelegate binaryRightPanelDelegate = (BinaryRightPanelDelegate) b.this.dUo.get();
                    if (binaryRightPanelDelegate != null) {
                        binaryRightPanelDelegate.aFi();
                        binaryRightPanelDelegate.aFl();
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

    BinaryRightPanelDelegate(RightPanelFragment rightPanelFragment, com.iqoption.core.microservices.tradingengine.response.active.a aVar) {
        super(rightPanelFragment);
        this.activeId = Integer.valueOf(aVar.getActiveId());
        this.instrumentType = aVar.getInstrumentType();
        this.dkU = new com.iqoption.p.a.a(aVar.getPrecision());
        this.dkY = ResourcesCompat.getColor(rightPanelFragment.getResources(), R.color.red, rightPanelFragment.getContext().getTheme());
        this.dkZ = ResourcesCompat.getColor(rightPanelFragment.getResources(), R.color.white, rightPanelFragment.getContext().getTheme());
        this.dla = rightPanelFragment.getResources().getDimensionPixelSize(R.dimen.dp24);
        this.dkS.register();
        this.dkT.register();
        this.dle = com.iqoption.app.managers.feature.a.ef("binary-commission-request");
        com.iqoption.view.a.b.aYv().a((com.iqoption.view.a.b.a) this);
    }

    public void J(double d) {
        K(d);
    }

    public double ZC() {
        return this.bmw;
    }

    public double[] aFd() {
        return j.ae(this.instrumentType);
    }

    public boolean aFe() {
        return com.iqoption.l.b.aTS().aUa() ^ 1;
    }

    public void aFf() {
        this.dlc.csu.setType(aFh());
        this.dkX.ak(this.dlc.csu);
    }

    public void aFg() {
        Long valueOf = Long.valueOf(com.iqoption.app.b.DG().DH());
        i Jh = TabHelper.IM().Jh();
        if (Jh != null && valueOf != null) {
            com.iqoption.mobbtech.connect.request.api.a.a.a(Jh.Ju(), Jh.Jv(), Jh.getInstrumentType(), Jh.Jx(), this.bmw, valueOf.longValue(), 100 - this.commission, this.dlb, this.dle);
        }
    }

    public boolean aFh() {
        return this.dlb;
    }

    public void onTick(long j) {
        com.iqoption.core.microservices.tradingengine.response.active.a IZ = TabHelper.IM().IZ();
        if (!S(IZ)) {
            return;
        }
        if (com.iqoption.util.c.a.d(IZ, j)) {
            if (this.dkX.bE(this.dlc.crC)) {
                if (b(IZ, j)) {
                    this.dlc.crC.setTimeToClose(DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(this.expiration - j)));
                } else {
                    aFm();
                }
            } else if (b(IZ, j)) {
                aFn();
            }
            if (this.dkX.bE(this.dlc.csu)) {
                ActiveQuote dY = com.iqoption.app.managers.c.GS().dY(this.activeId.intValue());
                if (dY != null) {
                    this.dlc.csu.setLevel(this.dkU.format(dY.getVal()));
                } else {
                    this.dlc.csu.setLevel(null);
                }
            }
            if (this.dpm) {
                if (com.iqoption.app.managers.l.HZ().Ie()) {
                    this.dld.aEZ();
                    this.dld.aFb();
                } else {
                    this.dld.aFa();
                    this.dld.aFc();
                }
            }
            yj yjVar = this.dlc;
            if (yjVar != null && this.dkX.bE(yjVar.csu)) {
                this.dlc.csu.setExpiration(com.iqoption.app.managers.a.e.a(getContext(), j, this.expiration));
                return;
            }
            return;
        }
        com.iqoption.view.a.b.aYv().b((com.iqoption.view.a.b.a) this);
        aFr().ac(IZ);
    }

    private boolean b(@NonNull com.iqoption.core.microservices.tradingengine.response.active.a aVar, long j) {
        long c = com.iqoption.app.managers.a.e.Ig().c(aVar, Expiration.notInitilizedExpiration);
        long j2 = this.expiration;
        if (j <= j2 - c || j >= j2) {
            return false;
        }
        return com.iqoption.app.managers.c.GS().b(new com.iqoption.mobbtech.connect.response.options.d(Long.valueOf(j2 / 1000), Integer.valueOf(aVar.getActiveId()), aVar.getInstrumentType())) ^ 1;
    }

    private boolean S(@Nullable com.iqoption.core.microservices.tradingengine.response.active.a aVar) {
        return aVar != null && ae.equals(aVar.getInstrumentType(), this.instrumentType) && aVar.getActiveId() == this.activeId.intValue();
    }

    /* Access modifiers changed, original: 0000 */
    @NonNull
    public View e(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        final c cVar = new c(this);
        this.dlc = (yj) DataBindingUtil.inflate(layoutInflater, R.layout.right_panel_delegate_turbo_binary, viewGroup, false);
        this.dlc.a(cVar);
        this.dld = new a(layoutInflater, this.dlc.csz);
        p pVar = this.dld;
        cVar.getClass();
        pVar.a(new -$$Lambda$X-0yd_5b5OkiVUDOM3ihO02XOwk(cVar));
        pVar = this.dld;
        cVar.getClass();
        pVar.b(new -$$Lambda$_tkj2IbpZgOPqo94yUaLxTbl7tg(cVar));
        this.dlc.csz.addView(this.dld.getView(), 0);
        this.dkV = new r(this.dlc.ctx, this.dlc.csv);
        this.dkW = new r(this.dlc.csb, this.dlc.crs);
        this.dkX = new e(this.dla, this.dld.getView(), this.dlc.csu, this.dlc.crC);
        this.dlc.csu.setConfirmListener(new com.iqoption.view.d.b(1000) {
            public void M(View view) {
                cVar.aFy();
            }
        });
        this.dlc.csu.setCancelListener(new com.iqoption.view.d.b() {
            public void M(View view) {
                cVar.aFz();
            }
        });
        this.dlc.crC.setBuyNewListener(new com.iqoption.view.d.b() {
            public void M(View view) {
                cVar.aFA();
            }
        });
        K(Fd());
        com.iqoption.core.microservices.tradingengine.response.active.a IZ = TabHelper.IM().IZ();
        if (IZ != null) {
            fb(IZ.ahR());
        }
        bI(TabHelper.IM().Je());
        return this.dlc.getRoot();
    }

    /* Access modifiers changed, original: 0000 */
    public void T(@NonNull com.iqoption.core.microservices.tradingengine.response.active.a aVar) {
        super.T(aVar);
        this.activeId = Integer.valueOf(aVar.getActiveId());
        this.instrumentType = aVar.getInstrumentType();
        this.dkU.ht(aVar.getPrecision());
        fb(aVar.ahR());
        aFm();
    }

    /* Access modifiers changed, original: 0000 */
    public void destroy() {
        super.destroy();
        this.dkS.unregister();
        this.dkT.unregister();
        com.iqoption.view.a.b.aYv().b((com.iqoption.view.a.b.a) this);
    }

    /* Access modifiers changed, original: 0000 */
    public void K(double d) {
        if (d < 0.0d) {
            d = 0.0d;
        }
        this.bmw = d;
        String a = j.a(d, this.dkQ);
        this.dlc.csb.setText(a);
        this.dlc.csu.setInvest(a);
        aFj();
        aFl();
    }

    private void aFi() {
        this.dlc.csb.setText(j.a(this.bmw, this.dkQ));
    }

    /* Access modifiers changed, original: 0000 */
    public void aFj() {
        if (this.dlc != null) {
            double doubleValue = com.iqoption.app.b.DG().DI().doubleValue();
            double[] aFd = aFd();
            double d = this.bmw;
            if (d > doubleValue || d > aFd[1] || d < aFd[0]) {
                this.dlc.csb.setTextColor(this.dkY);
            } else {
                this.dlc.csb.setTextColor(this.dkZ);
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void bI(long j) {
        this.expiration = j;
        aFk();
    }

    private void aFk() {
        if (this.dlc != null) {
            com.iqoption.core.microservices.tradingengine.response.active.a IZ = TabHelper.IM().IZ();
            if (S(IZ)) {
                this.dlc.ctx.setText(com.iqoption.app.managers.a.e.Ig().a(IZ, this.expiration));
            } else {
                this.dlc.ctx.setText(null);
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void fb(int i) {
        this.commission = i;
        aFl();
    }

    private void aFl() {
        if (this.dlc != null) {
            double d = this.bmw;
            int i = this.commission;
            double d2 = (double) i;
            Double.isNaN(d2);
            d = (d * (200.0d - d2)) / 100.0d;
            int i2 = 100 - i;
            this.dld.j(d, i2);
            this.dld.k(d, i2);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void dO(boolean z) {
        this.dlc.csx.setSelected(z);
        this.dlc.ctg.setSelected(z);
        if (z) {
            this.dkV.select();
        } else {
            this.dkV.aHN();
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void dP(boolean z) {
        this.dlc.cru.setSelected(z);
        this.dlc.crt.setSelected(z);
        if (z) {
            this.dkW.select();
        } else {
            this.dkW.aHN();
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void aFm() {
        this.dkX.ak(this.dld.getView());
    }

    /* Access modifiers changed, original: 0000 */
    public void aFn() {
        this.dkX.ak(this.dlc.crC);
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
