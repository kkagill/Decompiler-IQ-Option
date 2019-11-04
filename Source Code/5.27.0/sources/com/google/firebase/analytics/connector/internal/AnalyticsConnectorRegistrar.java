package com.google.firebase.analytics.connector.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.FirebaseApp;
import com.google.firebase.a.d;
import com.google.firebase.analytics.connector.a;
import com.google.firebase.c.f;
import com.google.firebase.components.b;
import com.google.firebase.components.h;
import com.google.firebase.components.n;
import java.util.Arrays;
import java.util.List;

@KeepForSdk
@Keep
public class AnalyticsConnectorRegistrar implements h {
    @SuppressLint({"MissingPermission"})
    @Keep
    @KeepForSdk
    public List<b<?>> getComponents() {
        return Arrays.asList(new b[]{b.q(a.class).a(n.v(FirebaseApp.class)).a(n.v(Context.class)).a(n.v(d.class)).a(a.abC).wd().wf(), f.S("fire-analytics", "16.5.0")});
    }
}
