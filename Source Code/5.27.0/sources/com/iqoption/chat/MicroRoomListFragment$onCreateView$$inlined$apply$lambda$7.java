package com.iqoption.chat;

import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;
import kotlin.l;

@i(bne = {1, 1, 15}, bnf = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, bng = {"<anonymous>", "", "invoke", "com/iqoption/chat/MicroRoomListFragment$onCreateView$1$5"})
/* compiled from: MicroRoomListFragment.kt */
final class MicroRoomListFragment$onCreateView$$inlined$apply$lambda$7 extends Lambda implements a<l> {
    final /* synthetic */ FragmentActivity $activity$inlined;
    final /* synthetic */ c this$0;

    MicroRoomListFragment$onCreateView$$inlined$apply$lambda$7(c cVar, FragmentActivity fragmentActivity) {
        this.this$0 = cVar;
        this.$activity$inlined = fragmentActivity;
        super(0);
    }

    public /* synthetic */ Object invoke() {
        MY();
        return l.eVB;
    }

    public final void MY() {
        RecyclerView recyclerView = c.d(this.this$0).aRZ;
        kotlin.jvm.internal.i.e(recyclerView, "binding.chatList");
        recyclerView.setAdapter(c.c(this.this$0));
        c.d(this.this$0).aRZ.scheduleLayoutAnimation();
    }
}
