package com.iqoption.chat.component;

import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.iqoption.core.microservices.chat.response.k;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\r"}, bng = {"Lcom/iqoption/chat/component/RoomViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/iqoption/chat/component/RoomBinding;", "(Lcom/iqoption/chat/component/RoomBinding;)V", "getBinding", "()Lcom/iqoption/chat/component/RoomBinding;", "bound", "Lcom/iqoption/core/microservices/chat/response/ChatRoom;", "getBound", "()Lcom/iqoption/core/microservices/chat/response/ChatRoom;", "setBound", "(Lcom/iqoption/core/microservices/chat/response/ChatRoom;)V", "chat_release"})
/* compiled from: RoomViewHolder.kt */
public final class ai extends ViewHolder {
    private k aPW;
    private final ah aPX;

    public ai(ah ahVar) {
        kotlin.jvm.internal.i.f(ahVar, "binding");
        super(ahVar.getRoot());
        this.aPX = ahVar;
    }

    public final ah RG() {
        return this.aPX;
    }

    public final k RF() {
        return this.aPW;
    }

    public final void a(k kVar) {
        this.aPW = kVar;
    }
}
