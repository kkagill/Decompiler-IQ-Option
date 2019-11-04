package com.iqoption.cardsverification;

import androidx.fragment.app.Fragment;
import com.iqoption.core.microservices.billing.verification.response.c;
import com.iqoption.verify.VerifyCardsActivity;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\n"}, bng = {"Lcom/iqoption/cardsverification/CardsVerificationProviderImpl;", "Lcom/iqoption/cardsverification/CardsVerificationProvider;", "()V", "onCardVerification", "", "currentFragment", "Landroidx/fragment/app/Fragment;", "particularCard", "Lcom/iqoption/core/microservices/billing/verification/response/VerifyCard;", "Companion", "app_optionXRelease"})
/* compiled from: CardsVerificationProviderImpl.kt */
public final class d implements c {
    public static final a aAs = new a();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, bng = {"Lcom/iqoption/cardsverification/CardsVerificationProviderImpl$Companion;", "", "()V", "init", "", "app_optionXRelease"})
    /* compiled from: CardsVerificationProviderImpl.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final void init() {
            c.aAp.a(new d());
        }
    }

    public static final void init() {
        aAs.init();
    }

    public void d(Fragment fragment, c cVar) {
        kotlin.jvm.internal.i.f(fragment, "currentFragment");
        com.iqoption.verify.VerifyCardsActivity.a.a(VerifyCardsActivity.ecj, com.iqoption.core.ext.a.q(fragment), cVar, false, 4, null);
    }
}
