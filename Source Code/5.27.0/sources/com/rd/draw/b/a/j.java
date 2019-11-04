package com.rd.draw.b.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.annotation.NonNull;
import com.rd.animation.b.a.g;
import com.rd.draw.data.Orientation;
import com.rd.draw.data.a;

/* compiled from: ThinWormDrawer */
public class j extends k {
    public j(@NonNull Paint paint, @NonNull a aVar) {
        super(paint, aVar);
    }

    public void a(@NonNull Canvas canvas, @NonNull com.rd.animation.b.a aVar, int i, int i2) {
        if (aVar instanceof g) {
            g gVar = (g) aVar;
            int bhN = gVar.bhN();
            int bhO = gVar.bhO();
            int height = gVar.getHeight() / 2;
            int radius = this.eHs.getRadius();
            int unselectedColor = this.eHs.getUnselectedColor();
            int selectedColor = this.eHs.getSelectedColor();
            if (this.eHs.bhY() == Orientation.HORIZONTAL) {
                this.fd.left = (float) bhN;
                this.fd.right = (float) bhO;
                this.fd.top = (float) (i2 - height);
                this.fd.bottom = (float) (height + i2);
            } else {
                this.fd.left = (float) (i - height);
                this.fd.right = (float) (height + i);
                this.fd.top = (float) bhN;
                this.fd.bottom = (float) bhO;
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
