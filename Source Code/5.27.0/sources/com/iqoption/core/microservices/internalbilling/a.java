package com.iqoption.core.microservices.internalbilling;

import com.google.gson.reflect.TypeToken;
import com.iqoption.core.microservices.internalbilling.a.b;
import io.reactivex.e;
import io.reactivex.p;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.d;
import kotlin.i;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00190\u0018J\u0006\u0010\u001a\u001a\u00020\u001bR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \n*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000R!\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f8FX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fRW\u0010\u0012\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0014 \n*\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00130\u0013 \n*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0014 \n*\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00130\u0013\u0018\u00010\f0\f8FX\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0015\u0010\u000f¨\u0006\u001c"}, bng = {"Lcom/iqoption/core/microservices/internalbilling/InternalBillingRequests;", "", "()V", "CMD_GET_BALANCES", "", "CMD_RESET_TRAINING_BALANCE", "EVENT_AUTH_BALANCE_CHANGED", "EVENT_BALANCE_CHANGED", "EVENT_BALANCE_CREATED", "TAG", "kotlin.jvm.PlatformType", "authBalanceUpdatesStream", "Lio/reactivex/Flowable;", "Lcom/iqoption/core/microservices/internalbilling/response/AuthBalanceChanged;", "getAuthBalanceUpdatesStream", "()Lio/reactivex/Flowable;", "authBalanceUpdatesStream$delegate", "Lkotlin/Lazy;", "balanceUpdatesStream", "Lcom/iqoption/core/microservices/Event;", "Lcom/iqoption/core/microservices/internalbilling/response/Balance;", "getBalanceUpdatesStream", "balanceUpdatesStream$delegate", "getBalances", "Lio/reactivex/Single;", "", "resetPracticeBalance", "Lio/reactivex/Completable;", "core_release"})
/* compiled from: InternalBillingRequests.kt */
public final class a {
    private static final String TAG = a.class.getSimpleName();
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(a.class), "balanceUpdatesStream", "getBalanceUpdatesStream()Lio/reactivex/Flowable;")), k.a(new PropertyReference1Impl(k.G(a.class), "authBalanceUpdatesStream", "getAuthBalanceUpdatesStream()Lio/reactivex/Flowable;"))};
    private static final d btU = g.c(InternalBillingRequests$balanceUpdatesStream$2.btY);
    private static final d btV = g.c(InternalBillingRequests$authBalanceUpdatesStream$2.btX);
    public static final a btW = new a();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0003"}, bng = {"com/iqoption/core/ext/GsonExt$typeOf$1", "Lcom/google/gson/reflect/TypeToken;", "core_release", "com/iqoption/core/microservices/internalbilling/InternalBillingRequests$create$$inlined$typeOf$1"})
    /* compiled from: GsonExtensions.kt */
    public static final class a extends TypeToken<List<? extends b>> {
    }

    public final e<com.iqoption.core.microservices.b<b>> aem() {
        d dVar = btU;
        j jVar = anY[0];
        return (e) dVar.getValue();
    }

    public final e<com.iqoption.core.microservices.internalbilling.a.a> aen() {
        d dVar = btV;
        j jVar = anY[1];
        return (e) dVar.getValue();
    }

    private a() {
    }

    public final p<List<b>> ael() {
        com.iqoption.core.connect.k EV = com.iqoption.core.d.EV();
        Type type = new a().getType();
        kotlin.jvm.internal.i.e(type, "object : TypeToken<T>() {}.type");
        return EV.a("get-balances", type).UB();
    }
}
