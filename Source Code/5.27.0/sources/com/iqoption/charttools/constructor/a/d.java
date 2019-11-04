package com.iqoption.charttools.constructor.a;

import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.plus.PlusShare;
import com.iqoption.charttools.constructor.m;
import com.iqoption.charttools.n.h;
import com.iqoption.core.ui.widget.recyclerview.a.e;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\u00020\b*\u00020\u00022\u0006\u0010\t\u001a\u00020\u0003H\u0016¨\u0006\n"}, bng = {"Lcom/iqoption/charttools/constructor/viewholder/GroupDescriptionViewHolder;", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/VDBindingHolder;", "Lcom/iqoption/charttools/databinding/IndicatorConstructorGroupDescriptionItemBinding;", "Lcom/iqoption/charttools/constructor/InputGroupDescription;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "bind", "", "item", "techtools_release"})
/* compiled from: GroupDescriptionViewHolder.kt */
public final class d extends e<com.iqoption.charttools.b.i, m> {
    public d(ViewGroup viewGroup) {
        kotlin.jvm.internal.i.f(viewGroup, "parent");
        super(h.indicator_constructor_group_description_item, viewGroup, null, 4, null);
    }

    public void a(com.iqoption.charttools.b.i iVar, m mVar) {
        kotlin.jvm.internal.i.f(iVar, "$this$bind");
        kotlin.jvm.internal.i.f(mVar, "item");
        TextView textView = iVar.aIr;
        kotlin.jvm.internal.i.e(textView, PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_DESCRIPTION);
        textView.setText(mVar.getText());
    }
}
