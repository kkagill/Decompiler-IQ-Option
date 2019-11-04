package com.iqoption.core.microservices.busapi;

import com.google.common.util.concurrent.t;
import com.iqoption.core.connect.j;
import com.iqoption.core.d;
import com.iqoption.core.microservices.busapi.response.b;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\u0006\u0010\f\u001a\u00020\rJ\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0013\u001a\u00020\rR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0014"}, bng = {"Lcom/iqoption/core/microservices/busapi/BusApiRequests;", "", "()V", "CANCEL_FORGET_USER", "", "FORGET_USER", "GET_FORGET_USER_STATUS", "SET_PERSONAL_DATA_POLICY", "USER_FORGOTTEN", "cancelForgetUser", "Lcom/google/common/util/concurrent/ListenableFuture;", "Ljava/lang/Void;", "deleteAccount", "Lio/reactivex/Completable;", "forgetUser", "setPersonalDataPolicy", "policy", "Lcom/iqoption/core/microservices/busapi/response/PersonalDataPolicy;", "setPersonalDataPolicyRx", "undeleteAccount", "core_release"})
/* compiled from: BusApiRequests.kt */
public final class a {
    public static final a bpm = new a();

    private a() {
    }

    public final t<Void> b(b bVar) {
        kotlin.jvm.internal.i.f(bVar, "policy");
        j fp = d.EV().a("set-personal-data-policy", Void.class).ch(false).fp("1.0");
        Boolean abv = bVar.abv();
        if (abv != null) {
            fp.k("is_agreement_accepted", Boolean.valueOf(abv.booleanValue()));
        }
        abv = bVar.abw();
        if (abv != null) {
            fp.k("is_email_accepted", Boolean.valueOf(abv.booleanValue()));
        }
        abv = bVar.abx();
        if (abv != null) {
            fp.k("is_push_accepted", Boolean.valueOf(abv.booleanValue()));
        }
        abv = bVar.aby();
        if (abv != null) {
            fp.k("is_call_accepted", Boolean.valueOf(abv.booleanValue()));
        }
        Boolean abz = bVar.abz();
        if (abz != null) {
            fp.k("is_thirdparty_accepted", Boolean.valueOf(abz.booleanValue()));
        }
        return fp.UA();
    }

    public final io.reactivex.a c(b bVar) {
        kotlin.jvm.internal.i.f(bVar, "policy");
        j fp = d.EV().a("set-personal-data-policy", Void.class).ch(false).fp("1.0");
        Boolean abv = bVar.abv();
        if (abv != null) {
            fp.k("is_agreement_accepted", Boolean.valueOf(abv.booleanValue()));
        }
        abv = bVar.abw();
        if (abv != null) {
            fp.k("is_email_accepted", Boolean.valueOf(abv.booleanValue()));
        }
        abv = bVar.abx();
        if (abv != null) {
            fp.k("is_push_accepted", Boolean.valueOf(abv.booleanValue()));
        }
        abv = bVar.aby();
        if (abv != null) {
            fp.k("is_call_accepted", Boolean.valueOf(abv.booleanValue()));
        }
        Boolean abz = bVar.abz();
        if (abz != null) {
            fp.k("is_thirdparty_accepted", Boolean.valueOf(abz.booleanValue()));
        }
        io.reactivex.a blf = fp.UB().blf();
        kotlin.jvm.internal.i.e(blf, "builder.exec().ignoreElement()");
        return blf;
    }

    public final t<Void> abr() {
        return d.EV().a("forget-user", Void.class).ch(false).fp("1.0").UA();
    }

    public final t<Void> abs() {
        return d.EV().a("cancel-forget-user", Void.class).ch(false).fp("1.0").UA();
    }
}
