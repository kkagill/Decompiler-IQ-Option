package com.iqoption.alerts.util;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.view.View;
import androidx.annotation.IdRes;
import com.iqoption.alerts.b.b;
import com.iqoption.core.graphics.animation.j;
import com.iqoption.core.ui.animation.transitions.e;
import com.iqoption.core.ui.fragment.d;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b&\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0017\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\tH&R\u000e\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, bng = {"Lcom/iqoption/alerts/util/PositionController;", "", "contentId", "", "animPivot", "(II)V", "animateEnter", "Landroid/animation/Animator;", "view", "Landroid/view/View;", "animateExit", "onCreateTransitionProvider", "Lcom/iqoption/core/ui/animation/transitions/TransitionProvider;", "f", "Lcom/iqoption/core/ui/fragment/IQFragment;", "onCreateView", "", "Companion", "alerts_release"})
/* compiled from: PositionController.kt */
public abstract class c {
    public static final a aqx = new a();
    private final int aqv;
    private final int aqw;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, bng = {"Lcom/iqoption/alerts/util/PositionController$Companion;", "", "()V", "ARG_ANIM_PIVOT", "", "alerts_release"})
    /* compiled from: PositionController.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    public c(@IdRes int i, int i2) {
        this.aqv = i;
        this.aqw = i2;
    }

    public final e b(d dVar) {
        kotlin.jvm.internal.i.f(dVar, "f");
        return new com.iqoption.core.ui.animation.transitions.c(dVar, new PositionController$onCreateTransitionProvider$1(this));
    }

    private final Animator P(View view) {
        float f;
        Animator[] animatorArr;
        PropertyValuesHolder[] propertyValuesHolderArr;
        Animator animator;
        AnimatorSet animatorSet = new AnimatorSet();
        float h = com.iqoption.core.ext.a.h(view, b.dp12);
        float f2 = -h;
        int i = this.aqw;
        if (i != 0) {
            if (i == 1) {
                f2 = (float) view.getWidth();
                f = h;
                h = 0.0f;
            } else if (i == 2) {
                f2 = (float) view.getWidth();
                f = h;
                h = (float) view.getHeight();
            } else if (i == 3) {
                h = (float) view.getHeight();
                f = f2;
                f2 = 0.0f;
            }
            view.setAlpha(0.0f);
            view.setPivotX(f2);
            view.setPivotY(h);
            view.setScaleX(0.5f);
            view.setScaleY(0.5f);
            view.setTranslationX(f);
            animatorArr = new Animator[1];
            propertyValuesHolderArr = new PropertyValuesHolder[4];
            propertyValuesHolderArr[0] = PropertyValuesHolder.ofFloat(View.ALPHA, new float[]{1.0f});
            propertyValuesHolderArr[1] = PropertyValuesHolder.ofFloat(View.TRANSLATION_X, new float[]{0.0f});
            propertyValuesHolderArr[2] = PropertyValuesHolder.ofFloat(View.SCALE_X, new float[]{1.0f});
            propertyValuesHolderArr[3] = PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[]{1.0f});
            animatorArr[0] = ObjectAnimator.ofPropertyValuesHolder(view, propertyValuesHolderArr);
            animatorSet.playTogether(animatorArr);
            animator = animatorSet;
            com.iqoption.core.ext.a.a(animator, 350);
            animatorSet.setInterpolator(j.XJ());
            return animator;
        }
        f = f2;
        h = 0.0f;
        f2 = 0.0f;
        view.setAlpha(0.0f);
        view.setPivotX(f2);
        view.setPivotY(h);
        view.setScaleX(0.5f);
        view.setScaleY(0.5f);
        view.setTranslationX(f);
        animatorArr = new Animator[1];
        propertyValuesHolderArr = new PropertyValuesHolder[4];
        propertyValuesHolderArr[0] = PropertyValuesHolder.ofFloat(View.ALPHA, new float[]{1.0f});
        propertyValuesHolderArr[1] = PropertyValuesHolder.ofFloat(View.TRANSLATION_X, new float[]{0.0f});
        propertyValuesHolderArr[2] = PropertyValuesHolder.ofFloat(View.SCALE_X, new float[]{1.0f});
        propertyValuesHolderArr[3] = PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[]{1.0f});
        animatorArr[0] = ObjectAnimator.ofPropertyValuesHolder(view, propertyValuesHolderArr);
        animatorSet.playTogether(animatorArr);
        animator = animatorSet;
        com.iqoption.core.ext.a.a(animator, 350);
        animatorSet.setInterpolator(j.XJ());
        return animator;
    }

    private final Animator Q(View view) {
        float width;
        float height;
        Animator[] animatorArr;
        PropertyValuesHolder[] propertyValuesHolderArr;
        Animator animator;
        AnimatorSet animatorSet = new AnimatorSet();
        int i = this.aqw;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    width = (float) view.getWidth();
                    height = (float) view.getHeight();
                } else if (i == 3) {
                    height = (float) view.getHeight();
                    width = 0.0f;
                }
                view.setPivotX(width);
                view.setPivotY(height);
                animatorArr = new Animator[1];
                propertyValuesHolderArr = new PropertyValuesHolder[3];
                propertyValuesHolderArr[0] = PropertyValuesHolder.ofFloat(View.ALPHA, new float[]{0.0f});
                propertyValuesHolderArr[1] = PropertyValuesHolder.ofFloat(View.SCALE_X, new float[]{0.7f});
                propertyValuesHolderArr[2] = PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[]{0.7f});
                animatorArr[0] = ObjectAnimator.ofPropertyValuesHolder(view, propertyValuesHolderArr);
                animatorSet.playTogether(animatorArr);
                animator = animatorSet;
                com.iqoption.core.ext.a.a(animator, 350);
                animatorSet.setInterpolator(j.XJ());
                return animator;
            }
            width = (float) view.getWidth();
            height = 0.0f;
            view.setPivotX(width);
            view.setPivotY(height);
            animatorArr = new Animator[1];
            propertyValuesHolderArr = new PropertyValuesHolder[3];
            propertyValuesHolderArr[0] = PropertyValuesHolder.ofFloat(View.ALPHA, new float[]{0.0f});
            propertyValuesHolderArr[1] = PropertyValuesHolder.ofFloat(View.SCALE_X, new float[]{0.7f});
            propertyValuesHolderArr[2] = PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[]{0.7f});
            animatorArr[0] = ObjectAnimator.ofPropertyValuesHolder(view, propertyValuesHolderArr);
            animatorSet.playTogether(animatorArr);
            animator = animatorSet;
            com.iqoption.core.ext.a.a(animator, 350);
            animatorSet.setInterpolator(j.XJ());
            return animator;
        }
        width = 0.0f;
        height = 0.0f;
        view.setPivotX(width);
        view.setPivotY(height);
        animatorArr = new Animator[1];
        propertyValuesHolderArr = new PropertyValuesHolder[3];
        propertyValuesHolderArr[0] = PropertyValuesHolder.ofFloat(View.ALPHA, new float[]{0.0f});
        propertyValuesHolderArr[1] = PropertyValuesHolder.ofFloat(View.SCALE_X, new float[]{0.7f});
        propertyValuesHolderArr[2] = PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[]{0.7f});
        animatorArr[0] = ObjectAnimator.ofPropertyValuesHolder(view, propertyValuesHolderArr);
        animatorSet.playTogether(animatorArr);
        animator = animatorSet;
        com.iqoption.core.ext.a.a(animator, 350);
        animatorSet.setInterpolator(j.XJ());
        return animator;
    }
}
