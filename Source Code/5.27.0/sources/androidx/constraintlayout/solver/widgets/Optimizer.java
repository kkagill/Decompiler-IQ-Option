package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.LinearSystem;
import androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour;

public class Optimizer {
    static final int FLAG_CHAIN_DANGLING = 1;
    static final int FLAG_RECOMPUTE_BOUNDS = 2;
    static final int FLAG_USE_OPTIMIZE = 0;
    public static final int OPTIMIZATION_BARRIER = 2;
    public static final int OPTIMIZATION_CHAIN = 4;
    public static final int OPTIMIZATION_DIMENSIONS = 8;
    public static final int OPTIMIZATION_DIRECT = 1;
    public static final int OPTIMIZATION_GROUPS = 32;
    public static final int OPTIMIZATION_NONE = 0;
    public static final int OPTIMIZATION_RATIO = 16;
    public static final int OPTIMIZATION_STANDARD = 7;
    static boolean[] flags = new boolean[3];

    static void checkMatchParent(ConstraintWidgetContainer constraintWidgetContainer, LinearSystem linearSystem, ConstraintWidget constraintWidget) {
        int i;
        if (constraintWidgetContainer.mListDimensionBehaviors[0] != DimensionBehaviour.WRAP_CONTENT && constraintWidget.mListDimensionBehaviors[0] == DimensionBehaviour.MATCH_PARENT) {
            i = constraintWidget.mLeft.mMargin;
            int width = constraintWidgetContainer.getWidth() - constraintWidget.mRight.mMargin;
            constraintWidget.mLeft.mSolverVariable = linearSystem.createObjectVariable(constraintWidget.mLeft);
            constraintWidget.mRight.mSolverVariable = linearSystem.createObjectVariable(constraintWidget.mRight);
            linearSystem.addEquality(constraintWidget.mLeft.mSolverVariable, i);
            linearSystem.addEquality(constraintWidget.mRight.mSolverVariable, width);
            constraintWidget.mHorizontalResolution = 2;
            constraintWidget.setHorizontalDimension(i, width);
        }
        if (constraintWidgetContainer.mListDimensionBehaviors[1] != DimensionBehaviour.WRAP_CONTENT && constraintWidget.mListDimensionBehaviors[1] == DimensionBehaviour.MATCH_PARENT) {
            i = constraintWidget.mTop.mMargin;
            int height = constraintWidgetContainer.getHeight() - constraintWidget.mBottom.mMargin;
            constraintWidget.mTop.mSolverVariable = linearSystem.createObjectVariable(constraintWidget.mTop);
            constraintWidget.mBottom.mSolverVariable = linearSystem.createObjectVariable(constraintWidget.mBottom);
            linearSystem.addEquality(constraintWidget.mTop.mSolverVariable, i);
            linearSystem.addEquality(constraintWidget.mBottom.mSolverVariable, height);
            if (constraintWidget.mBaselineDistance > 0 || constraintWidget.getVisibility() == 8) {
                constraintWidget.mBaseline.mSolverVariable = linearSystem.createObjectVariable(constraintWidget.mBaseline);
                linearSystem.addEquality(constraintWidget.mBaseline.mSolverVariable, constraintWidget.mBaselineDistance + i);
            }
            constraintWidget.mVerticalResolution = 2;
            constraintWidget.setVerticalDimension(i, height);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x003d A:{RETURN} */
    private static boolean optimizableMatchConstraint(androidx.constraintlayout.solver.widgets.ConstraintWidget r4, int r5) {
        /*
        r0 = r4.mListDimensionBehaviors;
        r0 = r0[r5];
        r1 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        r2 = 0;
        if (r0 == r1) goto L_0x000a;
    L_0x0009:
        return r2;
    L_0x000a:
        r0 = r4.mDimensionRatio;
        r1 = 0;
        r3 = 1;
        r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1));
        if (r0 == 0) goto L_0x001f;
    L_0x0012:
        r4 = r4.mListDimensionBehaviors;
        if (r5 != 0) goto L_0x0017;
    L_0x0016:
        goto L_0x0018;
    L_0x0017:
        r3 = 0;
    L_0x0018:
        r4 = r4[r3];
        r5 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        if (r4 != r5) goto L_0x001e;
    L_0x001e:
        return r2;
    L_0x001f:
        if (r5 != 0) goto L_0x002f;
    L_0x0021:
        r5 = r4.mMatchConstraintDefaultWidth;
        if (r5 == 0) goto L_0x0026;
    L_0x0025:
        return r2;
    L_0x0026:
        r5 = r4.mMatchConstraintMinWidth;
        if (r5 != 0) goto L_0x002e;
    L_0x002a:
        r4 = r4.mMatchConstraintMaxWidth;
        if (r4 == 0) goto L_0x003d;
    L_0x002e:
        return r2;
    L_0x002f:
        r5 = r4.mMatchConstraintDefaultHeight;
        if (r5 == 0) goto L_0x0034;
    L_0x0033:
        return r2;
    L_0x0034:
        r5 = r4.mMatchConstraintMinHeight;
        if (r5 != 0) goto L_0x003e;
    L_0x0038:
        r4 = r4.mMatchConstraintMaxHeight;
        if (r4 == 0) goto L_0x003d;
    L_0x003c:
        goto L_0x003e;
    L_0x003d:
        return r3;
    L_0x003e:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.Optimizer.optimizableMatchConstraint(androidx.constraintlayout.solver.widgets.ConstraintWidget, int):boolean");
    }

    static void analyze(int i, ConstraintWidget constraintWidget) {
        ConstraintWidget constraintWidget2 = constraintWidget;
        constraintWidget.updateResolutionNodes();
        ResolutionAnchor resolutionNode = constraintWidget2.mLeft.getResolutionNode();
        ResolutionAnchor resolutionNode2 = constraintWidget2.mTop.getResolutionNode();
        ResolutionAnchor resolutionNode3 = constraintWidget2.mRight.getResolutionNode();
        ResolutionAnchor resolutionNode4 = constraintWidget2.mBottom.getResolutionNode();
        Object obj = (i & 8) == 8 ? 1 : null;
        Object obj2 = (constraintWidget2.mListDimensionBehaviors[0] == DimensionBehaviour.MATCH_CONSTRAINT && optimizableMatchConstraint(constraintWidget2, 0)) ? 1 : null;
        if (!(resolutionNode.type == 4 || resolutionNode3.type == 4)) {
            if (constraintWidget2.mListDimensionBehaviors[0] == DimensionBehaviour.FIXED || (obj2 != null && constraintWidget.getVisibility() == 8)) {
                if (constraintWidget2.mLeft.mTarget == null && constraintWidget2.mRight.mTarget == null) {
                    resolutionNode.setType(1);
                    resolutionNode3.setType(1);
                    if (obj != null) {
                        resolutionNode3.dependsOn(resolutionNode, 1, constraintWidget.getResolutionWidth());
                    } else {
                        resolutionNode3.dependsOn(resolutionNode, constraintWidget.getWidth());
                    }
                } else if (constraintWidget2.mLeft.mTarget != null && constraintWidget2.mRight.mTarget == null) {
                    resolutionNode.setType(1);
                    resolutionNode3.setType(1);
                    if (obj != null) {
                        resolutionNode3.dependsOn(resolutionNode, 1, constraintWidget.getResolutionWidth());
                    } else {
                        resolutionNode3.dependsOn(resolutionNode, constraintWidget.getWidth());
                    }
                } else if (constraintWidget2.mLeft.mTarget == null && constraintWidget2.mRight.mTarget != null) {
                    resolutionNode.setType(1);
                    resolutionNode3.setType(1);
                    resolutionNode.dependsOn(resolutionNode3, -constraintWidget.getWidth());
                    if (obj != null) {
                        resolutionNode.dependsOn(resolutionNode3, -1, constraintWidget.getResolutionWidth());
                    } else {
                        resolutionNode.dependsOn(resolutionNode3, -constraintWidget.getWidth());
                    }
                } else if (!(constraintWidget2.mLeft.mTarget == null || constraintWidget2.mRight.mTarget == null)) {
                    resolutionNode.setType(2);
                    resolutionNode3.setType(2);
                    if (obj != null) {
                        constraintWidget.getResolutionWidth().addDependent(resolutionNode);
                        constraintWidget.getResolutionWidth().addDependent(resolutionNode3);
                        resolutionNode.setOpposite(resolutionNode3, -1, constraintWidget.getResolutionWidth());
                        resolutionNode3.setOpposite(resolutionNode, 1, constraintWidget.getResolutionWidth());
                    } else {
                        resolutionNode.setOpposite(resolutionNode3, (float) (-constraintWidget.getWidth()));
                        resolutionNode3.setOpposite(resolutionNode, (float) constraintWidget.getWidth());
                    }
                }
            } else if (obj2 != null) {
                int width = constraintWidget.getWidth();
                resolutionNode.setType(1);
                resolutionNode3.setType(1);
                if (constraintWidget2.mLeft.mTarget == null && constraintWidget2.mRight.mTarget == null) {
                    if (obj != null) {
                        resolutionNode3.dependsOn(resolutionNode, 1, constraintWidget.getResolutionWidth());
                    } else {
                        resolutionNode3.dependsOn(resolutionNode, width);
                    }
                } else if (constraintWidget2.mLeft.mTarget == null || constraintWidget2.mRight.mTarget != null) {
                    if (constraintWidget2.mLeft.mTarget != null || constraintWidget2.mRight.mTarget == null) {
                        if (!(constraintWidget2.mLeft.mTarget == null || constraintWidget2.mRight.mTarget == null)) {
                            if (obj != null) {
                                constraintWidget.getResolutionWidth().addDependent(resolutionNode);
                                constraintWidget.getResolutionWidth().addDependent(resolutionNode3);
                            }
                            if (constraintWidget2.mDimensionRatio == 0.0f) {
                                resolutionNode.setType(3);
                                resolutionNode3.setType(3);
                                resolutionNode.setOpposite(resolutionNode3, 0.0f);
                                resolutionNode3.setOpposite(resolutionNode, 0.0f);
                            } else {
                                resolutionNode.setType(2);
                                resolutionNode3.setType(2);
                                resolutionNode.setOpposite(resolutionNode3, (float) (-width));
                                resolutionNode3.setOpposite(resolutionNode, (float) width);
                                constraintWidget2.setWidth(width);
                            }
                        }
                    } else if (obj != null) {
                        resolutionNode.dependsOn(resolutionNode3, -1, constraintWidget.getResolutionWidth());
                    } else {
                        resolutionNode.dependsOn(resolutionNode3, -width);
                    }
                } else if (obj != null) {
                    resolutionNode3.dependsOn(resolutionNode, 1, constraintWidget.getResolutionWidth());
                } else {
                    resolutionNode3.dependsOn(resolutionNode, width);
                }
            }
        }
        Object obj3 = (constraintWidget2.mListDimensionBehaviors[1] == DimensionBehaviour.MATCH_CONSTRAINT && optimizableMatchConstraint(constraintWidget2, 1)) ? 1 : null;
        if (resolutionNode2.type != 4 && resolutionNode4.type != 4) {
            if (constraintWidget2.mListDimensionBehaviors[1] == DimensionBehaviour.FIXED || (obj3 != null && constraintWidget.getVisibility() == 8)) {
                if (constraintWidget2.mTop.mTarget == null && constraintWidget2.mBottom.mTarget == null) {
                    resolutionNode2.setType(1);
                    resolutionNode4.setType(1);
                    if (obj != null) {
                        resolutionNode4.dependsOn(resolutionNode2, 1, constraintWidget.getResolutionHeight());
                    } else {
                        resolutionNode4.dependsOn(resolutionNode2, constraintWidget.getHeight());
                    }
                    if (constraintWidget2.mBaseline.mTarget != null) {
                        constraintWidget2.mBaseline.getResolutionNode().setType(1);
                        resolutionNode2.dependsOn(1, constraintWidget2.mBaseline.getResolutionNode(), -constraintWidget2.mBaselineDistance);
                    }
                } else if (constraintWidget2.mTop.mTarget != null && constraintWidget2.mBottom.mTarget == null) {
                    resolutionNode2.setType(1);
                    resolutionNode4.setType(1);
                    if (obj != null) {
                        resolutionNode4.dependsOn(resolutionNode2, 1, constraintWidget.getResolutionHeight());
                    } else {
                        resolutionNode4.dependsOn(resolutionNode2, constraintWidget.getHeight());
                    }
                    if (constraintWidget2.mBaselineDistance > 0) {
                        constraintWidget2.mBaseline.getResolutionNode().dependsOn(1, resolutionNode2, constraintWidget2.mBaselineDistance);
                    }
                } else if (constraintWidget2.mTop.mTarget == null && constraintWidget2.mBottom.mTarget != null) {
                    resolutionNode2.setType(1);
                    resolutionNode4.setType(1);
                    if (obj != null) {
                        resolutionNode2.dependsOn(resolutionNode4, -1, constraintWidget.getResolutionHeight());
                    } else {
                        resolutionNode2.dependsOn(resolutionNode4, -constraintWidget.getHeight());
                    }
                    if (constraintWidget2.mBaselineDistance > 0) {
                        constraintWidget2.mBaseline.getResolutionNode().dependsOn(1, resolutionNode2, constraintWidget2.mBaselineDistance);
                    }
                } else if (constraintWidget2.mTop.mTarget != null && constraintWidget2.mBottom.mTarget != null) {
                    resolutionNode2.setType(2);
                    resolutionNode4.setType(2);
                    if (obj != null) {
                        resolutionNode2.setOpposite(resolutionNode4, -1, constraintWidget.getResolutionHeight());
                        resolutionNode4.setOpposite(resolutionNode2, 1, constraintWidget.getResolutionHeight());
                        constraintWidget.getResolutionHeight().addDependent(resolutionNode2);
                        constraintWidget.getResolutionWidth().addDependent(resolutionNode4);
                    } else {
                        resolutionNode2.setOpposite(resolutionNode4, (float) (-constraintWidget.getHeight()));
                        resolutionNode4.setOpposite(resolutionNode2, (float) constraintWidget.getHeight());
                    }
                    if (constraintWidget2.mBaselineDistance > 0) {
                        constraintWidget2.mBaseline.getResolutionNode().dependsOn(1, resolutionNode2, constraintWidget2.mBaselineDistance);
                    }
                }
            } else if (obj3 != null) {
                int height = constraintWidget.getHeight();
                resolutionNode2.setType(1);
                resolutionNode4.setType(1);
                if (constraintWidget2.mTop.mTarget == null && constraintWidget2.mBottom.mTarget == null) {
                    if (obj != null) {
                        resolutionNode4.dependsOn(resolutionNode2, 1, constraintWidget.getResolutionHeight());
                    } else {
                        resolutionNode4.dependsOn(resolutionNode2, height);
                    }
                } else if (constraintWidget2.mTop.mTarget == null || constraintWidget2.mBottom.mTarget != null) {
                    if (constraintWidget2.mTop.mTarget != null || constraintWidget2.mBottom.mTarget == null) {
                        if (constraintWidget2.mTop.mTarget != null && constraintWidget2.mBottom.mTarget != null) {
                            if (obj != null) {
                                constraintWidget.getResolutionHeight().addDependent(resolutionNode2);
                                constraintWidget.getResolutionWidth().addDependent(resolutionNode4);
                            }
                            if (constraintWidget2.mDimensionRatio == 0.0f) {
                                resolutionNode2.setType(3);
                                resolutionNode4.setType(3);
                                resolutionNode2.setOpposite(resolutionNode4, 0.0f);
                                resolutionNode4.setOpposite(resolutionNode2, 0.0f);
                                return;
                            }
                            resolutionNode2.setType(2);
                            resolutionNode4.setType(2);
                            resolutionNode2.setOpposite(resolutionNode4, (float) (-height));
                            resolutionNode4.setOpposite(resolutionNode2, (float) height);
                            constraintWidget2.setHeight(height);
                            if (constraintWidget2.mBaselineDistance > 0) {
                                constraintWidget2.mBaseline.getResolutionNode().dependsOn(1, resolutionNode2, constraintWidget2.mBaselineDistance);
                            }
                        }
                    } else if (obj != null) {
                        resolutionNode2.dependsOn(resolutionNode4, -1, constraintWidget.getResolutionHeight());
                    } else {
                        resolutionNode2.dependsOn(resolutionNode4, -height);
                    }
                } else if (obj != null) {
                    resolutionNode4.dependsOn(resolutionNode2, 1, constraintWidget.getResolutionHeight());
                } else {
                    resolutionNode4.dependsOn(resolutionNode2, height);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:74:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0105  */
    /* JADX WARNING: Missing block: B:11:0x0032, code skipped:
            if (r7.mHorizontalChainStyle == 2) goto L_0x0034;
     */
    /* JADX WARNING: Missing block: B:13:0x0036, code skipped:
            r2 = null;
     */
    /* JADX WARNING: Missing block: B:23:0x0048, code skipped:
            if (r7.mVerticalChainStyle == 2) goto L_0x0034;
     */
    static boolean applyChainOptimized(androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r23, androidx.constraintlayout.solver.LinearSystem r24, int r25, int r26, androidx.constraintlayout.solver.widgets.ChainHead r27) {
        /*
        r0 = r24;
        r1 = r25;
        r2 = r27;
        r3 = r2.mFirst;
        r4 = r2.mLast;
        r5 = r2.mFirstVisibleWidget;
        r6 = r2.mLastVisibleWidget;
        r7 = r2.mHead;
        r8 = r2.mTotalWeight;
        r9 = r2.mFirstMatchConstraintWidget;
        r2 = r2.mLastMatchConstraintWidget;
        r9 = r23;
        r2 = r9.mListDimensionBehaviors;
        r2 = r2[r1];
        r9 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        r2 = 2;
        r10 = 1;
        if (r1 != 0) goto L_0x0038;
    L_0x0022:
        r11 = r7.mHorizontalChainStyle;
        if (r11 != 0) goto L_0x0028;
    L_0x0026:
        r11 = 1;
        goto L_0x0029;
    L_0x0028:
        r11 = 0;
    L_0x0029:
        r12 = r7.mHorizontalChainStyle;
        if (r12 != r10) goto L_0x002f;
    L_0x002d:
        r12 = 1;
        goto L_0x0030;
    L_0x002f:
        r12 = 0;
    L_0x0030:
        r7 = r7.mHorizontalChainStyle;
        if (r7 != r2) goto L_0x0036;
    L_0x0034:
        r2 = 1;
        goto L_0x004b;
    L_0x0036:
        r2 = 0;
        goto L_0x004b;
    L_0x0038:
        r11 = r7.mVerticalChainStyle;
        if (r11 != 0) goto L_0x003e;
    L_0x003c:
        r11 = 1;
        goto L_0x003f;
    L_0x003e:
        r11 = 0;
    L_0x003f:
        r12 = r7.mVerticalChainStyle;
        if (r12 != r10) goto L_0x0045;
    L_0x0043:
        r12 = 1;
        goto L_0x0046;
    L_0x0045:
        r12 = 0;
    L_0x0046:
        r7 = r7.mVerticalChainStyle;
        if (r7 != r2) goto L_0x0036;
    L_0x004a:
        goto L_0x0034;
    L_0x004b:
        r14 = r3;
        r10 = 0;
        r13 = 0;
        r15 = 0;
        r16 = 0;
        r17 = 0;
    L_0x0053:
        r7 = 8;
        if (r13 != 0) goto L_0x010c;
    L_0x0057:
        r9 = r14.getVisibility();
        if (r9 == r7) goto L_0x00a1;
    L_0x005d:
        r15 = r15 + 1;
        if (r1 != 0) goto L_0x0066;
    L_0x0061:
        r9 = r14.getWidth();
        goto L_0x006a;
    L_0x0066:
        r9 = r14.getHeight();
    L_0x006a:
        r9 = (float) r9;
        r16 = r16 + r9;
        if (r14 == r5) goto L_0x007a;
    L_0x006f:
        r9 = r14.mListAnchors;
        r9 = r9[r26];
        r9 = r9.getMargin();
        r9 = (float) r9;
        r16 = r16 + r9;
    L_0x007a:
        if (r14 == r6) goto L_0x0089;
    L_0x007c:
        r9 = r14.mListAnchors;
        r19 = r26 + 1;
        r9 = r9[r19];
        r9 = r9.getMargin();
        r9 = (float) r9;
        r16 = r16 + r9;
    L_0x0089:
        r9 = r14.mListAnchors;
        r9 = r9[r26];
        r9 = r9.getMargin();
        r9 = (float) r9;
        r17 = r17 + r9;
        r9 = r14.mListAnchors;
        r19 = r26 + 1;
        r9 = r9[r19];
        r9 = r9.getMargin();
        r9 = (float) r9;
        r17 = r17 + r9;
    L_0x00a1:
        r9 = r14.mListAnchors;
        r9 = r9[r26];
        r9 = r14.getVisibility();
        if (r9 == r7) goto L_0x00df;
    L_0x00ab:
        r7 = r14.mListDimensionBehaviors;
        r7 = r7[r1];
        r9 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        if (r7 != r9) goto L_0x00df;
    L_0x00b3:
        r10 = r10 + 1;
        if (r1 != 0) goto L_0x00c7;
    L_0x00b7:
        r7 = r14.mMatchConstraintDefaultWidth;
        if (r7 == 0) goto L_0x00bd;
    L_0x00bb:
        r7 = 0;
        return r7;
    L_0x00bd:
        r7 = 0;
        r9 = r14.mMatchConstraintMinWidth;
        if (r9 != 0) goto L_0x00c6;
    L_0x00c2:
        r9 = r14.mMatchConstraintMaxWidth;
        if (r9 == 0) goto L_0x00d6;
    L_0x00c6:
        return r7;
    L_0x00c7:
        r7 = 0;
        r9 = r14.mMatchConstraintDefaultHeight;
        if (r9 == 0) goto L_0x00cd;
    L_0x00cc:
        return r7;
    L_0x00cd:
        r9 = r14.mMatchConstraintMinHeight;
        if (r9 != 0) goto L_0x00de;
    L_0x00d1:
        r9 = r14.mMatchConstraintMaxHeight;
        if (r9 == 0) goto L_0x00d6;
    L_0x00d5:
        goto L_0x00de;
    L_0x00d6:
        r9 = r14.mDimensionRatio;
        r18 = 0;
        r9 = (r9 > r18 ? 1 : (r9 == r18 ? 0 : -1));
        if (r9 == 0) goto L_0x00df;
    L_0x00de:
        return r7;
    L_0x00df:
        r7 = r14.mListAnchors;
        r9 = r26 + 1;
        r7 = r7[r9];
        r7 = r7.mTarget;
        if (r7 == 0) goto L_0x0101;
    L_0x00e9:
        r7 = r7.mOwner;
        r9 = r7.mListAnchors;
        r9 = r9[r26];
        r9 = r9.mTarget;
        if (r9 == 0) goto L_0x0101;
    L_0x00f3:
        r9 = r7.mListAnchors;
        r9 = r9[r26];
        r9 = r9.mTarget;
        r9 = r9.mOwner;
        if (r9 == r14) goto L_0x00fe;
    L_0x00fd:
        goto L_0x0101;
    L_0x00fe:
        r19 = r7;
        goto L_0x0103;
    L_0x0101:
        r19 = 0;
    L_0x0103:
        if (r19 == 0) goto L_0x0109;
    L_0x0105:
        r14 = r19;
        goto L_0x0053;
    L_0x0109:
        r13 = 1;
        goto L_0x0053;
    L_0x010c:
        r9 = r3.mListAnchors;
        r9 = r9[r26];
        r9 = r9.getResolutionNode();
        r13 = r4.mListAnchors;
        r19 = r26 + 1;
        r13 = r13[r19];
        r13 = r13.getResolutionNode();
        r7 = r9.target;
        if (r7 == 0) goto L_0x0390;
    L_0x0122:
        r7 = r13.target;
        if (r7 != 0) goto L_0x0128;
    L_0x0126:
        goto L_0x0390;
    L_0x0128:
        r7 = r9.target;
        r7 = r7.state;
        r20 = r3;
        r3 = 1;
        if (r7 != r3) goto L_0x038e;
    L_0x0131:
        r7 = r13.target;
        r7 = r7.state;
        if (r7 == r3) goto L_0x0139;
    L_0x0137:
        goto L_0x038e;
    L_0x0139:
        if (r10 <= 0) goto L_0x013f;
    L_0x013b:
        if (r10 == r15) goto L_0x013f;
    L_0x013d:
        r3 = 0;
        return r3;
    L_0x013f:
        if (r2 != 0) goto L_0x0148;
    L_0x0141:
        if (r11 != 0) goto L_0x0148;
    L_0x0143:
        if (r12 == 0) goto L_0x0146;
    L_0x0145:
        goto L_0x0148;
    L_0x0146:
        r7 = 0;
        goto L_0x0161;
    L_0x0148:
        if (r5 == 0) goto L_0x0154;
    L_0x014a:
        r3 = r5.mListAnchors;
        r3 = r3[r26];
        r3 = r3.getMargin();
        r7 = (float) r3;
        goto L_0x0155;
    L_0x0154:
        r7 = 0;
    L_0x0155:
        if (r6 == 0) goto L_0x0161;
    L_0x0157:
        r3 = r6.mListAnchors;
        r3 = r3[r19];
        r3 = r3.getMargin();
        r3 = (float) r3;
        r7 = r7 + r3;
    L_0x0161:
        r3 = r9.target;
        r3 = r3.resolvedOffset;
        r6 = r13.target;
        r6 = r6.resolvedOffset;
        r13 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1));
        if (r13 >= 0) goto L_0x016f;
    L_0x016d:
        r6 = r6 - r3;
        goto L_0x0171;
    L_0x016f:
        r6 = r3 - r6;
    L_0x0171:
        r6 = r6 - r16;
        r21 = 1;
        if (r10 <= 0) goto L_0x0227;
    L_0x0177:
        if (r10 != r15) goto L_0x0227;
    L_0x0179:
        r2 = r14.getParent();
        if (r2 == 0) goto L_0x018d;
    L_0x017f:
        r2 = r14.getParent();
        r2 = r2.mListDimensionBehaviors;
        r2 = r2[r1];
        r5 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (r2 != r5) goto L_0x018d;
    L_0x018b:
        r2 = 0;
        return r2;
    L_0x018d:
        r6 = r6 + r16;
        r6 = r6 - r17;
        r2 = r20;
    L_0x0193:
        if (r2 == 0) goto L_0x0225;
    L_0x0195:
        r5 = androidx.constraintlayout.solver.LinearSystem.sMetrics;
        if (r5 == 0) goto L_0x01b1;
    L_0x0199:
        r5 = androidx.constraintlayout.solver.LinearSystem.sMetrics;
        r11 = r5.nonresolvedWidgets;
        r11 = r11 - r21;
        r5.nonresolvedWidgets = r11;
        r5 = androidx.constraintlayout.solver.LinearSystem.sMetrics;
        r11 = r5.resolvedWidgets;
        r11 = r11 + r21;
        r5.resolvedWidgets = r11;
        r5 = androidx.constraintlayout.solver.LinearSystem.sMetrics;
        r11 = r5.chainConnectionResolved;
        r11 = r11 + r21;
        r5.chainConnectionResolved = r11;
    L_0x01b1:
        r5 = r2.mNextChainWidget;
        r5 = r5[r1];
        if (r5 != 0) goto L_0x01b9;
    L_0x01b7:
        if (r2 != r4) goto L_0x0222;
    L_0x01b9:
        r7 = (float) r10;
        r7 = r6 / r7;
        r11 = 0;
        r12 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1));
        if (r12 <= 0) goto L_0x01d4;
    L_0x01c1:
        r7 = r2.mWeight;
        r7 = r7[r1];
        r11 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
        r7 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1));
        if (r7 != 0) goto L_0x01cd;
    L_0x01cb:
        r7 = 0;
        goto L_0x01d4;
    L_0x01cd:
        r7 = r2.mWeight;
        r7 = r7[r1];
        r7 = r7 * r6;
        r7 = r7 / r8;
    L_0x01d4:
        r11 = r2.getVisibility();
        r12 = 8;
        if (r11 != r12) goto L_0x01dd;
    L_0x01dc:
        r7 = 0;
    L_0x01dd:
        r11 = r2.mListAnchors;
        r11 = r11[r26];
        r11 = r11.getMargin();
        r11 = (float) r11;
        r3 = r3 + r11;
        r11 = r2.mListAnchors;
        r11 = r11[r26];
        r11 = r11.getResolutionNode();
        r12 = r9.resolvedTarget;
        r11.resolve(r12, r3);
        r11 = r2.mListAnchors;
        r11 = r11[r19];
        r11 = r11.getResolutionNode();
        r12 = r9.resolvedTarget;
        r3 = r3 + r7;
        r11.resolve(r12, r3);
        r7 = r2.mListAnchors;
        r7 = r7[r26];
        r7 = r7.getResolutionNode();
        r7.addResolvedValue(r0);
        r7 = r2.mListAnchors;
        r7 = r7[r19];
        r7 = r7.getResolutionNode();
        r7.addResolvedValue(r0);
        r2 = r2.mListAnchors;
        r2 = r2[r19];
        r2 = r2.getMargin();
        r2 = (float) r2;
        r3 = r3 + r2;
    L_0x0222:
        r2 = r5;
        goto L_0x0193;
    L_0x0225:
        r2 = 1;
        return r2;
    L_0x0227:
        r8 = 0;
        r8 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r8 >= 0) goto L_0x022f;
    L_0x022c:
        r2 = 1;
        r11 = 0;
        r12 = 0;
    L_0x022f:
        if (r2 == 0) goto L_0x02b4;
    L_0x0231:
        r6 = r6 - r7;
        r2 = r20;
        r5 = r2.getBiasPercent(r1);
        r6 = r6 * r5;
        r3 = r3 + r6;
    L_0x023b:
        if (r2 == 0) goto L_0x02bb;
    L_0x023d:
        r5 = androidx.constraintlayout.solver.LinearSystem.sMetrics;
        if (r5 == 0) goto L_0x0259;
    L_0x0241:
        r5 = androidx.constraintlayout.solver.LinearSystem.sMetrics;
        r6 = r5.nonresolvedWidgets;
        r6 = r6 - r21;
        r5.nonresolvedWidgets = r6;
        r5 = androidx.constraintlayout.solver.LinearSystem.sMetrics;
        r6 = r5.resolvedWidgets;
        r6 = r6 + r21;
        r5.resolvedWidgets = r6;
        r5 = androidx.constraintlayout.solver.LinearSystem.sMetrics;
        r6 = r5.chainConnectionResolved;
        r6 = r6 + r21;
        r5.chainConnectionResolved = r6;
    L_0x0259:
        r5 = r2.mNextChainWidget;
        r5 = r5[r1];
        if (r5 != 0) goto L_0x0261;
    L_0x025f:
        if (r2 != r4) goto L_0x02b2;
    L_0x0261:
        if (r1 != 0) goto L_0x0268;
    L_0x0263:
        r6 = r2.getWidth();
        goto L_0x026c;
    L_0x0268:
        r6 = r2.getHeight();
    L_0x026c:
        r6 = (float) r6;
        r7 = r2.mListAnchors;
        r7 = r7[r26];
        r7 = r7.getMargin();
        r7 = (float) r7;
        r3 = r3 + r7;
        r7 = r2.mListAnchors;
        r7 = r7[r26];
        r7 = r7.getResolutionNode();
        r8 = r9.resolvedTarget;
        r7.resolve(r8, r3);
        r7 = r2.mListAnchors;
        r7 = r7[r19];
        r7 = r7.getResolutionNode();
        r8 = r9.resolvedTarget;
        r3 = r3 + r6;
        r7.resolve(r8, r3);
        r6 = r2.mListAnchors;
        r6 = r6[r26];
        r6 = r6.getResolutionNode();
        r6.addResolvedValue(r0);
        r6 = r2.mListAnchors;
        r6 = r6[r19];
        r6 = r6.getResolutionNode();
        r6.addResolvedValue(r0);
        r2 = r2.mListAnchors;
        r2 = r2[r19];
        r2 = r2.getMargin();
        r2 = (float) r2;
        r3 = r3 + r2;
    L_0x02b2:
        r2 = r5;
        goto L_0x023b;
    L_0x02b4:
        r2 = r20;
        if (r11 != 0) goto L_0x02be;
    L_0x02b8:
        if (r12 == 0) goto L_0x02bb;
    L_0x02ba:
        goto L_0x02be;
    L_0x02bb:
        r0 = 1;
        goto L_0x038d;
    L_0x02be:
        if (r11 == 0) goto L_0x02c2;
    L_0x02c0:
        r6 = r6 - r7;
        goto L_0x02c5;
    L_0x02c2:
        if (r12 == 0) goto L_0x02c5;
    L_0x02c4:
        goto L_0x02c0;
    L_0x02c5:
        r7 = r15 + 1;
        r7 = (float) r7;
        r7 = r6 / r7;
        if (r12 == 0) goto L_0x02d7;
    L_0x02cc:
        r8 = 1;
        if (r15 <= r8) goto L_0x02d3;
    L_0x02cf:
        r7 = r15 + -1;
        r7 = (float) r7;
        goto L_0x02d5;
    L_0x02d3:
        r7 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
    L_0x02d5:
        r7 = r6 / r7;
    L_0x02d7:
        r6 = r2.getVisibility();
        r8 = 8;
        if (r6 == r8) goto L_0x02e2;
    L_0x02df:
        r6 = r3 + r7;
        goto L_0x02e3;
    L_0x02e2:
        r6 = r3;
    L_0x02e3:
        if (r12 == 0) goto L_0x02f2;
    L_0x02e5:
        r8 = 1;
        if (r15 <= r8) goto L_0x02f2;
    L_0x02e8:
        r6 = r5.mListAnchors;
        r6 = r6[r26];
        r6 = r6.getMargin();
        r6 = (float) r6;
        r6 = r6 + r3;
    L_0x02f2:
        if (r11 == 0) goto L_0x0300;
    L_0x02f4:
        if (r5 == 0) goto L_0x0300;
    L_0x02f6:
        r3 = r5.mListAnchors;
        r3 = r3[r26];
        r3 = r3.getMargin();
        r3 = (float) r3;
        r6 = r6 + r3;
    L_0x0300:
        if (r2 == 0) goto L_0x02bb;
    L_0x0302:
        r3 = androidx.constraintlayout.solver.LinearSystem.sMetrics;
        if (r3 == 0) goto L_0x031e;
    L_0x0306:
        r3 = androidx.constraintlayout.solver.LinearSystem.sMetrics;
        r10 = r3.nonresolvedWidgets;
        r10 = r10 - r21;
        r3.nonresolvedWidgets = r10;
        r3 = androidx.constraintlayout.solver.LinearSystem.sMetrics;
        r10 = r3.resolvedWidgets;
        r10 = r10 + r21;
        r3.resolvedWidgets = r10;
        r3 = androidx.constraintlayout.solver.LinearSystem.sMetrics;
        r10 = r3.chainConnectionResolved;
        r10 = r10 + r21;
        r3.chainConnectionResolved = r10;
    L_0x031e:
        r3 = r2.mNextChainWidget;
        r3 = r3[r1];
        if (r3 != 0) goto L_0x032a;
    L_0x0324:
        if (r2 != r4) goto L_0x0327;
    L_0x0326:
        goto L_0x032a;
    L_0x0327:
        r8 = 8;
        goto L_0x038a;
    L_0x032a:
        if (r1 != 0) goto L_0x0331;
    L_0x032c:
        r8 = r2.getWidth();
        goto L_0x0335;
    L_0x0331:
        r8 = r2.getHeight();
    L_0x0335:
        r8 = (float) r8;
        if (r2 == r5) goto L_0x0342;
    L_0x0338:
        r10 = r2.mListAnchors;
        r10 = r10[r26];
        r10 = r10.getMargin();
        r10 = (float) r10;
        r6 = r6 + r10;
    L_0x0342:
        r10 = r2.mListAnchors;
        r10 = r10[r26];
        r10 = r10.getResolutionNode();
        r11 = r9.resolvedTarget;
        r10.resolve(r11, r6);
        r10 = r2.mListAnchors;
        r10 = r10[r19];
        r10 = r10.getResolutionNode();
        r11 = r9.resolvedTarget;
        r12 = r6 + r8;
        r10.resolve(r11, r12);
        r10 = r2.mListAnchors;
        r10 = r10[r26];
        r10 = r10.getResolutionNode();
        r10.addResolvedValue(r0);
        r10 = r2.mListAnchors;
        r10 = r10[r19];
        r10 = r10.getResolutionNode();
        r10.addResolvedValue(r0);
        r2 = r2.mListAnchors;
        r2 = r2[r19];
        r2 = r2.getMargin();
        r2 = (float) r2;
        r8 = r8 + r2;
        r6 = r6 + r8;
        if (r3 == 0) goto L_0x0327;
    L_0x0381:
        r2 = r3.getVisibility();
        r8 = 8;
        if (r2 == r8) goto L_0x038a;
    L_0x0389:
        r6 = r6 + r7;
    L_0x038a:
        r2 = r3;
        goto L_0x0300;
    L_0x038d:
        return r0;
    L_0x038e:
        r0 = 0;
        return r0;
    L_0x0390:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.Optimizer.applyChainOptimized(androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer, androidx.constraintlayout.solver.LinearSystem, int, int, androidx.constraintlayout.solver.widgets.ChainHead):boolean");
    }

    static void setOptimizedWidget(ConstraintWidget constraintWidget, int i, int i2) {
        int i3 = i * 2;
        int i4 = i3 + 1;
        constraintWidget.mListAnchors[i3].getResolutionNode().resolvedTarget = constraintWidget.getParent().mLeft.getResolutionNode();
        constraintWidget.mListAnchors[i3].getResolutionNode().resolvedOffset = (float) i2;
        constraintWidget.mListAnchors[i3].getResolutionNode().state = 1;
        constraintWidget.mListAnchors[i4].getResolutionNode().resolvedTarget = constraintWidget.mListAnchors[i3].getResolutionNode();
        constraintWidget.mListAnchors[i4].getResolutionNode().resolvedOffset = (float) constraintWidget.getLength(i);
        constraintWidget.mListAnchors[i4].getResolutionNode().state = 1;
    }
}
