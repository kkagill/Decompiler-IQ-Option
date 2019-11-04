package com.iqoption.chat.fragment;

import com.iqoption.chat.viewmodel.e;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;
import kotlin.l;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/chat/viewmodel/FileItem;", "invoke", "com/iqoption/chat/fragment/FilePickerFragment$onCreateView$1$adapter$1"})
/* compiled from: FilePickerFragment.kt */
final class FilePickerFragment$onCreateView$$inlined$apply$lambda$1 extends Lambda implements b<e, l> {
    final /* synthetic */ j this$0;

    FilePickerFragment$onCreateView$$inlined$apply$lambda$1(j jVar) {
        this.this$0 = jVar;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        c((e) obj);
        return l.eVB;
    }

    public final void c(e eVar) {
        kotlin.jvm.internal.i.f(eVar, "it");
        if (eVar.fI().isDirectory()) {
            j.a(this.this$0).r(eVar.fI());
            return;
        }
        b b = this.this$0.aOC;
        if (b != null) {
            l lVar = (l) b.invoke(eVar.fI());
        }
        this.this$0.close();
    }
}
