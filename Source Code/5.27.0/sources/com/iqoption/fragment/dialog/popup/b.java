package com.iqoption.fragment.dialog.popup;

import com.google.gson.JsonObject;
import com.iqoption.core.analytics.d;
import com.iqoption.core.microservices.popupserver.response.a;
import com.iqoption.dto.Event;
import kotlin.i;
import kotlin.j;

@i(bne = {1, 1, 15}, bnf = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\fJ\u0016\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\f¨\u0006\u0012"}, bng = {"Lcom/iqoption/fragment/dialog/popup/PopupEventHelper;", "", "()V", "createPopupServed", "Lcom/iqoption/core/analytics/AnalyticsPropertyEvent;", "popup", "Lcom/iqoption/core/microservices/popupserver/response/Popup;", "createVideoAnalyticsData", "Lcom/iqoption/traderoom/AnalyticsData;", "id", "", "videoUrl", "", "sendActionButtonEvent", "", "action", "sendOpenLinkEvent", "url", "app_optionXRelease"})
/* compiled from: PopupEventHelper.kt */
public final class b {
    public static final b deN = new b();

    private b() {
    }

    public final com.iqoption.core.analytics.b f(a aVar) {
        kotlin.jvm.internal.i.f(aVar, "popup");
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("type", aVar.agk().toString());
        jsonObject.addProperty("category", aVar.agi().toString());
        d EC = com.iqoption.core.d.Um().EC();
        Double valueOf = Double.valueOf((double) aVar.getId().longValue());
        com.iqoption.core.analytics.b a = EC.a(Event.CATEGORY_POPUP_SERVED, "pop-up_show", valueOf, jsonObject);
        kotlin.jvm.internal.i.e(a, "core.analytics.createEve…,\n                params)");
        return a;
    }

    public final void k(long j, String str) {
        kotlin.jvm.internal.i.f(str, "action");
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("action_type", str);
        d EC = com.iqoption.core.d.Um().EC();
        Double valueOf = Double.valueOf((double) j);
        EC.a(Event.CATEGORY_BUTTON_PRESSED, "pop-up_pressed-button", valueOf, jsonObject).Cc();
    }

    public final void l(long j, String str) {
        kotlin.jvm.internal.i.f(str, "url");
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("link", str);
        d EC = com.iqoption.core.d.Um().EC();
        Double valueOf = Double.valueOf((double) j);
        EC.a(Event.CATEGORY_BUTTON_PRESSED, "pop-up_open-link", valueOf, jsonObject).Cc();
    }

    public final com.iqoption.o.a m(long j, String str) {
        kotlin.jvm.internal.i.f(str, "videoUrl");
        return new com.iqoption.o.a("pop-up_play-video", (double) j, ae.m(j.x("video_url", str)));
    }
}
