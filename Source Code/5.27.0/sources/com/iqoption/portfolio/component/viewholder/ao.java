package com.iqoption.portfolio.component.viewholder;

import android.view.View;
import com.iqoption.analytics.k;
import com.iqoption.e.wb;
import com.iqoption.portfolio.component.b.m;
import com.iqoption.portfolio.fragment.f;
import com.iqoption.util.v;
import com.iqoption.view.d.b;

/* compiled from: PendingItemViewHolder */
public final class ao extends ap implements a {
    private final wb dOV;
    private m dOr;

    public void aRQ() {
    }

    public ao(final wb wbVar, f fVar) {
        super(wbVar.getRoot(), fVar);
        this.dOV = wbVar;
        wbVar.cnH.setOnClickListener(new b() {
            public void M(View view) {
                ao aoVar = ao.this;
                k.b(ao.this.dOr, aoVar.e(aoVar.dOr));
            }
        });
        wbVar.cqb.cnd.setOnClickListener(new b() {
            public void M(View view) {
                ao aoVar = ao.this;
                if (!aoVar.h(aoVar.dOr)) {
                    wbVar.cqb.cne.setVisibility(8);
                    wbVar.cqb.cnf.setVisibility(0);
                    aoVar = ao.this;
                    v.b(aoVar.g(aoVar.dOr), new ak(ao.this));
                    k.b(ao.this.dOr);
                }
            }
        });
        wbVar.cqb.cng.setOnClickListener(new b() {
            public void M(View view) {
                ao aoVar = ao.this;
                aoVar.i(aoVar.dOr);
            }
        });
        wbVar.cqb.cnq.setVisibility(8);
        wbVar.cqb.cnz.setVisibility(8);
    }

    public void d(m mVar) {
        this.dOr = mVar;
        aRj();
        this.dOV.cof.setText(aRX().c(mVar.aRD(), mVar.adZ()));
        if (f(mVar)) {
            this.dOV.cnJ.setVisibility(0);
            this.dOV.cqb.getRoot().setVisibility(0);
            aSb().a(this.dOV.cqb, mVar);
        } else {
            this.dOV.cnJ.setVisibility(8);
            this.dOV.cqb.getRoot().setVisibility(8);
        }
        this.dOV.cau.setImageDrawable(mVar.isCall() ? aRX().dMl : aRX().dMm);
        this.dOV.coo.setText(aRX().d(mVar.Jt().getPrecision(), mVar.aRN()));
        this.dOV.bYU.setText(aRX().l(mVar.getInvestment(), mVar.getMultiplier()));
    }

    public void aRj() {
        if (this.dOr != null) {
            aSb().b(this.dOV.cqb, this.dOr);
        }
    }

    public void aRR() {
        this.dOV.cqb.cne.setVisibility(0);
        this.dOV.cqb.cnf.setVisibility(8);
    }
}
