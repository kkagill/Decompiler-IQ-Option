package com.iqoption.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Region.Op;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class ClippedInMiddleRecyclerViewPager extends com.iqoption.core.ui.widget.c.a {
    private static a eem;
    private int een = 0;
    private int eeo = 0;
    private boolean eep = false;

    private interface a {
        void a(@NonNull Canvas canvas, int i, int i2, boolean z);
    }

    @TargetApi(28)
    private static class b implements a {
        private b() {
        }

        public void a(@NonNull Canvas canvas, int i, int i2, boolean z) {
            if (i > 0) {
                i /= 2;
                float f;
                if (z) {
                    f = (float) i;
                    canvas.clipOutRect((((float) canvas.getWidth()) / 2.0f) - f, 0.0f, (((float) canvas.getWidth()) / 2.0f) + f, (float) canvas.getHeight());
                } else {
                    f = (float) i;
                    canvas.clipRect((((float) canvas.getWidth()) / 2.0f) - f, 0.0f, (((float) canvas.getWidth()) / 2.0f) + f, (float) canvas.getHeight());
                }
            }
            if (i2 > 0) {
                i2 /= 2;
                float f2;
                if (z) {
                    f2 = (float) i2;
                    canvas.clipRect(0.0f, 0.0f, (float) canvas.getWidth(), (((float) canvas.getHeight()) / 2.0f) - f2);
                    canvas.clipOutRect(0.0f, (((float) canvas.getHeight()) / 2.0f) + f2, (float) canvas.getWidth(), (float) canvas.getHeight());
                    return;
                }
                f2 = (float) i2;
                canvas.clipOutRect(0.0f, (((float) canvas.getHeight()) / 2.0f) - f2, (float) canvas.getWidth(), (((float) canvas.getHeight()) / 2.0f) + f2);
            }
        }
    }

    private static class c implements a {
        private c() {
        }

        public void a(@NonNull Canvas canvas, int i, int i2, boolean z) {
            int i3;
            float f;
            if (i > 0) {
                i3 = i / 2;
                if (z) {
                    f = (float) i3;
                    canvas.clipRect(0.0f, 0.0f, (((float) canvas.getWidth()) / 2.0f) - f, (float) canvas.getHeight(), Op.REPLACE);
                    canvas.clipRect((((float) canvas.getWidth()) / 2.0f) + f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight(), Op.UNION);
                } else {
                    f = (float) i3;
                    canvas.clipRect((((float) canvas.getWidth()) / 2.0f) - f, 0.0f, (((float) canvas.getWidth()) / 2.0f) + f, (float) canvas.getHeight(), Op.REPLACE);
                }
            }
            if (i2 > 0) {
                i3 = i2 / 2;
                if (z) {
                    f = (float) i3;
                    canvas.clipRect(0.0f, 0.0f, (float) canvas.getWidth(), (((float) canvas.getHeight()) / 2.0f) - f, Op.REPLACE);
                    canvas.clipRect(0.0f, (((float) canvas.getHeight()) / 2.0f) + f, (float) canvas.getWidth(), (float) canvas.getHeight(), Op.UNION);
                    return;
                }
                f = (float) i3;
                canvas.clipRect(0.0f, (((float) canvas.getHeight()) / 2.0f) - f, (float) canvas.getWidth(), (((float) canvas.getHeight()) / 2.0f) + f, Op.REPLACE);
            }
        }
    }

    static {
        if (com.iqoption.core.ext.a.Xf()) {
            eem = new b();
        } else {
            eem = new c();
        }
    }

    public ClippedInMiddleRecyclerViewPager(Context context) {
        super(context);
    }

    public ClippedInMiddleRecyclerViewPager(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ClippedInMiddleRecyclerViewPager(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void u(int i, boolean z) {
        this.een = i;
        this.eep = z;
    }

    public void onDraw(Canvas canvas) {
        eem.a(canvas, this.een, this.eeo, this.eep);
        super.onDraw(canvas);
    }
}
