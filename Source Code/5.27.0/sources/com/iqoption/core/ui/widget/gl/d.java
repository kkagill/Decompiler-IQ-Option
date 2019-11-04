package com.iqoption.core.ui.widget.gl;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader.TileMode;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.iqoption.core.ui.widget.b;
import com.iqoption.core.ui.widget.b.m;

/* compiled from: GLChartView */
public final class d extends FrameLayout {
    private a bNW;
    private b bNX;
    private Bitmap bitmap;
    private Paint fh;

    /* compiled from: GLChartView */
    public interface a extends m {
        void amO();

        void amP();

        boolean onTouchEvent(@NonNull MotionEvent motionEvent);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar = this.bNW;
        boolean z = false;
        if (aVar == null) {
            return false;
        }
        if (aVar.onTouchEvent(motionEvent) || super.onTouchEvent(motionEvent)) {
            z = true;
        }
        return z;
    }

    public void onDrawForeground(Canvas canvas) {
        super.onDrawForeground(canvas);
        Paint paint = this.fh;
        if (paint != null && this.bitmap != null) {
            canvas.drawPaint(paint);
        }
    }

    public void setController(@NonNull a aVar) {
        this.bNW = aVar;
        this.bNX.setRenderer(aVar);
        this.bNX.setRenderMode(1);
    }

    public void onResume() {
        this.bNX.onResume();
        a aVar = this.bNW;
        if (aVar != null) {
            aVar.amO();
        }
    }

    public void onPause() {
        this.bNX.onPause();
        a aVar = this.bNW;
        if (aVar != null) {
            aVar.amP();
        }
    }

    public void onDestroy() {
        this.bNX.setVisibility(4);
        setSnapshotEnabled(true);
    }

    public void setSnapshotEnabled(boolean z) {
        amQ();
        if (z) {
            this.bitmap = this.bNX.getBitmap();
            if (this.bitmap != null) {
                if (this.fh == null) {
                    this.fh = new Paint();
                }
                this.fh.setShader(new BitmapShader(this.bitmap, TileMode.CLAMP, TileMode.CLAMP));
            }
        }
        setWillNotDraw(z ^ 1);
    }

    private void amQ() {
        Paint paint = this.fh;
        if (paint != null) {
            paint.reset();
        }
        Bitmap bitmap = this.bitmap;
        if (bitmap != null) {
            bitmap.recycle();
            this.bitmap = null;
        }
    }
}
