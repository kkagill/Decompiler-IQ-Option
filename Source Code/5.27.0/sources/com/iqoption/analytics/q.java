package com.iqoption.analytics;

import com.google.common.base.d;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.i;
import com.iqoption.core.microservices.videoeducation.response.a;
import com.iqoption.core.microservices.videoeducation.response.f;
import com.iqoption.core.util.u;
import com.iqoption.dto.Event;
import com.iqoption.dto.Event.Builder;
import java.util.List;

/* compiled from: VideoEducationEventHelper */
public final class q {
    private static final d<a, Long> aqW = -$$Lambda$0ecul8RAsw2NBNDmnHDs_Kc017s.INSTANCE;
    private static final d<f, Long> aqX = -$$Lambda$Cp-WOlpMSuZC08dcnTXhBCUu7nE.INSTANCE;

    public static void O(long j) {
        EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "video-tutorials_open-section").setValue(Double.valueOf((double) j)).build());
    }

    public static Builder CB() {
        return Event.Builder(Event.CATEGORY_SCREEN_OPENED, "video-tutorials_show-section");
    }

    public static void P(long j) {
        EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "video-tutorials_filter-by-tags").setValue(Double.valueOf((double) j)).build());
    }

    public static void Q(long j) {
        EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "video-tutorials_section-search").setValue(Double.valueOf((double) j)).build());
    }

    public static void CC() {
        EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "video-tutorials_return").build());
    }

    public static void a(long j, List<a> list, List<f> list2) {
        ImmutableList sC = i.b((Iterable) list).a(aqW).sC();
        EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "video-tutorials_open-video").setValue(Double.valueOf((double) j)).setParameters(u.anp().c("section_id", sC).c("tag_id", i.b((Iterable) list2).a(aqX).sC()).anr()).build());
    }

    public static Builder b(long j, List<a> list, List<f> list2) {
        ImmutableList sC = i.b((Iterable) list).a(aqW).sC();
        return Event.Builder(Event.CATEGORY_SCREEN_OPENED, "video-tutorials_video-show").setValue(Double.valueOf((double) j)).setParameters(u.anp().c("section_id", sC).c("tag_id", i.b((Iterable) list2).a(aqX).sC()).anr());
    }

    public static void c(Builder builder) {
        if (builder != null) {
            EventManager.BS().a(builder.calcDuration().build());
        }
    }
}
