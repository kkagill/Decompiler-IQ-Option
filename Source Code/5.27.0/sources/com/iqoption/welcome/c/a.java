package com.iqoption.welcome.c;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import com.iqoption.core.graphics.animation.j;
import com.iqoption.welcome.a.d;
import com.iqoption.welcome.g.b;
import java.util.ArrayList;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bJ\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0006\u0010\u000b\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, bng = {"Lcom/iqoption/welcome/recover/AnimatorFactory;", "", "binding", "Lcom/iqoption/welcome/databinding/FragmentForgotPasswordBinding;", "(Lcom/iqoption/welcome/databinding/FragmentForgotPasswordBinding;)V", "startTranslationX", "", "createEnterAnimator", "Landroid/animation/Animator;", "target", "Landroid/view/View;", "createExitAnimator", "welcome_release"})
/* compiled from: AnimatorFactory.kt */
public final class a {
    private final float ddD;
    private final d elT;

    public a(d dVar) {
        kotlin.jvm.internal.i.f(dVar, "binding");
        this.elT = dVar;
        View root = this.elT.getRoot();
        kotlin.jvm.internal.i.e(root, "binding.root");
        this.ddD = -root.getResources().getDimension(b.dp24);
    }

    public final Animator aZJ() {
        View[][] viewArr = new View[2][];
        View[] viewArr2 = new View[2];
        ImageView imageView = this.elT.bfR;
        kotlin.jvm.internal.i.e(imageView, "binding.backButton");
        viewArr2[0] = imageView;
        TextView textView = this.elT.alH;
        kotlin.jvm.internal.i.e(textView, "binding.title");
        viewArr2[1] = textView;
        viewArr[0] = viewArr2;
        viewArr2 = new View[1];
        TextInputLayout textInputLayout = this.elT.ekJ;
        kotlin.jvm.internal.i.e(textInputLayout, "binding.emailInput");
        viewArr2[0] = textInputLayout;
        viewArr[1] = viewArr2;
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

    public final Animator aZK() {
        View root = this.elT.getRoot();
        PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[2];
        propertyValuesHolderArr[0] = PropertyValuesHolder.ofFloat(View.ALPHA, new float[]{0.0f});
        propertyValuesHolderArr[1] = PropertyValuesHolder.ofFloat(View.TRANSLATION_X, new float[]{this.ddD});
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(root, propertyValuesHolderArr);
        kotlin.jvm.internal.i.e(ofPropertyValuesHolder, "ObjectAnimator.ofPropert…ON_X, startTranslationX))");
        return ofPropertyValuesHolder;
    }

    private final Animator cj(View view) {
        PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[2];
        propertyValuesHolderArr[0] = PropertyValuesHolder.ofFloat(View.ALPHA, new float[]{0.0f, 1.0f});
        propertyValuesHolderArr[1] = PropertyValuesHolder.ofFloat(View.TRANSLATION_X, new float[]{this.ddD, 0.0f});
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, propertyValuesHolderArr);
        kotlin.jvm.internal.i.e(ofPropertyValuesHolder, "ObjectAnimator.ofPropert…, startTranslationX, 0f))");
        return ofPropertyValuesHolder;
    }
}
