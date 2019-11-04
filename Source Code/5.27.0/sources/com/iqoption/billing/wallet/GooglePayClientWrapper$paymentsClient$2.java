package com.iqoption.billing.wallet;

import com.google.android.gms.wallet.PaymentsClient;
import com.google.android.gms.wallet.Wallet;
import com.google.android.gms.wallet.Wallet.WalletOptions.Builder;
import com.iqoption.core.d;
import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, bng = {"<anonymous>", "Lcom/google/android/gms/wallet/PaymentsClient;", "kotlin.jvm.PlatformType", "invoke"})
/* compiled from: GooglePayClientWrapper.kt */
final class GooglePayClientWrapper$paymentsClient$2 extends Lambda implements a<PaymentsClient> {
    public static final GooglePayClientWrapper$paymentsClient$2 azE = new GooglePayClientWrapper$paymentsClient$2();

    GooglePayClientWrapper$paymentsClient$2() {
        super(0);
    }

    /* renamed from: KI */
    public final PaymentsClient invoke() {
        return Wallet.getPaymentsClient(d.Uo(), new Builder().setEnvironment(a.azB.KF()).build());
    }
}
