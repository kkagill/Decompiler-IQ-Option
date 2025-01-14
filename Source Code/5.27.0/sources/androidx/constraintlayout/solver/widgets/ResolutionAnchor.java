package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.LinearSystem;
import androidx.constraintlayout.solver.Metrics;
import androidx.constraintlayout.solver.SolverVariable;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type;

public class ResolutionAnchor extends ResolutionNode {
    public static final int BARRIER_CONNECTION = 5;
    public static final int CENTER_CONNECTION = 2;
    public static final int CHAIN_CONNECTION = 4;
    public static final int DIRECT_CONNECTION = 1;
    public static final int MATCH_CONNECTION = 3;
    public static final int UNCONNECTED = 0;
    float computedValue;
    private ResolutionDimension dimension = null;
    private int dimensionMultiplier = 1;
    ConstraintAnchor myAnchor;
    float offset;
    private ResolutionAnchor opposite;
    private ResolutionDimension oppositeDimension = null;
    private int oppositeDimensionMultiplier = 1;
    private float oppositeOffset;
    float resolvedOffset;
    ResolutionAnchor resolvedTarget;
    ResolutionAnchor target;
    int type = 0;

    /* Access modifiers changed, original: 0000 */
    public String sType(int i) {
        return i == 1 ? "DIRECT" : i == 2 ? "CENTER" : i == 3 ? "MATCH" : i == 4 ? "CHAIN" : i == 5 ? "BARRIER" : "UNCONNECTED";
    }

    public ResolutionAnchor(ConstraintAnchor constraintAnchor) {
        this.myAnchor = constraintAnchor;
    }

    public void remove(ResolutionDimension resolutionDimension) {
        ResolutionDimension resolutionDimension2 = this.dimension;
        if (resolutionDimension2 == resolutionDimension) {
            this.dimension = null;
            this.offset = (float) this.dimensionMultiplier;
        } else if (resolutionDimension2 == this.oppositeDimension) {
            this.oppositeDimension = null;
            this.oppositeOffset = (float) this.oppositeDimensionMultiplier;
        }
        resolve();
    }

    public String toString() {
        StringBuilder stringBuilder;
        if (this.state == 1) {
            String str = ", RESOLVED: ";
            String str2 = "[";
            if (this.resolvedTarget == this) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str2);
                stringBuilder.append(this.myAnchor);
                stringBuilder.append(str);
                stringBuilder.append(this.resolvedOffset);
                stringBuilder.append("]  type: ");
                stringBuilder.append(sType(this.type));
                return stringBuilder.toString();
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append(str2);
            stringBuilder.append(this.myAnchor);
            stringBuilder.append(str);
            stringBuilder.append(this.resolvedTarget);
            stringBuilder.append(":");
            stringBuilder.append(this.resolvedOffset);
            stringBuilder.append("] type: ");
            stringBuilder.append(sType(this.type));
            return stringBuilder.toString();
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("{ ");
        stringBuilder.append(this.myAnchor);
        stringBuilder.append(" UNRESOLVED} type: ");
        stringBuilder.append(sType(this.type));
        return stringBuilder.toString();
    }

    public void resolve(ResolutionAnchor resolutionAnchor, float f) {
        if (this.state == 0 || !(this.resolvedTarget == resolutionAnchor || this.resolvedOffset == f)) {
            this.resolvedTarget = resolutionAnchor;
            this.resolvedOffset = f;
            if (this.state == 1) {
                invalidate();
            }
            didResolve();
        }
    }

    public void resolve() {
        Object obj = 1;
        if (this.state != 1 && this.type != 4) {
            ResolutionAnchor resolutionAnchor;
            Metrics metrics;
            ResolutionAnchor resolutionAnchor2;
            ResolutionDimension resolutionDimension = this.dimension;
            if (resolutionDimension != null) {
                if (resolutionDimension.state == 1) {
                    this.offset = ((float) this.dimensionMultiplier) * this.dimension.value;
                } else {
                    return;
                }
            }
            resolutionDimension = this.oppositeDimension;
            if (resolutionDimension != null) {
                if (resolutionDimension.state == 1) {
                    this.oppositeOffset = ((float) this.oppositeDimensionMultiplier) * this.oppositeDimension.value;
                } else {
                    return;
                }
            }
            if (this.type == 1) {
                resolutionAnchor = this.target;
                if (resolutionAnchor == null || resolutionAnchor.state == 1) {
                    resolutionAnchor = this.target;
                    if (resolutionAnchor == null) {
                        this.resolvedTarget = this;
                        this.resolvedOffset = this.offset;
                    } else {
                        this.resolvedTarget = resolutionAnchor.resolvedTarget;
                        this.resolvedOffset = resolutionAnchor.resolvedOffset + this.offset;
                    }
                    didResolve();
                }
            }
            if (this.type == 2) {
                resolutionAnchor = this.target;
                if (resolutionAnchor != null && resolutionAnchor.state == 1) {
                    resolutionAnchor = this.opposite;
                    if (resolutionAnchor != null) {
                        resolutionAnchor = resolutionAnchor.target;
                        if (resolutionAnchor != null && resolutionAnchor.state == 1) {
                            float f;
                            float f2;
                            if (LinearSystem.getMetrics() != null) {
                                metrics = LinearSystem.getMetrics();
                                metrics.centerConnectionResolved++;
                            }
                            this.resolvedTarget = this.target.resolvedTarget;
                            resolutionAnchor = this.opposite;
                            resolutionAnchor.resolvedTarget = resolutionAnchor.target.resolvedTarget;
                            int i = 0;
                            if (!(this.myAnchor.mType == Type.RIGHT || this.myAnchor.mType == Type.BOTTOM)) {
                                obj = null;
                            }
                            if (obj != null) {
                                f = this.target.resolvedOffset;
                                f2 = this.opposite.target.resolvedOffset;
                            } else {
                                f = this.opposite.target.resolvedOffset;
                                f2 = this.target.resolvedOffset;
                            }
                            f -= f2;
                            if (this.myAnchor.mType == Type.LEFT || this.myAnchor.mType == Type.RIGHT) {
                                f -= (float) this.myAnchor.mOwner.getWidth();
                                f2 = this.myAnchor.mOwner.mHorizontalBiasPercent;
                            } else {
                                f -= (float) this.myAnchor.mOwner.getHeight();
                                f2 = this.myAnchor.mOwner.mVerticalBiasPercent;
                            }
                            int margin = this.myAnchor.getMargin();
                            int margin2 = this.opposite.myAnchor.getMargin();
                            if (this.myAnchor.getTarget() == this.opposite.myAnchor.getTarget()) {
                                f2 = 0.5f;
                                margin2 = 0;
                            } else {
                                i = margin;
                            }
                            float f3 = (float) i;
                            float f4 = (float) margin2;
                            f = (f - f3) - f4;
                            if (obj != null) {
                                resolutionAnchor2 = this.opposite;
                                resolutionAnchor2.resolvedOffset = (resolutionAnchor2.target.resolvedOffset + f4) + (f * f2);
                                this.resolvedOffset = (this.target.resolvedOffset - f3) - (f * (1.0f - f2));
                            } else {
                                this.resolvedOffset = (this.target.resolvedOffset + f3) + (f * f2);
                                resolutionAnchor2 = this.opposite;
                                resolutionAnchor2.resolvedOffset = (resolutionAnchor2.target.resolvedOffset - f4) - (f * (1.0f - f2));
                            }
                            didResolve();
                            this.opposite.didResolve();
                        }
                    }
                }
            }
            if (this.type == 3) {
                resolutionAnchor = this.target;
                if (resolutionAnchor != null && resolutionAnchor.state == 1) {
                    resolutionAnchor = this.opposite;
                    if (resolutionAnchor != null) {
                        resolutionAnchor = resolutionAnchor.target;
                        if (resolutionAnchor != null && resolutionAnchor.state == 1) {
                            if (LinearSystem.getMetrics() != null) {
                                metrics = LinearSystem.getMetrics();
                                metrics.matchConnectionResolved++;
                            }
                            resolutionAnchor = this.target;
                            this.resolvedTarget = resolutionAnchor.resolvedTarget;
                            resolutionAnchor2 = this.opposite;
                            ResolutionAnchor resolutionAnchor3 = resolutionAnchor2.target;
                            resolutionAnchor2.resolvedTarget = resolutionAnchor3.resolvedTarget;
                            this.resolvedOffset = resolutionAnchor.resolvedOffset + this.offset;
                            resolutionAnchor2.resolvedOffset = resolutionAnchor3.resolvedOffset + resolutionAnchor2.offset;
                            didResolve();
                            this.opposite.didResolve();
                        }
                    }
                }
            }
            if (this.type == 5) {
                this.myAnchor.mOwner.resolve();
            }
        }
    }

    public void setType(int i) {
        this.type = i;
    }

    public void reset() {
        super.reset();
        this.target = null;
        this.offset = 0.0f;
        this.dimension = null;
        this.dimensionMultiplier = 1;
        this.oppositeDimension = null;
        this.oppositeDimensionMultiplier = 1;
        this.resolvedTarget = null;
        this.resolvedOffset = 0.0f;
        this.computedValue = 0.0f;
        this.opposite = null;
        this.oppositeOffset = 0.0f;
        this.type = 0;
    }

    public void update() {
        ConstraintAnchor target = this.myAnchor.getTarget();
        if (target != null) {
            if (target.getTarget() == this.myAnchor) {
                this.type = 4;
                target.getResolutionNode().type = 4;
            }
            int margin = this.myAnchor.getMargin();
            if (this.myAnchor.mType == Type.RIGHT || this.myAnchor.mType == Type.BOTTOM) {
                margin = -margin;
            }
            dependsOn(target.getResolutionNode(), margin);
        }
    }

    public void dependsOn(int i, ResolutionAnchor resolutionAnchor, int i2) {
        this.type = i;
        this.target = resolutionAnchor;
        this.offset = (float) i2;
        this.target.addDependent(this);
    }

    public void dependsOn(ResolutionAnchor resolutionAnchor, int i) {
        this.target = resolutionAnchor;
        this.offset = (float) i;
        this.target.addDependent(this);
    }

    public void dependsOn(ResolutionAnchor resolutionAnchor, int i, ResolutionDimension resolutionDimension) {
        this.target = resolutionAnchor;
        this.target.addDependent(this);
        this.dimension = resolutionDimension;
        this.dimensionMultiplier = i;
        this.dimension.addDependent(this);
    }

    public void setOpposite(ResolutionAnchor resolutionAnchor, float f) {
        this.opposite = resolutionAnchor;
        this.oppositeOffset = f;
    }

    public void setOpposite(ResolutionAnchor resolutionAnchor, int i, ResolutionDimension resolutionDimension) {
        this.opposite = resolutionAnchor;
        this.oppositeDimension = resolutionDimension;
        this.oppositeDimensionMultiplier = i;
    }

    /* Access modifiers changed, original: 0000 */
    public void addResolvedValue(LinearSystem linearSystem) {
        SolverVariable solverVariable = this.myAnchor.getSolverVariable();
        ResolutionAnchor resolutionAnchor = this.resolvedTarget;
        if (resolutionAnchor == null) {
            linearSystem.addEquality(solverVariable, (int) (this.resolvedOffset + 0.5f));
        } else {
            linearSystem.addEquality(solverVariable, linearSystem.createObjectVariable(resolutionAnchor.myAnchor), (int) (this.resolvedOffset + 0.5f), 6);
        }
    }

    public float getResolvedValue() {
        return this.resolvedOffset;
    }
}
