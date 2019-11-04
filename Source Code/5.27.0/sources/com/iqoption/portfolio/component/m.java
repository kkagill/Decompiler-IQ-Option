package com.iqoption.portfolio.component;

import android.content.Context;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.drawable.Drawable;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.content.ContextCompat;
import com.iqoption.app.IQApp;
import com.iqoption.app.b;
import com.iqoption.app.managers.l;
import com.iqoption.core.util.TimeUtil;
import com.iqoption.core.util.af;
import com.iqoption.core.util.i;
import com.iqoption.core.util.j;
import com.iqoption.dto.Currencies;
import com.iqoption.dto.entity.position.Order;
import com.iqoption.util.ai;
import com.iqoption.util.c.a;
import com.iqoption.x.R;
import java.text.DateFormat;
import java.text.DecimalFormat;

/* compiled from: UIConfig */
public final class m {
    private int akR;
    @ColorInt
    public final int amj;
    @ColorInt
    public final int amk;
    @ColorInt
    public final int aml;
    private String cHM;
    @ColorInt
    public final int cJl;
    private final String cSP;
    private final DecimalFormat cXm;
    public final String dMA;
    public final String dMB;
    public final String dMC;
    public final String dMD;
    public final String dME;
    public final String dMF;
    public final String dMG;
    public final String dMH;
    public final String dMI;
    public final String dMJ;
    public final DecimalFormat dMK;
    public final float dML;
    private final DateFormat dMM;
    private final DateFormat dMN;
    private final DateFormat dMO;
    private final DateFormat dMP;
    private final DateFormat dMQ;
    private final String dMR;
    public ForegroundColorSpan dMS;
    public ForegroundColorSpan dMT;
    public ForegroundColorSpan dMU;
    private DecimalFormat dMV;
    @ColorInt
    public final int dMk;
    public final Drawable dMl;
    public final Drawable dMm;
    private final Paint dMn;
    public final String dMo = Currencies.REPLACE_CURRENCY_MASK;
    public final String dMp;
    public final String dMq;
    public final String dMr;
    public final String dMs;
    public final String dMt;
    public final String dMu;
    public final String dMv;
    public final String dMw;
    public final String dMx;
    public final String dMy;
    public final String dMz;
    private String deo;
    public final String dgF;
    public final Drawable dqh;
    public final Drawable dqi;
    public final LayoutInflater layoutInflater;

    public m(Context context) {
        aRm();
        this.layoutInflater = LayoutInflater.from(context);
        this.amj = ContextCompat.getColor(context, R.color.green);
        this.amk = ContextCompat.getColor(context, R.color.red);
        this.cJl = ContextCompat.getColor(context, R.color.grey_blur);
        this.dMk = ContextCompat.getColor(context, R.color.grey_blur_50);
        this.aml = ContextCompat.getColor(context, R.color.white);
        this.dqh = AppCompatResources.getDrawable(context, R.drawable.ic_indicator_call_10dp);
        this.dqi = AppCompatResources.getDrawable(context, R.drawable.ic_indicator_put_10dp);
        this.dMl = AppCompatResources.getDrawable(context, R.drawable.ic_indicator_call_10dp);
        this.dMm = AppCompatResources.getDrawable(context, R.drawable.ic_indicator_put_10dp);
        String str = "%s %%s";
        this.dMp = String.format(str, new Object[]{context.getString(R.string.value1)});
        String str2 = "%s: %%s";
        this.dMq = String.format(str2, new Object[]{context.getString(R.string.total_value)});
        this.dMr = String.format(str2, new Object[]{context.getString(R.string.total_investment)});
        this.dMs = String.format(str2, new Object[]{context.getString(R.string.amount_to_be_invested)});
        this.dMx = String.format(str2, new Object[]{context.getString(R.string.expiration_time)});
        this.dMv = String.format(str, new Object[]{context.getString(R.string.invested)});
        this.dMt = "%s, ";
        this.dMu = "%s ";
        this.dMw = "(%s)";
        this.dMy = String.format(str, new Object[]{context.getString(R.string.sell)});
        this.dMz = String.format("%s %%d", new Object[]{context.getString(R.string.cancel)});
        str2 = "%s (%%s)";
        this.dMA = String.format(str2, new Object[]{context.getString(R.string.opened)});
        this.dMB = String.format(str2, new Object[]{context.getString(R.string.pending)});
        this.dMC = "%s (%d)";
        this.dMD = String.format(str, new Object[]{context.getString(R.string.quantity_acronym)});
        this.dgF = context.getString(R.string.n_a);
        this.dME = "%s %s";
        this.dMF = "~ %s";
        this.dMG = "%s: ";
        this.dMH = "%s (%s)";
        this.dMM = TimeUtil.bRH;
        this.dMN = TimeUtil.bRI;
        this.dMO = TimeUtil.bRt;
        this.dMP = TimeUtil.bRq;
        this.dMQ = TimeUtil.bRy;
        this.cSP = context.getString(R.string.today);
        this.dMR = context.getString(R.string.yesterday);
        this.dMK = j.fq(6);
        this.cXm = com.iqoption.util.j.aWK();
        this.dMI = context.getString(R.string.call);
        this.dMJ = context.getString(R.string.put);
        this.dMS = new ForegroundColorSpan(this.amj);
        this.dMT = new ForegroundColorSpan(this.amk);
        this.dMU = new ForegroundColorSpan(this.cJl);
        this.dML = (float) context.getResources().getDimensionPixelSize(R.dimen.sp14);
        float dimension = context.getResources().getDimension(R.dimen.dp1);
        this.dMn = new Paint(1);
        this.dMn.setStyle(Style.STROKE);
        this.dMn.setStrokeCap(Cap.ROUND);
        this.dMn.setStrokeJoin(Join.ROUND);
        this.dMn.setStrokeWidth(dimension);
        this.dMn.setPathEffect(new DashPathEffect(new float[]{2.0f * dimension, dimension * 3.0f}, 0.0f));
        this.dMn.setColor(this.aml);
    }

    public DecimalFormat gT(int i) {
        gU(i);
        return this.dMV;
    }

    private void gU(int i) {
        if (this.dMV == null || this.akR != i) {
            this.akR = i;
            StringBuilder stringBuilder = new StringBuilder("0.");
            for (int i2 = 0; i2 < i; i2++) {
                stringBuilder.append("0");
            }
            DecimalFormat decimalFormat = this.dMV;
            if (decimalFormat == null) {
                this.dMV = new DecimalFormat(stringBuilder.toString());
            } else {
                decimalFormat.applyPattern(stringBuilder.toString());
            }
        }
    }

    public String M(double d) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(d < 0.0d ? "+" : "-");
        stringBuilder.append(this.cHM);
        return com.iqoption.util.j.d(stringBuilder.toString(), Double.valueOf(Math.abs(d)));
    }

    public String v(double d) {
        return com.iqoption.util.j.d(this.cHM, Double.valueOf(d));
    }

    public String d(int i, double d) {
        return gT(i).format(d);
    }

    public String bC(long j) {
        if (i.aP(j)) {
            return this.cSP;
        }
        if (i.aA(j)) {
            return this.dMR;
        }
        return this.dMQ.format(Long.valueOf(j));
    }

    public CharSequence c(double d, String str) {
        if (str != null) {
            return new ai().jP(this.dMK.format(d)).jP(" ").cs(this.dMU).jP(str).anA();
        }
        return this.dMK.format(d);
    }

    public void aRm() {
        b DG = b.DG();
        this.cHM = DG.DO();
        this.deo = com.iqoption.util.j.c(DG.du(Currencies.OTN_CURRENCY));
    }

    public String c(com.iqoption.portfolio.component.b.m mVar) {
        String ai = a.ai(mVar.Jt());
        if (!Order.ON_MKT_OPEN.equals(mVar.aRP().getType())) {
            return ai;
        }
        return IQApp.Eu().getString(R.string.portfolio_mkt_on_open_n1, new Object[]{ai});
    }

    public void a(com.iqoption.core.microservices.tradingengine.response.active.a aVar, TextView textView) {
        long Ib = l.HZ().Ib();
        long aY = aVar.aY(Ib);
        if (aY == Long.MAX_VALUE) {
            textView.setText(R.string.not_available);
        } else if (aVar.aX(Ib)) {
            textView.setText("");
        } else {
            textView.setText(TimeUtil.s(Ib, aY));
        }
    }

    public String l(double d, int i) {
        if (i == 1) {
            return v(d);
        }
        return String.format(this.dME, new Object[]{v(d), af.ft(i)});
    }

    public Drawable aRn() {
        return new com.iqoption.view.drawable.a(this.dMn);
    }

    public String a(double d, boolean z, int i) {
        if (z) {
            return d(i, d);
        }
        return v(d);
    }
}
