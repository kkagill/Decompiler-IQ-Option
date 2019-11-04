package com.iqoption.core.microservices.tradingengine.response.instrument;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.stream.JsonReader;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.ext.d;
import com.iqoption.core.microservices.tradingengine.response.instrument.e.c;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.i;
import kotlin.jvm.a.b;

@i(bne = {1, 1, 15}, bnf = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0005J\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002¨\u0006\f"}, bng = {"Lcom/iqoption/core/microservices/tradingengine/response/instrument/StrikeJsonParser;", "Lkotlin/Function1;", "Lcom/google/gson/stream/JsonReader;", "", "Lcom/iqoption/core/microservices/tradingengine/response/instrument/Strike;", "()V", "invoke", "reader", "parseStrikeValue", "Lcom/iqoption/core/microservices/tradingengine/response/instrument/Strike$Value;", "jValue", "Lcom/google/gson/JsonObject;", "core_release"})
/* compiled from: StrikeJsonParser.kt */
public final class f implements b<JsonReader, List<? extends e>> {
    private final c h(JsonObject jsonObject) {
        JsonObject jsonObject2 = jsonObject;
        return new c(d.b(jsonObject2, "id", null, 2, null), d.a(jsonObject2, "multiplier", 0, 2, null), d.a(jsonObject, "min_count", 0.0d, 2, null), d.b(jsonObject2, "currency", null, 2, null), d.a(jsonObject2, "cfi", null, 2, null), d.a(jsonObject2, "is_enabled", false, 2, null), d.a(jsonObject, "period", 0, 2, null));
    }

    /* renamed from: V */
    public List<e> invoke(JsonReader jsonReader) {
        JsonReader jsonReader2 = jsonReader;
        kotlin.jvm.internal.i.f(jsonReader2, "reader");
        JsonObject jsonObject = (JsonObject) com.iqoption.core.d.Um().Ez().fromJson(jsonReader2, (Type) JsonObject.class);
        InstrumentType fromServerValue = InstrumentType.Companion.fromServerValue(d.b(jsonObject, "type", null, 2, null));
        String b = d.b(jsonObject, "underlying", null, 2, null);
        JsonObject jsonObject2 = jsonObject;
        long a = d.a(jsonObject2, "expiration", 0, 2, null);
        long a2 = d.a(jsonObject2, "period", 0, 2, null);
        String str = "spot";
        boolean has = jsonObject.has(str);
        if (!has) {
            str = "strike";
        }
        Iterable<JsonElement> b2 = d.b(jsonObject, str, null, 2, null);
        Collection arrayList = new ArrayList();
        for (JsonElement jsonElement : b2) {
            Object obj;
            kotlin.jvm.internal.i.e(jsonElement, "jItem");
            if (jsonElement.isJsonObject()) {
                JsonObject asJsonObject = jsonElement.getAsJsonObject();
                kotlin.jvm.internal.i.e(asJsonObject, "jStrike");
                long a3 = d.a(asJsonObject, ConditionalUserProperty.VALUE, 0, 2, null);
                c h = h(d.b(asJsonObject, NotificationCompat.CATEGORY_CALL, null, 2, null));
                c h2 = h(d.b(asJsonObject, "put", null, 2, null));
                if (a2 == 0) {
                    Long valueOf = Long.valueOf(h.aix());
                    if ((((Number) valueOf).longValue() != 0 ? 1 : null) == null) {
                        valueOf = null;
                    }
                    a2 = valueOf != null ? valueOf.longValue() : h2.aix();
                }
                e eVar = new e(a3, h, h2, fromServerValue, b, a, a2, has);
            } else {
                obj = null;
            }
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return (List) arrayList;
    }
}
