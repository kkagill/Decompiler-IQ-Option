package com.iqoption.core.splash;

import com.airbnb.lottie.e;
import kotlin.d;
import kotlin.i;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u00048FX\u0004¢\u0006\f\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\f\u001a\u00020\r8FX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\t8BX\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000b¨\u0006\u0014"}, bng = {"Lcom/iqoption/core/splash/LogoAnimationFactory;", "", "()V", "areSplashAndLogoTheSame", "", "areSplashAndLogoTheSame$annotations", "getAreSplashAndLogoTheSame", "()Z", "logoCompositionId", "", "getLogoCompositionId", "()I", "splashComposition", "Lcom/airbnb/lottie/LottieComposition;", "getSplashComposition", "()Lcom/airbnb/lottie/LottieComposition;", "splashComposition$delegate", "Lkotlin/Lazy;", "splashCompositionId", "getSplashCompositionId", "core_release"})
/* compiled from: LogoAnimationFactory.kt */
public final class a {
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(a.class), "splashComposition", "getSplashComposition()Lcom/airbnb/lottie/LottieComposition;"))};
    private static final d bFT = g.c(LogoAnimationFactory$splashComposition$2.bFV);
    public static final a bFU = new a();

    public final e akt() {
        d dVar = bFT;
        j jVar = anY[0];
        return (e) dVar.getValue();
    }

    private a() {
    }

    private final int aku() {
        return com.iqoption.core.d.Un().Dq() ? com.iqoption.core.i.j.white_label_progress : com.iqoption.core.i.j.iqoption_logo_loader;
    }

    public final int akv() {
        return com.iqoption.core.d.Un().Dq() ? com.iqoption.core.i.j.white_label_progress : com.iqoption.core.i.j.welcome_logo_showing;
    }

    public static final boolean akw() {
        return bFU.aku() == bFU.akv();
    }
}
