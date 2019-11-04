package com.iqoption.app.b;

import com.google.common.b.d;
import com.iqoption.debugmenu.b;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, bng = {"Lcom/iqoption/app/events/IQEventBus;", "Lcom/google/common/eventbus/EventBus;", "identifier", "", "(Ljava/lang/String;)V", "postAndSendToRx", "", "event", "", "app_optionXRelease"})
/* compiled from: IQEventBus.kt */
public final class c extends d {
    public c(String str) {
        kotlin.jvm.internal.i.f(str, "identifier");
        super(str);
    }

    public final void bt(Object obj) {
        kotlin.jvm.internal.i.f(obj, "event");
        super.bd(obj);
        if (obj instanceof com.iqoption.core.b.d) {
            b.cve.d((com.iqoption.core.b.d) obj);
        }
    }
}
