package com.iqoption.core.microservices.usersettings;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import com.iqoption.core.d;
import com.iqoption.core.microservices.usersettings.b.b;
import io.reactivex.b.g;
import io.reactivex.e;
import io.reactivex.p;
import java.util.List;
import java.util.Map;
import kotlin.i;
import kotlin.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\tJ\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\tH\u0002J\u001a\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u00102\u0006\u0010\u0013\u001a\u00020\fJ\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u00152\u0006\u0010\u0013\u001a\u00020\fJ!\u0010\u0016\u001a\u00020\u0017\"\u0004\b\u0000\u0010\u00182\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u0013\u001a\u0002H\u0018¢\u0006\u0002\u0010\u0019R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, bng = {"Lcom/iqoption/core/microservices/usersettings/UserSettingsRequests;", "", "()V", "CMD_GET_USER_SETTINGS", "", "CMD_UPDATE_USER_SETTINGS", "EVENT_USER_SETTINGS_CHANGED", "versionMap", "", "Lcom/iqoption/core/microservices/usersettings/SettingsType;", "", "createConfig", "Lcom/iqoption/core/microservices/usersettings/request/GetSetting;", "settingsType", "getSettingVersion", "getUserSettings", "Lio/reactivex/Single;", "", "Lcom/iqoption/core/microservices/usersettings/response/UserSettingsConfig;", "config", "getUserSettingsUpdates", "Lio/reactivex/Flowable;", "updateUserSettings", "Lio/reactivex/Completable;", "T", "(Lcom/iqoption/core/microservices/usersettings/SettingsType;Ljava/lang/Object;)Lio/reactivex/Completable;", "core_release"})
/* compiled from: UserSettingsRequests.kt */
public final class a {
    private static final Map<SettingsType, Integer> bDn = ae.m(j.x(SettingsType.PRIVACY_SETTINGS, Integer.valueOf(1)));
    public static final a bDo = new a();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "Lcom/iqoption/core/microservices/usersettings/response/UserSettingsConfig;", "it", "Lcom/iqoption/core/microservices/usersettings/response/UserSettingsResponse;", "apply"})
    /* compiled from: UserSettingsRequests.kt */
    static final class a<T, R> implements g<T, R> {
        public static final a bDp = new a();

        a() {
        }

        /* renamed from: a */
        public final List<com.iqoption.core.microservices.usersettings.b.a> apply(b bVar) {
            kotlin.jvm.internal.i.f(bVar, "it");
            return bVar.ajh();
        }
    }

    private a() {
    }

    private final int b(SettingsType settingsType) {
        Integer num = (Integer) bDn.get(settingsType);
        return num != null ? num.intValue() : 1;
    }

    public final com.iqoption.core.microservices.usersettings.a.a c(SettingsType settingsType) {
        kotlin.jvm.internal.i.f(settingsType, "settingsType");
        String serverValue = settingsType.getServerValue();
        if (serverValue == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        return new com.iqoption.core.microservices.usersettings.a.a(serverValue, b(settingsType));
    }

    public final p<List<com.iqoption.core.microservices.usersettings.b.a>> a(com.iqoption.core.microservices.usersettings.a.a aVar) {
        kotlin.jvm.internal.i.f(aVar, "config");
        p t = d.EV().a("get-user-settings", b.class).k("configs", d.Um().Ez().toJsonTree(l.listOf(aVar))).fp("2.0").UB().t(a.bDp);
        kotlin.jvm.internal.i.e(t, "requestBuilderFactory\n  …      .map { it.configs }");
        return t;
    }

    public final e<com.iqoption.core.microservices.usersettings.b.a> b(com.iqoption.core.microservices.usersettings.a.a aVar) {
        kotlin.jvm.internal.i.f(aVar, "config");
        String str = "user_id";
        return d.EW().b("user-settings-changed", com.iqoption.core.microservices.usersettings.b.a.class).i(str, Long.valueOf(d.EA().getUserId())).i(ConditionalUserProperty.NAME, aVar.getName()).ec("2.0").HQ();
    }

    public final <T> io.reactivex.a a(SettingsType settingsType, T t) {
        kotlin.jvm.internal.i.f(settingsType, "settingsType");
        String str = "user_id";
        String str2 = "version";
        io.reactivex.a blf = d.EV().a("update-user-settings", com.iqoption.core.connect.a.Uv()).fp("1.0").k(ConditionalUserProperty.NAME, settingsType.getServerValue()).k(str, Long.valueOf(d.EA().getUserId())).k(str2, Integer.valueOf(b(settingsType))).k("config", d.Um().Ez().toJsonTree(t)).UB().blf();
        kotlin.jvm.internal.i.e(blf, "requestBuilderFactory.cr…         .ignoreElement()");
        return blf;
    }
}
