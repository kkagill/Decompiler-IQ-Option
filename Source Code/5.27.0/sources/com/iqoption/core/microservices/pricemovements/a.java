package com.iqoption.core.microservices.pricemovements;

import com.google.gson.reflect.TypeToken;
import io.reactivex.e;
import io.reactivex.p;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.d;
import kotlin.i;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JS\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00110\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0015¢\u0006\u0002\u0010\u0019R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0007*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000R!\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8FX\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f¨\u0006\u001a"}, bng = {"Lcom/iqoption/core/microservices/pricemovements/PriceMovementsRequests;", "", "()V", "CMD_GET_SIGNALS", "", "EVENT_SIGNAL_CREATED", "TAG", "kotlin.jvm.PlatformType", "signalsStream", "Lio/reactivex/Flowable;", "Lcom/iqoption/core/microservices/pricemovements/response/Signal;", "getSignalsStream", "()Lio/reactivex/Flowable;", "signalsStream$delegate", "Lkotlin/Lazy;", "getSignals", "Lio/reactivex/Single;", "", "created", "", "page", "", "perPage", "type", "activeId", "(Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lio/reactivex/Single;", "core_release"})
/* compiled from: PriceMovementsRequests.kt */
public final class a {
    private static final String TAG = a.class.getSimpleName();
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(a.class), "signalsStream", "getSignalsStream()Lio/reactivex/Flowable;"))};
    private static final d bxg = g.c(PriceMovementsRequests$signalsStream$2.bxi);
    public static final a bxh = new a();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0003"}, bng = {"com/iqoption/core/ext/GsonExt$typeOf$1", "Lcom/google/gson/reflect/TypeToken;", "core_release", "com/iqoption/core/microservices/pricemovements/PriceMovementsRequests$create$$inlined$typeOf$1"})
    /* compiled from: GsonExtensions.kt */
    public static final class a extends TypeToken<List<? extends com.iqoption.core.microservices.pricemovements.a.a>> {
    }

    public final e<com.iqoption.core.microservices.pricemovements.a.a> agt() {
        d dVar = bxg;
        j jVar = anY[0];
        return (e) dVar.getValue();
    }

    private a() {
    }

    public static /* synthetic */ p a(a aVar, Long l, Integer num, Integer num2, Integer num3, Integer num4, int i, Object obj) {
        if ((i & 1) != 0) {
            l = (Long) null;
        }
        if ((i & 2) != 0) {
            num = (Integer) null;
        }
        Integer num5 = num;
        if ((i & 4) != 0) {
            num2 = (Integer) null;
        }
        Integer num6 = num2;
        if ((i & 8) != 0) {
            num3 = (Integer) null;
        }
        Integer num7 = num3;
        if ((i & 16) != 0) {
            num4 = (Integer) null;
        }
        return aVar.a(l, num5, num6, num7, num4);
    }

    public final p<List<com.iqoption.core.microservices.pricemovements.a.a>> a(Long l, Integer num, Integer num2, Integer num3, Integer num4) {
        com.iqoption.core.connect.k EV = com.iqoption.core.d.EV();
        Type type = new a().getType();
        kotlin.jvm.internal.i.e(type, "object : TypeToken<T>() {}.type");
        return EV.a("get-signals", type).fp("2.0").k("created", l).k("page", num).k("per_page", num2).k("type", num3).k("active_id", num4).UB();
    }
}
