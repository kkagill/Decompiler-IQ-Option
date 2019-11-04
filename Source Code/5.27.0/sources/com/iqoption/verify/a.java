package com.iqoption.verify;

import android.app.Application;
import androidx.arch.core.util.Function;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import com.iqoption.cardsverification.list.f;
import com.iqoption.core.microservices.billing.verification.response.CardStatus;
import com.iqoption.core.microservices.billing.verification.response.d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0002J\u0014\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\fH\u0002J\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\fR\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000¨\u0006\u0010"}, bng = {"Lcom/iqoption/verify/NonVerifiedCardsViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "app", "Landroid/app/Application;", "(Landroid/app/Application;)V", "verifyCardsViewModel", "Lcom/iqoption/cardsverification/list/VerifyCardsViewModel;", "filterCards", "", "Lcom/iqoption/core/microservices/billing/verification/response/VerifyCard;", "source", "getNotVerifiedCards", "Landroidx/lifecycle/LiveData;", "isCardVerificationFailed", "", "Companion", "app_optionXRelease"})
/* compiled from: NonVerifiedCardsViewModel.kt */
public final class a extends AndroidViewModel {
    public static final a ecf = new a();
    private f aCG;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, bng = {"Lcom/iqoption/verify/NonVerifiedCardsViewModel$Companion;", "", "()V", "create", "Lcom/iqoption/verify/NonVerifiedCardsViewModel;", "activity", "Landroidx/fragment/app/FragmentActivity;", "app_optionXRelease"})
    /* compiled from: NonVerifiedCardsViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final a H(FragmentActivity fragmentActivity) {
            kotlin.jvm.internal.i.f(fragmentActivity, "activity");
            ViewModel viewModel = ViewModelProviders.of(fragmentActivity).get(a.class);
            kotlin.jvm.internal.i.e(viewModel, "ViewModelProviders.of(ac…rdsViewModel::class.java]");
            a aVar = (a) viewModel;
            aVar.aCG = f.aBB.d(fragmentActivity);
            return aVar;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "Lcom/iqoption/core/microservices/billing/verification/response/VerifyCard;", "source", "apply"})
    /* compiled from: NonVerifiedCardsViewModel.kt */
    static final class b<I, O> implements Function<X, Y> {
        final /* synthetic */ a ecg;

        b(a aVar) {
            this.ecg = aVar;
        }

        public final List<com.iqoption.core.microservices.billing.verification.response.c> apply(List<com.iqoption.core.microservices.billing.verification.response.c> list) {
            return this.ecg.bw(list);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "cards", "", "Lcom/iqoption/core/microservices/billing/verification/response/VerifyCard;", "kotlin.jvm.PlatformType", "apply"})
    /* compiled from: NonVerifiedCardsViewModel.kt */
    static final class c<I, O> implements Function<X, Y> {
        public static final c ech = new c();

        c() {
        }

        public /* synthetic */ Object apply(Object obj) {
            return Boolean.valueOf(J((List) obj));
        }

        public final boolean J(List<com.iqoption.core.microservices.billing.verification.response.c> list) {
            com.iqoption.core.microservices.billing.verification.response.c cVar = null;
            if (list != null) {
                Object obj;
                for (Object next : list) {
                    if (com.iqoption.core.ext.c.b(((com.iqoption.core.microservices.billing.verification.response.c) next).Lq(), CardStatus.DECLINED, CardStatus.FAILED)) {
                        obj = next;
                        break;
                    }
                }
                cVar = (com.iqoption.core.microservices.billing.verification.response.c) obj;
            }
            return cVar != null;
        }
    }

    public static final a H(FragmentActivity fragmentActivity) {
        return ecf.H(fragmentActivity);
    }

    public a(Application application) {
        kotlin.jvm.internal.i.f(application, "app");
        super(application);
    }

    private final LiveData<List<com.iqoption.core.microservices.billing.verification.response.c>> aXd() {
        f fVar = this.aCG;
        if (fVar == null) {
            kotlin.jvm.internal.i.lG("verifyCardsViewModel");
        }
        LiveData map = Transformations.map(fVar.Ll(), new b(this));
        kotlin.jvm.internal.i.e(map, "Transformations.map(veri…-> filterCards(source) })");
        return map;
    }

    public final LiveData<Boolean> aXe() {
        LiveData map = Transformations.map(aXd(), c.ech);
        kotlin.jvm.internal.i.e(map, "Transformations.map(getN…NED, FAILED) } != null })");
        return map;
    }

    private final List<com.iqoption.core.microservices.billing.verification.response.c> bw(List<com.iqoption.core.microservices.billing.verification.response.c> list) {
        if (list == null) {
            return m.emptyList();
        }
        Collection arrayList = new ArrayList();
        for (Object next : list) {
            CardStatus Lq = ((com.iqoption.core.microservices.billing.verification.response.c) next).Lq();
            Object obj = (Lq == CardStatus.VERIFIED || d.abc().contains(Lq)) ? null : 1;
            if (obj != null) {
                arrayList.add(next);
            }
        }
        return (List) arrayList;
    }
}
