package com.rd.draw.b.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.annotation.NonNull;
import com.rd.animation.b.a.e;
import com.rd.draw.data.Orientation;
import com.rd.draw.data.a;

/* compiled from: SlideDrawer */
public class h extends a {
    public h(@NonNull Paint paint, @NonNull a aVar) {
        super(paint, aVar);
    }

    public void a(@NonNull Canvas canvas, @NonNull com.rd.animation.b.a aVar, int i, int i2) {
        if (aVar instanceof e) {
            int bhL = ((e) aVar).bhL();
            int unselectedColor = this.eHs.getUnselectedColor();
            int selectedColor = this.eHs.getSelectedColor();
            int radius = this.eHs.getRadius();
            this.fh.setColor(unselectedColor);
            float f = (float) i;
            float f2 = (float) i2;
            float f3 = (float) radius;
            canvas.drawCircle(f, f2, f3, this.fh);
            this.fh.setColor(selectedColor);
            if (this.eHs.bhY() == Orientation.HORIZONTAL) {
                canvas.drawCircle((float) bhL, f2, f3, this.fh);
            } else {
                canvas.drawCircle(f, (float) bhL, f3, this.fh);
            }
        }
    }
}
