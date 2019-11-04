package com.iqoption.chat.fragment;

import com.iqoption.chat.e.j;
import com.iqoption.chat.fragment.s.b;
import com.iqoption.core.microservices.chat.response.ChatRoomType;
import com.iqoption.core.microservices.chat.response.l;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\b"}, bng = {"Lcom/iqoption/chat/fragment/DummyDelegate;", "Lcom/iqoption/chat/fragment/RoomBottomBarDelegate;", "params", "Lcom/iqoption/chat/fragment/RoomBottomBarDelegate$Params;", "(Lcom/iqoption/chat/fragment/RoomBottomBarDelegate$Params;)V", "onStateChanged", "state", "Lcom/iqoption/core/microservices/chat/response/ChatState;", "chat_release"})
/* compiled from: RoomBottomBarDelegates.kt */
final class h extends s {
    public h(b bVar) {
        kotlin.jvm.internal.i.f(bVar, "params");
        super(bVar);
        SC().Se().removeAllViews();
    }

    public s a(l lVar) {
        if (SF().SG() == ChatRoomType.NOTIFICATION) {
            return this;
        }
        if (lVar == null) {
            return this;
        }
        s bVar;
        if (lVar.acC()) {
            bVar = new b(SF(), getString(j.you_have_been_banned, new Object[0]));
        } else if (lVar.acD() < lVar.acE()) {
            bVar = new b(SF(), u.a(this, lVar));
        } else {
            bVar = new ab(SF());
        }
        return bVar;
    }
}
