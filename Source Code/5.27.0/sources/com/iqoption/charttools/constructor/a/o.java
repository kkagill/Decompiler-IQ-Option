package com.iqoption.charttools.constructor.a;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.iqoption.charttools.constructor.x;
import com.iqoption.charttools.n.g;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, bng = {"Lcom/iqoption/charttools/constructor/viewholder/InputStepFieldViewHolder;", "Lcom/iqoption/charttools/constructor/viewholder/AbsInputFieldViewHolder;", "Lcom/iqoption/charttools/constructor/viewholder/InputStepFieldBinding;", "Lcom/iqoption/charttools/constructor/InputStepField;", "parent", "Landroid/view/ViewGroup;", "data", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/AdapterData;", "(Landroid/view/ViewGroup;Lcom/iqoption/core/ui/widget/recyclerview/viewholder/AdapterData;)V", "techtools_release"})
/* compiled from: InputStepFieldViewHolder.kt */
public final class o extends a<n, x> {

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
    /* compiled from: InputStepFieldViewHolder.kt */
    static final class a implements OnClickListener {
        final /* synthetic */ o aGy;

        a(o oVar) {
            this.aGy = oVar;
        }

        public final void onClick(View view) {
            x xVar = (x) this.aGy.and();
            if (xVar != null) {
                kotlin.jvm.internal.i.e(view, "it");
                int id = view.getId();
                if (id == g.btnMinus) {
                    xVar.Nq();
                } else if (id == g.btnPlus) {
                    xVar.Np();
                } else {
                    throw new RuntimeException("Unreachable");
                }
                ((n) this.aGy.anc()).Nx().setTextKeepState(xVar.Nf());
                if (!((n) this.aGy.anc()).Nx().isFocused()) {
                    o oVar = this.aGy;
                    oVar.b((f) oVar.anc(), xVar);
                }
            }
        }
    }

    public o(ViewGroup viewGroup, com.iqoption.core.ui.widget.recyclerview.a.a aVar) {
        kotlin.jvm.internal.i.f(viewGroup, "parent");
        kotlin.jvm.internal.i.f(aVar, "data");
        super(new n(viewGroup), aVar);
        OnClickListener aVar2 = new a(this);
        ((n) anc()).NA().setOnClickListener(aVar2);
        ((n) anc()).NB().setOnClickListener(aVar2);
    }
}
