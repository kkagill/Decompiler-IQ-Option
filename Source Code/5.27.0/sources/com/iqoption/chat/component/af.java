package com.iqoption.chat.component;

import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, bng = {"Lcom/iqoption/chat/component/RateSupportEvent;", "Lcom/iqoption/chat/component/ResultEvent;", "messageId", "", "time", "", "success", "", "error", "(Ljava/lang/String;JZLjava/lang/String;)V", "getMessageId", "()Ljava/lang/String;", "chat_release"})
/* compiled from: RateSupportEvent.kt */
public final class af extends ag {
    private final String aPU;

    public af(String str, long j, boolean z, String str2) {
        kotlin.jvm.internal.i.f(str, "messageId");
        super(j, z, str2);
        this.aPU = str;
    }

    public final String RA() {
        return this.aPU;
    }
}
