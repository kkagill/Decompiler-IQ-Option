package com.jumio.sdk.gui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RadialGradient;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.net.Uri;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.animation.Animation.AnimationListener;
import androidx.annotation.ColorInt;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.view.ViewCompat;

public class MaterialProgressBar extends AppCompatImageView {
    private static final int DEFAULT_CIRCLE_BG_LIGHT = -328966;
    private static final int DEFAULT_CIRCLE_DIAMETER = 56;
    public static final int DEFAULT_TEXT_SIZE = 9;
    private static final int FILL_SHADOW_COLOR = 1023410176;
    private static final int KEY_SHADOW_COLOR = 503316480;
    private static final int SHADOW_ELEVATION = 4;
    private static final float SHADOW_RADIUS = 3.5f;
    private static final int STROKE_WIDTH_LARGE = 3;
    private static final float X_OFFSET = 0.0f;
    private static final float Y_OFFSET = 1.75f;
    private boolean animationOff = true;
    private int mArrowHeight;
    private int mArrowWidth;
    private int mBackGroundColor;
    private ShapeDrawable mBgCircle;
    private boolean mCircleBackgroundEnabled;
    private int[] mColors = new int[]{ViewCompat.MEASURED_STATE_MASK};
    private int mDiameter;
    private boolean mIfDrawText;
    private int mInnerRadius;
    private AnimationListener mListener;
    private int mMax;
    private int mProgress;
    private int mProgressColor;
    private MaterialProgressDrawable mProgressDrawable;
    private int mProgressStokeWidth;
    private int mShadowRadius;
    private boolean mShowArrow;
    private int mTextColor;
    private Paint mTextPaint;
    private int mTextSize;

    private class OvalShadow extends OvalShape {
        private int mCircleDiameter;
        private RadialGradient mRadialGradient;
        private Paint mShadowPaint = new Paint();
        private int mShadowRadius;

        public OvalShadow(int i, int i2) {
            this.mShadowRadius = i;
            this.mCircleDiameter = i2;
            i = this.mCircleDiameter;
            this.mRadialGradient = new RadialGradient(((float) i) / 2.0f, ((float) i) / 2.0f, (float) this.mShadowRadius, new int[]{MaterialProgressBar.FILL_SHADOW_COLOR, 0}, null, TileMode.CLAMP);
            this.mShadowPaint.setShader(this.mRadialGradient);
        }

        public void draw(Canvas canvas, Paint paint) {
            float width = ((float) MaterialProgressBar.this.getWidth()) / 2.0f;
            float height = ((float) MaterialProgressBar.this.getHeight()) / 2.0f;
            canvas.drawCircle(width, height, (((float) this.mCircleDiameter) / 2.0f) + ((float) this.mShadowRadius), this.mShadowPaint);
            canvas.drawCircle(width, height, ((float) this.mCircleDiameter) / 2.0f, paint);
        }
    }

    public final void setImageDrawable(Drawable drawable) {
    }

    public final void setImageResource(int i) {
    }

    public MaterialProgressBar(Context context, boolean z) {
        super(context);
        init(z);
    }

    public MaterialProgressBar(Context context, AttributeSet attributeSet, boolean z) {
        super(context, attributeSet);
        init(z);
    }

    public MaterialProgressBar(Context context, AttributeSet attributeSet, int i, boolean z) {
        super(context, attributeSet, i);
        init(z);
    }

    private void init(boolean z) {
        float f = getContext().getResources().getDisplayMetrics().density;
        this.animationOff = z;
        this.mBackGroundColor = DEFAULT_CIRCLE_BG_LIGHT;
        this.mProgressColor = DEFAULT_CIRCLE_BG_LIGHT;
        this.mInnerRadius = -1;
        this.mProgressStokeWidth = (int) (3.0f * f);
        this.mArrowWidth = -1;
        this.mArrowHeight = -1;
        this.mTextSize = (int) (f * 9.0f);
        this.mTextColor = ViewCompat.MEASURED_STATE_MASK;
        this.mShowArrow = false;
        this.mCircleBackgroundEnabled = false;
        this.mProgress = 0;
        this.mMax = 100;
        this.mIfDrawText = false;
        this.mTextPaint = new Paint();
        this.mTextPaint.setStyle(Style.FILL);
        this.mTextPaint.setColor(this.mTextColor);
        this.mTextPaint.setTextSize((float) this.mTextSize);
        this.mTextPaint.setAntiAlias(true);
        this.mProgressDrawable = new MaterialProgressDrawable(getContext(), this);
        super.setImageDrawable(this.mProgressDrawable);
    }

    private boolean elevationSupported() {
        return VERSION.SDK_INT >= 21;
    }

    /* Access modifiers changed, original: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    /* Access modifiers changed, original: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        float f = getContext().getResources().getDisplayMetrics().density;
        this.mDiameter = Math.min(getMeasuredWidth(), getMeasuredHeight());
        if (this.mDiameter <= 0) {
            this.mDiameter = ((int) f) * 56;
        }
        if (z) {
            double d;
            this.mProgressDrawable.setBackgroundColor(this.mBackGroundColor);
            this.mProgressDrawable.setColorSchemeColors(this.mColors);
            MaterialProgressDrawable materialProgressDrawable = this.mProgressDrawable;
            int i5 = this.mDiameter;
            double d2 = (double) i5;
            double d3 = (double) i5;
            int i6 = this.mInnerRadius;
            if (i6 <= 0) {
                d = (double) (i5 - (this.mProgressStokeWidth * 2));
                Double.isNaN(d);
                d /= 2.0d;
            } else {
                d = (double) i6;
            }
            double d4 = d;
            i5 = this.mProgressStokeWidth;
            double d5 = (double) i5;
            i6 = this.mArrowWidth;
            float f2 = i6 < 0 ? (float) (i5 * 4) : (float) i6;
            i5 = this.mArrowHeight;
            if (i5 < 0) {
                i5 = this.mProgressStokeWidth * 2;
            }
            materialProgressDrawable.setSizeParameters(d2, d3, d4, d5, f2, (float) i5);
            if (isShowArrow()) {
                this.mProgressDrawable.setArrowScale(1.0f);
                this.mProgressDrawable.showArrow(true);
            }
            super.setImageDrawable(null);
            super.setImageDrawable(this.mProgressDrawable);
            this.mProgressDrawable.setAlpha(255);
            if (!this.animationOff) {
                this.mProgressDrawable.start();
            }
        }
    }

    /* Access modifiers changed, original: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.mIfDrawText) {
            String format = String.format("%s%%", new Object[]{Integer.valueOf(this.mProgress)});
            canvas.drawText(format, (float) ((getWidth() / 2) - ((format.length() * this.mTextSize) / 4)), (float) ((getHeight() / 2) + (this.mTextSize / 4)), this.mTextPaint);
        }
    }

    public boolean isShowArrow() {
        return this.mShowArrow;
    }

    public void setShowArrow(boolean z) {
        this.mShowArrow = z;
    }

    public final void setImageURI(Uri uri) {
        super.setImageURI(uri);
    }

    public void setAnimationListener(AnimationListener animationListener) {
        this.mListener = animationListener;
    }

    public void onAnimationStart() {
        super.onAnimationStart();
        AnimationListener animationListener = this.mListener;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    public void onAnimationEnd() {
        super.onAnimationEnd();
        AnimationListener animationListener = this.mListener;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    public void setColorSchemeResources(int... iArr) {
        Resources resources = getResources();
        int[] iArr2 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = resources.getColor(iArr[i]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setColorSchemeColors(int... iArr) {
        this.mColors = iArr;
        MaterialProgressDrawable materialProgressDrawable = this.mProgressDrawable;
        if (materialProgressDrawable != null) {
            materialProgressDrawable.setColorSchemeColors(iArr);
        }
    }

    public void setBackgroundColor(@ColorInt int i) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i);
        }
    }

    public boolean isShowProgressText() {
        return this.mIfDrawText;
    }

    public void setShowProgressText(boolean z) {
        this.mIfDrawText = z;
    }

    public int getMax() {
        return this.mMax;
    }

    public void setMax(int i) {
        this.mMax = i;
    }

    public int getProgress() {
        return this.mProgress;
    }

    public void setProgress(int i) {
        if (getMax() > 0) {
            this.mProgress = i;
        }
    }

    public boolean circleBackgroundEnabled() {
        return this.mCircleBackgroundEnabled;
    }

    public void setCircleBackgroundEnabled(boolean z) {
        this.mCircleBackgroundEnabled = z;
    }

    public void setProgressStokeWidth(int i) {
        this.mProgressStokeWidth = i;
    }

    public int getVisibility() {
        return super.getVisibility();
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        MaterialProgressDrawable materialProgressDrawable = this.mProgressDrawable;
        if (materialProgressDrawable != null && !this.animationOff) {
            if (i == 0) {
                materialProgressDrawable.start();
            } else {
                materialProgressDrawable.stop();
            }
            this.mProgressDrawable.setVisible(i == 0, false);
        }
    }

    /* Access modifiers changed, original: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialProgressDrawable materialProgressDrawable = this.mProgressDrawable;
        if (materialProgressDrawable != null) {
            materialProgressDrawable.stop();
            this.mProgressDrawable.setVisible(getVisibility() == 0, false);
        }
    }

    /* Access modifiers changed, original: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        MaterialProgressDrawable materialProgressDrawable = this.mProgressDrawable;
        if (materialProgressDrawable != null) {
            materialProgressDrawable.stop();
            this.mProgressDrawable.setVisible(false, false);
        }
    }
}
