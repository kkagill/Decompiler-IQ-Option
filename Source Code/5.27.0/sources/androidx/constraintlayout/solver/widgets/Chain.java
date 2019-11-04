package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.LinearSystem;

class Chain {
    private static final boolean DEBUG = false;

    Chain() {
    }

    static void applyChainConstraints(ConstraintWidgetContainer constraintWidgetContainer, LinearSystem linearSystem, int i) {
        int i2;
        ChainHead[] chainHeadArr;
        int i3;
        int i4 = 0;
        if (i == 0) {
            i2 = constraintWidgetContainer.mHorizontalChainsSize;
            chainHeadArr = constraintWidgetContainer.mHorizontalChainsArray;
            i3 = i2;
            i2 = 0;
        } else {
            i2 = 2;
            int i5 = constraintWidgetContainer.mVerticalChainsSize;
            i3 = i5;
            chainHeadArr = constraintWidgetContainer.mVerticalChainsArray;
        }
        while (i4 < i3) {
            ChainHead chainHead = chainHeadArr[i4];
            chainHead.define();
            if (!constraintWidgetContainer.optimizeFor(4)) {
                applyChainConstraints(constraintWidgetContainer, linearSystem, i, i2, chainHead);
            } else if (!Optimizer.applyChainOptimized(constraintWidgetContainer, linearSystem, i, i2, chainHead)) {
                applyChainConstraints(constraintWidgetContainer, linearSystem, i, i2, chainHead);
            }
            i4++;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:293:0x0390 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x038f  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0179  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x03b1  */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x04b8  */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x0483  */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x04e2  */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x04dd  */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x04ed  */
    /* JADX WARNING: Removed duplicated region for block: B:269:0x04e8  */
    /* JADX WARNING: Removed duplicated region for block: B:272:0x04f1  */
    /* JADX WARNING: Removed duplicated region for block: B:278:0x0503  */
    /* JADX WARNING: Missing block: B:15:0x0035, code skipped:
            if (r2.mHorizontalChainStyle == 2) goto L_0x004a;
     */
    /* JADX WARNING: Missing block: B:25:0x0048, code skipped:
            if (r2.mVerticalChainStyle == 2) goto L_0x004a;
     */
    /* JADX WARNING: Missing block: B:27:0x004c, code skipped:
            r5 = null;
     */
    static void applyChainConstraints(androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r35, androidx.constraintlayout.solver.LinearSystem r36, int r37, int r38, androidx.constraintlayout.solver.widgets.ChainHead r39) {
        /*
        r0 = r35;
        r9 = r36;
        r1 = r39;
        r10 = r1.mFirst;
        r11 = r1.mLast;
        r12 = r1.mFirstVisibleWidget;
        r13 = r1.mLastVisibleWidget;
        r2 = r1.mHead;
        r3 = r1.mTotalWeight;
        r4 = r1.mFirstMatchConstraintWidget;
        r4 = r1.mLastMatchConstraintWidget;
        r4 = r0.mListDimensionBehaviors;
        r4 = r4[r37];
        r5 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        r7 = 1;
        if (r4 != r5) goto L_0x0021;
    L_0x001f:
        r4 = 1;
        goto L_0x0022;
    L_0x0021:
        r4 = 0;
    L_0x0022:
        r5 = 2;
        if (r37 != 0) goto L_0x0038;
    L_0x0025:
        r8 = r2.mHorizontalChainStyle;
        if (r8 != 0) goto L_0x002b;
    L_0x0029:
        r8 = 1;
        goto L_0x002c;
    L_0x002b:
        r8 = 0;
    L_0x002c:
        r14 = r2.mHorizontalChainStyle;
        if (r14 != r7) goto L_0x0032;
    L_0x0030:
        r14 = 1;
        goto L_0x0033;
    L_0x0032:
        r14 = 0;
    L_0x0033:
        r15 = r2.mHorizontalChainStyle;
        if (r15 != r5) goto L_0x004c;
    L_0x0037:
        goto L_0x004a;
    L_0x0038:
        r8 = r2.mVerticalChainStyle;
        if (r8 != 0) goto L_0x003e;
    L_0x003c:
        r8 = 1;
        goto L_0x003f;
    L_0x003e:
        r8 = 0;
    L_0x003f:
        r14 = r2.mVerticalChainStyle;
        if (r14 != r7) goto L_0x0045;
    L_0x0043:
        r14 = 1;
        goto L_0x0046;
    L_0x0045:
        r14 = 0;
    L_0x0046:
        r15 = r2.mVerticalChainStyle;
        if (r15 != r5) goto L_0x004c;
    L_0x004a:
        r5 = 1;
        goto L_0x004d;
    L_0x004c:
        r5 = 0;
    L_0x004d:
        r15 = r8;
        r8 = r10;
        r16 = r14;
        r14 = r5;
        r5 = 0;
    L_0x0053:
        r21 = 0;
        if (r5 != 0) goto L_0x012e;
    L_0x0057:
        r7 = r8.mListAnchors;
        r7 = r7[r38];
        if (r4 != 0) goto L_0x0063;
    L_0x005d:
        if (r14 == 0) goto L_0x0060;
    L_0x005f:
        goto L_0x0063;
    L_0x0060:
        r23 = 4;
        goto L_0x0065;
    L_0x0063:
        r23 = 1;
    L_0x0065:
        r24 = r7.getMargin();
        r6 = r7.mTarget;
        if (r6 == 0) goto L_0x0077;
    L_0x006d:
        if (r8 == r10) goto L_0x0077;
    L_0x006f:
        r6 = r7.mTarget;
        r6 = r6.getMargin();
        r24 = r24 + r6;
    L_0x0077:
        r6 = r24;
        if (r14 == 0) goto L_0x0085;
    L_0x007b:
        if (r8 == r10) goto L_0x0085;
    L_0x007d:
        if (r8 == r12) goto L_0x0085;
    L_0x007f:
        r24 = r3;
        r23 = r5;
        r3 = 6;
        goto L_0x0095;
    L_0x0085:
        if (r15 == 0) goto L_0x008f;
    L_0x0087:
        if (r4 == 0) goto L_0x008f;
    L_0x0089:
        r24 = r3;
        r23 = r5;
        r3 = 4;
        goto L_0x0095;
    L_0x008f:
        r24 = r3;
        r3 = r23;
        r23 = r5;
    L_0x0095:
        r5 = r7.mTarget;
        if (r5 == 0) goto L_0x00c2;
    L_0x0099:
        if (r8 != r12) goto L_0x00aa;
    L_0x009b:
        r5 = r7.mSolverVariable;
        r25 = r15;
        r15 = r7.mTarget;
        r15 = r15.mSolverVariable;
        r26 = r2;
        r2 = 5;
        r9.addGreaterThan(r5, r15, r6, r2);
        goto L_0x00b8;
    L_0x00aa:
        r26 = r2;
        r25 = r15;
        r2 = r7.mSolverVariable;
        r5 = r7.mTarget;
        r5 = r5.mSolverVariable;
        r15 = 6;
        r9.addGreaterThan(r2, r5, r6, r15);
    L_0x00b8:
        r2 = r7.mSolverVariable;
        r5 = r7.mTarget;
        r5 = r5.mSolverVariable;
        r9.addEquality(r2, r5, r6, r3);
        goto L_0x00c6;
    L_0x00c2:
        r26 = r2;
        r25 = r15;
    L_0x00c6:
        if (r4 == 0) goto L_0x00fd;
    L_0x00c8:
        r2 = r8.getVisibility();
        r3 = 8;
        if (r2 == r3) goto L_0x00ec;
    L_0x00d0:
        r2 = r8.mListDimensionBehaviors;
        r2 = r2[r37];
        r3 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        if (r2 != r3) goto L_0x00ec;
    L_0x00d8:
        r2 = r8.mListAnchors;
        r3 = r38 + 1;
        r2 = r2[r3];
        r2 = r2.mSolverVariable;
        r3 = r8.mListAnchors;
        r3 = r3[r38];
        r3 = r3.mSolverVariable;
        r5 = 5;
        r6 = 0;
        r9.addGreaterThan(r2, r3, r6, r5);
        goto L_0x00ed;
    L_0x00ec:
        r6 = 0;
    L_0x00ed:
        r2 = r8.mListAnchors;
        r2 = r2[r38];
        r2 = r2.mSolverVariable;
        r3 = r0.mListAnchors;
        r3 = r3[r38];
        r3 = r3.mSolverVariable;
        r5 = 6;
        r9.addGreaterThan(r2, r3, r6, r5);
    L_0x00fd:
        r2 = r8.mListAnchors;
        r3 = r38 + 1;
        r2 = r2[r3];
        r2 = r2.mTarget;
        if (r2 == 0) goto L_0x011e;
    L_0x0107:
        r2 = r2.mOwner;
        r3 = r2.mListAnchors;
        r3 = r3[r38];
        r3 = r3.mTarget;
        if (r3 == 0) goto L_0x011e;
    L_0x0111:
        r3 = r2.mListAnchors;
        r3 = r3[r38];
        r3 = r3.mTarget;
        r3 = r3.mOwner;
        if (r3 == r8) goto L_0x011c;
    L_0x011b:
        goto L_0x011e;
    L_0x011c:
        r21 = r2;
    L_0x011e:
        if (r21 == 0) goto L_0x0125;
    L_0x0120:
        r8 = r21;
        r5 = r23;
        goto L_0x0126;
    L_0x0125:
        r5 = 1;
    L_0x0126:
        r3 = r24;
        r15 = r25;
        r2 = r26;
        goto L_0x0053;
    L_0x012e:
        r26 = r2;
        r24 = r3;
        r25 = r15;
        if (r13 == 0) goto L_0x0158;
    L_0x0136:
        r2 = r11.mListAnchors;
        r3 = r38 + 1;
        r2 = r2[r3];
        r2 = r2.mTarget;
        if (r2 == 0) goto L_0x0158;
    L_0x0140:
        r2 = r13.mListAnchors;
        r2 = r2[r3];
        r5 = r2.mSolverVariable;
        r6 = r11.mListAnchors;
        r3 = r6[r3];
        r3 = r3.mTarget;
        r3 = r3.mSolverVariable;
        r2 = r2.getMargin();
        r2 = -r2;
        r6 = 5;
        r9.addLowerThan(r5, r3, r2, r6);
        goto L_0x0159;
    L_0x0158:
        r6 = 5;
    L_0x0159:
        if (r4 == 0) goto L_0x0175;
    L_0x015b:
        r0 = r0.mListAnchors;
        r2 = r38 + 1;
        r0 = r0[r2];
        r0 = r0.mSolverVariable;
        r3 = r11.mListAnchors;
        r3 = r3[r2];
        r3 = r3.mSolverVariable;
        r4 = r11.mListAnchors;
        r2 = r4[r2];
        r2 = r2.getMargin();
        r4 = 6;
        r9.addGreaterThan(r0, r3, r2, r4);
    L_0x0175:
        r0 = r1.mWeightedMatchConstraintsWidgets;
        if (r0 == 0) goto L_0x022d;
    L_0x0179:
        r2 = r0.size();
        r3 = 1;
        if (r2 <= r3) goto L_0x022d;
    L_0x0180:
        r4 = r1.mHasUndefinedWeights;
        if (r4 == 0) goto L_0x018c;
    L_0x0184:
        r4 = r1.mHasComplexMatchWeights;
        if (r4 != 0) goto L_0x018c;
    L_0x0188:
        r4 = r1.mWidgetsMatchCount;
        r4 = (float) r4;
        goto L_0x018e;
    L_0x018c:
        r4 = r24;
    L_0x018e:
        r5 = 0;
        r8 = r21;
        r7 = 0;
        r28 = 0;
    L_0x0194:
        if (r7 >= r2) goto L_0x022d;
    L_0x0196:
        r15 = r0.get(r7);
        r15 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r15;
        r3 = r15.mWeight;
        r3 = r3[r37];
        r23 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r23 >= 0) goto L_0x01c2;
    L_0x01a4:
        r3 = r1.mHasComplexMatchWeights;
        if (r3 == 0) goto L_0x01be;
    L_0x01a8:
        r3 = r15.mListAnchors;
        r23 = r38 + 1;
        r3 = r3[r23];
        r3 = r3.mSolverVariable;
        r15 = r15.mListAnchors;
        r15 = r15[r38];
        r15 = r15.mSolverVariable;
        r5 = 4;
        r6 = 0;
        r9.addEquality(r3, r15, r6, r5);
        r5 = 0;
        r6 = 6;
        goto L_0x01db;
    L_0x01be:
        r5 = 4;
        r3 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        goto L_0x01c3;
    L_0x01c2:
        r5 = 4;
    L_0x01c3:
        r6 = 0;
        r20 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1));
        if (r20 != 0) goto L_0x01e0;
    L_0x01c8:
        r3 = r15.mListAnchors;
        r20 = r38 + 1;
        r3 = r3[r20];
        r3 = r3.mSolverVariable;
        r15 = r15.mListAnchors;
        r15 = r15[r38];
        r15 = r15.mSolverVariable;
        r5 = 0;
        r6 = 6;
        r9.addEquality(r3, r15, r5, r6);
    L_0x01db:
        r24 = r0;
        r22 = r2;
        goto L_0x0222;
    L_0x01e0:
        r5 = 0;
        r6 = 6;
        if (r8 == 0) goto L_0x021b;
    L_0x01e4:
        r5 = r8.mListAnchors;
        r5 = r5[r38];
        r5 = r5.mSolverVariable;
        r8 = r8.mListAnchors;
        r22 = r38 + 1;
        r8 = r8[r22];
        r8 = r8.mSolverVariable;
        r6 = r15.mListAnchors;
        r6 = r6[r38];
        r6 = r6.mSolverVariable;
        r24 = r0;
        r0 = r15.mListAnchors;
        r0 = r0[r22];
        r0 = r0.mSolverVariable;
        r22 = r2;
        r2 = r36.createRow();
        r27 = r2;
        r29 = r4;
        r30 = r3;
        r31 = r5;
        r32 = r8;
        r33 = r6;
        r34 = r0;
        r27.createRowEqualMatchDimensions(r28, r29, r30, r31, r32, r33, r34);
        r9.addConstraint(r2);
        goto L_0x021f;
    L_0x021b:
        r24 = r0;
        r22 = r2;
    L_0x021f:
        r28 = r3;
        r8 = r15;
    L_0x0222:
        r7 = r7 + 1;
        r2 = r22;
        r0 = r24;
        r3 = 1;
        r5 = 0;
        r6 = 5;
        goto L_0x0194;
    L_0x022d:
        if (r12 == 0) goto L_0x0297;
    L_0x022f:
        if (r12 == r13) goto L_0x0233;
    L_0x0231:
        if (r14 == 0) goto L_0x0297;
    L_0x0233:
        r0 = r10.mListAnchors;
        r0 = r0[r38];
        r1 = r11.mListAnchors;
        r2 = r38 + 1;
        r1 = r1[r2];
        r3 = r10.mListAnchors;
        r3 = r3[r38];
        r3 = r3.mTarget;
        if (r3 == 0) goto L_0x024e;
    L_0x0245:
        r3 = r10.mListAnchors;
        r3 = r3[r38];
        r3 = r3.mTarget;
        r3 = r3.mSolverVariable;
        goto L_0x0250;
    L_0x024e:
        r3 = r21;
    L_0x0250:
        r4 = r11.mListAnchors;
        r4 = r4[r2];
        r4 = r4.mTarget;
        if (r4 == 0) goto L_0x0262;
    L_0x0258:
        r4 = r11.mListAnchors;
        r4 = r4[r2];
        r4 = r4.mTarget;
        r4 = r4.mSolverVariable;
        r5 = r4;
        goto L_0x0264;
    L_0x0262:
        r5 = r21;
    L_0x0264:
        if (r12 != r13) goto L_0x026e;
    L_0x0266:
        r0 = r12.mListAnchors;
        r0 = r0[r38];
        r1 = r12.mListAnchors;
        r1 = r1[r2];
    L_0x026e:
        if (r3 == 0) goto L_0x04c9;
    L_0x0270:
        if (r5 == 0) goto L_0x04c9;
    L_0x0272:
        if (r37 != 0) goto L_0x0279;
    L_0x0274:
        r2 = r26;
        r2 = r2.mHorizontalBiasPercent;
        goto L_0x027d;
    L_0x0279:
        r2 = r26;
        r2 = r2.mVerticalBiasPercent;
    L_0x027d:
        r4 = r2;
        r6 = r0.getMargin();
        r7 = r1.getMargin();
        r2 = r0.mSolverVariable;
        r8 = r1.mSolverVariable;
        r10 = 5;
        r0 = r36;
        r1 = r2;
        r2 = r3;
        r3 = r6;
        r6 = r8;
        r8 = r10;
        r0.addCentering(r1, r2, r3, r4, r5, r6, r7, r8);
        goto L_0x04c9;
    L_0x0297:
        if (r25 == 0) goto L_0x0394;
    L_0x0299:
        if (r12 == 0) goto L_0x0394;
    L_0x029b:
        r0 = r1.mWidgetsMatchCount;
        if (r0 <= 0) goto L_0x02a8;
    L_0x029f:
        r0 = r1.mWidgetsCount;
        r1 = r1.mWidgetsMatchCount;
        if (r0 != r1) goto L_0x02a8;
    L_0x02a5:
        r17 = 1;
        goto L_0x02aa;
    L_0x02a8:
        r17 = 0;
    L_0x02aa:
        r14 = r12;
        r15 = r14;
    L_0x02ac:
        if (r14 == 0) goto L_0x04c9;
    L_0x02ae:
        r0 = r14.mNextChainWidget;
        r0 = r0[r37];
        r8 = r0;
    L_0x02b3:
        if (r8 == 0) goto L_0x02c2;
    L_0x02b5:
        r0 = r8.getVisibility();
        r7 = 8;
        if (r0 != r7) goto L_0x02c4;
    L_0x02bd:
        r0 = r8.mNextChainWidget;
        r8 = r0[r37];
        goto L_0x02b3;
    L_0x02c2:
        r7 = 8;
    L_0x02c4:
        if (r8 != 0) goto L_0x02d1;
    L_0x02c6:
        if (r14 != r13) goto L_0x02c9;
    L_0x02c8:
        goto L_0x02d1;
    L_0x02c9:
        r18 = r8;
        r19 = 4;
        r20 = 6;
        goto L_0x0387;
    L_0x02d1:
        r0 = r14.mListAnchors;
        r0 = r0[r38];
        r1 = r0.mSolverVariable;
        r2 = r0.mTarget;
        if (r2 == 0) goto L_0x02e0;
    L_0x02db:
        r2 = r0.mTarget;
        r2 = r2.mSolverVariable;
        goto L_0x02e2;
    L_0x02e0:
        r2 = r21;
    L_0x02e2:
        if (r15 == r14) goto L_0x02ed;
    L_0x02e4:
        r2 = r15.mListAnchors;
        r3 = r38 + 1;
        r2 = r2[r3];
        r2 = r2.mSolverVariable;
        goto L_0x0304;
    L_0x02ed:
        if (r14 != r12) goto L_0x0304;
    L_0x02ef:
        if (r15 != r14) goto L_0x0304;
    L_0x02f1:
        r2 = r10.mListAnchors;
        r2 = r2[r38];
        r2 = r2.mTarget;
        if (r2 == 0) goto L_0x0302;
    L_0x02f9:
        r2 = r10.mListAnchors;
        r2 = r2[r38];
        r2 = r2.mTarget;
        r2 = r2.mSolverVariable;
        goto L_0x0304;
    L_0x0302:
        r2 = r21;
    L_0x0304:
        r0 = r0.getMargin();
        r3 = r14.mListAnchors;
        r4 = r38 + 1;
        r3 = r3[r4];
        r3 = r3.getMargin();
        if (r8 == 0) goto L_0x0321;
    L_0x0314:
        r5 = r8.mListAnchors;
        r5 = r5[r38];
        r6 = r5.mSolverVariable;
        r7 = r14.mListAnchors;
        r7 = r7[r4];
        r7 = r7.mSolverVariable;
        goto L_0x0334;
    L_0x0321:
        r5 = r11.mListAnchors;
        r5 = r5[r4];
        r5 = r5.mTarget;
        if (r5 == 0) goto L_0x032c;
    L_0x0329:
        r6 = r5.mSolverVariable;
        goto L_0x032e;
    L_0x032c:
        r6 = r21;
    L_0x032e:
        r7 = r14.mListAnchors;
        r7 = r7[r4];
        r7 = r7.mSolverVariable;
    L_0x0334:
        if (r5 == 0) goto L_0x033b;
    L_0x0336:
        r5 = r5.getMargin();
        r3 = r3 + r5;
    L_0x033b:
        if (r15 == 0) goto L_0x0346;
    L_0x033d:
        r5 = r15.mListAnchors;
        r5 = r5[r4];
        r5 = r5.getMargin();
        r0 = r0 + r5;
    L_0x0346:
        if (r1 == 0) goto L_0x02c9;
    L_0x0348:
        if (r2 == 0) goto L_0x02c9;
    L_0x034a:
        if (r6 == 0) goto L_0x02c9;
    L_0x034c:
        if (r7 == 0) goto L_0x02c9;
    L_0x034e:
        if (r14 != r12) goto L_0x0358;
    L_0x0350:
        r0 = r12.mListAnchors;
        r0 = r0[r38];
        r0 = r0.getMargin();
    L_0x0358:
        r5 = r0;
        if (r14 != r13) goto L_0x0366;
    L_0x035b:
        r0 = r13.mListAnchors;
        r0 = r0[r4];
        r0 = r0.getMargin();
        r18 = r0;
        goto L_0x0368;
    L_0x0366:
        r18 = r3;
    L_0x0368:
        if (r17 == 0) goto L_0x036d;
    L_0x036a:
        r22 = 6;
        goto L_0x036f;
    L_0x036d:
        r22 = 4;
    L_0x036f:
        r4 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r0 = r36;
        r3 = r5;
        r20 = 4;
        r5 = r6;
        r23 = 6;
        r6 = r7;
        r19 = 4;
        r20 = 6;
        r7 = r18;
        r18 = r8;
        r8 = r22;
        r0.addCentering(r1, r2, r3, r4, r5, r6, r7, r8);
    L_0x0387:
        r0 = r14.getVisibility();
        r8 = 8;
        if (r0 == r8) goto L_0x0390;
    L_0x038f:
        r15 = r14;
    L_0x0390:
        r14 = r18;
        goto L_0x02ac;
    L_0x0394:
        r8 = 8;
        r19 = 4;
        r20 = 6;
        if (r16 == 0) goto L_0x04c9;
    L_0x039c:
        if (r12 == 0) goto L_0x04c9;
    L_0x039e:
        r0 = r1.mWidgetsMatchCount;
        if (r0 <= 0) goto L_0x03ab;
    L_0x03a2:
        r0 = r1.mWidgetsCount;
        r1 = r1.mWidgetsMatchCount;
        if (r0 != r1) goto L_0x03ab;
    L_0x03a8:
        r17 = 1;
        goto L_0x03ad;
    L_0x03ab:
        r17 = 0;
    L_0x03ad:
        r14 = r12;
        r15 = r14;
    L_0x03af:
        if (r14 == 0) goto L_0x046b;
    L_0x03b1:
        r0 = r14.mNextChainWidget;
        r0 = r0[r37];
    L_0x03b5:
        if (r0 == 0) goto L_0x03c2;
    L_0x03b7:
        r1 = r0.getVisibility();
        if (r1 != r8) goto L_0x03c2;
    L_0x03bd:
        r0 = r0.mNextChainWidget;
        r0 = r0[r37];
        goto L_0x03b5;
    L_0x03c2:
        if (r14 == r12) goto L_0x0458;
    L_0x03c4:
        if (r14 == r13) goto L_0x0458;
    L_0x03c6:
        if (r0 == 0) goto L_0x0458;
    L_0x03c8:
        if (r0 != r13) goto L_0x03cd;
    L_0x03ca:
        r7 = r21;
        goto L_0x03ce;
    L_0x03cd:
        r7 = r0;
    L_0x03ce:
        r0 = r14.mListAnchors;
        r0 = r0[r38];
        r1 = r0.mSolverVariable;
        r2 = r0.mTarget;
        if (r2 == 0) goto L_0x03dc;
    L_0x03d8:
        r2 = r0.mTarget;
        r2 = r2.mSolverVariable;
    L_0x03dc:
        r2 = r15.mListAnchors;
        r3 = r38 + 1;
        r2 = r2[r3];
        r2 = r2.mSolverVariable;
        r0 = r0.getMargin();
        r4 = r14.mListAnchors;
        r4 = r4[r3];
        r4 = r4.getMargin();
        if (r7 == 0) goto L_0x0404;
    L_0x03f2:
        r5 = r7.mListAnchors;
        r5 = r5[r38];
        r6 = r5.mSolverVariable;
        r8 = r5.mTarget;
        if (r8 == 0) goto L_0x0401;
    L_0x03fc:
        r8 = r5.mTarget;
        r8 = r8.mSolverVariable;
        goto L_0x0417;
    L_0x0401:
        r8 = r21;
        goto L_0x0417;
    L_0x0404:
        r5 = r14.mListAnchors;
        r5 = r5[r3];
        r5 = r5.mTarget;
        if (r5 == 0) goto L_0x040f;
    L_0x040c:
        r6 = r5.mSolverVariable;
        goto L_0x0411;
    L_0x040f:
        r6 = r21;
    L_0x0411:
        r8 = r14.mListAnchors;
        r8 = r8[r3];
        r8 = r8.mSolverVariable;
    L_0x0417:
        if (r5 == 0) goto L_0x041e;
    L_0x0419:
        r5 = r5.getMargin();
        r4 = r4 + r5;
    L_0x041e:
        r18 = r4;
        if (r15 == 0) goto L_0x042b;
    L_0x0422:
        r4 = r15.mListAnchors;
        r3 = r4[r3];
        r3 = r3.getMargin();
        r0 = r0 + r3;
    L_0x042b:
        r3 = r0;
        if (r17 == 0) goto L_0x0431;
    L_0x042e:
        r22 = 6;
        goto L_0x0433;
    L_0x0431:
        r22 = 4;
    L_0x0433:
        if (r1 == 0) goto L_0x044f;
    L_0x0435:
        if (r2 == 0) goto L_0x044f;
    L_0x0437:
        if (r6 == 0) goto L_0x044f;
    L_0x0439:
        if (r8 == 0) goto L_0x044f;
    L_0x043b:
        r4 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r0 = r36;
        r5 = r6;
        r6 = r8;
        r23 = r7;
        r7 = r18;
        r18 = r15;
        r15 = 8;
        r8 = r22;
        r0.addCentering(r1, r2, r3, r4, r5, r6, r7, r8);
        goto L_0x0455;
    L_0x044f:
        r23 = r7;
        r18 = r15;
        r15 = 8;
    L_0x0455:
        r0 = r23;
        goto L_0x045c;
    L_0x0458:
        r18 = r15;
        r15 = 8;
    L_0x045c:
        r1 = r14.getVisibility();
        if (r1 == r15) goto L_0x0463;
    L_0x0462:
        goto L_0x0465;
    L_0x0463:
        r14 = r18;
    L_0x0465:
        r15 = r14;
        r8 = 8;
        r14 = r0;
        goto L_0x03af;
    L_0x046b:
        r0 = r12.mListAnchors;
        r0 = r0[r38];
        r1 = r10.mListAnchors;
        r1 = r1[r38];
        r1 = r1.mTarget;
        r2 = r13.mListAnchors;
        r3 = r38 + 1;
        r10 = r2[r3];
        r2 = r11.mListAnchors;
        r2 = r2[r3];
        r14 = r2.mTarget;
        if (r1 == 0) goto L_0x04b8;
    L_0x0483:
        if (r12 == r13) goto L_0x0492;
    L_0x0485:
        r2 = r0.mSolverVariable;
        r1 = r1.mSolverVariable;
        r0 = r0.getMargin();
        r15 = 5;
        r9.addEquality(r2, r1, r0, r15);
        goto L_0x04b9;
    L_0x0492:
        r15 = 5;
        if (r14 == 0) goto L_0x04b9;
    L_0x0495:
        r2 = r0.mSolverVariable;
        r3 = r1.mSolverVariable;
        r4 = r0.getMargin();
        r5 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r6 = r10.mSolverVariable;
        r7 = r14.mSolverVariable;
        r8 = r10.getMargin();
        r17 = 5;
        r0 = r36;
        r1 = r2;
        r2 = r3;
        r3 = r4;
        r4 = r5;
        r5 = r6;
        r6 = r7;
        r7 = r8;
        r8 = r17;
        r0.addCentering(r1, r2, r3, r4, r5, r6, r7, r8);
        goto L_0x04b9;
    L_0x04b8:
        r15 = 5;
    L_0x04b9:
        if (r14 == 0) goto L_0x04c9;
    L_0x04bb:
        if (r12 == r13) goto L_0x04c9;
    L_0x04bd:
        r0 = r10.mSolverVariable;
        r1 = r14.mSolverVariable;
        r2 = r10.getMargin();
        r2 = -r2;
        r9.addEquality(r0, r1, r2, r15);
    L_0x04c9:
        if (r25 != 0) goto L_0x04cd;
    L_0x04cb:
        if (r16 == 0) goto L_0x0530;
    L_0x04cd:
        if (r12 == 0) goto L_0x0530;
    L_0x04cf:
        r0 = r12.mListAnchors;
        r0 = r0[r38];
        r1 = r13.mListAnchors;
        r2 = r38 + 1;
        r1 = r1[r2];
        r3 = r0.mTarget;
        if (r3 == 0) goto L_0x04e2;
    L_0x04dd:
        r3 = r0.mTarget;
        r3 = r3.mSolverVariable;
        goto L_0x04e4;
    L_0x04e2:
        r3 = r21;
    L_0x04e4:
        r4 = r1.mTarget;
        if (r4 == 0) goto L_0x04ed;
    L_0x04e8:
        r4 = r1.mTarget;
        r4 = r4.mSolverVariable;
        goto L_0x04ef;
    L_0x04ed:
        r4 = r21;
    L_0x04ef:
        if (r11 == r13) goto L_0x0500;
    L_0x04f1:
        r4 = r11.mListAnchors;
        r4 = r4[r2];
        r5 = r4.mTarget;
        if (r5 == 0) goto L_0x04fe;
    L_0x04f9:
        r4 = r4.mTarget;
        r4 = r4.mSolverVariable;
        goto L_0x0500;
    L_0x04fe:
        r4 = r21;
    L_0x0500:
        r5 = r4;
        if (r12 != r13) goto L_0x050b;
    L_0x0503:
        r0 = r12.mListAnchors;
        r0 = r0[r38];
        r1 = r12.mListAnchors;
        r1 = r1[r2];
    L_0x050b:
        if (r3 == 0) goto L_0x0530;
    L_0x050d:
        if (r5 == 0) goto L_0x0530;
    L_0x050f:
        r4 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r6 = r0.getMargin();
        if (r13 != 0) goto L_0x0518;
    L_0x0517:
        goto L_0x0519;
    L_0x0518:
        r11 = r13;
    L_0x0519:
        r7 = r11.mListAnchors;
        r2 = r7[r2];
        r7 = r2.getMargin();
        r2 = r0.mSolverVariable;
        r8 = r1.mSolverVariable;
        r10 = 5;
        r0 = r36;
        r1 = r2;
        r2 = r3;
        r3 = r6;
        r6 = r8;
        r8 = r10;
        r0.addCentering(r1, r2, r3, r4, r5, r6, r7, r8);
    L_0x0530:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.Chain.applyChainConstraints(androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer, androidx.constraintlayout.solver.LinearSystem, int, int, androidx.constraintlayout.solver.widgets.ChainHead):void");
    }
}
