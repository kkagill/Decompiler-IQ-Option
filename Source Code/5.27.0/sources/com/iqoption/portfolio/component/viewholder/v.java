package com.iqoption.portfolio.component.viewholder;

import android.view.View;
import com.google.common.util.concurrent.o;
import com.iqoption.analytics.k;
import com.iqoption.e.rp;
import com.iqoption.portfolio.component.b.h;
import com.iqoption.portfolio.component.b.i;
import com.iqoption.portfolio.component.b.j;
import com.iqoption.portfolio.component.l;
import com.iqoption.view.d.b;

/* compiled from: MicroExpSingleGroupViewHolder */
public final class v extends aj {
    private i dNk;
    private final rp dOm;

    public v(final rp rpVar, final l lVar) {
        super(rpVar.getRoot(), lVar);
        this.dOm = rpVar;
        rpVar.cnH.setOnClickListener(new b() {
            public void M(View view) {
                j aRC = v.this.dNk.aRC();
                boolean h = lVar.h(aRC);
                k.a(aRC, h);
                if (h && v.this.dNk.aRC() != null) {
                    lVar.d(v.this.dNk.aRC());
                }
            }
        });
        rpVar.cnW.cnP.setOnClickListener(new b() {
            public void M(View view) {
                lVar.d(v.this.dNk.aRC());
            }
        });
        rpVar.cnW.cnK.setOnClickListener(new b() {
            public void M(View view) {
                j jVar = (h) v.this.dNk.aRC();
                if (!lVar.e(jVar)) {
                    rpVar.cnW.cnL.setVisibility(8);
                    rpVar.cnW.cnM.setVisibility(0);
                    com.iqoption.util.v.b(lVar.f(jVar), new o<Object>() {
                        public void onSuccess(Object obj) {
                        }

                        public void l(Throwable th) {
                            rpVar.cnW.cnL.setVisibility(0);
                            rpVar.cnW.cnM.setVisibility(8);
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
            this.dOm.cnJ.setVisibility(0);
            this.dOm.cnW.getRoot().setVisibility(0);
            this.dNo.aSa().a(this.dOm.cnW, hVar);
        } else {
            this.dOm.cnJ.setVisibility(8);
            this.dOm.cnW.getRoot().setVisibility(8);
        }
        this.dOm.anJ.setText(iVar.aRx());
        this.dOm.cau.setImageDrawable(iVar.isCall() ? aRX().dMl : aRX().dMm);
        this.dOm.bZk.setText(iVar.aRy());
    }

    private void aRT() {
        i iVar = this.dNk;
        if (iVar != null) {
            h hVar = (h) iVar.aRC();
            long aim = hVar.aim();
            this.dOm.bXq.h(Math.max(0, aim - com.iqoption.app.managers.l.HZ().Ib()), aim - hVar.abl());
        }
    }

    public void aRi() {
        if (this.dNk != null) {
            this.dNo.aSc().a(this.dOm.aoq, this.dOm.alU, this.dNk.aQA());
            h hVar = (h) this.dNk.aRC();
            if (this.dNo.g(hVar)) {
                hVar.aQH();
                this.dNo.aSa().b(this.dOm.cnW, hVar);
            }
            aRT();
        }
    }
}
