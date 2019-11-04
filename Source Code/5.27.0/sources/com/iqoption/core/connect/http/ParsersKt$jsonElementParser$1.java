package com.iqoption.core.connect.http;

import com.google.gson.JsonElement;
import com.iqoption.core.ext.d;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "Lcom/google/gson/JsonElement;", "it", "", "invoke"})
/* compiled from: Parsers.kt */
final class ParsersKt$jsonElementParser$1 extends Lambda implements b<String, JsonElement> {
    public static final ParsersKt$jsonElementParser$1 baX = new ParsersKt$jsonElementParser$1();

    ParsersKt$jsonElementParser$1() {
        super(1);
    }

    /* renamed from: fv */
    public final JsonElement invoke(String str) {
        kotlin.jvm.internal.i.f(str, "it");
        return (JsonElement) d.b(str, JsonElement.class, null, 2, null);
    }
}
