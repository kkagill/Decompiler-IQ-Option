package com.iqoption.kyc.phone.a;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import com.google.i18n.phonenumbers.Phonenumber.PhoneNumber;
import com.iqoption.core.ui.Status;
import com.iqoption.core.ui.f.d;
import com.iqoption.kyc.j;
import io.reactivex.b.f;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\fX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, bng = {"Lcom/iqoption/kyc/phone/input/KycPhoneInputViewModel;", "Lcom/iqoption/core/ui/viewmodel/DisposableViewModel;", "()V", "selectionViewModel", "Lcom/iqoption/kyc/KycSelectionViewModel;", "sendConfirmationResult", "Landroidx/lifecycle/LiveData;", "Lcom/iqoption/core/ui/Resource;", "Lcom/iqoption/core/microservices/ResponseStatus;", "getSendConfirmationResult", "()Landroidx/lifecycle/LiveData;", "sendConfirmationResultLiveData", "Lcom/iqoption/core/data/livedata/IQLiveEvent;", "setPhoneAndSendConfirmation", "", "newPhone", "Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;", "Companion", "kyc_release"})
/* compiled from: KycPhoneInputViewModel.kt */
public final class b extends d {
    public static final a dBa = new a();
    private final com.iqoption.core.data.b.b<com.iqoption.core.ui.d<com.iqoption.core.microservices.c>> dAY = new com.iqoption.core.data.b.b();
    private final LiveData<com.iqoption.core.ui.d<com.iqoption.core.microservices.c>> dAZ = this.dAY;
    private j drN;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, bng = {"Lcom/iqoption/kyc/phone/input/KycPhoneInputViewModel$Companion;", "", "()V", "get", "Lcom/iqoption/kyc/phone/input/KycPhoneInputViewModel;", "fragment", "Landroidx/fragment/app/Fragment;", "kyc_release"})
    /* compiled from: KycPhoneInputViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final b aB(Fragment fragment) {
            kotlin.jvm.internal.i.f(fragment, "fragment");
            ViewModel viewModel = ViewModelProviders.of(fragment).get(b.class);
            kotlin.jvm.internal.i.e(viewModel, "ViewModelProviders.of(fr…putViewModel::class.java)");
            b bVar = (b) viewModel;
            bVar.drN = j.dsW.am(fragment);
            return bVar;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "result", "Lcom/iqoption/core/microservices/ResponseStatus;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: KycPhoneInputViewModel.kt */
    static final class b<T> implements f<com.iqoption.core.microservices.c> {
        final /* synthetic */ b dBb;

        b(b bVar) {
            this.dBb = bVar;
        }

        /* renamed from: c */
        public final void accept(com.iqoption.core.microservices.c cVar) {
            this.dBb.dAY.postValue(new com.iqoption.core.ui.d(Status.SUCCESS, cVar, null, null, 12, null));
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: KycPhoneInputViewModel.kt */
    static final class c<T> implements f<Throwable> {
        final /* synthetic */ b dBb;

        c(b bVar) {
            this.dBb = bVar;
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
            this.dBb.dAY.postValue(new com.iqoption.core.ui.d(Status.ERROR, null, null, th, 6, null));
        }
    }

    public final LiveData<com.iqoption.core.ui.d<com.iqoption.core.microservices.c>> aLN() {
        return this.dAZ;
    }

    public final void f(PhoneNumber phoneNumber) {
        io.reactivex.disposables.b a = com.iqoption.core.e.c.bEr.e(phoneNumber).h(com.iqoption.core.rx.i.aki()).g(com.iqoption.core.rx.i.akj()).a((f) new b(this), (f) new c(this));
        kotlin.jvm.internal.i.e(a, "PhoneManager.setPhoneAnd…      }\n                )");
        b(a);
    }
}
