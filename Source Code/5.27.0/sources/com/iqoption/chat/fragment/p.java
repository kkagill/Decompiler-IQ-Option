package com.iqoption.chat.fragment;

import android.widget.TextView;
import com.iqoption.chat.a.bg;
import com.iqoption.chat.e.h;
import com.iqoption.core.microservices.chat.response.k;
import com.iqoption.core.util.LocalizationUtil;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, bng = {"Lcom/iqoption/chat/fragment/PrivateRoomTopBarDelegate;", "Lcom/iqoption/chat/fragment/RoomTopBarDelegate;", "delegateContext", "Lcom/iqoption/chat/fragment/DelegateContext;", "(Lcom/iqoption/chat/fragment/DelegateContext;)V", "binding", "Lcom/iqoption/chat/databinding/ChatRoomPrivateToolbarBinding;", "getBinding", "()Lcom/iqoption/chat/databinding/ChatRoomPrivateToolbarBinding;", "onRoomLoaded", "", "room", "Lcom/iqoption/core/microservices/chat/response/ChatRoom;", "chat_release"})
/* compiled from: RoomTopBarDelegates.kt */
public final class p extends x {
    private final bg aUn;

    public p(g gVar) {
        kotlin.jvm.internal.i.f(gVar, "delegateContext");
        super(gVar);
        this.aUn = (bg) z.e(gVar, h.chat_room_private_toolbar);
    }

    public void d(k kVar) {
        if (kVar != null) {
            TextView textView = this.aUn.alH;
            kotlin.jvm.internal.i.e(textView, "binding.title");
            textView.setText(LocalizationUtil.hq(kVar.getName()));
        }
    }
}
