package com.iqoption.deposit.verification;

import android.content.Context;
import com.iqoption.cardsverification.h;
import com.iqoption.core.microservices.billing.verification.response.CardStatus;
import com.iqoption.core.microservices.billing.verification.response.d;
import com.iqoption.core.microservices.kyc.response.VerificationLevelIndicator;
import com.iqoption.core.microservices.kyc.response.j;
import com.iqoption.core.microservices.kyc.response.k;
import com.iqoption.core.microservices.kyc.response.step.c;
import com.iqoption.deposit.o.g;
import java.util.Comparator;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000L\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a*\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0001\u001a\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001a\"\u0017\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\"-\u0010\u0005\u001a\u001e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00070\u0006j\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u0007`\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\"\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0001¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0004¨\u0006\u001b"}, bng = {"VERIFY_SOURCE_ORDER", "", "Lcom/iqoption/deposit/verification/VerifySource;", "getVERIFY_SOURCE_ORDER", "()Ljava/util/List;", "VERIFY_STATE_COMPARATOR", "Ljava/util/Comparator;", "Lcom/iqoption/deposit/verification/VerifyWarning;", "Lkotlin/Comparator;", "getVERIFY_STATE_COMPARATOR", "()Ljava/util/Comparator;", "VERIFY_STATE_ORDER", "Lcom/iqoption/deposit/verification/VerificationState;", "getVERIFY_STATE_ORDER", "getCardWarning", "Lcom/iqoption/deposit/verification/CardsVerifyWarning;", "context", "Landroid/content/Context;", "targetCard", "Lcom/iqoption/core/microservices/billing/verification/response/VerifyCard;", "notVerifiedCards", "getKycWarning", "Lcom/iqoption/deposit/verification/KycVerifyWarning;", "kycData", "Lcom/iqoption/core/microservices/kyc/response/VerificationInitData;", "hasInvoices", "", "deposit_release"})
/* compiled from: VerifyWarning.kt */
public final class f {
    private static final List<VerificationState> cGE = m.listOf(VerificationState.IMPORTANT, VerificationState.WAITING, VerificationState.NEED_ADDITIONAL_ACTION, VerificationState.OK);
    private static final List<VerifySource> cGF = m.listOf(VerifySource.KYC, VerifySource.CARD);
    private static final Comparator<e<?>> cGG = new b(new a());

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, bng = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"})
    /* compiled from: Comparisons.kt */
    public static final class a<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            Comparable valueOf;
            Comparable valueOf2;
            e eVar = (e) t;
            Integer valueOf3 = Integer.valueOf(Integer.MAX_VALUE);
            if (eVar != null) {
                valueOf = Integer.valueOf(f.ati().indexOf(eVar.ath()));
            } else {
                valueOf = valueOf3;
            }
            e eVar2 = (e) t2;
            if (eVar2 != null) {
                valueOf2 = Integer.valueOf(f.ati().indexOf(eVar2.ath()));
            } else {
                valueOf2 = valueOf3;
            }
            return b.c(valueOf, valueOf2);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, bng = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$thenBy$1"})
    /* compiled from: Comparisons.kt */
    public static final class b<T> implements Comparator<T> {
        final /* synthetic */ Comparator brw;

        public b(Comparator comparator) {
            this.brw = comparator;
        }

        public final int compare(T t, T t2) {
            int compare = this.brw.compare(t, t2);
            if (compare != 0) {
                return compare;
            }
            e eVar = (e) t;
            Object obj = null;
            int i = u.i(f.atj(), eVar != null ? eVar.atg() : null);
            Comparable valueOf = i >= 0 ? Integer.valueOf(i) : Integer.valueOf(Integer.MAX_VALUE);
            e eVar2 = (e) t2;
            List atj = f.atj();
            if (eVar2 != null) {
                obj = eVar2.atg();
            }
            int i2 = u.i(atj, obj);
            return b.c(valueOf, i2 >= 0 ? Integer.valueOf(i2) : Integer.valueOf(Integer.MAX_VALUE));
        }
    }

    public static final List<VerificationState> ati() {
        return cGE;
    }

    public static final List<VerifySource> atj() {
        return cGF;
    }

    public static final Comparator<e<?>> atk() {
        return cGG;
    }

    public static /* synthetic */ b a(j jVar, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return a(jVar, z);
    }

    public static final b a(j jVar, boolean z) {
        kotlin.jvm.internal.i.f(jVar, "kycData");
        k aeH = jVar.aeH();
        VerificationLevelIndicator aeL = aeH.aeL();
        c aeJ = aeH.aeJ();
        String reason = aeJ != null ? aeJ.getReason() : null;
        if (!z) {
            return null;
        }
        CharSequence charSequence = reason;
        Object obj = (charSequence == null || u.Y(charSequence)) ? 1 : null;
        if (obj != null) {
            return null;
        }
        if (com.iqoption.core.ext.c.b((Object) aeL, VerificationLevelIndicator.REQUIRED, VerificationLevelIndicator.NEED_ACTION)) {
            return new b(VerificationState.IMPORTANT, reason, aeH);
        }
        if (aeL == VerificationLevelIndicator.WAIT) {
            return new b(VerificationState.WAITING, reason, aeH);
        }
        return null;
    }

    public static final a a(Context context, com.iqoption.core.microservices.billing.verification.response.c cVar, List<com.iqoption.core.microservices.billing.verification.response.c> list) {
        kotlin.jvm.internal.i.f(context, "context");
        a aVar = null;
        if (cVar == null) {
            return null;
        }
        CardStatus Lq = cVar.Lq();
        if (Lq == CardStatus.DECLINED) {
            aVar = new a(VerificationState.IMPORTANT, context.getString(h.a(cVar)), list);
        } else if (!d.abc().contains(Lq) && Lq != CardStatus.VERIFIED) {
            aVar = new a(VerificationState.IMPORTANT, context.getString(g.card_is_not_verified), list);
        } else if (d.abc().contains(Lq)) {
            aVar = new a(VerificationState.WAITING, context.getString(g.card_being_verified), list);
        }
        return aVar;
    }
}
