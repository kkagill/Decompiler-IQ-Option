package com.iqoption.chat.fragment;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;
import kotlin.l;

@i(bne = {1, 1, 15}, bnf = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, bng = {"<anonymous>", "", "invoke", "com/iqoption/chat/fragment/RoomListFragment$onCreateView$1$5"})
/* compiled from: RoomListFragment.kt */
final class RoomListFragment$onCreateView$$inlined$apply$lambda$7 extends Lambda implements a<l> {
    final /* synthetic */ w this$0;

    RoomListFragment$onCreateView$$inlined$apply$lambda$7(w wVar) {
        this.this$0 = wVar;
        super(0);
    }

    public /* synthetic */ Object invoke() {
        MY();
        return l.eVB;
    }

    public final void MY() {
        RecyclerView recyclerView = w.d(this.this$0).aRZ;
        kotlin.jvm.internal.i.e(recyclerView, "binding.chatList");
        recyclerView.setAdapter(w.c(this.this$0));
        w.d(this.this$0).aRZ.scheduleLayoutAnimation();
    }
}
