package com.iqoption.kyc.pro;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.iqoption.chat.ChatActivity;
import com.iqoption.core.microservices.chat.response.ChatRoomType;
import com.iqoption.dto.entity.result.KycState;
import com.iqoption.kyc.e;
import com.iqoption.kyc.h;
import com.iqoption.kyc.h.b;
import java.util.ArrayList;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0014\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\bH\u0016J \u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J \u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016¨\u0006\u0018"}, bng = {"Lcom/iqoption/kyc/pro/KycProviderImpl;", "Lcom/iqoption/kyc/KycProvider;", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "builder", "Lcom/iqoption/kyc/KycBuilder;", "extractErrorMessage", "", "throwable", "", "showSupport", "", "currentFragment", "Landroidx/fragment/app/Fragment;", "start", "startForResult", "activity", "Landroid/app/Activity;", "requestCode", "", "Companion", "app_optionXRelease"})
/* compiled from: KycProviderImpl.kt */
public final class a implements h {
    public static final a dBg = new a();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, bng = {"Lcom/iqoption/kyc/pro/KycProviderImpl$Companion;", "", "()V", "ARG_IS_HIDE_INTRO_SKIP", "", "ARG_KYC_SKIP_CYSEC", "ARG_KYC_START_SCREEN_TAG", "init", "", "app_optionXRelease"})
    /* compiled from: KycProviderImpl.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final void init() {
            h.dsg.a(new a());
        }
    }

    public static final void init() {
        dBg.init();
    }

    public boolean gk(int i) {
        return b.a(this, i);
    }

    public void al(Fragment fragment) {
        kotlin.jvm.internal.i.f(fragment, "currentFragment");
        ChatActivity.aNV.a(com.iqoption.core.ext.a.q(fragment), null, ChatRoomType.SUPPORT);
    }

    public String K(Throwable th) {
        return th != null ? com.iqoption.service.websocket.a.K(th) : null;
    }

    public void a(Fragment fragment, e eVar) {
        kotlin.jvm.internal.i.f(fragment, "currentFragment");
        kotlin.jvm.internal.i.f(eVar, "builder");
        fragment.startActivity(b(com.iqoption.core.ext.a.q(fragment), eVar));
    }

    public void a(Context context, e eVar) {
        kotlin.jvm.internal.i.f(context, "context");
        kotlin.jvm.internal.i.f(eVar, "builder");
        context.startActivity(b(context, eVar));
    }

    private final Intent b(Context context, e eVar) {
        KycState kycState = (KycState) eVar.aIM().get("ARG_KYC_STATE");
        Intent intent = new Intent(context, ProKycActivity.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("ARG_KYC_CALLER", eVar.aIG());
        ArrayList aII = eVar.aII();
        if (aII != null) {
            bundle.putSerializable("ARG_KYC_START_STEPS", aII);
        }
        bundle.putBoolean("ARG_SHOW_DEPOSIT_AFTER_FINISH", eVar.aIL());
        bundle.putBoolean("ARG_RETURN_TO_PARENT", eVar.asT());
        if (eVar.aIH() != null) {
            bundle.putSerializable("ARG_ONLY_SCREEN", eVar.aIH());
        }
        if (eVar.aIJ() != null) {
            bundle.putSerializable("ARG_VERIFICATION_CONTEXT", eVar.aIJ());
        }
        intent.putExtras(bundle);
        return intent;
    }
}
