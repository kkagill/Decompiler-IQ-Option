package com.iqoption.portfolio.component.viewholder;

import android.view.View;
import com.iqoption.analytics.k;
import com.iqoption.e.vh;
import com.iqoption.portfolio.component.b.m;
import com.iqoption.portfolio.fragment.f;
import com.iqoption.util.v;
import com.iqoption.view.d.b;

/* compiled from: MktOnOpenItemViewHolder */
public class af extends ap implements a {
    private final vh dOK;
    private m dOr;

    public void aRQ() {
    }

    public af(final vh vhVar, f fVar) {
        super(vhVar.getRoot(), fVar);
        this.dOK = vhVar;
        vhVar.cnH.setOnClickListener(new b() {
            public void M(View view) {
                af afVar = af.this;
                k.b(af.this.dOr, afVar.e(afVar.dOr));
            }
        });
        vhVar.cqb.cnd.setOnClickListener(new b() {
            public void M(View view) {
                af afVar = af.this;
                if (!afVar.h(afVar.dOr)) {
                    vhVar.cqb.cne.setVisibility(8);
                    vhVar.cqb.cnf.setVisibility(0);
                    afVar = af.this;
                    v.a(afVar.g(afVar.dOr), new ak(af.this));
                    k.b(af.this.dOr);
                }
            }
        });
        vhVar.cqb.cng.setOnClickListener(new b() {
            public void M(View view) {
                af afVar = af.this;
                afVar.i(afVar.dOr);
            }
        });
        vhVar.cqb.cnq.setVisibility(8);
        vhVar.cqb.cnz.setVisibility(8);
    }

    public void d(m mVar) {
        this.dOr = mVar;
        aRj();
        this.dOK.cof.setText(aRX().c(mVar.aRD(), mVar.adZ()));
        if (f(mVar)) {
            this.dOK.cnJ.setVisibility(0);
            this.dOK.cqb.getRoot().setVisibility(0);
            aSb().a(this.dOK.cqb, mVar);
        } else {
            this.dOK.cnJ.setVisibility(8);
            this.dOK.cqb.getRoot().setVisibility(8);
        }
        this.dOK.cau.setImageDrawable(mVar.isCall() ? aRX().dMl : aRX().dMm);
        this.dOK.bYU.setText(aRX().l(mVar.getInvestment(), mVar.getMultiplier()));
    }

    public void aRj() {
        if (this.dOr != null) {
            aSb().b(this.dOK.cqb, this.dOr);
        }
    }

    public void aRW() {
        m mVar = this.dOr;
        if (mVar != null) {
            aRX().a(mVar.Jt(), this.dOK.cog);
        }
    }

    public void aRR() {
        this.dOK.cqb.cne.setVisibility(0);
        this.dOK.cqb.cnf.setVisibility(8);
    }
}
