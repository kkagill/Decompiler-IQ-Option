package com.jumio.sdk.custom;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.RelativeLayout;

public abstract class JumioCustomScanView extends RelativeLayout {
    protected static final float MIN_RATIO = 1.33f;
    protected float ratio = MIN_RATIO;

    public abstract void init(Context context, AttributeSet attributeSet);

    public JumioCustomScanView(Context context) {
        super(context);
    }

    public JumioCustomScanView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context, attributeSet);
    }

    public JumioCustomScanView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context, attributeSet);
    }

    public float getRatio() {
        return this.ratio;
    }

    public void setRatio(float f) {
        this.ratio = f;
    }

    /* Access modifiers changed, original: protected */
    public void onMeasure(int i, int i2) {
        float f;
        int mode = MeasureSpec.getMode(i);
        i = MeasureSpec.getSize(i);
        int mode2 = MeasureSpec.getMode(i2);
        i2 = MeasureSpec.getSize(i2);
        Object obj = null;
        Object obj2 = getContext().getResources().getConfiguration().orientation == 1 ? 1 : null;
        if (obj2 != null) {
            float f2 = this.ratio;
            if (f2 != 0.0f && f2 > MIN_RATIO) {
                throw new IllegalArgumentException("Portrait ratio must be <= 1.33");
            }
        }
        if (obj2 == null) {
            float f3 = this.ratio;
            if (f3 != 0.0f && f3 < MIN_RATIO) {
                throw new IllegalArgumentException("Landscape ratio must be >= 1.33");
            }
        }
        Object obj3 = (mode == Integer.MIN_VALUE || mode == 0) ? 1 : null;
        if (mode2 == Integer.MIN_VALUE || mode2 == 0) {
            obj = 1;
        }
        if (!(i == 0 || obj == null)) {
            f = this.ratio;
            if (f != 0.0f) {
                i2 = (int) (((float) i) / f);
                super.onMeasure(MeasureSpec.makeMeasureSpec(i, 1073741824), MeasureSpec.makeMeasureSpec(i2, 1073741824));
                return;
            }
        }
        if (!(obj3 == null || i2 == 0)) {
            f = this.ratio;
            if (f != 0.0f) {
                i = (int) (((float) i2) * f);
                super.onMeasure(MeasureSpec.makeMeasureSpec(i, 1073741824), MeasureSpec.makeMeasureSpec(i2, 1073741824));
                return;
            }
        }
        if (obj3 == null || obj == null || this.ratio == 0.0f) {
            if (!(obj3 == null && obj == null) && this.ratio == 0.0f) {
                throw new IllegalArgumentException("ratio should be set");
            }
            super.onMeasure(MeasureSpec.makeMeasureSpec(i, 1073741824), MeasureSpec.makeMeasureSpec(i2, 1073741824));
            return;
        }
        throw new IllegalArgumentException("layout_width or layout_height should be set to a fixed value when ratio is used");
    }
}
