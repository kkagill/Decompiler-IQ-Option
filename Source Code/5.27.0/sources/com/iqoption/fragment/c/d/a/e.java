package com.iqoption.fragment.c.d.a;

import android.view.ViewGroup;
import com.iqoption.e.br;
import com.iqoption.fragment.c.a.a;
import com.iqoption.x.R;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0014\u0010\u000b\u001a\u00020\f*\u00020\u00022\u0006\u0010\r\u001a\u00020\u0003H\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, bng = {"Lcom/iqoption/fragment/infoasset/viewholder/conditions/OvernightTitleViewHolder;", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/VDBindingHolder;", "Lcom/iqoption/databinding/AssetOvernightTitleItemBinding;", "Lcom/iqoption/fragment/infoasset/adapters/conditions/AssetOvernightTitle;", "parent", "Landroid/view/ViewGroup;", "uiConfig", "Lcom/iqoption/fragment/infoasset/adapters/UIConfig;", "(Landroid/view/ViewGroup;Lcom/iqoption/fragment/infoasset/adapters/UIConfig;)V", "getUiConfig", "()Lcom/iqoption/fragment/infoasset/adapters/UIConfig;", "bind", "", "item", "app_optionXRelease"})
/* compiled from: OvernightTitleViewHolder.kt */
public final class e extends com.iqoption.core.ui.widget.recyclerview.a.e<br, com.iqoption.fragment.c.a.a.e> {
    private final a dgU;

    public void a(br brVar, com.iqoption.fragment.c.a.a.e eVar) {
        kotlin.jvm.internal.i.f(brVar, "$this$bind");
        kotlin.jvm.internal.i.f(eVar, "item");
    }

    public e(ViewGroup viewGroup, a aVar) {
        kotlin.jvm.internal.i.f(viewGroup, "parent");
        kotlin.jvm.internal.i.f(aVar, "uiConfig");
        super(R.layout.asset_overnight_title_item, viewGroup, null, 4, null);
        this.dgU = aVar;
    }
}
