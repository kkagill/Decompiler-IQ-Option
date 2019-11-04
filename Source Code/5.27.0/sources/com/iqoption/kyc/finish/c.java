package com.iqoption.kyc.finish;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import com.iqoption.kyc.l;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\t"}, bng = {"Lcom/iqoption/kyc/finish/KycFinishViewModel;", "Lcom/iqoption/kyc/KycSubStepContainerViewModel;", "()V", "hideBottomBar", "", "hideProgress", "isRegulated", "", "Companion", "kyc_release"})
/* compiled from: KycFinishViewModel.kt */
public final class c extends l {
    public static final a dxI = new a();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, bng = {"Lcom/iqoption/kyc/finish/KycFinishViewModel$Companion;", "", "()V", "get", "Lcom/iqoption/kyc/finish/KycFinishViewModel;", "fragment", "Landroidx/fragment/app/Fragment;", "kyc_release"})
    /* compiled from: KycFinishViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final c ar(Fragment fragment) {
            kotlin.jvm.internal.i.f(fragment, "fragment");
            ViewModel viewModel = ViewModelProviders.of(fragment).get(c.class);
            kotlin.jvm.internal.i.e(viewModel, "ViewModelProviders.of(fr…ishViewModel::class.java)");
            c cVar = (c) viewModel;
            cVar.an(fragment);
            return cVar;
        }
    }

    public final void aLa() {
        aIB().eo(false);
    }

    public final void aLb() {
        aIB().er(false);
    }

    public final boolean Er() {
        return aIB().Er();
    }
}
