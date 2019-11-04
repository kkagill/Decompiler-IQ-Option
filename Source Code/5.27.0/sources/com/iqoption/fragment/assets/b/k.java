package com.iqoption.fragment.assets.b;

import android.text.style.ForegroundColorSpan;
import android.view.ViewGroup;
import android.widget.TextView;
import com.iqoption.core.d;
import com.iqoption.core.ui.widget.recyclerview.a.e;
import com.iqoption.e.cz;
import com.iqoption.fragment.assets.model.s;
import com.iqoption.util.ai;
import com.iqoption.x.R;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\u00020\b*\u00020\u00022\u0006\u0010\t\u001a\u00020\u0003H\u0016¨\u0006\n"}, bng = {"Lcom/iqoption/fragment/assets/viewholder/MultiWarningViewHolder;", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/VDBindingHolder;", "Lcom/iqoption/databinding/AssetsMultiWarningItemBinding;", "Lcom/iqoption/fragment/assets/model/MultiWarning;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "bind", "", "item", "app_optionXRelease"})
/* compiled from: MultiWarningViewHolder.kt */
public final class k extends e<cz, s> {
    public k(ViewGroup viewGroup) {
        kotlin.jvm.internal.i.f(viewGroup, "parent");
        super(R.layout.assets_multi_warning_item, viewGroup, null, 4, null);
    }

    public void a(cz czVar, s sVar) {
        kotlin.jvm.internal.i.f(czVar, "$this$bind");
        kotlin.jvm.internal.i.f(sVar, "item");
        TextView textView = ((cz) getBinding()).bYc;
        kotlin.jvm.internal.i.e(textView, "binding.warningText");
        textView.setText(new ai().jP(d.getString(R.string.start_with_any_asset1)).cs(new ForegroundColorSpan(d.getColor(R.color.green))).F(' ').jP(d.getString(R.string.up_to_n1, sVar.aBa())).F(' ').aWX().jP(d.getString(R.string.start_with_any_asset2)).anA());
    }
}
