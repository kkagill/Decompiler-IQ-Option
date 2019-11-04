package com.iqoption.core.connect.bus;

import com.iqoption.core.connect.ws.b;
import com.iqoption.core.connect.ws.c;
import com.iqoption.core.manager.ae;
import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "Lcom/iqoption/core/connect/ws/WebSocketDelegate;", "invoke"})
/* compiled from: IQBusImpl.kt */
final class IQBusImpl$ws$2 extends Lambda implements a<b> {
    public static final IQBusImpl$ws$2 bap = new IQBusImpl$ws$2();

    IQBusImpl$ws$2() {
        super(0);
    }

    /* renamed from: UE */
    public final b invoke() {
        return ae.a(ae.bkV, "ws-new-lib", false, 2, null) ? new c() : new com.iqoption.core.connect.ws.a();
    }
}
