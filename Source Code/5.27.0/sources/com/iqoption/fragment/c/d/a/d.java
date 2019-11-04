package com.iqoption.fragment.c.d.a;

import android.view.ViewGroup;
import com.iqoption.core.ui.widget.recyclerview.a.e;
import com.iqoption.e.bp;
import com.iqoption.fragment.c.a.a;
import com.iqoption.x.R;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0014\u0010\u000b\u001a\u00020\f*\u00020\u00022\u0006\u0010\r\u001a\u00020\u0003H\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, bng = {"Lcom/iqoption/fragment/infoasset/viewholder/conditions/OvernightItemViewHolder;", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/VDBindingHolder;", "Lcom/iqoption/databinding/AssetOvernightItemItemBinding;", "Lcom/iqoption/fragment/infoasset/adapters/conditions/AssetOvernightItem;", "parent", "Landroid/view/ViewGroup;", "uiConfig", "Lcom/iqoption/fragment/infoasset/adapters/UIConfig;", "(Landroid/view/ViewGroup;Lcom/iqoption/fragment/infoasset/adapters/UIConfig;)V", "getUiConfig", "()Lcom/iqoption/fragment/infoasset/adapters/UIConfig;", "bind", "", "item", "app_optionXRelease"})
/* compiled from: OvernightItemViewHolder.kt */
public final class d extends e<bp, com.iqoption.fragment.c.a.a.d> {
    private final a dgU;

    public d(ViewGroup viewGroup, a aVar) {
        kotlin.jvm.internal.i.f(viewGroup, "parent");
        kotlin.jvm.internal.i.f(aVar, "uiConfig");
        super(R.layout.asset_overnight_item_item, viewGroup, null, 4, null);
        this.dgU = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x007e  */
    public void a(com.iqoption.e.bp r14, com.iqoption.fragment.c.a.a.d r15) {
        /*
        r13 = this;
        r0 = "$this$bind";
        kotlin.jvm.internal.i.f(r14, r0);
        r0 = "item";
        kotlin.jvm.internal.i.f(r15, r0);
        r0 = r14.bWY;
        r1 = "day";
        kotlin.jvm.internal.i.e(r0, r1);
        r1 = r15.aDu();
        r1 = (java.lang.CharSequence) r1;
        r0.setText(r1);
        r0 = r14.anj;
        r1 = "time";
        kotlin.jvm.internal.i.e(r0, r1);
        r1 = r15.getTime();
        if (r1 == 0) goto L_0x002d;
    L_0x0028:
        if (r1 == 0) goto L_0x002d;
    L_0x002a:
        r1 = (java.lang.CharSequence) r1;
        goto L_0x0035;
    L_0x002d:
        r1 = r13.dgU;
        r1 = r1.aDm();
        r1 = (java.lang.CharSequence) r1;
    L_0x0035:
        r0.setText(r1);
        r0 = r14.bWX;
        r1 = "buy";
        kotlin.jvm.internal.i.e(r0, r1);
        r1 = r15.aDv();
        r2 = "+";
        r3 = "-";
        r4 = 0;
        if (r1 == 0) goto L_0x0066;
    L_0x004b:
        r1 = (java.lang.Number) r1;
        r6 = r1.doubleValue();
        r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1));
        if (r1 >= 0) goto L_0x0057;
    L_0x0055:
        r8 = r2;
        goto L_0x0058;
    L_0x0057:
        r8 = r3;
    L_0x0058:
        r9 = 4;
        r10 = 0;
        r11 = 8;
        r12 = 0;
        r1 = com.iqoption.core.util.af.a(r6, r8, r9, r10, r11, r12);
        if (r1 == 0) goto L_0x0066;
    L_0x0063:
        r1 = (java.lang.CharSequence) r1;
        goto L_0x006e;
    L_0x0066:
        r1 = r13.dgU;
        r1 = r1.aDm();
        r1 = (java.lang.CharSequence) r1;
    L_0x006e:
        r0.setText(r1);
        r0 = r14.bWZ;
        r1 = "sell";
        kotlin.jvm.internal.i.e(r0, r1);
        r1 = r15.aDw();
        if (r1 == 0) goto L_0x0099;
    L_0x007e:
        r1 = (java.lang.Number) r1;
        r6 = r1.doubleValue();
        r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1));
        if (r1 >= 0) goto L_0x008a;
    L_0x0088:
        r8 = r2;
        goto L_0x008b;
    L_0x008a:
        r8 = r3;
    L_0x008b:
        r9 = 4;
        r10 = 0;
        r11 = 8;
        r12 = 0;
        r1 = com.iqoption.core.util.af.a(r6, r8, r9, r10, r11, r12);
        if (r1 == 0) goto L_0x0099;
    L_0x0096:
        r1 = (java.lang.CharSequence) r1;
        goto L_0x00a1;
    L_0x0099:
        r1 = r13.dgU;
        r1 = r1.aDm();
        r1 = (java.lang.CharSequence) r1;
    L_0x00a1:
        r0.setText(r1);
        r14 = r14.getRoot();
        r0 = "root";
        kotlin.jvm.internal.i.e(r14, r0);
        r15 = r15.aDx();
        r14.setSelected(r15);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.fragment.c.d.a.d.a(com.iqoption.e.bp, com.iqoption.fragment.c.a.a.d):void");
    }
}
