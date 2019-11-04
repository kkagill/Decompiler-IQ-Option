package com.iqoption.core.graphics.animation;

import android.animation.TypeEvaluator;
import android.graphics.Rect;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\u0005¢\u0006\u0002\u0010\u0003J \u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0016R\u000e\u0010\u0004\u001a\u00020\u0002X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, bng = {"Lcom/iqoption/core/graphics/animation/RectEvaluator;", "Landroid/animation/TypeEvaluator;", "Landroid/graphics/Rect;", "()V", "tempRect", "evaluate", "fraction", "", "startValue", "endValue", "Companion", "core_release"})
/* compiled from: Evaluators.kt */
public final class l implements TypeEvaluator<Rect> {
    private static final l big = new l();
    public static final a bih = new a();
    private final Rect bif = new Rect();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, bng = {"Lcom/iqoption/core/graphics/animation/RectEvaluator$Companion;", "", "()V", "instance", "Lcom/iqoption/core/graphics/animation/RectEvaluator;", "instance$annotations", "getInstance", "()Lcom/iqoption/core/graphics/animation/RectEvaluator;", "core_release"})
    /* compiled from: Evaluators.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final l XQ() {
            return l.big;
        }
    }

    public Rect evaluate(float f, Rect rect, Rect rect2) {
        kotlin.jvm.internal.i.f(rect, "startValue");
        kotlin.jvm.internal.i.f(rect2, "endValue");
        this.bif.set(rect.left + ((int) (((float) (rect2.left - rect.left)) * f)), rect.top + ((int) (((float) (rect2.top - rect.top)) * f)), rect.right + ((int) (((float) (rect2.right - rect.right)) * f)), rect.bottom + ((int) (((float) (rect2.bottom - rect.bottom)) * f)));
        return this.bif;
    }
}
