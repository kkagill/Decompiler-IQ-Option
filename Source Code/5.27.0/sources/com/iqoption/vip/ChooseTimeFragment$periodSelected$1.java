package com.iqoption.vip;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import com.iqoption.analytics.r;
import com.iqoption.e.nx;
import kotlin.i;
import kotlin.jvm.a.m;
import kotlin.jvm.internal.Lambda;
import kotlin.l;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "date", "", "period", "Lcom/iqoption/vip/WorkingPeriod;", "invoke"})
/* compiled from: ChooseTimeFragment.kt */
final class ChooseTimeFragment$periodSelected$1 extends Lambda implements m<Long, k, l> {
    final /* synthetic */ c this$0;

    ChooseTimeFragment$periodSelected$1(c cVar) {
        this.this$0 = cVar;
        super(2);
    }

    public /* synthetic */ Object w(Object obj, Object obj2) {
        d(((Number) obj).longValue(), (k) obj2);
        return l.eVB;
    }

    public final void d(long j, k kVar) {
        r.aqZ.CO();
        if (j == this.this$0.ejv && kotlin.jvm.internal.i.y(kVar, this.this$0.eju)) {
            this.this$0.ejv = 0;
            this.this$0.eju = (k) null;
        } else {
            this.this$0.ejv = j;
            this.this$0.eju = kVar;
        }
        nx c = c.c(this.this$0);
        RecyclerView recyclerView = c.ckO;
        kotlin.jvm.internal.i.e(recyclerView, "todayPeriods");
        Adapter adapter = recyclerView.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
        recyclerView = c.ckK;
        kotlin.jvm.internal.i.e(recyclerView, "nextDayPeriods");
        adapter = recyclerView.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
        RecyclerView recyclerView2 = c.ckM;
        kotlin.jvm.internal.i.e(recyclerView2, "nextNextDayPeriods");
        Adapter adapter2 = recyclerView2.getAdapter();
        if (adapter2 != null) {
            adapter2.notifyDataSetChanged();
        }
    }
}
