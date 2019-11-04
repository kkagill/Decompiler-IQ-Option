package com.iqoption.welcome.register.email;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import com.iqoption.core.graphics.animation.j;
import com.iqoption.welcome.a.p;
import java.util.ArrayList;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\b"}, bng = {"Lcom/iqoption/welcome/register/email/PortAnimatorFactory;", "Lcom/iqoption/welcome/register/email/AnimatorFactory;", "binding", "Lcom/iqoption/welcome/databinding/FragmentWelcomeRegistrationBinding;", "(Lcom/iqoption/welcome/databinding/FragmentWelcomeRegistrationBinding;)V", "createEnterAnimator", "Landroid/animation/Animator;", "createExitAnimator", "welcome_release"})
/* compiled from: AnimatorFactory.kt */
public final class d extends a {
    public d(p pVar) {
        kotlin.jvm.internal.i.f(pVar, "binding");
        super(pVar);
    }

    public Animator aZJ() {
        View[][] viewArr = new View[3][];
        View[] viewArr2 = new View[2];
        ImageView imageView = baR().bfR;
        kotlin.jvm.internal.i.e(imageView, "binding.backButton");
        viewArr2[0] = imageView;
        TextView textView = baR().alH;
        kotlin.jvm.internal.i.e(textView, "binding.title");
        viewArr2[1] = textView;
        viewArr[0] = viewArr2;
        viewArr2 = new View[1];
        TextInputLayout textInputLayout = baR().ekK;
        kotlin.jvm.internal.i.e(textInputLayout, "binding.emailLayout");
        viewArr2[0] = textInputLayout;
        viewArr[1] = viewArr2;
        viewArr2 = new View[1];
        textInputLayout = baR().ekM;
        kotlin.jvm.internal.i.e(textInputLayout, "binding.passwordLayout");
        viewArr2[0] = textInputLayout;
        viewArr[2] = viewArr2;
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

    public Animator aZK() {
        View root = baR().getRoot();
        PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[2];
        propertyValuesHolderArr[0] = PropertyValuesHolder.ofFloat(View.ALPHA, new float[]{0.0f});
        propertyValuesHolderArr[1] = PropertyValuesHolder.ofFloat(View.TRANSLATION_X, new float[]{aZO()});
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(root, propertyValuesHolderArr);
        kotlin.jvm.internal.i.e(ofPropertyValuesHolder, "ObjectAnimator.ofPropert…ON_X, startTranslationX))");
        return ofPropertyValuesHolder;
    }
}
