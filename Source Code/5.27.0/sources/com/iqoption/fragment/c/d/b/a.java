package com.iqoption.fragment.c.d.b;

import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.iqoption.core.d;
import com.iqoption.core.ext.g;
import com.iqoption.core.microservices.fininfo.response.b;
import com.iqoption.core.microservices.fininfo.response.f;
import com.iqoption.core.ui.widget.recyclerview.a.e;
import com.iqoption.e.av;
import com.iqoption.fragment.c.a.b.c;
import com.iqoption.util.ai;
import com.iqoption.x.R;
import kotlin.TypeCastException;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0016B%\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0014\u0010\u0013\u001a\u00020\u0014*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0017"}, bng = {"Lcom/iqoption/fragment/infoasset/viewholder/info/InfoViewHolder;", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/VDBindingHolder;", "Lcom/iqoption/databinding/AssetInfoInfoItemBinding;", "Lcom/iqoption/fragment/infoasset/adapters/info/InfoAssetInfo;", "callback", "Lcom/iqoption/fragment/infoasset/viewholder/info/InfoViewHolder$Callback;", "parent", "Landroid/view/ViewGroup;", "uiConfig", "Lcom/iqoption/fragment/infoasset/adapters/UIConfig;", "data", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/AdapterData;", "(Lcom/iqoption/fragment/infoasset/viewholder/info/InfoViewHolder$Callback;Landroid/view/ViewGroup;Lcom/iqoption/fragment/infoasset/adapters/UIConfig;Lcom/iqoption/core/ui/widget/recyclerview/viewholder/AdapterData;)V", "getUiConfig", "()Lcom/iqoption/fragment/infoasset/adapters/UIConfig;", "getShortSpanner", "", "text", "", "bind", "", "item", "Callback", "app_optionXRelease"})
/* compiled from: InfoViewHolder.kt */
public final class a extends e<av, c> {
    private final com.iqoption.fragment.c.a.a dgU;
    private final a dhY;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, bng = {"Lcom/iqoption/fragment/infoasset/viewholder/info/InfoViewHolder$Callback;", "", "onLinkClick", "", "item", "Lcom/iqoption/fragment/infoasset/adapters/info/InfoAssetInfo;", "app_optionXRelease"})
    /* compiled from: InfoViewHolder.kt */
    public interface a {
        void a(c cVar);
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, bng = {"com/iqoption/fragment/infoasset/viewholder/info/InfoViewHolder$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "app_optionXRelease"})
    /* compiled from: InfoViewHolder.kt */
    /* renamed from: com.iqoption.fragment.c.d.b.a$1 */
    public static final class AnonymousClass1 extends g {
        final /* synthetic */ a dhZ;

        AnonymousClass1(a aVar) {
            this.dhZ = aVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            c cVar = (c) this.dhZ.and();
            if (cVar != null) {
                this.dhZ.dhY.a(cVar);
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, bng = {"com/iqoption/fragment/infoasset/viewholder/info/InfoViewHolder$2", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "app_optionXRelease"})
    /* compiled from: InfoViewHolder.kt */
    /* renamed from: com.iqoption.fragment.c.d.b.a$2 */
    public static final class AnonymousClass2 extends g {
        final /* synthetic */ a dhZ;

        AnonymousClass2(a aVar) {
            this.dhZ = aVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            c cVar = (c) this.dhZ.and();
            if (cVar != null) {
                f aDC = cVar.aDC();
                if (aDC != null) {
                    b adY = aDC.adY();
                    if (adY != null) {
                        String description = adY.getDescription();
                        if (description != null && description.length() > 100) {
                            String str = "binding.infoTxt";
                            TextView textView;
                            if (view.isSelected()) {
                                view.setSelected(false);
                                textView = ((av) this.dhZ.getBinding()).bVH;
                                kotlin.jvm.internal.i.e(textView, str);
                                textView.setText(description);
                            } else {
                                view.setSelected(true);
                                textView = ((av) this.dhZ.getBinding()).bVH;
                                kotlin.jvm.internal.i.e(textView, str);
                                a aVar = this.dhZ;
                                if (description != null) {
                                    description = description.substring(0, 100);
                                    kotlin.jvm.internal.i.e(description, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                                    textView.setText(aVar.iv(description));
                                } else {
                                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                                }
                            }
                        }
                    }
                }
                com.iqoption.fragment.c.a.dgs.aDe();
            }
        }
    }

    public a(a aVar, ViewGroup viewGroup, com.iqoption.fragment.c.a.a aVar2, com.iqoption.core.ui.widget.recyclerview.a.a aVar3) {
        kotlin.jvm.internal.i.f(aVar, "callback");
        kotlin.jvm.internal.i.f(viewGroup, "parent");
        kotlin.jvm.internal.i.f(aVar2, "uiConfig");
        kotlin.jvm.internal.i.f(aVar3, "data");
        super(R.layout.asset_info_info_item, viewGroup, aVar3);
        this.dhY = aVar;
        this.dgU = aVar2;
        ((av) getBinding()).bVG.setOnClickListener(new AnonymousClass1(this));
        ((av) getBinding()).bVH.setOnClickListener(new AnonymousClass2(this));
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0104  */
    /* JADX WARNING: Missing block: B:48:0x0116, code skipped:
            if (r8 == null) goto L_0x011a;
     */
    public void a(com.iqoption.e.av r7, com.iqoption.fragment.c.a.b.c r8) {
        /*
        r6 = this;
        r0 = "$this$bind";
        kotlin.jvm.internal.i.f(r7, r0);
        r0 = "item";
        kotlin.jvm.internal.i.f(r8, r0);
        r0 = r7.bVH;
        r1 = "infoTxt";
        kotlin.jvm.internal.i.e(r0, r1);
        r0 = (android.view.View) r0;
        r2 = r8.aDC();
        if (r2 == 0) goto L_0x0024;
    L_0x0019:
        r2 = r2.adY();
        if (r2 == 0) goto L_0x0024;
    L_0x001f:
        r2 = r2.getDescription();
        goto L_0x0025;
    L_0x0024:
        r2 = 0;
    L_0x0025:
        r3 = 1;
        r4 = 0;
        if (r2 == 0) goto L_0x002b;
    L_0x0029:
        r2 = 1;
        goto L_0x002c;
    L_0x002b:
        r2 = 0;
    L_0x002c:
        com.iqoption.core.ext.a.d(r0, r2);
        r0 = r8.aDC();
        if (r0 == 0) goto L_0x007b;
    L_0x0035:
        r0 = r0.adY();
        if (r0 == 0) goto L_0x007b;
    L_0x003b:
        r0 = r0.getDescription();
        if (r0 == 0) goto L_0x007b;
    L_0x0041:
        r2 = r0.length();
        r5 = 100;
        if (r2 <= r5) goto L_0x0071;
    L_0x0049:
        if (r0 == 0) goto L_0x0069;
    L_0x004b:
        r0 = r0.substring(r4, r5);
        r2 = "(this as java.lang.Strin…ing(startIndex, endIndex)";
        kotlin.jvm.internal.i.e(r0, r2);
        r2 = r7.bVH;
        kotlin.jvm.internal.i.e(r2, r1);
        r2.setSelected(r3);
        r2 = r7.bVH;
        kotlin.jvm.internal.i.e(r2, r1);
        r0 = r6.iv(r0);
        r2.setText(r0);
        goto L_0x007b;
    L_0x0069:
        r7 = new kotlin.TypeCastException;
        r8 = "null cannot be cast to non-null type java.lang.String";
        r7.<init>(r8);
        throw r7;
    L_0x0071:
        r2 = r7.bVH;
        kotlin.jvm.internal.i.e(r2, r1);
        r0 = (java.lang.CharSequence) r0;
        r2.setText(r0);
    L_0x007b:
        r0 = r8.adT();
        r0 = (java.lang.CharSequence) r0;
        if (r0 == 0) goto L_0x008c;
    L_0x0083:
        r0 = r0.length();
        if (r0 != 0) goto L_0x008a;
    L_0x0089:
        goto L_0x008c;
    L_0x008a:
        r0 = 0;
        goto L_0x008d;
    L_0x008c:
        r0 = 1;
    L_0x008d:
        r1 = "secondContainer";
        r2 = "baseContainer";
        if (r0 != 0) goto L_0x00dd;
    L_0x0093:
        r0 = r8.adU();
        r0 = (java.lang.CharSequence) r0;
        if (r0 == 0) goto L_0x00a4;
    L_0x009b:
        r0 = r0.length();
        if (r0 != 0) goto L_0x00a2;
    L_0x00a1:
        goto L_0x00a4;
    L_0x00a2:
        r0 = 0;
        goto L_0x00a5;
    L_0x00a4:
        r0 = 1;
    L_0x00a5:
        if (r0 == 0) goto L_0x00a8;
    L_0x00a7:
        goto L_0x00dd;
    L_0x00a8:
        r0 = r7.bVE;
        r5 = "base";
        kotlin.jvm.internal.i.e(r0, r5);
        r5 = r8.adT();
        r5 = (java.lang.CharSequence) r5;
        r0.setText(r5);
        r0 = r7.bVI;
        r5 = "second";
        kotlin.jvm.internal.i.e(r0, r5);
        r5 = r8.adU();
        r5 = (java.lang.CharSequence) r5;
        r0.setText(r5);
        r0 = r7.bVF;
        kotlin.jvm.internal.i.e(r0, r2);
        r0 = (android.view.View) r0;
        com.iqoption.core.ext.a.ak(r0);
        r0 = r7.bVJ;
        kotlin.jvm.internal.i.e(r0, r1);
        r0 = (android.view.View) r0;
        com.iqoption.core.ext.a.ak(r0);
        goto L_0x00f1;
    L_0x00dd:
        r0 = r7.bVF;
        kotlin.jvm.internal.i.e(r0, r2);
        r0 = (android.view.View) r0;
        com.iqoption.core.ext.a.al(r0);
        r0 = r7.bVJ;
        kotlin.jvm.internal.i.e(r0, r1);
        r0 = (android.view.View) r0;
        com.iqoption.core.ext.a.al(r0);
    L_0x00f1:
        r7 = r7.bVG;
        r0 = "fullInformation";
        kotlin.jvm.internal.i.e(r7, r0);
        r7 = (android.view.View) r7;
        r0 = com.iqoption.core.d.Un();
        r0 = r0.Dq();
        if (r0 != 0) goto L_0x0119;
    L_0x0104:
        r8 = r8.adX();
        r8 = (java.lang.CharSequence) r8;
        if (r8 == 0) goto L_0x0115;
    L_0x010c:
        r8 = r8.length();
        if (r8 != 0) goto L_0x0113;
    L_0x0112:
        goto L_0x0115;
    L_0x0113:
        r8 = 0;
        goto L_0x0116;
    L_0x0115:
        r8 = 1;
    L_0x0116:
        if (r8 != 0) goto L_0x0119;
    L_0x0118:
        goto L_0x011a;
    L_0x0119:
        r3 = 0;
    L_0x011a:
        com.iqoption.core.ext.a.d(r7, r3);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.fragment.c.d.b.a.a(com.iqoption.e.av, com.iqoption.fragment.c.a.b.c):void");
    }

    private final CharSequence iv(String str) {
        ai jP = new ai().jP(str).cs(new ForegroundColorSpan(this.dgU.aDl())).jP(" ...");
        String string = d.getString(R.string.more);
        if (string != null) {
            string = string.toUpperCase();
            kotlin.jvm.internal.i.e(string, "(this as java.lang.String).toUpperCase()");
            CharSequence anA = jP.jP(string).anA();
            kotlin.jvm.internal.i.e(anA, "Spanner()\n              …                 .build()");
            return anA;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }
}
