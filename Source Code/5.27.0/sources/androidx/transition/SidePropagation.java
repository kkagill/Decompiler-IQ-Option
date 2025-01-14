package androidx.transition;

import android.graphics.Rect;
import android.view.ViewGroup;
import androidx.core.view.GravityCompat;

public class SidePropagation extends VisibilityPropagation {
    private float mPropagationSpeed = 3.0f;
    private int mSide = 80;

    public void setSide(int i) {
        this.mSide = i;
    }

    public void setPropagationSpeed(float f) {
        if (f != 0.0f) {
            this.mPropagationSpeed = f;
            return;
        }
        throw new IllegalArgumentException("propagationSpeed may not be 0");
    }

    public long getStartDelay(ViewGroup viewGroup, Transition transition, TransitionValues transitionValues, TransitionValues transitionValues2) {
        TransitionValues transitionValues3 = transitionValues;
        if (transitionValues3 == null && transitionValues2 == null) {
            return 0;
        }
        int i;
        int centerX;
        int centerY;
        Rect epicenter = transition.getEpicenter();
        if (transitionValues2 == null || getViewVisibility(transitionValues3) == 0) {
            i = -1;
        } else {
            transitionValues3 = transitionValues2;
            i = 1;
        }
        int viewX = getViewX(transitionValues3);
        int viewY = getViewY(transitionValues3);
        int[] iArr = new int[2];
        viewGroup.getLocationOnScreen(iArr);
        int round = iArr[0] + Math.round(viewGroup.getTranslationX());
        int round2 = iArr[1] + Math.round(viewGroup.getTranslationY());
        int width = round + viewGroup.getWidth();
        int height = round2 + viewGroup.getHeight();
        if (epicenter != null) {
            centerX = epicenter.centerX();
            centerY = epicenter.centerY();
        } else {
            centerX = (round + width) / 2;
            centerY = (round2 + height) / 2;
        }
        float distance = ((float) distance(viewGroup, viewX, viewY, centerX, centerY, round, round2, width, height)) / ((float) getMaxDistance(viewGroup));
        long duration = transition.getDuration();
        if (duration < 0) {
            duration = 300;
        }
        return (long) Math.round((((float) (duration * ((long) i))) / this.mPropagationSpeed) * distance);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002b  */
    /* JADX WARNING: Missing block: B:5:0x0013, code skipped:
            if (r4 != null) goto L_0x0015;
     */
    /* JADX WARNING: Missing block: B:7:0x0017, code skipped:
            r0 = 3;
     */
    /* JADX WARNING: Missing block: B:13:0x0026, code skipped:
            if (r4 != null) goto L_0x0017;
     */
    private int distance(android.view.View r7, int r8, int r9, int r10, int r11, int r12, int r13, int r14, int r15) {
        /*
        r6 = this;
        r0 = r6.mSide;
        r1 = 5;
        r2 = 3;
        r3 = 0;
        r4 = 1;
        r5 = 8388611; // 0x800003 float:1.1754948E-38 double:4.1445245E-317;
        if (r0 != r5) goto L_0x0019;
    L_0x000b:
        r7 = androidx.core.view.ViewCompat.getLayoutDirection(r7);
        if (r7 != r4) goto L_0x0012;
    L_0x0011:
        goto L_0x0013;
    L_0x0012:
        r4 = 0;
    L_0x0013:
        if (r4 == 0) goto L_0x0017;
    L_0x0015:
        r0 = 5;
        goto L_0x0029;
    L_0x0017:
        r0 = 3;
        goto L_0x0029;
    L_0x0019:
        r5 = 8388613; // 0x800005 float:1.175495E-38 double:4.1445255E-317;
        if (r0 != r5) goto L_0x0029;
    L_0x001e:
        r7 = androidx.core.view.ViewCompat.getLayoutDirection(r7);
        if (r7 != r4) goto L_0x0025;
    L_0x0024:
        goto L_0x0026;
    L_0x0025:
        r4 = 0;
    L_0x0026:
        if (r4 == 0) goto L_0x0015;
    L_0x0028:
        goto L_0x0017;
    L_0x0029:
        if (r0 == r2) goto L_0x0051;
    L_0x002b:
        if (r0 == r1) goto L_0x0048;
    L_0x002d:
        r7 = 48;
        if (r0 == r7) goto L_0x003f;
    L_0x0031:
        r7 = 80;
        if (r0 == r7) goto L_0x0036;
    L_0x0035:
        goto L_0x0059;
    L_0x0036:
        r9 = r9 - r13;
        r10 = r10 - r8;
        r7 = java.lang.Math.abs(r10);
        r3 = r9 + r7;
        goto L_0x0059;
    L_0x003f:
        r15 = r15 - r9;
        r10 = r10 - r8;
        r7 = java.lang.Math.abs(r10);
        r3 = r15 + r7;
        goto L_0x0059;
    L_0x0048:
        r8 = r8 - r12;
        r11 = r11 - r9;
        r7 = java.lang.Math.abs(r11);
        r3 = r8 + r7;
        goto L_0x0059;
    L_0x0051:
        r14 = r14 - r8;
        r11 = r11 - r9;
        r7 = java.lang.Math.abs(r11);
        r3 = r14 + r7;
    L_0x0059:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.SidePropagation.distance(android.view.View, int, int, int, int, int, int, int, int):int");
    }

    private int getMaxDistance(ViewGroup viewGroup) {
        int i = this.mSide;
        if (i == 3 || i == 5 || i == GravityCompat.START || i == GravityCompat.END) {
            return viewGroup.getWidth();
        }
        return viewGroup.getHeight();
    }
}
