package com.iqoption.chat.fragment;

import com.iqoption.chat.component.ac;
import com.iqoption.chat.fragment.n.b;
import com.iqoption.core.microservices.chat.response.a;
import com.iqoption.core.microservices.chat.response.e;
import java.util.List;
import kotlin.Pair;
import kotlin.i;
import kotlin.j;
import kotlin.jvm.a.m;
import kotlin.jvm.internal.Lambda;
import kotlin.l;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006¨\u0006\u0007"}, bng = {"<anonymous>", "", "message", "Lcom/iqoption/core/microservices/chat/response/ChatMessage;", "attachment", "Lcom/iqoption/core/microservices/chat/response/ChatAttachment;", "invoke", "com/iqoption/chat/fragment/RoomFragment$onViewCreated$8$7"})
/* compiled from: RoomFragment.kt */
final class RoomFragment$onViewCreated$$inlined$apply$lambda$8 extends Lambda implements m<e, a, l> {
    final /* synthetic */ v.i $attachmentInteractor;
    final /* synthetic */ RoomFragment$onViewCreated$8$6 $formatSubTitle$6;
    final /* synthetic */ RoomFragment$onViewCreated$$inlined$apply$lambda$7 $openImage$5;
    final /* synthetic */ RoomFragment$onViewCreated$$inlined$apply$lambda$3 $openMessageOptions$1;
    final /* synthetic */ ac $this_apply;
    final /* synthetic */ v this$0;

    RoomFragment$onViewCreated$$inlined$apply$lambda$8(ac acVar, RoomFragment$onViewCreated$$inlined$apply$lambda$7 roomFragment$onViewCreated$$inlined$apply$lambda$7, RoomFragment$onViewCreated$8$6 roomFragment$onViewCreated$8$6, RoomFragment$onViewCreated$$inlined$apply$lambda$3 roomFragment$onViewCreated$$inlined$apply$lambda$3, v.i iVar, v vVar) {
        this.$this_apply = acVar;
        this.$openImage$5 = roomFragment$onViewCreated$$inlined$apply$lambda$7;
        this.$formatSubTitle$6 = roomFragment$onViewCreated$8$6;
        this.$openMessageOptions$1 = roomFragment$onViewCreated$$inlined$apply$lambda$3;
        this.$attachmentInteractor = iVar;
        this.this$0 = vVar;
        super(2);
    }

    public /* synthetic */ Object w(Object obj, Object obj2) {
        a((e) obj, (a) obj2);
        return l.eVB;
    }

    public final void a(e eVar, a aVar) {
        kotlin.jvm.internal.i.f(eVar, "message");
        kotlin.jvm.internal.i.f(aVar, "attachment");
        String str;
        if (!aVar.abS()) {
            List listOf;
            RoomFragment$onViewCreated$$inlined$apply$lambda$3 roomFragment$onViewCreated$$inlined$apply$lambda$3 = this.$openMessageOptions$1;
            Object pair = new Pair(eVar, aVar);
            str = "option.download";
            if (!eVar.abU()) {
                s d = this.this$0.aUN;
                if (d != null && d.SE()) {
                    r8 = new Pair[2];
                    r8[0] = j.x("option.reply", this.$this_apply.getString(com.iqoption.chat.e.j.reply, new Object[0]));
                    r8[1] = j.x(str, this.$this_apply.getString(com.iqoption.chat.e.j.download, new Object[0]));
                    listOf = m.listOf(r8);
                    roomFragment$onViewCreated$$inlined$apply$lambda$3.b(pair, listOf, (b) this.$attachmentInteractor);
                }
            }
            listOf = l.listOf(j.x(str, this.$this_apply.getString(com.iqoption.chat.e.j.download, new Object[0])));
            roomFragment$onViewCreated$$inlined$apply$lambda$3.b(pair, listOf, (b) this.$attachmentInteractor);
        } else if (aVar.getPath() != null) {
            RoomFragment$onViewCreated$$inlined$apply$lambda$7 roomFragment$onViewCreated$$inlined$apply$lambda$7 = this.$openImage$5;
            str = com.iqoption.core.microservices.chat.response.b.c(aVar);
            if (str == null) {
                kotlin.jvm.internal.i.bnJ();
            }
            roomFragment$onViewCreated$$inlined$apply$lambda$7.ab(str, this.$formatSubTitle$6.f(eVar.acb(), eVar.getDate()));
        }
    }
}
