package com.iqoption.portfolio.component.viewholder;

import android.view.View;
import com.iqoption.e.up;
import com.iqoption.portfolio.component.b.i;
import com.iqoption.portfolio.component.l;
import com.iqoption.view.d.b;

/* compiled from: ExpGroupViewHolder */
public final class h extends aj {
    private final up dNC;
    private i dNk;

    public h(final up upVar, final l lVar) {
        super(upVar.getRoot(), lVar);
        this.dNC = upVar;
        upVar.getRoot().setOnClickListener(new b() {
            public void M(View view) {
                upVar.cnb.animate().setDuration(120).rotation(lVar.c(h.this.dNk) ? 180.0f : 0.0f).start();
            }
        });
    }

    public void a(i iVar) {
        this.dNk = iVar;
        aRi();
        if (this.dNo.b(iVar)) {
            this.dNC.cnb.setRotation(180.0f);
        } else {
            this.dNC.cnb.setRotation(0.0f);
        }
        this.dNo.aSd().d(this.dNC.akZ, iVar.aHO());
        this.dNC.anJ.setText(iVar.ahP());
        this.dNC.cnc.setText(String.format(aRX().dMw, new Object[]{String.valueOf(iVar.aQz())}));
        this.dNC.bZk.setText(String.format(aRX().dMu, new Object[]{iVar.aRy()}));
    }

    public void aRi() {
        if (this.dNk != null) {
            this.dNo.aSc().a(this.dNC.aoq, this.dNC.alU, this.dNk.aQA());
        }
    }
}
