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
import com.iqoption.e.ee;
import com.iqoption.fragment.b.d;
import com.iqoption.fragment.dialog.c;
import com.iqoption.util.f;
import com.iqoption.util.j;
import com.iqoption.view.a.a.a.a;
import com.iqoption.x.R;

/* compiled from: CloseGroupDelegate */
public class b extends e implements c {
    private final com.iqoption.util.f.b eiE = new com.iqoption.util.f.b() {
        public void F(double d) {
            b.this.eiH.bZc.setText(af.hu(j.d(b.this.mask, Double.valueOf(d))));
            b.this.eiH.bZc.setTextColor(b.this.amj);
        }

        public void G(double d) {
            b.this.eiH.bZc.setText(af.hv(j.d(b.this.mask, Double.valueOf(d))));
            b.this.eiH.bZc.setTextColor(b.this.amk);
        }

        public void H(double d) {
            b.this.eiH.bZc.setText(j.d(b.this.mask, Double.valueOf(0.0d)));
            b.this.eiH.bZc.setTextColor(b.this.eiL);
        }
    };
    private final com.iqoption.util.f.b eiF = new com.iqoption.util.f.b() {
        public void F(double d) {
            b.this.eiH.bZd.setText(String.format(" (%s)", new Object[]{af.d(Double.valueOf(d))}));
            b.this.eiH.bZd.setTextColor(b.this.amj);
        }

        public void G(double d) {
            b.this.eiH.bZd.setText(String.format(" (%s)", new Object[]{af.e(Double.valueOf(d))}));
            b.this.eiH.bZd.setTextColor(b.this.amk);
        }

        public void H(double d) {
            b.this.eiH.bZd.setText(String.format(" (%s)", new Object[]{af.s(0.0d)}));
            b.this.eiH.bZd.setTextColor(b.this.eiL);
        }
    };
    private ee eiH;

    /* compiled from: CloseGroupDelegate */
    /* renamed from: com.iqoption.view.toppanel.b$4 */
    static /* synthetic */ class AnonymousClass4 {
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
            throw new UnsupportedOperationException("Method not decompiled: com.iqoption.view.toppanel.b$AnonymousClass4.<clinit>():void");
        }
    }

    b(d dVar, com.iqoption.mobbtech.connect.response.options.b bVar) {
        super(dVar, bVar);
    }

    @NonNull
    public View e(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        this.eiH = ee.e(layoutInflater, viewGroup, false);
        this.eiH.bZb.setOnClickListener(new com.iqoption.view.d.b() {
            public void M(View view) {
                if (b.this.eiK != null) {
                    int i = AnonymousClass4.$SwitchMap$com$iqoption$core$data$model$InstrumentType[b.this.eiK.instrumentType.ordinal()];
                    if (i != 1) {
                        if (i == 2 || i == 3) {
                            c.a((int) R.id.fragment, b.this.getSupportFragmentManager(), b.this.aYQ().PM(), b.this.eiK);
                        }
                    } else if (com.iqoption.l.b.aTS().Gd()) {
                        c.a((int) R.id.fragment, b.this.getSupportFragmentManager(), b.this.aYQ().PM(), b.this.eiK);
                    } else {
                        b bVar = b.this;
                        bVar.h(bVar.eiK);
                    }
                }
            }
        });
        a(this.eiK, null);
        return this.eiH.getRoot();
    }

    public void a(com.iqoption.mobbtech.connect.response.options.b bVar, Position position) {
        super.a(bVar, position);
        aYO();
        fu(false);
        aYN();
        cz(l.HZ().Ib());
    }

    private void aYO() {
        if (this.eiK != null) {
            Object obj = (this.anF == null || !this.anF.isExpired()) ? null : 1;
            if (obj != null) {
                this.eiH.bTD.setText(e.ap(this.eiK.dJh * 1000));
                this.eiH.bZg.setVisibility(0);
                return;
            }
            this.eiH.bZg.setVisibility(8);
        }
    }

    public void destroy() {
        aYL();
    }

    public void fu(boolean z) {
        if (z && this.eiH.bYW.getVisibility() == 8) {
            this.eiH.bZb.animate().alpha(0.0f).setListener(a.cf(this.eiH.bZb)).start();
            this.eiH.bYW.animate().alpha(1.0f).setListener(a.cg(this.eiH.bYW)).start();
        } else if (!z && this.eiH.bYW.getVisibility() == 0) {
            this.eiH.bZb.animate().alpha(1.0f).setListener(a.cg(this.eiH.bZb)).start();
            this.eiH.bYW.animate().alpha(0.0f).setListener(a.cf(this.eiH.bYW)).start();
        }
    }

    public void cy(long j) {
        aYN();
        cz(j);
    }

    private void aYL() {
        this.eiH.bZb.setSelected(true);
        this.eiH.bZb.setEnabled(false);
        this.eiH.bZb.animate().alpha(0.2f).setListener(a.cg(this.eiH.bZb)).start();
        this.eiH.bYW.animate().alpha(0.0f).setListener(a.cf(this.eiH.bYW)).start();
    }

    private void fv(boolean z) {
        if (z) {
            this.eiH.bZb.setEnabled(true);
            this.eiH.bZb.setAlpha(1.0f);
            return;
        }
        this.eiH.bZb.animate().cancel();
        this.eiH.bZb.setEnabled(false);
        this.eiH.bZb.setAlpha(0.2f);
    }

    private void fw(boolean z) {
        fv(z);
        if (z) {
            this.eiH.bZc.setAlpha(1.0f);
            this.eiH.bZe.setAlpha(1.0f);
            return;
        }
        this.eiH.bZc.setText(this.eiM);
        this.eiH.bZc.setTextColor(this.eiL);
        this.eiH.bZc.setAlpha(0.2f);
        this.eiH.bZe.setAlpha(0.2f);
    }

    private void aYN() {
        if (this.eiK != null) {
            String str = this.eiM;
            this.eiH.bZh.setText(j.d(this.mask, Double.valueOf(this.eiK.getInvestSum())));
            this.eiH.bZf.setText(String.valueOf(this.eiK.aPX().size()));
        }
    }

    private boolean cz(long j) {
        if (cA(j)) {
            aYP();
            return true;
        }
        fw(false);
        return false;
    }

    private void aYP() {
        if (this.eiK != null) {
            double sellPnl = this.eiK.getSellPnl();
            Double valueOf = Double.valueOf((100.0d * sellPnl) / Double.valueOf(this.eiK.getInvestSum()).doubleValue());
            f.a(sellPnl, this.eiE);
            f.a(valueOf.doubleValue(), this.eiF);
            fw(true);
        }
    }

    public boolean cA(long j) {
        if (this.eiK == null || this.anF == null || !this.anF.aX(j)) {
            return false;
        }
        return true;
    }

    public void h(com.iqoption.mobbtech.connect.response.options.b bVar) {
        if (this.eiK != null && com.iqoption.mobbtech.connect.request.api.a.b.l(this.eiK.aPX())) {
            fu(true);
            String str = "expiration_time";
            str = "balance_type_id";
            EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "traderoom_sell").setParameters(u.anp().o("instrument_type", this.eiK.instrumentType).o(str, Long.valueOf(this.eiK.dJh)).o(str, Integer.valueOf(Balance.getBalanceType(com.iqoption.app.b.DG().f(Long.valueOf(this.eiK.bwR))))).anr()).build());
        }
    }
}
