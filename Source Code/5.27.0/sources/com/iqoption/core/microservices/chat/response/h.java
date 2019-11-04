package com.iqoption.core.microservices.chat.response;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.iqoption.core.d;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, bng = {"Lcom/iqoption/core/microservices/chat/response/ChatMessageSuggestionsAdapter;", "", "options", "Lcom/google/gson/JsonObject;", "(Lcom/google/gson/JsonObject;)V", "suggestions", "", "Lcom/iqoption/core/microservices/chat/response/ChatSuggestion;", "getSuggestions", "()Ljava/util/List;", "core_release"})
/* compiled from: ChatMessage.kt */
public final class h {
    private final List<m> aYS;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0003"}, bng = {"com/iqoption/core/ext/GsonExt$typeOf$1", "Lcom/google/gson/reflect/TypeToken;", "core_release", "com/iqoption/core/microservices/chat/response/ChatMessageSuggestionsAdapter$fromGson$$inlined$typeOf$1"})
    /* compiled from: GsonExtensions.kt */
    public static final class a extends TypeToken<List<? extends m>> {
    }

    public h(JsonObject jsonObject) {
        List list;
        if (jsonObject != null) {
            JsonElement jsonElement = jsonObject.get("suggestions");
            if (jsonElement != null) {
                JsonArray asJsonArray = jsonElement.getAsJsonArray();
                if (asJsonArray != null) {
                    jsonElement = asJsonArray;
                    Gson Ez = d.Um().Ez();
                    Type type = new a().getType();
                    kotlin.jvm.internal.i.e(type, "object : TypeToken<T>() {}.type");
                    list = (List) Ez.fromJson(jsonElement, type);
                    this.aYS = list;
                }
            }
        }
        list = null;
        this.aYS = list;
    }

    public final List<m> acv() {
        return this.aYS;
    }
}
