package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.google.android.material.g.a;
import com.google.android.material.internal.i;
import java.util.ArrayList;

@RequiresApi(21)
/* compiled from: FloatingActionButtonImplLollipop */
class b extends a {
    private InsetDrawable Jl;

    /* Access modifiers changed, original: 0000 */
    public void nB() {
    }

    /* Access modifiers changed, original: 0000 */
    public boolean nG() {
        return false;
    }

    b(i iVar, com.google.android.material.h.b bVar) {
        super(iVar, bVar);
    }

    /* Access modifiers changed, original: 0000 */
    public void setRippleColor(ColorStateList colorStateList) {
        if (this.IG instanceof RippleDrawable) {
            ((RippleDrawable) this.IG).setColor(a.d(colorStateList));
        } else {
            super.setRippleColor(colorStateList);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void e(float f, float f2, float f3) {
        if (VERSION.SDK_INT == 21) {
            this.IZ.refreshDrawableState();
        } else {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(PRESSED_ENABLED_STATE_SET, h(f, f3));
            stateListAnimator.addState(IW, h(f, f2));
            stateListAnimator.addState(IX, h(f, f2));
            stateListAnimator.addState(IY, h(f, f2));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.IZ, "elevation", new float[]{f}).setDuration(0));
            if (VERSION.SDK_INT >= 22 && VERSION.SDK_INT <= 24) {
                arrayList.add(ObjectAnimator.ofFloat(this.IZ, View.TRANSLATION_Z, new float[]{this.IZ.getTranslationZ()}).setDuration(100));
            }
            arrayList.add(ObjectAnimator.ofFloat(this.IZ, View.TRANSLATION_Z, new float[]{0.0f}).setDuration(100));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(Iu);
            stateListAnimator.addState(ENABLED_STATE_SET, animatorSet);
            stateListAnimator.addState(EMPTY_STATE_SET, h(0.0f, 0.0f));
            this.IZ.setStateListAnimator(stateListAnimator);
        }
        if (this.Ja.nx()) {
            nF();
        }
    }

    @NonNull
    private Animator h(float f, float f2) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.IZ, "elevation", new float[]{f}).setDuration(0)).with(ObjectAnimator.ofFloat(this.IZ, View.TRANSLATION_Z, new float[]{f2}).setDuration(100));
        animatorSet.setInterpolator(Iu);
        return animatorSet;
    }

    public float getElevation() {
        return this.IZ.getElevation();
    }

    /* Access modifiers changed, original: 0000 */
    public void nE() {
        nF();
    }

    /* Access modifiers changed, original: 0000 */
    public void f(Rect rect) {
        if (this.Ja.nx()) {
            this.Jl = new InsetDrawable(this.IG, rect.left, rect.top, rect.right, rect.bottom);
            this.Ja.setBackgroundDrawable(this.Jl);
            return;
        }
        this.Ja.setBackgroundDrawable(this.IG);
    }

    /* Access modifiers changed, original: 0000 */
    public void b(int[] iArr) {
        if (VERSION.SDK_INT != 21) {
            return;
        }
        if (this.IZ.isEnabled()) {
            this.IZ.setElevation(this.elevation);
            if (this.IZ.isPressed()) {
                this.IZ.setTranslationZ(this.IK);
                return;
            } else if (this.IZ.isFocused() || this.IZ.isHovered()) {
                this.IZ.setTranslationZ(this.IJ);
                return;
            } else {
                this.IZ.setTranslationZ(0.0f);
                return;
            }
        }
        this.IZ.setElevation(0.0f);
        this.IZ.setTranslationZ(0.0f);
    }

    /* Access modifiers changed, original: 0000 */
    public void e(Rect rect) {
        if (this.Ja.nx()) {
            float radius = this.Ja.getRadius();
            float elevation = getElevation() + this.IK;
            int ceil = (int) Math.ceil((double) com.google.android.material.h.a.calculateHorizontalPadding(elevation, radius, false));
            int ceil2 = (int) Math.ceil((double) com.google.android.material.h.a.calculateVerticalPadding(elevation, radius, false));
            rect.set(ceil, ceil2, ceil, ceil2);
            return;
        }
        rect.set(0, 0, 0, 0);
    }
}
