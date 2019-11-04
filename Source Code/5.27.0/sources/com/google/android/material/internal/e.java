package com.google.android.material.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.RestrictTo.Scope;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.view.GravityCompat;
import com.google.android.material.a.k;

@RestrictTo({Scope.LIBRARY_GROUP})
/* compiled from: ForegroundLinearLayout */
public class e extends LinearLayoutCompat {
    private final Rect KA;
    protected boolean KB;
    boolean KC;
    private Drawable Kz;
    private int foregroundGravity;
    private final Rect overlayBounds;

    public e(Context context) {
        this(context, null);
    }

    public e(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public e(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.KA = new Rect();
        this.overlayBounds = new Rect();
        this.foregroundGravity = 119;
        this.KB = true;
        this.KC = false;
        TypedArray a = g.a(context, attributeSet, k.ForegroundLinearLayout, i, 0, new int[0]);
        this.foregroundGravity = a.getInt(k.ForegroundLinearLayout_android_foregroundGravity, this.foregroundGravity);
        Drawable drawable = a.getDrawable(k.ForegroundLinearLayout_android_foreground);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.KB = a.getBoolean(k.ForegroundLinearLayout_foregroundInsidePadding, true);
        a.recycle();
    }

    public int getForegroundGravity() {
        return this.foregroundGravity;
    }

    public void setForegroundGravity(int i) {
        if (this.foregroundGravity != i) {
            if ((GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK & i) == 0) {
                i |= GravityCompat.START;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.foregroundGravity = i;
            if (this.foregroundGravity == 119 && this.Kz != null) {
                this.Kz.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    /* Access modifiers changed, original: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.Kz;
    }

    @RequiresApi(11)
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.Kz;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* Access modifiers changed, original: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.Kz;
        if (drawable != null && drawable.isStateful()) {
            this.Kz.setState(getDrawableState());
        }
    }

    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.Kz;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.Kz);
            }
            this.Kz = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.foregroundGravity == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    public Drawable getForeground() {
        return this.Kz;
    }

    /* Access modifiers changed, original: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.KC = z | this.KC;
    }

    /* Access modifiers changed, original: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.KC = true;
    }

    public void draw(@NonNull Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.Kz;
        if (drawable != null) {
            if (this.KC) {
                this.KC = false;
                Rect rect = this.KA;
                Rect rect2 = this.overlayBounds;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.KB) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.foregroundGravity, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @RequiresApi(21)
    @TargetApi(21)
    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.Kz;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }
}
