package com.iqoption.core.ui.widget.rounded;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.iqoption.core.i.m;

public class RoundedImageView extends AppCompatImageView {
    private float bPA;
    private float bPB;
    private float bPC;
    private float bPy;
    private float bPz;
    private Paint fh;
    private int scaleType;

    public RoundedImageView(Context context) {
        this(context, null);
    }

    public RoundedImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RoundedImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context, attributeSet);
    }

    private void init(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m.RoundedImageView);
            this.scaleType = obtainStyledAttributes.getInt(m.RoundedImageView_scale, 1);
            this.bPy = (float) obtainStyledAttributes.getDimensionPixelSize(m.RoundedImageView_corners, -1);
            this.bPz = (float) obtainStyledAttributes.getDimensionPixelSize(m.RoundedImageView_topLeftCorner, -1);
            this.bPA = (float) obtainStyledAttributes.getDimensionPixelSize(m.RoundedImageView_topRightCorner, -1);
            this.bPB = (float) obtainStyledAttributes.getDimensionPixelSize(m.RoundedImageView_bottomLeftCorner, -1);
            this.bPC = (float) obtainStyledAttributes.getDimensionPixelSize(m.RoundedImageView_bottomRightCorner, -1);
            obtainStyledAttributes.recycle();
        }
        this.bPy = b(this.bPy, this.bPz, this.bPA, this.bPB, this.bPC);
    }

    private float b(float... fArr) {
        float f = 0.0f;
        for (int i = 0; i < fArr.length; i++) {
            if (f < fArr[i]) {
                f = fArr[i];
            }
        }
        return f;
    }

    /* Access modifiers changed, original: protected */
    public void onDraw(Canvas canvas) {
        BitmapDrawable bitmapDrawable = (BitmapDrawable) getDrawable();
        if (bitmapDrawable != null && getWidth() != 0 && getHeight() != 0 && bitmapDrawable.getBitmap() != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            if (this.fh == null) {
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (this.scaleType == 1) {
                    bitmap = Bitmap.createScaledBitmap(bitmap, measuredWidth, measuredHeight, true);
                } else {
                    bitmap = a.b(bitmap, measuredWidth, measuredHeight);
                }
                BitmapShader bitmapShader = new BitmapShader(bitmap, TileMode.CLAMP, TileMode.CLAMP);
                this.fh = new Paint();
                this.fh.setAntiAlias(true);
                this.fh.setShader(bitmapShader);
            }
            if (this.bPy != -1.0f) {
                RectF rectF = new RectF(0.0f, 0.0f, (float) measuredWidth, (float) measuredHeight);
                float f = this.bPy;
                canvas.drawRoundRect(rectF, f, f, this.fh);
            }
            if (this.bPz != -1.0f) {
                canvas.drawRect(new RectF(0.0f, 0.0f, (float) (measuredWidth / 2), (float) (measuredHeight / 2)), this.fh);
            }
            if (this.bPA != -1.0f) {
                canvas.drawRect(new RectF((float) (measuredWidth / 2), 0.0f, (float) measuredWidth, (float) (measuredHeight / 2)), this.fh);
            }
            if (this.bPC != -1.0f) {
                canvas.drawRect(new RectF((float) (measuredWidth / 2), (float) (measuredHeight / 2), (float) measuredWidth, (float) measuredHeight), this.fh);
            }
            if (this.bPB != -1.0f) {
                canvas.drawRect(new RectF(0.0f, (float) (measuredHeight / 2), (float) (measuredWidth / 2), (float) measuredHeight), this.fh);
            }
        }
    }
}
