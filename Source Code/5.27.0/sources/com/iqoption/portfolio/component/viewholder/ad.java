package com.iqoption.portfolio.component.viewholder;

import android.text.TextUtils;
import android.view.View;
import com.iqoption.analytics.k;
import com.iqoption.core.microservices.tradingengine.response.active.a;
import com.iqoption.e.rt;
import com.iqoption.portfolio.component.b.l;
import com.iqoption.portfolio.component.b.m;
import com.iqoption.portfolio.fragment.f;
import com.iqoption.util.v;
import com.iqoption.view.d.b;

/* compiled from: MicroPendingMktOnOpenGroupItemViewHolder */
public class ad extends ap implements a {
    private final rt dOD;
    private m dOr;
    private l dOx;

    public void aRQ() {
    }

    public ad(final rt rtVar, final f fVar) {
        super(rtVar.getRoot(), fVar);
        this.dOD = rtVar;
        rtVar.cnH.setOnClickListener(new b() {
            public void M(View view) {
                ad adVar = ad.this;
                boolean e = adVar.e(adVar.dOr);
                if (e) {
                    fVar.j(ad.this.dOr);
                }
                k.a(ad.this.dOr, e);
            }
        });
        rtVar.coe.getRoot().setOnClickListener(new b() {
            public void M(View view) {
                ad adVar = ad.this;
                adVar.j(adVar.dOx.aRL());
            }
        });
        rtVar.coe.cnd.setOnClickListener(new b() {
            public void M(View view) {
                ad adVar = ad.this;
                if (!adVar.h(adVar.dOr)) {
                    rtVar.coe.cne.setVisibility(8);
                    rtVar.coe.cnf.setVisibility(0);
                    adVar = ad.this;
                    v.a(adVar.g(adVar.dOr), new ak(ad.this));
                    k.a(ad.this.dOr);
                }
            }
        });
        rtVar.coe.cng.setOnClickListener(new -$$Lambda$ad$6i5eAuSw7pXK_4bXQIf6RiZXI_A(this));
    }

    private /* synthetic */ void V(View view) {
        i(this.dOx.aRL());
    }

    public void a(l lVar) {
        this.dOx = lVar;
        this.dOr = lVar.aRL();
        aRj();
        if (f(this.dOr)) {
            this.dOD.cnJ.setVisibility(0);
            this.dOD.coe.getRoot().setVisibility(0);
            aSb().a(this.dOD.coe, this.dOr);
        } else {
            this.dOD.cnJ.setVisibility(8);
            this.dOD.coe.getRoot().setVisibility(8);
        }
        if (lVar.aRs()) {
            this.dOD.coe.cnz.setVisibility(0);
        } else {
            this.dOD.coe.cnz.setVisibility(8);
        }
        a Jt = lVar.Jt();
        String image = Jt.getImage();
        if (!TextUtils.isEmpty(image)) {
            aSd().d(this.dOD.akZ, image);
        }
        this.dOD.anJ.setText(com.iqoption.util.c.a.C(Jt));
        this.dOD.cau.setImageDrawable(this.dOr.isCall() ? aRX().dMl : aRX().dMm);
        this.dOD.bZk.setText(aRX().c(lVar.aRL()));
        this.dOD.bYU.setText(aRX().l(this.dOr.getInvestment(), this.dOr.getMultiplier()));
    }

    public void aRj() {
        if (this.dOx != null) {
            m mVar = this.dOr;
            if (mVar != null && f(mVar)) {
                aSb().b(this.dOD.coe, this.dOr);
            }
        }
    }

    public void aRW() {
        m mVar = this.dOr;
        if (mVar != null) {
            aRX().a(mVar.Jt(), this.dOD.cog);
        }
    }

    public void aRR() {
        this.dOD.coe.cne.setVisibility(0);
        this.dOD.coe.cnf.setVisibility(8);
    }
}
