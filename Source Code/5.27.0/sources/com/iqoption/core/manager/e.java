package com.iqoption.core.manager;

import android.os.Parcelable;
import com.iqoption.core.microservices.auth.response.VerifyMethod;
import com.iqoption.core.microservices.auth.response.VerifyType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u0001\u0007\u0007\b\t\n\u000b\f\r¨\u0006\u000e"}, bng = {"Lcom/iqoption/core/manager/AuthInfo;", "Landroid/os/Parcelable;", "()V", "getVerifyType", "Lcom/iqoption/core/microservices/auth/response/VerifyType;", "method", "Lcom/iqoption/core/microservices/auth/response/VerifyMethod;", "Lcom/iqoption/core/manager/SocialAuthInfo;", "Lcom/iqoption/core/manager/CheckSocialAuthInfo;", "Lcom/iqoption/core/manager/RegisterAuthInfo;", "Lcom/iqoption/core/manager/EndTrialAuthInfo;", "Lcom/iqoption/core/manager/LoginAuthInfo;", "Lcom/iqoption/core/manager/RecoveryAuthInfo;", "Lcom/iqoption/core/manager/ChangePasswordAuthInfo;", "core_release"})
/* compiled from: AuthInfo.kt */
public abstract class e implements Parcelable {
    private e() {
    }

    public /* synthetic */ e(f fVar) {
        this();
    }

    public final VerifyType a(VerifyMethod verifyMethod) {
        kotlin.jvm.internal.i.f(verifyMethod, "method");
        if ((this instanceof q) || (this instanceof o)) {
            return VerifyType._2fa;
        }
        if ((this instanceof p) || (this instanceof z) || (this instanceof aa)) {
            int i = f.aob[verifyMethod.ordinal()];
            if (i == 1) {
                return VerifyType.email;
            }
            if (i == 2) {
                return VerifyType.phone;
            }
            throw new NoWhenBranchMatchedException();
        } else if ((this instanceof y) || (this instanceof n)) {
            return VerifyType.recover;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}
