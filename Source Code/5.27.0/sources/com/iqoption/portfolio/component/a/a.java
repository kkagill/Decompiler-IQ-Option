package com.iqoption.portfolio.component.a;

import android.text.style.ForegroundColorSpan;
import android.widget.TextView;
import com.iqoption.core.util.af;
import com.iqoption.portfolio.component.l;
import com.iqoption.portfolio.component.m;
import com.iqoption.util.ai;

/* compiled from: CalculationBinder */
public class a {
    private final m dLU;

    public a(l lVar) {
        this.dLU = lVar.aRX();
    }

    public void a(TextView textView, TextView textView2, com.iqoption.portfolio.a aVar) {
        textView.setText(this.dLU.v(aVar.getValue()));
        if (aVar.aQq()) {
            textView2.setText(String.format(this.dLU.dMH, new Object[]{af.hu(this.dLU.v(aVar.getSellPnl())), af.s(aVar.aQp())}));
            textView2.setTextColor(this.dLU.amj);
        } else if (aVar.aQr()) {
            textView2.setText(String.format(this.dLU.dMH, new Object[]{af.hv(this.dLU.v(Math.abs(aVar.getSellPnl()))), af.s(Math.abs(aVar.aQp()))}));
            textView2.setTextColor(this.dLU.amk);
        } else {
            textView2.setText(null);
        }
    }

    public void b(TextView textView, TextView textView2, com.iqoption.portfolio.a aVar) {
        textView.setTextColor(this.dLU.aml);
        if (aVar.aQq()) {
            textView.setText(af.hu(this.dLU.v(aVar.getSellPnl())));
            textView2.setTextColor(this.dLU.amj);
            textView2.setText(af.d(Double.valueOf(aVar.aQp())));
        } else if (aVar.aQr()) {
            textView.setText(af.hv(this.dLU.v(Math.abs(aVar.getSellPnl()))));
            textView2.setTextColor(this.dLU.amk);
            textView2.setText(af.e(Double.valueOf(Math.abs(aVar.aQp()))));
        } else {
            textView.setText(null);
            textView2.setText(null);
        }
    }

    public void a(TextView textView, com.iqoption.portfolio.a aVar) {
        if (aVar.aQq()) {
            textView.setText(a(af.hu(this.dLU.v(aVar.getSellPnl())), af.d(Double.valueOf(aVar.aQp())), this.dLU.dMS));
        } else if (aVar.aQr()) {
            textView.setText(a(af.hv(this.dLU.v(Math.abs(aVar.getSellPnl()))), af.e(Double.valueOf(Math.abs(aVar.aQp()))), this.dLU.dMT));
        } else {
            textView.setText(this.dLU.v(0.0d));
        }
    }

    public void b(TextView textView, com.iqoption.portfolio.a aVar) {
        String v = this.dLU.v(aVar.getValue());
        if (aVar.aQq()) {
            textView.setText(a(v, af.d(Double.valueOf(aVar.aQp())), this.dLU.dMS));
        } else if (aVar.aQr()) {
            textView.setText(a(v, af.e(Double.valueOf(Math.abs(aVar.aQp()))), this.dLU.dMT));
        } else {
            textView.setText(v);
        }
    }

    public void c(TextView textView, com.iqoption.portfolio.a aVar) {
        if (aVar.aQt()) {
            textView.setText(af.hu(this.dLU.v(aVar.getExpPnl())));
        } else if (aVar.aQu()) {
            textView.setText(af.hv(this.dLU.v(Math.abs(aVar.getExpPnl()))));
        } else {
            textView.setText(null);
        }
    }

    private static CharSequence a(String str, String str2, ForegroundColorSpan foregroundColorSpan) {
        return new ai().jP(str).jP(" ").cs(foregroundColorSpan).jP(str2).anA();
    }
}
