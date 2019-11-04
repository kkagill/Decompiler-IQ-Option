package com.iqoption.core.ext;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.stream.JsonReader;
import java.lang.reflect.Type;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000¤\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0011\u0010\u000e\u001a\u00020\u000f\"\u0006\b\u0000\u0010\u0010\u0018\u0001H\b\u001a&\u0010\u0011\u001a\u0004\u0018\u0001H\u0010\"\u0006\b\u0000\u0010\u0010\u0018\u0001*\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\b¢\u0006\u0002\u0010\u0015\u001a)\u0010\u0011\u001a\u0004\u0018\u0001H\u0010\"\u0004\b\u0000\u0010\u0010*\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u0014¢\u0006\u0002\u0010\u0017\u001a&\u0010\u0011\u001a\u0004\u0018\u0001H\u0010\"\u0006\b\u0000\u0010\u0010\u0018\u0001*\u00020\u00182\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\b¢\u0006\u0002\u0010\u0019\u001a)\u0010\u0011\u001a\u0004\u0018\u0001H\u0010\"\u0004\b\u0000\u0010\u0010*\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u0014¢\u0006\u0002\u0010\u001a\u001a&\u0010\u0011\u001a\u0004\u0018\u0001H\u0010\"\u0006\b\u0000\u0010\u0010\u0018\u0001*\u00020\u001b2\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\b¢\u0006\u0002\u0010\u001c\u001a)\u0010\u0011\u001a\u0004\u0018\u0001H\u0010\"\u0004\b\u0000\u0010\u0010*\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u0014¢\u0006\u0002\u0010\u001d\u001a&\u0010\u001e\u001a\u0004\u0018\u0001H\u0010\"\u0006\b\u0000\u0010\u0010\u0018\u0001*\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\b¢\u0006\u0002\u0010\u0015\u001a/\u0010\u001e\u001a\u0004\u0018\u0001H\u0010\"\u0004\b\u0000\u0010\u0010*\u00020\u00122\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002H\u00100 2\b\b\u0002\u0010\u0013\u001a\u00020\u0014¢\u0006\u0002\u0010!\u001a&\u0010\u001e\u001a\u0004\u0018\u0001H\u0010\"\u0006\b\u0000\u0010\u0010\u0018\u0001*\u00020\u00182\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\b¢\u0006\u0002\u0010\u0019\u001a/\u0010\u001e\u001a\u0004\u0018\u0001H\u0010\"\u0004\b\u0000\u0010\u0010*\u00020\u00182\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002H\u00100 2\b\b\u0002\u0010\u0013\u001a\u00020\u0014¢\u0006\u0002\u0010\"\u001a&\u0010\u001e\u001a\u0004\u0018\u0001H\u0010\"\u0006\b\u0000\u0010\u0010\u0018\u0001*\u00020\u001b2\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\b¢\u0006\u0002\u0010\u001c\u001a/\u0010\u001e\u001a\u0004\u0018\u0001H\u0010\"\u0004\b\u0000\u0010\u0010*\u00020\u001b2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002H\u00100 2\b\b\u0002\u0010\u0013\u001a\u00020\u0014¢\u0006\u0002\u0010#\u001a\n\u0010$\u001a\u00020\u0018*\u00020\u001b\u001a!\u0010$\u001a\u00020%*\u00020\u001b2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020%0'H\b\u001a\u001c\u0010(\u001a\u00020\u0005*\u00020\u00052\u0006\u0010)\u001a\u00020\u00052\b\b\u0002\u0010*\u001a\u00020\t\u001a\u001c\u0010+\u001a\u00020,*\u0004\u0018\u00010\u00012\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020,\u001a\u001c\u00100\u001a\u000201*\u0004\u0018\u00010\u00012\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000201\u001a\u001c\u00102\u001a\u00020.*\u0004\u0018\u00010\u00012\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020.\u001a\u001c\u00103\u001a\u00020\u001b*\u0004\u0018\u00010\u00012\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u001b\u001a\u001c\u00104\u001a\u00020,*\u00020\u00052\u0006\u00105\u001a\u00020\u001b2\b\b\u0002\u0010/\u001a\u00020,\u001a\u001c\u00106\u001a\u00020.*\u00020\u00052\u0006\u00105\u001a\u00020\u001b2\b\b\u0002\u0010/\u001a\u00020.\u001a\u001c\u00107\u001a\u000201*\u00020\u00052\u0006\u00105\u001a\u00020\u001b2\b\b\u0002\u0010/\u001a\u000201\u001a6\u00108\u001a\u0002H\u0010\"\u0010\b\u0000\u0010\u0010\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u001009*\u00020\u00052\u0006\u00105\u001a\u00020\u001b2\b\b\u0002\u0010/\u001a\u0002H\u0010H\b¢\u0006\u0002\u0010:\u001a\u001c\u0010;\u001a\u00020<*\u00020\u00052\u0006\u00105\u001a\u00020\u001b2\b\b\u0002\u0010/\u001a\u00020<\u001a\u001c\u0010=\u001a\u00020.*\u00020\u00052\u0006\u00105\u001a\u00020\u001b2\b\b\u0002\u0010/\u001a\u00020.\u001a\u001c\u0010>\u001a\u00020\u0001*\u00020\u00052\u0006\u00105\u001a\u00020\u001b2\b\b\u0002\u0010/\u001a\u00020\u0001\u001a\u001c\u0010?\u001a\u00020\u0005*\u00020\u00052\u0006\u00105\u001a\u00020\u001b2\b\b\u0002\u0010/\u001a\u00020\u0005\u001a\u0016\u0010@\u001a\u00020A*\u0004\u0018\u00010\u00122\b\b\u0002\u0010/\u001a\u00020A\u001a\u001c\u0010@\u001a\u00020A*\u00020\u00052\u0006\u00105\u001a\u00020\u001b2\b\b\u0002\u0010/\u001a\u00020A\u001a%\u0010B\u001a\u0004\u0018\u00010,*\u00020\u00052\u0006\u00105\u001a\u00020\u001b2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010,¢\u0006\u0002\u0010C\u001a:\u0010D\u001a\u0004\u0018\u0001H\u0010\"\u0010\b\u0000\u0010\u0010\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u001009*\u00020\u00052\u0006\u00105\u001a\u00020\u001b2\n\b\u0002\u0010/\u001a\u0004\u0018\u0001H\u0010H\b¢\u0006\u0002\u0010:\u001a%\u0010E\u001a\u0004\u0018\u00010.*\u00020\u00052\u0006\u00105\u001a\u00020\u001b2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010.¢\u0006\u0002\u0010F\u001a \u0010G\u001a\u0004\u0018\u00010\u0001*\u00020\u00052\u0006\u00105\u001a\u00020\u001b2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u0001\u001a \u0010H\u001a\u0004\u0018\u00010\u0005*\u00020\u00052\u0006\u00105\u001a\u00020\u001b2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u0005\u001a\u001f\u0010I\u001a\u0004\u0018\u00010A*\u0004\u0018\u00010\u00122\n\b\u0002\u0010/\u001a\u0004\u0018\u00010A¢\u0006\u0002\u0010J\u001a%\u0010I\u001a\u0004\u0018\u00010A*\u00020\u00052\u0006\u00105\u001a\u00020\u001b2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010A¢\u0006\u0002\u0010K\u001a \u0010L\u001a\u0004\u0018\u00010\u001b*\u00020\u00052\u0006\u00105\u001a\u00020\u001b2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u001b\u001a;\u0010M\u001a\u00020,*\u00020\u00182,\u0010&\u001a(\u0012\u0004\u0012\u00020\u0018\u0012\u0013\u0012\u00110\u001b¢\u0006\f\bO\u0012\b\bP\u0012\u0004\b\b(P\u0012\u0004\u0012\u00020%0N¢\u0006\u0002\bQH\b\u001a\u001c\u0010R\u001a\u00020\u001b*\u00020\u00052\u0006\u00105\u001a\u00020\u001b2\b\b\u0002\u0010/\u001a\u00020\u001b\u001a$\u0010S\u001a\u0002H\u0010\"\u0006\b\u0000\u0010\u0010\u0018\u0001*\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\b¢\u0006\u0002\u0010\u0015\u001a'\u0010S\u001a\u0002H\u0010\"\u0004\b\u0000\u0010\u0010*\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u0014¢\u0006\u0002\u0010\u0017\u001a$\u0010S\u001a\u0002H\u0010\"\u0006\b\u0000\u0010\u0010\u0018\u0001*\u00020\u00182\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\b¢\u0006\u0002\u0010\u0019\u001a'\u0010S\u001a\u0002H\u0010\"\u0004\b\u0000\u0010\u0010*\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u0014¢\u0006\u0002\u0010\u001a\u001a$\u0010S\u001a\u0002H\u0010\"\u0006\b\u0000\u0010\u0010\u0018\u0001*\u00020\u001b2\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\b¢\u0006\u0002\u0010\u001c\u001a'\u0010S\u001a\u0002H\u0010\"\u0004\b\u0000\u0010\u0010*\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u0014¢\u0006\u0002\u0010\u001d\u001a$\u0010T\u001a\u0002H\u0010\"\u0006\b\u0000\u0010\u0010\u0018\u0001*\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\b¢\u0006\u0002\u0010\u0015\u001a-\u0010T\u001a\u0002H\u0010\"\u0004\b\u0000\u0010\u0010*\u00020\u00122\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002H\u00100 2\b\b\u0002\u0010\u0013\u001a\u00020\u0014¢\u0006\u0002\u0010!\u001a$\u0010T\u001a\u0002H\u0010\"\u0006\b\u0000\u0010\u0010\u0018\u0001*\u00020\u00182\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\b¢\u0006\u0002\u0010\u0019\u001a-\u0010T\u001a\u0002H\u0010\"\u0004\b\u0000\u0010\u0010*\u00020\u00182\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002H\u00100 2\b\b\u0002\u0010\u0013\u001a\u00020\u0014¢\u0006\u0002\u0010\"\u001a$\u0010T\u001a\u0002H\u0010\"\u0006\b\u0000\u0010\u0010\u0018\u0001*\u00020\u001b2\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\b¢\u0006\u0002\u0010\u001c\u001a-\u0010T\u001a\u0002H\u0010\"\u0004\b\u0000\u0010\u0010*\u00020\u001b2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002H\u00100 2\b\b\u0002\u0010\u0013\u001a\u00020\u0014¢\u0006\u0002\u0010#\u001a;\u0010U\u001a\u00020%*\u00020\u00182,\u0010&\u001a(\u0012\u0004\u0012\u00020\u0018\u0012\u0013\u0012\u00110\u001b¢\u0006\f\bO\u0012\b\bP\u0012\u0004\b\b(P\u0012\u0004\u0012\u00020%0N¢\u0006\u0002\bQH\b\u001a\u0016\u0010V\u001a\u00020\u001b*\u0004\u0018\u00010W2\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u001a\u001e\u0010V\u001a\u00020%*\u0004\u0018\u00010W2\u0006\u0010X\u001a\u00020Y2\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u001a\u0016\u0010Z\u001a\u00020\u0001*\u0004\u0018\u00010W2\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u001a\u0016\u0010[\u001a\u00020\u0005*\u0004\u0018\u00010W2\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u001a\u0016\u0010\\\u001a\u00020\u0012*\u0004\u0018\u00010W2\b\b\u0002\u0010\u0013\u001a\u00020\u0014\"\u0011\u0010\u0000\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0011\u0010\f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000b¨\u0006]"}, bng = {"EMPTY_JSON_ARRAY", "Lcom/google/gson/JsonArray;", "getEMPTY_JSON_ARRAY", "()Lcom/google/gson/JsonArray;", "EMPTY_JSON_OBJECT", "Lcom/google/gson/JsonObject;", "getEMPTY_JSON_OBJECT", "()Lcom/google/gson/JsonObject;", "KEEP", "Lcom/iqoption/core/ext/ConflictResolver;", "getKEEP", "()Lcom/iqoption/core/ext/ConflictResolver;", "OVERWRITE", "getOVERWRITE", "typeOf", "Ljava/lang/reflect/Type;", "T", "fromGson", "Lcom/google/gson/JsonElement;", "gson", "Lcom/google/gson/Gson;", "(Lcom/google/gson/JsonElement;Lcom/google/gson/Gson;)Ljava/lang/Object;", "type", "(Lcom/google/gson/JsonElement;Ljava/lang/reflect/Type;Lcom/google/gson/Gson;)Ljava/lang/Object;", "Lcom/google/gson/stream/JsonReader;", "(Lcom/google/gson/stream/JsonReader;Lcom/google/gson/Gson;)Ljava/lang/Object;", "(Lcom/google/gson/stream/JsonReader;Ljava/lang/reflect/Type;Lcom/google/gson/Gson;)Ljava/lang/Object;", "", "(Ljava/lang/String;Lcom/google/gson/Gson;)Ljava/lang/Object;", "(Ljava/lang/String;Ljava/lang/reflect/Type;Lcom/google/gson/Gson;)Ljava/lang/Object;", "fromJson", "cls", "Ljava/lang/Class;", "(Lcom/google/gson/JsonElement;Ljava/lang/Class;Lcom/google/gson/Gson;)Ljava/lang/Object;", "(Lcom/google/gson/stream/JsonReader;Ljava/lang/Class;Lcom/google/gson/Gson;)Ljava/lang/Object;", "(Ljava/lang/String;Ljava/lang/Class;Lcom/google/gson/Gson;)Ljava/lang/Object;", "jsonReader", "", "block", "Lkotlin/Function1;", "merge", "another", "conflictResolver", "optAsBoolean", "", "i", "", "defVal", "optAsDouble", "", "optAsInt", "optAsString", "optBoolean", "key", "optColor", "optDouble", "optEnum", "", "(Lcom/google/gson/JsonObject;Ljava/lang/String;Ljava/lang/Enum;)Ljava/lang/Enum;", "optFloat", "", "optInt", "optJsonArray", "optJsonObject", "optLong", "", "optNullableBoolean", "(Lcom/google/gson/JsonObject;Ljava/lang/String;Ljava/lang/Boolean;)Ljava/lang/Boolean;", "optNullableEnum", "optNullableInt", "(Lcom/google/gson/JsonObject;Ljava/lang/String;Ljava/lang/Integer;)Ljava/lang/Integer;", "optNullableJsonArray", "optNullableJsonObject", "optNullableLong", "(Lcom/google/gson/JsonElement;Ljava/lang/Long;)Ljava/lang/Long;", "(Lcom/google/gson/JsonObject;Ljava/lang/String;Ljava/lang/Long;)Ljava/lang/Long;", "optNullableString", "optObject", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "Lkotlin/ExtensionFunctionType;", "optString", "parseGson", "parseJson", "parseObject", "toJson", "", "appendable", "Ljava/lang/Appendable;", "toJsonArray", "toJsonObject", "toJsonTree", "core_release"})
/* compiled from: GsonExtensions.kt */
public final class d {
    private static final JsonObject bha = new JsonObject();
    private static final JsonArray bhb = new JsonArray();
    private static final b bhc = new a();
    private static final b bhd = new b();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u0016¨\u0006\b"}, bng = {"com/iqoption/core/ext/GsonExt$KEEP$1", "Lcom/iqoption/core/ext/ConflictResolver;", "resolve", "Lcom/google/gson/JsonElement;", "key", "", "src", "dst", "core_release"})
    /* compiled from: GsonExtensions.kt */
    public static final class a implements b {
        a() {
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u0016¨\u0006\b"}, bng = {"com/iqoption/core/ext/GsonExt$OVERWRITE$1", "Lcom/iqoption/core/ext/ConflictResolver;", "resolve", "Lcom/google/gson/JsonElement;", "key", "", "src", "dst", "core_release"})
    /* compiled from: GsonExtensions.kt */
    public static final class b implements b {
        b() {
        }
    }

    public static final JsonObject Xk() {
        return bha;
    }

    public static final String a(Object obj, Gson gson) {
        kotlin.jvm.internal.i.f(gson, "gson");
        String toJson = gson.toJson(obj);
        kotlin.jvm.internal.i.e(toJson, "gson.toJson(this)");
        return toJson;
    }

    public static /* synthetic */ String a(Object obj, Gson gson, int i, Object obj2) {
        if ((i & 1) != 0) {
            gson = com.iqoption.core.d.Um().Ez();
        }
        return a(obj, gson);
    }

    public static final JsonElement b(Object obj, Gson gson) {
        kotlin.jvm.internal.i.f(gson, "gson");
        JsonElement toJsonTree = gson.toJsonTree(obj);
        kotlin.jvm.internal.i.e(toJsonTree, "gson.toJsonTree(this)");
        return toJsonTree;
    }

    public static /* synthetic */ JsonElement b(Object obj, Gson gson, int i, Object obj2) {
        if ((i & 1) != 0) {
            gson = com.iqoption.core.d.Um().Ez();
        }
        return b(obj, gson);
    }

    public static final <T> T a(String str, Class<T> cls, Gson gson) {
        kotlin.jvm.internal.i.f(str, "$this$fromJson");
        kotlin.jvm.internal.i.f(cls, "cls");
        kotlin.jvm.internal.i.f(gson, "gson");
        return gson.fromJson(str, (Class) cls);
    }

    public static final <T> T b(String str, Class<T> cls, Gson gson) {
        kotlin.jvm.internal.i.f(str, "$this$parseJson");
        kotlin.jvm.internal.i.f(cls, "cls");
        kotlin.jvm.internal.i.f(gson, "gson");
        return gson.fromJson(str, (Class) cls);
    }

    public static final <T> T a(String str, Type type, Gson gson) {
        kotlin.jvm.internal.i.f(str, "$this$fromGson");
        kotlin.jvm.internal.i.f(type, "type");
        kotlin.jvm.internal.i.f(gson, "gson");
        return gson.fromJson(str, type);
    }

    public static final <T> T a(JsonElement jsonElement, Class<T> cls, Gson gson) {
        kotlin.jvm.internal.i.f(jsonElement, "$this$fromJson");
        kotlin.jvm.internal.i.f(cls, "cls");
        kotlin.jvm.internal.i.f(gson, "gson");
        return gson.fromJson(jsonElement, (Class) cls);
    }

    public static final <T> T b(JsonElement jsonElement, Class<T> cls, Gson gson) {
        kotlin.jvm.internal.i.f(jsonElement, "$this$parseJson");
        kotlin.jvm.internal.i.f(cls, "cls");
        kotlin.jvm.internal.i.f(gson, "gson");
        return gson.fromJson(jsonElement, (Class) cls);
    }

    public static final <T> T a(JsonElement jsonElement, Type type, Gson gson) {
        kotlin.jvm.internal.i.f(jsonElement, "$this$parseGson");
        kotlin.jvm.internal.i.f(type, "type");
        kotlin.jvm.internal.i.f(gson, "gson");
        return gson.fromJson(jsonElement, type);
    }

    public static final <T> T a(JsonReader jsonReader, Class<T> cls, Gson gson) {
        kotlin.jvm.internal.i.f(jsonReader, "$this$fromJson");
        kotlin.jvm.internal.i.f(cls, "cls");
        kotlin.jvm.internal.i.f(gson, "gson");
        return gson.fromJson(jsonReader, (Type) cls);
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:14:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    public static final java.lang.Boolean a(com.google.gson.JsonObject r1, java.lang.String r2, java.lang.Boolean r3) {
        /*
        r0 = "$this$optNullableBoolean";
        kotlin.jvm.internal.i.f(r1, r0);
        r0 = "key";
        kotlin.jvm.internal.i.f(r2, r0);
        r1 = r1.get(r2);
        if (r1 == 0) goto L_0x0036;
    L_0x0010:
        r2 = r1.isJsonPrimitive();
        if (r2 == 0) goto L_0x0027;
    L_0x0016:
        r2 = r1.getAsJsonPrimitive();
        r0 = "it.asJsonPrimitive";
        kotlin.jvm.internal.i.e(r2, r0);
        r2 = r2.isBoolean();
        if (r2 == 0) goto L_0x0027;
    L_0x0025:
        r2 = 1;
        goto L_0x0028;
    L_0x0027:
        r2 = 0;
    L_0x0028:
        if (r2 == 0) goto L_0x002b;
    L_0x002a:
        goto L_0x002c;
    L_0x002b:
        r1 = 0;
    L_0x002c:
        if (r1 == 0) goto L_0x0036;
    L_0x002e:
        r1 = r1.getAsBoolean();
        r3 = java.lang.Boolean.valueOf(r1);
    L_0x0036:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.core.ext.d.a(com.google.gson.JsonObject, java.lang.String, java.lang.Boolean):java.lang.Boolean");
    }

    public static final boolean a(JsonObject jsonObject, String str, boolean z) {
        kotlin.jvm.internal.i.f(jsonObject, "$this$optBoolean");
        kotlin.jvm.internal.i.f(str, "key");
        Boolean a = a(jsonObject, str, null, 2, null);
        return a != null ? a.booleanValue() : z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:14:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    public static final java.lang.Integer a(com.google.gson.JsonObject r1, java.lang.String r2, java.lang.Integer r3) {
        /*
        r0 = "$this$optNullableInt";
        kotlin.jvm.internal.i.f(r1, r0);
        r0 = "key";
        kotlin.jvm.internal.i.f(r2, r0);
        r1 = r1.get(r2);
        if (r1 == 0) goto L_0x0036;
    L_0x0010:
        r2 = r1.isJsonPrimitive();
        if (r2 == 0) goto L_0x0027;
    L_0x0016:
        r2 = r1.getAsJsonPrimitive();
        r0 = "it.asJsonPrimitive";
        kotlin.jvm.internal.i.e(r2, r0);
        r2 = r2.isNumber();
        if (r2 == 0) goto L_0x0027;
    L_0x0025:
        r2 = 1;
        goto L_0x0028;
    L_0x0027:
        r2 = 0;
    L_0x0028:
        if (r2 == 0) goto L_0x002b;
    L_0x002a:
        goto L_0x002c;
    L_0x002b:
        r1 = 0;
    L_0x002c:
        if (r1 == 0) goto L_0x0036;
    L_0x002e:
        r1 = r1.getAsInt();
        r3 = java.lang.Integer.valueOf(r1);
    L_0x0036:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.core.ext.d.a(com.google.gson.JsonObject, java.lang.String, java.lang.Integer):java.lang.Integer");
    }

    public static final int a(JsonObject jsonObject, String str, int i) {
        kotlin.jvm.internal.i.f(jsonObject, "$this$optInt");
        kotlin.jvm.internal.i.f(str, "key");
        Integer a = a(jsonObject, str, null, 2, null);
        return a != null ? a.intValue() : i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:14:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    public static final java.lang.Long a(com.google.gson.JsonObject r1, java.lang.String r2, java.lang.Long r3) {
        /*
        r0 = "$this$optNullableLong";
        kotlin.jvm.internal.i.f(r1, r0);
        r0 = "key";
        kotlin.jvm.internal.i.f(r2, r0);
        r1 = r1.get(r2);
        if (r1 == 0) goto L_0x0036;
    L_0x0010:
        r2 = r1.isJsonPrimitive();
        if (r2 == 0) goto L_0x0027;
    L_0x0016:
        r2 = r1.getAsJsonPrimitive();
        r0 = "it.asJsonPrimitive";
        kotlin.jvm.internal.i.e(r2, r0);
        r2 = r2.isNumber();
        if (r2 == 0) goto L_0x0027;
    L_0x0025:
        r2 = 1;
        goto L_0x0028;
    L_0x0027:
        r2 = 0;
    L_0x0028:
        if (r2 == 0) goto L_0x002b;
    L_0x002a:
        goto L_0x002c;
    L_0x002b:
        r1 = 0;
    L_0x002c:
        if (r1 == 0) goto L_0x0036;
    L_0x002e:
        r1 = r1.getAsLong();
        r3 = java.lang.Long.valueOf(r1);
    L_0x0036:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.core.ext.d.a(com.google.gson.JsonObject, java.lang.String, java.lang.Long):java.lang.Long");
    }

    public static final long a(JsonObject jsonObject, String str, long j) {
        kotlin.jvm.internal.i.f(jsonObject, "$this$optLong");
        kotlin.jvm.internal.i.f(str, "key");
        Long a = a(jsonObject, str, null, 2, null);
        return a != null ? a.longValue() : j;
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:14:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    public static final double a(com.google.gson.JsonObject r1, java.lang.String r2, double r3) {
        /*
        r0 = "$this$optDouble";
        kotlin.jvm.internal.i.f(r1, r0);
        r0 = "key";
        kotlin.jvm.internal.i.f(r2, r0);
        r1 = r1.get(r2);
        if (r1 == 0) goto L_0x0032;
    L_0x0010:
        r2 = r1.isJsonPrimitive();
        if (r2 == 0) goto L_0x0027;
    L_0x0016:
        r2 = r1.getAsJsonPrimitive();
        r0 = "it.asJsonPrimitive";
        kotlin.jvm.internal.i.e(r2, r0);
        r2 = r2.isNumber();
        if (r2 == 0) goto L_0x0027;
    L_0x0025:
        r2 = 1;
        goto L_0x0028;
    L_0x0027:
        r2 = 0;
    L_0x0028:
        if (r2 == 0) goto L_0x002b;
    L_0x002a:
        goto L_0x002c;
    L_0x002b:
        r1 = 0;
    L_0x002c:
        if (r1 == 0) goto L_0x0032;
    L_0x002e:
        r3 = r1.getAsDouble();
    L_0x0032:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.core.ext.d.a(com.google.gson.JsonObject, java.lang.String, double):double");
    }

    public static final String a(JsonObject jsonObject, String str, String str2) {
        kotlin.jvm.internal.i.f(jsonObject, "$this$optNullableString");
        kotlin.jvm.internal.i.f(str, "key");
        JsonElement jsonElement = jsonObject.get(str);
        if (jsonElement != null) {
            if (!jsonElement.isJsonPrimitive()) {
                jsonElement = null;
            }
            if (jsonElement != null) {
                String asString = jsonElement.getAsString();
                if (asString != null) {
                    return asString;
                }
            }
        }
        return str2;
    }

    public static final String b(JsonObject jsonObject, String str, String str2) {
        kotlin.jvm.internal.i.f(jsonObject, "$this$optString");
        kotlin.jvm.internal.i.f(str, "key");
        kotlin.jvm.internal.i.f(str2, "defVal");
        String a = a(jsonObject, str, null, 2, null);
        return a != null ? a : str2;
    }

    public static final JsonObject a(JsonObject jsonObject, String str, JsonObject jsonObject2) {
        kotlin.jvm.internal.i.f(jsonObject, "$this$optNullableJsonObject");
        kotlin.jvm.internal.i.f(str, "key");
        JsonElement jsonElement = jsonObject.get(str);
        if (jsonElement != null) {
            if (!jsonElement.isJsonObject()) {
                jsonElement = null;
            }
            if (jsonElement != null) {
                jsonObject = jsonElement.getAsJsonObject();
                if (jsonObject != null) {
                    return jsonObject;
                }
            }
        }
        return jsonObject2;
    }

    public static final JsonObject b(JsonObject jsonObject, String str, JsonObject jsonObject2) {
        kotlin.jvm.internal.i.f(jsonObject, "$this$optJsonObject");
        kotlin.jvm.internal.i.f(str, "key");
        kotlin.jvm.internal.i.f(jsonObject2, "defVal");
        jsonObject = a(jsonObject, str, null, 2, null);
        return jsonObject != null ? jsonObject : jsonObject2;
    }

    public static final JsonArray a(JsonObject jsonObject, String str, JsonArray jsonArray) {
        kotlin.jvm.internal.i.f(jsonObject, "$this$optNullableJsonArray");
        kotlin.jvm.internal.i.f(str, "key");
        JsonElement jsonElement = jsonObject.get(str);
        if (jsonElement != null) {
            if (!jsonElement.isJsonArray()) {
                jsonElement = null;
            }
            if (jsonElement != null) {
                JsonArray asJsonArray = jsonElement.getAsJsonArray();
                if (asJsonArray != null) {
                    return asJsonArray;
                }
            }
        }
        return jsonArray;
    }

    public static final JsonArray b(JsonObject jsonObject, String str, JsonArray jsonArray) {
        kotlin.jvm.internal.i.f(jsonObject, "$this$optJsonArray");
        kotlin.jvm.internal.i.f(str, "key");
        kotlin.jvm.internal.i.f(jsonArray, "defVal");
        JsonArray a = a(jsonObject, str, null, 2, null);
        return a != null ? a : jsonArray;
    }

    public static final double a(JsonArray jsonArray, int i, double d) {
        if (jsonArray == null) {
            return d;
        }
        Double d2 = null;
        if (jsonArray.size() > i) {
            JsonElement jsonElement = jsonArray.get(i);
            if (jsonElement != null) {
                d2 = Double.valueOf(jsonElement.getAsDouble());
            }
        }
        return d2 != null ? d2.doubleValue() : d;
    }

    public static final int a(JsonArray jsonArray, int i, int i2) {
        if (jsonArray == null) {
            return i2;
        }
        Integer num = null;
        if (jsonArray.size() > i) {
            JsonElement jsonElement = jsonArray.get(i);
            if (jsonElement != null) {
                num = Integer.valueOf(jsonElement.getAsInt());
            }
        }
        return num != null ? num.intValue() : i2;
    }

    public static final String a(JsonArray jsonArray, int i, String str) {
        kotlin.jvm.internal.i.f(str, "defVal");
        if (jsonArray == null) {
            return str;
        }
        String str2 = null;
        if (jsonArray.size() > i) {
            JsonElement jsonElement = jsonArray.get(i);
            if (jsonElement != null) {
                str2 = jsonElement.getAsString();
            }
        }
        return str2 != null ? str2 : str;
    }
}
