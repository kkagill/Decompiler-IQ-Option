package com.iqoption.welcome.register.social;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.iqoption.core.graphics.animation.j;
import com.iqoption.welcome.a.s;
import java.util.ArrayList;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\r\u0010\u0005\u001a\u00020\u0006H\u0010¢\u0006\u0002\b\u0007J\r\u0010\b\u001a\u00020\u0006H\u0010¢\u0006\u0002\b\t¨\u0006\n"}, bng = {"Lcom/iqoption/welcome/register/social/LandAnimatorFactory;", "Lcom/iqoption/welcome/register/social/AnimatorFactory;", "binding", "Lcom/iqoption/welcome/databinding/FragmentWelcomeRegistrationSocialBinding;", "(Lcom/iqoption/welcome/databinding/FragmentWelcomeRegistrationSocialBinding;)V", "createEnterAnimator", "Landroid/animation/Animator;", "createEnterAnimator$welcome_release", "createExitAnimator", "createExitAnimator$welcome_release", "welcome_release"})
/* compiled from: AnimatorFactory.kt */
public final class b extends a {
    public b(s sVar) {
        kotlin.jvm.internal.i.f(sVar, "binding");
        super(sVar);
    }

    public Animator bbe() {
        View[][] viewArr = new View[1][];
        View[] viewArr2 = new View[2];
        ImageView imageView = bbg().bfR;
        kotlin.jvm.internal.i.e(imageView, "binding.backButton");
        viewArr2[0] = imageView;
        TextView textView = bbg().alH;
        kotlin.jvm.internal.i.e(textView, "binding.title");
        viewArr2[1] = textView;
        viewArr[0] = viewArr2;
        viewArr = viewArr;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (View[] viewArr3 : viewArr) {
            Object cj;
            if (viewArr3.length == 1) {
                cj = cj(viewArr3[0]);
                cj.setStartDelay((long) i);
            } else {
                ArrayList arrayList2 = new ArrayList();
                for (View cj2 : viewArr3) {
                    arrayList2.add(cj(cj2));
                }
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(arrayList2);
                cj = animatorSet;
            }
            arrayList.add(cj);
            cj.setStartDelay((long) i);
            i += 20;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(arrayList);
        animatorSet2.setInterpolator(j.XJ());
        return animatorSet2;
    }

    public Animator bbf() {
        View root = bbg().getRoot();
        PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[2];
        propertyValuesHolderArr[0] = PropertyValuesHolder.ofFloat(View.ALPHA, new float[]{0.0f});
        propertyValuesHolderArr[1] = PropertyValuesHolder.ofFloat(View.TRANSLATION_X, new float[]{aZO()});
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(root, propertyValuesHolderArr);
        kotlin.jvm.internal.i.e(ofPropertyValuesHolder, "ObjectAnimator.ofPropert…ON_X, startTranslationX))");
        return ofPropertyValuesHolder;
    }
}
