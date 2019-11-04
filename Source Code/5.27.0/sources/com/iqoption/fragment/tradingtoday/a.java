package com.iqoption.fragment.tradingtoday;

import android.view.ViewGroup;
import com.iqoption.e.pb;
import com.iqoption.fragment.tradingtoday.b.b;
import com.iqoption.x.R;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, bng = {"Lcom/iqoption/fragment/tradingtoday/PopularAssetAdapter;", "Lcom/iqoption/core/ui/widget/recyclerview/adapter/IQAdapter;", "Lcom/iqoption/fragment/tradingtoday/PopularAssetHolder;", "Lcom/iqoption/fragment/tradingtoday/PopularAssetItem;", "callback", "Lcom/iqoption/fragment/tradingtoday/PopularAssetHolder$Callback;", "(Lcom/iqoption/fragment/tradingtoday/PopularAssetHolder$Callback;)V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "app_optionXRelease"})
/* compiled from: PopularAssetAdapter.kt */
public final class a extends com.iqoption.core.ui.widget.recyclerview.adapter.a<b, d> {
    private final b dqD;

    public a(b bVar) {
        kotlin.jvm.internal.i.f(bVar, "callback");
        this.dqD = bVar;
    }

    /* renamed from: L */
    public b onCreateViewHolder(ViewGroup viewGroup, int i) {
        kotlin.jvm.internal.i.f(viewGroup, "parent");
        return new b(this.dqD, (pb) com.iqoption.core.ext.a.a(viewGroup, (int) R.layout.item_trending_today, null, false, 6, null));
    }

    /* renamed from: a */
    public void onBindViewHolder(b bVar, int i) {
        kotlin.jvm.internal.i.f(bVar, "holder");
        bVar.a((d) fp(i));
    }
}
