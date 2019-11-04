package com.iqoption.portfolio.component.viewholder;

import com.iqoption.e.qz;
import com.iqoption.portfolio.component.b.g;
import com.iqoption.portfolio.component.b.i;
import com.iqoption.portfolio.component.l;

/* compiled from: MicroCfdSingleGroupViewHolder */
public final class q extends aj {
    private final qz dNY;
    private i dNk;

    public q(qz qzVar, l lVar) {
        super(qzVar.getRoot(), lVar);
        this.dNY = qzVar;
        AnonymousClass1 anonymousClass1 = new c(lVar, qzVar.cnI.cne, qzVar.cnI.cnf, qzVar.cnI.cno, qzVar.cnI.cnk, false) {
            /* Access modifiers changed, original: 0000 */
            public g aRS() {
                return (g) q.this.dNk.aRC();
            }
        };
        qzVar.cnH.setOnClickListener(anonymousClass1);
        qzVar.cnI.getRoot().setOnClickListener(anonymousClass1);
        qzVar.cnI.cnd.setOnClickListener(anonymousClass1);
        qzVar.cnI.cng.setOnClickListener(anonymousClass1);
        qzVar.cnI.cnD.setOnClickListener(anonymousClass1);
        qzVar.cnI.cnp.setOnClickListener(anonymousClass1);
        qzVar.cnI.cno.setOnClickListener(anonymousClass1);
        qzVar.cnI.cnn.setOnClickListener(anonymousClass1);
        qzVar.cnI.cnl.setOnClickListener(anonymousClass1);
        qzVar.cnI.cnk.setOnClickListener(anonymousClass1);
        qzVar.cnI.cnD.setBackground(aRX().aRn());
        qzVar.cnI.cnn.setBackground(aRX().aRn());
    }

    public void a(i iVar) {
        this.dNk = iVar;
        aRi();
        g gVar = (g) iVar.aRC();
        if (this.dNo.g(gVar)) {
            this.dNY.cnJ.setVisibility(0);
            this.dNY.cnI.getRoot().setVisibility(0);
            this.dNo.aRY().a(this.dNY.cnI, gVar);
        } else {
            this.dNY.cnJ.setVisibility(8);
            this.dNY.cnI.getRoot().setVisibility(8);
        }
        if (iVar.aRs()) {
            this.dNY.cnI.cnz.setVisibility(0);
        } else {
            this.dNY.cnI.cnz.setVisibility(8);
        }
        this.dNo.aSd().d(this.dNY.akZ, iVar.aHO());
        this.dNY.anJ.setText(iVar.aRx());
        this.dNY.cau.setImageDrawable(iVar.isCall() ? aRX().dMl : aRX().dMm);
        this.dNY.bZk.setText(iVar.aRy());
    }

    public void aRi() {
        if (this.dNk != null) {
            this.dNo.aSc().a(this.dNY.aoq, this.dNY.alU, this.dNk.aQA());
            g gVar = (g) this.dNk.aRC();
            if (this.dNo.g(gVar)) {
                gVar.aQH();
                this.dNo.aRY().b(this.dNY.cnI, gVar);
            }
        }
    }
}
