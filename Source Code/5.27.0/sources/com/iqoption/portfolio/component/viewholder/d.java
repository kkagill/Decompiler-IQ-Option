package com.iqoption.portfolio.component.viewholder;

import com.iqoption.e.uh;
import com.iqoption.portfolio.component.b.g;
import com.iqoption.portfolio.component.l;

/* compiled from: CfdItemViewHolder */
public final class d extends aj {
    private final uh dNv;
    private g dNw;

    public d(uh uhVar, l lVar) {
        super(uhVar.getRoot(), lVar);
        this.dNv = uhVar;
        AnonymousClass1 anonymousClass1 = new c(lVar, uhVar.cpY.cne, uhVar.cpY.cnf, uhVar.cpY.cno, uhVar.cpY.cnk, true) {
            /* Access modifiers changed, original: 0000 */
            public g aRS() {
                return d.this.dNw;
            }
        };
        uhVar.cnH.setOnClickListener(anonymousClass1);
        uhVar.cpY.getRoot().setOnClickListener(anonymousClass1);
        uhVar.cpY.cnd.setOnClickListener(anonymousClass1);
        uhVar.cpY.cng.setOnClickListener(anonymousClass1);
        uhVar.cpY.cnD.setOnClickListener(anonymousClass1);
        uhVar.cpY.cnp.setOnClickListener(anonymousClass1);
        uhVar.cpY.cno.setOnClickListener(anonymousClass1);
        uhVar.cpY.cnn.setOnClickListener(anonymousClass1);
        uhVar.cpY.cnl.setOnClickListener(anonymousClass1);
        uhVar.cpY.cnk.setOnClickListener(anonymousClass1);
        uhVar.cpY.cnD.setBackground(aRX().aRn());
        uhVar.cpY.cnn.setBackground(aRX().aRn());
        uhVar.cpY.cnz.setVisibility(8);
    }

    public void a(g gVar) {
        this.dNw = gVar;
        aRi();
        if (this.dNo.g(gVar)) {
            this.dNv.cnJ.setVisibility(0);
            this.dNv.cpY.getRoot().setVisibility(0);
            this.dNo.aRY().a(this.dNv.cpY, gVar);
        } else {
            this.dNv.cnJ.setVisibility(8);
            this.dNv.cpY.getRoot().setVisibility(8);
        }
        if (gVar.aRs()) {
            this.dNv.alH.setText(aRX().c(gVar.aRD(), gVar.adZ()));
            this.dNv.cpY.cnx.setVisibility(0);
        } else {
            this.dNv.alH.setText(aRX().d(gVar.aRI(), gVar.getOpenPrice()));
            this.dNv.cpY.cnx.setVisibility(8);
        }
        this.dNv.cau.setImageDrawable(gVar.isCall() ? aRX().dqh : aRX().dqi);
        this.dNv.bZh.setText(String.format(aRX().dMv, new Object[]{aRX().v(gVar.aQA().getInvest())}));
    }

    public void aRi() {
        g gVar = this.dNw;
        if (gVar != null) {
            gVar.aQH();
            this.dNo.aSc().a(this.dNv.aoq, this.dNv.alU, this.dNw.aQA());
            if (this.dNo.g(this.dNw)) {
                this.dNo.aRY().b(this.dNv.cpY, this.dNw);
            }
        }
    }
}
