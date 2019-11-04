package com.iqoption.cardsverification.status;

import android.app.Application;
import androidx.annotation.MainThread;
import androidx.arch.core.util.Function;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import com.iqoption.cardsverification.list.f;
import com.iqoption.core.microservices.billing.verification.response.c;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u0000 \f2\u00020\u0001:\u0001\fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0007R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000¨\u0006\r"}, bng = {"Lcom/iqoption/cardsverification/status/VerifyStatusViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "verifyCardsViewModel", "Lcom/iqoption/cardsverification/list/VerifyCardsViewModel;", "getCard", "Landroidx/lifecycle/LiveData;", "Lcom/iqoption/core/microservices/billing/verification/response/VerifyCard;", "id", "", "Companion", "cardsverification_release"})
/* compiled from: VerifyStatusViewModel.kt */
public final class n extends AndroidViewModel {
    public static final a aCH = new a();
    private f aCG;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, bng = {"Lcom/iqoption/cardsverification/status/VerifyStatusViewModel$Companion;", "", "()V", "create", "Lcom/iqoption/cardsverification/status/VerifyStatusViewModel;", "activity", "Landroidx/fragment/app/FragmentActivity;", "cardsverification_release"})
    /* compiled from: VerifyStatusViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final n e(FragmentActivity fragmentActivity) {
            kotlin.jvm.internal.i.f(fragmentActivity, "activity");
            ViewModel viewModel = ViewModelProviders.of(fragmentActivity).get(n.class);
            kotlin.jvm.internal.i.e(viewModel, "ViewModelProviders.of(ac…tusViewModel::class.java]");
            n nVar = (n) viewModel;
            nVar.aCG = f.aBB.d(fragmentActivity);
            return nVar;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "Lcom/iqoption/core/microservices/billing/verification/response/VerifyCard;", "cards", "", "apply"})
    /* compiled from: VerifyStatusViewModel.kt */
    static final class b<I, O> implements Function<X, Y> {
        final /* synthetic */ long aCI;

        b(long j) {
            this.aCI = j;
        }

        /* renamed from: P */
        public final c apply(List<c> list) {
            c cVar = null;
            if (list == null) {
                return null;
            }
            for (c next : list) {
                Object obj;
                if (next.getId() == this.aCI) {
                    obj = 1;
                    continue;
                } else {
                    obj = null;
                    continue;
                }
                if (obj != null) {
                    cVar = next;
                    break;
                }
            }
            return cVar;
        }
    }

    public n(Application application) {
        kotlin.jvm.internal.i.f(application, "application");
        super(application);
    }

    @MainThread
    public final LiveData<c> au(long j) {
        f fVar = this.aCG;
        if (fVar == null) {
            kotlin.jvm.internal.i.lG("verifyCardsViewModel");
        }
        LiveData map = Transformations.map(fVar.Ll(), new b(j));
        kotlin.jvm.internal.i.e(map, "Transformations.map(veri…s?.find { it.id == id } }");
        return map;
    }
}
