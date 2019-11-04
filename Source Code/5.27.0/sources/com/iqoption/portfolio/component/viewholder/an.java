package com.iqoption.portfolio.component.viewholder;

import com.iqoption.e.vx;
import com.iqoption.portfolio.component.b.e;
import com.iqoption.portfolio.fragment.f;

/* compiled from: PendingHeaderViewHolder */
public final class an extends ap {
    private final vx dOU;

    public void aRj() {
    }

    public an(vx vxVar, f fVar) {
        super(vxVar.getRoot(), fVar);
        this.dOU = vxVar;
    }

    public void a(e eVar) {
        this.dOU.cal.setText(String.format(aRX().dMs, new Object[]{aRX().v(eVar.getInvest())}));
    }
}
