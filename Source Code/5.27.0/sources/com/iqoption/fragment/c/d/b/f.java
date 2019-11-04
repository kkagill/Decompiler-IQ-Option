package com.iqoption.fragment.c.d.b;

import android.view.View;
import android.view.ViewGroup;
import com.iqoption.core.ext.g;
import com.iqoption.core.ui.widget.recyclerview.a.e;
import com.iqoption.e.bh;
import com.iqoption.x.R;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0010B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0014\u0010\r\u001a\u00020\u000e*\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0003H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0011"}, bng = {"Lcom/iqoption/fragment/infoasset/viewholder/info/StatisticsMoreViewHolder;", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/VDBindingHolder;", "Lcom/iqoption/databinding/AssetInfoStatisticsMoreItemBinding;", "Lcom/iqoption/fragment/infoasset/adapters/info/InfoAssetStatisticsMore;", "callback", "Lcom/iqoption/fragment/infoasset/viewholder/info/StatisticsMoreViewHolder$Callback;", "parent", "Landroid/view/ViewGroup;", "data", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/AdapterData;", "(Lcom/iqoption/fragment/infoasset/viewholder/info/StatisticsMoreViewHolder$Callback;Landroid/view/ViewGroup;Lcom/iqoption/core/ui/widget/recyclerview/viewholder/AdapterData;)V", "getCallback", "()Lcom/iqoption/fragment/infoasset/viewholder/info/StatisticsMoreViewHolder$Callback;", "bind", "", "item", "Callback", "app_optionXRelease"})
/* compiled from: StatisticsMoreViewHolder.kt */
public final class f extends e<bh, com.iqoption.fragment.c.a.b.i> {
    private final a dig;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, bng = {"Lcom/iqoption/fragment/infoasset/viewholder/info/StatisticsMoreViewHolder$Callback;", "", "onMoreStatisticsClick", "", "item", "Lcom/iqoption/fragment/infoasset/adapters/info/InfoAssetStatisticsMore;", "app_optionXRelease"})
    /* compiled from: StatisticsMoreViewHolder.kt */
    public interface a {
        void a(com.iqoption.fragment.c.a.b.i iVar);
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, bng = {"com/iqoption/fragment/infoasset/viewholder/info/StatisticsMoreViewHolder$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "app_optionXRelease"})
    /* compiled from: StatisticsMoreViewHolder.kt */
    /* renamed from: com.iqoption.fragment.c.d.b.f$1 */
    public static final class AnonymousClass1 extends g {
        final /* synthetic */ f dih;

        AnonymousClass1(f fVar) {
            this.dih = fVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            com.iqoption.fragment.c.a.b.i iVar = (com.iqoption.fragment.c.a.b.i) this.dih.and();
            if (iVar != null) {
                this.dih.aEd().a(iVar);
            }
        }
    }

    public void a(bh bhVar, com.iqoption.fragment.c.a.b.i iVar) {
        kotlin.jvm.internal.i.f(bhVar, "$this$bind");
        kotlin.jvm.internal.i.f(iVar, "item");
    }

    public final a aEd() {
        return this.dig;
    }

    public f(a aVar, ViewGroup viewGroup, com.iqoption.core.ui.widget.recyclerview.a.a aVar2) {
        kotlin.jvm.internal.i.f(aVar, "callback");
        kotlin.jvm.internal.i.f(viewGroup, "parent");
        kotlin.jvm.internal.i.f(aVar2, "data");
        super(R.layout.asset_info_statistics_more_item, viewGroup, aVar2);
        this.dig = aVar;
        ((bh) getBinding()).getRoot().setOnClickListener(new AnonymousClass1(this));
    }
}
