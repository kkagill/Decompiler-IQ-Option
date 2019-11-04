package com.iqoption.deposit.card;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.e;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;
import kotlin.l;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "it", "Lcom/airbnb/lottie/LottieComposition;", "invoke"})
/* compiled from: NfcScanFragment.kt */
final class NfcScanFragment$initViews$1 extends Lambda implements b<e, l> {
    final /* synthetic */ f this$0;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/deposit/card/NfcScanFragment$initViews$1$1$1", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "deposit_release"})
    /* compiled from: NfcScanFragment.kt */
    public static final class a extends AnimatorListenerAdapter {
        final /* synthetic */ LottieAnimationView cxS;
        final /* synthetic */ NfcScanFragment$initViews$1 cxT;
        final /* synthetic */ e cxU;

        a(LottieAnimationView lottieAnimationView, NfcScanFragment$initViews$1 nfcScanFragment$initViews$1, e eVar) {
            this.cxS = lottieAnimationView;
            this.cxT = nfcScanFragment$initViews$1;
            this.cxU = eVar;
        }

        public void onAnimationEnd(Animator animator) {
            this.cxS.b(this);
            if (this.cxT.this$0.isAdded()) {
                this.cxT.this$0.apz();
            }
        }
    }

    NfcScanFragment$initViews$1(f fVar) {
        this.this$0 = fVar;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        f((e) obj);
        return l.eVB;
    }

    public final void f(e eVar) {
        kotlin.jvm.internal.i.f(eVar, "it");
        if (this.this$0.isAdded()) {
            LottieAnimationView lottieAnimationView = f.c(this.this$0).bfv;
            lottieAnimationView.setComposition(eVar);
            lottieAnimationView.Z();
            lottieAnimationView.a(new a(lottieAnimationView, this, eVar));
        }
    }
}
