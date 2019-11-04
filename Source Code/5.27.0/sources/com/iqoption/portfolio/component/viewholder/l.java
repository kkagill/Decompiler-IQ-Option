package com.iqoption.portfolio.component.viewholder;

import android.view.View;
import com.google.common.util.concurrent.o;
import com.iqoption.analytics.k;
import com.iqoption.e.uz;
import com.iqoption.portfolio.component.b.h;
import com.iqoption.portfolio.component.b.i;
import com.iqoption.portfolio.component.b.j;
import com.iqoption.util.v;
import com.iqoption.view.d.b;

/* compiled from: ExpSingleGroupViewHolder */
public final class l extends aj {
    private final uz dNP;
    private i dNk;

    public l(final uz uzVar, final com.iqoption.portfolio.component.l lVar) {
        super(uzVar.getRoot(), lVar);
        this.dNP = uzVar;
        uzVar.cnH.setOnClickListener(new b() {
            public void M(View view) {
                j aRC = l.this.dNk.aRC();
                k.a(aRC, lVar.h(aRC));
            }
        });
        uzVar.cqa.getRoot().setOnClickListener(new b() {
            public void M(View view) {
                lVar.d(l.this.dNk.aRC());
            }
        });
        uzVar.cqa.cnK.setOnClickListener(new b() {
            public void M(View view) {
                j jVar = (h) l.this.dNk.aRC();
                if (!lVar.e(jVar)) {
                    uzVar.cqa.cnL.setVisibility(8);
                    uzVar.cqa.cnM.setVisibility(0);
                    v.a(lVar.f(jVar), new o<Object>() {
                        public void onSuccess(Object obj) {
                        }

                        public void l(Throwable th) {
                            uzVar.cqa.cnL.setVisibility(0);
                            uzVar.cqa.cnM.setVisibility(8);
                        }
                    });
                    k.b(jVar);
                }
            }
        });
    }

    public void a(i iVar) {
        this.dNk = iVar;
        aRi();
        h hVar = (h) iVar.aRC();
        if (this.dNo.g(hVar)) {
            this.dNP.cnJ.setVisibility(0);
            this.dNP.cqa.getRoot().setVisibility(0);
            this.dNo.aSa().a(this.dNP.cqa, hVar);
        } else {
            this.dNP.cnJ.setVisibility(8);
            this.dNP.cqa.getRoot().setVisibility(8);
        }
        this.dNP.alH.setText(iVar.ahP());
        this.dNP.cau.setImageDrawable(iVar.isCall() ? aRX().dqh : aRX().dqi);
        this.dNP.bZk.setText(String.format(aRX().dMu, new Object[]{iVar.aRy()}));
        this.dNP.bXq.setTextSize(aRX().dML);
    }

    private void aRT() {
        i iVar = this.dNk;
        if (iVar != null) {
            h hVar = (h) iVar.aRC();
            long aim = hVar.aim();
            this.dNP.bXq.h(Math.max(0, aim - com.iqoption.app.managers.l.HZ().Ib()), aim - hVar.abl());
        }
    }

    public void aRi() {
        if (this.dNk != null) {
            this.dNo.aSc().a(this.dNP.aoq, this.dNP.alU, this.dNk.aQA());
            h hVar = (h) this.dNk.aRC();
            if (this.dNo.g(hVar)) {
                hVar.aQH();
                this.dNo.aSa().b(this.dNP.cqa, hVar);
            }
            aRT();
        }
    }
}
