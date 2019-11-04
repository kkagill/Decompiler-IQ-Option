package com.iqoption.portfolio.component.viewholder;

import android.text.TextUtils;
import android.view.View;
import com.iqoption.core.microservices.tradingengine.response.active.a;
import com.iqoption.e.sh;
import com.iqoption.portfolio.component.b.l;
import com.iqoption.portfolio.fragment.f;
import com.iqoption.view.d.b;

/* compiled from: MicroPendingGroupItemViewHolder */
public final class ab extends ap {
    private final sh dOw;
    private l dOx;

    public void aRj() {
    }

    public ab(final sh shVar, f fVar) {
        super(shVar.getRoot(), fVar);
        this.dOw = shVar;
        shVar.getRoot().setOnClickListener(new b() {
            public void M(View view) {
                ab abVar = ab.this;
                shVar.cnb.animate().setDuration(120).rotation(abVar.b(abVar.dOx) ? 180.0f : 0.0f).start();
            }
        });
    }

    public void a(l lVar) {
        this.dOx = lVar;
        if (c(lVar)) {
            this.dOw.cnb.setRotation(180.0f);
        } else {
            this.dOw.cnb.setRotation(0.0f);
        }
        a Jt = lVar.Jt();
        String image = Jt.getImage();
        if (!TextUtils.isEmpty(image)) {
            aSd().d(this.dOw.akZ, image);
        }
        this.dOw.anJ.setText(com.iqoption.util.c.a.C(Jt));
        this.dOw.cnc.setText(String.format(aRX().dMw, new Object[]{String.valueOf(lVar.aRK())}));
        this.dOw.bZk.setText(aRX().c(lVar.aRL()));
        this.dOw.bYU.setText(aRX().v(lVar.getInvestment()));
    }
}
