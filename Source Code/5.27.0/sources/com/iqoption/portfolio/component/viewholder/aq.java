package com.iqoption.portfolio.component.viewholder;

import android.text.TextUtils;
import android.view.View;
import com.iqoption.analytics.k;
import com.iqoption.core.microservices.tradingengine.response.active.a;
import com.iqoption.e.wd;
import com.iqoption.portfolio.component.b.l;
import com.iqoption.portfolio.component.b.m;
import com.iqoption.portfolio.fragment.f;
import com.iqoption.util.v;
import com.iqoption.view.d.b;

/* compiled from: PendingSingleGroupItemViewHolder */
public final class aq extends ap implements a {
    private final wd dOZ;
    private m dOr;
    private l dOx;

    public void aRQ() {
    }

    public aq(final wd wdVar, f fVar) {
        super(wdVar.getRoot(), fVar);
        this.dOZ = wdVar;
        wdVar.cnH.setOnClickListener(new b() {
            public void M(View view) {
                aq aqVar = aq.this;
                k.b(aq.this.dOr, aqVar.e(aqVar.dOr));
            }
        });
        wdVar.cqb.getRoot().setOnClickListener(new b() {
            public void M(View view) {
                aq aqVar = aq.this;
                aqVar.j(aqVar.dOx.aRL());
            }
        });
        wdVar.cqb.cnd.setOnClickListener(new b() {
            public void M(View view) {
                aq aqVar = aq.this;
                if (!aqVar.h(aqVar.dOr)) {
                    wdVar.cqb.cne.setVisibility(8);
                    wdVar.cqb.cnf.setVisibility(0);
                    aqVar = aq.this;
                    v.a(aqVar.g(aqVar.dOr), new ak(aq.this));
                    k.b(aq.this.dOr);
                }
            }
        });
        wdVar.cqb.cng.setOnClickListener(new b() {
            public void M(View view) {
                aq aqVar = aq.this;
                aqVar.i(aqVar.dOx.aRL());
            }
        });
        wdVar.cqb.cnz.setVisibility(8);
    }

    public void a(l lVar) {
        this.dOx = lVar;
        this.dOr = lVar.aRL();
        aRj();
        if (f(this.dOr)) {
            this.dOZ.cnJ.setVisibility(0);
            this.dOZ.cqb.getRoot().setVisibility(0);
            aSb().a(this.dOZ.cqb, this.dOr);
        } else {
            this.dOZ.cnJ.setVisibility(8);
            this.dOZ.cqb.getRoot().setVisibility(8);
        }
        a Jt = lVar.Jt();
        if (!this.dOr.aRs()) {
            this.dOZ.bZk.setText(aRX().c(this.dOr));
            this.dOZ.cof.setText(null);
        } else if (this.dOr.isCall()) {
            this.dOZ.bZk.setText(String.format(aRX().dMt, new Object[]{com.iqoption.util.c.a.ai(Jt)}));
            this.dOZ.cof.setText(String.format(aRX().dMF, new Object[]{aRX().c(this.dOr.aRD(), this.dOr.adZ())}));
        } else {
            this.dOZ.bZk.setText(com.iqoption.util.c.a.ai(Jt));
            this.dOZ.cof.setText(null);
        }
        String image = Jt.getImage();
        if (!TextUtils.isEmpty(image)) {
            aSd().d(this.dOZ.akZ, image);
        }
        this.dOZ.anJ.setText(com.iqoption.util.c.a.C(Jt));
        this.dOZ.cau.setImageDrawable(this.dOr.isCall() ? aRX().dMl : aRX().dMm);
        this.dOZ.coo.setText(aRX().d(Jt.getPrecision(), this.dOr.aRN()));
        this.dOZ.bYU.setText(aRX().l(this.dOr.getInvestment(), this.dOr.getMultiplier()));
    }

    public void aRj() {
        if (this.dOx != null) {
            m mVar = this.dOr;
            if (mVar != null && f(mVar)) {
                aSb().b(this.dOZ.cqb, this.dOr);
            }
        }
    }

    public void aRR() {
        this.dOZ.cqb.cne.setVisibility(0);
        this.dOZ.cqb.cnf.setVisibility(8);
    }
}
