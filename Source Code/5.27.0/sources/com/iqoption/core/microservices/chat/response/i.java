package com.iqoption.core.microservices.chat.response;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

@kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0007¨\u0006\b"}, bng = {"Lcom/iqoption/core/microservices/chat/response/ChatMessageTransferAdapter;", "", "options", "Lcom/google/gson/JsonObject;", "(Lcom/google/gson/JsonObject;)V", "isTransferred", "", "()Z", "core_release"})
/* compiled from: ChatMessage.kt */
public final class i {
    private final boolean bqE;

    public i(JsonObject jsonObject) {
        boolean asBoolean;
        if (jsonObject != null) {
            JsonElement jsonElement = jsonObject.get("is_transferred");
            if (jsonElement != null) {
                asBoolean = jsonElement.getAsBoolean();
                this.bqE = asBoolean;
            }
        }
        asBoolean = false;
        this.bqE = asBoolean;
    }

    public final boolean acw() {
        return this.bqE;
    }
}
