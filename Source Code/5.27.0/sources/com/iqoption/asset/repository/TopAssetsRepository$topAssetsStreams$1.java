package com.iqoption.asset.repository;

import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.manager.ac;
import com.iqoption.core.util.z;
import io.reactivex.b.g;
import io.reactivex.e;
import java.util.Map;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a~\u0012*\u0012(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u00030\u0002\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u00030\u0001j(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003`\u00072\u0006\u0010\b\u001a\u00020\tH\n¢\u0006\u0002\b\n"}, bng = {"<anonymous>", "Lcom/iqoption/core/rx/livestream/RxLiveStreamSupplier;", "Lcom/iqoption/core/util/Optional;", "", "", "Lcom/iqoption/core/microservices/topassets/response/spread/SpreadData;", "kotlin.jvm.PlatformType", "Lcom/iqoption/core/rx/livestream/OptionalLiveStreamSupplier;", "instrumentType", "Lcom/iqoption/core/data/model/InstrumentType;", "invoke"})
/* compiled from: TopAssetsRepository.kt */
final class TopAssetsRepository$topAssetsStreams$1 extends Lambda implements b<InstrumentType, com.iqoption.core.rx.a.a<z<Map<Integer, ? extends com.iqoption.core.microservices.f.a.a.a>>, Map<Integer, ? extends com.iqoption.core.microservices.f.a.a.a>>> {
    public static final TopAssetsRepository$topAssetsStreams$1 ayr = new TopAssetsRepository$topAssetsStreams$1();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "", "Lcom/iqoption/core/microservices/topassets/response/spread/SpreadData;", "topAssets", "Lcom/iqoption/core/microservices/topassets/response/spread/SpreadDataResult;", "apply"})
    /* compiled from: TopAssetsRepository.kt */
    static final class a<T, R> implements g<T, R> {
        public static final a ays = new a();

        a() {
        }

        /* renamed from: a */
        public final Map<Integer, com.iqoption.core.microservices.f.a.a.a> apply(com.iqoption.core.microservices.f.a.a.b bVar) {
            kotlin.jvm.internal.i.f(bVar, "topAssets");
            return bVar.ahE();
        }
    }

    TopAssetsRepository$topAssetsStreams$1() {
        super(1);
    }

    /* renamed from: A */
    public final com.iqoption.core.rx.a.a<z<Map<Integer, com.iqoption.core.microservices.f.a.a.a>>, Map<Integer, com.iqoption.core.microservices.f.a.a.a>> invoke(InstrumentType instrumentType) {
        kotlin.jvm.internal.i.f(instrumentType, "instrumentType");
        e g = e.a((org.a.b) com.iqoption.core.microservices.f.a.byW.K(instrumentType).bkO(), (org.a.b) com.iqoption.core.microservices.f.a.byW.L(instrumentType)).g(a.ays);
        kotlin.jvm.internal.i.e(g, "Flowable\n               …esult()\n                }");
        ac acVar = ac.bkp;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Top assets: ");
        stringBuilder.append(instrumentType);
        return ac.a(acVar, stringBuilder.toString(), g, 0, null, 12, null);
    }
}
