package com.iqoption.core.ui.animation.a;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.view.View;
import com.iqoption.core.graphics.animation.j;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u000b"}, bng = {"Lcom/iqoption/core/ui/animation/contentanimators/AlphaScaleAnimatorFactory;", "Lcom/iqoption/core/ui/animation/contentanimators/ContentAnimatorFactory;", "()V", "onEnter", "Landroid/animation/Animator;", "content", "Landroid/view/View;", "onExit", "onReenter", "onReturn", "Companion", "core_release"})
/* compiled from: AlphaScaleAnimatorFactory.kt */
public final class a implements c {
    @Deprecated
    public static final a bHk = new a();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, bng = {"Lcom/iqoption/core/ui/animation/contentanimators/AlphaScaleAnimatorFactory$Companion;", "", "()V", "DURATION", "", "core_release"})
    /* compiled from: AlphaScaleAnimatorFactory.kt */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    public Animator aq(View view) {
        kotlin.jvm.internal.i.f(view, "content");
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.ALPHA, new float[]{0.0f, 1.0f}), PropertyValuesHolder.ofFloat(View.SCALE_X, new float[]{1.1f, 1.0f}), PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[]{1.1f, 1.0f})});
        Animator animator = ofPropertyValuesHolder;
        com.iqoption.core.ext.a.a(animator, 300);
        ofPropertyValuesHolder.setInterpolator(j.XJ());
        kotlin.jvm.internal.i.e(ofPropertyValuesHolder, "ObjectAnimator.ofPropert…= standardCurve\n        }");
        return animator;
    }

    public Animator ar(View view) {
        kotlin.jvm.internal.i.f(view, "content");
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.ALPHA, new float[]{0.0f, 1.0f}), PropertyValuesHolder.ofFloat(View.SCALE_X, new float[]{0.9f, 1.0f}), PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[]{0.9f, 1.0f})});
        Animator animator = ofPropertyValuesHolder;
        com.iqoption.core.ext.a.a(animator, 300);
        ofPropertyValuesHolder.setInterpolator(j.XJ());
        kotlin.jvm.internal.i.e(ofPropertyValuesHolder, "ObjectAnimator.ofPropert…= standardCurve\n        }");
        return animator;
    }

    public Animator as(View view) {
        kotlin.jvm.internal.i.f(view, "content");
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.ALPHA, new float[]{1.0f, 0.0f}), PropertyValuesHolder.ofFloat(View.SCALE_X, new float[]{1.0f, 0.9f}), PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[]{1.0f, 0.9f})});
        Animator animator = ofPropertyValuesHolder;
        com.iqoption.core.ext.a.a(animator, 300);
        ofPropertyValuesHolder.setInterpolator(j.XJ());
        kotlin.jvm.internal.i.e(ofPropertyValuesHolder, "ObjectAnimator.ofPropert…= standardCurve\n        }");
        return animator;
    }

    public Animator au(View view) {
        kotlin.jvm.internal.i.f(view, "content");
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.ALPHA, new float[]{1.0f, 0.0f}), PropertyValuesHolder.ofFloat(View.SCALE_X, new float[]{1.0f, 1.1f}), PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[]{1.0f, 1.1f})});
        Animator animator = ofPropertyValuesHolder;
        com.iqoption.core.ext.a.a(animator, 300);
        ofPropertyValuesHolder.setInterpolator(j.XJ());
        kotlin.jvm.internal.i.e(ofPropertyValuesHolder, "ObjectAnimator.ofPropert…= standardCurve\n        }");
        return animator;
    }
}
