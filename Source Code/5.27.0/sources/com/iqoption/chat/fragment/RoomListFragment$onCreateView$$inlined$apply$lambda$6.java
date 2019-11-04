package com.iqoption.chat.fragment;

import android.view.ViewGroup;
import com.iqoption.chat.a.as;
import com.iqoption.chat.component.al;
import com.iqoption.chat.e.h;
import com.iqoption.core.ext.a;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, bng = {"<anonymous>", "Lcom/iqoption/chat/component/SimpleRoomBinding;", "parent", "Landroid/view/ViewGroup;", "invoke", "com/iqoption/chat/fragment/RoomListFragment$onCreateView$1$4"})
/* compiled from: RoomListFragment.kt */
final class RoomListFragment$onCreateView$$inlined$apply$lambda$6 extends Lambda implements b<ViewGroup, al> {
    final /* synthetic */ w this$0;

    RoomListFragment$onCreateView$$inlined$apply$lambda$6(w wVar) {
        this.this$0 = wVar;
        super(1);
    }

    /* renamed from: o */
    public final al invoke(ViewGroup viewGroup) {
        kotlin.jvm.internal.i.f(viewGroup, "parent");
        return new al((as) a.a(this.this$0, h.chat_item, viewGroup, false, 4, null));
    }
}
