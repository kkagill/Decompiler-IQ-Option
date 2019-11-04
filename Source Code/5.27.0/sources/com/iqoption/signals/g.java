package com.iqoption.signals;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.iqoption.core.ui.widget.a.a;
import com.iqoption.signals.d.d;
import com.iqoption.signals.d.e;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\bR\u0011\u0010\u0017\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\bR\u0011\u0010\u0019\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\b¨\u0006\u001b"}, bng = {"Lcom/iqoption/signals/SignalItemBinding;", "Lcom/iqoption/core/ui/widget/binding/IQBinding;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "active", "Landroid/widget/TextView;", "getActive", "()Landroid/widget/TextView;", "icon", "Landroid/widget/ImageView;", "getIcon", "()Landroid/widget/ImageView;", "level", "getLevel", "getParent", "()Landroid/view/ViewGroup;", "root", "Landroid/view/View;", "getRoot", "()Landroid/view/View;", "time", "getTime", "type", "getType", "value", "getValue", "signals_release"})
/* compiled from: SignalItemBinding.kt */
public final class g implements a {
    private final View aGn = com.iqoption.core.ext.a.b(this.parent, e.signal_item, this.parent, false, 4, null);
    private final TextView aIz;
    private final ImageView aRh;
    private final TextView anj;
    private final TextView aoq;
    private final TextView bZi;
    private final ImageView cTh;
    private final ViewGroup parent;

    public g(ViewGroup viewGroup) {
        kotlin.jvm.internal.i.f(viewGroup, "parent");
        this.parent = viewGroup;
        View findViewById = getRoot().findViewById(d.icon);
        kotlin.jvm.internal.i.e(findViewById, "root.findViewById(R.id.icon)");
        this.aRh = (ImageView) findViewById;
        findViewById = getRoot().findViewById(d.time);
        kotlin.jvm.internal.i.e(findViewById, "root.findViewById(R.id.time)");
        this.anj = (TextView) findViewById;
        findViewById = getRoot().findViewById(d.value);
        kotlin.jvm.internal.i.e(findViewById, "root.findViewById(R.id.value)");
        this.aoq = (TextView) findViewById;
        findViewById = getRoot().findViewById(d.level);
        kotlin.jvm.internal.i.e(findViewById, "root.findViewById(R.id.level)");
        this.cTh = (ImageView) findViewById;
        findViewById = getRoot().findViewById(d.active);
        kotlin.jvm.internal.i.e(findViewById, "root.findViewById(R.id.active)");
        this.aIz = (TextView) findViewById;
        findViewById = getRoot().findViewById(d.type);
        kotlin.jvm.internal.i.e(findViewById, "root.findViewById(R.id.type)");
        this.bZi = (TextView) findViewById;
    }

    public View getRoot() {
        return this.aGn;
    }

    public final ImageView awF() {
        return this.aRh;
    }

    public final TextView awG() {
        return this.anj;
    }

    public final TextView aUe() {
        return this.aoq;
    }

    public final ImageView awI() {
        return this.cTh;
    }

    public final TextView aUf() {
        return this.aIz;
    }

    public final TextView aUg() {
        return this.bZi;
    }
}
