package com.iqoption.asset.repository;

import com.iqoption.core.data.d.c;
import com.iqoption.core.data.d.d;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.rx.a.b;
import com.iqoption.core.rx.g;
import com.iqoption.core.util.z;
import io.reactivex.e;
import io.reactivex.processors.BehaviorProcessor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u001dB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0007J\u001e\u0010\u0016\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u00180\u0017J\u001a\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u00172\u0006\u0010\u0015\u001a\u00020\u0007J\u0012\u0010\u0019\u001a\u00020\r2\b\b\u0002\u0010\u001a\u001a\u00020\u001bH\u0002J\u0016\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000RH\u0010\u0005\u001a<\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0006j\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t`\u000bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00100\u00100\u000fX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, bng = {"Lcom/iqoption/asset/repository/AssetFavoritesRepository;", "", "()V", "KEY_IDS", "", "favoritesStreams", "Lcom/iqoption/core/rx/livestream/RxLiveStreamsContainer;", "Lcom/iqoption/core/data/model/InstrumentType;", "Lcom/iqoption/core/util/Optional;", "", "", "Lcom/iqoption/core/rx/livestream/OptionalLiveStreamsContainer;", "prefs", "Lcom/iqoption/asset/repository/AssetFavoritesRepository$UserPrefs;", "reloadProcessor", "Lio/reactivex/processors/BehaviorProcessor;", "", "kotlin.jvm.PlatformType", "addToFavorites", "", "activeId", "instrumentType", "getFavorites", "Lio/reactivex/Flowable;", "", "getPrefs", "userId", "", "removeFromFavorites", "UserPrefs", "asset_release"})
/* compiled from: AssetFavoritesRepository.kt */
public final class a {
    private static a ayb;
    private static final BehaviorProcessor<Boolean> ayc;
    private static final b<InstrumentType, z<Set<Integer>>, Set<Integer>> ayd = new b(AssetFavoritesRepository$favoritesStreams$1.ayg);
    public static final a aye = new a();

    @i(bne = {1, 1, 15}, bnf = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u001c\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, bng = {"Lcom/iqoption/asset/repository/AssetFavoritesRepository$UserPrefs;", "", "userId", "", "prefs", "Lcom/iqoption/core/data/prefs/SharedPrefs;", "(JLcom/iqoption/core/data/prefs/SharedPrefs;)V", "getPrefs", "()Lcom/iqoption/core/data/prefs/SharedPrefs;", "getUserId", "()J", "get", "", "", "instrumentType", "Lcom/iqoption/core/data/model/InstrumentType;", "prefsKey", "", "save", "", "ids", "asset_release"})
    /* compiled from: AssetFavoritesRepository.kt */
    private static final class a {
        private final d ayf;
        private final long userId;

        public a(long j, d dVar) {
            kotlin.jvm.internal.i.f(dVar, "prefs");
            this.userId = j;
            this.ayf = dVar;
        }

        public final long getUserId() {
            return this.userId;
        }

        private final String y(InstrumentType instrumentType) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(instrumentType.getServerValue());
            stringBuilder.append(":ids");
            return stringBuilder.toString();
        }

        public final Set<Integer> z(InstrumentType instrumentType) {
            kotlin.jvm.internal.i.f(instrumentType, "instrumentType");
            Set<Integer> a = c.b.a(this.ayf, y(instrumentType), null, 2, null);
            return a != null ? a : al.emptySet();
        }

        public final void a(InstrumentType instrumentType, Set<Integer> set) {
            kotlin.jvm.internal.i.f(instrumentType, "instrumentType");
            kotlin.jvm.internal.i.f(set, "ids");
            this.ayf.c(y(instrumentType), set);
        }
    }

    static {
        BehaviorProcessor cX = BehaviorProcessor.cX(Boolean.valueOf(true));
        kotlin.jvm.internal.i.e(cX, "BehaviorProcessor.createDefault(true)");
        ayc = cX;
    }

    private a() {
    }

    static /* synthetic */ a a(a aVar, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = com.iqoption.core.d.EA().getUserId();
        }
        return aVar.at(j);
    }

    private final a at(long j) {
        a aVar = ayb;
        if (aVar != null) {
            if ((aVar.getUserId() == j ? 1 : null) == null) {
                aVar = null;
            }
            if (aVar != null) {
                return aVar;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AssetFavorites[");
        stringBuilder.append(com.iqoption.core.d.EA().getUserId());
        stringBuilder.append(']');
        aVar = new a(j, new d(stringBuilder.toString()));
        ayb = aVar;
        return aVar;
    }

    public final e<Map<InstrumentType, Set<Integer>>> JZ() {
        List knownValues = InstrumentType.Companion.getKnownValues();
        Iterable<InstrumentType> iterable = knownValues;
        Collection arrayList = new ArrayList(n.e(iterable, 10));
        for (InstrumentType s : iterable) {
            arrayList.add(aye.s(s));
        }
        return g.i(knownValues, (List) arrayList);
    }

    public final e<Set<Integer>> s(InstrumentType instrumentType) {
        kotlin.jvm.internal.i.f(instrumentType, "instrumentType");
        return ayd.bR(instrumentType.toLocalInstrumentType());
    }

    public final void b(int i, InstrumentType instrumentType) {
        kotlin.jvm.internal.i.f(instrumentType, "instrumentType");
        instrumentType = instrumentType.toLocalInstrumentType();
        a(aye, 0, 1, null).a(instrumentType, am.d(a(aye, 0, 1, null).z(instrumentType), Integer.valueOf(i)));
        ayc.onNext(Boolean.valueOf(true));
    }

    public final void c(int i, InstrumentType instrumentType) {
        kotlin.jvm.internal.i.f(instrumentType, "instrumentType");
        instrumentType = instrumentType.toLocalInstrumentType();
        a(aye, 0, 1, null).a(instrumentType, am.c(a(aye, 0, 1, null).z(instrumentType), Integer.valueOf(i)));
        ayc.onNext(Boolean.valueOf(true));
    }
}
