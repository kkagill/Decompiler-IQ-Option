package com.rd.draw.b.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.annotation.NonNull;
import com.rd.animation.b.a.b;
import com.rd.draw.data.Orientation;
import com.rd.draw.data.a;

/* compiled from: DropDrawer */
public class d extends a {
    public d(@NonNull Paint paint, @NonNull a aVar) {
        super(paint, aVar);
    }

    public void a(@NonNull Canvas canvas, @NonNull com.rd.animation.b.a aVar, int i, int i2) {
        if (aVar instanceof b) {
            b bVar = (b) aVar;
            int unselectedColor = this.eHs.getUnselectedColor();
            int selectedColor = this.eHs.getSelectedColor();
            float radius = (float) this.eHs.getRadius();
            this.fh.setColor(unselectedColor);
            canvas.drawCircle((float) i, (float) i2, radius, this.fh);
            this.fh.setColor(selectedColor);
            if (this.eHs.bhY() == Orientation.HORIZONTAL) {
                canvas.drawCircle((float) bVar.getWidth(), (float) bVar.getHeight(), (float) bVar.getRadius(), this.fh);
            } else {
                canvas.drawCircle((float) bVar.getHeight(), (float) bVar.getWidth(), (float) bVar.getRadius(), this.fh);
            }
        }
    }
}
