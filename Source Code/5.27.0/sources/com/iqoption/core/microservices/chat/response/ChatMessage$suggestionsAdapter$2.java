package com.iqoption.core.microservices.chat.response;

import com.google.gson.JsonElement;
import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "Lcom/iqoption/core/microservices/chat/response/ChatMessageSuggestionsAdapter;", "invoke"})
/* compiled from: ChatMessage.kt */
final class ChatMessage$suggestionsAdapter$2 extends Lambda implements a<h> {
    final /* synthetic */ e this$0;

    ChatMessage$suggestionsAdapter$2(e eVar) {
        this.this$0 = eVar;
        super(0);
    }

    /* renamed from: acp */
    public final h invoke() {
        JsonElement aca = this.this$0.aca();
        return new h(aca != null ? aca.getAsJsonObject() : null);
    }
}
