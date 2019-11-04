package com.iqoption.charttools.constructor.a;

import android.text.Editable;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import androidx.core.view.InputDeviceCompat;
import com.iqoption.charttools.constructor.l;
import com.iqoption.core.ext.g;
import com.iqoption.core.util.ah;
import com.iqoption.core.util.v;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b&\u0018\u0000 \u000f*\f\b\u0000\u0010\u0001*\u0006\u0012\u0002\b\u00030\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0005:\u0001\u000fB\u0015\u0012\u0006\u0010\u0006\u001a\u00028\u0000\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0019\u0010\n\u001a\u00020\u000b*\u00028\u00002\u0006\u0010\f\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\rJ\u0019\u0010\u000e\u001a\u00020\u000b*\u00028\u00002\u0006\u0010\f\u001a\u00020\u0004H\u0004¢\u0006\u0002\u0010\r¨\u0006\u0010"}, bng = {"Lcom/iqoption/charttools/constructor/viewholder/AbsInputFieldViewHolder;", "Binding", "Lcom/iqoption/charttools/constructor/viewholder/InputBinding;", "Item", "Lcom/iqoption/charttools/constructor/InputField;", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/IQBindingHolder;", "binding", "data", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/AdapterData;", "(Lcom/iqoption/charttools/constructor/viewholder/InputBinding;Lcom/iqoption/core/ui/widget/recyclerview/viewholder/AdapterData;)V", "bind", "", "item", "(Lcom/iqoption/charttools/constructor/viewholder/InputBinding;Lcom/iqoption/charttools/constructor/InputField;)V", "bindLabel", "Companion", "techtools_release"})
/* compiled from: AbsInputFieldViewHolder.kt */
public abstract class a<Binding extends f<?>, Item extends l> extends com.iqoption.core.ui.widget.recyclerview.a.b<Binding, Item> {
    private static final int aGe = com.iqoption.core.d.getColor(com.iqoption.charttools.n.c.red);
    private static final int aGf = com.iqoption.core.d.getColor(com.iqoption.charttools.n.c.grey_blue_70);
    @Deprecated
    public static final c aGg = new c();

    @i(bne = {1, 1, 15}, bnf = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u0003\"\b\b\u0001\u0010\u0004*\u00020\u00052\u000e\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u00072\u0006\u0010\t\u001a\u00020\nH\n¢\u0006\u0002\b\u000b¨\u0006\f"}, bng = {"<anonymous>", "", "Binding", "Lcom/iqoption/charttools/constructor/viewholder/InputBinding;", "Item", "Lcom/iqoption/charttools/constructor/InputField;", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "hasFocus", "", "onFocusChange", "com/iqoption/charttools/constructor/viewholder/AbsInputFieldViewHolder$2$1"})
    /* compiled from: AbsInputFieldViewHolder.kt */
    static final class a implements OnFocusChangeListener {
        final /* synthetic */ EditText aGh;
        final /* synthetic */ d aGi;

        a(EditText editText, d dVar) {
            this.aGh = editText;
            this.aGi = dVar;
        }

        public final void onFocusChange(View view, boolean z) {
            if (z) {
                this.aGh.addTextChangedListener(this.aGi);
            } else {
                this.aGh.removeTextChangedListener(this.aGi);
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000(\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u0003\"\b\b\u0001\u0010\u0004*\u00020\u00052\u000e\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u00072\u0006\u0010\t\u001a\u00020\n2\u000e\u0010\u000b\u001a\n \b*\u0004\u0018\u00010\f0\fH\n¢\u0006\u0002\b\r"}, bng = {"<anonymous>", "", "Binding", "Lcom/iqoption/charttools/constructor/viewholder/InputBinding;", "Item", "Lcom/iqoption/charttools/constructor/InputField;", "v", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "actionId", "", "<anonymous parameter 2>", "Landroid/view/KeyEvent;", "onEditorAction"})
    /* compiled from: AbsInputFieldViewHolder.kt */
    static final class b implements OnEditorActionListener {
        final /* synthetic */ EditText aGh;

        b(EditText editText) {
            this.aGh = editText;
        }

        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i != 6) {
                return false;
            }
            this.aGh.clearFocus();
            kotlin.jvm.internal.i.e(textView, "v");
            v.a(textView.getContext(), (View) this.aGh);
            return true;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, bng = {"Lcom/iqoption/charttools/constructor/viewholder/AbsInputFieldViewHolder$Companion;", "", "()V", "ERROR_COLOR", "", "LABEL_COLOR", "techtools_release"})
    /* compiled from: AbsInputFieldViewHolder.kt */
    private static final class c {
        private c() {
        }

        public /* synthetic */ c(f fVar) {
            this();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, bng = {"com/iqoption/charttools/constructor/viewholder/AbsInputFieldViewHolder$textWatcher$1", "Lcom/iqoption/core/util/TextWatcherAdapter;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "techtools_release"})
    /* compiled from: AbsInputFieldViewHolder.kt */
    public static final class d extends ah {
        final /* synthetic */ f aGj;
        final /* synthetic */ a aGk;

        d(a aVar, f fVar) {
            this.aGk = aVar;
            this.aGj = fVar;
        }

        public void afterTextChanged(Editable editable) {
            kotlin.jvm.internal.i.f(editable, "s");
            l lVar = (l) this.aGk.and();
            if (lVar != null) {
                lVar.s(editable);
                this.aGk.b(this.aGj, lVar);
            }
        }
    }

    public a(final Binding binding, com.iqoption.core.ui.widget.recyclerview.a.a aVar) {
        kotlin.jvm.internal.i.f(binding, "binding");
        kotlin.jvm.internal.i.f(aVar, "data");
        super((com.iqoption.core.ui.widget.a.a) binding, aVar);
        binding.Nv().setOnClickListener(new g() {
            public void M(View view) {
                kotlin.jvm.internal.i.f(view, "v");
                binding.Nx().requestFocus();
                com.iqoption.core.ext.a.c(binding.Nx());
                v.b(view.getContext(), binding.Nx());
            }
        });
        d dVar = new d(this, binding);
        EditText Nx = binding.Nx();
        Nx.setOnFocusChangeListener(new a(Nx, dVar));
        Nx.setOnEditorActionListener(new b(Nx));
    }

    public void a(Binding binding, Item item) {
        kotlin.jvm.internal.i.f(binding, "$this$bind");
        kotlin.jvm.internal.i.f(item, "item");
        int i = b.aob[item.Ns().OK().ordinal()];
        int i2 = 0;
        int i3 = 1;
        if (i == 1) {
            Double OL = item.Ns().OL();
            if (OL == null || OL.doubleValue() < ((double) null)) {
                i2 = 1;
            }
            i3 = i2 != 0 ? InputDeviceCompat.SOURCE_TOUCHSCREEN : 2;
        } else if (i == 2) {
            Double OL2 = item.Ns().OL();
            if (OL2 == null || OL2.doubleValue() < ((double) null)) {
                i2 = 1;
            }
            i3 = i2 != 0 ? 12290 : 8194;
        }
        if (binding.Nx().getInputType() != i3) {
            binding.Nx().setInputType(i3);
        }
        binding.Nx().setTextKeepState(item.Nf());
        b(binding, item);
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(Binding binding, l lVar) {
        kotlin.jvm.internal.i.f(binding, "$this$bindLabel");
        kotlin.jvm.internal.i.f(lVar, "item");
        if (lVar.getError() != null) {
            binding.Nw().setText(lVar.getError());
            binding.Nw().setTextColor(aGe);
            return;
        }
        binding.Nw().setText(lVar.getLabel());
        binding.Nw().setTextColor(aGf);
    }
}
