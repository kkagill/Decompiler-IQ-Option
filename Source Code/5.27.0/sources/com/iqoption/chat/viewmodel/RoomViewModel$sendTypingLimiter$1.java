package com.iqoption.chat.viewmodel;

import com.iqoption.core.microservices.chat.a;
import io.reactivex.b.f;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;
import kotlin.l;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "it", "Ljava/lang/Void;", "invoke"})
/* compiled from: RoomViewModel.kt */
final class RoomViewModel$sendTypingLimiter$1 extends Lambda implements b<Void, l> {
    final /* synthetic */ k this$0;

    RoomViewModel$sendTypingLimiter$1(k kVar) {
        this.this$0 = kVar;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        b((Void) obj);
        return l.eVB;
    }

    public final void b(Void voidR) {
        a.bpz.go(this.this$0.SJ()).h(com.iqoption.core.rx.i.aki()).a((f) AnonymousClass1.aYy, (f) AnonymousClass2.aYz);
    }
}
