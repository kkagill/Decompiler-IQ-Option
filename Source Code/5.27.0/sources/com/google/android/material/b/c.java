package com.google.android.material.b;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.RestrictTo.Scope;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.a.k;
import com.google.android.material.f.a;
import com.google.android.material.internal.h;

@RestrictTo({Scope.LIBRARY_GROUP})
/* compiled from: MaterialButtonHelper */
class c {
    private static final boolean Hu = (VERSION.SDK_INT >= 21);
    private final Paint HA = new Paint(1);
    @Nullable
    private GradientDrawable HB;
    @Nullable
    private Drawable HC;
    @Nullable
    private GradientDrawable HD;
    @Nullable
    private Drawable HE;
    @Nullable
    private GradientDrawable HF;
    @Nullable
    private GradientDrawable HG;
    @Nullable
    private GradientDrawable HH;
    private boolean HI = false;
    private final a Hv;
    @Nullable
    private Mode Hw;
    @Nullable
    private ColorStateList Hx;
    @Nullable
    private ColorStateList Hy;
    @Nullable
    private ColorStateList Hz;
    private final Rect bounds = new Rect();
    private int cornerRadius;
    private int insetBottom;
    private int insetLeft;
    private int insetRight;
    private int insetTop;
    private final RectF jw = new RectF();
    private int strokeWidth;

    public c(a aVar) {
        this.Hv = aVar;
    }

    public void a(TypedArray typedArray) {
        int i = 0;
        this.insetLeft = typedArray.getDimensionPixelOffset(k.MaterialButton_android_insetLeft, 0);
        this.insetRight = typedArray.getDimensionPixelOffset(k.MaterialButton_android_insetRight, 0);
        this.insetTop = typedArray.getDimensionPixelOffset(k.MaterialButton_android_insetTop, 0);
        this.insetBottom = typedArray.getDimensionPixelOffset(k.MaterialButton_android_insetBottom, 0);
        this.cornerRadius = typedArray.getDimensionPixelSize(k.MaterialButton_cornerRadius, 0);
        this.strokeWidth = typedArray.getDimensionPixelSize(k.MaterialButton_strokeWidth, 0);
        this.Hw = h.parseTintMode(typedArray.getInt(k.MaterialButton_backgroundTintMode, -1), Mode.SRC_IN);
        this.Hx = a.a(this.Hv.getContext(), typedArray, k.MaterialButton_backgroundTint);
        this.Hy = a.a(this.Hv.getContext(), typedArray, k.MaterialButton_strokeColor);
        this.Hz = a.a(this.Hv.getContext(), typedArray, k.MaterialButton_rippleColor);
        this.HA.setStyle(Style.STROKE);
        this.HA.setStrokeWidth((float) this.strokeWidth);
        Paint paint = this.HA;
        ColorStateList colorStateList = this.Hy;
        if (colorStateList != null) {
            i = colorStateList.getColorForState(this.Hv.getDrawableState(), 0);
        }
        paint.setColor(i);
        int paddingStart = ViewCompat.getPaddingStart(this.Hv);
        int paddingTop = this.Hv.getPaddingTop();
        i = ViewCompat.getPaddingEnd(this.Hv);
        int paddingBottom = this.Hv.getPaddingBottom();
        this.Hv.setInternalBackground(Hu ? nf() : nd());
        ViewCompat.setPaddingRelative(this.Hv, paddingStart + this.insetLeft, paddingTop + this.insetTop, i + this.insetRight, paddingBottom + this.insetBottom);
    }

    /* Access modifiers changed, original: 0000 */
    public void nb() {
        this.HI = true;
        this.Hv.setSupportBackgroundTintList(this.Hx);
        this.Hv.setSupportBackgroundTintMode(this.Hw);
    }

    /* Access modifiers changed, original: 0000 */
    public boolean nc() {
        return this.HI;
    }

    /* Access modifiers changed, original: 0000 */
    public void f(@Nullable Canvas canvas) {
        if (canvas != null && this.Hy != null && this.strokeWidth > 0) {
            this.bounds.set(this.Hv.getBackground().getBounds());
            this.jw.set((((float) this.bounds.left) + (((float) this.strokeWidth) / 2.0f)) + ((float) this.insetLeft), (((float) this.bounds.top) + (((float) this.strokeWidth) / 2.0f)) + ((float) this.insetTop), (((float) this.bounds.right) - (((float) this.strokeWidth) / 2.0f)) - ((float) this.insetRight), (((float) this.bounds.bottom) - (((float) this.strokeWidth) / 2.0f)) - ((float) this.insetBottom));
            float f = ((float) this.cornerRadius) - (((float) this.strokeWidth) / 2.0f);
            canvas.drawRoundRect(this.jw, f, f, this.HA);
        }
    }

    private Drawable nd() {
        this.HB = new GradientDrawable();
        this.HB.setCornerRadius(((float) this.cornerRadius) + 1.0E-5f);
        this.HB.setColor(-1);
        this.HC = DrawableCompat.wrap(this.HB);
        DrawableCompat.setTintList(this.HC, this.Hx);
        Mode mode = this.Hw;
        if (mode != null) {
            DrawableCompat.setTintMode(this.HC, mode);
        }
        this.HD = new GradientDrawable();
        this.HD.setCornerRadius(((float) this.cornerRadius) + 1.0E-5f);
        this.HD.setColor(-1);
        this.HE = DrawableCompat.wrap(this.HD);
        DrawableCompat.setTintList(this.HE, this.Hz);
        return b(new LayerDrawable(new Drawable[]{this.HC, this.HE}));
    }

    private InsetDrawable b(Drawable drawable) {
        return new InsetDrawable(drawable, this.insetLeft, this.insetTop, this.insetRight, this.insetBottom);
    }

    /* Access modifiers changed, original: 0000 */
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        if (this.Hx != colorStateList) {
            this.Hx = colorStateList;
            if (Hu) {
                ne();
                return;
            }
            Drawable drawable = this.HC;
            if (drawable != null) {
                DrawableCompat.setTintList(drawable, this.Hx);
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public ColorStateList getSupportBackgroundTintList() {
        return this.Hx;
    }

    /* Access modifiers changed, original: 0000 */
    public void setSupportBackgroundTintMode(@Nullable Mode mode) {
        if (this.Hw != mode) {
            this.Hw = mode;
            if (Hu) {
                ne();
                return;
            }
            Drawable drawable = this.HC;
            if (drawable != null) {
                Mode mode2 = this.Hw;
                if (mode2 != null) {
                    DrawableCompat.setTintMode(drawable, mode2);
                }
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public Mode getSupportBackgroundTintMode() {
        return this.Hw;
    }

    private void ne() {
        GradientDrawable gradientDrawable = this.HF;
        if (gradientDrawable != null) {
            DrawableCompat.setTintList(gradientDrawable, this.Hx);
            Mode mode = this.Hw;
            if (mode != null) {
                DrawableCompat.setTintMode(this.HF, mode);
            }
        }
    }

    @TargetApi(21)
    private Drawable nf() {
        this.HF = new GradientDrawable();
        this.HF.setCornerRadius(((float) this.cornerRadius) + 1.0E-5f);
        this.HF.setColor(-1);
        ne();
        this.HG = new GradientDrawable();
        this.HG.setCornerRadius(((float) this.cornerRadius) + 1.0E-5f);
        this.HG.setColor(0);
        this.HG.setStroke(this.strokeWidth, this.Hy);
        InsetDrawable b = b(new LayerDrawable(new Drawable[]{this.HF, this.HG}));
        this.HH = new GradientDrawable();
        this.HH.setCornerRadius(((float) this.cornerRadius) + 1.0E-5f);
        this.HH.setColor(-1);
        return new b(com.google.android.material.g.a.d(this.Hz), b, this.HH);
    }

    /* Access modifiers changed, original: 0000 */
    public void k(int i, int i2) {
        GradientDrawable gradientDrawable = this.HH;
        if (gradientDrawable != null) {
            gradientDrawable.setBounds(this.insetLeft, this.insetTop, i2 - this.insetRight, i - this.insetBottom);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void setBackgroundColor(int i) {
        GradientDrawable gradientDrawable;
        if (Hu) {
            gradientDrawable = this.HF;
            if (gradientDrawable != null) {
                gradientDrawable.setColor(i);
                return;
            }
        }
        if (!Hu) {
            gradientDrawable = this.HB;
            if (gradientDrawable != null) {
                gradientDrawable.setColor(i);
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void setRippleColor(@Nullable ColorStateList colorStateList) {
        if (this.Hz != colorStateList) {
            this.Hz = colorStateList;
            if (Hu && (this.Hv.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.Hv.getBackground()).setColor(colorStateList);
            } else if (!Hu) {
                Drawable drawable = this.HE;
                if (drawable != null) {
                    DrawableCompat.setTintList(drawable, colorStateList);
                }
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    @Nullable
    public ColorStateList getRippleColor() {
        return this.Hz;
    }

    /* Access modifiers changed, original: 0000 */
    public void setStrokeColor(@Nullable ColorStateList colorStateList) {
        if (this.Hy != colorStateList) {
            this.Hy = colorStateList;
            Paint paint = this.HA;
            int i = 0;
            if (colorStateList != null) {
                i = colorStateList.getColorForState(this.Hv.getDrawableState(), 0);
            }
            paint.setColor(i);
            ng();
        }
    }

    /* Access modifiers changed, original: 0000 */
    @Nullable
    public ColorStateList getStrokeColor() {
        return this.Hy;
    }

    /* Access modifiers changed, original: 0000 */
    public void setStrokeWidth(int i) {
        if (this.strokeWidth != i) {
            this.strokeWidth = i;
            this.HA.setStrokeWidth((float) i);
            ng();
        }
    }

    /* Access modifiers changed, original: 0000 */
    public int getStrokeWidth() {
        return this.strokeWidth;
    }

    private void ng() {
        if (Hu && this.HG != null) {
            this.Hv.setInternalBackground(nf());
        } else if (!Hu) {
            this.Hv.invalidate();
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void setCornerRadius(int i) {
        if (this.cornerRadius != i) {
            this.cornerRadius = i;
            float f;
            if (Hu && this.HF != null && this.HG != null && this.HH != null) {
                if (VERSION.SDK_INT == 21) {
                    float f2 = ((float) i) + 1.0E-5f;
                    ni().setCornerRadius(f2);
                    nh().setCornerRadius(f2);
                }
                f = ((float) i) + 1.0E-5f;
                this.HF.setCornerRadius(f);
                this.HG.setCornerRadius(f);
                this.HH.setCornerRadius(f);
            } else if (!Hu) {
                GradientDrawable gradientDrawable = this.HB;
                if (gradientDrawable != null && this.HD != null) {
                    f = ((float) i) + 1.0E-5f;
                    gradientDrawable.setCornerRadius(f);
                    this.HD.setCornerRadius(f);
                    this.Hv.invalidate();
                }
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public int getCornerRadius() {
        return this.cornerRadius;
    }

    @Nullable
    private GradientDrawable nh() {
        return (!Hu || this.Hv.getBackground() == null) ? null : (GradientDrawable) ((LayerDrawable) ((InsetDrawable) ((RippleDrawable) this.Hv.getBackground()).getDrawable(0)).getDrawable()).getDrawable(1);
    }

    @Nullable
    private GradientDrawable ni() {
        return (!Hu || this.Hv.getBackground() == null) ? null : (GradientDrawable) ((LayerDrawable) ((InsetDrawable) ((RippleDrawable) this.Hv.getBackground()).getDrawable(0)).getDrawable()).getDrawable(0);
    }
}
