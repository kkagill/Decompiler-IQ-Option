package com.iqoption.kyc.document;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.GravityCompat;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.ItemTouchHelper.Callback;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.iqoption.core.microservices.kyc.response.VerificationType;
import com.iqoption.core.microservices.kyc.response.document.DocumentStatus;
import com.iqoption.core.microservices.kyc.response.step.KycStepState;
import com.iqoption.core.microservices.kyc.response.step.KycStepType;
import com.iqoption.kyc.b.bo;
import com.iqoption.kyc.b.bs;
import com.iqoption.kyc.document.jumio.JumioException;
import com.jumio.MobileSDK;
import com.jumio.analytics.MobileEvents;
import com.jumio.core.exceptions.MissingPermissionException;
import com.jumio.core.exceptions.PlatformNotSupportedException;
import com.jumio.dv.DocumentVerificationSDK;
import com.jumio.nv.NetverifySDK;
import java.util.HashMap;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.PropertyReference1Impl;

@kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 b2\u00020\u0001:\u0001bB\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0010H\u0002J\u0012\u0010%\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0010H\u0002J\u0012\u0010&\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0010H\u0002J\u0012\u0010'\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0010H\u0002J\u0012\u0010(\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0010H\u0002J\u0012\u0010)\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0010H\u0002J\u0012\u0010*\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0010H\u0002J\u0012\u0010+\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0010H\u0002J\u0018\u0010,\u001a\u00020#2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200H\u0002J\u0016\u00101\u001a\u00020#2\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u001803H\u0002J\b\u00104\u001a\u00020\u0014H\u0016J\u0018\u00105\u001a\u00020#2\u0006\u00106\u001a\u0002002\u0006\u00107\u001a\u000208H\u0002J\u0018\u00109\u001a\u00020#2\u0006\u00106\u001a\u0002002\u0006\u00107\u001a\u000208H\u0002J\u0012\u0010:\u001a\u00020\b2\b\u0010$\u001a\u0004\u0018\u00010\u0010H\u0002J\u0012\u0010;\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0010H\u0002J\b\u0010<\u001a\u00020#H\u0002J\u0012\u0010=\u001a\u00020\b2\b\u0010>\u001a\u0004\u0018\u00010?H\u0014J\u0012\u0010@\u001a\u00020#2\b\u0010A\u001a\u0004\u0018\u00010BH\u0016J&\u0010C\u001a\u0004\u0018\u00010D2\u0006\u0010E\u001a\u00020F2\b\u0010G\u001a\u0004\u0018\u00010H2\b\u0010A\u001a\u0004\u0018\u00010BH\u0016J+\u0010I\u001a\u00020#2\u0006\u0010/\u001a\u0002002\f\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00140K2\u0006\u0010L\u001a\u00020MH\u0016¢\u0006\u0002\u0010NJ\u0010\u0010O\u001a\u00020#2\u0006\u0010P\u001a\u00020BH\u0016J\u001a\u0010Q\u001a\u00020#2\u0006\u0010R\u001a\u00020D2\b\u0010A\u001a\u0004\u0018\u00010BH\u0016J\b\u0010S\u001a\u00020#H\u0002J\b\u0010T\u001a\u00020#H\u0002J\u0010\u0010U\u001a\u00020#2\u0006\u0010V\u001a\u00020\bH\u0002J\u0012\u0010W\u001a\u00020\b2\b\u0010$\u001a\u0004\u0018\u00010\u0010H\u0002J\b\u0010X\u001a\u00020\bH\u0014J\u0010\u0010Y\u001a\u00020#2\u0006\u0010Z\u001a\u00020\bH\u0002J\u0018\u0010[\u001a\u00020#2\u0006\u0010\\\u001a\u00020\u00122\u0006\u0010Z\u001a\u00020\bH\u0002J\u0010\u0010[\u001a\u00020#2\u0006\u0010Z\u001a\u00020\bH\u0002J\u0010\u0010]\u001a\u00020#2\u0006\u0010-\u001a\u00020.H\u0002J\b\u0010^\u001a\u00020#H\u0002J\b\u0010_\u001a\u00020`H\u0002J\b\u0010a\u001a\u00020#H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bXD¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\tR\u001b\u0010\n\u001a\u00020\b8BX\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u000e\u0010\u000e\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u00020\u00148VX\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\u00020\u0014XD¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0002¢\u0006\f\n\u0004\b\u001f\u0010\r\u001a\u0004\b\u001d\u0010\u001eR\u000e\u0010 \u001a\u00020!X.¢\u0006\u0002\n\u0000¨\u0006c"}, bng = {"Lcom/iqoption/kyc/document/KycDocumentFragment;", "Lcom/iqoption/kyc/BaseKycStepFragment;", "()V", "binding", "Lcom/iqoption/kyc/databinding/FragmentKycDocumentBinding;", "docsSdk", "Lcom/iqoption/kyc/document/DocsSdk;", "isContinuePressedAnalytics", "", "()Z", "performLoading", "getPerformLoading", "performLoading$delegate", "Lkotlin/Lazy;", "poaUploaded", "prevDocument", "Lcom/iqoption/core/microservices/kyc/response/document/KycDocument;", "prevSdkLoading", "Lcom/iqoption/kyc/document/SdkLoadingType;", "screenName", "", "getScreenName", "()Ljava/lang/String;", "selectedPoaType", "Lcom/iqoption/core/microservices/kyc/response/document/PoaDocumentType;", "stageName", "getStageName", "step", "Lcom/iqoption/core/microservices/kyc/response/step/KycCustomerStep;", "getStep", "()Lcom/iqoption/core/microservices/kyc/response/step/KycCustomerStep;", "step$delegate", "viewModel", "Lcom/iqoption/kyc/document/KycDocumentViewModel;", "bindButton", "", "existedDocument", "bindComment", "bindData", "bindDescription", "bindPoaIcon", "bindPoiIcon", "bindSubtitle", "bindTitle", "checkJumioPermissionsAndStart", "sdk", "Lcom/jumio/MobileSDK;", "requestCode", "", "fillPoaTypes", "types", "", "getContentTransitionName", "handlePoaResult", "resultCode", "data", "Landroid/content/Intent;", "handlePoiResult", "isExpired", "loadPoaTypesIfNeeded", "observeData", "onBackPressed", "childFragmentManager", "Landroidx/fragment/app/FragmentManager;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onRequestPermissionsResult", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onSaveInstanceState", "outState", "onViewCreated", "view", "openPerformLoadingPoa", "requestSdk", "setSkipProgress", "progress", "shouldShowLoadMoreButton", "showBottomBar", "showLoading", "loading", "showSdkLoading", "loadingType", "startJumioSdk", "syncSdkLoadingType", "type", "Lcom/iqoption/core/microservices/kyc/response/VerificationType;", "updateSelectedPoaTypeUi", "Companion", "kyc_release"})
/* compiled from: KycDocumentFragment.kt */
public final class b extends com.iqoption.kyc.b {
    private static final String TAG;
    static final /* synthetic */ kotlin.reflect.j[] anY = new kotlin.reflect.j[]{kotlin.jvm.internal.k.a(new PropertyReference1Impl(kotlin.jvm.internal.k.G(b.class), "step", "getStep()Lcom/iqoption/core/microservices/kyc/response/step/KycCustomerStep;")), kotlin.jvm.internal.k.a(new PropertyReference1Impl(kotlin.jvm.internal.k.G(b.class), "performLoading", "getPerformLoading()Z"))};
    public static final a dxc = new a();
    private HashMap apm;
    private final String dtM = "IdentityProving";
    private final kotlin.d dwS = g.c(new KycDocumentFragment$step$2(this));
    private final kotlin.d dwT = g.c(new KycDocumentFragment$performLoading$2(this));
    private com.iqoption.kyc.b.i dwU;
    private c dwV;
    private a dwW;
    private com.iqoption.core.microservices.kyc.response.document.b dwX;
    private com.iqoption.core.microservices.kyc.response.document.i dwY;
    private SdkLoadingType dwZ;
    private boolean dxa;
    private final boolean dxb = true;

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ!\u0010\u0012\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0002\u0010\u0013R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, bng = {"Lcom/iqoption/kyc/document/KycDocumentFragment$Companion;", "", "()V", "ARG_PERFORM_LOADING", "", "ARG_STEP", "NO_ERROR", "", "PERMISSION_REQUEST_CODE_NETVERIFY", "STATE_CHECKED_TYPE", "TAG", "navigationEntryPoa", "Lcom/iqoption/core/ui/navigation/NavigatorEntry;", "step", "Lcom/iqoption/core/microservices/kyc/response/step/KycCustomerStep;", "performLoading", "", "navigationEntryPoi", "tag", "(Lcom/iqoption/core/microservices/kyc/response/step/KycCustomerStep;Ljava/lang/Boolean;)Ljava/lang/String;", "kyc_release"})
    /* compiled from: KycDocumentFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final com.iqoption.core.ui.d.c c(com.iqoption.core.microservices.kyc.response.step.c cVar) {
            com.iqoption.core.microservices.kyc.response.step.c cVar2 = cVar;
            kotlin.jvm.internal.i.f(cVar2, "step");
            Bundle bundle = new Bundle();
            bundle.putParcelable("ARG_STEP", cVar2);
            return new com.iqoption.core.ui.d.c(a(this, cVar2, null, 2, null), b.class, bundle, 0, 0, 0, 0, null, null, null, null, 2040, null);
        }

        public final com.iqoption.core.ui.d.c b(com.iqoption.core.microservices.kyc.response.step.c cVar, boolean z) {
            com.iqoption.core.microservices.kyc.response.step.c cVar2 = cVar;
            kotlin.jvm.internal.i.f(cVar2, "step");
            Bundle bundle = new Bundle();
            bundle.putParcelable("ARG_STEP", cVar2);
            bundle.putBoolean("ARG_PERFORM_LOADING", z);
            return new com.iqoption.core.ui.d.c(a(cVar2, Boolean.valueOf(z)), b.class, bundle, 0, 0, 0, 0, null, null, null, null, 2040, null);
        }

        private final String a(com.iqoption.core.microservices.kyc.response.step.c cVar, Boolean bool) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(b.TAG);
            stringBuilder.append(':');
            stringBuilder.append(cVar.afH());
            stringBuilder.append(":load_another=");
            stringBuilder.append(bool);
            return stringBuilder.toString();
        }

        static /* synthetic */ String a(a aVar, com.iqoption.core.microservices.kyc.response.step.c cVar, Boolean bool, int i, Object obj) {
            if ((i & 2) != 0) {
                bool = (Boolean) null;
            }
            return aVar.a(cVar, bool);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class b extends com.iqoption.core.ext.g {
        final /* synthetic */ com.iqoption.core.microservices.kyc.response.document.b dxd;
        final /* synthetic */ b this$0;

        public b(b bVar, com.iqoption.core.microservices.kyc.response.document.b bVar2) {
            this.this$0 = bVar;
            this.dxd = bVar2;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            if (this.this$0.j(this.dxd)) {
                b.a(this.this$0).aKS();
            } else if (this.this$0.aKM() != VerificationType.POA || this.this$0.aKI()) {
                this.this$0.aKN();
                com.iqoption.kyc.a.a.dtL.q(this.this$0.aKn(), this.this$0.aKo(), b.a(this.this$0).Er());
            } else {
                this.this$0.aKJ();
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class c extends com.iqoption.core.ext.g {
        final /* synthetic */ b this$0;

        public c(b bVar) {
            this.this$0 = bVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            if (this.this$0.aKM() == VerificationType.POA) {
                this.this$0.aKJ();
            } else {
                this.this$0.aKN();
            }
            com.iqoption.kyc.a.a.dtL.i("kyc_upload-more", this.this$0.aKn(), this.this$0.aKo(), b.a(this.this$0).Er());
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class d extends com.iqoption.core.ext.g {
        final /* synthetic */ b this$0;

        public d(b bVar) {
            this.this$0 = bVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            com.iqoption.core.ui.d.c m = com.iqoption.kyc.document.history.c.dxB.m(this.this$0.aKM());
            com.iqoption.kyc.navigator.a.dAF.ax(this.this$0).beginTransaction().replace(com.iqoption.kyc.navigator.a.dAF.aLI(), m.bh(com.iqoption.core.ext.a.q(this.this$0)), m.getName()).addToBackStack(m.getName()).commitAllowingStateLoss();
            com.iqoption.kyc.a.a.dtL.i("kyc_uploading-history", this.this$0.aKn(), this.this$0.aKo(), b.a(this.this$0).Er());
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0007"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release", "com/iqoption/kyc/document/KycDocumentFragment$$special$$inlined$setOnDelayedClickListener$1"})
    /* compiled from: AndroidExtensions.kt */
    public static final class e extends com.iqoption.core.ext.g {
        final /* synthetic */ LinearLayout dxe;
        final /* synthetic */ b this$0;

        public e(b bVar, LinearLayout linearLayout) {
            this.this$0 = bVar;
            this.dxe = linearLayout;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            b bVar = this.this$0;
            Object tag = view.getTag();
            if (tag != null) {
                bVar.dwY = (com.iqoption.core.microservices.kyc.response.document.i) tag;
                this.this$0.aKK();
                this.this$0.aKN();
                com.iqoption.kyc.a.a.dtL.q(this.this$0.aKn(), this.this$0.aKo(), b.a(this.this$0).Er());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.iqoption.core.microservices.kyc.response.document.PoaDocumentType");
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "types", "", "Lcom/iqoption/core/microservices/kyc/response/document/PoaDocumentType;", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: KycDocumentFragment.kt */
    static final class f<T> implements Observer<List<? extends com.iqoption.core.microservices.kyc.response.document.i>> {
        final /* synthetic */ b this$0;

        f(b bVar) {
            this.this$0 = bVar;
        }

        /* renamed from: u */
        public final void onChanged(List<com.iqoption.core.microservices.kyc.response.document.i> list) {
            if (list != null) {
                this.this$0.be(list);
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/ui/Resource;", "Lcom/iqoption/core/microservices/kyc/response/document/KycDocument;", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: KycDocumentFragment.kt */
    static final class g<T> implements Observer<com.iqoption.core.ui.d<com.iqoption.core.microservices.kyc.response.document.b>> {
        final /* synthetic */ b this$0;

        g(b bVar) {
            this.this$0 = bVar;
        }

        /* renamed from: a */
        public final void onChanged(com.iqoption.core.ui.d<com.iqoption.core.microservices.kyc.response.document.b> dVar) {
            if (dVar != null) {
                this.this$0.eF(false);
                if (dVar.isSuccess()) {
                    com.iqoption.core.microservices.kyc.response.document.b bVar = (com.iqoption.core.microservices.kyc.response.document.b) dVar.getData();
                    this.this$0.a(bVar);
                    this.this$0.b(bVar);
                    return;
                }
                String string = this.this$0.getString(com.iqoption.kyc.o.f.unknown_error_occurred);
                kotlin.jvm.internal.i.e(string, "getString(R.string.unknown_error_occurred)");
                com.iqoption.core.d.a(string, 0, 2, null);
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"})
    /* compiled from: KycDocumentFragment.kt */
    static final class h<T> implements Observer<Boolean> {
        final /* synthetic */ b this$0;

        h(b bVar) {
            this.this$0 = bVar;
        }

        /* renamed from: f */
        public final void onChanged(Boolean bool) {
            this.this$0.eq(kotlin.jvm.internal.i.y(bool, Boolean.valueOf(true)));
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"})
    /* compiled from: KycDocumentFragment.kt */
    static final class i<T> implements Observer<Boolean> {
        final /* synthetic */ b this$0;

        i(b bVar) {
            this.this$0 = bVar;
        }

        /* renamed from: f */
        public final void onChanged(Boolean bool) {
            this.this$0.eG(kotlin.jvm.internal.i.y(bool, Boolean.valueOf(true)));
            if (kotlin.jvm.internal.i.y(bool, Boolean.valueOf(false)) && this.this$0.dxa) {
                com.iqoption.kyc.navigator.a.dAF.av(this.this$0);
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/ui/Resource;", "Lcom/iqoption/kyc/document/DocsSdk;", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: KycDocumentFragment.kt */
    static final class j<T> implements Observer<com.iqoption.core.ui.d<a>> {
        final /* synthetic */ b this$0;

        j(b bVar) {
            this.this$0 = bVar;
        }

        /* renamed from: a */
        public final void onChanged(com.iqoption.core.ui.d<a> dVar) {
            if (dVar != null) {
                a aVar = (a) dVar.getData();
                this.this$0.dwW = aVar;
                if (!dVar.isSuccess() || aVar == null) {
                    Throwable throwable = dVar.getThrowable();
                    if (throwable instanceof PlatformNotSupportedException) {
                        com.crashlytics.android.a.ag("Jumio Netverify initializeNetverifySDK error. Platform is not supported");
                        com.crashlytics.android.a.d(throwable);
                        com.iqoption.core.d.z("This platform is not supported", 1);
                        return;
                    }
                    com.crashlytics.android.a.ag("Jumio Netverify initializeNetverifySDK error");
                    com.crashlytics.android.a.d(throwable);
                    com.iqoption.core.d.a(com.iqoption.kyc.o.f.unknown_error_occurred, 0, 2, null);
                    return;
                }
                this.this$0.a(aVar.aKF(), (int) MobileEvents.EVENTTYPE_ANDROID_LIFECYCLE);
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "result", "Lcom/iqoption/core/ui/fragment/ActivityResult;", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: KycDocumentFragment.kt */
    static final class k<T> implements Observer<com.iqoption.core.ui.fragment.a> {
        final /* synthetic */ b this$0;

        k(b bVar) {
            this.this$0 = bVar;
        }

        /* renamed from: c */
        public final void onChanged(com.iqoption.core.ui.fragment.a aVar) {
            if (!(this.this$0.dwW == null || aVar == null || !com.iqoption.kyc.h.dsg.aIX().gk(aVar.alr()))) {
                Intent als = aVar.als();
                int resultCode = aVar.getResultCode();
                if (als != null) {
                    if (aVar.alr() == NetverifySDK.REQUEST_CODE) {
                        this.this$0.f(resultCode, als);
                    } else {
                        this.this$0.g(resultCode, als);
                    }
                    a d = this.this$0.dwW;
                    if (d != null) {
                        MobileSDK aKF = d.aKF();
                        if (aKF != null) {
                            aKF.destroy();
                        }
                    }
                    this.this$0.dwW = (a) null;
                }
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "message", "", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: KycDocumentFragment.kt */
    static final class l<T> implements Observer<String> {
        public static final l dxf = new l();

        l() {
        }

        /* renamed from: dg */
        public final void onChanged(String str) {
            if (str != null) {
                com.iqoption.core.d.a(str, 0, 2, null);
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class m extends com.iqoption.core.ext.g {
        final /* synthetic */ b this$0;

        public m(b bVar) {
            this.this$0 = bVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            b.a(this.this$0).g(this.this$0.aKH().afH());
            com.iqoption.kyc.a.a.m(this.this$0.aKn(), this.this$0.aKo(), b.a(this.this$0).Er());
        }
    }

    private final com.iqoption.core.microservices.kyc.response.step.c aKH() {
        kotlin.d dVar = this.dwS;
        kotlin.reflect.j jVar = anY[0];
        return (com.iqoption.core.microservices.kyc.response.step.c) dVar.getValue();
    }

    private final boolean aKI() {
        kotlin.d dVar = this.dwT;
        kotlin.reflect.j jVar = anY[1];
        return ((Boolean) dVar.getValue()).booleanValue();
    }

    public void Bj() {
        HashMap hashMap = this.apm;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* Access modifiers changed, original: protected */
    public boolean aIE() {
        return false;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        Bj();
    }

    static {
        String name = b.class.getName();
        if (name == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        TAG = name;
    }

    /* Access modifiers changed, original: protected */
    public boolean a(FragmentManager fragmentManager) {
        if (!aKI()) {
            return super.a(fragmentManager);
        }
        com.iqoption.kyc.navigator.a.dAF.av(this);
        return true;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.dwV = c.dxm.ap(this);
        this.dwY = bundle != null ? (com.iqoption.core.microservices.kyc.response.document.i) bundle.getParcelable("STATE_CHECKED_TYPE") : null;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        this.dwU = (com.iqoption.kyc.b.i) com.iqoption.core.ext.a.a((Fragment) this, com.iqoption.kyc.o.e.fragment_kyc_document, viewGroup, false, 4, null);
        com.iqoption.kyc.b.i iVar = this.dwU;
        if (iVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        return iVar.getRoot();
    }

    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        com.iqoption.kyc.b.i iVar = this.dwU;
        if (iVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        TextView textView = iVar.duR;
        kotlin.jvm.internal.i.e(textView, "binding.kycDocumentSkip");
        textView.setOnClickListener(new m(this));
        int i = aKM() == VerificationType.POI ? com.iqoption.kyc.o.f.id_confirmation : com.iqoption.kyc.o.f.kyc_docs_address_of_residence;
        c cVar = this.dwV;
        String str = "viewModel";
        if (cVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        String string = getString(i);
        kotlin.jvm.internal.i.e(string, "getString(titleResId)");
        cVar.setTitle(string);
        c cVar2 = this.dwV;
        if (cVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        cVar2.b(aKH());
        aKt();
    }

    private final void aKJ() {
        com.iqoption.kyc.navigator.a.dAF.b(this, dxc.b(aKH(), true));
    }

    public void onSaveInstanceState(Bundle bundle) {
        kotlin.jvm.internal.i.f(bundle, "outState");
        bundle.putParcelable("STATE_CHECKED_TYPE", this.dwY);
        super.onSaveInstanceState(bundle);
    }

    private final void aKt() {
        eF(true);
        c cVar = this.dwV;
        String str = "viewModel";
        if (cVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        LifecycleOwner lifecycleOwner = this;
        cVar.k(aKM()).observe(lifecycleOwner, new g(this));
        cVar = this.dwV;
        if (cVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        cVar.aJp().observe(lifecycleOwner, new h(this));
        cVar = this.dwV;
        if (cVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        cVar.aKQ().observe(lifecycleOwner, new i(this));
        cVar = this.dwV;
        if (cVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        cVar.aKP().observe(lifecycleOwner, new j(this));
        cVar = this.dwV;
        if (cVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        cVar.aJu().observe(lifecycleOwner, new k(this));
        cVar = this.dwV;
        if (cVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        cVar.aJv().observe(lifecycleOwner, l.dxf);
    }

    private final void a(com.iqoption.core.microservices.kyc.response.document.b bVar) {
        if (aKM() == VerificationType.POA && aKI()) {
            c cVar = this.dwV;
            if (cVar == null) {
                kotlin.jvm.internal.i.lG("viewModel");
            }
            cVar.aKR().observe(this, new f(this));
        }
        this.dwX = bVar;
    }

    private final void f(int i, Intent intent) {
        String str = "viewModel";
        String stringExtra;
        a aVar;
        if (i == -1) {
            stringExtra = intent.getStringExtra(NetverifySDK.EXTRA_SCAN_REFERENCE);
            com.iqoption.kyc.a.a.a(true, null, true);
            c cVar = this.dwV;
            if (cVar == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            aVar = this.dwW;
            if (aVar == null) {
                kotlin.jvm.internal.i.bnJ();
            }
            cVar.d(aVar.aKG().getMerchantScanReference(), stringExtra, false, Integer.valueOf(0));
        } else if (i == 0) {
            stringExtra = intent.getStringExtra(NetverifySDK.EXTRA_ERROR_MESSAGE);
            int intExtra = intent.getIntExtra(NetverifySDK.EXTRA_ERROR_CODE, 0);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Jumio Netverify error. errorMessage=");
            stringBuilder.append(stringExtra);
            stringBuilder.append("; errorCode=");
            stringBuilder.append(intExtra);
            String stringBuilder2 = stringBuilder.toString();
            if (intExtra != Callback.DEFAULT_SWIPE_ANIMATION_DURATION) {
                com.crashlytics.android.a.d(new JumioException(stringBuilder2));
            }
            com.iqoption.kyc.a.a.a(false, stringExtra, true);
            com.iqoption.kyc.a.a.w(stringExtra, true);
            c cVar2 = this.dwV;
            if (cVar2 == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            aVar = this.dwW;
            if (aVar == null) {
                kotlin.jvm.internal.i.bnJ();
            }
            cVar2.d(aVar.aKG().getMerchantScanReference(), null, true, Integer.valueOf(intExtra));
        }
    }

    private final void g(int i, Intent intent) {
        String str = "viewModel";
        String stringExtra;
        a aVar;
        if (i == -1) {
            stringExtra = intent.getStringExtra(DocumentVerificationSDK.EXTRA_SCAN_REFERENCE);
            com.iqoption.kyc.a.a.a(true, null, true);
            c cVar = this.dwV;
            if (cVar == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            aVar = this.dwW;
            if (aVar == null) {
                kotlin.jvm.internal.i.bnJ();
            }
            cVar.d(aVar.aKG().getMerchantScanReference(), stringExtra, false, Integer.valueOf(0));
            this.dxa = true;
        } else if (i == 0) {
            stringExtra = intent.getStringExtra(DocumentVerificationSDK.EXTRA_ERROR_MESSAGE);
            int intExtra = intent.getIntExtra(DocumentVerificationSDK.EXTRA_ERROR_CODE, 0);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Jumio Netverify error. errorMessage=");
            stringBuilder.append(stringExtra);
            stringBuilder.append("; errorCode=");
            stringBuilder.append(intExtra);
            String stringBuilder2 = stringBuilder.toString();
            if (intExtra != Callback.DEFAULT_SWIPE_ANIMATION_DURATION) {
                com.crashlytics.android.a.d(new JumioException(stringBuilder2));
            }
            com.iqoption.kyc.a.a.a(false, stringExtra, true);
            com.iqoption.kyc.a.a.w(stringExtra, true);
            c cVar2 = this.dwV;
            if (cVar2 == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            aVar = this.dwW;
            if (aVar == null) {
                kotlin.jvm.internal.i.bnJ();
            }
            cVar2.d(aVar.aKG().getMerchantScanReference(), null, true, Integer.valueOf(intExtra));
        }
    }

    private final void be(List<com.iqoption.core.microservices.kyc.response.document.i> list) {
        com.iqoption.kyc.b.i iVar = this.dwU;
        if (iVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        LinearLayout linearLayout = iVar.duP;
        kotlin.jvm.internal.i.e(linearLayout, "binding.kycDocumentPoaTypes");
        com.iqoption.core.ext.a.ak(linearLayout);
        linearLayout.removeAllViews();
        for (com.iqoption.core.microservices.kyc.response.document.i iVar2 : list) {
            bo boVar = (bo) com.iqoption.core.ext.a.a((Fragment) this, com.iqoption.kyc.o.e.item_poa_type, (ViewGroup) linearLayout, false);
            LinearLayout linearLayout2 = boVar.dwx;
            String str = "item.poaTypeContainer";
            kotlin.jvm.internal.i.e(linearLayout2, str);
            linearLayout2.setTag(iVar2);
            TextView textView = boVar.dwy;
            kotlin.jvm.internal.i.e(textView, "item.poaTypeText");
            textView.setText(iVar2.getName());
            LinearLayout linearLayout3 = boVar.dwx;
            kotlin.jvm.internal.i.e(linearLayout3, str);
            linearLayout3.setOnClickListener(new e(this, linearLayout));
            View root = boVar.getRoot();
            kotlin.jvm.internal.i.e(root, "item.root");
            root.setDuplicateParentStateEnabled(true);
            linearLayout.addView(boVar.getRoot());
        }
        aKK();
    }

    private final void aKK() {
        com.iqoption.kyc.b.i iVar = this.dwU;
        if (iVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        LinearLayout linearLayout = iVar.duP;
        kotlin.jvm.internal.i.e(linearLayout, "binding.kycDocumentPoaTypes");
        int childCount = linearLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            int i2;
            View childAt = linearLayout.getChildAt(i);
            kotlin.jvm.internal.i.e(childAt, "child");
            if (kotlin.jvm.internal.i.y(childAt.getTag(), this.dwY)) {
                i2 = com.iqoption.kyc.o.a.white;
            } else {
                i2 = com.iqoption.kyc.o.a.grey_blue_70;
            }
            ((TextView) childAt.findViewById(com.iqoption.kyc.o.d.poaTypeText)).setTextColor(com.iqoption.core.ext.a.k(com.iqoption.core.ext.a.q(this), i2));
        }
    }

    private final void b(com.iqoption.core.microservices.kyc.response.document.b bVar) {
        com.iqoption.kyc.b.i iVar;
        TextView textView;
        c cVar = this.dwV;
        if (cVar == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        cVar.a(aKH().afH(), bVar);
        if (aKM() == VerificationType.POI) {
            c(bVar);
        } else {
            d(bVar);
        }
        e(bVar);
        f(bVar);
        g(bVar);
        h(bVar);
        i(bVar);
        String str = "binding.kycDocumentSkip";
        String str2 = "binding";
        if (!aKH().afJ() || j(bVar)) {
            iVar = this.dwU;
            if (iVar == null) {
                kotlin.jvm.internal.i.lG(str2);
            }
            textView = iVar.duR;
            kotlin.jvm.internal.i.e(textView, str);
            com.iqoption.core.ext.a.al(textView);
        } else {
            iVar = this.dwU;
            if (iVar == null) {
                kotlin.jvm.internal.i.lG(str2);
            }
            textView = iVar.duR;
            kotlin.jvm.internal.i.e(textView, str);
            com.iqoption.core.ext.a.ak(textView);
        }
        String str3 = "binding.kycDocumentPoaTypes";
        LinearLayout linearLayout;
        if (aKM() == VerificationType.POA && (bVar == null || aKI())) {
            iVar = this.dwU;
            if (iVar == null) {
                kotlin.jvm.internal.i.lG(str2);
            }
            linearLayout = iVar.duP;
            kotlin.jvm.internal.i.e(linearLayout, str3);
            com.iqoption.core.ext.a.ak(linearLayout);
        } else {
            iVar = this.dwU;
            if (iVar == null) {
                kotlin.jvm.internal.i.lG(str2);
            }
            linearLayout = iVar.duP;
            kotlin.jvm.internal.i.e(linearLayout, str3);
            com.iqoption.core.ext.a.al(linearLayout);
        }
        str = "binding.kycDocumentUploadMore";
        if (j(bVar)) {
            iVar = this.dwU;
            if (iVar == null) {
                kotlin.jvm.internal.i.lG(str2);
            }
            textView = iVar.duU;
            kotlin.jvm.internal.i.e(textView, str);
            com.iqoption.core.ext.a.ak(textView);
        } else {
            iVar = this.dwU;
            if (iVar == null) {
                kotlin.jvm.internal.i.lG(str2);
            }
            textView = iVar.duU;
            kotlin.jvm.internal.i.e(textView, str);
            com.iqoption.core.ext.a.al(textView);
        }
        iVar = this.dwU;
        if (iVar == null) {
            kotlin.jvm.internal.i.lG(str2);
        }
        textView = iVar.duU;
        kotlin.jvm.internal.i.e(textView, str);
        textView.setOnClickListener(new c(this));
        aKL();
        String str4 = "binding.kycDocumentHistory";
        com.iqoption.kyc.b.i iVar2;
        TextView textView2;
        if (bVar != null) {
            iVar2 = this.dwU;
            if (iVar2 == null) {
                kotlin.jvm.internal.i.lG(str2);
            }
            textView2 = iVar2.duN;
            kotlin.jvm.internal.i.e(textView2, str4);
            com.iqoption.core.ext.a.ak(textView2);
            iVar2 = this.dwU;
            if (iVar2 == null) {
                kotlin.jvm.internal.i.lG(str2);
            }
            textView2 = iVar2.duN;
            kotlin.jvm.internal.i.e(textView2, str4);
            textView2.setOnClickListener(new d(this));
            return;
        }
        iVar2 = this.dwU;
        if (iVar2 == null) {
            kotlin.jvm.internal.i.lG(str2);
        }
        textView2 = iVar2.duN;
        kotlin.jvm.internal.i.e(textView2, str4);
        com.iqoption.core.ext.a.al(textView2);
    }

    private final void c(com.iqoption.core.microservices.kyc.response.document.b bVar) {
        int i;
        DocumentStatus aeN = bVar != null ? bVar.aeN() : null;
        if (k(bVar)) {
            i = com.iqoption.kyc.o.c.ic_poi_need_action;
        } else if (aeN == DocumentStatus.VERIFYING) {
            i = com.iqoption.kyc.o.c.ic_poi_pending;
        } else if (aeN == DocumentStatus.DECLINED) {
            i = com.iqoption.kyc.o.c.ic_kyc_error;
        } else {
            i = com.iqoption.kyc.o.c.ic_poi_start;
        }
        com.iqoption.kyc.b.i iVar = this.dwU;
        if (iVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        iVar.duO.setImageDrawable(com.iqoption.core.ext.a.n(com.iqoption.core.ext.a.q(this), i));
    }

    private final void d(com.iqoption.core.microservices.kyc.response.document.b bVar) {
        int i;
        DocumentStatus aeN = bVar != null ? bVar.aeN() : null;
        if (aKI()) {
            i = com.iqoption.kyc.o.c.ic_poa_start;
        } else if (k(bVar)) {
            i = com.iqoption.kyc.o.c.ic_poa_need_action;
        } else if (aeN == DocumentStatus.VERIFYING) {
            i = com.iqoption.kyc.o.c.ic_poa_pending;
        } else if (aeN == DocumentStatus.DECLINED) {
            i = com.iqoption.kyc.o.c.ic_kyc_error;
        } else {
            i = com.iqoption.kyc.o.c.ic_poa_start;
        }
        com.iqoption.kyc.b.i iVar = this.dwU;
        if (iVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        iVar.duO.setImageDrawable(com.iqoption.core.ext.a.n(com.iqoption.core.ext.a.q(this), i));
    }

    private final void e(com.iqoption.core.microservices.kyc.response.document.b bVar) {
        Integer num = null;
        DocumentStatus aeN = bVar != null ? bVar.aeN() : null;
        if (!(aKI() || k(bVar))) {
            if (aeN != null) {
                if (com.iqoption.core.ext.c.b((Object) aeN, DocumentStatus.VERIFYING, DocumentStatus.APPROVED)) {
                    num = Integer.valueOf(com.iqoption.kyc.o.f.kyc_thanks);
                }
            }
            if (aeN == DocumentStatus.DECLINED) {
                num = Integer.valueOf(com.iqoption.kyc.o.f.documents_declined);
            }
        }
        String str = "binding";
        String str2 = "binding.kycDocumentTitle";
        TextView textView;
        if (num != null) {
            com.iqoption.kyc.b.i iVar = this.dwU;
            if (iVar == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            TextView textView2 = iVar.duT;
            kotlin.jvm.internal.i.e(textView2, str2);
            com.iqoption.core.ext.a.ak(textView2);
            iVar = this.dwU;
            if (iVar == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            textView = iVar.duT;
            kotlin.jvm.internal.i.e(textView, str2);
            textView.setText(getString(num.intValue()));
            return;
        }
        com.iqoption.kyc.b.i iVar2 = this.dwU;
        if (iVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        textView = iVar2.duT;
        kotlin.jvm.internal.i.e(textView, str2);
        com.iqoption.core.ext.a.al(textView);
    }

    /* JADX WARNING: Missing block: B:15:0x0040, code skipped:
            if (com.iqoption.core.ext.c.b((java.lang.Object) r1, com.iqoption.core.microservices.kyc.response.document.DocumentStatus.VERIFYING, com.iqoption.core.microservices.kyc.response.document.DocumentStatus.APPROVED) == true) goto L_0x004e;
     */
    private final void f(com.iqoption.core.microservices.kyc.response.document.b r6) {
        /*
        r5 = this;
        r0 = 0;
        if (r6 == 0) goto L_0x0008;
    L_0x0003:
        r1 = r6.aeN();
        goto L_0x0009;
    L_0x0008:
        r1 = r0;
    L_0x0009:
        r2 = r5.aKI();
        if (r2 == 0) goto L_0x0016;
    L_0x000f:
        r6 = com.iqoption.kyc.o.f.select_document_type;
        r0 = r5.getString(r6);
        goto L_0x004e;
    L_0x0016:
        r2 = r5.k(r6);
        r3 = 0;
        r4 = 1;
        if (r2 == 0) goto L_0x002f;
    L_0x001e:
        r1 = com.iqoption.kyc.o.f.your_previous_documents_n1;
        r2 = new java.lang.Object[r4];
        if (r6 == 0) goto L_0x0028;
    L_0x0024:
        r0 = r6.aeP();
    L_0x0028:
        r2[r3] = r0;
        r0 = r5.getString(r1, r2);
        goto L_0x004e;
    L_0x002f:
        if (r1 == 0) goto L_0x0043;
    L_0x0031:
        r6 = 2;
        r6 = new com.iqoption.core.microservices.kyc.response.document.DocumentStatus[r6];
        r2 = com.iqoption.core.microservices.kyc.response.document.DocumentStatus.VERIFYING;
        r6[r3] = r2;
        r2 = com.iqoption.core.microservices.kyc.response.document.DocumentStatus.APPROVED;
        r6[r4] = r2;
        r6 = com.iqoption.core.ext.c.b(r1, r6);
        if (r6 != r4) goto L_0x0043;
    L_0x0042:
        goto L_0x004e;
    L_0x0043:
        r6 = com.iqoption.core.microservices.kyc.response.document.DocumentStatus.DECLINED;
        if (r1 != r6) goto L_0x0048;
    L_0x0047:
        goto L_0x004e;
    L_0x0048:
        r6 = com.iqoption.kyc.o.f.documents_must_be;
        r0 = r5.getString(r6);
    L_0x004e:
        r6 = "binding";
        r1 = "binding.kycDocumentSubtitle";
        if (r0 == 0) goto L_0x0077;
    L_0x0054:
        r2 = r5.dwU;
        if (r2 != 0) goto L_0x005b;
    L_0x0058:
        kotlin.jvm.internal.i.lG(r6);
    L_0x005b:
        r2 = r2.duS;
        kotlin.jvm.internal.i.e(r2, r1);
        r2 = (android.view.View) r2;
        com.iqoption.core.ext.a.ak(r2);
        r2 = r5.dwU;
        if (r2 != 0) goto L_0x006c;
    L_0x0069:
        kotlin.jvm.internal.i.lG(r6);
    L_0x006c:
        r6 = r2.duS;
        kotlin.jvm.internal.i.e(r6, r1);
        r0 = (java.lang.CharSequence) r0;
        r6.setText(r0);
        goto L_0x0088;
    L_0x0077:
        r0 = r5.dwU;
        if (r0 != 0) goto L_0x007e;
    L_0x007b:
        kotlin.jvm.internal.i.lG(r6);
    L_0x007e:
        r6 = r0.duS;
        kotlin.jvm.internal.i.e(r6, r1);
        r6 = (android.view.View) r6;
        com.iqoption.core.ext.a.al(r6);
    L_0x0088:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.kyc.document.b.f(com.iqoption.core.microservices.kyc.response.document.b):void");
    }

    private final void g(com.iqoption.core.microservices.kyc.response.document.b bVar) {
        String str = null;
        DocumentStatus aeN = bVar != null ? bVar.aeN() : null;
        int i = 1;
        if (!aKI()) {
            if (aKM() == VerificationType.POI && (k(bVar) || bVar == null)) {
                i = GravityCompat.START;
                str = getString(com.iqoption.kyc.o.f.the_document_should_clearly_show);
            } else if (aeN == DocumentStatus.VERIFYING) {
                str = getString(com.iqoption.kyc.o.f.we_received_your_documents_and_now_verifying);
            } else if (aeN == DocumentStatus.APPROVED) {
                str = getString(com.iqoption.kyc.o.f.your_document_has_been_approved);
            } else if (aeN == DocumentStatus.DECLINED) {
                str = getString(com.iqoption.kyc.o.f.your_documents_have_been_declined);
            }
        }
        String str2 = "binding";
        String str3 = "binding.kycDocumentDescription";
        com.iqoption.kyc.b.i iVar;
        TextView textView;
        if (str != null) {
            com.iqoption.kyc.b.i iVar2 = this.dwU;
            if (iVar2 == null) {
                kotlin.jvm.internal.i.lG(str2);
            }
            TextView textView2 = iVar2.duM;
            kotlin.jvm.internal.i.e(textView2, str3);
            com.iqoption.core.ext.a.ak(textView2);
            iVar2 = this.dwU;
            if (iVar2 == null) {
                kotlin.jvm.internal.i.lG(str2);
            }
            textView2 = iVar2.duM;
            kotlin.jvm.internal.i.e(textView2, str3);
            textView2.setText(str);
            iVar = this.dwU;
            if (iVar == null) {
                kotlin.jvm.internal.i.lG(str2);
            }
            textView = iVar.duM;
            kotlin.jvm.internal.i.e(textView, str3);
            textView.setGravity(i);
            return;
        }
        iVar = this.dwU;
        if (iVar == null) {
            kotlin.jvm.internal.i.lG(str2);
        }
        textView = iVar.duM;
        kotlin.jvm.internal.i.e(textView, str3);
        com.iqoption.core.ext.a.al(textView);
    }

    private final void h(com.iqoption.core.microservices.kyc.response.document.b bVar) {
        String str = null;
        DocumentStatus aeN = bVar != null ? bVar.aeN() : null;
        if (!aKI() && aeN == DocumentStatus.DECLINED) {
            str = bVar.getComment();
        }
        String str2 = "binding";
        String str3 = "binding.kycDocumentComment";
        TextView textView;
        if (str != null) {
            com.iqoption.kyc.b.i iVar = this.dwU;
            if (iVar == null) {
                kotlin.jvm.internal.i.lG(str2);
            }
            TextView textView2 = iVar.duK;
            kotlin.jvm.internal.i.e(textView2, str3);
            com.iqoption.core.ext.a.ak(textView2);
            iVar = this.dwU;
            if (iVar == null) {
                kotlin.jvm.internal.i.lG(str2);
            }
            textView = iVar.duK;
            kotlin.jvm.internal.i.e(textView, str3);
            textView.setText(str);
            return;
        }
        com.iqoption.kyc.b.i iVar2 = this.dwU;
        if (iVar2 == null) {
            kotlin.jvm.internal.i.lG(str2);
        }
        textView = iVar2.duK;
        kotlin.jvm.internal.i.e(textView, str3);
        com.iqoption.core.ext.a.al(textView);
    }

    private final void i(com.iqoption.core.microservices.kyc.response.document.b bVar) {
        Integer num;
        Integer num2;
        DocumentStatus aeN = bVar != null ? bVar.aeN() : null;
        if (aKI()) {
            num = (Integer) null;
            num2 = num;
        } else if (k(bVar)) {
            num = Integer.valueOf(com.iqoption.kyc.o.f.upload_more);
            num2 = Integer.valueOf(com.iqoption.kyc.o.c.bg_rectangle_red);
        } else if (j(bVar)) {
            num = Integer.valueOf(com.iqoption.kyc.o.f.done);
            num2 = Integer.valueOf(com.iqoption.kyc.o.c.bg_rectangle_green);
        } else if (aeN == DocumentStatus.DECLINED) {
            num = Integer.valueOf(com.iqoption.kyc.o.f.upload);
            num2 = Integer.valueOf(com.iqoption.kyc.o.c.bg_rectangle_red);
        } else {
            num = Integer.valueOf(com.iqoption.kyc.o.f.upload);
            num2 = Integer.valueOf(com.iqoption.kyc.o.c.bg_rectangle_green);
        }
        String str = "binding.kycDocumentButton.root";
        String str2 = "binding.kycDocumentButton";
        String str3 = "binding";
        if (num == null || num2 == null) {
            com.iqoption.kyc.b.i iVar = this.dwU;
            if (iVar == null) {
                kotlin.jvm.internal.i.lG(str3);
            }
            bs bsVar = iVar.duJ;
            kotlin.jvm.internal.i.e(bsVar, str2);
            View root = bsVar.getRoot();
            kotlin.jvm.internal.i.e(root, str);
            com.iqoption.core.ext.a.al(root);
            return;
        }
        com.iqoption.kyc.b.i iVar2 = this.dwU;
        if (iVar2 == null) {
            kotlin.jvm.internal.i.lG(str3);
        }
        bs bsVar2 = iVar2.duJ;
        kotlin.jvm.internal.i.e(bsVar2, str2);
        View root2 = bsVar2.getRoot();
        kotlin.jvm.internal.i.e(root2, str);
        com.iqoption.core.ext.a.ak(root2);
        com.iqoption.kyc.b.i iVar3 = this.dwU;
        if (iVar3 == null) {
            kotlin.jvm.internal.i.lG(str3);
        }
        TextView textView = iVar3.duJ.dwE;
        kotlin.jvm.internal.i.e(textView, "binding.kycDocumentButton.kycButtonText");
        textView.setText(getString(num.intValue()));
        com.iqoption.kyc.b.i iVar4 = this.dwU;
        if (iVar4 == null) {
            kotlin.jvm.internal.i.lG(str3);
        }
        FrameLayout frameLayout = iVar4.duJ.dwC;
        str = "binding.kycDocumentButton.kycButton";
        kotlin.jvm.internal.i.e(frameLayout, str);
        frameLayout.setBackground(com.iqoption.core.ext.a.n(com.iqoption.core.ext.a.q(this), num2.intValue()));
        iVar4 = this.dwU;
        if (iVar4 == null) {
            kotlin.jvm.internal.i.lG(str3);
        }
        frameLayout = iVar4.duJ.dwC;
        kotlin.jvm.internal.i.e(frameLayout, str);
        frameLayout.setOnClickListener(new b(this, bVar));
    }

    private final boolean j(com.iqoption.core.microservices.kyc.response.document.b bVar) {
        if (bVar == null) {
            return false;
        }
        Object aeN = bVar.aeN();
        if (aeN == null) {
            return false;
        }
        return (!com.iqoption.core.ext.c.b(aeN, DocumentStatus.VERIFYING, DocumentStatus.APPROVED) || aKI() || k(bVar)) ? false : true;
    }

    private final boolean k(com.iqoption.core.microservices.kyc.response.document.b bVar) {
        if (aKH().afI() != KycStepState.NEED_ACTION) {
            if ((bVar != null ? bVar.aeN() : null) != DocumentStatus.APPROVED) {
                return false;
            }
            String aeP = bVar.aeP();
            if (aeP == null) {
                return false;
            }
            if ((((CharSequence) aeP).length() > 0 ? 1 : 0) != 1) {
                return false;
            }
        }
        return true;
    }

    private final void eF(boolean z) {
        String str = "binding.kycDocumentProgress";
        String str2 = "binding.kycDocumentContent";
        String str3 = "binding";
        com.iqoption.kyc.b.i iVar;
        LinearLayout linearLayout;
        FrameLayout frameLayout;
        if (z) {
            iVar = this.dwU;
            if (iVar == null) {
                kotlin.jvm.internal.i.lG(str3);
            }
            linearLayout = iVar.duL;
            kotlin.jvm.internal.i.e(linearLayout, str2);
            com.iqoption.core.ext.a.al(linearLayout);
            iVar = this.dwU;
            if (iVar == null) {
                kotlin.jvm.internal.i.lG(str3);
            }
            frameLayout = iVar.duQ;
            kotlin.jvm.internal.i.e(frameLayout, str);
            com.iqoption.core.ext.a.ak(frameLayout);
            return;
        }
        iVar = this.dwU;
        if (iVar == null) {
            kotlin.jvm.internal.i.lG(str3);
        }
        linearLayout = iVar.duL;
        kotlin.jvm.internal.i.e(linearLayout, str2);
        com.iqoption.core.ext.a.ak(linearLayout);
        iVar = this.dwU;
        if (iVar == null) {
            kotlin.jvm.internal.i.lG(str3);
        }
        frameLayout = iVar.duQ;
        kotlin.jvm.internal.i.e(frameLayout, str);
        com.iqoption.core.ext.a.al(frameLayout);
    }

    private final void aKL() {
        SdkLoadingType sdkLoadingType = this.dwZ;
        if (sdkLoadingType != null) {
            a(sdkLoadingType, false);
            eG(true);
        }
    }

    private final void eG(boolean z) {
        SdkLoadingType sdkLoadingType;
        if (aKM() == VerificationType.POA || j(this.dwX)) {
            sdkLoadingType = SdkLoadingType.FULL_SCREEN;
        } else {
            sdkLoadingType = SdkLoadingType.BOTTOM_BUTTON;
        }
        SdkLoadingType sdkLoadingType2 = this.dwZ;
        if (!(sdkLoadingType2 == null || sdkLoadingType2 == sdkLoadingType)) {
            a(sdkLoadingType2, false);
        }
        a(sdkLoadingType, z);
        if (!z) {
            sdkLoadingType = null;
        }
        this.dwZ = sdkLoadingType;
    }

    private final void a(SdkLoadingType sdkLoadingType, boolean z) {
        String str = "binding";
        String str2;
        String str3;
        com.iqoption.kyc.b.i iVar;
        FrameLayout frameLayout;
        if (sdkLoadingType == SdkLoadingType.FULL_SCREEN) {
            str2 = "binding.kycDocumentPoaTypes";
            str3 = "binding.kycDocumentUploadMore";
            String str4 = "binding.kycDocumentSkip";
            String str5 = "binding.kycDocumentProgress";
            String str6 = "binding.kycDocumentContent";
            LinearLayout linearLayout;
            TextView textView;
            if (z) {
                iVar = this.dwU;
                if (iVar == null) {
                    kotlin.jvm.internal.i.lG(str);
                }
                linearLayout = iVar.duL;
                kotlin.jvm.internal.i.e(linearLayout, str6);
                linearLayout.setEnabled(false);
                iVar = this.dwU;
                if (iVar == null) {
                    kotlin.jvm.internal.i.lG(str);
                }
                iVar.duL.animate().alpha(0.6f);
                iVar = this.dwU;
                if (iVar == null) {
                    kotlin.jvm.internal.i.lG(str);
                }
                frameLayout = iVar.duQ;
                kotlin.jvm.internal.i.e(frameLayout, str5);
                com.iqoption.core.ext.a.ak(frameLayout);
                iVar = this.dwU;
                if (iVar == null) {
                    kotlin.jvm.internal.i.lG(str);
                }
                textView = iVar.duR;
                kotlin.jvm.internal.i.e(textView, str4);
                textView.setEnabled(false);
                iVar = this.dwU;
                if (iVar == null) {
                    kotlin.jvm.internal.i.lG(str);
                }
                textView = iVar.duU;
                kotlin.jvm.internal.i.e(textView, str3);
                textView.setEnabled(false);
                iVar = this.dwU;
                if (iVar == null) {
                    kotlin.jvm.internal.i.lG(str);
                }
                linearLayout = iVar.duP;
                kotlin.jvm.internal.i.e(linearLayout, str2);
                linearLayout.setEnabled(false);
                return;
            }
            iVar = this.dwU;
            if (iVar == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            linearLayout = iVar.duL;
            kotlin.jvm.internal.i.e(linearLayout, str6);
            linearLayout.setEnabled(true);
            iVar = this.dwU;
            if (iVar == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            iVar.duL.animate().alpha(1.0f);
            iVar = this.dwU;
            if (iVar == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            frameLayout = iVar.duQ;
            kotlin.jvm.internal.i.e(frameLayout, str5);
            com.iqoption.core.ext.a.al(frameLayout);
            iVar = this.dwU;
            if (iVar == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            textView = iVar.duR;
            kotlin.jvm.internal.i.e(textView, str4);
            textView.setEnabled(true);
            iVar = this.dwU;
            if (iVar == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            textView = iVar.duU;
            kotlin.jvm.internal.i.e(textView, str3);
            textView.setEnabled(true);
            iVar = this.dwU;
            if (iVar == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            linearLayout = iVar.duP;
            kotlin.jvm.internal.i.e(linearLayout, str2);
            linearLayout.setEnabled(true);
            return;
        }
        str2 = "binding.kycDocumentButton.kycButton";
        str3 = "binding.kycDocumentButton.kycButtonProgress";
        ContentLoadingProgressBar contentLoadingProgressBar;
        if (z) {
            iVar = this.dwU;
            if (iVar == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            contentLoadingProgressBar = iVar.duJ.dwD;
            kotlin.jvm.internal.i.e(contentLoadingProgressBar, str3);
            contentLoadingProgressBar.setVisibility(0);
            iVar = this.dwU;
            if (iVar == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            frameLayout = iVar.duJ.dwC;
            kotlin.jvm.internal.i.e(frameLayout, str2);
            frameLayout.setEnabled(false);
            return;
        }
        iVar = this.dwU;
        if (iVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        contentLoadingProgressBar = iVar.duJ.dwD;
        kotlin.jvm.internal.i.e(contentLoadingProgressBar, str3);
        com.iqoption.core.ext.a.al(contentLoadingProgressBar);
        iVar = this.dwU;
        if (iVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        frameLayout = iVar.duJ.dwC;
        kotlin.jvm.internal.i.e(frameLayout, str2);
        frameLayout.setEnabled(true);
    }

    private final VerificationType aKM() {
        if (aKH().afH() == KycStepType.KYC_DOCUMENTS_POI) {
            return VerificationType.POI;
        }
        return VerificationType.POA;
    }

    private final void eq(boolean z) {
        com.iqoption.kyc.b.i iVar = this.dwU;
        if (iVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        TextView textView = iVar.duR;
        kotlin.jvm.internal.i.e(textView, "binding.kycDocumentSkip");
        textView.setEnabled(z ^ 1);
    }

    public String aKn() {
        return this.dtM;
    }

    public String aKo() {
        return aKM() == VerificationType.POI ? "ProofOfIdentity" : "AddressDocument";
    }

    public boolean aKp() {
        return this.dxb;
    }

    private final void a(MobileSDK mobileSDK, int i) {
        if (MobileSDK.hasAllRequiredPermissions(com.iqoption.core.ext.a.q(this))) {
            a(mobileSDK);
            return;
        }
        String[] missingPermissions = MobileSDK.getMissingPermissions(com.iqoption.core.ext.a.q(this));
        kotlin.jvm.internal.i.e(missingPermissions, "MobileSDK.getMissingPermissions(ctx)");
        requestPermissions(missingPermissions, i);
    }

    private final void a(MobileSDK mobileSDK) {
        try {
            com.iqoption.kyc.a.a.eA(true);
            mobileSDK.start();
        } catch (MissingPermissionException e) {
            String message = e.getMessage();
            if (message != null) {
                com.iqoption.core.d.a(message, 0, 2, null);
            }
            com.iqoption.kyc.a.a.a(false, e.getMessage(), true);
            com.iqoption.kyc.a.a.w(e.getMessage(), true);
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        kotlin.jvm.internal.i.f(strArr, "permissions");
        kotlin.jvm.internal.i.f(iArr, "grantResults");
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == MobileEvents.EVENTTYPE_ANDROID_LIFECYCLE) {
            if (((iArr.length == 0 ? 1 : 0) ^ 1) != 0) {
                for (int i2 : iArr) {
                    if (i2 != 0) {
                        eG(false);
                        com.iqoption.core.d.a(com.iqoption.kyc.o.f.unknown_error_occurred, 0, 2, null);
                        return;
                    }
                }
                a aVar = this.dwW;
                if (aVar != null) {
                    if (aVar == null) {
                        kotlin.jvm.internal.i.bnJ();
                    }
                    a(aVar.aKF());
                } else {
                    aKN();
                }
            } else {
                eG(false);
                com.iqoption.core.d.a(com.iqoption.kyc.o.f.unknown_error_occurred, 0, 2, null);
            }
        }
    }

    private final void aKN() {
        FragmentActivity activity = getActivity();
        VerificationType aKM = aKM();
        com.iqoption.core.microservices.kyc.response.document.i iVar = this.dwY;
        if (activity == null) {
            return;
        }
        if (aKM != VerificationType.POA || iVar != null) {
            c cVar = this.dwV;
            if (cVar == null) {
                kotlin.jvm.internal.i.lG("viewModel");
            }
            cVar.a(activity, aKM, iVar != null ? iVar.getCode() : null);
            this.dwY = (com.iqoption.core.microservices.kyc.response.document.i) null;
        }
    }

    public String alx() {
        return dxc.a(aKH(), Boolean.valueOf(aKI()));
    }
}
