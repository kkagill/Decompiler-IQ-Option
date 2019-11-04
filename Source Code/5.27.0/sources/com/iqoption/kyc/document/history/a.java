package com.iqoption.kyc.document.history;

import android.widget.TextView;
import com.iqoption.core.microservices.kyc.response.document.DocumentStatus;
import com.iqoption.core.microservices.kyc.response.document.c;
import com.iqoption.core.ui.widget.recyclerview.a.e;
import com.iqoption.kyc.b.bk;
import com.iqoption.kyc.o.f;
import kotlin.TypeCastException;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0002\u0010\u0005J\u0014\u0010\u0006\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\b\u001a\u00020\u0003H\u0016¨\u0006\t"}, bng = {"Lcom/iqoption/kyc/document/history/DocumentHistoryHolder;", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/VDBindingHolder;", "Lcom/iqoption/kyc/databinding/ItemKycDocumentBinding;", "Lcom/iqoption/core/microservices/kyc/response/document/KycDocumentHistory;", "binding", "(Lcom/iqoption/kyc/databinding/ItemKycDocumentBinding;)V", "bind", "", "item", "kyc_release"})
/* compiled from: DocumentHistoryHolder.kt */
public final class a extends e<bk, c> {
    public a(bk bkVar) {
        kotlin.jvm.internal.i.f(bkVar, "binding");
        super(bkVar, null, 2, null);
    }

    public void a(bk bkVar, c cVar) {
        int i;
        kotlin.jvm.internal.i.f(bkVar, "$this$bind");
        kotlin.jvm.internal.i.f(cVar, "item");
        TextView textView = bkVar.dwm;
        kotlin.jvm.internal.i.e(textView, "kycDocumentCreatedAt");
        textView.setText(cVar.aeQ());
        if (cVar.aeN() == DocumentStatus.APPROVED) {
            i = com.iqoption.kyc.o.a.green;
        } else {
            i = com.iqoption.kyc.o.a.white;
        }
        bkVar.cpl.setTextColor(com.iqoption.core.ext.a.k(getContext(), i));
        textView = bkVar.cpl;
        kotlin.jvm.internal.i.e(textView, "kycDocumentStatus");
        textView.setText(cVar.aeS());
        String str = "kycDocumentExpired";
        if (cVar.isExpired()) {
            textView = bkVar.dwo;
            kotlin.jvm.internal.i.e(textView, str);
            String string = getContext().getString(f.expired);
            kotlin.jvm.internal.i.e(string, "context.getString(R.string.expired)");
            if (string != null) {
                string = string.toLowerCase();
                kotlin.jvm.internal.i.e(string, "(this as java.lang.String).toLowerCase()");
                textView.setText(string);
                textView = bkVar.dwo;
                kotlin.jvm.internal.i.e(textView, str);
                com.iqoption.core.ext.a.ak(textView);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
        }
        textView = bkVar.dwo;
        kotlin.jvm.internal.i.e(textView, str);
        com.iqoption.core.ext.a.al(textView);
        textView = bkVar.dwp;
        kotlin.jvm.internal.i.e(textView, "kycDocumentUpdatedAt");
        textView.setText(cVar.aeR());
        TextView textView2 = bkVar.duK;
        kotlin.jvm.internal.i.e(textView2, "kycDocumentComment");
        textView2.setText(cVar.getComment());
    }
}
