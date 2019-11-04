package com.iqoption.core.ui.widget.recyclerview.a;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.iqoption.core.ext.a;
import kotlin.TypeCastException;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.l;

@i(bne = {1, 1, 15}, bnf = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B8\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u001b\b\u0002\u0010\u0005\u001a\u0015\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0002\b\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fB@\b\u0016\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u001b\b\u0002\u0010\u0005\u001a\u0015\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0002\b\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\u000fB6\u0012\u0006\u0010\u0010\u001a\u00020\u0007\u0012\u001b\b\u0002\u0010\u0005\u001a\u0015\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0002\b\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0002H\u0016R\u000e\u0010\u0012\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, bng = {"Lcom/iqoption/core/ui/widget/recyclerview/viewholder/TextViewHolder;", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/IQViewHolder;", "", "parent", "Landroid/view/ViewGroup;", "initializer", "Lkotlin/Function1;", "Landroid/widget/TextView;", "", "Lkotlin/ExtensionFunctionType;", "data", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/AdapterData;", "(Landroid/view/ViewGroup;Lkotlin/jvm/functions/Function1;Lcom/iqoption/core/ui/widget/recyclerview/viewholder/AdapterData;)V", "layout", "", "(ILandroid/view/ViewGroup;Lkotlin/jvm/functions/Function1;Lcom/iqoption/core/ui/widget/recyclerview/viewholder/AdapterData;)V", "textView", "(Landroid/widget/TextView;Lkotlin/jvm/functions/Function1;Lcom/iqoption/core/ui/widget/recyclerview/viewholder/AdapterData;)V", "view", "bind", "item", "core_release"})
/* compiled from: TextViewHolder.kt */
public final class d extends c<String> {
    private final TextView biJ;

    public d(TextView textView, b<? super TextView, l> bVar, a aVar) {
        kotlin.jvm.internal.i.f(textView, "textView");
        super(textView, aVar);
        View view = this.itemView;
        if (view != null) {
            this.biJ = (TextView) view;
            if (bVar != null) {
                bVar.invoke(this.biJ);
                return;
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.TextView");
    }

    public /* synthetic */ d(int i, ViewGroup viewGroup, b bVar, a aVar, int i2, f fVar) {
        if ((i2 & 4) != 0) {
            bVar = (b) null;
        }
        if ((i2 & 8) != 0) {
            aVar = (a) null;
        }
        this(i, viewGroup, bVar, aVar);
    }

    public d(int i, ViewGroup viewGroup, b<? super TextView, l> bVar, a aVar) {
        kotlin.jvm.internal.i.f(viewGroup, "parent");
        this((TextView) a.b(viewGroup, i, null, false, 6, null), bVar, aVar);
    }

    /* renamed from: eK */
    public void bB(String str) {
        kotlin.jvm.internal.i.f(str, "item");
        this.biJ.setText(str);
    }
}
