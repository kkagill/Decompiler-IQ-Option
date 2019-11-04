package com.iqoption.cardsverification.list;

import android.app.Application;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataReactiveStreams;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import io.reactivex.b.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0002J\u0014\u0010\u000e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u0006J\u0016\u0010\u000f\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002J\u0006\u0010\u0011\u001a\u00020\fR\u001c\u0010\u0005\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\nX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, bng = {"Lcom/iqoption/cardsverification/list/VerifyCardsViewModel;", "Lcom/iqoption/core/ui/viewmodel/DisposableAndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "prevRefreshLiveData", "Landroidx/lifecycle/LiveData;", "", "Lcom/iqoption/core/microservices/billing/verification/response/VerifyCard;", "verifyCardsLiveData", "Landroidx/lifecycle/MediatorLiveData;", "applyCards", "", "source", "loadVerifyCards", "persistLocalStatuses", "cards", "refreshVerifyCards", "Companion", "cardsverification_release"})
/* compiled from: VerifyCardsViewModel.kt */
public final class f extends com.iqoption.core.ui.f.c {
    private static final String TAG;
    public static final a aBB = new a();
    private LiveData<List<com.iqoption.core.microservices.billing.verification.response.c>> aBA;
    private final MediatorLiveData<List<com.iqoption.core.microservices.billing.verification.response.c>> aBz = new MediatorLiveData();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, bng = {"Lcom/iqoption/cardsverification/list/VerifyCardsViewModel$Companion;", "", "()V", "TAG", "", "create", "Lcom/iqoption/cardsverification/list/VerifyCardsViewModel;", "activity", "Landroidx/fragment/app/FragmentActivity;", "cardsverification_release"})
    /* compiled from: VerifyCardsViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final f d(FragmentActivity fragmentActivity) {
            kotlin.jvm.internal.i.f(fragmentActivity, "activity");
            ViewModel viewModel = ViewModelProviders.of(fragmentActivity).get(f.class);
            kotlin.jvm.internal.i.e(viewModel, "ViewModelProviders.of(ac…rdsViewModel::class.java]");
            return (f) viewModel;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, bng = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"})
    /* compiled from: Comparisons.kt */
    public static final class b<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return b.c(Long.valueOf(((com.iqoption.core.microservices.billing.verification.response.c) t).getId()), Long.valueOf(((com.iqoption.core.microservices.billing.verification.response.c) t2).getId()));
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "run"})
    /* compiled from: VerifyCardsViewModel.kt */
    static final class c implements io.reactivex.b.a {
        public static final c aBC = new c();

        c() {
        }

        public final void run() {
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: VerifyCardsViewModel.kt */
    static final class d<T> implements io.reactivex.b.f<Throwable> {
        public static final d aBD = new d();

        d() {
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "it", "", "Lcom/iqoption/core/microservices/billing/verification/response/VerifyCard;", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: VerifyCardsViewModel.kt */
    static final class e<T> implements Observer<S> {
        final /* synthetic */ f aBE;

        e(f fVar) {
            this.aBE = fVar;
        }

        /* renamed from: u */
        public final void onChanged(List<com.iqoption.core.microservices.billing.verification.response.c> list) {
            this.aBE.M(list);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "Lcom/iqoption/core/microservices/billing/verification/response/VerifyCard;", "it", "", "apply"})
    /* compiled from: VerifyCardsViewModel.kt */
    static final class f<T, R> implements g<Throwable, List<? extends com.iqoption.core.microservices.billing.verification.response.c>> {
        public static final f aBF = new f();

        f() {
        }

        /* renamed from: r */
        public final List<com.iqoption.core.microservices.billing.verification.response.c> apply(Throwable th) {
            kotlin.jvm.internal.i.f(th, "it");
            return m.emptyList();
        }
    }

    public f(Application application) {
        kotlin.jvm.internal.i.f(application, "application");
        super(application);
    }

    static {
        String name = f.class.getName();
        if (name == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        TAG = name;
    }

    public final LiveData<List<com.iqoption.core.microservices.billing.verification.response.c>> Ll() {
        Lm();
        return this.aBz;
    }

    public final void Lm() {
        LiveData liveData = this.aBA;
        if (liveData != null) {
            this.aBz.removeSource(liveData);
        }
        liveData = LiveDataReactiveStreams.fromPublisher(com.iqoption.cardsverification.repository.a.aBI.Lo().h(f.aBF).d(com.iqoption.core.rx.i.aki()).c(com.iqoption.core.rx.i.akj()));
        kotlin.jvm.internal.i.e(liveData, "LiveDataReactiveStreams.… .observeOn(ui)\n        )");
        this.aBz.addSource(liveData, new e(this));
        this.aBA = liveData;
    }

    private final void M(List<com.iqoption.core.microservices.billing.verification.response.c> list) {
        Object a = list != null ? u.a((Iterable) list, (Comparator) new b()) : null;
        if (a != null || this.aBz.getValue() == null) {
            this.aBz.postValue(a);
        }
        if (a != null) {
            N(a);
        }
    }

    private final void N(List<com.iqoption.core.microservices.billing.verification.response.c> list) {
        Iterable<com.iqoption.core.microservices.billing.verification.response.c> iterable = list;
        Collection arrayList = new ArrayList(n.e(iterable, 10));
        for (com.iqoption.core.microservices.billing.verification.response.c h : iterable) {
            arrayList.add(com.iqoption.cardsverification.repository.c.aBS.h(h));
        }
        io.reactivex.disposables.b a = com.iqoption.cardsverification.repository.b.aBO.O((List) arrayList).b(com.iqoption.core.rx.i.aki()).a(c.aBC, d.aBD);
        kotlin.jvm.internal.i.e(a, "VerifyLocalStatusesRepos…      \n                })");
        b(a);
    }
}
