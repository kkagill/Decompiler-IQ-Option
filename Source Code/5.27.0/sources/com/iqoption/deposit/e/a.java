package com.iqoption.deposit.e;

import com.google.gson.reflect.TypeToken;
import com.iqoption.billing.wallet.c;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b¨\u0006\f"}, bng = {"Lcom/iqoption/deposit/wallet/GooglePayResultHandler;", "", "()V", "handleActivityResult", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "deposit_release"})
/* compiled from: GooglePayResultHandler.kt */
public final class a {

    @i(bne = {1, 1, 15}, bnf = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0003"}, bng = {"com/iqoption/core/ext/GsonExt$typeOf$1", "Lcom/google/gson/reflect/TypeToken;", "core_release", "com/iqoption/core/ext/GsonExt$fromGson$$inlined$typeOf$2"})
    /* compiled from: GsonExtensions.kt */
    public static final class a extends TypeToken<c> {
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0026 A:{Catch:{ Exception -> 0x0043 }} */
    public final boolean a(androidx.fragment.app.FragmentActivity r4, int r5, int r6, android.content.Intent r7) {
        /*
        r3 = this;
        r0 = "activity";
        kotlin.jvm.internal.i.f(r4, r0);
        r0 = 500; // 0x1f4 float:7.0E-43 double:2.47E-321;
        if (r5 == r0) goto L_0x000b;
    L_0x0009:
        r4 = 0;
        return r4;
    L_0x000b:
        r5 = -1;
        r0 = 1;
        r1 = 0;
        if (r6 != r5) goto L_0x004a;
    L_0x0010:
        if (r7 == 0) goto L_0x004a;
    L_0x0012:
        r5 = com.google.android.gms.wallet.PaymentData.getFromIntent(r7);	 Catch:{ Exception -> 0x0043 }
        if (r5 == 0) goto L_0x0023;
    L_0x0018:
        r5 = r5.getPaymentMethodToken();	 Catch:{ Exception -> 0x0043 }
        if (r5 == 0) goto L_0x0023;
    L_0x001e:
        r5 = r5.getToken();	 Catch:{ Exception -> 0x0043 }
        goto L_0x0024;
    L_0x0023:
        r5 = r1;
    L_0x0024:
        if (r5 == 0) goto L_0x0043;
    L_0x0026:
        r6 = com.iqoption.core.d.Um();	 Catch:{ Exception -> 0x0043 }
        r6 = r6.Ez();	 Catch:{ Exception -> 0x0043 }
        r7 = new com.iqoption.deposit.e.a$a;	 Catch:{ Exception -> 0x0043 }
        r7.<init>();	 Catch:{ Exception -> 0x0043 }
        r7 = r7.getType();	 Catch:{ Exception -> 0x0043 }
        r2 = "object : TypeToken<T>() {}.type";
        kotlin.jvm.internal.i.e(r7, r2);	 Catch:{ Exception -> 0x0043 }
        r5 = r6.fromJson(r5, r7);	 Catch:{ Exception -> 0x0043 }
        r5 = (com.iqoption.billing.wallet.c) r5;	 Catch:{ Exception -> 0x0043 }
        goto L_0x0044;
    L_0x0043:
        r5 = r1;
    L_0x0044:
        r6 = new com.iqoption.billing.wallet.b;
        r6.<init>(r5, r1);
        goto L_0x005b;
    L_0x004a:
        if (r6 != r0) goto L_0x0056;
    L_0x004c:
        r5 = com.google.android.gms.wallet.AutoResolveHelper.getStatusFromIntent(r7);
        r6 = new com.iqoption.billing.wallet.b;
        r6.<init>(r1, r5);
        goto L_0x005b;
    L_0x0056:
        r6 = new com.iqoption.billing.wallet.b;
        r6.<init>(r1, r1);
    L_0x005b:
        r5 = com.iqoption.deposit.j.cwW;
        r4 = r5.m(r4);
        r4.a(r6);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.deposit.e.a.a(androidx.fragment.app.FragmentActivity, int, int, android.content.Intent):boolean");
    }
}
