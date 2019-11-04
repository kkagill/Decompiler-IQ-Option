package com.iqoption.signals;

import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.iqoption.core.d.c;
import kotlin.f.d;
import kotlin.i;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0002¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u000e"}, bng = {"Lcom/iqoption/signals/SignalTitleViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/iqoption/signals/SignalTitleItemBinding;", "(Lcom/iqoption/signals/SignalTitleItemBinding;)V", "<set-?>", "Lcom/iqoption/signals/SignalTitleItem;", "bound", "getBound", "()Lcom/iqoption/signals/SignalTitleItem;", "setBound", "(Lcom/iqoption/signals/SignalTitleItem;)V", "bound$delegate", "Lkotlin/properties/ReadWriteProperty;", "signals_release"})
/* compiled from: SignalTitleViewHolder.kt */
public final class l extends ViewHolder {
    static final /* synthetic */ j[] anY = new j[]{k.a(new MutablePropertyReference1Impl(k.G(l.class), "bound", "getBound()Lcom/iqoption/signals/SignalTitleItem;"))};
    private final d bHX;

    public final void a(j jVar) {
        kotlin.jvm.internal.i.f(jVar, "<set-?>");
        this.bHX.a(this, anY[0], jVar);
    }

    public l(k kVar) {
        kotlin.jvm.internal.i.f(kVar, "binding");
        super(kVar.getRoot());
        this.bHX = c.j(new SignalTitleViewHolder$$special$$inlined$bindable$1(kVar));
    }
}
