package com.iqoption.core.data.repository;

import android.util.LruCache;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.microservices.tradingengine.response.order.TradingOrder;
import com.iqoption.core.microservices.tradingengine.response.order.TradingOrder.Status;
import com.iqoption.core.microservices.tradingengine.response.order.TradingOrder.Type;
import com.iqoption.core.microservices.tradingengine.response.position.TradingPosition;
import com.iqoption.core.util.z;
import io.reactivex.b.l;
import io.reactivex.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.TypeCastException;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.o;

@kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010!\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\b0.J\u0012\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00100.J\u0012\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u0017010.J \u00102\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001d0\u001c0.2\u0006\u00103\u001a\u00020\u0014J \u00104\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020 0\u001c0.2\u0006\u00103\u001a\u00020\u0014J%\u00105\u001a\b\u0012\u0004\u0012\u00020\u0017062\u0006\u00107\u001a\u00020%2\n\b\u0002\u00108\u001a\u0004\u0018\u00010%¢\u0006\u0002\u00109J!\u0010:\u001a\u0004\u0018\u00010\u00172\b\u00108\u001a\u0004\u0018\u00010%2\u0006\u00107\u001a\u00020%H\u0002¢\u0006\u0002\u0010;J \u0010<\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u0010062\f\u0010=\u001a\b\u0012\u0004\u0012\u00020%0\u0010J.\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00170\u00102\f\u0010=\u001a\b\u0012\u0004\u0012\u00020%0\u00102\u0010\b\u0002\u0010?\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010@H\u0002J\f\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00170.J%\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00170.2\u0006\u00103\u001a\u00020\u00142\n\b\u0002\u00108\u001a\u0004\u0018\u00010%¢\u0006\u0002\u0010BJ\u0012\u0010C\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0\u00100.J\u0012\u0010D\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(010.J \u0010E\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001d0\u001c0.2\u0006\u00103\u001a\u00020\u0014J\u001c\u0010F\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00100.2\u0006\u0010G\u001a\u00020%H\u0002J\u001c\u0010H\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0\u00100.2\u0006\u0010G\u001a\u00020%H\u0002J\u0018\u0010I\u001a\u00020J2\u0006\u00108\u001a\u00020%2\u0006\u0010K\u001a\u00020\u0017H\u0002J\u0018\u0010L\u001a\u00020J2\u0006\u00108\u001a\u00020%2\u0006\u0010K\u001a\u00020\u0017H\u0002J$\u0010M\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u0010062\u0006\u00103\u001a\u00020\u00142\u0006\u0010G\u001a\u00020%H\u0002J$\u0010N\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0\u0010062\u0006\u00103\u001a\u00020\u00142\u0006\u0010G\u001a\u00020%H\u0002J\u001c\u0010O\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u0010062\u0006\u0010G\u001a\u00020%H\u0002J\u001c\u0010P\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0\u0010062\u0006\u0010G\u001a\u00020%H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000RO\u0010\u0005\u001a6\u0012\u0012\u0012\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\b0\b0\u0007\u0012\f\u0012\n \t*\u0004\u0018\u00010\b0\b0\u0006j\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\b0\b`\n8BX\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0010X\u0004¢\u0006\u0002\n\u0000Rs\u0010\u0015\u001aZ\u0012\u001e\u0012\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0017 \t*\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00160\u00160\u0007\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0017 \t*\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00160\u00160\u0006j\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0017 \t*\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00160\u0016`\n8BX\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u000e\u001a\u0004\b\u0018\u0010\fRZ\u0010\u001a\u001aN\u0012\u0004\u0012\u00020\u0014\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001d0\u001c0\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001d0\u001c0\u001bj\u001a\u0012\u0004\u0012\u00020\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001d0\u001c`\u001eX\u0004¢\u0006\u0002\n\u0000RZ\u0010\u001f\u001aN\u0012\u0004\u0012\u00020\u0014\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020 0\u001c0\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020 0\u001c0\u001bj\u001a\u0012\u0004\u0012\u00020\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020 0\u001c`\u001eX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u0010X\u0004¢\u0006\u0002\n\u0000R&\u0010#\u001a\u001a\u0012\u0004\u0012\u00020%\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00170&0$X\u0004¢\u0006\u0002\n\u0000Rs\u0010'\u001aZ\u0012\u001e\u0012\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020( \t*\n\u0012\u0004\u0012\u00020(\u0018\u00010\u00160\u00160\u0007\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020( \t*\n\u0012\u0004\u0012\u00020(\u0018\u00010\u00160\u00160\u0006j\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020( \t*\n\u0012\u0004\u0012\u00020(\u0018\u00010\u00160\u0016`\n8BX\u0002¢\u0006\f\n\u0004\b*\u0010\u000e\u001a\u0004\b)\u0010\fR\u0014\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00140\u0010X\u0004¢\u0006\u0002\n\u0000RZ\u0010,\u001aN\u0012\u0004\u0012\u00020\u0014\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001d0\u001c0\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001d0\u001c0\u001bj\u001a\u0012\u0004\u0012\u00020\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001d0\u001c`\u001eX\u0004¢\u0006\u0002\n\u0000¨\u0006Q"}, bng = {"Lcom/iqoption/core/data/repository/TradingEngineRepository;", "", "()V", "PAGE_SIZE", "", "activeSettingStreamCache", "Lcom/iqoption/core/rx/livestream/RxLiveStreamSupplier;", "Lcom/iqoption/core/util/Optional;", "Lcom/iqoption/core/microservices/tradingengine/response/active/ActiveSettingResult$ActiveSetting;", "kotlin.jvm.PlatformType", "Lcom/iqoption/core/rx/livestream/OptionalLiveStreamSupplier;", "getActiveSettingStreamCache", "()Lcom/iqoption/core/rx/livestream/RxLiveStreamSupplier;", "activeSettingStreamCache$delegate", "Lkotlin/Lazy;", "cachingOrderTypes", "", "Lcom/iqoption/core/microservices/tradingengine/response/order/TradingOrder$Type;", "deferredOrderTypes", "deferredOrdersInstrumentTypes", "Lcom/iqoption/core/data/model/InstrumentType;", "deferredOrdersSupplier", "Lcom/iqoption/core/data/model/aud/AudListState;", "Lcom/iqoption/core/microservices/tradingengine/response/order/TradingOrder;", "getDeferredOrdersSupplier", "deferredOrdersSupplier$delegate", "instrumentsStreams", "Lcom/iqoption/core/rx/livestream/RxLiveStreamsContainer;", "", "Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "Lcom/iqoption/core/rx/livestream/OptionalLiveStreamsContainer;", "leveragesStreams", "Lcom/iqoption/core/microservices/tradingengine/response/leverage/LeverageInfo;", "orderNewStatuses", "Lcom/iqoption/core/microservices/tradingengine/response/order/TradingOrder$Status;", "ordersCache", "Landroid/util/LruCache;", "", "", "positionStreamSupplier", "Lcom/iqoption/core/microservices/tradingengine/response/position/TradingPosition;", "getPositionStreamSupplier", "positionStreamSupplier$delegate", "supportedInstrumentTypes", "underlyingStreams", "getActiveSetting", "Lio/reactivex/Flowable;", "getDeferredOrders", "getDeferredOrdersUpdates", "Lcom/iqoption/core/data/model/aud/AudEvent;", "getInstruments", "instrumentType", "getLeverages", "getOrder", "Lio/reactivex/Single;", "orderId", "positionId", "(JLjava/lang/Long;)Lio/reactivex/Single;", "getOrderFromCache", "(Ljava/lang/Long;J)Lcom/iqoption/core/microservices/tradingengine/response/order/TradingOrder;", "getOrders", "orderIds", "getOrdersFromCache", "notFound", "", "getOrdersUpdates", "(Lcom/iqoption/core/data/model/InstrumentType;Ljava/lang/Long;)Lio/reactivex/Flowable;", "getPositions", "getPositionsUpdates", "getUnderlying", "mergeDeferredOrdersUpdates", "balanceId", "mergePositionUpdates", "putToOrdersCache", "", "order", "removeFromOrdersCache", "requestDeferredOrders", "requestPositions", "zipDeferredOrdersRequests", "zipPositionRequests", "core_release"})
/* compiled from: TradingEngineRepository.kt */
public final class h {
    static final /* synthetic */ kotlin.reflect.j[] anY = new kotlin.reflect.j[]{k.a(new PropertyReference1Impl(k.G(h.class), "activeSettingStreamCache", "getActiveSettingStreamCache()Lcom/iqoption/core/rx/livestream/RxLiveStreamSupplier;")), k.a(new PropertyReference1Impl(k.G(h.class), "positionStreamSupplier", "getPositionStreamSupplier()Lcom/iqoption/core/rx/livestream/RxLiveStreamSupplier;")), k.a(new PropertyReference1Impl(k.G(h.class), "deferredOrdersSupplier", "getDeferredOrdersSupplier()Lcom/iqoption/core/rx/livestream/RxLiveStreamSupplier;"))};
    private static final kotlin.d bef = g.c(TradingEngineRepository$activeSettingStreamCache$2.beu);
    private static final com.iqoption.core.rx.a.b<InstrumentType, z<Map<Integer, com.iqoption.core.microservices.tradingengine.response.active.a>>, Map<Integer, com.iqoption.core.microservices.tradingengine.response.active.a>> beh = new com.iqoption.core.rx.a.b(TradingEngineRepository$underlyingStreams$1.beW);
    private static final com.iqoption.core.rx.a.b<InstrumentType, z<Map<Integer, com.iqoption.core.microservices.tradingengine.response.active.a>>, Map<Integer, com.iqoption.core.microservices.tradingengine.response.active.a>> bei = new com.iqoption.core.rx.a.b(TradingEngineRepository$instrumentsStreams$1.beD);
    private static final com.iqoption.core.rx.a.b<InstrumentType, z<Map<Integer, com.iqoption.core.microservices.tradingengine.response.b.a>>, Map<Integer, com.iqoption.core.microservices.tradingengine.response.b.a>> bej = new com.iqoption.core.rx.a.b(TradingEngineRepository$leveragesStreams$1.beF);
    private static final List<InstrumentType> bek = m.listOf(InstrumentType.DIGITAL_INSTRUMENT, InstrumentType.FX_INSTRUMENT, InstrumentType.CFD_INSTRUMENT, InstrumentType.FOREX_INSTRUMENT, InstrumentType.CRYPTO_INSTRUMENT, InstrumentType.MULTI_INSTRUMENT);
    private static final kotlin.d bel = g.c(TradingEngineRepository$positionStreamSupplier$2.beK);
    private static final LruCache<Long, Map<Long, TradingOrder>> bem = new LruCache(200);
    private static final List<Type> ben = m.listOf(Type.LIMIT, Type.STOP);
    private static final List<Status> beo = m.listOf(Status.PENDING_NEW, Status.NEW);
    private static final List<InstrumentType> beq = m.listOf(InstrumentType.CFD_INSTRUMENT, InstrumentType.FOREX_INSTRUMENT, InstrumentType.CRYPTO_INSTRUMENT);
    private static final List<Type> ber = m.listOf(Type.LIMIT, Type.STOP, Type.MARKET_ON_OPEN);
    private static final kotlin.d bes = g.c(TradingEngineRepository$deferredOrdersSupplier$2.bew);
    public static final h bet = new h();

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\f\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, bng = {"<anonymous>", "", "Lcom/iqoption/core/microservices/tradingengine/response/position/TradingPosition;", "call"})
    /* compiled from: TradingEngineRepository.kt */
    static final class g<V> implements Callable<U> {
        public static final g beU = new g();

        g() {
        }

        public final List<TradingPosition> call() {
            return new ArrayList();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u00020\u00012(\u0010\u0002\u001a$\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u00040\u00060\u0003H\n¢\u0006\u0002\b\u0007"}, bng = {"<anonymous>", "", "it", "", "Lcom/iqoption/core/microservices/tradingengine/response/order/TradingOrder;", "kotlin.jvm.PlatformType", "", "test"})
    /* compiled from: TradingEngineRepository.kt */
    static final class a<T> implements l<List<TradingOrder>> {
        public static final a beH = new a();

        a() {
        }

        /* renamed from: av */
        public final boolean test(List<TradingOrder> list) {
            kotlin.jvm.internal.i.f(list, "it");
            return list.isEmpty() ^ 1;
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/microservices/tradingengine/response/order/TradingOrder;", "test"})
    /* compiled from: TradingEngineRepository.kt */
    static final class b<T> implements l<TradingOrder> {
        public static final b beI = new b();

        b() {
        }

        /* renamed from: a */
        public final boolean test(TradingOrder tradingOrder) {
            kotlin.jvm.internal.i.f(tradingOrder, "it");
            return tradingOrder.aiK() <= 0 && h.ber.contains(tradingOrder.aiM());
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u00020\u00012(\u0010\u0002\u001a$\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u00040\u00060\u0003H\n¢\u0006\u0002\b\u0007"}, bng = {"<anonymous>", "", "it", "", "Lcom/iqoption/core/microservices/tradingengine/response/position/TradingPosition;", "kotlin.jvm.PlatformType", "", "test"})
    /* compiled from: TradingEngineRepository.kt */
    static final class c<T> implements l<List<TradingPosition>> {
        public static final c beJ = new c();

        c() {
        }

        /* renamed from: av */
        public final boolean test(List<TradingPosition> list) {
            kotlin.jvm.internal.i.f(list, "it");
            return list.isEmpty() ^ 1;
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "Lcom/iqoption/core/microservices/tradingengine/response/order/TradingOrder;", "response", "Lcom/iqoption/core/microservices/tradingengine/response/order/DeferredOrdersResponse;", "apply"})
    /* compiled from: TradingEngineRepository.kt */
    static final class d<T, R> implements io.reactivex.b.g<T, R> {
        public static final d beR = new d();

        d() {
        }

        /* renamed from: a */
        public final List<TradingOrder> apply(com.iqoption.core.microservices.tradingengine.response.order.c cVar) {
            kotlin.jvm.internal.i.f(cVar, "response");
            Collection arrayList = new ArrayList();
            for (Object next : cVar.getOrders()) {
                if ((((TradingOrder) next).aiK() <= 0 ? 1 : null) != null) {
                    arrayList.add(next);
                }
            }
            return (List) arrayList;
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002 \u0004*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0004\b\u0007\u0010\b"}, bng = {"<anonymous>", "Lio/reactivex/Flowable;", "", "Lcom/iqoption/core/microservices/tradingengine/response/position/TradingPosition;", "kotlin.jvm.PlatformType", "page", "", "apply", "(Ljava/lang/Integer;)Lio/reactivex/Flowable;"})
    /* compiled from: TradingEngineRepository.kt */
    static final class e<T, R> implements io.reactivex.b.g<T, org.a.b<? extends R>> {
        final /* synthetic */ InstrumentType $instrumentType;
        final /* synthetic */ long beS;

        e(InstrumentType instrumentType, long j) {
            this.$instrumentType = instrumentType;
            this.beS = j;
        }

        /* renamed from: d */
        public final io.reactivex.e<List<TradingPosition>> apply(Integer num) {
            kotlin.jvm.internal.i.f(num, "page");
            return com.iqoption.core.microservices.tradingengine.e.bzn.a(this.$instrumentType, this.beS, Integer.valueOf(num.intValue() * 300), Integer.valueOf(300)).cJ(m.emptyList()).bkO();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "", "Lcom/iqoption/core/microservices/tradingengine/response/position/TradingPosition;", "test"})
    /* compiled from: TradingEngineRepository.kt */
    static final class f<T> implements l<List<? extends TradingPosition>> {
        public static final f beT = new f();

        f() {
        }

        /* renamed from: av */
        public final boolean test(List<TradingPosition> list) {
            kotlin.jvm.internal.i.f(list, "it");
            return list.size() < 300;
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u001a\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0006*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, bng = {"<anonymous>", "", "result", "", "Lcom/iqoption/core/microservices/tradingengine/response/position/TradingPosition;", "portion", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: TradingEngineRepository.kt */
    static final class h<T1, T2> implements io.reactivex.b.b<U, T> {
        public static final h beV = new h();

        h() {
        }

        /* renamed from: h */
        public final void accept(List<TradingPosition> list, List<TradingPosition> list2) {
            kotlin.jvm.internal.i.f(list, "result");
            List dl = o.dl(list);
            kotlin.jvm.internal.i.e(list2, "portion");
            dl.addAll(list2);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012*\u0010\u0003\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0012\u0012\u000e\b\u0001\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u00040\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, bng = {"<anonymous>", "", "Lcom/iqoption/core/microservices/tradingengine/response/order/TradingOrder;", "results", "", "", "kotlin.jvm.PlatformType", "apply", "([Ljava/lang/Object;)Ljava/util/List;"})
    /* compiled from: TradingEngineRepository.kt */
    static final class i<T, R> implements io.reactivex.b.g<Object[], R> {
        public static final i beY = new i();

        i() {
        }

        /* renamed from: o */
        public final List<TradingOrder> apply(Object[] objArr) {
            kotlin.jvm.internal.i.f(objArr, "results");
            Collection arrayList = new ArrayList();
            int length = objArr.length;
            int i = 0;
            while (i < length) {
                Object obj = objArr[i];
                if (obj != null) {
                    r.a(arrayList, (Iterable) (List) obj);
                    i++;
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.List<com.iqoption.core.microservices.tradingengine.response.order.TradingOrder>");
                }
            }
            return (List) arrayList;
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012*\u0010\u0003\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0012\u0012\u000e\b\u0001\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u00040\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, bng = {"<anonymous>", "", "Lcom/iqoption/core/microservices/tradingengine/response/position/TradingPosition;", "it", "", "", "kotlin.jvm.PlatformType", "apply", "([Ljava/lang/Object;)Ljava/util/List;"})
    /* compiled from: TradingEngineRepository.kt */
    static final class j<T, R> implements io.reactivex.b.g<Object[], R> {
        public static final j beZ = new j();

        j() {
        }

        /* renamed from: o */
        public final List<TradingPosition> apply(Object[] objArr) {
            kotlin.jvm.internal.i.f(objArr, "it");
            Collection arrayList = new ArrayList();
            int length = objArr.length;
            int i = 0;
            while (i < length) {
                Object obj = objArr[i];
                if (obj != null) {
                    r.a(arrayList, (Iterable) (List) obj);
                    i++;
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.List<com.iqoption.core.microservices.tradingengine.response.position.TradingPosition>");
                }
            }
            return (List) arrayList;
        }
    }

    private final com.iqoption.core.rx.a.a<z<com.iqoption.core.microservices.tradingengine.response.active.g.a>, com.iqoption.core.microservices.tradingengine.response.active.g.a> Xb() {
        kotlin.d dVar = bef;
        kotlin.reflect.j jVar = anY[0];
        return (com.iqoption.core.rx.a.a) dVar.getValue();
    }

    private h() {
    }

    private final p<List<TradingPosition>> a(InstrumentType instrumentType, long j) {
        p a = io.reactivex.e.ba(0, 2147483646).b((io.reactivex.b.g) new e(instrumentType, j)).d((l) f.beT).a((Callable) g.beU, (io.reactivex.b.b) h.beV);
        kotlin.jvm.internal.i.e(a, "Flowable\n               …ortion)\n                }");
        return a;
    }

    private final p<List<TradingPosition>> aK(long j) {
        Iterable<InstrumentType> iterable = bek;
        Collection arrayList = new ArrayList(n.e(iterable, 10));
        for (InstrumentType a : iterable) {
            arrayList.add(bet.a(a, j));
        }
        p b = p.b((List) arrayList, j.beZ);
        kotlin.jvm.internal.i.e(b, "Single.zip(supportedInst…dingPosition> }\n        }");
        return b;
    }

    private final io.reactivex.e<List<TradingPosition>> aL(long j) {
        Iterable<InstrumentType> iterable = bek;
        Collection arrayList = new ArrayList(n.e(iterable, 10));
        for (InstrumentType i : iterable) {
            arrayList.add(com.iqoption.core.microservices.tradingengine.e.bzn.i(i, j));
        }
        io.reactivex.e b = io.reactivex.e.H((List) arrayList).h(250, TimeUnit.MILLISECONDS).b((l) c.beJ);
        kotlin.jvm.internal.i.e(b, "Flowable\n               …ilter { it.isNotEmpty() }");
        return b;
    }

    private final void a(long j, TradingOrder tradingOrder) {
        Map map = (Map) bem.get(Long.valueOf(j));
        if (map == null) {
            map = new LinkedHashMap();
            bem.put(Long.valueOf(j), map);
        }
        map.put(Long.valueOf(tradingOrder.getId()), tradingOrder);
    }

    private final p<List<TradingOrder>> b(InstrumentType instrumentType, long j) {
        p cJ = com.iqoption.core.microservices.tradingengine.e.a(com.iqoption.core.microservices.tradingengine.e.bzn, instrumentType, null, j, 2, null).t(d.beR).cJ(m.emptyList());
        kotlin.jvm.internal.i.e(cJ, "TradingEngineRequests.ge…ErrorReturnItem(listOf())");
        return cJ;
    }

    private final p<List<TradingOrder>> aM(long j) {
        Iterable<InstrumentType> iterable = beq;
        Collection arrayList = new ArrayList(n.e(iterable, 10));
        for (InstrumentType b : iterable) {
            arrayList.add(bet.b(b, j));
        }
        p b2 = p.b((List) arrayList, i.beY);
        kotlin.jvm.internal.i.e(b2, "Single\n                .…rder> }\n                }");
        return b2;
    }

    private final io.reactivex.e<List<TradingOrder>> aN(long j) {
        Iterable<InstrumentType> iterable = beq;
        Collection arrayList = new ArrayList(n.e(iterable, 10));
        for (InstrumentType a : iterable) {
            arrayList.add(com.iqoption.core.microservices.tradingengine.e.a(com.iqoption.core.microservices.tradingengine.e.bzn, a, j, 0, 4, null).b((l) b.beI));
        }
        io.reactivex.e b = io.reactivex.e.H((List) arrayList).h(250, TimeUnit.MILLISECONDS).b((l) a.beH);
        kotlin.jvm.internal.i.e(b, "Flowable\n               …ilter { it.isNotEmpty() }");
        return b;
    }

    public final io.reactivex.e<com.iqoption.core.microservices.tradingengine.response.active.g.a> Xc() {
        return Xb().ako();
    }

    public final io.reactivex.e<Map<Integer, com.iqoption.core.microservices.tradingengine.response.active.a>> G(InstrumentType instrumentType) {
        kotlin.jvm.internal.i.f(instrumentType, "instrumentType");
        return beh.bR(instrumentType);
    }

    public final io.reactivex.e<Map<Integer, com.iqoption.core.microservices.tradingengine.response.active.a>> H(InstrumentType instrumentType) {
        kotlin.jvm.internal.i.f(instrumentType, "instrumentType");
        return bei.bR(instrumentType);
    }

    public final io.reactivex.e<Map<Integer, com.iqoption.core.microservices.tradingengine.response.b.a>> q(InstrumentType instrumentType) {
        kotlin.jvm.internal.i.f(instrumentType, "instrumentType");
        return bej.bR(instrumentType);
    }
}
