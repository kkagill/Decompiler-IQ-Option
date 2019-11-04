package com.iqoption.analytics;

import android.text.TextUtils;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.analytics.Tracker;
import com.google.common.util.concurrent.o;
import com.google.common.util.concurrent.t;
import com.google.gson.JsonObject;
import com.iqoption.app.IQApp;
import com.iqoption.core.analytics.b;
import com.iqoption.core.util.u;
import com.iqoption.dto.Event;
import com.iqoption.dto.Event.Builder;
import com.iqoption.util.v;
import io.reactivex.a;
import java.net.SocketTimeoutException;
import java.util.Map;

/* compiled from: EventUtils */
public final class d implements com.iqoption.core.analytics.d {
    private static final String TAG = "com.iqoption.analytics.d";
    private static d aqN;

    public static d BZ() {
        if (aqN == null) {
            synchronized (d.class) {
                if (aqN == null) {
                    aqN = new d();
                }
            }
        }
        return aqN;
    }

    private d() {
    }

    public void di(String str) {
        d(str, 0.0d).Cc();
    }

    public void a(String str, JsonObject jsonObject) {
        b(str, 0.0d, jsonObject).Cc();
    }

    public void c(String str, double d) {
        d(str, d).Cc();
    }

    public void a(String str, double d, JsonObject jsonObject) {
        b(str, d, jsonObject).Cc();
    }

    public b dj(String str) {
        return d(str, 0.0d);
    }

    public b d(String str, double d) {
        return b(str, d, null);
    }

    public b b(String str, double d, @Nullable JsonObject jsonObject) {
        return a(Event.CATEGORY_BUTTON_PRESSED, str, Double.valueOf(d), jsonObject);
    }

    public void c(@NonNull String str, double d, @Nullable JsonObject jsonObject) {
        EventManager.BS().a(Event.Builder(Event.CATEGORY_FOCUS_ON, str).setParameters(jsonObject).build());
    }

    public void h(String str, boolean z) {
        EventManager.BS().a(Event.Builder(Event.CATEGORY_SYSTEM, str).setTechnicalLogs(Boolean.valueOf(z)).build());
    }

    public void a(String str, double d, boolean z) {
        EventManager.BS().a(Event.Builder(Event.CATEGORY_SYSTEM, str).setValue(Double.valueOf(d)).setTechnicalLogs(Boolean.valueOf(z)).build());
    }

    public void a(String str, double d, JsonObject jsonObject, boolean z) {
        EventManager.BS().a(Event.Builder(Event.CATEGORY_SYSTEM, str).setValue(Double.valueOf(d)).setParameters(jsonObject).setTechnicalLogs(Boolean.valueOf(z)).build());
    }

    public void e(String str, double d) {
        EventManager.BS().a(Event.Builder(Event.CATEGORY_SCROLL, str).setValue(Double.valueOf(d)).build());
    }

    public void d(String str, double d, JsonObject jsonObject) {
        EventManager.BS().a(Event.Builder(Event.CATEGORY_DROPDOWN_CHANGED, str).setValue(Double.valueOf(d)).setParameters(jsonObject).build());
    }

    public void dk(String str) {
        EventManager.BS().a(Event.Builder(Event.CATEGORY_TEXT_CHANGED, str).build());
    }

    public void e(String str, double d, @Nullable JsonObject jsonObject) {
        EventManager.BS().a(Event.Builder(Event.CATEGORY_TEXT_CHANGED, str).setValue(Double.valueOf(d)).setParameters(jsonObject).build());
    }

    public void b(String str, JsonObject jsonObject) {
        EventManager.BS().a(Event.Builder(Event.CATEGORY_DRAG, str).setParameters(jsonObject).build());
    }

    public void c(String str, JsonObject jsonObject) {
        f(str, 0.0d, jsonObject);
    }

    public void f(String str, double d, JsonObject jsonObject) {
        EventManager.BS().a(Event.Builder(Event.CATEGORY_SCREEN_OPENED, str).setValue(Double.valueOf(d)).setParameters(jsonObject).build());
    }

    public b dl(String str) {
        return f(str, 0.0d);
    }

    public b f(String str, double d) {
        return g(str, d, null);
    }

    public b g(String str, double d, @Nullable JsonObject jsonObject) {
        return a(Event.CATEGORY_POPUP_SERVED, str, Double.valueOf(d), jsonObject, false);
    }

    public b dm(String str) {
        return g(str, 0.0d);
    }

    public b g(String str, double d) {
        return h(str, d, null);
    }

    public b h(String str, double d, @Nullable JsonObject jsonObject) {
        return a(Event.CATEGORY_SCREEN_OPENED, str, Double.valueOf(d), jsonObject, false);
    }

    public b b(String str, double d, JsonObject jsonObject, boolean z) {
        return a(Event.CATEGORY_SYSTEM, str, Double.valueOf(d), jsonObject, z);
    }

    public b a(String str, String str2, Double d, JsonObject jsonObject) {
        return a(str, str2, d, jsonObject, false);
    }

    public b W(String str, String str2) {
        return a(str, str2, Double.valueOf(0.0d), null, false);
    }

    public void a(@NonNull String str, @Nullable Map<String, Object> map) {
        IQApp.a(str, (Map) map);
    }

    @NonNull
    public Tracker Ca() {
        return IQApp.aO(IQApp.Eu());
    }

    @CheckResult
    @NonNull
    public a Cb() {
        return ((com.iqoption.b.a) IQApp.Eu().asx.get()).JL().blf();
    }

    @NonNull
    private b a(String str, String str2, Double d, final JsonObject jsonObject, boolean z) {
        final Builder technicalLogs = Event.Builder(str, str2).setParameters(jsonObject).setTechnicalLogs(Boolean.valueOf(z));
        if (d != null) {
            technicalLogs.setValue(d);
        }
        return new b() {
            JsonObject aqO = jsonObject;

            public void a(JsonObject jsonObject) {
                this.aqO = jsonObject;
            }

            public void Cc() {
                EventManager.BS().a(technicalLogs.calcDuration().build());
            }

            public <T> void f(String str, T t) {
                this.aqO = u.b.i(this.aqO).o(str, t).anr();
                technicalLogs.setParameters(this.aqO);
            }

            public void a(Number number) {
                technicalLogs.setValue(Double.valueOf(number.doubleValue()));
            }

            public void setDuration(@Nullable Long l) {
                if (l != null) {
                    technicalLogs.setDuration(l.longValue());
                }
            }

            @Nullable
            public Long getDuration() {
                return Long.valueOf(technicalLogs.getDuration());
            }
        };
    }

    public void a(t tVar, String str, long j, boolean z, String str2) {
        if (tVar != null && !TextUtils.isEmpty(str)) {
            Builder parameters = Event.ApiCallBuilder(str).setParameters(a(str, j, z, str2));
            IQApp.Ex().bt(new com.iqoption.core.b.a(str, parameters.build(), null));
            a(str, tVar, parameters);
        }
    }

    private JsonObject a(String str, long j, boolean z, String str2) {
        String str3 = z ? "true" : "false";
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("api_name", str);
        jsonObject.addProperty("api_timeout", Long.valueOf(j));
        jsonObject.addProperty("is_socket", str3);
        jsonObject.addProperty("front", str2);
        return jsonObject;
    }

    private void a(final String str, t tVar, final Builder builder) {
        v.b(tVar, new o() {
            public void onSuccess(Object obj) {
                Event build = builder.calcDuration().setValue(Double.valueOf(0.0d)).build();
                EventManager.BS().a(build);
                IQApp.Ex().bt(new com.iqoption.core.b.a(str, build, null));
            }

            public void l(Throwable th) {
                Event build = builder.calcDuration().setValue(Double.valueOf(1.0d)).build();
                if (th instanceof SocketTimeoutException) {
                    EventManager.BS().a(build);
                }
                build.value = Double.valueOf(2.0d);
                IQApp.Ex().bt(new com.iqoption.core.b.a(str, build, th));
            }
        });
    }
}
