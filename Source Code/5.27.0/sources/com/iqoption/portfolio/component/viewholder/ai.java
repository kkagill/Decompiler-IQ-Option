package com.iqoption.portfolio.component.viewholder;

import com.iqoption.e.vn;
import com.iqoption.portfolio.component.b.e;
import com.iqoption.portfolio.component.l;
import com.iqoption.portfolio.component.m;

/* compiled from: OpenHeaderViewHolder */
public final class ai extends aj {
    private m dLU;
    private final vn dOQ;
    private e dOv;

    public ai(vn vnVar, l lVar) {
        super(vnVar.getRoot(), lVar);
        this.dOQ = vnVar;
        this.dLU = lVar.aRX();
    }

    public void a(e eVar) {
        this.dOv = eVar;
        aRi();
    }

    public void aRi() {
        this.dOQ.cqc.setText(String.format(this.dLU.dMr, new Object[]{this.dLU.v(this.dOv.getInvest())}));
    }
}
