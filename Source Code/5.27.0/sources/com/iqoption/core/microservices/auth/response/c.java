package com.iqoption.core.microservices.auth.response;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B!\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, bng = {"Lcom/iqoption/core/microservices/auth/response/LoginResponse;", "", "()V", "data", "Lcom/google/gson/JsonObject;", "errors", "", "Lcom/iqoption/core/microservices/auth/response/LoginError;", "(Lcom/google/gson/JsonObject;Ljava/util/List;)V", "getData", "()Lcom/google/gson/JsonObject;", "getErrors", "()Ljava/util/List;", "core_release"})
/* compiled from: LoginResponse.kt */
public final class c {
    @SerializedName("data")
    private final JsonObject blO;
    @SerializedName("errors")
    private final List<b> errors;

    public c(JsonObject jsonObject, List<b> list) {
        kotlin.jvm.internal.i.f(list, "errors");
        this.blO = jsonObject;
        this.errors = list;
    }

    public /* synthetic */ c(JsonObject jsonObject, List list, int i, f fVar) {
        if ((i & 1) != 0) {
            jsonObject = (JsonObject) null;
        }
        if ((i & 2) != 0) {
            list = m.emptyList();
        }
        this(jsonObject, list);
    }

    public final JsonObject Zg() {
        return this.blO;
    }

    public final List<b> Zh() {
        return this.errors;
    }

    public c() {
        this(null, null, 2, null);
    }
}
