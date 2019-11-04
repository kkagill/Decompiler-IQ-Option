package com.iqoption.portfolio.component.a;

import android.text.style.ForegroundColorSpan;
import com.iqoption.core.util.af;
import com.iqoption.core.util.i;
import com.iqoption.e.sj;
import com.iqoption.e.vz;
import com.iqoption.portfolio.component.m;
import com.iqoption.util.ai;

/* compiled from: PendingInfoBinder */
public class f {
    private final m dLU;
    private final com.iqoption.portfolio.fragment.f dMX;

    public f(com.iqoption.portfolio.fragment.f fVar) {
        this.dMX = fVar;
        this.dLU = fVar.aRX();
    }

    public void a(vz vzVar, com.iqoption.portfolio.component.b.m mVar) {
        vzVar.con.setText(i.ay(mVar.getCreateTime()));
        vzVar.cny.setText(String.format(this.dLU.dMF, new Object[]{this.dLU.dMK.format(mVar.aRD())}));
        vzVar.cag.setText(this.dLU.v(mVar.getInvestment()));
        int multiplier = mVar.getMultiplier();
        if (multiplier > 1) {
            vzVar.cnv.setVisibility(0);
            vzVar.cnu.setText(af.ft(multiplier));
        } else {
            vzVar.cnv.setVisibility(8);
        }
        Double aRq = mVar.aRq();
        if (aRq != null) {
            vzVar.cnA.setVisibility(0);
            vzVar.cpW.setText(a(af.s((double) mVar.n(aRq)), this.dLU.dMT, this.dLU.d(mVar.Jt().getPrecision(), mVar.aRq().doubleValue())));
        } else {
            vzVar.cnA.setVisibility(8);
        }
        aRq = mVar.aRr();
        if (aRq != null) {
            vzVar.cnE.setVisibility(0);
            vzVar.cpX.setText(a(af.s((double) mVar.o(aRq)), this.dLU.dMS, this.dLU.d(mVar.Jt().getPrecision(), aRq.doubleValue())));
        } else {
            vzVar.cnE.setVisibility(8);
        }
        if (this.dMX.h(mVar)) {
            vzVar.cne.setVisibility(8);
            vzVar.cnf.setVisibility(0);
            return;
        }
        vzVar.cne.setVisibility(0);
        vzVar.cnf.setVisibility(8);
    }

    public void b(vz vzVar, com.iqoption.portfolio.component.b.m mVar) {
        Double aRO = mVar.aRO();
        if (aRO != null) {
            vzVar.cnj.setText(this.dLU.d(mVar.Jt().getPrecision(), aRO.doubleValue()));
        } else {
            vzVar.cnj.setText(null);
        }
    }

    public void a(sj sjVar, com.iqoption.portfolio.component.b.m mVar) {
        sjVar.con.setText(i.ay(mVar.getCreateTime()));
        sjVar.cny.setText(String.format(this.dLU.dMF, new Object[]{this.dLU.dMK.format(mVar.aRD())}));
        sjVar.cag.setText(this.dLU.v(mVar.getInvestment()));
        int multiplier = mVar.getMultiplier();
        if (multiplier > 1) {
            sjVar.cnv.setVisibility(0);
            sjVar.cnu.setText(af.ft(multiplier));
        } else {
            sjVar.cnv.setVisibility(8);
        }
        Double aRq = mVar.aRq();
        if (aRq != null) {
            sjVar.cnA.setVisibility(0);
            sjVar.cnB.setText(af.s((double) mVar.n(aRq)));
        } else {
            sjVar.cnA.setVisibility(8);
        }
        aRq = mVar.aRr();
        if (aRq != null) {
            sjVar.cnE.setVisibility(0);
            sjVar.cnF.setText(af.s((double) mVar.o(aRq)));
        } else {
            sjVar.cnE.setVisibility(8);
        }
        if (this.dMX.h(mVar)) {
            sjVar.cne.setVisibility(8);
            sjVar.cnf.setVisibility(0);
            return;
        }
        sjVar.cne.setVisibility(0);
        sjVar.cnf.setVisibility(8);
    }

    public void b(sj sjVar, com.iqoption.portfolio.component.b.m mVar) {
        Double aRO = mVar.aRO();
        if (aRO != null) {
            sjVar.cnj.setText(this.dLU.d(mVar.Jt().getPrecision(), aRO.doubleValue()));
        } else {
            sjVar.cnj.setText(null);
        }
    }

    private static CharSequence a(String str, ForegroundColorSpan foregroundColorSpan, String str2) {
        return new ai().cs(foregroundColorSpan).jP(str).aWX().jP(" ").jP(str2).anA();
    }
}
