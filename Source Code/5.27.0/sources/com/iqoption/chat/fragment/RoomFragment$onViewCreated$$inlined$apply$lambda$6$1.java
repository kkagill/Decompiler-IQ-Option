package com.iqoption.chat.fragment;

import com.iqoption.chat.fragment.v.j;
import com.iqoption.core.microservices.chat.response.e;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;
import kotlin.l;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, bng = {"<anonymous>", "", "comment", "", "invoke", "com/iqoption/chat/fragment/RoomFragment$onViewCreated$8$4$onRatingChanged$1"})
/* compiled from: RoomFragment.kt */
final class RoomFragment$onViewCreated$$inlined$apply$lambda$6$1 extends Lambda implements b<String, l> {
    final /* synthetic */ e $message;
    final /* synthetic */ int $rating;
    final /* synthetic */ j this$0;

    RoomFragment$onViewCreated$$inlined$apply$lambda$6$1(j jVar, e eVar, int i) {
        this.this$0 = jVar;
        this.$message = eVar;
        this.$rating = i;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        eL((String) obj);
        return l.eVB;
    }

    public final void eL(String str) {
        kotlin.jvm.internal.i.f(str, "comment");
        v.b(this.this$0.this$0).b(this.$message.getId(), this.$rating, str);
    }
}
