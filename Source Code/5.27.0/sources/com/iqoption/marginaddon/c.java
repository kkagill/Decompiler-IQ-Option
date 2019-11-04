package com.iqoption.marginaddon;

import android.app.Application;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import com.iqoption.l.b;
import kotlin.d;
import kotlin.i;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u0011R#\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068BX\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006\u0013"}, bng = {"Lcom/iqoption/marginaddon/MarginAddOnViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "preferences", "Lcom/iqoption/app/Preferences;", "kotlin.jvm.PlatformType", "getPreferences", "()Lcom/iqoption/app/Preferences;", "preferences$delegate", "Lkotlin/Lazy;", "getMarginAddOnDialogShown", "", "isAddOnEnabled", "", "setMarginAddOnEnabled", "", "Companion", "app_optionXRelease"})
/* compiled from: MarginAddOnViewModel.kt */
public final class c extends AndroidViewModel {
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(c.class), "preferences", "getPreferences()Lcom/iqoption/app/Preferences;"))};
    public static final a dFd = new a();
    private final d dFa = g.c(new MarginAddOnViewModel$preferences$2(this));

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, bng = {"Lcom/iqoption/marginaddon/MarginAddOnViewModel$Companion;", "", "()V", "create", "Lcom/iqoption/marginaddon/MarginAddOnViewModel;", "fragment", "Landroidx/fragment/app/Fragment;", "app_optionXRelease"})
    /* compiled from: MarginAddOnViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final c aS(Fragment fragment) {
            kotlin.jvm.internal.i.f(fragment, "fragment");
            ViewModel viewModel = ViewModelProviders.of(fragment).get(c.class);
            kotlin.jvm.internal.i.e(viewModel, "ViewModelProviders.of(fr…dOnViewModel::class.java)");
            return (c) viewModel;
        }
    }

    private final com.iqoption.app.d aNy() {
        d dVar = this.dFa;
        j jVar = anY[0];
        return (com.iqoption.app.d) dVar.getValue();
    }

    public c(Application application) {
        kotlin.jvm.internal.i.f(application, "application");
        super(application);
    }

    public final boolean aNF() {
        com.iqoption.app.d aNy = aNy();
        kotlin.jvm.internal.i.e(aNy, "preferences");
        return aNy.Fn();
    }

    public final void aNG() {
        b aTS = b.aTS();
        kotlin.jvm.internal.i.e(aTS, "SettingsManager.instance()");
        aTS.aV(true);
    }

    public final int aNH() {
        com.iqoption.app.d aNy = aNy();
        kotlin.jvm.internal.i.e(aNy, "preferences");
        return aNy.Gk();
    }
}
