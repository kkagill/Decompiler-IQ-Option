package com.iqoption.billing.repository;

import com.iqoption.core.manager.ac;
import com.iqoption.core.microservices.billing.response.PaymentStatusType;
import com.iqoption.core.microservices.billing.response.e;
import com.iqoption.core.util.z;
import io.reactivex.b.g;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\b\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\b\u0012\u0004\u0012\u00020\u0006`\u0007H\u0002J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\nR.\u0010\u0003\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, bng = {"Lcom/iqoption/billing/repository/InvoicesRepository;", "", "()V", "hasInvoicesSupplier", "Lcom/iqoption/core/rx/livestream/RxLiveStreamSupplier;", "Lcom/iqoption/core/util/Optional;", "", "Lcom/iqoption/core/rx/livestream/OptionalLiveStreamSupplier;", "createHasInvoicesLiveStream", "observeHasInvoices", "Lio/reactivex/Flowable;", "billing_release"})
/* compiled from: InvoicesRepository.kt */
public final class b {
    private static com.iqoption.core.rx.a.a<z<Boolean>, Boolean> azi;
    public static final b azj = new b();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "", "Lcom/iqoption/core/microservices/billing/response/invoice/Invoice;", "apply"})
    /* compiled from: InvoicesRepository.kt */
    static final class a<T, R> implements g<T, R> {
        public static final a azk = new a();

        a() {
        }

        public /* synthetic */ Object apply(Object obj) {
            return Boolean.valueOf(J((List) obj));
        }

        public final boolean J(List<com.iqoption.core.microservices.billing.response.a.a> list) {
            kotlin.jvm.internal.i.f(list, "it");
            return list.isEmpty() ^ 1;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/microservices/billing/response/DepositCompleted;", "apply"})
    /* compiled from: InvoicesRepository.kt */
    static final class b<T, R> implements g<T, R> {
        public static final b azl = new b();

        b() {
        }

        public final boolean b(e eVar) {
            kotlin.jvm.internal.i.f(eVar, "it");
            return true;
        }

        public /* synthetic */ Object apply(Object obj) {
            return Boolean.valueOf(b((e) obj));
        }
    }

    private b() {
    }

    public final io.reactivex.e<Boolean> KA() {
        if (azi == null) {
            azi = KB();
        }
        com.iqoption.core.rx.a.a aVar = azi;
        if (aVar == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        return aVar.ako();
    }

    private final com.iqoption.core.rx.a.a<z<Boolean>, Boolean> KB() {
        io.reactivex.e g = com.iqoption.core.microservices.billing.a.bmi.a(PaymentStatusType.IQOPTION_SUCCESS, Integer.valueOf(1)).bkO().g(a.azk);
        kotlin.jvm.internal.i.e(g, "CashBoxRequests.getUserI… .map { it.isNotEmpty() }");
        io.reactivex.e g2 = com.iqoption.core.microservices.billing.a.bmi.Zs().g(b.azl);
        kotlin.jvm.internal.i.e(g2, "CashBoxRequests.getDepos…tedUpdates().map { true }");
        io.reactivex.e c = g.c((org.a.b) g2);
        kotlin.jvm.internal.i.e(c, "initial.concatWith(updates)");
        return ac.bkp.a("Has invoices", c, 2, TimeUnit.MINUTES);
    }
}
