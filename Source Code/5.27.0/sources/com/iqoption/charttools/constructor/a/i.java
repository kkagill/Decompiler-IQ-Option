package com.iqoption.charttools.constructor.a;

import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.iqoption.charttools.b.q;
import com.iqoption.charttools.n.h;

@kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, bng = {"Lcom/iqoption/charttools/constructor/viewholder/InputFieldBinding;", "Lcom/iqoption/charttools/constructor/viewholder/InputBinding;", "Lcom/iqoption/charttools/databinding/IndicatorConstructorInputFieldBinding;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "input", "Landroid/widget/EditText;", "getInput", "()Landroid/widget/EditText;", "label", "Landroid/widget/TextView;", "getLabel", "()Landroid/widget/TextView;", "techtools_release"})
/* compiled from: InputFieldBindings.kt */
public final class i extends f<q> {
    private final EditText aGq;
    private final TextView aoo;

    public i(ViewGroup viewGroup) {
        kotlin.jvm.internal.i.f(viewGroup, "parent");
        super(h.indicator_constructor_input_field, viewGroup);
        TextView textView = ((q) getBinding()).aoo;
        kotlin.jvm.internal.i.e(textView, "binding.label");
        this.aoo = textView;
        EditText editText = ((q) getBinding()).aGq;
        kotlin.jvm.internal.i.e(editText, "binding.input");
        this.aGq = editText;
    }

    public TextView Nw() {
        return this.aoo;
    }

    public EditText Nx() {
        return this.aGq;
    }
}
