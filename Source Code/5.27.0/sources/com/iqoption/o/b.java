package com.iqoption.o;

import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.o.d.a.d;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J%\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0012J\u0006\u0010\u0013\u001a\u00020\u000bJ\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\f\u001a\u00020\rH\u0002R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, bng = {"Lcom/iqoption/traderoom/FxNextExpirationToastHelper;", "", "actionData", "Lcom/iqoption/core/data/livedata/IQLiveEvent;", "Lcom/iqoption/traderoom/TradeRoomViewModel$Action;", "(Lcom/iqoption/core/data/livedata/IQLiveEvent;)V", "getActionData", "()Lcom/iqoption/core/data/livedata/IQLiveEvent;", "disposables", "Lio/reactivex/disposables/Disposable;", "checkNextFxExpiration", "", "activeId", "", "instrumentType", "Lcom/iqoption/core/data/model/InstrumentType;", "expiration", "", "(ILcom/iqoption/core/data/model/InstrumentType;Ljava/lang/Long;)V", "clear", "getNextExpiration", "Lcom/iqoption/core/microservices/topassets/response/spread/SpreadData;", "app_optionXRelease"})
/* compiled from: FxNextExpirationToastHelper.kt */
public final class b {
    private final com.iqoption.core.data.b.b<com.iqoption.o.d.a> dfl;
    private io.reactivex.disposables.b dpA;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "run"})
    /* compiled from: FxNextExpirationToastHelper.kt */
    static final class a implements Runnable {
        final /* synthetic */ int $activeId;
        final /* synthetic */ b dUE;
        final /* synthetic */ Long dUF;

        a(b bVar, int i, Long l) {
            this.dUE = bVar;
            this.$activeId = i;
            this.dUF = l;
        }

        public final void run() {
            com.iqoption.core.microservices.f.a.a.a a = this.dUE.hd(this.$activeId);
            if (a != null) {
                Long a2 = com.iqoption.core.microservices.f.a.a.a.bzg.a(a);
                long longValue = a2 != null ? a2.longValue() : 0;
                a2 = this.dUF;
                if (a2 == null || (longValue < a2.longValue() && longValue > 0)) {
                    this.dUE.aUN().postValue(new d(a.getActiveId(), longValue));
                }
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, bng = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"})
    /* compiled from: Comparisons.kt */
    public static final class b<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return b.c(com.iqoption.core.microservices.f.a.a.a.bzg.a((com.iqoption.core.microservices.f.a.a.a) t), com.iqoption.core.microservices.f.a.a.a.bzg.a((com.iqoption.core.microservices.f.a.a.a) t2));
        }
    }

    public b(com.iqoption.core.data.b.b<com.iqoption.o.d.a> bVar) {
        kotlin.jvm.internal.i.f(bVar, "actionData");
        this.dfl = bVar;
    }

    public final com.iqoption.core.data.b.b<com.iqoption.o.d.a> aUN() {
        return this.dfl;
    }

    private final com.iqoption.core.microservices.f.a.a.a hd(int i) {
        com.iqoption.app.helpers.a Gs = com.iqoption.app.helpers.a.Gs();
        ArrayList arrayList = new ArrayList(Gs.e(InstrumentType.FX_INSTRUMENT).values());
        List list = arrayList;
        if (list.size() > 1) {
            q.a(list, new b());
        }
        for (Object next : arrayList) {
            Object obj;
            com.iqoption.core.microservices.f.a.a.a aVar = (com.iqoption.core.microservices.f.a.a.a) next;
            Long a = com.iqoption.core.microservices.f.a.a.a.bzg.a(aVar);
            com.iqoption.core.microservices.tradingengine.response.active.a a2 = Gs.a(Integer.valueOf(aVar.getActiveId()), InstrumentType.FX_INSTRUMENT);
            if (a == null || a2 == null || i == a2.getActiveId() || a2.isSuspended() || !com.iqoption.core.microservices.tradingengine.response.active.d.z(a2)) {
                obj = null;
                continue;
            } else {
                obj = 1;
                continue;
            }
            if (obj != null) {
                break;
            }
        }
        Object next2 = null;
        return (com.iqoption.core.microservices.f.a.a.a) next2;
    }

    public final void a(int i, InstrumentType instrumentType, Long l) {
        kotlin.jvm.internal.i.f(instrumentType, "instrumentType");
        io.reactivex.disposables.b bVar = this.dpA;
        if (bVar != null) {
            bVar.dispose();
        }
        if (InstrumentType.FX_INSTRUMENT == instrumentType) {
            this.dpA = com.iqoption.core.rx.i.aki().b(new a(this, i, l), 5, TimeUnit.SECONDS);
        }
    }

    public final void clear() {
        io.reactivex.disposables.b bVar = this.dpA;
        if (bVar != null) {
            bVar.dispose();
        }
    }
}
