package com.iqoption.core.ui.animation.transitions;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Transition;
import androidx.transition.TransitionValues;
import com.iqoption.core.i.g;
import kotlin.i;
import kotlin.jvm.a.m;

@i(bne = {1, 1, 15}, bnf = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 \"2\u00020\u0001:\u0002\"#BG\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00126\u0010\u0004\u001a2\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0005¢\u0006\u0002\u0010\rBa\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\n\u0012>\b\u0002\u0010\u0010\u001a8\u0012\u0015\u0012\u0013\u0018\u00010\u0011¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0012\u0012\u0015\u0012\u0013\u0018\u00010\u0011¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005¢\u0006\u0002\u0010\u0014J\b\u0010\u001a\u001a\u00020\u0016H\u0002J\b\u0010\u001b\u001a\u00020\u0016H\u0002J\b\u0010\u001c\u001a\u00020\u0016H\u0002J\b\u0010\u001d\u001a\u00020\u0016H\u0002J\n\u0010\u001e\u001a\u0004\u0018\u00010\u0016H\u0016J\n\u0010\u001f\u001a\u0004\u0018\u00010\u0016H\u0016J\n\u0010 \u001a\u0004\u0018\u00010\u0016H\u0016J\n\u0010!\u001a\u0004\u0018\u00010\u0016H\u0016R\u000e\u0010\u0004\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000RD\u0010\u0010\u001a8\u0012\u0015\u0012\u0013\u0018\u00010\u0011¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0012\u0012\u0015\u0012\u0013\u0018\u00010\u0011¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000¨\u0006$"}, bng = {"Lcom/iqoption/core/ui/animation/transitions/FragmentTransitionProvider;", "Lcom/iqoption/core/ui/animation/transitions/TransitionProvider;", "fragment", "Lcom/iqoption/core/ui/fragment/IQFragment;", "animatorFactory", "Lkotlin/Function2;", "Landroid/view/View;", "Lkotlin/ParameterName;", "name", "content", "", "isEnter", "Landroid/animation/Animator;", "(Lcom/iqoption/core/ui/fragment/IQFragment;Lkotlin/jvm/functions/Function2;)V", "Lcom/iqoption/core/ui/animation/contentanimators/ContentAnimatorFactory;", "isStateFull", "isTransitionRequired", "Landroidx/transition/TransitionValues;", "startValues", "endValues", "(Lcom/iqoption/core/ui/fragment/IQFragment;Lcom/iqoption/core/ui/animation/contentanimators/ContentAnimatorFactory;ZLkotlin/jvm/functions/Function2;)V", "enterTransition", "Landroidx/transition/Transition;", "exitTransition", "reenterTransition", "returnTransition", "createEnterTransition", "createExitTransition", "createReenterTransition", "createReturnTransition", "getEnterTransition", "getExitTransition", "getReenterTransition", "getReturnTransition", "Companion", "Transit", "core_release"})
/* compiled from: FragmentTransitionProvider.kt */
public final class c implements e {
    public static final m<TransitionValues, TransitionValues, Boolean> bHA = FragmentTransitionProvider$Companion$ALWAYS_REQUIRED_TRANSITION$1.bHD;
    public static final a bHB = new a();
    public static final com.iqoption.core.ui.animation.a.a bHx = new com.iqoption.core.ui.animation.a.a();
    public static final com.iqoption.core.ui.animation.a.b bHy = new com.iqoption.core.ui.animation.a.b();
    public static final com.iqoption.core.ui.animation.a.d bHz = new com.iqoption.core.ui.animation.a.d(g.content, 0, 2, null);
    private final com.iqoption.core.ui.fragment.d bHf;
    private Transition bHq;
    private Transition bHr;
    private Transition bHs;
    private Transition bHt;
    private final com.iqoption.core.ui.animation.a.c bHu;
    private final boolean bHv;
    private final m<TransitionValues, TransitionValues, Boolean> bHw;

    @i(bne = {1, 1, 15}, bnf = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u001a\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0007R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0002\n\u0000R&\u0010\u0007\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\n0\b8\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u00020\f8\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, bng = {"Lcom/iqoption/core/ui/animation/transitions/FragmentTransitionProvider$Companion;", "", "()V", "ALPHA_SCALE_ANIMATOR_FACTORY", "Lcom/iqoption/core/ui/animation/contentanimators/AlphaScaleAnimatorFactory;", "ALPHA_SLIDE_ANIMATOR_FACTORY", "Lcom/iqoption/core/ui/animation/contentanimators/AlphaSlideAnimatorFactory;", "ALWAYS_REQUIRED_TRANSITION", "Lkotlin/Function2;", "Landroidx/transition/TransitionValues;", "", "POPUP_ANIMATOR_FACTORY", "Lcom/iqoption/core/ui/animation/contentanimators/PopupAnimatorFactory;", "getAlphaScaleProvider", "Lcom/iqoption/core/ui/animation/transitions/TransitionProvider;", "fragment", "Lcom/iqoption/core/ui/fragment/IQFragment;", "getAlphaSlideProvider", "getPopupProvider", "frameId", "", "core_release"})
    /* compiled from: FragmentTransitionProvider.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final e d(com.iqoption.core.ui.fragment.d dVar) {
            kotlin.jvm.internal.i.f(dVar, "fragment");
            return new c(dVar, c.bHx, true, null, 8, null);
        }

        public final e e(com.iqoption.core.ui.fragment.d dVar) {
            kotlin.jvm.internal.i.f(dVar, "fragment");
            return new c(dVar, c.bHy, true, null, 8, null);
        }

        public static /* synthetic */ e a(a aVar, com.iqoption.core.ui.fragment.d dVar, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                i = g.content;
            }
            return aVar.a(dVar, i);
        }

        public final e a(com.iqoption.core.ui.fragment.d dVar, int i) {
            kotlin.jvm.internal.i.f(dVar, "fragment");
            com.iqoption.core.ui.animation.a.d dVar2 = c.bHz;
            if (i != g.content) {
                dVar2 = new com.iqoption.core.ui.animation.a.d(i, 0, 2, null);
            }
            return new c(dVar, dVar2, true, null, 8, null);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b¢\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\b"}, bng = {"Lcom/iqoption/core/ui/animation/transitions/FragmentTransitionProvider$Transit;", "Lcom/iqoption/core/ui/animation/transitions/AnimatorTransition;", "(Lcom/iqoption/core/ui/animation/transitions/FragmentTransitionProvider;)V", "isTransitionRequired", "", "startValues", "Landroidx/transition/TransitionValues;", "endValues", "core_release"})
    /* compiled from: FragmentTransitionProvider.kt */
    private abstract class b extends a {
        public b() {
            super(c.this.bHf.alx());
        }

        public boolean isTransitionRequired(TransitionValues transitionValues, TransitionValues transitionValues2) {
            m a = c.this.bHw;
            if (a != null) {
                Boolean bool = (Boolean) a.w(transitionValues, transitionValues2);
                if (bool != null) {
                    return bool.booleanValue();
                }
            }
            return super.isTransitionRequired(transitionValues, transitionValues2);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00060\u0001R\u00020\u0002J&\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\n"}, bng = {"com/iqoption/core/ui/animation/transitions/FragmentTransitionProvider$createEnterTransition$1", "Lcom/iqoption/core/ui/animation/transitions/FragmentTransitionProvider$Transit;", "Lcom/iqoption/core/ui/animation/transitions/FragmentTransitionProvider;", "createAnimator", "Landroid/animation/Animator;", "sceneRoot", "Landroid/view/ViewGroup;", "startValues", "Landroidx/transition/TransitionValues;", "endValues", "core_release"})
    /* compiled from: FragmentTransitionProvider.kt */
    public static final class c extends b {
        final /* synthetic */ c bHE;

        c(c cVar) {
            this.bHE = cVar;
            super();
        }

        public Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
            kotlin.jvm.internal.i.f(viewGroup, "sceneRoot");
            if (transitionValues2 != null) {
                View view = transitionValues2.view;
                if (view != null) {
                    return this.bHE.bHu.aq(view);
                }
            }
            return null;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00060\u0001R\u00020\u0002J&\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\n"}, bng = {"com/iqoption/core/ui/animation/transitions/FragmentTransitionProvider$createExitTransition$1", "Lcom/iqoption/core/ui/animation/transitions/FragmentTransitionProvider$Transit;", "Lcom/iqoption/core/ui/animation/transitions/FragmentTransitionProvider;", "createAnimator", "Landroid/animation/Animator;", "sceneRoot", "Landroid/view/ViewGroup;", "startValues", "Landroidx/transition/TransitionValues;", "endValues", "core_release"})
    /* compiled from: FragmentTransitionProvider.kt */
    public static final class d extends b {
        final /* synthetic */ c bHE;

        @i(bne = {1, 1, 15}, bnf = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006¸\u0006\u0007"}, bng = {"com/iqoption/core/ui/animation/transitions/FragmentTransitionProvider$createExitTransition$1$createAnimator$1$1$1", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "core_release", "com/iqoption/core/ui/animation/transitions/FragmentTransitionProvider$createExitTransition$1$$special$$inlined$also$lambda$1"})
        /* compiled from: FragmentTransitionProvider.kt */
        public static final class a extends AnimatorListenerAdapter {
            final /* synthetic */ ViewGroup aNJ;
            final /* synthetic */ View bHF;
            final /* synthetic */ d bHG;

            a(View view, d dVar, ViewGroup viewGroup) {
                this.bHF = view;
                this.bHG = dVar;
                this.aNJ = viewGroup;
            }

            public void onAnimationEnd(Animator animator) {
                this.aNJ.getOverlay().remove(this.bHF);
            }
        }

        d(c cVar) {
            this.bHE = cVar;
            super();
        }

        public Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
            kotlin.jvm.internal.i.f(viewGroup, "sceneRoot");
            if (transitionValues == null) {
                return null;
            }
            View view = transitionValues.view;
            if (view == null) {
                return null;
            }
            Animator as = this.bHE.bHu.as(view);
            if (as == null) {
                return null;
            }
            viewGroup.getOverlay().add(view);
            as.addListener(new a(view, this, viewGroup));
            return as;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00060\u0001R\u00020\u0002J&\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\n"}, bng = {"com/iqoption/core/ui/animation/transitions/FragmentTransitionProvider$createReenterTransition$1", "Lcom/iqoption/core/ui/animation/transitions/FragmentTransitionProvider$Transit;", "Lcom/iqoption/core/ui/animation/transitions/FragmentTransitionProvider;", "createAnimator", "Landroid/animation/Animator;", "sceneRoot", "Landroid/view/ViewGroup;", "startValues", "Landroidx/transition/TransitionValues;", "endValues", "core_release"})
    /* compiled from: FragmentTransitionProvider.kt */
    public static final class e extends b {
        final /* synthetic */ c bHE;

        e(c cVar) {
            this.bHE = cVar;
            super();
        }

        public Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
            kotlin.jvm.internal.i.f(viewGroup, "sceneRoot");
            if (transitionValues2 != null) {
                View view = transitionValues2.view;
                if (view != null) {
                    return this.bHE.bHu.ar(view);
                }
            }
            return null;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00060\u0001R\u00020\u0002J&\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\n"}, bng = {"com/iqoption/core/ui/animation/transitions/FragmentTransitionProvider$createReturnTransition$1", "Lcom/iqoption/core/ui/animation/transitions/FragmentTransitionProvider$Transit;", "Lcom/iqoption/core/ui/animation/transitions/FragmentTransitionProvider;", "createAnimator", "Landroid/animation/Animator;", "sceneRoot", "Landroid/view/ViewGroup;", "startValues", "Landroidx/transition/TransitionValues;", "endValues", "core_release"})
    /* compiled from: FragmentTransitionProvider.kt */
    public static final class f extends b {
        final /* synthetic */ c bHE;

        @i(bne = {1, 1, 15}, bnf = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006¸\u0006\u0007"}, bng = {"com/iqoption/core/ui/animation/transitions/FragmentTransitionProvider$createReturnTransition$1$createAnimator$1$1$1", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "core_release", "com/iqoption/core/ui/animation/transitions/FragmentTransitionProvider$createReturnTransition$1$$special$$inlined$also$lambda$1"})
        /* compiled from: FragmentTransitionProvider.kt */
        public static final class a extends AnimatorListenerAdapter {
            final /* synthetic */ ViewGroup aNJ;
            final /* synthetic */ View bHF;
            final /* synthetic */ f bHH;

            a(View view, f fVar, ViewGroup viewGroup) {
                this.bHF = view;
                this.bHH = fVar;
                this.aNJ = viewGroup;
            }

            public void onAnimationEnd(Animator animator) {
                this.aNJ.getOverlay().remove(this.bHF);
            }
        }

        f(c cVar) {
            this.bHE = cVar;
            super();
        }

        public Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
            kotlin.jvm.internal.i.f(viewGroup, "sceneRoot");
            if (transitionValues == null) {
                return null;
            }
            View view = transitionValues.view;
            if (view == null) {
                return null;
            }
            Animator au = this.bHE.bHu.au(view);
            if (au == null) {
                return null;
            }
            viewGroup.getOverlay().add(view);
            au.addListener(new a(view, this, viewGroup));
            return au;
        }
    }

    public c(com.iqoption.core.ui.fragment.d dVar, com.iqoption.core.ui.animation.a.c cVar, boolean z, m<? super TransitionValues, ? super TransitionValues, Boolean> mVar) {
        kotlin.jvm.internal.i.f(dVar, "fragment");
        kotlin.jvm.internal.i.f(cVar, "animatorFactory");
        this.bHf = dVar;
        this.bHu = cVar;
        this.bHv = z;
        this.bHw = mVar;
    }

    public /* synthetic */ c(com.iqoption.core.ui.fragment.d dVar, com.iqoption.core.ui.animation.a.c cVar, boolean z, m mVar, int i, f fVar) {
        if ((i & 2) != 0) {
            cVar = bHx;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            mVar = (m) null;
        }
        this(dVar, cVar, z, mVar);
    }

    public c(com.iqoption.core.ui.fragment.d dVar, final m<? super View, ? super Boolean, ? extends Animator> mVar) {
        kotlin.jvm.internal.i.f(dVar, "fragment");
        kotlin.jvm.internal.i.f(mVar, "animatorFactory");
        this(dVar, new com.iqoption.core.ui.animation.a.c() {
            public Animator aq(View view) {
                kotlin.jvm.internal.i.f(view, "content");
                return (Animator) mVar.w(view, Boolean.valueOf(true));
            }

            public Animator ar(View view) {
                kotlin.jvm.internal.i.f(view, "content");
                return (Animator) mVar.w(view, Boolean.valueOf(true));
            }

            public Animator as(View view) {
                kotlin.jvm.internal.i.f(view, "content");
                return (Animator) mVar.w(view, Boolean.valueOf(false));
            }

            public Animator au(View view) {
                kotlin.jvm.internal.i.f(view, "content");
                return (Animator) mVar.w(view, Boolean.valueOf(false));
            }
        }, false, null, 12, null);
    }

    public Transition RY() {
        if (!this.bHv) {
            return akY();
        }
        Transition transition = this.bHq;
        if (transition != null) {
            return transition;
        }
        transition = akY();
        this.bHq = transition;
        return transition;
    }

    public Transition RZ() {
        if (!this.bHv) {
            return akZ();
        }
        Transition transition = this.bHr;
        if (transition != null) {
            return transition;
        }
        transition = akZ();
        this.bHr = transition;
        return transition;
    }

    public Transition Sb() {
        if (!this.bHv) {
            return ala();
        }
        Transition transition = this.bHs;
        if (transition != null) {
            return transition;
        }
        transition = ala();
        this.bHs = transition;
        return transition;
    }

    public Transition Sa() {
        if (!this.bHv) {
            return alb();
        }
        Transition transition = this.bHt;
        if (transition != null) {
            return transition;
        }
        transition = alb();
        this.bHt = transition;
        return transition;
    }

    private final Transition akY() {
        return new c(this);
    }

    private final Transition akZ() {
        return new e(this);
    }

    private final Transition ala() {
        return b.bHp.a(this.bHf, new d(this));
    }

    private final Transition alb() {
        return b.bHp.a(this.bHf, new f(this));
    }
}
