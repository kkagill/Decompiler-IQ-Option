package com.iqoption.chat.fragment;

import android.widget.TextView;
import com.iqoption.chat.a.bi;
import com.iqoption.chat.e;
import com.iqoption.core.microservices.chat.response.k;
import kotlin.i;
import kotlin.jvm.a.m;
import kotlin.jvm.internal.Lambda;
import kotlin.l;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006¨\u0006\u0007"}, bng = {"setTypingTitle", "", "typingUser", "", "typingUsers", "", "invoke", "com/iqoption/chat/fragment/PublicRoomTopBarDelegate$onRoomLoaded$1$2"})
/* compiled from: RoomTopBarDelegates.kt */
final class PublicRoomTopBarDelegate$onRoomLoaded$$inlined$apply$lambda$2 extends Lambda implements m<String, Integer, l> {
    final /* synthetic */ k $room$inlined;
    final /* synthetic */ bi $this_apply;
    final /* synthetic */ q this$0;

    PublicRoomTopBarDelegate$onRoomLoaded$$inlined$apply$lambda$2(bi biVar, q qVar, k kVar) {
        this.$this_apply = biVar;
        this.this$0 = qVar;
        this.$room$inlined = kVar;
        super(2);
    }

    public /* synthetic */ Object w(Object obj, Object obj2) {
        y((String) obj, ((Number) obj2).intValue());
        return l.eVB;
    }

    public final void y(String str, int i) {
        kotlin.jvm.internal.i.f(str, "typingUser");
        TextView textView = this.$this_apply.aRu;
        kotlin.jvm.internal.i.e(textView, "subtitle");
        q qVar = this.this$0;
        int i2 = e.i.typing;
        Object[] objArr = new Object[1];
        if (i > 1) {
            str = String.valueOf(i);
        }
        objArr[0] = str;
        textView.setText(qVar.a(i2, i, objArr));
    }
}
