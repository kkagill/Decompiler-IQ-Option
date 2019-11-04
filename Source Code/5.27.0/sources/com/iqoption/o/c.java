package com.iqoption.o;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.iqoption.app.managers.tab.TabHelper;
import com.iqoption.fragment.ah;
import com.iqoption.fragment.b.h;
import com.iqoption.fragment.leftpanel.LeftPanelSection;
import com.iqoption.fragment.o;
import com.iqoption.o.d.a;
import com.iqoption.o.d.a.b;
import com.iqoption.o.d.a.d;
import com.iqoption.o.d.a.e;
import com.iqoption.o.d.a.f;
import com.iqoption.o.d.a.g;
import com.iqoption.view.LocalToast;
import com.iqoption.x.R;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, bng = {"Lcom/iqoption/traderoom/TradeRoomHelper;", "", "fragment", "Lcom/iqoption/fragment/TradeFragment;", "(Lcom/iqoption/fragment/TradeFragment;)V", "getFragment", "()Lcom/iqoption/fragment/TradeFragment;", "onShowAction", "", "action", "Lcom/iqoption/traderoom/TradeRoomViewModel$Action;", "app_optionXRelease"})
/* compiled from: TradeRoomHelper.kt */
public final class c {
    private final ah dUG;

    public c(ah ahVar) {
        kotlin.jvm.internal.i.f(ahVar, "fragment");
        this.dUG = ahVar;
    }

    public final void a(a aVar) {
        String str = "beginTransaction()";
        FragmentTransaction beginTransaction;
        if (aVar instanceof e) {
            com.iqoption.charttools.constructor.c b = com.iqoption.charttools.constructor.c.aED.b(((e) aVar).aVa());
            beginTransaction = com.iqoption.core.ext.a.t(this.dUG).beginTransaction();
            kotlin.jvm.internal.i.e(beginTransaction, str);
            beginTransaction.add(R.id.layout, b, com.iqoption.charttools.constructor.c.TAG);
            beginTransaction.addToBackStack(null);
            beginTransaction.commitAllowingStateLoss();
        } else if (aVar instanceof f) {
            com.iqoption.charttools.tools.f cd = com.iqoption.charttools.tools.f.aLL.cd(((f) aVar).aVb());
            beginTransaction = com.iqoption.core.ext.a.t(this.dUG).beginTransaction();
            kotlin.jvm.internal.i.e(beginTransaction, str);
            beginTransaction.add(R.id.layout, cd, com.iqoption.charttools.tools.f.aLL.Bx());
            beginTransaction.addToBackStack(null);
            beginTransaction.commitAllowingStateLoss();
        } else if (aVar instanceof d) {
            if (com.iqoption.core.ext.a.t(this.dUG).findFragmentByTag(o.cVA.Bx()) == null) {
                d dVar = (d) aVar;
                o j = o.cVA.j(dVar.getActiveId(), dVar.getExpiration());
                beginTransaction = com.iqoption.core.ext.a.t(this.dUG).beginTransaction();
                kotlin.jvm.internal.i.e(beginTransaction, str);
                beginTransaction.add(R.id.underLeftFragmentContainer, j, o.cVA.Bx());
                beginTransaction.addToBackStack(null);
                beginTransaction.commitAllowingStateLoss();
            }
        } else if (aVar instanceof a.a) {
            a.a aVar2 = (a.a) aVar;
            com.iqoption.core.microservices.tradingengine.response.active.a a = com.iqoption.app.helpers.a.Gs().a(Integer.valueOf(aVar2.getActiveId()), aVar2.getInstrumentType());
            if (a != null) {
                kotlin.jvm.internal.i.e(a, "ActiveSettingHelper.inst…instrumentType) ?: return");
                TabHelper.IM().u(a);
                if (aVar2.aUX()) {
                    com.iqoption.fragment.leftpanel.i.dkm.r(com.iqoption.core.ext.a.r(this.dUG)).c(LeftPanelSection.ASSET_INFO);
                }
            }
        } else if (aVar instanceof com.iqoption.o.d.a.c) {
            com.iqoption.o.d.a.c cVar = (com.iqoption.o.d.a.c) aVar;
            Fragment a2 = h.a(cVar.Oq(), cVar.aUY(), true, cVar.aUZ());
            beginTransaction = com.iqoption.core.ext.a.t(this.dUG).beginTransaction();
            kotlin.jvm.internal.i.e(beginTransaction, str);
            beginTransaction.add(R.id.other_fragment, a2, h.TAG);
            beginTransaction.addToBackStack(null);
            beginTransaction.commitAllowingStateLoss();
        } else if (kotlin.jvm.internal.i.y(aVar, b.dUQ)) {
            com.iqoption.fragment.leftpanel.i.dkm.r(com.iqoption.core.ext.a.r(this.dUG)).c(LeftPanelSection.MARKET_ANALYSIS);
        } else if (aVar instanceof g) {
            LocalToast localToast = this.dUG.cXA;
            if (localToast != null) {
                LocalToast d = localToast.d(((g) aVar).aoa());
                if (d != null) {
                    d.aYa();
                }
            }
        }
    }
}
