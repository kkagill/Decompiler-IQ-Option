package com.iqoption.core.ui.country;

import android.view.ViewGroup;
import com.iqoption.core.a.j;
import com.iqoption.core.i.h;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, bng = {"Lcom/iqoption/core/ui/country/CountryAdapter;", "Lcom/iqoption/core/ui/widget/recyclerview/adapter/IQAdapter;", "Lcom/iqoption/core/ui/country/CountryHolder;", "Lcom/iqoption/core/ui/country/CountryItem;", "clickListener", "Lcom/iqoption/core/ui/country/OnCountryClickListener;", "(Lcom/iqoption/core/ui/country/OnCountryClickListener;)V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "core_release"})
/* compiled from: CountryAdapter.kt */
public final class a extends com.iqoption.core.ui.widget.recyclerview.adapter.a<b, c> {
    private final h bHW;

    public a(h hVar) {
        kotlin.jvm.internal.i.f(hVar, "clickListener");
        this.bHW = hVar;
    }

    /* renamed from: r */
    public b onCreateViewHolder(ViewGroup viewGroup, int i) {
        kotlin.jvm.internal.i.f(viewGroup, "parent");
        return new b((j) com.iqoption.core.ext.a.a(viewGroup, h.item_country_suggest, null, false, 6, null), this.bHW);
    }

    /* renamed from: a */
    public void onBindViewHolder(b bVar, int i) {
        kotlin.jvm.internal.i.f(bVar, "holder");
        bVar.a((c) fp(i));
    }
}
