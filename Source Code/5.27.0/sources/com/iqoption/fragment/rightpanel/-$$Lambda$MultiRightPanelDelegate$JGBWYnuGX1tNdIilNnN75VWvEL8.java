package com.iqoption.fragment.rightpanel;

import com.iqoption.app.managers.tab.TabHelper;
import com.iqoption.fragment.rightpanel.a.d.a;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$MultiRightPanelDelegate$JGBWYnuGX1tNdIilNnN75VWvEL8 implements a {
    public static final /* synthetic */ -$$Lambda$MultiRightPanelDelegate$JGBWYnuGX1tNdIilNnN75VWvEL8 INSTANCE = new -$$Lambda$MultiRightPanelDelegate$JGBWYnuGX1tNdIilNnN75VWvEL8();

    private /* synthetic */ -$$Lambda$MultiRightPanelDelegate$JGBWYnuGX1tNdIilNnN75VWvEL8() {
    }

    public final void onItemClick(com.iqoption.core.microservices.tradingengine.response.active.a aVar) {
        TabHelper.IM().ec(aVar.getActiveId());
    }
}
