package com.iqoption.videoeducation.a;

import android.graphics.PorterDuff.Mode;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.RecyclerView.LayoutParams;
import com.iqoption.core.ext.a;
import com.iqoption.core.ui.widget.recyclerview.a.c;
import com.iqoption.videoeducation.g;
import com.iqoption.x.R;
import kotlin.TypeCastException;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, bng = {"Lcom/iqoption/videoeducation/component/VideoCatalogLoadingViewHolder;", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/IQViewHolder;", "Lcom/iqoption/videoeducation/VideoCatalogLoadingItem;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "bind", "", "item", "app_optionXRelease"})
/* compiled from: VideoCatalogLoadingViewHolder.kt */
public final class d extends c<g> {
    /* renamed from: a */
    public void bB(g gVar) {
        kotlin.jvm.internal.i.f(gVar, "item");
    }

    public d(ViewGroup viewGroup) {
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
            int i = a.i(view2, (int) R.dimen.dp32);
            progressBar.setLayoutParams(a.l(i, i, 17));
            progressBar.getIndeterminateDrawable().setColorFilter(a.f(view2, R.color.green), Mode.SRC_IN);
            frameLayout.addView(view2);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout");
    }
}
