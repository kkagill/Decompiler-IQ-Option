package com.rd.draw.b.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.annotation.NonNull;
import com.rd.draw.data.a;

/* compiled from: ColorDrawer */
public class c extends a {
    public c(@NonNull Paint paint, @NonNull a aVar) {
        super(paint, aVar);
    }

    public void a(@NonNull Canvas canvas, @NonNull com.rd.animation.b.a aVar, int i, int i2, int i3) {
        if (aVar instanceof com.rd.animation.b.a.a) {
            com.rd.animation.b.a.a aVar2 = (com.rd.animation.b.a.a) aVar;
            float radius = (float) this.eHs.getRadius();
            int selectedColor = this.eHs.getSelectedColor();
            int bhV = this.eHs.bhV();
            int bhW = this.eHs.bhW();
            int bhX = this.eHs.bhX();
            if (this.eHs.bhS()) {
                if (i == bhW) {
                    selectedColor = aVar2.getColor();
                } else if (i == bhV) {
                    selectedColor = aVar2.bhH();
                }
            } else if (i == bhV) {
                selectedColor = aVar2.getColor();
            } else if (i == bhX) {
                selectedColor = aVar2.bhH();
            }
            this.fh.setColor(selectedColor);
            canvas.drawCircle((float) i2, (float) i3, radius, this.fh);
        }
    }
}
