package com.iqoption.bottomsheet;

import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import java.util.HashMap;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0015\u0010\u000f\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\u000eH&¢\u0006\u0002\u0010\u0010R\u001c\u0010\u0005\u001a\u00028\u0000X.¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u0011"}, bng = {"Lcom/iqoption/bottomsheet/BindingBottomSheetFragment;", "BindingType", "Landroidx/databinding/ViewDataBinding;", "Lcom/iqoption/bottomsheet/BottomSheetFragment;", "()V", "binding", "getBinding", "()Landroidx/databinding/ViewDataBinding;", "setBinding", "(Landroidx/databinding/ViewDataBinding;)V", "Landroidx/databinding/ViewDataBinding;", "provideView", "Landroid/view/View;", "container", "Landroid/view/ViewGroup;", "provideViewBinding", "(Landroid/view/ViewGroup;)Landroidx/databinding/ViewDataBinding;", "dialogs_release"})
/* compiled from: BindingBottomSheetFragment.kt */
public abstract class a<BindingType extends ViewDataBinding> extends c {
    protected BindingType amm;
    private HashMap apm;

    public void Bj() {
        HashMap hashMap = this.apm;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public abstract BindingType j(ViewGroup viewGroup);

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        Bj();
    }

    /* Access modifiers changed, original: protected|final */
    public final BindingType getBinding() {
        ViewDataBinding viewDataBinding = this.amm;
        if (viewDataBinding == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        return viewDataBinding;
    }

    public View i(ViewGroup viewGroup) {
        kotlin.jvm.internal.i.f(viewGroup, "container");
        this.amm = j(viewGroup);
        ViewDataBinding viewDataBinding = this.amm;
        if (viewDataBinding == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        View root = viewDataBinding.getRoot();
        kotlin.jvm.internal.i.e(root, "binding.root");
        return root;
    }
}
