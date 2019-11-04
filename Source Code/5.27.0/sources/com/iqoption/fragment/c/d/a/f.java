package com.iqoption.fragment.c.d.a;

import android.view.View;
import android.view.ViewGroup;
import com.iqoption.core.ext.g;
import com.iqoption.core.ui.widget.recyclerview.a.e;
import com.iqoption.e.bt;
import com.iqoption.x.R;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0014B%\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0014\u0010\u0011\u001a\u00020\u0012*\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0003H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0015"}, bng = {"Lcom/iqoption/fragment/infoasset/viewholder/conditions/OvernightTodayViewHolder;", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/VDBindingHolder;", "Lcom/iqoption/databinding/AssetOvernightTodayItemBinding;", "Lcom/iqoption/fragment/infoasset/adapters/conditions/AssetOvernightToday;", "callback", "Lcom/iqoption/fragment/infoasset/viewholder/conditions/OvernightTodayViewHolder$Callback;", "parent", "Landroid/view/ViewGroup;", "uiConfig", "Lcom/iqoption/fragment/infoasset/adapters/UIConfig;", "data", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/AdapterData;", "(Lcom/iqoption/fragment/infoasset/viewholder/conditions/OvernightTodayViewHolder$Callback;Landroid/view/ViewGroup;Lcom/iqoption/fragment/infoasset/adapters/UIConfig;Lcom/iqoption/core/ui/widget/recyclerview/viewholder/AdapterData;)V", "getCallback", "()Lcom/iqoption/fragment/infoasset/viewholder/conditions/OvernightTodayViewHolder$Callback;", "getUiConfig", "()Lcom/iqoption/fragment/infoasset/adapters/UIConfig;", "bind", "", "item", "Callback", "app_optionXRelease"})
/* compiled from: OvernightTodayViewHolder.kt */
public final class f extends e<bt, com.iqoption.fragment.c.a.a.f> {
    private final com.iqoption.fragment.c.a.a dgU;
    private final a dhW;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, bng = {"Lcom/iqoption/fragment/infoasset/viewholder/conditions/OvernightTodayViewHolder$Callback;", "", "onTodayOvernightClick", "", "app_optionXRelease"})
    /* compiled from: OvernightTodayViewHolder.kt */
    public interface a {
        void aDR();
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, bng = {"com/iqoption/fragment/infoasset/viewholder/conditions/OvernightTodayViewHolder$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "app_optionXRelease"})
    /* compiled from: OvernightTodayViewHolder.kt */
    /* renamed from: com.iqoption.fragment.c.d.a.f$1 */
    public static final class AnonymousClass1 extends g {
        final /* synthetic */ f dhX;

        AnonymousClass1(f fVar) {
            this.dhX = fVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            if (((com.iqoption.fragment.c.a.a.f) this.dhX.and()) != null) {
                this.dhX.aEb().aDR();
            }
        }
    }

    public final a aEb() {
        return this.dhW;
    }

    public f(a aVar, ViewGroup viewGroup, com.iqoption.fragment.c.a.a aVar2, com.iqoption.core.ui.widget.recyclerview.a.a aVar3) {
        kotlin.jvm.internal.i.f(aVar, "callback");
        kotlin.jvm.internal.i.f(viewGroup, "parent");
        kotlin.jvm.internal.i.f(aVar2, "uiConfig");
        kotlin.jvm.internal.i.f(aVar3, "data");
        super(R.layout.asset_overnight_today_item, viewGroup, aVar3);
        this.dhW = aVar;
        this.dgU = aVar2;
        ((bt) getBinding()).bXe.setOnClickListener(new AnonymousClass1(this));
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0050  */
    public void a(com.iqoption.e.bt r14, com.iqoption.fragment.c.a.a.f r15) {
        /*
        r13 = this;
        r0 = "$this$bind";
        kotlin.jvm.internal.i.f(r14, r0);
        r0 = "item";
        kotlin.jvm.internal.i.f(r15, r0);
        r0 = r14.bWX;
        r1 = "buy";
        kotlin.jvm.internal.i.e(r0, r1);
        r1 = r15.aDy();
        r2 = "+";
        r3 = "-";
        r4 = 0;
        if (r1 == 0) goto L_0x0038;
    L_0x001d:
        r1 = (java.lang.Number) r1;
        r6 = r1.doubleValue();
        r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1));
        if (r1 >= 0) goto L_0x0029;
    L_0x0027:
        r8 = r2;
        goto L_0x002a;
    L_0x0029:
        r8 = r3;
    L_0x002a:
        r9 = 4;
        r10 = 0;
        r11 = 8;
        r12 = 0;
        r1 = com.iqoption.core.util.af.a(r6, r8, r9, r10, r11, r12);
        if (r1 == 0) goto L_0x0038;
    L_0x0035:
        r1 = (java.lang.CharSequence) r1;
        goto L_0x0040;
    L_0x0038:
        r1 = r13.dgU;
        r1 = r1.aDm();
        r1 = (java.lang.CharSequence) r1;
    L_0x0040:
        r0.setText(r1);
        r14 = r14.bWZ;
        r0 = "sell";
        kotlin.jvm.internal.i.e(r14, r0);
        r15 = r15.aDz();
        if (r15 == 0) goto L_0x006b;
    L_0x0050:
        r15 = (java.lang.Number) r15;
        r6 = r15.doubleValue();
        r15 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1));
        if (r15 >= 0) goto L_0x005c;
    L_0x005a:
        r8 = r2;
        goto L_0x005d;
    L_0x005c:
        r8 = r3;
    L_0x005d:
        r9 = 4;
        r10 = 0;
        r11 = 8;
        r12 = 0;
        r15 = com.iqoption.core.util.af.a(r6, r8, r9, r10, r11, r12);
        if (r15 == 0) goto L_0x006b;
    L_0x0068:
        r15 = (java.lang.CharSequence) r15;
        goto L_0x0073;
    L_0x006b:
        r15 = r13.dgU;
        r15 = r15.aDm();
        r15 = (java.lang.CharSequence) r15;
    L_0x0073:
        r14.setText(r15);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.fragment.c.d.a.f.a(com.iqoption.e.bt, com.iqoption.fragment.c.a.a.f):void");
    }
}
