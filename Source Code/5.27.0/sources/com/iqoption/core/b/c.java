package com.iqoption.core.b;

import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, bng = {"Lcom/iqoption/core/event/FrontEvent;", "Lcom/iqoption/core/event/IQEvent;", "front", "", "(Ljava/lang/String;)V", "getFront", "()Ljava/lang/String;", "toString", "core_release"})
/* compiled from: FrontEvent.kt */
public final class c implements d {
    private final String bgB;

    public c(String str) {
        kotlin.jvm.internal.i.f(str, "front");
        this.bgB = str;
    }

    public final String Xd() {
        return this.bgB;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("front: ");
        stringBuilder.append(this.bgB);
        return stringBuilder.toString();
    }
}
