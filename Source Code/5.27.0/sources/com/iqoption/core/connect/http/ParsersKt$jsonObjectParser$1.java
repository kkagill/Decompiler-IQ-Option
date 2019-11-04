package com.iqoption.core.connect.http;

import com.google.gson.JsonObject;
import com.iqoption.core.ext.d;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "Lcom/google/gson/JsonObject;", "it", "", "invoke"})
/* compiled from: Parsers.kt */
final class ParsersKt$jsonObjectParser$1 extends Lambda implements b<String, JsonObject> {
    public static final ParsersKt$jsonObjectParser$1 baY = new ParsersKt$jsonObjectParser$1();

    ParsersKt$jsonObjectParser$1() {
        super(1);
    }

    /* renamed from: fw */
    public final JsonObject invoke(String str) {
        kotlin.jvm.internal.i.f(str, "it");
        return (JsonObject) d.b(str, JsonObject.class, null, 2, null);
    }
}
