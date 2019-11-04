package com.iqoption.core.data.repository;

import com.iqoption.core.microservices.configuration.a.d;
import com.iqoption.core.util.z;
import io.reactivex.e;
import io.reactivex.p;
import java.util.List;
import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a \u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "Lcom/iqoption/core/rx/livestream/RxLiveStreamSupplier;", "Lcom/iqoption/core/util/Optional;", "", "Lcom/iqoption/core/microservices/configuration/response/Currency;", "invoke"})
/* compiled from: GeneralRepository.kt */
final class GeneralRepository$currenciesStream$2 extends Lambda implements a<com.iqoption.core.rx.a.a<z<List<? extends d>>, List<? extends d>>> {
    public static final GeneralRepository$currenciesStream$2 bdA = new GeneralRepository$currenciesStream$2();

    GeneralRepository$currenciesStream$2() {
        super(0);
    }

    /* renamed from: AX */
    public final com.iqoption.core.rx.a.a<z<List<d>>, List<d>> invoke() {
        c cVar = c.bdy;
        p acI = com.iqoption.core.microservices.configuration.a.brg.acI();
        e acJ = com.iqoption.core.microservices.configuration.a.brg.acJ();
        kotlin.jvm.internal.i.e(acJ, "ConfigurationRequests.currencyUpdatesStream");
        return cVar.a("Currencies", acI, acJ);
    }
}
