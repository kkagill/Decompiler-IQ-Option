package com.iqoption.core.ui.animation;

import android.animation.TimeInterpolator;
import android.view.animation.Interpolator;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, bng = {"Lcom/iqoption/core/ui/animation/ReverseInterpolator;", "Landroid/view/animation/Interpolator;", "delegate", "Landroid/animation/TimeInterpolator;", "(Landroid/animation/TimeInterpolator;)V", "getInterpolation", "", "input", "core_release"})
/* compiled from: ReverseInterpolator.kt */
public final class d implements Interpolator {
    private final TimeInterpolator bHj;

    public d() {
        this(null, 1, null);
    }

    public d(TimeInterpolator timeInterpolator) {
        kotlin.jvm.internal.i.f(timeInterpolator, "delegate");
        this.bHj = timeInterpolator;
    }

    public /* synthetic */ d(TimeInterpolator timeInterpolator, int i, f fVar) {
        if ((i & 1) != 0) {
            timeInterpolator = new FastOutSlowInInterpolator();
        }
        this(timeInterpolator);
    }

    public float getInterpolation(float f) {
        return ((float) 1) - this.bHj.getInterpolation(f);
    }
}
