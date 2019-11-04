package com.iqoption.fragment.rightpanel;

import android.content.res.ColorStateList;
import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LiveData;
import com.iqoption.activity.TradeRoomActivity;
import com.iqoption.analytics.EventManager;
import com.iqoption.app.managers.a.e.d;
import com.iqoption.app.managers.l;
import com.iqoption.app.managers.tab.TabHelper;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.util.af;
import com.iqoption.dto.Event;
import com.iqoption.dto.entity.ActiveQuote;
import com.iqoption.dto.entity.expiration.Expiration;
import com.iqoption.dto.entity.position.Position;
import com.iqoption.dto.entity.position.PositionItem;
import com.iqoption.e.yb;
import com.iqoption.fragment.ah;
import com.iqoption.fragment.p;
import com.iqoption.fragment.v;
import com.iqoption.mobbtech.connect.response.options.OptionEvents.h;
import com.iqoption.mobbtech.connect.response.options.OptionEvents.i;
import com.iqoption.mobbtech.connect.response.options.OptionEvents.j;
import com.iqoption.mobbtech.connect.response.options.OptionEvents.k;
import com.iqoption.mobbtech.connect.response.options.OptionEvents.m;
import com.iqoption.system.a.e;
import com.iqoption.system.a.g;
import com.iqoption.util.ab;
import com.iqoption.util.ae;
import com.iqoption.x.R;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

public final class MultiRightPanelDelegate extends EnabledInstrumentDelegate implements com.iqoption.view.a.b.a {
    private static final String TAG = "MultiRightPanelDelegate";
    private Integer activeId;
    private Expiration anH;
    private double bmw;
    private final com.iqoption.p.a.a dkU;
    private r dkW;
    private int dla;
    private boolean dlb;
    private final a dnU = new a(this, null);
    private final b dnV = new b(this);
    private e dnW;
    private e dnX;
    private e dnY;
    private ColorStateList dnZ;
    private r dnm;
    private ColorStateList doa;
    private com.iqoption.mobbtech.connect.response.options.b doc;
    private yb dod;
    private com.iqoption.fragment.rightpanel.a.c doe;
    private boolean dof;
    private boolean dog = false;
    private InstrumentType instrumentType;

    public static final class c {
        private final c dlo;
        private final MultiRightPanelDelegate dok;

        public c(MultiRightPanelDelegate multiRightPanelDelegate) {
            this.dok = multiRightPanelDelegate;
            this.dlo = new c(multiRightPanelDelegate);
        }

        public void aFu() {
            v.a(this.dok.getFragmentManager(), R.id.fragment);
            EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "traderoom_expiration-time").build());
        }

        public void aFv() {
            EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "deal-keyboard_keyboard").setValue(Double.valueOf(com.iqoption.fragment.a.b.b(this.dok.getFragmentManager(), R.id.fragment, this.dok.ZC(), this.dok.aFd()[0]) ? 1.0d : 0.0d)).build());
        }

        public void bB(View view) {
            if (this.dok.aFp() != null) {
                this.dok.bA(view);
            }
            this.dok.dQ(true);
            this.dlo.aFB();
        }

        public void bC(View view) {
            if (this.dok.aFp() != null) {
                this.dok.bA(view);
            }
            this.dok.dQ(false);
            this.dlo.aFB();
        }

        public void aFy() {
            this.dok.aGZ();
            this.dlo.aFC();
        }

        public void aFz() {
            this.dok.aGZ();
        }

        public void aHq() {
            Integer b = this.dok.aHk();
            if (b != null) {
                TabHelper.IM().ec(b.intValue());
            }
        }
    }

    public static final class a extends e<MultiRightPanelDelegate> {
        /* synthetic */ a(MultiRightPanelDelegate multiRightPanelDelegate, AnonymousClass1 anonymousClass1) {
            this(multiRightPanelDelegate);
        }

        private a(MultiRightPanelDelegate multiRightPanelDelegate) {
            super(multiRightPanelDelegate);
        }

        @com.google.common.b.e
        public void onInitializationCompletedEvent(TabHelper.e eVar) {
            com.iqoption.core.c.a.biN.execute(new -$$Lambda$MultiRightPanelDelegate$a$Ky0ccd0BvdhJdF-yzogQpFrr19Q(this));
        }

        private /* synthetic */ void aGV() {
            MultiRightPanelDelegate multiRightPanelDelegate = (MultiRightPanelDelegate) this.dUo.get();
            if (multiRightPanelDelegate != null) {
                multiRightPanelDelegate.aFj();
            }
        }

        @com.google.common.b.e
        public void onAmountChangedIQKeyboardEvent(com.iqoption.fragment.a.b.a aVar) {
            com.iqoption.core.c.a.biN.execute(new -$$Lambda$MultiRightPanelDelegate$a$zebfN3L7VWlei7BPZauGNd1UYNg(this, aVar));
        }

        @com.google.common.b.e
        public void onShowedIQKeyboardEvent(com.iqoption.fragment.a.b.b bVar) {
            com.iqoption.core.c.a.biN.execute(new -$$Lambda$MultiRightPanelDelegate$a$5scunnMHd9heooM2O2pOfXzZNvA(this, bVar));
        }

        @com.google.common.b.e
        public void onShowedExpirationFragmentEvent(d dVar) {
            com.iqoption.core.c.a.biN.execute(new -$$Lambda$MultiRightPanelDelegate$a$-0yZyOk9IU94FzMsP3m02bmhd1E(this, dVar));
        }

        private /* synthetic */ void a(d dVar) {
            MultiRightPanelDelegate multiRightPanelDelegate = (MultiRightPanelDelegate) this.dUo.get();
            if (multiRightPanelDelegate != null) {
                multiRightPanelDelegate.dO(dVar.ajQ);
            }
        }

        @com.google.common.b.e
        public void onChangeExpirationEvent(com.iqoption.app.managers.a.e.a aVar) {
            if (aVar.avF == TabHelper.IM().Ji()) {
                com.iqoption.core.c.a.biN.execute(new -$$Lambda$MultiRightPanelDelegate$a$jiYdMEWd1CRlxpo2dg1Sh0oYwI0(this, aVar));
            }
        }

        private /* synthetic */ void d(com.iqoption.app.managers.a.e.a aVar) {
            MultiRightPanelDelegate multiRightPanelDelegate = (MultiRightPanelDelegate) this.dUo.get();
            if (multiRightPanelDelegate != null) {
                multiRightPanelDelegate.j(aVar.anH);
                multiRightPanelDelegate.aHd();
            }
        }

        @com.google.common.b.e
        public void onOpenOptionGroups(m mVar) {
            com.iqoption.core.c.a.biN.execute(new -$$Lambda$MultiRightPanelDelegate$a$VMrn-N4bVwR_9BJMOCtd2zKaJIc(this));
        }

        private /* synthetic */ void aHp() {
            MultiRightPanelDelegate multiRightPanelDelegate = (MultiRightPanelDelegate) this.dUo.get();
            if (multiRightPanelDelegate != null) {
                multiRightPanelDelegate.aHd();
            }
        }

        @com.google.common.b.e
        public void onOpenOptionGroupRemoved(k kVar) {
            com.iqoption.core.c.a.biN.execute(new -$$Lambda$MultiRightPanelDelegate$a$NBnyQM5hqt9fdyG7HmaVQ3ynbfM(this));
        }

        private /* synthetic */ void aHo() {
            MultiRightPanelDelegate multiRightPanelDelegate = (MultiRightPanelDelegate) this.dUo.get();
            if (multiRightPanelDelegate != null) {
                multiRightPanelDelegate.aHd();
            }
        }

        @com.google.common.b.e
        public void onOpenOptionGroupOptionRemoved(j jVar) {
            com.iqoption.core.c.a.biN.execute(new -$$Lambda$MultiRightPanelDelegate$a$de3g7lei60DsGJFy40DEeKykE3Y(this));
        }

        private /* synthetic */ void aHn() {
            MultiRightPanelDelegate multiRightPanelDelegate = (MultiRightPanelDelegate) this.dUo.get();
            if (multiRightPanelDelegate != null) {
                multiRightPanelDelegate.aHd();
            }
        }

        @com.google.common.b.e
        public void onOpenOptionGroupOptionAdded(i iVar) {
            com.iqoption.core.c.a.biN.execute(new -$$Lambda$MultiRightPanelDelegate$a$7vMDE_ZtyKYMXO1_a5lJFG12dTU(this));
        }

        private /* synthetic */ void aHm() {
            MultiRightPanelDelegate multiRightPanelDelegate = (MultiRightPanelDelegate) this.dUo.get();
            if (multiRightPanelDelegate != null) {
                multiRightPanelDelegate.aHd();
            }
        }

        @com.google.common.b.e
        public void onNewOpenOptionGroup(h hVar) {
            com.iqoption.core.c.a.biN.execute(new -$$Lambda$MultiRightPanelDelegate$a$RoXvHICsh0c9XDBecxUvk5_5tLI(this));
        }

        private /* synthetic */ void aHl() {
            MultiRightPanelDelegate multiRightPanelDelegate = (MultiRightPanelDelegate) this.dUo.get();
            if (multiRightPanelDelegate != null) {
                multiRightPanelDelegate.aHd();
            }
        }
    }

    public static class b extends g<MultiRightPanelDelegate> {
        public b(MultiRightPanelDelegate multiRightPanelDelegate) {
            super(multiRightPanelDelegate);
        }

        @com.google.common.b.e
        public void onChangeBalanceType(com.iqoption.service.e.b bVar) {
            com.iqoption.core.c.a.biN.execute(new Runnable() {
                public void run() {
                    MultiRightPanelDelegate multiRightPanelDelegate = (MultiRightPanelDelegate) b.this.dUo.get();
                    if (multiRightPanelDelegate != null) {
                        multiRightPanelDelegate.K(multiRightPanelDelegate.Fd());
                    }
                }
            });
        }

        @com.google.common.b.e
        public void onUpdateBalanceValue(com.iqoption.service.e.k kVar) {
            com.iqoption.core.c.a.biN.execute(new Runnable() {
                public void run() {
                    MultiRightPanelDelegate multiRightPanelDelegate = (MultiRightPanelDelegate) b.this.dUo.get();
                    if (multiRightPanelDelegate != null) {
                        multiRightPanelDelegate.aFj();
                    }
                }
            });
        }

        @com.google.common.b.e
        public void onChangeCurrentCurrency(com.iqoption.service.e.c cVar) {
            com.iqoption.core.c.a.biN.execute(new Runnable() {
                public void run() {
                    MultiRightPanelDelegate multiRightPanelDelegate = (MultiRightPanelDelegate) b.this.dUo.get();
                    if (multiRightPanelDelegate != null) {
                        multiRightPanelDelegate.aHi();
                    }
                }
            });
        }
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

    public MultiRightPanelDelegate(RightPanelFragment rightPanelFragment, com.iqoption.core.microservices.tradingengine.response.active.a aVar) {
        super(rightPanelFragment);
        this.activeId = Integer.valueOf(aVar.getActiveId());
        this.instrumentType = aVar.getInstrumentType();
        this.dkU = new com.iqoption.p.a.a(aVar.getPrecision());
        this.dof = p.cVG.axS();
        this.dnZ = ContextCompat.getColorStateList(getContext(), R.color.enabled_red_to_graey_blur_50);
        this.doa = ContextCompat.getColorStateList(getContext(), R.color.enabled_white_to_graey_blur_50);
        this.dla = rightPanelFragment.fA(R.dimen.dp24);
        this.doe = com.iqoption.fragment.rightpanel.a.c.ag(rightPanelFragment);
        this.dnU.register();
        this.dnV.register();
        com.iqoption.view.a.b.aYv().a((com.iqoption.view.a.b.a) this, Integer.valueOf(5));
    }

    public boolean aFe() {
        return com.iqoption.l.b.aTS().aUa() ^ 1;
    }

    public void aFf() {
        this.dod.csu.setType(aFh());
        if (!this.dnX.bE(this.dod.csu)) {
            this.dnX.ak(this.dod.csu);
        }
    }

    private void aGZ() {
        if (!this.dnX.bE(this.dod.csA)) {
            this.dnX.ak(this.dod.csA);
        }
    }

    public boolean aFo() {
        return this.doc != null;
    }

    public void aFg() {
        TabHelper.i Jh = TabHelper.IM().Jh();
        if (Jh != null) {
            this.doe.a(this.doc, Jh.Jz(), Jh.Js(), this.bmw, this.dlb);
        }
    }

    private void aHa() {
        String Bx = p.cVG.Bx();
        if (!this.dof && getFragmentManager().findFragmentByTag(Bx) == null) {
            getFragmentManager().beginTransaction().add(R.id.underLeftFragmentContainer, p.cVG.axR(), Bx).addToBackStack(Bx).commit();
            this.dof = true;
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
        return com.iqoption.util.j.ae(this.instrumentType);
    }

    public void onTick(long j) {
        if (this.dod != null) {
            TabHelper.i Jh = TabHelper.IM().Jh();
            if (Jh != null) {
                com.iqoption.core.microservices.tradingengine.response.active.a Jt = Jh.Jt();
                com.iqoption.core.microservices.tradingengine.response.active.a Js = Jh.Js();
                if (S(Jt) && Js != null) {
                    if (com.iqoption.util.c.a.d(Jt, j)) {
                        this.doe.aul();
                        if (this.dnW.bE(this.dod.ctb)) {
                            if (b(Js, j)) {
                                this.dod.bYK.setText(DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(this.anH.expValue.longValue() - j)));
                            } else {
                                aFm();
                            }
                        } else if (b(Js, j)) {
                            aFn();
                        } else {
                            s(Jh);
                        }
                        t(Jh);
                        aHe();
                        if (this.dnX.bE(this.dod.csu)) {
                            bO(j);
                        }
                        if (this.dpm && !l.HZ().Ie()) {
                            aHg();
                        }
                    } else {
                        com.iqoption.view.a.b.aYv().b((com.iqoption.view.a.b.a) this);
                        aFr().ac(Jt);
                    }
                }
            }
        }
    }

    private void bO(long j) {
        ActiveQuote dY = com.iqoption.app.managers.c.GS().dY(this.activeId.intValue());
        if (dY != null) {
            this.dod.csu.setLevel(this.dkU.format(dY.getVal()));
        } else {
            this.dod.csu.setLevel(null);
        }
        if (this.anH != null) {
            this.dod.csu.setExpiration(com.iqoption.app.managers.a.e.a(getContext(), j, ab.D(this.anH.expValue)));
        } else {
            this.dod.csu.setExpiration(null);
        }
    }

    private void aHb() {
        if (!this.dnY.bE(this.dod.ctj)) {
            this.dnY.ak(this.dod.ctj);
        }
    }

    private void aHc() {
        if (!this.dnY.bE(this.dod.ctf)) {
            this.dnY.ak(this.dod.ctf);
        }
    }

    private void aHd() {
        TabHelper.i Jh = TabHelper.IM().Jh();
        if (Jh != null && S(Jh.Jt())) {
            this.doc = com.iqoption.app.managers.c.GS().a(Jh.getOptionKey());
            com.iqoption.mobbtech.connect.response.options.b bVar = this.doc;
            if (bVar != null) {
                this.doe.c(bVar);
                aHb();
            } else {
                aHc();
            }
            s(Jh);
            aHe();
        }
    }

    private void aHe() {
        if (!this.dnW.bE(this.dod.ctb)) {
            if (!gf(this.activeId.intValue())) {
                aFm();
            } else if (aHf()) {
                aFn();
            } else {
                aHj();
            }
        }
    }

    private boolean aHf() {
        TabHelper.i Jh = TabHelper.IM().Jh();
        com.iqoption.core.microservices.tradingengine.response.active.j jVar = (com.iqoption.core.microservices.tradingengine.response.active.j) (Jh != null ? Jh.Js() : null);
        return jVar != null ? g(jVar) : false;
    }

    private boolean g(@NonNull com.iqoption.core.microservices.tradingengine.response.active.j jVar) {
        com.iqoption.mobbtech.connect.response.options.b bVar = this.doc;
        if (bVar == null || ((Position) bVar.aPX().get(0)).getPositionItems().size() != jVar.aib().size()) {
            return false;
        }
        return true;
    }

    private boolean b(@NonNull com.iqoption.core.microservices.tradingengine.response.active.a aVar, long j) {
        if (j <= this.anH.expValue.longValue() - com.iqoption.app.managers.a.e.Ig().c(aVar, this.anH) || j >= this.anH.expValue.longValue()) {
            return g((com.iqoption.core.microservices.tradingengine.response.active.j) aVar);
        }
        return this.doc != null;
    }

    private boolean S(@Nullable com.iqoption.core.microservices.tradingengine.response.active.a aVar) {
        return aVar != null && ae.equals(aVar.getInstrumentType(), this.instrumentType) && aVar.getActiveId() == this.activeId.intValue();
    }

    /* Access modifiers changed, original: 0000 */
    @NonNull
    public View e(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        final c cVar = new c(this);
        this.dod = (yb) DataBindingUtil.inflate(layoutInflater, R.layout.right_panel_delegate_multi, viewGroup, false);
        this.dod.a(cVar);
        this.dnW = new e(this.dla, this.dod.ctc.csT, this.dod.cth, this.dod.ctb);
        this.dnX = new e(this.dla, this.dod.csA, this.dod.csu);
        this.dnY = new e(this.dla, this.dod.ctf, this.dod.ctj);
        this.dnm = new r(this.dod.caj, this.dod.csv);
        this.dkW = new r(this.dod.crv, this.dod.crs);
        this.dod.ctc.ctr.setOnClickListener(new com.iqoption.view.d.b() {
            public void M(View view) {
                cVar.bB(view);
            }
        });
        this.dod.ctc.cts.setOnClickListener(new com.iqoption.view.d.b() {
            public void M(View view) {
                cVar.bC(view);
            }
        });
        this.dod.csu.setConfirmListener(new com.iqoption.view.d.b(1000) {
            public void M(View view) {
                cVar.aFy();
            }
        });
        this.dod.csu.setCancelListener(new com.iqoption.view.d.b() {
            public void M(View view) {
                cVar.aFz();
            }
        });
        this.dod.cth.setOnClickListener(new com.iqoption.view.d.b() {
            public void M(View view) {
                cVar.aHq();
            }
        });
        K(Fd());
        j(TabHelper.IM().Jd());
        aHd();
        com.iqoption.fragment.rightpanel.a.d dVar = new com.iqoption.fragment.rightpanel.a.d(-$$Lambda$MultiRightPanelDelegate$JGBWYnuGX1tNdIilNnN75VWvEL8.INSTANCE);
        this.doe.Bo().observe(this, new -$$Lambda$MultiRightPanelDelegate$GvatEfF-xkpjW9W3583Waa9DHuE(dVar));
        this.doe.aHQ().observe(this, new -$$Lambda$MultiRightPanelDelegate$O2gMigyF9hBndDlvRqC18b174Zo(this));
        this.doe.aHR().observe(this, new -$$Lambda$MultiRightPanelDelegate$IDecajhXcyyyX26Wi1JnOo2UdEk(this));
        this.doe.gi(this.activeId.intValue());
        this.dod.ctj.setHasFixedSize(true);
        this.dod.ctj.setAdapter(dVar);
        return this.dod.getRoot();
    }

    private /* synthetic */ void r(Boolean bool) {
        boolean z = bool != null && bool.booleanValue();
        this.dog = z;
        if (this.dog) {
            aHg();
            this.dod.ctg.setEnabled(false);
            this.dod.crt.setEnabled(false);
            return;
        }
        aHh();
        this.dod.ctg.setEnabled(true);
        this.dod.crt.setEnabled(true);
    }

    private void aHg() {
        RightPanelDelegate.bI(this.dod.ctc.ctr);
        RightPanelDelegate.bI(this.dod.ctc.cts);
    }

    private void aHh() {
        if (!this.dog) {
            RightPanelDelegate.bH(this.dod.ctc.ctr);
            RightPanelDelegate.bH(this.dod.ctc.cts);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void T(@NonNull com.iqoption.core.microservices.tradingengine.response.active.a aVar) {
        super.T(aVar);
        this.activeId = Integer.valueOf(aVar.getActiveId());
        this.instrumentType = aVar.getInstrumentType();
        this.dkU.ht(aVar.getPrecision());
        this.doe.gi(this.activeId.intValue());
    }

    /* Access modifiers changed, original: 0000 */
    public void destroy() {
        super.destroy();
        this.dnU.unregister();
        this.dnV.unregister();
        com.iqoption.view.a.b.aYv().b((com.iqoption.view.a.b.a) this);
    }

    /* Access modifiers changed, original: 0000 */
    public void K(double d) {
        if (d < 0.0d) {
            d = 0.0d;
        }
        this.bmw = d;
        if (this.dod != null) {
            aHi();
            aFj();
        }
    }

    private void aHi() {
        String a = com.iqoption.util.j.a(this.bmw, this.dkQ);
        this.dod.crv.setText(a);
        this.dod.csu.setInvest(a);
    }

    private void aFj() {
        if (this.dod != null) {
            double doubleValue = com.iqoption.app.b.DG().DI().doubleValue();
            double[] ae = com.iqoption.util.j.ae(getInstrumentType());
            double d = this.bmw;
            if (d > doubleValue || d > ae[1] || d < ae[0]) {
                this.dod.crv.setTextColor(this.dnZ);
            } else {
                this.dod.crv.setTextColor(this.doa);
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void j(Expiration expiration) {
        this.anH = expiration;
        aFk();
    }

    private void aFk() {
        if (this.dod != null) {
            com.iqoption.core.microservices.tradingengine.response.active.a IZ = TabHelper.IM().IZ();
            if (S(IZ)) {
                this.dod.caj.setText(com.iqoption.app.managers.a.e.Ig().a(IZ, this.anH.expValue.longValue()));
            } else {
                this.dod.caj.setText(null);
            }
        }
    }

    @Nullable
    private com.iqoption.core.microservices.tradingengine.response.a g(com.iqoption.core.microservices.tradingengine.response.instrument.e eVar) {
        if (eVar == null) {
            return null;
        }
        com.iqoption.core.microservices.tradingengine.response.a c = com.iqoption.app.managers.c.GS().c(eVar.aiA().getId(), eVar.getInstrumentType());
        com.iqoption.core.microservices.tradingengine.response.a c2 = com.iqoption.app.managers.c.GS().c(eVar.aiB().getId(), eVar.getInstrumentType());
        if (!com.iqoption.core.microservices.tradingengine.response.a.g(c) || !com.iqoption.core.microservices.tradingengine.response.a.g(c2)) {
            return null;
        }
        if (com.iqoption.core.microservices.tradingengine.response.a.e(c) > com.iqoption.core.microservices.tradingengine.response.a.e(c2)) {
            c2 = c;
        }
        return c2;
    }

    private boolean gf(int i) {
        com.iqoption.mobbtech.connect.response.options.b bVar = this.doc;
        if (bVar != null) {
            Iterator it = ((Position) bVar.aPX().get(0)).getPositionItems().iterator();
            while (it.hasNext()) {
                if (((PositionItem) it.next()).getActiveId() == i) {
                    return true;
                }
            }
        }
        return false;
    }

    private void s(TabHelper.i iVar) {
        com.iqoption.core.microservices.tradingengine.response.a g = g(iVar.Jz());
        if (g != null) {
            this.dod.cte.H("%s%%", g.ahK());
            aHh();
            return;
        }
        this.dod.cte.clear();
        aHg();
    }

    private void t(TabHelper.i iVar) {
        com.iqoption.core.microservices.tradingengine.response.active.j jVar = (com.iqoption.core.microservices.tradingengine.response.active.j) iVar.Js();
        if (jVar != null) {
            int c = (int) com.iqoption.core.microservices.f.a.a.a.c(com.iqoption.app.helpers.a.Gs().a(jVar.getActiveId(), jVar.getInstrumentType()));
            this.dod.ctl.setText(getString(R.string.up_to_n1, af.s((double) c)));
            return;
        }
        this.dod.ctl.setText(null);
    }

    private void dO(boolean z) {
        this.dod.csx.setSelected(z);
        this.dod.ctg.setSelected(z);
        if (z) {
            this.dnm.select();
        } else {
            this.dnm.aHN();
        }
    }

    private void dP(boolean z) {
        this.dod.cru.setSelected(z);
        this.dod.crt.setSelected(z);
        if (z) {
            this.dkW.select();
        } else {
            this.dkW.aHN();
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void aFm() {
        if (!this.dnW.bE(this.dod.ctc.csT)) {
            this.dnW.ak(this.dod.ctc.csT);
        }
    }

    private void aFn() {
        if (!this.dnW.bE(this.dod.ctb)) {
            this.dnW.ak(this.dod.ctb);
        }
    }

    private void aHj() {
        if (!this.dnW.bE(this.dod.cth)) {
            Integer aHk = aHk();
            if (aHk != null) {
                double profitIfWin = (((this.doc.getProfitIfWin() / this.doc.getInvestSum()) * ((com.iqoption.core.microservices.f.a.a.a.c(com.iqoption.app.helpers.a.Gs().a(aHk.intValue(), InstrumentType.DIGITAL_INSTRUMENT)) / 100.0d) + 1.0d)) - 1.0d) * 100.0d;
                TextView textView = this.dod.cti;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(af.s((double) ((int) profitIfWin)));
                stringBuilder.append(" ");
                stringBuilder.append(getString(R.string.profit).toLowerCase());
                textView.setText(stringBuilder.toString());
            } else {
                this.dod.cti.setText(null);
            }
            this.dnW.ak(this.dod.cth);
        }
    }

    @Nullable
    private Integer aHk() {
        TabHelper.i Jh = TabHelper.IM().Jh();
        com.iqoption.core.microservices.tradingengine.response.active.j jVar = (com.iqoption.core.microservices.tradingengine.response.active.j) (Jh != null ? Jh.Js() : null);
        if (jVar != null) {
            for (com.iqoption.core.microservices.tradingengine.response.active.j jVar2 : jVar.aib()) {
                if (!gf(jVar2.getActiveId())) {
                    return Integer.valueOf(jVar2.getActiveId());
                }
            }
        }
        return null;
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
