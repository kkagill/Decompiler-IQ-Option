package com.iqoption.portfolio.component.viewholder;

import com.iqoption.e.qx;
import com.iqoption.portfolio.component.b.g;
import com.iqoption.portfolio.component.l;

/* compiled from: MicroCfdItemViewHolder */
public final class p extends aj {
    private final qx dNW;
    private g dNw;

    public p(qx qxVar, l lVar) {
        super(qxVar.getRoot(), lVar);
        this.dNW = qxVar;
        AnonymousClass1 anonymousClass1 = new c(lVar, qxVar.cnI.cne, qxVar.cnI.cnf, qxVar.cnI.cno, qxVar.cnI.cnk, false) {
            /* Access modifiers changed, original: 0000 */
            public g aRS() {
                return p.this.dNw;
            }
        };
        qxVar.cnH.setOnClickListener(anonymousClass1);
        qxVar.cnI.getRoot().setOnClickListener(anonymousClass1);
        qxVar.cnI.cnd.setOnClickListener(anonymousClass1);
        qxVar.cnI.cng.setOnClickListener(anonymousClass1);
        qxVar.cnI.cnD.setOnClickListener(anonymousClass1);
        qxVar.cnI.cnp.setOnClickListener(anonymousClass1);
        qxVar.cnI.cno.setOnClickListener(anonymousClass1);
        qxVar.cnI.cnn.setOnClickListener(anonymousClass1);
        qxVar.cnI.cnl.setOnClickListener(anonymousClass1);
        qxVar.cnI.cnk.setOnClickListener(anonymousClass1);
        qxVar.cnI.cnD.setBackground(aRX().aRn());
        qxVar.cnI.cnn.setBackground(aRX().aRn());
        qxVar.cnI.cnz.setVisibility(8);
    }

    public void a(g gVar) {
        this.dNw = gVar;
        aRi();
        if (this.dNo.g(gVar)) {
            this.dNW.cnJ.setVisibility(0);
            this.dNW.cnI.getRoot().setVisibility(0);
            this.dNo.aRY().a(this.dNW.cnI, gVar);
        } else {
            this.dNW.cnJ.setVisibility(8);
            this.dNW.cnI.getRoot().setVisibility(8);
        }
        if (gVar.aRs()) {
            this.dNW.alH.setText(aRX().c(gVar.aRD(), gVar.adZ()));
            this.dNW.cnI.cnx.setVisibility(0);
        } else {
            this.dNW.alH.setText(aRX().d(gVar.aRI(), gVar.getOpenPrice()));
            this.dNW.cnI.cnx.setVisibility(8);
        }
        this.dNW.cau.setImageDrawable(gVar.isCall() ? aRX().dMl : aRX().dMm);
        this.dNW.bZh.setText(aRX().v(gVar.aQA().getInvest()));
    }

    public void aRi() {
        g gVar = this.dNw;
        if (gVar != null) {
            gVar.aQH();
            this.dNo.aSc().a(this.dNW.aoq, this.dNW.alU, this.dNw.aQA());
            if (this.dNo.g(this.dNw)) {
                this.dNo.aRY().b(this.dNW.cnI, this.dNw);
            }
        }
    }
}
