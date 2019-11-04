package at.grabner.circleprogress;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Matrix.ScaleToFit;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.PointF;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Message;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import jumio.nv.nfc.a;

/* compiled from: CircleProgressView */
public class c extends View {
    float bD = 42.0f;
    float bE = 0.0f;
    float bF = 0.0f;
    float bG = 0.0f;
    float bH = 42.0f;
    float bI = 0.0f;
    private int bJ = 0;
    private int bK = 0;
    private int bL = 80;
    private int bM = 40;
    private int bN = 40;
    private int bO = 270;
    private float bP = 1.0f;
    private int bQ = 10;
    private float bR = 1.0f;
    private float bS = 1.0f;
    private int bT = -16738680;
    private int bU = -1442840576;
    private int bV = this.bT;
    private int bW = 0;
    private int bX = -1434201911;
    private boolean bY = false;
    private int[] bZ;
    private boolean cA;
    private boolean cB;
    private Bitmap cC;
    private Paint cD;
    private float cE;
    private boolean cF;
    private boolean cG;
    b cH;
    private boolean cI;
    private int cJ;
    private float cK;
    private float cL;
    private float cM;
    private int cN;
    private Cap ca;
    private Cap cb;
    private Paint cc;
    private Paint cd;
    private Paint ce;
    private Paint cf;
    private Paint cg;
    private Paint ch;
    private RectF ci;
    private RectF cj;
    private PointF ck;
    private RectF cl;
    private RectF cm;
    private RectF cn;
    private RectF co;
    private RectF cp;
    float cq;
    double cr;
    int cs;
    boolean ct;
    Handler cu;
    AnimationState cv;
    private String cw;
    private String cx;
    private int cy;
    private TextMode cz;
    float mMaxValue = 100.0f;
    private int mPaddingBottom = 5;
    private int mPaddingLeft = 5;
    private int mPaddingRight = 5;
    private int mPaddingTop = 5;
    private int mTextColor = ViewCompat.MEASURED_STATE_MASK;
    private Paint mTextPaint;
    private int mTextSize = 10;

    /* compiled from: CircleProgressView */
    /* renamed from: at.grabner.circleprogress.c$1 */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[TextMode.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        static {
            /*
            r0 = at.grabner.circleprogress.TextMode.values();
            r0 = r0.length;
            r0 = new int[r0];
            a = r0;
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = at.grabner.circleprogress.TextMode.PERCENT;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = at.grabner.circleprogress.TextMode.VALUE;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = at.grabner.circleprogress.TextMode.TEXT;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: at.grabner.circleprogress.c$AnonymousClass1.<clinit>():void");
        }
    }

    public static float c(float f) {
        return ((f % 360.0f) + 360.0f) % 360.0f;
    }

    public c(Context context) {
        super(context);
        this.bZ = new int[]{r0};
        this.ca = Cap.BUTT;
        this.cb = Cap.BUTT;
        this.cc = new Paint();
        this.cd = new Paint();
        this.ce = new Paint();
        this.cf = new Paint();
        this.mTextPaint = new Paint();
        this.cg = new Paint();
        this.ch = new Paint();
        this.ci = new RectF();
        this.cj = new RectF();
        this.cl = new RectF();
        this.cm = new RectF();
        this.cn = new RectF();
        this.co = new RectF();
        this.cp = new RectF();
        this.cq = 2.8f;
        this.cr = 900.0d;
        this.cs = 15;
        this.cu = new a(this);
        this.cv = AnimationState.IDLE;
        String str = "";
        this.cw = str;
        this.cx = str;
        this.cz = TextMode.PERCENT;
        this.cB = false;
        this.cE = 0.3f;
        this.cF = false;
        this.cG = false;
        this.cI = false;
        this.cJ = 18;
        this.cK = 0.9f;
        this.cL = 360.0f / ((float) this.cJ);
        this.cM = this.cL * this.cK;
        this.cD = new Paint(1);
        this.cD.setFilterBitmap(false);
        this.cD.setXfermode(new PorterDuffXfermode(Mode.DST_IN));
        O();
    }

    /* Access modifiers changed, original: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        i = getMeasuredWidth();
        i = (i - getPaddingLeft()) - getPaddingRight();
        i2 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        if (i > i2) {
            i = i2;
        }
        setMeasuredDimension((getPaddingLeft() + i) + getPaddingRight(), (i + getPaddingTop()) + getPaddingBottom());
    }

    private RectF a(RectF rectF) {
        float f;
        double width = (double) ((rectF.width() - ((float) Math.max(this.bM, this.bN))) - (this.bP * 2.0f));
        Double.isNaN(width);
        float width2 = (rectF.width() - ((float) ((width / 2.0d) * Math.sqrt(2.0d)))) / 2.0f;
        float f2 = 1.0f;
        if (N()) {
            f2 = 0.77f;
            f = 1.33f;
        } else {
            f = 1.0f;
        }
        f2 *= width2;
        width2 *= f;
        return new RectF(rectF.left + f2, rectF.top + width2, rectF.right - f2, rectF.bottom - width2);
    }

    private static float a(String str, Paint paint, RectF rectF) {
        Matrix matrix = new Matrix();
        Rect rect = new Rect();
        str = str.replace('1', '0');
        paint.getTextBounds(str, 0, str.length(), rect);
        matrix.setRectToRect(new RectF(rect), rectF, ScaleToFit.CENTER);
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        return paint.getTextSize() * fArr[0];
    }

    /* Access modifiers changed, original: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.bK = i;
        this.bJ = i2;
        W();
        V();
        Bitmap bitmap = this.cC;
        if (bitmap != null) {
            this.cC = Bitmap.createScaledBitmap(bitmap, getWidth(), getHeight(), false);
        }
        invalidate();
    }

    public void setAnimationStateChangedListener(b bVar) {
        this.cH = bVar;
    }

    public int getUnitSize() {
        return this.bQ;
    }

    public void setUnitSize(@IntRange(from = 0) int i) {
        this.bQ = i;
        this.cg.setTextSize((float) i);
    }

    public void setSeekModeEnabled(boolean z) {
        this.cF = z;
    }

    public Cap getSpinnerStrokeCap() {
        return this.cb;
    }

    public void setSpinnerStrokeCap(Cap cap) {
        this.cb = cap;
        this.cd.setStrokeCap(cap);
    }

    public Cap getBarStrokeCap() {
        return this.ca;
    }

    public void setBarStrokeCap(Cap cap) {
        this.ca = cap;
        this.cc.setStrokeCap(cap);
    }

    public int getContourColor() {
        return this.bU;
    }

    public void setContourColor(@ColorInt int i) {
        this.bU = i;
        this.ch.setColor(i);
    }

    public float getContourSize() {
        return this.bP;
    }

    public void setContourSize(@FloatRange(from = 0.0d) float f) {
        this.bP = f;
        this.ch.setStrokeWidth(f);
    }

    public void setText(String str) {
        if (str == null) {
            str = "";
        }
        this.cw = str;
        invalidate();
    }

    public void setTextMode(TextMode textMode) {
        this.cz = textMode;
    }

    public String getUnit() {
        return this.cx;
    }

    public void setUnit(String str) {
        if (str == null) {
            this.cx = "";
        } else {
            this.cx = str;
        }
        invalidate();
    }

    private RectF b(String str, Paint paint, RectF rectF) {
        Rect rect = new Rect();
        paint.getTextBounds(str, 0, str.length(), rect);
        RectF rectF2 = new RectF();
        rectF2.left = rectF.left + ((rectF.width() - ((float) rect.width())) / 2.0f);
        rectF2.top = rectF.top + ((rectF.height() - ((float) rect.height())) / 2.0f);
        rectF2.right = rectF2.left + ((float) rect.width());
        rectF2.bottom = rectF2.top + ((float) rect.height());
        return rectF2;
    }

    public int getTextSize() {
        return this.mTextSize;
    }

    public void setTextSize(@IntRange(from = 0) int i) {
        this.mTextPaint.setTextSize((float) i);
        this.mTextSize = i;
        this.cA = false;
    }

    public void setAutoTextSize(boolean z) {
        this.cA = z;
    }

    public int getPaddingTop() {
        return this.mPaddingTop;
    }

    public void setPaddingTop(int i) {
        this.mPaddingTop = i;
    }

    public int getPaddingBottom() {
        return this.mPaddingBottom;
    }

    public void setPaddingBottom(int i) {
        this.mPaddingBottom = i;
    }

    public int getPaddingLeft() {
        return this.mPaddingLeft;
    }

    public void setPaddingLeft(int i) {
        this.mPaddingLeft = i;
    }

    public int getPaddingRight() {
        return this.mPaddingRight;
    }

    public void setPaddingRight(int i) {
        this.mPaddingRight = i;
    }

    public int getCircleRadius() {
        return this.bL;
    }

    public boolean N() {
        return this.cB;
    }

    public void setShowUnit(boolean z) {
        if (z != this.cB) {
            this.cB = z;
            this.cy = 0;
            this.cl = a(this.ci);
            invalidate();
        }
    }

    public float getUnitScale() {
        return this.bS;
    }

    public void setUnitScale(@FloatRange(from = 0.0d) float f) {
        this.bS = f;
    }

    public float getTextScale() {
        return this.bR;
    }

    public void setTextScale(@FloatRange(from = 0.0d) float f) {
        this.bR = f;
    }

    public void setSpinningBarLength(@FloatRange(from = 0.0d) float f) {
        this.bH = f;
        this.bG = f;
    }

    public int getBarWidth() {
        return this.bM;
    }

    public void setBarWidth(@IntRange(from = 0) int i) {
        this.bM = i;
        float f = (float) i;
        this.cc.setStrokeWidth(f);
        this.cd.setStrokeWidth(f);
    }

    public int[] getBarColors() {
        return this.bZ;
    }

    public void setBarColor(@ColorInt int... iArr) {
        this.bZ = iArr;
        int[] iArr2 = this.bZ;
        if (iArr2.length > 1) {
            this.cc.setShader(new SweepGradient(this.ci.centerX(), this.ci.centerY(), this.bZ, null));
            Matrix matrix = new Matrix();
            this.cc.getShader().getLocalMatrix(matrix);
            matrix.postTranslate(-this.ci.centerX(), -this.ci.centerY());
            matrix.postRotate((float) this.bO);
            matrix.postTranslate(this.ci.centerX(), this.ci.centerY());
            this.cc.getShader().setLocalMatrix(matrix);
            this.cc.setColor(iArr[0]);
        } else if (iArr2.length == 0) {
            this.cc.setColor(iArr2[0]);
            this.cc.setShader(null);
        } else {
            this.cc.setColor(this.bT);
            this.cc.setShader(null);
        }
    }

    public void setSpinBarColor(@ColorInt int i) {
        this.bV = i;
        this.cd.setColor(this.bV);
    }

    public int getBackgroundCircleColor() {
        return this.ce.getColor();
    }

    public void setFillCircleColor(@ColorInt int i) {
        this.bW = i;
        this.ce.setColor(i);
    }

    public int getRimColor() {
        return this.bX;
    }

    public void setRimColor(@ColorInt int i) {
        this.bX = i;
        this.cf.setColor(i);
    }

    public Shader getRimShader() {
        return this.cf.getShader();
    }

    public void setRimShader(Shader shader) {
        this.cf.setShader(shader);
    }

    private int a(double d) {
        int[] iArr = this.bZ;
        if (iArr.length <= 1) {
            return iArr.length == 1 ? iArr[0] : ViewCompat.MEASURED_STATE_MASK;
        } else {
            int[] iArr2;
            double maxValue = (1.0d / getMaxValue()) * d;
            d = (double) (this.bZ.length - 1);
            Double.isNaN(d);
            int floor = (int) Math.floor(d * maxValue);
            int i = floor + 1;
            if (floor < 0) {
                floor = 0;
                i = 1;
            } else {
                iArr2 = this.bZ;
                if (i >= iArr2.length) {
                    floor = iArr2.length - 2;
                    i = iArr2.length - 1;
                }
            }
            iArr2 = this.bZ;
            floor = iArr2[floor];
            i = iArr2[i];
            double length = (double) (iArr2.length - 1);
            Double.isNaN(length);
            return d.a(floor, i, (float) (1.0d - ((length * maxValue) % 1.0d)));
        }
    }

    public double getMaxValue() {
        return (double) this.mMaxValue;
    }

    public void setMaxValue(@FloatRange(from = 0.0d) float f) {
        this.mMaxValue = f;
    }

    public int getTextColor() {
        return this.mTextColor;
    }

    public void setTextColor(@ColorInt int i) {
        this.mTextColor = i;
        this.mTextPaint.setColor(i);
    }

    public void setAutoTextColor(boolean z) {
        this.bY = z;
    }

    public void setUnitColor(@ColorInt int i) {
        this.cg.setColor(i);
        this.bY = false;
    }

    public float getSpinSpeed() {
        return this.cq;
    }

    public void setSpinSpeed(float f) {
        this.cq = f;
    }

    public int getRimWidth() {
        return this.bN;
    }

    public void setRimWidth(@IntRange(from = 0) int i) {
        this.bN = i;
        this.cf.setStrokeWidth((float) i);
    }

    public int getDelayMillis() {
        return this.cs;
    }

    public void setDelayMillis(int i) {
        this.cs = i;
    }

    @TargetApi(11)
    public void setClippingBitmap(Bitmap bitmap) {
        if (getWidth() <= 0 || getHeight() <= 0) {
            this.cC = bitmap;
        } else {
            this.cC = Bitmap.createScaledBitmap(bitmap, getWidth(), getHeight(), false);
        }
        if (this.cC == null) {
            setLayerType(2, null);
        } else {
            setLayerType(1, null);
        }
    }

    public void setTextTypeface(Typeface typeface) {
        this.mTextPaint.setTypeface(typeface);
    }

    public void setUnitTextTypeface(Typeface typeface) {
        this.cg.setTypeface(typeface);
    }

    public float getRelativeUniteSize() {
        return this.cE;
    }

    public void setRelativeUniteSize(@FloatRange(from = 0.0d) float f) {
        this.cE = f;
    }

    public void setShowTextWhileSpinning(boolean z) {
        this.cG = z;
    }

    public int getStartAngle() {
        return this.bO;
    }

    public void setStartAngle(int i) {
        this.bO = (int) c((float) i);
    }

    public void setShowBlock(boolean z) {
        this.cI = z;
    }

    public void setBlockCount(int i) {
        if (i > 1) {
            this.cI = true;
            this.cJ = i;
            this.cL = 360.0f / ((float) i);
            this.cM = this.cL * this.cK;
            return;
        }
        this.cI = false;
    }

    public void setBlockScale(float f) {
        if (f >= 0.0f && f <= 1.0f) {
            this.cK = f;
            this.cM = this.cL * f;
        }
    }

    public int getBlockCount() {
        return this.cJ;
    }

    public float getBlockScale() {
        return this.cK;
    }

    public void O() {
        V();
        U();
        P();
        Q();
        R();
        S();
        T();
    }

    private void P() {
        this.ch.setColor(this.bU);
        this.ch.setAntiAlias(true);
        this.ch.setStyle(Style.STROKE);
        this.ch.setStrokeWidth(this.bP);
    }

    private void Q() {
        this.cg.setStyle(Style.FILL);
        this.cg.setAntiAlias(true);
    }

    private void R() {
        this.mTextPaint.setSubpixelText(true);
        this.mTextPaint.setLinearText(true);
        this.mTextPaint.setTypeface(Typeface.MONOSPACE);
        this.mTextPaint.setColor(this.mTextColor);
        this.mTextPaint.setStyle(Style.FILL);
        this.mTextPaint.setAntiAlias(true);
        this.mTextPaint.setTextSize((float) this.mTextSize);
    }

    private void S() {
        this.ce.setColor(this.bW);
        this.ce.setAntiAlias(true);
        this.ce.setStyle(Style.FILL);
    }

    private void T() {
        this.cf.setColor(this.bX);
        this.cf.setAntiAlias(true);
        this.cf.setStyle(Style.STROKE);
        this.cf.setStrokeWidth((float) this.bN);
    }

    private void U() {
        this.cd.setAntiAlias(true);
        this.cd.setStrokeCap(this.cb);
        this.cd.setStyle(Style.STROKE);
        this.cd.setStrokeWidth((float) this.bM);
        this.cd.setColor(this.bV);
    }

    private void V() {
        int[] iArr = this.bZ;
        if (iArr.length > 1) {
            this.cc.setShader(new SweepGradient(this.ci.centerX(), this.ci.centerY(), this.bZ, null));
            Matrix matrix = new Matrix();
            this.cc.getShader().getLocalMatrix(matrix);
            matrix.postTranslate(-this.ci.centerX(), -this.ci.centerY());
            matrix.postRotate((float) this.bO);
            matrix.postTranslate(this.ci.centerX(), this.ci.centerY());
            this.cc.getShader().setLocalMatrix(matrix);
        } else {
            this.cc.setColor(iArr[0]);
            this.cc.setShader(null);
        }
        this.cc.setAntiAlias(true);
        this.cc.setStrokeCap(this.ca);
        this.cc.setStyle(Style.STROKE);
        this.cc.setStrokeWidth((float) this.bM);
    }

    private void W() {
        int min = Math.min(this.bK, this.bJ);
        int i = this.bK - min;
        int i2 = (this.bJ - min) / 2;
        this.mPaddingTop = getPaddingTop() + i2;
        this.mPaddingBottom = getPaddingBottom() + i2;
        i /= 2;
        this.mPaddingLeft = getPaddingLeft() + i;
        this.mPaddingRight = getPaddingRight() + i;
        min = getWidth();
        i = getHeight();
        int i3 = this.mPaddingLeft;
        int i4 = this.bM;
        this.ci = new RectF((float) (i3 + i4), (float) (this.mPaddingTop + i4), (float) ((min - this.mPaddingRight) - i4), (float) ((i - this.mPaddingBottom) - i4));
        float f = (float) this.mPaddingLeft;
        i4 = this.bM;
        this.cj = new RectF(f + (((float) i4) * 1.5f), ((float) this.mPaddingTop) + (((float) i4) * 1.5f), ((float) (min - this.mPaddingRight)) - (((float) i4) * 1.5f), ((float) (i - this.mPaddingBottom)) - (((float) i4) * 1.5f));
        this.cl = a(this.ci);
        this.cp = new RectF((this.ci.left + (((float) this.bN) / 2.0f)) + (this.bP / 2.0f), (this.ci.top + (((float) this.bN) / 2.0f)) + (this.bP / 2.0f), (this.ci.right - (((float) this.bN) / 2.0f)) - (this.bP / 2.0f), (this.ci.bottom - (((float) this.bN) / 2.0f)) - (this.bP / 2.0f));
        this.co = new RectF((this.ci.left - (((float) this.bN) / 2.0f)) - (this.bP / 2.0f), (this.ci.top - (((float) this.bN) / 2.0f)) - (this.bP / 2.0f), (this.ci.right + (((float) this.bN) / 2.0f)) + (this.bP / 2.0f), (this.ci.bottom + (((float) this.bN) / 2.0f)) + (this.bP / 2.0f));
        min -= this.mPaddingRight;
        i = this.bM;
        this.bL = (((min - i) / 2) - i) + 1;
        this.ck = new PointF(this.ci.centerX(), this.ci.centerY());
    }

    /* Access modifiers changed, original: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f = (360.0f / this.mMaxValue) * this.bD;
        if (this.bW != 0) {
            canvas.drawArc(this.cj, 360.0f, 360.0f, false, this.ce);
        }
        if (this.bN > 0) {
            if (this.cI) {
                a(canvas, this.ci, (float) this.bO, 360.0f, false, this.cf);
            } else {
                canvas.drawArc(this.ci, 360.0f, 360.0f, false, this.cf);
            }
        }
        if (this.bP > 0.0f) {
            Canvas canvas2 = canvas;
            canvas2.drawArc(this.co, 360.0f, 360.0f, false, this.ch);
            canvas2.drawArc(this.cp, 360.0f, 360.0f, false, this.ch);
        }
        if (this.cv == AnimationState.SPINNING || this.cv == AnimationState.END_SPINNING) {
            b(canvas);
            if (this.cG) {
                c(canvas);
            }
        } else if (this.cv == AnimationState.END_SPINNING_START_ANIMATING) {
            b(canvas);
            if (this.ct) {
                a(canvas, f);
                c(canvas);
            } else if (this.cG) {
                c(canvas);
            }
        } else {
            a(canvas, f);
            c(canvas);
        }
        Bitmap bitmap = this.cC;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.cD);
        }
    }

    private void b(Canvas canvas) {
        if (this.bG < 0.0f) {
            this.bG = 1.0f;
        }
        float f = ((float) this.bO) + this.bI;
        float f2 = this.bG;
        Canvas canvas2 = canvas;
        canvas2.drawArc(this.ci, f - f2, f2, false, this.cd);
    }

    private void a(Canvas canvas, float f) {
        if (this.cI) {
            a(canvas, this.ci, (float) this.bO, f, false, this.cc);
            return;
        }
        canvas.drawArc(this.ci, (float) this.bO, f, false, this.cc);
    }

    private void a(Canvas canvas, RectF rectF, float f, float f2, boolean z, Paint paint) {
        float f3 = 0.0f;
        while (f3 < f2) {
            canvas.drawArc(rectF, f + f3, Math.min(this.cM, f2 - f3), z, paint);
            f3 += this.cL;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:43:? A:{SYNTHETIC, RETURN} */
    private void c(android.graphics.Canvas r13) {
        /*
        r12 = this;
        r0 = r12.bY;
        if (r0 == 0) goto L_0x0010;
    L_0x0004:
        r0 = r12.mTextPaint;
        r1 = r12.bD;
        r1 = (double) r1;
        r1 = r12.a(r1);
        r0.setColor(r1);
    L_0x0010:
        r0 = at.grabner.circleprogress.c.AnonymousClass1.a;
        r1 = r12.cz;
        r1 = r1.ordinal();
        r0 = r0[r1];
        r1 = 1;
        if (r0 == r1) goto L_0x0033;
    L_0x001d:
        r2 = 2;
        if (r0 == r2) goto L_0x0028;
    L_0x0020:
        r0 = r12.cw;
        if (r0 == 0) goto L_0x0025;
    L_0x0024:
        goto L_0x0044;
    L_0x0025:
        r0 = "";
        goto L_0x0044;
    L_0x0028:
        r0 = r12.bD;
        r0 = java.lang.Math.round(r0);
        r0 = java.lang.String.valueOf(r0);
        goto L_0x0044;
    L_0x0033:
        r0 = 1120403456; // 0x42c80000 float:100.0 double:5.53552857E-315;
        r2 = r12.mMaxValue;
        r0 = r0 / r2;
        r2 = r12.bD;
        r0 = r0 * r2;
        r0 = java.lang.Math.round(r0);
        r0 = java.lang.String.valueOf(r0);
    L_0x0044:
        r2 = r12.cA;
        r3 = 1065604874; // 0x3f83d70a float:1.03 double:5.264787603E-315;
        r4 = 1028443341; // 0x3d4ccccd float:0.05 double:5.081185235E-315;
        r5 = 0;
        if (r2 == 0) goto L_0x00d4;
    L_0x004f:
        r2 = r12.cy;
        r6 = r0.length();
        if (r2 == r6) goto L_0x0151;
    L_0x0057:
        r2 = r0.length();
        r12.cy = r2;
        r2 = r12.cy;
        if (r2 != r1) goto L_0x008e;
    L_0x0061:
        r2 = new android.graphics.RectF;
        r6 = r12.cl;
        r6 = r6.left;
        r7 = r12.cl;
        r7 = r7.width();
        r8 = 1036831949; // 0x3dcccccd float:0.1 double:5.122630465E-315;
        r7 = r7 * r8;
        r6 = r6 + r7;
        r7 = r12.cl;
        r7 = r7.top;
        r9 = r12.cl;
        r9 = r9.right;
        r10 = r12.cl;
        r10 = r10.width();
        r10 = r10 * r8;
        r9 = r9 - r10;
        r8 = r12.cl;
        r8 = r8.bottom;
        r2.<init>(r6, r7, r9, r8);
        r12.cl = r2;
        goto L_0x0096;
    L_0x008e:
        r2 = r12.ci;
        r2 = r12.a(r2);
        r12.cl = r2;
    L_0x0096:
        r2 = r12.cl;
        r6 = r12.cB;
        if (r6 == 0) goto L_0x00bd;
    L_0x009c:
        r6 = new android.graphics.RectF;
        r2 = r2.left;
        r7 = r12.cl;
        r7 = r7.top;
        r8 = r12.cl;
        r8 = r8.right;
        r9 = r12.cl;
        r9 = r9.width();
        r10 = r12.cE;
        r9 = r9 * r10;
        r9 = r9 * r3;
        r8 = r8 - r9;
        r9 = r12.cl;
        r9 = r9.bottom;
        r6.<init>(r2, r7, r8, r9);
        r2 = r6;
    L_0x00bd:
        r6 = r12.mTextPaint;
        r7 = a(r0, r6, r2);
        r8 = r12.bR;
        r7 = r7 * r8;
        r6.setTextSize(r7);
        r6 = r12.mTextPaint;
        r2 = r12.b(r0, r6, r2);
        r12.cm = r2;
        goto L_0x0152;
    L_0x00d4:
        r2 = r12.cy;
        r6 = r0.length();
        if (r2 == r6) goto L_0x0151;
    L_0x00dc:
        r2 = r0.length();
        r12.cy = r2;
        r2 = r12.mTextPaint;
        r6 = r12.mTextSize;
        r6 = (float) r6;
        r2.setTextSize(r6);
        r2 = r12.mTextPaint;
        r6 = r12.ci;
        r2 = r12.b(r0, r2, r6);
        r12.cl = r2;
        r12.cm = r2;
        r2 = r12.cB;
        if (r2 == 0) goto L_0x0152;
    L_0x00fa:
        r2 = r12.cg;
        r6 = r12.bQ;
        r6 = (float) r6;
        r2.setTextSize(r6);
        r2 = r12.cx;
        r6 = r12.cg;
        r7 = r12.ci;
        r2 = r12.b(r2, r6, r7);
        r12.cn = r2;
        r2 = r12.cj;
        r2 = r2.width();
        r2 = r2 * r4;
        r6 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r2 = r2 / r6;
        r7 = new android.graphics.RectF;
        r8 = r12.cl;
        r8 = r8.left;
        r9 = r12.cn;
        r9 = r9.width();
        r9 = r9 / r6;
        r8 = r8 - r9;
        r8 = r8 - r2;
        r9 = r12.cl;
        r9 = r9.top;
        r10 = r12.cl;
        r10 = r10.right;
        r11 = r12.cn;
        r11 = r11.width();
        r11 = r11 / r6;
        r10 = r10 + r11;
        r10 = r10 + r2;
        r11 = r12.cl;
        r11 = r11.bottom;
        r7.<init>(r8, r9, r10, r11);
        r12.cl = r7;
        r7 = r12.cm;
        r8 = r12.cn;
        r8 = r8.width();
        r8 = r8 / r6;
        r6 = -r8;
        r6 = r6 - r2;
        r7.offset(r6, r5);
        goto L_0x0152;
    L_0x0151:
        r1 = 0;
    L_0x0152:
        r2 = r12.cm;
        r2 = r2.left;
        r6 = r12.mTextPaint;
        r6 = r6.getTextSize();
        r7 = 1035489772; // 0x3db851ec float:0.09 double:5.11599923E-315;
        r6 = r6 * r7;
        r2 = r2 - r6;
        r6 = r12.cm;
        r6 = r6.bottom;
        r7 = r12.mTextPaint;
        r13.drawText(r0, r2, r6, r7);
        r0 = r12.cB;
        if (r0 == 0) goto L_0x0212;
    L_0x016f:
        r0 = r12.bY;
        if (r0 == 0) goto L_0x017f;
    L_0x0173:
        r0 = r12.cg;
        r2 = r12.bD;
        r6 = (double) r2;
        r2 = r12.a(r6);
        r0.setColor(r2);
    L_0x017f:
        if (r1 == 0) goto L_0x0203;
    L_0x0181:
        r0 = r12.cA;
        if (r0 == 0) goto L_0x01ca;
    L_0x0185:
        r0 = new android.graphics.RectF;
        r1 = r12.cl;
        r1 = r1.left;
        r2 = r12.cl;
        r2 = r2.width();
        r4 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r6 = r12.cE;
        r4 = r4 - r6;
        r2 = r2 * r4;
        r2 = r2 * r3;
        r1 = r1 + r2;
        r2 = r12.cl;
        r2 = r2.top;
        r3 = r12.cl;
        r3 = r3.right;
        r4 = r12.cl;
        r4 = r4.bottom;
        r0.<init>(r1, r2, r3, r4);
        r12.cn = r0;
        r0 = r12.cg;
        r1 = r12.cx;
        r2 = r12.cn;
        r1 = a(r1, r0, r2);
        r2 = r12.bS;
        r1 = r1 * r2;
        r0.setTextSize(r1);
        r0 = r12.cx;
        r1 = r12.cg;
        r2 = r12.cn;
        r0 = r12.b(r0, r1, r2);
        r12.cn = r0;
        goto L_0x01f5;
    L_0x01ca:
        r0 = r12.cj;
        r0 = r0.width();
        r0 = r0 * r4;
        r1 = r12.cg;
        r2 = r12.bQ;
        r2 = (float) r2;
        r1.setTextSize(r2);
        r1 = r12.cx;
        r2 = r12.cg;
        r3 = r12.ci;
        r1 = r12.b(r1, r2, r3);
        r12.cn = r1;
        r1 = r12.cm;
        r1 = r1.right;
        r2 = r12.cn;
        r2 = r2.left;
        r1 = r1 - r2;
        r1 = r1 + r0;
        r0 = r12.cn;
        r0.offset(r1, r5);
    L_0x01f5:
        r0 = r12.cm;
        r0 = r0.top;
        r1 = r12.cn;
        r1 = r1.top;
        r0 = r0 - r1;
        r1 = r12.cn;
        r1.offset(r5, r0);
    L_0x0203:
        r0 = r12.cx;
        r1 = r12.cn;
        r1 = r1.left;
        r2 = r12.cn;
        r2 = r2.bottom;
        r3 = r12.cg;
        r13.drawText(r0, r1, r2, r3);
    L_0x0212:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: at.grabner.circleprogress.c.c(android.graphics.Canvas):void");
    }

    public void setValue(float f) {
        Message message = new Message();
        message.what = a.SET_VALUE.ordinal();
        message.obj = new float[]{f, f};
        this.cu.sendMessage(message);
    }

    public void a(float f, long j) {
        this.cr = (double) j;
        Message message = new Message();
        message.what = a.SET_VALUE_ANIMATED.ordinal();
        message.obj = new float[]{this.bD, f};
        this.cu.sendMessage(message);
    }

    public void setValueAnimated(float f) {
        this.cr = 1200.0d;
        Message message = new Message();
        message.what = a.SET_VALUE_ANIMATED.ordinal();
        message.obj = new float[]{this.bD, f};
        this.cu.sendMessage(message);
    }

    public boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
        if (!this.cF) {
            return super.onTouchEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        double a;
        double d;
        if (actionMasked == 0 || actionMasked == 1) {
            this.cN = 0;
            a = a(this.ck, new PointF(motionEvent.getX(), motionEvent.getY()));
            d = (double) this.bO;
            Double.isNaN(d);
            a((this.mMaxValue / 360.0f) * c((float) Math.round(a - d)), 800);
            return true;
        } else if (actionMasked == 2) {
            this.cN++;
            if (this.cN <= 5) {
                return false;
            }
            a = a(this.ck, new PointF(motionEvent.getX(), motionEvent.getY()));
            d = (double) this.bO;
            Double.isNaN(d);
            setValue((this.mMaxValue / 360.0f) * c((float) Math.round(a - d)));
            return true;
        } else if (actionMasked != 3) {
            return super.onTouchEvent(motionEvent);
        } else {
            this.cN = 0;
            return false;
        }
    }

    public static double a(PointF pointF, PointF pointF2) {
        double toDegrees = Math.toDegrees(Math.atan2((double) (pointF2.y - pointF.y), (double) (pointF2.x - pointF.x)));
        return toDegrees < 0.0d ? toDegrees + 360.0d : toDegrees;
    }
}
