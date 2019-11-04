package com.iqoption.portfolio.component.viewholder;

import android.view.View;
import com.google.common.util.concurrent.o;
import com.iqoption.analytics.k;
import com.iqoption.e.uv;
import com.iqoption.portfolio.component.b.h;
import com.iqoption.portfolio.component.l;
import com.iqoption.util.v;
import com.iqoption.view.d.b;

/* compiled from: ExpItemViewHolder */
public final class j extends aj {
    private final uv dNG;
    private h dNH;

    public j(final uv uvVar, final l lVar) {
        super(uvVar.getRoot(), lVar);
        this.dNG = uvVar;
        uvVar.cqa.cnN.setVisibility(8);
        uvVar.cnH.setOnClickListener(new b() {
            public void M(View view) {
                k.a(j.this.dNH, lVar.h(j.this.dNH));
            }
        });
        uvVar.cqa.getRoot().setOnClickListener(new b() {
            public void M(View view) {
                lVar.d((com.iqoption.portfolio.component.b.j) j.this.dNH);
            }
        });
        uvVar.cqa.cnK.setOnClickListener(new b() {
            public void M(View view) {
                if (!lVar.e(j.this.dNH)) {
                    uvVar.cqa.cnL.setVisibility(8);
                    uvVar.cqa.cnM.setVisibility(0);
                    v.b(lVar.f(j.this.dNH), new o<Object>() {
                        public void onSuccess(Object obj) {
                        }

                        public void l(Throwable th) {
                            uvVar.cqa.cnL.setVisibility(0);
                            uvVar.cqa.cnM.setVisibility(8);
                        }
                    });
                    k.b(j.this.dNH);
                }
            }
        });
        uvVar.bXq.setTextSize(aRX().dML);
    }

    public void a(h hVar) {
        this.dNH = hVar;
        aRi();
        if (this.dNo.g(hVar)) {
            this.dNG.cnJ.setVisibility(0);
            this.dNG.cqa.getRoot().setVisibility(0);
            this.dNo.aSa().a(this.dNG.cqa, hVar);
        } else {
            this.dNG.cnJ.setVisibility(8);
            this.dNG.cqa.getRoot().setVisibility(8);
        }
        this.dNG.alH.setText(aRX().d(hVar.aRI(), hVar.getOpenPrice()));
        this.dNG.cau.setImageDrawable(hVar.isCall() ? aRX().dqh : aRX().dqi);
        this.dNG.bZh.setText(String.format(aRX().dMv, new Object[]{aRX().v(hVar.aQA().getInvest())}));
    }

    private void aRT() {
        h hVar = this.dNH;
        if (hVar != null) {
            long aim = hVar.aim();
            this.dNG.bXq.h(Math.max(0, aim - com.iqoption.app.managers.l.HZ().Ib()), aim - this.dNH.abl());
        }
    }

    public void aRi() {
        h hVar = this.dNH;
        if (hVar != null) {
            hVar.aQH();
            this.dNo.aSc().a(this.dNG.aoq, this.dNG.alU, this.dNH.aQA());
            if (this.dNo.g(this.dNH)) {
                this.dNo.aSa().b(this.dNG.cqa, this.dNH);
            }
            aRT();
        }
    }
}
