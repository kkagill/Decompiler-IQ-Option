package com.iqoption.charttools.e.a;

import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.LayoutParams;
import com.iqoption.charttools.e.q;
import com.iqoption.charttools.n.d;
import com.iqoption.core.ext.a;
import kotlin.TypeCastException;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, bng = {"Lcom/iqoption/charttools/templates/viewholder/TitleViewHolder;", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/IQViewHolder;", "Lcom/iqoption/charttools/templates/TitleItem;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "bind", "", "item", "techtools_release"})
/* compiled from: TitleViewHolder.kt */
public final class c extends com.iqoption.core.ui.widget.recyclerview.a.c<q> {
    public c(ViewGroup viewGroup) {
        kotlin.jvm.internal.i.f(viewGroup, "parent");
        super(new TextView(viewGroup.getContext()), null, 2, null);
        View view = this.itemView;
        if (view != null) {
            TextView textView = (TextView) view;
            View view2 = textView;
            textView.setLayoutParams(new LayoutParams(-1, a.i(view2, d.dp48)));
            int i = a.i(view2, d.dp16);
            textView.setPadding(i, 0, i, 0);
            textView.setGravity(16);
            textView.setTextColor(a.f(view2, com.iqoption.charttools.n.c.grey_blue_70));
            if ((VERSION.SDK_INT >= 21 ? 1 : null) != null) {
                textView.setLetterSpacing(0.01f);
            }
            textView.setTextSize(0, a.h(view2, d.sp16));
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.TextView");
    }

    /* renamed from: a */
    public void bB(q qVar) {
        kotlin.jvm.internal.i.f(qVar, "item");
        View view = this.itemView;
        if (view != null) {
            ((TextView) view).setText(qVar.getText());
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.TextView");
    }
}
