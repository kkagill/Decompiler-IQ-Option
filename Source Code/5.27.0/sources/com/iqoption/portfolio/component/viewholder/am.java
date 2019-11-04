package com.iqoption.portfolio.component.viewholder;

import android.text.TextUtils;
import android.view.View;
import com.iqoption.core.microservices.tradingengine.response.active.a;
import com.iqoption.e.vv;
import com.iqoption.portfolio.component.b.l;
import com.iqoption.portfolio.fragment.f;
import com.iqoption.view.d.b;

/* compiled from: PendingGroupItemViewHolder */
public final class am extends ap {
    private final vv dOR;
    private l dOx;

    public void aRj() {
    }

    public am(final vv vvVar, f fVar) {
        super(vvVar.getRoot(), fVar);
        this.dOR = vvVar;
        vvVar.getRoot().setOnClickListener(new b() {
            public void M(View view) {
                am amVar = am.this;
                vvVar.cnb.animate().setDuration(120).rotation(amVar.b(amVar.dOx) ? 180.0f : 0.0f).start();
            }
        });
    }

    public void a(l lVar) {
        this.dOx = lVar;
        if (c(lVar)) {
            this.dOR.cnb.setRotation(180.0f);
        } else {
            this.dOR.cnb.setRotation(0.0f);
        }
        a Jt = lVar.Jt();
        String image = Jt.getImage();
        if (!TextUtils.isEmpty(image)) {
            aSd().d(this.dOR.akZ, image);
        }
        this.dOR.anJ.setText(com.iqoption.util.c.a.C(Jt));
        this.dOR.cnc.setText(String.format(aRX().dMw, new Object[]{String.valueOf(lVar.aRK())}));
        if (lVar.aRM()) {
            this.dOR.bZk.setText(String.format(aRX().dMt, new Object[]{com.iqoption.util.c.a.ai(Jt)}));
            this.dOR.cof.setText(aRX().c(lVar.aRD(), lVar.adZ()));
        } else {
            this.dOR.bZk.setText(aRX().c(lVar.aRL()));
            this.dOR.cof.setText(null);
        }
        this.dOR.bYU.setText(aRX().v(lVar.getInvestment()));
    }
}
