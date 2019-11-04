package com.iqoption.fragment.rightpanel;

import com.iqoption.core.microservices.tradingengine.response.active.a;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b \u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0014¨\u0006\u000b"}, bng = {"Lcom/iqoption/fragment/rightpanel/EnabledInstrumentDelegate;", "Lcom/iqoption/fragment/rightpanel/RightPanelDelegate;", "f", "Lcom/iqoption/fragment/rightpanel/RightPanelFragment;", "(Lcom/iqoption/fragment/rightpanel/RightPanelFragment;)V", "supports", "", "newActive", "Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "alert", "Lcom/iqoption/core/microservices/useralerts/response/AssetAlert;", "app_optionXRelease"})
/* compiled from: EnabledInstrumentDelegate.kt */
public abstract class EnabledInstrumentDelegate extends RightPanelDelegate {
    public EnabledInstrumentDelegate(RightPanelFragment rightPanelFragment) {
        kotlin.jvm.internal.i.f(rightPanelFragment, "f");
        super(rightPanelFragment);
    }

    /* Access modifiers changed, original: protected */
    public boolean b(a aVar, com.iqoption.core.microservices.useralerts.response.a aVar2) {
        kotlin.jvm.internal.i.f(aVar, "newActive");
        if (aVar2 == null && aVar.getInstrumentType() == getInstrumentType() && com.iqoption.util.c.a.a(aVar, 0, 1, null)) {
            return aVar.isSuspended() ^ 1;
        }
        return false;
    }
}
