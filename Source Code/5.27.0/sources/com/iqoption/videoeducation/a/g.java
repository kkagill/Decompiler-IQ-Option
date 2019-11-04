package com.iqoption.videoeducation.a;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.LayoutParams;
import com.iqoption.core.ext.a;
import com.iqoption.core.ui.widget.recyclerview.a.c;
import com.iqoption.videoeducation.e;
import com.iqoption.x.R;
import kotlin.TypeCastException;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, bng = {"Lcom/iqoption/videoeducation/component/VideoEmptyViewHolder;", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/IQViewHolder;", "Lcom/iqoption/videoeducation/VideoCatalogErrorItem;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "bind", "", "item", "app_optionXRelease"})
/* compiled from: VideoEmptyViewHolder.kt */
public final class g extends c<e> {
    /* renamed from: a */
    public void bB(e eVar) {
        kotlin.jvm.internal.i.f(eVar, "item");
    }

    public g(ViewGroup viewGroup) {
        kotlin.jvm.internal.i.f(viewGroup, "parent");
        super(new TextView(viewGroup.getContext()), null, 2, null);
        View view = this.itemView;
        if (view != null) {
            TextView textView = (TextView) view;
            LayoutParams layoutParams = new LayoutParams(-1, -2);
            View view2 = textView;
            layoutParams.setMargins(0, a.i(view2, (int) R.dimen.dp44), 0, 0);
            textView.setLayoutParams(layoutParams);
            textView.setGravity(17);
            int i = a.i(view2, (int) R.dimen.dp16);
            textView.setPadding(i, 0, i, 0);
            textView.setText(R.string.we_have_not_found_anything);
            textView.setTextColor(a.f(view2, R.color.grey_blue_50));
            textView.setTextSize(0, a.h(view2, (int) R.dimen.sp20));
            a.d(textView, (int) R.drawable.ic_aim_empty_search_stub);
            textView.setCompoundDrawablePadding(a.i(view2, (int) R.dimen.dp14));
            textView.setTypeface(a.j(view2, R.font.medium));
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.TextView");
    }
}