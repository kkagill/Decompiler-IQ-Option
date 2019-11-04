package com.iqoption.core.splash;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.view.View;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.iqoption.core.graphics.animation.j;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\n8BX\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000f8BX\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\n \u000b*\u0004\u0018\u00010\n0\n8BX\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\rR\u0014\u0010\u0014\u001a\u00020\u000f8BX\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0011R*\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017@FX\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, bng = {"Lcom/iqoption/core/splash/SplashFadingController;", "", "view", "Landroid/view/View;", "animView", "Lcom/airbnb/lottie/LottieAnimationView;", "(Landroid/view/View;Lcom/airbnb/lottie/LottieAnimationView;)V", "animationController", "Lcom/iqoption/core/splash/SplashAnimationController;", "backwardAnimator", "Landroid/animation/ObjectAnimator;", "kotlin.jvm.PlatformType", "getBackwardAnimator", "()Landroid/animation/ObjectAnimator;", "backwardDuration", "", "getBackwardDuration", "()J", "forwardAnimator", "getForwardAnimator", "forwardDuration", "getForwardDuration", "value", "", "isShown", "()Ljava/lang/Boolean;", "setShown", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "runningAnimator", "Landroid/animation/Animator;", "Companion", "core_release"})
/* compiled from: SplashFadingController.kt */
public final class c {
    public static final a bGg = new a();
    private Animator bGc;
    private final b bGd = b.bGa.a(this.bGf);
    private Boolean bGe;
    private final LottieAnimationView bGf;
    private final View view;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, bng = {"Lcom/iqoption/core/splash/SplashFadingController$Companion;", "", "()V", "DURATION", "", "core_release"})
    /* compiled from: SplashFadingController.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/core/splash/SplashFadingController$isShown$1$1", "Lcom/iqoption/core/graphics/animation/CancelCompleteAnimatorListener;", "onCompleted", "", "animation", "Landroid/animation/Animator;", "core_release"})
    /* compiled from: SplashFadingController.kt */
    public static final class b extends com.iqoption.core.graphics.animation.b {
        final /* synthetic */ c bGh;

        b(c cVar) {
            this.bGh = cVar;
        }

        public void b(Animator animator) {
            com.iqoption.core.ext.a.al(this.bGh.view);
        }
    }

    public c(View view, LottieAnimationView lottieAnimationView) {
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        kotlin.jvm.internal.i.f(lottieAnimationView, "animView");
        this.view = view;
        this.bGf = lottieAnimationView;
    }

    private final ObjectAnimator akz() {
        View view = this.view;
        r1 = new PropertyValuesHolder[3];
        r1[0] = PropertyValuesHolder.ofFloat(View.ALPHA, new float[]{1.0f});
        r1[1] = PropertyValuesHolder.ofFloat(View.SCALE_X, new float[]{1.0f});
        r1[2] = PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[]{1.0f});
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, r1);
        ofPropertyValuesHolder.setInterpolator(j.XJ());
        return ofPropertyValuesHolder;
    }

    private final ObjectAnimator akA() {
        View view = this.view;
        r1 = new PropertyValuesHolder[3];
        r1[0] = PropertyValuesHolder.ofFloat(View.ALPHA, new float[]{0.0f});
        r1[1] = PropertyValuesHolder.ofFloat(View.SCALE_X, new float[]{1.1f});
        r1[2] = PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[]{1.1f});
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, r1);
        ofPropertyValuesHolder.setInterpolator(j.XJ());
        return ofPropertyValuesHolder;
    }

    private final long akB() {
        return c.av((1.0f - this.view.getAlpha()) * ((float) 300));
    }

    private final long akC() {
        return c.av(this.view.getAlpha() * ((float) 300));
    }

    public final void m(Boolean bool) {
        if (!(bool == null || (kotlin.jvm.internal.i.y(bool, this.bGe) ^ 1) == 0)) {
            if (this.bGe != null) {
                ObjectAnimator duration;
                Animator animator = this.bGc;
                if (animator != null) {
                    animator.cancel();
                }
                if (bool.booleanValue()) {
                    com.iqoption.core.ext.a.ak(this.view);
                    this.bGd.play();
                    duration = akz().setDuration(akB());
                } else {
                    this.bGd.stop();
                    duration = akA().setDuration(akC());
                    duration.addListener(new b(this));
                }
                duration.start();
                this.bGc = duration;
            } else if (bool.booleanValue()) {
                com.iqoption.core.ext.a.ak(this.view);
                this.bGd.play();
            } else {
                com.iqoption.core.ext.a.al(this.view);
                this.bGd.stop();
            }
            this.bGe = bool;
        }
    }
}
