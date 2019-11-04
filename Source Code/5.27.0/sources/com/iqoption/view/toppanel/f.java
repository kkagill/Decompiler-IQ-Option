package com.iqoption.view.toppanel;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.graphics.drawable.GradientDrawable;
import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import com.google.common.base.Predicates;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.i;
import com.iqoption.analytics.EventManager;
import com.iqoption.app.managers.a.e;
import com.iqoption.app.managers.l;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.util.j;
import com.iqoption.core.util.u;
import com.iqoption.dto.Balance;
import com.iqoption.dto.Event;
import com.iqoption.dto.entity.position.Position;
import com.iqoption.e.yr;
import com.iqoption.fragment.b.d;
import com.iqoption.mobbtech.connect.request.api.a.a;
import com.iqoption.mobbtech.connect.response.options.b;
import com.iqoption.util.ak;
import com.iqoption.view.a.a.c;
import com.iqoption.x.R;
import java.text.DecimalFormat;
import java.util.concurrent.TimeUnit;

/* compiled from: SellDelegate */
public class f extends e implements c, d {
    private ValueAnimator dol;
    private yr eiN;
    CountDownTimer eiO = null;
    private String eiP = getContext().getResources().getString(R.string.cancel);
    private String eiQ = getContext().getResources().getString(R.string.sell);
    private String eiR = getContext().getResources().getString(R.string.sell_all);
    private Double eiS;

    /* compiled from: SellDelegate */
    /* renamed from: com.iqoption.view.toppanel.f$4 */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] $SwitchMap$com$iqoption$core$data$model$InstrumentType = new int[InstrumentType.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Missing block: B:13:?, code skipped:
            return;
     */
        static {
            /*
            r0 = com.iqoption.core.data.model.InstrumentType.values();
            r0 = r0.length;
            r0 = new int[r0];
            $SwitchMap$com$iqoption$core$data$model$InstrumentType = r0;
            r0 = $SwitchMap$com$iqoption$core$data$model$InstrumentType;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = com.iqoption.core.data.model.InstrumentType.TURBO_INSTRUMENT;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = $SwitchMap$com$iqoption$core$data$model$InstrumentType;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = com.iqoption.core.data.model.InstrumentType.BINARY_INSTRUMENT;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = $SwitchMap$com$iqoption$core$data$model$InstrumentType;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = com.iqoption.core.data.model.InstrumentType.MULTI_INSTRUMENT;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r0 = $SwitchMap$com$iqoption$core$data$model$InstrumentType;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = com.iqoption.core.data.model.InstrumentType.FX_INSTRUMENT;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r2 = 4;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            r0 = $SwitchMap$com$iqoption$core$data$model$InstrumentType;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r1 = com.iqoption.core.data.model.InstrumentType.DIGITAL_INSTRUMENT;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0040 }
            r2 = 5;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0040 }
        L_0x0040:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.iqoption.view.toppanel.f$AnonymousClass4.<clinit>():void");
        }
    }

    public f(d dVar, b bVar) {
        super(dVar, bVar);
    }

    private String i(b bVar) {
        return bVar.size() > 1 ? this.eiR : this.eiQ;
    }

    @NonNull
    public View e(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        this.eiN = yr.ad(layoutInflater, viewGroup, false);
        final GradientDrawable gradientDrawable = (GradientDrawable) this.eiN.ctY.getBackground();
        -$$Lambda$f$Rskdt-mACdtyFMvAWHJ694TXtIs -__lambda_f_rskdt-macdtyfmvawhj694txtis = new -$$Lambda$f$Rskdt-mACdtyFMvAWHJ694TXtIs(gradientDrawable);
        this.dol = ValueAnimator.ofObject(new ArgbEvaluator(), new Object[]{Integer.valueOf(9676994), Integer.valueOf(865315010)});
        this.dol.addUpdateListener(-__lambda_f_rskdt-macdtyfmvawhj694txtis);
        this.dol.addListener(new AnimatorListener() {
            public void onAnimationRepeat(Animator animator) {
            }

            public void onAnimationStart(Animator animator) {
            }

            public void onAnimationEnd(Animator animator) {
                gradientDrawable.setColor(9676994);
            }

            public void onAnimationCancel(Animator animator) {
                gradientDrawable.setColor(9676994);
            }
        });
        this.dol.setInterpolator(c.egR);
        this.dol.setRepeatMode(2);
        this.eiN.bWZ.setOnClickListener(new com.iqoption.view.d.b(500) {
            public void M(View view) {
                if (f.this.eiK != null) {
                    int i = AnonymousClass4.$SwitchMap$com$iqoption$core$data$model$InstrumentType[f.this.eiK.instrumentType.ordinal()];
                    if (i == 1 || i == 2) {
                        ImmutableList sC = i.b(f.this.eiK.aPX()).a(com.iqoption.mobbtech.connect.response.options.c.getId).b(Predicates.a(a.dIm)).sC();
                        if (!sC.isEmpty()) {
                            f.this.fu(true);
                            a.a(f.this.getContext(), sC);
                            EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "traderoom_buyback").setParameters(u.anp().o("instrument_type", f.this.eiK.instrumentType).anr()).build());
                        }
                    } else if (i == 3 || i == 4 || i == 5) {
                        if (com.google.common.c.a.c(f.this.eiK.getInvestSum() + f.this.eiK.getSellPnl(), 0.0d, 0.001d) <= 0) {
                            com.iqoption.fragment.dialog.a.a((int) R.id.fragment, f.this.getSupportFragmentManager(), f.this.aYQ().PM(), f.this.eiK);
                        } else {
                            f fVar = f.this;
                            fVar.h(fVar.eiK);
                        }
                    }
                }
            }
        });
        a(this.eiK, null);
        return this.eiN.getRoot();
    }

    public boolean ahQ() {
        boolean z = false;
        if (this.eiK == null || this.anF == null) {
            return false;
        }
        int i = AnonymousClass4.$SwitchMap$com$iqoption$core$data$model$InstrumentType[this.anF.getInstrumentType().ordinal()];
        if (i == 1 || i == 2) {
            return this.anF.ahQ();
        }
        if (i != 3 && i != 4 && i != 5) {
            return false;
        }
        if (this.anF.ahQ() && this.eiS != null) {
            z = true;
        }
        return z;
    }

    public void a(b bVar, Position position) {
        super.a(bVar, position);
        if (this.eiN == null) {
            com.iqoption.util.i.d(new RuntimeException("attempt to update delegate before then view has been created"));
            return;
        }
        fu(false);
        this.eiS = this.eiK.calculateBuybackAmountWithCancelable(l.HZ().Ib());
        this.eiN.bWZ.setSelected(false);
        aYR();
        aYU();
        aYV();
    }

    private void aYR() {
        int i = AnonymousClass4.$SwitchMap$com$iqoption$core$data$model$InstrumentType[this.eiK.instrumentType.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            aYT();
        } else if (i == 4 || i == 5) {
            aYS();
        }
    }

    private void aYS() {
        if (this.eiK.size() > 1) {
            aYT();
            return;
        }
        com.iqoption.mobbtech.connect.response.options.c cVar = (com.iqoption.mobbtech.connect.response.options.c) this.eiK.aPX().iterator().next();
        if (cVar instanceof Position) {
            long instrumentStrikeValue = ((Position) cVar).getInstrumentStrikeValue();
            TextView textView = this.eiN.bTD;
            DecimalFormat fr = j.fr(this.anF.getPrecision());
            double d = (double) instrumentStrikeValue;
            Double.isNaN(d);
            textView.setText(fr.format(d / 1000000.0d));
            if (cVar.isCall()) {
                ak.j(this.eiN.bTD, R.drawable.deal_green);
            } else {
                ak.j(this.eiN.bTD, R.drawable.deal_red);
            }
        }
    }

    private void aYT() {
        this.eiN.bTD.setText(e.ap(this.eiK.dJh * 1000));
        ak.j(this.eiN.bTD, R.drawable.ic_flag_8_8);
    }

    public void destroy() {
        aYL();
        aYX();
    }

    public void fu(boolean z) {
        if (z && this.eiN.bYW.getVisibility() == 8) {
            this.eiN.bWZ.animate().alpha(0.0f).setListener(com.iqoption.view.a.a.a.a.cf(this.eiN.bWZ)).start();
            this.eiN.bYW.animate().alpha(1.0f).setListener(com.iqoption.view.a.a.a.a.cg(this.eiN.bYW)).start();
        } else if (!z && this.eiN.bYW.getVisibility() == 0) {
            this.eiN.bWZ.animate().alpha(1.0f).setListener(com.iqoption.view.a.a.a.a.cg(this.eiN.bWZ)).start();
            this.eiN.bYW.animate().alpha(0.0f).setListener(com.iqoption.view.a.a.a.a.cf(this.eiN.bYW)).start();
        }
    }

    public void cy(long j) {
        aYU();
        if (aYV() && !this.dol.isRunning() && this.eiN.bWZ.isEnabled() && !this.eiN.bWZ.isSelected() && this.anF != null) {
            long j2 = (this.eiK.dJh * 1000) - j;
            if (j2 < e.Ig().n(this.anF) && j2 > 0) {
                this.dol.setDuration(400);
                this.dol.setRepeatCount(((int) (j2 / 400)) + 1);
                this.dol.start();
            }
        }
    }

    private void aYL() {
        this.dol.cancel();
        this.eiN.bWZ.setSelected(true);
        this.eiN.bWZ.setEnabled(false);
        this.eiN.bWZ.animate().alpha(0.2f).setListener(com.iqoption.view.a.a.a.a.cg(this.eiN.bWZ)).start();
        this.eiN.bYW.animate().alpha(0.0f).setListener(com.iqoption.view.a.a.a.a.cf(this.eiN.bYW)).start();
    }

    private void fv(boolean z) {
        if (z) {
            this.eiN.bWZ.setEnabled(true);
            this.eiN.bWZ.setAlpha(1.0f);
            return;
        }
        this.dol.cancel();
        this.eiN.bWZ.animate().cancel();
        this.eiN.bWZ.setEnabled(false);
        this.eiN.bWZ.setAlpha(0.2f);
    }

    private void fw(boolean z) {
        fv(z);
        if (z) {
            this.eiN.ctZ.setAlpha(1.0f);
            this.eiN.cua.setAlpha(1.0f);
            return;
        }
        this.eiN.ctZ.setText(this.eiM);
        this.eiN.ctZ.setTextColor(this.eiL);
        this.eiN.bWZ.setText(i(this.eiK));
        this.eiN.ctZ.setAlpha(0.2f);
        this.eiN.cua.setAlpha(0.2f);
    }

    private void aYU() {
        if (this.eiK != null) {
            String str = this.eiM;
            CharSequence charSequence = this.eiM;
            int i = this.eiL;
            String d = com.iqoption.util.j.d(this.mask, Double.valueOf(this.eiK.getInvestSum()));
            if (this.eiK.aQb() != null) {
                Double valueOf = Double.valueOf(this.eiK.aQb().doubleValue() - this.eiK.getInvestSum());
                String b = com.iqoption.util.j.b(this.mask, valueOf);
                i = c(valueOf);
                charSequence = b;
            }
            this.eiN.bZh.setText(d);
            this.eiN.alW.setText(charSequence);
            this.eiN.alW.setTextColor(i);
        }
    }

    private boolean aYV() {
        if (this.eiK == null) {
            fw(false);
            return false;
        }
        if (!aYY()) {
            this.eiS = this.eiK.calculateBuybackAmountWithCancelable(l.HZ().Ib());
            Double d = this.eiS;
            if (d != null) {
                x(d);
            } else {
                fw(false);
            }
        }
        return true;
    }

    private void x(Double d) {
        if (this.eiK != null && d != null) {
            Double valueOf = Double.valueOf(d.doubleValue() - this.eiK.getInvestSum());
            String d2 = com.iqoption.util.j.d(this.mask, d);
            String b = com.iqoption.util.j.b(this.mask, valueOf);
            int c = c(valueOf);
            this.eiN.ctZ.setText(b);
            this.eiN.ctZ.setTextColor(c);
            TextView textView = this.eiN.bWZ;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(i(this.eiK));
            stringBuilder.append(" ");
            stringBuilder.append(d2);
            textView.setText(stringBuilder.toString());
            fw(true);
        }
    }

    @ColorInt
    private int c(Number number) {
        if (number.doubleValue() > 0.01d) {
            return this.amj;
        }
        if (number.doubleValue() < 0.01d) {
            return this.amk;
        }
        return this.eiL;
    }

    private void cB(long j) {
        this.eiO = new CountDownTimer(j, j / ((TimeUnit.MILLISECONDS.toSeconds(j) + 1) * 2)) {
            public void onTick(long j) {
                f.this.cC(j);
            }

            public void onFinish() {
                TextView textView = f.this.eiN.bWZ;
                f fVar = f.this;
                textView.setText(fVar.i(fVar.eiK));
                f.this.aYV();
            }
        };
        this.eiO.start();
    }

    private boolean aYW() {
        return this.eiO != null;
    }

    private void aYX() {
        CountDownTimer countDownTimer = this.eiO;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.eiO = null;
        }
    }

    private boolean aYY() {
        if (!ahQ() || this.anF == null) {
            return false;
        }
        long Ib = l.HZ().Ib();
        if (this.eiK.isCancelable(Ib)) {
            if (!aYW()) {
                long cancelTimeLeft = this.eiK.getCancelTimeLeft(Ib);
                cB(cancelTimeLeft);
                cC(cancelTimeLeft);
            }
            return true;
        }
        this.eiN.bWZ.setText(i(this.eiK));
        aYX();
        return false;
    }

    private void cC(long j) {
        j = TimeUnit.MILLISECONDS.toSeconds(j) + 1;
        TextView textView = this.eiN.bWZ;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.eiP);
        stringBuilder.append(" ");
        stringBuilder.append(j);
        textView.setText(stringBuilder.toString());
        fv(true);
    }

    public void h(b bVar) {
        if (this.eiK != null) {
            if (com.iqoption.mobbtech.connect.request.api.a.b.l(this.eiK.aPX())) {
                fu(true);
            }
            String str = "expiration_time";
            str = "balance_type_id";
            EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "traderoom_sell").setParameters(u.anp().o("instrument_type", this.eiK.instrumentType).o(str, Long.valueOf(this.eiK.dJh)).o(str, Integer.valueOf(Balance.getBalanceType(com.iqoption.app.b.DG().f(Long.valueOf(this.eiK.bwR))))).anr()).build());
        }
    }

    public void x(com.iqoption.mobbtech.connect.response.options.c cVar) {
        if ((cVar instanceof Position) && !a.y(cVar.getId())) {
            Position position = (Position) cVar;
            fu(true);
            com.iqoption.mobbtech.connect.request.api.a.b.k(position);
            com.iqoption.gl.c.aIy().startSellPosition(position.getPositionSplitId());
        }
    }
}
