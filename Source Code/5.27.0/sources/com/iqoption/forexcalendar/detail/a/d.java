package com.iqoption.forexcalendar.detail.a;

import android.view.View;
import android.view.ViewGroup;
import com.iqoption.core.ext.g;
import com.iqoption.core.ui.widget.recyclerview.a.e;
import com.iqoption.forexcalendar.r;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0014\u0010\u000b\u001a\u00020\f*\u00020\u00022\u0006\u0010\r\u001a\u00020\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, bng = {"Lcom/iqoption/forexcalendar/detail/assetsaffected/AssetAffectedItemViewHolder;", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/VDBindingHolder;", "Lcom/iqoption/forexcalendar/databinding/AssetAffectedItemBinding;", "Lcom/iqoption/forexcalendar/detail/assetsaffected/AssetAffectedItem;", "callback", "Lcom/iqoption/forexcalendar/detail/assetsaffected/AssetAffectedItemViewHolder$Callback;", "parent", "Landroid/view/ViewGroup;", "data", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/AdapterData;", "(Lcom/iqoption/forexcalendar/detail/assetsaffected/AssetAffectedItemViewHolder$Callback;Landroid/view/ViewGroup;Lcom/iqoption/core/ui/widget/recyclerview/viewholder/AdapterData;)V", "bind", "", "item", "Callback", "forexcalendar_release"})
/* compiled from: AssetAffectedItemViewHolder.kt */
public final class d extends e<com.iqoption.forexcalendar.a.a, c> {
    private final a cTK;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, bng = {"Lcom/iqoption/forexcalendar/detail/assetsaffected/AssetAffectedItemViewHolder$Callback;", "", "onClickItem", "", "item", "Lcom/iqoption/forexcalendar/detail/assetsaffected/AssetAffectedItem;", "forexcalendar_release"})
    /* compiled from: AssetAffectedItemViewHolder.kt */
    public interface a {
        void a(c cVar);
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, bng = {"com/iqoption/forexcalendar/detail/assetsaffected/AssetAffectedItemViewHolder$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "forexcalendar_release"})
    /* compiled from: AssetAffectedItemViewHolder.kt */
    /* renamed from: com.iqoption.forexcalendar.detail.a.d$1 */
    public static final class AnonymousClass1 extends g {
        final /* synthetic */ d cTL;

        AnonymousClass1(d dVar) {
            this.cTL = dVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            c cVar = (c) this.cTL.and();
            if (cVar != null) {
                this.cTL.cTK.a(cVar);
            }
        }
    }

    public d(a aVar, ViewGroup viewGroup, com.iqoption.core.ui.widget.recyclerview.a.a aVar2) {
        kotlin.jvm.internal.i.f(aVar, "callback");
        kotlin.jvm.internal.i.f(viewGroup, "parent");
        kotlin.jvm.internal.i.f(aVar2, "data");
        super(r.e.asset_affected_item, viewGroup, aVar2);
        this.cTK = aVar;
        ((com.iqoption.forexcalendar.a.a) getBinding()).getRoot().setOnClickListener(new AnonymousClass1(this));
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x009f  */
    public void a(com.iqoption.forexcalendar.a.a r13, com.iqoption.forexcalendar.detail.a.c r14) {
        /*
        r12 = this;
        r0 = "$this$bind";
        kotlin.jvm.internal.i.f(r13, r0);
        r0 = "item";
        kotlin.jvm.internal.i.f(r14, r0);
        r0 = r12.itemView;
        r1 = "itemView";
        kotlin.jvm.internal.i.e(r0, r1);
        r0 = r0.getContext();
        r1 = r13.amZ;
        r2 = "name";
        kotlin.jvm.internal.i.e(r1, r2);
        r2 = r14.Jt();
        r2 = com.iqoption.core.microservices.tradingengine.response.active.d.B(r2);
        r2 = (java.lang.CharSequence) r2;
        r1.setText(r2);
        r1 = r14.Jt();
        r1 = r1.getImage();
        r1 = (java.lang.CharSequence) r1;
        r1 = r1.length();
        if (r1 <= 0) goto L_0x003b;
    L_0x0039:
        r1 = 1;
        goto L_0x003c;
    L_0x003b:
        r1 = 0;
    L_0x003c:
        if (r1 == 0) goto L_0x0053;
    L_0x003e:
        r1 = com.squareup.picasso.Picasso.with(r0);
        r2 = r14.Jt();
        r2 = r2.getImage();
        r1 = r1.load(r2);
        r2 = r13.aRh;
        r1.into(r2);
    L_0x0053:
        r1 = r13.bWT;
        r2 = "rate";
        kotlin.jvm.internal.i.e(r1, r2);
        r2 = com.iqoption.core.microservices.f.a.a.a.bzg;
        r3 = r14.awQ();
        r2 = r2.g(r3);
        r3 = "";
        if (r2 == 0) goto L_0x0083;
    L_0x0068:
        r2 = (java.lang.Number) r2;
        r4 = r2.doubleValue();
        r2 = r14.Jt();
        r2 = r2.getPrecision();
        r2 = com.iqoption.core.util.j.fr(r2);
        r2 = r2.format(r4);
        if (r2 == 0) goto L_0x0083;
    L_0x0080:
        r2 = (java.lang.CharSequence) r2;
        goto L_0x0086;
    L_0x0083:
        r2 = r3;
        r2 = (java.lang.CharSequence) r2;
    L_0x0086:
        r1.setText(r2);
        r1 = com.iqoption.core.d.EB();
        r4 = r1.If();
        r1 = r14.Jt();
        r1 = r1.aX(r4);
        r2 = "closedConteiner";
        r11 = "diff";
        if (r1 == 0) goto L_0x00fd;
    L_0x009f:
        r1 = r13.cTa;
        kotlin.jvm.internal.i.e(r1, r2);
        r1 = (android.view.View) r1;
        com.iqoption.core.ext.a.al(r1);
        r1 = r13.amZ;
        r2 = r13;
        r2 = (androidx.databinding.ViewDataBinding) r2;
        r4 = com.iqoption.forexcalendar.r.b.white;
        r2 = com.iqoption.core.ext.a.a(r2, r4);
        r1.setTextColor(r2);
        r1 = r13.bXv;
        kotlin.jvm.internal.i.e(r1, r11);
        r2 = com.iqoption.core.microservices.f.a.a.a.bzg;
        r14 = r14.awQ();
        r14 = r2.f(r14);
        if (r14 == 0) goto L_0x00ec;
    L_0x00c8:
        r14 = (java.lang.Number) r14;
        r4 = r14.doubleValue();
        r14 = r13.bXv;
        r2 = com.iqoption.asset.a.a.awY;
        r6 = "context";
        kotlin.jvm.internal.i.e(r0, r6);
        r6 = java.lang.Double.valueOf(r4);
        r0 = r2.a(r0, r6);
        r14.setTextColor(r0);
        r14 = 2;
        r14 = com.iqoption.core.util.af.h(r4, r14);
        if (r14 == 0) goto L_0x00ec;
    L_0x00e9:
        r14 = (java.lang.CharSequence) r14;
        goto L_0x00ef;
    L_0x00ec:
        r14 = r3;
        r14 = (java.lang.CharSequence) r14;
    L_0x00ef:
        r1.setText(r14);
        r13 = r13.bXv;
        kotlin.jvm.internal.i.e(r13, r11);
        r13 = (android.view.View) r13;
        com.iqoption.core.ext.a.ak(r13);
        goto L_0x015c;
    L_0x00fd:
        r14 = r14.Jt();
        r6 = r14.aY(r4);
        r0 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
        r14 = "timeContainer";
        r3 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1));
        if (r3 != 0) goto L_0x011c;
    L_0x0111:
        r0 = r13.ckT;
        kotlin.jvm.internal.i.e(r0, r14);
        r0 = (android.view.View) r0;
        com.iqoption.core.ext.a.al(r0);
        goto L_0x013a;
    L_0x011c:
        r0 = r13.ale;
        r1 = "timeValue";
        kotlin.jvm.internal.i.e(r0, r1);
        r8 = 0;
        r9 = 4;
        r10 = 0;
        r1 = com.iqoption.core.util.TimeUtil.a(r4, r6, r8, r9, r10);
        r1 = (java.lang.CharSequence) r1;
        r0.setText(r1);
        r0 = r13.ckT;
        kotlin.jvm.internal.i.e(r0, r14);
        r0 = (android.view.View) r0;
        com.iqoption.core.ext.a.ak(r0);
    L_0x013a:
        r14 = r13.amZ;
        r0 = r13;
        r0 = (androidx.databinding.ViewDataBinding) r0;
        r1 = com.iqoption.forexcalendar.r.b.grey_blur_70;
        r0 = com.iqoption.core.ext.a.a(r0, r1);
        r14.setTextColor(r0);
        r14 = r13.cTa;
        kotlin.jvm.internal.i.e(r14, r2);
        r14 = (android.view.View) r14;
        com.iqoption.core.ext.a.ak(r14);
        r13 = r13.bXv;
        kotlin.jvm.internal.i.e(r13, r11);
        r13 = (android.view.View) r13;
        com.iqoption.core.ext.a.al(r13);
    L_0x015c:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.forexcalendar.detail.a.d.a(com.iqoption.forexcalendar.a.a, com.iqoption.forexcalendar.detail.a.c):void");
    }
}
