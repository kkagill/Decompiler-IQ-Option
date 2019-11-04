package com.iqoption.cardsverification.list;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs;
import com.iqoption.cardsverification.a.k;
import com.iqoption.cardsverification.g;
import com.iqoption.core.microservices.billing.verification.response.CardStatus;
import com.iqoption.core.microservices.billing.verification.response.c;
import com.iqoption.core.microservices.billing.verification.response.d;
import io.card.payment.CardType;
import kotlin.TypeCastException;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0010\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0019J\u0010\u0010\u001a\u001a\n \u001c*\u0004\u0018\u00010\u001b0\u001bH\u0002J\u0010\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0010\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0010\u0010 \u001a\u00020\u00162\u0006\u0010!\u001a\u00020\"H\u0002R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, bng = {"Lcom/iqoption/cardsverification/list/VerifyCardViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/iqoption/cardsverification/databinding/VerifyCardItemBinding;", "defaultColor", "", "selectedColor", "listener", "Landroid/view/View$OnClickListener;", "(Lcom/iqoption/cardsverification/databinding/VerifyCardItemBinding;IILandroid/view/View$OnClickListener;)V", "animator", "Landroid/animation/ValueAnimator;", "getAnimator", "()Landroid/animation/ValueAnimator;", "setAnimator", "(Landroid/animation/ValueAnimator;)V", "getBinding", "()Lcom/iqoption/cardsverification/databinding/VerifyCardItemBinding;", "animateItem", "view", "Landroid/view/View;", "animateSelection", "", "bind", "card", "Lcom/iqoption/core/microservices/billing/verification/response/VerifyCard;", "context", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "getSelectableBackgroundId", "setCardNumber", "setIcon", "setStatusIcon", "status", "Lcom/iqoption/core/microservices/billing/verification/response/CardStatus;", "cardsverification_release"})
/* compiled from: VerifyCardHolders.kt */
public final class b extends ViewHolder {
    private ValueAnimator Le;
    private final k aBm;
    private final int aBn;
    private final int aBo;
    private final OnClickListener anf;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, bng = {"<anonymous>", "", "valueAnimator", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate", "com/iqoption/cardsverification/list/VerifyCardViewHolder$animateItem$1$1"})
    /* compiled from: VerifyCardHolders.kt */
    static final class a implements AnimatorUpdateListener {
        final /* synthetic */ b aBp;
        final /* synthetic */ View aBq;

        a(b bVar, View view) {
            this.aBp = bVar;
            this.aBq = view;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            View view = this.aBq;
            kotlin.jvm.internal.i.e(valueAnimator, "valueAnimator");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                view.setBackgroundColor(((Integer) animatedValue).intValue());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/cardsverification/list/VerifyCardViewHolder$animateItem$1$2", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "cardsverification_release"})
    /* compiled from: VerifyCardHolders.kt */
    public static final class b extends AnimatorListenerAdapter {
        final /* synthetic */ b aBp;
        final /* synthetic */ View aBq;

        b(b bVar, View view) {
            this.aBp = bVar;
            this.aBq = view;
        }

        public void onAnimationEnd(Animator animator) {
            View view = this.aBq;
            b bVar = this.aBp;
            Context a = bVar.Le();
            kotlin.jvm.internal.i.e(a, "context()");
            view.setBackgroundResource(bVar.aU(a));
        }
    }

    public b(k kVar, int i, int i2, OnClickListener onClickListener) {
        kotlin.jvm.internal.i.f(kVar, "binding");
        kotlin.jvm.internal.i.f(onClickListener, CastExtraArgs.LISTENER);
        super(kVar.getRoot());
        this.aBm = kVar;
        this.aBn = i;
        this.aBo = i2;
        this.anf = onClickListener;
    }

    public final void c(c cVar) {
        kotlin.jvm.internal.i.f(cVar, "card");
        e(cVar);
        d(cVar);
        e(cVar.Lq());
        View root = this.aBm.getRoot();
        kotlin.jvm.internal.i.e(root, "binding.root");
        root.setTag(cVar);
        root.setOnClickListener(this.anf);
    }

    public final void Ld() {
        ValueAnimator valueAnimator = this.Le;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            View root = this.aBm.getRoot();
            kotlin.jvm.internal.i.e(root, "binding.root");
            this.Le = U(root);
        }
    }

    private final void d(c cVar) {
        TextView textView = this.aBm.aAE;
        kotlin.jvm.internal.i.e(textView, "binding.verifyCardNumber");
        textView.setText(com.iqoption.core.util.c.bQl.hn(cVar.getNumber()));
    }

    private final void e(c cVar) {
        int i;
        CardType hm = com.iqoption.core.util.c.hm(cVar.getNumber());
        ImageView imageView = this.aBm.aAW;
        kotlin.jvm.internal.i.e(imageView, "binding.verifyCardImage");
        Context context = imageView.getContext();
        if (hm != null) {
            i = c.aob[hm.ordinal()];
            if (i == 1) {
                i = g.c.ic_visa;
            } else if (i == 2) {
                i = g.c.ic_mc;
            }
            imageView.setImageDrawable(ContextCompat.getDrawable(context, i));
        }
        i = g.c.ic_payment_method_placeholder;
        imageView.setImageDrawable(ContextCompat.getDrawable(context, i));
    }

    private final void e(CardStatus cardStatus) {
        Integer valueOf;
        if (d.abc().contains(cardStatus)) {
            valueOf = Integer.valueOf(g.c.ic_progress);
        } else if (cardStatus == CardStatus.VERIFIED) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(g.c.ic_attention);
        }
        ImageView imageView = this.aBm.aAG;
        kotlin.jvm.internal.i.e(imageView, "binding.verifyCardStatusIcon");
        if (valueOf != null) {
            imageView.setImageDrawable(ContextCompat.getDrawable(imageView.getContext(), valueOf.intValue()));
            com.iqoption.core.ext.a.ak(imageView);
            return;
        }
        com.iqoption.core.ext.a.al(imageView);
    }

    private final Context Le() {
        View root = this.aBm.getRoot();
        kotlin.jvm.internal.i.e(root, "binding.root");
        return root.getContext();
    }

    private final ValueAnimator U(View view) {
        ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), new Object[]{Integer.valueOf(this.aBo), Integer.valueOf(this.aBn)});
        ofObject.addUpdateListener(new a(this, view));
        ofObject.addListener(new b(this, view));
        ofObject.setDuration(300);
        ofObject.start();
        kotlin.jvm.internal.i.e(ofObject, "ValueAnimator.ofObject(a…        start()\n        }");
        return ofObject;
    }

    private final int aU(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843534, typedValue, true);
        return typedValue.resourceId;
    }
}
