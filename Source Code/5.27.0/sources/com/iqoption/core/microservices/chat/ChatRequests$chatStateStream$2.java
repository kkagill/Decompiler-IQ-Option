package com.iqoption.core.microservices.chat;

import com.iqoption.core.d;
import com.iqoption.core.microservices.chat.response.l;
import io.reactivex.e;
import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "Lio/reactivex/Flowable;", "Lcom/iqoption/core/microservices/chat/response/ChatState;", "kotlin.jvm.PlatformType", "invoke"})
/* compiled from: ChatRequests.kt */
final class ChatRequests$chatStateStream$2 extends Lambda implements a<e<l>> {
    public static final ChatRequests$chatStateStream$2 bpG = new ChatRequests$chatStateStream$2();

    ChatRequests$chatStateStream$2() {
        super(0);
    }

    /* renamed from: abK */
    public final e<l> invoke() {
        return d.EW().b("chat-state-updated", d.class).HO().HQ().g(AnonymousClass1.bpH).blb();
    }
}
