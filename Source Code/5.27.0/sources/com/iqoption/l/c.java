package com.iqoption.l;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import com.google.common.base.Optional;
import com.iqoption.core.data.repository.j;
import com.iqoption.core.microservices.usersettings.SettingsType;
import io.reactivex.e;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n¨\u0006\f"}, bng = {"Lcom/iqoption/settings/SettingsViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "observePrivacySettingsConfig", "Lio/reactivex/Flowable;", "Lcom/google/common/base/Optional;", "Lcom/iqoption/core/microservices/usersettings/response/config/PrivacySettingsConfig;", "setAllowShareDeals", "Lio/reactivex/Completable;", "allowShareDeals", "", "Companion", "app_optionXRelease"})
/* compiled from: SettingsViewModel.kt */
public final class c extends ViewModel {
    public static final a dTc = new a();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, bng = {"Lcom/iqoption/settings/SettingsViewModel$Companion;", "", "()V", "create", "Lcom/iqoption/settings/SettingsViewModel;", "fragment", "Landroidx/fragment/app/Fragment;", "app_optionXRelease"})
    /* compiled from: SettingsViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final c aT(Fragment fragment) {
            kotlin.jvm.internal.i.f(fragment, "fragment");
            ViewModel viewModel = ViewModelProviders.of(fragment).get(c.class);
            kotlin.jvm.internal.i.e(viewModel, "ViewModelProviders.of(fr…ngsViewModel::class.java)");
            return (c) viewModel;
        }
    }

    public static final c aT(Fragment fragment) {
        return dTc.aT(fragment);
    }

    public final e<Optional<com.iqoption.core.microservices.usersettings.b.a.a>> aUb() {
        e c = j.bfg.a(SettingsType.PRIVACY_SETTINGS, com.iqoption.core.microservices.usersettings.b.a.a.class).d(com.iqoption.core.rx.i.aki()).c(com.iqoption.core.rx.i.akj());
        kotlin.jvm.internal.i.e(c, "UserSettingsRepository.o…           .observeOn(ui)");
        return c;
    }

    public final io.reactivex.a fi(boolean z) {
        io.reactivex.a a = com.iqoption.core.microservices.usersettings.a.bDo.a(SettingsType.PRIVACY_SETTINGS, new com.iqoption.core.microservices.usersettings.b.a.a(Boolean.valueOf(z))).b(com.iqoption.core.rx.i.aki()).a(com.iqoption.core.rx.i.akj());
        kotlin.jvm.internal.i.e(a, "UserSettingsRequests.upd…           .observeOn(ui)");
        return a;
    }
}
