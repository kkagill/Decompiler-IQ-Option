package com.iqoption.deposit.light.menu.currency;

import android.widget.ImageView;
import android.widget.TextView;
import com.iqoption.core.microservices.billing.response.deposit.d;
import com.iqoption.deposit.b.ah;
import com.iqoption.deposit.c.a.a;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;
import kotlin.l;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, bng = {"<anonymous>", "", "T", "C", "it", "invoke", "(Ljava/lang/Object;)V", "com/iqoption/core/kotlin/DelegatesKt$bindable$1"})
/* compiled from: Delegates.kt */
public final class CurrencyLightViewHolder$$special$$inlined$bindable$1 extends Lambda implements b<a, l> {
    final /* synthetic */ ah $binding$inlined;
    final /* synthetic */ Object $context;

    public CurrencyLightViewHolder$$special$$inlined$bindable$1(Object obj, ah ahVar) {
        this.$context = obj;
        this.$binding$inlined = ahVar;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        bU(obj);
        return l.eVB;
    }

    public final void bU(a aVar) {
        aVar = aVar;
        ah ahVar = (ah) this.$context;
        d asR = aVar.asR();
        TextView textView = this.$binding$inlined.bfK;
        kotlin.jvm.internal.i.e(textView, "binding.currencySymbol");
        textView.setText(asR.getSymbol());
        textView = this.$binding$inlined.bfJ;
        kotlin.jvm.internal.i.e(textView, "binding.currencyName");
        textView.setText(asR.getName());
        String str = "binding.currencyChecked";
        ImageView imageView;
        if (aVar.isSelected()) {
            imageView = this.$binding$inlined.bfH;
            kotlin.jvm.internal.i.e(imageView, str);
            com.iqoption.core.ext.a.ak(imageView);
            return;
        }
        imageView = this.$binding$inlined.bfH;
        kotlin.jvm.internal.i.e(imageView, str);
        com.iqoption.core.ext.a.al(imageView);
    }
}
