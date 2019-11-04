package com.iqoption.kyc;

import android.content.Context;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.iqoption.core.microservices.kyc.response.KycVerificationContext;
import com.iqoption.core.microservices.kyc.response.step.KycStepType;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 L2\u00020\u0001:\u0001LB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020\u0018H\u0007J\u0016\u0010<\u001a\u00020\u00002\u0006\u0010=\u001a\u00020\u00172\u0006\u0010>\u001a\u00020\u0018J\u0006\u0010?\u001a\u00020:J\u0010\u0010@\u001a\u00020:2\b\u0010A\u001a\u0004\u0018\u00010\u0010J\u000e\u0010B\u001a\u00020:2\u0006\u0010C\u001a\u00020DJ\u000e\u0010B\u001a\u00020:2\u0006\u0010E\u001a\u00020FJ\u0016\u0010G\u001a\u00020:2\u0006\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020KJ\u0016\u0010G\u001a\u00020:2\u0006\u0010E\u001a\u00020F2\u0006\u0010J\u001a\u00020KR$\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0003\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u001cX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001d\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0006\"\u0004\b\u001f\u0010\bR\u001a\u0010 \u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0006\"\u0004\b\"\u0010\bR\u001a\u0010#\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0006\"\u0004\b%\u0010\bR.\u0010&\u001a\u0016\u0012\u0004\u0012\u00020\u0010\u0018\u00010'j\n\u0012\u0004\u0012\u00020\u0010\u0018\u0001`(X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R&\u0010-\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b.\u0010\u0002\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001c\u00103\u001a\u0004\u0018\u000104X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108¨\u0006M"}, bng = {"Lcom/iqoption/kyc/KycBuilder;", "", "()V", "isHideIntroSkip", "", "isHideIntroSkip$annotations", "()Z", "setHideIntroSkip", "(Z)V", "kycCaller", "Lcom/iqoption/kyc/KycCaller;", "getKycCaller", "()Lcom/iqoption/kyc/KycCaller;", "setKycCaller", "(Lcom/iqoption/kyc/KycCaller;)V", "onlyStep", "Lcom/iqoption/core/microservices/kyc/response/step/KycStepType;", "getOnlyStep", "()Lcom/iqoption/core/microservices/kyc/response/step/KycStepType;", "setOnlyStep", "(Lcom/iqoption/core/microservices/kyc/response/step/KycStepType;)V", "parcelableMap", "", "", "Landroid/os/Parcelable;", "getParcelableMap", "()Ljava/util/Map;", "parcelableMapInternal", "", "returnToParent", "getReturnToParent", "setReturnToParent", "showDepositAfterFinish", "getShowDepositAfterFinish", "setShowDepositAfterFinish", "skipCysec", "getSkipCysec", "setSkipCysec", "startScreenSteps", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getStartScreenSteps", "()Ljava/util/ArrayList;", "setStartScreenSteps", "(Ljava/util/ArrayList;)V", "startScreenTag", "startScreenTag$annotations", "getStartScreenTag", "()Ljava/lang/String;", "setStartScreenTag", "(Ljava/lang/String;)V", "verificationContext", "Lcom/iqoption/core/microservices/kyc/response/KycVerificationContext;", "getVerificationContext", "()Lcom/iqoption/core/microservices/kyc/response/KycVerificationContext;", "setVerificationContext", "(Lcom/iqoption/core/microservices/kyc/response/KycVerificationContext;)V", "kycState", "", "parcelable", "putParcelable", "key", "value", "setStartScreenDocumentStep", "setStartScreenStep", "step", "start", "context", "Landroid/content/Context;", "currentFragment", "Landroidx/fragment/app/Fragment;", "startForResult", "activity", "Landroid/app/Activity;", "requestCode", "", "Companion", "kyc_release"})
/* compiled from: KycBuilder.kt */
public final class e {
    public static final a dsa = new a();
    private KycCaller drP = KycCaller.OTHER;
    private KycStepType drQ;
    private ArrayList<KycStepType> drR;
    private KycVerificationContext drS;
    private boolean drT;
    private String drU;
    private boolean drV;
    private boolean drW;
    private boolean drX = true;
    private final Map<String, Parcelable> drY = new LinkedHashMap();
    private final Map<String, Parcelable> drZ = this.drY;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\u00020\u00048\u0006XT¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0002R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\r"}, bng = {"Lcom/iqoption/kyc/KycBuilder$Companion;", "", "()V", "ARG_KYC_START_STEPS", "", "ARG_KYC_STATE", "ARG_KYC_STATE$annotations", "ARG_ONLY_SCREEN", "ARG_RETURN_TO_PARENT", "ARG_SHOW_DEPOSIT_AFTER_FINISH", "ARG_VERIFICATION_CONTEXT", "SHOW_DEPOSIT_PAGE", "START_FROM_ACTIVITY", "kyc_release"})
    /* compiled from: KycBuilder.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    public final void a(KycCaller kycCaller) {
        kotlin.jvm.internal.i.f(kycCaller, "<set-?>");
        this.drP = kycCaller;
    }

    public final KycCaller aIG() {
        return this.drP;
    }

    public final KycStepType aIH() {
        return this.drQ;
    }

    public final void e(KycStepType kycStepType) {
        this.drQ = kycStepType;
    }

    public final ArrayList<KycStepType> aII() {
        return this.drR;
    }

    public final KycVerificationContext aIJ() {
        return this.drS;
    }

    public final void c(KycVerificationContext kycVerificationContext) {
        this.drS = kycVerificationContext;
    }

    public final void f(KycStepType kycStepType) {
        ArrayList L;
        if (kycStepType != null) {
            L = m.L(kycStepType);
        } else {
            L = null;
        }
        this.drR = L;
    }

    public final void aIK() {
        this.drR = m.L(KycStepType.KYC_DOCUMENTS_POI, KycStepType.KYC_DOCUMENTS_POA);
    }

    public final void ei(boolean z) {
        this.drT = z;
    }

    public final void iE(String str) {
        this.drU = str;
    }

    public final boolean aIL() {
        return this.drV;
    }

    public final void ej(boolean z) {
        this.drV = z;
    }

    public final void ek(boolean z) {
        this.drW = z;
    }

    public final boolean asT() {
        return this.drX;
    }

    public final void el(boolean z) {
        this.drX = z;
    }

    public final Map<String, Parcelable> aIM() {
        return this.drZ;
    }

    public final void ai(Fragment fragment) {
        kotlin.jvm.internal.i.f(fragment, "currentFragment");
        h.dsg.aIX().a(fragment, this);
    }

    public final void bA(Context context) {
        kotlin.jvm.internal.i.f(context, "context");
        h.dsg.aIX().a(context, this);
    }
}
