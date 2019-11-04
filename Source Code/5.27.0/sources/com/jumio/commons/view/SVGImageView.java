package com.jumio.commons.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Matrix.ScaleToFit;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import androidx.core.view.ViewCompat;
import java.util.Stack;

public class SVGImageView extends View {
    private Paint mPaint;
    private Matrix matrix;
    private RectF maxBounds;
    int maxHeight;
    int maxWidth;
    private int paintColor = ViewCompat.MEASURED_STATE_MASK;
    private Stack<Path> pathStack;
    private ScaleToFit scaleToFitMatrix = ScaleToFit.CENTER;
    private RectF screenCanvas;

    public SVGImageView(Context context) {
        super(context);
        init();
    }

    public SVGImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    private void init() {
        this.pathStack = new Stack();
        this.matrix = new Matrix();
        this.screenCanvas = new RectF();
        this.maxWidth = 0;
        this.maxHeight = 0;
        this.mPaint = new Paint(1);
        this.mPaint.setStyle(Style.FILL);
        this.mPaint.setColor(this.paintColor);
        setLayerType(1, this.mPaint);
    }

    public void setPathStringStack(Stack<String> stack) {
        this.pathStack.clear();
        for (int i = 0; i < stack.size(); i++) {
            this.pathStack.add(SVGParser.createPathFromSvgString((String) stack.get(i)));
        }
        this.maxBounds = getMaxBoundsFromPaths();
        invalidate();
    }

    public void setPathString(String str) {
        this.pathStack.clear();
        this.pathStack.add(SVGParser.createPathFromSvgString(str));
        this.maxBounds = getMaxBoundsFromPaths();
        invalidate();
    }

    public void setPaintColor(int i) {
        this.mPaint.setColor(i);
        invalidate();
    }

    public int getPaintColor() {
        return this.mPaint.getColor();
    }

    public void setScaleMatrixType(ScaleToFit scaleToFit) {
        this.scaleToFitMatrix = scaleToFit;
        invalidate();
    }

    public ScaleToFit getScaleType() {
        return this.scaleToFitMatrix;
    }

    public void setMaxWidth(int i) {
        this.maxWidth = i;
    }

    public void setMaxHeight(int i) {
        this.maxHeight = i;
    }

    /* Access modifiers changed, original: protected */
    public void onMeasure(int i, int i2) {
        int mode = MeasureSpec.getMode(i);
        i = MeasureSpec.getSize(i);
        int mode2 = MeasureSpec.getMode(i2);
        i2 = MeasureSpec.getSize(i2);
        if (mode != 1073741824) {
            if (mode == Integer.MIN_VALUE) {
                mode = this.maxWidth;
                if (mode != 0) {
                    i = Math.min(mode, i);
                }
            } else {
                i = this.maxWidth;
            }
        }
        if (mode2 != 1073741824) {
            if (mode2 == Integer.MIN_VALUE) {
                mode = this.maxHeight;
                if (mode != 0) {
                    i2 = Math.min(mode, i2);
                }
            } else {
                i2 = this.maxHeight;
            }
        }
        setMeasuredDimension(i, i2);
        this.screenCanvas.left = (float) getPaddingLeft();
        this.screenCanvas.top = (float) getPaddingTop();
        this.screenCanvas.right = (float) (getMeasuredWidth() - getPaddingRight());
        this.screenCanvas.bottom = (float) (getMeasuredHeight() - getPaddingBottom());
        setCanvasBounds(this.screenCanvas);
    }

    /* Access modifiers changed, original: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        drawToCanvas(canvas);
    }

    public void setCanvasBounds(RectF rectF) {
        if (rectF != null) {
            this.screenCanvas.set(rectF);
        }
        RectF rectF2 = this.maxBounds;
        if (rectF2 != null && rectF != null) {
            this.matrix.setRectToRect(rectF2, rectF, this.scaleToFitMatrix);
        }
    }

    public void drawToCanvas(Canvas canvas) {
        for (int i = 0; i < this.pathStack.size(); i++) {
            Path path = new Path();
            ((Path) this.pathStack.get(i)).transform(this.matrix, path);
            canvas.drawPath(path, this.mPaint);
        }
    }

    private RectF getMaxBoundsFromPaths() {
        RectF rectF = new RectF();
        RectF rectF2 = new RectF();
        int i = 1;
        ((Path) this.pathStack.get(0)).computeBounds(rectF, true);
        while (i < this.pathStack.size()) {
            ((Path) this.pathStack.get(i)).computeBounds(rectF2, false);
            rectF = mergeRectsToMaxBoundRect(rectF, rectF2);
            i++;
        }
        return rectF;
    }

    private RectF mergeRectsToMaxBoundRect(RectF rectF, RectF rectF2) {
        if (rectF2.left < rectF.left) {
            rectF.left = rectF2.left;
        }
        if (rectF2.right > rectF.right) {
            rectF.right = rectF2.right;
        }
        if (rectF2.top < rectF.top) {
            rectF.top = rectF2.top;
        }
        if (rectF2.bottom > rectF.bottom) {
            rectF.bottom = rectF2.bottom;
        }
        return rectF;
    }
}
