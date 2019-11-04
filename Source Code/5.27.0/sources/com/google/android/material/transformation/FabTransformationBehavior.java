package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams;
import androidx.core.view.ViewCompat;
import com.google.android.material.a.b;
import com.google.android.material.a.e;
import com.google.android.material.a.f;
import com.google.android.material.a.h;
import com.google.android.material.a.i;
import com.google.android.material.a.j;
import com.google.android.material.c.d;
import com.google.android.material.c.d.c;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;

public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {
    private final Rect Ir;
    private final RectF Jb;
    private final RectF Jc;
    private final int[] QM;

    protected static class a {
        public h QT;
        public j QU;

        protected a() {
        }
    }

    public abstract a c(Context context, boolean z);

    public FabTransformationBehavior() {
        this.Ir = new Rect();
        this.Jb = new RectF();
        this.Jc = new RectF();
        this.QM = new int[2];
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.Ir = new Rect();
        this.Jb = new RectF();
        this.Jc = new RectF();
        this.QM = new int[2];
    }

    @CallSuper
    public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        } else if (!(view2 instanceof FloatingActionButton)) {
            return false;
        } else {
            int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
            if (expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId()) {
                return true;
            }
            return false;
        }
    }

    @CallSuper
    public void onAttachedToLayoutParams(@NonNull LayoutParams layoutParams) {
        if (layoutParams.dodgeInsetEdges == 0) {
            layoutParams.dodgeInsetEdges = 80;
        }
    }

    /* Access modifiers changed, original: protected */
    @NonNull
    public AnimatorSet b(View view, View view2, boolean z, boolean z2) {
        final boolean z3 = z;
        a c = c(view2.getContext(), z3);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (VERSION.SDK_INT >= 21) {
            a(view, view2, z, z2, c, arrayList, arrayList2);
        }
        RectF rectF = this.Jb;
        View view3 = view;
        View view4 = view2;
        boolean z4 = z;
        boolean z5 = z2;
        a aVar = c;
        List list = arrayList;
        List list2 = arrayList2;
        a(view3, view4, z4, z5, aVar, list, list2, rectF);
        float width = rectF.width();
        float height = rectF.height();
        b(view3, view4, z4, z5, aVar, list, list2);
        a(view3, view4, z4, z5, aVar, width, height, (List) arrayList, (List) arrayList2);
        ArrayList arrayList3 = arrayList;
        ArrayList arrayList4 = arrayList2;
        c(view3, view4, z4, z5, aVar, arrayList3, arrayList4);
        d(view3, view4, z4, z5, aVar, arrayList3, arrayList4);
        AnimatorSet animatorSet = new AnimatorSet();
        b.a(animatorSet, arrayList);
        view4 = view;
        final View view5 = view2;
        animatorSet.addListener(new AnimatorListenerAdapter() {
            public void onAnimationStart(Animator animator) {
                if (z3) {
                    view5.setVisibility(0);
                    view4.setAlpha(0.0f);
                    view4.setVisibility(4);
                }
            }

            public void onAnimationEnd(Animator animator) {
                if (!z3) {
                    view5.setVisibility(4);
                    view4.setAlpha(1.0f);
                    view4.setVisibility(0);
                }
            }
        });
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            animatorSet.addListener((AnimatorListener) arrayList2.get(i));
        }
        return animatorSet;
    }

    @TargetApi(21)
    private void a(View view, View view2, boolean z, boolean z2, a aVar, List<Animator> list, List<AnimatorListener> list2) {
        Animator ofFloat;
        float elevation = ViewCompat.getElevation(view2) - ViewCompat.getElevation(view);
        if (z) {
            if (!z2) {
                view2.setTranslationZ(-elevation);
            }
            ofFloat = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, new float[]{0.0f});
        } else {
            ofFloat = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, new float[]{-elevation});
        }
        aVar.QT.bJ("elevation").a(ofFloat);
        list.add(ofFloat);
    }

    private void a(View view, View view2, boolean z, boolean z2, a aVar, List<Animator> list, List<AnimatorListener> list2, RectF rectF) {
        i bJ;
        i bJ2;
        Animator ofFloat;
        Animator ofFloat2;
        View view3 = view;
        View view4 = view2;
        a aVar2 = aVar;
        List<Animator> list3 = list;
        float a = a(view3, view4, aVar2.QU);
        float b = b(view3, view4, aVar2.QU);
        if (a == 0.0f || b == 0.0f) {
            bJ = aVar2.QT.bJ("translationXLinear");
            bJ2 = aVar2.QT.bJ("translationYLinear");
        } else if ((!z || b >= 0.0f) && (z || b <= 0.0f)) {
            bJ = aVar2.QT.bJ("translationXCurveDownwards");
            bJ2 = aVar2.QT.bJ("translationYCurveDownwards");
        } else {
            bJ = aVar2.QT.bJ("translationXCurveUpwards");
            bJ2 = aVar2.QT.bJ("translationYCurveUpwards");
        }
        i iVar = bJ;
        i iVar2 = bJ2;
        if (z) {
            if (!z2) {
                view4.setTranslationX(-a);
                view4.setTranslationY(-b);
            }
            ofFloat = ObjectAnimator.ofFloat(view4, View.TRANSLATION_X, new float[]{0.0f});
            ofFloat2 = ObjectAnimator.ofFloat(view4, View.TRANSLATION_Y, new float[]{0.0f});
            a(view2, aVar, iVar, iVar2, -a, -b, 0.0f, 0.0f, rectF);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view4, View.TRANSLATION_X, new float[]{-a});
            ofFloat2 = ObjectAnimator.ofFloat(view4, View.TRANSLATION_Y, new float[]{-b});
        }
        iVar.a(ofFloat);
        iVar2.a(ofFloat2);
        list3.add(ofFloat);
        list3.add(ofFloat2);
    }

    private void b(View view, final View view2, boolean z, boolean z2, a aVar, List<Animator> list, List<AnimatorListener> list2) {
        if ((view2 instanceof d) && (view instanceof ImageView)) {
            final d dVar = (d) view2;
            final Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable != null) {
                Animator ofInt;
                drawable.mutate();
                if (z) {
                    if (!z2) {
                        drawable.setAlpha(255);
                    }
                    ofInt = ObjectAnimator.ofInt(drawable, e.DS, new int[]{0});
                } else {
                    ofInt = ObjectAnimator.ofInt(drawable, e.DS, new int[]{255});
                }
                ofInt.addUpdateListener(new AnimatorUpdateListener() {
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        view2.invalidate();
                    }
                });
                aVar.QT.bJ("iconFade").a(ofInt);
                list.add(ofInt);
                list2.add(new AnimatorListenerAdapter() {
                    public void onAnimationStart(Animator animator) {
                        dVar.setCircularRevealOverlayDrawable(drawable);
                    }

                    public void onAnimationEnd(Animator animator) {
                        dVar.setCircularRevealOverlayDrawable(null);
                    }
                });
            }
        }
    }

    private void a(View view, View view2, boolean z, boolean z2, a aVar, float f, float f2, List<Animator> list, List<AnimatorListener> list2) {
        View view3 = view;
        View view4 = view2;
        a aVar2 = aVar;
        if (view4 instanceof d) {
            Animator a;
            final d dVar = (d) view4;
            float c = c(view3, view4, aVar2.QU);
            float d = d(view3, view4, aVar2.QU);
            ((FloatingActionButton) view3).b(this.Ir);
            float width = ((float) this.Ir.width()) / 2.0f;
            i bJ = aVar2.QT.bJ("expansion");
            if (z) {
                if (!z2) {
                    dVar.setRevealInfo(new d.d(c, d, width));
                }
                if (z2) {
                    width = dVar.getRevealInfo().radius;
                }
                a = com.google.android.material.c.a.a(dVar, c, d, com.google.android.material.e.a.a(c, d, 0.0f, 0.0f, f, f2));
                a.addListener(new AnimatorListenerAdapter() {
                    public void onAnimationEnd(Animator animator) {
                        d.d revealInfo = dVar.getRevealInfo();
                        revealInfo.radius = Float.MAX_VALUE;
                        dVar.setRevealInfo(revealInfo);
                    }
                });
                a(view2, bJ.mv(), (int) c, (int) d, width, list);
            } else {
                float f3 = dVar.getRevealInfo().radius;
                Animator a2 = com.google.android.material.c.a.a(dVar, c, d, width);
                int i = (int) c;
                int i2 = (int) d;
                View view5 = view2;
                int i3 = i;
                a(view5, bJ.mv(), i, i2, f3, list);
                a(view5, bJ.mv(), bJ.getDuration(), aVar2.QT.getTotalDuration(), i3, i2, width, (List) list);
                a = a2;
            }
            bJ.a(a);
            list.add(a);
            list2.add(com.google.android.material.c.a.a(dVar));
        }
    }

    private void c(View view, View view2, boolean z, boolean z2, a aVar, List<Animator> list, List<AnimatorListener> list2) {
        if (view2 instanceof d) {
            Animator ofInt;
            d dVar = (d) view2;
            int L = L(view);
            int i = ViewCompat.MEASURED_SIZE_MASK & L;
            if (z) {
                if (!z2) {
                    dVar.setCircularRevealScrimColor(L);
                }
                ofInt = ObjectAnimator.ofInt(dVar, c.Ic, new int[]{i});
            } else {
                ofInt = ObjectAnimator.ofInt(dVar, c.Ic, new int[]{L});
            }
            ofInt.setEvaluator(com.google.android.material.a.c.mu());
            aVar.QT.bJ("color").a(ofInt);
            list.add(ofInt);
        }
    }

    private void d(View view, View view2, boolean z, boolean z2, a aVar, List<Animator> list, List<AnimatorListener> list2) {
        if (!(view2 instanceof ViewGroup)) {
            return;
        }
        if (!(view2 instanceof d) || com.google.android.material.c.c.HO != 0) {
            ViewGroup J = J(view2);
            if (J != null) {
                Animator ofFloat;
                if (z) {
                    if (!z2) {
                        com.google.android.material.a.d.DR.set(J, Float.valueOf(0.0f));
                    }
                    ofFloat = ObjectAnimator.ofFloat(J, com.google.android.material.a.d.DR, new float[]{1.0f});
                } else {
                    ofFloat = ObjectAnimator.ofFloat(J, com.google.android.material.a.d.DR, new float[]{0.0f});
                }
                aVar.QT.bJ("contentFade").a(ofFloat);
                list.add(ofFloat);
            }
        }
    }

    private float a(View view, View view2, j jVar) {
        float centerX;
        float centerX2;
        RectF rectF = this.Jb;
        RectF rectF2 = this.Jc;
        a(view, rectF);
        a(view2, rectF2);
        int i = jVar.gravity & 7;
        if (i == 1) {
            centerX = rectF2.centerX();
            centerX2 = rectF.centerX();
        } else if (i == 3) {
            centerX = rectF2.left;
            centerX2 = rectF.left;
        } else if (i != 5) {
            centerX = 0.0f;
            return centerX + jVar.Ea;
        } else {
            centerX = rectF2.right;
            centerX2 = rectF.right;
        }
        centerX -= centerX2;
        return centerX + jVar.Ea;
    }

    private float b(View view, View view2, j jVar) {
        float centerY;
        float centerY2;
        RectF rectF = this.Jb;
        RectF rectF2 = this.Jc;
        a(view, rectF);
        a(view2, rectF2);
        int i = jVar.gravity & 112;
        if (i == 16) {
            centerY = rectF2.centerY();
            centerY2 = rectF.centerY();
        } else if (i == 48) {
            centerY = rectF2.top;
            centerY2 = rectF.top;
        } else if (i != 80) {
            centerY = 0.0f;
            return centerY + jVar.Eb;
        } else {
            centerY = rectF2.bottom;
            centerY2 = rectF.bottom;
        }
        centerY -= centerY2;
        return centerY + jVar.Eb;
    }

    private void a(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
        int[] iArr = this.QM;
        view.getLocationInWindow(iArr);
        rectF.offsetTo((float) iArr[0], (float) iArr[1]);
        rectF.offset((float) ((int) (-view.getTranslationX())), (float) ((int) (-view.getTranslationY())));
    }

    private float c(View view, View view2, j jVar) {
        RectF rectF = this.Jb;
        RectF rectF2 = this.Jc;
        a(view, rectF);
        a(view2, rectF2);
        rectF2.offset(-a(view, view2, jVar), 0.0f);
        return rectF.centerX() - rectF2.left;
    }

    private float d(View view, View view2, j jVar) {
        RectF rectF = this.Jb;
        RectF rectF2 = this.Jc;
        a(view, rectF);
        a(view2, rectF2);
        rectF2.offset(0.0f, -b(view, view2, jVar));
        return rectF.centerY() - rectF2.top;
    }

    private void a(View view, a aVar, i iVar, i iVar2, float f, float f2, float f3, float f4, RectF rectF) {
        float a = a(aVar, iVar, f, f3);
        float a2 = a(aVar, iVar2, f2, f4);
        Rect rect = this.Ir;
        view.getWindowVisibleDisplayFrame(rect);
        RectF rectF2 = this.Jb;
        rectF2.set(rect);
        RectF rectF3 = this.Jc;
        a(view, rectF3);
        rectF3.offset(a, a2);
        rectF3.intersect(rectF2);
        rectF.set(rectF3);
    }

    private float a(a aVar, i iVar, float f, float f2) {
        long mv = iVar.mv();
        long duration = iVar.getDuration();
        i bJ = aVar.QT.bJ("expansion");
        return com.google.android.material.a.a.lerp(f, f2, iVar.getInterpolator().getInterpolation(((float) (((bJ.mv() + bJ.getDuration()) + 17) - mv)) / ((float) duration)));
    }

    @Nullable
    private ViewGroup J(View view) {
        View findViewById = view.findViewById(f.mtrl_child_content_container);
        if (findViewById != null) {
            return K(findViewById);
        }
        if ((view instanceof b) || (view instanceof a)) {
            return K(((ViewGroup) view).getChildAt(0));
        }
        return K(view);
    }

    @Nullable
    private ViewGroup K(View view) {
        return view instanceof ViewGroup ? (ViewGroup) view : null;
    }

    private int L(View view) {
        ColorStateList backgroundTintList = ViewCompat.getBackgroundTintList(view);
        return backgroundTintList != null ? backgroundTintList.getColorForState(view.getDrawableState(), backgroundTintList.getDefaultColor()) : 0;
    }

    private void a(View view, long j, int i, int i2, float f, List<Animator> list) {
        if (VERSION.SDK_INT >= 21 && j > 0) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, f, f);
            createCircularReveal.setStartDelay(0);
            createCircularReveal.setDuration(j);
            list.add(createCircularReveal);
        }
    }

    private void a(View view, long j, long j2, long j3, int i, int i2, float f, List<Animator> list) {
        if (VERSION.SDK_INT >= 21) {
            j += j2;
            if (j < j3) {
                Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, f, f);
                createCircularReveal.setStartDelay(j);
                createCircularReveal.setDuration(j3 - j);
                list.add(createCircularReveal);
            }
        }
    }
}
