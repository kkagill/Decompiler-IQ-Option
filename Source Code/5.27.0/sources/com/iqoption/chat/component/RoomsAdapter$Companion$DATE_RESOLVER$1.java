package com.iqoption.chat.component;

import com.iqoption.core.microservices.chat.response.e;
import com.iqoption.core.microservices.chat.response.k;
import kotlin.i;
import kotlin.jvm.a.m;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "viewModel", "Lcom/iqoption/chat/viewmodel/LastMessagesViewModel;", "room", "Lcom/iqoption/core/microservices/chat/response/ChatRoom;", "invoke"})
/* compiled from: RoomsAdapter.kt */
final class RoomsAdapter$Companion$DATE_RESOLVER$1 extends Lambda implements m<com.iqoption.chat.viewmodel.i, k, Long> {
    public static final RoomsAdapter$Companion$DATE_RESOLVER$1 aQr = new RoomsAdapter$Companion$DATE_RESOLVER$1();

    RoomsAdapter$Companion$DATE_RESOLVER$1() {
        super(2);
    }

    public /* synthetic */ Object w(Object obj, Object obj2) {
        return Long.valueOf(a((com.iqoption.chat.viewmodel.i) obj, (k) obj2));
    }

    public final long a(com.iqoption.chat.viewmodel.i iVar, k kVar) {
        kotlin.jvm.internal.i.f(iVar, "viewModel");
        kotlin.jvm.internal.i.f(kVar, "room");
        e ff = iVar.ff(kVar.getId());
        return ff != null ? ff.getDate() : 0;
    }
}
