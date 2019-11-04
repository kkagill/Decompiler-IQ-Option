package com.iqoption.core.analytics;

import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.analytics.Tracker;
import com.google.gson.JsonObject;
import io.reactivex.a;
import java.util.Map;

/* compiled from: IQAnalytics */
public interface d {
    @NonNull
    Tracker Ca();

    @CheckResult
    @NonNull
    a Cb();

    @CheckResult
    b W(String str, String str2);

    @CheckResult
    b a(String str, String str2, Double d, JsonObject jsonObject);

    void a(String str, double d, JsonObject jsonObject);

    void a(String str, double d, JsonObject jsonObject, boolean z);

    void a(String str, double d, boolean z);

    void a(String str, JsonObject jsonObject);

    void a(@NonNull String str, @Nullable Map<String, Object> map);

    @CheckResult
    b b(String str, double d, JsonObject jsonObject, boolean z);

    void b(String str, JsonObject jsonObject);

    void c(String str, double d);

    void c(String str, double d, @Nullable JsonObject jsonObject);

    void c(String str, JsonObject jsonObject);

    @CheckResult
    b d(String str, double d);

    void d(String str, double d, @Nullable JsonObject jsonObject);

    void di(String str);

    @CheckResult
    b dj(String str);

    void dk(String str);

    @CheckResult
    b dl(String str);

    @CheckResult
    b dm(String str);

    void e(String str, double d);

    void e(String str, double d, @Nullable JsonObject jsonObject);

    @CheckResult
    b g(String str, double d);

    @CheckResult
    b g(String str, double d, @Nullable JsonObject jsonObject);

    @CheckResult
    b h(String str, double d, @Nullable JsonObject jsonObject);
}
