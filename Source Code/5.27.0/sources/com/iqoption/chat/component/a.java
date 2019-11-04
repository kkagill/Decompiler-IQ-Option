package com.iqoption.chat.component;

import androidx.core.app.NotificationCompat;
import com.iqoption.core.microservices.chat.response.e;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\bHÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\bHÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, bng = {"Lcom/iqoption/chat/component/AttachmentItem;", "Lcom/iqoption/chat/component/MessageAdapterItem;", "Lcom/iqoption/chat/component/Bubbled;", "msg", "Lcom/iqoption/core/microservices/chat/response/ChatMessage;", "attachment", "Lcom/iqoption/core/microservices/chat/response/ChatAttachment;", "bubble", "", "(Lcom/iqoption/core/microservices/chat/response/ChatMessage;Lcom/iqoption/core/microservices/chat/response/ChatAttachment;I)V", "getAttachment", "()Lcom/iqoption/core/microservices/chat/response/ChatAttachment;", "getBubble", "()I", "getMsg", "()Lcom/iqoption/core/microservices/chat/response/ChatMessage;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "", "chat_release"})
/* compiled from: MessageAdapterItems.kt */
public final class a extends y {
    private final e aOq;
    private final com.iqoption.core.microservices.chat.response.a aOr;
    private final int bubble;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (kotlin.jvm.internal.i.y(this.aOq, aVar.aOq) && kotlin.jvm.internal.i.y(this.aOr, aVar.aOr)) {
                    if ((QV() == aVar.QV() ? 1 : null) != null) {
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
        int i = 0;
        int hashCode = (eVar != null ? eVar.hashCode() : 0) * 31;
        com.iqoption.core.microservices.chat.response.a aVar = this.aOr;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return ((hashCode + i) * 31) + QV();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AttachmentItem(msg=");
        stringBuilder.append(this.aOq);
        stringBuilder.append(", attachment=");
        stringBuilder.append(this.aOr);
        stringBuilder.append(", bubble=");
        stringBuilder.append(QV());
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public final e QT() {
        return this.aOq;
    }

    public final com.iqoption.core.microservices.chat.response.a QU() {
        return this.aOr;
    }

    public a(e eVar, com.iqoption.core.microservices.chat.response.a aVar, int i) {
        kotlin.jvm.internal.i.f(eVar, NotificationCompat.CATEGORY_MESSAGE);
        kotlin.jvm.internal.i.f(aVar, "attachment");
        super();
        this.aOq = eVar;
        this.aOr = aVar;
        this.bubble = i;
    }

    public int QV() {
        return this.bubble;
    }
}
