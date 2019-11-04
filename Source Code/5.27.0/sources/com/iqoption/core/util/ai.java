package com.iqoption.core.util;

import android.animation.LayoutTransition;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, bng = {"Lcom/iqoption/core/util/ViewUtil;", "", "()V", "addStatusBarPaddingToLayout", "", "layout", "Landroid/view/ViewGroup;", "getLayoutTransitionWithChangingWithoutDelay", "Landroid/animation/LayoutTransition;", "core_release"})
/* compiled from: ViewUtil.kt */
public final class ai {
    public static final ai bRN = new ai();

    private ai() {
    }

    public final LayoutTransition anP() {
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setStartDelay(2, 0);
        layoutTransition.setStartDelay(0, 0);
        layoutTransition.setStartDelay(1, 0);
        layoutTransition.setStartDelay(3, 0);
        layoutTransition.setStagger(2, 0);
        layoutTransition.setStagger(0, 0);
        layoutTransition.setStagger(1, 0);
        layoutTransition.setStagger(3, 0);
        layoutTransition.setStagger(4, 0);
        layoutTransition.setStartDelay(4, 0);
        layoutTransition.enableTransitionType(4);
        return layoutTransition;
    }
}
