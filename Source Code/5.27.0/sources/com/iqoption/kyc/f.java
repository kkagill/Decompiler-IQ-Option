package com.iqoption.kyc;

import androidx.fragment.app.Fragment;
import com.iqoption.kyc.navigator.a;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\u0007"}, bng = {"Lcom/iqoption/kyc/KycCommonViewModelsHostUtils;", "", "()V", "getHost", "Landroidx/fragment/app/Fragment;", "fragment", "getQuestionnaireHost", "kyc_release"})
/* compiled from: KycCommonViewModelsHostUtils.kt */
public final class f {
    public static final f dsb = new f();

    private f() {
    }

    public final Fragment aj(Fragment fragment) {
        kotlin.jvm.internal.i.f(fragment, "fragment");
        return fragment instanceof a ? fragment : com.iqoption.core.ext.a.a(fragment, a.class);
    }

    public final Fragment ak(Fragment fragment) {
        kotlin.jvm.internal.i.f(fragment, "fragment");
        return fragment instanceof com.iqoption.kyc.questionnaire.a ? fragment : com.iqoption.core.ext.a.a(fragment, com.iqoption.kyc.questionnaire.a.class);
    }
}
