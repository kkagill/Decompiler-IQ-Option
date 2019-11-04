package com.iqoption.core.ui.animation.transitions;

import androidx.transition.Transition;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0016J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u0016J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0003H\u0016¨\u0006\u0007"}, bng = {"Lcom/iqoption/core/ui/animation/transitions/TransitionProvider;", "", "getEnterTransition", "Landroidx/transition/Transition;", "getExitTransition", "getReenterTransition", "getReturnTransition", "core_release"})
/* compiled from: TransitionProvider.kt */
public interface e {

    @i(bne = {1, 1, 15})
    /* compiled from: TransitionProvider.kt */
    public static final class a {
        public static Transition a(e eVar) {
            return null;
        }

        public static Transition b(e eVar) {
            return null;
        }

        public static Transition c(e eVar) {
            return null;
        }

        public static Transition d(e eVar) {
            return null;
        }
    }

    Transition RY();

    Transition RZ();

    Transition Sa();

    Transition Sb();
}
