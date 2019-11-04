package com.iqoption.charttools.tools;

import com.iqoption.charttools.model.indicator.x;
import com.iqoption.charttools.tools.data.n;
import java.util.List;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "Lcom/iqoption/charttools/tools/data/TitleIndicatorItem;", "it", "Lcom/iqoption/charttools/model/indicator/MetaIndicator;", "invoke"})
/* compiled from: ToolsViewModel.kt */
final class ToolsViewModel$Companion$mapToSortedList$1 extends Lambda implements b<x, n> {
    final /* synthetic */ List $active;
    final /* synthetic */ e $expanded;
    final /* synthetic */ List $favorites;

    ToolsViewModel$Companion$mapToSortedList$1(e eVar, List list, List list2) {
        this.$expanded = eVar;
        this.$favorites = list;
        this.$active = list2;
        super(1);
    }

    /* renamed from: e */
    public final n invoke(x xVar) {
        kotlin.jvm.internal.i.f(xVar, "it");
        return h.aMs.a(xVar, this.$expanded, this.$favorites, this.$active);
    }
}
