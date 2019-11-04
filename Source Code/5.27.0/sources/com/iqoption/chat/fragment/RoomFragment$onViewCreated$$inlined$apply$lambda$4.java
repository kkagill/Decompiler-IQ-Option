package com.iqoption.chat.fragment;

import com.iqoption.chat.component.ac;
import com.iqoption.core.microservices.chat.response.e;
import java.util.List;
import kotlin.Pair;
import kotlin.i;
import kotlin.j;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;
import kotlin.l;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/microservices/chat/response/ChatMessage;", "invoke", "com/iqoption/chat/fragment/RoomFragment$onViewCreated$8$2"})
/* compiled from: RoomFragment.kt */
final class RoomFragment$onViewCreated$$inlined$apply$lambda$4 extends Lambda implements b<e, l> {
    final /* synthetic */ v.e $messageInteractor;
    final /* synthetic */ RoomFragment$onViewCreated$$inlined$apply$lambda$3 $openMessageOptions$1;
    final /* synthetic */ ac $this_apply;
    final /* synthetic */ v this$0;

    RoomFragment$onViewCreated$$inlined$apply$lambda$4(ac acVar, RoomFragment$onViewCreated$$inlined$apply$lambda$3 roomFragment$onViewCreated$$inlined$apply$lambda$3, v.e eVar, v vVar) {
        this.$this_apply = acVar;
        this.$openMessageOptions$1 = roomFragment$onViewCreated$$inlined$apply$lambda$3;
        this.$messageInteractor = eVar;
        this.this$0 = vVar;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        e((e) obj);
        return l.eVB;
    }

    public final void e(e eVar) {
        kotlin.jvm.internal.i.f(eVar, "it");
        s d = this.this$0.aUN;
        if (d != null && d.SE()) {
            List listOf;
            RoomFragment$onViewCreated$$inlined$apply$lambda$3 roomFragment$onViewCreated$$inlined$apply$lambda$3 = this.$openMessageOptions$1;
            String str = "option.copy";
            if (eVar.abU()) {
                listOf = l.listOf(j.x(str, this.$this_apply.getString(com.iqoption.chat.e.j.copy, new Object[0])));
            } else {
                Pair[] pairArr = new Pair[3];
                pairArr[0] = j.x("option.replyWithText", this.$this_apply.getString(com.iqoption.chat.e.j.reply_with_text, new Object[0]));
                pairArr[1] = j.x("option.reply", this.$this_apply.getString(com.iqoption.chat.e.j.reply, new Object[0]));
                pairArr[2] = j.x(str, this.$this_apply.getString(com.iqoption.chat.e.j.copy, new Object[0]));
                listOf = m.listOf(pairArr);
            }
            roomFragment$onViewCreated$$inlined$apply$lambda$3.b((Object) eVar, listOf, (n.b) this.$messageInteractor);
        }
    }
}
