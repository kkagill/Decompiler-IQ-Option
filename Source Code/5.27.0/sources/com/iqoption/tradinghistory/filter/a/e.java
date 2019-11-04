package com.iqoption.tradinghistory.filter.a;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.tradinghistory.f;
import com.iqoption.tradinghistory.h;
import io.reactivex.b.g;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 #2\u00020\u0001:\u0001#B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\u0016\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0011J\u000e\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u000fJ\u0016\u0010\u001a\u001a\u00020\u00132\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002J7\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u00162\b\u0010\u001e\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u001f\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\u0011H\u0002¢\u0006\u0002\u0010\"R\u001d\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, bng = {"Lcom/iqoption/tradinghistory/filter/active/ActiveFilterViewModel;", "Lcom/iqoption/core/ui/viewmodel/DisposableViewModel;", "()V", "items", "Landroidx/lifecycle/LiveData;", "", "Lcom/iqoption/tradinghistory/filter/active/BaseActiveAdapterItem;", "getItems", "()Landroidx/lifecycle/LiveData;", "itemsLiveData", "Landroidx/lifecycle/MutableLiveData;", "selectionViewModel", "Lcom/iqoption/tradinghistory/TradingHistorySelectionViewModel;", "textFilterProcessor", "Lcom/iqoption/core/rx/IQBehaviorProcessor;", "", "hasFilter", "", "init", "", "select", "item", "Lcom/iqoption/tradinghistory/filter/active/ActiveAdapterItem;", "selected", "setTextFilter", "text", "updateFilteredList", "adapterItems", "updateSelection", "current", "newSelectionForAll", "newSelectionForTarget", "targetId", "allItemSelected", "(Lcom/iqoption/tradinghistory/filter/active/ActiveAdapterItem;Ljava/lang/Boolean;ZLjava/lang/String;Z)Lcom/iqoption/tradinghistory/filter/active/ActiveAdapterItem;", "Companion", "tradinghistory_release"})
/* compiled from: ActiveFilterViewModel.kt */
public final class e extends com.iqoption.core.ui.f.d {
    public static final a dXz = new a();
    private final LiveData<List<h>> apC = this.dXx;
    private com.iqoption.tradinghistory.i dXw;
    private final MutableLiveData<List<h>> dXx = new MutableLiveData();
    private final com.iqoption.core.rx.d<String> dXy = com.iqoption.core.rx.d.bER.akd();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, bng = {"Lcom/iqoption/tradinghistory/filter/active/ActiveFilterViewModel$Companion;", "", "()V", "get", "Lcom/iqoption/tradinghistory/filter/active/ActiveFilterViewModel;", "fragment", "Landroidx/fragment/app/Fragment;", "tradinghistory_release"})
    /* compiled from: ActiveFilterViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final e aW(Fragment fragment) {
            kotlin.jvm.internal.i.f(fragment, "fragment");
            ViewModel viewModel = ViewModelProviders.of(fragment).get(e.class);
            kotlin.jvm.internal.i.e(viewModel, "ViewModelProviders.of(fr…terViewModel::class.java]");
            e eVar = (e) viewModel;
            eVar.dXw = com.iqoption.tradinghistory.i.dVq.aV(fragment);
            eVar.init();
            return eVar;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "Lkotlin/Pair;", "Lcom/iqoption/tradinghistory/InstrumentFilter;", "Lcom/iqoption/tradinghistory/ActiveFilter;", "it", "Lcom/iqoption/tradinghistory/TradingHistoryFilters;", "apply"})
    /* compiled from: ActiveFilterViewModel.kt */
    static final class b<T, R> implements g<T, R> {
        public static final b dXA = new b();

        b() {
        }

        /* renamed from: a */
        public final Pair<f, com.iqoption.tradinghistory.a> apply(h hVar) {
            kotlin.jvm.internal.i.f(hVar, "it");
            return new Pair(hVar.aVm(), hVar.aVn());
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u00006\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\"\u0010\u0007\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\b0\bj\u0002`\f2\u0006\u0010\r\u001a\u00020\u000eH\n¢\u0006\u0002\b\u000f"}, bng = {"<anonymous>", "", "Lcom/iqoption/tradinghistory/filter/active/BaseActiveAdapterItem;", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lcom/iqoption/tradinghistory/InstrumentFilter;", "Lcom/iqoption/tradinghistory/ActiveFilter;", "actives", "", "Lcom/iqoption/core/data/model/InstrumentType;", "", "Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "Lcom/iqoption/asset/AssetsMap;", "filterText", "", "apply"})
    /* compiled from: ActiveFilterViewModel.kt */
    static final class c<T1, T2, T3, R> implements io.reactivex.b.h<Pair<? extends f, ? extends com.iqoption.tradinghistory.a>, Map<InstrumentType, ? extends Map<Integer, ? extends com.iqoption.core.microservices.tradingengine.response.active.a>>, String, List<? extends h>> {
        public static final c dXB = new c();

        c() {
        }

        /* JADX WARNING: Missing block: B:3:0x0031, code skipped:
            if (r1 != null) goto L_0x0038;
     */
        /* JADX WARNING: Missing block: B:17:0x0076, code skipped:
            if (r2 != null) goto L_0x007d;
     */
        public final java.util.List<com.iqoption.tradinghistory.filter.a.h> a(kotlin.Pair<com.iqoption.tradinghistory.f, com.iqoption.tradinghistory.a> r17, java.util.Map<com.iqoption.core.data.model.InstrumentType, ? extends java.util.Map<java.lang.Integer, ? extends com.iqoption.core.microservices.tradingengine.response.active.a>> r18, java.lang.String r19) {
            /*
            r16 = this;
            r0 = r19;
            r1 = "<name for destructuring parameter 0>";
            r2 = r17;
            kotlin.jvm.internal.i.f(r2, r1);
            r1 = "actives";
            r3 = r18;
            kotlin.jvm.internal.i.f(r3, r1);
            r1 = "filterText";
            kotlin.jvm.internal.i.f(r0, r1);
            r1 = r17.bnj();
            r1 = (com.iqoption.tradinghistory.f) r1;
            r2 = r17.bnk();
            r2 = (com.iqoption.tradinghistory.a) r2;
            r4 = r1.aVe();
            r1 = r1.aVl();
            if (r1 == 0) goto L_0x0034;
        L_0x002b:
            r1 = (java.lang.Iterable) r1;
            r1 = kotlin.collections.u.V(r1);
            if (r1 == 0) goto L_0x0034;
        L_0x0033:
            goto L_0x0038;
        L_0x0034:
            r1 = kotlin.collections.al.emptySet();
        L_0x0038:
            r5 = r2.aVe();
            r2 = r2.aVg();
            r6 = 0;
            if (r2 == 0) goto L_0x0079;
        L_0x0043:
            r2 = (java.lang.Iterable) r2;
            r7 = new java.util.ArrayList;
            r7.<init>();
            r7 = (java.util.Collection) r7;
            r2 = r2.iterator();
        L_0x0050:
            r8 = r2.hasNext();
            if (r8 == 0) goto L_0x006e;
        L_0x0056:
            r8 = r2.next();
            r8 = (com.iqoption.tradinghistory.filter.a.a) r8;
            r8 = r8.Jt();
            if (r8 == 0) goto L_0x0067;
        L_0x0062:
            r8 = r8.ahU();
            goto L_0x0068;
        L_0x0067:
            r8 = r6;
        L_0x0068:
            if (r8 == 0) goto L_0x0050;
        L_0x006a:
            r7.add(r8);
            goto L_0x0050;
        L_0x006e:
            r7 = (java.util.List) r7;
            r7 = (java.lang.Iterable) r7;
            r2 = kotlin.collections.u.V(r7);
            if (r2 == 0) goto L_0x0079;
        L_0x0078:
            goto L_0x007d;
        L_0x0079:
            r2 = kotlin.collections.al.emptySet();
        L_0x007d:
            r0 = (java.lang.CharSequence) r0;
            r7 = kotlin.text.u.Y(r0);
            r8 = 1;
            r7 = r7 ^ r8;
            r9 = new java.util.ArrayList;
            r9.<init>();
            r9 = (java.util.List) r9;
            if (r7 != 0) goto L_0x0096;
        L_0x008e:
            r10 = new com.iqoption.tradinghistory.filter.a.a;
            r10.<init>(r6, r5);
            r9.add(r10);
        L_0x0096:
            r3 = r18.entrySet();
            r3 = r3.iterator();
        L_0x009e:
            r6 = r3.hasNext();
            if (r6 == 0) goto L_0x0110;
        L_0x00a4:
            r6 = r3.next();
            r6 = (java.util.Map.Entry) r6;
            r10 = r6.getKey();
            r10 = (com.iqoption.core.data.model.InstrumentType) r10;
            r6 = r6.getValue();
            r6 = (java.util.Map) r6;
            if (r4 != 0) goto L_0x00be;
        L_0x00b8:
            r11 = r1.contains(r10);
            if (r11 == 0) goto L_0x009e;
        L_0x00be:
            r6 = r6.entrySet();
            r6 = r6.iterator();
            r11 = 0;
            r12 = 0;
        L_0x00c8:
            r13 = r6.hasNext();
            if (r13 == 0) goto L_0x009e;
        L_0x00ce:
            r13 = r6.next();
            r13 = (java.util.Map.Entry) r13;
            r13 = r13.getValue();
            r13 = (com.iqoption.core.microservices.tradingengine.response.active.a) r13;
            if (r7 == 0) goto L_0x00e8;
        L_0x00dc:
            r14 = com.iqoption.core.microservices.tradingengine.response.active.d.B(r13);
            r14 = (java.lang.CharSequence) r14;
            r14 = kotlin.text.v.b(r14, r0, r8);
            if (r14 == 0) goto L_0x00c8;
        L_0x00e8:
            if (r12 != 0) goto L_0x00f7;
        L_0x00ea:
            r12 = new com.iqoption.tradinghistory.filter.a.f;
            r14 = com.iqoption.core.g.C(r10);
            r12.<init>(r14);
            r9.add(r12);
            r12 = 1;
        L_0x00f7:
            if (r5 != 0) goto L_0x0106;
        L_0x00f9:
            r14 = r13.ahU();
            r14 = r2.contains(r14);
            if (r14 == 0) goto L_0x0104;
        L_0x0103:
            goto L_0x0106;
        L_0x0104:
            r14 = 0;
            goto L_0x0107;
        L_0x0106:
            r14 = 1;
        L_0x0107:
            r15 = new com.iqoption.tradinghistory.filter.a.a;
            r15.<init>(r13, r14);
            r9.add(r15);
            goto L_0x00c8;
        L_0x0110:
            return r9;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.iqoption.tradinghistory.filter.a.e$c.a(kotlin.Pair, java.util.Map, java.lang.String):java.util.List");
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "it", "", "Lcom/iqoption/tradinghistory/filter/active/BaseActiveAdapterItem;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: ActiveFilterViewModel.kt */
    static final class d<T> implements io.reactivex.b.f<List<? extends h>> {
        final /* synthetic */ e dXC;

        d(e eVar) {
            this.dXC = eVar;
        }

        /* renamed from: v */
        public final void accept(List<? extends h> list) {
            this.dXC.dXx.postValue(list);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: ActiveFilterViewModel.kt */
    static final class e<T> implements io.reactivex.b.f<Throwable> {
        public static final e dXD = new e();

        e() {
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
        }
    }

    public final LiveData<List<h>> Bo() {
        return this.apC;
    }

    private final void init() {
        this.dXy.onNext("");
        com.iqoption.tradinghistory.i iVar = this.dXw;
        if (iVar == null) {
            kotlin.jvm.internal.i.lG("selectionViewModel");
        }
        io.reactivex.disposables.b a = io.reactivex.e.a((org.a.b) iVar.aVp().c(com.iqoption.core.rx.i.aki()).g(b.dXA).bkT(), (org.a.b) com.iqoption.asset.b.a.awZ.JQ().d(com.iqoption.core.rx.i.aki()), (org.a.b) this.dXy.c(com.iqoption.core.rx.i.akj()).k(300, TimeUnit.MILLISECONDS), (io.reactivex.b.h) c.dXB).c(com.iqoption.core.rx.i.akj()).a((io.reactivex.b.f) new d(this), (io.reactivex.b.f) e.dXD);
        kotlin.jvm.internal.i.e(a, "Flowable.combineLatest(\n…      }\n                )");
        b(a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00cc  */
    /* JADX WARNING: Missing block: B:32:0x0095, code skipped:
            if (r6 == null) goto L_0x0026;
     */
    public final void b(com.iqoption.tradinghistory.filter.a.a r14, boolean r15) {
        /*
        r13 = this;
        r0 = "item";
        kotlin.jvm.internal.i.f(r14, r0);
        r0 = r13.dXx;
        r0 = r0.getValue();
        r0 = (java.util.List) r0;
        if (r0 == 0) goto L_0x00f0;
    L_0x000f:
        r1 = r13.aVS();
        r2 = 0;
        r3 = "prevList";
        r4 = 1;
        r5 = 0;
        if (r1 == 0) goto L_0x001d;
    L_0x001a:
        r1 = 0;
        goto L_0x0098;
    L_0x001d:
        if (r15 != 0) goto L_0x0020;
    L_0x001f:
        goto L_0x001a;
    L_0x0020:
        r1 = r14.aVN();
        if (r1 == 0) goto L_0x0029;
    L_0x0026:
        r1 = 1;
        goto L_0x0098;
    L_0x0029:
        kotlin.jvm.internal.i.e(r0, r3);
        r1 = r0;
        r1 = (java.lang.Iterable) r1;
        r6 = new java.util.ArrayList;
        r6.<init>();
        r6 = (java.util.Collection) r6;
        r1 = r1.iterator();
    L_0x003a:
        r7 = r1.hasNext();
        if (r7 == 0) goto L_0x004f;
    L_0x0040:
        r7 = r1.next();
        r8 = r7;
        r8 = (com.iqoption.tradinghistory.filter.a.h) r8;
        r8 = r8 instanceof com.iqoption.tradinghistory.filter.a.a;
        if (r8 == 0) goto L_0x003a;
    L_0x004b:
        r6.add(r7);
        goto L_0x003a;
    L_0x004f:
        r6 = (java.util.List) r6;
        r6 = (java.lang.Iterable) r6;
        r1 = r6.iterator();
    L_0x0057:
        r6 = r1.hasNext();
        if (r6 == 0) goto L_0x0094;
    L_0x005d:
        r6 = r1.next();
        r7 = r6;
        r7 = (com.iqoption.tradinghistory.filter.a.h) r7;
        if (r7 == 0) goto L_0x008c;
    L_0x0066:
        r8 = r7;
        r8 = (com.iqoption.tradinghistory.filter.a.a) r8;
        r9 = r8.aVN();
        if (r9 != 0) goto L_0x0088;
    L_0x006f:
        r9 = r14.getId();
        r7 = r7.getId();
        r7 = (java.lang.String) r7;
        r7 = kotlin.jvm.internal.i.y(r9, r7);
        r7 = r7 ^ r4;
        if (r7 == 0) goto L_0x0088;
    L_0x0080:
        r7 = r8.asM();
        if (r7 != 0) goto L_0x0088;
    L_0x0086:
        r7 = 1;
        goto L_0x0089;
    L_0x0088:
        r7 = 0;
    L_0x0089:
        if (r7 == 0) goto L_0x0057;
    L_0x008b:
        goto L_0x0095;
    L_0x008c:
        r14 = new kotlin.TypeCastException;
        r15 = "null cannot be cast to non-null type com.iqoption.tradinghistory.filter.active.ActiveAdapterItem";
        r14.<init>(r15);
        throw r14;
    L_0x0094:
        r6 = r2;
    L_0x0095:
        if (r6 != 0) goto L_0x001a;
    L_0x0097:
        goto L_0x0026;
    L_0x0098:
        if (r15 != 0) goto L_0x00a2;
    L_0x009a:
        r6 = r14.aVN();
        if (r6 == 0) goto L_0x00a2;
    L_0x00a0:
        r6 = 1;
        goto L_0x00a3;
    L_0x00a2:
        r6 = 0;
    L_0x00a3:
        if (r1 == 0) goto L_0x00aa;
    L_0x00a5:
        r2 = java.lang.Boolean.valueOf(r4);
        goto L_0x00b0;
    L_0x00aa:
        if (r6 == 0) goto L_0x00b0;
    L_0x00ac:
        r2 = java.lang.Boolean.valueOf(r5);
    L_0x00b0:
        kotlin.jvm.internal.i.e(r0, r3);
        r0 = (java.lang.Iterable) r0;
        r3 = new java.util.ArrayList;
        r4 = 10;
        r4 = kotlin.collections.n.e(r0, r4);
        r3.<init>(r4);
        r3 = (java.util.Collection) r3;
        r0 = r0.iterator();
    L_0x00c6:
        r4 = r0.hasNext();
        if (r4 == 0) goto L_0x00eb;
    L_0x00cc:
        r4 = r0.next();
        r4 = (com.iqoption.tradinghistory.filter.a.h) r4;
        r5 = r4 instanceof com.iqoption.tradinghistory.filter.a.a;
        if (r5 == 0) goto L_0x00e7;
    L_0x00d6:
        r8 = r4;
        r8 = (com.iqoption.tradinghistory.filter.a.a) r8;
        r11 = r14.getId();
        r7 = r13;
        r9 = r2;
        r10 = r15;
        r12 = r1;
        r4 = r7.a(r8, r9, r10, r11, r12);
        r4 = (com.iqoption.tradinghistory.filter.a.h) r4;
    L_0x00e7:
        r3.add(r4);
        goto L_0x00c6;
    L_0x00eb:
        r3 = (java.util.List) r3;
        r13.bv(r3);
    L_0x00f0:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.tradinghistory.filter.a.e.b(com.iqoption.tradinghistory.filter.a.a, boolean):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x008f  */
    private final void bv(java.util.List<? extends com.iqoption.tradinghistory.filter.a.h> r6) {
        /*
        r5 = this;
        r0 = r5.dXx;
        r0.postValue(r6);
        r6 = (java.lang.Iterable) r6;
        r0 = new java.util.ArrayList;
        r0.<init>();
        r0 = (java.util.Collection) r0;
        r6 = r6.iterator();
    L_0x0012:
        r1 = r6.hasNext();
        r2 = 0;
        if (r1 == 0) goto L_0x002c;
    L_0x0019:
        r1 = r6.next();
        r1 = (com.iqoption.tradinghistory.filter.a.h) r1;
        r3 = r1 instanceof com.iqoption.tradinghistory.filter.a.a;
        if (r3 != 0) goto L_0x0024;
    L_0x0023:
        r1 = r2;
    L_0x0024:
        r1 = (com.iqoption.tradinghistory.filter.a.a) r1;
        if (r1 == 0) goto L_0x0012;
    L_0x0028:
        r0.add(r1);
        goto L_0x0012;
    L_0x002c:
        r0 = (java.util.List) r0;
        r6 = r5.aVS();
        r1 = 1;
        if (r6 != 0) goto L_0x0056;
    L_0x0035:
        r6 = r0;
        r6 = (java.lang.Iterable) r6;
        r6 = r6.iterator();
    L_0x003c:
        r3 = r6.hasNext();
        if (r3 == 0) goto L_0x0051;
    L_0x0042:
        r3 = r6.next();
        r4 = r3;
        r4 = (com.iqoption.tradinghistory.filter.a.a) r4;
        r4 = r4.asM();
        r4 = r4 ^ r1;
        if (r4 == 0) goto L_0x003c;
    L_0x0050:
        goto L_0x0052;
    L_0x0051:
        r3 = r2;
    L_0x0052:
        if (r3 != 0) goto L_0x0056;
    L_0x0054:
        r6 = 1;
        goto L_0x0057;
    L_0x0056:
        r6 = 0;
    L_0x0057:
        if (r6 == 0) goto L_0x005f;
    L_0x0059:
        r6 = new com.iqoption.tradinghistory.a;
        r6.<init>(r2, r1, r2);
        goto L_0x008b;
    L_0x005f:
        r0 = (java.lang.Iterable) r0;
        r6 = new java.util.ArrayList;
        r6.<init>();
        r6 = (java.util.Collection) r6;
        r0 = r0.iterator();
    L_0x006c:
        r1 = r0.hasNext();
        if (r1 == 0) goto L_0x0083;
    L_0x0072:
        r1 = r0.next();
        r2 = r1;
        r2 = (com.iqoption.tradinghistory.filter.a.a) r2;
        r2 = r2.asM();
        if (r2 == 0) goto L_0x006c;
    L_0x007f:
        r6.add(r1);
        goto L_0x006c;
    L_0x0083:
        r6 = (java.util.List) r6;
        r0 = new com.iqoption.tradinghistory.a;
        r0.<init>(r6);
        r6 = r0;
    L_0x008b:
        r0 = r5.dXw;
        if (r0 != 0) goto L_0x0094;
    L_0x008f:
        r1 = "selectionViewModel";
        kotlin.jvm.internal.i.lG(r1);
    L_0x0094:
        r0.a(r6);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.tradinghistory.filter.a.e.bv(java.util.List):void");
    }

    private final boolean aVS() {
        String str = (String) this.dXy.getValue();
        return str != null && (u.Y(str) ^ 1) == 1;
    }

    private final a a(a aVar, Boolean bool, boolean z, String str, boolean z2) {
        if (!kotlin.jvm.internal.i.y(str, aVar.getId())) {
            if (bool != null) {
                z = bool.booleanValue();
            } else if (aVar.aVN()) {
                z = z2;
            } else {
                z = aVar.asM();
            }
        }
        return z != aVar.asM() ? a.a(aVar, null, z, 1, null) : aVar;
    }

    public final void jN(String str) {
        kotlin.jvm.internal.i.f(str, "text");
        this.dXy.onNext(str);
    }
}
