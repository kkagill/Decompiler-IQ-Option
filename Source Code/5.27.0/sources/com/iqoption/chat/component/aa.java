package com.iqoption.chat.component;

import androidx.core.app.NotificationCompat;
import com.iqoption.core.microservices.chat.response.e;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0004HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0014\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, bng = {"Lcom/iqoption/chat/component/MessageItem;", "Lcom/iqoption/chat/component/MessageAdapterItem;", "Lcom/iqoption/chat/component/Bubbled;", "msg", "Lcom/iqoption/core/microservices/chat/response/ChatMessage;", "bubble", "", "(Lcom/iqoption/core/microservices/chat/response/ChatMessage;I)V", "getBubble", "()I", "getMsg", "()Lcom/iqoption/core/microservices/chat/response/ChatMessage;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "chat_release"})
/* compiled from: MessageAdapterItems.kt */
public final class aa extends y {
    private final e aOq;
    private final int bubble;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof aa) {
                aa aaVar = (aa) obj;
                if (kotlin.jvm.internal.i.y(this.aOq, aaVar.aOq)) {
                    if ((QV() == aaVar.QV() ? 1 : null) != null) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        e eVar = this.aOq;
        return ((eVar != null ? eVar.hashCode() : 0) * 31) + QV();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("MessageItem(msg=");
        stringBuilder.append(this.aOq);
        stringBuilder.append(", bubble=");
        stringBuilder.append(QV());
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public final e QT() {
        return this.aOq;
    }

    public aa(e eVar, int i) {
        kotlin.jvm.internal.i.f(eVar, NotificationCompat.CATEGORY_MESSAGE);
        super();
        this.aOq = eVar;
        this.bubble = i;
    }

    public int QV() {
        return this.bubble;
    }
}
