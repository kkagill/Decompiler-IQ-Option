package com.iqoption.kyc;

import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J2\u0010\u0003\u001a\u0004\u0018\u00010\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006H\u0016¨\u0006\n"}, bng = {"Lcom/iqoption/kyc/NextStepInvoke;", "Lcom/iqoption/kyc/StepInvoke;", "()V", "getStepToOpen", "Lcom/iqoption/core/microservices/kyc/response/step/KycCustomerStep;", "editableSteps", "", "onlyScreen", "Lcom/iqoption/core/microservices/kyc/response/step/KycStepType;", "startSteps", "kyc_release"})
/* compiled from: StepInvoke.kt */
public final class m extends p {
    public static final m dtc = new m();

    private m() {
        super();
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0082 A:{SYNTHETIC, EDGE_INSN: B:33:0x0082->B:26:0x0082 ?: BREAK  } */
    /* JADX WARNING: Missing block: B:15:0x0051, code skipped:
            if (r4 == r8) goto L_0x0053;
     */
    /* JADX WARNING: Missing block: B:17:0x0055, code skipped:
            r1 = false;
     */
    /* JADX WARNING: Missing block: B:23:0x007b, code skipped:
            if (com.iqoption.core.ext.c.b(r1.afI(), com.iqoption.core.microservices.kyc.response.step.KycStepState.PENDING, com.iqoption.core.microservices.kyc.response.step.KycStepState.PASSED) == false) goto L_0x0053;
     */
    /* JADX WARNING: Missing block: B:35:0x007e, code skipped:
            continue;
     */
    public com.iqoption.core.microservices.kyc.response.step.c a(java.util.List<com.iqoption.core.microservices.kyc.response.step.c> r7, com.iqoption.core.microservices.kyc.response.step.KycStepType r8, java.util.List<? extends com.iqoption.core.microservices.kyc.response.step.KycStepType> r9) {
        /*
        r6 = this;
        r0 = "editableSteps";
        kotlin.jvm.internal.i.f(r7, r0);
        r7 = (java.lang.Iterable) r7;
        r0 = new java.util.ArrayList;
        r0.<init>();
        r0 = (java.util.Collection) r0;
        r7 = r7.iterator();
    L_0x0012:
        r1 = r7.hasNext();
        r2 = 0;
        r3 = 1;
        if (r1 == 0) goto L_0x0036;
    L_0x001a:
        r1 = r7.next();
        r4 = r1;
        r4 = (com.iqoption.core.microservices.kyc.response.step.c) r4;
        r5 = r4.afH();
        if (r5 == r8) goto L_0x002f;
    L_0x0027:
        r4 = r4.afI();
        r5 = com.iqoption.core.microservices.kyc.response.step.KycStepState.SKIPPED;
        if (r4 == r5) goto L_0x0030;
    L_0x002f:
        r2 = 1;
    L_0x0030:
        if (r2 == 0) goto L_0x0012;
    L_0x0032:
        r0.add(r1);
        goto L_0x0012;
    L_0x0036:
        r0 = (java.util.List) r0;
        r0 = (java.lang.Iterable) r0;
        r7 = r0.iterator();
    L_0x003e:
        r0 = r7.hasNext();
        if (r0 == 0) goto L_0x0081;
    L_0x0044:
        r0 = r7.next();
        r1 = r0;
        r1 = (com.iqoption.core.microservices.kyc.response.step.c) r1;
        r4 = r1.afH();
        if (r8 == 0) goto L_0x0057;
    L_0x0051:
        if (r4 != r8) goto L_0x0055;
    L_0x0053:
        r1 = 1;
        goto L_0x007e;
    L_0x0055:
        r1 = 0;
        goto L_0x007e;
    L_0x0057:
        if (r9 == 0) goto L_0x0068;
    L_0x0059:
        r5 = r9;
        r5 = (java.util.Collection) r5;
        r5 = r5.isEmpty();
        r5 = r5 ^ r3;
        if (r5 == 0) goto L_0x0068;
    L_0x0063:
        r1 = r9.contains(r4);
        goto L_0x007e;
    L_0x0068:
        r1 = r1.afI();
        r4 = 2;
        r4 = new com.iqoption.core.microservices.kyc.response.step.KycStepState[r4];
        r5 = com.iqoption.core.microservices.kyc.response.step.KycStepState.PENDING;
        r4[r2] = r5;
        r5 = com.iqoption.core.microservices.kyc.response.step.KycStepState.PASSED;
        r4[r3] = r5;
        r1 = com.iqoption.core.ext.c.b(r1, r4);
        if (r1 != 0) goto L_0x0055;
    L_0x007d:
        goto L_0x0053;
    L_0x007e:
        if (r1 == 0) goto L_0x003e;
    L_0x0080:
        goto L_0x0082;
    L_0x0081:
        r0 = 0;
    L_0x0082:
        r0 = (com.iqoption.core.microservices.kyc.response.step.c) r0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.kyc.m.a(java.util.List, com.iqoption.core.microservices.kyc.response.step.KycStepType, java.util.List):com.iqoption.core.microservices.kyc.response.step.c");
    }
}
