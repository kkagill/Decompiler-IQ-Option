package com.iqoption.core.ui.widget.recyclerview.a;

import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import com.iqoption.core.ext.a;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\u0004\b\u0001\u0010\u00032\b\u0012\u0004\u0012\u0002H\u00030\u0004B#\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bB\u0019\u0012\u0006\u0010\f\u001a\u00028\u0000\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u0014J%\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00028\u00012\u000e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0016H\u0016¢\u0006\u0002\u0010\u0018J\u0019\u0010\u0011\u001a\u00020\u0012*\u00028\u00002\u0006\u0010\u0013\u001a\u00028\u0001H&¢\u0006\u0002\u0010\u0019J)\u0010\u0011\u001a\u00020\u0012*\u00028\u00002\u0006\u0010\u0013\u001a\u00028\u00012\u000e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0016H\u0014¢\u0006\u0002\u0010\u001aR\u0013\u0010\f\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, bng = {"Lcom/iqoption/core/ui/widget/recyclerview/viewholder/VDBindingHolder;", "VDBinding", "Landroidx/databinding/ViewDataBinding;", "Item", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/IQViewHolder;", "layout", "", "parent", "Landroid/view/ViewGroup;", "data", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/AdapterData;", "(ILandroid/view/ViewGroup;Lcom/iqoption/core/ui/widget/recyclerview/viewholder/AdapterData;)V", "binding", "(Landroidx/databinding/ViewDataBinding;Lcom/iqoption/core/ui/widget/recyclerview/viewholder/AdapterData;)V", "getBinding", "()Landroidx/databinding/ViewDataBinding;", "Landroidx/databinding/ViewDataBinding;", "bind", "", "item", "(Ljava/lang/Object;)V", "payloads", "", "", "(Ljava/lang/Object;Ljava/util/List;)V", "(Landroidx/databinding/ViewDataBinding;Ljava/lang/Object;)V", "(Landroidx/databinding/ViewDataBinding;Ljava/lang/Object;Ljava/util/List;)V", "core_release"})
/* compiled from: VDBindingHolder.kt */
public abstract class e<VDBinding extends ViewDataBinding, Item> extends c<Item> {
    private final VDBinding amm;

    public abstract void a(VDBinding vDBinding, Item item);

    public final VDBinding getBinding() {
        return this.amm;
    }

    public /* synthetic */ e(ViewDataBinding viewDataBinding, a aVar, int i, f fVar) {
        if ((i & 2) != 0) {
            aVar = (a) null;
        }
        this(viewDataBinding, aVar);
    }

    public e(VDBinding vDBinding, a aVar) {
        kotlin.jvm.internal.i.f(vDBinding, "binding");
        View root = vDBinding.getRoot();
        kotlin.jvm.internal.i.e(root, "binding.root");
        super(root, aVar);
        this.amm = vDBinding;
    }

    public e(int i, ViewGroup viewGroup, a aVar) {
        kotlin.jvm.internal.i.f(viewGroup, "parent");
        this(a.a(viewGroup, i, null, false, 6, null), aVar);
    }

    public /* synthetic */ e(int i, ViewGroup viewGroup, a aVar, int i2, f fVar) {
        if ((i2 & 4) != 0) {
            aVar = (a) null;
        }
        this(i, viewGroup, aVar);
    }

    public void bB(Item item) {
        a(this.amm, (Object) item);
    }

    public void a(Item item, List<? extends Object> list) {
        kotlin.jvm.internal.i.f(list, "payloads");
        a(this.amm, item, list);
    }

    /* Access modifiers changed, original: protected */
    public void a(VDBinding vDBinding, Item item, List<? extends Object> list) {
        kotlin.jvm.internal.i.f(vDBinding, "$this$bind");
        kotlin.jvm.internal.i.f(list, "payloads");
        a((ViewDataBinding) vDBinding, (Object) item);
    }
}
