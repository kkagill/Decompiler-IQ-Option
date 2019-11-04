package com.iqoption.dialogs.a;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\u00020\b*\u00020\u00022\u0006\u0010\t\u001a\u00020\u0003H\u0016J\u0014\u0010\n\u001a\u00020\b*\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002¨\u0006\u000e"}, bng = {"Lcom/iqoption/dialogs/custodial/ScheduleItemViewHolder;", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/VDBindingHolder;", "Lcom/iqoption/dialogs/databinding/CustodialScheduleItemBinding;", "Lcom/iqoption/dialogs/custodial/ScheduleItem;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "bind", "", "item", "setWeight", "Landroid/view/View;", "value", "", "dialogs_release"})
/* compiled from: ScheduleItemViewHolder.kt */
public final class e extends com.iqoption.core.ui.widget.recyclerview.a.e<com.iqoption.dialogs.b.e, d> {
    public e(ViewGroup viewGroup) {
        kotlin.jvm.internal.i.f(viewGroup, "parent");
        super(com.iqoption.dialogs.d.e.custodial_schedule_item, viewGroup, null, 4, null);
    }

    public void a(com.iqoption.dialogs.b.e eVar, d dVar) {
        kotlin.jvm.internal.i.f(eVar, "$this$bind");
        kotlin.jvm.internal.i.f(dVar, "item");
        TextView textView = eVar.cMi;
        kotlin.jvm.internal.i.e(textView, "period");
        textView.setText(dVar.auP());
        textView = eVar.cMf;
        kotlin.jvm.internal.i.e(textView, "chargeDate");
        textView.setText(dVar.auQ());
        textView = eVar.cMh;
        String str = "feePercent";
        kotlin.jvm.internal.i.e(textView, str);
        textView.setText(dVar.auR());
        textView = eVar.cMh;
        kotlin.jvm.internal.i.e(textView, str);
        a((View) textView, dVar.auR());
        textView = eVar.cMg;
        str = "feeAmount";
        kotlin.jvm.internal.i.e(textView, str);
        textView.setText(dVar.auS());
        textView = eVar.cMg;
        kotlin.jvm.internal.i.e(textView, str);
        a((View) textView, dVar.auS());
        View root = eVar.getRoot();
        kotlin.jvm.internal.i.e(root, "root");
        root.setActivated(dVar.isHighlighted());
    }

    private final void a(View view, String str) {
        LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof LinearLayout.LayoutParams)) {
            layoutParams = null;
        }
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        if (layoutParams2 != null) {
            layoutParams2.weight = (((CharSequence) str).length() == 0 ? 1 : null) != null ? 0.0f : 1.0f;
        }
    }
}
