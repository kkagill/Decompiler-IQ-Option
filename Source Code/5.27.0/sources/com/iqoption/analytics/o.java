package com.iqoption.analytics;

import androidx.annotation.NonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.iqoption.app.b;
import com.iqoption.app.d;
import com.iqoption.core.microservices.tradingengine.response.active.j;
import com.iqoption.dto.Event;
import com.iqoption.dto.Event.Builder;
import com.iqoption.fragment.rightpanel.f;
import java.util.Locale;

/* compiled from: TradeRoomEventHelper */
public final class o {
    public static void a(@NonNull j jVar) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.add("balance_type_id", new JsonPrimitive(Long.valueOf(b.DG().DH())));
        jsonObject.add("instrument_type", new JsonPrimitive(Integer.valueOf(10)));
        jsonObject.add("asset_name", new JsonPrimitive(jVar.adZ()));
        jsonObject.add("is_video_watched", new JsonPrimitive(Integer.valueOf(b(jVar))));
        EventManager.BS().a(Event.Builder(Event.CATEGORY_SCROLL, "traderoom_scroll-asset-logo").setValue(Double.valueOf((double) jVar.getActiveId())).setParameters(jsonObject).build());
    }

    private static int b(j jVar) {
        if (f.a(jVar.getInstrumentId(), Locale.getDefault()) == null) {
            return 2;
        }
        return d.get(String.format("bumper_for_%s", new Object[]{jVar.getInstrumentId()}), true) ^ 1;
    }

    public static void c(@NonNull j jVar) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.add("balance_type_id", new JsonPrimitive(Long.valueOf(b.DG().DH())));
        jsonObject.add("instrument_type", new JsonPrimitive(Integer.valueOf(10)));
        jsonObject.add("asset_name", new JsonPrimitive(jVar.adZ()));
        jsonObject.add("is_video_watched", new JsonPrimitive(Integer.valueOf(b(jVar))));
        EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "traderoom_press-asset-logo").setValue(Double.valueOf((double) jVar.getActiveId())).setParameters(jsonObject).build());
    }

    public static Builder Cx() {
        return Event.Builder(Event.CATEGORY_POPUP_SERVED, "traderoom_show-asset-logo-video");
    }

    public static void a(Builder builder, @NonNull j jVar) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.add("balance_type_id", new JsonPrimitive(Long.valueOf(b.DG().DH())));
        jsonObject.add("instrument_type", new JsonPrimitive(Integer.valueOf(10)));
        jsonObject.add("asset_name", new JsonPrimitive(jVar.adZ()));
        EventManager.BS().a(builder.calcDuration().setValue(Double.valueOf((double) jVar.getActiveId())).setParameters(jsonObject).build());
    }
}
