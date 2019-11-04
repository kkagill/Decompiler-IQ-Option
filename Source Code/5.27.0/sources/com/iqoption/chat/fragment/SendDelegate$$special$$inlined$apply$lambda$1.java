package com.iqoption.chat.fragment;

import com.iqoption.chat.component.ag;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/chat/component/ResultEvent;", "invoke", "com/iqoption/chat/fragment/SendDelegate$2$1"})
/* compiled from: RoomBottomBarDelegates.kt */
final class SendDelegate$$special$$inlined$apply$lambda$1 extends Lambda implements b<ag, Boolean> {
    final /* synthetic */ ab $lifecycleOwner$inlined;
    final /* synthetic */ s.b $params$inlined;
    final /* synthetic */ ab this$0;

    SendDelegate$$special$$inlined$apply$lambda$1(ab abVar, ab abVar2, s.b bVar) {
        this.this$0 = abVar;
        this.$lifecycleOwner$inlined = abVar2;
        this.$params$inlined = bVar;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(a((ag) obj));
    }

    public final boolean a(ag agVar) {
        kotlin.jvm.internal.i.f(agVar, "it");
        return agVar.getTime() > this.this$0.aVs;
    }
}
