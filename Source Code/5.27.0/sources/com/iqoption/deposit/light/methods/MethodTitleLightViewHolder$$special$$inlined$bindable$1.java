package com.iqoption.deposit.light.methods;

import android.widget.TextView;
import com.iqoption.deposit.b.an;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;
import kotlin.l;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, bng = {"<anonymous>", "", "T", "C", "it", "invoke", "(Ljava/lang/Object;)V", "com/iqoption/core/kotlin/DelegatesKt$bindable$1"})
/* compiled from: Delegates.kt */
public final class MethodTitleLightViewHolder$$special$$inlined$bindable$1 extends Lambda implements b<e, l> {
    final /* synthetic */ an $binding$inlined;
    final /* synthetic */ Object $context;

    public MethodTitleLightViewHolder$$special$$inlined$bindable$1(Object obj, an anVar) {
        this.$context = obj;
        this.$binding$inlined = anVar;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        bU(obj);
        return l.eVB;
    }

    public final void bU(e eVar) {
        eVar = eVar;
        an anVar = (an) this.$context;
        TextView textView = this.$binding$inlined.cBV;
        kotlin.jvm.internal.i.e(textView, "binding.depositMethodsTitle");
        textView.setText(eVar.getTitle());
    }
}
