package com.iqoption.core.microservices.chat;

import com.iqoption.core.microservices.chat.a.d;
import io.reactivex.e;
import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "Lio/reactivex/Flowable;", "Lcom/iqoption/core/microservices/chat/event/ChatTypingInfo;", "kotlin.jvm.PlatformType", "invoke"})
/* compiled from: ChatRequests.kt */
final class ChatRequests$chatTypingStream$2 extends Lambda implements a<e<d>> {
    public static final ChatRequests$chatTypingStream$2 bpI = new ChatRequests$chatTypingStream$2();

    ChatRequests$chatTypingStream$2() {
        super(0);
    }

    /* renamed from: abK */
    public final e<d> invoke() {
        return com.iqoption.core.d.EW().b("chat-typing", e.class).HO().HQ().g(AnonymousClass1.bpJ).blb();
    }
}
