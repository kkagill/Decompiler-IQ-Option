package com.airbnb.lottie.d;

import android.view.Choreographer;
import android.view.Choreographer.FrameCallback;
import androidx.annotation.FloatRange;
import androidx.annotation.MainThread;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;

/* compiled from: LottieValueAnimator */
public class e extends a implements FrameCallback {
    @Nullable
    private com.airbnb.lottie.e df;
    private float jX = 1.0f;
    private boolean jY = false;
    private long jZ = 0;
    private float ka = 0.0f;
    private float kb = -2.14748365E9f;
    private float kc = 2.14748365E9f;
    @VisibleForTesting
    protected boolean kd = false;
    private int repeatCount = 0;

    public Object getAnimatedValue() {
        return Float.valueOf(cJ());
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public float cJ() {
        com.airbnb.lottie.e eVar = this.df;
        if (eVar == null) {
            return 0.0f;
        }
        return (this.ka - eVar.aj()) / (this.df.ak() - this.df.aj());
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public float getAnimatedFraction() {
        if (this.df == null) {
            return 0.0f;
        }
        float maxFrame;
        float maxFrame2;
        float minFrame;
        if (bC()) {
            maxFrame = getMaxFrame() - this.ka;
            maxFrame2 = getMaxFrame();
            minFrame = getMinFrame();
        } else {
            maxFrame = this.ka - getMinFrame();
            maxFrame2 = getMaxFrame();
            minFrame = getMinFrame();
        }
        return maxFrame / (maxFrame2 - minFrame);
    }

    public long getDuration() {
        com.airbnb.lottie.e eVar = this.df;
        return eVar == null ? 0 : (long) eVar.ai();
    }

    public float cK() {
        return this.ka;
    }

    public boolean isRunning() {
        return this.kd;
    }

    public void doFrame(long j) {
        postFrameCallback();
        if (this.df != null && isRunning()) {
            long j2 = this.jZ;
            long j3 = 0;
            if (j2 != 0) {
                j3 = j - j2;
            }
            float cL = ((float) j3) / cL();
            float f = this.ka;
            if (bC()) {
                cL = -cL;
            }
            this.ka = f + cL;
            int b = g.b(this.ka, getMinFrame(), getMaxFrame()) ^ 1;
            this.ka = g.clamp(this.ka, getMinFrame(), getMaxFrame());
            this.jZ = j;
            cI();
            if (b != 0) {
                if (getRepeatCount() == -1 || this.repeatCount < getRepeatCount()) {
                    cG();
                    this.repeatCount++;
                    if (getRepeatMode() == 2) {
                        this.jY ^= 1;
                        cM();
                    } else {
                        this.ka = bC() ? getMaxFrame() : getMinFrame();
                    }
                    this.jZ = j;
                } else {
                    this.ka = this.jX < 0.0f ? getMinFrame() : getMaxFrame();
                    cN();
                    s(bC());
                }
            }
            cO();
        }
    }

    private float cL() {
        com.airbnb.lottie.e eVar = this.df;
        if (eVar == null) {
            return Float.MAX_VALUE;
        }
        return (1.0E9f / eVar.getFrameRate()) / Math.abs(this.jX);
    }

    public void ae() {
        this.df = null;
        this.kb = -2.14748365E9f;
        this.kc = 2.14748365E9f;
    }

    public void setComposition(com.airbnb.lottie.e eVar) {
        Object obj = this.df == null ? 1 : null;
        this.df = eVar;
        if (obj != null) {
            f((float) ((int) Math.max(this.kb, eVar.aj())), (float) ((int) Math.min(this.kc, eVar.ak())));
        } else {
            f((float) ((int) eVar.aj()), (float) ((int) eVar.ak()));
        }
        float f = this.ka;
        this.ka = 0.0f;
        setFrame((int) f);
    }

    public void setFrame(int i) {
        float f = (float) i;
        if (this.ka != f) {
            this.ka = g.clamp(f, getMinFrame(), getMaxFrame());
            this.jZ = 0;
            cI();
        }
    }

    public void setMinFrame(int i) {
        f((float) i, (float) ((int) this.kc));
    }

    public void i(float f) {
        f(this.kb, f);
    }

    public void f(float f, float f2) {
        if (f <= f2) {
            com.airbnb.lottie.e eVar = this.df;
            float aj = eVar == null ? -3.4028235E38f : eVar.aj();
            com.airbnb.lottie.e eVar2 = this.df;
            float ak = eVar2 == null ? Float.MAX_VALUE : eVar2.ak();
            this.kb = g.clamp(f, aj, ak);
            this.kc = g.clamp(f2, aj, ak);
            setFrame((int) g.clamp(this.ka, f, f2));
            return;
        }
        throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", new Object[]{Float.valueOf(f), Float.valueOf(f2)}));
    }

    public void cM() {
        setSpeed(-getSpeed());
    }

    public void setSpeed(float f) {
        this.jX = f;
    }

    public float getSpeed() {
        return this.jX;
    }

    public void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i != 2 && this.jY) {
            this.jY = false;
            cM();
        }
    }

    @MainThread
    public void Z() {
        this.kd = true;
        r(bC());
        setFrame((int) (bC() ? getMaxFrame() : getMinFrame()));
        this.jZ = 0;
        this.repeatCount = 0;
        postFrameCallback();
    }

    @MainThread
    public void au() {
        cN();
        s(bC());
    }

    @MainThread
    public void ad() {
        cN();
    }

    @MainThread
    public void aa() {
        this.kd = true;
        postFrameCallback();
        this.jZ = 0;
        if (bC() && cK() == getMinFrame()) {
            this.ka = getMaxFrame();
        } else if (!bC() && cK() == getMaxFrame()) {
            this.ka = getMinFrame();
        }
    }

    @MainThread
    public void cancel() {
        cH();
        cN();
    }

    private boolean bC() {
        return getSpeed() < 0.0f;
    }

    public float getMinFrame() {
        com.airbnb.lottie.e eVar = this.df;
        if (eVar == null) {
            return 0.0f;
        }
        float f = this.kb;
        if (f == -2.14748365E9f) {
            f = eVar.aj();
        }
        return f;
    }

    public float getMaxFrame() {
        com.airbnb.lottie.e eVar = this.df;
        if (eVar == null) {
            return 0.0f;
        }
        float f = this.kc;
        if (f == 2.14748365E9f) {
            f = eVar.ak();
        }
        return f;
    }

    /* Access modifiers changed, original: protected */
    public void postFrameCallback() {
        if (isRunning()) {
            t(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    /* Access modifiers changed, original: protected */
    @MainThread
    public void cN() {
        t(true);
    }

    /* Access modifiers changed, original: protected */
    @MainThread
    public void t(boolean z) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z) {
            this.kd = false;
        }
    }

    private void cO() {
        if (this.df != null) {
            float f = this.ka;
            if (f < this.kb || f > this.kc) {
                throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", new Object[]{Float.valueOf(this.kb), Float.valueOf(this.kc), Float.valueOf(this.ka)}));
            }
        }
    }
}
