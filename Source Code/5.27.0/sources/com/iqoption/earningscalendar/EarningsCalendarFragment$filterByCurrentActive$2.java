package com.iqoption.earningscalendar;

import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "invoke"})
/* compiled from: EarningsCalendarFragment.kt */
final class EarningsCalendarFragment$filterByCurrentActive$2 extends Lambda implements a<Boolean> {
    final /* synthetic */ f this$0;

    EarningsCalendarFragment$filterByCurrentActive$2(f fVar) {
        this.this$0 = fVar;
        super(0);
    }

    public final boolean invoke() {
        return com.iqoption.core.ext.a.s(this.this$0).getBoolean("ARG_BY_CURRENT_ACTIVE");
    }
}
