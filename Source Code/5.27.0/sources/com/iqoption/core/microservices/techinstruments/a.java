package com.iqoption.core.microservices.techinstruments;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.iqoption.core.microservices.techinstruments.a.c;
import com.iqoption.core.microservices.techinstruments.a.e;
import com.iqoption.dto.entity.position.Order;
import io.reactivex.p;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.d;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JD\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0016\u001a\u00020\u00042\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001a2\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001aJ\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fJ'\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u00142\b\b\u0002\u0010\"\u001a\u00020\u001f2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u001f¢\u0006\u0002\u0010$J\u0014\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u001e\u001a\u00020\u001fJ\u0012\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u001a0\u0014JP\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u001e\u001a\u00020\u001f2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001a2\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001aR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R!\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8FX\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010¨\u0006("}, bng = {"Lcom/iqoption/core/microservices/techinstruments/TechInstrumentsRequests;", "", "()V", "CMD_ADD_TEMPLATE", "", "CMD_DELETE_TEMPLATE", "CMD_GET_STANDARD_LIBRARY", "CMD_GET_TEMPLATE", "CMD_GET_TEMPLATES", "CMD_REPLACE_ALL_TEMPLATES", "CMD_UPDATE_TEMPLATE", "EVENT_MODIFIED_TEMPLATES", "templateUpdates", "Lio/reactivex/Flowable;", "Lcom/iqoption/core/microservices/techinstruments/response/ModifiedTemplates;", "getTemplateUpdates", "()Lio/reactivex/Flowable;", "templateUpdates$delegate", "Lkotlin/Lazy;", "addTemplate", "Lio/reactivex/Single;", "Lcom/iqoption/core/microservices/techinstruments/response/Template;", "name", "chart", "Lcom/google/gson/JsonObject;", "indicators", "", "figures", "deleteTemplate", "Lio/reactivex/Completable;", "id", "", "getStandardLibrary", "Lcom/iqoption/core/microservices/techinstruments/response/StandardLibrary;", "version", "runtimeVersion", "(JLjava/lang/Long;)Lio/reactivex/Single;", "getTemplate", "getTemplates", "updateTemplate", "core_release"})
/* compiled from: TechInstrumentsRequests.kt */
public final class a {
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(a.class), "templateUpdates", "getTemplateUpdates()Lio/reactivex/Flowable;"))};
    private static final d byM = g.c(TechInstrumentsRequests$templateUpdates$2.byP);
    public static final a byN = new a();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0003"}, bng = {"com/iqoption/core/ext/GsonExt$typeOf$1", "Lcom/google/gson/reflect/TypeToken;", "core_release", "com/iqoption/core/microservices/techinstruments/TechInstrumentsRequests$create$$inlined$typeOf$1"})
    /* compiled from: GsonExtensions.kt */
    public static final class a extends TypeToken<List<? extends e>> {
    }

    public final io.reactivex.e<c> ahq() {
        d dVar = byM;
        j jVar = anY[0];
        return (io.reactivex.e) dVar.getValue();
    }

    private a() {
    }

    public final p<List<e>> ahp() {
        com.iqoption.core.connect.k EV = com.iqoption.core.d.EV();
        Type type = new a().getType();
        kotlin.jvm.internal.i.e(type, "object : TypeToken<T>() {}.type");
        return EV.a("get-templates", type).k(Order.LIMIT, Integer.valueOf(100)).UB();
    }

    public final p<e> a(String str, JsonObject jsonObject, List<JsonObject> list, List<JsonObject> list2) {
        String str2 = ConditionalUserProperty.NAME;
        kotlin.jvm.internal.i.f(str, str2);
        return com.iqoption.core.d.EV().a("add-template", e.class).k(str2, str).k("chart", jsonObject).k("indicators", list).k("figures", list2).UB();
    }

    public final p<e> a(long j, String str, JsonObject jsonObject, List<JsonObject> list, List<JsonObject> list2) {
        return com.iqoption.core.d.EV().a("update-template", e.class).k("id", Long.valueOf(j)).k(ConditionalUserProperty.NAME, str).k("chart", jsonObject).k("indicators", list).k("figures", list2).UB();
    }

    public final io.reactivex.a ax(long j) {
        String str = "template_id";
        io.reactivex.a blf = com.iqoption.core.d.EV().a("delete-template", (b) TechInstrumentsRequests$deleteTemplate$1.byO).k(str, Long.valueOf(j)).UB().blf();
        kotlin.jvm.internal.i.e(blf, "requestBuilderFactory\n  …         .ignoreElement()");
        return blf;
    }

    public final p<com.iqoption.core.microservices.techinstruments.a.d> a(long j, Long l) {
        return com.iqoption.core.d.EV().a("get-standard-library", com.iqoption.core.microservices.techinstruments.a.d.class).fp("3.0").k("version", Long.valueOf(j)).k("runtime_version", l).UB();
    }
}
