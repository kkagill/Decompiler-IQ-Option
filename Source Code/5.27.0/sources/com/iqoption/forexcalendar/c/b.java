package com.iqoption.forexcalendar.c;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.iqoption.core.ext.a;
import com.iqoption.forexcalendar.a.q;
import com.iqoption.forexcalendar.r.e;
import com.iqoption.forexcalendar.s;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, bng = {"Lcom/iqoption/forexcalendar/micro/MicroTitleBinder;", "Lcom/iqoption/forexcalendar/TitleBinder;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "binding", "Lcom/iqoption/forexcalendar/databinding/MicroForexCalendarTitleItemBinding;", "(Lcom/iqoption/forexcalendar/databinding/MicroForexCalendarTitleItemBinding;)V", "getDate", "Landroid/widget/TextView;", "getRoot", "Landroid/view/View;", "forexcalendar_release"})
/* compiled from: MicroTitleBinder.kt */
public final class b implements s {
    private final q cTQ;

    public b(q qVar) {
        kotlin.jvm.internal.i.f(qVar, "binding");
        this.cTQ = qVar;
    }

    public b(ViewGroup viewGroup) {
        kotlin.jvm.internal.i.f(viewGroup, "parent");
        this((q) a.a(viewGroup, e.micro_forex_calendar_title_item, null, false, 6, null));
    }

    public View getRoot() {
        View root = this.cTQ.getRoot();
        kotlin.jvm.internal.i.e(root, "binding.root");
        return root;
    }

    public TextView awJ() {
        TextView textView = this.cTQ.anC;
        kotlin.jvm.internal.i.e(textView, "binding.date");
        return textView;
    }
}
