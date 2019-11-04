package com.iqoption.chat.e;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import com.iqoption.chat.e;
import com.iqoption.core.d;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\tJ \u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t¨\u0006\u000b"}, bng = {"Lcom/iqoption/chat/util/ChatAnimationUtil;", "", "()V", "getEnterAnimation", "Landroid/animation/Animator;", "contentView", "Landroid/view/View;", "frameView", "duration", "", "getExitAnimation", "chat_release"})
/* compiled from: ChatAnimationUtil.kt */
public final class a {
    public static final a aWr = new a();

    private a() {
    }

    public static /* synthetic */ Animator a(a aVar, View view, View view2, long j, int i, Object obj) {
        if ((i & 4) != 0) {
            j = 500;
        }
        return aVar.a(view, view2, j);
    }

    public final Animator a(View view, View view2, long j) {
        kotlin.jvm.internal.i.f(view, "contentView");
        kotlin.jvm.internal.i.f(view2, "frameView");
        AnimatorSet animatorSet = new AnimatorSet();
        Animator animator = animatorSet;
        com.iqoption.core.ext.a.a(animator, j);
        Animator[] animatorArr = new Animator[2];
        animatorArr[0] = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{0.0f, 1.0f});
        animatorArr[1] = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Y, new float[]{d.ey(e.d.dp24), 0.0f});
        animatorSet.playTogether(animatorArr);
        animatorSet.setInterpolator(new FastOutSlowInInterpolator());
        return animator;
    }

    public static /* synthetic */ Animator b(a aVar, View view, View view2, long j, int i, Object obj) {
        if ((i & 4) != 0) {
            j = 500;
        }
        return aVar.b(view, view2, j);
    }

    public final Animator b(View view, View view2, long j) {
        kotlin.jvm.internal.i.f(view, "contentView");
        kotlin.jvm.internal.i.f(view2, "frameView");
        AnimatorSet animatorSet = new AnimatorSet();
        Animator animator = animatorSet;
        com.iqoption.core.ext.a.a(animator, j);
        Animator[] animatorArr = new Animator[2];
        animatorArr[0] = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{1.0f, 0.0f});
        animatorArr[1] = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Y, new float[]{0.0f, d.ey(e.d.dp24)});
        animatorSet.playTogether(animatorArr);
        animatorSet.setInterpolator(new FastOutSlowInInterpolator());
        return animator;
    }
}
