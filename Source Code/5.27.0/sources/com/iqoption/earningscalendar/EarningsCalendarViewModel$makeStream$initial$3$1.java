package com.iqoption.earningscalendar;

import com.iqoption.core.marketanalysis.LoadingDirection;
import java.util.List;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, bng = {"<anonymous>", "Lcom/iqoption/earningscalendar/EarningsCalendarViewModel$State;", "state", "invoke"})
/* compiled from: EarningsCalendarViewModel.kt */
final class EarningsCalendarViewModel$makeStream$initial$3$1 extends Lambda implements b<k.b, k.b> {
    final /* synthetic */ LoadingDirection $direction;
    final /* synthetic */ List $items;

    EarningsCalendarViewModel$makeStream$initial$3$1(LoadingDirection loadingDirection, List list) {
        this.$direction = loadingDirection;
        this.$items = list;
        super(1);
    }

    /* renamed from: c */
    public final k.b invoke(k.b bVar) {
        kotlin.jvm.internal.i.f(bVar, "state");
        return bVar.a(this.$direction, this.$items);
    }
}
