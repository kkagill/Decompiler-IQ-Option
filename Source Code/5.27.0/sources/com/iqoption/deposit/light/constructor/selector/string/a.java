package com.iqoption.deposit.light.constructor.selector.string;

import android.view.ViewGroup;
import com.iqoption.deposit.a.a.b.b;
import com.iqoption.deposit.b.af;
import com.iqoption.deposit.o.f;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, bng = {"Lcom/iqoption/deposit/light/constructor/selector/string/SelectorStringLightAdapter;", "Lcom/iqoption/core/ui/widget/recyclerview/adapter/IQAdapter;", "Lcom/iqoption/deposit/light/constructor/selector/string/SelectorStringLightViewHolder;", "Lcom/iqoption/deposit/constructor/selector/string/SelectorStringAdapterItem;", "itemSelectListener", "Lcom/iqoption/deposit/constructor/selector/string/OnStringItemSelectListener;", "(Lcom/iqoption/deposit/constructor/selector/string/OnStringItemSelectListener;)V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "deposit_release"})
/* compiled from: SelectorStringLightAdapter.kt */
public final class a extends com.iqoption.core.ui.widget.recyclerview.adapter.a<b, b> {
    private final com.iqoption.deposit.a.a.b.a cEP;

    public a(com.iqoption.deposit.a.a.b.a aVar) {
        kotlin.jvm.internal.i.f(aVar, "itemSelectListener");
        this.cEP = aVar;
    }

    /* renamed from: u */
    public b onCreateViewHolder(ViewGroup viewGroup, int i) {
        kotlin.jvm.internal.i.f(viewGroup, "parent");
        return new b((af) com.iqoption.core.ext.a.a(viewGroup, f.item_constructor_spinner_light, null, false, 6, null), this.cEP);
    }

    /* renamed from: a */
    public void onBindViewHolder(b bVar, int i) {
        kotlin.jvm.internal.i.f(bVar, "holder");
        bVar.b((b) fp(i));
    }
}
