package com.iqoption.core.ui.picasso;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader.TileMode;
import com.squareup.picasso.Transformation;

/* compiled from: CircleTransformation */
public class a implements Transformation {
    private int bJm;
    private int bJn;
    private int bJo;
    private int bJp;
    private a bJq;
    private a bJr;

    /* compiled from: CircleTransformation */
    public interface a {
        void n(Canvas canvas);
    }

    public String key() {
        return "circle";
    }

    public Bitmap transform(Bitmap bitmap) {
        int min = Math.min(bitmap.getWidth() - this.bJm, bitmap.getHeight() - this.bJn);
        int max = Math.max(((bitmap.getWidth() - min) / 2) + this.bJo, 0);
        int max2 = Math.max(((bitmap.getHeight() - min) / 2) + this.bJp, 0);
        if (max + min > bitmap.getWidth()) {
            max = Math.max(bitmap.getWidth() - min, 0);
        }
        if (max2 + min > bitmap.getHeight()) {
            max2 = Math.max(bitmap.getHeight() - min, 0);
        }
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, max, max2, min, min);
        Config config = bitmap.getConfig();
        if (createBitmap != bitmap) {
            bitmap.recycle();
        }
        bitmap = Bitmap.createBitmap(min, min, config);
        Canvas canvas = new Canvas(bitmap);
        Paint paint = new Paint();
        paint.setShader(new BitmapShader(createBitmap, TileMode.CLAMP, TileMode.CLAMP));
        paint.setAntiAlias(true);
        float f = ((float) min) / 2.0f;
        a aVar = this.bJq;
        if (aVar != null) {
            aVar.n(canvas);
        }
        canvas.drawCircle(f, f, f, paint);
        a aVar2 = this.bJr;
        if (aVar2 != null) {
            aVar2.n(canvas);
        }
        createBitmap.recycle();
        return bitmap;
    }
}
