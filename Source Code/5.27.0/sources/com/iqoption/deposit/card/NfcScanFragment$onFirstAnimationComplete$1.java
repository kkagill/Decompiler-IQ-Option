package com.iqoption.deposit.card;

import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.e;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;
import kotlin.l;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "it", "Lcom/airbnb/lottie/LottieComposition;", "invoke"})
/* compiled from: NfcScanFragment.kt */
final class NfcScanFragment$onFirstAnimationComplete$1 extends Lambda implements b<e, l> {
    final /* synthetic */ f this$0;

    NfcScanFragment$onFirstAnimationComplete$1(f fVar) {
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
            lottieAnimationView.p(true);
            lottieAnimationView.Z();
        }
    }
}
