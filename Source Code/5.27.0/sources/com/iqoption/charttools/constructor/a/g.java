package com.iqoption.charttools.constructor.a;

import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import androidx.appcompat.widget.SwitchCompat;
import com.iqoption.charttools.b.m;
import com.iqoption.charttools.n.h;
import com.iqoption.core.ui.widget.recyclerview.a.a;
import com.iqoption.core.ui.widget.recyclerview.a.e;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u001a\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0014\u0010\u0010\u001a\u00020\u000b*\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0003H\u0016¨\u0006\u0012"}, bng = {"Lcom/iqoption/charttools/constructor/viewholder/InputBoolViewHolder;", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/VDBindingHolder;", "Lcom/iqoption/charttools/databinding/IndicatorConstructorInputBoolBinding;", "Lcom/iqoption/charttools/constructor/InputBool;", "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "parent", "Landroid/view/ViewGroup;", "data", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/AdapterData;", "(Landroid/view/ViewGroup;Lcom/iqoption/core/ui/widget/recyclerview/viewholder/AdapterData;)V", "onCheckedChanged", "", "buttonView", "Landroid/widget/CompoundButton;", "isChecked", "", "bind", "item", "techtools_release"})
/* compiled from: InputBoolViewHolder.kt */
public final class g extends e<m, com.iqoption.charttools.constructor.i> implements OnCheckedChangeListener {
    public g(ViewGroup viewGroup, a aVar) {
        kotlin.jvm.internal.i.f(viewGroup, "parent");
        kotlin.jvm.internal.i.f(aVar, "data");
        super(h.indicator_constructor_input_bool, viewGroup, aVar);
        ((m) getBinding()).aIt.setOnCheckedChangeListener(this);
    }

    public void a(m mVar, com.iqoption.charttools.constructor.i iVar) {
        kotlin.jvm.internal.i.f(mVar, "$this$bind");
        kotlin.jvm.internal.i.f(iVar, "item");
        SwitchCompat switchCompat = mVar.aIt;
        String str = "switcher";
        kotlin.jvm.internal.i.e(switchCompat, str);
        switchCompat.setText(iVar.getLabel());
        switchCompat = mVar.aIt;
        kotlin.jvm.internal.i.e(switchCompat, str);
        if (switchCompat.isChecked() != iVar.Nc()) {
            mVar.aIt.toggle();
        }
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        com.iqoption.charttools.constructor.i iVar = (com.iqoption.charttools.constructor.i) and();
        if (iVar != null) {
            iVar.bR(z);
        }
    }
}
