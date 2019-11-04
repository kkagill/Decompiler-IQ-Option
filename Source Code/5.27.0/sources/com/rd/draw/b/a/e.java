package com.rd.draw.b.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import androidx.annotation.NonNull;
import com.rd.animation.b.a.c;
import com.rd.draw.data.a;

/* compiled from: FillDrawer */
public class e extends a {
    private Paint jy = new Paint();

    public e(@NonNull Paint paint, @NonNull a aVar) {
        super(paint, aVar);
        this.jy.setStyle(Style.STROKE);
        this.jy.setAntiAlias(true);
    }

    public void a(@NonNull Canvas canvas, @NonNull com.rd.animation.b.a aVar, int i, int i2, int i3) {
        if (aVar instanceof c) {
            c cVar = (c) aVar;
            int unselectedColor = this.eHs.getUnselectedColor();
            float radius = (float) this.eHs.getRadius();
            int bhJ = this.eHs.bhJ();
            int bhV = this.eHs.bhV();
            int bhW = this.eHs.bhW();
            int bhX = this.eHs.bhX();
            if (this.eHs.bhS()) {
                if (i == bhW) {
                    unselectedColor = cVar.getColor();
                    radius = (float) cVar.getRadius();
                    bhJ = cVar.bhJ();
                } else if (i == bhV) {
                    unselectedColor = cVar.bhH();
                    radius = (float) cVar.bhI();
                    bhJ = cVar.bhK();
                }
            } else if (i == bhV) {
                unselectedColor = cVar.getColor();
                radius = (float) cVar.getRadius();
                bhJ = cVar.bhJ();
            } else if (i == bhX) {
                unselectedColor = cVar.bhH();
                radius = (float) cVar.bhI();
                bhJ = cVar.bhK();
            }
            this.jy.setColor(unselectedColor);
            this.jy.setStrokeWidth((float) this.eHs.bhJ());
            float f = (float) i2;
            float f2 = (float) i3;
            canvas.drawCircle(f, f2, (float) this.eHs.getRadius(), this.jy);
            this.jy.setStrokeWidth((float) bhJ);
            canvas.drawCircle(f, f2, radius, this.jy);
        }
    }
}
