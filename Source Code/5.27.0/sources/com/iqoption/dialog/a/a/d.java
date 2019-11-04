package com.iqoption.dialog.a.a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.iqoption.core.util.aa;
import java.util.List;

/* compiled from: GraphView */
public class d extends View implements c {
    private static final Property<d, Float> cIs = new Property<d, Float>(Float.class, "graphProgress") {
        /* renamed from: a */
        public void set(d dVar, Float f) {
            dVar.setGraphProgress(f.floatValue());
        }

        /* renamed from: b */
        public Float get(d dVar) {
            return Float.valueOf(dVar.getGraphProgress());
        }
    };
    private static final Property<d, Float> cIu = new Property<d, Float>(Float.class, "decorProgress") {
        /* renamed from: a */
        public void set(d dVar, Float f) {
            dVar.setDecorProgress(f.floatValue());
        }

        /* renamed from: b */
        public Float get(d dVar) {
            return Float.valueOf(dVar.getDecorProgress());
        }
    };
    private a cHX = new a();
    private b cHZ;
    private final RectF cIA = new RectF();
    private c cIr = new a(getContext());
    private float cIt = 1.0f;
    private float cIv = 1.0f;
    private float cIw = 0.0f;
    private float cIx = 0.0f;
    private aa[] cIy;
    private final RectF cIz = new RectF();

    /* compiled from: GraphView */
    public static class a {
        double cIB = 3.4028234663852886E38d;
        double cIC = 1.401298464324817E-45d;
        double cID = 3.4028234663852886E38d;
        double cIE = 1.401298464324817E-45d;
        float cIF = 1.0f;
        float cIG = 1.0f;
        private double cIH = 1.0d;
        private double cII = 1.0d;
        private float cIJ;
        private float cIK;

        private void atI() {
            double d = this.cIC - this.cIB;
            double d2 = this.cIE - this.cID;
            double d3 = (double) this.cIJ;
            if (d == 0.0d) {
                d = 1.0d;
            }
            Double.isNaN(d3);
            this.cIH = d3 / d;
            d = (double) this.cIK;
            if (d2 == 0.0d) {
                d2 = 1.0d;
            }
            Double.isNaN(d);
            this.cII = d / d2;
        }

        /* Access modifiers changed, original: 0000 */
        public boolean m(float f, float f2) {
            if (this.cIF == f && this.cIG == f2) {
                return false;
            }
            this.cIF = f;
            this.cIG = f2;
            return true;
        }

        public void n(float f, float f2) {
            this.cIJ = f;
            this.cIK = f2;
            atI();
        }

        public boolean d(double d, double d2, double d3, double d4) {
            if (this.cIB == d && this.cIC == d2 && this.cID == d3 && this.cIE == d4) {
                return false;
            }
            this.cIB = d;
            this.cIC = d2;
            this.cID = d3;
            this.cIE = d4;
            atI();
            return true;
        }

        public void a(aa aaVar) {
            Object obj;
            if (aaVar.x < this.cIB) {
                this.cIB = aaVar.x;
                obj = 1;
            } else {
                obj = null;
            }
            if (aaVar.x > this.cIC) {
                this.cIC = aaVar.x;
                obj = 1;
            }
            if (aaVar.y < this.cID) {
                this.cID = aaVar.y;
                obj = 1;
            }
            if (aaVar.y > this.cIE) {
                this.cIE = aaVar.y;
                obj = 1;
            }
            if (obj != null) {
                atI();
            }
        }

        public float w(double d) {
            double d2 = (double) this.cIF;
            double d3 = this.cIH;
            Double.isNaN(d2);
            return (float) ((d2 * d3) * (d - this.cIB));
        }

        public float x(double d) {
            double d2 = (double) this.cIG;
            double d3 = this.cII;
            Double.isNaN(d2);
            return (float) ((d2 * d3) * (d - this.cID));
        }

        public void atJ() {
            double d = this.cID;
            this.cID = this.cIE;
            this.cIE = d;
        }

        public double atK() {
            return this.cIB;
        }

        public double atL() {
            return this.cIC;
        }
    }

    /* compiled from: GraphView */
    public interface b {
        void a(c cVar, Canvas canvas);

        float atM();

        void e(RectF rectF);
    }

    /* compiled from: GraphView */
    public interface c {
        void a(c cVar, Canvas canvas);
    }

    public void setGraphDrawer(c cVar) {
        if (cVar != null && this.cIr != cVar) {
            this.cIr = cVar;
            invalidate();
        }
    }

    public void setDecorDrawer(b bVar) {
        this.cHZ = bVar;
        if (getWidth() != 0 && getHeight() != 0) {
            at(getWidth(), getHeight());
            invalidate();
        }
    }

    public float getGraphProgress() {
        return this.cIt;
    }

    public void setGraphProgress(float f) {
        this.cIt = f;
        invalidate();
    }

    public float getDecorProgress() {
        return this.cIv;
    }

    public void setDecorProgress(float f) {
        this.cIv = f;
        invalidate();
    }

    public float getGraphScaleX() {
        return this.cHX.cIF;
    }

    public void setGraphScaleX(float f) {
        a aVar = this.cHX;
        if (aVar.m(f, aVar.cIG)) {
            invalidate();
        }
    }

    public float getGraphScaleY() {
        return this.cHX.cIG;
    }

    public void setGraphScaleY(float f) {
        a aVar = this.cHX;
        if (aVar.m(aVar.cIF, f)) {
            invalidate();
        }
    }

    public float getGraphTranslationX() {
        return this.cIw;
    }

    public void setGraphTranslationX(float f) {
        if (this.cIw != f) {
            this.cIw = f;
            invalidate();
        }
    }

    public float getGraphTranslationY() {
        return this.cIx;
    }

    public void setGraphTranslationY(float f) {
        if (this.cIx != f) {
            this.cIx = f;
            invalidate();
        }
    }

    private float getMaxAvailableTranslationX() {
        return 0.0f * this.cIA.right;
    }

    private float getMaxAvailableTranslationY() {
        return 0.0f * this.cIA.bottom;
    }

    public d(Context context) {
        super(context);
    }

    public void setGraphPoints(List<aa> list) {
        this.cIy = (aa[]) list.toArray(new aa[0]);
        invalidate();
    }

    public void c(double d, double d2, double d3, double d4) {
        if (this.cHX.d(d, d2, d3, d4)) {
            invalidate();
        }
    }

    public void setBounds(a aVar) {
        if (aVar != null) {
            c(aVar.cIB, aVar.cIC, aVar.cID, aVar.cIE);
        }
    }

    public int getPointsCount() {
        aa[] aaVarArr = this.cIy;
        return aaVarArr != null ? aaVarArr.length : 0;
    }

    public int getPointsToDrawCount() {
        return (int) (((float) getPointsCount()) * this.cIt);
    }

    public aa fB(int i) {
        return this.cIy[i];
    }

    public float fC(int i) {
        return w(this.cIy[i].x);
    }

    public float fD(int i) {
        return x(this.cIy[i].y);
    }

    public float w(double d) {
        return this.cHX.w(d);
    }

    public float x(double d) {
        return this.cHX.x(d);
    }

    public float getGraphWidth() {
        return this.cIz.width();
    }

    public float getGraphHeight() {
        return this.cIz.height();
    }

    public float getViewportWidth() {
        return this.cIA.width();
    }

    public float getViewportHeight() {
        return this.cIA.height();
    }

    public double getGraphMaxX() {
        return this.cHX.cIC;
    }

    public double getGraphMinX() {
        return this.cHX.cIB;
    }

    public double getGraphMaxY() {
        return this.cHX.cIE;
    }

    public double getGraphMinY() {
        return this.cHX.cID;
    }

    /* Access modifiers changed, original: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        at(i, i2);
    }

    private void at(int i, int i2) {
        this.cIA.set(0.0f, 0.0f, (float) i, (float) i2);
        this.cIz.set((float) getPaddingLeft(), (float) getPaddingTop(), (float) (i - getPaddingRight()), (float) (i2 - getPaddingBottom()));
        b bVar = this.cHZ;
        if (bVar != null) {
            bVar.e(this.cIz);
        }
        this.cHX.n(this.cIz.width(), this.cIz.height());
    }

    /* Access modifiers changed, original: protected */
    public void onDraw(Canvas canvas) {
        canvas.save();
        canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
        canvas.translate(this.cIw, this.cIx);
        this.cIr.a(this, canvas);
        b bVar = this.cHZ;
        if (bVar != null) {
            bVar.a(this, canvas);
        }
        canvas.restore();
    }

    public void show() {
        setGraphProgress(0.0f);
        setDecorProgress(0.0f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, cIs, new float[]{0.0f, 1.0f});
        ofFloat.setDuration(1000);
        ofFloat.setInterpolator(new LinearInterpolator());
        if (this.cHZ != null) {
            ObjectAnimator.ofFloat(this, cIu, new float[]{0.0f, 1.0f}).setDuration(700).setInterpolator(new LinearInterpolator());
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playSequentially(new Animator[]{ofFloat, r2});
            animatorSet.start();
            return;
        }
        ofFloat.start();
    }
}
