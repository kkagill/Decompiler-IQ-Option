package com.iqoption.fragment.assets;

import com.iqoption.core.rx.g;
import com.iqoption.core.util.z;
import com.iqoption.fragment.assets.model.AssetCategoryType;
import com.iqoption.fragment.assets.model.p;
import io.reactivex.e;
import io.reactivex.processors.BehaviorProcessor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.d;
import kotlin.i;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u001a2\u00020\u0001:\u0002\u001a\u001bB\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0002J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0013\u001a\u00020\u0007H\u0002J\u0018\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\r0\u00160\u0015J\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\u00152\u0006\u0010\u0013\u001a\u00020\u0007J\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\rR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R \u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0006X\u0004¢\u0006\u0002\n\u0000R6\u0010\n\u001a*\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0004\u0012\u00020\r0\u000bj\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\r`\u000eX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, bng = {"Lcom/iqoption/fragment/assets/AssetSortingRepository;", "", "()V", "prefs", "Lcom/iqoption/fragment/assets/AssetSortingRepository$UserPrefs;", "reloaders", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/iqoption/fragment/assets/model/AssetCategoryType;", "Lio/reactivex/processors/BehaviorProcessor;", "", "sortingStreams", "Lcom/iqoption/core/rx/livestream/RxLiveStreamsContainer;", "Lcom/iqoption/core/util/Optional;", "Lcom/iqoption/fragment/assets/model/AssetSorting;", "Lcom/iqoption/core/rx/livestream/OptionalLiveStreamsContainer;", "getPrefs", "userId", "", "getReloader", "categoryType", "getSorting", "Lio/reactivex/Flowable;", "", "updateSorting", "", "sorting", "Companion", "UserPrefs", "app_optionXRelease"})
/* compiled from: AssetSortingRepository.kt */
public final class a {
    private static final d aWy = g.c(AssetSortingRepository$Companion$instance$2.daI);
    public static final a daH = new a();
    private final ConcurrentHashMap<AssetCategoryType, BehaviorProcessor<Boolean>> daE = new ConcurrentHashMap();
    private final com.iqoption.core.rx.a.b<AssetCategoryType, z<p>, p> daF = new com.iqoption.core.rx.a.b(new AssetSortingRepository$sortingStreams$1(this));
    private b daG;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R!\u0010\u0005\u001a\u00020\u00068FX\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u0012\u0004\b\u0007\u0010\u0002\u001a\u0004\b\b\u0010\t¨\u0006\f"}, bng = {"Lcom/iqoption/fragment/assets/AssetSortingRepository$Companion;", "", "()V", "KEY_SORTING", "", "instance", "Lcom/iqoption/fragment/assets/AssetSortingRepository;", "instance$annotations", "getInstance", "()Lcom/iqoption/fragment/assets/AssetSortingRepository;", "instance$delegate", "Lkotlin/Lazy;", "app_optionXRelease"})
    /* compiled from: AssetSortingRepository.kt */
    public static final class a {
        static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(a.class), "instance", "getInstance()Lcom/iqoption/fragment/assets/AssetSortingRepository;"))};

        public final a aAg() {
            d Te = a.aWy;
            a aVar = a.daH;
            j jVar = anY[0];
            return (a) Te.getValue();
        }

        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, bng = {"Lcom/iqoption/fragment/assets/AssetSortingRepository$UserPrefs;", "", "userId", "", "prefs", "Lcom/iqoption/core/data/prefs/SharedPrefs;", "(JLcom/iqoption/core/data/prefs/SharedPrefs;)V", "getPrefs", "()Lcom/iqoption/core/data/prefs/SharedPrefs;", "getUserId", "()J", "get", "Lcom/iqoption/fragment/assets/model/AssetSorting;", "categoryType", "Lcom/iqoption/fragment/assets/model/AssetCategoryType;", "prefsKey", "", "save", "", "sorting", "app_optionXRelease"})
    /* compiled from: AssetSortingRepository.kt */
    private static final class b {
        private final com.iqoption.core.data.d.d ayf;
        private final long userId;

        public b(long j, com.iqoption.core.data.d.d dVar) {
            kotlin.jvm.internal.i.f(dVar, "prefs");
            this.userId = j;
            this.ayf = dVar;
        }

        public final long getUserId() {
            return this.userId;
        }

        private final String c(AssetCategoryType assetCategoryType) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(assetCategoryType.name());
            stringBuilder.append(":sorting");
            return stringBuilder.toString();
        }

        public final p d(AssetCategoryType assetCategoryType) {
            kotlin.jvm.internal.i.f(assetCategoryType, "categoryType");
            p pVar = (p) com.iqoption.core.data.d.c.b.a(this.ayf, c(assetCategoryType), p.class, null, 4, null);
            return pVar != null ? pVar : assetCategoryType.getSorting();
        }

        public final void b(p pVar) {
            kotlin.jvm.internal.i.f(pVar, "sorting");
            this.ayf.m(c(pVar.aBu()), pVar);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "run"})
    /* compiled from: AssetSortingRepository.kt */
    static final class c implements Runnable {
        final /* synthetic */ p daK;
        final /* synthetic */ a this$0;

        c(a aVar, p pVar) {
            this.this$0 = aVar;
            this.daK = pVar;
        }

        public final void run() {
            a.a(this.this$0, 0, 1, null).b(this.daK);
            this.this$0.a(this.daK.aBu()).onNext(Boolean.valueOf(true));
        }
    }

    static /* synthetic */ b a(a aVar, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = com.iqoption.core.d.EA().getUserId();
        }
        return aVar.bF(j);
    }

    private final b bF(long j) {
        b bVar = this.daG;
        if (bVar != null) {
            if ((bVar.getUserId() == j ? 1 : null) == null) {
                bVar = null;
            }
            if (bVar != null) {
                return bVar;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AssetSorting[");
        stringBuilder.append(com.iqoption.core.d.EA().getUserId());
        stringBuilder.append(']');
        bVar = new b(j, new com.iqoption.core.data.d.d(stringBuilder.toString()));
        this.daG = bVar;
        return bVar;
    }

    private final BehaviorProcessor<Boolean> a(AssetCategoryType assetCategoryType) {
        BehaviorProcessor<Boolean> behaviorProcessor = (BehaviorProcessor) this.daE.get(assetCategoryType);
        if (behaviorProcessor != null) {
            return behaviorProcessor;
        }
        BehaviorProcessor cX = BehaviorProcessor.cX(Boolean.valueOf(true));
        Map map = this.daE;
        kotlin.jvm.internal.i.e(cX, "it");
        map.put(assetCategoryType, cX);
        kotlin.jvm.internal.i.e(cX, "BehaviorProcessor.create…egoryType] = it\n        }");
        return cX;
    }

    public final e<Map<AssetCategoryType, p>> aAf() {
        List sortableTypes = AssetCategoryType.Companion.getSortableTypes();
        Iterable<AssetCategoryType> iterable = sortableTypes;
        Collection arrayList = new ArrayList(n.e(iterable, 10));
        for (AssetCategoryType b : iterable) {
            arrayList.add(b(b));
        }
        return g.i(sortableTypes, (List) arrayList);
    }

    public final e<p> b(AssetCategoryType assetCategoryType) {
        kotlin.jvm.internal.i.f(assetCategoryType, "categoryType");
        return this.daF.bR(assetCategoryType);
    }

    public final void a(p pVar) {
        kotlin.jvm.internal.i.f(pVar, "sorting");
        com.iqoption.core.rx.i.aki().m(new c(this, pVar));
    }
}
