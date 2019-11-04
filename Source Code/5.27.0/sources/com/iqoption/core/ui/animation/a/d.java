package com.iqoption.core.ui.animation.a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import com.iqoption.core.graphics.animation.j;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0012\u0010\f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, bng = {"Lcom/iqoption/core/ui/animation/contentanimators/PopupAnimatorFactory;", "Lcom/iqoption/core/ui/animation/contentanimators/ContentAnimatorFactory;", "frameId", "", "moveDistanceId", "(II)V", "onEnter", "Landroid/animation/Animator;", "content", "Landroid/view/View;", "onExit", "onReenter", "onReturn", "Companion", "core_release"})
/* compiled from: PopupAnimatorFactory.kt */
public final class d implements c {
    @Deprecated
    public static final a bHn = new a();
    private final int bHm;
    private final int frameId;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, bng = {"Lcom/iqoption/core/ui/animation/contentanimators/PopupAnimatorFactory$Companion;", "", "()V", "DURATION", "", "core_release"})
    /* compiled from: PopupAnimatorFactory.kt */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    public Animator ar(View view) {
        kotlin.jvm.internal.i.f(view, "content");
        return null;
    }

    public Animator as(View view) {
        kotlin.jvm.internal.i.f(view, "content");
        return null;
    }

    public d(int i, int i2) {
        this.frameId = i;
        this.bHm = i2;
    }

    public /* synthetic */ d(int i, int i2, int i3, f fVar) {
        if ((i3 & 2) != 0) {
            i2 = com.iqoption.core.i.d.dp24;
        }
        this(i, i2);
    }

    public Animator aq(View view) {
        kotlin.jvm.internal.i.f(view, "content");
        View findViewById = view.findViewById(this.frameId);
        AnimatorSet animatorSet = new AnimatorSet();
        Animator[] animatorArr = new Animator[2];
        animatorArr[0] = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{0.0f, 1.0f});
        animatorArr[1] = ObjectAnimator.ofFloat(findViewById, View.TRANSLATION_Y, new float[]{com.iqoption.core.ext.a.h(view, this.bHm), 0.0f});
        animatorSet.playTogether(animatorArr);
        Animator animator = animatorSet;
        com.iqoption.core.ext.a.a(animator, 250);
        animatorSet.setInterpolator(j.XJ());
        return animator;
    }

    public Animator au(View view) {
        kotlin.jvm.internal.i.f(view, "content");
        View findViewById = view.findViewById(this.frameId);
        AnimatorSet animatorSet = new AnimatorSet();
        Animator[] animatorArr = new Animator[2];
        animatorArr[0] = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{1.0f, 0.0f});
        animatorArr[1] = ObjectAnimator.ofFloat(findViewById, View.TRANSLATION_Y, new float[]{0.0f, com.iqoption.core.ext.a.h(view, this.bHm)});
        animatorSet.playTogether(animatorArr);
        Animator animator = animatorSet;
        com.iqoption.core.ext.a.a(animator, 250);
        animatorSet.setInterpolator(j.XJ());
        return animator;
    }
}
