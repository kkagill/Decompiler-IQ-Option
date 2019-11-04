package com.iqoption.fragment.restriction;

import android.annotation.SuppressLint;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import com.iqoption.core.d;
import io.reactivex.b.f;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\b"}, bng = {"Lcom/iqoption/fragment/restriction/TradeRoomRestrictionViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "setRequirementShown", "", "requirement", "Lcom/iqoption/core/microservices/kyc/response/requirement/KycRequirement;", "Companion", "app_optionXRelease"})
/* compiled from: TradeRoomRestrictionViewModel.kt */
public final class b extends ViewModel {
    public static final a dkK = new a();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, bng = {"Lcom/iqoption/fragment/restriction/TradeRoomRestrictionViewModel$Companion;", "", "()V", "get", "Lcom/iqoption/fragment/restriction/TradeRoomRestrictionViewModel;", "fragment", "Landroidx/fragment/app/Fragment;", "app_optionXRelease"})
    /* compiled from: TradeRoomRestrictionViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final b af(Fragment fragment) {
            kotlin.jvm.internal.i.f(fragment, "fragment");
            ViewModel viewModel = ViewModelProviders.of(fragment).get(b.class);
            kotlin.jvm.internal.i.e(viewModel, "ViewModelProviders.of(fr…ionViewModel::class.java)");
            return (b) viewModel;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "run"})
    /* compiled from: TradeRoomRestrictionViewModel.kt */
    static final class b implements io.reactivex.b.a {
        public static final b dkL = new b();

        b() {
        }

        public final void run() {
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: TradeRoomRestrictionViewModel.kt */
    static final class c<T> implements f<Throwable> {
        public static final c dkM = new c();

        c() {
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
        }
    }

    @SuppressLint({"CheckResult"})
    public final void a(com.iqoption.core.microservices.kyc.response.requirement.a aVar) {
        kotlin.jvm.internal.i.f(aVar, "requirement");
        if (!d.Un().Dr() || !com.iqoption.core.data.d.a.bdi.Ws()) {
            com.iqoption.core.microservices.kyc.c.bur.gG(aVar.afv()).b(com.iqoption.core.rx.i.aki()).a(b.dkL, c.dkM);
        }
    }
}
