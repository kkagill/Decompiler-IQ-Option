package com.iqoption.chat.fragment;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.iqoption.chat.a.c;
import com.iqoption.chat.e.j;
import com.iqoption.chat.viewmodel.b;
import com.iqoption.core.d;
import kotlin.i;
import kotlin.jvm.a.m;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006¨\u0006\u0007"}, bng = {"<anonymous>", "", "<anonymous parameter 0>", "Lcom/iqoption/chat/databinding/ChatAttachmentImageItemBinding;", "preview", "Lcom/iqoption/chat/viewmodel/AttachmentPreview;", "invoke", "com/iqoption/chat/fragment/AttachmentPickerFragment$onCreateView$1$adapter$1"})
/* compiled from: AttachmentPickerFragment.kt */
final class AttachmentPickerFragment$onCreateView$$inlined$apply$lambda$3 extends Lambda implements m<c, b, Boolean> {
    final /* synthetic */ FragmentActivity $activity$inlined;
    final /* synthetic */ Bundle $savedInstanceState$inlined;
    final /* synthetic */ a this$0;

    AttachmentPickerFragment$onCreateView$$inlined$apply$lambda$3(a aVar, FragmentActivity fragmentActivity, Bundle bundle) {
        this.this$0 = aVar;
        this.$activity$inlined = fragmentActivity;
        this.$savedInstanceState$inlined = bundle;
        super(2);
    }

    public /* synthetic */ Object w(Object obj, Object obj2) {
        return Boolean.valueOf(a((c) obj, (b) obj2));
    }

    public final boolean a(c cVar, b bVar) {
        kotlin.jvm.internal.i.f(cVar, "<anonymous parameter 0>");
        kotlin.jvm.internal.i.f(bVar, "preview");
        Integer num = (Integer) a.b(this.this$0).Tb().getValue();
        if (num == null || num.intValue() != 3 || bVar.isSelected()) {
            a.b(this.this$0).i(bVar);
            return true;
        }
        String string = this.this$0.getString(j.you_can_send_maximum);
        kotlin.jvm.internal.i.e(string, "getString(R.string.you_can_send_maximum)");
        d.z(string, 0);
        return false;
    }
}
