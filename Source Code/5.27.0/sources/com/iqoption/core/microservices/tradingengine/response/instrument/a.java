package com.iqoption.core.microservices.tradingengine.response.instrument;

import androidx.core.util.Pools.SynchronizedPool;
import com.google.gson.annotations.SerializedName;
import com.iqoption.core.util.ab;
import java.util.Comparator;
import kotlin.TypeCastException;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 !2\u00020\u0001:\u0001!B1\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ0\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J,\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0002J\u0006\u0010\u001e\u001a\u00020\u0000J\b\u0010\u001f\u001a\u00020\u001dH\u0016J\b\u0010 \u001a\u00020\u0007H\u0016R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R \u0010\u0005\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00038\u0006@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u000f\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R \u0010\u0004\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00038\u0006@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\fR \u0010\u0002\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00038\u0006@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\fR$\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011¨\u0006\""}, bng = {"Lcom/iqoption/core/microservices/tradingengine/response/instrument/Expiration;", "Lcom/iqoption/core/util/Recyclable;", "time", "", "period", "deadDuration", "title", "", "(JJJLjava/lang/String;)V", "_localizedTitle", "<set-?>", "getDeadDuration", "()J", "deadTime", "getDeadTime", "localizedTitle", "getLocalizedTitle", "()Ljava/lang/String;", "getPeriod", "getTime", "getTitle", "copy", "equals", "", "other", "", "hashCode", "", "init", "", "next", "recycle", "toString", "Companion", "core_release"})
/* compiled from: Expiration.kt */
public final class a implements ab {
    public static final Comparator<a> bAI = new b(new a());
    public static final a bAJ = new a(0, 0, 0, null, 8, null);
    public static final a bAK = new a(0, 60000, 0, null, 8, null);
    public static final a bAL = new a(-1, 0, 0, null, 8, null);
    private static final SynchronizedPool<a> bAM = new SynchronizedPool(20);
    public static final c bAN = new c();
    @SerializedName("deadDuration")
    private long bAG;
    private String bAH;
    @SerializedName("period")
    private long period;
    @SerializedName("time")
    private long time;
    @SerializedName("title")
    private String title;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, bng = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"})
    /* compiled from: Comparisons.kt */
    public static final class a<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return b.c(Long.valueOf(((a) t).aix()), Long.valueOf(((a) t2).aix()));
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, bng = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$thenBy$1"})
    /* compiled from: Comparisons.kt */
    public static final class b<T> implements Comparator<T> {
        final /* synthetic */ Comparator brw;

        public b(Comparator comparator) {
            this.brw = comparator;
        }

        public final int compare(T t, T t2) {
            int compare = this.brw.compare(t, t2);
            return compare != 0 ? compare : b.c(Long.valueOf(((a) t).getTime()), Long.valueOf(((a) t2).getTime()));
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J.\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\n2\b\b\u0002\u0010\u0014\u001a\u00020\n2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0007R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000R \u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0007j\b\u0012\u0004\u0012\u00020\u0004`\b8\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nXT¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\f8\u0002X\u0004¢\u0006\b\n\u0000\u0012\u0004\b\r\u0010\u0002R\u000e\u0010\u000e\u001a\u00020\nXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\nXT¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, bng = {"Lcom/iqoption/core/microservices/tradingengine/response/instrument/Expiration$Companion;", "", "()V", "EMPTY", "Lcom/iqoption/core/microservices/tradingengine/response/instrument/Expiration;", "EMPTY_DIGITAL", "ORDERING", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "PERIOD_DIGITAL_1M", "", "POOL", "Landroidx/core/util/Pools$SynchronizedPool;", "POOL$annotations", "TIME_EMPTY", "TIME_UNDEFINED", "UNDEFINED", "obtain", "time", "period", "deadDuration", "title", "", "core_release"})
    /* compiled from: Expiration.kt */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(f fVar) {
            this();
        }
    }

    public a() {
        this(0, 0, 0, null, 15, null);
    }

    public a(long j, long j2, long j3, String str) {
        this.time = j;
        this.period = j2;
        this.bAG = j3;
        this.title = str;
    }

    public /* synthetic */ a(long j, long j2, long j3, String str, int i, f fVar) {
        long j4 = 0;
        long j5 = (i & 1) != 0 ? 0 : j;
        long j6 = (i & 2) != 0 ? 0 : j2;
        if ((i & 4) == 0) {
            j4 = j3;
        }
        if ((i & 8) != 0) {
            str = (String) null;
        }
        this(j5, j6, j4, str);
    }

    public final long getTime() {
        return this.time;
    }

    public final long aix() {
        return this.period;
    }

    public void recycle() {
        this.bAH = (String) null;
        bAM.release(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((kotlin.jvm.internal.i.y(getClass(), obj != null ? obj.getClass() : null) ^ 1) != 0) {
            return false;
        }
        if (obj != null) {
            a aVar = (a) obj;
            if (this.time == aVar.time && this.period == aVar.period) {
                return true;
            }
            return false;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.iqoption.core.microservices.tradingengine.response.instrument.Expiration");
    }

    public int hashCode() {
        return (Long.valueOf(this.time).hashCode() * 31) + Long.valueOf(this.period).hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Expiration(time=");
        stringBuilder.append(this.time);
        stringBuilder.append(", period=");
        stringBuilder.append(this.period);
        stringBuilder.append(", deadDuration=");
        stringBuilder.append(this.bAG);
        stringBuilder.append(", title=");
        stringBuilder.append(this.title);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}
