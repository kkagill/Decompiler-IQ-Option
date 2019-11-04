package com.iqoption.charttools.tools;

import com.iqoption.core.graphics.animation.j;
import com.iqoption.x.R;
import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "Lcom/iqoption/charttools/tools/transition/CardPanelTransition;", "invoke"})
/* compiled from: ToolsFragment.kt */
final class ToolsFragment$enterExitTransition$2 extends Lambda implements a<com.iqoption.charttools.tools.b.a> {
    public static final ToolsFragment$enterExitTransition$2 aLN = new ToolsFragment$enterExitTransition$2();

    ToolsFragment$enterExitTransition$2() {
        super(0);
    }

    /* renamed from: Qb */
    public final com.iqoption.charttools.tools.b.a invoke() {
        com.iqoption.charttools.tools.b.a aVar = new com.iqoption.charttools.tools.b.a();
        aVar.setDuration(250);
        aVar.setInterpolator(j.XJ());
        aVar.addTarget((int) R.id.card);
        return aVar;
    }
}
