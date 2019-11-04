package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.Matrix.ScaleToFit;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewTreeObserver.OnPreDrawListener;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.a.g;
import com.google.android.material.a.h;
import com.google.android.material.internal.i;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: FloatingActionButtonImpl */
class a {
    static final int[] EMPTY_STATE_SET = new int[0];
    static final int[] ENABLED_STATE_SET = new int[]{16842910};
    static final int[] IW = new int[]{16843623, 16842908, 16842910};
    static final int[] IX = new int[]{16842908, 16842910};
    static final int[] IY = new int[]{16843623, 16842910};
    static final TimeInterpolator Iu = com.google.android.material.a.a.DI;
    static final int[] PRESSED_ENABLED_STATE_SET = new int[]{16842919, 16842910};
    @Nullable
    private h IA;
    private final com.google.android.material.internal.f IB;
    com.google.android.material.h.a IC;
    Drawable IF;
    Drawable IG;
    com.google.android.material.internal.a IH;
    Drawable II;
    float IJ;
    float IK;
    float IP = 1.0f;
    private ArrayList<AnimatorListener> IU;
    private ArrayList<AnimatorListener> IV;
    final i IZ;
    private final Rect Ir = new Rect();
    int Iv = 0;
    @Nullable
    Animator Iw;
    @Nullable
    h Ix;
    @Nullable
    h Iy;
    @Nullable
    private h Iz;
    final com.google.android.material.h.b Ja;
    private final RectF Jb = new RectF();
    private final RectF Jc = new RectF();
    private final Matrix Jd = new Matrix();
    private OnPreDrawListener Je;
    float elevation;
    int maxImageSize;
    private float rotation;

    /* compiled from: FloatingActionButtonImpl */
    interface d {
        void nv();

        void nw();
    }

    /* compiled from: FloatingActionButtonImpl */
    private abstract class f extends AnimatorListenerAdapter implements AnimatorUpdateListener {
        private boolean Ji;
        private float Jj;
        private float Jk;

        public abstract float nL();

        private f() {
        }

        /* synthetic */ f(a aVar, AnonymousClass1 anonymousClass1) {
            this();
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (!this.Ji) {
                this.Jj = a.this.IC.getShadowSize();
                this.Jk = nL();
                this.Ji = true;
            }
            com.google.android.material.h.a aVar = a.this.IC;
            float f = this.Jj;
            aVar.setShadowSize(f + ((this.Jk - f) * valueAnimator.getAnimatedFraction()));
        }

        public void onAnimationEnd(Animator animator) {
            a.this.IC.setShadowSize(this.Jk);
            this.Ji = false;
        }
    }

    /* compiled from: FloatingActionButtonImpl */
    private class a extends f {
        /* Access modifiers changed, original: protected */
        public float nL() {
            return 0.0f;
        }

        a() {
            super(a.this, null);
        }
    }

    /* compiled from: FloatingActionButtonImpl */
    private class b extends f {
        b() {
            super(a.this, null);
        }

        /* Access modifiers changed, original: protected */
        public float nL() {
            return a.this.elevation + a.this.IJ;
        }
    }

    /* compiled from: FloatingActionButtonImpl */
    private class c extends f {
        c() {
            super(a.this, null);
        }

        /* Access modifiers changed, original: protected */
        public float nL() {
            return a.this.elevation + a.this.IK;
        }
    }

    /* compiled from: FloatingActionButtonImpl */
    private class e extends f {
        e() {
            super(a.this, null);
        }

        /* Access modifiers changed, original: protected */
        public float nL() {
            return a.this.elevation;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void f(Rect rect) {
    }

    /* Access modifiers changed, original: 0000 */
    public void nE() {
    }

    /* Access modifiers changed, original: 0000 */
    public boolean nG() {
        return true;
    }

    a(i iVar, com.google.android.material.h.b bVar) {
        this.IZ = iVar;
        this.Ja = bVar;
        this.IB = new com.google.android.material.internal.f();
        this.IB.a(PRESSED_ENABLED_STATE_SET, a(new c()));
        this.IB.a(IW, a(new b()));
        this.IB.a(IX, a(new b()));
        this.IB.a(IY, a(new b()));
        this.IB.a(ENABLED_STATE_SET, a(new e()));
        this.IB.a(EMPTY_STATE_SET, a(new a()));
        this.rotation = this.IZ.getRotation();
    }

    /* Access modifiers changed, original: 0000 */
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Drawable drawable = this.IF;
        if (drawable != null) {
            DrawableCompat.setTintList(drawable, colorStateList);
        }
        com.google.android.material.internal.a aVar = this.IH;
        if (aVar != null) {
            aVar.a(colorStateList);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void setBackgroundTintMode(Mode mode) {
        Drawable drawable = this.IF;
        if (drawable != null) {
            DrawableCompat.setTintMode(drawable, mode);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void setRippleColor(ColorStateList colorStateList) {
        Drawable drawable = this.IG;
        if (drawable != null) {
            DrawableCompat.setTintList(drawable, com.google.android.material.g.a.d(colorStateList));
        }
    }

    /* Access modifiers changed, original: final */
    public final void setElevation(float f) {
        if (this.elevation != f) {
            this.elevation = f;
            e(this.elevation, this.IJ, this.IK);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public float getElevation() {
        return this.elevation;
    }

    /* Access modifiers changed, original: 0000 */
    public float ny() {
        return this.IJ;
    }

    /* Access modifiers changed, original: 0000 */
    public float nz() {
        return this.IK;
    }

    /* Access modifiers changed, original: final */
    public final void r(float f) {
        if (this.IJ != f) {
            this.IJ = f;
            e(this.elevation, this.IJ, this.IK);
        }
    }

    /* Access modifiers changed, original: final */
    public final void s(float f) {
        if (this.IK != f) {
            this.IK = f;
            e(this.elevation, this.IJ, this.IK);
        }
    }

    /* Access modifiers changed, original: final */
    public final void nA() {
        t(this.IP);
    }

    /* Access modifiers changed, original: final */
    public final void t(float f) {
        this.IP = f;
        Matrix matrix = this.Jd;
        a(f, matrix);
        this.IZ.setImageMatrix(matrix);
    }

    private void a(float f, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.IZ.getDrawable();
        if (drawable != null && this.maxImageSize != 0) {
            RectF rectF = this.Jb;
            RectF rectF2 = this.Jc;
            rectF.set(0.0f, 0.0f, (float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
            int i = this.maxImageSize;
            rectF2.set(0.0f, 0.0f, (float) i, (float) i);
            matrix.setRectToRect(rectF, rectF2, ScaleToFit.CENTER);
            i = this.maxImageSize;
            matrix.postScale(f, f, ((float) i) / 2.0f, ((float) i) / 2.0f);
        }
    }

    /* Access modifiers changed, original: final */
    @Nullable
    public final h getShowMotionSpec() {
        return this.Ix;
    }

    /* Access modifiers changed, original: final */
    public final void setShowMotionSpec(@Nullable h hVar) {
        this.Ix = hVar;
    }

    /* Access modifiers changed, original: final */
    @Nullable
    public final h getHideMotionSpec() {
        return this.Iy;
    }

    /* Access modifiers changed, original: final */
    public final void setHideMotionSpec(@Nullable h hVar) {
        this.Iy = hVar;
    }

    /* Access modifiers changed, original: 0000 */
    public void e(float f, float f2, float f3) {
        com.google.android.material.h.a aVar = this.IC;
        if (aVar != null) {
            aVar.setShadowSize(f, this.IK + f);
            nF();
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void b(int[] iArr) {
        this.IB.c(iArr);
    }

    /* Access modifiers changed, original: 0000 */
    public void nB() {
        this.IB.jumpToCurrentState();
    }

    /* Access modifiers changed, original: 0000 */
    public void c(@NonNull AnimatorListener animatorListener) {
        if (this.IU == null) {
            this.IU = new ArrayList();
        }
        this.IU.add(animatorListener);
    }

    /* Access modifiers changed, original: 0000 */
    public void d(@NonNull AnimatorListener animatorListener) {
        ArrayList arrayList = this.IU;
        if (arrayList != null) {
            arrayList.remove(animatorListener);
        }
    }

    public void e(@NonNull AnimatorListener animatorListener) {
        if (this.IV == null) {
            this.IV = new ArrayList();
        }
        this.IV.add(animatorListener);
    }

    public void f(@NonNull AnimatorListener animatorListener) {
        ArrayList arrayList = this.IV;
        if (arrayList != null) {
            arrayList.remove(animatorListener);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void a(@Nullable final d dVar, final boolean z) {
        if (!nI()) {
            Animator animator = this.Iw;
            if (animator != null) {
                animator.cancel();
            }
            if (nJ()) {
                h hVar = this.Iy;
                if (hVar == null) {
                    hVar = nD();
                }
                AnimatorSet a = a(hVar, 0.0f, 0.0f, 0.0f);
                a.addListener(new AnimatorListenerAdapter() {
                    private boolean cancelled;

                    public void onAnimationStart(Animator animator) {
                        a.this.IZ.f(0, z);
                        a aVar = a.this;
                        aVar.Iv = 1;
                        aVar.Iw = animator;
                        this.cancelled = false;
                    }

                    public void onAnimationCancel(Animator animator) {
                        this.cancelled = true;
                    }

                    public void onAnimationEnd(Animator animator) {
                        a aVar = a.this;
                        aVar.Iv = 0;
                        aVar.Iw = null;
                        if (!this.cancelled) {
                            aVar.IZ.f(z ? 8 : 4, z);
                            d dVar = dVar;
                            if (dVar != null) {
                                dVar.nw();
                            }
                        }
                    }
                });
                ArrayList arrayList = this.IV;
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        a.addListener((AnimatorListener) it.next());
                    }
                }
                a.start();
            } else {
                this.IZ.f(z ? 8 : 4, z);
                if (dVar != null) {
                    dVar.nw();
                }
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void b(@Nullable final d dVar, final boolean z) {
        if (!nt()) {
            Animator animator = this.Iw;
            if (animator != null) {
                animator.cancel();
            }
            if (nJ()) {
                if (this.IZ.getVisibility() != 0) {
                    this.IZ.setAlpha(0.0f);
                    this.IZ.setScaleY(0.0f);
                    this.IZ.setScaleX(0.0f);
                    t(0.0f);
                }
                h hVar = this.Ix;
                if (hVar == null) {
                    hVar = nC();
                }
                AnimatorSet a = a(hVar, 1.0f, 1.0f, 1.0f);
                a.addListener(new AnimatorListenerAdapter() {
                    public void onAnimationStart(Animator animator) {
                        a.this.IZ.f(0, z);
                        a aVar = a.this;
                        aVar.Iv = 2;
                        aVar.Iw = animator;
                    }

                    public void onAnimationEnd(Animator animator) {
                        a aVar = a.this;
                        aVar.Iv = 0;
                        aVar.Iw = null;
                        d dVar = dVar;
                        if (dVar != null) {
                            dVar.nv();
                        }
                    }
                });
                ArrayList arrayList = this.IU;
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        a.addListener((AnimatorListener) it.next());
                    }
                }
                a.start();
            } else {
                this.IZ.f(0, z);
                this.IZ.setAlpha(1.0f);
                this.IZ.setScaleY(1.0f);
                this.IZ.setScaleX(1.0f);
                t(1.0f);
                if (dVar != null) {
                    dVar.nv();
                }
            }
        }
    }

    private h nC() {
        if (this.Iz == null) {
            this.Iz = h.c(this.IZ.getContext(), com.google.android.material.a.a.design_fab_show_motion_spec);
        }
        return this.Iz;
    }

    private h nD() {
        if (this.IA == null) {
            this.IA = h.c(this.IZ.getContext(), com.google.android.material.a.a.design_fab_hide_motion_spec);
        }
        return this.IA;
    }

    @NonNull
    private AnimatorSet a(@NonNull h hVar, float f, float f2, float f3) {
        ArrayList arrayList = new ArrayList();
        Animator ofFloat = ObjectAnimator.ofFloat(this.IZ, View.ALPHA, new float[]{f});
        hVar.bJ("opacity").a(ofFloat);
        arrayList.add(ofFloat);
        ofFloat = ObjectAnimator.ofFloat(this.IZ, View.SCALE_X, new float[]{f2});
        String str = "scale";
        hVar.bJ(str).a(ofFloat);
        arrayList.add(ofFloat);
        ofFloat = ObjectAnimator.ofFloat(this.IZ, View.SCALE_Y, new float[]{f2});
        hVar.bJ(str).a(ofFloat);
        arrayList.add(ofFloat);
        a(f3, this.Jd);
        ofFloat = ObjectAnimator.ofObject(this.IZ, new com.google.android.material.a.f(), new g(), new Matrix[]{new Matrix(this.Jd)});
        hVar.bJ("iconScale").a(ofFloat);
        arrayList.add(ofFloat);
        AnimatorSet animatorSet = new AnimatorSet();
        com.google.android.material.a.b.a(animatorSet, arrayList);
        return animatorSet;
    }

    /* Access modifiers changed, original: final */
    public final Drawable getContentBackground() {
        return this.II;
    }

    /* Access modifiers changed, original: final */
    public final void nF() {
        Rect rect = this.Ir;
        e(rect);
        f(rect);
        this.Ja.setShadowPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* Access modifiers changed, original: 0000 */
    public void e(Rect rect) {
        this.IC.getPadding(rect);
    }

    /* Access modifiers changed, original: 0000 */
    public void onAttachedToWindow() {
        if (nG()) {
            ensurePreDrawListener();
            this.IZ.getViewTreeObserver().addOnPreDrawListener(this.Je);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void onDetachedFromWindow() {
        if (this.Je != null) {
            this.IZ.getViewTreeObserver().removeOnPreDrawListener(this.Je);
            this.Je = null;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void nH() {
        float rotation = this.IZ.getRotation();
        if (this.rotation != rotation) {
            this.rotation = rotation;
            nK();
        }
    }

    private void ensurePreDrawListener() {
        if (this.Je == null) {
            this.Je = new OnPreDrawListener() {
                public boolean onPreDraw() {
                    a.this.nH();
                    return true;
                }
            };
        }
    }

    /* Access modifiers changed, original: 0000 */
    public boolean nt() {
        boolean z = false;
        if (this.IZ.getVisibility() != 0) {
            if (this.Iv == 2) {
                z = true;
            }
            return z;
        }
        if (this.Iv != 1) {
            z = true;
        }
        return z;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean nI() {
        boolean z = false;
        if (this.IZ.getVisibility() == 0) {
            if (this.Iv == 1) {
                z = true;
            }
            return z;
        }
        if (this.Iv != 2) {
            z = true;
        }
        return z;
    }

    private ValueAnimator a(@NonNull f fVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(Iu);
        valueAnimator.setDuration(100);
        valueAnimator.addListener(fVar);
        valueAnimator.addUpdateListener(fVar);
        valueAnimator.setFloatValues(new float[]{0.0f, 1.0f});
        return valueAnimator;
    }

    private boolean nJ() {
        return ViewCompat.isLaidOut(this.IZ) && !this.IZ.isInEditMode();
    }

    private void nK() {
        if (VERSION.SDK_INT == 19) {
            if (this.rotation % 90.0f != 0.0f) {
                if (this.IZ.getLayerType() != 1) {
                    this.IZ.setLayerType(1, null);
                }
            } else if (this.IZ.getLayerType() != 0) {
                this.IZ.setLayerType(0, null);
            }
        }
        com.google.android.material.h.a aVar = this.IC;
        if (aVar != null) {
            aVar.setRotation(-this.rotation);
        }
        com.google.android.material.internal.a aVar2 = this.IH;
        if (aVar2 != null) {
            aVar2.setRotation(-this.rotation);
        }
    }
}
