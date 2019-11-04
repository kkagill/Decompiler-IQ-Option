package com.iqoption.chat.fragment;

import androidx.fragment.app.Fragment;
import com.iqoption.chat.b.b;
import kotlin.i;
import kotlin.jvm.a.m;
import kotlin.jvm.internal.Lambda;
import kotlin.l;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, bng = {"openImage", "", "url", "", "subTitle", "invoke", "com/iqoption/chat/fragment/RoomFragment$onViewCreated$8$5"})
/* compiled from: RoomFragment.kt */
final class RoomFragment$onViewCreated$$inlined$apply$lambda$7 extends Lambda implements m<String, String, l> {
    final /* synthetic */ v this$0;

    RoomFragment$onViewCreated$$inlined$apply$lambda$7(v vVar) {
        this.this$0 = vVar;
        super(2);
    }

    public /* synthetic */ Object w(Object obj, Object obj2) {
        ab((String) obj, (String) obj2);
        return l.eVB;
    }

    public final void ab(String str, String str2) {
        kotlin.jvm.internal.i.f(str, "url");
        kotlin.jvm.internal.i.f(str2, "subTitle");
        b.ST().a((Fragment) this.this$0, k.aTi.aa(str, str2));
    }
}
