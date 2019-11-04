package com.iqoption.portfolio.component.viewholder;

import com.iqoption.e.ur;
import com.iqoption.portfolio.component.b.c;
import com.iqoption.portfolio.component.l;

/* compiled from: ExpHeaderViewHolder */
public final class i extends aj {
    private final ur dNF;

    public void aRi() {
    }

    public i(ur urVar, l lVar) {
        super(urVar.getRoot(), lVar);
        this.dNF = urVar;
    }

    public void a(c cVar) {
        this.dNF.bXz.setText(String.format(aRX().dMx, new Object[]{com.iqoption.core.util.i.ay(cVar.getExpiration())}));
    }
}
