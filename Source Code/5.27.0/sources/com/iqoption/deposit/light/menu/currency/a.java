package com.iqoption.deposit.light.menu.currency;

import android.view.ViewGroup;
import com.iqoption.deposit.b.ah;
import com.iqoption.deposit.c.b.d;
import com.iqoption.deposit.o.f;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, bng = {"Lcom/iqoption/deposit/light/menu/currency/CurrenciesLightAdapter;", "Lcom/iqoption/core/ui/widget/recyclerview/adapter/IQAdapter;", "Lcom/iqoption/deposit/light/menu/currency/CurrencyLightViewHolder;", "Lcom/iqoption/deposit/menu/currency/CurrencyAdapterItem;", "clickListener", "Lcom/iqoption/deposit/menu/method/OnCurrencyClickListener;", "(Lcom/iqoption/deposit/menu/method/OnCurrencyClickListener;)V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "deposit_release"})
/* compiled from: CurrenciesLightAdapter.kt */
public final class a extends com.iqoption.core.ui.widget.recyclerview.adapter.a<b, com.iqoption.deposit.c.a.a> {
    private final d cEX;

    public a(d dVar) {
        kotlin.jvm.internal.i.f(dVar, "clickListener");
        this.cEX = dVar;
    }

    /* renamed from: v */
    public b onCreateViewHolder(ViewGroup viewGroup, int i) {
        kotlin.jvm.internal.i.f(viewGroup, "parent");
        return new b((ah) com.iqoption.core.ext.a.a(viewGroup, f.item_currency_light, null, false, 6, null), this.cEX);
    }

    /* renamed from: a */
    public void onBindViewHolder(b bVar, int i) {
        kotlin.jvm.internal.i.f(bVar, "holder");
        bVar.a((com.iqoption.deposit.c.a.a) fp(i));
    }
}
