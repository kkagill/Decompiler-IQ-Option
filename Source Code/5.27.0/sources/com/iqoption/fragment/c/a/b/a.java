package com.iqoption.fragment.c.a.b;

import android.view.ViewGroup;
import com.iqoption.core.d;
import com.iqoption.fragment.c.d.b.e;
import com.iqoption.fragment.c.d.b.f;
import com.iqoption.fragment.c.d.b.g;
import com.iqoption.fragment.c.d.b.h;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001b2\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u001a\u001bB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\fH\u0014J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u001c\u0010\u0010\u001a\u00020\u00112\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J*\u0010\u0010\u001a\u00020\u00112\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0016J\u001c\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001c"}, bng = {"Lcom/iqoption/fragment/infoasset/adapters/info/InfoAssetAdapter;", "Lcom/iqoption/core/ui/widget/recyclerview/adapter/IQAdapter;", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/IQViewHolder;", "Lcom/iqoption/fragment/infoasset/adapters/info/InfoAssetAdapterItem;", "callbacks", "Lcom/iqoption/fragment/infoasset/adapters/info/InfoAssetAdapter$Callbacks;", "(Lcom/iqoption/fragment/infoasset/adapters/info/InfoAssetAdapter$Callbacks;)V", "uiConfig", "Lcom/iqoption/fragment/infoasset/adapters/UIConfig;", "getUiConfig", "()Lcom/iqoption/fragment/infoasset/adapters/UIConfig;", "createDiffCallback", "Lcom/iqoption/core/ui/widget/recyclerview/adapter/diff/DiffCallback;", "getItemViewType", "", "position", "onBindViewHolder", "", "holder", "payloads", "", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Callbacks", "Companion", "app_optionXRelease"})
/* compiled from: InfoAssetAdapter.kt */
public final class a extends com.iqoption.core.ui.widget.recyclerview.adapter.a<com.iqoption.core.ui.widget.recyclerview.a.c<?>, b> {
    public static final b dgZ = new b();
    private final com.iqoption.fragment.c.a.a dgU = new com.iqoption.fragment.c.a.a(d.Uo());
    private final a dgY;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000f"}, bng = {"Lcom/iqoption/fragment/infoasset/adapters/info/InfoAssetAdapter$Companion;", "", "()V", "PAYLOAD_ALERTS_BADGE", "", "VIEW_TYPE_INFO", "VIEW_TYPE_LOADING", "VIEW_TYPE_PRICE", "VIEW_TYPE_PRICE_CRYPTO", "VIEW_TYPE_PRICE_FULL", "VIEW_TYPE_STATISTICS", "VIEW_TYPE_STATISTICS_FULL", "VIEW_TYPE_STATISTICS_MORE", "VIEW_TYPE_TITLE", "VIEW_TYPE_TRADERS_PULSE", "app_optionXRelease"})
    /* compiled from: InfoAssetAdapter.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(f fVar) {
            this();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006¨\u0006\u0007"}, bng = {"Lcom/iqoption/fragment/infoasset/adapters/info/InfoAssetAdapter$Callbacks;", "Lcom/iqoption/fragment/infoasset/viewholder/info/TitleViewHolder$Callback;", "Lcom/iqoption/fragment/infoasset/viewholder/info/PriceViewHolder$Callback;", "Lcom/iqoption/fragment/infoasset/viewholder/info/PriceFullViewHolder$Callback;", "Lcom/iqoption/fragment/infoasset/viewholder/info/StatisticsMoreViewHolder$Callback;", "Lcom/iqoption/fragment/infoasset/viewholder/info/StatisticsFullViewHolder$Callback;", "Lcom/iqoption/fragment/infoasset/viewholder/info/InfoViewHolder$Callback;", "app_optionXRelease"})
    /* compiled from: InfoAssetAdapter.kt */
    public interface a extends com.iqoption.fragment.c.d.b.a.a, com.iqoption.fragment.c.d.b.c.a, com.iqoption.fragment.c.d.b.d.a, com.iqoption.fragment.c.d.b.e.a, com.iqoption.fragment.c.d.b.f.a, com.iqoption.fragment.c.d.b.h.a {
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\b"}, bng = {"com/iqoption/fragment/infoasset/adapters/info/InfoAssetAdapter$createDiffCallback$1", "Lcom/iqoption/core/ui/widget/recyclerview/adapter/diff/DiffCallback;", "Lcom/iqoption/fragment/infoasset/adapters/info/InfoAssetAdapterItem;", "getChangePayload", "", "oldItemPosition", "", "newItemPosition", "app_optionXRelease"})
    /* compiled from: InfoAssetAdapter.kt */
    public static final class c extends com.iqoption.core.ui.widget.recyclerview.adapter.a.a<b> {
        c() {
        }

        /* JADX WARNING: Missing block: B:18:0x0045, code skipped:
            if ((((java.lang.CharSequence) r1.aDL()).length() > 0 ? 1 : null) == null) goto L_0x0047;
     */
        /* JADX WARNING: Missing block: B:27:0x0065, code skipped:
            if (r3 != null) goto L_0x0067;
     */
        /* JADX WARNING: Missing block: B:29:0x006b, code skipped:
            return java.lang.Integer.valueOf(1);
     */
        public java.lang.Object getChangePayload(int r6, int r7) {
            /*
            r5 = this;
            r0 = r5.amY();
            r0 = r0.get(r6);
            r1 = r0 instanceof com.iqoption.fragment.c.a.b.j;
            r2 = 0;
            if (r1 != 0) goto L_0x000e;
        L_0x000d:
            r0 = r2;
        L_0x000e:
            r0 = (com.iqoption.fragment.c.a.b.j) r0;
            r1 = r5.amZ();
            r1 = r1.get(r7);
            r3 = r1 instanceof com.iqoption.fragment.c.a.b.j;
            if (r3 != 0) goto L_0x001d;
        L_0x001c:
            r1 = r2;
        L_0x001d:
            r1 = (com.iqoption.fragment.c.a.b.j) r1;
            if (r0 == 0) goto L_0x006c;
        L_0x0021:
            if (r1 == 0) goto L_0x006c;
        L_0x0023:
            r2 = r0.aDL();
            r2 = (java.lang.CharSequence) r2;
            r2 = r2.length();
            r3 = 0;
            r4 = 1;
            if (r2 != 0) goto L_0x0033;
        L_0x0031:
            r2 = 1;
            goto L_0x0034;
        L_0x0033:
            r2 = 0;
        L_0x0034:
            if (r2 == 0) goto L_0x0047;
        L_0x0036:
            r2 = r1.aDL();
            r2 = (java.lang.CharSequence) r2;
            r2 = r2.length();
            if (r2 <= 0) goto L_0x0044;
        L_0x0042:
            r2 = 1;
            goto L_0x0045;
        L_0x0044:
            r2 = 0;
        L_0x0045:
            if (r2 != 0) goto L_0x0067;
        L_0x0047:
            r0 = r0.aDL();
            r0 = (java.lang.CharSequence) r0;
            r0 = r0.length();
            if (r0 <= 0) goto L_0x0055;
        L_0x0053:
            r0 = 1;
            goto L_0x0056;
        L_0x0055:
            r0 = 0;
        L_0x0056:
            if (r0 == 0) goto L_0x006c;
        L_0x0058:
            r0 = r1.aDL();
            r0 = (java.lang.CharSequence) r0;
            r0 = r0.length();
            if (r0 != 0) goto L_0x0065;
        L_0x0064:
            r3 = 1;
        L_0x0065:
            if (r3 == 0) goto L_0x006c;
        L_0x0067:
            r6 = java.lang.Integer.valueOf(r4);
            return r6;
        L_0x006c:
            r6 = super.getChangePayload(r6, r7);
            return r6;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.iqoption.fragment.c.a.b.a$c.getChangePayload(int, int):java.lang.Object");
        }
    }

    /* renamed from: a */
    public void onBindViewHolder(com.iqoption.core.ui.widget.recyclerview.a.c<?> cVar, int i) {
        kotlin.jvm.internal.i.f(cVar, "holder");
    }

    public a(a aVar) {
        kotlin.jvm.internal.i.f(aVar, "callbacks");
        this.dgY = aVar;
    }

    /* renamed from: f */
    public com.iqoption.core.ui.widget.recyclerview.a.c<?> onCreateViewHolder(ViewGroup viewGroup, int i) {
        kotlin.jvm.internal.i.f(viewGroup, "parent");
        switch (i) {
            case -1:
                return new com.iqoption.core.ui.c(viewGroup);
            case 1:
                return new h(this.dgY, viewGroup, this.dgU, this);
            case 2:
                return new com.iqoption.fragment.c.d.b.d(this.dgY, viewGroup, this.dgU, this);
            case 3:
                return new com.iqoption.fragment.c.d.b.b(viewGroup, this.dgU);
            case 4:
                return new com.iqoption.fragment.c.d.b.c(this.dgY, viewGroup, this.dgU, this);
            case 5:
                return new com.iqoption.fragment.c.d.b.i(viewGroup);
            case 6:
                return new g(viewGroup, this.dgU);
            case 7:
                return new f(this.dgY, viewGroup, this);
            case 8:
                return new e(this.dgY, viewGroup, this.dgU, this);
            case 9:
                return new com.iqoption.fragment.c.d.b.a(this.dgY, viewGroup, this.dgU, this);
            default:
                com.iqoption.core.ui.widget.recyclerview.adapter.a.bPk.unsupportedViewType(i);
                throw null;
        }
    }

    /* renamed from: a */
    public void onBindViewHolder(com.iqoption.core.ui.widget.recyclerview.a.c<?> cVar, int i, List<Object> list) {
        kotlin.jvm.internal.i.f(cVar, "holder");
        kotlin.jvm.internal.i.f(list, "payloads");
        com.iqoption.core.ui.widget.recyclerview.adapter.a.d fp;
        switch (cVar.getItemViewType()) {
            case 1:
                h hVar = (h) cVar;
                fp = fp(i);
                if (fp != null) {
                    hVar.a((Object) (j) fp, (List) list);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.iqoption.fragment.infoasset.adapters.info.InfoAssetTitle");
            case 2:
                com.iqoption.fragment.c.d.b.d dVar = (com.iqoption.fragment.c.d.b.d) cVar;
                fp = fp(i);
                if (fp != null) {
                    dVar.bV((d) fp);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.iqoption.fragment.infoasset.adapters.info.InfoAssetPrice");
            case 3:
                com.iqoption.fragment.c.d.b.b bVar = (com.iqoption.fragment.c.d.b.b) cVar;
                fp = fp(i);
                if (fp != null) {
                    bVar.bV((e) fp);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.iqoption.fragment.infoasset.adapters.info.InfoAssetPriceCrypto");
            case 4:
                com.iqoption.fragment.c.d.b.c cVar2 = (com.iqoption.fragment.c.d.b.c) cVar;
                fp = fp(i);
                if (fp != null) {
                    cVar2.bV((f) fp);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.iqoption.fragment.infoasset.adapters.info.InfoAssetPriceFull");
            case 5:
                com.iqoption.fragment.c.d.b.i iVar = (com.iqoption.fragment.c.d.b.i) cVar;
                fp = fp(i);
                if (fp != null) {
                    iVar.bV((k) fp);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.iqoption.fragment.infoasset.adapters.info.InfoAssetTradersPulse");
            case 6:
                g gVar = (g) cVar;
                fp = fp(i);
                if (fp != null) {
                    gVar.bV((g) fp);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.iqoption.fragment.infoasset.adapters.info.InfoAssetStatistics");
            case 7:
                f fVar = (f) cVar;
                fp = fp(i);
                if (fp != null) {
                    fVar.bV((i) fp);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.iqoption.fragment.infoasset.adapters.info.InfoAssetStatisticsMore");
            case 8:
                e eVar = (e) cVar;
                fp = fp(i);
                if (fp != null) {
                    eVar.bV((h) fp);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.iqoption.fragment.infoasset.adapters.info.InfoAssetStatisticsFull");
            case 9:
                com.iqoption.fragment.c.d.b.a aVar = (com.iqoption.fragment.c.d.b.a) cVar;
                fp = fp(i);
                if (fp != null) {
                    aVar.bV((c) fp);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.iqoption.fragment.infoasset.adapters.info.InfoAssetInfo");
            default:
                return;
        }
    }

    public int getItemViewType(int i) {
        b bVar = (b) fp(i);
        if (bVar instanceof l) {
            return -1;
        }
        if (bVar instanceof j) {
            return 1;
        }
        if (bVar instanceof d) {
            return 2;
        }
        if (bVar instanceof e) {
            return 3;
        }
        if (bVar instanceof f) {
            return 4;
        }
        if (bVar instanceof k) {
            return 5;
        }
        if (bVar instanceof g) {
            return 6;
        }
        if (bVar instanceof i) {
            return 7;
        }
        if (bVar instanceof h) {
            return 8;
        }
        if (bVar instanceof c) {
            return 9;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* Access modifiers changed, original: protected */
    public com.iqoption.core.ui.widget.recyclerview.adapter.a.a<b> amW() {
        return new c();
    }
}
