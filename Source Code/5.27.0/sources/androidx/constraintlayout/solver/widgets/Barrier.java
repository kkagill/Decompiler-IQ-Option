package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.LinearSystem;
import androidx.constraintlayout.solver.Metrics;
import androidx.constraintlayout.solver.SolverVariable;
import androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour;
import java.util.ArrayList;

public class Barrier extends Helper {
    public static final int BOTTOM = 3;
    public static final int LEFT = 0;
    public static final int RIGHT = 1;
    public static final int TOP = 2;
    private boolean mAllowsGoneWidget = true;
    private int mBarrierType = 0;
    private ArrayList<ResolutionAnchor> mNodes = new ArrayList(4);

    public boolean allowedInBarrier() {
        return true;
    }

    public void setBarrierType(int i) {
        this.mBarrierType = i;
    }

    public void setAllowsGoneWidget(boolean z) {
        this.mAllowsGoneWidget = z;
    }

    public boolean allowsGoneWidget() {
        return this.mAllowsGoneWidget;
    }

    public void resetResolutionNodes() {
        super.resetResolutionNodes();
        this.mNodes.clear();
    }

    public void analyze(int i) {
        if (this.mParent != null && ((ConstraintWidgetContainer) this.mParent).optimizeFor(2)) {
            ResolutionAnchor resolutionNode;
            i = this.mBarrierType;
            if (i == 0) {
                resolutionNode = this.mLeft.getResolutionNode();
            } else if (i == 1) {
                resolutionNode = this.mRight.getResolutionNode();
            } else if (i == 2) {
                resolutionNode = this.mTop.getResolutionNode();
            } else if (i == 3) {
                resolutionNode = this.mBottom.getResolutionNode();
            } else {
                return;
            }
            resolutionNode.setType(5);
            int i2 = this.mBarrierType;
            if (i2 == 0 || i2 == 1) {
                this.mTop.getResolutionNode().resolve(null, 0.0f);
                this.mBottom.getResolutionNode().resolve(null, 0.0f);
            } else {
                this.mLeft.getResolutionNode().resolve(null, 0.0f);
                this.mRight.getResolutionNode().resolve(null, 0.0f);
            }
            this.mNodes.clear();
            for (i2 = 0; i2 < this.mWidgetsCount; i2++) {
                ConstraintWidget constraintWidget = this.mWidgets[i2];
                if (this.mAllowsGoneWidget || constraintWidget.allowedInBarrier()) {
                    int i3 = this.mBarrierType;
                    Object resolutionNode2 = i3 != 0 ? i3 != 1 ? i3 != 2 ? i3 != 3 ? null : constraintWidget.mBottom.getResolutionNode() : constraintWidget.mTop.getResolutionNode() : constraintWidget.mRight.getResolutionNode() : constraintWidget.mLeft.getResolutionNode();
                    if (resolutionNode2 != null) {
                        this.mNodes.add(resolutionNode2);
                        resolutionNode2.addDependent(resolutionNode);
                    }
                }
            }
        }
    }

    public void resolve() {
        ResolutionAnchor resolutionNode;
        int i = this.mBarrierType;
        float f = Float.MAX_VALUE;
        if (i != 0) {
            if (i == 1) {
                resolutionNode = this.mRight.getResolutionNode();
            } else if (i == 2) {
                resolutionNode = this.mTop.getResolutionNode();
            } else if (i == 3) {
                resolutionNode = this.mBottom.getResolutionNode();
            } else {
                return;
            }
            f = 0.0f;
        } else {
            resolutionNode = this.mLeft.getResolutionNode();
        }
        int size = this.mNodes.size();
        ResolutionAnchor resolutionAnchor = null;
        int i2 = 0;
        while (i2 < size) {
            ResolutionAnchor resolutionAnchor2 = (ResolutionAnchor) this.mNodes.get(i2);
            if (resolutionAnchor2.state == 1) {
                int i3 = this.mBarrierType;
                if (i3 == 0 || i3 == 2) {
                    if (resolutionAnchor2.resolvedOffset < f) {
                        f = resolutionAnchor2.resolvedOffset;
                        resolutionAnchor = resolutionAnchor2.resolvedTarget;
                    }
                } else if (resolutionAnchor2.resolvedOffset > f) {
                    f = resolutionAnchor2.resolvedOffset;
                    resolutionAnchor = resolutionAnchor2.resolvedTarget;
                }
                i2++;
            } else {
                return;
            }
        }
        if (LinearSystem.getMetrics() != null) {
            Metrics metrics = LinearSystem.getMetrics();
            metrics.barrierConnectionResolved++;
        }
        resolutionNode.resolvedTarget = resolutionAnchor;
        resolutionNode.resolvedOffset = f;
        resolutionNode.didResolve();
        i = this.mBarrierType;
        if (i == 0) {
            this.mRight.getResolutionNode().resolve(resolutionAnchor, f);
        } else if (i == 1) {
            this.mLeft.getResolutionNode().resolve(resolutionAnchor, f);
        } else if (i == 2) {
            this.mBottom.getResolutionNode().resolve(resolutionAnchor, f);
        } else if (i == 3) {
            this.mTop.getResolutionNode().resolve(resolutionAnchor, f);
        }
    }

    public void addToSolver(LinearSystem linearSystem) {
        int i;
        this.mListAnchors[0] = this.mLeft;
        this.mListAnchors[2] = this.mTop;
        this.mListAnchors[1] = this.mRight;
        this.mListAnchors[3] = this.mBottom;
        for (i = 0; i < this.mListAnchors.length; i++) {
            this.mListAnchors[i].mSolverVariable = linearSystem.createObjectVariable(this.mListAnchors[i]);
        }
        i = this.mBarrierType;
        if (i >= 0 && i < 4) {
            boolean z;
            ConstraintAnchor constraintAnchor = this.mListAnchors[this.mBarrierType];
            for (int i2 = 0; i2 < this.mWidgetsCount; i2++) {
                ConstraintWidget constraintWidget = this.mWidgets[i2];
                if (this.mAllowsGoneWidget || constraintWidget.allowedInBarrier()) {
                    int i3 = this.mBarrierType;
                    if ((i3 != 0 && i3 != 1) || constraintWidget.getHorizontalDimensionBehaviour() != DimensionBehaviour.MATCH_CONSTRAINT) {
                        i3 = this.mBarrierType;
                        if ((i3 == 2 || i3 == 3) && constraintWidget.getVerticalDimensionBehaviour() == DimensionBehaviour.MATCH_CONSTRAINT) {
                        }
                    }
                    z = true;
                    break;
                }
            }
            z = false;
            int i4 = this.mBarrierType;
            if (i4 == 0 || i4 == 1 ? getParent().getHorizontalDimensionBehaviour() != DimensionBehaviour.WRAP_CONTENT : getParent().getVerticalDimensionBehaviour() != DimensionBehaviour.WRAP_CONTENT) {
                z = false;
            }
            for (i4 = 0; i4 < this.mWidgetsCount; i4++) {
                ConstraintWidget constraintWidget2 = this.mWidgets[i4];
                if (this.mAllowsGoneWidget || constraintWidget2.allowedInBarrier()) {
                    SolverVariable createObjectVariable = linearSystem.createObjectVariable(constraintWidget2.mListAnchors[this.mBarrierType]);
                    ConstraintAnchor[] constraintAnchorArr = constraintWidget2.mListAnchors;
                    int i5 = this.mBarrierType;
                    constraintAnchorArr[i5].mSolverVariable = createObjectVariable;
                    if (i5 == 0 || i5 == 2) {
                        linearSystem.addLowerBarrier(constraintAnchor.mSolverVariable, createObjectVariable, z);
                    } else {
                        linearSystem.addGreaterBarrier(constraintAnchor.mSolverVariable, createObjectVariable, z);
                    }
                }
            }
            i = this.mBarrierType;
            if (i == 0) {
                linearSystem.addEquality(this.mRight.mSolverVariable, this.mLeft.mSolverVariable, 0, 6);
                if (!z) {
                    linearSystem.addEquality(this.mLeft.mSolverVariable, this.mParent.mRight.mSolverVariable, 0, 5);
                }
            } else if (i == 1) {
                linearSystem.addEquality(this.mLeft.mSolverVariable, this.mRight.mSolverVariable, 0, 6);
                if (!z) {
                    linearSystem.addEquality(this.mLeft.mSolverVariable, this.mParent.mLeft.mSolverVariable, 0, 5);
                }
            } else if (i == 2) {
                linearSystem.addEquality(this.mBottom.mSolverVariable, this.mTop.mSolverVariable, 0, 6);
                if (!z) {
                    linearSystem.addEquality(this.mTop.mSolverVariable, this.mParent.mBottom.mSolverVariable, 0, 5);
                }
            } else if (i == 3) {
                linearSystem.addEquality(this.mTop.mSolverVariable, this.mBottom.mSolverVariable, 0, 6);
                if (!z) {
                    linearSystem.addEquality(this.mTop.mSolverVariable, this.mParent.mTop.mSolverVariable, 0, 5);
                }
            }
        }
    }
}
