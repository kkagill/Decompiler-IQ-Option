package com.iqoption.asset.repository;

import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.microservices.f.a.a.a;
import com.iqoption.core.rx.a.b;
import com.iqoption.core.util.z;
import io.reactivex.e;
import java.util.Map;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\f2\u0006\u0010\r\u001a\u00020\u0005RZ\u0010\u0003\u001aN\u0012\u0004\u0012\u00020\u0005\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u0004j\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007`\nX\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, bng = {"Lcom/iqoption/asset/repository/TopAssetsRepository;", "", "()V", "topAssetsStreams", "Lcom/iqoption/core/rx/livestream/RxLiveStreamsContainer;", "Lcom/iqoption/core/data/model/InstrumentType;", "Lcom/iqoption/core/util/Optional;", "", "", "Lcom/iqoption/core/microservices/topassets/response/spread/SpreadData;", "Lcom/iqoption/core/rx/livestream/OptionalLiveStreamsContainer;", "getTopAssets", "Lio/reactivex/Flowable;", "instrumentType", "asset_release"})
/* compiled from: TopAssetsRepository.kt */
public final class c {
    private static final b<InstrumentType, z<Map<Integer, a>>, Map<Integer, a>> ayp = new b(TopAssetsRepository$topAssetsStreams$1.ayr);
    public static final c ayq = new c();

    private c() {
    }

    public final e<Map<Integer, a>> p(InstrumentType instrumentType) {
        kotlin.jvm.internal.i.f(instrumentType, "instrumentType");
        return ayp.bR(instrumentType);
    }
}
