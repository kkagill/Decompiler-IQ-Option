package com.iqoption.core.ui.country;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.iqoption.core.d.c;
import com.iqoption.core.ext.g;
import kotlin.f.d;
import kotlin.i;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R+\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0010"}, bng = {"Lcom/iqoption/core/ui/country/CountryHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/iqoption/core/databinding/ItemCountrySuggestBinding;", "clickListener", "Lcom/iqoption/core/ui/country/OnCountryClickListener;", "(Lcom/iqoption/core/databinding/ItemCountrySuggestBinding;Lcom/iqoption/core/ui/country/OnCountryClickListener;)V", "<set-?>", "Lcom/iqoption/core/ui/country/CountryItem;", "bound", "getBound", "()Lcom/iqoption/core/ui/country/CountryItem;", "setBound", "(Lcom/iqoption/core/ui/country/CountryItem;)V", "bound$delegate", "Lkotlin/properties/ReadWriteProperty;", "core_release"})
/* compiled from: CountryHolder.kt */
public final class b extends ViewHolder {
    static final /* synthetic */ j[] anY = new j[]{k.a(new MutablePropertyReference1Impl(k.G(b.class), "bound", "getBound()Lcom/iqoption/core/ui/country/CountryItem;"))};
    private final d bHX;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class a extends g {
        final /* synthetic */ b bHY;
        final /* synthetic */ h bHZ;

        public a(b bVar, h hVar) {
            this.bHY = bVar;
            this.bHZ = hVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            this.bHZ.c(this.bHY.alc().LB());
        }
    }

    public final void a(c cVar) {
        kotlin.jvm.internal.i.f(cVar, "<set-?>");
        this.bHX.a(this, anY[0], cVar);
    }

    public final c alc() {
        return (c) this.bHX.b(this, anY[0]);
    }

    public b(com.iqoption.core.a.j jVar, h hVar) {
        kotlin.jvm.internal.i.f(jVar, "binding");
        kotlin.jvm.internal.i.f(hVar, "clickListener");
        super(jVar.getRoot());
        View view = this.itemView;
        kotlin.jvm.internal.i.e(view, "itemView");
        view.setOnClickListener(new a(this, hVar));
        this.bHX = c.j(new CountryHolder$$special$$inlined$bindable$1(jVar, jVar));
    }
}
