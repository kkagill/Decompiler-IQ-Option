package com.iqoption.kyc.activity;

import com.google.common.util.concurrent.h;
import com.google.common.util.concurrent.t;
import com.iqoption.core.microservices.kyc.response.VerificationType;
import java.util.List;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$KycActivity$pbixURoco4CWs5ZG5-JcklyzN9c implements h {
    private final /* synthetic */ KycActivity f$0;
    private final /* synthetic */ VerificationType f$1;

    public /* synthetic */ -$$Lambda$KycActivity$pbixURoco4CWs5ZG5-JcklyzN9c(KycActivity kycActivity, VerificationType verificationType) {
        this.f$0 = kycActivity;
        this.f$1 = verificationType;
    }

    public final t apply(Object obj) {
        return this.f$0.a(this.f$1, (List) obj);
    }
}
