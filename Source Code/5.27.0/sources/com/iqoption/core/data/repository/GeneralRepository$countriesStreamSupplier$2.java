package com.iqoption.core.data.repository;

import com.iqoption.core.microservices.configuration.a.c;
import com.iqoption.core.util.z;
import io.reactivex.e;
import io.reactivex.p;
import java.util.List;
import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a \u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "Lcom/iqoption/core/rx/livestream/RxLiveStreamSupplier;", "Lcom/iqoption/core/util/Optional;", "", "Lcom/iqoption/core/microservices/configuration/response/Country;", "invoke"})
/* compiled from: GeneralRepository.kt */
final class GeneralRepository$countriesStreamSupplier$2 extends Lambda implements a<com.iqoption.core.rx.a.a<z<List<? extends c>>, List<? extends c>>> {
    public static final GeneralRepository$countriesStreamSupplier$2 bdz = new GeneralRepository$countriesStreamSupplier$2();

    GeneralRepository$countriesStreamSupplier$2() {
        super(0);
    }

    /* renamed from: AX */
    public final com.iqoption.core.rx.a.a<z<List<c>>, List<c>> invoke() {
        c cVar = c.bdy;
        p acK = com.iqoption.core.microservices.configuration.a.brg.acK();
        e acL = com.iqoption.core.microservices.configuration.a.brg.acL();
        kotlin.jvm.internal.i.e(acL, "ConfigurationRequests.countryUpdatesStream");
        return cVar.a("Countries", acK, acL);
    }
}
