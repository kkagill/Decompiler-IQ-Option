package com.iqoption.charttools.a;

import android.widget.EditText;
import com.google.gson.JsonObject;
import com.iqoption.core.d;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0011\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0006\u0010\f\u001a\u00020\u0004J\u0016\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fJ\u000e\u0010\u0011\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\u0012\u001a\u00020\u0004J\u0016\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fJ\u0016\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fJ\u0006\u0010\u0015\u001a\u00020\u0004J\u000e\u0010\u0016\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\u0017\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\u0018\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\u0019\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\u001a\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\u001b\u001a\u00020\u0004J\u0016\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u000bJ\u000e\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\t¨\u0006 "}, bng = {"Lcom/iqoption/charttools/analytics/TemplatesAnalyticsHelper;", "", "()V", "attachTemplateNameChangedHelper", "", "input", "Landroid/widget/EditText;", "sendSettingToggled", "name", "", "enabled", "", "sendShowTemplates", "sendTemplateApply", "indicatorsCount", "", "figuresCount", "sendTemplateChartSettings", "sendTemplateClose", "sendTemplateDelete", "sendTemplateEdit", "sendTemplateSave", "sendTemplateSettingAutoScaling", "sendTemplateSettingHeikinAshi", "sendTemplateSettingLiveDeals", "sendTemplateSettingTradersMood", "sendTemplateSettingVolume", "sendTemplatesCreate", "sentTemplateIndicatorHide", "type", "hidden", "sentTemplateIndicatorRemove", "techtools_release"})
/* compiled from: TemplatesAnalyticsHelper.kt */
public final class a {
    public static final a aEw = new a();

    private a() {
    }

    public final void b(EditText editText) {
        kotlin.jvm.internal.i.f(editText, "input");
        com.iqoption.core.analytics.b.a aVar = new com.iqoption.core.analytics.b.a(editText, "chart-instruments_templates-name");
    }

    private final void l(String str, boolean z) {
        d.Um().EC().c(str, z ? 1.0d : 0.0d);
    }

    public final void bL(boolean z) {
        l("chart-instruments_templates-chart-settings", z);
    }

    public final void bM(boolean z) {
        l("chart-instruments_templates-chart-settings-heikin-ashi", z);
    }

    public final void bN(boolean z) {
        l("chart-instruments_templates-settings-auto-scaling", z);
    }

    public final void bO(boolean z) {
        l("chart-instruments_templates-settings-traders-mood", z);
    }

    public final void bP(boolean z) {
        l("chart-instruments_templates-settings-live-deals", z);
    }

    public final void bQ(boolean z) {
        l("chart-instruments_templates-settings-volume", z);
    }

    public final void eJ(String str) {
        kotlin.jvm.internal.i.f(str, "type");
        com.iqoption.core.analytics.d EC = d.Um().EC();
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("indicator_type", str);
        EC.a("chart-instruments_templates-indicator-remove", jsonObject);
    }

    public final void m(String str, boolean z) {
        kotlin.jvm.internal.i.f(str, "type");
        com.iqoption.core.analytics.d EC = d.Um().EC();
        double d = z ? 1.0d : 0.0d;
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("indicator_type", str);
        EC.a("chart-instruments_templates-indicator-hide", d, jsonObject);
    }

    public final void MA() {
        d.Um().EC().di("chart-instruments_templates-close");
    }

    public final void MB() {
        d.Um().EC().di("chart-instruments_templates-save");
    }

    public final void ac(int i, int i2) {
        com.iqoption.core.analytics.d EC = d.Um().EC();
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("indicators_count", (Number) Integer.valueOf(i));
        jsonObject.addProperty("lines_count", (Number) Integer.valueOf(i2));
        EC.a("chart-instruments_templates-delete", jsonObject);
    }
}
