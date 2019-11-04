package com.iqoption.bottomsheet;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import com.iqoption.core.ext.a;
import com.iqoption.core.graphics.animation.j;
import com.iqoption.dialogs.b.s;
import java.util.ArrayList;
import java.util.List;
import kotlin.i;
import kotlin.jvm.a.m;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "Landroid/animation/AnimatorSet;", "<anonymous parameter 0>", "Landroid/view/View;", "isEnter", "", "invoke"})
/* compiled from: BottomSheetFragment.kt */
final class BottomSheetFragment$onCreateTransitionProvider$1 extends Lambda implements m<View, Boolean, AnimatorSet> {
    final /* synthetic */ c this$0;

    BottomSheetFragment$onCreateTransitionProvider$1(c cVar) {
        this.this$0 = cVar;
        super(2);
    }

    public /* synthetic */ Object w(Object obj, Object obj2) {
        return c((View) obj, ((Boolean) obj2).booleanValue());
    }

    public final AnimatorSet c(View view, boolean z) {
        kotlin.jvm.internal.i.f(view, "<anonymous parameter 0>");
        s a = c.a(this.this$0);
        AnimatorSet animatorSet = new AnimatorSet();
        List arrayList = new ArrayList();
        String str = "contentViewContainer";
        ObjectAnimator ofFloat;
        FrameLayout frameLayout;
        ObjectAnimator ofFloat2;
        if (z) {
            float height;
            View view2 = a.cMC;
            kotlin.jvm.internal.i.e(view2, "veil");
            view2.setAlpha(0.0f);
            ofFloat = ObjectAnimator.ofFloat(a.cMC, View.ALPHA, new float[]{1.0f});
            kotlin.jvm.internal.i.e(ofFloat, "ObjectAnimator.ofFloat(veil, ALPHA, 1f)");
            arrayList.add(ofFloat);
            frameLayout = a.cMA;
            kotlin.jvm.internal.i.e(frameLayout, str);
            FrameLayout frameLayout2;
            if (c.b(this.this$0).amB()) {
                frameLayout2 = a.cMA;
                kotlin.jvm.internal.i.e(frameLayout2, str);
                height = (float) frameLayout2.getHeight();
            } else {
                frameLayout2 = a.cMA;
                kotlin.jvm.internal.i.e(frameLayout2, str);
                height = ((float) frameLayout2.getHeight()) - ((float) this.this$0.KP());
            }
            frameLayout.setTranslationY(height);
            ofFloat2 = ObjectAnimator.ofFloat(a.cMA, View.TRANSLATION_Y, new float[]{0.0f});
            kotlin.jvm.internal.i.e(ofFloat2, "ObjectAnimator.ofFloat(c…ainer, TRANSLATION_Y, 0f)");
            arrayList.add(ofFloat2);
        } else {
            ofFloat = ObjectAnimator.ofFloat(a.cMC, View.ALPHA, new float[]{0.0f});
            kotlin.jvm.internal.i.e(ofFloat, "ObjectAnimator.ofFloat(veil, ALPHA, 0f)");
            arrayList.add(ofFloat);
            frameLayout = a.cMA;
            Property property = View.TRANSLATION_Y;
            float[] fArr = new float[1];
            FrameLayout frameLayout3 = a.cMA;
            kotlin.jvm.internal.i.e(frameLayout3, str);
            fArr[0] = (float) frameLayout3.getHeight();
            ofFloat2 = ObjectAnimator.ofFloat(frameLayout, property, fArr);
            kotlin.jvm.internal.i.e(ofFloat2, "ObjectAnimator.ofFloat(c…ntainer.height.toFloat())");
            arrayList.add(ofFloat2);
        }
        animatorSet.playTogether(arrayList);
        a.a((Animator) animatorSet, 400);
        animatorSet.setInterpolator(j.XJ());
        return animatorSet;
    }
}
