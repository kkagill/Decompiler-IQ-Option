package com.jumio.bam.gui;

import android.content.Context;
import android.util.AttributeSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import jumio.bam.p;

public class ExpiryEditText extends p {
    private String a;
    private String b;

    public ExpiryEditText(Context context) {
        super(context);
        a();
    }

    public ExpiryEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public ExpiryEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a();
    }

    private void a() {
        this.a = new SimpleDateFormat("MM", Locale.getDefault()).format(new Date());
        this.b = new SimpleDateFormat("yy", Locale.getDefault()).format(new Date());
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:55:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Missing block: B:14:0x0045, code skipped:
            if (r8.equals(r3) != false) goto L_0x00d4;
     */
    /* JADX WARNING: Missing block: B:22:0x005f, code skipped:
            if (r8.equals("2") == false) goto L_0x00d4;
     */
    /* JADX WARNING: Missing block: B:28:0x0076, code skipped:
            if (r8.charAt(0) >= r6.b.charAt(0)) goto L_0x00d3;
     */
    /* JADX WARNING: Missing block: B:47:0x00ca, code skipped:
            if (r2 != null) goto L_0x00d4;
     */
    /* JADX WARNING: Missing block: B:50:0x00d0, code skipped:
            if (r4 != 0) goto L_0x00d4;
     */
    public java.lang.String a(int r7, java.lang.String r8, java.lang.String r9) {
        /*
        r6 = this;
        r0 = 0;
        r1 = r8.charAt(r0);
        r1 = java.lang.Character.isDigit(r1);
        r2 = "1";
        r3 = "0";
        if (r7 != 0) goto L_0x0034;
    L_0x000f:
        r4 = "";
        r4 = r8.equals(r4);
        if (r4 != 0) goto L_0x0034;
    L_0x0017:
        r4 = r8.equals(r3);
        if (r4 != 0) goto L_0x0034;
    L_0x001d:
        r4 = r8.equals(r2);
        if (r4 != 0) goto L_0x0034;
    L_0x0023:
        r7 = new java.lang.StringBuilder;
        r7.<init>();
        r7.append(r3);
        r7.append(r8);
        r8 = r7.toString();
        goto L_0x00d3;
    L_0x0034:
        r4 = 1;
        if (r7 != r4) goto L_0x0063;
    L_0x0037:
        r7 = r9.substring(r0, r4);
        r9 = r7.equals(r3);
        if (r9 == 0) goto L_0x0047;
    L_0x0041:
        r9 = r8.equals(r3);
        if (r9 != 0) goto L_0x00d4;
    L_0x0047:
        r7 = r7.equals(r2);
        if (r7 == 0) goto L_0x00d3;
    L_0x004d:
        r7 = r8.equals(r3);
        if (r7 != 0) goto L_0x00d3;
    L_0x0053:
        r7 = r8.equals(r2);
        if (r7 != 0) goto L_0x00d3;
    L_0x0059:
        r7 = "2";
        r7 = r8.equals(r7);
        if (r7 != 0) goto L_0x00d3;
    L_0x0061:
        goto L_0x00d4;
    L_0x0063:
        r2 = 3;
        if (r7 != r2) goto L_0x0079;
    L_0x0066:
        r7 = r8.length();
        if (r7 == 0) goto L_0x00d4;
    L_0x006c:
        r7 = r8.charAt(r0);
        r9 = r6.b;
        r9 = r9.charAt(r0);
        if (r7 >= r9) goto L_0x00d3;
    L_0x0078:
        goto L_0x00d4;
    L_0x0079:
        r3 = 4;
        if (r7 != r3) goto L_0x00d3;
    L_0x007c:
        r7 = r9.substring(r2, r3);
        r2 = r6.b;
        r2 = r2.substring(r0, r4);
        r7 = r7.equals(r2);
        r2 = r8.length();
        if (r2 == 0) goto L_0x009f;
    L_0x0090:
        r2 = r8.charAt(r0);
        r3 = r6.b;
        r3 = r3.charAt(r4);
        if (r2 >= r3) goto L_0x009d;
    L_0x009c:
        goto L_0x009f;
    L_0x009d:
        r2 = 0;
        goto L_0x00a0;
    L_0x009f:
        r2 = 1;
    L_0x00a0:
        r3 = r8.length();
        if (r3 == 0) goto L_0x00b4;
    L_0x00a6:
        r3 = r8.charAt(r0);
        r5 = r6.b;
        r5 = r5.charAt(r4);
        if (r3 != r5) goto L_0x00b4;
    L_0x00b2:
        r3 = 1;
        goto L_0x00b5;
    L_0x00b4:
        r3 = 0;
    L_0x00b5:
        r5 = 2;
        r9 = r9.substring(r0, r5);
        r9 = java.lang.Integer.parseInt(r9);
        r5 = r6.a;
        r5 = java.lang.Integer.parseInt(r5);
        if (r9 >= r5) goto L_0x00c7;
    L_0x00c6:
        goto L_0x00c8;
    L_0x00c7:
        r4 = 0;
    L_0x00c8:
        if (r7 == 0) goto L_0x00cc;
    L_0x00ca:
        if (r2 != 0) goto L_0x00d4;
    L_0x00cc:
        if (r7 == 0) goto L_0x00d3;
    L_0x00ce:
        if (r3 == 0) goto L_0x00d3;
    L_0x00d0:
        if (r4 == 0) goto L_0x00d3;
    L_0x00d2:
        goto L_0x00d4;
    L_0x00d3:
        r0 = r1;
    L_0x00d4:
        if (r0 == 0) goto L_0x00d7;
    L_0x00d6:
        goto L_0x00d8;
    L_0x00d7:
        r8 = 0;
    L_0x00d8:
        return r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jumio.bam.gui.ExpiryEditText.a(int, java.lang.String, java.lang.String):java.lang.String");
    }
}
