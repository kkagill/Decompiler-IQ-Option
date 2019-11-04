package com.iqoption.portfolio.component.viewholder;

import android.view.View;
import com.google.common.util.concurrent.o;
import com.iqoption.e.ux;
import com.iqoption.portfolio.component.b.h;
import com.iqoption.portfolio.component.b.i;
import com.iqoption.portfolio.component.b.j;
import com.iqoption.portfolio.component.l;
import com.iqoption.util.v;
import com.iqoption.view.d.b;

/* compiled from: ExpMultiGroupViewHolder */
public final class k extends aj {
    private final ux dNL;
    private i dNk;

    public k(final ux uxVar, final l lVar) {
        super(uxVar.getRoot(), lVar);
        this.dNL = uxVar;
        uxVar.cnH.setOnClickListener(new b() {
            public void M(View view) {
                j aRC = k.this.dNk.aRC();
                boolean h = lVar.h(aRC);
                uxVar.cnb.animate().setDuration(120).rotation(h ? 180.0f : 0.0f).start();
                com.iqoption.analytics.k.a(aRC, h);
            }
        });
        uxVar.cnP.setOnClickListener(new b() {
            public void M(View view) {
                lVar.d(k.this.dNk.aRC());
            }
        });
        uxVar.cnK.setOnClickListener(new b() {
            public void M(View view) {
                j jVar = (h) k.this.dNk.aRC();
                if (!lVar.e(jVar)) {
                    uxVar.cnL.setVisibility(8);
                    uxVar.cnM.setVisibility(0);
                    v.b(lVar.f(jVar), new o<Object>() {
                        public void onSuccess(Object obj) {
                        }

                        public void l(Throwable th) {
                            uxVar.cnL.setVisibility(0);
                            uxVar.cnM.setVisibility(8);
                        }
                    });
                    com.iqoption.analytics.k.b(jVar);
                }
            }
        });
    }

    public void a(i iVar) {
        this.dNk = iVar;
        if (this.dNo.g((h) iVar.aRC())) {
            this.dNL.getRoot().setSelected(true);
            this.dNL.cnP.setVisibility(0);
            this.dNL.cnb.setRotation(180.0f);
        } else {
            this.dNL.getRoot().setSelected(false);
            this.dNL.cnP.setVisibility(8);
            this.dNL.cnb.setRotation(0.0f);
        }
        aRU();
        aRi();
    }

    public void aRi() {
        if (this.dNk != null) {
            this.dNo.aSc().a(this.dNL.aoq, this.dNL.alU, this.dNk.aQA());
            h hVar = (h) this.dNk.aRC();
            if (this.dNo.g(hVar)) {
                hVar.aQH();
                this.dNo.aRZ().a(this.dNL, hVar);
            }
            aRT();
        }
    }

    private void aRU() {
        if (this.dNk != null) {
            this.dNo.aRZ().a(this.dNL, this.dNk);
        }
    }

    private void aRT() {
        i iVar = this.dNk;
        if (iVar != null) {
            h hVar = (h) iVar.aRC();
            long aim = hVar.aim();
            this.dNL.bXq.h(Math.max(0, aim - com.iqoption.app.managers.l.HZ().Ib()), aim - hVar.abl());
        }
    }
}
