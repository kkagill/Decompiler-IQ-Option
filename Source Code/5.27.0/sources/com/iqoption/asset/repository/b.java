package com.iqoption.asset.repository;

import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.microservices.risks.response.markup.e;
import com.iqoption.core.util.z;
import io.reactivex.b.g;
import io.reactivex.p;
import io.reactivex.processors.PublishProcessor;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u000f2\u0006\u0010\u0010\u001a\u00020\u000bJ \u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u00122\u0006\u0010\u0010\u001a\u00020\u000bJ\"\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u000f2\u0006\u0010\u0010\u001a\u00020\u000bH\u0002R4\u0010\u0003\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007 \b*\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00050\u00050\u0004X\u0004¢\u0006\u0002\n\u0000RZ\u0010\t\u001aN\u0012\u0004\u0012\u00020\u000b\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\nj\u001a\u0012\u0004\u0012\u00020\u000b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005`\rX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, bng = {"Lcom/iqoption/asset/repository/MarkupRepository;", "", "()V", "forceRefreshProcessor", "Lio/reactivex/processors/PublishProcessor;", "", "", "Lcom/iqoption/core/microservices/risks/response/markup/ActiveMarkups;", "kotlin.jvm.PlatformType", "markupStreams", "Lcom/iqoption/core/rx/livestream/RxLiveStreamsContainer;", "Lcom/iqoption/core/data/model/InstrumentType;", "Lcom/iqoption/core/util/Optional;", "Lcom/iqoption/core/rx/livestream/OptionalLiveStreamsContainer;", "forceLoadMarkups", "Lio/reactivex/Single;", "instrumentType", "getMarkups", "Lio/reactivex/Flowable;", "loadMarkups", "asset_release"})
/* compiled from: MarkupRepository.kt */
public final class b {
    private static final PublishProcessor<Map<Integer, com.iqoption.core.microservices.risks.response.markup.a>> ayj;
    private static final com.iqoption.core.rx.a.b<InstrumentType, z<Map<Integer, com.iqoption.core.microservices.risks.response.markup.a>>, Map<Integer, com.iqoption.core.microservices.risks.response.markup.a>> ayk = new com.iqoption.core.rx.a.b(MarkupRepository$markupStreams$1.ayn);
    public static final b ayl = new b();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "", "Lcom/iqoption/core/microservices/risks/response/markup/ActiveMarkups;", "markups", "Lcom/iqoption/core/microservices/risks/response/markup/SpreadMarkups;", "apply"})
    /* compiled from: MarkupRepository.kt */
    static final class a<T, R> implements g<T, R> {
        public static final a aym = new a();

        a() {
        }

        /* renamed from: a */
        public final Map<Integer, com.iqoption.core.microservices.risks.response.markup.a> apply(e eVar) {
            kotlin.jvm.internal.i.f(eVar, "markups");
            if ((eVar.getItems().isEmpty() ^ 1) == 0) {
                return af.emptyMap();
            }
            Iterable actives = ((com.iqoption.core.microservices.risks.response.markup.b) eVar.getItems().get(0)).getActives();
            Map<Integer, com.iqoption.core.microservices.risks.response.markup.a> linkedHashMap = new LinkedHashMap(m.bi(af.jL(n.e(actives, 10)), 16));
            for (Object next : actives) {
                linkedHashMap.put(Integer.valueOf(((com.iqoption.core.microservices.risks.response.markup.a) next).getActiveId()), next);
            }
            return linkedHashMap;
        }
    }

    static {
        PublishProcessor bmK = PublishProcessor.bmK();
        kotlin.jvm.internal.i.e(bmK, "PublishProcessor.create<Map<Int, ActiveMarkups>>()");
        ayj = bmK;
    }

    private b() {
    }

    private final p<Map<Integer, com.iqoption.core.microservices.risks.response.markup.a>> B(InstrumentType instrumentType) {
        p t = com.iqoption.core.microservices.risks.a.a(com.iqoption.core.microservices.risks.a.bxY, instrumentType, 0, 2, null).t(a.aym);
        kotlin.jvm.internal.i.e(t, "RisksRequests.getSpreadM…      }\n                }");
        return t;
    }

    public final io.reactivex.e<Map<Integer, com.iqoption.core.microservices.risks.response.markup.a>> x(InstrumentType instrumentType) {
        kotlin.jvm.internal.i.f(instrumentType, "instrumentType");
        return ayk.bR(instrumentType);
    }
}
