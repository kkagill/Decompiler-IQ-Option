package com.iqoption.core.ui.animation.transitions;

import android.animation.Animator;
import android.view.ViewGroup;
import androidx.transition.Transition;
import androidx.transition.TransitionValues;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0011\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J&\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000bH\u0016¨\u0006\u0013"}, bng = {"Lcom/iqoption/core/ui/animation/transitions/AnimatorTransition;", "Landroidx/transition/Transition;", "f", "Lcom/iqoption/core/ui/fragment/IQFragment;", "(Lcom/iqoption/core/ui/fragment/IQFragment;)V", "targetName", "", "(Ljava/lang/String;)V", "captureEndValues", "", "transitionValues", "Landroidx/transition/TransitionValues;", "captureStartValues", "createAnimator", "Landroid/animation/Animator;", "sceneRoot", "Landroid/view/ViewGroup;", "startValues", "endValues", "core_release"})
/* compiled from: AnimatorTransition.kt */
public class a extends Transition {
    public void captureEndValues(TransitionValues transitionValues) {
        kotlin.jvm.internal.i.f(transitionValues, "transitionValues");
    }

    public void captureStartValues(TransitionValues transitionValues) {
        kotlin.jvm.internal.i.f(transitionValues, "transitionValues");
    }

    public Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        kotlin.jvm.internal.i.f(viewGroup, "sceneRoot");
        return null;
    }

    public a(String str) {
        if (str != null) {
            addTarget(str);
        }
    }

    public /* synthetic */ a(String str, int i, f fVar) {
        if ((i & 1) != 0) {
            str = (String) null;
        }
        this(str);
    }
}
