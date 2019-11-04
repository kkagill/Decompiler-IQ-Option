package com.rd.draw.b.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import androidx.annotation.NonNull;
import com.rd.animation.type.AnimationType;
import com.rd.draw.data.a;

/* compiled from: BasicDrawer */
public class b extends a {
    private Paint jy = new Paint();

    public b(@NonNull Paint paint, @NonNull a aVar) {
        super(paint, aVar);
        this.jy.setStyle(Style.STROKE);
        this.jy.setAntiAlias(true);
        this.jy.setStrokeWidth((float) aVar.bhJ());
    }

    public void a(@NonNull Canvas canvas, int i, boolean z, int i2, int i3) {
        Paint paint;
        float radius = (float) this.eHs.getRadius();
        int bhJ = this.eHs.bhJ();
        float scaleFactor = this.eHs.getScaleFactor();
        int selectedColor = this.eHs.getSelectedColor();
        int unselectedColor = this.eHs.getUnselectedColor();
        int bhV = this.eHs.bhV();
        AnimationType bhZ = this.eHs.bhZ();
        if ((bhZ == AnimationType.SCALE && !z) || (bhZ == AnimationType.SCALE_DOWN && z)) {
            radius *= scaleFactor;
        }
        if (i != bhV) {
            selectedColor = unselectedColor;
        }
        if (bhZ != AnimationType.FILL || i == bhV) {
            paint = this.fh;
        } else {
            paint = this.jy;
            paint.setStrokeWidth((float) bhJ);
        }
        paint.setColor(selectedColor);
        canvas.drawCircle((float) i2, (float) i3, radius, paint);
    }
}
