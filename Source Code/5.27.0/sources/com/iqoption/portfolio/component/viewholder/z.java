package com.iqoption.portfolio.component.viewholder;

import com.iqoption.e.rx;
import com.iqoption.portfolio.component.b.e;
import com.iqoption.portfolio.component.l;
import com.iqoption.portfolio.component.m;

/* compiled from: MicroOpenHeaderViewHolder */
public final class z extends aj {
    private m dLU;
    private rx dOu;
    private e dOv;

    public z(rx rxVar, l lVar) {
        super(rxVar.getRoot(), lVar);
        this.dOu = rxVar;
        this.dLU = lVar.aRX();
    }

    public void a(e eVar) {
        this.dOv = eVar;
        aRi();
    }

    public void aRi() {
        this.dOu.coj.setText(String.format(this.dLU.dMq, new Object[]{this.dLU.v(this.dOv.getValue())}));
        this.dNo.aSc().a(this.dOu.coj, this.dOu.coh, this.dOv.aQA());
    }
}
