package com.iqoption.core.ui.picasso;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import com.squareup.picasso.Transformation;

/* compiled from: RoundedRectTransformation */
public class c implements Transformation {
    private final RectF fd = new RectF();
    private int radius;

    public String key() {
        return "rounded-rect";
    }

    public c(int i) {
        setRadius(i);
    }

    public void setRadius(int i) {
        this.radius = i;
    }

    public Bitmap transform(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        this.fd.set(0.0f, 0.0f, (float) width, (float) height);
        Bitmap createBitmap = Bitmap.createBitmap(width, height, bitmap.getConfig());
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setShader(new BitmapShader(bitmap, TileMode.CLAMP, TileMode.CLAMP));
        paint.setAntiAlias(true);
        RectF rectF = this.fd;
        int i = this.radius;
        canvas.drawRoundRect(rectF, (float) i, (float) i, paint);
        bitmap.recycle();
        return createBitmap;
    }
}
