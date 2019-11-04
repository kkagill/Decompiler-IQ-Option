package com.iqoption.chat.component;

import com.iqoption.core.microservices.chat.response.k;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/microservices/chat/response/ChatRoom;", "invoke"})
/* compiled from: RoomsAdapter.kt */
final class RoomsAdapter$Companion$PRIORITY_RESOLVER$1 extends Lambda implements b<k, Integer> {
    public static final RoomsAdapter$Companion$PRIORITY_RESOLVER$1 aQs = new RoomsAdapter$Companion$PRIORITY_RESOLVER$1();

    RoomsAdapter$Companion$PRIORITY_RESOLVER$1() {
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        return Integer.valueOf(b((k) obj));
    }

    public final int b(k kVar) {
        kotlin.jvm.internal.i.f(kVar, "it");
        return aj.aQn.indexOf(kVar.SG());
    }
}
