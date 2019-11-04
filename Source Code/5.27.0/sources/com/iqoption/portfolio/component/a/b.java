package com.iqoption.portfolio.component.a;

import android.text.style.ForegroundColorSpan;
import android.widget.FrameLayout;
import com.iqoption.core.util.af;
import com.iqoption.core.util.i;
import com.iqoption.e.qv;
import com.iqoption.e.uf;
import com.iqoption.portfolio.component.b.g;
import com.iqoption.portfolio.component.l;
import com.iqoption.portfolio.component.m;
import com.iqoption.util.ai;

/* compiled from: CfdInfoBinder */
public class b {
    private final l dLR;
    private final m dLU;

    public b(l lVar) {
        this.dLR = lVar;
        this.dLU = lVar.aRX();
    }

    public void a(uf ufVar, g gVar) {
        double invest = gVar.aQA().getInvest();
        ufVar.cnw.setText(this.dLU.d(gVar.aRI(), gVar.getOpenPrice()));
        ufVar.cpV.setText(i.ay(gVar.abl()));
        ufVar.cny.setText(this.dLU.dMK.format(gVar.aRD()));
        ufVar.cag.setText(this.dLU.v(invest));
        Double aRr = gVar.aRr();
        int i = 0;
        if (aRr != null) {
            int o = gVar.o(aRr);
            ufVar.cnE.setVisibility(0);
            ufVar.cpX.setText(a(af.s((double) o), this.dLU.dMS, this.dLU.d(gVar.aRI(), aRr.doubleValue())));
        } else {
            ufVar.cnE.setVisibility(8);
        }
        aRr = gVar.aRq();
        if (aRr != null) {
            int n = gVar.n(aRr);
            ufVar.cnA.setVisibility(0);
            ufVar.cpW.setText(a(af.s((double) n), this.dLU.dMT, this.dLU.d(gVar.aRI(), gVar.aRq().doubleValue())));
        } else {
            ufVar.cnA.setVisibility(8);
        }
        ufVar.cpU.setText(a(af.s((double) gVar.N(invest)), this.dLU.dMT, this.dLU.v(invest + gVar.getSelfMarginCall())));
        if (this.dLR.e(gVar)) {
            ufVar.cne.setVisibility(8);
            ufVar.cnf.setVisibility(0);
        } else {
            ufVar.cne.setVisibility(0);
            ufVar.cnf.setVisibility(8);
        }
        Double commission = gVar.getCommission();
        if (commission == null) {
            ufVar.cnh.setVisibility(8);
        } else {
            ufVar.cnh.setVisibility(0);
            ufVar.cni.setText(this.dLU.v(commission.doubleValue()));
        }
        commission = gVar.getSwap();
        if (commission == null) {
            ufVar.cno.setVisibility(8);
            ufVar.cnC.setVisibility(8);
        } else {
            ufVar.cno.setVisibility(0);
            ufVar.cnC.setVisibility(0);
            ufVar.cnD.setText(this.dLU.M(commission.doubleValue()));
        }
        if (gVar.aRv()) {
            ufVar.cnm.setVisibility(0);
            ufVar.cnn.setText(this.dLU.v(gVar.aRt()));
        } else {
            ufVar.cnm.setVisibility(8);
        }
        FrameLayout frameLayout = ufVar.cnd;
        if (!gVar.aRu()) {
            i = 8;
        }
        frameLayout.setVisibility(i);
    }

    private CharSequence a(String str, ForegroundColorSpan foregroundColorSpan, String str2) {
        return new ai().cs(foregroundColorSpan).jP(str).aWX().jP(" ").jP(str2).anA();
    }

    public void b(uf ufVar, g gVar) {
        ufVar.cnj.setText(this.dLU.gT(gVar.aRI()).format(gVar.aRH()));
        ufVar.cnd.setVisibility(gVar.aRu() ? 0 : 8);
    }

    public void a(qv qvVar, g gVar) {
        double invest = gVar.aQA().getInvest();
        qvVar.cnw.setText(this.dLU.d(gVar.aRI(), gVar.getOpenPrice()));
        qvVar.cny.setText(this.dLU.dMK.format(gVar.aRD()));
        qvVar.cag.setText(this.dLU.v(invest));
        int multiplier = gVar.getMultiplier();
        int i = 0;
        if (multiplier > 1) {
            qvVar.cnv.setVisibility(0);
            qvVar.cnu.setText(af.ft(multiplier));
        } else {
            qvVar.cnv.setVisibility(8);
        }
        Double aRr = gVar.aRr();
        if (aRr != null) {
            multiplier = gVar.o(aRr);
            qvVar.cnE.setVisibility(0);
            qvVar.cnF.setText(af.s((double) multiplier));
        } else {
            qvVar.cnE.setVisibility(8);
        }
        aRr = gVar.aRq();
        if (aRr != null) {
            multiplier = gVar.n(aRr);
            qvVar.cnA.setVisibility(0);
            qvVar.cnB.setText(af.s((double) multiplier));
        } else {
            qvVar.cnA.setVisibility(8);
        }
        qvVar.cns.setText(af.s((double) gVar.N(invest)));
        if (this.dLR.e(gVar)) {
            qvVar.cne.setVisibility(8);
            qvVar.cnf.setVisibility(0);
        } else {
            qvVar.cne.setVisibility(0);
            qvVar.cnf.setVisibility(8);
        }
        Double commission = gVar.getCommission();
        if (commission == null) {
            qvVar.cnh.setVisibility(8);
        } else {
            qvVar.cnh.setVisibility(0);
            qvVar.cni.setText(this.dLU.v(commission.doubleValue()));
        }
        commission = gVar.getSwap();
        if (commission == null) {
            qvVar.cno.setVisibility(8);
            qvVar.cnC.setVisibility(8);
        } else {
            qvVar.cno.setVisibility(0);
            qvVar.cnC.setVisibility(0);
            qvVar.cnD.setText(this.dLU.M(commission.doubleValue()));
        }
        if (gVar.aRv()) {
            qvVar.cnm.setVisibility(0);
            qvVar.cnn.setText(this.dLU.v(gVar.aRt()));
        } else {
            qvVar.cnm.setVisibility(8);
        }
        FrameLayout frameLayout = qvVar.cnd;
        if (!gVar.aRu()) {
            i = 8;
        }
        frameLayout.setVisibility(i);
    }

    public void b(qv qvVar, g gVar) {
        qvVar.cnj.setText(this.dLU.gT(gVar.aRI()).format(gVar.aRH()));
        qvVar.cnd.setVisibility(gVar.aRu() ? 0 : 8);
    }
}
