package com.iqoption.fragment.rightpanel;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.iqoption.core.ext.a;
import com.iqoption.core.graphics.animation.j;
import com.iqoption.e.io;
import com.iqoption.x.R;
import kotlin.i;
import kotlin.jvm.a.m;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "Landroid/animation/Animator;", "contentView", "Landroid/view/View;", "isEnter", "", "invoke"})
/* compiled from: PhaseNotificationFragment.kt */
final class PhaseNotificationFragment$onCreateTransitionProvider$1 extends Lambda implements m<View, Boolean, Animator> {
    public static final PhaseNotificationFragment$onCreateTransitionProvider$1 dor = new PhaseNotificationFragment$onCreateTransitionProvider$1();

    PhaseNotificationFragment$onCreateTransitionProvider$1() {
        super(2);
    }

    public /* synthetic */ Object w(Object obj, Object obj2) {
        return b((View) obj, ((Boolean) obj2).booleanValue());
    }

    public final Animator b(View view, boolean z) {
        kotlin.jvm.internal.i.f(view, "contentView");
        io ioVar = (io) a.findBinding(view);
        String str = "ObjectAnimator.ofPropert…rve\n                    }";
        ConstraintLayout constraintLayout;
        PropertyValuesHolder[] propertyValuesHolderArr;
        ObjectAnimator ofPropertyValuesHolder;
        Animator animator;
        if (z) {
            ConstraintLayout constraintLayout2 = ioVar.aRA;
            String str2 = "contentLayout";
            kotlin.jvm.internal.i.e(constraintLayout2, str2);
            constraintLayout2.setAlpha(0.0f);
            float b = a.b((ViewDataBinding) ioVar, (int) R.dimen.dp12);
            ConstraintLayout constraintLayout3 = ioVar.aRA;
            kotlin.jvm.internal.i.e(constraintLayout3, str2);
            float f = -b;
            constraintLayout3.setTranslationX(f);
            constraintLayout3 = ioVar.aRA;
            kotlin.jvm.internal.i.e(constraintLayout3, str2);
            constraintLayout3.setTranslationY(f);
            constraintLayout3 = ioVar.aRA;
            kotlin.jvm.internal.i.e(constraintLayout3, str2);
            ConstraintLayout constraintLayout4 = ioVar.aRA;
            kotlin.jvm.internal.i.e(constraintLayout4, str2);
            constraintLayout3.setPivotX(((float) constraintLayout4.getWidth()) - b);
            constraintLayout2 = ioVar.aRA;
            kotlin.jvm.internal.i.e(constraintLayout2, str2);
            constraintLayout2.setPivotY(1.0f);
            constraintLayout2 = ioVar.aRA;
            kotlin.jvm.internal.i.e(constraintLayout2, str2);
            constraintLayout2.setScaleX(0.3f);
            constraintLayout2 = ioVar.aRA;
            kotlin.jvm.internal.i.e(constraintLayout2, str2);
            constraintLayout2.setScaleY(0.3f);
            constraintLayout = ioVar.aRA;
            propertyValuesHolderArr = new PropertyValuesHolder[5];
            propertyValuesHolderArr[0] = PropertyValuesHolder.ofFloat(View.ALPHA, new float[]{1.0f});
            propertyValuesHolderArr[1] = PropertyValuesHolder.ofFloat(View.SCALE_X, new float[]{1.0f});
            propertyValuesHolderArr[2] = PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[]{1.0f});
            propertyValuesHolderArr[3] = PropertyValuesHolder.ofFloat(View.TRANSLATION_X, new float[]{0.0f});
            propertyValuesHolderArr[4] = PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, new float[]{0.0f});
            ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(constraintLayout, propertyValuesHolderArr);
            animator = ofPropertyValuesHolder;
            a.a(animator, 400);
            ofPropertyValuesHolder.setInterpolator(j.XJ());
            kotlin.jvm.internal.i.e(ofPropertyValuesHolder, str);
            return animator;
        }
        constraintLayout = ioVar.aRA;
        propertyValuesHolderArr = new PropertyValuesHolder[3];
        propertyValuesHolderArr[0] = PropertyValuesHolder.ofFloat(View.ALPHA, new float[]{0.0f});
        propertyValuesHolderArr[1] = PropertyValuesHolder.ofFloat(View.SCALE_X, new float[]{0.8f});
        propertyValuesHolderArr[2] = PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[]{0.8f});
        ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(constraintLayout, propertyValuesHolderArr);
        animator = ofPropertyValuesHolder;
        a.a(animator, 300);
        ofPropertyValuesHolder.setInterpolator(j.XJ());
        kotlin.jvm.internal.i.e(ofPropertyValuesHolder, str);
        return animator;
    }
}
