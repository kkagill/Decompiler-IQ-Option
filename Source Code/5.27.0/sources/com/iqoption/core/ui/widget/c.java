package com.iqoption.core.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.Transformation;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import com.iqoption.core.graphics.animation.j;
import java.util.ArrayList;

/* compiled from: MaterialProgressDrawable */
public class c extends Drawable implements Animatable {
    private static final Interpolator LINEAR_INTERPOLATOR = new LinearInterpolator();
    private static final Interpolator MATERIAL_INTERPOLATOR = j.XM();
    private final int[] COLORS;
    private final a bLn;
    private View bLo;
    private Animation mAnimation;
    private final ArrayList<Animation> mAnimators = new ArrayList();
    private final Callback mCallback = new Callback() {
        public void invalidateDrawable(Drawable drawable) {
            c.this.invalidateSelf();
        }

        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            c.this.scheduleSelf(runnable, j);
        }

        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            c.this.unscheduleSelf(runnable);
        }
    };
    boolean mFinishing;
    private double mHeight;
    private Resources mResources;
    private float mRotation;
    private float mRotationCount;
    private double mWidth;

    /* compiled from: MaterialProgressDrawable */
    private static class a {
        private int bLr;
        private int bLs;
        private int mAlpha;
        private Path mArrow;
        private int mArrowHeight;
        private final Paint mArrowPaint = new Paint();
        private float mArrowScale;
        private int mArrowWidth;
        private int mBackgroundColor;
        private final Callback mCallback;
        private final Paint mCirclePaint = new Paint(1);
        private int mColorIndex;
        private int[] mColors;
        private int mCurrentColor;
        private float mEndTrim = 0.0f;
        private final Paint mPaint = new Paint();
        private double mRingCenterRadius;
        private float mRotation = 0.0f;
        private boolean mShowArrow;
        private float mStartTrim = 0.0f;
        private float mStartingEndTrim;
        private float mStartingRotation;
        private float mStartingStartTrim;
        private float mStrokeInset = 2.5f;
        private float mStrokeWidth = 5.0f;
        private final RectF mTempBounds = new RectF();

        public a(Callback callback) {
            this.mCallback = callback;
            this.mPaint.setStrokeCap(Cap.SQUARE);
            this.mPaint.setAntiAlias(true);
            this.mPaint.setStyle(Style.STROKE);
            this.mArrowPaint.setStyle(Style.FILL);
            this.mArrowPaint.setAntiAlias(true);
        }

        public void setArrowDimensions(float f, float f2) {
            this.mArrowWidth = (int) f;
            this.mArrowHeight = (int) f2;
        }

        public void draw(Canvas canvas, Rect rect) {
            RectF rectF = this.mTempBounds;
            rectF.set(rect);
            float f = this.mStrokeInset;
            rectF.inset(f, f);
            f = this.mStartTrim;
            float f2 = this.mRotation;
            float f3 = (f + f2) * 360.0f;
            float f4 = ((this.mEndTrim + f2) * 360.0f) - f3;
            this.mPaint.setColor(this.mCurrentColor);
            this.mPaint.setAlpha(this.mAlpha);
            canvas.drawArc(rectF, f3, f4, false, this.mPaint);
            drawTriangle(canvas, f3, f4, rect);
            if (this.bLr < 255) {
                this.mCirclePaint.setColor(this.mBackgroundColor);
                this.mCirclePaint.setAlpha(this.bLr);
                canvas.drawCircle(rect.exactCenterX(), rect.exactCenterY(), (float) (rect.width() / 2), this.mCirclePaint);
            }
        }

        private void drawTriangle(Canvas canvas, float f, float f2, Rect rect) {
            if (this.mShowArrow) {
                Path path = this.mArrow;
                if (path == null) {
                    this.mArrow = new Path();
                    this.mArrow.setFillType(FillType.EVEN_ODD);
                } else {
                    path.reset();
                }
                float f3 = ((float) (((int) this.mStrokeInset) / 2)) * this.mArrowScale;
                double cos = this.mRingCenterRadius * Math.cos(0.0d);
                double exactCenterX = (double) rect.exactCenterX();
                Double.isNaN(exactCenterX);
                float f4 = (float) (cos + exactCenterX);
                exactCenterX = this.mRingCenterRadius * Math.sin(0.0d);
                double exactCenterY = (double) rect.exactCenterY();
                Double.isNaN(exactCenterY);
                float f5 = (float) (exactCenterX + exactCenterY);
                this.mArrow.moveTo(0.0f, 0.0f);
                this.mArrow.lineTo(((float) this.mArrowWidth) * this.mArrowScale, 0.0f);
                Path path2 = this.mArrow;
                float f6 = (float) this.mArrowWidth;
                float f7 = this.mArrowScale;
                path2.lineTo((f6 * f7) / 2.0f, ((float) this.mArrowHeight) * f7);
                this.mArrow.offset(f4 - f3, f5);
                this.mArrow.close();
                this.mArrowPaint.setColor(this.mCurrentColor);
                canvas.rotate((f + f2) - 5.0f, rect.exactCenterX(), rect.exactCenterY());
                canvas.drawPath(this.mArrow, this.mArrowPaint);
            }
        }

        public void setColors(@NonNull int[] iArr) {
            this.mColors = iArr;
            setColorIndex(0);
        }

        public void setColor(int i) {
            this.mCurrentColor = i;
        }

        public void setColorIndex(int i) {
            this.mColorIndex = i;
            this.mCurrentColor = this.mColors[this.mColorIndex];
        }

        public int getNextColor() {
            return this.mColors[getNextColorIndex()];
        }

        private int getNextColorIndex() {
            return (this.mColorIndex + 1) % this.mColors.length;
        }

        public void goToNextColor() {
            setColorIndex(getNextColorIndex());
        }

        public void setColorFilter(ColorFilter colorFilter) {
            this.mPaint.setColorFilter(colorFilter);
            invalidateSelf();
        }

        public void setAlpha(int i) {
            this.mAlpha = i;
        }

        public void fi(int i) {
            this.bLs = i;
            this.mAlpha = i;
        }

        public int amh() {
            return this.bLs;
        }

        public void setStrokeWidth(float f) {
            this.mStrokeWidth = f;
            this.mPaint.setStrokeWidth(f);
            invalidateSelf();
        }

        public float getStrokeWidth() {
            return this.mStrokeWidth;
        }

        public void setStartTrim(float f) {
            this.mStartTrim = f;
            invalidateSelf();
        }

        public float getStartTrim() {
            return this.mStartTrim;
        }

        public float getStartingStartTrim() {
            return this.mStartingStartTrim;
        }

        public float getStartingEndTrim() {
            return this.mStartingEndTrim;
        }

        public int getStartingColor() {
            return this.mColors[this.mColorIndex];
        }

        public void setEndTrim(float f) {
            this.mEndTrim = f;
            invalidateSelf();
        }

        public float getEndTrim() {
            return this.mEndTrim;
        }

        public void setRotation(float f) {
            this.mRotation = f;
            invalidateSelf();
        }

        public void setInsets(int i, int i2) {
            double ceil;
            float min = (float) Math.min(i, i2);
            double d = this.mRingCenterRadius;
            if (d <= 0.0d || min < 0.0f) {
                ceil = Math.ceil((double) (this.mStrokeWidth / 2.0f));
            } else {
                ceil = (double) (min / 2.0f);
                Double.isNaN(ceil);
                ceil -= d;
            }
            this.mStrokeInset = (float) ceil;
        }

        public void setCenterRadius(double d) {
            this.mRingCenterRadius = d;
        }

        public double getCenterRadius() {
            return this.mRingCenterRadius;
        }

        public void setShowArrow(boolean z) {
            if (this.mShowArrow != z) {
                this.mShowArrow = z;
                invalidateSelf();
            }
        }

        public float getStartingRotation() {
            return this.mStartingRotation;
        }

        public void storeOriginals() {
            this.mStartingStartTrim = this.mStartTrim;
            this.mStartingEndTrim = this.mEndTrim;
            this.mStartingRotation = this.mRotation;
        }

        public void resetOriginals() {
            this.mStartingStartTrim = 0.0f;
            this.mStartingEndTrim = 0.0f;
            this.mStartingRotation = 0.0f;
            setStartTrim(0.0f);
            setEndTrim(0.0f);
            setRotation(0.0f);
        }

        private void invalidateSelf() {
            this.mCallback.invalidateDrawable(null);
        }
    }

    public int getOpacity() {
        return -3;
    }

    public c(Context context, View view) {
        int[] iArr = new int[1];
        int i = 0;
        iArr[0] = com.iqoption.core.i.c.orange;
        this.COLORS = iArr;
        this.bLo = view;
        this.mResources = context.getResources();
        this.bLn = new a(this.mCallback);
        int[] iArr2 = new int[this.COLORS.length];
        while (true) {
            iArr = this.COLORS;
            if (i < iArr.length) {
                iArr2[i] = ContextCompat.getColor(context, iArr[i]);
                i++;
            } else {
                this.bLn.setColors(iArr2);
                setAlpha(255);
                updateSizes(1);
                setupAnimators();
                return;
            }
        }
    }

    private void setSizeParameters(double d, double d2, double d3, double d4, float f, float f2) {
        a aVar = this.bLn;
        float f3 = this.mResources.getDisplayMetrics().density;
        double d5 = (double) f3;
        Double.isNaN(d5);
        this.mWidth = d * d5;
        Double.isNaN(d5);
        this.mHeight = d2 * d5;
        aVar.setStrokeWidth(((float) d4) * f3);
        Double.isNaN(d5);
        aVar.setCenterRadius(d3 * d5);
        aVar.setColorIndex(0);
        aVar.setArrowDimensions(f * f3, f2 * f3);
        aVar.setInsets((int) this.mWidth, (int) this.mHeight);
    }

    public void updateSizes(int i) {
        if (i == 0) {
            setSizeParameters(56.0d, 56.0d, 12.5d, 3.0d, 12.0f, 6.0f);
        } else {
            setSizeParameters(40.0d, 40.0d, 8.75d, 2.5d, 10.0f, 5.0f);
        }
    }

    public int getIntrinsicHeight() {
        return (int) this.mHeight;
    }

    public int getIntrinsicWidth() {
        return (int) this.mWidth;
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int save = canvas.save();
        canvas.rotate(this.mRotation, bounds.exactCenterX(), bounds.exactCenterY());
        this.bLn.draw(canvas, bounds);
        canvas.restoreToCount(save);
    }

    public void setAlpha(int i) {
        this.bLn.fi(i);
    }

    public int getAlpha() {
        return this.bLn.amh();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.bLn.setColorFilter(colorFilter);
    }

    /* Access modifiers changed, original: 0000 */
    public void setRotation(float f) {
        this.mRotation = f;
        invalidateSelf();
    }

    public boolean isRunning() {
        ArrayList arrayList = this.mAnimators;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Animation animation = (Animation) arrayList.get(i);
            if (animation.hasStarted() && !animation.hasEnded()) {
                return true;
            }
        }
        return false;
    }

    public void start() {
        this.mAnimation.reset();
        this.bLn.storeOriginals();
        if (this.bLn.getEndTrim() != this.bLn.getStartTrim()) {
            this.mFinishing = true;
            this.mAnimation.setDuration(666);
            this.bLo.startAnimation(this.mAnimation);
            return;
        }
        this.bLn.setColorIndex(0);
        this.bLn.resetOriginals();
        this.mAnimation.setDuration(1332);
        this.bLo.startAnimation(this.mAnimation);
    }

    public void stop() {
        this.bLo.clearAnimation();
        setRotation(0.0f);
        this.bLn.setShowArrow(false);
        this.bLn.setColorIndex(0);
        this.bLn.resetOriginals();
    }

    private float a(a aVar) {
        double strokeWidth = (double) aVar.getStrokeWidth();
        double centerRadius = aVar.getCenterRadius() * 6.283185307179586d;
        Double.isNaN(strokeWidth);
        return (float) Math.toRadians(strokeWidth / centerRadius);
    }

    private int evaluateColorChange(float f, int i, int i2) {
        i = Integer.valueOf(i).intValue();
        int i3 = (i >> 24) & 255;
        int i4 = (i >> 16) & 255;
        int i5 = (i >> 8) & 255;
        i &= 255;
        i2 = Integer.valueOf(i2).intValue();
        return ((((i3 + ((int) (((float) (((i2 >> 24) & 255) - i3)) * f))) << 24) | ((i4 + ((int) (((float) (((i2 >> 16) & 255) - i4)) * f))) << 16)) | ((i5 + ((int) (((float) (((i2 >> 8) & 255) - i5)) * f))) << 8)) | (i + ((int) (f * ((float) ((i2 & 255) - i)))));
    }

    private void a(float f, a aVar) {
        if (f > 0.75f) {
            aVar.setColor(evaluateColorChange((f - 0.75f) / 0.25f, aVar.getStartingColor(), aVar.getNextColor()));
        }
    }

    private void b(float f, a aVar) {
        if (aVar.amh() < 255) {
            aVar.setAlpha((int) (((float) aVar.amh()) * f));
        }
    }

    private void c(float f, a aVar) {
        a(f, aVar);
        b(f, aVar);
        float floor = (float) (Math.floor((double) (aVar.getStartingRotation() / 0.8f)) + 1.0d);
        aVar.setStartTrim(aVar.getStartingStartTrim() + (((aVar.getStartingEndTrim() - a(aVar)) - aVar.getStartingStartTrim()) * f));
        aVar.setEndTrim(aVar.getStartingEndTrim());
        aVar.setRotation(aVar.getStartingRotation() + ((floor - aVar.getStartingRotation()) * f));
    }

    private void setupAnimators() {
        final a aVar = this.bLn;
        AnonymousClass1 anonymousClass1 = new Animation() {
            public void applyTransformation(float f, Transformation transformation) {
                if (c.this.mFinishing) {
                    c.this.c(f, aVar);
                    return;
                }
                float a = c.this.a(aVar);
                float startingEndTrim = aVar.getStartingEndTrim();
                float startingStartTrim = aVar.getStartingStartTrim();
                float startingRotation = aVar.getStartingRotation();
                c.this.a(f, aVar);
                c.this.b(f, aVar);
                if (f <= 0.5f) {
                    aVar.setStartTrim(startingStartTrim + ((0.8f - a) * c.MATERIAL_INTERPOLATOR.getInterpolation(f / 0.5f)));
                }
                if (f > 0.5f) {
                    aVar.setEndTrim(startingEndTrim + ((0.8f - a) * c.MATERIAL_INTERPOLATOR.getInterpolation((f - 0.5f) / 0.5f)));
                }
                aVar.setRotation(startingRotation + (0.25f * f));
                c.this.setRotation((f * 216.0f) + ((c.this.mRotationCount / 5.0f) * 1080.0f));
            }
        };
        anonymousClass1.setRepeatCount(-1);
        anonymousClass1.setRepeatMode(1);
        anonymousClass1.setInterpolator(LINEAR_INTERPOLATOR);
        anonymousClass1.setAnimationListener(new AnimationListener() {
            public void onAnimationEnd(Animation animation) {
            }

            public void onAnimationStart(Animation animation) {
                c.this.mRotationCount = 0.0f;
            }

            public void onAnimationRepeat(Animation animation) {
                aVar.storeOriginals();
                aVar.goToNextColor();
                a aVar = aVar;
                aVar.setStartTrim(aVar.getEndTrim());
                if (c.this.mFinishing) {
                    c.this.mFinishing = false;
                    animation.setDuration(1332);
                    aVar.setShowArrow(false);
                    return;
                }
                c cVar = c.this;
                cVar.mRotationCount = (cVar.mRotationCount + 1.0f) % 5.0f;
            }
        });
        this.mAnimation = anonymousClass1;
    }
}
