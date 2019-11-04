package com.iqoption.core.microservices.portfolio;

import com.iqoption.core.connect.j;
import com.iqoption.core.d;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.dto.entity.position.Order;
import io.reactivex.p;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J,\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0017JY\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00152\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d2\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u001d2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0015¢\u0006\u0002\u0010\"J\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u00192\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d2\b\b\u0002\u0010%\u001a\u00020\u00152\b\b\u0002\u0010&\u001a\u00020\u00152\b\b\u0002\u0010'\u001a\u00020\r2\b\b\u0002\u0010(\u001a\u00020\r2\u0010\b\u0002\u0010)\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u001d2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010,\u001a\u00020\u0017H\u0007¢\u0006\u0002\u0010-J(\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\u00102\u0006\u00100\u001a\u00020\u001e2\b\b\u0002\u0010\u001b\u001a\u00020\u00152\b\b\u0002\u00101\u001a\u00020\u0015J8\u00102\u001a\b\u0012\u0004\u0012\u0002030\u00192\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\b\b\u0002\u0010&\u001a\u00020\u00152\b\b\u0002\u0010'\u001a\u00020\r2\b\b\u0002\u0010(\u001a\u00020\rJ,\u00104\u001a\b\u0012\u0004\u0012\u0002050\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0017J\u001e\u00106\u001a\b\u0012\u0004\u0012\u00020\u00130\u00192\u0006\u00107\u001a\u0002082\b\b\u0002\u0010\u001b\u001a\u00020\u0015J\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020\u00130\u00192\f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00040;R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006<"}, bng = {"Lcom/iqoption/core/microservices/portfolio/PortfolioRequests;", "", "()V", "CMD_GET_HISTORY", "", "CMD_GET_HISTORY_POSITIONS", "CMD_GET_POSITIONS", "CMD_SUBSCRIBE_ASSETS", "CMD_SUBSCRIBE_POSITIONS", "EVENT_ASSETS_STATE", "EVENT_POSITIONS_STATE", "EVENT_POSITION_CHANGED", "HISTORY_POSITIONS_DEFAULT_LIMIT", "", "MS_PORTFOLIO", "getAssetsStateEvents", "Lio/reactivex/Flowable;", "Lcom/iqoption/core/microservices/portfolio/response/AssetsState;", "subscription", "Lcom/iqoption/core/microservices/portfolio/response/Subscription;", "throttling", "", "throttlingUnit", "Ljava/util/concurrent/TimeUnit;", "getHistory", "Lio/reactivex/Single;", "Lcom/iqoption/core/microservices/portfolio/response/PositionsHistory;", "balanceId", "instrumentTypes", "", "Lcom/iqoption/core/data/model/InstrumentType;", "activeIds", "startTimestamp", "endTimestamp", "(Ljava/lang/Long;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;Ljava/lang/Long;)Lio/reactivex/Single;", "getHistoryPositions", "Lcom/iqoption/core/microservices/portfolio/response/HistoryPositions;", "externalId", "userBalanceId", "limit", "offset", "assetIds", "start", "end", "unit", "(Ljava/util/List;JJIILjava/util/List;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/concurrent/TimeUnit;)Lio/reactivex/Single;", "getPositionUpdates", "Lcom/iqoption/core/microservices/portfolio/response/PortfolioPosition;", "instrumentType", "userId", "getPositions", "Lcom/iqoption/core/microservices/portfolio/response/PositionsResponse;", "getPositionsStateEvents", "Lcom/iqoption/core/microservices/portfolio/response/PositionsState;", "subscribeAssets", "groupBy", "Lcom/iqoption/core/microservices/portfolio/response/AssetGroupTick$Type;", "subscribePositions", "ids", "", "core_release"})
/* compiled from: PortfolioRequests.kt */
public final class a {
    public static final a bwP = new a();

    public static final p<com.iqoption.core.microservices.portfolio.response.a> b(List<? extends InstrumentType> list, long j) {
        return a(list, j, 0, 0, 0, null, null, null, null, 508, null);
    }

    private a() {
    }

    public static /* synthetic */ p a(List list, long j, long j2, int i, int i2, List list2, Long l, Long l2, TimeUnit timeUnit, int i3, Object obj) {
        int i4 = i3;
        return a(list, (i4 & 2) != 0 ? 0 : j, (i4 & 4) != 0 ? d.EA().DH() : j2, (i4 & 8) != 0 ? 100 : i, (i4 & 16) != 0 ? 0 : i2, (i4 & 32) != 0 ? (List) null : list2, (i4 & 64) != 0 ? (Long) null : l, (i4 & 128) != 0 ? (Long) null : l2, (i4 & 256) != 0 ? TimeUnit.MILLISECONDS : timeUnit);
    }

    public static final p<com.iqoption.core.microservices.portfolio.response.a> a(List<? extends InstrumentType> list, long j, long j2, int i, int i2, List<Integer> list2, Long l, Long l2, TimeUnit timeUnit) {
        kotlin.jvm.internal.i.f(timeUnit, "unit");
        String str = "user_balance_id";
        str = "offset";
        j k = d.EV().a("get-history-positions", com.iqoption.core.microservices.portfolio.response.a.class).k("instrument_types", list).k(str, Long.valueOf(j2)).k(Order.LIMIT, Integer.valueOf(i)).k(str, Integer.valueOf(i2));
        if (j != 0) {
            k.k("external_id", Long.valueOf(j));
        }
        if (list2 != null && (list2.isEmpty() ^ 1) == 1) {
            k.k("asset_ids", list2);
        }
        if (l != null) {
            k.k("start", Long.valueOf(timeUnit.toSeconds(l.longValue())));
        }
        if (l2 != null) {
            k.k("end", Long.valueOf(timeUnit.toSeconds(l2.longValue())));
        }
        return k.UB();
    }
}
