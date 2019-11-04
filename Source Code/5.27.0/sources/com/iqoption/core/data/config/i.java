package com.iqoption.core.data.config;

import com.iqoption.core.microservices.core.response.b;
import com.iqoption.dto.entity.position.Position;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;
import okhttp3.HttpUrl;

@kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b.\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0000\u0018\u00002\u00020\u0001:\u0001IB'\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0001\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\nR\u0014\u0010\u000f\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\nR\u0014\u0010\u0017\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\nR\u0014\u0010\u0019\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\nR\u0014\u0010\u001b\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\nR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\n\"\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0004\u001a\u00020\u0001X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001b\u0010$\u001a\u00020\u00038VX\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b%\u0010\nR\u0014\u0010(\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\nR\u0014\u0010*\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b+\u0010\nR\u0014\u0010,\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b-\u0010\nR\u0014\u0010.\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b/\u0010\nR\u0014\u00100\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b1\u0010\nR\u0014\u00102\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b3\u0010\nR(\u00106\u001a\u0004\u0018\u0001052\b\u00104\u001a\u0004\u0018\u0001058V@VX\u000e¢\u0006\f\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u0014\u0010;\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b<\u0010\nR\u0014\u0010=\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b>\u0010\nR\u0014\u0010?\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b@\u0010\nR\u0014\u0010A\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\bB\u0010\nR\u0014\u0010C\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\bD\u0010\nR\u0014\u0010E\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\bF\u0010\nR\u0014\u0010G\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\bH\u0010\n¨\u0006J"}, bng = {"Lcom/iqoption/core/data/config/RealApiConfigData;", "Lcom/iqoption/core/data/config/ApiConfigData;", "coreUrl", "", "default", "cfg", "Lcom/iqoption/core/microservices/core/response/Configuration;", "(Ljava/lang/String;Lcom/iqoption/core/data/config/ApiConfigData;Lcom/iqoption/core/microservices/core/response/Configuration;)V", "authApi", "getAuthApi", "()Ljava/lang/String;", "avatarsApi", "getAvatarsApi", "billingApi", "getBillingApi", "blogApi", "getBlogApi", "getCfg", "()Lcom/iqoption/core/microservices/core/response/Configuration;", "setCfg", "(Lcom/iqoption/core/microservices/core/response/Configuration;)V", "chatApi", "getChatApi", "clusterApi", "getClusterApi", "clusterWebsocket", "getClusterWebsocket", "coreApi", "getCoreApi", "getCoreUrl", "setCoreUrl", "(Ljava/lang/String;)V", "getDefault", "()Lcom/iqoption/core/data/config/ApiConfigData;", "setDefault", "(Lcom/iqoption/core/data/config/ApiConfigData;)V", "domain", "getDomain", "domain$delegate", "Lcom/iqoption/core/data/config/RealApiConfigData$DomainDelegate;", "eventApi", "getEventApi", "featuresApi", "getFeaturesApi", "finInfoApi", "getFinInfoApi", "fsmsApi", "getFsmsApi", "gatewayApi", "getGatewayApi", "resourcesApi", "getResourcesApi", "value", "", "tc", "getTc", "()Ljava/lang/Boolean;", "setTc", "(Ljava/lang/Boolean;)V", "userVerificationApi", "getUserVerificationApi", "userVerifyApi", "getUserVerifyApi", "videoEduApi", "getVideoEduApi", "walletReferralApi", "getWalletReferralApi", "webApi", "getWebApi", "webRegulatedApi", "getWebRegulatedApi", "webStaticApi", "getWebStaticApi", "DomainDelegate", "core_release"})
/* compiled from: RealApiConfigData.kt */
public final class i implements a {
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(i.class), "domain", "getDomain()Ljava/lang/String;"))};
    private final a bct;
    private volatile String bcu;
    private volatile a bcv;
    private volatile b bcw;

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u001d\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00022\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\nH\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, bng = {"Lcom/iqoption/core/data/config/RealApiConfigData$DomainDelegate;", "Lkotlin/properties/ReadOnlyProperty;", "", "", "(Lcom/iqoption/core/data/config/RealApiConfigData;)V", "domain", "lastCoreApi", "getValue", "thisRef", "property", "Lkotlin/reflect/KProperty;", "core_release"})
    /* compiled from: RealApiConfigData.kt */
    private final class a {
        private String bcx;
        private String domain;

        public String a(Object obj, j<?> jVar) {
            kotlin.jvm.internal.i.f(obj, "thisRef");
            kotlin.jvm.internal.i.f(jVar, "property");
            if ((kotlin.jvm.internal.i.y(this.bcx, i.this.Va()) ^ 1) != 0) {
                HttpUrl parse = HttpUrl.parse(i.this.Va());
                this.domain = parse != null ? parse.host() : null;
                this.bcx = i.this.Va();
            }
            String str = this.domain;
            return str != null ? str : i.this.VE().getDomain();
        }
    }

    public i() {
        this(null, null, null, 7, null);
    }

    public String getDomain() {
        return this.bct.a(this, anY[0]);
    }

    public i(String str, a aVar, b bVar) {
        kotlin.jvm.internal.i.f(aVar, Position.CLOSE_REASON_DEFAULT);
        this.bcu = str;
        this.bcv = aVar;
        this.bcw = bVar;
        this.bct = new a();
    }

    public String fA(String str) {
        return com.iqoption.core.data.config.a.a.b(this, str);
    }

    public String fB(String str) {
        return com.iqoption.core.data.config.a.a.c(this, str);
    }

    public String fz(String str) {
        kotlin.jvm.internal.i.f(str, "path");
        return com.iqoption.core.data.config.a.a.a(this, str);
    }

    public /* synthetic */ i(String str, a aVar, b bVar, int i, f fVar) {
        if ((i & 1) != 0) {
            str = (String) null;
        }
        if ((i & 2) != 0) {
            aVar = h.bcs;
        }
        if ((i & 4) != 0) {
            bVar = (b) null;
        }
        this(str, aVar, bVar);
    }

    public final void fF(String str) {
        this.bcu = str;
    }

    public final a VE() {
        return this.bcv;
    }

    public final void b(a aVar) {
        kotlin.jvm.internal.i.f(aVar, "<set-?>");
        this.bcv = aVar;
    }

    public final void d(b bVar) {
        this.bcw = bVar;
    }

    public String Va() {
        String str = this.bcu;
        if (str != null) {
            str = b.fC(str);
            if (str != null) {
                return str;
            }
        }
        return this.bcv.Va();
    }

    public void k(Boolean bool) {
        b bVar = this.bcw;
        if (bVar != null) {
            bVar.k(bool);
        }
    }

    public String Vb() {
        b bVar = this.bcw;
        if (bVar != null) {
            com.iqoption.core.microservices.core.response.a adc = bVar.adc();
            if (adc != null) {
                String url = adc.getUrl();
                if (url != null) {
                    url = b.fC(url);
                    if (url != null) {
                        return url;
                    }
                }
            }
        }
        return this.bcv.Vb();
    }

    public String Vc() {
        b bVar = this.bcw;
        if (bVar != null) {
            com.iqoption.core.microservices.core.response.a adb = bVar.adb();
            if (adb != null) {
                String url = adb.getUrl();
                if (url != null) {
                    url = b.fC(url);
                    if (url != null) {
                        return url;
                    }
                }
            }
        }
        return this.bcv.Vc();
    }

    public String Vd() {
        b bVar = this.bcw;
        if (bVar != null) {
            String Vd = bVar.Vd();
            if (Vd != null) {
                Vd = b.fC(Vd);
                if (Vd != null) {
                    return Vd;
                }
            }
        }
        return this.bcv.Vd();
    }

    public String Ve() {
        b bVar = this.bcw;
        if (bVar != null) {
            String Ve = bVar.Ve();
            if (Ve != null) {
                Ve = b.fC(Ve);
                if (Ve != null) {
                    return Ve;
                }
            }
        }
        return this.bcv.Ve();
    }

    public String Vf() {
        b bVar = this.bcw;
        if (bVar != null) {
            String Vf = bVar.Vf();
            if (Vf != null) {
                Vf = b.fC(Vf);
                if (Vf != null) {
                    return Vf;
                }
            }
        }
        return this.bcv.Vf();
    }

    public String Vg() {
        b bVar = this.bcw;
        if (bVar != null) {
            String Vg = bVar.Vg();
            if (Vg != null) {
                Vg = b.fC(Vg);
                if (Vg != null) {
                    return Vg;
                }
            }
        }
        return this.bcv.Vg();
    }

    public String Vh() {
        b bVar = this.bcw;
        if (bVar != null) {
            String Vh = bVar.Vh();
            if (Vh != null) {
                Vh = b.fC(Vh);
                if (Vh != null) {
                    return Vh;
                }
            }
        }
        return this.bcv.Vh();
    }

    public String Vi() {
        b bVar = this.bcw;
        if (bVar != null) {
            String Vi = bVar.Vi();
            if (Vi != null) {
                Vi = b.fC(Vi);
                if (Vi != null) {
                    return Vi;
                }
            }
        }
        return this.bcv.Vi();
    }

    public String Vj() {
        b bVar = this.bcw;
        if (bVar != null) {
            String Vj = bVar.Vj();
            if (Vj != null) {
                Vj = b.fC(Vj);
                if (Vj != null) {
                    return Vj;
                }
            }
        }
        return this.bcv.Vj();
    }

    public String Vk() {
        b bVar = this.bcw;
        if (bVar != null) {
            String Vk = bVar.Vk();
            if (Vk != null) {
                Vk = b.fC(Vk);
                if (Vk != null) {
                    return Vk;
                }
            }
        }
        return this.bcv.Vk();
    }

    public String Vl() {
        b bVar = this.bcw;
        if (bVar != null) {
            String Vl = bVar.Vl();
            if (Vl != null) {
                Vl = b.fC(Vl);
                if (Vl != null) {
                    return Vl;
                }
            }
        }
        return this.bcv.Vl();
    }

    public String Vm() {
        b bVar = this.bcw;
        if (bVar != null) {
            String Vm = bVar.Vm();
            if (Vm != null) {
                Vm = b.fC(Vm);
                if (Vm != null) {
                    return Vm;
                }
            }
        }
        return this.bcv.Vm();
    }

    public String Vn() {
        b bVar = this.bcw;
        if (bVar != null) {
            String Vn = bVar.Vn();
            if (Vn != null) {
                Vn = b.fC(Vn);
                if (Vn != null) {
                    return Vn;
                }
            }
        }
        return this.bcv.Vn();
    }
}
