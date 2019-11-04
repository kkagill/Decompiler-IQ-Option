package com.iqoption.core.microservices.chat.response;

import com.google.gson.JsonElement;
import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "Lcom/iqoption/core/microservices/chat/response/ChatMessageRateAdapter;", "invoke"})
/* compiled from: ChatMessage.kt */
final class ChatMessage$rateAdapter$2 extends Lambda implements a<g> {
    final /* synthetic */ e this$0;

    ChatMessage$rateAdapter$2(e eVar) {
        this.this$0 = eVar;
        super(0);
    }

    /* renamed from: aco */
    public final g invoke() {
        JsonElement aca = this.this$0.aca();
        return new g(aca != null ? aca.getAsJsonObject() : null);
    }
}
