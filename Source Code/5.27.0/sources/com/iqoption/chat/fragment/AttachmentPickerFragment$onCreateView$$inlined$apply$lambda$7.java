package com.iqoption.chat.fragment;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.iqoption.chat.component.c;
import com.iqoption.chat.viewmodel.n;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;
import kotlin.l;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/chat/viewmodel/SelectEvent;", "invoke", "com/iqoption/chat/fragment/AttachmentPickerFragment$onCreateView$1$7"})
/* compiled from: AttachmentPickerFragment.kt */
final class AttachmentPickerFragment$onCreateView$$inlined$apply$lambda$7 extends Lambda implements b<n, l> {
    final /* synthetic */ FragmentActivity $activity$inlined;
    final /* synthetic */ c $adapter;
    final /* synthetic */ Bundle $savedInstanceState$inlined;
    final /* synthetic */ a this$0;

    AttachmentPickerFragment$onCreateView$$inlined$apply$lambda$7(c cVar, a aVar, FragmentActivity fragmentActivity, Bundle bundle) {
        this.$adapter = cVar;
        this.this$0 = aVar;
        this.$activity$inlined = fragmentActivity;
        this.$savedInstanceState$inlined = bundle;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        b((n) obj);
        return l.eVB;
    }

    public final void b(n nVar) {
        kotlin.jvm.internal.i.f(nVar, "it");
        this.this$0.aSo = nVar.getTime();
        this.$adapter.b(nVar.TW());
    }
}
