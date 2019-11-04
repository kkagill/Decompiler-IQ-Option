package com.iqoption.fragment.c.d.b;

import android.view.View;
import android.view.ViewGroup;
import com.iqoption.core.ext.g;
import com.iqoption.core.ui.widget.recyclerview.a.e;
import com.iqoption.e.az;
import com.iqoption.fragment.c.a.b.f;
import com.iqoption.x.R;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0012B%\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0014\u0010\u000f\u001a\u00020\u0010*\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0013"}, bng = {"Lcom/iqoption/fragment/infoasset/viewholder/info/PriceFullViewHolder;", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/VDBindingHolder;", "Lcom/iqoption/databinding/AssetInfoPriceFullItemBinding;", "Lcom/iqoption/fragment/infoasset/adapters/info/InfoAssetPriceFull;", "callback", "Lcom/iqoption/fragment/infoasset/viewholder/info/PriceFullViewHolder$Callback;", "parent", "Landroid/view/ViewGroup;", "uiConfig", "Lcom/iqoption/fragment/infoasset/adapters/UIConfig;", "data", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/AdapterData;", "(Lcom/iqoption/fragment/infoasset/viewholder/info/PriceFullViewHolder$Callback;Landroid/view/ViewGroup;Lcom/iqoption/fragment/infoasset/adapters/UIConfig;Lcom/iqoption/core/ui/widget/recyclerview/viewholder/AdapterData;)V", "getUiConfig", "()Lcom/iqoption/fragment/infoasset/adapters/UIConfig;", "bind", "", "item", "Callback", "app_optionXRelease"})
/* compiled from: PriceFullViewHolder.kt */
public final class c extends e<az, f> {
    private final com.iqoption.fragment.c.a.a dgU;
    private final a dia;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, bng = {"Lcom/iqoption/fragment/infoasset/viewholder/info/PriceFullViewHolder$Callback;", "", "onItemToggled", "", "item", "Lcom/iqoption/fragment/infoasset/adapters/info/InfoAssetPriceFull;", "app_optionXRelease"})
    /* compiled from: PriceFullViewHolder.kt */
    public interface a {
        void a(f fVar);
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, bng = {"com/iqoption/fragment/infoasset/viewholder/info/PriceFullViewHolder$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "app_optionXRelease"})
    /* compiled from: PriceFullViewHolder.kt */
    /* renamed from: com.iqoption.fragment.c.d.b.c$1 */
    public static final class AnonymousClass1 extends g {
        final /* synthetic */ c dib;

        AnonymousClass1(c cVar) {
            this.dib = cVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            f fVar = (f) this.dib.and();
            if (fVar != null) {
                this.dib.dia.a(fVar);
            }
        }
    }

    public c(a aVar, ViewGroup viewGroup, com.iqoption.fragment.c.a.a aVar2, com.iqoption.core.ui.widget.recyclerview.a.a aVar3) {
        kotlin.jvm.internal.i.f(aVar, "callback");
        kotlin.jvm.internal.i.f(viewGroup, "parent");
        kotlin.jvm.internal.i.f(aVar2, "uiConfig");
        kotlin.jvm.internal.i.f(aVar3, "data");
        super(R.layout.asset_info_price_full_item, viewGroup, aVar3);
        this.dia = aVar;
        this.dgU = aVar2;
        ((az) getBinding()).getRoot().setOnClickListener(new AnonymousClass1(this));
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x026c  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x027d  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0235  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0233  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0246  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x026c  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x027d  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01fa  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01f8  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x020b  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0233  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0235  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0246  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x026c  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x027d  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01bf  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01bd  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01d0  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01f8  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01fa  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x020b  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0235  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0233  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0246  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x026c  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x027d  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0182  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0195  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01bd  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01bf  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01d0  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01fa  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01f8  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x020b  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0233  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0235  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0246  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x026c  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x027d  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0182  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0195  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01bf  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01bd  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01d0  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01f8  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01fa  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x020b  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0235  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0233  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0246  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x026c  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x027d  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0182  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0195  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01bd  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01bf  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01d0  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01fa  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01f8  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x020b  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0233  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0235  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0246  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x026c  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x027d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0182  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0195  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01bf  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01bd  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01d0  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01f8  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01fa  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x020b  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0235  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0233  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0246  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x026c  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x027d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0182  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0195  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01bd  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01bf  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01d0  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01fa  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01f8  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x020b  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0233  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0235  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0246  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x026c  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x027d  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0182  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0195  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01bf  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01bd  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01d0  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01f8  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01fa  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x020b  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0235  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0233  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0246  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x026c  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x027d  */
    public void a(com.iqoption.e.az r13, com.iqoption.fragment.c.a.b.f r14) {
        /*
        r12 = this;
        r0 = "$this$bind";
        kotlin.jvm.internal.i.f(r13, r0);
        r0 = "item";
        kotlin.jvm.internal.i.f(r14, r0);
        r14 = r14.adR();
        if (r14 == 0) goto L_0x0298;
    L_0x0010:
        r0 = r12.dgU;
        r0 = r0.aDm();
        r1 = r13.bWi;
        r2 = "volumeContainer";
        kotlin.jvm.internal.i.e(r1, r2);
        r1 = (android.view.View) r1;
        r2 = r14.aei();
        r3 = 1;
        r4 = 0;
        if (r2 == 0) goto L_0x002a;
    L_0x0028:
        r2 = 1;
        goto L_0x002b;
    L_0x002a:
        r2 = 0;
    L_0x002b:
        com.iqoption.core.ext.a.d(r1, r2);
        r1 = r13.bWh;
        r2 = "volume";
        kotlin.jvm.internal.i.e(r1, r2);
        r2 = r14.aei();
        if (r2 == 0) goto L_0x004b;
    L_0x003c:
        r2 = (java.lang.Number) r2;
        r5 = r2.longValue();
        r2 = com.iqoption.core.util.af.bn(r5);
        if (r2 == 0) goto L_0x004b;
    L_0x0048:
        r2 = (java.lang.CharSequence) r2;
        goto L_0x004e;
    L_0x004b:
        r2 = r0;
        r2 = (java.lang.CharSequence) r2;
    L_0x004e:
        r1.setText(r2);
        r1 = r13.bVX;
        r2 = "mktContainer";
        kotlin.jvm.internal.i.e(r1, r2);
        r1 = (android.view.View) r1;
        r2 = r14.aed();
        if (r2 == 0) goto L_0x0062;
    L_0x0060:
        r2 = 1;
        goto L_0x0063;
    L_0x0062:
        r2 = 0;
    L_0x0063:
        com.iqoption.core.ext.a.d(r1, r2);
        r1 = r13.bVW;
        r2 = "mktCap";
        kotlin.jvm.internal.i.e(r1, r2);
        r2 = r14.aed();
        if (r2 == 0) goto L_0x0082;
    L_0x0073:
        r2 = (java.lang.Number) r2;
        r5 = r2.longValue();
        r2 = com.iqoption.core.util.af.bn(r5);
        if (r2 == 0) goto L_0x0082;
    L_0x007f:
        r2 = (java.lang.CharSequence) r2;
        goto L_0x0085;
    L_0x0082:
        r2 = r0;
        r2 = (java.lang.CharSequence) r2;
    L_0x0085:
        r1.setText(r2);
        r1 = r13.bWj;
        r2 = "yearlyContainer";
        kotlin.jvm.internal.i.e(r1, r2);
        r1 = (android.view.View) r1;
        r2 = r14.aec();
        if (r2 == 0) goto L_0x009a;
    L_0x0098:
        r2 = 1;
        goto L_0x009b;
    L_0x009a:
        r2 = 0;
    L_0x009b:
        com.iqoption.core.ext.a.d(r1, r2);
        r1 = r13.bWk;
        r2 = "yearlyEps";
        kotlin.jvm.internal.i.e(r1, r2);
        r2 = r14.aec();
        if (r2 == 0) goto L_0x00b9;
    L_0x00ac:
        r5 = r2.doubleValue();
        r2 = com.iqoption.core.util.e.q(r5);
        if (r2 == 0) goto L_0x00b9;
    L_0x00b6:
        r2 = (java.lang.CharSequence) r2;
        goto L_0x00bc;
    L_0x00b9:
        r2 = r0;
        r2 = (java.lang.CharSequence) r2;
    L_0x00bc:
        r1.setText(r2);
        r1 = r13.bVT;
        r2 = "dividendContainer";
        kotlin.jvm.internal.i.e(r1, r2);
        r1 = (android.view.View) r1;
        r2 = r14.aeb();
        if (r2 == 0) goto L_0x00d0;
    L_0x00ce:
        r2 = 1;
        goto L_0x00d1;
    L_0x00d0:
        r2 = 0;
    L_0x00d1:
        com.iqoption.core.ext.a.d(r1, r2);
        r1 = r13.bVS;
        r2 = "dividend";
        kotlin.jvm.internal.i.e(r1, r2);
        r2 = r14.aeb();
        r5 = 2;
        if (r2 == 0) goto L_0x00f5;
    L_0x00e2:
        r2 = (java.lang.Number) r2;
        r6 = r2.doubleValue();
        r2 = com.iqoption.core.util.j.fq(r5);
        r2 = r2.format(r6);
        if (r2 == 0) goto L_0x00f5;
    L_0x00f2:
        r2 = (java.lang.CharSequence) r2;
        goto L_0x00f8;
    L_0x00f5:
        r2 = r0;
        r2 = (java.lang.CharSequence) r2;
    L_0x00f8:
        r1.setText(r2);
        r1 = r13.bVZ;
        r2 = "peRatioContainer";
        kotlin.jvm.internal.i.e(r1, r2);
        r1 = (android.view.View) r1;
        r2 = r14.aee();
        if (r2 == 0) goto L_0x010c;
    L_0x010a:
        r2 = 1;
        goto L_0x010d;
    L_0x010c:
        r2 = 0;
    L_0x010d:
        com.iqoption.core.ext.a.d(r1, r2);
        r1 = r13.bVY;
        r2 = "peRatio";
        kotlin.jvm.internal.i.e(r1, r2);
        r2 = r14.aee();
        if (r2 == 0) goto L_0x0130;
    L_0x011d:
        r2 = (java.lang.Number) r2;
        r6 = r2.doubleValue();
        r8 = 0;
        r9 = 0;
        r10 = 6;
        r11 = 0;
        r2 = com.iqoption.core.util.af.a(r6, r8, r9, r10, r11);
        if (r2 == 0) goto L_0x0130;
    L_0x012d:
        r2 = (java.lang.CharSequence) r2;
        goto L_0x0133;
    L_0x0130:
        r2 = r0;
        r2 = (java.lang.CharSequence) r2;
    L_0x0133:
        r1.setText(r2);
        r1 = r13.bWf;
        r2 = "sharesContainer";
        kotlin.jvm.internal.i.e(r1, r2);
        r1 = (android.view.View) r1;
        r2 = r14.aeh();
        if (r2 == 0) goto L_0x0147;
    L_0x0145:
        r2 = 1;
        goto L_0x0148;
    L_0x0147:
        r2 = 0;
    L_0x0148:
        com.iqoption.core.ext.a.d(r1, r2);
        r1 = r13.bWg;
        r2 = "sharesOutst";
        kotlin.jvm.internal.i.e(r1, r2);
        r2 = r14.aeh();
        if (r2 == 0) goto L_0x016d;
    L_0x0158:
        r2 = (java.lang.Number) r2;
        r6 = r2.doubleValue();
        r2 = 3;
        r8 = 0;
        r2 = com.iqoption.core.util.j.b(r8, r4, r2, r8);
        r2 = r2.format(r6);
        if (r2 == 0) goto L_0x016d;
    L_0x016a:
        r2 = (java.lang.CharSequence) r2;
        goto L_0x0170;
    L_0x016d:
        r2 = r0;
        r2 = (java.lang.CharSequence) r2;
    L_0x0170:
        r1.setText(r2);
        r1 = r13.bVQ;
        r2 = "betaContainer";
        kotlin.jvm.internal.i.e(r1, r2);
        r1 = (android.view.View) r1;
        r2 = r14.aea();
        if (r2 == 0) goto L_0x0184;
    L_0x0182:
        r2 = 1;
        goto L_0x0185;
    L_0x0184:
        r2 = 0;
    L_0x0185:
        com.iqoption.core.ext.a.d(r1, r2);
        r1 = r13.bVP;
        r2 = "beta";
        kotlin.jvm.internal.i.e(r1, r2);
        r2 = r14.aea();
        if (r2 == 0) goto L_0x01a8;
    L_0x0195:
        r2 = (java.lang.Number) r2;
        r6 = r2.doubleValue();
        r2 = com.iqoption.core.util.j.fq(r5);
        r2 = r2.format(r6);
        if (r2 == 0) goto L_0x01a8;
    L_0x01a5:
        r2 = (java.lang.CharSequence) r2;
        goto L_0x01ab;
    L_0x01a8:
        r2 = r0;
        r2 = (java.lang.CharSequence) r2;
    L_0x01ab:
        r1.setText(r2);
        r1 = r13.bWb;
        r2 = "pegRatioContainer";
        kotlin.jvm.internal.i.e(r1, r2);
        r1 = (android.view.View) r1;
        r2 = r14.aej();
        if (r2 == 0) goto L_0x01bf;
    L_0x01bd:
        r2 = 1;
        goto L_0x01c0;
    L_0x01bf:
        r2 = 0;
    L_0x01c0:
        com.iqoption.core.ext.a.d(r1, r2);
        r1 = r13.bWa;
        r2 = "pegRatio";
        kotlin.jvm.internal.i.e(r1, r2);
        r2 = r14.aej();
        if (r2 == 0) goto L_0x01e3;
    L_0x01d0:
        r2 = (java.lang.Number) r2;
        r6 = r2.doubleValue();
        r2 = com.iqoption.core.util.j.fq(r5);
        r2 = r2.format(r6);
        if (r2 == 0) goto L_0x01e3;
    L_0x01e0:
        r2 = (java.lang.CharSequence) r2;
        goto L_0x01e6;
    L_0x01e3:
        r2 = r0;
        r2 = (java.lang.CharSequence) r2;
    L_0x01e6:
        r1.setText(r2);
        r1 = r13.bVV;
        r2 = "equitContainer";
        kotlin.jvm.internal.i.e(r1, r2);
        r1 = (android.view.View) r1;
        r2 = r14.aef();
        if (r2 == 0) goto L_0x01fa;
    L_0x01f8:
        r2 = 1;
        goto L_0x01fb;
    L_0x01fa:
        r2 = 0;
    L_0x01fb:
        com.iqoption.core.ext.a.d(r1, r2);
        r1 = r13.bWc;
        r2 = "returnOnEquit";
        kotlin.jvm.internal.i.e(r1, r2);
        r2 = r14.aef();
        if (r2 == 0) goto L_0x021e;
    L_0x020b:
        r2 = (java.lang.Number) r2;
        r5 = r2.doubleValue();
        r7 = 0;
        r8 = 0;
        r9 = 6;
        r10 = 0;
        r2 = com.iqoption.core.util.af.a(r5, r7, r8, r9, r10);
        if (r2 == 0) goto L_0x021e;
    L_0x021b:
        r2 = (java.lang.CharSequence) r2;
        goto L_0x0221;
    L_0x021e:
        r2 = r0;
        r2 = (java.lang.CharSequence) r2;
    L_0x0221:
        r1.setText(r2);
        r1 = r13.bWe;
        r2 = "revenueContainer";
        kotlin.jvm.internal.i.e(r1, r2);
        r1 = (android.view.View) r1;
        r2 = r14.aeg();
        if (r2 == 0) goto L_0x0235;
    L_0x0233:
        r2 = 1;
        goto L_0x0236;
    L_0x0235:
        r2 = 0;
    L_0x0236:
        com.iqoption.core.ext.a.d(r1, r2);
        r1 = r13.bWd;
        r2 = "revenue";
        kotlin.jvm.internal.i.e(r1, r2);
        r2 = r14.aeg();
        if (r2 == 0) goto L_0x0256;
    L_0x0246:
        r2 = (java.lang.Number) r2;
        r5 = r2.doubleValue();
        r5 = (long) r5;
        r2 = com.iqoption.core.util.af.bn(r5);
        if (r2 == 0) goto L_0x0256;
    L_0x0253:
        r2 = (java.lang.CharSequence) r2;
        goto L_0x0259;
    L_0x0256:
        r2 = r0;
        r2 = (java.lang.CharSequence) r2;
    L_0x0259:
        r1.setText(r2);
        r1 = r13.bVR;
        r2 = "dateContainer";
        kotlin.jvm.internal.i.e(r1, r2);
        r1 = (android.view.View) r1;
        r2 = r14.aek();
        if (r2 == 0) goto L_0x026c;
    L_0x026b:
        goto L_0x026d;
    L_0x026c:
        r3 = 0;
    L_0x026d:
        com.iqoption.core.ext.a.d(r1, r3);
        r13 = r13.bVU;
        r1 = "earnDate";
        kotlin.jvm.internal.i.e(r13, r1);
        r14 = r14.aek();
        if (r14 == 0) goto L_0x0292;
    L_0x027d:
        r1 = com.iqoption.core.util.TimeUtil.bRz;
        r2 = r12.dgU;
        r2 = r2.aDn();
        r14 = r2.parse(r14);
        r14 = r1.format(r14);
        if (r14 == 0) goto L_0x0292;
    L_0x028f:
        r14 = (java.lang.CharSequence) r14;
        goto L_0x0295;
    L_0x0292:
        r14 = r0;
        r14 = (java.lang.CharSequence) r14;
    L_0x0295:
        r13.setText(r14);
    L_0x0298:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.fragment.c.d.b.c.a(com.iqoption.e.az, com.iqoption.fragment.c.a.b.f):void");
    }
}
