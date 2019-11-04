package com.noveogroup.android.log;

import com.noveogroup.android.log.Logger.Level;

/* compiled from: PatternHandler */
public class e implements b {
    private final Level eCc;
    private final String eCd;
    private final String eCe;
    private final d eCf;
    private final d eCg;

    public e(Level level, String str, String str2) {
        this.eCc = level;
        this.eCd = str;
        this.eCf = d.kQ(str);
        this.eCe = str2;
        this.eCg = d.kQ(str2);
    }

    public boolean a(Level level) {
        Level level2 = this.eCc;
        return (level2 == null || level == null || !level2.includes(level)) ? false : true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0056  */
    /* JADX WARNING: Missing block: B:16:0x0041, code skipped:
            if (r1.isCallerNeeded() != false) goto L_0x0043;
     */
    public void a(java.lang.String r4, com.noveogroup.android.log.Logger.Level r5, java.lang.Throwable r6, java.lang.String r7) {
        /*
        r3 = this;
        r0 = r3.a(r5);
        if (r0 == 0) goto L_0x0092;
    L_0x0006:
        r0 = "";
        if (r7 != 0) goto L_0x0013;
    L_0x000a:
        if (r6 != 0) goto L_0x000e;
    L_0x000c:
        r7 = r0;
        goto L_0x002e;
    L_0x000e:
        r7 = android.util.Log.getStackTraceString(r6);
        goto L_0x002e;
    L_0x0013:
        if (r6 != 0) goto L_0x0016;
    L_0x0015:
        goto L_0x002e;
    L_0x0016:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r1.append(r7);
        r7 = 10;
        r1.append(r7);
        r6 = android.util.Log.getStackTraceString(r6);
        r1.append(r6);
        r7 = r1.toString();
    L_0x002e:
        r6 = 0;
        r1 = r3.eCf;
        if (r1 == 0) goto L_0x0039;
    L_0x0033:
        r1 = r1.isCallerNeeded();
        if (r1 != 0) goto L_0x0043;
    L_0x0039:
        r1 = r3.eCg;
        if (r1 == 0) goto L_0x0047;
    L_0x003d:
        r1 = r1.isCallerNeeded();
        if (r1 == 0) goto L_0x0047;
    L_0x0043:
        r6 = com.noveogroup.android.log.g.bgv();
    L_0x0047:
        r1 = r3.eCf;
        if (r1 != 0) goto L_0x004d;
    L_0x004b:
        r1 = r0;
        goto L_0x0051;
    L_0x004d:
        r1 = r1.a(r6, r4, r5);
    L_0x0051:
        r2 = r3.eCg;
        if (r2 != 0) goto L_0x0056;
    L_0x0055:
        goto L_0x005a;
    L_0x0056:
        r0 = r2.a(r6, r4, r5);
    L_0x005a:
        r4 = r0.length();
        if (r4 <= 0) goto L_0x007c;
    L_0x0060:
        r4 = 0;
        r4 = r0.charAt(r4);
        r4 = java.lang.Character.isWhitespace(r4);
        if (r4 != 0) goto L_0x007c;
    L_0x006b:
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r4.append(r0);
        r6 = " ";
        r4.append(r6);
        r0 = r4.toString();
    L_0x007c:
        r4 = r5.intValue();
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r5.append(r0);
        r5.append(r7);
        r5 = r5.toString();
        android.util.Log.println(r4, r1, r5);
    L_0x0092:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.noveogroup.android.log.e.a(java.lang.String, com.noveogroup.android.log.Logger$Level, java.lang.Throwable, java.lang.String):void");
    }

    public void a(String str, Level level, Throwable th, String str2, Object... objArr) {
        if (!a(level)) {
            return;
        }
        if (str2 != null || objArr == null || objArr.length <= 0) {
            if (str2 == null) {
                str2 = null;
            } else {
                str2 = String.format(str2, objArr);
            }
            a(str, level, th, str2);
            return;
        }
        throw new IllegalArgumentException("message format is not set but arguments are presented");
    }
}
