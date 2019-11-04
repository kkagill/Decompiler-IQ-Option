package com.iqoption.core.ui.c;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import com.iqoption.core.graphics.animation.j;
import com.iqoption.core.i.d;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tJ\u0010\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, bng = {"Lcom/iqoption/core/ui/dialog/DialogAnimatorFactory;", "", "content", "Landroid/view/View;", "frame", "(Landroid/view/View;Landroid/view/View;)V", "makeEnterAnimator", "Landroid/animation/Animator;", "duration", "", "makeExitAnimator", "core_release"})
/* compiled from: DialogAnimatorFactory.kt */
public final class a {
    private final View aHN;
    private final View bID;

    public a(View view, View view2) {
        kotlin.jvm.internal.i.f(view, "content");
        kotlin.jvm.internal.i.f(view2, "frame");
        this.aHN = view;
        this.bID = view2;
    }

    public final Animator bi(long j) {
        AnimatorSet animatorSet = new AnimatorSet();
        Animator[] animatorArr = new Animator[2];
        animatorArr[0] = ObjectAnimator.ofFloat(this.aHN, View.ALPHA, new float[]{0.0f, 1.0f});
        animatorArr[1] = ObjectAnimator.ofFloat(this.bID, View.TRANSLATION_Y, new float[]{com.iqoption.core.ext.a.h(this.bID, d.dp24), 0.0f});
        animatorSet.playTogether(animatorArr);
        Animator animator = animatorSet;
        com.iqoption.core.ext.a.a(animator, j);
        animatorSet.setInterpolator(j.XJ());
        return animator;
    }

    public final Animator bj(long j) {
        AnimatorSet animatorSet = new AnimatorSet();
        Animator[] animatorArr = new Animator[2];
        animatorArr[0] = ObjectAnimator.ofFloat(this.aHN, View.ALPHA, new float[]{1.0f, 0.0f});
        animatorArr[1] = ObjectAnimator.ofFloat(this.bID, View.TRANSLATION_Y, new float[]{0.0f, com.iqoption.core.ext.a.h(this.bID, d.dp24)});
        animatorSet.playTogether(animatorArr);
        Animator animator = animatorSet;
        com.iqoption.core.ext.a.a(animator, j);
        animatorSet.setInterpolator(j.XJ());
        return animator;
    }
}
