package com.iqoption.portfolio.component.viewholder;

import android.text.TextUtils;
import android.view.View;
import com.iqoption.analytics.k;
import com.iqoption.core.microservices.tradingengine.response.active.a;
import com.iqoption.e.vj;
import com.iqoption.portfolio.component.b.l;
import com.iqoption.portfolio.component.b.m;
import com.iqoption.portfolio.fragment.f;
import com.iqoption.util.v;
import com.iqoption.view.d.b;

/* compiled from: MktOnOpenSingleGroupItemViewHolder */
public class ag extends ap implements a {
    private final vj dON;
    private m dOr;
    private l dOx;

    public void aRQ() {
    }

    public ag(final vj vjVar, f fVar) {
        super(vjVar.getRoot(), fVar);
        this.dON = vjVar;
        vjVar.cnH.setOnClickListener(new b() {
            public void M(View view) {
                ag agVar = ag.this;
                k.b(ag.this.dOr, agVar.e(agVar.dOr));
            }
        });
        vjVar.cqb.getRoot().setOnClickListener(new b() {
            public void M(View view) {
                ag agVar = ag.this;
                agVar.j(agVar.dOx.aRL());
            }
        });
        vjVar.cqb.cnd.setOnClickListener(new b() {
            public void M(View view) {
                ag agVar = ag.this;
                if (!agVar.h(agVar.dOr)) {
                    vjVar.cqb.cne.setVisibility(8);
                    vjVar.cqb.cnf.setVisibility(0);
                    agVar = ag.this;
                    v.b(agVar.g(agVar.dOr), new ak(ag.this));
                    k.b(ag.this.dOr);
                }
            }
        });
        vjVar.cqb.cng.setOnClickListener(new -$$Lambda$ag$jPX1ntEwRkOD3vgCBV2UWiSMFHE(this));
        vjVar.cqb.cnz.setVisibility(8);
    }

    private /* synthetic */ void V(View view) {
        i(this.dOx.aRL());
    }

    public void a(l lVar) {
        this.dOx = lVar;
        this.dOr = lVar.aRL();
        aRj();
        if (f(this.dOr)) {
            this.dON.cnJ.setVisibility(0);
            this.dON.cqb.getRoot().setVisibility(0);
            aSb().a(this.dON.cqb, this.dOr);
        } else {
            this.dON.cnJ.setVisibility(8);
            this.dON.cqb.getRoot().setVisibility(8);
        }
        a Jt = lVar.Jt();
        String image = Jt.getImage();
        if (!TextUtils.isEmpty(image)) {
            aSd().d(this.dON.akZ, image);
        }
        this.dON.bZk.setText(aRX().c(this.dOr));
        this.dON.anJ.setText(com.iqoption.util.c.a.C(Jt));
        this.dON.cau.setImageDrawable(this.dOr.isCall() ? aRX().dMl : aRX().dMm);
        this.dON.bYU.setText(aRX().l(this.dOr.getInvestment(), this.dOr.getMultiplier()));
    }

    public void aRj() {
        if (this.dOx != null) {
            m mVar = this.dOr;
            if (mVar != null && f(mVar)) {
                aSb().b(this.dON.cqb, this.dOr);
            }
        }
    }

    public void aRW() {
        m mVar = this.dOr;
        if (mVar != null) {
            aRX().a(mVar.Jt(), this.dON.cog);
        }
    }

    public void aRR() {
        this.dON.cqb.cne.setVisibility(0);
        this.dON.cqb.cnf.setVisibility(8);
    }
}
