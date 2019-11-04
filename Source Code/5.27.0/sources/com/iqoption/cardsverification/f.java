package com.iqoption.cardsverification;

import androidx.fragment.app.FragmentActivity;
import com.iqoption.core.ui.d.c;
import java.util.HashMap;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0006"}, bng = {"Lcom/iqoption/cardsverification/ProCardsNavigatorFragment;", "Lcom/iqoption/cardsverification/CardsNavigatorFragment;", "()V", "closeCardVerification", "", "Companion", "app_optionXRelease"})
/* compiled from: ProCardsNavigatorFragment.kt */
public final class f extends b {
    public static final a aAt = new a();
    private HashMap apm;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, bng = {"Lcom/iqoption/cardsverification/ProCardsNavigatorFragment$Companion;", "", "()V", "navEntry", "Lcom/iqoption/core/ui/navigation/NavigatorEntry;", "particularCard", "Lcom/iqoption/core/microservices/billing/verification/response/VerifyCard;", "refreshDescription", "", "app_optionXRelease"})
    /* compiled from: ProCardsNavigatorFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final c b(com.iqoption.core.microservices.billing.verification.response.c cVar, boolean z) {
            return new c(b.aAo.Bx(), f.class, b.aAo.a(cVar, z), 0, 0, 0, 0, null, null, null, null, 2040, null);
        }
    }

    public void Bj() {
        HashMap hashMap = this.apm;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        Bj();
    }

    public void KY() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }
}
