package com.iqoption.core.data.config;

import kotlin.i;
import okhttp3.HttpUrl;

@i(bne = {1, 1, 15}, bnf = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u0000 >2\u00020\u0001:\u0001>B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0015\u00109\u001a\u0004\u0018\u00010\u00032\b\u0010:\u001a\u0004\u0018\u00010\u0003H\u0001J\u0011\u0010;\u001a\u00020\u00032\u0006\u0010:\u001a\u00020\u0003H\u0001J\u0015\u0010<\u001a\u0004\u0018\u00010\u00032\b\u0010:\u001a\u0004\u0018\u00010\u0003H\u0001J\u0011\u0010=\u001a\u00020\u00032\u0006\u0010:\u001a\u00020\u0003H\u0001R\u0012\u0010\u0005\u001a\u00020\u0003X\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\u0003X\u0005¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0012\u0010\n\u001a\u00020\u0003X\u0005¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007R\u0012\u0010\f\u001a\u00020\u0003X\u0005¢\u0006\u0006\u001a\u0004\b\r\u0010\u0007R\u0012\u0010\u000e\u001a\u00020\u0003X\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0007R\u0012\u0010\u0010\u001a\u00020\u0003X\u0005¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0007R\u0012\u0010\u0012\u001a\u00020\u0003X\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0007R\u0014\u0010\u0014\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0007R\u0014\u0010\u0016\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0007R\u0012\u0010\u0018\u001a\u00020\u0003X\u0005¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0007R\u0012\u0010\u001a\u001a\u00020\u0003X\u0005¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0007R\u0012\u0010\u001c\u001a\u00020\u0003X\u0005¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0007R\u0012\u0010\u001e\u001a\u00020\u0003X\u0005¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0007R\u0012\u0010 \u001a\u00020\u0003X\u0005¢\u0006\u0006\u001a\u0004\b!\u0010\u0007R\u0012\u0010\"\u001a\u00020\u0003X\u0005¢\u0006\u0006\u001a\u0004\b#\u0010\u0007R\u001a\u0010$\u001a\u0004\u0018\u00010%X\u000f¢\u0006\f\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u000e\u0010\u0002\u001a\u00020*X\u0004¢\u0006\u0002\n\u0000R\u0012\u0010+\u001a\u00020\u0003X\u0005¢\u0006\u0006\u001a\u0004\b,\u0010\u0007R\u0012\u0010-\u001a\u00020\u0003X\u0005¢\u0006\u0006\u001a\u0004\b.\u0010\u0007R\u0012\u0010/\u001a\u00020\u0003X\u0005¢\u0006\u0006\u001a\u0004\b0\u0010\u0007R\u0012\u00101\u001a\u00020\u0003X\u0005¢\u0006\u0006\u001a\u0004\b2\u0010\u0007R\u0012\u00103\u001a\u00020\u0003X\u0005¢\u0006\u0006\u001a\u0004\b4\u0010\u0007R\u0012\u00105\u001a\u00020\u0003X\u0005¢\u0006\u0006\u001a\u0004\b6\u0010\u0007R\u0012\u00107\u001a\u00020\u0003X\u0005¢\u0006\u0006\u001a\u0004\b8\u0010\u0007¨\u0006?"}, bng = {"Lcom/iqoption/core/data/config/SandboxApiConfigData;", "Lcom/iqoption/core/data/config/ApiConfigData;", "url", "", "(Ljava/lang/String;)V", "authApi", "getAuthApi", "()Ljava/lang/String;", "avatarsApi", "getAvatarsApi", "billingApi", "getBillingApi", "blogApi", "getBlogApi", "chatApi", "getChatApi", "clusterApi", "getClusterApi", "clusterWebsocket", "getClusterWebsocket", "coreApi", "getCoreApi", "domain", "getDomain", "eventApi", "getEventApi", "featuresApi", "getFeaturesApi", "finInfoApi", "getFinInfoApi", "fsmsApi", "getFsmsApi", "gatewayApi", "getGatewayApi", "resourcesApi", "getResourcesApi", "tc", "", "getTc", "()Ljava/lang/Boolean;", "setTc", "(Ljava/lang/Boolean;)V", "Lokhttp3/HttpUrl;", "userVerificationApi", "getUserVerificationApi", "userVerifyApi", "getUserVerifyApi", "videoEduApi", "getVideoEduApi", "walletReferralApi", "getWalletReferralApi", "webApi", "getWebApi", "webRegulatedApi", "getWebRegulatedApi", "webStaticApi", "getWebStaticApi", "getFsmsUrlUrlOrNull", "path", "getResourceUrl", "getResourceUrlOrNull", "getWebStaticUrl", "Companion", "core_release"})
/* compiled from: SandboxApiConfigData.kt */
public final class j implements a {
    public static final a bcz = new a();
    private final /* synthetic */ g bcA = g.bcr;
    private final HttpUrl url;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, bng = {"Lcom/iqoption/core/data/config/SandboxApiConfigData$Companion;", "", "()V", "ENDPOINT", "", "core_release"})
    /* compiled from: SandboxApiConfigData.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    public String Vb() {
        return this.bcA.Vb();
    }

    public String Vc() {
        return this.bcA.Vc();
    }

    public String Vd() {
        return this.bcA.Vd();
    }

    public String Ve() {
        return this.bcA.Ve();
    }

    public String Vf() {
        return this.bcA.Vf();
    }

    public String Vg() {
        return this.bcA.Vg();
    }

    public String Vh() {
        return this.bcA.Vh();
    }

    public String Vi() {
        return this.bcA.Vi();
    }

    public String Vj() {
        return this.bcA.Vj();
    }

    public String Vk() {
        return this.bcA.Vk();
    }

    public String Vl() {
        return this.bcA.Vl();
    }

    public String Vm() {
        return this.bcA.Vm();
    }

    public String Vn() {
        return this.bcA.Vn();
    }

    public String fA(String str) {
        return this.bcA.fA(str);
    }

    public String fB(String str) {
        return this.bcA.fB(str);
    }

    public String fz(String str) {
        kotlin.jvm.internal.i.f(str, "path");
        return this.bcA.fz(str);
    }

    public void k(Boolean bool) {
        this.bcA.k(bool);
    }

    public j(String str) {
        kotlin.jvm.internal.i.f(str, "url");
        HttpUrl parse = HttpUrl.parse(str);
        if (parse != null) {
            kotlin.jvm.internal.i.e(parse, "HttpUrl.parse(url) ?: th…eption(\"Wrong url: $url\")");
            this.url = parse;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Wrong url: ");
        stringBuilder.append(str);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public String getDomain() {
        String host = this.url.host();
        kotlin.jvm.internal.i.e(host, "url.host()");
        return host;
    }

    public String Va() {
        String httpUrl = this.url.toString();
        kotlin.jvm.internal.i.e(httpUrl, "url.toString()");
        return httpUrl;
    }
}
