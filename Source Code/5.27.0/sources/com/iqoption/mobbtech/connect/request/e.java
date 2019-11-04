package com.iqoption.mobbtech.connect.request;

import com.google.common.base.Optional;
import com.iqoption.core.microservices.kyc.response.Gender;
import com.iqoption.core.microservices.kyc.response.d;
import com.iqoption.core.microservices.kyc.response.h;
import io.reactivex.b.c;
import io.reactivex.b.g;
import io.reactivex.p;
import io.reactivex.t;
import kotlin.Pair;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0001\u0010\u0003\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00050\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0011H\u0007¨\u0006\u0018"}, bng = {"Lcom/iqoption/mobbtech/connect/request/PersonalInfoRequest;", "", "()V", "performFull", "Lio/reactivex/Single;", "Lkotlin/Pair;", "Lcom/iqoption/core/microservices/kyc/response/UpdateProfileResult;", "Lcom/iqoption/core/microservices/kyc/response/SavePhoneResult;", "firstName", "", "lastName", "birthDate", "nationality", "city", "zip", "address", "isMale", "", "countryId", "", "tin", "phoneCode", "phone", "phoneChanged", "app_optionXRelease"})
/* compiled from: PersonalInfoRequest.kt */
public final class e {
    public static final e dHU = new e();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006H\n¢\u0006\u0002\b\u0007"}, bng = {"<anonymous>", "Lkotlin/Pair;", "Lcom/iqoption/core/microservices/kyc/response/UpdateProfileResult;", "Lcom/iqoption/core/microservices/kyc/response/SavePhoneResult;", "profileResult", "phoneResult", "Lcom/google/common/base/Optional;", "apply"})
    /* compiled from: PersonalInfoRequest.kt */
    static final class a<T1, T2, R> implements c<h, Optional<d>, Pair<? extends h, ? extends d>> {
        public static final a dHV = new a();

        a() {
        }

        /* renamed from: a */
        public final Pair<h, d> apply(h hVar, Optional<d> optional) {
            kotlin.jvm.internal.i.f(hVar, "profileResult");
            kotlin.jvm.internal.i.f(optional, "phoneResult");
            return new Pair(hVar, optional.pN());
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "Lcom/google/common/base/Optional;", "Lcom/iqoption/core/microservices/kyc/response/SavePhoneResult;", "kotlin.jvm.PlatformType", "it", "apply"})
    /* compiled from: PersonalInfoRequest.kt */
    static final class b<T, R> implements g<T, R> {
        public static final b dHW = new b();

        b() {
        }

        /* renamed from: e */
        public final Optional<d> apply(d dVar) {
            kotlin.jvm.internal.i.f(dVar, "it");
            return Optional.am(dVar);
        }
    }

    private e() {
    }

    public static final p<Pair<h, d>> a(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, long j, String str8, String str9, String str10, boolean z2) {
        Object t;
        String str11 = str;
        kotlin.jvm.internal.i.f(str, "firstName");
        String str12 = str2;
        kotlin.jvm.internal.i.f(str2, "lastName");
        String str13 = str3;
        kotlin.jvm.internal.i.f(str13, "birthDate");
        String str14 = str4;
        kotlin.jvm.internal.i.f(str14, "nationality");
        String str15 = str5;
        kotlin.jvm.internal.i.f(str15, "city");
        String str16 = str6;
        kotlin.jvm.internal.i.f(str16, "zip");
        String str17 = str7;
        kotlin.jvm.internal.i.f(str17, "address");
        kotlin.jvm.internal.i.f(str9, "phoneCode");
        kotlin.jvm.internal.i.f(str10, "phone");
        p a = com.iqoption.core.microservices.kyc.c.a(str11, str12, str13, Gender.Companion.fromBoolean(Boolean.valueOf(z)), str14, j, str15, str17, str16, str8);
        if (z2) {
            t = com.iqoption.core.microservices.kyc.d.ao(str9, str10).t(b.dHW);
        } else {
            t = p.cI(Optional.pW());
        }
        kotlin.jvm.internal.i.e(t, "if (phoneChanged) {\n    …ional.absent())\n        }");
        a = p.a(a, (t) t, a.dHV);
        kotlin.jvm.internal.i.e(a, "Single.zip(\n            …ult.orNull()) }\n        )");
        return a;
    }
}
