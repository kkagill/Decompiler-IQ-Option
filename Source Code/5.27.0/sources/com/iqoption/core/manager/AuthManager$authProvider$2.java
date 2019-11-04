package com.iqoption.core.manager;

import com.iqoption.core.d;
import com.iqoption.core.e;
import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "Lcom/iqoption/core/manager/AuthProvider;", "invoke"})
/* compiled from: AuthManager.kt */
final class AuthManager$authProvider$2 extends Lambda implements a<j> {
    public static final AuthManager$authProvider$2 bjl = new AuthManager$authProvider$2();

    AuthManager$authProvider$2() {
        super(0);
    }

    /* renamed from: Yv */
    public final j invoke() {
        e.aZu.Ur();
        if (d.EH().ej("new-api-reg")) {
            return new t();
        }
        return new x();
    }
}
