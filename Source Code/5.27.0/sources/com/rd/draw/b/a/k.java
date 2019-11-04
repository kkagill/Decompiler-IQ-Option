package com.rd.draw.b.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import com.rd.animation.b.a.h;
import com.rd.draw.data.Orientation;
import com.rd.draw.data.a;

/* compiled from: WormDrawer */
public class k extends a {
    public RectF fd = new RectF();

    public k(@NonNull Paint paint, @NonNull a aVar) {
        super(paint, aVar);
    }

    public void a(@NonNull Canvas canvas, @NonNull com.rd.animation.b.a aVar, int i, int i2) {
        if (aVar instanceof h) {
            h hVar = (h) aVar;
            int bhN = hVar.bhN();
            int bhO = hVar.bhO();
            int radius = this.eHs.getRadius();
            int unselectedColor = this.eHs.getUnselectedColor();
            int selectedColor = this.eHs.getSelectedColor();
            RectF rectF;
            if (this.eHs.bhY() == Orientation.HORIZONTAL) {
                rectF = this.fd;
                rectF.left = (float) bhN;
                rectF.right = (float) bhO;
                rectF.top = (float) (i2 - radius);
                rectF.bottom = (float) (i2 + radius);
            } else {
                rectF = this.fd;
                rectF.left = (float) (i - radius);
                rectF.right = (float) (i + radius);
                rectF.top = (float) bhN;
                rectF.bottom = (float) bhO;
            }
            this.fh.setColor(unselectedColor);
            float f = (float) i;
            float f2 = (float) i2;
            float f3 = (float) radius;
            canvas.drawCircle(f, f2, f3, this.fh);
            this.fh.setColor(selectedColor);
            canvas.drawRoundRect(this.fd, f3, f3, this.fh);
        }
    }
}
