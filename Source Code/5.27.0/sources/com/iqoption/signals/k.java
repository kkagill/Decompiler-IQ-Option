package com.iqoption.signals;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.iqoption.core.ui.widget.a.a;
import com.iqoption.signals.d.d;
import com.iqoption.signals.d.e;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, bng = {"Lcom/iqoption/signals/SignalTitleItemBinding;", "Lcom/iqoption/core/ui/widget/binding/IQBinding;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "getParent", "()Landroid/view/ViewGroup;", "root", "Landroid/view/View;", "getRoot", "()Landroid/view/View;", "title", "Landroid/widget/TextView;", "getTitle", "()Landroid/widget/TextView;", "signals_release"})
/* compiled from: SignalTitleItemBinding.kt */
public final class k implements a {
    private final View aGn = com.iqoption.core.ext.a.b(this.parent, e.signal_title_item, this.parent, false, 4, null);
    private final TextView alH;
    private final ViewGroup parent;

    public k(ViewGroup viewGroup) {
        kotlin.jvm.internal.i.f(viewGroup, "parent");
        this.parent = viewGroup;
        View findViewById = getRoot().findViewById(d.title);
        kotlin.jvm.internal.i.e(findViewById, "root.findViewById(R.id.title)");
        this.alH = (TextView) findViewById;
    }

    public View getRoot() {
        return this.aGn;
    }

    public final TextView Rw() {
        return this.alH;
    }
}
