package com.iqoption.charttools.constructor.a;

import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.iqoption.core.ui.widget.a.a;
import kotlin.TypeCastException;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0017\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB\r\u0012\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0002\u0010\nR\u0013\u0010\t\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0012\u001a\u00020\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0012\u0010\u0016\u001a\u00020\u0017X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u001bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, bng = {"Lcom/iqoption/charttools/constructor/viewholder/InputBinding;", "Binding", "Landroidx/databinding/ViewDataBinding;", "Lcom/iqoption/core/ui/widget/binding/IQBinding;", "layout", "", "parent", "Landroid/view/ViewGroup;", "(ILandroid/view/ViewGroup;)V", "binding", "(Landroidx/databinding/ViewDataBinding;)V", "getBinding", "()Landroidx/databinding/ViewDataBinding;", "Landroidx/databinding/ViewDataBinding;", "content", "Landroid/widget/LinearLayout;", "getContent", "()Landroid/widget/LinearLayout;", "input", "Landroid/widget/EditText;", "getInput", "()Landroid/widget/EditText;", "label", "Landroid/widget/TextView;", "getLabel", "()Landroid/widget/TextView;", "root", "Landroid/view/View;", "getRoot", "()Landroid/view/View;", "techtools_release"})
/* compiled from: InputFieldBindings.kt */
public abstract class f<Binding extends ViewDataBinding> implements a {
    private final View aGn;
    private final LinearLayout aGo;
    private final Binding amm;

    public abstract TextView Nw();

    public abstract EditText Nx();

    public f(Binding binding) {
        kotlin.jvm.internal.i.f(binding, "binding");
        this.amm = binding;
        View root = this.amm.getRoot();
        kotlin.jvm.internal.i.e(root, "binding.root");
        this.aGn = root;
        root = this.amm.getRoot();
        if (root != null) {
            this.aGo = (LinearLayout) root;
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout");
    }

    public final Binding getBinding() {
        return this.amm;
    }

    public f(int i, ViewGroup viewGroup) {
        kotlin.jvm.internal.i.f(viewGroup, "parent");
        this(com.iqoption.core.ext.a.a(viewGroup, i, null, false, 6, null));
    }

    public View getRoot() {
        return this.aGn;
    }

    public final LinearLayout Nv() {
        return this.aGo;
    }
}
