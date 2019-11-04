package com.iqoption.fragment;

import android.app.Application;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import java.util.concurrent.Future;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\b"}, bng = {"Lcom/iqoption/fragment/MenuViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "app", "Landroid/app/Application;", "(Landroid/app/Application;)V", "forgetUser", "Lio/reactivex/Completable;", "Companion", "app_optionXRelease"})
/* compiled from: MenuViewModel.kt */
public final class u extends AndroidViewModel {
    public static final a cVZ = new a();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, bng = {"Lcom/iqoption/fragment/MenuViewModel$Companion;", "", "()V", "create", "Lcom/iqoption/fragment/MenuViewModel;", "activity", "Landroidx/fragment/app/FragmentActivity;", "app_optionXRelease"})
    /* compiled from: MenuViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final u n(FragmentActivity fragmentActivity) {
            kotlin.jvm.internal.i.f(fragmentActivity, "activity");
            ViewModel viewModel = ViewModelProviders.of(fragmentActivity).get(u.class);
            kotlin.jvm.internal.i.e(viewModel, "ViewModelProviders.of(ac…enuViewModel::class.java]");
            return (u) viewModel;
        }
    }

    public static final u n(FragmentActivity fragmentActivity) {
        return cVZ.n(fragmentActivity);
    }

    public u(Application application) {
        kotlin.jvm.internal.i.f(application, "app");
        super(application);
    }

    public final io.reactivex.a ayb() {
        io.reactivex.a a = io.reactivex.a.b((Future) com.iqoption.core.microservices.busapi.a.bpm.abr()).b(com.iqoption.core.rx.i.aki()).a(com.iqoption.core.rx.i.akj());
        kotlin.jvm.internal.i.e(a, "Completable.fromFuture(B…           .observeOn(ui)");
        return a;
    }
}
