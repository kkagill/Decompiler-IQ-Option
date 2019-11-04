package com.iqoption.core.microservices.chat;

import com.iqoption.core.d;
import io.reactivex.e;
import java.util.List;
import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002 \u0004*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "Lio/reactivex/Flowable;", "", "Lcom/iqoption/core/microservices/chat/response/ChatMessage;", "kotlin.jvm.PlatformType", "invoke"})
/* compiled from: ChatRequests.kt */
final class ChatRequests$chatMessageStream$2 extends Lambda implements a<e<List<? extends com.iqoption.core.microservices.chat.response.e>>> {
    public static final ChatRequests$chatMessageStream$2 bpC = new ChatRequests$chatMessageStream$2();

    ChatRequests$chatMessageStream$2() {
        super(0);
    }

    /* renamed from: abK */
    public final e<List<com.iqoption.core.microservices.chat.response.e>> invoke() {
        return d.EW().b("chat-message-generated", b.class).HO().HQ().g(AnonymousClass1.bpD).blb();
    }
}
