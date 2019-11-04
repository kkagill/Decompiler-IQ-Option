package com.iqoption.analytics;

import com.iqoption.core.analytics.b;
import com.iqoption.core.analytics.c;
import com.iqoption.core.analytics.d;
import com.iqoption.core.util.u;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\b\u001a\u00020\u0006J\u0006\u0010\t\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\u0006J\u0006\u0010\u000e\u001a\u00020\u0006J\u0006\u0010\u000f\u001a\u00020\u0006J\u0006\u0010\u0010\u001a\u00020\u0006J\u0006\u0010\u0011\u001a\u00020\u0006J\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\u0013J\u0006\u0010\u0015\u001a\u00020\u0013J\u0006\u0010\u0016\u001a\u00020\u0013J\u0006\u0010\u0017\u001a\u00020\u0013J\u0006\u0010\u0018\u001a\u00020\u0006J\u0016\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001bJ\u000e\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u001bJ\u0006\u0010\u001e\u001a\u00020\u0006J\u0006\u0010\u001f\u001a\u00020\u0006J\u000e\u0010 \u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010!\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, bng = {"Lcom/iqoption/analytics/VipManagerEventHelper;", "", "()V", "analyticsEvent", "Lcom/iqoption/core/analytics/IQAnalytics;", "aboutCall", "", "aboutClose", "callCancel", "callClose", "callRequest", "success", "", "callSetTime", "chooseTimeCancel", "chooseTimeClose", "chooseTimeSelect", "chooseTimeTapTime", "createAboutShowEvent", "Lcom/iqoption/core/analytics/AnalyticsSendEvent;", "createCallShowEvent", "createEducationShowEvent", "createTimeShowEvent", "createTrainingSessionOpenEvent", "educationClose", "educationTapQuestion", "categoryId", "", "sessionId", "educationTapSection", "trainingSessionCancel", "trainingSessionClose", "trainingSessionSchedule", "trainingSessionSetTime", "app_optionXRelease"})
/* compiled from: VipManagerEventHelper.kt */
public final class r {
    private static final d aqY;
    public static final r aqZ = new r();

    static {
        d BZ = d.BZ();
        kotlin.jvm.internal.i.e(BZ, "EventUtils.instance()");
        aqY = BZ;
    }

    private r() {
    }

    public final c CD() {
        b dl = aqY.dl("vip-manager-about_show");
        kotlin.jvm.internal.i.e(dl, "analyticsEvent.createPop…\"vip-manager-about_show\")");
        return dl;
    }

    public final c CE() {
        b dl = aqY.dl("vip-manager-call_show");
        kotlin.jvm.internal.i.e(dl, "analyticsEvent.createPop…(\"vip-manager-call_show\")");
        return dl;
    }

    public final c CF() {
        b dl = aqY.dl("choose-time_show");
        kotlin.jvm.internal.i.e(dl, "analyticsEvent.createPop…Event(\"choose-time_show\")");
        return dl;
    }

    public final c CG() {
        b dl = aqY.dl("vip-manager-education_show");
        kotlin.jvm.internal.i.e(dl, "analyticsEvent.createPop…-manager-education_show\")");
        return dl;
    }

    public final c CH() {
        b dl = aqY.dl("training-session_open");
        kotlin.jvm.internal.i.e(dl, "analyticsEvent.createPop…(\"training-session_open\")");
        return dl;
    }

    public final void CI() {
        aqY.di("vip-manager-about_close");
    }

    public final void CJ() {
        aqY.di("vip-manager-about_call");
    }

    public final void CK() {
        aqY.di("vip-manager-call_close");
    }

    public final void CL() {
        aqY.di("vip-manager-call_cancel");
    }

    public final void aH(boolean z) {
        aqY.c("vip-manager-call_request-call", z ? 1.0d : 0.0d);
    }

    public final void CM() {
        aqY.di("vip-manager-call_set-time");
    }

    public final void CN() {
        aqY.di("choose-time_close");
    }

    public final void CO() {
        aqY.di("choose-time_tap-time");
    }

    public final void CP() {
        aqY.di("choose-time_select");
    }

    public final void CQ() {
        aqY.di("choose-time_cancel");
    }

    public final void R(long j) {
        String str = "vip-manager-education_tap-section";
        aqY.a(str, 0.0d, u.anp().o("section_id", Long.valueOf(j)).anr());
    }

    public final void i(long j, long j2) {
        String str = "vip-manager-education_tap-question";
        aqY.a(str, 0.0d, u.anp().o("section_id", Long.valueOf(j)).o("question_id", Long.valueOf(j2)).anr());
    }

    public final void CR() {
        aqY.di("vip-manager-education_close");
    }

    public final void CS() {
        aqY.di("training-session_close");
    }

    public final void CT() {
        aqY.di("training-session_cancel");
    }

    public final void aI(boolean z) {
        aqY.c("training-session_schedule-session", z ? 1.0d : 0.0d);
    }

    public final void CU() {
        aqY.di("training-session_set-time");
    }
}
