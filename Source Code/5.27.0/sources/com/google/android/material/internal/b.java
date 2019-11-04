package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.RestrictTo;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.R;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.math.MathUtils;
import androidx.core.text.TextDirectionHeuristicsCompat;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.a.a;

@RestrictTo({Scope.LIBRARY_GROUP})
/* compiled from: CollapsingTextHelper */
public final class b {
    private static final Paint JA = null;
    private static final boolean Jz = (VERSION.SDK_INT < 18);
    private boolean JB;
    private float JC;
    private final Rect JD;
    private final Rect JF;
    private final RectF JG;
    private int JH = 16;
    private int JI = 16;
    private float JJ = 15.0f;
    private float JK = 15.0f;
    private ColorStateList JL;
    private ColorStateList JN;
    private float JQ;
    private float JR;
    private float JS;
    private float JT;
    private float JU;
    private float JV;
    private Typeface JW;
    private Typeface JX;
    private Typeface JY;
    private CharSequence JZ;
    private boolean Ka;
    private boolean Kb;
    private Bitmap Kc;
    private Paint Kd;
    private float Ke;
    private float Kf;
    private float Kg;
    private int[] Kh;
    private boolean Ki;
    private final TextPaint Kj;
    private final TextPaint Kk;
    private TimeInterpolator Kl;
    private TimeInterpolator Km;
    private float Kn;
    private float Ko;
    private float Kp;
    private int Kq;
    private float Kr;
    private float Ks;
    private float Kt;
    private int Ku;
    private float dM;
    private CharSequence text;
    private final View view;

    static {
        Paint paint = JA;
        if (paint != null) {
            paint.setAntiAlias(true);
            JA.setColor(-65281);
        }
    }

    public b(View view) {
        this.view = view;
        this.Kj = new TextPaint(129);
        this.Kk = new TextPaint(this.Kj);
        this.JF = new Rect();
        this.JD = new Rect();
        this.JG = new RectF();
    }

    public void a(TimeInterpolator timeInterpolator) {
        this.Km = timeInterpolator;
        nW();
    }

    public void b(TimeInterpolator timeInterpolator) {
        this.Kl = timeInterpolator;
        nW();
    }

    public void u(float f) {
        if (this.JJ != f) {
            this.JJ = f;
            nW();
        }
    }

    public void b(ColorStateList colorStateList) {
        if (this.JN != colorStateList) {
            this.JN = colorStateList;
            nW();
        }
    }

    public void c(ColorStateList colorStateList) {
        if (this.JL != colorStateList) {
            this.JL = colorStateList;
            nW();
        }
    }

    public void b(int i, int i2, int i3, int i4) {
        if (!a(this.JD, i, i2, i3, i4)) {
            this.JD.set(i, i2, i3, i4);
            this.Ki = true;
            nP();
        }
    }

    public void c(int i, int i2, int i3, int i4) {
        if (!a(this.JF, i, i2, i3, i4)) {
            this.JF.set(i, i2, i3, i4);
            this.Ki = true;
            nP();
        }
    }

    public float nN() {
        if (this.text == null) {
            return 0.0f;
        }
        a(this.Kk);
        TextPaint textPaint = this.Kk;
        CharSequence charSequence = this.text;
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    public float nO() {
        a(this.Kk);
        return -this.Kk.ascent();
    }

    public void b(RectF rectF) {
        float nN;
        boolean e = e(this.text);
        if (e) {
            nN = ((float) this.JF.right) - nN();
        } else {
            nN = (float) this.JF.left;
        }
        rectF.left = nN;
        rectF.top = (float) this.JF.top;
        rectF.right = !e ? rectF.left + nN() : (float) this.JF.right;
        rectF.bottom = ((float) this.JF.top) + nO();
    }

    private void a(TextPaint textPaint) {
        textPaint.setTextSize(this.JK);
        textPaint.setTypeface(this.JW);
    }

    /* Access modifiers changed, original: 0000 */
    public void nP() {
        boolean z = this.JF.width() > 0 && this.JF.height() > 0 && this.JD.width() > 0 && this.JD.height() > 0;
        this.JB = z;
    }

    public void aJ(int i) {
        if (this.JH != i) {
            this.JH = i;
            nW();
        }
    }

    public void aK(int i) {
        if (this.JI != i) {
            this.JI = i;
            nW();
        }
    }

    public void aL(int i) {
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(this.view.getContext(), i, R.styleable.TextAppearance);
        if (obtainStyledAttributes.hasValue(R.styleable.TextAppearance_android_textColor)) {
            this.JN = obtainStyledAttributes.getColorStateList(R.styleable.TextAppearance_android_textColor);
        }
        if (obtainStyledAttributes.hasValue(R.styleable.TextAppearance_android_textSize)) {
            this.JK = (float) obtainStyledAttributes.getDimensionPixelSize(R.styleable.TextAppearance_android_textSize, (int) this.JK);
        }
        this.Kq = obtainStyledAttributes.getInt(R.styleable.TextAppearance_android_shadowColor, 0);
        this.Ko = obtainStyledAttributes.getFloat(R.styleable.TextAppearance_android_shadowDx, 0.0f);
        this.Kp = obtainStyledAttributes.getFloat(R.styleable.TextAppearance_android_shadowDy, 0.0f);
        this.Kn = obtainStyledAttributes.getFloat(R.styleable.TextAppearance_android_shadowRadius, 0.0f);
        obtainStyledAttributes.recycle();
        if (VERSION.SDK_INT >= 16) {
            this.JW = aM(i);
        }
        nW();
    }

    private Typeface aM(int i) {
        TypedArray obtainStyledAttributes = this.view.getContext().obtainStyledAttributes(i, new int[]{16843692});
        try {
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                Typeface create = Typeface.create(string, 0);
                return create;
            }
            obtainStyledAttributes.recycle();
            return null;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public void b(Typeface typeface) {
        this.JX = typeface;
        this.JW = typeface;
        nW();
    }

    public void v(float f) {
        f = MathUtils.clamp(f, 0.0f, 1.0f);
        if (f != this.JC) {
            this.JC = f;
            nR();
        }
    }

    public final boolean setState(int[] iArr) {
        this.Kh = iArr;
        if (!isStateful()) {
            return false;
        }
        nW();
        return true;
    }

    public final boolean isStateful() {
        ColorStateList colorStateList = this.JN;
        if (colorStateList == null || !colorStateList.isStateful()) {
            colorStateList = this.JL;
            if (colorStateList == null || !colorStateList.isStateful()) {
                return false;
            }
        }
        return true;
    }

    public float nQ() {
        return this.JC;
    }

    private void nR() {
        w(this.JC);
    }

    private void w(float f) {
        A(f);
        this.JU = a(this.JS, this.JT, f, this.Kl);
        this.JV = a(this.JQ, this.JR, f, this.Kl);
        B(a(this.JJ, this.JK, f, this.Km));
        if (this.JN != this.JL) {
            this.Kj.setColor(c(nS(), nT(), f));
        } else {
            this.Kj.setColor(nT());
        }
        this.Kj.setShadowLayer(a(this.Kr, this.Kn, f, null), a(this.Ks, this.Ko, f, null), a(this.Kt, this.Kp, f, null), c(this.Ku, this.Kq, f));
        ViewCompat.postInvalidateOnAnimation(this.view);
    }

    @ColorInt
    private int nS() {
        int[] iArr = this.Kh;
        if (iArr != null) {
            return this.JL.getColorForState(iArr, 0);
        }
        return this.JL.getDefaultColor();
    }

    @VisibleForTesting
    @ColorInt
    public int nT() {
        int[] iArr = this.Kh;
        if (iArr != null) {
            return this.JN.getColorForState(iArr, 0);
        }
        return this.JN.getDefaultColor();
    }

    private void nU() {
        float f = this.Kg;
        C(this.JK);
        CharSequence charSequence = this.JZ;
        float f2 = 0.0f;
        float measureText = charSequence != null ? this.Kj.measureText(charSequence, 0, charSequence.length()) : 0.0f;
        int absoluteGravity = GravityCompat.getAbsoluteGravity(this.JI, this.Ka);
        int i = absoluteGravity & 112;
        if (i == 48) {
            this.JR = ((float) this.JF.top) - this.Kj.ascent();
        } else if (i != 80) {
            this.JR = ((float) this.JF.centerY()) + (((this.Kj.descent() - this.Kj.ascent()) / 2.0f) - this.Kj.descent());
        } else {
            this.JR = (float) this.JF.bottom;
        }
        absoluteGravity &= GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK;
        if (absoluteGravity == 1) {
            this.JT = ((float) this.JF.centerX()) - (measureText / 2.0f);
        } else if (absoluteGravity != 5) {
            this.JT = (float) this.JF.left;
        } else {
            this.JT = ((float) this.JF.right) - measureText;
        }
        C(this.JJ);
        charSequence = this.JZ;
        if (charSequence != null) {
            f2 = this.Kj.measureText(charSequence, 0, charSequence.length());
        }
        int absoluteGravity2 = GravityCompat.getAbsoluteGravity(this.JH, this.Ka);
        int i2 = absoluteGravity2 & 112;
        if (i2 == 48) {
            this.JQ = ((float) this.JD.top) - this.Kj.ascent();
        } else if (i2 != 80) {
            this.JQ = ((float) this.JD.centerY()) + (((this.Kj.descent() - this.Kj.ascent()) / 2.0f) - this.Kj.descent());
        } else {
            this.JQ = (float) this.JD.bottom;
        }
        absoluteGravity2 &= GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK;
        if (absoluteGravity2 == 1) {
            this.JS = ((float) this.JD.centerX()) - (f2 / 2.0f);
        } else if (absoluteGravity2 != 5) {
            this.JS = (float) this.JD.left;
        } else {
            this.JS = ((float) this.JD.right) - f2;
        }
        nX();
        B(f);
    }

    private void A(float f) {
        this.JG.left = a((float) this.JD.left, (float) this.JF.left, f, this.Kl);
        this.JG.top = a(this.JQ, this.JR, f, this.Kl);
        this.JG.right = a((float) this.JD.right, (float) this.JF.right, f, this.Kl);
        this.JG.bottom = a((float) this.JD.bottom, (float) this.JF.bottom, f, this.Kl);
    }

    public void draw(Canvas canvas) {
        int save = canvas.save();
        if (this.JZ != null && this.JB) {
            float f;
            float f2 = this.JU;
            float f3 = this.JV;
            Object obj = (!this.Kb || this.Kc == null) ? null : 1;
            float f4;
            if (obj != null) {
                f = this.Ke * this.dM;
                f4 = this.Kf;
            } else {
                f = this.Kj.ascent() * this.dM;
                this.Kj.descent();
                f4 = this.dM;
            }
            if (obj != null) {
                f3 += f;
            }
            float f5 = f3;
            f3 = this.dM;
            if (f3 != 1.0f) {
                canvas.scale(f3, f3, f2, f5);
            }
            if (obj != null) {
                canvas.drawBitmap(this.Kc, f2, f5, this.Kd);
            } else {
                CharSequence charSequence = this.JZ;
                canvas.drawText(charSequence, 0, charSequence.length(), f2, f5, this.Kj);
            }
        }
        canvas.restoreToCount(save);
    }

    private boolean e(CharSequence charSequence) {
        Object obj = 1;
        if (ViewCompat.getLayoutDirection(this.view) != 1) {
            obj = null;
        }
        return (obj != null ? TextDirectionHeuristicsCompat.FIRSTSTRONG_RTL : TextDirectionHeuristicsCompat.FIRSTSTRONG_LTR).isRtl(charSequence, 0, charSequence.length());
    }

    private void B(float f) {
        C(f);
        boolean z = Jz && this.dM != 1.0f;
        this.Kb = z;
        if (this.Kb) {
            nV();
        }
        ViewCompat.postInvalidateOnAnimation(this.view);
    }

    private void C(float f) {
        if (this.text != null) {
            float f2;
            Object obj;
            float width = (float) this.JF.width();
            float width2 = (float) this.JD.width();
            boolean z = true;
            if (i(f, this.JK)) {
                Object obj2;
                f = this.JK;
                this.dM = 1.0f;
                Typeface typeface = this.JY;
                Typeface typeface2 = this.JW;
                if (typeface != typeface2) {
                    this.JY = typeface2;
                    obj2 = 1;
                } else {
                    obj2 = null;
                }
                f2 = f;
                obj = obj2;
            } else {
                f2 = this.JJ;
                Typeface typeface3 = this.JY;
                Typeface typeface4 = this.JX;
                if (typeface3 != typeface4) {
                    this.JY = typeface4;
                    obj = 1;
                } else {
                    obj = null;
                }
                if (i(f, this.JJ)) {
                    this.dM = 1.0f;
                } else {
                    this.dM = f / this.JJ;
                }
                f = this.JK / this.JJ;
                width = width2 * f > width ? Math.min(width / f, width2) : width2;
            }
            if (width > 0.0f) {
                obj = (this.Kg == f2 && !this.Ki && obj == null) ? null : 1;
                this.Kg = f2;
                this.Ki = false;
            }
            if (this.JZ == null || r6 != null) {
                this.Kj.setTextSize(this.Kg);
                this.Kj.setTypeface(this.JY);
                TextPaint textPaint = this.Kj;
                if (this.dM == 1.0f) {
                    z = false;
                }
                textPaint.setLinearText(z);
                CharSequence ellipsize = TextUtils.ellipsize(this.text, this.Kj, width, TruncateAt.END);
                if (!TextUtils.equals(ellipsize, this.JZ)) {
                    this.JZ = ellipsize;
                    this.Ka = e(this.JZ);
                }
            }
        }
    }

    private void nV() {
        if (this.Kc == null && !this.JD.isEmpty() && !TextUtils.isEmpty(this.JZ)) {
            w(0.0f);
            this.Ke = this.Kj.ascent();
            this.Kf = this.Kj.descent();
            TextPaint textPaint = this.Kj;
            CharSequence charSequence = this.JZ;
            int round = Math.round(textPaint.measureText(charSequence, 0, charSequence.length()));
            int round2 = Math.round(this.Kf - this.Ke);
            if (round > 0 && round2 > 0) {
                this.Kc = Bitmap.createBitmap(round, round2, Config.ARGB_8888);
                Canvas canvas = new Canvas(this.Kc);
                CharSequence charSequence2 = this.JZ;
                canvas.drawText(charSequence2, 0, charSequence2.length(), 0.0f, ((float) round2) - this.Kj.descent(), this.Kj);
                if (this.Kd == null) {
                    this.Kd = new Paint(3);
                }
            }
        }
    }

    public void nW() {
        if (this.view.getHeight() > 0 && this.view.getWidth() > 0) {
            nU();
            nR();
        }
    }

    public void setText(CharSequence charSequence) {
        if (charSequence == null || !charSequence.equals(this.text)) {
            this.text = charSequence;
            this.JZ = null;
            nX();
            nW();
        }
    }

    private void nX() {
        Bitmap bitmap = this.Kc;
        if (bitmap != null) {
            bitmap.recycle();
            this.Kc = null;
        }
    }

    private static boolean i(float f, float f2) {
        return Math.abs(f - f2) < 0.001f;
    }

    public ColorStateList nY() {
        return this.JN;
    }

    private static int c(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb((int) ((((float) Color.alpha(i)) * f2) + (((float) Color.alpha(i2)) * f)), (int) ((((float) Color.red(i)) * f2) + (((float) Color.red(i2)) * f)), (int) ((((float) Color.green(i)) * f2) + (((float) Color.green(i2)) * f)), (int) ((((float) Color.blue(i)) * f2) + (((float) Color.blue(i2)) * f)));
    }

    private static float a(float f, float f2, float f3, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        return a.lerp(f, f2, f3);
    }

    private static boolean a(Rect rect, int i, int i2, int i3, int i4) {
        return rect.left == i && rect.top == i2 && rect.right == i3 && rect.bottom == i4;
    }
}
