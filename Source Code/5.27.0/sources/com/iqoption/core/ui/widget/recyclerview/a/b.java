package com.iqoption.core.ui.widget.recyclerview.a;

import com.iqoption.core.ui.widget.a.a;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\u0004\b\u0001\u0010\u00032\b\u0012\u0004\u0012\u0002H\u00030\u0004B!\b\u0016\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tB\u0019\u0012\u0006\u0010\n\u001a\u00028\u0000\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u0012J\u0019\u0010\u000f\u001a\u00020\u0010*\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u0001H&¢\u0006\u0002\u0010\u0013R\u0013\u0010\n\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\r¨\u0006\u0014"}, bng = {"Lcom/iqoption/core/ui/widget/recyclerview/viewholder/IQBindingHolder;", "Binding", "Lcom/iqoption/core/ui/widget/binding/IQBinding;", "Item", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/IQViewHolder;", "factory", "Lcom/iqoption/core/ui/widget/binding/IQBindingFactory;", "data", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/AdapterData;", "(Lcom/iqoption/core/ui/widget/binding/IQBindingFactory;Lcom/iqoption/core/ui/widget/recyclerview/viewholder/AdapterData;)V", "binding", "(Lcom/iqoption/core/ui/widget/binding/IQBinding;Lcom/iqoption/core/ui/widget/recyclerview/viewholder/AdapterData;)V", "getBinding", "()Lcom/iqoption/core/ui/widget/binding/IQBinding;", "Lcom/iqoption/core/ui/widget/binding/IQBinding;", "bind", "", "item", "(Ljava/lang/Object;)V", "(Lcom/iqoption/core/ui/widget/binding/IQBinding;Ljava/lang/Object;)V", "core_release"})
/* compiled from: IQBindingHolder.kt */
public abstract class b<Binding extends a, Item> extends c<Item> {
    private final Binding bPv;

    public abstract void a(Binding binding, Item item);

    public final Binding anc() {
        return this.bPv;
    }

    public b(Binding binding, a aVar) {
        kotlin.jvm.internal.i.f(binding, "binding");
        super(binding.getRoot(), aVar);
        this.bPv = binding;
    }

    public void bB(Item item) {
        a(this.bPv, item);
    }
}
