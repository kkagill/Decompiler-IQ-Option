package com.jumio.commons.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Matrix.ScaleToFit;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;

public class ScaleableImageView extends View {
    private float borderRadius;
    private RectF drawableRect;
    private int imageHeight = 0;
    private Paint imagePaint;
    private int imageWidth = 0;
    private Matrix matrix;
    private BitmapShader shader;

    public ScaleableImageView(Context context) {
        super(context);
        init();
    }

    public ScaleableImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public ScaleableImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    private void init() {
        this.imagePaint = new Paint();
        this.imagePaint.setAntiAlias(true);
    }

    /* Access modifiers changed, original: protected */
    public void onMeasure(int i, int i2) {
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        int mode2 = MeasureSpec.getMode(i2);
        int size2 = MeasureSpec.getSize(i2);
        Object obj = null;
        Object obj2 = (mode == Integer.MIN_VALUE || mode == 0) ? 1 : null;
        if (mode2 == Integer.MIN_VALUE || mode2 == 0) {
            obj = 1;
        }
        if (obj2 != null) {
            mode = this.imageWidth;
            if (mode != 0 && size < mode) {
                i = MeasureSpec.makeMeasureSpec(mode, 1073741824);
            }
        }
        if (obj != null) {
            mode = this.imageHeight;
            if (mode != 0 && size2 < mode) {
                i2 = MeasureSpec.makeMeasureSpec(mode, 1073741824);
            }
        }
        super.onMeasure(i, i2);
    }

    /* Access modifiers changed, original: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        setScalingMatrix();
    }

    public void setImageBitmap(Bitmap bitmap) {
        setImageBitmap(bitmap, 0.0f);
    }

    public void setImageBitmap(Bitmap bitmap, float f) {
        this.imageWidth = bitmap.getWidth();
        this.imageHeight = bitmap.getHeight();
        this.borderRadius = f;
        setScalingMatrix();
        this.shader = new BitmapShader(bitmap, TileMode.CLAMP, TileMode.CLAMP);
        this.imagePaint.setShader(this.shader);
        requestLayout();
        invalidate();
    }

    private void setScalingMatrix() {
        this.matrix = new Matrix();
        this.drawableRect = new RectF(0.0f, 0.0f, (float) this.imageWidth, (float) this.imageHeight);
        this.matrix.setRectToRect(this.drawableRect, new RectF(0.0f, 0.0f, (float) getWidth(), (float) getHeight()), ScaleToFit.CENTER);
    }

    public void onDraw(Canvas canvas) {
        canvas.save();
        canvas.concat(this.matrix);
        RectF rectF = this.drawableRect;
        float f = this.borderRadius;
        canvas.drawRoundRect(rectF, f, f, this.imagePaint);
        canvas.restore();
    }
}
