package com.iqoption.core.splash;

import com.airbnb.lottie.e;
import com.iqoption.core.d;
import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "Lcom/airbnb/lottie/LottieComposition;", "invoke"})
/* compiled from: LogoAnimationFactory.kt */
final class LogoAnimationFactory$splashComposition$2 extends Lambda implements a<e> {
    public static final LogoAnimationFactory$splashComposition$2 bFV = new LogoAnimationFactory$splashComposition$2();

    LogoAnimationFactory$splashComposition$2() {
        super(0);
    }

    /* renamed from: akx */
    public final e invoke() {
        e a = e.a.a(d.Uo().getResources().openRawResource(a.bFU.aku()));
        if (a == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        return a;
    }
}
