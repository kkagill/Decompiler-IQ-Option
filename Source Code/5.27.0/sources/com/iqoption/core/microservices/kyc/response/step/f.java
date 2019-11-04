package com.iqoption.core.microservices.kyc.response.step;

import java.util.Map;
import kotlin.Pair;
import kotlin.i;
import kotlin.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u000e\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u0005\"\u0011\u0010\u0000\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u000e\u0010\u0004\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000\"\u0011\u0010\u0006\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0003\"\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, bng = {"KYC_QUESTIONS_WARNING_PERCENT", "", "getKYC_QUESTIONS_WARNING_PERCENT", "()I", "KYC_QUESTIONS_WARNING_WEIGHT", "", "KYC_STEP_ALL_WEIGHTS", "getKYC_STEP_ALL_WEIGHTS", "KYC_STEP_WEIGHTS", "", "Lcom/iqoption/core/microservices/kyc/response/step/KycStepType;", "getKYC_STEP_WEIGHTS", "()Ljava/util/Map;", "scaleProgressFromFloat", "floatValue", "core_release"})
/* compiled from: KycStepWeights.kt */
public final class f {
    private static final Map<KycStepType, Integer> bwe;
    private static final int bwf = N((float) u.aa(bwe.values()));
    private static final int bwg;

    public static final int N(float f) {
        return (int) (f * ((float) 1000));
    }

    static {
        r0 = new Pair[6];
        KycStepType kycStepType = KycStepType.PHONE;
        Integer valueOf = Integer.valueOf(2);
        r0[2] = j.x(kycStepType, valueOf);
        r0[3] = j.x(KycStepType.KYC_QUESTIONNAIRE, Integer.valueOf(15));
        r0[4] = j.x(KycStepType.KYC_DOCUMENTS_POI, valueOf);
        r0[5] = j.x(KycStepType.KYC_DOCUMENTS_POA, valueOf);
        bwe = af.a(r0);
        Object obj = bwe.get(KycStepType.KYC_QUESTIONNAIRE);
        if (obj == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        bwg = (int) (75.0f / ((Number) obj).floatValue());
    }

    public static final Map<KycStepType, Integer> afO() {
        return bwe;
    }

    public static final int afP() {
        return bwf;
    }

    public static final int afQ() {
        return bwg;
    }
}
