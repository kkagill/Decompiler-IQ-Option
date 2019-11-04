package com.iqoption.welcome;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataReactiveStreams;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import com.iqoption.core.d;
import com.iqoption.core.data.b.b;
import io.reactivex.BackpressureStrategy;
import io.reactivex.subjects.PublishSubject;
import java.util.concurrent.TimeUnit;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u000fJ\u0006\u0010\u0011\u001a\u00020\u000fJ\u0006\u0010\u0012\u001a\u00020\u000fJ\u0006\u0010\u0013\u001a\u00020\u000fJ\u0006\u0010\u0014\u001a\u00020\u000fJ\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0004J\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u0004R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tX\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0010\u0012\f\u0012\n \r*\u0004\u0018\u00010\f0\f0\u000bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, bng = {"Lcom/iqoption/welcome/WelcomeStateViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "socialLogout", "Landroidx/lifecycle/LiveData;", "", "getSocialLogout", "()Landroidx/lifecycle/LiveData;", "socialLogoutLiveData", "Lcom/iqoption/core/data/livedata/IQLiveEvent;", "welcomeStateProcessor", "Lio/reactivex/subjects/PublishSubject;", "Lcom/iqoption/welcome/AuthDone;", "kotlin.jvm.PlatformType", "logoutSocial", "", "onAnonymRegistered", "onChangePasswordDone", "onLoginDone", "onRecoveryPasswordDone", "onRegistrationAndAuthDone", "phoneRegState", "", "welcomeState", "Companion", "welcome_release"})
/* compiled from: WelcomeStateViewModel.kt */
public final class o extends ViewModel {
    public static final a ekt = new a();
    private final b<Object> ekq = new b();
    private final LiveData<Object> ekr = this.ekq;
    private final PublishSubject<AuthDone> eks;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, bng = {"Lcom/iqoption/welcome/WelcomeStateViewModel$Companion;", "", "()V", "get", "Lcom/iqoption/welcome/WelcomeStateViewModel;", "activity", "Landroidx/fragment/app/FragmentActivity;", "welcome_release"})
    /* compiled from: WelcomeStateViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final o N(FragmentActivity fragmentActivity) {
            kotlin.jvm.internal.i.f(fragmentActivity, "activity");
            ViewModel viewModel = ViewModelProviders.of(fragmentActivity).get(o.class);
            kotlin.jvm.internal.i.e(viewModel, "ViewModelProviders.of(ac…ateViewModel::class.java)");
            return (o) viewModel;
        }
    }

    public o() {
        PublishSubject bmR = PublishSubject.bmR();
        kotlin.jvm.internal.i.e(bmR, "PublishSubject.create<AuthDone>()");
        this.eks = bmR;
    }

    public final LiveData<Object> aZx() {
        return this.ekr;
    }

    public final LiveData<AuthDone> aUU() {
        LiveData fromPublisher = LiveDataReactiveStreams.fromPublisher(this.eks.a(BackpressureStrategy.LATEST).i(200, TimeUnit.MILLISECONDS).c(com.iqoption.core.rx.i.akj()));
        kotlin.jvm.internal.i.e(fromPublisher, "LiveDataReactiveStreams.… .observeOn(ui)\n        )");
        return fromPublisher;
    }

    public final LiveData<Boolean> aZy() {
        MutableLiveData mutableLiveData = new MutableLiveData();
        boolean z = d.EH().ej("phone-reg") && d.EH().ej("new-api-reg");
        mutableLiveData.setValue(Boolean.valueOf(z));
        return mutableLiveData;
    }

    public final void aZz() {
        this.eks.onNext(AuthDone.LOGGED_IN);
    }

    public final void aZA() {
        this.eks.onNext(AuthDone.REGISTERED);
    }

    public final void aZB() {
        this.eks.onNext(AuthDone.ANONYM_REGISTERED);
    }

    public final void aZC() {
        this.eks.onNext(AuthDone.RECOVERY_PASSWORD);
    }

    public final void aZD() {
        this.eks.onNext(AuthDone.CHANGE_PASSWORD);
    }

    public final void aZE() {
        this.ekq.VJ();
    }
}
