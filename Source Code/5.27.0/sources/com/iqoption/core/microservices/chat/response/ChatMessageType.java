package com.iqoption.core.microservices.chat.response;

import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, bng = {"Lcom/iqoption/core/microservices/chat/response/ChatMessageType;", "", "(Ljava/lang/String;I)V", "TEXT", "RATE", "CLOSE_DIALOG", "TRANSFER", "core_release"})
/* compiled from: ChatMessageType.kt */
public enum ChatMessageType {
    TEXT,
    RATE,
    CLOSE_DIALOG,
    TRANSFER
}
