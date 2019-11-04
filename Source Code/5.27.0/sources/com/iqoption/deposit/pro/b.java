package com.iqoption.deposit.pro;

import androidx.fragment.app.FragmentActivity;
import com.iqoption.chat.ChatActivity;
import com.iqoption.core.microservices.chat.response.ChatRoomType;
import com.iqoption.core.microservices.kyc.response.KycVerificationContext;
import com.iqoption.core.ui.d.c;
import com.iqoption.deposit.l;
import com.iqoption.kyc.e;
import java.util.HashMap;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001a\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014¨\u0006\u000e"}, bng = {"Lcom/iqoption/deposit/pro/ProDepositNavigatorFragment;", "Lcom/iqoption/deposit/navigator/DepositNavigatorFragment;", "()V", "openSupport", "", "performClose", "navigateToParent", "", "prepareKycBeforeDep", "Lcom/iqoption/kyc/KycBuilder;", "showCysecScreen", "verificationContext", "Lcom/iqoption/core/microservices/kyc/response/KycVerificationContext;", "Companion", "app_optionXRelease"})
/* compiled from: ProDepositNavigatorFragment.kt */
public final class b extends com.iqoption.deposit.navigator.b {
    private static final String TAG;
    public static final a cGA = new a();
    private HashMap apm;

    @i(bne = {1, 1, 15}, bnf = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\r"}, bng = {"Lcom/iqoption/deposit/pro/ProDepositNavigatorFragment$Companion;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "createNavigatorEntry", "Lcom/iqoption/core/ui/navigation/NavigatorEntry;", "selectOption", "Lcom/iqoption/deposit/InitSelectOption;", "returnToParent", "", "app_optionXRelease"})
    /* compiled from: ProDepositNavigatorFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final String Bx() {
            return b.TAG;
        }

        public final c b(l lVar, boolean z) {
            return new c(Bx(), b.class, com.iqoption.deposit.navigator.b.cGp.a(lVar, z), 0, 0, 0, 0, null, null, null, null, 2040, null);
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

    static {
        String name = b.class.getName();
        if (name == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        TAG = name;
    }

    public void apL() {
        ChatActivity.aNV.a(com.iqoption.core.ext.a.q(this), null, ChatRoomType.SUPPORT);
    }

    public void cS(boolean z) {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        if (z) {
            com.iqoption.util.a.b(activity, null);
        } else {
            activity.finish();
        }
    }

    /* Access modifiers changed, original: protected */
    public e b(boolean z, KycVerificationContext kycVerificationContext) {
        e b = super.b(z, kycVerificationContext);
        if (z) {
            b.iE(com.iqoption.kyc.fragment.a.TAG);
        }
        return b;
    }
}
