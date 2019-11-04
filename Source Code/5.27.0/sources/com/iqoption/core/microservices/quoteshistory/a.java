package com.iqoption.core.microservices.quoteshistory;

import com.google.gson.reflect.TypeToken;
import com.iqoption.core.connect.j;
import com.iqoption.core.connect.k;
import com.iqoption.core.d;
import com.iqoption.core.microservices.quoteshistory.response.c;
import com.iqoption.dto.event.OtnEmissionExecuted;
import io.reactivex.p;
import java.lang.reflect.Type;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JX\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0007Jg\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00150\b\"\u0006\b\u0000\u0010\u0015\u0018\u00012\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0014H\bJX\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0007J\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\b2\u0006\u0010\n\u001a\u00020\u000bJ9\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\u001dR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u001e"}, bng = {"Lcom/iqoption/core/microservices/quoteshistory/QuotesHistoryRequests;", "", "()V", "CMD_GET_CANDLES", "", "CMD_GET_FIRST_CANDLES", "CMD_GET_QUOTES", "getCandles", "Lio/reactivex/Single;", "Lcom/iqoption/core/microservices/quoteshistory/response/HistoryCandles;", "activeId", "", "size", "from", "", "to", "fromId", "toId", "count", "onlyClosed", "", "T", "compact", "getCandlesCompact", "Lcom/iqoption/core/microservices/quoteshistory/response/CandlesCompact;", "getFirstCandles", "Lcom/iqoption/core/microservices/quoteshistory/response/FirstCandles;", "getQuotes", "Lcom/iqoption/core/microservices/quoteshistory/response/HistoryQuotes;", "(IJLjava/lang/Long;Ljava/lang/Integer;)Lio/reactivex/Single;", "core_release"})
/* compiled from: QuotesHistoryRequests.kt */
public final class a {
    public static final a bxw = new a();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0004"}, bng = {"com/iqoption/core/ext/GsonExt$typeOf$1", "Lcom/google/gson/reflect/TypeToken;", "core_release", "com/iqoption/core/microservices/quoteshistory/QuotesHistoryRequests$create$$inlined$typeOf$3", "com/iqoption/core/microservices/quoteshistory/QuotesHistoryRequests$getCandles$$inlined$create$3"})
    /* compiled from: GsonExtensions.kt */
    public static final class a extends TypeToken<c> {
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0004"}, bng = {"com/iqoption/core/ext/GsonExt$typeOf$1", "Lcom/google/gson/reflect/TypeToken;", "core_release", "com/iqoption/core/microservices/quoteshistory/QuotesHistoryRequests$create$$inlined$typeOf$4", "com/iqoption/core/microservices/quoteshistory/QuotesHistoryRequests$getCandles$$inlined$create$4"})
    /* compiled from: GsonExtensions.kt */
    public static final class b extends TypeToken<com.iqoption.core.microservices.quoteshistory.response.a> {
    }

    private a() {
    }

    public static final p<c> a(int i, int i2, long j, long j2, int i3, int i4, int i5, boolean z) {
        a aVar = bxw;
        k EV = d.EV();
        Type type = new a().getType();
        kotlin.jvm.internal.i.e(type, "object : TypeToken<T>() {}.type");
        String str = "size";
        j k = EV.a("get-candles", type).fp("2.0").eG(0).k("active_id", Integer.valueOf(i)).k(str, Integer.valueOf(i2));
        if (j != 0) {
            k.k("from", Long.valueOf(j));
        }
        if (j2 != 0) {
            k.k("to", Long.valueOf(j2));
        }
        if (i3 != 0) {
            k.k("from_id", Integer.valueOf(i3));
        }
        if (i4 != 0) {
            k.k("to_id", Integer.valueOf(i4));
        }
        if (i5 != 0) {
            k.k(OtnEmissionExecuted.COUNT, Integer.valueOf(i5));
        }
        if (z) {
            k.k("only_closed", Boolean.valueOf(true));
        }
        return k.UB();
    }

    public static /* synthetic */ p a(int i, int i2, long j, long j2, int i3, int i4, int i5, boolean z, int i6, Object obj) {
        int i7 = i6;
        return b(i, i2, (i7 & 4) != 0 ? 0 : j, (i7 & 8) != 0 ? 0 : j2, (i7 & 16) != 0 ? 0 : i3, (i7 & 32) != 0 ? 0 : i4, i5, (i7 & 128) != 0 ? false : z);
    }

    public static final p<com.iqoption.core.microservices.quoteshistory.response.a> b(int i, int i2, long j, long j2, int i3, int i4, int i5, boolean z) {
        a aVar = bxw;
        k EV = d.EV();
        Type type = new b().getType();
        kotlin.jvm.internal.i.e(type, "object : TypeToken<T>() {}.type");
        String str = "size";
        j k = EV.a("get-candles", type).fp("2.0").eG(0).k("active_id", Integer.valueOf(i)).k(str, Integer.valueOf(i2));
        if (j != 0) {
            k.k("from", Long.valueOf(j));
        }
        if (j2 != 0) {
            k.k("to", Long.valueOf(j2));
        }
        if (i3 != 0) {
            k.k("from_id", Integer.valueOf(i3));
        }
        if (i4 != 0) {
            k.k("to_id", Integer.valueOf(i4));
        }
        if (i5 != 0) {
            k.k(OtnEmissionExecuted.COUNT, Integer.valueOf(i5));
        }
        k.k("format", "compact_json");
        if (z) {
            k.k("only_closed", Boolean.valueOf(true));
        }
        return k.UB();
    }
}
