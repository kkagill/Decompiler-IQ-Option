package com.iqoption.kyc.pro;

import android.app.TaskStackBuilder;
import android.content.Intent;
import android.os.Bundle;
import androidx.core.app.NavUtils;
import androidx.fragment.app.Fragment;
import com.iqoption.core.microservices.kyc.response.KycVerificationContext;
import com.iqoption.core.microservices.kyc.response.step.KycStepType;
import com.iqoption.core.ui.d.c;
import com.iqoption.kyc.KycCaller;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\t\u001a\u00020\u0004H\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016¨\u0006\f"}, bng = {"Lcom/iqoption/kyc/pro/ProKycNavigatorFragment;", "Lcom/iqoption/kyc/navigator/KycNavigatorFragment;", "()V", "close", "", "navigateToParent", "returnToParent", "", "showDepositAfterFinish", "openDeposit", "openTraderoom", "Companion", "app_optionXRelease"})
/* compiled from: ProKycNavigatorFragment.kt */
public final class b extends com.iqoption.kyc.navigator.a {
    public static final a dBj = new a();
    private HashMap apm;

    @i(bne = {1, 1, 15}, bnf = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JN\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u001a\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\b\u0018\u00010\nj\n\u0012\u0004\u0012\u00020\b\u0018\u0001`\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¨\u0006\u0011"}, bng = {"Lcom/iqoption/kyc/pro/ProKycNavigatorFragment$Companion;", "", "()V", "createNavigatorEntry", "Lcom/iqoption/core/ui/navigation/NavigatorEntry;", "kycCaller", "Lcom/iqoption/kyc/KycCaller;", "onlyScreen", "Lcom/iqoption/core/microservices/kyc/response/step/KycStepType;", "startSteps", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "showDepositAfterFinish", "", "returnToParent", "verificationContext", "Lcom/iqoption/core/microservices/kyc/response/KycVerificationContext;", "app_optionXRelease"})
    /* compiled from: ProKycNavigatorFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final c a(KycCaller kycCaller, KycStepType kycStepType, ArrayList<KycStepType> arrayList, boolean z, boolean z2, KycVerificationContext kycVerificationContext) {
            KycCaller kycCaller2 = kycCaller;
            kotlin.jvm.internal.i.f(kycCaller2, "kycCaller");
            String Bx = com.iqoption.kyc.navigator.a.dAF.Bx();
            Class cls = b.class;
            Bundle bundle = new Bundle();
            bundle.putSerializable("ARG_KYC_CALLER", kycCaller2);
            if (kycStepType != null) {
                bundle.putSerializable("ARG_NAV_ONLY_SCREEN", kycStepType);
            }
            if (arrayList != null) {
                bundle.putSerializable("ARG_NAV_KYC_START_STEPS", arrayList);
            }
            bundle.putBoolean("ARG_NAV_RETURN_TO_PARENT", z2);
            bundle.putBoolean("ARG_NAV_SHOW_DEPOSIT_AFTER_FINISH", z);
            if (kycVerificationContext != null) {
                bundle.putSerializable("ARG_VERIFICATION_CONTEXT", kycVerificationContext);
            }
            return new c(Bx, cls, bundle, 0, 0, 0, 0, null, null, null, null, 2040, null);
        }
    }

    public void Bj() {
        HashMap hashMap = this.apm;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        Bj();
    }

    public void Ao() {
        j(asT(), true);
    }

    public void aLG() {
        j(asT(), false);
    }

    public void close() {
        j(asT(), aIL());
    }

    private final void j(boolean z, boolean z2) {
        if (getActivity() != null) {
            Fragment findFragmentById = alE().alH().findFragmentById(KW());
            if (findFragmentById != null && (findFragmentById instanceof com.iqoption.kyc.a.b)) {
                com.iqoption.kyc.a.b bVar = (com.iqoption.kyc.a.b) findFragmentById;
                com.iqoption.kyc.a.a.j(bVar.aKn(), bVar.aKo(), aLz().Er());
            }
            if (z) {
                Intent parentActivityIntent = NavUtils.getParentActivityIntent(com.iqoption.core.ext.a.r(this));
                if (parentActivityIntent == null) {
                    kotlin.jvm.internal.i.bnJ();
                }
                Bundle extras = parentActivityIntent.getExtras();
                if (extras == null) {
                    extras = new Bundle();
                }
                extras.putBoolean("START_FROM_ACTIVITY", true);
                extras.putBoolean("SHOW_DEPOSIT_PAGE", z2);
                parentActivityIntent.putExtras(extras);
                if (NavUtils.shouldUpRecreateTask(com.iqoption.core.ext.a.r(this), parentActivityIntent) || com.iqoption.core.ext.a.r(this).isTaskRoot()) {
                    com.iqoption.core.util.a.i(com.iqoption.core.ext.a.r(this));
                    TaskStackBuilder.create(com.iqoption.core.ext.a.q(this)).addNextIntentWithParentStack(parentActivityIntent).startActivities();
                } else {
                    parentActivityIntent.setFlags(67108864);
                    NavUtils.navigateUpTo(com.iqoption.core.ext.a.r(this), parentActivityIntent);
                }
                return;
            }
            com.iqoption.core.ext.a.r(this).finish();
        }
    }
}
