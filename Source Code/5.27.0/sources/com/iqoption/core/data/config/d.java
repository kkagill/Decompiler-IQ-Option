package com.iqoption.core.data.config;

import com.iqoption.core.data.config.ApiConfig.Type;
import com.iqoption.dto.Event;
import com.iqoption.dto.entity.position.Position;
import io.reactivex.p;
import io.reactivex.t;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.a.m;
import kotlin.l;
import okhttp3.Cookie;
import okhttp3.Cookie.Builder;

@kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\b\u0000\u0018\u0000 c2\u00020\u00012\u00020\u0002:\u0001cB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0002\u0010\bJ\u0015\u0010J\u001a\u0004\u0018\u00010\n2\b\u0010K\u001a\u0004\u0018\u00010\nH\u0001J\u0011\u0010L\u001a\u00020\n2\u0006\u0010K\u001a\u00020\nH\u0001J\u0015\u0010M\u001a\u0004\u0018\u00010\n2\b\u0010K\u001a\u0004\u0018\u00010\nH\u0001J\u0011\u0010N\u001a\u00020\n2\u0006\u0010K\u001a\u00020\nH\u0001J\b\u0010O\u001a\u00020PH\u0016J\u0018\u0010O\u001a\u00020P2\u0006\u0010Q\u001a\u00020\n2\u0006\u0010R\u001a\u000209H\u0016J\u0010\u0010S\u001a\u00020$2\u0006\u0010T\u001a\u00020UH\u0002J\u000e\u0010V\u001a\b\u0012\u0004\u0012\u00020U0WH\u0002J\u001e\u0010X\u001a\b\u0012\u0004\u0012\u00020U0W2\u0006\u0010Y\u001a\u00020\n2\u0006\u0010Z\u001a\u00020[H\u0002J\u000e\u0010\\\u001a\b\u0012\u0004\u0012\u00020U0WH\u0002J\u000e\u0010]\u001a\b\u0012\u0004\u0012\u00020U0WH\u0002J\u0016\u0010^\u001a\u00020\u00072\f\u0010Z\u001a\b\u0012\u0004\u0012\u00020\n0_H\u0016J\b\u0010`\u001a\u00020\u0007H\u0016J\u0010\u0010a\u001a\u00020$2\u0006\u0010T\u001a\u00020UH\u0002J\b\u0010b\u001a\u00020\u0007H\u0002R\u0012\u0010\t\u001a\u00020\nX\u0005¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0012\u0010\r\u001a\u00020\nX\u0005¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u0012\u0010\u000f\u001a\u00020\nX\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\fR\u0012\u0010\u0011\u001a\u00020\nX\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\fR\u0012\u0010\u0013\u001a\u00020\nX\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\fR\u0012\u0010\u0015\u001a\u00020\nX\u0005¢\u0006\u0006\u001a\u0004\b\u0016\u0010\fR\u0012\u0010\u0017\u001a\u00020\nX\u0005¢\u0006\u0006\u001a\u0004\b\u0018\u0010\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0019\u001a\u00020\nX\u0005¢\u0006\u0006\u001a\u0004\b\u001a\u0010\fR\u0012\u0010\u001b\u001a\u00020\nX\u0005¢\u0006\u0006\u001a\u0004\b\u001c\u0010\fR\u0012\u0010\u001d\u001a\u00020\nX\u0005¢\u0006\u0006\u001a\u0004\b\u001e\u0010\fR\u0012\u0010\u001f\u001a\u00020\nX\u0005¢\u0006\u0006\u001a\u0004\b \u0010\fR\u0012\u0010!\u001a\u00020\nX\u0005¢\u0006\u0006\u001a\u0004\b\"\u0010\fR\u000e\u0010#\u001a\u00020$X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020$X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010&\u001a\u00020\nX\u0005¢\u0006\u0006\u001a\u0004\b'\u0010\fR\u0012\u0010(\u001a\u00020\nX\u0005¢\u0006\u0006\u001a\u0004\b)\u0010\fR\u0014\u0010*\u001a\u00020$8VX\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020$8VX\u0004¢\u0006\u0006\u001a\u0004\b,\u0010+R\u0014\u0010-\u001a\u00020$8VX\u0004¢\u0006\u0006\u001a\u0004\b-\u0010+R\u0014\u0010.\u001a\u00020$8VX\u0004¢\u0006\u0006\u001a\u0004\b.\u0010+R\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0004¢\u0006\u0002\n\u0000R\u0012\u0010/\u001a\u00020\nX\u0005¢\u0006\u0006\u001a\u0004\b0\u0010\fR\u000e\u00101\u001a\u000202X\u0004¢\u0006\u0002\n\u0000R\u001a\u00103\u001a\u0004\u0018\u00010$X\u000f¢\u0006\f\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u0014\u00108\u001a\u0002098VX\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0012\u0010<\u001a\u00020\nX\u0005¢\u0006\u0006\u001a\u0004\b=\u0010\fR\u0012\u0010>\u001a\u00020\nX\u0005¢\u0006\u0006\u001a\u0004\b?\u0010\fR\u0012\u0010@\u001a\u00020\nX\u0005¢\u0006\u0006\u001a\u0004\bA\u0010\fR\u0012\u0010B\u001a\u00020\nX\u0005¢\u0006\u0006\u001a\u0004\bC\u0010\fR\u0012\u0010D\u001a\u00020\nX\u0005¢\u0006\u0006\u001a\u0004\bE\u0010\fR\u0012\u0010F\u001a\u00020\nX\u0005¢\u0006\u0006\u001a\u0004\bG\u0010\fR\u0012\u0010H\u001a\u00020\nX\u0005¢\u0006\u0006\u001a\u0004\bI\u0010\f¨\u0006d"}, bng = {"Lcom/iqoption/core/data/config/ApiConfigImpl;", "Lcom/iqoption/core/data/config/ApiConfig;", "Lcom/iqoption/core/data/config/ApiConfigData;", "configData", "Lcom/iqoption/core/data/config/RealApiConfigData;", "onRequestLogout", "Lkotlin/Function0;", "", "(Lcom/iqoption/core/data/config/RealApiConfigData;Lkotlin/jvm/functions/Function0;)V", "authApi", "", "getAuthApi", "()Ljava/lang/String;", "avatarsApi", "getAvatarsApi", "billingApi", "getBillingApi", "blogApi", "getBlogApi", "chatApi", "getChatApi", "clusterApi", "getClusterApi", "clusterWebsocket", "getClusterWebsocket", "coreApi", "getCoreApi", "domain", "getDomain", "eventApi", "getEventApi", "featuresApi", "getFeaturesApi", "finInfoApi", "getFinInfoApi", "flagInitialized", "", "flagReleased", "fsmsApi", "getFsmsApi", "gatewayApi", "getGatewayApi", "isInitialized", "()Z", "isIntegration", "isProduction", "isSandbox", "resourcesApi", "getResourcesApi", "retryCycleCount", "Ljava/util/concurrent/atomic/AtomicInteger;", "tc", "getTc", "()Ljava/lang/Boolean;", "setTc", "(Ljava/lang/Boolean;)V", "type", "Lcom/iqoption/core/data/config/ApiConfig$Type;", "getType", "()Lcom/iqoption/core/data/config/ApiConfig$Type;", "userVerificationApi", "getUserVerificationApi", "userVerifyApi", "getUserVerifyApi", "videoEduApi", "getVideoEduApi", "walletReferralApi", "getWalletReferralApi", "webApi", "getWebApi", "webRegulatedApi", "getWebRegulatedApi", "webStaticApi", "getWebStaticApi", "getFsmsUrlUrlOrNull", "path", "getResourceUrl", "getResourceUrlOrNull", "getWebStaticUrl", "initialize", "Lio/reactivex/Completable;", "newCoreUrl", "newType", "isInvalidAuthorizedConfig", "cfg", "Lcom/iqoption/core/microservices/core/response/Configuration;", "loadConfig", "Lio/reactivex/Single;", "loadConfigByHosts", "tag", "hosts", "Lcom/iqoption/core/data/config/ApiConfigHosts;", "loadConfigFromFirebase", "loadConfigFromS3", "onRecoveryHostsChanged", "", "release", "tryFixSSID", "tryInitialize", "Companion", "core_release"})
/* compiled from: ApiConfigImpl.kt */
public final class d implements ApiConfig, a {
    private static final String TAG = d.class.getSimpleName();
    public static final a bbL = new a();
    private volatile boolean bbG;
    private volatile boolean bbH;
    private final AtomicInteger bbI = new AtomicInteger();
    private final i bbJ;
    private final kotlin.jvm.a.a<l> bbK;

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, bng = {"Lcom/iqoption/core/data/config/ApiConfigImpl$Companion;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "getTAG", "()Ljava/lang/String;", "core_release"})
    /* compiled from: ApiConfigImpl.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "run"})
    /* compiled from: ApiConfigImpl.kt */
    static final class b implements Runnable {
        final /* synthetic */ d bbM;

        b(d dVar) {
            this.bbM = dVar;
        }

        public final void run() {
            this.bbM.Vx();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "run"})
    /* compiled from: ApiConfigImpl.kt */
    static final class c implements Runnable {
        final /* synthetic */ d bbM;
        final /* synthetic */ String bbN;
        final /* synthetic */ Type bbO;

        c(d dVar, String str, Type type) {
            this.bbM = dVar;
            this.bbN = str;
            this.bbO = type;
        }

        public final void run() {
            a aVar;
            this.bbM.bbJ.fF(this.bbN);
            i b = this.bbM.bbJ;
            int i = e.aob[this.bbO.ordinal()];
            if (i == 1) {
                aVar = g.bcr;
            } else if (i == 2) {
                aVar = h.bcs;
            } else if (i == 3) {
                aVar = new j(this.bbN);
            } else {
                throw new NoWhenBranchMatchedException();
            }
            b.b(aVar);
            this.bbM.release();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "Lcom/iqoption/core/data/config/ApiConfig$Type;", "call"})
    /* compiled from: ApiConfigImpl.kt */
    static final class d<V> implements Callable<T> {
        final /* synthetic */ d bbM;

        d(d dVar) {
            this.bbM = dVar;
        }

        /* renamed from: VB */
        public final Type call() {
            return this.bbM.UY();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "call"})
    /* compiled from: ApiConfigImpl.kt */
    static final class g<V> implements Callable<T> {
        final /* synthetic */ c $hosts;

        g(c cVar) {
            this.$hosts = cVar;
        }

        /* renamed from: iH */
        public final String call() {
            return this.$hosts.Vo();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "Lio/reactivex/Single;", "Lcom/iqoption/core/microservices/core/response/Configuration;", "kotlin.jvm.PlatformType", "type", "Lcom/iqoption/core/data/config/ApiConfig$Type;", "apply"})
    /* compiled from: ApiConfigImpl.kt */
    static final class e<T, R> implements io.reactivex.b.g<T, t<? extends R>> {
        final /* synthetic */ d bbM;

        @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "Lio/reactivex/Single;", "Lcom/iqoption/core/microservices/core/response/Configuration;", "hosts", "Lcom/iqoption/core/data/config/ApiConfigHosts;", "apply"})
        /* compiled from: ApiConfigImpl.kt */
        /* renamed from: com.iqoption.core.data.config.d$e$1 */
        static final class AnonymousClass1<T, R> implements io.reactivex.b.g<T, t<? extends R>> {
            final /* synthetic */ e bbP;

            AnonymousClass1(e eVar) {
                this.bbP = eVar;
            }

            /* renamed from: c */
            public final p<com.iqoption.core.microservices.core.response.b> apply(c cVar) {
                kotlin.jvm.internal.i.f(cVar, "hosts");
                return this.bbP.bbM.a(Position.CLOSE_REASON_DEFAULT, cVar);
            }
        }

        @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"})
        /* compiled from: ApiConfigImpl.kt */
        /* renamed from: com.iqoption.core.data.config.d$e$2 */
        static final class AnonymousClass2<T> implements io.reactivex.b.f<Throwable> {
            final /* synthetic */ e bbP;

            AnonymousClass2(e eVar) {
                this.bbP = eVar;
            }

            /* renamed from: o */
            public final void accept(Throwable th) {
                c.bby.Vv();
                this.bbP.bbM.bbI.incrementAndGet();
            }
        }

        e(d dVar) {
            this.bbM = dVar;
        }

        /* renamed from: a */
        public final p<com.iqoption.core.microservices.core.response.b> apply(Type type) {
            kotlin.jvm.internal.i.f(type, "type");
            if (type != Type.PROD) {
                return this.bbM.a(String.valueOf(type), new c(l.listOf(this.bbM.bbJ.VE().Va())));
            }
            final AtomicInteger atomicInteger = new AtomicInteger();
            return c.bby.a(this.bbM.bbJ.VE()).q(new AnonymousClass1(this)).e(this.bbM.Vz()).e(this.bbM.VA().i((io.reactivex.b.f) new AnonymousClass2(this))).h((io.reactivex.b.f) new io.reactivex.b.f<com.iqoption.core.microservices.core.response.b>(this) {
                final /* synthetic */ e bbP;

                /* renamed from: c */
                public final void accept(com.iqoption.core.microservices.core.response.b bVar) {
                    if (com.iqoption.core.d.EA().DR()) {
                        d dVar = this.bbP.bbM;
                        kotlin.jvm.internal.i.e(bVar, "cfg");
                        if (dVar.a(bVar) || !this.bbP.bbM.b(bVar)) {
                            if (atomicInteger.incrementAndGet() == 2) {
                                kotlin.jvm.a.a f = this.bbP.bbM.bbK;
                                if (f != null) {
                                    l lVar = (l) f.invoke();
                                }
                            }
                            throw new Exception("Config does not contain cluster API or cluster WS");
                        }
                    }
                }
            }).w(new com.iqoption.core.rx.backoff.a(Integer.MAX_VALUE, null, 0, null, null, "next-config-cycle", 30, null));
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "cfg", "Lcom/iqoption/core/microservices/core/response/Configuration;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: ApiConfigImpl.kt */
    static final class f<T> implements io.reactivex.b.f<com.iqoption.core.microservices.core.response.b> {
        final /* synthetic */ com.iqoption.core.analytics.b bbR;

        f(com.iqoption.core.analytics.b bVar) {
            this.bbR = bVar;
        }

        /* renamed from: c */
        public final void accept(com.iqoption.core.microservices.core.response.b bVar) {
            com.iqoption.core.microservices.core.response.e ada = bVar.ada();
            if (ada != null) {
                this.bbR.f("connection_host", ada.getHost());
                this.bbR.Cc();
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "Lio/reactivex/Single;", "Lcom/iqoption/core/microservices/core/response/Configuration;", "kotlin.jvm.PlatformType", "host", "", "apply"})
    /* compiled from: ApiConfigImpl.kt */
    static final class h<T, R> implements io.reactivex.b.g<T, t<? extends R>> {
        final /* synthetic */ String bbS;

        h(String str) {
            this.bbS = str;
        }

        /* renamed from: fE */
        public final p<com.iqoption.core.microservices.core.response.b> apply(String str) {
            kotlin.jvm.internal.i.f(str, "host");
            p gy = com.iqoption.core.microservices.core.a.brP.gy(str);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.bbS);
            stringBuilder.append("-request");
            return gy.w(new com.iqoption.core.rx.backoff.a(2, null, 0, null, null, stringBuilder.toString(), 30, null));
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "Lio/reactivex/Single;", "Lcom/iqoption/core/microservices/core/response/Configuration;", "hosts", "Lcom/iqoption/core/data/config/ApiConfigHosts;", "apply"})
    /* compiled from: ApiConfigImpl.kt */
    static final class i<T, R> implements io.reactivex.b.g<T, t<? extends R>> {
        final /* synthetic */ d bbM;

        i(d dVar) {
            this.bbM = dVar;
        }

        /* renamed from: c */
        public final p<com.iqoption.core.microservices.core.response.b> apply(c cVar) {
            kotlin.jvm.internal.i.f(cVar, "hosts");
            return this.bbM.a("firebase", cVar);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "Lio/reactivex/Single;", "Lcom/iqoption/core/microservices/core/response/Configuration;", "hosts", "Lcom/iqoption/core/data/config/ApiConfigHosts;", "apply"})
    /* compiled from: ApiConfigImpl.kt */
    static final class j<T, R> implements io.reactivex.b.g<T, t<? extends R>> {
        final /* synthetic */ d bbM;

        j(d dVar) {
            this.bbM = dVar;
        }

        /* renamed from: c */
        public final p<com.iqoption.core.microservices.core.response.b> apply(c cVar) {
            kotlin.jvm.internal.i.f(cVar, "hosts");
            return this.bbM.a("s3", cVar);
        }
    }

    public String Va() {
        return this.bbJ.Va();
    }

    public String Vb() {
        return this.bbJ.Vb();
    }

    public String Vc() {
        return this.bbJ.Vc();
    }

    public String Vd() {
        return this.bbJ.Vd();
    }

    public String Ve() {
        return this.bbJ.Ve();
    }

    public String Vf() {
        return this.bbJ.Vf();
    }

    public String Vg() {
        return this.bbJ.Vg();
    }

    public String Vh() {
        return this.bbJ.Vh();
    }

    public String Vi() {
        return this.bbJ.Vi();
    }

    public String Vj() {
        return this.bbJ.Vj();
    }

    public String Vk() {
        return this.bbJ.Vk();
    }

    public String Vl() {
        return this.bbJ.Vl();
    }

    public String Vm() {
        return this.bbJ.Vm();
    }

    public String Vn() {
        return this.bbJ.Vn();
    }

    public String fA(String str) {
        return this.bbJ.fA(str);
    }

    public String fB(String str) {
        return this.bbJ.fB(str);
    }

    public String fz(String str) {
        kotlin.jvm.internal.i.f(str, "path");
        return this.bbJ.fz(str);
    }

    public String getDomain() {
        return this.bbJ.getDomain();
    }

    public void k(Boolean bool) {
        this.bbJ.k(bool);
    }

    public d(i iVar, kotlin.jvm.a.a<l> aVar) {
        kotlin.jvm.internal.i.f(iVar, "configData");
        this.bbJ = iVar;
        this.bbK = aVar;
    }

    public Type UY() {
        a VE = this.bbJ.VE();
        if (kotlin.jvm.internal.i.y(VE, h.bcs)) {
            return Type.PROD;
        }
        if (kotlin.jvm.internal.i.y(VE, g.bcr)) {
            return Type.INT;
        }
        return Type.SANDBOX;
    }

    public boolean isInitialized() {
        return this.bbG;
    }

    public boolean UW() {
        return kotlin.jvm.internal.i.y(this.bbJ.VE(), h.bcs);
    }

    public boolean UX() {
        return this.bbJ.VE() instanceof j;
    }

    public io.reactivex.a UZ() {
        io.reactivex.a l = io.reactivex.a.l(new b(this));
        kotlin.jvm.internal.i.e(l, "Completable\n            …alize()\n                }");
        return l;
    }

    /* JADX WARNING: Missing block: B:10:0x000d, code skipped:
            r0 = (com.iqoption.core.microservices.core.response.b) Vy().ble();
            r2.bbJ.d(r0);
     */
    /* JADX WARNING: Missing block: B:11:0x0020, code skipped:
            if (UX() != false) goto L_0x0033;
     */
    /* JADX WARNING: Missing block: B:12:0x0022, code skipped:
            r1 = r2.bbJ;
            r0 = r0.adc();
     */
    /* JADX WARNING: Missing block: B:13:0x0028, code skipped:
            if (r0 == null) goto L_0x002f;
     */
    /* JADX WARNING: Missing block: B:14:0x002a, code skipped:
            r0 = r0.getUrl();
     */
    /* JADX WARNING: Missing block: B:15:0x002f, code skipped:
            r0 = null;
     */
    /* JADX WARNING: Missing block: B:16:0x0030, code skipped:
            r1.fF(r0);
     */
    /* JADX WARNING: Missing block: B:17:0x0033, code skipped:
            monitor-enter(r2);
     */
    /* JADX WARNING: Missing block: B:20:0x0036, code skipped:
            if (r2.bbH != false) goto L_0x003b;
     */
    /* JADX WARNING: Missing block: B:21:0x0038, code skipped:
            r2.bbG = true;
     */
    /* JADX WARNING: Missing block: B:22:0x003b, code skipped:
            r0 = kotlin.l.eVB;
     */
    /* JADX WARNING: Missing block: B:23:0x003d, code skipped:
            monitor-exit(r2);
     */
    /* JADX WARNING: Missing block: B:24:0x003e, code skipped:
            return;
     */
    private final void Vx() {
        /*
        r2 = this;
        monitor-enter(r2);
        r0 = r2.bbG;	 Catch:{ all -> 0x0042 }
        if (r0 == 0) goto L_0x0007;
    L_0x0005:
        monitor-exit(r2);
        return;
    L_0x0007:
        r0 = 0;
        r2.bbH = r0;	 Catch:{ all -> 0x0042 }
        r0 = kotlin.l.eVB;	 Catch:{ all -> 0x0042 }
        monitor-exit(r2);
        r0 = r2.Vy();
        r0 = r0.ble();
        r0 = (com.iqoption.core.microservices.core.response.b) r0;
        r1 = r2.bbJ;
        r1.d(r0);
        r1 = r2.UX();
        if (r1 != 0) goto L_0x0033;
    L_0x0022:
        r1 = r2.bbJ;
        r0 = r0.adc();
        if (r0 == 0) goto L_0x002f;
    L_0x002a:
        r0 = r0.getUrl();
        goto L_0x0030;
    L_0x002f:
        r0 = 0;
    L_0x0030:
        r1.fF(r0);
    L_0x0033:
        monitor-enter(r2);
        r0 = r2.bbH;	 Catch:{ all -> 0x003f }
        if (r0 != 0) goto L_0x003b;
    L_0x0038:
        r0 = 1;
        r2.bbG = r0;	 Catch:{ all -> 0x003f }
    L_0x003b:
        r0 = kotlin.l.eVB;	 Catch:{ all -> 0x003f }
        monitor-exit(r2);
        return;
    L_0x003f:
        r0 = move-exception;
        monitor-exit(r2);
        throw r0;
    L_0x0042:
        r0 = move-exception;
        monitor-exit(r2);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.core.data.config.d.Vx():void");
    }

    public io.reactivex.a a(String str, Type type) {
        kotlin.jvm.internal.i.f(str, "newCoreUrl");
        kotlin.jvm.internal.i.f(type, "newType");
        io.reactivex.a b = io.reactivex.a.l(new c(this, str, type)).b((io.reactivex.c) UZ());
        kotlin.jvm.internal.i.e(b, "Completable\n            …   .andThen(initialize())");
        return b;
    }

    public synchronized void release() {
        this.bbG = false;
        this.bbH = true;
        this.bbJ.d((com.iqoption.core.microservices.core.response.b) null);
    }

    private final p<com.iqoption.core.microservices.core.response.b> Vy() {
        p h = p.j(new d(this)).q(new e(this)).h((io.reactivex.b.f) new f(com.iqoption.core.d.EC().W(Event.CATEGORY_SYSTEM, "connection-host")));
        kotlin.jvm.internal.i.e(h, "Single\n                .…      }\n                }");
        return h;
    }

    private final boolean a(com.iqoption.core.microservices.core.response.b bVar) {
        return bVar.adc() == null || bVar.adb() == null;
    }

    private final boolean b(com.iqoption.core.microservices.core.response.b bVar) {
        if (UY() != Type.PROD) {
            return true;
        }
        com.iqoption.core.microservices.core.response.a adc = bVar.adc();
        Object obj = null;
        Object host = adc != null ? adc.getHost() : null;
        if (host == null) {
            return false;
        }
        Cookie fs = com.iqoption.core.connect.http.c.baF.fs(bVar.adc().getUrl());
        if (fs == null) {
            Collection arrayList = new ArrayList();
            for (String fs2 : h.bcs.VD()) {
                Cookie fs3 = com.iqoption.core.connect.http.c.baF.fs(fs2);
                if (fs3 != null) {
                    arrayList.add(fs3);
                }
            }
            Iterator it = ((List) arrayList).iterator();
            if (it.hasNext()) {
                obj = it.next();
                long expiresAt = ((Cookie) obj).expiresAt();
                while (it.hasNext()) {
                    Object next = it.next();
                    long expiresAt2 = ((Cookie) next).expiresAt();
                    if (expiresAt < expiresAt2) {
                        obj = next;
                        expiresAt = expiresAt2;
                    }
                }
            }
            fs = (Cookie) obj;
        }
        if (fs == null) {
            return false;
        }
        if (kotlin.jvm.internal.i.y(fs.domain(), host)) {
            return true;
        }
        Builder builder = new Builder();
        builder.name(fs.name());
        builder.value(fs.value());
        if (fs.persistent()) {
            builder.expiresAt(fs.expiresAt());
        }
        builder.path(fs.path());
        if (fs.hostOnly()) {
            builder.hostOnlyDomain(host);
        } else {
            builder.domain(host);
        }
        if (fs.httpOnly()) {
            builder.httpOnly();
        }
        if (fs.secure()) {
            builder.secure();
        }
        Cookie build = builder.build();
        com.iqoption.core.connect.http.c cVar = com.iqoption.core.connect.http.c.baF;
        String url = bVar.adc().getUrl();
        kotlin.jvm.internal.i.e(build, "fixedSSID");
        cVar.a(url, build);
        return true;
    }

    private final p<com.iqoption.core.microservices.core.response.b> Vz() {
        p n = c.bby.Vt().n(new i(this));
        kotlin.jvm.internal.i.e(n, "ApiConfigHosts.loadFireb… hosts)\n                }");
        return n;
    }

    private final p<com.iqoption.core.microservices.core.response.b> VA() {
        p q = c.bby.Vu().q(new j(this));
        kotlin.jvm.internal.i.e(q, "ApiConfigHosts.loadS3()\n… hosts)\n                }");
        return q;
    }

    private final p<com.iqoption.core.microservices.core.response.b> a(String str, c cVar) {
        p q = p.j(new g(cVar)).q(new h(str));
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append("-next-host");
        p w = q.w(new com.iqoption.core.rx.backoff.a(null, 0, null, null, stringBuilder.toString(), (m) new ApiConfigImpl$loadConfigByHosts$3(cVar), 15, null));
        kotlin.jvm.internal.i.e(w, "Single\n                .…next()\n                })");
        return w;
    }

    public void am(List<String> list) {
        kotlin.jvm.internal.i.f(list, "hosts");
        c.bby.an(list);
    }
}
