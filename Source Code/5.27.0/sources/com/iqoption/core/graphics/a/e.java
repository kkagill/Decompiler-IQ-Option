package com.iqoption.core.graphics.a;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.view.Gravity;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.graphics.drawable.TintAwareDrawable;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0002\u0010\u0004J\u0010\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0016J\b\u0010(\u001a\u00020\u0006H\u0017J\b\u0010)\u001a\u00020\u0006H\u0016J\b\u0010*\u001a\u00020\u0006H\u0016J\b\u0010+\u001a\u00020\u0006H\u0016J\u0012\u0010,\u001a\u00020%2\b\u0010-\u001a\u0004\u0018\u00010.H\u0017J\u0010\u0010/\u001a\u00020%2\u0006\u00100\u001a\u00020\u000fH\u0014J\u0010\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u0006H\u0017J\u0010\u00104\u001a\u0002022\u0006\u00105\u001a\u00020\u0006H\u0014J\u0012\u00106\u001a\u0002022\b\u00107\u001a\u0004\u0018\u000108H\u0014J\u0010\u00109\u001a\u00020%2\u0006\u0010:\u001a\u00020\u0006H\u0016J\u0012\u0010;\u001a\u00020%2\b\u0010<\u001a\u0004\u0018\u00010=H\u0016J\u0010\u0010>\u001a\u00020%2\u0006\u0010?\u001a\u00020\u0006H\u0016J\u0012\u0010@\u001a\u00020%2\b\u0010A\u001a\u0004\u0018\u00010BH\u0016J\u0010\u0010C\u001a\u00020%2\u0006\u0010D\u001a\u00020EH\u0016R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\n \r*\u0004\u0018\u00010\u00010\u0001X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u0014@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u0014@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019R\u000e\u0010\u001d\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R$\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\t\"\u0004\b \u0010\u000bR$\u0010!\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\t\"\u0004\b#\u0010\u000b¨\u0006F"}, bng = {"Lcom/iqoption/core/graphics/drawable/PropertyDrawable;", "Landroid/graphics/drawable/Drawable;", "Landroidx/core/graphics/drawable/TintAwareDrawable;", "d", "(Landroid/graphics/drawable/Drawable;)V", "value", "", "alphaCompat", "getAlphaCompat", "()I", "setAlphaCompat", "(I)V", "delegate", "kotlin.jvm.PlatformType", "insets", "Landroid/graphics/Rect;", "getInsets", "()Landroid/graphics/Rect;", "setInsets", "(Landroid/graphics/Rect;)V", "", "scaleX", "getScaleX", "()F", "setScaleX", "(F)V", "scaleY", "getScaleY", "setScaleY", "tempRect", "translationX", "getTranslationX", "setTranslationX", "translationY", "getTranslationY", "setTranslationY", "draw", "", "canvas", "Landroid/graphics/Canvas;", "getAlpha", "getIntrinsicHeight", "getIntrinsicWidth", "getOpacity", "getOutline", "outline", "Landroid/graphics/Outline;", "onBoundsChange", "bounds", "onLayoutDirectionChanged", "", "layoutDirection", "onLevelChange", "level", "onStateChange", "state", "", "setAlpha", "alpha", "setColorFilter", "colorFilter", "Landroid/graphics/ColorFilter;", "setTint", "tintColor", "setTintList", "tint", "Landroid/content/res/ColorStateList;", "setTintMode", "tintMode", "Landroid/graphics/PorterDuff$Mode;", "core_release"})
/* compiled from: PropertyDrawable.kt */
public final class e extends Drawable implements TintAwareDrawable {
    private final Rect bif = new Rect();
    private final Drawable bix;
    private int biy = 255;
    private Rect biz = new Rect();
    private float scaleX = 1.0f;
    private float scaleY = 1.0f;
    private int translationX;
    private int translationY;

    @i(bne = {1, 1, 15}, bnf = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J$\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u001c\u0010\u000b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\f¸\u0006\u0000"}, bng = {"com/iqoption/core/graphics/drawable/PropertyDrawable$delegate$1$1", "Landroid/graphics/drawable/Drawable$Callback;", "invalidateDrawable", "", "who", "Landroid/graphics/drawable/Drawable;", "scheduleDrawable", "what", "Ljava/lang/Runnable;", "when", "", "unscheduleDrawable", "core_release"})
    /* compiled from: PropertyDrawable.kt */
    public static final class a implements Callback {
        final /* synthetic */ e biA;

        a(e eVar) {
            this.biA = eVar;
        }

        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            this.biA.unscheduleSelf(runnable);
        }

        public void invalidateDrawable(Drawable drawable) {
            this.biA.invalidateSelf();
        }

        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            this.biA.scheduleSelf(runnable, j);
        }
    }

    public e(Drawable drawable) {
        kotlin.jvm.internal.i.f(drawable, "d");
        drawable = DrawableCompat.wrap(drawable.mutate());
        kotlin.jvm.internal.i.e(drawable, "it");
        drawable.setCallback(new a(this));
        this.bix = drawable;
    }

    public final void eN(int i) {
        if (this.biy != i) {
            this.biy = i;
            Drawable drawable = this.bix;
            kotlin.jvm.internal.i.e(drawable, "delegate");
            drawable.setAlpha(i);
            invalidateSelf();
        }
    }

    public final float getScaleX() {
        return this.scaleX;
    }

    public final void setScaleX(float f) {
        if (this.scaleX != f) {
            this.scaleX = f;
            Rect bounds = getBounds();
            kotlin.jvm.internal.i.e(bounds, "bounds");
            onBoundsChange(bounds);
            invalidateSelf();
        }
    }

    public final float getScaleY() {
        return this.scaleY;
    }

    public final void setScaleY(float f) {
        if (this.scaleY != f) {
            this.scaleY = f;
            Rect bounds = getBounds();
            kotlin.jvm.internal.i.e(bounds, "bounds");
            onBoundsChange(bounds);
            invalidateSelf();
        }
    }

    public final int Ya() {
        return this.translationX;
    }

    public final void eO(int i) {
        if (this.translationX != i) {
            this.translationX = i;
            Rect bounds = getBounds();
            kotlin.jvm.internal.i.e(bounds, "bounds");
            onBoundsChange(bounds);
            invalidateSelf();
        }
    }

    public final int Yb() {
        return this.translationY;
    }

    public final void eP(int i) {
        if (this.translationY != i) {
            this.translationY = i;
            Rect bounds = getBounds();
            kotlin.jvm.internal.i.e(bounds, "bounds");
            onBoundsChange(bounds);
            invalidateSelf();
        }
    }

    public void draw(Canvas canvas) {
        kotlin.jvm.internal.i.f(canvas, "canvas");
        this.bix.draw(canvas);
    }

    public void setAlpha(int i) {
        eN(i);
    }

    public int getOpacity() {
        Drawable drawable = this.bix;
        kotlin.jvm.internal.i.e(drawable, "delegate");
        return drawable.getOpacity();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.bix;
        kotlin.jvm.internal.i.e(drawable, "delegate");
        drawable.setColorFilter(colorFilter);
    }

    @TargetApi(19)
    public int getAlpha() {
        Drawable drawable = this.bix;
        kotlin.jvm.internal.i.e(drawable, "delegate");
        return drawable.getAlpha();
    }

    /* Access modifiers changed, original: protected */
    public void onBoundsChange(Rect rect) {
        kotlin.jvm.internal.i.f(rect, "bounds");
        super.onBoundsChange(rect);
        Rect rect2 = this.bif;
        int width = (int) (((float) rect.width()) * this.scaleX);
        int height = (int) (((float) rect.height()) * this.scaleY);
        Gravity.apply(17, width, height, rect, rect2);
        rect2.left += this.biz.left;
        rect2.top += this.biz.top;
        rect2.right -= this.biz.right;
        rect2.bottom -= this.biz.bottom;
        rect2.offset(this.translationX, this.translationY);
        if (width > 0 && height > 0) {
            Drawable drawable = this.bix;
            kotlin.jvm.internal.i.e(drawable, "delegate");
            drawable.setBounds(rect2);
        }
    }

    /* Access modifiers changed, original: protected */
    public boolean onStateChange(int[] iArr) {
        return this.bix.setState(iArr);
    }

    /* Access modifiers changed, original: protected */
    public boolean onLevelChange(int i) {
        return this.bix.setLevel(i);
    }

    @TargetApi(23)
    public boolean onLayoutDirectionChanged(int i) {
        return this.bix.setLayoutDirection(i);
    }

    public void setTint(int i) {
        DrawableCompat.setTint(this.bix, i);
    }

    public void setTintList(ColorStateList colorStateList) {
        DrawableCompat.setTintList(this.bix, colorStateList);
    }

    public void setTintMode(Mode mode) {
        kotlin.jvm.internal.i.f(mode, "tintMode");
        DrawableCompat.setTintMode(this.bix, mode);
    }

    @TargetApi(21)
    public void getOutline(Outline outline) {
        this.bix.getOutline(outline);
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.bix;
        kotlin.jvm.internal.i.e(drawable, "delegate");
        return drawable.getIntrinsicWidth();
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.bix;
        kotlin.jvm.internal.i.e(drawable, "delegate");
        return drawable.getIntrinsicHeight();
    }
}
