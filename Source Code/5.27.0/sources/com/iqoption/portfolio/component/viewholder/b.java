package com.iqoption.portfolio.component.viewholder;

import android.view.View;
import com.iqoption.e.ud;
import com.iqoption.portfolio.component.b.i;
import com.iqoption.portfolio.component.l;

/* compiled from: CfdGroupViewHolder */
public final class b extends aj {
    private final ud dNj;
    private i dNk;

    public b(final ud udVar, final l lVar) {
        super(udVar.getRoot(), lVar);
        this.dNj = udVar;
        udVar.getRoot().setOnClickListener(new com.iqoption.view.d.b() {
            public void M(View view) {
                udVar.cnb.animate().setDuration(120).rotation(lVar.c(b.this.dNk) ? 180.0f : 0.0f).start();
            }
        });
    }

    public void a(i iVar) {
        this.dNk = iVar;
        aRi();
        if (this.dNo.b(iVar)) {
            this.dNj.cnb.setRotation(180.0f);
        } else {
            this.dNj.cnb.setRotation(0.0f);
        }
        this.dNo.aSd().d(this.dNj.akZ, iVar.aHO());
        this.dNj.anJ.setText(iVar.ahP());
        this.dNj.cnc.setText(String.format(aRX().dMw, new Object[]{String.valueOf(iVar.aQz())}));
        this.dNj.bZk.setText(iVar.aRy());
    }

    public void aRi() {
        if (this.dNk != null) {
            this.dNo.aSc().a(this.dNj.aoq, this.dNj.alU, this.dNk.aQA());
        }
    }
}
