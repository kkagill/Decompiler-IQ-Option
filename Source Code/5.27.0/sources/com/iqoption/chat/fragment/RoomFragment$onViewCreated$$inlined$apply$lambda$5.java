package com.iqoption.chat.fragment;

import androidx.fragment.app.Fragment;
import com.iqoption.core.microservices.chat.response.e;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;
import kotlin.l;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/microservices/chat/response/ChatMessage;", "invoke", "com/iqoption/chat/fragment/RoomFragment$onViewCreated$8$3"})
/* compiled from: RoomFragment.kt */
final class RoomFragment$onViewCreated$$inlined$apply$lambda$5 extends Lambda implements b<e, l> {
    final /* synthetic */ v this$0;

    RoomFragment$onViewCreated$$inlined$apply$lambda$5(v vVar) {
        this.this$0 = vVar;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        e((e) obj);
        return l.eVB;
    }

    public final void e(e eVar) {
        kotlin.jvm.internal.i.f(eVar, "it");
        if (!eVar.ach() && !eVar.acg()) {
            long acc = eVar.acc();
            String ace = eVar.ace();
            com.iqoption.chat.b.b.ST().a((Fragment) this.this$0, ae.aVD.m(acc, ace != null ? Long.parseLong(ace) : -1));
        }
    }
}
