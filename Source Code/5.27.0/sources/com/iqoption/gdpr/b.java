package com.iqoption.gdpr;

import android.app.Application;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import com.google.common.util.concurrent.t;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \n2\u00020\u0001:\u0001\nB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t¨\u0006\u000b"}, bng = {"Lcom/iqoption/gdpr/GdprViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "app", "Landroid/app/Application;", "(Landroid/app/Application;)V", "setPersonalDataPolicy", "Lcom/google/common/util/concurrent/ListenableFuture;", "Ljava/lang/Void;", "policy", "Lcom/iqoption/core/microservices/busapi/response/PersonalDataPolicy;", "Companion", "app_optionXRelease"})
/* compiled from: GdprViewModel.kt */
public final class b extends AndroidViewModel {
    public static final a dqY = new a();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, bng = {"Lcom/iqoption/gdpr/GdprViewModel$Companion;", "", "()V", "create", "Lcom/iqoption/gdpr/GdprViewModel;", "activity", "Landroidx/fragment/app/FragmentActivity;", "app_optionXRelease"})
    /* compiled from: GdprViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final b u(FragmentActivity fragmentActivity) {
            kotlin.jvm.internal.i.f(fragmentActivity, "activity");
            ViewModel viewModel = ViewModelProviders.of(fragmentActivity).get(b.class);
            kotlin.jvm.internal.i.e(viewModel, "ViewModelProviders.of(ac…dprViewModel::class.java]");
            return (b) viewModel;
        }
    }

    public b(Application application) {
        kotlin.jvm.internal.i.f(application, "app");
        super(application);
    }

    public final t<Void> b(com.iqoption.core.microservices.busapi.response.b bVar) {
        kotlin.jvm.internal.i.f(bVar, "policy");
        return com.iqoption.core.microservices.busapi.a.bpm.b(bVar);
    }
}
