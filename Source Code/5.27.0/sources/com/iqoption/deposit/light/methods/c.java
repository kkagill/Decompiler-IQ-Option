package com.iqoption.deposit.light.methods;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.iqoption.core.ext.g;
import com.iqoption.deposit.b.aj;
import kotlin.f.d;
import kotlin.i;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R+\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, bng = {"Lcom/iqoption/deposit/light/methods/ExpandCryptoViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/iqoption/deposit/databinding/ItemPaymentMethodExpandLightBinding;", "callback", "Lcom/iqoption/deposit/light/methods/OnExpandCryptoCallback;", "(Lcom/iqoption/deposit/databinding/ItemPaymentMethodExpandLightBinding;Lcom/iqoption/deposit/light/methods/OnExpandCryptoCallback;)V", "<set-?>", "Lcom/iqoption/deposit/light/methods/ExpandCryptoDepositsAdapterItem;", "bound", "getBound", "()Lcom/iqoption/deposit/light/methods/ExpandCryptoDepositsAdapterItem;", "setBound", "(Lcom/iqoption/deposit/light/methods/ExpandCryptoDepositsAdapterItem;)V", "bound$delegate", "Lkotlin/properties/ReadWriteProperty;", "deposit_release"})
/* compiled from: ExpandCryptoViewHolder.kt */
public final class c extends ViewHolder {
    static final /* synthetic */ j[] anY = new j[]{k.a(new MutablePropertyReference1Impl(k.G(c.class), "bound", "getBound()Lcom/iqoption/deposit/light/methods/ExpandCryptoDepositsAdapterItem;"))};
    private final d bHX;
    private final k cFl;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class a extends g {
        final /* synthetic */ c cFm;

        public a(c cVar) {
            this.cFm = cVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            this.cFm.cFl.asi();
        }
    }

    public final void a(a aVar) {
        kotlin.jvm.internal.i.f(aVar, "<set-?>");
        this.bHX.a(this, anY[0], aVar);
    }

    public c(aj ajVar, k kVar) {
        kotlin.jvm.internal.i.f(ajVar, "binding");
        kotlin.jvm.internal.i.f(kVar, "callback");
        super(ajVar.getRoot());
        this.cFl = kVar;
        View view = this.itemView;
        kotlin.jvm.internal.i.e(view, "itemView");
        view.setOnClickListener(new a(this));
        this.bHX = com.iqoption.core.d.c.j(new ExpandCryptoViewHolder$$special$$inlined$bindable$1(ajVar));
    }
}
