package com.crashlytics.android.answers;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import com.crashlytics.android.answers.k.a;
import io.fabric.sdk.android.c;
import io.fabric.sdk.android.h;
import io.fabric.sdk.android.k;
import io.fabric.sdk.android.services.c.b;
import io.fabric.sdk.android.services.common.IdManager;
import io.fabric.sdk.android.services.common.m;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: SessionAnalyticsManager */
class z implements a {
    private final long oN;
    final e oO;
    final io.fabric.sdk.android.a oP;
    final h oQ;
    final k ob;

    public void onError(String str) {
    }

    public static z a(h hVar, Context context, IdManager idManager, String str, String str2, long j) {
        Context context2 = context;
        IdManager idManager2 = idManager;
        ad adVar = new ad(context, idManager, str, str2);
        h hVar2 = hVar;
        f fVar = new f(context, new b(hVar));
        io.fabric.sdk.android.services.network.b bVar = new io.fabric.sdk.android.services.network.b(c.biX());
        io.fabric.sdk.android.a aVar = new io.fabric.sdk.android.a(context);
        ScheduledExecutorService lp = m.lp("Answers Events Handler");
        k kVar = new k(lp);
        return new z(new e(hVar2, context, fVar, adVar, bVar, lp, new p(context)), aVar, kVar, h.H(context), j);
    }

    z(e eVar, io.fabric.sdk.android.a aVar, k kVar, h hVar, long j) {
        this.oO = eVar;
        this.oP = aVar;
        this.ob = kVar;
        this.oQ = hVar;
        this.oN = j;
    }

    public void enable() {
        this.oO.enable();
        this.oP.a(new g(this, this.ob));
        this.ob.a((a) this);
        if (eA()) {
            f(this.oN);
            this.oQ.ej();
        }
    }

    public void disable() {
        this.oP.biU();
        this.oO.disable();
    }

    public void n(String str, String str2) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            c.biX().d("Answers", "Logged crash");
            this.oO.c(SessionEvent.o(str, str2));
            return;
        }
        throw new IllegalStateException("onCrash called from main thread!!!");
    }

    public void f(long j) {
        c.biX().d("Answers", "Logged install");
        this.oO.b(SessionEvent.g(j));
    }

    public void a(Activity activity, Type type) {
        k biX = c.biX();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Logged lifecycle event: ");
        stringBuilder.append(type.name());
        biX.d("Answers", stringBuilder.toString());
        this.oO.a(SessionEvent.a(type, activity));
    }

    public void eo() {
        c.biX().d("Answers", "Flush events when app is backgrounded");
        this.oO.eh();
    }

    public void a(io.fabric.sdk.android.services.settings.b bVar, String str) {
        this.ob.w(bVar.oi);
        this.oO.a(bVar, str);
    }

    /* Access modifiers changed, original: 0000 */
    public boolean eA() {
        return this.oQ.ek() ^ 1;
    }
}
