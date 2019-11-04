package com.iqoption.portfolio.component.a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.iqoption.core.microservices.tradingengine.response.active.j;
import com.iqoption.dto.entity.position.Position;
import com.iqoption.dto.entity.position.PositionItem;
import com.iqoption.e.rn;
import com.iqoption.e.ux;
import com.iqoption.portfolio.a;
import com.iqoption.portfolio.component.b.h;
import com.iqoption.portfolio.component.b.i;
import com.iqoption.portfolio.component.l;
import com.iqoption.portfolio.component.m;
import com.iqoption.util.ak;
import com.iqoption.x.R;
import java.util.concurrent.TimeUnit;

/* compiled from: ExpMultiInfoBinder */
public class d {
    private final l dLR;
    private final m dLU;

    public d(l lVar) {
        this.dLR = lVar;
        this.dLU = lVar.aRX();
    }

    private View[][] a(ux uxVar) {
        r1 = new View[3][];
        r1[0] = new View[]{uxVar.coa, uxVar.cnX, uxVar.caN};
        r1[1] = new View[]{uxVar.cob, uxVar.cnY, uxVar.caO};
        r1[2] = new View[]{uxVar.coc, uxVar.cnZ, uxVar.caP};
        return r1;
    }

    public void a(ux uxVar, i iVar) {
        uxVar.cnp.setText(this.dLU.v(iVar.aQA().getInvest()));
        uxVar.bZk.setText(iVar.aRy());
        uxVar.anJ.setText(iVar.aRx());
    }

    public void a(ux uxVar, h hVar) {
        ux uxVar2 = uxVar;
        a aQA = hVar.aQA();
        Position position = (Position) hVar.aRJ();
        com.iqoption.core.microservices.tradingengine.response.active.a Jt = hVar.Jt();
        View[][] a = a(uxVar);
        for (int i = 0; i < a.length; i++) {
            a(true, (j) Jt, (PositionItem) u.h(position.getPositionItems(), i), a[i][0], (TextView) a[i][1], (TextView) a[i][2]);
        }
        a(aQA, this.dLR.e(hVar), uxVar2.cnK, uxVar2.cnL, uxVar2.cnM);
    }

    public void a(rn rnVar, i iVar) {
        rnVar.cnp.setText(this.dLU.v(iVar.aQA().getInvest()));
        rnVar.bZk.setText(iVar.aRy());
        rnVar.anJ.setText(iVar.aRx());
    }

    private View[][] a(rn rnVar) {
        r1 = new View[3][];
        r1[0] = new View[]{rnVar.coa, rnVar.cnX, rnVar.caN};
        r1[1] = new View[]{rnVar.cob, rnVar.cnY, rnVar.caO};
        r1[2] = new View[]{rnVar.coc, rnVar.cnZ, rnVar.caP};
        return r1;
    }

    public void a(rn rnVar, h hVar) {
        rn rnVar2 = rnVar;
        a aQA = hVar.aQA();
        Position position = (Position) hVar.aRJ();
        com.iqoption.core.microservices.tradingengine.response.active.a Jt = hVar.Jt();
        View[][] a = a(rnVar);
        for (int i = 0; i < a.length; i++) {
            a(true, (j) Jt, (PositionItem) u.h(position.getPositionItems(), i), a[i][0], (TextView) a[i][1], (TextView) a[i][2]);
        }
        a(aQA, this.dLR.e(hVar), rnVar2.cnK, rnVar2.cnL, rnVar2.cnM);
    }

    private void a(a aVar, boolean z, FrameLayout frameLayout, TextView textView, ProgressBar progressBar) {
        if (z) {
            frameLayout.setEnabled(false);
            frameLayout.setAlpha(1.0f);
            textView.setVisibility(8);
            progressBar.setVisibility(0);
            return;
        }
        textView.setVisibility(0);
        progressBar.setVisibility(8);
        if (aVar.aQn()) {
            textView.setText(String.format(this.dLU.dMz, new Object[]{Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(aVar.aQo()) + 1)}));
            frameLayout.setEnabled(true);
            frameLayout.setAlpha(1.0f);
            return;
        }
        String v = this.dLU.v(aVar.getInvest() + aVar.getSellPnl());
        textView.setText(String.format(this.dLU.dMy, new Object[]{v}));
        frameLayout.setEnabled(true);
        frameLayout.setAlpha(1.0f);
    }

    private void a(boolean z, j jVar, PositionItem positionItem, View view, TextView textView, TextView textView2) {
        if (positionItem == null) {
            view.setVisibility(8);
            return;
        }
        view.setVisibility(0);
        if (positionItem.isWinLastKnowValue()) {
            textView2.setText(R.string.status_profit);
            textView2.setTextColor(this.dLU.amj);
        } else {
            textView2.setText(R.string.status_lose);
            textView2.setTextColor(this.dLU.amk);
        }
        if (positionItem.isCall()) {
            ak.setDrawableRight(textView, z ? this.dLU.dMl : this.dLU.dqh);
        } else {
            ak.setDrawableRight(textView, z ? this.dLU.dMm : this.dLU.dqi);
        }
        j fa = jVar.fa(positionItem.getActiveId());
        if (fa != null) {
            textView.setText(com.iqoption.util.c.a.C(fa));
        }
    }
}
