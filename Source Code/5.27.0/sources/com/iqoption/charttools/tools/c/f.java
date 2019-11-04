package com.iqoption.charttools.tools.c;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.iqoption.core.d;
import com.iqoption.core.ext.a;
import com.iqoption.core.ui.widget.recyclerview.a.e;
import com.iqoption.e.zd;
import com.iqoption.x.R;
import kotlin.TypeCastException;
import kotlin.i;
import kotlin.l;

@i(bne = {1, 1, 15}, bnf = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB\u0015\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\u0003*\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0003H\u0016¢\u0006\u0002\u0010\u0010R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, bng = {"Lcom/iqoption/charttools/tools/viewholder/TextViewHolder;", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/VDBindingHolder;", "Lcom/iqoption/databinding/StringBasketEmptyItemBinding;", "", "textRes", "", "parent", "Landroid/view/ViewGroup;", "(ILandroid/view/ViewGroup;)V", "text", "", "(Ljava/lang/String;Landroid/view/ViewGroup;)V", "getText", "()Ljava/lang/String;", "bind", "item", "(Lcom/iqoption/databinding/StringBasketEmptyItemBinding;Lkotlin/Unit;)V", "app_optionXRelease"})
/* compiled from: TextViewHolder.kt */
public final class f extends e<zd, l> {
    private final String text;

    public void a(zd zdVar, l lVar) {
        kotlin.jvm.internal.i.f(zdVar, "$this$bind");
        kotlin.jvm.internal.i.f(lVar, "item");
    }

    public f(String str, ViewGroup viewGroup) {
        kotlin.jvm.internal.i.f(str, "text");
        kotlin.jvm.internal.i.f(viewGroup, "parent");
        super(a.a(viewGroup, (int) R.layout.string_basket_empty_item, null, false, 6, null), null, 2, null);
        this.text = str;
        View view = this.itemView;
        if (view != null) {
            ((TextView) view).setText(this.text);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.TextView");
    }

    public f(int i, ViewGroup viewGroup) {
        kotlin.jvm.internal.i.f(viewGroup, "parent");
        this(d.getString(i), viewGroup);
    }
}
