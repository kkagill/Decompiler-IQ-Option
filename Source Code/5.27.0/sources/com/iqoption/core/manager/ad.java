package com.iqoption.core.manager;

import android.os.SystemClock;
import com.iqoption.core.l;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010 \u001a\u00020!J\u001d\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\f2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%H\bJ\u001d\u0010&\u001a\u00020!2\u0006\u0010#\u001a\u00020\f2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%H\bJ\u0016\u0010'\u001a\b\u0012\u0004\u0012\u00020\n0\u000f2\b\b\u0002\u0010(\u001a\u00020)J\u000e\u0010*\u001a\b\u0012\u0004\u0012\u00020\n0\u000fH\u0016J\u0016\u0010+\u001a\b\u0012\u0004\u0012\u00020\n0\u000f2\b\b\u0002\u0010(\u001a\u00020)R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n \r*\u0004\u0018\u00010\f0\fX\u0004¢\u0006\u0002\n\u0000R2\u0010\u000e\u001a&\u0012\f\u0012\n \r*\u0004\u0018\u00010\n0\n \r*\u0012\u0012\f\u0012\n \r*\u0004\u0018\u00010\n0\n\u0018\u00010\u000f0\u000fX\u0004¢\u0006\u0002\n\u0000R \u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\n8F@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R&\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\n8V@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\n8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0013R\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\n0\u001eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000¨\u0006,"}, bng = {"Lcom/iqoption/core/manager/TimeManager;", "Lcom/iqoption/core/TimeServer;", "()V", "LOGGING_ENABLED", "", "getLOGGING_ENABLED", "()Z", "setLOGGING_ENABLED", "(Z)V", "MAX_TIME_LAG", "", "TAG", "", "kotlin.jvm.PlatformType", "intervalStream", "Lio/reactivex/Flowable;", "<set-?>", "localSync", "getLocalSync", "()J", "lock", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "value", "serverSync", "getServerSync", "setServerSync", "(J)V", "systemSync", "getSystemSync", "timeSyncProcessor", "Lcom/iqoption/core/rx/IQBehaviorProcessor;", "timestampWithMsReceived", "init", "", "logDebug", "msg", "error", "", "logError", "observeLocalSync", "countTick", "", "observeServerSync", "observeSystemSync", "core_release"})
/* compiled from: TimeManager.kt */
public final class ad implements l {
    private static final String TAG = ad.class.getSimpleName();
    private static final long avg = TimeUnit.MINUTES.toMillis(30);
    private static long avi;
    private static final com.iqoption.core.rx.d<Long> bkA = com.iqoption.core.rx.d.bER.akd();
    private static long bkB;
    public static final ad bkC = new ad();
    private static final io.reactivex.e<Long> bkz = io.reactivex.e.f(200, TimeUnit.MILLISECONDS).bkZ().n(5, TimeUnit.SECONDS);
    private static final ReentrantReadWriteLock vc = new ReentrantReadWriteLock();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, bng = {"com/iqoption/core/manager/TimeManager$init$1", "Lcom/iqoption/core/connect/bus/IQBusImpl$TimeListener;", "onUpdate", "", "time", "", "core_release"})
    /* compiled from: TimeManager.kt */
    public static final class a implements com.iqoption.core.connect.bus.b.a {
        a() {
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, bng = {"<anonymous>", "", "first", "<anonymous parameter 1>", "", "apply", "(Ljava/lang/Integer;Ljava/lang/Long;)I"})
    /* compiled from: TimeManager.kt */
    static final class b<T1, T2, R> implements io.reactivex.b.c<R, T, R> {
        public static final b bkD = new b();

        b() {
        }

        public /* synthetic */ Object apply(Object obj, Object obj2) {
            return Integer.valueOf(a((Integer) obj, (Long) obj2));
        }

        public final int a(Integer num, Long l) {
            kotlin.jvm.internal.i.f(num, "first");
            kotlin.jvm.internal.i.f(l, "<anonymous parameter 1>");
            return num.intValue() + 1;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, bng = {"<anonymous>", "", "it", "", "test", "(Ljava/lang/Integer;)Z"})
    /* compiled from: TimeManager.kt */
    static final class c<T> implements io.reactivex.b.l<Integer> {
        final /* synthetic */ int bkE;

        c(int i) {
            this.bkE = i;
        }

        /* renamed from: g */
        public final boolean test(Integer num) {
            kotlin.jvm.internal.i.f(num, "it");
            return num.intValue() % this.bkE == 0;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, bng = {"<anonymous>", "", "it", "", "apply", "(Ljava/lang/Integer;)J"})
    /* compiled from: TimeManager.kt */
    static final class d<T, R> implements io.reactivex.b.g<T, R> {
        public static final d bkF = new d();

        d() {
        }

        public /* synthetic */ Object apply(Object obj) {
            return Long.valueOf(h((Integer) obj));
        }

        public final long h(Integer num) {
            kotlin.jvm.internal.i.f(num, "it");
            return ad.bkC.YH();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, bng = {"<anonymous>", "", "first", "<anonymous parameter 1>", "", "apply", "(Ljava/lang/Integer;Ljava/lang/Long;)I"})
    /* compiled from: TimeManager.kt */
    static final class e<T1, T2, R> implements io.reactivex.b.c<R, T, R> {
        public static final e bkG = new e();

        e() {
        }

        public /* synthetic */ Object apply(Object obj, Object obj2) {
            return Integer.valueOf(a((Integer) obj, (Long) obj2));
        }

        public final int a(Integer num, Long l) {
            kotlin.jvm.internal.i.f(num, "first");
            kotlin.jvm.internal.i.f(l, "<anonymous parameter 1>");
            return num.intValue() + 1;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, bng = {"<anonymous>", "", "it", "", "test", "(Ljava/lang/Integer;)Z"})
    /* compiled from: TimeManager.kt */
    static final class f<T> implements io.reactivex.b.l<Integer> {
        final /* synthetic */ int bkE;

        f(int i) {
            this.bkE = i;
        }

        /* renamed from: g */
        public final boolean test(Integer num) {
            kotlin.jvm.internal.i.f(num, "it");
            return num.intValue() % this.bkE == 0;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, bng = {"<anonymous>", "", "it", "", "apply", "(Ljava/lang/Integer;)J"})
    /* compiled from: TimeManager.kt */
    static final class g<T, R> implements io.reactivex.b.g<T, R> {
        public static final g bkH = new g();

        g() {
        }

        public /* synthetic */ Object apply(Object obj) {
            return Long.valueOf(h((Integer) obj));
        }

        public final long h(Integer num) {
            kotlin.jvm.internal.i.f(num, "it");
            return ad.bkC.If();
        }
    }

    private ad() {
    }

    public final long YH() {
        ReadLock readLock = vc.readLock();
        readLock.lock();
        try {
            long j = bkB;
            return j;
        } finally {
            readLock.unlock();
        }
    }

    public long If() {
        ReadLock readLock = vc.readLock();
        readLock.lock();
        try {
            long j = 0;
            if (bkC.YH() != j) {
                j = bkC.YH() + (SystemClock.elapsedRealtime() - avi);
                return j;
            }
            long currentTimeMillis = System.currentTimeMillis();
            readLock.unlock();
            return currentTimeMillis;
        } finally {
            readLock.unlock();
        }
    }

    public final io.reactivex.e<Long> eQ(int i) {
        io.reactivex.e g = bkz.a(Integer.valueOf(0), (io.reactivex.b.c) e.bkG).b((io.reactivex.b.l) new f(i)).g(g.bkH);
        kotlin.jvm.internal.i.e(g, "intervalStream\n         …      .map { systemSync }");
        return g;
    }

    public final io.reactivex.e<Long> eR(int i) {
        io.reactivex.e g = bkz.a(Integer.valueOf(0), (io.reactivex.b.c) b.bkD).b((io.reactivex.b.l) new c(i)).g(d.bkF);
        kotlin.jvm.internal.i.e(g, "intervalStream\n         …       .map { localSync }");
        return g;
    }

    public final void init() {
        com.iqoption.core.connect.bus.b.bao.a(new a());
    }
}
