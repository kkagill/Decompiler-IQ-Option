package com.iqoption.core.ui.animation.a;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.view.View;
import com.iqoption.core.graphics.animation.j;
import com.iqoption.core.i.d;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006H\u0016J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006H\u0016¨\u0006\u000e"}, bng = {"Lcom/iqoption/core/ui/animation/contentanimators/AlphaSlideAnimatorFactory;", "Lcom/iqoption/core/ui/animation/contentanimators/ContentAnimatorFactory;", "()V", "getMaxTranslation", "", "view", "Landroid/view/View;", "onEnter", "Landroid/animation/Animator;", "content", "onExit", "onReenter", "onReturn", "Companion", "core_release"})
/* compiled from: AlphaSlideAnimatorFactory.kt */
public final class b implements c {
    @Deprecated
    public static final a bHl = new a();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, bng = {"Lcom/iqoption/core/ui/animation/contentanimators/AlphaSlideAnimatorFactory$Companion;", "", "()V", "DURATION", "", "core_release"})
    /* compiled from: AlphaSlideAnimatorFactory.kt */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    public Animator aq(View view) {
        kotlin.jvm.internal.i.f(view, "content");
        PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[2];
        propertyValuesHolderArr[0] = PropertyValuesHolder.ofFloat(View.ALPHA, new float[]{0.0f, 1.0f});
        propertyValuesHolderArr[1] = PropertyValuesHolder.ofFloat(View.TRANSLATION_X, new float[]{av(view), 0.0f});
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, propertyValuesHolderArr);
        Animator animator = ofPropertyValuesHolder;
        com.iqoption.core.ext.a.a(animator, 250);
        ofPropertyValuesHolder.setInterpolator(j.XJ());
        kotlin.jvm.internal.i.e(ofPropertyValuesHolder, "ObjectAnimator.ofPropert…= standardCurve\n        }");
        return animator;
    }

    public Animator ar(View view) {
        kotlin.jvm.internal.i.f(view, "content");
        PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[2];
        propertyValuesHolderArr[0] = PropertyValuesHolder.ofFloat(View.ALPHA, new float[]{0.0f, 1.0f});
        propertyValuesHolderArr[1] = PropertyValuesHolder.ofFloat(View.TRANSLATION_X, new float[]{-av(view), 0.0f});
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, propertyValuesHolderArr);
        Animator animator = ofPropertyValuesHolder;
        com.iqoption.core.ext.a.a(animator, 250);
        ofPropertyValuesHolder.setInterpolator(j.XJ());
        kotlin.jvm.internal.i.e(ofPropertyValuesHolder, "ObjectAnimator.ofPropert…= standardCurve\n        }");
        return animator;
    }

    public Animator as(View view) {
        kotlin.jvm.internal.i.f(view, "content");
        PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[2];
        propertyValuesHolderArr[0] = PropertyValuesHolder.ofFloat(View.ALPHA, new float[]{1.0f, 0.0f});
        propertyValuesHolderArr[1] = PropertyValuesHolder.ofFloat(View.TRANSLATION_X, new float[]{0.0f, -av(view)});
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, propertyValuesHolderArr);
        Animator animator = ofPropertyValuesHolder;
        com.iqoption.core.ext.a.a(animator, 250);
        ofPropertyValuesHolder.setInterpolator(j.XJ());
        kotlin.jvm.internal.i.e(ofPropertyValuesHolder, "ObjectAnimator.ofPropert…= standardCurve\n        }");
        return animator;
    }

    public Animator au(View view) {
        kotlin.jvm.internal.i.f(view, "content");
        PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[2];
        propertyValuesHolderArr[0] = PropertyValuesHolder.ofFloat(View.ALPHA, new float[]{1.0f, 0.0f});
        propertyValuesHolderArr[1] = PropertyValuesHolder.ofFloat(View.TRANSLATION_X, new float[]{0.0f, av(view)});
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, propertyValuesHolderArr);
        Animator animator = ofPropertyValuesHolder;
        com.iqoption.core.ext.a.a(animator, 250);
        ofPropertyValuesHolder.setInterpolator(j.XJ());
        kotlin.jvm.internal.i.e(ofPropertyValuesHolder, "ObjectAnimator.ofPropert…= standardCurve\n        }");
        return animator;
    }

    private final float av(View view) {
        return com.iqoption.core.ext.a.h(view, d.dp64);
    }
}
