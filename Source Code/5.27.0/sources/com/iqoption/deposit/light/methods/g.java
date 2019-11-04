package com.iqoption.deposit.light.methods;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.iqoption.core.ui.widget.recyclerview.adapter.a;
import com.iqoption.deposit.b.aj;
import com.iqoption.deposit.b.al;
import com.iqoption.deposit.b.an;
import com.iqoption.deposit.c.b.b;
import com.iqoption.deposit.o.f;
import kotlin.TypeCastException;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, bng = {"Lcom/iqoption/deposit/light/methods/MethodsLightAdapter;", "Lcom/iqoption/core/ui/widget/recyclerview/adapter/IQAdapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/iqoption/deposit/menu/method/BaseMethodAdapterItem;", "callback", "Lcom/iqoption/deposit/light/methods/OnMethodCallbackLight;", "expandCallback", "Lcom/iqoption/deposit/light/methods/OnExpandCryptoCallback;", "(Lcom/iqoption/deposit/light/methods/OnMethodCallbackLight;Lcom/iqoption/deposit/light/methods/OnExpandCryptoCallback;)V", "getItemViewType", "", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "deposit_release"})
/* compiled from: MethodsLightAdapter.kt */
public final class g extends a<ViewHolder, com.iqoption.deposit.c.b.a> {
    private final l cFo;
    private final k cFp;

    public g(l lVar, k kVar) {
        kotlin.jvm.internal.i.f(lVar, "callback");
        kotlin.jvm.internal.i.f(kVar, "expandCallback");
        this.cFo = lVar;
        this.cFp = kVar;
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        kotlin.jvm.internal.i.f(viewGroup, "parent");
        if (i == 0) {
            return new d((al) com.iqoption.core.ext.a.a(viewGroup, f.item_payment_method_light, null, false, 6, null), this.cFo);
        } else if (i == 1) {
            return new f((an) com.iqoption.core.ext.a.a(viewGroup, f.item_payment_method_title_light, null, false, 6, null));
        } else if (i == 2) {
            return new c((aj) com.iqoption.core.ext.a.a(viewGroup, f.item_payment_method_expand_light, null, false, 6, null), this.cFp);
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unexpected case ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        kotlin.jvm.internal.i.f(viewHolder, "holder");
        com.iqoption.deposit.c.b.a aVar = (com.iqoption.deposit.c.b.a) fp(i);
        int asd = aVar.asd();
        if (asd == 0) {
            d dVar = (d) viewHolder;
            if (aVar != null) {
                dVar.a((b) aVar);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.iqoption.deposit.menu.method.MethodAdapterItem");
        } else if (asd == 1) {
            f fVar = (f) viewHolder;
            if (aVar != null) {
                fVar.a((e) aVar);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.iqoption.deposit.light.methods.MethodTitleAdapterItem");
        } else if (asd == 2) {
            c cVar = (c) viewHolder;
            if (aVar != null) {
                cVar.a((a) aVar);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.iqoption.deposit.light.methods.ExpandCryptoDepositsAdapterItem");
        }
    }

    public int getItemViewType(int i) {
        return ((com.iqoption.deposit.c.b.a) fp(i)).asd();
    }
}
