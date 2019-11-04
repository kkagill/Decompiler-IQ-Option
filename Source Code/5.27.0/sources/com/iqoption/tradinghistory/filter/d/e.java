package com.iqoption.tradinghistory.filter.d;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.tradinghistory.f;
import com.iqoption.tradinghistory.h;
import io.reactivex.b.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 '2\u00020\u0001:\u0001'B\u0005¢\u0006\u0002\u0010\u0002JF\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0010H\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\u0016\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010J\u0016\u0010\u001d\u001a\u00020\u00182\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002J7\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00062\b\u0010!\u001a\u0004\u0018\u00010\u00102\u0006\u0010\"\u001a\u00020\u00102\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0010H\u0002¢\u0006\u0002\u0010&R\u001d\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000¨\u0006("}, bng = {"Lcom/iqoption/tradinghistory/filter/instrument/InstrumentFilterViewModel;", "Lcom/iqoption/core/ui/viewmodel/DisposableViewModel;", "()V", "items", "Landroidx/lifecycle/LiveData;", "", "Lcom/iqoption/tradinghistory/filter/instrument/InstrumentFilterAdapterItem;", "getItems", "()Landroidx/lifecycle/LiveData;", "itemsLiveData", "Landroidx/lifecycle/MutableLiveData;", "selectionViewModel", "Lcom/iqoption/tradinghistory/TradingHistorySelectionViewModel;", "generateAllInstrumentArray", "Lcom/iqoption/core/data/model/InstrumentType;", "isBinaryEnabled", "", "isMultiEnabled", "isDigitalEnabled", "isFxEnabled", "isCFDEnabled", "isCryptoEnabled", "isForexEnabled", "init", "", "select", "item", "Lcom/iqoption/tradinghistory/filter/instrument/InstrumentFilterItem;", "selected", "updateFilteredList", "adapterItems", "updateSelection", "current", "newSelectionForAll", "newSelectionForTarget", "targetId", "", "allItemSelected", "(Lcom/iqoption/tradinghistory/filter/instrument/InstrumentFilterAdapterItem;Ljava/lang/Boolean;ZIZ)Lcom/iqoption/tradinghistory/filter/instrument/InstrumentFilterAdapterItem;", "Companion", "tradinghistory_release"})
/* compiled from: InstrumentFilterViewModel.kt */
public final class e extends com.iqoption.core.ui.f.d {
    public static final a dYt = new a();
    private final LiveData<List<b>> apC = this.dXx;
    private com.iqoption.tradinghistory.i dXw;
    private final MutableLiveData<List<b>> dXx = new MutableLiveData();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, bng = {"Lcom/iqoption/tradinghistory/filter/instrument/InstrumentFilterViewModel$Companion;", "", "()V", "get", "Lcom/iqoption/tradinghistory/filter/instrument/InstrumentFilterViewModel;", "fragment", "Landroidx/fragment/app/Fragment;", "tradinghistory_release"})
    /* compiled from: InstrumentFilterViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final e ba(Fragment fragment) {
            kotlin.jvm.internal.i.f(fragment, "fragment");
            ViewModel viewModel = ViewModelProviders.of(fragment).get(e.class);
            kotlin.jvm.internal.i.e(viewModel, "ViewModelProviders.of(fr…terViewModel::class.java]");
            e eVar = (e) viewModel;
            eVar.dXw = com.iqoption.tradinghistory.i.dVq.aV(fragment);
            eVar.init();
            return eVar;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "Lcom/iqoption/tradinghistory/InstrumentFilter;", "it", "Lcom/iqoption/tradinghistory/TradingHistoryFilters;", "apply"})
    /* compiled from: InstrumentFilterViewModel.kt */
    static final class b<T, R> implements g<T, R> {
        public static final b dYu = new b();

        b() {
        }

        /* renamed from: e */
        public final f apply(h hVar) {
            kotlin.jvm.internal.i.f(hVar, "it");
            return hVar.aVm();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "filter", "Lcom/iqoption/tradinghistory/InstrumentFilter;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: InstrumentFilterViewModel.kt */
    static final class c<T> implements io.reactivex.b.f<f> {
        final /* synthetic */ e dYv;
        final /* synthetic */ List dkt;

        c(e eVar, List list) {
            this.dYv = eVar;
            this.dkt = list;
        }

        /* JADX WARNING: Missing block: B:3:0x0010, code skipped:
            if (r7 != null) goto L_0x0017;
     */
        /* renamed from: c */
        public final void accept(com.iqoption.tradinghistory.f r7) {
            /*
            r6 = this;
            r0 = r7.aVe();
            r7 = r7.aVg();
            if (r7 == 0) goto L_0x0013;
        L_0x000a:
            r7 = (java.lang.Iterable) r7;
            r7 = kotlin.collections.u.V(r7);
            if (r7 == 0) goto L_0x0013;
        L_0x0012:
            goto L_0x0017;
        L_0x0013:
            r7 = kotlin.collections.al.emptySet();
        L_0x0017:
            r1 = r6.dkt;
            r1 = (java.lang.Iterable) r1;
            r2 = new java.util.ArrayList;
            r3 = 10;
            r3 = kotlin.collections.n.e(r1, r3);
            r2.<init>(r3);
            r2 = (java.util.Collection) r2;
            r1 = r1.iterator();
        L_0x002c:
            r3 = r1.hasNext();
            if (r3 == 0) goto L_0x004d;
        L_0x0032:
            r3 = r1.next();
            r3 = (com.iqoption.tradinghistory.filter.d.d) r3;
            r4 = new com.iqoption.tradinghistory.filter.d.b;
            if (r0 != 0) goto L_0x0045;
        L_0x003c:
            r5 = r7.contains(r3);
            if (r5 == 0) goto L_0x0043;
        L_0x0042:
            goto L_0x0045;
        L_0x0043:
            r5 = 0;
            goto L_0x0046;
        L_0x0045:
            r5 = 1;
        L_0x0046:
            r4.<init>(r3, r5);
            r2.add(r4);
            goto L_0x002c;
        L_0x004d:
            r2 = (java.util.List) r2;
            r2 = (java.lang.Iterable) r2;
            r7 = kotlin.collections.u.T(r2);
            r0 = r6.dYv;
            r0.bv(r7);
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.iqoption.tradinghistory.filter.d.e$c.accept(com.iqoption.tradinghistory.f):void");
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: InstrumentFilterViewModel.kt */
    static final class d<T> implements io.reactivex.b.f<Throwable> {
        public static final d dYw = new d();

        d() {
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
        }
    }

    public final LiveData<List<b>> Bo() {
        return this.apC;
    }

    private final void init() {
        List arrayList = new ArrayList();
        boolean Xt = com.iqoption.core.features.instrument.b.Xt();
        boolean Xq = com.iqoption.core.features.instrument.b.Xq();
        boolean Xr = com.iqoption.core.features.instrument.b.Xr();
        boolean Xs = com.iqoption.core.features.instrument.b.Xs();
        boolean Xu = com.iqoption.core.features.instrument.b.Xu();
        boolean Xw = com.iqoption.core.features.instrument.b.Xw();
        boolean Xv = com.iqoption.core.features.instrument.b.Xv();
        boolean z = Xw;
        arrayList.add(new d(com.iqoption.tradinghistory.g.f.all_instruments, a(Xt, Xq, Xr, Xs, Xu, Xw, Xv)));
        if (Xt) {
            arrayList.add(new d(com.iqoption.core.microservices.tradingengine.response.active.d.V(InstrumentType.TURBO_INSTRUMENT), m.listOf(InstrumentType.TURBO_INSTRUMENT, InstrumentType.BINARY_INSTRUMENT)));
        }
        if (Xq) {
            arrayList.add(new d(com.iqoption.core.microservices.tradingengine.response.active.d.V(InstrumentType.MULTI_INSTRUMENT), l.listOf(InstrumentType.MULTI_INSTRUMENT)));
        }
        if (Xr) {
            arrayList.add(new d(com.iqoption.core.microservices.tradingengine.response.active.d.V(InstrumentType.DIGITAL_INSTRUMENT), l.listOf(InstrumentType.DIGITAL_INSTRUMENT)));
        }
        if (Xs) {
            arrayList.add(new d(com.iqoption.core.microservices.tradingengine.response.active.d.V(InstrumentType.FX_INSTRUMENT), l.listOf(InstrumentType.FX_INSTRUMENT)));
        }
        if (Xu) {
            arrayList.add(new d(com.iqoption.core.microservices.tradingengine.response.active.d.V(InstrumentType.CFD_INSTRUMENT), l.listOf(InstrumentType.CFD_INSTRUMENT)));
        }
        if (z) {
            arrayList.add(new d(com.iqoption.core.microservices.tradingengine.response.active.d.V(InstrumentType.CRYPTO_INSTRUMENT), l.listOf(InstrumentType.CRYPTO_INSTRUMENT)));
        }
        if (Xv) {
            arrayList.add(new d(com.iqoption.core.microservices.tradingengine.response.active.d.V(InstrumentType.FOREX_INSTRUMENT), l.listOf(InstrumentType.FOREX_INSTRUMENT)));
        }
        com.iqoption.tradinghistory.i iVar = this.dXw;
        if (iVar == null) {
            kotlin.jvm.internal.i.lG("selectionViewModel");
        }
        io.reactivex.disposables.b a = iVar.aVp().bkV().t(b.dYu).g(com.iqoption.core.rx.i.akj()).a((io.reactivex.b.f) new c(this, arrayList), (io.reactivex.b.f) d.dYw);
        kotlin.jvm.internal.i.e(a, "selectionViewModel.filte…      }\n                )");
        b(a);
    }

    private final List<InstrumentType> a(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        List arrayList = new ArrayList();
        if (z) {
            arrayList.add(InstrumentType.TURBO_INSTRUMENT);
            arrayList.add(InstrumentType.BINARY_INSTRUMENT);
        }
        if (z2) {
            arrayList.add(InstrumentType.MULTI_INSTRUMENT);
        }
        if (z3) {
            arrayList.add(InstrumentType.DIGITAL_INSTRUMENT);
        }
        if (z4) {
            arrayList.add(InstrumentType.FX_INSTRUMENT);
        }
        if (z5) {
            arrayList.add(InstrumentType.CFD_INSTRUMENT);
        }
        if (z6) {
            arrayList.add(InstrumentType.CRYPTO_INSTRUMENT);
        }
        if (z7) {
            arrayList.add(InstrumentType.FOREX_INSTRUMENT);
        }
        return u.T(arrayList);
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0095 A:{LOOP_END, LOOP:1: B:32:0x008f->B:34:0x0095} */
    /* JADX WARNING: Missing block: B:19:0x005c, code skipped:
            if (r6 == null) goto L_0x005e;
     */
    public final void b(com.iqoption.tradinghistory.filter.d.d r14, boolean r15) {
        /*
        r13 = this;
        r0 = "item";
        kotlin.jvm.internal.i.f(r14, r0);
        r0 = r13.dXx;
        r0 = r0.getValue();
        r0 = (java.util.List) r0;
        if (r0 == 0) goto L_0x00b5;
    L_0x000f:
        r1 = 0;
        r2 = "prevList";
        r3 = 1;
        r4 = 0;
        if (r15 == 0) goto L_0x0060;
    L_0x0016:
        r5 = com.iqoption.tradinghistory.filter.d.f.b(r14);
        if (r5 != 0) goto L_0x005e;
    L_0x001c:
        kotlin.jvm.internal.i.e(r0, r2);
        r5 = r0;
        r5 = (java.lang.Iterable) r5;
        r5 = r5.iterator();
    L_0x0026:
        r6 = r5.hasNext();
        if (r6 == 0) goto L_0x005b;
    L_0x002c:
        r6 = r5.next();
        r7 = r6;
        r7 = (com.iqoption.tradinghistory.filter.d.b) r7;
        r8 = r7.aVZ();
        r8 = com.iqoption.tradinghistory.filter.d.f.b(r8);
        if (r8 != 0) goto L_0x0057;
    L_0x003d:
        r8 = r14.getId();
        r8 = r8.intValue();
        r9 = r7.getId();
        r9 = r9.intValue();
        if (r8 == r9) goto L_0x0057;
    L_0x004f:
        r7 = r7.asM();
        if (r7 != 0) goto L_0x0057;
    L_0x0055:
        r7 = 1;
        goto L_0x0058;
    L_0x0057:
        r7 = 0;
    L_0x0058:
        if (r7 == 0) goto L_0x0026;
    L_0x005a:
        goto L_0x005c;
    L_0x005b:
        r6 = r1;
    L_0x005c:
        if (r6 != 0) goto L_0x0060;
    L_0x005e:
        r5 = 1;
        goto L_0x0061;
    L_0x0060:
        r5 = 0;
    L_0x0061:
        if (r15 != 0) goto L_0x006b;
    L_0x0063:
        r6 = com.iqoption.tradinghistory.filter.d.f.b(r14);
        if (r6 == 0) goto L_0x006b;
    L_0x0069:
        r6 = 1;
        goto L_0x006c;
    L_0x006b:
        r6 = 0;
    L_0x006c:
        if (r5 == 0) goto L_0x0073;
    L_0x006e:
        r1 = java.lang.Boolean.valueOf(r3);
        goto L_0x0079;
    L_0x0073:
        if (r6 == 0) goto L_0x0079;
    L_0x0075:
        r1 = java.lang.Boolean.valueOf(r4);
    L_0x0079:
        kotlin.jvm.internal.i.e(r0, r2);
        r0 = (java.lang.Iterable) r0;
        r2 = new java.util.ArrayList;
        r3 = 10;
        r3 = kotlin.collections.n.e(r0, r3);
        r2.<init>(r3);
        r2 = (java.util.Collection) r2;
        r0 = r0.iterator();
    L_0x008f:
        r3 = r0.hasNext();
        if (r3 == 0) goto L_0x00b0;
    L_0x0095:
        r3 = r0.next();
        r8 = r3;
        r8 = (com.iqoption.tradinghistory.filter.d.b) r8;
        r3 = r14.getId();
        r11 = r3.intValue();
        r7 = r13;
        r9 = r1;
        r10 = r15;
        r12 = r5;
        r3 = r7.a(r8, r9, r10, r11, r12);
        r2.add(r3);
        goto L_0x008f;
    L_0x00b0:
        r2 = (java.util.List) r2;
        r13.bv(r2);
    L_0x00b5:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.tradinghistory.filter.d.e.b(com.iqoption.tradinghistory.filter.d.d, boolean):void");
    }

    private final void bv(List<b> list) {
        f fVar;
        this.dXx.postValue(list);
        Iterable iterable = list;
        for (Object next : iterable) {
            if ((((b) next).asM() ^ 1) != 0) {
                break;
            }
        }
        Object next2 = null;
        if ((next2 == null ? 1 : null) != null) {
            fVar = new f(null, 1, null);
        } else {
            Collection arrayList = new ArrayList();
            for (Object next22 : iterable) {
                if (((b) next22).asM()) {
                    arrayList.add(next22);
                }
            }
            Iterable<b> iterable2 = (List) arrayList;
            Collection arrayList2 = new ArrayList(n.e(iterable2, 10));
            for (b aVZ : iterable2) {
                arrayList2.add(aVZ.aVZ());
            }
            fVar = new f((List) arrayList2);
        }
        com.iqoption.tradinghistory.i iVar = this.dXw;
        if (iVar == null) {
            kotlin.jvm.internal.i.lG("selectionViewModel");
        }
        iVar.a(fVar);
    }

    private final b a(b bVar, Boolean bool, boolean z, int i, boolean z2) {
        if (i != bVar.getId().intValue()) {
            if (bool != null) {
                z = bool.booleanValue();
            } else if (f.b(bVar.aVZ())) {
                z = z2;
            } else {
                z = bVar.asM();
            }
        }
        return z != bVar.asM() ? b.a(bVar, null, z, 1, null) : bVar;
    }
}
