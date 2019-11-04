package com.iqoption.core.graphics.animation;

import android.view.animation.AlphaAnimation;
import android.view.animation.Transformation;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0014¨\u0006\t"}, bng = {"Lcom/iqoption/core/graphics/animation/EmptyAnimation;", "Landroid/view/animation/AlphaAnimation;", "()V", "applyTransformation", "", "interpolatedTime", "", "t", "Landroid/view/animation/Transformation;", "core_release"})
/* compiled from: EmptyAnimation.kt */
public final class d extends AlphaAnimation {
    /* Access modifiers changed, original: protected */
    public void applyTransformation(float f, Transformation transformation) {
        kotlin.jvm.internal.i.f(transformation, "t");
    }

    public d() {
        super(1.0f, 1.0f);
    }
}
