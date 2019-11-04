package io.card.payment;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

/* compiled from: Logo */
class f {
    private Bitmap eKU;
    private boolean eKV;
    private final Context mContext;
    private final Paint mPaint = new Paint();

    public f(Context context) {
        this.mPaint.setAntiAlias(true);
        this.mPaint.setAlpha(100);
        this.eKU = null;
        this.mContext = context;
    }

    /* Access modifiers changed, original: 0000 */
    public void gi(boolean z) {
        if (this.eKU == null || z != this.eKV) {
            this.eKV = z;
            if (z) {
                this.eKU = BitmapFactory.decodeResource(this.mContext.getResources(), R.drawable.cio_card_io_logo);
            } else {
                this.eKU = BitmapFactory.decodeResource(this.mContext.getResources(), R.drawable.cio_paypal_logo);
            }
        }
    }

    public void draw(Canvas canvas, float f, float f2) {
        if (this.eKU == null) {
            gi(false);
        }
        canvas.save();
        float height = ((float) this.eKU.getHeight()) / ((float) this.eKU.getWidth());
        if (f2 / f < height) {
            f = f2 / height;
        } else {
            f2 = f * height;
        }
        f /= 2.0f;
        f2 /= 2.0f;
        Bitmap bitmap = this.eKU;
        canvas.drawBitmap(bitmap, new Rect(0, 0, bitmap.getWidth(), this.eKU.getHeight()), new RectF(-f, -f2, f, f2), this.mPaint);
        canvas.restore();
    }
}
