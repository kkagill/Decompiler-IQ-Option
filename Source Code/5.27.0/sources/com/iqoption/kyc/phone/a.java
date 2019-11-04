package com.iqoption.kyc.phone;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.iqoption.core.microservices.kyc.response.step.KycStepType;
import com.iqoption.kyc.b;
import java.util.HashMap;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\r"}, bng = {"Lcom/iqoption/kyc/phone/BaseKycPhoneFragment;", "Lcom/iqoption/kyc/BaseKycStepFragment;", "()V", "phoneStepProgress", "", "getPhoneStepProgress", "()I", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "kyc_release"})
/* compiled from: BaseKycPhoneFragment.kt */
public abstract class a extends b {
    private HashMap apm;

    public void Bj() {
        HashMap hashMap = this.apm;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public abstract int aLL();

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        Bj();
    }

    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        aIB().a(KycStepType.PHONE, aLL());
    }
}
