package com.google.android.material.floatingactionbutton;

import android.animation.Animator.AnimatorListener;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import androidx.annotation.AnimatorRes;
import androidx.annotation.ColorInt;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.appcompat.widget.AppCompatDrawableManager;
import androidx.appcompat.widget.AppCompatImageHelper;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.DefaultBehavior;
import androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.TintableBackgroundView;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TintableImageSourceView;
import com.google.android.material.a.d;
import com.google.android.material.a.h;
import com.google.android.material.a.k;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.d.c;
import com.google.android.material.internal.i;
import java.util.List;

@DefaultBehavior(Behavior.class)
public class FloatingActionButton extends i implements TintableBackgroundView, TintableImageSourceView, com.google.android.material.d.a {
    private Mode Hw;
    private ColorStateList Hx;
    private ColorStateList Hz;
    @Nullable
    private ColorStateList If;
    @Nullable
    private Mode Ig;
    private int Ih;
    private int Ii;
    boolean Ij;
    final Rect Ik;
    private final Rect Il;
    private final AppCompatImageHelper Im;
    private final c In;
    private a Io;
    private int maxImageSize;
    private int size;

    public static abstract class a {
        public void d(FloatingActionButton floatingActionButton) {
        }

        public void e(FloatingActionButton floatingActionButton) {
        }
    }

    protected static class BaseBehavior<T extends FloatingActionButton> extends androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior<T> {
        private Rect Ir;
        private a Is;
        private boolean It;

        public BaseBehavior() {
            this.It = true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.FloatingActionButton_Behavior_Layout);
            this.It = obtainStyledAttributes.getBoolean(k.FloatingActionButton_Behavior_Layout_behavior_autoHide, true);
            obtainStyledAttributes.recycle();
        }

        public void onAttachedToLayoutParams(@NonNull LayoutParams layoutParams) {
            if (layoutParams.dodgeInsetEdges == 0) {
                layoutParams.dodgeInsetEdges = 80;
            }
        }

        /* renamed from: a */
        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                a(coordinatorLayout, (AppBarLayout) view, floatingActionButton);
            } else if (F(view)) {
                b(view, floatingActionButton);
            }
            return false;
        }

        private static boolean F(@NonNull View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            return layoutParams instanceof LayoutParams ? ((LayoutParams) layoutParams).getBehavior() instanceof BottomSheetBehavior : false;
        }

        private boolean a(View view, FloatingActionButton floatingActionButton) {
            LayoutParams layoutParams = (LayoutParams) floatingActionButton.getLayoutParams();
            if (this.It && layoutParams.getAnchorId() == view.getId() && floatingActionButton.getUserSetVisibility() == 0) {
                return true;
            }
            return false;
        }

        private boolean a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!a((View) appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.Ir == null) {
                this.Ir = new Rect();
            }
            Rect rect = this.Ir;
            com.google.android.material.internal.c.getDescendantRect(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.b(this.Is, false);
            } else {
                floatingActionButton.a(this.Is, false);
            }
            return true;
        }

        private boolean b(View view, FloatingActionButton floatingActionButton) {
            if (!a(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((LayoutParams) floatingActionButton.getLayoutParams()).topMargin) {
                floatingActionButton.b(this.Is, false);
            } else {
                floatingActionButton.a(this.Is, false);
            }
            return true;
        }

        /* renamed from: a */
        public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i) {
            List dependencies = coordinatorLayout.getDependencies(floatingActionButton);
            int size = dependencies.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = (View) dependencies.get(i2);
                if (!(view instanceof AppBarLayout)) {
                    if (F(view) && b(view, floatingActionButton)) {
                        break;
                    }
                } else if (a(coordinatorLayout, (AppBarLayout) view, floatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.onLayoutChild(floatingActionButton, i);
            a(coordinatorLayout, floatingActionButton);
            return true;
        }

        /* renamed from: a */
        public boolean getInsetDodgeRect(@NonNull CoordinatorLayout coordinatorLayout, @NonNull FloatingActionButton floatingActionButton, @NonNull Rect rect) {
            Rect rect2 = floatingActionButton.Ik;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        private void a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton) {
            Rect rect = floatingActionButton.Ik;
            if (rect != null && rect.centerX() > 0 && rect.centerY() > 0) {
                LayoutParams layoutParams = (LayoutParams) floatingActionButton.getLayoutParams();
                int i = 0;
                int i2 = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - layoutParams.rightMargin ? rect.right : floatingActionButton.getLeft() <= layoutParams.leftMargin ? -rect.left : 0;
                if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - layoutParams.bottomMargin) {
                    i = rect.bottom;
                } else if (floatingActionButton.getTop() <= layoutParams.topMargin) {
                    i = -rect.top;
                }
                if (i != 0) {
                    ViewCompat.offsetTopAndBottom(floatingActionButton, i);
                }
                if (i2 != 0) {
                    ViewCompat.offsetLeftAndRight(floatingActionButton, i2);
                }
            }
        }
    }

    private class b implements com.google.android.material.h.b {
        b() {
        }

        public float getRadius() {
            return ((float) FloatingActionButton.this.getSizeDimension()) / 2.0f;
        }

        public void setShadowPadding(int i, int i2, int i3, int i4) {
            FloatingActionButton.this.Ik.set(i, i2, i3, i4);
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            floatingActionButton.setPadding(i + floatingActionButton.Ii, i2 + FloatingActionButton.this.Ii, i3 + FloatingActionButton.this.Ii, i4 + FloatingActionButton.this.Ii);
        }

        public void setBackgroundDrawable(Drawable drawable) {
            super.setBackgroundDrawable(drawable);
        }

        public boolean nx() {
            return FloatingActionButton.this.Ij;
        }
    }

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public /* bridge */ /* synthetic */ void onAttachedToLayoutParams(@NonNull LayoutParams layoutParams) {
            super.onAttachedToLayoutParams(layoutParams);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* Access modifiers changed, original: protected */
    public void onMeasure(int i, int i2) {
        int sizeDimension = getSizeDimension();
        this.Ii = (sizeDimension - this.maxImageSize) / 2;
        getImpl().nF();
        i = Math.min(resolveAdjustedSize(sizeDimension, i), resolveAdjustedSize(sizeDimension, i2));
        setMeasuredDimension((this.Ik.left + i) + this.Ik.right, (i + this.Ik.top) + this.Ik.bottom);
    }

    @ColorInt
    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.Hz;
        return colorStateList != null ? colorStateList.getDefaultColor() : 0;
    }

    @Nullable
    public ColorStateList getRippleColorStateList() {
        return this.Hz;
    }

    public void setRippleColor(@ColorInt int i) {
        setRippleColor(ColorStateList.valueOf(i));
    }

    public void setRippleColor(@Nullable ColorStateList colorStateList) {
        if (this.Hz != colorStateList) {
            this.Hz = colorStateList;
            getImpl().setRippleColor(this.Hz);
        }
    }

    @Nullable
    public ColorStateList getBackgroundTintList() {
        return this.Hx;
    }

    public void setBackgroundTintList(@Nullable ColorStateList colorStateList) {
        if (this.Hx != colorStateList) {
            this.Hx = colorStateList;
            getImpl().setBackgroundTintList(colorStateList);
        }
    }

    @Nullable
    public Mode getBackgroundTintMode() {
        return this.Hw;
    }

    public void setBackgroundTintMode(@Nullable Mode mode) {
        if (this.Hw != mode) {
            this.Hw = mode;
            getImpl().setBackgroundTintMode(mode);
        }
    }

    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    @Nullable
    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public void setSupportBackgroundTintMode(@Nullable Mode mode) {
        setBackgroundTintMode(mode);
    }

    @Nullable
    public Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public void setSupportImageTintList(@Nullable ColorStateList colorStateList) {
        if (this.If != colorStateList) {
            this.If = colorStateList;
            ns();
        }
    }

    @Nullable
    public ColorStateList getSupportImageTintList() {
        return this.If;
    }

    public void setSupportImageTintMode(@Nullable Mode mode) {
        if (this.Ig != mode) {
            this.Ig = mode;
            ns();
        }
    }

    @Nullable
    public Mode getSupportImageTintMode() {
        return this.Ig;
    }

    private void ns() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            ColorStateList colorStateList = this.If;
            if (colorStateList == null) {
                DrawableCompat.clearColorFilter(drawable);
                return;
            }
            int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
            Mode mode = this.Ig;
            if (mode == null) {
                mode = Mode.SRC_IN;
            }
            drawable.mutate().setColorFilter(AppCompatDrawableManager.getPorterDuffColorFilter(colorForState, mode));
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundResource(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundColor(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setImageResource(@DrawableRes int i) {
        this.Im.setImageResource(i);
    }

    public void setImageDrawable(@Nullable Drawable drawable) {
        super.setImageDrawable(drawable);
        getImpl().nA();
    }

    /* Access modifiers changed, original: 0000 */
    public void a(a aVar, boolean z) {
        getImpl().b(a(aVar), z);
    }

    public void c(@NonNull AnimatorListener animatorListener) {
        getImpl().c(animatorListener);
    }

    public void d(@NonNull AnimatorListener animatorListener) {
        getImpl().d(animatorListener);
    }

    /* Access modifiers changed, original: 0000 */
    public void b(@Nullable a aVar, boolean z) {
        getImpl().a(a(aVar), z);
    }

    public void e(@NonNull AnimatorListener animatorListener) {
        getImpl().e(animatorListener);
    }

    public void f(@NonNull AnimatorListener animatorListener) {
        getImpl().f(animatorListener);
    }

    public boolean nq() {
        return this.In.nq();
    }

    public void setExpandedComponentIdHint(@IdRes int i) {
        this.In.setExpandedComponentIdHint(i);
    }

    public int getExpandedComponentIdHint() {
        return this.In.getExpandedComponentIdHint();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.Ij != z) {
            this.Ij = z;
            getImpl().nE();
        }
    }

    public boolean getUseCompatPadding() {
        return this.Ij;
    }

    public void setSize(int i) {
        this.Ih = 0;
        if (i != this.size) {
            this.size = i;
            requestLayout();
        }
    }

    public int getSize() {
        return this.size;
    }

    @Nullable
    private d a(@Nullable final a aVar) {
        return aVar == null ? null : new d() {
            public void nv() {
                aVar.d(FloatingActionButton.this);
            }

            public void nw() {
                aVar.e(FloatingActionButton.this);
            }
        };
    }

    public boolean nt() {
        return getImpl().nt();
    }

    public void setCustomSize(@Px int i) {
        if (i >= 0) {
            this.Ih = i;
            return;
        }
        throw new IllegalArgumentException("Custom size must be non-negative");
    }

    @Px
    public int getCustomSize() {
        return this.Ih;
    }

    /* Access modifiers changed, original: 0000 */
    public int getSizeDimension() {
        return aI(this.size);
    }

    private int aI(int i) {
        int i2 = this.Ih;
        if (i2 != 0) {
            return i2;
        }
        Resources resources = getResources();
        if (i == -1) {
            if (Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470) {
                i = aI(1);
            } else {
                i = aI(0);
            }
            return i;
        } else if (i != 1) {
            return resources.getDimensionPixelSize(d.design_fab_size_normal);
        } else {
            return resources.getDimensionPixelSize(d.design_fab_size_mini);
        }
    }

    /* Access modifiers changed, original: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getImpl().onAttachedToWindow();
    }

    /* Access modifiers changed, original: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().onDetachedFromWindow();
    }

    /* Access modifiers changed, original: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().b(getDrawableState());
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().nB();
    }

    /* Access modifiers changed, original: protected */
    public Parcelable onSaveInstanceState() {
        com.google.android.material.j.a aVar = new com.google.android.material.j.a(super.onSaveInstanceState());
        aVar.NB.put("expandableWidgetHelper", this.In.onSaveInstanceState());
        return aVar;
    }

    /* Access modifiers changed, original: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof com.google.android.material.j.a) {
            com.google.android.material.j.a aVar = (com.google.android.material.j.a) parcelable;
            super.onRestoreInstanceState(aVar.getSuperState());
            this.In.onRestoreInstanceState((Bundle) aVar.NB.get("expandableWidgetHelper"));
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Deprecated
    public boolean b(@NonNull Rect rect) {
        if (!ViewCompat.isLaidOut(this)) {
            return false;
        }
        rect.set(0, 0, getWidth(), getHeight());
        d(rect);
        return true;
    }

    public void c(@NonNull Rect rect) {
        rect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
        d(rect);
    }

    private void d(@NonNull Rect rect) {
        rect.left += this.Ik.left;
        rect.top += this.Ik.top;
        rect.right -= this.Ik.right;
        rect.bottom -= this.Ik.bottom;
    }

    @NonNull
    public Drawable getContentBackground() {
        return getImpl().getContentBackground();
    }

    private static int resolveAdjustedSize(int i, int i2) {
        int mode = MeasureSpec.getMode(i2);
        i2 = MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            return Math.min(i, i2);
        }
        if (mode == 0) {
            return i;
        }
        if (mode == 1073741824) {
            return i2;
        }
        throw new IllegalArgumentException();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && b(this.Il) && !this.Il.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public float getCompatElevation() {
        return getImpl().getElevation();
    }

    public void setCompatElevation(float f) {
        getImpl().setElevation(f);
    }

    public void setCompatElevationResource(@DimenRes int i) {
        setCompatElevation(getResources().getDimension(i));
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().ny();
    }

    public void setCompatHoveredFocusedTranslationZ(float f) {
        getImpl().r(f);
    }

    public void setCompatHoveredFocusedTranslationZResource(@DimenRes int i) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i));
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().nz();
    }

    public void setCompatPressedTranslationZ(float f) {
        getImpl().s(f);
    }

    public void setCompatPressedTranslationZResource(@DimenRes int i) {
        setCompatPressedTranslationZ(getResources().getDimension(i));
    }

    public h getShowMotionSpec() {
        return getImpl().getShowMotionSpec();
    }

    public void setShowMotionSpec(h hVar) {
        getImpl().setShowMotionSpec(hVar);
    }

    public void setShowMotionSpecResource(@AnimatorRes int i) {
        setShowMotionSpec(h.c(getContext(), i));
    }

    public h getHideMotionSpec() {
        return getImpl().getHideMotionSpec();
    }

    public void setHideMotionSpec(h hVar) {
        getImpl().setHideMotionSpec(hVar);
    }

    public void setHideMotionSpecResource(@AnimatorRes int i) {
        setHideMotionSpec(h.c(getContext(), i));
    }

    private a getImpl() {
        if (this.Io == null) {
            this.Io = nu();
        }
        return this.Io;
    }

    private a nu() {
        if (VERSION.SDK_INT >= 21) {
            return new b(this, new b());
        }
        return new a(this, new b());
    }
}
