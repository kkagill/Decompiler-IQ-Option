package com.iqoption.portfolio.component.viewholder;

import com.iqoption.e.uj;
import com.iqoption.portfolio.component.b.g;
import com.iqoption.portfolio.component.b.i;
import com.iqoption.portfolio.component.l;

/* compiled from: CfdSingleGroupViewHolder */
public final class e extends aj {
    private i dNk;
    private final uj dNy;

    public e(uj ujVar, l lVar) {
        super(ujVar.getRoot(), lVar);
        this.dNy = ujVar;
        AnonymousClass1 anonymousClass1 = new c(lVar, ujVar.cpY.cne, ujVar.cpY.cnf, ujVar.cpY.cno, ujVar.cpY.cnk, true) {
            /* Access modifiers changed, original: 0000 */
            public g aRS() {
                return (g) e.this.dNk.aRC();
            }
        };
        ujVar.cnH.setOnClickListener(anonymousClass1);
        ujVar.cpY.getRoot().setOnClickListener(anonymousClass1);
        ujVar.cpY.cnd.setOnClickListener(anonymousClass1);
        ujVar.cpY.cng.setOnClickListener(anonymousClass1);
        ujVar.cpY.cnD.setOnClickListener(anonymousClass1);
        ujVar.cpY.cnp.setOnClickListener(anonymousClass1);
        ujVar.cpY.cno.setOnClickListener(anonymousClass1);
        ujVar.cpY.cnn.setOnClickListener(anonymousClass1);
        ujVar.cpY.cnl.setOnClickListener(anonymousClass1);
        ujVar.cpY.cnk.setOnClickListener(anonymousClass1);
        ujVar.cpY.cnD.setBackground(aRX().aRn());
        ujVar.cpY.cnn.setBackground(aRX().aRn());
    }

    public void a(i iVar) {
        this.dNk = iVar;
        aRi();
        g gVar = (g) iVar.aRC();
        if (this.dNo.g(gVar)) {
            this.dNy.cnJ.setVisibility(0);
            this.dNy.cpY.getRoot().setVisibility(0);
            this.dNo.aRY().a(this.dNy.cpY, gVar);
        } else {
            this.dNy.cnJ.setVisibility(8);
            this.dNy.cpY.getRoot().setVisibility(8);
        }
        if (iVar.aRs()) {
            this.dNy.cpY.cnz.setVisibility(0);
        } else {
            this.dNy.cpY.cnz.setVisibility(8);
        }
        this.dNo.aSd().d(this.dNy.akZ, iVar.aHO());
        this.dNy.alH.setText(iVar.ahP());
        this.dNy.cau.setImageDrawable(iVar.isCall() ? aRX().dqh : aRX().dqi);
        this.dNy.bZk.setText(iVar.aRy());
    }

    public void aRi() {
        if (this.dNk != null) {
            this.dNo.aSc().a(this.dNy.aoq, this.dNy.alU, this.dNk.aQA());
            g gVar = (g) this.dNk.aRC();
            if (this.dNo.g(gVar)) {
                gVar.aQH();
                this.dNo.aRY().b(this.dNy.cpY, gVar);
            }
        }
    }
}
