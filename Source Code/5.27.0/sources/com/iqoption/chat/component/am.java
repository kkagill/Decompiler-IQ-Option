package com.iqoption.chat.component;

import com.iqoption.core.microservices.chat.response.m;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, bng = {"Lcom/iqoption/chat/component/SuggestionItem;", "Lcom/iqoption/chat/component/MessageAdapterItem;", "suggest", "Lcom/iqoption/core/microservices/chat/response/ChatSuggestion;", "(Lcom/iqoption/core/microservices/chat/response/ChatSuggestion;)V", "getSuggest", "()Lcom/iqoption/core/microservices/chat/response/ChatSuggestion;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "chat_release"})
/* compiled from: MessageAdapterItems.kt */
public final class am extends y {
    private final m aQF;

    /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (kotlin.jvm.internal.i.y(r1.aQF, ((com.iqoption.chat.component.am) r2).aQF) != false) goto L_0x0015;
     */
    public boolean equals(java.lang.Object r2) {
        /*
        r1 = this;
        if (r1 == r2) goto L_0x0015;
    L_0x0002:
        r0 = r2 instanceof com.iqoption.chat.component.am;
        if (r0 == 0) goto L_0x0013;
    L_0x0006:
        r2 = (com.iqoption.chat.component.am) r2;
        r0 = r1.aQF;
        r2 = r2.aQF;
        r2 = kotlin.jvm.internal.i.y(r0, r2);
        if (r2 == 0) goto L_0x0013;
    L_0x0012:
        goto L_0x0015;
    L_0x0013:
        r2 = 0;
        return r2;
    L_0x0015:
        r2 = 1;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.chat.component.am.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        m mVar = this.aQF;
        return mVar != null ? mVar.hashCode() : 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SuggestionItem(suggest=");
        stringBuilder.append(this.aQF);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public am(m mVar) {
        kotlin.jvm.internal.i.f(mVar, "suggest");
        super();
        this.aQF = mVar;
    }

    public final m RP() {
        return this.aQF;
    }
}
