package com.iqoption.f;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import com.iqoption.app.managers.tab.TabHelper;
import io.reactivex.b.f;
import io.reactivex.b.g;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0006\u0010\u0007\u001a\u00020\bR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, bng = {"Lcom/iqoption/expiration/ExpirationViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "quotesDisposable", "Lio/reactivex/disposables/Disposable;", "onStart", "Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "onStop", "", "Companion", "app_optionXRelease"})
/* compiled from: ExpirationViewModel.kt */
public final class a extends ViewModel {
    public static final a cOd = new a();
    private io.reactivex.disposables.b cOc;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, bng = {"Lcom/iqoption/expiration/ExpirationViewModel$Companion;", "", "()V", "create", "Lcom/iqoption/expiration/ExpirationViewModel;", "fragment", "Landroidx/fragment/app/Fragment;", "app_optionXRelease"})
    /* compiled from: ExpirationViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final a W(Fragment fragment) {
            kotlin.jvm.internal.i.f(fragment, "fragment");
            ViewModel viewModel = ViewModelProviders.of(fragment).get(a.class);
            kotlin.jvm.internal.i.e(viewModel, "ViewModelProviders.of(fr…ionViewModel::class.java)");
            return (a) viewModel;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "Lcom/iqoption/core/microservices/tradingengine/response/OptionQuote;", "it", "Lcom/iqoption/core/microservices/pricing/response/InstrumentQuote;", "apply"})
    /* compiled from: ExpirationViewModel.kt */
    static final class b<T, R> implements g<T, R> {
        public static final b cOe = new b();

        b() {
        }

        /* renamed from: b */
        public final List<com.iqoption.core.microservices.tradingengine.response.a> apply(com.iqoption.core.microservices.pricing.b.a aVar) {
            kotlin.jvm.internal.i.f(aVar, "it");
            return aVar.agz();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "quotes", "", "Lcom/iqoption/core/microservices/tradingengine/response/OptionQuote;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: ExpirationViewModel.kt */
    static final class c<T> implements f<List<? extends com.iqoption.core.microservices.tradingengine.response.a>> {
        public static final c cOf = new c();

        c() {
        }

        /* renamed from: v */
        public final void accept(List<com.iqoption.core.microservices.tradingengine.response.a> list) {
            kotlin.jvm.internal.i.e(list, "quotes");
            if ((list.isEmpty() ^ 1) != 0) {
                com.iqoption.app.managers.c.GS().z(list);
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: ExpirationViewModel.kt */
    static final class d<T> implements f<Throwable> {
        public static final d cOg = new d();

        d() {
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
        }
    }

    public static final a W(Fragment fragment) {
        return cOd.W(fragment);
    }

    public final com.iqoption.core.microservices.tradingengine.response.active.a avd() {
        TabHelper IM = TabHelper.IM();
        kotlin.jvm.internal.i.e(IM, "TabHelper.instance()");
        com.iqoption.core.microservices.tradingengine.response.active.a IZ = IM.IZ();
        if (IZ != null) {
            io.reactivex.disposables.b bVar = this.cOc;
            if (bVar != null) {
                bVar.dispose();
            }
            this.cOc = com.iqoption.core.microservices.pricing.a.a(IZ.getActiveId(), IZ.agB(), IZ.getInstrumentType(), 0, 0, null, 56, null).d(com.iqoption.core.rx.i.aki()).c(com.iqoption.core.rx.i.akj()).g(b.cOe).a((f) c.cOf, (f) d.cOg);
        }
        return IZ;
    }

    public final void onStop() {
        io.reactivex.disposables.b bVar = this.cOc;
        if (bVar != null) {
            bVar.dispose();
        }
        this.cOc = (io.reactivex.disposables.b) null;
    }
}
