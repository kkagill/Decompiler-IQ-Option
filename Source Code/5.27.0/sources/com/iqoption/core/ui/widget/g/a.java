package com.iqoption.core.ui.widget.g;

import android.graphics.RectF;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015J\u0016\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u001aR\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, bng = {"Lcom/iqoption/core/ui/widget/timerview/FlowerDataCalc;", "", "segmentCount", "", "(I)V", "mCosValues", "", "mSinValues", "segmentAlphaValue", "", "getSegmentAlphaValue", "()[I", "segmentsCoordinates", "", "Landroid/graphics/RectF;", "getSegmentsCoordinates", "()[Landroid/graphics/RectF;", "[Landroid/graphics/RectF;", "updateSegmentsAlphaValue", "", "leftTimeSrc", "", "maxTime", "updateSegmentsCoordinates", "size", "lenghtSegment", "", "core_release"})
/* compiled from: FlowerDataCalc.kt */
public final class a {
    private final float[] bPM;
    private final float[] bPN;
    private final RectF[] bPO;
    private final int[] bPP;
    private final int bPQ;

    public final RectF[] anh() {
        return this.bPO;
    }

    public final int[] ani() {
        return this.bPP;
    }

    public final void f(int i, float f) {
        float f2 = (float) i;
        float f3 = f2 / 2.0f;
        float f4 = (float) 2;
        f2 = (f2 - (f / f4)) / 2.0f;
        f4 = ((f4 * f2) - f) / 2.0f;
        int i2 = this.bPQ;
        for (int i3 = 0; i3 < i2; i3++) {
            float[] fArr = this.bPM;
            float f5 = fArr[i3] * f2;
            float[] fArr2 = this.bPN;
            this.bPO[i3] = new RectF(f3 - f5, (fArr2[i3] * f2) + f3, f3 - (fArr[i3] * f4), (fArr2[i3] * f4) + f3);
        }
    }
}
