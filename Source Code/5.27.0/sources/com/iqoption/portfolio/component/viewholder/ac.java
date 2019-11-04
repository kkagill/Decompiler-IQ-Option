package com.iqoption.portfolio.component.viewholder;

import android.view.View;
import com.iqoption.analytics.k;
import com.iqoption.e.sl;
import com.iqoption.portfolio.component.b.m;
import com.iqoption.portfolio.fragment.f;
import com.iqoption.util.v;
import com.iqoption.view.d.b;

/* compiled from: MicroPendingItemViewHolder */
public final class ac extends ap implements a {
    private final sl dOA;
    private m dOr;

    public void aRQ() {
    }

    public ac(final sl slVar, f fVar) {
        super(slVar.getRoot(), fVar);
        this.dOA = slVar;
        slVar.cnH.setOnClickListener(new b() {
            public void M(View view) {
                ac acVar = ac.this;
                k.a(ac.this.dOr, acVar.e(acVar.dOr));
            }
        });
        slVar.coe.cnd.setOnClickListener(new b() {
            public void M(View view) {
                ac acVar = ac.this;
                if (!acVar.h(acVar.dOr)) {
                    slVar.coe.cne.setVisibility(8);
                    slVar.coe.cnf.setVisibility(0);
                    acVar = ac.this;
                    v.b(acVar.g(acVar.dOr), new ak(ac.this));
                    k.a(ac.this.dOr);
                }
            }
        });
        slVar.coe.cng.setOnClickListener(new b() {
            public void M(View view) {
                ac acVar = ac.this;
                acVar.i(acVar.dOr);
            }
        });
        slVar.coe.cnq.setVisibility(8);
        slVar.coe.cnz.setVisibility(8);
    }

    public void d(m mVar) {
        this.dOr = mVar;
        aRj();
        this.dOA.cof.setText(aRX().c(mVar.aRD(), mVar.adZ()));
        if (f(mVar)) {
            this.dOA.cnJ.setVisibility(0);
            this.dOA.coe.getRoot().setVisibility(0);
            aSb().a(this.dOA.coe, mVar);
        } else {
            this.dOA.cnJ.setVisibility(8);
            this.dOA.coe.getRoot().setVisibility(8);
        }
        this.dOA.cau.setImageDrawable(mVar.isCall() ? aRX().dMl : aRX().dMm);
        this.dOA.coo.setText(aRX().d(mVar.Jt().getPrecision(), mVar.aRN()));
        this.dOA.bYU.setText(aRX().l(mVar.getInvestment(), mVar.getMultiplier()));
    }

    public void aRj() {
        if (this.dOr != null) {
            aSb().b(this.dOA.coe, this.dOr);
        }
    }

    public void aRR() {
        this.dOA.coe.cne.setVisibility(0);
        this.dOA.coe.cnf.setVisibility(8);
    }
}
