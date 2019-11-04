package com.iqoption.charttools.tools;

import com.google.gson.JsonObject;
import com.iqoption.core.d;
import com.iqoption.dto.Event;
import com.iqoption.dto.Event.Builder;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0013\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\n\u0010\u0007\u001a\u00060\bR\u00020\tJ\u0016\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eJ\u0018\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\fH\u0002J\u0006\u0010\u0014\u001a\u00020\u0004J\u0006\u0010\u0015\u001a\u00020\u0004J\u0006\u0010\u0016\u001a\u00020\u0004J\u0006\u0010\u0017\u001a\u00020\u0004J\u0016\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001aJ\u000e\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\fJ\u0006\u0010\u001d\u001a\u00020\u0004J\u0016\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001aJ\u0016\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001aJ\u0006\u0010 \u001a\u00020\u0004J\u000e\u0010!\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\fJ\u000e\u0010\"\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\fJ\u000e\u0010#\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\fJ\u000e\u0010$\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\fJ\u000e\u0010%\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\fJ\u0006\u0010&\u001a\u00020\u0004J\u000e\u0010'\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\fJ\u000e\u0010(\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\fJ\u000e\u0010)\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\fJ\u0016\u0010*\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010+\u001a\u00020\fJ\u000e\u0010,\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e¨\u0006-"}, bng = {"Lcom/iqoption/charttools/tools/ToolsAnalyticsHelper;", "", "()V", "attachTemplateNameChangedHelper", "", "input", "Landroid/widget/EditText;", "createTemplateSettings", "Lcom/iqoption/dto/Event$Builder;", "Lcom/iqoption/dto/Event;", "sendAcceptInstrumentSettings", "isLine", "", "type", "", "sendDefaultInstrumentSettings", "sendDragLine", "sendSettingToggled", "name", "enabled", "sendShowActiveIndicators", "sendShowChartInstruments", "sendShowIndicators", "sendShowTemplates", "sendTemplateApply", "indicatorsCount", "", "figuresCount", "sendTemplateChartSettings", "sendTemplateClose", "sendTemplateDelete", "sendTemplateEdit", "sendTemplateSave", "sendTemplateSettingAutoScaling", "sendTemplateSettingHeikinAshi", "sendTemplateSettingLiveDeals", "sendTemplateSettingTradersMood", "sendTemplateSettingVolume", "sendTemplatesCreate", "sendToggleApplyToAllAssets", "sendToggleTradersMood", "sendToggleVolume", "sentTemplateIndicatorHide", "hidden", "sentTemplateIndicatorRemove", "app_optionXRelease"})
/* compiled from: ToolsAnalyticsHelper.kt */
public final class e {
    public static final e aLA = new e();

    private e() {
    }

    public final void PF() {
        d.Um().EC().di("tranderoom_show-chart-instruments");
    }

    public final void PG() {
        d.Um().EC().di("chart-instruments_show-indicators");
    }

    public final void PH() {
        d.Um().EC().di("chart-instruments_show-active-indicators");
    }

    public final void bZ(boolean z) {
        d.Um().EC().c("chart-instruments_traders-mood", z ? 1.0d : 0.0d);
    }

    public final void ca(boolean z) {
        d.Um().EC().c("chart-instruments_indicators-to-all-assets", z ? 1.0d : 0.0d);
    }

    public final void cb(boolean z) {
        d.Um().EC().c("chart-instruments_volune", z ? 1.0d : 0.0d);
    }

    public final void eT(String str) {
        kotlin.jvm.internal.i.f(str, "type");
        com.iqoption.core.analytics.d EC = d.Um().EC();
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("line_type", str);
        EC.b("chart_drag-line", jsonObject);
    }

    public final void PI() {
        d.Um().EC().di("chart-instruments_show-templates");
    }

    public final Builder PJ() {
        Builder Builder = Event.Builder(Event.CATEGORY_POPUP_SERVED, "chart-instruments_templates-settings");
        kotlin.jvm.internal.i.e(Builder, "Event.Builder(Event.CATE…ents_templates-settings\")");
        return Builder;
    }

    public final void ae(int i, int i2) {
        com.iqoption.core.analytics.d EC = d.Um().EC();
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("indicators_count", (Number) Integer.valueOf(i));
        jsonObject.addProperty("lines_count", (Number) Integer.valueOf(i2));
        EC.a("chart-instruments_templates-apply", jsonObject);
    }

    public final void ac(int i, int i2) {
        com.iqoption.core.analytics.d EC = d.Um().EC();
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("indicators_count", (Number) Integer.valueOf(i));
        jsonObject.addProperty("lines_count", (Number) Integer.valueOf(i2));
        EC.a("chart-instruments_templates-delete", jsonObject);
    }

    public final void af(int i, int i2) {
        com.iqoption.core.analytics.d EC = d.Um().EC();
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("indicators_count", (Number) Integer.valueOf(i));
        jsonObject.addProperty("lines_count", (Number) Integer.valueOf(i2));
        EC.a("chart-instruments_templates-edit", jsonObject);
    }
}
