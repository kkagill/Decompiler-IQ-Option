package com.iqoption.protrader.active;

import android.app.Application;
import android.content.SharedPreferences;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import com.iqoption.app.d;
import com.iqoption.protrader.f;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0002J\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\n¨\u0006\f"}, bng = {"Lcom/iqoption/protrader/active/ProTraderActiveViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "app", "Landroid/app/Application;", "(Landroid/app/Application;)V", "getPreferences", "Landroid/content/SharedPreferences;", "setProTraderActiveHidden", "", "shouldShowProTraderActive", "", "Companion", "app_optionXRelease"})
/* compiled from: ProTraderActiveViewModel.kt */
public final class b extends AndroidViewModel {
    public static final a dQz = new a();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, bng = {"Lcom/iqoption/protrader/active/ProTraderActiveViewModel$Companion;", "", "()V", "create", "Lcom/iqoption/protrader/active/ProTraderActiveViewModel;", "activity", "Landroidx/fragment/app/FragmentActivity;", "app_optionXRelease"})
    /* compiled from: ProTraderActiveViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final b B(FragmentActivity fragmentActivity) {
            kotlin.jvm.internal.i.f(fragmentActivity, "activity");
            ViewModel viewModel = ViewModelProviders.of(fragmentActivity).get(b.class);
            kotlin.jvm.internal.i.e(viewModel, "ViewModelProviders.of(ac…iveViewModel::class.java]");
            return (b) viewModel;
        }
    }

    public b(Application application) {
        kotlin.jvm.internal.i.f(application, "app");
        super(application);
    }

    public final boolean aSZ() {
        if (aEq().getBoolean("pro_trader_active_hidden", false)) {
            return false;
        }
        Application application = getApplication();
        kotlin.jvm.internal.i.e(application, "getApplication()");
        if (f.a(application, null, 2, null)) {
            return true;
        }
        return false;
    }

    public final void aTa() {
        aEq().edit().putBoolean("pro_trader_active_hidden", true).apply();
    }

    private final SharedPreferences aEq() {
        SharedPreferences W = d.aP(getApplication()).W(com.iqoption.app.b.DG().getUserId());
        kotlin.jvm.internal.i.e(W, "Preferences.getInstance(…utUserPreferences(userId)");
        return W;
    }
}
