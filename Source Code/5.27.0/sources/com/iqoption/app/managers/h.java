package com.iqoption.app.managers;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.bind.JsonTreeReader;
import com.google.gson.stream.JsonReader;
import com.iqoption.core.connect.m;
import com.iqoption.service.WebSocketHandler;
import io.reactivex.b.l;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000j\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 .*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0001.BO\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00028\u0000\u0018\u00010\n\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u000e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eH\u0016J\u000e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0016J\u000e\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0016J\"\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\r0\nH\u0016J\u0018\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0010\"\u001a\u0004\u0018\u00010\u0004H\u0016J \u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010!\u001a\u0004\u0018\u00010\u0014H\u0016J&\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0016\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010$H\u0016J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010%\u001a\u00020\rH\u0016J&\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010!\u001a\u00020\u00192\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\rH\u0016J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0016J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010!\u001a\u00020\u0004H\u0016J\u0018\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e*\b\u0012\u0004\u0012\u00028\u00000\u001eH\u0002J\u0018\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e*\b\u0012\u0004\u0012\u00020,0\u001eH\u0002J\u001e\u0010-\u001a\b\u0012\u0004\u0012\u0002H\u00010\u001e\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u001eH\u0002R\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\r\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00028\u0000\u0018\u00010\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006/"}, bng = {"Lcom/iqoption/app/managers/SubscribeBuilder;", "T", "Lcom/iqoption/core/connect/EventBuilder;", "name", "", "cls", "Ljava/lang/Class;", "type", "Ljava/lang/reflect/Type;", "parser", "Lkotlin/Function1;", "Lcom/google/gson/stream/JsonReader;", "unsubscribe", "", "(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/reflect/Type;Lkotlin/jvm/functions/Function1;Z)V", "filter", "loggingDenied", "microservice", "params", "", "", "sendSubscription", "sharingDenied", "throttleBeforeFilter", "throttleMillis", "", "version", "buildExecutable", "Lcom/iqoption/core/connect/Executable;", "buildStream", "Lio/reactivex/Flowable;", "denyLogging", "denySharing", "value", "microService", "param", "", "isSend", "throttle", "unit", "Ljava/util/concurrent/TimeUnit;", "beforeFilter", "filterEvents", "mapEvents", "Lcom/iqoption/core/connect/SocketEvent;", "throttleEvents", "Companion", "app_optionXRelease"})
/* compiled from: SubscribeBuilder.kt */
public final class h<T> implements com.iqoption.core.connect.c<T> {
    private static final String TAG = h.class.getSimpleName();
    private static boolean auU = true;
    public static final a auV = new a();
    private long auK;
    private boolean auL;
    private Map<String, Object> auM;
    private String auN;
    private boolean auO;
    private boolean auP;
    private boolean auQ;
    private final Class<T> auR;
    private final kotlin.jvm.a.b<JsonReader, T> auS;
    private boolean auT;
    private kotlin.jvm.a.b<? super T, Boolean> filter;
    private final String name;
    private final Type type;
    private String version;

    @i(bne = {1, 1, 15}, bnf = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001d\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\n2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\bR\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, bng = {"Lcom/iqoption/app/managers/SubscribeBuilder$Companion;", "", "()V", "LOGGING_ENABLED", "", "getLOGGING_ENABLED", "()Z", "setLOGGING_ENABLED", "(Z)V", "TAG", "", "kotlin.jvm.PlatformType", "logDebug", "", "msg", "error", "", "app_optionXRelease"})
    /* compiled from: SubscribeBuilder.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final boolean HT() {
            return h.auU;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, bng = {"<anonymous>", "", "T", "<name for destructuring parameter 0>", "Lcom/iqoption/core/connect/SocketEvent;", "test", "com/iqoption/app/managers/SubscribeBuilder$buildStream$1$1"})
    /* compiled from: SubscribeBuilder.kt */
    static final class b<T> implements l<m> {
        final /* synthetic */ h auW;

        b(h hVar) {
            this.auW = hVar;
        }

        /* renamed from: a */
        public final boolean test(m mVar) {
            kotlin.jvm.internal.i.f(mVar, "<name for destructuring parameter 0>");
            return kotlin.jvm.internal.i.y(mVar.UD(), this.auW.name);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0006¨\u0006\b"}, bng = {"<anonymous>", "", "T", "it", "Lorg/reactivestreams/Subscription;", "kotlin.jvm.PlatformType", "accept", "com/iqoption/app/managers/SubscribeBuilder$buildStream$1$4$1", "com/iqoption/app/managers/SubscribeBuilder$$special$$inlined$let$lambda$1"})
    /* compiled from: SubscribeBuilder.kt */
    static final class c<T> implements io.reactivex.b.f<org.a.d> {
        final /* synthetic */ h auW;
        final /* synthetic */ com.iqoption.core.connect.e auX;

        c(com.iqoption.core.connect.e eVar, h hVar) {
            this.auX = eVar;
            this.auW = hVar;
        }

        public final void accept(org.a.d dVar) {
            this.auX.by(true);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003¨\u0006\u0005"}, bng = {"<anonymous>", "", "T", "run", "com/iqoption/app/managers/SubscribeBuilder$buildStream$1$4$2", "com/iqoption/app/managers/SubscribeBuilder$$special$$inlined$let$lambda$2"})
    /* compiled from: SubscribeBuilder.kt */
    static final class d implements io.reactivex.b.a {
        final /* synthetic */ h auW;
        final /* synthetic */ com.iqoption.core.connect.e auX;

        d(com.iqoption.core.connect.e eVar, h hVar) {
            this.auX = eVar;
            this.auW = hVar;
        }

        public final void run() {
            this.auX.by(false);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0006¨\u0006\b"}, bng = {"<anonymous>", "", "T", "it", "Lorg/reactivestreams/Subscription;", "kotlin.jvm.PlatformType", "accept", "com/iqoption/app/managers/SubscribeBuilder$buildStream$1$4$3", "com/iqoption/app/managers/SubscribeBuilder$$special$$inlined$let$lambda$3"})
    /* compiled from: SubscribeBuilder.kt */
    static final class e<T> implements io.reactivex.b.f<org.a.d> {
        final /* synthetic */ h auW;
        final /* synthetic */ com.iqoption.core.connect.e auX;

        e(com.iqoption.core.connect.e eVar, h hVar) {
            this.auX = eVar;
            this.auW = hVar;
        }

        public final void accept(org.a.d dVar) {
            this.auX.by(false);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, bng = {"<anonymous>", "", "T", "message", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Object;)V"})
    /* compiled from: SubscribeBuilder.kt */
    static final class f<T> implements io.reactivex.b.f<T> {
        public static final f auY = new f();

        f() {
        }

        public final void accept(T t) {
            a aVar = h.auV;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("<--- in Event: ");
            stringBuilder.append(t);
            stringBuilder.toString();
            Throwable th = (Throwable) null;
            aVar.HT();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, bng = {"<anonymous>", "", "T", "data", "test", "(Ljava/lang/Object;)Z"})
    /* compiled from: SubscribeBuilder.kt */
    static final class g<T> implements l<T> {
        final /* synthetic */ kotlin.jvm.a.b auZ;

        g(kotlin.jvm.a.b bVar) {
            this.auZ = bVar;
        }

        public final boolean test(T t) {
            return ((Boolean) this.auZ.invoke(t)).booleanValue();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, bng = {"<anonymous>", "T", "it", "Lcom/iqoption/core/connect/SocketEvent;", "apply", "(Lcom/iqoption/core/connect/SocketEvent;)Ljava/lang/Object;"})
    /* compiled from: SubscribeBuilder.kt */
    static final class h<T, R> implements io.reactivex.b.g<T, R> {
        final /* synthetic */ h auW;

        h(h hVar) {
            this.auW = hVar;
        }

        /* renamed from: b */
        public final T apply(m mVar) {
            kotlin.jvm.internal.i.f(mVar, "it");
            try {
                if (this.auW.auR != null) {
                    return com.iqoption.core.ext.d.b(mVar.UC(), this.auW.auR, null, 2, null);
                }
                if (this.auW.type != null) {
                    return com.iqoption.core.ext.d.a(mVar.UC(), this.auW.type, null, 2, null);
                }
                if (this.auW.auS != null) {
                    return this.auW.auS.invoke(new JsonTreeReader(mVar.UC()));
                }
                throw new RuntimeException("Could not parse json without knowing class or type of destination object");
            } catch (JsonSyntaxException e) {
                throw new RuntimeException(mVar.toString(), e);
            }
        }
    }

    public h(String str, Class<T> cls, Type type, kotlin.jvm.a.b<? super JsonReader, ? extends T> bVar) {
        this(str, cls, type, bVar, false, 16, null);
    }

    public h(String str, Class<T> cls, Type type, kotlin.jvm.a.b<? super JsonReader, ? extends T> bVar, boolean z) {
        kotlin.jvm.internal.i.f(str, ConditionalUserProperty.NAME);
        this.name = str;
        this.auR = cls;
        this.type = type;
        this.auS = bVar;
        this.auT = z;
        this.version = "1.0";
        this.auN = "";
        this.auO = true;
        this.auQ = 1 ^ com.iqoption.core.d.Un().Ds();
    }

    public /* synthetic */ h(String str, Class cls, Type type, kotlin.jvm.a.b bVar, boolean z, int i, f fVar) {
        if ((i & 2) != 0) {
            cls = (Class) null;
        }
        Class cls2 = cls;
        if ((i & 4) != 0) {
            type = (Type) null;
        }
        Type type2 = type;
        if ((i & 8) != 0) {
            bVar = (kotlin.jvm.a.b) null;
        }
        this(str, cls2, type2, bVar, (i & 16) != 0 ? false : z);
    }

    public com.iqoption.core.connect.c<T> b(kotlin.jvm.a.b<? super T, Boolean> bVar) {
        kotlin.jvm.internal.i.f(bVar, ConditionalUserProperty.VALUE);
        this.filter = bVar;
        return this;
    }

    public com.iqoption.core.connect.c<T> a(long j, TimeUnit timeUnit, boolean z) {
        kotlin.jvm.internal.i.f(timeUnit, "unit");
        this.auK = timeUnit.toMillis(j);
        this.auL = z;
        return this;
    }

    public com.iqoption.core.connect.c<T> ec(String str) {
        kotlin.jvm.internal.i.f(str, ConditionalUserProperty.VALUE);
        this.version = str;
        return this;
    }

    public com.iqoption.core.connect.c<T> i(String str, Object obj) {
        kotlin.jvm.internal.i.f(str, ConditionalUserProperty.NAME);
        Map map = this.auM;
        if (map == null) {
            map = new LinkedHashMap();
            this.auM = map;
        }
        map.put(str, obj);
        return this;
    }

    public com.iqoption.core.connect.c<T> ed(String str) {
        if (str == null) {
            str = "";
        }
        this.auN = str;
        return this;
    }

    public com.iqoption.core.connect.c<T> bx(boolean z) {
        this.auO = z;
        return this;
    }

    public com.iqoption.core.connect.c<T> HO() {
        this.auP = true;
        return this;
    }

    public com.iqoption.core.connect.c<T> HP() {
        this.auQ = true;
        return this;
    }

    public io.reactivex.e<T> HQ() {
        io.reactivex.e<T> b;
        com.iqoption.core.connect.e HR = HR();
        com.iqoption.m.a aTn = WebSocketHandler.aTn();
        kotlin.jvm.internal.i.e(aTn, "WebSocketHandler.instance()");
        io.reactivex.e c = aTn.aTz().b((l) new b(this)).bkY().c(com.iqoption.core.rx.i.aki());
        if (this.auK > 0) {
            if (this.auL) {
                b = b(c(a(c)));
            } else if (this.filter != null) {
                b = a(b(c(c)));
            } else {
                b = c(a(c));
            }
        } else if (this.filter != null) {
            b = b(c(c));
        } else {
            b = c(c);
        }
        if (!this.auQ) {
            b = b.c((io.reactivex.b.f) f.auY);
        }
        if (this.auO) {
            b = b.d((io.reactivex.b.f) new c(HR, this)).e((io.reactivex.b.a) new d(HR, this));
        } else if (this.auT) {
            b = b.d((io.reactivex.b.f) new e(HR, this));
        }
        if (this.auP) {
            return b;
        }
        c = b.blb();
        kotlin.jvm.internal.i.e(c, "dataStream.share()");
        return c;
    }

    public com.iqoption.core.connect.e HR() {
        return new i(this.name, this.version, this.auM, this.auN);
    }

    private final <T> io.reactivex.e<T> a(io.reactivex.e<T> eVar) {
        io.reactivex.e k = eVar.k(this.auK, TimeUnit.MILLISECONDS);
        kotlin.jvm.internal.i.e(k, "throttleLatest(throttleM…s, TimeUnit.MILLISECONDS)");
        return k;
    }

    private final io.reactivex.e<T> b(io.reactivex.e<T> eVar) {
        kotlin.jvm.a.b bVar = this.filter;
        if (bVar == null) {
            return eVar;
        }
        io.reactivex.e b = eVar.b((l) new g(bVar));
        kotlin.jvm.internal.i.e(b, "filter { data -> f.invoke(data) }");
        return b;
    }

    private final io.reactivex.e<T> c(io.reactivex.e<m> eVar) {
        io.reactivex.e g = eVar.g(new h(this));
        kotlin.jvm.internal.i.e(g, "map {\n            try {\n…)\n            }\n        }");
        return g;
    }
}
