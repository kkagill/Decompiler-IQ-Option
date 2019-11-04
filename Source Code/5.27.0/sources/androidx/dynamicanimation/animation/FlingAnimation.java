package androidx.dynamicanimation.animation;

import androidx.annotation.FloatRange;

public final class FlingAnimation extends DynamicAnimation<FlingAnimation> {
    private final DragForce mFlingForce = new DragForce();

    static final class DragForce implements Force {
        private static final float DEFAULT_FRICTION = -4.2f;
        private static final float VELOCITY_THRESHOLD_MULTIPLIER = 62.5f;
        private float mFriction = DEFAULT_FRICTION;
        private final MassState mMassState = new MassState();
        private float mVelocityThreshold;

        DragForce() {
        }

        /* Access modifiers changed, original: 0000 */
        public void setFrictionScalar(float f) {
            this.mFriction = f * DEFAULT_FRICTION;
        }

        /* Access modifiers changed, original: 0000 */
        public float getFrictionScalar() {
            return this.mFriction / DEFAULT_FRICTION;
        }

        /* Access modifiers changed, original: 0000 */
        public MassState updateValueAndVelocity(float f, float f2, long j) {
            MassState massState = this.mMassState;
            double d = (double) f2;
            float f3 = (float) j;
            double exp = Math.exp((double) ((f3 / 1000.0f) * this.mFriction));
            Double.isNaN(d);
            massState.mVelocity = (float) (d * exp);
            massState = this.mMassState;
            float f4 = this.mFriction;
            double d2 = (double) (f - (f2 / f4));
            double d3 = (double) (f2 / f4);
            double exp2 = Math.exp((double) ((f4 * f3) / 1000.0f));
            Double.isNaN(d3);
            d3 *= exp2;
            Double.isNaN(d2);
            massState.mValue = (float) (d2 + d3);
            if (isAtEquilibrium(this.mMassState.mValue, this.mMassState.mVelocity)) {
                this.mMassState.mVelocity = 0.0f;
            }
            return this.mMassState;
        }

        public float getAcceleration(float f, float f2) {
            return f2 * this.mFriction;
        }

        public boolean isAtEquilibrium(float f, float f2) {
            return Math.abs(f2) < this.mVelocityThreshold;
        }

        /* Access modifiers changed, original: 0000 */
        public void setValueThreshold(float f) {
            this.mVelocityThreshold = f * VELOCITY_THRESHOLD_MULTIPLIER;
        }
    }

    public FlingAnimation(FloatValueHolder floatValueHolder) {
        super(floatValueHolder);
        this.mFlingForce.setValueThreshold(getValueThreshold());
    }

    public <K> FlingAnimation(K k, FloatPropertyCompat<K> floatPropertyCompat) {
        super(k, floatPropertyCompat);
        this.mFlingForce.setValueThreshold(getValueThreshold());
    }

    public FlingAnimation setFriction(@FloatRange(from = 0.0d, fromInclusive = false) float f) {
        if (f > 0.0f) {
            this.mFlingForce.setFrictionScalar(f);
            return this;
        }
        throw new IllegalArgumentException("Friction must be positive");
    }

    public float getFriction() {
        return this.mFlingForce.getFrictionScalar();
    }

    public FlingAnimation setMinValue(float f) {
        super.setMinValue(f);
        return this;
    }

    public FlingAnimation setMaxValue(float f) {
        super.setMaxValue(f);
        return this;
    }

    public FlingAnimation setStartVelocity(float f) {
        super.setStartVelocity(f);
        return this;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean updateValueAndVelocity(long j) {
        MassState updateValueAndVelocity = this.mFlingForce.updateValueAndVelocity(this.mValue, this.mVelocity, j);
        this.mValue = updateValueAndVelocity.mValue;
        this.mVelocity = updateValueAndVelocity.mVelocity;
        if (this.mValue < this.mMinValue) {
            this.mValue = this.mMinValue;
            return true;
        } else if (this.mValue > this.mMaxValue) {
            this.mValue = this.mMaxValue;
            return true;
        } else if (isAtEquilibrium(this.mValue, this.mVelocity)) {
            return true;
        } else {
            return false;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public float getAcceleration(float f, float f2) {
        return this.mFlingForce.getAcceleration(f, f2);
    }

    /* Access modifiers changed, original: 0000 */
    public boolean isAtEquilibrium(float f, float f2) {
        return f >= this.mMaxValue || f <= this.mMinValue || this.mFlingForce.isAtEquilibrium(f, f2);
    }

    /* Access modifiers changed, original: 0000 */
    public void setValueThreshold(float f) {
        this.mFlingForce.setValueThreshold(f);
    }
}
