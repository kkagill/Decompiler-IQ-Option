package com.iqoption.forexcalendar.b;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.iqoption.forexcalendar.a.k;
import com.iqoption.forexcalendar.p;
import com.iqoption.forexcalendar.r.e;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\n \n*\u0004\u0018\u00010\t0\tH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u000fH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, bng = {"Lcom/iqoption/forexcalendar/macro/MacroItemBinder;", "Lcom/iqoption/forexcalendar/ItemBinder;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "binding", "Lcom/iqoption/forexcalendar/databinding/MacroForexCalendarItemBinding;", "(Lcom/iqoption/forexcalendar/databinding/MacroForexCalendarItemBinding;)V", "getContext", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "getIcon", "Landroid/widget/ImageView;", "getLevel", "getName", "Landroid/widget/TextView;", "getRoot", "Landroid/view/View;", "getTime", "forexcalendar_release"})
/* compiled from: MacroItemBinder.kt */
public final class a implements p {
    private final k cTN;

    public a(k kVar) {
        kotlin.jvm.internal.i.f(kVar, "binding");
        this.cTN = kVar;
    }

    public a(ViewGroup viewGroup) {
        kotlin.jvm.internal.i.f(viewGroup, "parent");
        this((k) com.iqoption.core.ext.a.a(viewGroup, e.macro_forex_calendar_item, null, false, 6, null));
    }

    public View getRoot() {
        View root = this.cTN.getRoot();
        kotlin.jvm.internal.i.e(root, "binding.root");
        return root;
    }

    public Context getContext() {
        View root = this.cTN.getRoot();
        kotlin.jvm.internal.i.e(root, "binding.root");
        return root.getContext();
    }

    public ImageView awF() {
        ImageView imageView = this.cTN.aRh;
        kotlin.jvm.internal.i.e(imageView, "binding.icon");
        return imageView;
    }

    public TextView awG() {
        TextView textView = this.cTN.anj;
        kotlin.jvm.internal.i.e(textView, "binding.time");
        return textView;
    }

    public TextView awH() {
        TextView textView = this.cTN.amZ;
        kotlin.jvm.internal.i.e(textView, "binding.name");
        return textView;
    }

    public ImageView awI() {
        ImageView imageView = this.cTN.cTh;
        kotlin.jvm.internal.i.e(imageView, "binding.level");
        return imageView;
    }
}
