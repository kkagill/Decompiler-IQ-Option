package com.iqoption.core.splash;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataReactiveStreams;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import com.iqoption.core.b.d;
import io.reactivex.b.g;
import io.reactivex.b.l;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0005¢\u0006\u0002\u0010\u0002J\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0002¨\u0006\t"}, bng = {"Lcom/iqoption/core/splash/SplashViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "regulation", "Landroidx/lifecycle/LiveData;", "", "regulationFlowable", "Lio/reactivex/Flowable;", "Companion", "core_release"})
/* compiled from: SplashViewModel.kt */
public final class e extends ViewModel {
    public static final a bGM = new a();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, bng = {"Lcom/iqoption/core/splash/SplashViewModel$Companion;", "", "()V", "get", "Lcom/iqoption/core/splash/SplashViewModel;", "fragment", "Landroidx/fragment/app/Fragment;", "core_release"})
    /* compiled from: SplashViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final e y(Fragment fragment) {
            kotlin.jvm.internal.i.f(fragment, "fragment");
            ViewModel viewModel = ViewModelProviders.of(fragment).get(e.class);
            kotlin.jvm.internal.i.e(viewModel, "ViewModelProviders.of(fr…ashViewModel::class.java)");
            return (e) viewModel;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/event/IQEvent;", "test"})
    /* compiled from: SplashViewModel.kt */
    static final class b<T> implements l<d> {
        public static final b bGN = new b();

        b() {
        }

        /* renamed from: b */
        public final boolean test(d dVar) {
            kotlin.jvm.internal.i.f(dVar, "it");
            return dVar instanceof com.iqoption.core.b.e;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/event/IQEvent;", "apply"})
    /* compiled from: SplashViewModel.kt */
    static final class c<T, R> implements g<T, R> {
        public static final c bGO = new c();

        c() {
        }

        public /* synthetic */ Object apply(Object obj) {
            return Boolean.valueOf(c((d) obj));
        }

        public final boolean c(d dVar) {
            kotlin.jvm.internal.i.f(dVar, "it");
            return ((com.iqoption.core.b.e) dVar).getValue();
        }
    }

    public final LiveData<Boolean> akT() {
        LiveData fromPublisher = LiveDataReactiveStreams.fromPublisher(akU());
        kotlin.jvm.internal.i.e(fromPublisher, "LiveDataReactiveStreams.…her(regulationFlowable())");
        return fromPublisher;
    }

    private final io.reactivex.e<Boolean> akU() {
        io.reactivex.e cD;
        if (com.iqoption.core.d.Un().Dq()) {
            cD = io.reactivex.e.cD(Boolean.valueOf(false));
            kotlin.jvm.internal.i.e(cD, "Flowable.just(false)");
            return cD;
        }
        cD = com.iqoption.core.d.Um().EI().b((l) b.bGN).g(c.bGO).cG(Boolean.valueOf(com.iqoption.core.data.d.e.bdq.Er())).c(com.iqoption.core.rx.i.akj());
        kotlin.jvm.internal.i.e(cD, "core.iqGuavaEvents()\n   …           .observeOn(ui)");
        return cD;
    }
}
