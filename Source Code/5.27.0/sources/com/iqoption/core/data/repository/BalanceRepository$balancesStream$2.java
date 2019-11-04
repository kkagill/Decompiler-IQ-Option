package com.iqoption.core.data.repository;

import com.iqoption.core.manager.ac;
import com.iqoption.core.util.z;
import io.reactivex.b.g;
import io.reactivex.e;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.i;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001aZ\u0012\u001e\u0012\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u00030\u0002\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u00030\u0001j\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003`\u0006H\n¢\u0006\u0002\b\u0007"}, bng = {"<anonymous>", "Lcom/iqoption/core/rx/livestream/RxLiveStreamSupplier;", "Lcom/iqoption/core/util/Optional;", "", "Lcom/iqoption/core/microservices/internalbilling/response/Balance;", "kotlin.jvm.PlatformType", "Lcom/iqoption/core/rx/livestream/OptionalLiveStreamSupplier;", "invoke"})
/* compiled from: BalanceRepository.kt */
final class BalanceRepository$balancesStream$2 extends Lambda implements kotlin.jvm.a.a<com.iqoption.core.rx.a.a<z<List<? extends com.iqoption.core.microservices.internalbilling.a.b>>, List<? extends com.iqoption.core.microservices.internalbilling.a.b>>> {
    public static final BalanceRepository$balancesStream$2 bdt = new BalanceRepository$balancesStream$2();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "Lcom/iqoption/core/microservices/internalbilling/response/Balance;", "authBalanceChange", "Lcom/iqoption/core/microservices/internalbilling/response/AuthBalanceChanged;", "apply"})
    /* compiled from: BalanceRepository.kt */
    static final class a<T, R> implements g<T, R> {
        final /* synthetic */ AtomicReference $list;

        a(AtomicReference atomicReference) {
            this.$list = atomicReference;
        }

        /* renamed from: a */
        public final List<com.iqoption.core.microservices.internalbilling.a.b> apply(com.iqoption.core.microservices.internalbilling.a.a aVar) {
            kotlin.jvm.internal.i.f(aVar, "authBalanceChange");
            Object obj = this.$list.get();
            kotlin.jvm.internal.i.e(obj, "list.get()");
            List<com.iqoption.core.microservices.internalbilling.a.b> I = u.I((Collection) obj);
            int i = 0;
            for (com.iqoption.core.microservices.internalbilling.a.b id : I) {
                if ((id.getId() == aVar.getId() ? 1 : null) != null) {
                    break;
                }
                i++;
            }
            i = -1;
            if (i != -1) {
                I.set(i, com.iqoption.core.microservices.internalbilling.a.b.a((com.iqoption.core.microservices.internalbilling.a.b) I.get(i), 0, 0, 0, null, aVar.aeo(), null, null, null, null, null, null, false, 4079, null));
            }
            return I;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "Lcom/iqoption/core/microservices/internalbilling/response/Balance;", "it", "Lcom/iqoption/core/microservices/Event;", "apply"})
    /* compiled from: BalanceRepository.kt */
    static final class b<T, R> implements g<T, R> {
        final /* synthetic */ AtomicReference $list;

        b(AtomicReference atomicReference) {
            this.$list = atomicReference;
        }

        /* renamed from: a */
        public final List<com.iqoption.core.microservices.internalbilling.a.b> apply(com.iqoption.core.microservices.b<com.iqoption.core.microservices.internalbilling.a.b> bVar) {
            kotlin.jvm.internal.i.f(bVar, "it");
            Object obj = this.$list.get();
            kotlin.jvm.internal.i.e(obj, "list.get()");
            List<com.iqoption.core.microservices.internalbilling.a.b> I = u.I((Collection) obj);
            int type = bVar.getType();
            if (type == 1) {
                com.iqoption.core.microservices.internalbilling.a.b bVar2 = (com.iqoption.core.microservices.internalbilling.a.b) bVar.getData();
                int i = 0;
                for (com.iqoption.core.microservices.internalbilling.a.b id : I) {
                    if ((id.getId() == bVar2.getId() ? 1 : null) != null) {
                        break;
                    }
                    i++;
                }
                i = -1;
                if (i == -1) {
                    I.add(bVar.getData());
                }
            } else if (type == 2) {
                com.iqoption.core.microservices.internalbilling.a.b bVar3 = (com.iqoption.core.microservices.internalbilling.a.b) bVar.getData();
                type = 0;
                for (com.iqoption.core.microservices.internalbilling.a.b id2 : I) {
                    if ((id2.getId() == bVar3.getId() ? 1 : null) != null) {
                        break;
                    }
                    type++;
                }
                type = -1;
                if (type == -1) {
                    I.add(bVar3);
                } else {
                    com.iqoption.core.microservices.internalbilling.a.b bVar4 = (com.iqoption.core.microservices.internalbilling.a.b) I.get(type);
                    if (bVar4.aep() != null) {
                        I.set(type, com.iqoption.core.microservices.internalbilling.a.b.a(bVar3, 0, 0, 0, null, bVar4.aep(), null, null, null, null, null, null, false, 4079, null));
                    } else {
                        I.set(type, bVar3);
                    }
                }
            }
            return I;
        }
    }

    BalanceRepository$balancesStream$2() {
        super(0);
    }

    /* renamed from: AX */
    public final com.iqoption.core.rx.a.a<z<List<com.iqoption.core.microservices.internalbilling.a.b>>, List<com.iqoption.core.microservices.internalbilling.a.b>> invoke() {
        AtomicReference atomicReference = new AtomicReference(m.emptyList());
        e bkO = com.iqoption.core.microservices.internalbilling.a.btW.ael().bkO();
        e g = com.iqoption.core.microservices.internalbilling.a.btW.aem().g(new b(atomicReference));
        String str = "InternalBillingRequests.…mutable\n                }";
        kotlin.jvm.internal.i.e(g, str);
        e g2 = com.iqoption.core.microservices.internalbilling.a.btW.aen().g(new a(atomicReference));
        kotlin.jvm.internal.i.e(g2, str);
        g = g.d((org.a.b) g2);
        kotlin.jvm.internal.i.e(g, "updates.mergeWith(authBalanceUpdates)");
        return ac.a(ac.bkp, "Balances", new BalanceRepository$balancesStream$2$streamFactory$1(bkO, g, atomicReference), com.iqoption.core.manager.i.bjd.Ys(), com.iqoption.core.manager.i.bjd.Yh(), 0, null, 48, null);
    }
}
