package com.iqoption.core.splash;

import android.view.View;
import android.widget.FrameLayout;
import com.airbnb.lottie.LottieAnimationView;
import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "Lcom/iqoption/core/splash/SplashFadingController;", "invoke"})
/* compiled from: SplashFragment.kt */
final class SplashFragment$fadingController$2 extends Lambda implements a<c> {
    final /* synthetic */ d this$0;

    SplashFragment$fadingController$2(d dVar) {
        this.this$0 = dVar;
        super(0);
    }

    /* renamed from: akG */
    public final c invoke() {
        FrameLayout frameLayout = d.b(this.this$0).bfB;
        kotlin.jvm.internal.i.e(frameLayout, "binding.splash");
        View view = frameLayout;
        LottieAnimationView lottieAnimationView = d.b(this.this$0).bfv;
        kotlin.jvm.internal.i.e(lottieAnimationView, "binding.animation");
        return new c(view, lottieAnimationView);
    }
}
