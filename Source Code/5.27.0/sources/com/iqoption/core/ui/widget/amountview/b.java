package com.iqoption.core.ui.widget.amountview;

import android.graphics.Canvas;
import android.graphics.Paint;

/* compiled from: AmountViewColumn */
class b {
    private final d bLT;
    private int bMA;
    private int bMk;
    private int bMl;
    private final a[] bMn;
    private char bMo = 0;
    private char bMp = 0;
    private char[] bMq;
    private int bMr;
    private float bMs;
    private float bMt;
    private float bMu;
    private float bMv;
    private float bMw;
    private float bMx;
    private float bMy;
    private float bMz;

    b(a[] aVarArr, d dVar) {
        this.bMn = aVarArr;
        this.bLT = dVar;
    }

    /* Access modifiers changed, original: 0000 */
    public void C(char c) {
        this.bMp = c;
        this.bMu = this.bMv;
        this.bMw = this.bLT.D(c);
        this.bMx = Math.max(this.bMu, this.bMw);
        ams();
        int i = 1;
        if ((this.bMl >= this.bMk ? 1 : null) == null) {
            i = -1;
        }
        this.bMA = i;
        this.bMz = this.bMy;
        this.bMy = 0.0f;
    }

    /* Access modifiers changed, original: 0000 */
    public char yP() {
        return this.bMo;
    }

    /* Access modifiers changed, original: 0000 */
    public float amq() {
        amt();
        return this.bMv;
    }

    /* Access modifiers changed, original: 0000 */
    public float amr() {
        amt();
        return this.bMx;
    }

    private void ams() {
        this.bMq = null;
        int i = 0;
        while (true) {
            a[] aVarArr = this.bMn;
            if (i >= aVarArr.length) {
                break;
            }
            a b = aVarArr[i].b(this.bMo, this.bMp);
            if (b != null) {
                this.bMq = this.bMn[i].amp();
                this.bMk = b.bMk;
                this.bMl = b.bMl;
            }
            i++;
        }
        if (this.bMq == null) {
            if (this.bMo == this.bMp) {
                this.bMq = new char[]{this.bMo};
                this.bMl = 0;
                this.bMk = 0;
                return;
            }
            this.bMq = new char[]{this.bMo, this.bMp};
            this.bMk = 0;
            this.bMl = 1;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void onAnimationEnd() {
        amt();
        this.bMx = this.bMv;
    }

    private void amt() {
        float D = this.bLT.D(this.bMp);
        float f = this.bMv;
        float f2 = this.bMw;
        if (f == f2 && f2 != D) {
            this.bMw = D;
            this.bMv = D;
            this.bMx = D;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void setAnimationProgress(float f) {
        if (f == 1.0f) {
            this.bMo = this.bMp;
            this.bMy = 0.0f;
            this.bMz = 0.0f;
        }
        float amw = this.bLT.amw();
        float abs = ((((float) Math.abs(this.bMl - this.bMk)) * amw) * f) / amw;
        int i = (int) abs;
        float f2 = this.bMz * (1.0f - f);
        abs = (abs - ((float) i)) * amw;
        int i2 = this.bMA;
        this.bMs = (abs * ((float) i2)) + f2;
        this.bMr = this.bMk + (i * i2);
        this.bMt = amw;
        float f3 = this.bMu;
        this.bMv = f3 + ((this.bMw - f3) * f);
    }

    /* Access modifiers changed, original: 0000 */
    public void draw(Canvas canvas, Paint paint) {
        if (a(canvas, paint, this.bMq, this.bMr, this.bMs)) {
            int i = this.bMr;
            if (i >= 0) {
                this.bMo = this.bMq[i];
            }
            this.bMy = this.bMs;
        }
        a(canvas, paint, this.bMq, this.bMr + 1, this.bMs - this.bMt);
        a(canvas, paint, this.bMq, this.bMr - 1, this.bMs + this.bMt);
    }

    private boolean a(Canvas canvas, Paint paint, char[] cArr, int i, float f) {
        if (i < 0 || i >= cArr.length) {
            return false;
        }
        canvas.drawText(cArr, i, 1, 0.0f, f, paint);
        return true;
    }
}
