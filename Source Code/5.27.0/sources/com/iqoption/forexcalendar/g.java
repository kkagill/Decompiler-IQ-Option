package com.iqoption.forexcalendar;

import com.iqoption.core.ui.widget.recyclerview.adapter.a.d;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0003\u001a\u00020\u0002X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, bng = {"Lcom/iqoption/forexcalendar/ForexCalendarAdapterItem;", "Lcom/iqoption/core/ui/widget/recyclerview/adapter/diff/Identifiable;", "", "id", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "Lcom/iqoption/forexcalendar/LoadingItem;", "Lcom/iqoption/forexcalendar/EmptyItem;", "Lcom/iqoption/forexcalendar/ForexCalendarTitle;", "Lcom/iqoption/forexcalendar/ForexCalendarItem;", "forexcalendar_release"})
/* compiled from: ForexCalendarAdapterItems.kt */
public abstract class g implements d<String> {
    private final String id;

    private g(String str) {
        this.id = str;
    }

    public /* synthetic */ g(String str, f fVar) {
        this(str);
    }

    public String getId() {
        return this.id;
    }
}
