package com.iqoption.portfolio.component.viewholder;

import android.view.View;
import com.iqoption.e.rf;
import com.iqoption.portfolio.component.b.i;
import com.iqoption.portfolio.component.l;
import com.iqoption.view.d.b;

/* compiled from: MicroExpGroupViewHolder */
public final class r extends aj {
    private i dNk;
    private final rf dOa;

    public r(final rf rfVar, final l lVar) {
        super(rfVar.getRoot(), lVar);
        this.dOa = rfVar;
        rfVar.getRoot().setOnClickListener(new b() {
            public void M(View view) {
                rfVar.cnb.animate().setDuration(120).rotation(lVar.c(r.this.dNk) ? 180.0f : 0.0f).start();
            }
        });
    }

    public void a(i iVar) {
        this.dNk = iVar;
        aRi();
        if (this.dNo.b(iVar)) {
            this.dOa.cnb.setRotation(180.0f);
        } else {
            this.dOa.cnb.setRotation(0.0f);
        }
        this.dNo.aSd().d(this.dOa.akZ, iVar.aHO());
        this.dOa.anJ.setText(iVar.aRx());
        this.dOa.cnc.setText(String.format(aRX().dMw, new Object[]{String.valueOf(iVar.aQz())}));
        this.dOa.bZk.setText(iVar.aRy());
    }

    public void aRi() {
        if (this.dNk != null) {
            this.dNo.aSc().a(this.dOa.aoq, this.dOa.alU, this.dNk.aQA());
        }
    }
}
