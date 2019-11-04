package com.iqoption.welcome.slide;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import com.iqoption.core.ui.f.d;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, bng = {"Lcom/iqoption/welcome/slide/SlidesViewModel;", "Lcom/iqoption/core/ui/viewmodel/DisposableViewModel;", "()V", "enabledDebugMenu", "", "getEnabledDebugMenu", "()Z", "Companion", "welcome_release"})
/* compiled from: SlidesViewModel.kt */
public final class a extends d {
    private static final String TAG;
    public static final a emH = new a();
    private final boolean emG;

    @i(bne = {1, 1, 15}, bnf = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH\u0007R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\r"}, bng = {"Lcom/iqoption/welcome/slide/SlidesViewModel$Companion;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "get", "Lcom/iqoption/welcome/slide/SlidesViewModel;", "f", "Landroidx/fragment/app/Fragment;", "activity", "Landroidx/fragment/app/FragmentActivity;", "welcome_release"})
    /* compiled from: SlidesViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final a bq(Fragment fragment) {
            kotlin.jvm.internal.i.f(fragment, "f");
            ViewModel viewModel = ViewModelProviders.of(fragment).get(a.class);
            kotlin.jvm.internal.i.e(viewModel, "ViewModelProviders.of(f)…desViewModel::class.java]");
            return (a) viewModel;
        }
    }

    public a() {
        boolean z = true;
        if (!(com.iqoption.core.d.Un().Ds() || u.v(com.iqoption.core.d.Un().Dv(), "com.iqoption.dev", true))) {
            z = false;
        }
        this.emG = z;
    }

    static {
        String name = a.class.getName();
        if (name == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        TAG = name;
    }

    public final boolean bbo() {
        return this.emG;
    }
}
