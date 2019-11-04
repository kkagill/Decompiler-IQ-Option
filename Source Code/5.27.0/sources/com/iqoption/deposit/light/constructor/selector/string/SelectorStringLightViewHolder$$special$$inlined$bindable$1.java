package com.iqoption.deposit.light.constructor.selector.string;

import android.widget.ImageView;
import android.widget.TextView;
import com.iqoption.core.ext.a;
import com.iqoption.deposit.b.af;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;
import kotlin.l;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, bng = {"<anonymous>", "", "T", "C", "it", "invoke", "(Ljava/lang/Object;)V", "com/iqoption/core/kotlin/DelegatesKt$bindable$1"})
/* compiled from: Delegates.kt */
public final class SelectorStringLightViewHolder$$special$$inlined$bindable$1 extends Lambda implements b<com.iqoption.deposit.a.a.b.b, l> {
    final /* synthetic */ af $binding$inlined;
    final /* synthetic */ Object $context;

    public SelectorStringLightViewHolder$$special$$inlined$bindable$1(Object obj, af afVar) {
        this.$context = obj;
        this.$binding$inlined = afVar;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        bU(obj);
        return l.eVB;
    }

    public final void bU(com.iqoption.deposit.a.a.b.b bVar) {
        bVar = bVar;
        af afVar = (af) this.$context;
        TextView textView = this.$binding$inlined.cCX;
        kotlin.jvm.internal.i.e(textView, "binding.constructorSpinnerName");
        textView.setText(bVar.aqv().getDescription());
        String str = "binding.constructorSpinnerChecked";
        ImageView imageView;
        if (bVar.isSelected()) {
            imageView = this.$binding$inlined.cCV;
            kotlin.jvm.internal.i.e(imageView, str);
            a.ak(imageView);
            return;
        }
        imageView = this.$binding$inlined.cCV;
        kotlin.jvm.internal.i.e(imageView, str);
        a.al(imageView);
    }
}
