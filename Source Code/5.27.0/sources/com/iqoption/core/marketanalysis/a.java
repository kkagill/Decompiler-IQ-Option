package com.iqoption.core.marketanalysis;

import com.google.gson.JsonObject;
import com.iqoption.core.microservices.a.a.b;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0003¨\u0006\u0004"}, bng = {"getAnalyticsMeta", "Lcom/google/gson/JsonObject;", "Lcom/iqoption/core/microservices/earningscalendar/response/EarningCalendarEvent;", "Lcom/iqoption/core/microservices/economiccalendar/response/CalendarEvent;", "core_release"})
/* compiled from: CalendarAnalyticExtensions.kt */
public final class a {
    public static final JsonObject a(com.iqoption.core.microservices.b.a.a aVar) {
        kotlin.jvm.internal.i.f(aVar, "$this$getAnalyticsMeta");
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("news_id", (Number) Long.valueOf(aVar.getId()));
        jsonObject.addProperty("strength_indicator", (Number) Integer.valueOf(aVar.getImportance()));
        jsonObject.addProperty("calendar_time", (Number) Long.valueOf(aVar.adv()));
        return jsonObject;
    }

    public static final JsonObject a(b bVar) {
        kotlin.jvm.internal.i.f(bVar, "$this$getAnalyticsMeta");
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("news_id", (Number) Long.valueOf(bVar.ado()));
        boolean z = false;
        if (bVar.adn() >= ((double) null)) {
            z = true;
        }
        jsonObject.addProperty("positive", Boolean.valueOf(z));
        jsonObject.addProperty("calendar_time", (Number) Long.valueOf(bVar.getDate()));
        return jsonObject;
    }
}
