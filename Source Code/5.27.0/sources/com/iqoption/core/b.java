package com.iqoption.core;

import android.content.Context;
import com.google.gson.Gson;
import com.iqoption.core.analytics.d;
import com.iqoption.core.data.config.ApiConfig;
import com.iqoption.core.manager.ad;
import com.iqoption.core.manager.r;
import io.reactivex.e;
import kotlin.i;
import okhttp3.OkHttpClient.Builder;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 ;2\u00020\u0001:\u0001;J\u001a\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\u00012\b\b\u0002\u00105\u001a\u00020\u000fH&J\u000e\u00106\u001a\b\u0012\u0004\u0012\u00020807H&J\u0010\u00109\u001a\u00020:2\u0006\u00104\u001a\u00020\u0001H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0012\u001a\u00020\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0012\u0010\u0016\u001a\u00020\u0017X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u001bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0012\u0010\u001e\u001a\u00020\u001fX¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0012\u0010\"\u001a\u00020#X¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0012\u0010&\u001a\u00020'X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020+8VX\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0014\u0010.\u001a\u00020/8VX\u0004¢\u0006\u0006\u001a\u0004\b0\u00101¨\u0006<"}, bng = {"Lcom/iqoption/core/Core;", "", "account", "Lcom/iqoption/core/IQAccount;", "getAccount", "()Lcom/iqoption/core/IQAccount;", "analytics", "Lcom/iqoption/core/analytics/IQAnalytics;", "getAnalytics", "()Lcom/iqoption/core/analytics/IQAnalytics;", "apiConfig", "Lcom/iqoption/core/data/config/ApiConfig;", "getApiConfig", "()Lcom/iqoption/core/data/config/ApiConfig;", "appIcon", "", "getAppIcon", "()I", "connect", "Lcom/iqoption/core/IQConnect;", "getConnect", "()Lcom/iqoption/core/IQConnect;", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "defaultActivity", "Ljava/lang/Class;", "getDefaultActivity", "()Ljava/lang/Class;", "features", "Lcom/iqoption/core/features/FeaturesProvider;", "getFeatures", "()Lcom/iqoption/core/features/FeaturesProvider;", "gson", "Lcom/google/gson/Gson;", "getGson", "()Lcom/google/gson/Gson;", "okHttpClientBuilder", "Lokhttp3/OkHttpClient$Builder;", "getOkHttpClientBuilder", "()Lokhttp3/OkHttpClient$Builder;", "sla", "Lcom/iqoption/core/analytics/sla/IQSla;", "getSla", "()Lcom/iqoption/core/analytics/sla/IQSla;", "timeServer", "Lcom/iqoption/core/TimeServer;", "getTimeServer", "()Lcom/iqoption/core/TimeServer;", "closeConnection", "", "tag", "closeDelay", "iqGuavaEvents", "Lio/reactivex/Flowable;", "Lcom/iqoption/core/event/IQEvent;", "openConnection", "Lio/reactivex/Completable;", "Companion", "core_release"})
/* compiled from: Core.kt */
public interface b {
    public static final a aZo = a.aZq;

    @i(bne = {1, 1, 15}, bnf = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0010"}, bng = {"Lcom/iqoption/core/Core$Companion;", "", "()V", "CLOSE_DELAY", "", "TAG", "", "instance", "Lcom/iqoption/core/Core;", "getInstance", "()Lcom/iqoption/core/Core;", "setInstance", "(Lcom/iqoption/core/Core;)V", "init", "", "core", "core_release"})
    /* compiled from: Core.kt */
    public static final class a {
        public static b aZp;
        static final /* synthetic */ a aZq = new a();

        private a() {
        }

        public final b Ul() {
            b bVar = aZp;
            if (bVar == null) {
                kotlin.jvm.internal.i.lG("instance");
            }
            return bVar;
        }

        public final void a(b bVar) {
            kotlin.jvm.internal.i.f(bVar, "core");
            aZp = bVar;
            ad.bkC.init();
            r.bjR.init();
        }
    }

    e EA();

    l EB();

    d EC();

    f ED();

    ApiConfig EE();

    Builder EF();

    com.iqoption.core.analytics.a.a EG();

    com.iqoption.core.features.a EH();

    e<com.iqoption.core.b.d> EI();

    int EJ();

    Class<?> EK();

    Gson Ez();

    Context getContext();
}
