package com.iqoption.fragment.dialog.popup.whatsnew.depositpage;

import android.view.View;
import com.iqoption.e.aax;
import com.iqoption.view.RobotoTextView;
import com.squareup.picasso.Picasso;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;
import kotlin.l;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, bng = {"<anonymous>", "", "T", "C", "it", "invoke", "(Ljava/lang/Object;)V", "com/iqoption/core/kotlin/DelegatesKt$bindable$1"})
/* compiled from: Delegates.kt */
public final class WhatsNewDepositHolder$$special$$inlined$bindable$1 extends Lambda implements b<BankItem, l> {
    final /* synthetic */ aax $binding$inlined;
    final /* synthetic */ Object $context;
    final /* synthetic */ c this$0;

    public WhatsNewDepositHolder$$special$$inlined$bindable$1(Object obj, c cVar, aax aax) {
        this.$context = obj;
        this.this$0 = cVar;
        this.$binding$inlined = aax;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        bU(obj);
        return l.eVB;
    }

    public final void bU(BankItem bankItem) {
        bankItem = bankItem;
        aax aax = (aax) this.$context;
        RobotoTextView robotoTextView = this.$binding$inlined.chk;
        kotlin.jvm.internal.i.e(robotoTextView, "binding.title");
        robotoTextView.setText(bankItem.getTitle());
        View view = this.this$0.itemView;
        kotlin.jvm.internal.i.e(view, "itemView");
        Picasso.with(view.getContext()).load(bankItem.getUrl()).into(this.$binding$inlined.aRh);
    }
}
