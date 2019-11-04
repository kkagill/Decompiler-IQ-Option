package com.iqoption.core.ui.country;

import android.widget.TextView;
import com.iqoption.core.a.j;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;
import kotlin.l;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, bng = {"<anonymous>", "", "T", "C", "it", "invoke", "(Ljava/lang/Object;)V", "com/iqoption/core/kotlin/DelegatesKt$bindable$1"})
/* compiled from: Delegates.kt */
public final class CountryHolder$$special$$inlined$bindable$1 extends Lambda implements b<c, l> {
    final /* synthetic */ j $binding$inlined;
    final /* synthetic */ Object $context;

    public CountryHolder$$special$$inlined$bindable$1(Object obj, j jVar) {
        this.$context = obj;
        this.$binding$inlined = jVar;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        bU(obj);
        return l.eVB;
    }

    public final void bU(c cVar) {
        cVar = cVar;
        j jVar = (j) this.$context;
        TextView textView = this.$binding$inlined.bfG;
        kotlin.jvm.internal.i.e(textView, "binding.countryName");
        textView.setText(cVar.LB().getName());
    }
}
