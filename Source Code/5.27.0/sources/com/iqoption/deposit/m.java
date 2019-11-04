package com.iqoption.deposit;

import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a6\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t¨\u0006\u000b"}, bng = {"getCashboxItemToSelect", "Lcom/iqoption/core/microservices/billing/response/deposit/cashboxitem/CashboxItem;", "cashbox", "Lcom/iqoption/core/microservices/billing/response/deposit/CashboxCounting;", "selectedItemId", "", "initSelection", "Lcom/iqoption/deposit/InitSelectOption;", "selectFirstIfNoSelection", "", "allowGooglePay", "deposit_release"})
/* compiled from: MethodSelectionHelper.kt */
public final class m {
    /* JADX WARNING: Removed duplicated region for block: B:67:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00ba  */
    public static final com.iqoption.core.microservices.billing.response.deposit.cashboxitem.a a(com.iqoption.core.microservices.billing.response.deposit.b r8, java.lang.String r9, com.iqoption.deposit.l r10, boolean r11, boolean r12) {
        /*
        r0 = "cashbox";
        kotlin.jvm.internal.i.f(r8, r0);
        r0 = 0;
        r1 = r0;
        r1 = (com.iqoption.core.microservices.billing.response.deposit.cashboxitem.a) r1;
        r12 = r8.cz(r12);
        r1 = r8.aap();
        if (r1 == 0) goto L_0x0039;
    L_0x0013:
        r1 = (java.lang.Iterable) r1;
        r1 = r1.iterator();
    L_0x0019:
        r2 = r1.hasNext();
        if (r2 == 0) goto L_0x0031;
    L_0x001f:
        r2 = r1.next();
        r3 = r2;
        r3 = (com.iqoption.core.microservices.billing.response.deposit.cashboxitem.b) r3;
        r3 = r3.ZK();
        r3 = kotlin.jvm.internal.i.y(r3, r9);
        if (r3 == 0) goto L_0x0019;
    L_0x0030:
        goto L_0x0032;
    L_0x0031:
        r2 = r0;
    L_0x0032:
        r2 = (com.iqoption.core.microservices.billing.response.deposit.cashboxitem.b) r2;
        if (r2 == 0) goto L_0x0039;
    L_0x0036:
        r2 = (com.iqoption.core.microservices.billing.response.deposit.cashboxitem.a) r2;
        goto L_0x0066;
    L_0x0039:
        r1 = r8.aao();
        if (r1 == 0) goto L_0x0062;
    L_0x003f:
        r1 = (java.lang.Iterable) r1;
        r1 = r1.iterator();
    L_0x0045:
        r2 = r1.hasNext();
        if (r2 == 0) goto L_0x005d;
    L_0x004b:
        r2 = r1.next();
        r3 = r2;
        r3 = (com.iqoption.core.microservices.billing.response.deposit.cashboxitem.e) r3;
        r3 = r3.ZK();
        r3 = kotlin.jvm.internal.i.y(r3, r9);
        if (r3 == 0) goto L_0x0045;
    L_0x005c:
        goto L_0x005e;
    L_0x005d:
        r2 = r0;
    L_0x005e:
        r1 = r2;
        r1 = (com.iqoption.core.microservices.billing.response.deposit.cashboxitem.e) r1;
        goto L_0x0063;
    L_0x0062:
        r1 = r0;
    L_0x0063:
        r2 = r1;
        r2 = (com.iqoption.core.microservices.billing.response.deposit.cashboxitem.a) r2;
    L_0x0066:
        if (r2 == 0) goto L_0x0069;
    L_0x0068:
        goto L_0x008b;
    L_0x0069:
        r1 = r12;
        r1 = (java.lang.Iterable) r1;
        r1 = r1.iterator();
    L_0x0070:
        r2 = r1.hasNext();
        if (r2 == 0) goto L_0x0088;
    L_0x0076:
        r2 = r1.next();
        r3 = r2;
        r3 = (com.iqoption.core.microservices.billing.response.deposit.cashboxitem.d) r3;
        r3 = r3.ZK();
        r3 = kotlin.jvm.internal.i.y(r3, r9);
        if (r3 == 0) goto L_0x0070;
    L_0x0087:
        goto L_0x0089;
    L_0x0088:
        r2 = r0;
    L_0x0089:
        r2 = (com.iqoption.core.microservices.billing.response.deposit.cashboxitem.a) r2;
    L_0x008b:
        r9 = 1;
        if (r2 != 0) goto L_0x00a9;
    L_0x008e:
        if (r10 == 0) goto L_0x00a9;
    L_0x0090:
        r1 = r10.aoP();
        if (r1 != r9) goto L_0x00a9;
    L_0x0096:
        r1 = r8.aap();
        if (r1 == 0) goto L_0x00a5;
    L_0x009c:
        r1 = (java.util.List) r1;
        r1 = kotlin.collections.u.bV(r1);
        r1 = (com.iqoption.core.microservices.billing.response.deposit.cashboxitem.b) r1;
        goto L_0x00a6;
    L_0x00a5:
        r1 = r0;
    L_0x00a6:
        r2 = r1;
        r2 = (com.iqoption.core.microservices.billing.response.deposit.cashboxitem.a) r2;
    L_0x00a9:
        if (r2 != 0) goto L_0x00dd;
    L_0x00ab:
        if (r10 == 0) goto L_0x00dd;
    L_0x00ad:
        r1 = r12;
        r1 = (java.lang.Iterable) r1;
        r1 = r1.iterator();
    L_0x00b4:
        r2 = r1.hasNext();
        if (r2 == 0) goto L_0x00da;
    L_0x00ba:
        r2 = r1.next();
        r3 = r2;
        r3 = (com.iqoption.core.microservices.billing.response.deposit.cashboxitem.d) r3;
        r3 = r3.getId();
        r5 = r10.aoO();
        if (r5 != 0) goto L_0x00cc;
    L_0x00cb:
        goto L_0x00d6;
    L_0x00cc:
        r5 = r5.longValue();
        r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r7 != 0) goto L_0x00d6;
    L_0x00d4:
        r3 = 1;
        goto L_0x00d7;
    L_0x00d6:
        r3 = 0;
    L_0x00d7:
        if (r3 == 0) goto L_0x00b4;
    L_0x00d9:
        goto L_0x00db;
    L_0x00da:
        r2 = r0;
    L_0x00db:
        r2 = (com.iqoption.core.microservices.billing.response.deposit.cashboxitem.a) r2;
    L_0x00dd:
        if (r11 == 0) goto L_0x0157;
    L_0x00df:
        if (r2 != 0) goto L_0x0157;
    L_0x00e1:
        r10 = r8.aap();
        if (r10 == 0) goto L_0x00f4;
    L_0x00e7:
        r10 = (java.util.List) r10;
        r10 = kotlin.collections.u.bV(r10);
        r10 = (com.iqoption.core.microservices.billing.response.deposit.cashboxitem.b) r10;
        if (r10 == 0) goto L_0x00f4;
    L_0x00f1:
        r10 = (com.iqoption.core.microservices.billing.response.deposit.cashboxitem.a) r10;
        goto L_0x0107;
    L_0x00f4:
        r8 = r8.aao();
        if (r8 == 0) goto L_0x0103;
    L_0x00fa:
        r8 = (java.util.List) r8;
        r8 = kotlin.collections.u.bV(r8);
        r8 = (com.iqoption.core.microservices.billing.response.deposit.cashboxitem.e) r8;
        goto L_0x0104;
    L_0x0103:
        r8 = r0;
    L_0x0104:
        r10 = r8;
        r10 = (com.iqoption.core.microservices.billing.response.deposit.cashboxitem.a) r10;
    L_0x0107:
        if (r10 == 0) goto L_0x010a;
    L_0x0109:
        goto L_0x012a;
    L_0x010a:
        r8 = r12;
        r8 = (java.lang.Iterable) r8;
        r8 = r8.iterator();
    L_0x0111:
        r10 = r8.hasNext();
        if (r10 == 0) goto L_0x0127;
    L_0x0117:
        r10 = r8.next();
        r11 = r10;
        r11 = (com.iqoption.core.microservices.billing.response.deposit.cashboxitem.d) r11;
        r11 = (com.iqoption.core.microservices.billing.response.deposit.cashboxitem.a) r11;
        r11 = com.iqoption.core.microservices.billing.response.deposit.c.a(r11);
        if (r11 == 0) goto L_0x0111;
    L_0x0126:
        goto L_0x0128;
    L_0x0127:
        r10 = r0;
    L_0x0128:
        r10 = (com.iqoption.core.microservices.billing.response.deposit.cashboxitem.a) r10;
    L_0x012a:
        if (r10 == 0) goto L_0x012d;
    L_0x012c:
        goto L_0x014c;
    L_0x012d:
        r8 = r12;
        r8 = (java.lang.Iterable) r8;
        r8 = r8.iterator();
    L_0x0134:
        r10 = r8.hasNext();
        if (r10 == 0) goto L_0x0149;
    L_0x013a:
        r10 = r8.next();
        r11 = r10;
        r11 = (com.iqoption.core.microservices.billing.response.deposit.cashboxitem.d) r11;
        r11 = r11.aaE();
        r11 = r11 ^ r9;
        if (r11 == 0) goto L_0x0134;
    L_0x0148:
        goto L_0x014a;
    L_0x0149:
        r10 = r0;
    L_0x014a:
        r10 = (com.iqoption.core.microservices.billing.response.deposit.cashboxitem.a) r10;
    L_0x014c:
        if (r10 == 0) goto L_0x0150;
    L_0x014e:
        r2 = r10;
        goto L_0x0157;
    L_0x0150:
        r8 = kotlin.collections.u.bV(r12);
        r8 = (com.iqoption.core.microservices.billing.response.deposit.cashboxitem.a) r8;
        r2 = r8;
    L_0x0157:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.deposit.m.a(com.iqoption.core.microservices.billing.response.deposit.b, java.lang.String, com.iqoption.deposit.l, boolean, boolean):com.iqoption.core.microservices.billing.response.deposit.cashboxitem.a");
    }
}
