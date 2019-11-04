package com.iqoption.deposit.light.methods;

import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.iqoption.core.d.c;
import com.iqoption.deposit.b.an;
import kotlin.f.d;
import kotlin.i;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0002¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u000e"}, bng = {"Lcom/iqoption/deposit/light/methods/MethodTitleLightViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/iqoption/deposit/databinding/ItemPaymentMethodTitleLightBinding;", "(Lcom/iqoption/deposit/databinding/ItemPaymentMethodTitleLightBinding;)V", "<set-?>", "Lcom/iqoption/deposit/light/methods/MethodTitleAdapterItem;", "bound", "getBound", "()Lcom/iqoption/deposit/light/methods/MethodTitleAdapterItem;", "setBound", "(Lcom/iqoption/deposit/light/methods/MethodTitleAdapterItem;)V", "bound$delegate", "Lkotlin/properties/ReadWriteProperty;", "deposit_release"})
/* compiled from: MethodTitleLightViewHolder.kt */
public final class f extends ViewHolder {
    static final /* synthetic */ j[] anY = new j[]{k.a(new MutablePropertyReference1Impl(k.G(f.class), "bound", "getBound()Lcom/iqoption/deposit/light/methods/MethodTitleAdapterItem;"))};
    private final d bHX;

    public final void a(e eVar) {
        kotlin.jvm.internal.i.f(eVar, "<set-?>");
        this.bHX.a(this, anY[0], eVar);
    }

    public f(an anVar) {
        kotlin.jvm.internal.i.f(anVar, "binding");
        super(anVar.getRoot());
        this.bHX = c.j(new MethodTitleLightViewHolder$$special$$inlined$bindable$1(anVar, anVar));
    }
}
