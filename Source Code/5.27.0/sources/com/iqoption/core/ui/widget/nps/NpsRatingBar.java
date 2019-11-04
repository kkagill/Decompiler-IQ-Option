package com.iqoption.core.ui.widget.nps;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Paint.FontMetrics;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.res.ResourcesCompat;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import com.iqoption.core.i.c;
import com.iqoption.core.i.d;
import com.iqoption.core.i.f;

public final class NpsRatingBar extends View {
    private static final int bOa = d.sp14;
    private static final int bOb = d.sp36;
    private static final int bOc = d.dp2;
    private static final int bOd = d.dp4;
    private static final int bOe = d.dp14;
    private static final int bOf = d.dp3;
    private static final int bOg = c.grey_blue_50;
    private static final int bOh = c.white;
    private static final int bOi = c.grey_blue;
    private static final int bOj = c.green;
    private static final FontMetrics bOk = new FontMetrics();
    private Paint bLi;
    private Shader bLj;
    private int bLl;
    private int bLm;
    private float bNf;
    private float bOA;
    private float bOB;
    private float bOC;
    private a bOD;
    private float bOE;
    private float bOF;
    private float bOG;
    private float bOH;
    private ValueAnimator bOI;
    private final Runnable bOJ = new -$$Lambda$FACHqXhO4GxwaFSYHXrFHQh8jTI(this);
    private float bOK;
    private float bOL = 0.18f;
    private float bOM = 0.002f;
    private boolean bON;
    private boolean bOO;
    private b bOP;
    private a bOQ;
    private TextPaint bOl;
    private int bOm;
    private String[] bOn;
    private int bOo;
    private int bOp;
    private float bOq;
    private float bOr;
    private float bOs;
    private float bOt;
    private float bOu;
    private float bOv;
    private float bOw;
    private float bOx;
    private float bOy;
    private float bOz;
    private float offset;
    private int state;

    public interface a {
        void a(@NonNull NpsRatingBar npsRatingBar, int i);
    }

    class b extends AnimatorListenerAdapter {
        private boolean bOR;
        private boolean cancelled;

        b() {
        }

        /* Access modifiers changed, original: 0000 */
        public void cJ(boolean z) {
            this.bOR = z;
        }

        public void onAnimationStart(Animator animator) {
            NpsRatingBar.this.setState(2);
            this.cancelled = false;
        }

        public void onAnimationCancel(Animator animator) {
            this.cancelled = true;
        }

        public void onAnimationEnd(Animator animator) {
            NpsRatingBar.this.setState(0);
            if (!this.cancelled && this.bOR) {
                NpsRatingBar.this.NC();
            }
        }
    }

    private static int M(float f) {
        return (int) (f + 0.5f);
    }

    private long Q(float f) {
        long j = (long) (f * 300.0f);
        return j > 700 ? 700 : j;
    }

    private static float h(float f, float f2, float f3) {
        return (f * (f3 - f2)) + f2;
    }

    public int getRatingMax() {
        return 10;
    }

    public int getRatingMin() {
        return 0;
    }

    public NpsRatingBar(Context context) {
        super(context);
        init();
    }

    public NpsRatingBar(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public NpsRatingBar(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    @TargetApi(21)
    public NpsRatingBar(Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        init();
    }

    public void setRating(int i) {
        b((float) i, false);
    }

    public int getRating() {
        return (int) this.bOE;
    }

    public void fn(int i) {
        b((float) i, true);
    }

    public void b(float f, boolean z) {
        if (this.bOE == f) {
            return;
        }
        if (z) {
            c(f, false);
            return;
        }
        this.bOE = f;
        invalidate();
    }

    public void setOnRatingChangeListener(@Nullable a aVar) {
        this.bOQ = aVar;
    }

    public void bk(long j) {
        this.bOD.bk(j);
    }

    public void setReachingSpeedCoeff(float f) {
        this.bOL = f;
    }

    public void setReachingMinDiff(float f) {
        this.bOM = f;
    }

    /* Access modifiers changed, original: 0000 */
    public void NC() {
        a aVar = this.bOQ;
        if (aVar != null) {
            aVar.a(this, (int) this.bOE);
        }
    }

    private float fo(@DimenRes int i) {
        return com.iqoption.core.ext.a.l(getContext(), i);
    }

    private int fh(@ColorRes int i) {
        return com.iqoption.core.ext.a.k(getContext(), i);
    }

    private void init() {
        this.bOl = new TextPaint(1);
        this.bOl.setTypeface(ResourcesCompat.getFont(getContext(), f.medium));
        this.bOo = fh(bOg);
        this.bOp = fh(bOh);
        this.bOm = 11;
        this.bOn = new String[this.bOm];
        this.bOq = fo(bOa);
        this.bOr = fo(bOb);
        this.bOu = this.bOq / this.bOr;
        this.bOA = fo(bOe);
        this.bLi = new Paint(1);
        this.bLi.setColor(-14077627);
        this.bLl = fh(bOi);
        this.bLm = fh(bOj);
        this.bOB = fo(bOc);
        this.bOC = fo(bOf);
        this.bNf = fo(bOd);
        this.bOD = new a(-1, -7100222);
        this.bOD.setCallback(this);
    }

    /* Access modifiers changed, original: protected */
    public boolean verifyDrawable(@NonNull Drawable drawable) {
        return drawable == this.bOD || super.verifyDrawable(drawable);
    }

    /* Access modifiers changed, original: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        i = MeasureSpec.getSize(i);
        this.bOl.setTextSize(this.bOr);
        this.bOl.getFontMetrics(bOk);
        float f = bOk.descent - bOk.ascent;
        int M = M(f) + this.bOD.getIntrinsicHeight();
        float measureText = this.bOl.measureText(a(this.bOn, 0));
        float measureText2 = this.bOl.measureText(a(this.bOn, this.bOm - 1));
        this.bOw = Math.max(measureText, (float) this.bOD.getIntrinsicWidth()) / 2.0f;
        this.bOx = Math.max(measureText2, (float) this.bOD.getIntrinsicWidth()) / 2.0f;
        this.bOs = -bOk.ascent;
        this.bOl.setTextSize(this.bOq);
        this.bOl.getFontMetrics(bOk);
        this.bOt = -bOk.ascent;
        this.bOv = f;
        this.bOy = (f - (bOk.descent - bOk.ascent)) / 2.0f;
        f = (float) i;
        this.bOz = ((f - this.bOw) - this.bOx) / 10.0f;
        if (measureText > ((float) this.bOD.getMinimumWidth())) {
            this.bOG = (measureText - ((float) this.bOD.getMinimumWidth())) / 2.0f;
        } else {
            this.bOG = 0.0f;
        }
        if (measureText2 > ((float) this.bOD.getMinimumWidth())) {
            this.bOH = f - ((measureText2 - ((float) this.bOD.getMinimumWidth())) / 2.0f);
        } else {
            this.bOH = f;
        }
        setMeasuredDimension(i, M);
    }

    /* Access modifiers changed, original: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.bLj = new LinearGradient(this.bOw, 0.0f, ((float) i) - this.bOx, 0.0f, this.bLl, this.bLm, TileMode.CLAMP);
    }

    /* Access modifiers changed, original: protected */
    public void onDraw(Canvas canvas) {
        float f;
        float f2;
        float h;
        Canvas canvas2 = canvas;
        super.onDraw(canvas);
        canvas.save();
        float f3 = 0.0f;
        canvas2.translate(this.bOw, 0.0f);
        float M = ((float) M(this.bOv)) + this.bOA;
        float f4 = this.bOz * this.bOE;
        canvas.save();
        canvas2.translate(0.0f, M);
        float f5 = this.bOC;
        float width = (((float) getWidth()) - this.bOw) - this.bOx;
        float f6 = f5 + this.bOB;
        if (this.bOE < 10.0f) {
            this.bLi.setShader(this.bLj);
            f = f5;
            f2 = f6;
            canvas.drawRect(0.0f, f, f4, f2, this.bLi);
            this.bLi.setShader(null);
            canvas.drawRect(f4, f, width, f2, this.bLi);
        } else {
            this.bLi.setShader(this.bLj);
            canvas.drawRect(0.0f, f5, width, f6, this.bLi);
        }
        canvas.restore();
        canvas.save();
        int i = 0;
        f = 0.0f;
        while (i < this.bOm) {
            Shader shader;
            String a = a(this.bOn, i);
            f2 = this.bOE - ((float) (i + 0));
            canvas.save();
            if (i <= 0 || Math.abs(f2) >= 1.0f) {
                this.bOl.setColor(this.bOo);
                this.bOl.setTextSize(this.bOq);
                f5 = this.bOl.measureText(a);
                f6 = this.bOt + this.bOy;
            } else {
                this.bOl.setTextSize(this.bOr);
                f5 = this.bOl.measureText(a);
                f6 = this.bOs;
                if (f2 > f3) {
                    this.bOl.setColor(b(1.0f - f2, this.bOo, this.bOp));
                    h = h(f2, 1.0f, this.bOu);
                    canvas2.scale(h, h, f, this.bOv / 2.0f);
                } else if (f2 < 0.0f) {
                    this.bOl.setColor(b(f2 + 1.0f, this.bOo, this.bOp));
                    h = h(-f2, 1.0f, this.bOu);
                    canvas2.scale(h, h, f, this.bOv / 2.0f);
                } else {
                    this.bOl.setColor(this.bOp);
                }
            }
            canvas2.drawText(a, ((-f5) / 2.0f) + f, f6, this.bOl);
            canvas.restore();
            if (f < f4) {
                this.bLi.setShader(this.bLj);
                h = this.bNf;
                canvas2.drawCircle(f, M + h, h, this.bLi);
                shader = null;
            } else {
                shader = null;
                this.bLi.setShader(null);
                h = this.bNf;
                canvas2.drawCircle(f, M + h, h, this.bLi);
            }
            f += this.bOz;
            i++;
            Shader shader2 = shader;
            f3 = 0.0f;
        }
        canvas.restore();
        canvas.restore();
        int M2 = (M(this.bOw) + M(this.bOz * this.bOE)) - (this.bOD.getIntrinsicWidth() / 2);
        i = M(this.bOv);
        this.bOD.setBounds(M2, i, this.bOD.getIntrinsicWidth() + M2, this.bOD.getIntrinsicHeight() + i);
        this.bOD.draw(canvas2);
        if (this.bOO) {
            h = this.bOE;
            if (h != this.bOK) {
                amS();
                postOnAnimation(this.bOJ);
                return;
            }
            cI(this.bOF != h);
        }
    }

    private void j(int i, boolean z) {
        if (this.state != i) {
            if (z) {
                amR();
            }
            this.state = i;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void setState(int i) {
        j(i, false);
    }

    private void c(float f, boolean z) {
        if (this.bOI == null) {
            this.bOI = new ValueAnimator();
            this.bOI.setInterpolator(new FastOutSlowInInterpolator());
            this.bOP = new b();
            this.bOI.addListener(this.bOP);
            this.bOI.addUpdateListener(new -$$Lambda$NpsRatingBar$qjz3MU1OfLGSiga5gfLXYK7N0jI(this));
        }
        if (this.bOI.isRunning()) {
            this.bOI.cancel();
        }
        this.bOP.cJ(z);
        this.bOI.setDuration(Q(Math.abs(f - this.bOE)));
        this.bOI.setFloatValues(new float[]{this.bOE, f});
        this.bOI.start();
    }

    private /* synthetic */ void f(ValueAnimator valueAnimator) {
        this.bOE = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate();
    }

    private void amR() {
        ValueAnimator valueAnimator = this.bOI;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.bOI.cancel();
        }
    }

    private void R(float f) {
        this.bOO = true;
        S(f);
        invalidate();
    }

    private void S(float f) {
        this.bOK = f;
        this.bON = this.bOK > this.bOE;
    }

    private void amS() {
        float f = this.bOK;
        float f2 = this.bOE;
        float f3;
        if (f > f2) {
            f3 = (f - f2) * this.bOL;
            if (f3 >= this.bOM) {
                this.bOE = f2 + f3;
                return;
            } else {
                this.bOE = f;
                return;
            }
        }
        f3 = (f2 - f) * this.bOL;
        if (f3 >= this.bOM) {
            this.bOE = f2 - f3;
        } else {
            this.bOE = f;
        }
    }

    private void cI(boolean z) {
        this.bOO = false;
        if (z) {
            NC();
        }
    }

    /* JADX WARNING: Missing block: B:7:0x0014, code skipped:
            if (r0 != 3) goto L_0x00cb;
     */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
        r5 = this;
        r0 = r5.bOD;
        r0.amU();
        r0 = r6.getActionMasked();
        r1 = 1;
        if (r0 == 0) goto L_0x008b;
    L_0x000c:
        r2 = 0;
        r3 = 0;
        if (r0 == r1) goto L_0x0053;
    L_0x0010:
        r4 = 2;
        if (r0 == r4) goto L_0x0018;
    L_0x0013:
        r6 = 3;
        if (r0 == r6) goto L_0x0053;
    L_0x0016:
        goto L_0x00cb;
    L_0x0018:
        r0 = r5.state;
        if (r0 != r1) goto L_0x00cb;
    L_0x001c:
        r6 = r6.getX();
        r6 = r5.T(r6);
        r0 = 1092616192; // 0x41200000 float:10.0 double:5.398241246E-315;
        r4 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1));
        if (r4 >= 0) goto L_0x002c;
    L_0x002a:
        r6 = 0;
        goto L_0x0032;
    L_0x002c:
        r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1));
        if (r2 <= 0) goto L_0x0032;
    L_0x0030:
        r6 = 1092616192; // 0x41200000 float:10.0 double:5.398241246E-315;
    L_0x0032:
        r0 = r5.bOO;
        if (r0 == 0) goto L_0x004e;
    L_0x0036:
        r0 = r5.bON;
        r2 = r5.bOK;
        r4 = r5.bOE;
        r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r2 <= 0) goto L_0x0042;
    L_0x0040:
        r2 = 1;
        goto L_0x0043;
    L_0x0042:
        r2 = 0;
    L_0x0043:
        if (r0 == r2) goto L_0x004a;
    L_0x0045:
        r5.cI(r3);
        goto L_0x00cb;
    L_0x004a:
        r5.bOK = r6;
        goto L_0x00cb;
    L_0x004e:
        r5.b(r6, r3);
        goto L_0x00cb;
    L_0x0053:
        r6 = r5.bOO;
        if (r6 == 0) goto L_0x0064;
    L_0x0057:
        r6 = r5.bOK;
        r6 = M(r6);
        r6 = (float) r6;
        r5.bOK = r6;
        r5.setState(r3);
        goto L_0x0081;
    L_0x0064:
        r6 = r5.bOE;
        r6 = M(r6);
        r6 = (float) r6;
        r0 = r5.bOF;
        r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1));
        if (r0 == 0) goto L_0x0072;
    L_0x0071:
        r3 = 1;
    L_0x0072:
        r0 = r5.bOE;
        r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1));
        if (r0 == 0) goto L_0x007c;
    L_0x0078:
        r5.c(r6, r3);
        goto L_0x0081;
    L_0x007c:
        if (r3 == 0) goto L_0x0081;
    L_0x007e:
        r5.NC();
    L_0x0081:
        r6 = r5.bOD;
        r0 = EMPTY_STATE_SET;
        r6.setState(r0);
        r5.offset = r2;
        goto L_0x00cb;
    L_0x008b:
        r6 = r6.getX();
        r0 = r5.U(r6);
        if (r0 == 0) goto L_0x00cb;
    L_0x0095:
        r0 = r5.bOO;
        if (r0 == 0) goto L_0x00a1;
    L_0x0099:
        r6 = r5.T(r6);
        r5.S(r6);
        goto L_0x00c1;
    L_0x00a1:
        r0 = r5.bOE;
        r5.bOF = r0;
        r0 = r5.V(r6);
        if (r0 == 0) goto L_0x00ba;
    L_0x00ab:
        r0 = r5.bOD;
        r0 = r0.getBounds();
        r0 = r0.centerX();
        r0 = (float) r0;
        r6 = r6 - r0;
        r5.offset = r6;
        goto L_0x00c1;
    L_0x00ba:
        r6 = r5.T(r6);
        r5.R(r6);
    L_0x00c1:
        r5.j(r1, r1);
        r6 = r5.bOD;
        r0 = PRESSED_STATE_SET;
        r6.setState(r0);
    L_0x00cb:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.core.ui.widget.nps.NpsRatingBar.onTouchEvent(android.view.MotionEvent):boolean");
    }

    private float T(float f) {
        return (((f - this.offset) - this.bOG) - ((float) (this.bOD.getIntrinsicWidth() / 2))) / this.bOz;
    }

    private boolean U(float f) {
        return f > this.bOG && f < this.bOH;
    }

    private boolean V(float f) {
        Rect bounds = this.bOD.getBounds();
        return f > ((float) bounds.left) && f < ((float) bounds.right);
    }

    private static String a(String[] strArr, int i) {
        String str = strArr[i];
        if (str != null) {
            return str;
        }
        str = String.valueOf(i + 0);
        strArr[i] = str;
        return str;
    }

    private static int b(float f, int i, int i2) {
        float f2 = ((float) ((i >> 24) & 255)) / 255.0f;
        float f3 = ((float) ((i >> 8) & 255)) / 255.0f;
        float f4 = ((float) ((i2 >> 24) & 255)) / 255.0f;
        float f5 = ((float) ((i2 >> 16) & 255)) / 255.0f;
        float f6 = ((float) ((i2 >> 8) & 255)) / 255.0f;
        float pow = (float) Math.pow((double) (((float) ((i >> 16) & 255)) / 255.0f), 2.2d);
        f3 = (float) Math.pow((double) f3, 2.2d);
        float pow2 = (float) Math.pow((double) (((float) (i & 255)) / 255.0f), 2.2d);
        f3 += (((float) Math.pow((double) f6, 2.2d)) - f3) * f;
        pow2 += f * (((float) Math.pow((double) (((float) (i2 & 255)) / 255.0f), 2.2d)) - pow2);
        f2 = (f2 + ((f4 - f2) * f)) * 255.0f;
        return (((M(((float) Math.pow((double) (pow + ((((float) Math.pow((double) f5, 2.2d)) - pow) * f)), 0.45454545454545453d)) * 255.0f) << 16) | (M(f2) << 24)) | (M(((float) Math.pow((double) f3, 0.45454545454545453d)) * 255.0f) << 8)) | M(((float) Math.pow((double) pow2, 0.45454545454545453d)) * 255.0f);
    }
}
