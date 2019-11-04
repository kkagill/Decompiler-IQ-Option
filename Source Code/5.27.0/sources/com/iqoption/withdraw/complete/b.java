package com.iqoption.withdraw.complete;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataReactiveStreams;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import com.iqoption.withdraw.f;
import io.reactivex.b.g;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u0005¢\u0006\u0002\u0010\u0002J\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¨\u0006\u0007"}, bng = {"Lcom/iqoption/withdraw/complete/WithdrawCompleteViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "balance", "Landroidx/lifecycle/LiveData;", "", "Companion", "withdraw_release"})
/* compiled from: WithdrawCompleteViewModel.kt */
public final class b extends ViewModel {
    public static final a epL = new a();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, bng = {"Lcom/iqoption/withdraw/complete/WithdrawCompleteViewModel$Companion;", "", "()V", "get", "Lcom/iqoption/withdraw/complete/WithdrawCompleteViewModel;", "fragment", "Landroidx/fragment/app/Fragment;", "withdraw_release"})
    /* compiled from: WithdrawCompleteViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final b bA(Fragment fragment) {
            kotlin.jvm.internal.i.f(fragment, "fragment");
            ViewModel viewModel = ViewModelProviders.of(f.epg.aj(fragment)).get(b.class);
            kotlin.jvm.internal.i.e(viewModel, "ViewModelProviders.of(ge…eteViewModel::class.java]");
            return (b) viewModel;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/data/mediators/BalanceData;", "apply"})
    /* compiled from: WithdrawCompleteViewModel.kt */
    static final class b<T, R> implements g<T, R> {
        public static final b epM = new b();

        b() {
        }

        /* renamed from: d */
        public final String apply(com.iqoption.core.data.c.a aVar) {
            kotlin.jvm.internal.i.f(aVar, "it");
            return aVar.VN();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "it", "", "apply"})
    /* compiled from: WithdrawCompleteViewModel.kt */
    static final class c<T, R> implements g<Throwable, String> {
        public static final c epN = new c();

        c() {
        }

        /* renamed from: X */
        public final String apply(Throwable th) {
            kotlin.jvm.internal.i.f(th, "it");
            return "";
        }
    }

    public final LiveData<String> bca() {
        LiveData fromPublisher = LiveDataReactiveStreams.fromPublisher(com.iqoption.core.data.c.b.bcS.VT().g(b.epM).d(com.iqoption.core.rx.i.aki()).c(com.iqoption.core.rx.i.akj()).h(c.epN));
        kotlin.jvm.internal.i.e(fromPublisher, "LiveDataReactiveStreams.…orReturn { \"\" }\n        )");
        return fromPublisher;
    }
}
