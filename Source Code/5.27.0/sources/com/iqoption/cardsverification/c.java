package com.iqoption.cardsverification;

import androidx.fragment.app.Fragment;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \b2\u00020\u0001:\u0001\bJ\u001c\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¨\u0006\t"}, bng = {"Lcom/iqoption/cardsverification/CardsVerificationProvider;", "", "onCardVerification", "", "currentFragment", "Landroidx/fragment/app/Fragment;", "particularCard", "Lcom/iqoption/core/microservices/billing/verification/response/VerifyCard;", "Companion", "cardsverification_release"})
/* compiled from: CardsVerificationProvider.kt */
public interface c {
    public static final a aAp = a.aAr;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, bng = {"Lcom/iqoption/cardsverification/CardsVerificationProvider$Companion;", "", "()V", "instance", "Lcom/iqoption/cardsverification/CardsVerificationProvider;", "getInstance", "()Lcom/iqoption/cardsverification/CardsVerificationProvider;", "setInstance", "(Lcom/iqoption/cardsverification/CardsVerificationProvider;)V", "cardsverification_release"})
    /* compiled from: CardsVerificationProvider.kt */
    public static final class a {
        public static c aAq;
        static final /* synthetic */ a aAr = new a();

        private a() {
        }

        public final c KZ() {
            c cVar = aAq;
            if (cVar == null) {
                kotlin.jvm.internal.i.lG("instance");
            }
            return cVar;
        }

        public final void a(c cVar) {
            kotlin.jvm.internal.i.f(cVar, "<set-?>");
            aAq = cVar;
        }
    }

    @i(bne = {1, 1, 15})
    /* compiled from: CardsVerificationProvider.kt */
    public static final class b {
        public static /* synthetic */ void a(c cVar, Fragment fragment, com.iqoption.core.microservices.billing.verification.response.c cVar2, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    cVar2 = (com.iqoption.core.microservices.billing.verification.response.c) null;
                }
                cVar.d(fragment, cVar2);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onCardVerification");
        }
    }

    void d(Fragment fragment, com.iqoption.core.microservices.billing.verification.response.c cVar);
}
