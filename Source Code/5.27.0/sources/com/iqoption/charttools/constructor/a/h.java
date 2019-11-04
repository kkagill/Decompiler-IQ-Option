package com.iqoption.charttools.constructor.a;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.plus.PlusShare;
import com.iqoption.charttools.b.o;
import com.iqoption.charttools.constructor.k;
import com.iqoption.charttools.constructor.widget.ColorPicker;
import com.iqoption.charttools.constructor.widget.ColorPicker.b;
import com.iqoption.charttools.constructor.widget.ColorPicker.c;
import com.iqoption.core.ext.g;
import com.iqoption.core.graphics.animation.j;
import com.iqoption.core.ui.widget.recyclerview.a.e;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0014\u0010\t\u001a\u00020\n*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¨\u0006\f"}, bng = {"Lcom/iqoption/charttools/constructor/viewholder/InputColorViewHolder;", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/VDBindingHolder;", "Lcom/iqoption/charttools/databinding/IndicatorConstructorInputColorBinding;", "Lcom/iqoption/charttools/constructor/InputColor;", "parent", "Landroid/view/ViewGroup;", "data", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/AdapterData;", "(Landroid/view/ViewGroup;Lcom/iqoption/core/ui/widget/recyclerview/viewholder/AdapterData;)V", "bind", "", "item", "techtools_release"})
/* compiled from: InputColorViewHolder.kt */
public final class h extends e<o, k> {

    @i(bne = {1, 1, 15}, bnf = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\u0005H\u0016J\b\u0010\f\u001a\u00020\u0005H\u0002¨\u0006\r"}, bng = {"com/iqoption/charttools/constructor/viewholder/InputColorViewHolder$listener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "Lcom/iqoption/charttools/constructor/widget/ColorPicker$OnSliderClickListener;", "Lcom/iqoption/charttools/constructor/widget/ColorPicker$OnColorChangeListener;", "onColorChange", "", "color", "", "onDelayClick", "v", "Landroid/view/View;", "onSliderClick", "toggleColorPicker", "techtools_release"})
    /* compiled from: InputColorViewHolder.kt */
    public static final class a extends g implements b, c {
        final /* synthetic */ h aGp;

        a(h hVar) {
            this.aGp = hVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            Nz();
        }

        public void Ny() {
            Nz();
        }

        public void el(int i) {
            k kVar = (k) this.aGp.and();
            if (kVar != null) {
                kVar.setSelected(i);
            }
        }

        private final void Nz() {
            o oVar = (o) this.aGp.getBinding();
            ColorPicker colorPicker = oVar.aIw;
            String str = "picker";
            kotlin.jvm.internal.i.e(colorPicker, str);
            if (!colorPicker.NL()) {
                k kVar = (k) this.aGp.and();
                if (kVar != null) {
                    ColorPicker colorPicker2 = oVar.aIw;
                    kotlin.jvm.internal.i.e(colorPicker2, str);
                    kVar.setExpanded(colorPicker2.nq() ^ 1);
                    colorPicker = oVar.aIw;
                    kotlin.jvm.internal.i.e(colorPicker, str);
                    if (colorPicker.nq()) {
                        oVar.aIu.animate().rotation(0.0f).setDuration(250).setInterpolator(j.XJ()).start();
                    } else {
                        oVar.aIu.animate().rotation(180.0f).setDuration(250).setInterpolator(j.XJ()).start();
                    }
                    oVar.aIw.toggle();
                }
            }
        }
    }

    public h(ViewGroup viewGroup, com.iqoption.core.ui.widget.recyclerview.a.a aVar) {
        kotlin.jvm.internal.i.f(viewGroup, "parent");
        kotlin.jvm.internal.i.f(aVar, "data");
        super(com.iqoption.charttools.n.h.indicator_constructor_input_color, viewGroup, aVar);
        a aVar2 = new a(this);
        o oVar = (o) getBinding();
        oVar.aIv.setOnClickListener(aVar2);
        oVar.aIw.setOnSliderClickListener(aVar2);
        oVar.aIw.setOnColorChangeListener(aVar2);
    }

    public void a(o oVar, k kVar) {
        kotlin.jvm.internal.i.f(oVar, "$this$bind");
        kotlin.jvm.internal.i.f(kVar, "item");
        TextView textView = oVar.aoo;
        kotlin.jvm.internal.i.e(textView, PlusShare.KEY_CALL_TO_ACTION_LABEL);
        textView.setText(kVar.getLabel());
        ImageView imageView = oVar.aIu;
        kotlin.jvm.internal.i.e(imageView, "arrow");
        ColorPicker colorPicker = oVar.aIw;
        String str = "picker";
        kotlin.jvm.internal.i.e(colorPicker, str);
        imageView.setRotation(colorPicker.nq() ? 180.0f : 0.0f);
        oVar.aIw.setColor(kVar.Nd());
        ColorPicker colorPicker2 = oVar.aIw;
        kotlin.jvm.internal.i.e(colorPicker2, str);
        colorPicker2.setExpanded(kVar.nq());
    }
}
