package com.iqoption.view.toppanel;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.iqoption.analytics.EventManager;
import com.iqoption.app.managers.a.e;
import com.iqoption.app.managers.l;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.util.af;
import com.iqoption.core.util.u;
import com.iqoption.dto.Balance;
import com.iqoption.dto.Event;
import com.iqoption.dto.entity.position.Position;
import com.iqoption.e.eg;
import com.iqoption.fragment.b.d;
import com.iqoption.fragment.dialog.c;
import com.iqoption.util.ak;
import com.iqoption.util.f;
import com.iqoption.util.f.b;
import com.iqoption.util.j;
import com.iqoption.x.R;

/* compiled from: CloseCfdForexPositionDelegate */
public class a extends e implements d {
    private eg eiB;
    private Position eiC;
    private int eiD = 6;
    private final b eiE = new b() {
        public void F(double d) {
            a.this.eiB.bZc.setText(af.hu(j.d(a.this.mask, Double.valueOf(d))));
            a.this.eiB.bZc.setTextColor(a.this.amj);
        }

        public void G(double d) {
            a.this.eiB.bZc.setText(af.hv(j.d(a.this.mask, Double.valueOf(d))));
            a.this.eiB.bZc.setTextColor(a.this.amk);
        }

        public void H(double d) {
            a.this.eiB.bZc.setText(j.d(a.this.mask, Double.valueOf(0.0d)));
            a.this.eiB.bZc.setTextColor(a.this.eiL);
        }
    };
    private final b eiF = new b() {
        public void F(double d) {
            a.this.eiB.bZd.setText(String.format(" (%s)", new Object[]{af.d(Double.valueOf(d))}));
            a.this.eiB.bZd.setTextColor(a.this.amj);
        }

        public void G(double d) {
            a.this.eiB.bZd.setText(String.format(" (%s)", new Object[]{af.e(Double.valueOf(d))}));
            a.this.eiB.bZd.setTextColor(a.this.amk);
        }

        public void H(double d) {
            a.this.eiB.bZd.setText(String.format(" (%s)", new Object[]{af.s(0.0d)}));
            a.this.eiB.bZd.setTextColor(a.this.eiL);
        }
    };

    /* compiled from: CloseCfdForexPositionDelegate */
    /* renamed from: com.iqoption.view.toppanel.a$5 */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] $SwitchMap$com$iqoption$core$data$model$InstrumentType = new int[InstrumentType.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        static {
            /*
            r0 = com.iqoption.core.data.model.InstrumentType.values();
            r0 = r0.length;
            r0 = new int[r0];
            $SwitchMap$com$iqoption$core$data$model$InstrumentType = r0;
            r0 = $SwitchMap$com$iqoption$core$data$model$InstrumentType;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = com.iqoption.core.data.model.InstrumentType.FOREX_INSTRUMENT;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = $SwitchMap$com$iqoption$core$data$model$InstrumentType;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = com.iqoption.core.data.model.InstrumentType.CRYPTO_INSTRUMENT;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = $SwitchMap$com$iqoption$core$data$model$InstrumentType;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = com.iqoption.core.data.model.InstrumentType.CFD_INSTRUMENT;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.iqoption.view.toppanel.a$AnonymousClass5.<clinit>():void");
        }
    }

    a(d dVar, com.iqoption.mobbtech.connect.response.options.b bVar, Position position) {
        super(dVar, bVar);
        this.eiC = position;
    }

    @NonNull
    public View e(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        this.eiB = eg.f(layoutInflater, viewGroup, false);
        this.eiB.bZb.setOnClickListener(new com.iqoption.view.d.b() {
            public void M(View view) {
                if (a.this.eiC != null && !com.iqoption.mobbtech.connect.request.api.a.a.y(a.this.eiC.getId())) {
                    int i = AnonymousClass5.$SwitchMap$com$iqoption$core$data$model$InstrumentType[a.this.eiC.getInstrumentType().ordinal()];
                    if (i != 1) {
                        if (i == 2 || i == 3) {
                            c.a((int) R.id.other_fragment, a.this.getSupportFragmentManager(), a.this.aYQ().PM(), a.this.eiC);
                        }
                    } else if (com.iqoption.l.b.aTS().Gd()) {
                        c.a((int) R.id.other_fragment, a.this.getSupportFragmentManager(), a.this.aYQ().PM(), a.this.eiC);
                    } else {
                        a aVar = a.this;
                        aVar.x(aVar.eiC);
                    }
                }
            }
        });
        this.eiB.bYX.setOnClickListener(new com.iqoption.view.d.b() {
            public void M(View view) {
                if (a.this.eiC != null) {
                    EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "traderoom_open-tpsl-limits-settings").build());
                    com.iqoption.dialog.b.b.a(a.this.getSupportFragmentManager(), (int) R.id.other_fragment, a.this.eiC);
                }
            }
        });
        a(this.eiK, this.eiC);
        return this.eiB.getRoot();
    }

    private void aYJ() {
        this.eiB.aoq.setText(com.iqoption.core.util.j.fr(this.eiD).format(this.eiC.getOpenPriceEnrolled()));
    }

    public void a(com.iqoption.mobbtech.connect.response.options.b bVar, Position position) {
        super.a(bVar, position);
        this.eiC = position;
        ao(this.anF);
        if (this.anF != null) {
            this.eiD = this.anF.getPrecision();
        }
        fu(false);
        aYM();
        aYN();
        aYJ();
        aYK();
        cz(l.HZ().Ib());
    }

    private void ao(com.iqoption.core.microservices.tradingengine.response.active.a aVar) {
        Object obj = (aVar == null || !aVar.isExpired()) ? null : 1;
        if (obj != null) {
            this.eiB.bTD.setText(e.ap(this.eiC.getExpireTime()));
            this.eiB.bZg.setVisibility(0);
            return;
        }
        this.eiB.bZg.setVisibility(8);
    }

    private void aYK() {
        double sellPnl = this.eiC.getSellPnl();
        Double valueOf = Double.valueOf((100.0d * sellPnl) / Double.valueOf(this.eiC.getInvestSum()).doubleValue());
        f.a(sellPnl, this.eiE);
        f.a(valueOf.doubleValue(), this.eiF);
    }

    public void destroy() {
        aYL();
    }

    public void fu(boolean z) {
        if (z && this.eiB.bYW.getVisibility() == 8) {
            this.eiB.bZb.animate().alpha(0.0f).setListener(com.iqoption.view.a.a.a.a.cf(this.eiB.bZb)).start();
            this.eiB.bYW.animate().alpha(1.0f).setListener(com.iqoption.view.a.a.a.a.cg(this.eiB.bYW)).start();
        } else if (!z && this.eiB.bYW.getVisibility() == 0) {
            this.eiB.bZb.animate().alpha(1.0f).setListener(com.iqoption.view.a.a.a.a.cg(this.eiB.bZb)).start();
            this.eiB.bYW.animate().alpha(0.0f).setListener(com.iqoption.view.a.a.a.a.cf(this.eiB.bYW)).start();
        }
    }

    public void cy(long j) {
        aYK();
        cz(j);
    }

    private void aYL() {
        this.eiB.bZb.setSelected(true);
        this.eiB.bZb.setEnabled(false);
        this.eiB.bZb.animate().alpha(0.2f).setListener(com.iqoption.view.a.a.a.a.cg(this.eiB.bZb)).start();
        this.eiB.bYW.animate().alpha(0.0f).setListener(com.iqoption.view.a.a.a.a.cf(this.eiB.bYW)).start();
    }

    private void fv(boolean z) {
        if (z) {
            this.eiB.bZb.setEnabled(true);
            this.eiB.bZb.setAlpha(1.0f);
            return;
        }
        this.eiB.bZb.animate().cancel();
        this.eiB.bZb.setEnabled(false);
        this.eiB.bZb.setAlpha(0.2f);
    }

    private void fw(boolean z) {
        fv(z);
    }

    private void aYM() {
        Position position = this.eiC;
        if (position != null) {
            if (Position.isLong(position)) {
                this.eiB.bZi.setText(R.string.buy);
                this.eiB.bZi.setTextColor(this.amj);
                ak.j(this.eiB.bZi, R.drawable.deal_green);
            } else {
                this.eiB.bZi.setText(R.string.sell);
                this.eiB.bZi.setTextColor(this.amk);
                ak.j(this.eiB.bZi, R.drawable.deal_red);
            }
        }
    }

    private void aYN() {
        if (this.eiC != null) {
            String d = j.d(this.mask, Double.valueOf(this.eiC.getInvestSum()));
            this.eiB.bZh.setText(String.format("%s %s", new Object[]{d, af.ft(this.eiC.getLeverage())}));
        }
    }

    private boolean cz(long j) {
        if (cA(j)) {
            return true;
        }
        fw(false);
        return false;
    }

    public boolean cA(long j) {
        if (this.eiC == null || this.anF == null || !this.anF.aX(j)) {
            return false;
        }
        return true;
    }

    public void x(com.iqoption.mobbtech.connect.response.options.c cVar) {
        fu(true);
        com.iqoption.mobbtech.connect.request.api.a.b.k(this.eiC);
        String str = "expiration_time";
        str = "balance_type_id";
        EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "traderoom_sell").setParameters(u.anp().o("instrument_type", this.eiC.getInstrumentType()).o(str, Long.valueOf(this.eiK.dJh)).o(str, Integer.valueOf(Balance.getBalanceType(com.iqoption.app.b.DG().f(Long.valueOf(this.eiK.bwR))))).anr()).build());
    }
}
