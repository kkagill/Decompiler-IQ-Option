package com.iqoption.portfolio.component.a;

import android.text.style.ForegroundColorSpan;
import com.iqoption.core.util.i;
import com.iqoption.e.rj;
import com.iqoption.e.ut;
import com.iqoption.portfolio.component.b.h;
import com.iqoption.portfolio.component.l;
import com.iqoption.portfolio.component.m;
import com.iqoption.util.ai;

/* compiled from: ExpInfoBinder */
public class c {
    private final l dLR;
    private final m dLU;

    public c(l lVar) {
        this.dLR = lVar;
        this.dLU = lVar.aRX();
    }

    public void a(ut utVar, h hVar) {
        utVar.caj.setText(i.ay(hVar.aim()));
        utVar.cag.setText(this.dLU.v(hVar.aQA().getInvest()));
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x013b  */
    public void b(com.iqoption.e.ut r12, com.iqoption.portfolio.component.b.h r13) {
        /*
        r11 = this;
        r0 = r13.aQA();
        r1 = r0.aQt();
        if (r1 == 0) goto L_0x0025;
    L_0x000a:
        r1 = r12.cnO;
        r2 = r11.dLU;
        r2 = r2.amj;
        r1.setTextColor(r2);
        r1 = r12.cnO;
        r2 = r0.aQs();
        r2 = java.lang.Double.valueOf(r2);
        r2 = com.iqoption.core.util.af.d(r2);
        r1.setText(r2);
        goto L_0x0050;
    L_0x0025:
        r1 = r0.aQu();
        if (r1 == 0) goto L_0x004a;
    L_0x002b:
        r1 = r12.cnO;
        r2 = r11.dLU;
        r2 = r2.amk;
        r1.setTextColor(r2);
        r1 = r12.cnO;
        r2 = r0.aQs();
        r2 = java.lang.Math.abs(r2);
        r2 = java.lang.Double.valueOf(r2);
        r2 = com.iqoption.core.util.af.e(r2);
        r1.setText(r2);
        goto L_0x0050;
    L_0x004a:
        r1 = r12.cnO;
        r2 = 0;
        r1.setText(r2);
    L_0x0050:
        r1 = r13.aRF();
        r2 = 8;
        r3 = 0;
        if (r1 == 0) goto L_0x008c;
    L_0x0059:
        r1 = r12.cnU;
        r4 = r11.dLU;
        r4 = r4.dMK;
        r5 = r13.aRD();
        r4 = r4.format(r5);
        r1.setText(r4);
        r1 = r12.cnQ;
        r4 = r11.dLU;
        r5 = r13.aRE();
        r7 = r13.aRG();
        r8 = r13.aRI();
        r4 = r4.a(r5, r7, r8);
        r1.setText(r4);
        r1 = r12.cnV;
        r1.setVisibility(r3);
        r1 = r12.cnS;
        r1.setVisibility(r3);
        goto L_0x0096;
    L_0x008c:
        r1 = r12.cnV;
        r1.setVisibility(r2);
        r1 = r12.cnS;
        r1.setVisibility(r2);
    L_0x0096:
        r1 = r0.aQq();
        r4 = 1;
        if (r1 == 0) goto L_0x00d1;
    L_0x009d:
        r1 = r12.cnT;
        r5 = r11.dLU;
        r6 = r0.getSellPnl();
        r5 = r5.v(r6);
        r5 = com.iqoption.core.util.af.hu(r5);
        r6 = r11.dLU;
        r6 = r6.dMS;
        r7 = r11.dLU;
        r7 = r7.dMw;
        r8 = new java.lang.Object[r4];
        r9 = r0.aQp();
        r9 = java.lang.Double.valueOf(r9);
        r9 = com.iqoption.core.util.af.d(r9);
        r8[r3] = r9;
        r7 = java.lang.String.format(r7, r8);
        r5 = r11.b(r5, r6, r7);
        r1.setText(r5);
        goto L_0x0112;
    L_0x00d1:
        r1 = r0.aQr();
        if (r1 == 0) goto L_0x0114;
    L_0x00d7:
        r1 = r12.cnT;
        r5 = r11.dLU;
        r6 = r0.getSellPnl();
        r6 = java.lang.Math.abs(r6);
        r5 = r5.v(r6);
        r5 = com.iqoption.core.util.af.hv(r5);
        r6 = r11.dLU;
        r6 = r6.dMT;
        r7 = r11.dLU;
        r7 = r7.dMw;
        r8 = new java.lang.Object[r4];
        r9 = r0.aQp();
        r9 = java.lang.Math.abs(r9);
        r9 = java.lang.Double.valueOf(r9);
        r9 = com.iqoption.core.util.af.e(r9);
        r8[r3] = r9;
        r7 = java.lang.String.format(r7, r8);
        r5 = r11.b(r5, r6, r7);
        r1.setText(r5);
    L_0x0112:
        r1 = 1;
        goto L_0x011e;
    L_0x0114:
        r1 = r12.cnT;
        r5 = r11.dLU;
        r5 = r5.dgF;
        r1.setText(r5);
        r1 = 0;
    L_0x011e:
        r5 = r12.cnj;
        r6 = r11.dLU;
        r7 = r13.aRI();
        r8 = r13.aRH();
        r6 = r6.d(r7, r8);
        r5.setText(r6);
        r5 = r11.dLR;
        r13 = r5.e(r13);
        r5 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        if (r13 == 0) goto L_0x0151;
    L_0x013b:
        r13 = r12.cnK;
        r13.setEnabled(r3);
        r13 = r12.cnK;
        r13.setAlpha(r5);
        r13 = r12.cnL;
        r13.setVisibility(r2);
        r12 = r12.cnM;
        r12.setVisibility(r3);
        goto L_0x01dc;
    L_0x0151:
        r13 = r12.cnL;
        r13.setVisibility(r3);
        r13 = r12.cnM;
        r13.setVisibility(r2);
        r13 = r0.aQn();
        if (r13 == 0) goto L_0x018e;
    L_0x0161:
        r13 = r12.cnL;
        r1 = r11.dLU;
        r1 = r1.dMz;
        r2 = new java.lang.Object[r4];
        r6 = java.util.concurrent.TimeUnit.MILLISECONDS;
        r7 = r0.aQo();
        r6 = r6.toSeconds(r7);
        r8 = 1;
        r6 = r6 + r8;
        r0 = java.lang.Long.valueOf(r6);
        r2[r3] = r0;
        r0 = java.lang.String.format(r1, r2);
        r13.setText(r0);
        r13 = r12.cnK;
        r13.setEnabled(r4);
        r12 = r12.cnK;
        r12.setAlpha(r5);
        goto L_0x01dc;
    L_0x018e:
        if (r1 == 0) goto L_0x01bb;
    L_0x0190:
        r13 = r11.dLU;
        r1 = r0.getInvest();
        r6 = r0.getSellPnl();
        r1 = r1 + r6;
        r13 = r13.v(r1);
        r0 = r12.cnL;
        r1 = r11.dLU;
        r1 = r1.dMy;
        r2 = new java.lang.Object[r4];
        r2[r3] = r13;
        r13 = java.lang.String.format(r1, r2);
        r0.setText(r13);
        r13 = r12.cnK;
        r13.setEnabled(r4);
        r12 = r12.cnK;
        r12.setAlpha(r5);
        goto L_0x01dc;
    L_0x01bb:
        r13 = r12.cnL;
        r0 = r11.dLU;
        r0 = r0.dMy;
        r1 = new java.lang.Object[r4];
        r2 = r11.dLU;
        r2 = r2.dgF;
        r1[r3] = r2;
        r0 = java.lang.String.format(r0, r1);
        r13.setText(r0);
        r13 = r12.cnK;
        r13.setEnabled(r3);
        r12 = r12.cnK;
        r13 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r12.setAlpha(r13);
    L_0x01dc:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.portfolio.component.a.c.b(com.iqoption.e.ut, com.iqoption.portfolio.component.b.h):void");
    }

    private CharSequence b(String str, ForegroundColorSpan foregroundColorSpan, String str2) {
        return new ai().cs(foregroundColorSpan).jP(str).aWX().jP(" ").jP(str2).anA();
    }

    public void a(rj rjVar, h hVar) {
        rjVar.caj.setText(i.ay(hVar.aim()));
        rjVar.cag.setText(this.dLU.v(hVar.aQA().getInvest()));
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0109  */
    public void b(com.iqoption.e.rj r11, com.iqoption.portfolio.component.b.h r12) {
        /*
        r10 = this;
        r0 = r12.aQA();
        r1 = r0.aQt();
        if (r1 == 0) goto L_0x0025;
    L_0x000a:
        r1 = r11.cnO;
        r2 = r10.dLU;
        r2 = r2.amj;
        r1.setTextColor(r2);
        r1 = r11.cnO;
        r2 = r0.aQs();
        r2 = java.lang.Double.valueOf(r2);
        r2 = com.iqoption.core.util.af.d(r2);
        r1.setText(r2);
        goto L_0x0050;
    L_0x0025:
        r1 = r0.aQu();
        if (r1 == 0) goto L_0x004a;
    L_0x002b:
        r1 = r11.cnO;
        r2 = r10.dLU;
        r2 = r2.amk;
        r1.setTextColor(r2);
        r1 = r11.cnO;
        r2 = r0.aQs();
        r2 = java.lang.Math.abs(r2);
        r2 = java.lang.Double.valueOf(r2);
        r2 = com.iqoption.core.util.af.e(r2);
        r1.setText(r2);
        goto L_0x0050;
    L_0x004a:
        r1 = r11.cnO;
        r2 = 0;
        r1.setText(r2);
    L_0x0050:
        r1 = r12.aRF();
        r2 = 8;
        r3 = 0;
        if (r1 == 0) goto L_0x008c;
    L_0x0059:
        r1 = r11.cnU;
        r4 = r10.dLU;
        r4 = r4.dMK;
        r5 = r12.aRD();
        r4 = r4.format(r5);
        r1.setText(r4);
        r1 = r11.cnQ;
        r4 = r10.dLU;
        r5 = r12.aRE();
        r7 = r12.aRG();
        r8 = r12.aRI();
        r4 = r4.a(r5, r7, r8);
        r1.setText(r4);
        r1 = r11.cnV;
        r1.setVisibility(r3);
        r1 = r11.cnS;
        r1.setVisibility(r3);
        goto L_0x0096;
    L_0x008c:
        r1 = r11.cnV;
        r1.setVisibility(r2);
        r1 = r11.cnS;
        r1.setVisibility(r2);
    L_0x0096:
        r1 = r0.aQq();
        r4 = 1;
        if (r1 == 0) goto L_0x00ba;
    L_0x009d:
        r1 = r11.cnT;
        r5 = r10.dLU;
        r5 = r5.amj;
        r1.setTextColor(r5);
        r1 = r11.cnT;
        r5 = r10.dLU;
        r6 = r0.getSellPnl();
        r5 = r5.v(r6);
        r5 = com.iqoption.core.util.af.hu(r5);
        r1.setText(r5);
        goto L_0x00e0;
    L_0x00ba:
        r1 = r0.aQr();
        if (r1 == 0) goto L_0x00e2;
    L_0x00c0:
        r1 = r11.cnT;
        r5 = r10.dLU;
        r5 = r5.amk;
        r1.setTextColor(r5);
        r1 = r11.cnT;
        r5 = r10.dLU;
        r6 = r0.getSellPnl();
        r6 = java.lang.Math.abs(r6);
        r5 = r5.v(r6);
        r5 = com.iqoption.core.util.af.hv(r5);
        r1.setText(r5);
    L_0x00e0:
        r1 = 1;
        goto L_0x00ec;
    L_0x00e2:
        r1 = r11.cnT;
        r5 = r10.dLU;
        r5 = r5.dgF;
        r1.setText(r5);
        r1 = 0;
    L_0x00ec:
        r5 = r11.cnj;
        r6 = r10.dLU;
        r7 = r12.aRI();
        r8 = r12.aRH();
        r6 = r6.d(r7, r8);
        r5.setText(r6);
        r5 = r10.dLR;
        r12 = r5.e(r12);
        r5 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        if (r12 == 0) goto L_0x011f;
    L_0x0109:
        r12 = r11.cnK;
        r12.setEnabled(r3);
        r12 = r11.cnK;
        r12.setAlpha(r5);
        r12 = r11.cnL;
        r12.setVisibility(r2);
        r11 = r11.cnM;
        r11.setVisibility(r3);
        goto L_0x01aa;
    L_0x011f:
        r12 = r11.cnL;
        r12.setVisibility(r3);
        r12 = r11.cnM;
        r12.setVisibility(r2);
        r12 = r0.aQn();
        if (r12 == 0) goto L_0x015c;
    L_0x012f:
        r12 = r11.cnL;
        r1 = r10.dLU;
        r1 = r1.dMz;
        r2 = new java.lang.Object[r4];
        r6 = java.util.concurrent.TimeUnit.MILLISECONDS;
        r7 = r0.aQo();
        r6 = r6.toSeconds(r7);
        r8 = 1;
        r6 = r6 + r8;
        r0 = java.lang.Long.valueOf(r6);
        r2[r3] = r0;
        r0 = java.lang.String.format(r1, r2);
        r12.setText(r0);
        r12 = r11.cnK;
        r12.setEnabled(r4);
        r11 = r11.cnK;
        r11.setAlpha(r5);
        goto L_0x01aa;
    L_0x015c:
        if (r1 == 0) goto L_0x0189;
    L_0x015e:
        r12 = r10.dLU;
        r1 = r0.getInvest();
        r6 = r0.getSellPnl();
        r1 = r1 + r6;
        r12 = r12.v(r1);
        r0 = r11.cnL;
        r1 = r10.dLU;
        r1 = r1.dMy;
        r2 = new java.lang.Object[r4];
        r2[r3] = r12;
        r12 = java.lang.String.format(r1, r2);
        r0.setText(r12);
        r12 = r11.cnK;
        r12.setEnabled(r4);
        r11 = r11.cnK;
        r11.setAlpha(r5);
        goto L_0x01aa;
    L_0x0189:
        r12 = r11.cnL;
        r0 = r10.dLU;
        r0 = r0.dMy;
        r1 = new java.lang.Object[r4];
        r2 = r10.dLU;
        r2 = r2.dgF;
        r1[r3] = r2;
        r0 = java.lang.String.format(r0, r1);
        r12.setText(r0);
        r12 = r11.cnK;
        r12.setEnabled(r3);
        r11 = r11.cnK;
        r12 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r11.setAlpha(r12);
    L_0x01aa:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.portfolio.component.a.c.b(com.iqoption.e.rj, com.iqoption.portfolio.component.b.h):void");
    }
}
