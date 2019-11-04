package com.iqoption.chat.fragment;

import android.content.Context;
import android.net.Uri;
import com.iqoption.chat.service.SendFileMessageService;
import java.util.List;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;
import kotlin.l;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "files", "", "Landroid/net/Uri;", "invoke"})
/* compiled from: RoomFragment.kt */
final class RoomFragment$pickAttachments$f$1 extends Lambda implements b<List<? extends Uri>, l> {
    final /* synthetic */ v this$0;

    RoomFragment$pickAttachments$f$1(v vVar) {
        this.this$0 = vVar;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        X((List) obj);
        return l.eVB;
    }

    public final void X(List<? extends Uri> list) {
        kotlin.jvm.internal.i.f(list, "files");
        Context context = this.this$0.getContext();
        if (context != null) {
            SendFileMessageService.b bVar = SendFileMessageService.aWl;
            kotlin.jvm.internal.i.e(context, "it");
            bVar.a(context, this.this$0.SJ(), list);
        }
    }
}
