package com.iqoption.deposit.light.methods;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.iqoption.core.d;
import com.iqoption.core.microservices.billing.response.deposit.cashboxitem.a;
import com.iqoption.core.microservices.billing.response.deposit.cashboxitem.e;
import com.iqoption.deposit.b.al;
import com.iqoption.deposit.c.b.c;
import com.iqoption.deposit.o;
import com.iqoption.deposit.o.g;
import com.squareup.picasso.Picasso;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;
import kotlin.l;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, bng = {"<anonymous>", "", "T", "C", "it", "invoke", "(Ljava/lang/Object;)V", "com/iqoption/core/kotlin/DelegatesKt$bindable$1"})
/* compiled from: Delegates.kt */
public final class MethodLightViewHolder$$special$$inlined$bindable$1 extends Lambda implements b<com.iqoption.deposit.c.b.b, l> {
    final /* synthetic */ Object $context;
    final /* synthetic */ d this$0;

    public MethodLightViewHolder$$special$$inlined$bindable$1(Object obj, d dVar) {
        this.$context = obj;
        this.this$0 = dVar;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        bU(obj);
        return l.eVB;
    }

    public final void bU(com.iqoption.deposit.c.b.b bVar) {
        com.iqoption.deposit.c.b.b bVar2 = bVar;
        al alVar = (al) this.$context;
        View root = this.this$0.cFn.getRoot();
        kotlin.jvm.internal.i.e(root, "binding.root");
        Context context = root.getContext();
        Picasso with = Picasso.with(context);
        ImageView imageView = this.this$0.cFn.cDb;
        kotlin.jvm.internal.i.e(imageView, "binding.methodIcon");
        a aoU = bVar2.aoU();
        boolean z = aoU instanceof com.iqoption.core.microservices.billing.response.deposit.cashboxitem.b;
        if (z) {
            with.cancelRequest(imageView);
            this.this$0.c(imageView, ((com.iqoption.core.microservices.billing.response.deposit.cashboxitem.b) aoU).getCardNumber());
        } else if (aoU instanceof e) {
            with.cancelRequest(imageView);
            this.this$0.c(imageView, ((e) aoU).getCardNumber());
        } else {
            d dVar = this.this$0;
            kotlin.jvm.internal.i.e(with, "picasso");
            dVar.a(imageView, aoU, with);
        }
        TextView textView = this.this$0.cFn.cDd;
        kotlin.jvm.internal.i.e(textView, "binding.methodName");
        kotlin.jvm.internal.i.e(context, "context");
        textView.setText(c.a(aoU, context, true, false));
        Integer num = (Integer) null;
        String str = "binding.methodDescription";
        TextView textView2;
        TextView textView3;
        if (bVar2.aoU() instanceof com.iqoption.core.microservices.billing.response.deposit.cashboxitem.b) {
            TextView textView4 = this.this$0.cFn.cDa;
            kotlin.jvm.internal.i.e(textView4, str);
            com.iqoption.core.ext.a.ak(textView4);
            String a = com.iqoption.core.util.e.a(((com.iqoption.core.microservices.billing.response.deposit.cashboxitem.b) bVar2.aoU()).aaC(), 0, ((com.iqoption.core.microservices.billing.response.deposit.cashboxitem.b) bVar2.aoU()).getMask(), false, false, null, 29, null);
            TextView textView5 = this.this$0.cFn.cDa;
            kotlin.jvm.internal.i.e(textView5, str);
            textView5.setText(d.getString(g.deposit_reserved_n1, a));
            num = Integer.valueOf(com.iqoption.core.ext.a.k(context, o.b.red));
        } else if (bVar2.aoU() instanceof com.iqoption.core.microservices.billing.response.crypto.a) {
            textView2 = this.this$0.cFn.cDa;
            kotlin.jvm.internal.i.e(textView2, str);
            com.iqoption.core.ext.a.ak(textView2);
            a aoU2 = bVar2.aoU();
            textView3 = this.this$0.cFn.cDa;
            kotlin.jvm.internal.i.e(textView3, str);
            com.iqoption.core.microservices.billing.response.crypto.a aVar = (com.iqoption.core.microservices.billing.response.crypto.a) aoU2;
            textView3.setText(com.iqoption.deposit.crypto.a.b(aVar));
            num = Integer.valueOf(com.iqoption.deposit.crypto.a.c(aVar));
        } else if ((bVar2.aoU() instanceof com.iqoption.core.microservices.billing.response.deposit.cashboxitem.c) && ((com.iqoption.core.microservices.billing.response.deposit.cashboxitem.c) bVar2.aoU()).aaE()) {
            textView3 = this.this$0.cFn.cDa;
            kotlin.jvm.internal.i.e(textView3, str);
            com.iqoption.core.ext.a.ak(textView3);
            this.this$0.cFn.cDa.setText(g.for_verified_accounts);
            num = Integer.valueOf(com.iqoption.core.ext.a.k(context, o.b.deposit_dark_grey));
        } else if (bVar2.getDescription() != null) {
            textView3 = this.this$0.cFn.cDa;
            kotlin.jvm.internal.i.e(textView3, str);
            com.iqoption.core.ext.a.ak(textView3);
            textView3 = this.this$0.cFn.cDa;
            kotlin.jvm.internal.i.e(textView3, str);
            textView3.setText(bVar2.getDescription());
            num = Integer.valueOf(com.iqoption.core.ext.a.k(context, o.b.deposit_dark_grey));
        } else {
            textView2 = this.this$0.cFn.cDa;
            kotlin.jvm.internal.i.e(textView2, str);
            com.iqoption.core.ext.a.al(textView2);
        }
        if (num != null) {
            this.this$0.cFn.cDa.setTextColor(num.intValue());
        }
        String str2 = "binding.methodLocked";
        ImageView imageView2;
        if (bVar2.isLocked()) {
            imageView2 = this.this$0.cFn.cDc;
            kotlin.jvm.internal.i.e(imageView2, str2);
            com.iqoption.core.ext.a.ak(imageView2);
            this.this$0.cFn.cDd.setTextColor(com.iqoption.core.ext.a.a((ViewDataBinding) alVar, o.b.deposit_dark_grey_50));
        } else {
            imageView2 = this.this$0.cFn.cDc;
            kotlin.jvm.internal.i.e(imageView2, str2);
            com.iqoption.core.ext.a.al(imageView2);
            this.this$0.cFn.cDd.setTextColor(com.iqoption.core.ext.a.a((ViewDataBinding) alVar, o.b.black));
        }
        d dVar2 = this.this$0;
        dVar2.cO(dVar2.cFo.m(aoU));
        String str3 = "itemView";
        View view;
        if (z) {
            view = this.this$0.itemView;
            kotlin.jvm.internal.i.e(view, str3);
            view.setContentDescription("hold_card");
        } else if (aoU instanceof e) {
            view = this.this$0.itemView;
            kotlin.jvm.internal.i.e(view, str3);
            view.setContentDescription("linked_card");
        } else {
            view = this.this$0.itemView;
            kotlin.jvm.internal.i.e(view, str3);
            view.setContentDescription((CharSequence) null);
        }
    }
}
