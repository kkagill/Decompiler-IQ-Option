package com.iqoption.kyc;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.iqoption.core.ext.c;
import com.jumio.dv.DocumentVerificationSDK;
import com.jumio.nv.NetverifySDK;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH&J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH&J\u0018\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H&J\u0018\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012H&J \u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u0005H&J \u0010\u0013\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0017"}, bng = {"Lcom/iqoption/kyc/KycProvider;", "", "canHandleActivityResult", "", "requestCode", "", "extractErrorMessage", "", "throwable", "", "showSupport", "", "currentFragment", "Landroidx/fragment/app/Fragment;", "start", "context", "Landroid/content/Context;", "builder", "Lcom/iqoption/kyc/KycBuilder;", "startForResult", "activity", "Landroid/app/Activity;", "Companion", "kyc_release"})
/* compiled from: KycProvider.kt */
public interface h {
    public static final a dsg = a.dsi;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, bng = {"Lcom/iqoption/kyc/KycProvider$Companion;", "", "()V", "instance", "Lcom/iqoption/kyc/KycProvider;", "getInstance", "()Lcom/iqoption/kyc/KycProvider;", "setInstance", "(Lcom/iqoption/kyc/KycProvider;)V", "kyc_release"})
    /* compiled from: KycProvider.kt */
    public static final class a {
        public static h dsh;
        static final /* synthetic */ a dsi = new a();

        private a() {
        }

        public final void a(h hVar) {
            kotlin.jvm.internal.i.f(hVar, "<set-?>");
            dsh = hVar;
        }

        public final h aIX() {
            h hVar = dsh;
            if (hVar == null) {
                kotlin.jvm.internal.i.lG("instance");
            }
            return hVar;
        }
    }

    @i(bne = {1, 1, 15})
    /* compiled from: KycProvider.kt */
    public static final class b {
        public static boolean a(h hVar, int i) {
            return c.b(Integer.valueOf(i), Integer.valueOf(NetverifySDK.REQUEST_CODE), Integer.valueOf(DocumentVerificationSDK.REQUEST_CODE));
        }
    }

    String K(Throwable th);

    void a(Context context, e eVar);

    void a(Fragment fragment, e eVar);

    void al(Fragment fragment);

    boolean gk(int i);
}
