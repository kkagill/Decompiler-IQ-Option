package com.iqoption.core.microservices.auth;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.iqoption.core.ext.d;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "invoke"})
/* compiled from: AuthRequests.kt */
final class AuthRequests$generateAutoLoginToken$1 extends Lambda implements b<String, String> {
    public static final AuthRequests$generateAutoLoginToken$1 blB = new AuthRequests$generateAutoLoginToken$1();

    AuthRequests$generateAutoLoginToken$1() {
        super(1);
    }

    /* renamed from: fn */
    public final String invoke(String str) {
        kotlin.jvm.internal.i.f(str, "it");
        JsonElement jsonElement = ((JsonObject) d.b(str, JsonObject.class, null, 2, null)).get("data");
        kotlin.jvm.internal.i.e(jsonElement, "json[\"data\"]");
        jsonElement = jsonElement.getAsJsonObject().get("token");
        kotlin.jvm.internal.i.e(jsonElement, "json[\"data\"].asJsonObject[\"token\"]");
        return jsonElement.getAsString();
    }
}
