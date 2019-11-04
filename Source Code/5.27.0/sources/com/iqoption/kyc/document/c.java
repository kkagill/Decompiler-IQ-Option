package com.iqoption.kyc.document;

import android.app.Application;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataReactiveStreams;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import com.google.android.gms.plus.PlusShare;
import com.google.common.base.Optional;
import com.iqoption.core.microservices.kyc.response.VerificationType;
import com.iqoption.core.microservices.kyc.response.step.KycStepType;
import com.jumio.MobileSDK;
import com.jumio.core.enums.JumioDataCenter;
import com.jumio.dv.DocumentVerificationSDK;
import com.jumio.nv.NetverifySDK;
import io.reactivex.p;
import io.reactivex.processors.PublishProcessor;
import io.reactivex.t;
import java.util.List;

@kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 O2\u00020\u0001:\u0001OB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J2\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*2\u0006\u0010+\u001a\u00020\u0011H\u0002J \u0010,\u001a\u00020-2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(H\u0002J\u001a\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0\u000b0\u00062\u0006\u00100\u001a\u000201J\u001c\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*04032\u0006\u00100\u001a\u000201H\u0002J\u0012\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000207060\u0006J\u0006\u00108\u001a\u000209J\u0006\u0010:\u001a\u00020\u001aJ\b\u0010;\u001a\u000209H\u0002J \u0010<\u001a\u0002092\u0006\u0010#\u001a\u00020$2\u0006\u00100\u001a\u0002012\b\u0010+\u001a\u0004\u0018\u00010\u0011J\u000e\u0010=\u001a\u0002092\u0006\u0010>\u001a\u00020?J/\u0010@\u001a\u0002092\u0006\u0010A\u001a\u00020\u00112\b\u0010B\u001a\u0004\u0018\u00010\u00112\u0006\u0010C\u001a\u00020\u001a2\b\u0010D\u001a\u0004\u0018\u00010E¢\u0006\u0002\u0010FJ\u0018\u0010G\u001a\u0002092\u0006\u0010H\u001a\u00020I2\b\u0010J\u001a\u0004\u0018\u00010/J\u000e\u0010K\u001a\u0002092\u0006\u0010L\u001a\u00020\u0011J\u000e\u0010M\u001a\u0002092\u0006\u0010N\u001a\u00020IR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001d\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\tR\u001a\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u000fX\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u00068F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\tR\u001c\u0010\u0013\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00150\u00150\u0014X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X.¢\u0006\u0002\n\u0000R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00068F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\tR\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\tR\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u001aX\u000e¢\u0006\u0002\n\u0000¨\u0006P"}, bng = {"Lcom/iqoption/kyc/document/KycDocumentViewModel;", "Lcom/iqoption/core/ui/viewmodel/DisposableAndroidViewModel;", "app", "Landroid/app/Application;", "(Landroid/app/Application;)V", "activityResult", "Landroidx/lifecycle/LiveData;", "Lcom/iqoption/core/ui/fragment/ActivityResult;", "getActivityResult", "()Landroidx/lifecycle/LiveData;", "docsSdk", "Lcom/iqoption/core/ui/Resource;", "Lcom/iqoption/kyc/document/DocsSdk;", "getDocsSdk", "docsSdkLiveData", "Lcom/iqoption/core/data/livedata/IQLiveEvent;", "errorMessages", "", "getErrorMessages", "refreshDocumentProcessor", "Lio/reactivex/processors/PublishProcessor;", "", "kotlin.jvm.PlatformType", "selectionViewModel", "Lcom/iqoption/kyc/KycSelectionViewModel;", "skipProgress", "", "getSkipProgress", "uploadProgress", "getUploadProgress", "uploadProgressLiveData", "Landroidx/lifecycle/MutableLiveData;", "uploadingDone", "createDocumentVerificationSDK", "Lcom/jumio/dv/DocumentVerificationSDK;", "activity", "Landroidx/fragment/app/FragmentActivity;", "config", "Lcom/iqoption/core/microservices/kyc/response/document/NetverifyConfigData;", "document", "Lcom/iqoption/core/microservices/kyc/response/VerificationDocument;", "country", "Lcom/iqoption/core/microservices/configuration/response/Country;", "poaType", "createNetverifySDK", "Lcom/jumio/nv/NetverifySDK;", "getDocuments", "Lcom/iqoption/core/microservices/kyc/response/document/KycDocument;", "type", "Lcom/iqoption/core/microservices/kyc/response/VerificationType;", "getMyCountry", "Lio/reactivex/Single;", "Lcom/google/common/base/Optional;", "getPoaTypes", "", "Lcom/iqoption/core/microservices/kyc/response/document/PoaDocumentType;", "goToNextStep", "", "isRegulated", "onUploadingDone", "requestJumioSDK", "setCurrentStep", "step", "Lcom/iqoption/core/microservices/kyc/response/step/KycCustomerStep;", "setDocumentsUploaded", "merchantScanReference", "jumioScanReference", "isUploadCanceled", "errorCode", "", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;)V", "setProgress", "kycStepType", "Lcom/iqoption/core/microservices/kyc/response/step/KycStepType;", "existedDocument", "setTitle", "title", "skipStep", "stepType", "Companion", "kyc_release"})
/* compiled from: KycDocumentViewModel.kt */
public final class c extends com.iqoption.core.ui.f.c {
    public static final a dxm = new a();
    private com.iqoption.kyc.j drN;
    private boolean dxg;
    private final PublishProcessor<Object> dxh;
    private final com.iqoption.core.data.b.b<com.iqoption.core.ui.d<a>> dxi = new com.iqoption.core.data.b.b();
    private final LiveData<com.iqoption.core.ui.d<a>> dxj = this.dxi;
    private final MutableLiveData<Boolean> dxk = new MutableLiveData();
    private final LiveData<Boolean> dxl = this.dxk;

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, bng = {"Lcom/iqoption/kyc/document/KycDocumentViewModel$Companion;", "", "()V", "get", "Lcom/iqoption/kyc/document/KycDocumentViewModel;", "fragment", "Landroidx/fragment/app/Fragment;", "kyc_release"})
    /* compiled from: KycDocumentViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final c ap(Fragment fragment) {
            kotlin.jvm.internal.i.f(fragment, "fragment");
            ViewModel viewModel = ViewModelProviders.of(fragment).get(c.class);
            kotlin.jvm.internal.i.e(viewModel, "ViewModelProviders.of(fr…entViewModel::class.java)");
            c cVar = (c) viewModel;
            cVar.drN = com.iqoption.kyc.j.dsW.am(fragment);
            return cVar;
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "Lio/reactivex/Single;", "Lcom/iqoption/core/microservices/kyc/response/document/KycDocumentsResult;", "it", "", "apply"})
    /* compiled from: KycDocumentViewModel.kt */
    static final class b<T, R> implements io.reactivex.b.g<T, t<? extends R>> {
        public static final b dxn = new b();

        b() {
        }

        /* renamed from: bA */
        public final p<com.iqoption.core.microservices.kyc.response.document.e> apply(Object obj) {
            kotlin.jvm.internal.i.f(obj, "it");
            return com.iqoption.core.microservices.kyc.a.aet();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "Lcom/iqoption/core/ui/Resource;", "Lcom/iqoption/core/microservices/kyc/response/document/KycDocument;", "it", "Lcom/iqoption/core/microservices/kyc/response/document/KycDocumentsResult;", "apply"})
    /* compiled from: KycDocumentViewModel.kt */
    static final class c<T, R> implements io.reactivex.b.g<T, R> {
        final /* synthetic */ VerificationType bdO;

        c(VerificationType verificationType) {
            this.bdO = verificationType;
        }

        /* renamed from: b */
        public final com.iqoption.core.ui.d<com.iqoption.core.microservices.kyc.response.document.b> apply(com.iqoption.core.microservices.kyc.response.document.e eVar) {
            kotlin.jvm.internal.i.f(eVar, "it");
            return com.iqoption.core.ui.d.bHb.bS(eVar.h(this.bdO));
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "Lcom/iqoption/core/ui/Resource;", "Lcom/iqoption/core/microservices/kyc/response/document/KycDocument;", "it", "", "apply"})
    /* compiled from: KycDocumentViewModel.kt */
    static final class d<T, R> implements io.reactivex.b.g<Throwable, com.iqoption.core.ui.d<com.iqoption.core.microservices.kyc.response.document.b>> {
        public static final d dxo = new d();

        d() {
        }

        /* renamed from: w */
        public final com.iqoption.core.ui.d<com.iqoption.core.microservices.kyc.response.document.b> apply(Throwable th) {
            kotlin.jvm.internal.i.f(th, "it");
            return com.iqoption.core.ui.d.a.a(com.iqoption.core.ui.d.bHb, th, null, null, 6, null);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/ui/Resource;", "Lcom/iqoption/core/microservices/kyc/response/document/KycDocument;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: KycDocumentViewModel.kt */
    static final class e<T> implements io.reactivex.b.f<com.iqoption.core.ui.d<com.iqoption.core.microservices.kyc.response.document.b>> {
        final /* synthetic */ c dxp;

        e(c cVar) {
            this.dxp = cVar;
        }

        /* renamed from: b */
        public final void accept(com.iqoption.core.ui.d<com.iqoption.core.microservices.kyc.response.document.b> dVar) {
            if (this.dxp.dxg) {
                this.dxp.dxg = false;
                this.dxp.dxk.postValue(Boolean.valueOf(false));
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0002\b\b"}, bng = {"<anonymous>", "Lcom/google/common/base/Optional;", "Lcom/iqoption/core/microservices/configuration/response/Country;", "kotlin.jvm.PlatformType", "countries", "", "countryCode", "Lcom/iqoption/core/microservices/core/response/MyCountryResponse;", "apply"})
    /* compiled from: KycDocumentViewModel.kt */
    static final class f<T1, T2, R> implements io.reactivex.b.c<List<? extends com.iqoption.core.microservices.configuration.a.c>, com.iqoption.core.microservices.core.response.f, Optional<com.iqoption.core.microservices.configuration.a.c>> {
        public static final f dxq = new f();

        f() {
        }

        /* renamed from: b */
        public final Optional<com.iqoption.core.microservices.configuration.a.c> apply(List<com.iqoption.core.microservices.configuration.a.c> list, com.iqoption.core.microservices.core.response.f fVar) {
            kotlin.jvm.internal.i.f(list, "countries");
            kotlin.jvm.internal.i.f(fVar, "countryCode");
            for (Object next : list) {
                if (kotlin.jvm.internal.i.y(((com.iqoption.core.microservices.configuration.a.c) next).acN(), fVar.adh())) {
                    break;
                }
            }
            Object next2 = null;
            return Optional.an(next2);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "Lcom/google/common/base/Optional;", "Lcom/iqoption/core/microservices/configuration/response/Country;", "kotlin.jvm.PlatformType", "it", "", "apply"})
    /* compiled from: KycDocumentViewModel.kt */
    static final class g<T, R> implements io.reactivex.b.g<Throwable, Optional<com.iqoption.core.microservices.configuration.a.c>> {
        public static final g dxr = new g();

        g() {
        }

        /* renamed from: x */
        public final Optional<com.iqoption.core.microservices.configuration.a.c> apply(Throwable th) {
            kotlin.jvm.internal.i.f(th, "it");
            return Optional.pW();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "Lcom/iqoption/core/microservices/kyc/response/document/PoaDocumentType;", "it", "Lcom/iqoption/core/microservices/kyc/response/document/PoaDocumentTypesResult;", "apply"})
    /* compiled from: KycDocumentViewModel.kt */
    static final class h<T, R> implements io.reactivex.b.g<T, R> {
        public static final h dxs = new h();

        h() {
        }

        /* renamed from: a */
        public final List<com.iqoption.core.microservices.kyc.response.document.i> apply(com.iqoption.core.microservices.kyc.response.document.j jVar) {
            kotlin.jvm.internal.i.f(jVar, "it");
            return jVar.getTypes();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "Lcom/iqoption/core/microservices/kyc/response/document/PoaDocumentType;", "it", "", "apply"})
    /* compiled from: KycDocumentViewModel.kt */
    static final class i<T, R> implements io.reactivex.b.g<Throwable, List<? extends com.iqoption.core.microservices.kyc.response.document.i>> {
        public static final i dxt = new i();

        i() {
        }

        /* renamed from: r */
        public final List<com.iqoption.core.microservices.kyc.response.document.i> apply(Throwable th) {
            kotlin.jvm.internal.i.f(th, "it");
            return m.emptyList();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\n¢\u0006\u0002\b\t"}, bng = {"<anonymous>", "Lcom/iqoption/kyc/document/DocsSdk;", "config", "Lcom/iqoption/core/microservices/kyc/response/document/NetverifyConfigData;", "document", "Lcom/iqoption/core/microservices/kyc/response/VerificationDocument;", "country", "Lcom/google/common/base/Optional;", "Lcom/iqoption/core/microservices/configuration/response/Country;", "apply"})
    /* compiled from: KycDocumentViewModel.kt */
    static final class j<T1, T2, T3, R> implements io.reactivex.b.h<com.iqoption.core.microservices.kyc.response.document.g, com.iqoption.core.microservices.kyc.response.i, Optional<com.iqoption.core.microservices.configuration.a.c>, a> {
        final /* synthetic */ VerificationType bdO;
        final /* synthetic */ c dxp;
        final /* synthetic */ FragmentActivity dxu;
        final /* synthetic */ String dxv;

        j(c cVar, VerificationType verificationType, FragmentActivity fragmentActivity, String str) {
            this.dxp = cVar;
            this.bdO = verificationType;
            this.dxu = fragmentActivity;
            this.dxv = str;
        }

        public final a a(com.iqoption.core.microservices.kyc.response.document.g gVar, com.iqoption.core.microservices.kyc.response.i iVar, Optional<com.iqoption.core.microservices.configuration.a.c> optional) {
            MobileSDK a;
            kotlin.jvm.internal.i.f(gVar, "config");
            kotlin.jvm.internal.i.f(iVar, "document");
            kotlin.jvm.internal.i.f(optional, "country");
            if (this.bdO == VerificationType.POI) {
                a = this.dxp.a(this.dxu, gVar, iVar);
            } else {
                c cVar = this.dxp;
                FragmentActivity fragmentActivity = this.dxu;
                com.iqoption.core.microservices.configuration.a.c cVar2 = (com.iqoption.core.microservices.configuration.a.c) optional.pN();
                String str = this.dxv;
                if (str == null) {
                    kotlin.jvm.internal.i.bnJ();
                }
                a = cVar.a(fragmentActivity, gVar, iVar, cVar2, str);
            }
            return new a(a, gVar, iVar);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/kyc/document/DocsSdk;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: KycDocumentViewModel.kt */
    static final class k<T> implements io.reactivex.b.f<a> {
        final /* synthetic */ c dxp;

        k(c cVar) {
            this.dxp = cVar;
        }

        /* renamed from: a */
        public final void accept(a aVar) {
            this.dxp.dxi.postValue(com.iqoption.core.ui.d.bHb.bS(aVar));
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: KycDocumentViewModel.kt */
    static final class l<T> implements io.reactivex.b.f<Throwable> {
        final /* synthetic */ c dxp;

        l(c cVar) {
            this.dxp = cVar;
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
            this.dxp.dxk.postValue(Boolean.valueOf(false));
            this.dxp.dxi.postValue(com.iqoption.core.ui.d.a.a(com.iqoption.core.ui.d.bHb, th, null, null, 6, null));
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "Lcom/iqoption/core/microservices/kyc/response/document/NetverifyConfigData;", "it", "Lcom/iqoption/core/microservices/kyc/response/document/NetverifyConfig;", "apply"})
    /* compiled from: KycDocumentViewModel.kt */
    static final class m<T, R> implements io.reactivex.b.g<T, R> {
        public static final m dxw = new m();

        m() {
        }

        /* renamed from: b */
        public final com.iqoption.core.microservices.kyc.response.document.g apply(com.iqoption.core.microservices.kyc.response.document.f fVar) {
            kotlin.jvm.internal.i.f(fVar, "it");
            com.iqoption.core.microservices.kyc.response.document.g a = com.iqoption.core.microservices.kyc.response.document.h.a(fVar);
            if (a == null) {
                kotlin.jvm.internal.i.bnJ();
            }
            return a;
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/microservices/kyc/response/document/DocumentUploadedResult;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: KycDocumentViewModel.kt */
    static final class n<T> implements io.reactivex.b.f<com.iqoption.core.microservices.kyc.response.document.a> {
        final /* synthetic */ c dxp;

        n(c cVar) {
            this.dxp = cVar;
        }

        /* renamed from: b */
        public final void accept(com.iqoption.core.microservices.kyc.response.document.a aVar) {
            this.dxp.aKT();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: KycDocumentViewModel.kt */
    static final class o<T> implements io.reactivex.b.f<Throwable> {
        final /* synthetic */ c dxp;

        o(c cVar) {
            this.dxp = cVar;
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
            this.dxp.aKT();
        }
    }

    public c(Application application) {
        kotlin.jvm.internal.i.f(application, "app");
        super(application);
        PublishProcessor bmK = PublishProcessor.bmK();
        kotlin.jvm.internal.i.e(bmK, "PublishProcessor.create<Any>()");
        this.dxh = bmK;
    }

    public final LiveData<com.iqoption.core.ui.d<a>> aKP() {
        return this.dxj;
    }

    public final LiveData<Boolean> aKQ() {
        return this.dxl;
    }

    public final LiveData<Boolean> aJp() {
        com.iqoption.kyc.j jVar = this.drN;
        if (jVar == null) {
            kotlin.jvm.internal.i.lG("selectionViewModel");
        }
        return jVar.aJp();
    }

    public final LiveData<String> aJv() {
        com.iqoption.kyc.j jVar = this.drN;
        if (jVar == null) {
            kotlin.jvm.internal.i.lG("selectionViewModel");
        }
        return jVar.aJv();
    }

    public final LiveData<com.iqoption.core.ui.fragment.a> aJu() {
        com.iqoption.kyc.j jVar = this.drN;
        if (jVar == null) {
            kotlin.jvm.internal.i.lG("selectionViewModel");
        }
        return jVar.aJu();
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x002c  */
    public final void a(com.iqoption.core.microservices.kyc.response.step.KycStepType r3, com.iqoption.core.microservices.kyc.response.document.b r4) {
        /*
        r2 = this;
        r0 = "kycStepType";
        kotlin.jvm.internal.i.f(r3, r0);
        if (r4 == 0) goto L_0x000c;
    L_0x0007:
        r4 = r4.aeN();
        goto L_0x000d;
    L_0x000c:
        r4 = 0;
    L_0x000d:
        if (r4 != 0) goto L_0x0010;
    L_0x000f:
        goto L_0x0021;
    L_0x0010:
        r0 = com.iqoption.kyc.document.d.aob;
        r4 = r4.ordinal();
        r4 = r0[r4];
        r0 = 1;
        if (r4 == r0) goto L_0x0026;
    L_0x001b:
        r0 = 2;
        if (r4 == r0) goto L_0x0023;
    L_0x001e:
        r0 = 3;
        if (r4 == r0) goto L_0x0023;
    L_0x0021:
        r4 = 0;
        goto L_0x0028;
    L_0x0023:
        r4 = 50;
        goto L_0x0028;
    L_0x0026:
        r4 = 100;
    L_0x0028:
        r0 = r2.drN;
        if (r0 != 0) goto L_0x0031;
    L_0x002c:
        r1 = "selectionViewModel";
        kotlin.jvm.internal.i.lG(r1);
    L_0x0031:
        r0.a(r3, r4);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.kyc.document.c.a(com.iqoption.core.microservices.kyc.response.step.KycStepType, com.iqoption.core.microservices.kyc.response.document.b):void");
    }

    public final void b(com.iqoption.core.microservices.kyc.response.step.c cVar) {
        kotlin.jvm.internal.i.f(cVar, "step");
        com.iqoption.kyc.j jVar = this.drN;
        if (jVar == null) {
            kotlin.jvm.internal.i.lG("selectionViewModel");
        }
        jVar.b(cVar);
    }

    public final void setTitle(String str) {
        kotlin.jvm.internal.i.f(str, PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_TITLE);
        com.iqoption.kyc.j jVar = this.drN;
        if (jVar == null) {
            kotlin.jvm.internal.i.lG("selectionViewModel");
        }
        jVar.setTitle(str);
    }

    public final LiveData<com.iqoption.core.ui.d<com.iqoption.core.microservices.kyc.response.document.b>> k(VerificationType verificationType) {
        kotlin.jvm.internal.i.f(verificationType, "type");
        LiveData fromPublisher = LiveDataReactiveStreams.fromPublisher(io.reactivex.e.a((org.a.b) io.reactivex.e.cD(""), (org.a.b) this.dxh, (org.a.b) com.iqoption.core.microservices.kyc.c.bur.aeC()).l(b.dxn).g(new c(verificationType)).h(d.dxo).d(com.iqoption.core.rx.i.aki()).c(com.iqoption.core.rx.i.akj()).c((io.reactivex.b.f) new e(this)));
        kotlin.jvm.internal.i.e(fromPublisher, "LiveDataReactiveStreams.…              }\n        )");
        return fromPublisher;
    }

    public final LiveData<List<com.iqoption.core.microservices.kyc.response.document.i>> aKR() {
        LiveData fromPublisher = LiveDataReactiveStreams.fromPublisher(com.iqoption.core.microservices.kyc.a.aeu().h(com.iqoption.core.rx.i.aki()).g(com.iqoption.core.rx.i.akj()).bkO().g(h.dxs).h(i.dxt));
        kotlin.jvm.internal.i.e(fromPublisher, "LiveDataReactiveStreams.…{ emptyList() }\n        )");
        return fromPublisher;
    }

    public final void g(KycStepType kycStepType) {
        kotlin.jvm.internal.i.f(kycStepType, "stepType");
        com.iqoption.kyc.j jVar = this.drN;
        if (jVar == null) {
            kotlin.jvm.internal.i.lG("selectionViewModel");
        }
        jVar.g(kycStepType);
    }

    public final void aKS() {
        com.iqoption.kyc.j jVar = this.drN;
        if (jVar == null) {
            kotlin.jvm.internal.i.lG("selectionViewModel");
        }
        jVar.en(false);
    }

    public final void a(FragmentActivity fragmentActivity, VerificationType verificationType, String str) {
        kotlin.jvm.internal.i.f(fragmentActivity, "activity");
        kotlin.jvm.internal.i.f(verificationType, "type");
        if (verificationType == VerificationType.POA && str == null) {
            throw new IllegalArgumentException("poaType must not be null");
        }
        this.dxk.postValue(Boolean.valueOf(true));
        p g = com.iqoption.core.microservices.kyc.a.aev().t(m.dxw).h(com.iqoption.core.rx.i.aki()).g(com.iqoption.core.rx.i.akj());
        kotlin.jvm.internal.i.e(g, "KycDocumentRequests.getG…           .observeOn(ui)");
        p g2 = com.iqoption.core.microservices.kyc.a.b(verificationType).h(com.iqoption.core.rx.i.aki()).g(com.iqoption.core.rx.i.akj());
        kotlin.jvm.internal.i.e(g2, "KycDocumentRequests.crea…           .observeOn(ui)");
        p g3 = l(verificationType).h(com.iqoption.core.rx.i.aki()).g(com.iqoption.core.rx.i.akj());
        kotlin.jvm.internal.i.e(g3, "getMyCountry(type)\n     …           .observeOn(ui)");
        io.reactivex.disposables.b a = p.a((t) g, (t) g2, (t) g3, (io.reactivex.b.h) new j(this, verificationType, fragmentActivity, str)).a((io.reactivex.b.f) new k(this), (io.reactivex.b.f) new l(this));
        kotlin.jvm.internal.i.e(a, "Single.zip(configSingle,…      }\n                )");
        b(a);
    }

    private final NetverifySDK a(FragmentActivity fragmentActivity, com.iqoption.core.microservices.kyc.response.document.g gVar, com.iqoption.core.microservices.kyc.response.i iVar) {
        NetverifySDK create = NetverifySDK.create(fragmentActivity, gVar.getToken(), gVar.abd(), JumioDataCenter.EU);
        create.setRequireVerification(true);
        create.setMerchantScanReference(iVar.getMerchantScanReference());
        create.setCustomerId(String.valueOf(com.iqoption.core.d.EA().getUserId()));
        create.setCallbackUrl(gVar.aeV());
        kotlin.jvm.internal.i.e(create, "sdk");
        return create;
    }

    private final DocumentVerificationSDK a(FragmentActivity fragmentActivity, com.iqoption.core.microservices.kyc.response.document.g gVar, com.iqoption.core.microservices.kyc.response.i iVar, com.iqoption.core.microservices.configuration.a.c cVar, String str) {
        DocumentVerificationSDK create = DocumentVerificationSDK.create(fragmentActivity, gVar.getToken(), gVar.abd(), JumioDataCenter.EU);
        create.setType(str);
        if (kotlin.jvm.internal.i.y(str, "CUSTOM")) {
            create.setCustomDocumentCode("OTHER");
        }
        create.setCountry(cVar != null ? cVar.acO() : null);
        create.setMerchantScanReference(iVar.getMerchantScanReference());
        create.setCustomerId(String.valueOf(com.iqoption.core.d.EA().getUserId()));
        create.setCallbackUrl(gVar.aeV());
        kotlin.jvm.internal.i.e(create, "sdk");
        return create;
    }

    public final void d(String str, String str2, boolean z, Integer num) {
        kotlin.jvm.internal.i.f(str, "merchantScanReference");
        io.reactivex.disposables.b a = com.iqoption.core.microservices.kyc.a.a(str, str2, z, num).h(com.iqoption.core.rx.i.aki()).g(com.iqoption.core.rx.i.akj()).a((io.reactivex.b.f) new n(this), (io.reactivex.b.f) new o(this));
        kotlin.jvm.internal.i.e(a, "KycDocumentRequests.setD…      }\n                )");
        b(a);
    }

    private final void aKT() {
        this.dxg = true;
        this.dxh.onNext("");
    }

    private final p<Optional<com.iqoption.core.microservices.configuration.a.c>> l(VerificationType verificationType) {
        p cI;
        if (verificationType == VerificationType.POI) {
            cI = p.cI(Optional.pW());
            kotlin.jvm.internal.i.e(cI, "Single.just(Optional.absent())");
            return cI;
        }
        cI = p.a(com.iqoption.core.data.repository.c.bdy.WQ().bkV(), com.iqoption.core.data.repository.b.a(com.iqoption.core.data.repository.b.bdv, null, 1, null), f.dxq).u(g.dxr);
        kotlin.jvm.internal.i.e(cI, "Single.zip<List<Country>…urn { Optional.absent() }");
        return cI;
    }

    public final boolean Er() {
        com.iqoption.kyc.j jVar = this.drN;
        if (jVar == null) {
            kotlin.jvm.internal.i.lG("selectionViewModel");
        }
        return jVar.Er();
    }
}
