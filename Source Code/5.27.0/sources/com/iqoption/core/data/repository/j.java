package com.iqoption.core.data.repository;

import androidx.annotation.UiThread;
import com.google.common.base.Optional;
import com.iqoption.core.manager.ac;
import com.iqoption.core.microservices.usersettings.SettingsType;
import com.iqoption.core.util.z;
import io.reactivex.b.g;
import io.reactivex.e;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.TypeCastException;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J,\u0010\f\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0004\u0012\u00020\n0\bj\b\u0012\u0004\u0012\u00020\n`\u000b2\u0006\u0010\r\u001a\u00020\u0007H\u0002J0\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00110\u00100\u000f\"\u0004\b\u0000\u0010\u00112\u0006\u0010\r\u001a\u00020\u00072\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00110\u0013H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R6\u0010\u0005\u001a*\u0012\u0004\u0012\u00020\u0007\u0012 \u0012\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0004\u0012\u00020\n0\bj\b\u0012\u0004\u0012\u00020\n`\u000b0\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, bng = {"Lcom/iqoption/core/data/repository/UserSettingsRepository;", "", "()V", "DISPOSE_DELAY_MILLIS", "", "settingStreams", "", "Lcom/iqoption/core/microservices/usersettings/SettingsType;", "Lcom/iqoption/core/rx/livestream/RxLiveStreamSupplier;", "Lcom/iqoption/core/util/Optional;", "Lcom/iqoption/core/microservices/usersettings/response/UserSettingsConfig;", "Lcom/iqoption/core/rx/livestream/OptionalLiveStreamSupplier;", "createUserSettingStream", "settingsType", "observeUserSetting", "Lio/reactivex/Flowable;", "Lcom/google/common/base/Optional;", "T", "configClass", "Ljava/lang/Class;", "core_release"})
/* compiled from: UserSettingsRepository.kt */
public final class j {
    private static final Map<SettingsType, com.iqoption.core.rx.a.a<z<com.iqoption.core.microservices.usersettings.b.a>, com.iqoption.core.microservices.usersettings.b.a>> bff = new LinkedHashMap();
    public static final j bfg = new j();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "Lcom/iqoption/core/microservices/usersettings/response/UserSettingsConfig;", "settings", "", "apply"})
    /* compiled from: UserSettingsRepository.kt */
    static final class a<T, R> implements g<T, R> {
        final /* synthetic */ SettingsType bfh;

        a(SettingsType settingsType) {
            this.bfh = settingsType;
        }

        /* renamed from: aw */
        public final com.iqoption.core.microservices.usersettings.b.a apply(List<com.iqoption.core.microservices.usersettings.b.a> list) {
            kotlin.jvm.internal.i.f(list, "settings");
            for (Object next : list) {
                if (kotlin.jvm.internal.i.y(((com.iqoption.core.microservices.usersettings.b.a) next).getName(), this.bfh.getServerValue())) {
                    break;
                }
            }
            Object next2 = null;
            if (next2 == null) {
                kotlin.jvm.internal.i.bnJ();
            }
            return (com.iqoption.core.microservices.usersettings.b.a) next2;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u0001H\u0002H\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u0001H\u0002H\u0002\u0018\u00010\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "Lcom/google/common/base/Optional;", "T", "kotlin.jvm.PlatformType", "config", "Lcom/iqoption/core/microservices/usersettings/response/UserSettingsConfig;", "apply"})
    /* compiled from: UserSettingsRepository.kt */
    static final class b<T, R> implements g<T, R> {
        final /* synthetic */ Class bfi;

        b(Class cls) {
            this.bfi = cls;
        }

        /* renamed from: a */
        public final Optional<T> apply(com.iqoption.core.microservices.usersettings.b.a aVar) {
            kotlin.jvm.internal.i.f(aVar, "config");
            return Optional.an(aVar.x(this.bfi));
        }
    }

    private j() {
    }

    @UiThread
    public final <T> e<Optional<T>> a(SettingsType settingsType, Class<T> cls) {
        kotlin.jvm.internal.i.f(settingsType, "settingsType");
        kotlin.jvm.internal.i.f(cls, "configClass");
        if (((com.iqoption.core.rx.a.a) bff.get(settingsType)) == null) {
            bff.put(settingsType, a(settingsType));
        }
        com.iqoption.core.rx.a.a aVar = (com.iqoption.core.rx.a.a) bff.get(settingsType);
        e ako = aVar != null ? aVar.ako() : null;
        if (ako != null) {
            ako = ako.g(new b(cls));
            kotlin.jvm.internal.i.e(ako, "(settingStreams[settings….asConfig(configClass)) }");
            return ako;
        }
        throw new TypeCastException("null cannot be cast to non-null type io.reactivex.Flowable<com.iqoption.core.microservices.usersettings.response.UserSettingsConfig>");
    }

    private final com.iqoption.core.rx.a.a<z<com.iqoption.core.microservices.usersettings.b.a>, com.iqoption.core.microservices.usersettings.b.a> a(SettingsType settingsType) {
        com.iqoption.core.microservices.usersettings.a.a c = com.iqoption.core.microservices.usersettings.a.bDo.c(settingsType);
        e g = com.iqoption.core.microservices.usersettings.a.bDo.a(c).bkO().g(new a(settingsType));
        kotlin.jvm.internal.i.e(g, "UserSettingsRequests.get…ngsType.serverValue }!! }");
        e b = com.iqoption.core.microservices.usersettings.a.bDo.b(c);
        ac acVar = ac.bkp;
        e c2 = g.c((org.a.b) b);
        kotlin.jvm.internal.i.e(c2, "init.concatWith(updates)");
        return acVar.a("User Settings", c2, 0, TimeUnit.MILLISECONDS);
    }
}
