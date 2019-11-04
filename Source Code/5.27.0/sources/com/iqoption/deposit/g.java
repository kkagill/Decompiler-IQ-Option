package com.iqoption.deposit;

import android.app.Activity;
import com.iqoption.core.d;
import com.iqoption.deposit.light.LightDepositActivity;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0002J.\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rH\u0007¨\u0006\u000e"}, bng = {"Lcom/iqoption/deposit/DepositFactory;", "", "()V", "getAllowedOrientation", "", "startActivity", "", "activity", "Landroid/app/Activity;", "openedByUser", "", "isReturnToParent", "initSelection", "Lcom/iqoption/deposit/InitSelectOption;", "app_optionXRelease"})
/* compiled from: DepositFactory.kt */
public final class g {
    public static final g cwI = new g();

    public static final void a(Activity activity, boolean z) {
        a(activity, z, false, null, 12, null);
    }

    public static final void a(Activity activity, boolean z, boolean z2) {
        a(activity, z, z2, null, 8, null);
    }

    private g() {
    }

    public static /* synthetic */ void a(Activity activity, boolean z, boolean z2, l lVar, int i, Object obj) {
        if ((i & 4) != 0) {
            z2 = false;
        }
        if ((i & 8) != 0) {
            lVar = (l) null;
        }
        a(activity, z, z2, lVar);
    }

    public static final void a(Activity activity, boolean z, boolean z2, l lVar) {
        kotlin.jvm.internal.i.f(activity, "activity");
        if (z) {
            d.EC().a("deposit_try", null);
        }
        LightDepositActivity.cEx.a(activity, cwI.aol(), z2, lVar);
    }

    /* JADX WARNING: Missing block: B:3:0x0010, code skipped:
            if (r0 != null) goto L_0x0015;
     */
    private final int aol() {
        /*
        r4 = this;
        r0 = com.iqoption.app.managers.feature.c.Iw();
        r1 = "experimental-deposit-page";
        r0 = r0.ei(r1);
        if (r0 == 0) goto L_0x0013;
    L_0x000c:
        r0 = r0.getStatus();
        if (r0 == 0) goto L_0x0013;
    L_0x0012:
        goto L_0x0015;
    L_0x0013:
        r0 = "disabled";
    L_0x0015:
        r1 = r0.hashCode();
        r2 = -2059248520; // 0xffffffff85425c78 float:-9.13882E-36 double:NaN;
        r3 = 7;
        if (r1 == r2) goto L_0x003b;
    L_0x001f:
        r2 = -1619565966; // 0xffffffff9f776272 float:-5.2385717E-20 double:NaN;
        if (r1 == r2) goto L_0x0034;
    L_0x0024:
        r2 = 1631266500; // 0x613b26c4 float:2.157709E20 double:8.05952737E-315;
        if (r1 == r2) goto L_0x002a;
    L_0x0029:
        goto L_0x0044;
    L_0x002a:
        r1 = "light-landscape";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0044;
    L_0x0032:
        r3 = 6;
        goto L_0x0044;
    L_0x0034:
        r1 = "light-portrait";
        r0 = r0.equals(r1);
        goto L_0x0044;
    L_0x003b:
        r1 = "light-both-mode";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0044;
    L_0x0043:
        r3 = 4;
    L_0x0044:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.deposit.g.aol():int");
    }
}
