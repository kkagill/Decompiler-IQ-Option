package com.iqoption.core.ui.animation;

import android.animation.Animator;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import androidx.annotation.ColorInt;
import com.google.android.gms.analytics.ecommerce.Promotion;
import java.lang.ref.WeakReference;
import kotlin.TypeCastException;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, bng = {"Lcom/iqoption/core/ui/animation/BackgroundColorAnimator;", "Landroid/animation/ValueAnimator$AnimatorUpdateListener;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "refView", "Ljava/lang/ref/WeakReference;", "onAnimationUpdate", "", "valueAnimator", "Landroid/animation/ValueAnimator;", "Companion", "core_release"})
/* compiled from: BackgroundColorAnimator.kt */
public final class b implements AnimatorUpdateListener {
    public static final a bHe = new a();
    private final WeakReference<View> bHd;

    @i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\bH\u0007¨\u0006\n"}, bng = {"Lcom/iqoption/core/ui/animation/BackgroundColorAnimator$Companion;", "", "()V", "create", "Landroid/animation/Animator;", "target", "Landroid/view/View;", "startColor", "", "endColor", "core_release"})
    /* compiled from: BackgroundColorAnimator.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final Animator d(View view, @ColorInt int i, @ColorInt int i2) {
            kotlin.jvm.internal.i.f(view, "target");
            ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), new Object[]{Integer.valueOf(i), Integer.valueOf(i2)});
            ofObject.addUpdateListener(new b(view));
            kotlin.jvm.internal.i.e(ofObject, "backgroundColorAnimator");
            return ofObject;
        }
    }

    public static final Animator d(View view, @ColorInt int i, @ColorInt int i2) {
        return bHe.d(view, i, i2);
    }

    public b(View view) {
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        this.bHd = new WeakReference(view);
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        kotlin.jvm.internal.i.f(valueAnimator, "valueAnimator");
        View view = (View) this.bHd.get();
        if (view != null) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                view.setBackgroundColor(((Integer) animatedValue).intValue());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
        }
    }
}
