package com.iqoption.portfolio.component.viewholder;

import android.view.View;
import com.iqoption.e.qt;
import com.iqoption.portfolio.component.b.i;
import com.iqoption.portfolio.component.l;
import com.iqoption.view.d.b;

/* compiled from: MicroCfdGroupViewHolder */
public final class o extends aj {
    private final qt dNT;
    private i dNk;

    public o(final qt qtVar, final l lVar) {
        super(qtVar.getRoot(), lVar);
        this.dNT = qtVar;
        qtVar.getRoot().setOnClickListener(new b() {
            public void M(View view) {
                qtVar.cnb.animate().setDuration(120).rotation(lVar.c(o.this.dNk) ? 180.0f : 0.0f).start();
            }
        });
    }

    public void a(i iVar) {
        this.dNk = iVar;
        aRi();
        if (this.dNo.b(iVar)) {
            this.dNT.cnb.setRotation(180.0f);
        } else {
            this.dNT.cnb.setRotation(0.0f);
        }
        this.dNo.aSd().d(this.dNT.akZ, iVar.aHO());
        this.dNT.anJ.setText(iVar.aRx());
        this.dNT.cnc.setText(String.format(aRX().dMw, new Object[]{String.valueOf(iVar.aQz())}));
        this.dNT.bZk.setText(iVar.aRy());
    }

    public void aRi() {
        if (this.dNk != null) {
            this.dNo.aSc().a(this.dNT.aoq, this.dNT.alU, this.dNk.aQA());
        }
    }
}
