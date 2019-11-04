package com.iqoption.chat.viewmodel;

import com.iqoption.core.microservices.chat.a;
import io.reactivex.b.f;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;
import kotlin.l;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "it", "", "invoke"})
/* compiled from: RoomViewModel.kt */
final class RoomViewModel$sendTextTypingLimiter$1 extends Lambda implements b<String, l> {
    final /* synthetic */ k this$0;

    RoomViewModel$sendTextTypingLimiter$1(k kVar) {
        this.this$0 = kVar;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        eL((String) obj);
        return l.eVB;
    }

    public final void eL(String str) {
        kotlin.jvm.internal.i.f(str, "it");
        a.bpz.al(this.this$0.SJ(), str).h(com.iqoption.core.rx.i.aki()).a((f) AnonymousClass1.aYw, (f) AnonymousClass2.aYx);
    }
}
