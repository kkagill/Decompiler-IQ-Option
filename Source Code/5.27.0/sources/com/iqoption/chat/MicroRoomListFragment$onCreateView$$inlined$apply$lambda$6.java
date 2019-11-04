package com.iqoption.chat;

import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.iqoption.chat.a.ba;
import com.iqoption.chat.component.ad;
import com.iqoption.core.ext.a;
import com.iqoption.x.R;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, bng = {"<anonymous>", "Lcom/iqoption/chat/component/MicroRoomBinding;", "parent", "Landroid/view/ViewGroup;", "invoke", "com/iqoption/chat/MicroRoomListFragment$onCreateView$1$4"})
/* compiled from: MicroRoomListFragment.kt */
final class MicroRoomListFragment$onCreateView$$inlined$apply$lambda$6 extends Lambda implements b<ViewGroup, ad> {
    final /* synthetic */ FragmentActivity $activity$inlined;
    final /* synthetic */ c this$0;

    MicroRoomListFragment$onCreateView$$inlined$apply$lambda$6(c cVar, FragmentActivity fragmentActivity) {
        this.this$0 = cVar;
        this.$activity$inlined = fragmentActivity;
        super(1);
    }

    /* renamed from: n */
    public final ad invoke(ViewGroup viewGroup) {
        kotlin.jvm.internal.i.f(viewGroup, "parent");
        return new ad((ba) a.a(this.this$0, (int) R.layout.chat_micro_item, viewGroup, false, 4, null));
    }
}
