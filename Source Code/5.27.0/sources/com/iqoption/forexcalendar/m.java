package com.iqoption.forexcalendar;

import android.view.ViewGroup;
import com.iqoption.core.ui.widget.recyclerview.a.c;
import com.iqoption.forexcalendar.c.b;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\r\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0002H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, bng = {"Lcom/iqoption/forexcalendar/ForexCalendarTitleViewHolder;", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/IQViewHolder;", "Lcom/iqoption/forexcalendar/ForexCalendarTitle;", "isMicro", "", "parent", "Landroid/view/ViewGroup;", "(ZLandroid/view/ViewGroup;)V", "binder", "Lcom/iqoption/forexcalendar/TitleBinder;", "(Lcom/iqoption/forexcalendar/TitleBinder;)V", "bind", "", "item", "forexcalendar_release"})
/* compiled from: ForexCalendarTitleViewHolder.kt */
public final class m extends c<l> {
    private final s cSM;

    public m(s sVar) {
        kotlin.jvm.internal.i.f(sVar, "binder");
        super(sVar.getRoot(), null, 2, null);
        this.cSM = sVar;
    }

    public m(boolean z, ViewGroup viewGroup) {
        kotlin.jvm.internal.i.f(viewGroup, "parent");
        this(z ? new b(viewGroup) : new com.iqoption.forexcalendar.b.b(viewGroup));
    }

    /* renamed from: a */
    public void bB(l lVar) {
        kotlin.jvm.internal.i.f(lVar, "item");
        this.cSM.awJ().setText(lVar.getTitle());
    }
}
