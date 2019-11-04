package com.iqoption.core.microservices.e;

import com.iqoption.core.d;
import io.reactivex.p;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\n"}, bng = {"Lcom/iqoption/core/microservices/socialuserprofile/SocialUserProfileRequests;", "", "()V", "CMD_GET_USER_PROFILE_CLIENT", "", "getUserProfile", "Lio/reactivex/Single;", "Lcom/iqoption/core/microservices/socialuserprofile/response/UserProfileClient;", "id", "", "core_release"})
/* compiled from: SocialUserProfileRequests.kt */
public final class a {
    public static final a byD = new a();

    private a() {
    }

    public final p<com.iqoption.core.microservices.e.a.a> aO(long j) {
        return d.EV().a("get-user-profile-client", com.iqoption.core.microservices.e.a.a.class).k("user_id", Long.valueOf(j)).UB();
    }
}
