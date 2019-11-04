package com.iqoption.deposit.light.methods;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.iqoption.core.d.c;
import com.iqoption.core.ext.g;
import com.iqoption.core.util.ag;
import com.iqoption.core.util.r;
import com.iqoption.deposit.b.al;
import com.iqoption.deposit.c.b.b;
import com.iqoption.deposit.o;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;
import io.card.payment.CardType;
import kotlin.i;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J \u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u000e\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u001dR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R+\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, bng = {"Lcom/iqoption/deposit/light/methods/MethodLightViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/iqoption/deposit/databinding/ItemPaymentMethodLightBinding;", "callback", "Lcom/iqoption/deposit/light/methods/OnMethodCallbackLight;", "(Lcom/iqoption/deposit/databinding/ItemPaymentMethodLightBinding;Lcom/iqoption/deposit/light/methods/OnMethodCallbackLight;)V", "<set-?>", "Lcom/iqoption/deposit/menu/method/MethodAdapterItem;", "bound", "getBound", "()Lcom/iqoption/deposit/menu/method/MethodAdapterItem;", "setBound", "(Lcom/iqoption/deposit/menu/method/MethodAdapterItem;)V", "bound$delegate", "Lkotlin/properties/ReadWriteProperty;", "loadCardIcon", "", "view", "Landroid/widget/ImageView;", "cardNumber", "", "loadPayMethodIcon", "cashboxItem", "Lcom/iqoption/core/microservices/billing/response/deposit/cashboxitem/CashboxItem;", "picasso", "Lcom/squareup/picasso/Picasso;", "markSelectedIfNeeded", "selected", "", "deposit_release"})
/* compiled from: MethodLightViewHolder.kt */
public final class d extends ViewHolder {
    static final /* synthetic */ j[] anY = new j[]{k.a(new MutablePropertyReference1Impl(k.G(d.class), "bound", "getBound()Lcom/iqoption/deposit/menu/method/MethodAdapterItem;"))};
    private final kotlin.f.d bHX = c.j(new MethodLightViewHolder$$special$$inlined$bindable$1(this.cFn, this));
    private final al cFn;
    private final l cFo;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class a extends g {
        final /* synthetic */ d this$0;

        public a(d dVar) {
            this.this$0 = dVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            this.this$0.cFo.l(this.this$0.ase().aoU());
        }
    }

    public final void a(b bVar) {
        kotlin.jvm.internal.i.f(bVar, "<set-?>");
        this.bHX.a(this, anY[0], bVar);
    }

    public final b ase() {
        return (b) this.bHX.b(this, anY[0]);
    }

    public d(al alVar, l lVar) {
        kotlin.jvm.internal.i.f(alVar, "binding");
        kotlin.jvm.internal.i.f(lVar, "callback");
        super(alVar.getRoot());
        this.cFn = alVar;
        this.cFo = lVar;
        View view = this.itemView;
        kotlin.jvm.internal.i.e(view, "itemView");
        view.setOnClickListener(new a(this));
    }

    public final void cO(boolean z) {
        View root = this.cFn.getRoot();
        kotlin.jvm.internal.i.e(root, "binding.root");
        Context context = root.getContext();
        if (ag.aZ(context)) {
            int i;
            String str = "binding.methodChecked";
            View view;
            if (z) {
                view = this.cFn.cCZ;
                kotlin.jvm.internal.i.e(view, str);
                com.iqoption.core.ext.a.ak(view);
                i = o.b.green_30;
            } else {
                view = this.cFn.cCZ;
                kotlin.jvm.internal.i.e(view, str);
                com.iqoption.core.ext.a.al(view);
                i = o.b.white;
            }
            LinearLayout linearLayout = this.cFn.cCY;
            kotlin.jvm.internal.i.e(context, "context");
            linearLayout.setBackgroundColor(com.iqoption.core.ext.a.k(context, i));
        }
    }

    private final void c(ImageView imageView, String str) {
        int intValue;
        CardType hm = com.iqoption.core.util.c.hm(str);
        Context context = imageView.getContext();
        kotlin.jvm.internal.i.e(context, "view.context");
        Integer a = com.iqoption.billing.b.a(hm);
        if (a != null) {
            intValue = a.intValue();
        } else {
            intValue = com.iqoption.deposit.o.d.ic_payment_method_placeholder_grey;
        }
        imageView.setImageDrawable(com.iqoption.core.ext.a.n(context, intValue));
    }

    private final void a(ImageView imageView, com.iqoption.core.microservices.billing.response.deposit.cashboxitem.a aVar, Picasso picasso) {
        String ZW = aVar instanceof com.iqoption.core.microservices.billing.response.deposit.cashboxitem.d ? ((com.iqoption.core.microservices.billing.response.deposit.cashboxitem.d) aVar).ZW() : aVar instanceof com.iqoption.core.microservices.billing.response.crypto.a ? ((com.iqoption.core.microservices.billing.response.crypto.a) aVar).ZW() : null;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("squarelight-");
        stringBuilder.append(ZW);
        RequestCreator a = r.a(picasso, stringBuilder.toString());
        Context context = imageView.getContext();
        String str = "view.context";
        kotlin.jvm.internal.i.e(context, str);
        a = a.placeholder(com.iqoption.core.ext.a.n(context, com.iqoption.deposit.o.d.ic_payment_method_placeholder_grey));
        context = imageView.getContext();
        kotlin.jvm.internal.i.e(context, str);
        a.error(com.iqoption.core.ext.a.n(context, com.iqoption.deposit.o.d.ic_payment_method_placeholder_grey)).into(imageView);
    }
}
