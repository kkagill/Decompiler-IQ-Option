package io.card.payment;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.ViewGroup;

/* compiled from: Preview */
class j extends ViewGroup {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String TAG = "j";
    private int dRA;
    private int dRC;
    SurfaceView dRv;

    public j(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        this.dRA = i2;
        this.dRC = i;
        this.dRv = new SurfaceView(context);
        addView(this.dRv);
    }

    public SurfaceView biK() {
        return this.dRv;
    }

    /* Access modifiers changed, original: 0000 */
    public SurfaceHolder getSurfaceHolder() {
        return biK().getHolder();
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawARGB(255, 255, 0, 0);
    }

    /* Access modifiers changed, original: protected */
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(resolveSize(getSuggestedMinimumWidth(), i), resolveSize(getSuggestedMinimumHeight(), i2));
    }

    /* Access modifiers changed, original: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (z && getChildCount() > 0) {
            i3 -= i;
            i4 -= i2;
            int i5 = this.dRC;
            i = i3 * i5;
            i2 = this.dRA;
            if (i > i4 * i2) {
                i2 = (i2 * i4) / i5;
                this.dRv.layout((i3 - i2) / 2, 0, (i3 + i2) / 2, i4);
                return;
            }
            i5 = (i5 * i3) / i2;
            this.dRv.layout(0, (i4 - i5) / 2, i3, (i4 + i5) / 2);
        }
    }
}
