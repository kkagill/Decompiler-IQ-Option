package com.iqoption.welcome.register.email;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.view.View;
import com.iqoption.welcome.a.p;
import com.iqoption.welcome.g.b;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u000b\u001a\u00020\fH&J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0004J\b\u0010\u000f\u001a\u00020\fH&R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0010"}, bng = {"Lcom/iqoption/welcome/register/email/AnimatorFactory;", "", "binding", "Lcom/iqoption/welcome/databinding/FragmentWelcomeRegistrationBinding;", "(Lcom/iqoption/welcome/databinding/FragmentWelcomeRegistrationBinding;)V", "getBinding", "()Lcom/iqoption/welcome/databinding/FragmentWelcomeRegistrationBinding;", "startTranslationX", "", "getStartTranslationX", "()F", "createEnterAnimator", "Landroid/animation/Animator;", "target", "Landroid/view/View;", "createExitAnimator", "welcome_release"})
/* compiled from: AnimatorFactory.kt */
public abstract class a {
    private final float ddD;
    private final p emq;

    public abstract Animator aZJ();

    public abstract Animator aZK();

    public a(p pVar) {
        kotlin.jvm.internal.i.f(pVar, "binding");
        this.emq = pVar;
        View root = this.emq.getRoot();
        kotlin.jvm.internal.i.e(root, "binding.root");
        this.ddD = -root.getResources().getDimension(b.dp24);
    }

    /* Access modifiers changed, original: protected|final */
    public final p baR() {
        return this.emq;
    }

    /* Access modifiers changed, original: protected|final */
    public final float aZO() {
        return this.ddD;
    }

    /* Access modifiers changed, original: protected|final */
    public final Animator cj(View view) {
        kotlin.jvm.internal.i.f(view, "target");
        PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[2];
        propertyValuesHolderArr[0] = PropertyValuesHolder.ofFloat(View.ALPHA, new float[]{0.0f, 1.0f});
        propertyValuesHolderArr[1] = PropertyValuesHolder.ofFloat(View.TRANSLATION_X, new float[]{this.ddD, 0.0f});
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, propertyValuesHolderArr);
        kotlin.jvm.internal.i.e(ofPropertyValuesHolder, "ObjectAnimator.ofPropert…, startTranslationX, 0f))");
        return ofPropertyValuesHolder;
    }
}
