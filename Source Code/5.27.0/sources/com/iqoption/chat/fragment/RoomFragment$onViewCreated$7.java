package com.iqoption.chat.fragment;

import com.iqoption.chat.component.af;
import com.iqoption.chat.e.j;
import com.iqoption.core.d;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;
import kotlin.l;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/chat/component/RateSupportEvent;", "invoke"})
/* compiled from: RoomFragment.kt */
final class RoomFragment$onViewCreated$7 extends Lambda implements b<af, l> {
    final /* synthetic */ v this$0;

    RoomFragment$onViewCreated$7(v vVar) {
        this.this$0 = vVar;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        b((af) obj);
        return l.eVB;
    }

    public final void b(af afVar) {
        kotlin.jvm.internal.i.f(afVar, "it");
        String string;
        if (afVar.RD()) {
            string = this.this$0.getString(j.thank_you_your_feedback_is_highly_appreciated);
            kotlin.jvm.internal.i.e(string, "getString(R.string.thank…ck_is_highly_appreciated)");
            d.z(string, 0);
        } else {
            string = this.this$0.getString(j.you_can_not_rate_this_conversation);
            kotlin.jvm.internal.i.e(string, "getString(R.string.you_c…t_rate_this_conversation)");
            d.z(string, 0);
            v.h(this.this$0).eW(afVar.RA());
        }
        this.this$0.aUQ = afVar.getTime();
    }
}
