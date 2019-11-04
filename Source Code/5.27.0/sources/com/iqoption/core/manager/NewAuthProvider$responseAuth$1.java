package com.iqoption.core.manager;

import com.iqoption.core.i.k;
import com.iqoption.core.microservices.auth.response.d;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "Lcom/iqoption/core/manager/AuthResult;", "loginResponse", "Lcom/iqoption/core/microservices/auth/response/LoginResponseV2;", "invoke"})
/* compiled from: NewAuthProvider.kt */
final class NewAuthProvider$responseAuth$1 extends Lambda implements b<d, l> {
    public static final NewAuthProvider$responseAuth$1 bkb = new NewAuthProvider$responseAuth$1();

    NewAuthProvider$responseAuth$1() {
        super(1);
    }

    /* renamed from: a */
    public final l invoke(d dVar) {
        kotlin.jvm.internal.i.f(dVar, "loginResponse");
        switch (dVar.Zi()) {
            case SUCCESS:
                return new m();
            case INVALID_CREDENTIALS:
                return new g(com.iqoption.core.d.getString(k.invalid_credentials));
            case DUPLICATE_EMAIL:
                return new g(com.iqoption.core.d.getString(k.duplicate_email));
            case DUPLICATE_PHONE:
                return new g(com.iqoption.core.d.getString(k.duplicate_phone));
            case DUPLICATE_SOCIAL_ACCOUNT:
                return new g(com.iqoption.core.d.getString(k.duplicate_social_account));
            case PASSWORD_TOO_SHORT:
                return new g(com.iqoption.core.d.getString(k.password_too_short));
            case INVALID_IDENTIFIER:
                return new g(com.iqoption.core.d.getString(k.incorrect_email_or_phone));
            case INVALID_EMAIL:
                return new g(com.iqoption.core.d.getString(k.invalid_email));
            case INVALID_PHONE:
                return new g(com.iqoption.core.d.getString(k.invalid_phone));
            case NOT_REGISTERED:
                return new ab();
            case COUNTRY_NOT_ALLOWED:
                return new d(com.iqoption.core.d.getString(k.registration_unavailable_from_your_country), null, 2, null);
            case BLOCKED:
                return new d(com.iqoption.core.d.getString(k.account_is_blocked), null, 2, null);
            case NOT_FOUND:
            case USER_NOT_FOUND:
                return new d(com.iqoption.core.d.getString(k.user_is_not_registered), null, 2, null);
            case NEWPASSWORD_MISMATCH:
                return new d(com.iqoption.core.d.getString(k.input_password_not_equal), null, 2, null);
            case NEWPASSWORD_TOO_SHORT:
                return new d(com.iqoption.core.d.getString(k.newpassword_too_short), null, 2, null);
            case REQUESTS_LIMIT_EXCEEDED:
                return new h(dVar.Zj());
            default:
                return new d(null, dVar.Zi().toString(), 1, null);
        }
    }
}
