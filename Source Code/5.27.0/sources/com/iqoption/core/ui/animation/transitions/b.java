package com.iqoption.core.ui.animation.transitions;

import android.animation.Animator;
import android.view.ViewGroup;
import androidx.transition.Transition;
import androidx.transition.TransitionValues;
import com.iqoption.core.ui.fragment.d;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0016\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J&\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\tH\u0016J\u001c\u0010\u0011\u001a\u00020\u00122\b\u0010\u000f\u001a\u0004\u0018\u00010\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, bng = {"Lcom/iqoption/core/ui/animation/transitions/FragmentKeepingTransition;", "Landroidx/transition/Transition;", "fragment", "Lcom/iqoption/core/ui/fragment/IQFragment;", "wrapped", "(Lcom/iqoption/core/ui/fragment/IQFragment;Landroidx/transition/Transition;)V", "captureEndValues", "", "transitionValues", "Landroidx/transition/TransitionValues;", "captureStartValues", "createAnimator", "Landroid/animation/Animator;", "sceneRoot", "Landroid/view/ViewGroup;", "startValues", "endValues", "isTransitionRequired", "", "Companion", "core_release"})
/* compiled from: FragmentKeepingTransition.kt */
public class b extends Transition {
    public static final a bHp = new a();
    private final d bHf;
    private final Transition bHo;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004¨\u0006\b"}, bng = {"Lcom/iqoption/core/ui/animation/transitions/FragmentKeepingTransition$Companion;", "", "()V", "wrap", "Landroidx/transition/Transition;", "fragment", "Lcom/iqoption/core/ui/fragment/IQFragment;", "transition", "core_release"})
    /* compiled from: FragmentKeepingTransition.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final Transition a(d dVar, Transition transition) {
            kotlin.jvm.internal.i.f(dVar, "fragment");
            kotlin.jvm.internal.i.f(transition, "transition");
            b bVar = new b(dVar, transition);
            bVar.addTarget(dVar.alx());
            return bVar;
        }
    }

    public b(d dVar, Transition transition) {
        kotlin.jvm.internal.i.f(dVar, "fragment");
        kotlin.jvm.internal.i.f(transition, "wrapped");
        this.bHf = dVar;
        this.bHo = transition;
    }

    public void captureStartValues(TransitionValues transitionValues) {
        kotlin.jvm.internal.i.f(transitionValues, "transitionValues");
        com.iqoption.core.ext.a.w(this.bHf);
        this.bHo.captureStartValues(transitionValues);
    }

    public void captureEndValues(TransitionValues transitionValues) {
        kotlin.jvm.internal.i.f(transitionValues, "transitionValues");
        this.bHo.captureEndValues(transitionValues);
    }

    public Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        kotlin.jvm.internal.i.f(viewGroup, "sceneRoot");
        return this.bHo.createAnimator(viewGroup, transitionValues, transitionValues2);
    }

    public boolean isTransitionRequired(TransitionValues transitionValues, TransitionValues transitionValues2) {
        return this.bHo.isTransitionRequired(transitionValues, transitionValues2);
    }
}
