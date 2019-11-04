package com.iqoption.core.ui.widget;

import android.graphics.Point;
import android.view.View.MeasureSpec;
import androidx.annotation.NonNull;

/* compiled from: MaxSizeWidget */
public interface d {

    /* compiled from: MaxSizeWidget */
    public final /* synthetic */ class -CC {
        @NonNull
        public static Point $default$i(d _this, int i, int i2, int i3, int i4) {
            int size = MeasureSpec.getSize(i3);
            if (i > 0 && i < size) {
                i3 = MeasureSpec.makeMeasureSpec(i, MeasureSpec.getMode(i3));
            }
            i = MeasureSpec.getSize(i4);
            if (i2 > 0 && i2 < i) {
                i4 = MeasureSpec.makeMeasureSpec(i2, MeasureSpec.getMode(i4));
            }
            return new Point(i3, i4);
        }
    }

    @NonNull
    Point i(int i, int i2, int i3, int i4);
}
