package com.iqoption.fragment.rightpanel;

import android.content.Context;
import android.graphics.Point;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.iqoption.activity.TradeRoomActivity;
import com.iqoption.app.managers.tab.TabHelper;
import com.iqoption.app.managers.tab.TabHelper.i;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.gl.ChartWindow;
import com.iqoption.core.microservices.risks.response.overnightfee.OvernightDay;
import com.iqoption.core.microservices.risks.response.overnightfee.c;
import com.iqoption.core.microservices.tradingengine.response.order.TradingOrder.Type;
import com.iqoption.core.util.TimeUtil;
import com.iqoption.core.util.af;
import com.iqoption.dto.Balance;
import com.iqoption.dto.entity.ActiveQuote;
import com.iqoption.e.yf;
import com.iqoption.fragment.aa;
import com.iqoption.fragment.ab;
import com.iqoption.fragment.ab.b;
import com.iqoption.fragment.ah;
import com.iqoption.fragment.x;
import com.iqoption.gl.NativeHandler;
import com.iqoption.system.a.e;
import com.iqoption.util.ad;
import com.iqoption.util.ai;
import com.iqoption.util.ak;
import com.iqoption.util.j;
import com.iqoption.view.RobotoTextView;
import com.iqoption.x.R;
import java.util.Locale;

public class CfdOnOpenRightPanelDelegate extends EnabledInstrumentDelegate implements com.iqoption.view.a.b.a {
    private final int amj;
    private final int amk;
    private final int aml;
    private com.iqoption.core.microservices.tradingengine.response.active.a anF;
    private int bBe;
    private double bmw;
    private final boolean cKL;
    private volatile Double cLb = null;
    private volatile Double cLc = null;
    private e dkX;
    private volatile Boolean dlA = null;
    private volatile Boolean dlB = null;
    @Nullable
    private c dlC = null;
    private final Observer<c> dlD = new -$$Lambda$CfdOnOpenRightPanelDelegate$6lc2ShZ2UUAE4whHedbCvgrYyY4(this);
    private boolean dlb;
    private final c dlo = new c(this);
    private String dlq;
    private final a dlr = new a(this);
    private yf dls;
    private final t dlt = new t();
    private Double dlu = null;
    private double dlv;
    private s dlw;
    private s dlx;
    private final boolean dly;
    private final boolean dlz;

    private static class a extends e<CfdOnOpenRightPanelDelegate> {
        a(CfdOnOpenRightPanelDelegate cfdOnOpenRightPanelDelegate) {
            super(cfdOnOpenRightPanelDelegate);
        }

        @com.google.common.b.e
        public void onAmountChangedIQKeyboardEvent(com.iqoption.fragment.a.b.a aVar) {
            CfdOnOpenRightPanelDelegate cfdOnOpenRightPanelDelegate = (CfdOnOpenRightPanelDelegate) this.dUo.get();
            if (cfdOnOpenRightPanelDelegate != null) {
                cfdOnOpenRightPanelDelegate.K(((Double) aVar.getValue()).doubleValue());
            }
        }

        @com.google.common.b.e
        public void onChosenMultiplierChooser(x.c cVar) {
            i Jh = TabHelper.IM().Jh();
            if (Jh != null) {
                Jh.a("tabSetting.multiplier", Integer.valueOf(cVar.bBe));
            }
            CfdOnOpenRightPanelDelegate cfdOnOpenRightPanelDelegate = (CfdOnOpenRightPanelDelegate) this.dUo.get();
            if (cfdOnOpenRightPanelDelegate != null) {
                cfdOnOpenRightPanelDelegate.setMultiplier(cVar.bBe);
            }
        }

        @com.google.common.b.e
        public void onNativeChangeLimitOrderValueEvent(NativeHandler.c cVar) {
            CfdOnOpenRightPanelDelegate cfdOnOpenRightPanelDelegate = (CfdOnOpenRightPanelDelegate) this.dUo.get();
            if (cfdOnOpenRightPanelDelegate != null && cfdOnOpenRightPanelDelegate.dly) {
                cfdOnOpenRightPanelDelegate.k((Double) cVar.getValue());
                cfdOnOpenRightPanelDelegate.aGb();
            }
        }

        @com.google.common.b.e
        public void onChangeLimitOrderValueEvent(com.iqoption.fragment.ab.a aVar) {
            CfdOnOpenRightPanelDelegate cfdOnOpenRightPanelDelegate = (CfdOnOpenRightPanelDelegate) this.dUo.get();
            if (cfdOnOpenRightPanelDelegate != null && cfdOnOpenRightPanelDelegate.dly) {
                cfdOnOpenRightPanelDelegate.k(aVar.value);
                if (aVar.cWH) {
                    cfdOnOpenRightPanelDelegate.aGa();
                }
            }
        }

        @com.google.common.b.e
        public void onShowedPendingEdit(b bVar) {
            CfdOnOpenRightPanelDelegate cfdOnOpenRightPanelDelegate = (CfdOnOpenRightPanelDelegate) this.dUo.get();
            if (cfdOnOpenRightPanelDelegate != null && cfdOnOpenRightPanelDelegate.dly) {
                if (!bVar.ajQ) {
                    cfdOnOpenRightPanelDelegate.k(bVar.value);
                    cfdOnOpenRightPanelDelegate.aGa();
                }
                cfdOnOpenRightPanelDelegate.dS(bVar.ajQ);
            }
        }

        @com.google.common.b.e
        public void onShowedOvernightFeeInfo(aa.c cVar) {
            com.iqoption.core.c.a.biN.execute(new -$$Lambda$CfdOnOpenRightPanelDelegate$a$bRdffTVh5iktTm7aV5-Ha-UMBQo(this, cVar));
        }

        private /* synthetic */ void a(aa.c cVar) {
            CfdOnOpenRightPanelDelegate cfdOnOpenRightPanelDelegate = (CfdOnOpenRightPanelDelegate) this.dUo.get();
            if (cfdOnOpenRightPanelDelegate != null) {
                cfdOnOpenRightPanelDelegate.dR(((Boolean) cVar.getValue()).booleanValue());
            }
        }

        @com.google.common.b.e
        public void onShowedLimitsDialogEvent(com.iqoption.dialog.b.b.b bVar) {
            CfdOnOpenRightPanelDelegate cfdOnOpenRightPanelDelegate = (CfdOnOpenRightPanelDelegate) this.dUo.get();
            if (cfdOnOpenRightPanelDelegate != null) {
                cfdOnOpenRightPanelDelegate.q((Boolean) bVar.getValue());
            }
        }

        @com.google.common.b.e
        public void onLimitsChangeEvent(com.iqoption.dialog.b.b.a aVar) {
            CfdOnOpenRightPanelDelegate cfdOnOpenRightPanelDelegate = (CfdOnOpenRightPanelDelegate) this.dUo.get();
            if (cfdOnOpenRightPanelDelegate != null) {
                cfdOnOpenRightPanelDelegate.a(aVar.cLb, aVar.cLc, aVar.cKB, aVar.cKD);
                cfdOnOpenRightPanelDelegate.aFQ();
            }
        }
    }

    public boolean aFe() {
        return true;
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

    CfdOnOpenRightPanelDelegate(RightPanelFragment rightPanelFragment, com.iqoption.core.microservices.tradingengine.response.active.a aVar) {
        super(rightPanelFragment);
        e(aVar);
        Context requireContext = rightPanelFragment.requireContext();
        this.amj = ContextCompat.getColor(requireContext, R.color.green);
        this.amk = ContextCompat.getColor(requireContext, R.color.red);
        this.aml = ContextCompat.getColor(requireContext, R.color.white);
        com.iqoption.app.managers.feature.c Iw = com.iqoption.app.managers.feature.c.Iw();
        this.dly = Iw.ej("pending-order");
        this.dlz = Iw.ej("margin-add-on");
        this.cKL = Iw.ej("trailing-stop");
        this.dlr.register();
        com.iqoption.view.a.b.aYv().a((com.iqoption.view.a.b.a) this);
        aFq().observeForever(this.dlD);
    }

    private void e(com.iqoption.core.microservices.tradingengine.response.active.a aVar) {
        this.anF = aVar;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("%.");
        stringBuilder.append(aVar.getPrecision());
        stringBuilder.append("f");
        this.dlq = stringBuilder.toString();
    }

    /* Access modifiers changed, original: 0000 */
    @NonNull
    public View e(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        int i = 0;
        this.dls = (yf) DataBindingUtil.inflate(layoutInflater, R.layout.right_panel_delegate_on_open_cfd, viewGroup, false);
        this.dlw = new s(this.dls.ctu.crn, this.dls.ctu.crq, this.dls.ctu.crF);
        this.dlx = new s(this.dls.ctt.crn, this.dls.ctt.crq, this.dls.ctt.cqZ, getContext().getResources().getDimension(R.dimen.dp48));
        this.dkX = new e(new d(this.dls.ctt.getRoot()), this.dls.ctu.getRoot(), this.dls.ctt.getRoot());
        this.dls.ctt.crb.setLayoutTransition(ak.anP());
        aFD();
        aFM();
        aFR();
        this.dls.ctt.crl.setOnClickListener(new com.iqoption.view.d.b() {
            public void M(View view) {
                Point ai = ak.ai(view);
                aa.a(CfdOnOpenRightPanelDelegate.this.getFragmentManager(), R.id.fragment, ai.x, ai.y, CfdOnOpenRightPanelDelegate.this.bmw, CfdOnOpenRightPanelDelegate.this.bBe, CfdOnOpenRightPanelDelegate.this.dlb, CfdOnOpenRightPanelDelegate.this.dlC);
            }
        });
        this.dls.ctt.crl.setText(new ai().jP(getContext().getString(R.string.overnight_fee).toUpperCase()).F(' ').cs(new ImageSpan(getContext(), R.drawable.ic_info_commission, 1)).F(' ').aWX().anA());
        if (!this.dly) {
            i = 8;
        }
        this.dls.ctu.crT.setVisibility(i);
        this.dls.ctt.cro.setVisibility(i);
        aFY();
        return this.dls.getRoot();
    }

    private void aFD() {
        AnonymousClass2 anonymousClass2 = new com.iqoption.view.d.b() {
            public void M(View view) {
                switch (view.getId()) {
                    case R.id.amountLayout /*2131361900*/:
                        com.iqoption.fragment.a.b.b(CfdOnOpenRightPanelDelegate.this.getFragmentManager(), R.id.fragment, CfdOnOpenRightPanelDelegate.this.bmw, CfdOnOpenRightPanelDelegate.this.aFd()[0]);
                        return;
                    case R.id.amountMinus /*2131361901*/:
                        CfdOnOpenRightPanelDelegate.this.aFF();
                        return;
                    case R.id.amountPlus /*2131361903*/:
                        CfdOnOpenRightPanelDelegate.this.aFE();
                        return;
                    case R.id.buttonCall /*2131362103*/:
                        CfdOnOpenRightPanelDelegate.this.bB(view);
                        return;
                    case R.id.buttonPut /*2131362115*/:
                        CfdOnOpenRightPanelDelegate.this.bC(view);
                        return;
                    case R.id.cancelPendingOrder /*2131362161*/:
                    case R.id.cancelSubmitPendingOrder /*2131362162*/:
                        CfdOnOpenRightPanelDelegate.this.aFY();
                        return;
                    case R.id.limitsLayoutConfirm /*2131363201*/:
                        CfdOnOpenRightPanelDelegate.this.aFH();
                        return;
                    case R.id.multiplierLayout /*2131363321*/:
                        x.a(CfdOnOpenRightPanelDelegate.this.getFragmentManager(), R.id.fragment, CfdOnOpenRightPanelDelegate.this.anF.getInstrumentType(), CfdOnOpenRightPanelDelegate.this.anF.getActiveId());
                        return;
                    case R.id.pendingLayout /*2131363527*/:
                        ab.a(CfdOnOpenRightPanelDelegate.this.getFragmentManager(), CfdOnOpenRightPanelDelegate.this.anF.getInstrumentType(), CfdOnOpenRightPanelDelegate.this.anF.getActiveId(), CfdOnOpenRightPanelDelegate.this.dlu, true);
                        return;
                    case R.id.pendingLayoutConfirm /*2131363528*/:
                        ab.a(CfdOnOpenRightPanelDelegate.this.getFragmentManager(), CfdOnOpenRightPanelDelegate.this.anF.getInstrumentType(), CfdOnOpenRightPanelDelegate.this.anF.getActiveId(), CfdOnOpenRightPanelDelegate.this.dlu, true);
                        return;
                    default:
                        return;
                }
            }
        };
        this.dls.ctu.crT.setOnClickListener(anonymousClass2);
        this.dls.ctu.crt.setOnClickListener(anonymousClass2);
        this.dls.ctu.crN.setOnClickListener(anonymousClass2);
        this.dls.ctu.crA.setOnClickListener(anonymousClass2);
        this.dls.ctu.crB.setOnClickListener(anonymousClass2);
        this.dls.ctu.crF.setOnClickListener(anonymousClass2);
        this.dls.ctu.crZ.setOnClickListener(anonymousClass2);
        this.dls.ctu.csa.setOnClickListener(anonymousClass2);
        this.dls.ctt.cqZ.setOnClickListener(anonymousClass2);
        this.dls.ctt.crg.setOnClickListener(anonymousClass2);
        this.dls.ctt.cro.setOnClickListener(anonymousClass2);
        this.dls.ctt.cqX.setOnClickListener(new com.iqoption.view.d.b(1000) {
            public void M(View view) {
                if (CfdOnOpenRightPanelDelegate.this.dlu == null) {
                    CfdOnOpenRightPanelDelegate.this.aFJ();
                } else {
                    CfdOnOpenRightPanelDelegate.this.aFI();
                }
            }
        });
        this.dls.ctt.bZy.setOnClickListener(new com.iqoption.view.d.b(1000) {
            public void M(View view) {
                if (CfdOnOpenRightPanelDelegate.this.dlu == null) {
                    CfdOnOpenRightPanelDelegate.this.aFy();
                } else {
                    CfdOnOpenRightPanelDelegate.this.aFG();
                }
            }
        });
    }

    private void aFE() {
        K(this.bmw + 1.0d);
    }

    private void aFF() {
        double d = this.bmw;
        if (d - 1.0d >= 0.0d) {
            K(d - 1.0d);
        } else {
            K(0.0d);
        }
    }

    private void aFy() {
        this.dlo.aFC();
        aFL();
        aFZ();
        aFK();
    }

    private void aFG() {
        boolean aFC = this.dlo.aFC();
        aFL();
        if (aFC) {
            aFY();
        }
        aFZ();
        aFK();
    }

    private void aFH() {
        com.iqoption.dialog.b.b.a(getFragmentManager(), this.anF.getActiveId(), this.anF.getInstrumentType(), this.dlb, this.dlu, this.cLb, this.cLc, this.dlA, this.bBe, this.bmw, this.dlB);
    }

    private void aFI() {
        aFL();
        aFZ();
        aFK();
    }

    private void aFJ() {
        aFL();
        aFY();
        aFK();
    }

    private void aFK() {
        this.cLb = null;
        this.cLc = null;
        this.dlA = null;
        this.dlB = null;
    }

    private void aFL() {
        this.dkX.ak(this.dls.ctu.getRoot());
    }

    private void bC(View view) {
        if (aFp() != null) {
            bA(view);
        }
        this.dlb = false;
        this.dlo.aFB();
    }

    private void bB(View view) {
        if (aFp() != null) {
            bA(view);
        }
        this.dlb = true;
        this.dlo.aFB();
    }

    private void aFM() {
        K(Fd());
    }

    private void K(double d) {
        this.bmw = d;
        aFN();
        aFi();
        aFj();
        aFS();
    }

    private void aFN() {
        if (this.dkX.bE(this.dls.ctt.getRoot())) {
            aFQ();
            aFO();
            return;
        }
        aFP();
    }

    private void aFO() {
        c cVar = this.dlC;
        if (cVar == null || this.bBe <= 1) {
            this.dls.ctt.crk.setVisibility(8);
            return;
        }
        Double a = cVar.a(TimeUtil.bRM.anN(), OvernightDay.today(), this.dlb);
        if (a != null) {
            this.dls.ctt.crm.setText(af.b(a.doubleValue(), a.doubleValue() < 0.0d ? "+" : "-", 4));
        } else {
            this.dls.ctt.crm.setText(R.string.n_a);
        }
        this.dls.ctt.crk.setVisibility(0);
    }

    private void aFP() {
        this.dlv = this.dlt.a(this.bmw, this.anF, false);
    }

    private void aFQ() {
        if (this.dkX.bE(this.dls.ctt.getRoot())) {
            this.dls.ctt.bZP.setText(j.a(this.bmw, this.dkQ));
            this.dls.ctt.crj.setText(af.ft(this.bBe));
            this.dls.ctt.bZy.setBackgroundResource(this.dlb ? R.drawable.btn_green_background : R.drawable.btn_red_background);
            this.dls.ctt.bZy.setText(this.dlu == null ? R.string.confirm : R.string.submit);
            this.dls.ctt.cal.setText(j.a(this.dlv, this.dkQ));
            this.dls.ctt.cra.setText(aFU());
            if (this.cLb == null && this.cLc == null) {
                this.dls.ctt.cri.setText(getContext().getString(R.string.not_set).toUpperCase());
            } else {
                this.dls.ctt.cri.setText(new ai().cs(new ForegroundColorSpan(this.cLb == null ? this.aml : this.amj)).jP(this.cLb == null ? getContext().getString(R.string.n_a) : af.r(this.cLb.doubleValue())).aWX().jP(" ").cs(new ForegroundColorSpan(this.cLc == null ? this.aml : this.amk)).jP(this.cLc == null ? getContext().getString(R.string.n_a) : af.r(this.cLc.doubleValue())).aWX().anA());
            }
        }
    }

    private void aFi() {
        this.dls.ctu.csb.setText(j.a(this.bmw, this.dkQ));
    }

    private void aFj() {
        double doubleValue = com.iqoption.app.b.DG().DI().doubleValue();
        double[] aFd = aFd();
        double d = this.dlv;
        if (d > doubleValue || d > aFd[1] || d < aFd[0]) {
            this.dls.ctu.csb.setTextColor(this.amk);
        } else {
            this.dls.ctu.csb.setTextColor(this.aml);
        }
    }

    @Nullable
    public InstrumentType getInstrumentType() {
        com.iqoption.core.microservices.tradingengine.response.active.a aVar = this.anF;
        return aVar != null ? aVar.instrumentType : null;
    }

    private void aFR() {
        com.iqoption.core.microservices.tradingengine.response.b.a U = i.U(this.anF);
        if (U == null) {
            this.dls.ctu.crN.setOnClickListener(null);
        }
        setMultiplier(i.b(U, getInstrumentType()));
    }

    private void setMultiplier(int i) {
        this.bBe = i;
        aFT();
        aFS();
    }

    private void aFS() {
        RobotoTextView robotoTextView = this.dls.ctu.bYx;
        double d = this.bmw;
        double d2 = (double) this.bBe;
        Double.isNaN(d2);
        robotoTextView.setText(j.a(d * d2, this.dkQ));
    }

    private void aFT() {
        this.dls.ctu.csc.setText(af.ft(this.bBe));
    }

    private void a(Double d, Double d2, Boolean bool, Boolean bool2) {
        this.cLb = d;
        this.cLc = d2;
        this.dlA = bool;
        this.dlB = bool2;
    }

    private void q(Boolean bool) {
        this.dls.ctt.crg.setSelected(bool.booleanValue());
    }

    public void aFf() {
        this.dls.ctt.cra.setText(aFU());
        this.dkX.ak(this.dls.ctt.getRoot());
        aFQ();
        aGa();
    }

    private CharSequence aFU() {
        String string = getContext().getString(this.dlb ? R.string.buy : R.string.sell);
        String string2 = getContext().getString(R.string.mkt_on_open_order_n1, new Object[]{string});
        SpannableString spannableString = new SpannableString(string2.toUpperCase(Locale.getDefault()));
        int indexOf = string2.indexOf(string);
        spannableString.setSpan(new ForegroundColorSpan(this.dlb ? this.amj : this.amk), indexOf, string.length() + indexOf, 17);
        return spannableString;
    }

    private Double aFV() {
        return this.cLb != null ? Double.valueOf(com.iqoption.util.ab.g(this.cLb.doubleValue(), 2)) : null;
    }

    private Double aFW() {
        return this.cLc != null ? Double.valueOf(com.iqoption.util.ab.g(-this.cLc.doubleValue(), 2)) : null;
    }

    public void aFg() {
        if (this.anF != null) {
            Balance DN = com.iqoption.app.b.DG().DN();
            ActiveQuote dY = com.iqoption.app.managers.c.GS().dY(this.anF.getActiveId());
            if (!(DN == null || dY == null)) {
                Boolean valueOf;
                Boolean valueOf2;
                double w = ad.w(Double.valueOf(dY.getAsk(this.anF.getInstrumentType(), this.bBe)));
                double w2 = ad.w(Double.valueOf(dY.getBid(this.anF.getInstrumentType(), this.bBe)));
                Double d = this.dlu;
                double doubleValue = d != null ? d.doubleValue() : this.dlb ? w : w2;
                if (this.dlz) {
                    valueOf = Boolean.valueOf(this.dlA == null ? com.iqoption.l.b.aTS().Fn() : this.dlA.booleanValue());
                } else {
                    valueOf = null;
                }
                if (this.cKL) {
                    valueOf2 = Boolean.valueOf(this.dlB == null ? com.iqoption.l.b.aTS().Fo() : this.dlB.booleanValue());
                } else {
                    valueOf2 = null;
                }
                com.iqoption.mobbtech.connect.request.api.a.b.a(this.anF.getActiveId(), this.anF.getInstrumentId(), this.anF.getInstrumentType(), DN.id, (long) DN.type, this.dlb, this.bmw, this.bBe, doubleValue, w, w2, aFV(), aFW(), valueOf, valueOf2, Type.MARKET_ON_OPEN);
            }
        }
    }

    public boolean aFh() {
        return this.dlb;
    }

    public double ZC() {
        return this.bmw;
    }

    public double[] aFd() {
        return j.ae(getInstrumentType());
    }

    public void onTick(long j) {
        if (com.iqoption.util.c.a.d(this.anF, j)) {
            com.iqoption.view.a.b.aYv().b((com.iqoption.view.a.b.a) this);
            aFr().aHM();
            aFr().ac(this.anF);
            return;
        }
        aFX();
    }

    private void aFX() {
        String ak = com.iqoption.util.c.a.ak(this.anF);
        if (ActiveQuote.PHASE_OPENING_AUCTION.equals(ak)) {
            aFr().c(af.ht(getContext().getString(R.string.opening_auction)), getString(R.string.due_to_closed_auction), true, null);
        } else if (ActiveQuote.PHASE_INTRADAY_AUCTION.equals(ak)) {
            aFr().c(getString(R.string.one_day_auction), getString(R.string.due_to_closed_auction), false, null);
        } else {
            aFr().aGt();
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void destroy() {
        aFq().removeObserver(this.dlD);
        com.iqoption.view.a.b.aYv().b((com.iqoption.view.a.b.a) this);
        this.dlr.unregister();
        aFr().aGt();
        super.destroy();
    }

    /* Access modifiers changed, original: 0000 */
    public void T(@NonNull com.iqoption.core.microservices.tradingengine.response.active.a aVar) {
        super.T(aVar);
        e(aVar);
        aFR();
        aFL();
        aFK();
        aFY();
        aFN();
    }

    private void k(Double d) {
        if (this.dly) {
            if (d == null && this.dlu != null) {
                this.dls.ctu.crq.setText(R.string.mkt_on_open_market);
                this.dls.ctt.crq.setText(R.string.mkt_on_open_market);
                this.dls.ctu.crR.animate().alpha(0.0f).setDuration(200).setInterpolator(com.iqoption.view.a.a.c.egR);
                this.dls.ctu.crS.animate().alpha(0.0f).setDuration(200).setInterpolator(com.iqoption.view.a.a.c.egR);
                this.dls.ctu.cse.setVisibility(8);
                this.dls.ctu.csd.setVisibility(8);
                this.dls.ctu.crw.animate().alpha(1.0f).setDuration(200).setInterpolator(com.iqoption.view.a.a.c.egR);
                this.dls.ctu.crx.animate().alpha(1.0f).setDuration(200).setInterpolator(com.iqoption.view.a.a.c.egR);
            } else if (d != null) {
                this.dls.ctu.crq.setText(String.format(Locale.US, this.dlq, new Object[]{d}));
                this.dls.ctt.crq.setText(String.format(Locale.US, this.dlq, new Object[]{d}));
                if (this.dlu == null) {
                    this.dls.ctu.crR.animate().alpha(1.0f).setDuration(200).setInterpolator(com.iqoption.view.a.a.c.egR);
                    this.dls.ctu.crS.animate().alpha(1.0f).setDuration(200).setInterpolator(com.iqoption.view.a.a.c.egR);
                    this.dls.ctu.cse.setVisibility(0);
                    this.dls.ctu.csd.setVisibility(0);
                    this.dls.ctu.crw.animate().alpha(0.45f).setDuration(200).setInterpolator(com.iqoption.view.a.a.c.egR);
                    this.dls.ctu.crx.animate().alpha(0.45f).setDuration(200).setInterpolator(com.iqoption.view.a.a.c.egR);
                }
            }
            this.dlu = d;
            aFQ();
        }
    }

    private void dR(boolean z) {
        this.dls.ctt.crl.setSelected(z);
    }

    private void dS(boolean z) {
        this.dls.ctu.crT.setSelected(z);
        this.dls.ctt.cro.setSelected(z);
        if (z) {
            this.dlw.gh(1);
            this.dlx.gh(1);
            return;
        }
        aGb();
    }

    private void aFY() {
        if (this.dly) {
            if (this.dkX.bE(this.dls.ctt.getRoot())) {
                aGa();
            } else {
                aFZ();
            }
            k(null);
            aGb();
        }
    }

    private void aFZ() {
        if (this.dly) {
            com.iqoption.gl.c.aIy().setLimitOrder(-1.0d, this.dlb, false);
        }
    }

    private void aGa() {
        if (this.dly && this.dkX.bE(this.dls.ctt.getRoot())) {
            ChartWindow aIy = com.iqoption.gl.c.aIy();
            Double d = this.dlu;
            aIy.setLimitOrder(d == null ? -1.0d : d.doubleValue(), this.dlb, true);
        }
    }

    private void aGb() {
        if (this.dlu == null) {
            this.dlw.gh(0);
            this.dlx.gh(0);
            return;
        }
        this.dlw.gh(2);
        this.dlx.gh(2);
    }
}
