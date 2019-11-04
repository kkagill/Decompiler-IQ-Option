package com.iqoption.core.microservices.core;

import com.google.android.gms.common.Scopes;
import com.google.gson.JsonObject;
import com.iqoption.core.d;
import io.reactivex.e;
import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, bng = {"<anonymous>", "Lio/reactivex/Flowable;", "Lcom/google/gson/JsonObject;", "invoke"})
/* compiled from: CoreRequests.kt */
final class CoreRequests$profileEvents$2 extends Lambda implements a<e<JsonObject>> {
    public static final CoreRequests$profileEvents$2 brR = new CoreRequests$profileEvents$2();

    CoreRequests$profileEvents$2() {
        super(0);
    }

    /* renamed from: abK */
    public final e<JsonObject> invoke() {
        return d.EW().b(Scopes.PROFILE, JsonObject.class).bx(false).HQ();
    }
}
