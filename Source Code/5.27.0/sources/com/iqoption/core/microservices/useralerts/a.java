package com.iqoption.core.microservices.useralerts;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import com.iqoption.core.connect.j;
import com.iqoption.core.d;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.microservices.useralerts.response.AssetAlertChanged;
import com.iqoption.core.microservices.useralerts.response.AssetAlertType;
import com.iqoption.core.microservices.useralerts.response.b;
import com.iqoption.dto.entity.position.Order;
import io.reactivex.e;
import io.reactivex.p;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JQ\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000f2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0002\u0010\u001aJ\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u001c\u001a\u00020\u0018J\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\b\b\u0002\u0010 \u001a\u00020\u0018J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u001e2\b\b\u0002\u0010 \u001a\u00020\u0018J)\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0002\u0010%J;\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\f2\u0006\u0010(\u001a\u00020\u000f2\b\b\u0002\u0010)\u001a\u00020\u000f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0002\u0010*JY\u0010+\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000f2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0002\u0010,R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006-"}, bng = {"Lcom/iqoption/core/microservices/useralerts/UserAlertsRequests;", "", "()V", "CMD_CREATE_ALERT", "", "CMD_DELETE_ALERT", "CMD_GET_ALERTS", "CMD_GET_TRIGGERS", "CMD_UPDATE_ALERT", "EVENT_ALERT_CHANGED", "EVENT_ALERT_TRIGGERED", "createAlert", "Lio/reactivex/Single;", "Lcom/iqoption/core/microservices/useralerts/response/AssetAlert;", "assetId", "", "instrumentType", "Lcom/iqoption/core/data/model/InstrumentType;", "type", "Lcom/iqoption/core/microservices/useralerts/response/AssetAlertType;", "value", "", "activations", "timeout", "", "deadline", "(ILcom/iqoption/core/data/model/InstrumentType;Lcom/iqoption/core/microservices/useralerts/response/AssetAlertType;DILjava/lang/Long;Ljava/lang/Long;)Lio/reactivex/Single;", "deleteAlert", "id", "getAlertChangedEvents", "Lio/reactivex/Flowable;", "Lcom/iqoption/core/microservices/useralerts/response/AssetAlertChanged;", "userId", "getAlertTriggeredEvents", "Lcom/iqoption/core/microservices/useralerts/response/AssetAlertTrigger;", "getAlerts", "Lcom/iqoption/core/microservices/useralerts/response/AssetAlert$Response;", "(Ljava/lang/Integer;Lcom/iqoption/core/microservices/useralerts/response/AssetAlertType;)Lio/reactivex/Single;", "getTriggers", "Lcom/iqoption/core/microservices/useralerts/response/AssetAlertTrigger$Response;", "limit", "offset", "(IILjava/lang/Integer;Lcom/iqoption/core/microservices/useralerts/response/AssetAlertType;)Lio/reactivex/Single;", "updateAlert", "(JILcom/iqoption/core/data/model/InstrumentType;Lcom/iqoption/core/microservices/useralerts/response/AssetAlertType;DILjava/lang/Long;Ljava/lang/Long;)Lio/reactivex/Single;", "core_release"})
/* compiled from: UserAlertsRequests.kt */
public final class a {
    public static final a bCX = new a();

    private a() {
    }

    public static /* synthetic */ p a(a aVar, int i, InstrumentType instrumentType, AssetAlertType assetAlertType, double d, int i2, Long l, Long l2, int i3, Object obj) {
        return aVar.a(i, instrumentType, assetAlertType, d, i2, (i3 & 32) != 0 ? (Long) null : l, (i3 & 64) != 0 ? (Long) null : l2);
    }

    public final p<com.iqoption.core.microservices.useralerts.response.a> a(int i, InstrumentType instrumentType, AssetAlertType assetAlertType, double d, int i2, Long l, Long l2) {
        kotlin.jvm.internal.i.f(instrumentType, "instrumentType");
        String str = "type";
        kotlin.jvm.internal.i.f(assetAlertType, str);
        String str2 = "asset_id";
        String str3 = "instrument_type";
        String str4 = "activations";
        j k = d.EV().a("create-alert", com.iqoption.core.microservices.useralerts.response.a.class).ch(false).k(str2, Integer.valueOf(i)).k(str3, instrumentType.getServerValue()).k(str, assetAlertType.getServerValue()).k(ConditionalUserProperty.VALUE, Double.valueOf(d)).k(str4, Integer.valueOf(i2));
        if (l != null) {
            l.longValue();
            k.k("timeout", l);
        }
        if (l2 != null) {
            l2.longValue();
            k.k("deadline", l2);
        }
        return k.UB();
    }

    public final p<com.iqoption.core.microservices.useralerts.response.a> bb(long j) {
        return d.EV().a("delete-alert", com.iqoption.core.microservices.useralerts.response.a.class).ch(false).k("id", Long.valueOf(j)).UB();
    }

    public static /* synthetic */ p a(a aVar, long j, int i, InstrumentType instrumentType, AssetAlertType assetAlertType, double d, int i2, Long l, Long l2, int i3, Object obj) {
        int i4 = i3;
        return aVar.a(j, i, instrumentType, assetAlertType, d, i2, (i4 & 64) != 0 ? (Long) null : l, (i4 & 128) != 0 ? (Long) null : l2);
    }

    public final p<com.iqoption.core.microservices.useralerts.response.a> a(long j, int i, InstrumentType instrumentType, AssetAlertType assetAlertType, double d, int i2, Long l, Long l2) {
        kotlin.jvm.internal.i.f(instrumentType, "instrumentType");
        String str = "type";
        kotlin.jvm.internal.i.f(assetAlertType, str);
        String str2 = "id";
        j k = d.EV().a("update-alert", com.iqoption.core.microservices.useralerts.response.a.class).ch(false).k(str2, Long.valueOf(j));
        Integer valueOf = Integer.valueOf(i);
        String str3 = "activations";
        k = k.k("asset_id", valueOf).k("instrument_type", instrumentType.getServerValue()).k(str, assetAlertType.getServerValue()).k(ConditionalUserProperty.VALUE, Double.valueOf(d)).k(str3, Integer.valueOf(i2));
        if (l != null) {
            l.longValue();
            k.k("timeout", l);
        }
        if (l2 != null) {
            l2.longValue();
            k.k("deadline", l2);
        }
        return k.UB();
    }

    public static /* synthetic */ p a(a aVar, Integer num, AssetAlertType assetAlertType, int i, Object obj) {
        if ((i & 1) != 0) {
            num = (Integer) null;
        }
        if ((i & 2) != 0) {
            assetAlertType = (AssetAlertType) null;
        }
        return aVar.a(num, assetAlertType);
    }

    public final p<com.iqoption.core.microservices.useralerts.response.a.a> a(Integer num, AssetAlertType assetAlertType) {
        j a = d.EV().a("get-alerts", com.iqoption.core.microservices.useralerts.response.a.a.class);
        if (num != null) {
            num.intValue();
            a.k("asset_id", num);
        }
        if (assetAlertType != null) {
            a.k("type", assetAlertType.getServerValue());
        }
        return a.UB();
    }

    public final p<com.iqoption.core.microservices.useralerts.response.b.a> a(int i, int i2, Integer num, AssetAlertType assetAlertType) {
        String str = "offset";
        j k = d.EV().a("get-triggers", com.iqoption.core.microservices.useralerts.response.b.a.class).k(Order.LIMIT, Integer.valueOf(i)).k(str, Integer.valueOf(i2));
        if (num != null) {
            num.intValue();
            k.k("asset_id", num);
        }
        if (assetAlertType != null) {
            k.k("type", assetAlertType.getServerValue());
        }
        return k.UB();
    }

    public final e<AssetAlertChanged> bc(long j) {
        return d.EW().b("alert-changed", AssetAlertChanged.class).i("user_id", Long.valueOf(j)).HQ();
    }

    public static /* synthetic */ e b(a aVar, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = d.EA().getUserId();
        }
        return aVar.bd(j);
    }

    public final e<b> bd(long j) {
        return d.EW().b("alert-triggered", b.class).i("user_id", Long.valueOf(j)).HQ();
    }
}
