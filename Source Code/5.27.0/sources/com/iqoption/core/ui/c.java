package com.iqoption.core.ui;

import android.graphics.PorterDuff.Mode;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.RecyclerView.LayoutParams;
import com.iqoption.core.ext.a;
import com.iqoption.core.i.d;
import kotlin.TypeCastException;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, bng = {"Lcom/iqoption/core/ui/LoadingViewHolder;", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/IQViewHolder;", "", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "bind", "", "item", "core_release"})
/* compiled from: LoadingViewHolder.kt */
public final class c extends com.iqoption.core.ui.widget.recyclerview.a.c<Object> {
    public void bB(Object obj) {
    }

    public c(ViewGroup viewGroup) {
        kotlin.jvm.internal.i.f(viewGroup, "parent");
        super(new FrameLayout(viewGroup.getContext()), null, 2, null);
        View view = this.itemView;
        kotlin.jvm.internal.i.e(view, "itemView");
        view.setLayoutParams(new LayoutParams(-1, -1));
        view = this.itemView;
        if (view != null) {
            FrameLayout frameLayout = (FrameLayout) view;
            ProgressBar progressBar = new ProgressBar(viewGroup.getContext());
            View view2 = progressBar;
            int i = a.i(view2, d.dp48);
            progressBar.setLayoutParams(a.l(i, i, 17));
            progressBar.getIndeterminateDrawable().setColorFilter(a.f(view2, com.iqoption.core.i.c.green), Mode.SRC_IN);
            frameLayout.addView(view2);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout");
    }
}
