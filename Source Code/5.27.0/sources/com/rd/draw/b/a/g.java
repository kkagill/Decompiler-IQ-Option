package com.rd.draw.b.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.annotation.NonNull;
import com.rd.animation.b.a.d;
import com.rd.draw.data.a;

/* compiled from: ScaleDrawer */
public class g extends a {
    public g(@NonNull Paint paint, @NonNull a aVar) {
        super(paint, aVar);
    }

    public void a(@NonNull Canvas canvas, @NonNull com.rd.animation.b.a aVar, int i, int i2, int i3) {
        if (aVar instanceof d) {
            d dVar = (d) aVar;
            float radius = (float) this.eHs.getRadius();
            int selectedColor = this.eHs.getSelectedColor();
            int bhV = this.eHs.bhV();
            int bhW = this.eHs.bhW();
            int bhX = this.eHs.bhX();
            if (this.eHs.bhS()) {
                if (i == bhW) {
                    radius = (float) dVar.getRadius();
                    selectedColor = dVar.getColor();
                } else if (i == bhV) {
                    radius = (float) dVar.bhI();
                    selectedColor = dVar.bhH();
                }
            } else if (i == bhV) {
                radius = (float) dVar.getRadius();
                selectedColor = dVar.getColor();
            } else if (i == bhX) {
                radius = (float) dVar.bhI();
                selectedColor = dVar.bhH();
            }
            this.fh.setColor(selectedColor);
            canvas.drawCircle((float) i2, (float) i3, radius, this.fh);
        }
    }
}
