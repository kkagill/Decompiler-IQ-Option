package com.iqoption.chat.viewmodel;

import androidx.core.app.NotificationCompat;
import com.iqoption.core.d;
import com.iqoption.core.microservices.chat.response.ChatMessageType;
import com.iqoption.core.microservices.chat.response.e;
import kotlin.i;
import kotlin.jvm.a.b;

@i(bne = {1, 1, 15}, bnf = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\bJ\u0016\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0002\u0010\fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, bng = {"Lcom/iqoption/chat/viewmodel/MessageFilter;", "Lkotlin/Function1;", "Lcom/iqoption/core/microservices/chat/response/ChatMessage;", "", "()V", "userId", "", "filter", "", "messages", "invoke", "msg", "(Lcom/iqoption/core/microservices/chat/response/ChatMessage;)Ljava/lang/Boolean;", "chat_release"})
/* compiled from: MessageFilter.kt */
public final class j implements b<e, Boolean> {
    private final long userId = d.EA().getUserId();

    /* renamed from: f */
    public Boolean invoke(e eVar) {
        kotlin.jvm.internal.i.f(eVar, NotificationCompat.CATEGORY_MESSAGE);
        boolean z = !eVar.aci() && ((!eVar.acj() || eVar.acc() == this.userId) && (eVar.abZ() != ChatMessageType.RATE || eVar.abV().acu()));
        return Boolean.valueOf(z);
    }
}
