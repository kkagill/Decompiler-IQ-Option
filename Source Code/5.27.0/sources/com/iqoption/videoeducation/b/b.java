package com.iqoption.videoeducation.b;

import android.content.res.Resources;
import androidx.annotation.DimenRes;
import androidx.recyclerview.widget.RecyclerView;
import com.iqoption.x.R;

/* compiled from: VideoCellCalculator */
final class b {
    private Resources aOg;
    private com.iqoption.core.graphics.b edt;
    private int edz;
    private int spanCount;

    b() {
    }

    /* Access modifiers changed, original: 0000 */
    public void m(RecyclerView recyclerView) {
        if (this.aOg == null) {
            this.aOg = recyclerView.getResources();
        }
        int width = (recyclerView.getWidth() - recyclerView.getPaddingLeft()) - recyclerView.getPaddingRight();
        int fA = fA(R.dimen.dp220);
        int fA2 = fA(R.dimen.dp127);
        this.edz = fA(R.dimen.dp8);
        int i = width / fA;
        int i2 = i - 1;
        if (width - (i * fA) >= this.edz * i2) {
            this.spanCount = i;
        } else {
            this.spanCount = i2;
        }
        if (this.spanCount < 2) {
            this.spanCount = 2;
        }
        width = (width - this.edz) / this.spanCount;
        this.edt = new com.iqoption.core.graphics.b(width, (int) (((float) width) / (((float) fA) / ((float) fA2))));
    }

    /* Access modifiers changed, original: 0000 */
    public int getSpanCount() {
        return this.spanCount;
    }

    /* Access modifiers changed, original: 0000 */
    public int aXz() {
        return this.edz;
    }

    /* Access modifiers changed, original: 0000 */
    public com.iqoption.core.graphics.b aXA() {
        return this.edt;
    }

    private int fA(@DimenRes int i) {
        return this.aOg.getDimensionPixelSize(i);
    }
}
