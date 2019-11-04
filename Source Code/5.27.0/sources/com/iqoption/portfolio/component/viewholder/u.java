package com.iqoption.portfolio.component.viewholder;

import android.view.View;
import com.google.common.util.concurrent.o;
import com.iqoption.analytics.k;
import com.iqoption.e.rn;
import com.iqoption.portfolio.component.b.h;
import com.iqoption.portfolio.component.b.i;
import com.iqoption.portfolio.component.b.j;
import com.iqoption.portfolio.component.l;
import com.iqoption.util.v;
import com.iqoption.view.d.b;

/* compiled from: MicroExpMultiGroupViewHolder */
public final class u extends aj {
    private i dNk;
    private final rn dOi;

    public u(final rn rnVar, final l lVar) {
        super(rnVar.getRoot(), lVar);
        this.dOi = rnVar;
        rnVar.cnH.setOnClickListener(new b() {
            public void M(View view) {
                j aRC = u.this.dNk.aRC();
                boolean h = lVar.h(aRC);
                if (h && u.this.dNk.aRC() != null) {
                    lVar.d(aRC);
                }
                rnVar.cnb.animate().setDuration(120).rotation(h ? 180.0f : 0.0f).start();
                k.a(u.this.dNk.aRC(), h);
            }
        });
        rnVar.cnP.setOnClickListener(new b() {
            public void M(View view) {
                lVar.d(u.this.dNk.aRC());
            }
        });
        rnVar.cnK.setOnClickListener(new b() {
            public void M(View view) {
                j jVar = (h) u.this.dNk.aRC();
                if (!lVar.e(jVar)) {
                    rnVar.cnL.setVisibility(8);
                    rnVar.cnM.setVisibility(0);
                    v.b(lVar.f(jVar), new o<Object>() {
                        public void onSuccess(Object obj) {
                        }

                        public void l(Throwable th) {
                            rnVar.cnL.setVisibility(0);
                            rnVar.cnM.setVisibility(8);
                        }
                    });
                    k.b(jVar);
                }
            }
        });
    }

    public void a(i iVar) {
        this.dNk = iVar;
        if (this.dNo.g((h) iVar.aRC())) {
            this.dOi.getRoot().setSelected(true);
            this.dOi.cnP.setVisibility(0);
            this.dOi.cnb.setRotation(180.0f);
        } else {
            this.dOi.getRoot().setSelected(false);
            this.dOi.cnP.setVisibility(8);
            this.dOi.cnb.setRotation(0.0f);
        }
        aRU();
        aRi();
    }

    public void aRi() {
        if (this.dNk != null) {
            this.dNo.aSc().a(this.dOi.aoq, this.dOi.alU, this.dNk.aQA());
            h hVar = (h) this.dNk.aRC();
            if (this.dNo.g(hVar)) {
                hVar.aQH();
                this.dNo.aRZ().a(this.dOi, hVar);
            }
            aRT();
        }
    }

    private void aRU() {
        if (this.dNk != null) {
            this.dNo.aRZ().a(this.dOi, this.dNk);
        }
    }

    private void aRT() {
        i iVar = this.dNk;
        if (iVar != null) {
            h hVar = (h) iVar.aRC();
            long aim = hVar.aim();
            this.dOi.bXq.h(Math.max(0, aim - com.iqoption.app.managers.l.HZ().Ib()), aim - hVar.abl());
        }
    }
}
