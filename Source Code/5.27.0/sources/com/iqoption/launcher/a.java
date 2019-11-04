package com.iqoption.launcher;

import android.app.Application;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import com.google.common.util.concurrent.t;
import com.iqoption.util.u;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \b2\u00020\u0001:\u0001\bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¨\u0006\t"}, bng = {"Lcom/iqoption/launcher/LauncherViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "app", "Landroid/app/Application;", "(Landroid/app/Application;)V", "isDocumentsNeeded", "Landroidx/lifecycle/LiveData;", "", "Companion", "app_optionXRelease"})
/* compiled from: LauncherViewModel.kt */
public final class a extends AndroidViewModel {
    public static final a dEH = new a();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, bng = {"Lcom/iqoption/launcher/LauncherViewModel$Companion;", "", "()V", "create", "Lcom/iqoption/launcher/LauncherViewModel;", "activity", "Landroidx/fragment/app/FragmentActivity;", "app_optionXRelease"})
    /* compiled from: LauncherViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final a y(FragmentActivity fragmentActivity) {
            kotlin.jvm.internal.i.f(fragmentActivity, "activity");
            ViewModel viewModel = ViewModelProviders.of(fragmentActivity).get(a.class);
            kotlin.jvm.internal.i.e(viewModel, "ViewModelProviders.of(ac…herViewModel::class.java]");
            return (a) viewModel;
        }
    }

    public static final a y(FragmentActivity fragmentActivity) {
        return dEH.y(fragmentActivity);
    }

    public a(Application application) {
        kotlin.jvm.internal.i.f(application, "app");
        super(application);
    }

    public final LiveData<Boolean> aNu() {
        MutableLiveData mutableLiveData = new MutableLiveData();
        t eV = com.iqoption.microservice.b.a.eV(false);
        kotlin.jvm.internal.i.e(eV, "KycBusRequests.getKycDocumentsStatus(false)");
        u.a(eV, new LauncherViewModel$isDocumentsNeeded$1(mutableLiveData), new LauncherViewModel$isDocumentsNeeded$2(this, mutableLiveData), null, 4, null);
        return mutableLiveData;
    }
}
