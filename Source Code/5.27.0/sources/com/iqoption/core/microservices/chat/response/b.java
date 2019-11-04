package com.iqoption.core.microservices.chat.response;

import com.iqoption.core.d;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002¨\u0006\u0003"}, bng = {"getImageUrl", "", "Lcom/iqoption/core/microservices/chat/response/ChatAttachment;", "core_release"})
/* compiled from: ChatAttachment.kt */
public final class b {
    public static final String c(a aVar) {
        kotlin.jvm.internal.i.f(aVar, "$this$getImageUrl");
        if (kotlin.jvm.internal.i.y(aVar.abT(), Boolean.valueOf(true))) {
            return d.EE().fB(aVar.getPath());
        }
        return d.EE().fA(aVar.getPath());
    }
}
