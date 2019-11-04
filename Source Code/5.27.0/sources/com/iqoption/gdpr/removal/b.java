package com.iqoption.gdpr.removal;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import java.util.concurrent.Future;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0006"}, bng = {"Lcom/iqoption/gdpr/removal/PendingRemovalViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "cancelForgetUser", "Lio/reactivex/Completable;", "Companion", "app_optionXRelease"})
/* compiled from: PendingRemovalViewModel.kt */
public final class b extends ViewModel {
    public static final a drm = new a();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, bng = {"Lcom/iqoption/gdpr/removal/PendingRemovalViewModel$Companion;", "", "()V", "create", "Lcom/iqoption/gdpr/removal/PendingRemovalViewModel;", "activity", "Landroidx/fragment/app/FragmentActivity;", "app_optionXRelease"})
    /* compiled from: PendingRemovalViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final b w(FragmentActivity fragmentActivity) {
            kotlin.jvm.internal.i.f(fragmentActivity, "activity");
            ViewModel viewModel = ViewModelProviders.of(fragmentActivity).get(b.class);
            kotlin.jvm.internal.i.e(viewModel, "ViewModelProviders.of(ac…valViewModel::class.java]");
            return (b) viewModel;
        }
    }

    public final io.reactivex.a aIu() {
        io.reactivex.a a = io.reactivex.a.b((Future) com.iqoption.core.microservices.busapi.a.bpm.abs()).b(com.iqoption.core.rx.i.aki()).a(com.iqoption.core.rx.i.akj());
        kotlin.jvm.internal.i.e(a, "Completable.fromFuture(B…           .observeOn(ui)");
        return a;
    }
}
