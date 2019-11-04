package com.google.android.material.internal;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import androidx.annotation.ColorInt;
import androidx.annotation.Dimension;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.RestrictTo.Scope;
import androidx.core.graphics.ColorUtils;

@RestrictTo({Scope.LIBRARY_GROUP})
/* compiled from: CircularBorderDrawable */
public class a extends Drawable {
    final a Jp;
    @Dimension
    float Jq;
    @ColorInt
    private int Jr;
    @ColorInt
    private int Js;
    @ColorInt
    private int Jt;
    @ColorInt
    private int Ju;
    private ColorStateList Jv;
    @ColorInt
    private int Jw;
    private boolean Jx;
    final Paint fh;
    final RectF jw;
    final Rect rect;
    @FloatRange(from = 0.0d, to = 360.0d)
    private float rotation;

    /* compiled from: CircularBorderDrawable */
    private class a extends ConstantState {
        final /* synthetic */ a Jy;

        public int getChangingConfigurations() {
            return 0;
        }

        @NonNull
        public Drawable newDrawable() {
            return this.Jy;
        }
    }

    @Nullable
    public ConstantState getConstantState() {
        return this.Jp;
    }

    public void draw(Canvas canvas) {
        if (this.Jx) {
            this.fh.setShader(nM());
            this.Jx = false;
        }
        float strokeWidth = this.fh.getStrokeWidth() / 2.0f;
        RectF rectF = this.jw;
        copyBounds(this.rect);
        rectF.set(this.rect);
        rectF.left += strokeWidth;
        rectF.top += strokeWidth;
        rectF.right -= strokeWidth;
        rectF.bottom -= strokeWidth;
        canvas.save();
        canvas.rotate(this.rotation, rectF.centerX(), rectF.centerY());
        canvas.drawOval(rectF, this.fh);
        canvas.restore();
    }

    public boolean getPadding(Rect rect) {
        int round = Math.round(this.Jq);
        rect.set(round, round, round, round);
        return true;
    }

    public void setAlpha(@IntRange(from = 0, to = 255) int i) {
        this.fh.setAlpha(i);
        invalidateSelf();
    }

    public void a(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.Jw = colorStateList.getColorForState(getState(), this.Jw);
        }
        this.Jv = colorStateList;
        this.Jx = true;
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.fh.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public int getOpacity() {
        return this.Jq > 0.0f ? -3 : -2;
    }

    public final void setRotation(float f) {
        if (f != this.rotation) {
            this.rotation = f;
            invalidateSelf();
        }
    }

    /* Access modifiers changed, original: protected */
    public void onBoundsChange(Rect rect) {
        this.Jx = true;
    }

    public boolean isStateful() {
        ColorStateList colorStateList = this.Jv;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    /* Access modifiers changed, original: protected */
    public boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.Jv;
        if (colorStateList != null) {
            int colorForState = colorStateList.getColorForState(iArr, this.Jw);
            if (colorForState != this.Jw) {
                this.Jx = true;
                this.Jw = colorForState;
            }
        }
        if (this.Jx) {
            invalidateSelf();
        }
        return this.Jx;
    }

    private Shader nM() {
        Rect rect = this.rect;
        copyBounds(rect);
        float height = this.Jq / ((float) rect.height());
        return new LinearGradient(0.0f, (float) rect.top, 0.0f, (float) rect.bottom, new int[]{ColorUtils.compositeColors(this.Jr, this.Jw), ColorUtils.compositeColors(this.Js, this.Jw), ColorUtils.compositeColors(ColorUtils.setAlphaComponent(this.Js, 0), this.Jw), ColorUtils.compositeColors(ColorUtils.setAlphaComponent(this.Ju, 0), this.Jw), ColorUtils.compositeColors(this.Ju, this.Jw), ColorUtils.compositeColors(this.Jt, this.Jw)}, new float[]{0.0f, height, 0.5f, 0.5f, 1.0f - height, 1.0f}, TileMode.CLAMP);
    }
}
