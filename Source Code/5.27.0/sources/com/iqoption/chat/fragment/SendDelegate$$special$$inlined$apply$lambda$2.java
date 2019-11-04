package com.iqoption.chat.fragment;

import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.iqoption.chat.a.bl;
import com.iqoption.chat.component.ag;
import com.iqoption.chat.e.j;
import com.iqoption.core.d;
import com.iqoption.core.ext.a;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;
import kotlin.l;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/chat/component/ResultEvent;", "invoke", "com/iqoption/chat/fragment/SendDelegate$2$2"})
/* compiled from: RoomBottomBarDelegates.kt */
final class SendDelegate$$special$$inlined$apply$lambda$2 extends Lambda implements b<ag, l> {
    final /* synthetic */ ab $lifecycleOwner$inlined;
    final /* synthetic */ s.b $params$inlined;
    final /* synthetic */ bl $this_apply;
    final /* synthetic */ ab this$0;

    SendDelegate$$special$$inlined$apply$lambda$2(bl blVar, ab abVar, ab abVar2, s.b bVar) {
        this.$this_apply = blVar;
        this.this$0 = abVar;
        this.$lifecycleOwner$inlined = abVar2;
        this.$params$inlined = bVar;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        b((ag) obj);
        return l.eVB;
    }

    public final void b(ag agVar) {
        kotlin.jvm.internal.i.f(agVar, "it");
        String str = "btnSend";
        if (agVar.RD()) {
            EditText editText = this.$this_apply.aRQ;
            kotlin.jvm.internal.i.e(editText, "messageInput");
            editText.setText((CharSequence) null);
            ProgressBar progressBar = this.$this_apply.aRR;
            kotlin.jvm.internal.i.e(progressBar, "pbSend");
            a.hide(progressBar);
            ImageView imageView = this.$this_apply.aRw;
            kotlin.jvm.internal.i.e(imageView, str);
            a.ak(imageView);
        } else {
            if (kotlin.jvm.internal.i.y("access denied", agVar.RE())) {
                d.z(this.this$0.getString(j.you_have_been_temporarily_blocked_by_a_moderator, new Object[0]), 0);
            } else {
                d.z(this.this$0.getString(j.something_went_wrong_please_try_again_later, new Object[0]), 0);
            }
        }
        this.this$0.aVs = agVar.getTime();
        ImageView imageView2 = this.$this_apply.aRw;
        kotlin.jvm.internal.i.e(imageView2, str);
        imageView2.setEnabled(true);
    }
}
