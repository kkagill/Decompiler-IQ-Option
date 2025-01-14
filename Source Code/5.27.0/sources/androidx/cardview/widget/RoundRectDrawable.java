package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

@RequiresApi(21)
class RoundRectDrawable extends Drawable {
    private ColorStateList mBackground;
    private final RectF mBoundsF;
    private final Rect mBoundsI;
    private boolean mInsetForPadding = false;
    private boolean mInsetForRadius = true;
    private float mPadding;
    private final Paint mPaint;
    private float mRadius;
    private ColorStateList mTint;
    private PorterDuffColorFilter mTintFilter;
    private Mode mTintMode = Mode.SRC_IN;

    public int getOpacity() {
        return -3;
    }

    RoundRectDrawable(ColorStateList colorStateList, float f) {
        this.mRadius = f;
        this.mPaint = new Paint(5);
        setBackground(colorStateList);
        this.mBoundsF = new RectF();
        this.mBoundsI = new Rect();
    }

    private void setBackground(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.mBackground = colorStateList;
        this.mPaint.setColor(this.mBackground.getColorForState(getState(), this.mBackground.getDefaultColor()));
    }

    /* Access modifiers changed, original: 0000 */
    public void setPadding(float f, boolean z, boolean z2) {
        if (f != this.mPadding || this.mInsetForPadding != z || this.mInsetForRadius != z2) {
            this.mPadding = f;
            this.mInsetForPadding = z;
            this.mInsetForRadius = z2;
            updateBounds(null);
            invalidateSelf();
        }
    }

    /* Access modifiers changed, original: 0000 */
    public float getPadding() {
        return this.mPadding;
    }

    public void draw(Canvas canvas) {
        Object obj;
        Paint paint = this.mPaint;
        if (this.mTintFilter == null || paint.getColorFilter() != null) {
            obj = null;
        } else {
            paint.setColorFilter(this.mTintFilter);
            obj = 1;
        }
        RectF rectF = this.mBoundsF;
        float f = this.mRadius;
        canvas.drawRoundRect(rectF, f, f, paint);
        if (obj != null) {
            paint.setColorFilter(null);
        }
    }

    private void updateBounds(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.mBoundsF.set((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
        this.mBoundsI.set(rect);
        if (this.mInsetForPadding) {
            float calculateVerticalPadding = RoundRectDrawableWithShadow.calculateVerticalPadding(this.mPadding, this.mRadius, this.mInsetForRadius);
            this.mBoundsI.inset((int) Math.ceil((double) RoundRectDrawableWithShadow.calculateHorizontalPadding(this.mPadding, this.mRadius, this.mInsetForRadius)), (int) Math.ceil((double) calculateVerticalPadding));
            this.mBoundsF.set(this.mBoundsI);
        }
    }

    /* Access modifiers changed, original: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        updateBounds(rect);
    }

    public void getOutline(Outline outline) {
        outline.setRoundRect(this.mBoundsI, this.mRadius);
    }

    /* Access modifiers changed, original: 0000 */
    public void setRadius(float f) {
        if (f != this.mRadius) {
            this.mRadius = f;
            updateBounds(null);
            invalidateSelf();
        }
    }

    public void setAlpha(int i) {
        this.mPaint.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.mPaint.setColorFilter(colorFilter);
    }

    public float getRadius() {
        return this.mRadius;
    }

    public void setColor(@Nullable ColorStateList colorStateList) {
        setBackground(colorStateList);
        invalidateSelf();
    }

    public ColorStateList getColor() {
        return this.mBackground;
    }

    public void setTintList(ColorStateList colorStateList) {
        this.mTint = colorStateList;
        this.mTintFilter = createTintFilter(this.mTint, this.mTintMode);
        invalidateSelf();
    }

    public void setTintMode(Mode mode) {
        this.mTintMode = mode;
        this.mTintFilter = createTintFilter(this.mTint, this.mTintMode);
        invalidateSelf();
    }

    /* Access modifiers changed, original: protected */
    public boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.mBackground;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z = colorForState != this.mPaint.getColor();
        if (z) {
            this.mPaint.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.mTint;
        if (colorStateList2 != null) {
            Mode mode = this.mTintMode;
            if (mode != null) {
                this.mTintFilter = createTintFilter(colorStateList2, mode);
                return true;
            }
        }
        return z;
    }

    public boolean isStateful() {
        ColorStateList colorStateList = this.mTint;
        if (colorStateList == null || !colorStateList.isStateful()) {
            colorStateList = this.mBackground;
            if ((colorStateList == null || !colorStateList.isStateful()) && !super.isStateful()) {
                return false;
            }
        }
        return true;
    }

    private PorterDuffColorFilter createTintFilter(ColorStateList colorStateList, Mode mode) {
        return (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }
}
