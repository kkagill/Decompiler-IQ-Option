package com.iqoption.deposit.light.menu.currency;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.iqoption.core.d.c;
import com.iqoption.core.ext.g;
import com.iqoption.deposit.b.ah;
import kotlin.f.d;
import kotlin.i;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R+\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0010"}, bng = {"Lcom/iqoption/deposit/light/menu/currency/CurrencyLightViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/iqoption/deposit/databinding/ItemCurrencyLightBinding;", "clickListener", "Lcom/iqoption/deposit/menu/method/OnCurrencyClickListener;", "(Lcom/iqoption/deposit/databinding/ItemCurrencyLightBinding;Lcom/iqoption/deposit/menu/method/OnCurrencyClickListener;)V", "<set-?>", "Lcom/iqoption/deposit/menu/currency/CurrencyAdapterItem;", "bound", "getBound", "()Lcom/iqoption/deposit/menu/currency/CurrencyAdapterItem;", "setBound", "(Lcom/iqoption/deposit/menu/currency/CurrencyAdapterItem;)V", "bound$delegate", "Lkotlin/properties/ReadWriteProperty;", "deposit_release"})
/* compiled from: CurrencyLightViewHolder.kt */
public final class b extends ViewHolder {
    static final /* synthetic */ j[] anY = new j[]{k.a(new MutablePropertyReference1Impl(k.G(b.class), "bound", "getBound()Lcom/iqoption/deposit/menu/currency/CurrencyAdapterItem;"))};
    private final d bHX;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class a extends g {
        final /* synthetic */ b cEY;
        final /* synthetic */ com.iqoption.deposit.c.b.d cEZ;

        public a(b bVar, com.iqoption.deposit.c.b.d dVar) {
            this.cEY = bVar;
            this.cEZ = dVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            this.cEZ.c(this.cEY.arY().asR());
        }
    }

    public final void a(com.iqoption.deposit.c.a.a aVar) {
        kotlin.jvm.internal.i.f(aVar, "<set-?>");
        this.bHX.a(this, anY[0], aVar);
    }

    public final com.iqoption.deposit.c.a.a arY() {
        return (com.iqoption.deposit.c.a.a) this.bHX.b(this, anY[0]);
    }

    public b(ah ahVar, com.iqoption.deposit.c.b.d dVar) {
        kotlin.jvm.internal.i.f(ahVar, "binding");
        kotlin.jvm.internal.i.f(dVar, "clickListener");
        super(ahVar.getRoot());
        View view = this.itemView;
        kotlin.jvm.internal.i.e(view, "itemView");
        view.setOnClickListener(new a(this, dVar));
        this.bHX = c.j(new CurrencyLightViewHolder$$special$$inlined$bindable$1(ahVar, ahVar));
    }
}
