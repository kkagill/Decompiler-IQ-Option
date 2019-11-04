package com.iqoption.core.connect.http;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import kotlin.i;
import kotlin.jvm.a.b;

@i(bne = {1, 1, 15}, bnf = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u001d\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0001¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0005\"\u001d\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0005\"\u001d\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0005¨\u0006\u000e"}, bng = {"jsonArrayParser", "Lkotlin/Function1;", "", "Lcom/google/gson/JsonArray;", "getJsonArrayParser", "()Lkotlin/jvm/functions/Function1;", "jsonElementParser", "Lcom/google/gson/JsonElement;", "getJsonElementParser", "jsonObjectParser", "Lcom/google/gson/JsonObject;", "getJsonObjectParser", "stringParser", "getStringParser", "core_release"})
/* compiled from: Parsers.kt */
public final class d {
    private static final b<String, String> baS = ParsersKt$stringParser$1.baZ;
    private static final b<String, JsonElement> baT = ParsersKt$jsonElementParser$1.baX;
    private static final b<String, JsonObject> baU = ParsersKt$jsonObjectParser$1.baY;
    private static final b<String, JsonArray> baV = ParsersKt$jsonArrayParser$1.baW;

    public static final b<String, String> UP() {
        return baS;
    }
}
