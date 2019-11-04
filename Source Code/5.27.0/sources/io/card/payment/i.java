package io.card.payment;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.Point;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.view.ViewCompat;
import io.card.payment.i18n.StringKey;
import io.card.payment.i18n.b;
import java.lang.ref.WeakReference;

/* compiled from: OverlayView */
class i extends View {
    private static final String TAG = "i";
    private static final Orientation[] eKW = new Orientation[]{Orientation.TOP_BOTTOM, Orientation.LEFT_RIGHT, Orientation.BOTTOM_TOP, Orientation.RIGHT_LEFT};
    private int dRd;
    private CreditCard eJM;
    private DetectionInfo eKX;
    private Rect eKY;
    private int eKZ;
    private final WeakReference<CardIOActivity> eKg;
    private boolean eLa;
    private String eLb;
    private GradientDrawable eLc;
    private final Paint eLd;
    private final Paint eLe;
    private Path eLf;
    private Rect eLg;
    private final l eLh;
    private final f eLi;
    private Rect eLj;
    private Rect eLk;
    private final boolean eLl;
    private int eLm;
    private float ejj = 1.0f;
    private Bitmap mBitmap;
    private int mState;

    public i(CardIOActivity cardIOActivity, AttributeSet attributeSet, boolean z) {
        super(cardIOActivity, attributeSet);
        this.eLl = z;
        this.eKg = new WeakReference(cardIOActivity);
        this.eLm = 1;
        this.ejj = getResources().getDisplayMetrics().density / 1.5f;
        float f = this.ejj;
        this.eLh = new l(70.0f * f, f * 50.0f);
        this.eLi = new f(cardIOActivity);
        this.eLd = new Paint(1);
        this.eLe = new Paint(1);
        this.eLe.clearShadowLayer();
        this.eLe.setStyle(Style.FILL);
        this.eLe.setColor(-1157627904);
        this.eLb = b.a(StringKey.SCAN_GUIDE);
    }

    public void jj(int i) {
        this.eKZ = i;
    }

    public void gj(boolean z) {
        this.eLa = z;
    }

    public void ld(String str) {
        this.eLb = str;
    }

    public void a(Rect rect, int i) {
        float f;
        Point point;
        this.dRd = i;
        this.eKY = rect;
        invalidate();
        if (this.dRd % 180 != 0) {
            f = this.ejj;
            point = new Point((int) (40.0f * f), (int) (f * 60.0f));
            this.eLm = -1;
        } else {
            f = this.ejj;
            point = new Point((int) (60.0f * f), (int) (f * 40.0f));
            this.eLm = 1;
        }
        Rect rect2 = this.eLg;
        if (rect2 != null) {
            Point point2 = new Point(rect2.left + point.x, this.eLg.top + point.y);
            f = this.ejj;
            this.eLj = m.a(point2, (int) (70.0f * f), (int) (f * 50.0f));
            Point point3 = new Point(this.eLg.right - point.x, this.eLg.top + point.y);
            float f2 = this.ejj;
            this.eLk = m.a(point3, (int) (100.0f * f2), (int) (f2 * 50.0f));
            this.eLc = new GradientDrawable(eKW[(this.dRd / 90) % 4], new int[]{-1, ViewCompat.MEASURED_STATE_MASK});
            this.eLc.setGradientType(0);
            this.eLc.setBounds(this.eKY);
            this.eLc.setAlpha(50);
            this.eLf = new Path();
            this.eLf.addRect(new RectF(this.eLg), Direction.CW);
            this.eLf.addRect(new RectF(this.eKY), Direction.CCW);
        }
    }

    public void setBitmap(Bitmap bitmap) {
        Bitmap bitmap2 = this.mBitmap;
        if (bitmap2 != null) {
            bitmap2.recycle();
        }
        this.mBitmap = bitmap;
        if (this.mBitmap != null) {
            biI();
        }
    }

    public Bitmap getBitmap() {
        return this.mBitmap;
    }

    public void b(DetectionInfo detectionInfo) {
        DetectionInfo detectionInfo2 = this.eKX;
        if (!(detectionInfo2 == null || detectionInfo2.a(detectionInfo))) {
            invalidate();
        }
        this.eKX = detectionInfo;
    }

    public Bitmap biH() {
        Bitmap bitmap = this.mBitmap;
        if (bitmap == null || bitmap.isRecycled()) {
            return null;
        }
        bitmap = this.mBitmap;
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), this.mBitmap.getHeight());
    }

    private Rect l(int i, int i2, int i3, int i4) {
        int i5 = (int) (this.ejj * 8.0f);
        Rect rect = new Rect();
        rect.left = Math.min(i, i3) - i5;
        rect.right = Math.max(i, i3) + i5;
        rect.top = Math.min(i2, i4) - i5;
        rect.bottom = Math.max(i2, i4) + i5;
        return rect;
    }

    public void onDraw(Canvas canvas) {
        if (this.eKY != null && this.eLg != null) {
            canvas.save();
            this.eLc.draw(canvas);
            int i = this.dRd;
            if (i == 0 || i == 180) {
                i = (this.eKY.bottom - this.eKY.top) / 4;
            } else {
                i = (this.eKY.right - this.eKY.left) / 4;
            }
            DetectionInfo detectionInfo = this.eKX;
            if (detectionInfo != null && detectionInfo.biG() == 4) {
                canvas.drawPath(this.eLf, this.eLe);
            }
            this.eLd.clearShadowLayer();
            this.eLd.setStyle(Style.FILL);
            this.eLd.setColor(this.eKZ);
            canvas.drawRect(l(this.eKY.left, this.eKY.top, this.eKY.left + i, this.eKY.top), this.eLd);
            canvas.drawRect(l(this.eKY.left, this.eKY.top, this.eKY.left, this.eKY.top + i), this.eLd);
            canvas.drawRect(l(this.eKY.right, this.eKY.top, this.eKY.right - i, this.eKY.top), this.eLd);
            canvas.drawRect(l(this.eKY.right, this.eKY.top, this.eKY.right, this.eKY.top + i), this.eLd);
            canvas.drawRect(l(this.eKY.left, this.eKY.bottom, this.eKY.left + i, this.eKY.bottom), this.eLd);
            canvas.drawRect(l(this.eKY.left, this.eKY.bottom, this.eKY.left, this.eKY.bottom - i), this.eLd);
            canvas.drawRect(l(this.eKY.right, this.eKY.bottom, this.eKY.right - i, this.eKY.bottom), this.eLd);
            canvas.drawRect(l(this.eKY.right, this.eKY.bottom, this.eKY.right, this.eKY.bottom - i), this.eLd);
            DetectionInfo detectionInfo2 = this.eKX;
            if (detectionInfo2 != null) {
                if (detectionInfo2.topEdge) {
                    canvas.drawRect(l(this.eKY.left, this.eKY.top, this.eKY.right, this.eKY.top), this.eLd);
                }
                if (this.eKX.bottomEdge) {
                    canvas.drawRect(l(this.eKY.left, this.eKY.bottom, this.eKY.right, this.eKY.bottom), this.eLd);
                }
                if (this.eKX.leftEdge) {
                    canvas.drawRect(l(this.eKY.left, this.eKY.top, this.eKY.left, this.eKY.bottom), this.eLd);
                }
                if (this.eKX.rightEdge) {
                    canvas.drawRect(l(this.eKY.right, this.eKY.top, this.eKY.right, this.eKY.bottom), this.eLd);
                }
                if (this.eKX.biG() < 3) {
                    float f = this.ejj;
                    float f2 = 34.0f * f;
                    f *= 26.0f;
                    m.a(this.eLd);
                    this.eLd.setTextAlign(Align.CENTER);
                    this.eLd.setTextSize(f);
                    canvas.translate((float) (this.eKY.left + (this.eKY.width() / 2)), (float) (this.eKY.top + (this.eKY.height() / 2)));
                    canvas.rotate((float) (this.eLm * this.dRd));
                    String str = this.eLb;
                    if (!(str == null || str == "")) {
                        String[] split = str.split("\n");
                        f = (-(((((float) (split.length - 1)) * f2) - f) / 2.0f)) - 3.0f;
                        for (String drawText : split) {
                            canvas.drawText(drawText, 0.0f, f, this.eLd);
                            f += f2;
                        }
                    }
                }
            }
            canvas.restore();
            if (!this.eLa) {
                canvas.save();
                canvas.translate(this.eLk.exactCenterX(), this.eLk.exactCenterY());
                canvas.rotate((float) (this.eLm * this.dRd));
                f fVar = this.eLi;
                float f3 = this.ejj;
                fVar.draw(canvas, 100.0f * f3, f3 * 50.0f);
                canvas.restore();
            }
            if (this.eLl) {
                canvas.save();
                canvas.translate(this.eLj.exactCenterX(), this.eLj.exactCenterY());
                canvas.rotate((float) (this.eLm * this.dRd));
                this.eLh.draw(canvas);
                canvas.restore();
            }
        }
    }

    public void a(CreditCard creditCard) {
        this.eJM = creditCard;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            if ((motionEvent.getAction() & 255) == 0) {
                Rect a = m.a(new Point((int) motionEvent.getX(), (int) motionEvent.getY()), 20, 20);
                if (this.eLl && this.eLj != null && Rect.intersects(this.eLj, a)) {
                    ((CardIOActivity) this.eKg.get()).toggleFlash();
                } else {
                    ((CardIOActivity) this.eKg.get()).biq();
                }
            }
        } catch (NullPointerException unused) {
            Log.d(TAG, "NullPointerException caught in onTouchEvent method");
        }
        return false;
    }

    private void biI() {
        RectF rectF = new RectF(2.0f, 2.0f, (float) (this.mBitmap.getWidth() - 2), (float) (this.mBitmap.getHeight() - 2));
        float height = ((float) this.mBitmap.getHeight()) * 0.06666667f;
        Bitmap createBitmap = Bitmap.createBitmap(this.mBitmap.getWidth(), this.mBitmap.getHeight(), Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawColor(0);
        Paint paint = new Paint(1);
        paint.setColor(ViewCompat.MEASURED_STATE_MASK);
        paint.setStyle(Style.FILL);
        canvas.drawRoundRect(rectF, height, height, paint);
        Paint paint2 = new Paint();
        paint2.setFilterBitmap(false);
        Canvas canvas2 = new Canvas(this.mBitmap);
        paint2.setXfermode(new PorterDuffXfermode(Mode.DST_IN));
        canvas2.drawBitmap(createBitmap, 0.0f, 0.0f, paint2);
        paint2.setXfermode(null);
        createBitmap.recycle();
    }

    public void biJ() {
        if (this.mBitmap != null) {
            if (this.eJM.flipped) {
                Matrix matrix = new Matrix();
                matrix.setRotate(180.0f, (float) (this.mBitmap.getWidth() / 2), (float) (this.mBitmap.getHeight() / 2));
                Bitmap bitmap = this.mBitmap;
                this.mBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), this.mBitmap.getHeight(), matrix, false);
            }
            Canvas canvas = new Canvas(this.mBitmap);
            Paint paint = new Paint();
            m.a(paint);
            paint.setTextSize(this.ejj * 28.0f);
            int length = this.eJM.cardNumber.length();
            float width = ((float) this.mBitmap.getWidth()) / 428.0f;
            int i = (int) ((((float) this.eJM.yoff) * width) - 6.0f);
            for (int i2 = 0; i2 < length; i2++) {
                int i3 = (int) (((float) this.eJM.xoff[i2]) * width);
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("");
                stringBuilder.append(this.eJM.cardNumber.charAt(i2));
                canvas.drawText(stringBuilder.toString(), (float) i3, (float) i, paint);
            }
        }
    }

    public boolean isAnimating() {
        return this.mState != 0;
    }

    public void o(Rect rect) {
        this.eLg = rect;
    }

    public void gk(boolean z) {
        this.eLh.gm(z);
        invalidate();
    }

    public void gl(boolean z) {
        this.eLi.gi(z);
    }

    public Rect getTorchRect() {
        return this.eLj;
    }
}
