package com.iqoption.core.splash;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.RenderMode;
import com.airbnb.lottie.e;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.iqoption.core.d.c;
import kotlin.f.d;
import kotlin.i;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000=\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\n\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\r\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0002\u0010\u0013J\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u0015J\u000e\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0012J\u001c\u0010\u0014\u001a\u00020\u0015*\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u001aH\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\f\u001a\u0004\u0018\u00010\u00038FX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e¨\u0006\u001c"}, bng = {"Lcom/iqoption/core/splash/SplashAnimationController;", "", "v", "Lcom/airbnb/lottie/LottieAnimationView;", "loopComposition", "Lcom/airbnb/lottie/LottieComposition;", "(Lcom/airbnb/lottie/LottieAnimationView;Lcom/airbnb/lottie/LottieComposition;)V", "isStopped", "", "loopAnimatorListener", "com/iqoption/core/splash/SplashAnimationController$loopAnimatorListener$1", "Lcom/iqoption/core/splash/SplashAnimationController$loopAnimatorListener$1;", "view", "getView", "()Lcom/airbnb/lottie/LottieAnimationView;", "view$delegate", "Lkotlin/properties/ReadWriteProperty;", "getProgress", "", "()Ljava/lang/Float;", "play", "", "stop", "stopFromState", "progress", "repeatCount", "", "Companion", "core_release"})
/* compiled from: SplashAnimationController.kt */
public final class b {
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(b.class), Promotion.ACTION_VIEW, "getView()Lcom/airbnb/lottie/LottieAnimationView;"))};
    public static final a bGa = new a();
    private final b bFW = new b(this);
    private final d bFX;
    private boolean bFY;
    private final e bFZ;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, bng = {"Lcom/iqoption/core/splash/SplashAnimationController$Companion;", "", "()V", "create", "Lcom/iqoption/core/splash/SplashAnimationController;", "animView", "Lcom/airbnb/lottie/LottieAnimationView;", "core_release"})
    /* compiled from: SplashAnimationController.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final b a(LottieAnimationView lottieAnimationView) {
            kotlin.jvm.internal.i.f(lottieAnimationView, "animView");
            e akt = a.bFU.akt();
            kotlin.jvm.internal.i.e(akt, "LogoAnimationFactory.splashComposition");
            return new b(lottieAnimationView, akt);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, bng = {"com/iqoption/core/splash/SplashAnimationController$loopAnimatorListener$1", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationRepeat", "", "animation", "Landroid/animation/Animator;", "core_release"})
    /* compiled from: SplashAnimationController.kt */
    public static final class b extends AnimatorListenerAdapter {
        final /* synthetic */ b bGb;

        b(b bVar) {
            this.bGb = bVar;
        }

        public void onAnimationRepeat(Animator animator) {
            if (this.bGb.bFY) {
                LottieAnimationView SZ = this.bGb.SZ();
                if (SZ != null) {
                    SZ.setRepeatCount(0);
                }
                SZ = this.bGb.SZ();
                if (SZ != null) {
                    SZ.ad();
                }
            }
        }
    }

    public static final b a(LottieAnimationView lottieAnimationView) {
        return bGa.a(lottieAnimationView);
    }

    public final LottieAnimationView SZ() {
        return (LottieAnimationView) this.bFX.b(this, anY[0]);
    }

    public b(LottieAnimationView lottieAnimationView, e eVar) {
        kotlin.jvm.internal.i.f(lottieAnimationView, "v");
        kotlin.jvm.internal.i.f(eVar, "loopComposition");
        this.bFZ = eVar;
        this.bFX = c.bL(lottieAnimationView);
    }

    private final void a(LottieAnimationView lottieAnimationView, float f, int i) {
        lottieAnimationView.ab();
        lottieAnimationView.ac();
        lottieAnimationView.setComposition(this.bFZ);
        lottieAnimationView.setRenderMode(RenderMode.AUTOMATIC);
        lottieAnimationView.setRepeatCount(i);
        lottieAnimationView.a(this.bFW);
        lottieAnimationView.setMinProgress(f);
        lottieAnimationView.Z();
    }

    public final void play() {
        LottieAnimationView SZ = SZ();
        if (SZ != null && !SZ.isAnimating()) {
            this.bFY = false;
            a(SZ, 0.0f, -1);
        }
    }

    public final void stop() {
        LottieAnimationView SZ = SZ();
        if (SZ != null && SZ.isAnimating()) {
            this.bFY = true;
        }
    }

    public final void O(float f) {
        LottieAnimationView SZ = SZ();
        if (SZ != null) {
            this.bFY = true;
            a(SZ, f, 0);
        }
    }

    public final Float aky() {
        LottieAnimationView SZ = SZ();
        return SZ != null ? Float.valueOf(SZ.getProgress()) : null;
    }
}
