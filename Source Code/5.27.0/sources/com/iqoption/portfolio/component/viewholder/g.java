package com.iqoption.portfolio.component.viewholder;

import android.view.View;
import android.view.View.OnClickListener;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.iqoption.analytics.k;
import com.iqoption.core.microservices.tradingengine.response.active.a;
import com.iqoption.e.rd;
import com.iqoption.portfolio.b;
import com.iqoption.portfolio.component.l;
import java.util.Calendar;

/* compiled from: ClosedGroupViewHolder */
public class g extends ViewHolder implements OnClickListener {
    private final l dLR;
    private final rd dNA;
    private b dNB;

    public g(rd rdVar, l lVar) {
        super(rdVar.getRoot());
        rdVar.aRl.setOnClickListener(this);
        this.dLR = lVar;
        this.dNA = rdVar;
    }

    public void b(b bVar, b bVar2) {
        String a;
        CharSequence C;
        CharSequence ai;
        this.dNB = bVar;
        if (bVar2 == null || !n(bVar.getCloseTime(), bVar2.getCloseTime())) {
            this.dNA.bZj.setVisibility(0);
            this.dNA.bZj.setText(this.dLR.aRX().bC(bVar.getCloseTime()));
        } else {
            this.dNA.bZj.setVisibility(8);
        }
        a Jt = bVar.Jt();
        if (Jt != null) {
            a = a(Jt, bVar);
            C = com.iqoption.util.c.a.C(Jt);
            ai = com.iqoption.util.c.a.ai(Jt);
        } else {
            ai = null;
            a = ai;
            C = a;
        }
        this.dLR.aSd().d(this.dNA.akZ, a);
        if (C == null) {
            this.dNA.anJ.setText(null);
        } else if (bVar.aQz() > 1) {
            this.dNA.anJ.setText(String.format(this.dLR.aRX().dMC, new Object[]{C, Integer.valueOf(bVar.aQz())}));
        } else {
            this.dNA.anJ.setText(C);
        }
        this.dNA.bZk.setText(ai);
        this.dLR.aSc().b(this.dNA.alU, this.dNA.cat, bVar.aQA());
    }

    private String a(a aVar, b bVar) {
        return aVar.getImage();
    }

    private boolean n(long j, long j2) {
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j);
        int i = instance.get(1);
        int i2 = instance.get(6);
        instance.setTimeInMillis(j2);
        int i3 = instance.get(6);
        if (i == instance.get(1) && i2 == i3) {
            return true;
        }
        return false;
    }

    public void onClick(View view) {
        b bVar = this.dNB;
        if (bVar != null) {
            this.dLR.c(bVar);
            k.a(this.dNB);
        }
    }
}
