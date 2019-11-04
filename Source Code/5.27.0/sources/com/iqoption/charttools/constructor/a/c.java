package com.iqoption.charttools.constructor.a;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.LayoutParams;
import com.iqoption.charttools.n;
import com.iqoption.charttools.n.d;
import com.iqoption.charttools.n.f;
import com.iqoption.core.ext.a;
import kotlin.TypeCastException;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, bng = {"Lcom/iqoption/charttools/constructor/viewholder/ErrorViewHolder;", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/IQViewHolder;", "", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "bind", "", "item", "techtools_release"})
/* compiled from: ErrorViewHolder.kt */
public final class c extends com.iqoption.core.ui.widget.recyclerview.a.c<Object> {
    public void bB(Object obj) {
    }

    public c(ViewGroup viewGroup) {
        kotlin.jvm.internal.i.f(viewGroup, "parent");
        super(new TextView(viewGroup.getContext()), null, 2, null);
        View view = this.itemView;
        if (view != null) {
            TextView textView = (TextView) view;
            textView.setLayoutParams(new LayoutParams(-1, -1));
            textView.setGravity(17);
            View view2 = textView;
            int i = a.i(view2, d.dp16);
            textView.setPadding(i, 0, i, 0);
            textView.setText(n.i.we_did_not_get_enough_data_to_display_indicator);
            textView.setTextColor(a.f(view2, com.iqoption.charttools.n.c.grey_blue_50));
            textView.setTextSize(0, a.h(view2, d.sp16));
            textView.setTypeface(a.j(view2, f.medium));
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.TextView");
    }
}