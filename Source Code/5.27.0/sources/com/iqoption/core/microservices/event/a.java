package com.iqoption.core.microservices.event;

import androidx.annotation.WorkerThread;
import com.iqoption.core.connect.http.c;
import com.iqoption.core.d;
import kotlin.i;
import okhttp3.Request.Builder;
import okhttp3.RequestBody;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, bng = {"Lcom/iqoption/core/microservices/event/EventRequests;", "", "()V", "GET_EVENTS", "", "sendEvent", "", "params", "core_release"})
/* compiled from: EventRequests.kt */
public final class a {
    public static final a bsV = new a();

    private a() {
    }

    @WorkerThread
    public final void gE(String str) {
        kotlin.jvm.internal.i.f(str, "params");
        c cVar = c.baF;
        Builder b = c.b(c.baF, c.a(c.baF, new Builder(), null, 1, null), null, 1, null);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(d.EE().Vf());
        stringBuilder.append("api/v1/events");
        Builder post = b.url(stringBuilder.toString()).post(RequestBody.create(c.baF.UF(), str));
        kotlin.jvm.internal.i.e(post, "Request.Builder()\n      …NTENT_TYPE_JSON, params))");
        c.a(cVar, post, EventRequests$sendEvent$1.bsW, null, null, 12, null);
    }
}
