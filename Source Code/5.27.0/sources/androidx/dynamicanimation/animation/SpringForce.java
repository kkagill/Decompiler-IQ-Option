package androidx.dynamicanimation.animation;

import androidx.annotation.FloatRange;
import androidx.annotation.RestrictTo;
import androidx.annotation.RestrictTo.Scope;

public final class SpringForce implements Force {
    public static final float DAMPING_RATIO_HIGH_BOUNCY = 0.2f;
    public static final float DAMPING_RATIO_LOW_BOUNCY = 0.75f;
    public static final float DAMPING_RATIO_MEDIUM_BOUNCY = 0.5f;
    public static final float DAMPING_RATIO_NO_BOUNCY = 1.0f;
    public static final float STIFFNESS_HIGH = 10000.0f;
    public static final float STIFFNESS_LOW = 200.0f;
    public static final float STIFFNESS_MEDIUM = 1500.0f;
    public static final float STIFFNESS_VERY_LOW = 50.0f;
    private static final double UNSET = Double.MAX_VALUE;
    private static final double VELOCITY_THRESHOLD_MULTIPLIER = 62.5d;
    private double mDampedFreq;
    double mDampingRatio = 0.5d;
    private double mFinalPosition = UNSET;
    private double mGammaMinus;
    private double mGammaPlus;
    private boolean mInitialized = false;
    private final MassState mMassState = new MassState();
    double mNaturalFreq = Math.sqrt(1500.0d);
    private double mValueThreshold;
    private double mVelocityThreshold;

    public SpringForce(float f) {
        this.mFinalPosition = (double) f;
    }

    public SpringForce setStiffness(@FloatRange(from = 0.0d, fromInclusive = false) float f) {
        if (f > 0.0f) {
            this.mNaturalFreq = Math.sqrt((double) f);
            this.mInitialized = false;
            return this;
        }
        throw new IllegalArgumentException("Spring stiffness constant must be positive.");
    }

    public float getStiffness() {
        double d = this.mNaturalFreq;
        return (float) (d * d);
    }

    public SpringForce setDampingRatio(@FloatRange(from = 0.0d) float f) {
        if (f >= 0.0f) {
            this.mDampingRatio = (double) f;
            this.mInitialized = false;
            return this;
        }
        throw new IllegalArgumentException("Damping ratio must be non-negative");
    }

    public float getDampingRatio() {
        return (float) this.mDampingRatio;
    }

    public SpringForce setFinalPosition(float f) {
        this.mFinalPosition = (double) f;
        return this;
    }

    public float getFinalPosition() {
        return (float) this.mFinalPosition;
    }

    @RestrictTo({Scope.LIBRARY})
    public float getAcceleration(float f, float f2) {
        f -= getFinalPosition();
        double d = this.mNaturalFreq;
        double d2 = d * d;
        d = (d * 2.0d) * this.mDampingRatio;
        d2 = -d2;
        double d3 = (double) f;
        Double.isNaN(d3);
        d2 *= d3;
        double d4 = (double) f2;
        Double.isNaN(d4);
        return (float) (d2 - (d * d4));
    }

    @RestrictTo({Scope.LIBRARY})
    public boolean isAtEquilibrium(float f, float f2) {
        return ((double) Math.abs(f2)) < this.mVelocityThreshold && ((double) Math.abs(f - getFinalPosition())) < this.mValueThreshold;
    }

    private void init() {
        if (!this.mInitialized) {
            if (this.mFinalPosition != UNSET) {
                double d = this.mDampingRatio;
                if (d > 1.0d) {
                    double d2 = -d;
                    double d3 = this.mNaturalFreq;
                    this.mGammaPlus = (d2 * d3) + (d3 * Math.sqrt((d * d) - 1.0d));
                    d = this.mDampingRatio;
                    d2 = -d;
                    d3 = this.mNaturalFreq;
                    this.mGammaMinus = (d2 * d3) - (d3 * Math.sqrt((d * d) - 1.0d));
                } else if (d >= 0.0d && d < 1.0d) {
                    this.mDampedFreq = this.mNaturalFreq * Math.sqrt(1.0d - (d * d));
                }
                this.mInitialized = true;
                return;
            }
            throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
        }
    }

    /* Access modifiers changed, original: 0000 */
    public MassState updateValues(double d, double d2, long j) {
        double d3;
        init();
        double d4 = (double) j;
        Double.isNaN(d4);
        d4 /= 1000.0d;
        double d5 = d - this.mFinalPosition;
        double d6 = this.mDampingRatio;
        double d7;
        if (d6 > 1.0d) {
            d6 = this.mGammaMinus;
            d3 = (d6 * d5) - d2;
            d7 = this.mGammaPlus;
            d3 = d5 - (d3 / (d6 - d7));
            d5 = ((d5 * d6) - d2) / (d6 - d7);
            d6 = (Math.pow(2.718281828459045d, d6 * d4) * d3) + (Math.pow(2.718281828459045d, this.mGammaPlus * d4) * d5);
            d7 = this.mGammaMinus;
            d3 = (d3 * d7) * Math.pow(2.718281828459045d, d7 * d4);
            d7 = this.mGammaPlus;
            d3 += (d5 * d7) * Math.pow(2.718281828459045d, d7 * d4);
        } else if (d6 == 1.0d) {
            d6 = this.mNaturalFreq;
            d3 = d2 + (d6 * d5);
            d5 += d3 * d4;
            d6 = Math.pow(2.718281828459045d, (-d6) * d4) * d5;
            d5 *= Math.pow(2.718281828459045d, (-this.mNaturalFreq) * d4);
            d7 = this.mNaturalFreq;
            d3 = (d3 * Math.pow(2.718281828459045d, (-d7) * d4)) + (d5 * (-d7));
        } else {
            d3 = 1.0d / this.mDampedFreq;
            d7 = this.mNaturalFreq;
            d3 *= ((d6 * d7) * d5) + d2;
            d6 = Math.pow(2.718281828459045d, ((-d6) * d7) * d4) * ((Math.cos(this.mDampedFreq * d4) * d5) + (Math.sin(this.mDampedFreq * d4) * d3));
            d7 = this.mNaturalFreq;
            double d8 = (-d7) * d6;
            double d9 = this.mDampingRatio;
            d8 *= d9;
            d9 = Math.pow(2.718281828459045d, ((-d9) * d7) * d4);
            d7 = this.mDampedFreq;
            d = d6;
            d6 = ((-d7) * d5) * Math.sin(d7 * d4);
            d5 = this.mDampedFreq;
            d3 = d8 + (d9 * (d6 + ((d3 * d5) * Math.cos(d5 * d4))));
            d6 = d;
        }
        MassState massState = this.mMassState;
        massState.mValue = (float) (d6 + this.mFinalPosition);
        massState.mVelocity = (float) d3;
        return massState;
    }

    /* Access modifiers changed, original: 0000 */
    public void setValueThreshold(double d) {
        this.mValueThreshold = Math.abs(d);
        this.mVelocityThreshold = this.mValueThreshold * VELOCITY_THRESHOLD_MULTIPLIER;
    }
}
