package com.iqoption.core.connect.http;

import com.google.gson.JsonArray;
import com.iqoption.core.ext.d;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "Lcom/google/gson/JsonArray;", "it", "", "invoke"})
/* compiled from: Parsers.kt */
final class ParsersKt$jsonArrayParser$1 extends Lambda implements b<String, JsonArray> {
    public static final ParsersKt$jsonArrayParser$1 baW = new ParsersKt$jsonArrayParser$1();

    ParsersKt$jsonArrayParser$1() {
        super(1);
    }

    /* renamed from: fu */
    public final JsonArray invoke(String str) {
        kotlin.jvm.internal.i.f(str, "it");
        return (JsonArray) d.b(str, JsonArray.class, null, 2, null);
    }
}
