package com.iqoption.chat.fragment;

import android.widget.ImageView;
import com.iqoption.chat.a.bl;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;
import kotlin.l;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "it", "", "invoke"})
/* compiled from: RoomBottomBarDelegates.kt */
final class SendDelegate$2$updateSendButton$1 extends Lambda implements b<CharSequence, l> {
    final /* synthetic */ bl $this_apply;

    SendDelegate$2$updateSendButton$1(bl blVar) {
        this.$this_apply = blVar;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        z((CharSequence) obj);
        return l.eVB;
    }

    public final void z(CharSequence charSequence) {
        kotlin.jvm.internal.i.f(charSequence, "it");
        String str = "btnSend";
        ImageView imageView;
        if (u.Y(charSequence)) {
            imageView = this.$this_apply.aRw;
            kotlin.jvm.internal.i.e(imageView, str);
            imageView.setVisibility(8);
            imageView = this.$this_apply.aRw;
            kotlin.jvm.internal.i.e(imageView, str);
            imageView.setEnabled(false);
            return;
        }
        imageView = this.$this_apply.aRw;
        kotlin.jvm.internal.i.e(imageView, str);
        imageView.setVisibility(0);
        imageView = this.$this_apply.aRw;
        kotlin.jvm.internal.i.e(imageView, str);
        imageView.setEnabled(true);
    }
}
