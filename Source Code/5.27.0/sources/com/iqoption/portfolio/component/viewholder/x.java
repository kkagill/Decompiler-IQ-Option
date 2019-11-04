package com.iqoption.portfolio.component.viewholder;

import android.view.View;
import com.iqoption.analytics.k;
import com.iqoption.e.rr;
import com.iqoption.portfolio.component.b.m;
import com.iqoption.portfolio.fragment.f;
import com.iqoption.util.v;
import com.iqoption.view.d.b;

/* compiled from: MicroMktOnOpenItemViewHolder */
public class x extends ap implements a {
    private final rr dOq;
    private m dOr;

    public void aRQ() {
    }

    public x(final rr rrVar, f fVar) {
        super(rrVar.getRoot(), fVar);
        this.dOq = rrVar;
        rrVar.cnH.setOnClickListener(new b() {
            public void M(View view) {
                x xVar = x.this;
                k.a(x.this.dOr, xVar.e(xVar.dOr));
            }
        });
        rrVar.coe.cnd.setOnClickListener(new b() {
            public void M(View view) {
                x xVar = x.this;
                if (!xVar.h(xVar.dOr)) {
                    rrVar.coe.cne.setVisibility(8);
                    rrVar.coe.cnf.setVisibility(0);
                    xVar = x.this;
                    v.a(xVar.g(xVar.dOr), new ak(x.this));
                    k.a(x.this.dOr);
                }
            }
        });
        rrVar.coe.cng.setOnClickListener(new b() {
            public void M(View view) {
                x xVar = x.this;
                xVar.i(xVar.dOr);
            }
        });
        rrVar.coe.cnq.setVisibility(8);
        rrVar.coe.cnz.setVisibility(8);
    }

    public void d(m mVar) {
        this.dOr = mVar;
        aRj();
        this.dOq.cof.setText(aRX().c(mVar.aRD(), mVar.adZ()));
        if (f(mVar)) {
            this.dOq.cnJ.setVisibility(0);
            this.dOq.coe.getRoot().setVisibility(0);
            aSb().a(this.dOq.coe, mVar);
        } else {
            this.dOq.cnJ.setVisibility(8);
            this.dOq.coe.getRoot().setVisibility(8);
        }
        this.dOq.cau.setImageDrawable(mVar.isCall() ? aRX().dMl : aRX().dMm);
        this.dOq.bYU.setText(aRX().l(mVar.getInvestment(), mVar.getMultiplier()));
    }

    public void aRW() {
        m mVar = this.dOr;
        if (mVar != null) {
            aRX().a(mVar.Jt(), this.dOq.cog);
        }
    }

    public void aRj() {
        if (this.dOr != null) {
            aSb().b(this.dOq.coe, this.dOr);
        }
    }

    public void aRR() {
        this.dOq.coe.cne.setVisibility(0);
        this.dOq.coe.cnf.setVisibility(8);
    }
}
