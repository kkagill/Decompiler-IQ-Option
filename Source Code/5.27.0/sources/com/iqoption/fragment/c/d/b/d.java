package com.iqoption.fragment.c.d.b;

import android.view.View;
import android.view.ViewGroup;
import com.iqoption.core.ext.g;
import com.iqoption.core.ui.widget.recyclerview.a.e;
import com.iqoption.e.bb;
import com.iqoption.x.R;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0012B%\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0014\u0010\u000f\u001a\u00020\u0010*\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0013"}, bng = {"Lcom/iqoption/fragment/infoasset/viewholder/info/PriceViewHolder;", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/VDBindingHolder;", "Lcom/iqoption/databinding/AssetInfoPriceItemBinding;", "Lcom/iqoption/fragment/infoasset/adapters/info/InfoAssetPrice;", "callback", "Lcom/iqoption/fragment/infoasset/viewholder/info/PriceViewHolder$Callback;", "parent", "Landroid/view/ViewGroup;", "uiConfig", "Lcom/iqoption/fragment/infoasset/adapters/UIConfig;", "data", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/AdapterData;", "(Lcom/iqoption/fragment/infoasset/viewholder/info/PriceViewHolder$Callback;Landroid/view/ViewGroup;Lcom/iqoption/fragment/infoasset/adapters/UIConfig;Lcom/iqoption/core/ui/widget/recyclerview/viewholder/AdapterData;)V", "getUiConfig", "()Lcom/iqoption/fragment/infoasset/adapters/UIConfig;", "bind", "", "item", "Callback", "app_optionXRelease"})
/* compiled from: PriceViewHolder.kt */
public final class d extends e<bb, com.iqoption.fragment.c.a.b.d> {
    private final com.iqoption.fragment.c.a.a dgU;
    private final a dic;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, bng = {"Lcom/iqoption/fragment/infoasset/viewholder/info/PriceViewHolder$Callback;", "", "onItemToggled", "", "item", "Lcom/iqoption/fragment/infoasset/adapters/info/InfoAssetPrice;", "app_optionXRelease"})
    /* compiled from: PriceViewHolder.kt */
    public interface a {
        void a(com.iqoption.fragment.c.a.b.d dVar);
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, bng = {"com/iqoption/fragment/infoasset/viewholder/info/PriceViewHolder$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "app_optionXRelease"})
    /* compiled from: PriceViewHolder.kt */
    /* renamed from: com.iqoption.fragment.c.d.b.d$1 */
    public static final class AnonymousClass1 extends g {
        final /* synthetic */ d did;

        AnonymousClass1(d dVar) {
            this.did = dVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            com.iqoption.fragment.c.a.b.d dVar = (com.iqoption.fragment.c.a.b.d) this.did.and();
            if (dVar != null) {
                this.did.dic.a(dVar);
            }
        }
    }

    public d(a aVar, ViewGroup viewGroup, com.iqoption.fragment.c.a.a aVar2, com.iqoption.core.ui.widget.recyclerview.a.a aVar3) {
        kotlin.jvm.internal.i.f(aVar, "callback");
        kotlin.jvm.internal.i.f(viewGroup, "parent");
        kotlin.jvm.internal.i.f(aVar2, "uiConfig");
        kotlin.jvm.internal.i.f(aVar3, "data");
        super(R.layout.asset_info_price_item, viewGroup, aVar3);
        this.dic = aVar;
        this.dgU = aVar2;
        ((bb) getBinding()).getRoot().setOnClickListener(new AnonymousClass1(this));
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0044  */
    public void a(com.iqoption.e.bb r4, com.iqoption.fragment.c.a.b.d r5) {
        /*
        r3 = this;
        r0 = "$this$bind";
        kotlin.jvm.internal.i.f(r4, r0);
        r0 = "item";
        kotlin.jvm.internal.i.f(r5, r0);
        r0 = r4.bVM;
        r1 = "mktValue";
        kotlin.jvm.internal.i.e(r0, r1);
        r1 = r5.adR();
        if (r1 == 0) goto L_0x002c;
    L_0x0017:
        r1 = r1.aed();
        if (r1 == 0) goto L_0x002c;
    L_0x001d:
        r1 = (java.lang.Number) r1;
        r1 = r1.longValue();
        r1 = com.iqoption.core.util.af.bn(r1);
        if (r1 == 0) goto L_0x002c;
    L_0x0029:
        r1 = (java.lang.CharSequence) r1;
        goto L_0x0034;
    L_0x002c:
        r1 = r3.dgU;
        r1 = r1.aDm();
        r1 = (java.lang.CharSequence) r1;
    L_0x0034:
        r0.setText(r1);
        r4 = r4.bWm;
        r0 = "ratioValue";
        kotlin.jvm.internal.i.e(r4, r0);
        r5 = r5.adR();
        if (r5 == 0) goto L_0x005e;
    L_0x0044:
        r5 = r5.aee();
        if (r5 == 0) goto L_0x005e;
    L_0x004a:
        r5 = (java.lang.Number) r5;
        r0 = r5.doubleValue();
        r5 = 2;
        r5 = com.iqoption.core.util.j.fq(r5);
        r5 = r5.format(r0);
        if (r5 == 0) goto L_0x005e;
    L_0x005b:
        r5 = (java.lang.CharSequence) r5;
        goto L_0x0066;
    L_0x005e:
        r5 = r3.dgU;
        r5 = r5.aDm();
        r5 = (java.lang.CharSequence) r5;
    L_0x0066:
        r4.setText(r5);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.fragment.c.d.b.d.a(com.iqoption.e.bb, com.iqoption.fragment.c.a.b.d):void");
    }
}
