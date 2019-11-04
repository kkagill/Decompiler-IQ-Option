package com.iqoption.kyc.profile.steps;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Pair;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\u0001¢\u0006\u0002\u0010\r\"\u0011\u0010\u0000\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0011\u0010\u0004\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0003\"\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u000e"}, bng = {"PROFILE_FIRST_STEP", "Lcom/iqoption/kyc/profile/steps/ProfileStep;", "getPROFILE_FIRST_STEP", "()Lcom/iqoption/kyc/profile/steps/ProfileStep;", "PROFILE_LAST_STEP", "getPROFILE_LAST_STEP", "PROFILE_STEP_ORDER", "", "getPROFILE_STEP_ORDER", "()Ljava/util/List;", "getStepIndex", "", "step", "(Lcom/iqoption/kyc/profile/steps/ProfileStep;)Ljava/lang/Integer;", "kyc_release"})
/* compiled from: ProfileStep.kt */
public final class g {
    private static final List<ProfileStep> dBP = m.listOf(ProfileStep.LEGAL_NAME, ProfileStep.SEX, ProfileStep.DATE_OF_BIRTH, ProfileStep.COUNTRY, ProfileStep.CITIZEN_COUNTRY, ProfileStep.ADDRESS, ProfileStep.GDPR, ProfileStep.REPORTABLE);
    private static final ProfileStep dBQ = ((ProfileStep) u.bU(dBP));
    private static final ProfileStep dBR = ((ProfileStep) u.bW(dBP));

    public static final List<ProfileStep> aMd() {
        return dBP;
    }

    public static final ProfileStep aMe() {
        return dBQ;
    }

    public static final Integer h(ProfileStep profileStep) {
        Object obj;
        kotlin.jvm.internal.i.f(profileStep, "step");
        Iterable iterable = dBP;
        Collection arrayList = new ArrayList(n.e(iterable, 10));
        int i = 0;
        for (Object obj2 : iterable) {
            int i2 = i + 1;
            if (i < 0) {
                m.bno();
            }
            arrayList.add(new Pair(Integer.valueOf(i), obj2));
            i = i2;
        }
        for (Object next : (List) arrayList) {
            if (profileStep == ((ProfileStep) ((Pair) next).bni())) {
                obj2 = 1;
                continue;
            } else {
                obj2 = null;
                continue;
            }
            if (obj2 != null) {
                break;
            }
        }
        Object next2 = null;
        Pair pair = (Pair) next2;
        if (pair != null) {
            return (Integer) pair.getFirst();
        }
        return null;
    }
}
