package com.iqoption.charttools.constructor.a;

import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.iqoption.charttools.b.w;
import com.iqoption.charttools.n.h;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\rX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, bng = {"Lcom/iqoption/charttools/constructor/viewholder/InputStepFieldBinding;", "Lcom/iqoption/charttools/constructor/viewholder/InputBinding;", "Lcom/iqoption/charttools/databinding/IndicatorConstructorInputStepFieldBinding;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "btnMinus", "Landroid/view/View;", "getBtnMinus", "()Landroid/view/View;", "btnPlus", "getBtnPlus", "input", "Landroid/widget/EditText;", "getInput", "()Landroid/widget/EditText;", "label", "Landroid/widget/TextView;", "getLabel", "()Landroid/widget/TextView;", "techtools_release"})
/* compiled from: InputFieldBindings.kt */
public final class n extends f<w> {
    private final EditText aGq;
    private final View aGw;
    private final View aGx;
    private final TextView aoo;

    public n(ViewGroup viewGroup) {
        kotlin.jvm.internal.i.f(viewGroup, "parent");
        super(h.indicator_constructor_input_step_field, viewGroup);
        TextView textView = ((w) getBinding()).aoo;
        kotlin.jvm.internal.i.e(textView, "binding.label");
        this.aoo = textView;
        EditText editText = ((w) getBinding()).aGq;
        kotlin.jvm.internal.i.e(editText, "binding.input");
        this.aGq = editText;
        ImageView imageView = ((w) getBinding()).aoB;
        kotlin.jvm.internal.i.e(imageView, "binding.btnMinus");
        this.aGw = imageView;
        imageView = ((w) getBinding()).aoC;
        kotlin.jvm.internal.i.e(imageView, "binding.btnPlus");
        this.aGx = imageView;
    }

    public TextView Nw() {
        return this.aoo;
    }

    public EditText Nx() {
        return this.aGq;
    }

    public final View NA() {
        return this.aGw;
    }

    public final View NB() {
        return this.aGx;
    }
}
