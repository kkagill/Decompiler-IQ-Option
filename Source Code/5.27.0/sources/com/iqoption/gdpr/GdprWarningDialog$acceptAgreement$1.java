package com.iqoption.gdpr;

import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;
import kotlin.l;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "it", "Ljava/lang/Void;", "invoke"})
/* compiled from: GdprWarningDialog.kt */
final class GdprWarningDialog$acceptAgreement$1 extends Lambda implements b<Void, l> {
    final /* synthetic */ c this$0;

    GdprWarningDialog$acceptAgreement$1(c cVar) {
        this.this$0 = cVar;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        b((Void) obj);
        return l.eVB;
    }

    public final void b(Void voidR) {
        if (this.this$0.getActivity() != null) {
            this.this$0.onClose();
        }
    }
}
