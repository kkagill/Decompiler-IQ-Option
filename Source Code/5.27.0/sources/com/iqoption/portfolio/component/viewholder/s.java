package com.iqoption.portfolio.component.viewholder;

import com.iqoption.core.util.i;
import com.iqoption.e.rh;
import com.iqoption.portfolio.component.b.c;
import com.iqoption.portfolio.component.l;

/* compiled from: MicroExpHeaderViewHolder */
public final class s extends aj {
    private final rh dOd;

    public void aRi() {
    }

    public s(rh rhVar, l lVar) {
        super(rhVar.getRoot(), lVar);
        this.dOd = rhVar;
    }

    public void a(c cVar) {
        this.dOd.bXz.setText(String.format(aRX().dMx, new Object[]{i.ay(cVar.getExpiration())}));
    }
}
