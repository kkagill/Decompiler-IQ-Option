package com.iqoption.core.util;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.provider.Settings.Global;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.TextView;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.iqoption.core.graphics.animation.j;
import java.util.Arrays;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0007J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\tH\u0007J \u0010\r\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\u0012\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0007J\u0018\u0010\u0017\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0014H\u0007J\u0010\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u001bH\u0007J\u0010\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u001eH\u0007J \u0010\u001f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\u0018\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020$H\u0007J\u0018\u0010%\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0014H\u0007R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, bng = {"Lcom/iqoption/core/util/AnimUtils;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "createCardFlipAnimator", "Landroid/animation/Animator;", "oldView", "Landroid/view/View;", "newView", "createInfinitePulseAnimator", "view", "flipView", "", "container", "Landroid/view/ViewGroup;", "isCompareByTag", "", "getAnimationDrawableIndex", "", "animationDrawable", "Landroid/graphics/drawable/AnimationDrawable;", "getBouncing", "translation", "getBouncingTranslation", "context", "Landroid/content/Context;", "getTextColorLigth", "textView", "Landroid/widget/TextView;", "postFlipView", "setSafeDuration", "Landroid/animation/AnimatorSet;", "set", "duration", "", "startBouncing", "core_release"})
/* compiled from: AnimUtils.kt */
public final class b {
    private static final String TAG = b.class.getName();
    public static final b bQf = new b();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, bng = {"com/iqoption/core/util/AnimUtils$createCardFlipAnimator$1", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "core_release"})
    /* compiled from: AnimUtils.kt */
    public static final class a extends AnimatorListenerAdapter {
        final /* synthetic */ View bQg;

        a(View view) {
            this.bQg = view;
        }

        public void onAnimationEnd(Animator animator) {
            kotlin.jvm.internal.i.f(animator, "animation");
            super.onAnimationEnd(animator);
            this.bQg.setVisibility(8);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, bng = {"com/iqoption/core/util/AnimUtils$createCardFlipAnimator$2", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationStart", "", "animation", "Landroid/animation/Animator;", "core_release"})
    /* compiled from: AnimUtils.kt */
    public static final class b extends AnimatorListenerAdapter {
        final /* synthetic */ View bQh;

        b(View view) {
            this.bQh = view;
        }

        public void onAnimationStart(Animator animator) {
            kotlin.jvm.internal.i.f(animator, "animation");
            super.onAnimationStart(animator);
            this.bQh.setVisibility(0);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, bng = {"com/iqoption/core/util/AnimUtils$createInfinitePulseAnimator$1", "Landroid/animation/Animator$AnimatorListener;", "isCanceled", "", "isCanceled$core_release", "()Z", "setCanceled$core_release", "(Z)V", "onAnimationCancel", "", "animation", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationRepeat", "onAnimationStart", "core_release"})
    /* compiled from: AnimUtils.kt */
    public static final class c implements AnimatorListener {
        private boolean bQi;

        public void onAnimationRepeat(Animator animator) {
            kotlin.jvm.internal.i.f(animator, "animation");
        }

        c() {
        }

        public void onAnimationStart(Animator animator) {
            kotlin.jvm.internal.i.f(animator, "animation");
            this.bQi = false;
        }

        public void onAnimationEnd(Animator animator) {
            kotlin.jvm.internal.i.f(animator, "animation");
            if (!this.bQi) {
                animator.setStartDelay(3000);
                animator.start();
            }
        }

        public void onAnimationCancel(Animator animator) {
            kotlin.jvm.internal.i.f(animator, "animation");
            this.bQi = true;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, bng = {"com/iqoption/core/util/AnimUtils$flipView$1", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "core_release"})
    /* compiled from: AnimUtils.kt */
    public static final class d extends AnimatorListenerAdapter {
        final /* synthetic */ View bQg;
        final /* synthetic */ ViewGroup bQj;

        d(ViewGroup viewGroup, View view) {
            this.bQj = viewGroup;
            this.bQg = view;
        }

        public void onAnimationEnd(Animator animator) {
            kotlin.jvm.internal.i.f(animator, "animation");
            super.onAnimationEnd(animator);
            this.bQj.removeView(this.bQg);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "run"})
    /* compiled from: AnimUtils.kt */
    static final class e implements Runnable {
        final /* synthetic */ View bQh;
        final /* synthetic */ ViewGroup bQj;
        final /* synthetic */ boolean bQk;

        e(View view, ViewGroup viewGroup, boolean z) {
            this.bQh = view;
            this.bQj = viewGroup;
            this.bQk = z;
        }

        public final void run() {
            b.b(this.bQh, this.bQj, this.bQk);
        }
    }

    private b() {
    }

    public static final void a(View view, ViewGroup viewGroup, boolean z) {
        kotlin.jvm.internal.i.f(view, "newView");
        kotlin.jvm.internal.i.f(viewGroup, "container");
        com.iqoption.core.c.a.biN.execute(new e(view, viewGroup, z));
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0063 A:{RETURN} */
    /* JADX WARNING: Missing block: B:13:0x0050, code skipped:
            if (kotlin.jvm.internal.i.y(r3, r4.getTag()) == false) goto L_0x0052;
     */
    public static final void b(android.view.View r5, android.view.ViewGroup r6, boolean r7) {
        /*
        r0 = "newView";
        kotlin.jvm.internal.i.f(r5, r0);
        r0 = "container";
        kotlin.jvm.internal.i.f(r6, r0);
        r0 = r6.getChildCount();
        if (r0 == 0) goto L_0x0087;
    L_0x0010:
        r0 = "container.getChildAt(0)";
        r1 = 0;
        if (r7 == 0) goto L_0x003a;
    L_0x0015:
        r2 = r6.getChildAt(r1);
        kotlin.jvm.internal.i.e(r2, r0);
        r2 = r2.getTag();
        if (r2 == 0) goto L_0x0029;
    L_0x0022:
        r2 = r5.getTag();
        if (r2 == 0) goto L_0x0029;
    L_0x0028:
        goto L_0x003a;
    L_0x0029:
        r5 = TAG;
        r6 = "container has no tag, cannot apply card flip";
        android.util.Log.e(r5, r6);
        r5 = new java.lang.RuntimeException;
        r6 = "container has no tag";
        r5.<init>(r6);
        r5 = (java.lang.Throwable) r5;
        throw r5;
    L_0x003a:
        r2 = 1;
        if (r7 == 0) goto L_0x0052;
    L_0x003d:
        r3 = r5.getTag();
        r4 = r6.getChildAt(r1);
        kotlin.jvm.internal.i.e(r4, r0);
        r0 = r4.getTag();
        r0 = kotlin.jvm.internal.i.y(r3, r0);
        if (r0 != 0) goto L_0x005e;
    L_0x0052:
        if (r7 != 0) goto L_0x0060;
    L_0x0054:
        r7 = r6.getChildAt(r1);
        r7 = kotlin.jvm.internal.i.y(r5, r7);
        if (r7 == 0) goto L_0x0060;
    L_0x005e:
        r7 = 1;
        goto L_0x0061;
    L_0x0060:
        r7 = 0;
    L_0x0061:
        if (r7 == 0) goto L_0x0064;
    L_0x0063:
        return;
    L_0x0064:
        r7 = 8;
        r5.setVisibility(r7);
        r6.addView(r5, r1);
        r7 = r6.getChildAt(r2);
        r0 = "oldView";
        kotlin.jvm.internal.i.e(r7, r0);
        r5 = f(r7, r5);
        r0 = new com.iqoption.core.util.b$d;
        r0.<init>(r6, r7);
        r0 = (android.animation.Animator.AnimatorListener) r0;
        r5.addListener(r0);
        r5.start();
        return;
    L_0x0087:
        r5 = TAG;
        r6 = "container has no one child, cannot apply card flip";
        android.util.Log.e(r5, r6);
        r5 = new java.lang.RuntimeException;
        r6 = "container has no one child";
        r5.<init>(r6);
        r5 = (java.lang.Throwable) r5;
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.core.util.b.b(android.view.View, android.view.ViewGroup, boolean):void");
    }

    public static final Animator f(View view, View view2) {
        View view3 = view;
        View view4 = view2;
        kotlin.jvm.internal.i.f(view3, "oldView");
        kotlin.jvm.internal.i.f(view4, "newView");
        view3.setScaleX(1.0f);
        view3.setScaleY(1.0f);
        view3.setTranslationY(0.0f);
        view3.setRotationY(0.0f);
        view3.setAlpha(1.0f);
        PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[3];
        String str = "scaleX";
        propertyValuesHolderArr[0] = PropertyValuesHolder.ofFloat(str, new float[]{0.1f});
        String str2 = "scaleY";
        propertyValuesHolderArr[1] = PropertyValuesHolder.ofFloat(str2, new float[]{0.7f});
        String str3 = "translationY";
        propertyValuesHolderArr[2] = PropertyValuesHolder.ofFloat(str3, new float[]{-30.0f});
        long j = (long) 200;
        ObjectAnimator duration = ObjectAnimator.ofPropertyValuesHolder(view3, propertyValuesHolderArr).setDuration(j);
        kotlin.jvm.internal.i.e(duration, "oldViewZoomAnimator");
        duration.setInterpolator(new DecelerateInterpolator(0.8f));
        PropertyValuesHolder[] propertyValuesHolderArr2 = new PropertyValuesHolder[1];
        String str4 = "rotationY";
        propertyValuesHolderArr2[0] = PropertyValuesHolder.ofFloat(str4, new float[]{92.0f});
        ObjectAnimator duration2 = ObjectAnimator.ofPropertyValuesHolder(view3, propertyValuesHolderArr2).setDuration(j);
        kotlin.jvm.internal.i.e(duration2, "oldViewRotateAnimator");
        duration2.setInterpolator(new AccelerateInterpolator(1.0f));
        propertyValuesHolderArr2 = new PropertyValuesHolder[1];
        String str5 = "alpha";
        propertyValuesHolderArr2[0] = PropertyValuesHolder.ofFloat(str5, new float[]{0.1f});
        String str6 = str;
        long j2 = (long) (((float) 200) * 0.8f);
        ObjectAnimator duration3 = ObjectAnimator.ofPropertyValuesHolder(view3, propertyValuesHolderArr2).setDuration(j2);
        kotlin.jvm.internal.i.e(duration3, "oldViewAlphaAnimator");
        duration3.setInterpolator(new DecelerateInterpolator(2.0f));
        long j3 = j2;
        duration2.setStartDelay(0);
        duration2.addListener(new a(view3));
        view4.setScaleX(0.1f);
        view4.setScaleY(0.7f);
        view4.setTranslationY(-30.0f);
        r8 = new PropertyValuesHolder[3];
        r8[0] = PropertyValuesHolder.ofFloat(str6, new float[]{1.0f});
        r8[1] = PropertyValuesHolder.ofFloat(str2, new float[]{1.0f});
        r8[2] = PropertyValuesHolder.ofFloat(str3, new float[]{0.0f});
        ObjectAnimator duration4 = ObjectAnimator.ofPropertyValuesHolder(view4, r8).setDuration(j);
        kotlin.jvm.internal.i.e(duration4, "newViewZoomAnimator");
        duration4.setInterpolator(new AccelerateInterpolator(0.8f));
        duration4.setStartDelay(j);
        view4.setRotationY(-92.0f);
        r8 = new PropertyValuesHolder[1];
        r8[0] = PropertyValuesHolder.ofFloat(str4, new float[]{0.0f});
        ObjectAnimator duration5 = ObjectAnimator.ofPropertyValuesHolder(view4, r8).setDuration(j);
        kotlin.jvm.internal.i.e(duration5, "newViewRotateAnimator");
        duration5.setInterpolator(new DecelerateInterpolator(1.0f));
        duration5.setStartDelay(j);
        view4.setAlpha(0.1f);
        PropertyValuesHolder[] propertyValuesHolderArr3 = new PropertyValuesHolder[1];
        propertyValuesHolderArr3[0] = PropertyValuesHolder.ofFloat(str5, new float[]{1.0f});
        ObjectAnimator duration6 = ObjectAnimator.ofPropertyValuesHolder(view4, propertyValuesHolderArr3).setDuration(j3);
        kotlin.jvm.internal.i.e(duration6, "newViewAlphaAnimator");
        duration6.setInterpolator(new AccelerateInterpolator(2.0f));
        duration6.addListener(new b(view4));
        duration6.setStartDelay(j);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{duration, duration2, duration3, duration4, duration5, duration6});
        return animatorSet;
    }

    public static final Animator ay(View view) {
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.ALPHA, new float[]{1.0f, 0.8f, 1.0f}), PropertyValuesHolder.ofFloat(View.SCALE_X, new float[]{1.0f, 0.9f, 1.0f}), PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[]{1.0f, 0.9f, 1.0f})});
        kotlin.jvm.internal.i.e(ofPropertyValuesHolder, "animator");
        ofPropertyValuesHolder.setRepeatCount(2);
        ofPropertyValuesHolder.setRepeatMode(1);
        ofPropertyValuesHolder.setDuration(1200);
        ofPropertyValuesHolder.addListener(new c());
        ofPropertyValuesHolder.setInterpolator(j.XJ());
        return ofPropertyValuesHolder;
    }

    public static final int bi(Context context) {
        kotlin.jvm.internal.i.f(context, "context");
        return context.getResources().getDimensionPixelSize(com.iqoption.core.i.d.dp4);
    }

    public static final Animator o(View view, int i) {
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        Animator p = p(view, i);
        p.start();
        return p;
    }

    public static final Animator p(View view, int i) {
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        Keyframe[] keyframeArr = new Keyframe[6];
        int length = keyframeArr.length;
        float f = 1.0f / ((float) length);
        float f2 = f / 2.0f;
        for (int i2 = 0; i2 < length; i2++) {
            keyframeArr[i2] = Keyframe.ofFloat((((float) i2) * f) + f2, (float) (i2 % 2 == 0 ? i : -i));
        }
        keyframeArr[length - 1] = Keyframe.ofFloat(1.0f, 0.0f);
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, new PropertyValuesHolder[]{PropertyValuesHolder.ofKeyframe(View.TRANSLATION_X, (Keyframe[]) Arrays.copyOf(keyframeArr, keyframeArr.length))});
        kotlin.jvm.internal.i.e(ofPropertyValuesHolder, "animator");
        ofPropertyValuesHolder.setDuration(400);
        ofPropertyValuesHolder.setInterpolator(j.XN());
        return ofPropertyValuesHolder;
    }

    public static final Animator m(TextView textView) {
        kotlin.jvm.internal.i.f(textView, "textView");
        int currentTextColor = textView.getCurrentTextColor();
        ObjectAnimator ofInt = ObjectAnimator.ofInt(textView, "textColor", new int[]{-1, currentTextColor});
        ofInt.setEvaluator(new ArgbEvaluator());
        kotlin.jvm.internal.i.e(ofInt, "animator");
        ofInt.setInterpolator(j.XJ());
        ofInt.setDuration(1600);
        return ofInt;
    }

    public static final AnimatorSet a(AnimatorSet animatorSet, long j) {
        float f;
        kotlin.jvm.internal.i.f(animatorSet, "set");
        try {
            f = Global.getFloat(com.iqoption.core.d.Uo().getContentResolver(), "animator_duration_scale", 0.0f);
        } catch (Throwable unused) {
            f = 0.0f;
        }
        if (f != 0.0f) {
            animatorSet.setDuration(j);
        }
        return animatorSet;
    }
}
