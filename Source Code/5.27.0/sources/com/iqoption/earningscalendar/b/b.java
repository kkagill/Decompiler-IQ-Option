package com.iqoption.earningscalendar.b;

import android.view.ViewGroup;
import android.widget.TextView;
import com.iqoption.core.ui.widget.recyclerview.a.e;
import com.iqoption.earningscalendar.j;
import com.iqoption.earningscalendar.o.c;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\u00020\b*\u00020\u00022\u0006\u0010\t\u001a\u00020\u0003H\u0016¨\u0006\n"}, bng = {"Lcom/iqoption/earningscalendar/macro/MacroEarningsCalendarTitleViewHolder;", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/VDBindingHolder;", "Lcom/iqoption/earningscalendar/databinding/MacroEarningsCalendarTitleItemBinding;", "Lcom/iqoption/earningscalendar/EarningsCalendarTitle;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "bind", "", "item", "earningscalendar_release"})
/* compiled from: MacroEarningsCalendarTitleViewHolder.kt */
public final class b extends e<com.iqoption.earningscalendar.a.e, j> {
    public b(ViewGroup viewGroup) {
        kotlin.jvm.internal.i.f(viewGroup, "parent");
        super(c.macro_earnings_calendar_title_item, viewGroup, null, 4, null);
    }

    public void a(com.iqoption.earningscalendar.a.e eVar, j jVar) {
        kotlin.jvm.internal.i.f(eVar, "$this$bind");
        kotlin.jvm.internal.i.f(jVar, "item");
        TextView textView = eVar.anC;
        kotlin.jvm.internal.i.e(textView, "date");
        textView.setText(jVar.getTitle());
    }
}
