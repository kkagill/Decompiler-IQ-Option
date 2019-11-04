package com.iqoption.kyc.document.history;

import android.view.ViewGroup;
import com.iqoption.core.microservices.kyc.response.document.c;
import com.iqoption.core.ui.widget.recyclerview.adapter.a;
import com.iqoption.kyc.b.bk;
import com.iqoption.kyc.o.e;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0006H\u0016J\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0006H\u0016¨\u0006\u000f"}, bng = {"Lcom/iqoption/kyc/document/history/DocumentsHistoryAdapter;", "Lcom/iqoption/core/ui/widget/recyclerview/adapter/IQAdapter;", "Lcom/iqoption/kyc/document/history/DocumentHistoryHolder;", "Lcom/iqoption/core/microservices/kyc/response/document/KycDocumentHistory;", "()V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "kyc_release"})
/* compiled from: DocumentsHistoryAdapter.kt */
public final class b extends a<a, c> {
    public int getItemCount() {
        return getItems().size();
    }

    /* renamed from: M */
    public a onCreateViewHolder(ViewGroup viewGroup, int i) {
        kotlin.jvm.internal.i.f(viewGroup, "parent");
        return new a((bk) com.iqoption.core.ext.a.a(viewGroup, e.item_kyc_document, null, false, 6, null));
    }

    /* renamed from: a */
    public void onBindViewHolder(a aVar, int i) {
        kotlin.jvm.internal.i.f(aVar, "holder");
        aVar.bB(fp(i));
    }
}
