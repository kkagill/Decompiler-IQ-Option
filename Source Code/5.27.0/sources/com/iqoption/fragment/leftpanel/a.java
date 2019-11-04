package com.iqoption.fragment.leftpanel;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import com.iqoption.core.graphics.animation.j;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0017\u001a\u00020\u0016H\u0002J\b\u0010\u0018\u001a\u00020\u0016H\u0002J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0016H\u0016R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\t8BX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\t8BX\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000bR$\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0010@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, bng = {"Lcom/iqoption/fragment/leftpanel/DotAnimationController;", "Landroid/animation/AnimatorListenerAdapter;", "d", "Lcom/iqoption/core/graphics/drawable/DecoratedPathDrawable;", "(Lcom/iqoption/core/graphics/drawable/DecoratedPathDrawable;)V", "backwardAnimator", "Landroid/animation/ObjectAnimator;", "kotlin.jvm.PlatformType", "backwardDuration", "", "getBackwardDuration", "()J", "forwardAnimator", "forwardDuration", "getForwardDuration", "value", "", "isShown", "()Z", "setShown", "(Z)V", "runningAnimator", "Landroid/animation/Animator;", "animateBackward", "animateForward", "onAnimationEnd", "", "animation", "Companion", "app_optionXRelease"})
/* compiled from: LeftPanelDrawables.kt */
public final class a extends AnimatorListenerAdapter {
    public static final a djF = new a();
    private Animator bGc;
    private boolean bGy;
    private final ObjectAnimator djC;
    private final ObjectAnimator djD;
    private final com.iqoption.core.graphics.a.a djE;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, bng = {"Lcom/iqoption/fragment/leftpanel/DotAnimationController$Companion;", "", "()V", "DURATION", "", "app_optionXRelease"})
    /* compiled from: LeftPanelDrawables.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    public a(com.iqoption.core.graphics.a.a aVar) {
        kotlin.jvm.internal.i.f(aVar, "d");
        this.djE = aVar;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.djE, com.iqoption.core.graphics.a.a.bit.XY(), new float[]{1.0f});
        ofFloat.setInterpolator(j.XJ());
        this.djC = ofFloat;
        ofFloat = ObjectAnimator.ofFloat(this.djE, com.iqoption.core.graphics.a.a.bit.XY(), new float[]{0.0f});
        ofFloat.setInterpolator(j.XJ());
        this.djD = ofFloat;
    }

    public final void aw(boolean z) {
        if (this.bGy != z) {
            Animator aEF;
            Animator animator = this.bGc;
            if (animator != null) {
                animator.cancel();
            }
            this.bGy = z;
            if (z) {
                aEF = aEF();
            } else {
                aEF = aEG();
            }
            this.bGc = aEF;
        }
    }

    private final long akB() {
        return c.av(((float) 150) * (1.0f - this.djE.getProgress()));
    }

    private final long akC() {
        return c.av(((float) 150) * this.djE.getProgress());
    }

    private final Animator aEF() {
        ObjectAnimator objectAnimator = this.djC;
        objectAnimator.setDuration(akB());
        objectAnimator.addListener(this);
        objectAnimator.start();
        kotlin.jvm.internal.i.e(objectAnimator, "forwardAnimator.apply {\n…        start()\n        }");
        return objectAnimator;
    }

    private final Animator aEG() {
        ObjectAnimator objectAnimator = this.djD;
        objectAnimator.setDuration(akC());
        objectAnimator.addListener(this);
        objectAnimator.start();
        kotlin.jvm.internal.i.e(objectAnimator, "backwardAnimator.apply {…        start()\n        }");
        return objectAnimator;
    }

    public void onAnimationEnd(Animator animator) {
        kotlin.jvm.internal.i.f(animator, "animation");
        animator.removeAllListeners();
        this.bGc = (Animator) null;
    }
}
