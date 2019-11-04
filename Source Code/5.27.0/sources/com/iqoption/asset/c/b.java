package com.iqoption.asset.c;

import com.iqoption.core.data.model.InstrumentType;
import io.reactivex.b.f;
import io.reactivex.b.g;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\bf\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013J\u0014\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH&J \u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH&J\"\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000f0\u000e0\u00072\u0006\u0010\u0004\u001a\u00020\u0005H&J6\u0010\r\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000f0\u000e0\u000e0\u00072\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0011H\u0016J\u0014\u0010\u0012\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0014"}, bng = {"Lcom/iqoption/asset/markup/MarkupManager;", "", "coolDown", "", "instrumentType", "Lcom/iqoption/core/data/model/InstrumentType;", "getMarkup", "Lio/reactivex/Flowable;", "Lcom/iqoption/core/microservices/risks/response/markup/SpreadMarkup;", "activeId", "", "leverage", "getMarkupImmediate", "getMarkups", "", "Lcom/iqoption/core/microservices/risks/response/markup/ActiveMarkups;", "instrumentTypes", "", "warmUp", "Companion", "asset_release"})
/* compiled from: MarkupManager.kt */
public interface b {
    public static final a axz = a.axC;

    @i(bne = {1, 1, 15}, bnf = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\bH\u0016J&\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u000fH\u0016J \u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u000fH\u0016J\"\u0010\u001c\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e0\u00172\u0006\u0010\u0015\u001a\u00020\bH\u0016J\u0012\u0010\u001d\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\bH\u0016J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\nH\u0002J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u00042\u0006\u0010 \u001a\u00020\nH\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0004¢\u0006\u0002\n\u0000R&\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e0\rX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00120\rX\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, bng = {"Lcom/iqoption/asset/markup/MarkupManager$Companion;", "Lcom/iqoption/asset/markup/MarkupManager;", "()V", "ANY_CONSUMER", "Lio/reactivex/functions/Consumer;", "", "SUPPORTED_INSTRUMENT_TYPES", "", "Lcom/iqoption/core/data/model/InstrumentType;", "TAG", "", "kotlin.jvm.PlatformType", "markupsCache", "Ljava/util/concurrent/ConcurrentHashMap;", "", "", "Lcom/iqoption/core/microservices/risks/response/markup/ActiveMarkups;", "warmedUp", "Lio/reactivex/disposables/Disposable;", "coolDown", "", "instrumentType", "getMarkup", "Lio/reactivex/Flowable;", "Lcom/iqoption/core/microservices/risks/response/markup/SpreadMarkup;", "activeId", "leverage", "getMarkupImmediate", "getMarkups", "warmUp", "warmUpCompleteConsumer", "Lio/reactivex/functions/Action;", "msg", "warmUpErrorConsumer", "", "asset_release"})
    /* compiled from: MarkupManager.kt */
    public static final class a implements b {
        private static final String TAG = b.class.getSimpleName();
        private static final List<InstrumentType> axA = m.listOf(InstrumentType.CFD_INSTRUMENT, InstrumentType.FOREX_INSTRUMENT, InstrumentType.CRYPTO_INSTRUMENT);
        private static final ConcurrentHashMap<InstrumentType, Map<Integer, com.iqoption.core.microservices.risks.response.markup.a>> axB = new ConcurrentHashMap();
        static final /* synthetic */ a axC = new a();
        private static final f<Object> axa = a.axD;
        private static final ConcurrentHashMap<InstrumentType, io.reactivex.disposables.b> axc = new ConcurrentHashMap();

        @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"})
        /* compiled from: MarkupManager.kt */
        static final class a<T> implements f<Object> {
            public static final a axD = new a();

            a() {
            }

            public final void accept(Object obj) {
            }
        }

        @i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "Lcom/iqoption/core/microservices/risks/response/markup/SpreadMarkup;", "activeMarkups", "", "", "Lcom/iqoption/core/microservices/risks/response/markup/ActiveMarkups;", "apply"})
        /* compiled from: MarkupManager.kt */
        static final class b<T, R> implements g<T, R> {
            final /* synthetic */ int $activeId;
            final /* synthetic */ int axE;

            b(int i, int i2) {
                this.$activeId = i;
                this.axE = i2;
            }

            /* renamed from: y */
            public final com.iqoption.core.microservices.risks.response.markup.c apply(Map<Integer, com.iqoption.core.microservices.risks.response.markup.a> map) {
                kotlin.jvm.internal.i.f(map, "activeMarkups");
                com.iqoption.core.microservices.risks.response.markup.a aVar = (com.iqoption.core.microservices.risks.response.markup.a) map.get(Integer.valueOf(this.$activeId));
                if (aVar != null) {
                    com.iqoption.core.microservices.risks.response.markup.c eW = aVar.eW(this.axE);
                    if (eW != null) {
                        return eW;
                    }
                }
                return com.iqoption.core.microservices.risks.response.markup.c.byt.ahk();
            }
        }

        @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, bng = {"<anonymous>", "", "it", "", "", "Lcom/iqoption/core/microservices/risks/response/markup/ActiveMarkups;", "kotlin.jvm.PlatformType", "accept"})
        /* compiled from: MarkupManager.kt */
        static final class c<T> implements f<Map<Integer, ? extends com.iqoption.core.microservices.risks.response.markup.a>> {
            final /* synthetic */ InstrumentType $instrumentType;
            final /* synthetic */ a axF;

            c(a aVar, InstrumentType instrumentType) {
                this.axF = aVar;
                this.$instrumentType = instrumentType;
            }

            /* renamed from: z */
            public final void accept(Map<Integer, com.iqoption.core.microservices.risks.response.markup.a> map) {
                Map a = a.axB;
                InstrumentType instrumentType = this.$instrumentType;
                kotlin.jvm.internal.i.e(map, "it");
                a.put(instrumentType, map);
            }
        }

        @i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "run"})
        /* compiled from: MarkupManager.kt */
        static final class d implements io.reactivex.b.a {
            public static final d axG = new d();

            d() {
            }

            public final void run() {
            }
        }

        @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "accept"})
        /* compiled from: MarkupManager.kt */
        static final class e<T> implements f<Throwable> {
            public static final e axH = new e();

            e() {
            }

            /* renamed from: o */
            public final void accept(Throwable th) {
            }
        }

        private a() {
        }

        private final f<Throwable> es(String str) {
            return e.axH;
        }

        private final io.reactivex.b.a et(String str) {
            return d.axG;
        }

        public io.reactivex.e<com.iqoption.core.microservices.risks.response.markup.c> a(int i, InstrumentType instrumentType, int i2) {
            kotlin.jvm.internal.i.f(instrumentType, "instrumentType");
            if (axA.contains(instrumentType)) {
                io.reactivex.e<com.iqoption.core.microservices.risks.response.markup.c> g = x(instrumentType).g(new b(i, i2));
                kotlin.jvm.internal.i.e(g, "getMarkups(instrumentTyp…                        }");
                return g;
            }
            io.reactivex.e c = io.reactivex.e.cD(com.iqoption.core.microservices.risks.response.markup.c.byt.ahk()).c((org.a.b) io.reactivex.e.bkR());
            kotlin.jvm.internal.i.e(c, "Flowable\n               …catWith(Flowable.never())");
            return c;
        }

        public io.reactivex.e<Map<Integer, com.iqoption.core.microservices.risks.response.markup.a>> x(InstrumentType instrumentType) {
            kotlin.jvm.internal.i.f(instrumentType, "instrumentType");
            if (axA.contains(instrumentType)) {
                io.reactivex.e<Map<Integer, com.iqoption.core.microservices.risks.response.markup.a>> c = com.iqoption.asset.repository.b.ayl.x(instrumentType).c((f) new c(this, instrumentType));
                kotlin.jvm.internal.i.e(c, "MarkupRepository.getMark…                        }");
                return c;
            }
            io.reactivex.e c2 = io.reactivex.e.cD(af.emptyMap()).c((org.a.b) io.reactivex.e.bkR());
            kotlin.jvm.internal.i.e(c2, "Flowable\n               …catWith(Flowable.never())");
            return c2;
        }

        public void t(InstrumentType instrumentType) {
            if (instrumentType != null) {
                ConcurrentMap concurrentMap = axc;
                if (concurrentMap.get(instrumentType) == null) {
                    io.reactivex.e d = x(instrumentType).d(com.iqoption.core.rx.i.aki());
                    f fVar = axa;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Failed warmed up markups: ");
                    stringBuilder.append(instrumentType);
                    f es = es(stringBuilder.toString());
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("Completed warmed up markups: ");
                    stringBuilder2.append(instrumentType);
                    Object putIfAbsent = concurrentMap.putIfAbsent(instrumentType, d.a(fVar, es, et(stringBuilder2.toString())));
                    return;
                }
                return;
            }
            for (InstrumentType t : InstrumentType.Companion.getKnownValues()) {
                t(t);
            }
        }

        public void u(InstrumentType instrumentType) {
            if (instrumentType != null) {
                io.reactivex.disposables.b bVar = (io.reactivex.disposables.b) axc.remove(instrumentType);
                if (bVar != null) {
                    bVar.dispose();
                    return;
                }
                return;
            }
            for (InstrumentType u : InstrumentType.Companion.getKnownValues()) {
                u(u);
            }
        }

        public com.iqoption.core.microservices.risks.response.markup.c b(int i, InstrumentType instrumentType, int i2) {
            kotlin.jvm.internal.i.f(instrumentType, "instrumentType");
            Map map = (Map) axB.get(instrumentType);
            if (map != null) {
                com.iqoption.core.microservices.risks.response.markup.a aVar = (com.iqoption.core.microservices.risks.response.markup.a) map.get(Integer.valueOf(i));
                if (aVar != null) {
                    com.iqoption.core.microservices.risks.response.markup.c eW = aVar.eW(i2);
                    if (eW != null) {
                        return eW;
                    }
                }
            }
            return com.iqoption.core.microservices.risks.response.markup.c.byt.ahk();
        }
    }
}
