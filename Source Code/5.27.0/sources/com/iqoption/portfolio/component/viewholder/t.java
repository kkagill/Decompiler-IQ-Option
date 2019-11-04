package com.iqoption.portfolio.component.viewholder;

import android.view.View;
import com.google.common.util.concurrent.o;
import com.iqoption.analytics.k;
import com.iqoption.e.rl;
import com.iqoption.portfolio.component.b.h;
import com.iqoption.portfolio.component.b.j;
import com.iqoption.portfolio.component.l;
import com.iqoption.portfolio.component.m;
import com.iqoption.util.v;
import com.iqoption.view.d.b;

/* compiled from: MicroExpItemViewHolder */
public final class t extends aj {
    private m dLU;
    private h dNH;
    private final rl dOe;

    public t(final rl rlVar, final l lVar) {
        super(rlVar.getRoot(), lVar);
        this.dOe = rlVar;
        this.dLU = lVar.aRX();
        rlVar.cnH.setOnClickListener(new b() {
            public void M(View view) {
                boolean h = lVar.h(t.this.dNH);
                k.a(t.this.dNH, h);
                if (h) {
                    lVar.d((j) t.this.dNH);
                }
            }
        });
        rlVar.cnW.cnP.setOnClickListener(new b() {
            public void M(View view) {
                lVar.d((j) t.this.dNH);
            }
        });
        rlVar.cnW.cnK.setOnClickListener(new b() {
            public void M(View view) {
                if (!lVar.e(t.this.dNH)) {
                    rlVar.cnW.cnL.setVisibility(8);
                    rlVar.cnW.cnM.setVisibility(0);
                    v.b(lVar.f(t.this.dNH), new o<Object>() {
                        public void onSuccess(Object obj) {
                        }

                        public void l(Throwable th) {
                            rlVar.cnW.cnL.setVisibility(0);
                            rlVar.cnW.cnM.setVisibility(8);
                        }
                    });
                    k.b(t.this.dNH);
                }
            }
        });
        rlVar.cnW.cnN.setVisibility(8);
        rlVar.cnW.cnq.setVisibility(8);
    }

    public void a(h hVar) {
        this.dNH = hVar;
        aRi();
        if (this.dNo.g(hVar)) {
            this.dOe.cnJ.setVisibility(0);
            this.dOe.cnW.getRoot().setVisibility(0);
            this.dNo.aSa().a(this.dOe.cnW, hVar);
        } else {
            this.dOe.cnJ.setVisibility(8);
            this.dOe.cnW.getRoot().setVisibility(8);
        }
        this.dOe.alH.setText(aRX().d(hVar.aRI(), hVar.getOpenPrice()));
        this.dOe.cau.setImageDrawable(hVar.isCall() ? aRX().dMl : aRX().dMm);
        this.dOe.bZh.setText(aRX().v(hVar.aQA().getInvest()));
    }

    private void aRT() {
        h hVar = this.dNH;
        if (hVar != null) {
            long aim = hVar.aim();
            this.dOe.bXq.h(Math.max(0, aim - com.iqoption.app.managers.l.HZ().Ib()), aim - this.dNH.abl());
        }
    }

    public void aRi() {
        h hVar = this.dNH;
        if (hVar != null) {
            hVar.aQH();
            this.dNo.aSc().a(this.dOe.aoq, this.dOe.alU, this.dNH.aQA());
            if (this.dNo.g(this.dNH)) {
                this.dNo.aSa().b(this.dOe.cnW, this.dNH);
            }
            aRT();
        }
    }
}
