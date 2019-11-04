package com.iqoption.portfolio.component.viewholder;

import android.text.TextUtils;
import android.view.View;
import com.iqoption.analytics.k;
import com.iqoption.core.microservices.tradingengine.response.active.a;
import com.iqoption.e.sn;
import com.iqoption.portfolio.component.b.l;
import com.iqoption.portfolio.component.b.m;
import com.iqoption.portfolio.fragment.f;
import com.iqoption.util.v;
import com.iqoption.view.d.b;

/* compiled from: MicroPendingSingleGroupItemViewHolder */
public final class ae extends ap implements a {
    private final sn dOH;
    private m dOr;
    private l dOx;

    public void aRQ() {
    }

    public ae(final sn snVar, final f fVar) {
        super(snVar.getRoot(), fVar);
        this.dOH = snVar;
        snVar.cnH.setOnClickListener(new b() {
            public void M(View view) {
                ae aeVar = ae.this;
                boolean e = aeVar.e(aeVar.dOr);
                if (e) {
                    fVar.j(ae.this.dOr);
                }
                k.a(ae.this.dOr, e);
            }
        });
        snVar.coe.getRoot().setOnClickListener(new b() {
            public void M(View view) {
                ae aeVar = ae.this;
                aeVar.j(aeVar.dOx.aRL());
            }
        });
        snVar.coe.cnd.setOnClickListener(new b() {
            public void M(View view) {
                ae aeVar = ae.this;
                if (!aeVar.h(aeVar.dOr)) {
                    snVar.coe.cne.setVisibility(8);
                    snVar.coe.cnf.setVisibility(0);
                    aeVar = ae.this;
                    v.a(aeVar.g(aeVar.dOr), new ak(ae.this));
                    k.a(ae.this.dOr);
                }
            }
        });
        snVar.coe.cng.setOnClickListener(new b() {
            public void M(View view) {
                ae aeVar = ae.this;
                aeVar.i(aeVar.dOx.aRL());
            }
        });
    }

    public void a(l lVar) {
        this.dOx = lVar;
        this.dOr = lVar.aRL();
        aRj();
        if (f(this.dOr)) {
            this.dOH.cnJ.setVisibility(0);
            this.dOH.coe.getRoot().setVisibility(0);
            aSb().a(this.dOH.coe, this.dOr);
        } else {
            this.dOH.cnJ.setVisibility(8);
            this.dOH.coe.getRoot().setVisibility(8);
        }
        if (lVar.aRs()) {
            this.dOH.coe.cnz.setVisibility(0);
        } else {
            this.dOH.coe.cnz.setVisibility(8);
        }
        a Jt = lVar.Jt();
        String image = Jt.getImage();
        if (!TextUtils.isEmpty(image)) {
            aSd().d(this.dOH.akZ, image);
        }
        this.dOH.anJ.setText(com.iqoption.util.c.a.C(Jt));
        this.dOH.cau.setImageDrawable(this.dOr.isCall() ? aRX().dMl : aRX().dMm);
        this.dOH.coo.setText(aRX().d(Jt.getPrecision(), this.dOr.aRN()));
        this.dOH.bZk.setText(aRX().c(lVar.aRL()));
        this.dOH.bYU.setText(aRX().l(this.dOr.getInvestment(), this.dOr.getMultiplier()));
    }

    public void aRj() {
        if (this.dOx != null) {
            m mVar = this.dOr;
            if (mVar != null && f(mVar)) {
                aSb().b(this.dOH.coe, this.dOr);
            }
        }
    }

    public void aRR() {
        this.dOH.coe.cne.setVisibility(0);
        this.dOH.coe.cnf.setVisibility(8);
    }
}
