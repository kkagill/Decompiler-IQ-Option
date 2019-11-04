package com.iqoption.core.util;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.l;

@i(bne = {1, 1, 15}, bnf = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B \b\u0016\u0012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005¢\u0006\u0002\u0010\u0006B\u0005¢\u0006\u0002\u0010\u0007J\u001f\u0010\n\u001a\u00020\u000b2\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\r\"\u00020\u0001¢\u0006\u0002\u0010\u000eJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0017\u0010\u0011\u001a\u00020\u0004*\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0004R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, bng = {"Lcom/iqoption/core/util/Json;", "", "init", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function1;)V", "()V", "json", "Lcom/google/gson/JsonObject;", "array", "Lcom/google/gson/JsonArray;", "args", "", "([Ljava/lang/Object;)Lcom/google/gson/JsonArray;", "toString", "", "to", "value", "core_release"})
/* compiled from: Json.kt */
public final class t {
    private final JsonObject bQN;

    public t() {
        this.bQN = new JsonObject();
    }

    public t(b<? super t, l> bVar) {
        kotlin.jvm.internal.i.f(bVar, "init");
        this();
        bVar.invoke(this);
    }

    public final void n(String str, Object obj) {
        kotlin.jvm.internal.i.f(str, "$this$to");
        if (obj != null) {
            if (obj instanceof Character) {
                this.bQN.addProperty(str, (Character) obj);
            } else if (obj instanceof Number) {
                this.bQN.addProperty(str, (Number) obj);
            } else if (obj instanceof String) {
                this.bQN.addProperty(str, (String) obj);
            } else if (obj instanceof Boolean) {
                this.bQN.addProperty(str, (Boolean) obj);
            } else if (obj instanceof JsonElement) {
                this.bQN.add(str, (JsonElement) obj);
            } else {
                this.bQN.addProperty(str, obj.toString());
            }
        }
    }

    public final JsonArray q(Object... objArr) {
        kotlin.jvm.internal.i.f(objArr, "args");
        JsonArray jsonArray = new JsonArray();
        for (Object obj : objArr) {
            if (obj instanceof Character) {
                jsonArray.add((Character) obj);
            } else if (obj instanceof Number) {
                jsonArray.add((Number) obj);
            } else if (obj instanceof String) {
                jsonArray.add((String) obj);
            } else if (obj instanceof Boolean) {
                jsonArray.add((Boolean) obj);
            } else if (obj instanceof JsonElement) {
                jsonArray.add((JsonElement) obj);
            } else {
                jsonArray.add(obj.toString());
            }
        }
        return jsonArray;
    }

    public String toString() {
        String jsonObject = this.bQN.toString();
        kotlin.jvm.internal.i.e(jsonObject, "json.toString()");
        return jsonObject;
    }
}
