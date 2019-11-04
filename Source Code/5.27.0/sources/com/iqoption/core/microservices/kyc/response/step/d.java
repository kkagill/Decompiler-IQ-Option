package com.iqoption.core.microservices.kyc.response.step;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000.\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u0002\"\u0017\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\"\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b\"!\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, bng = {"ALLOWED_KYC_STEPS", "", "Lcom/iqoption/core/microservices/kyc/response/step/KycStepType;", "getALLOWED_KYC_STEPS", "()Ljava/util/List;", "ALLOWED_TO_OPEN_MULTIPLE_TIMES", "", "getALLOWED_TO_OPEN_MULTIPLE_TIMES", "()Ljava/util/Set;", "HAS_CUSTOM_SKIP_BUTTON", "getHAS_CUSTOM_SKIP_BUTTON", "KYC_STEP_COMPARATOR", "Ljava/util/Comparator;", "Lcom/iqoption/core/microservices/kyc/response/step/KycCustomerStep;", "Lkotlin/Comparator;", "getKYC_STEP_COMPARATOR", "()Ljava/util/Comparator;", "getKycStepOrder", "", "kycStepType", "core_release"})
/* compiled from: KycCustomerStep.kt */
public final class d {
    private static final List<KycStepType> bwa = m.listOf(KycStepType.PROFILE, KycStepType.TIN, KycStepType.PHONE, KycStepType.KYC_QUESTIONNAIRE, KycStepType.KYC_DOCUMENTS_POI, KycStepType.KYC_DOCUMENTS_POA);
    private static final Comparator<c> bwb = new a();
    private static final Set<KycStepType> bwc = al.setOf(KycStepType.KYC_DOCUMENTS_POI, KycStepType.KYC_DOCUMENTS_POA);
    private static final Set<KycStepType> bwd = al.setOf(KycStepType.KYC_DOCUMENTS_POI, KycStepType.KYC_DOCUMENTS_POA);

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, bng = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"})
    /* compiled from: Comparisons.kt */
    public static final class a<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return b.c(Integer.valueOf(d.b(((c) t).afH())), Integer.valueOf(d.b(((c) t2).afH())));
        }
    }

    public static final List<KycStepType> afK() {
        return bwa;
    }

    public static final Comparator<c> afL() {
        return bwb;
    }

    private static final int b(KycStepType kycStepType) {
        switch (e.aob[kycStepType.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
            case 6:
                return 4;
            default:
                return Integer.MAX_VALUE;
        }
    }

    public static final Set<KycStepType> afM() {
        return bwc;
    }

    public static final Set<KycStepType> afN() {
        return bwd;
    }
}
