package com.google.android.gms.internal.gtm;

import java.io.PrintStream;

public final class zzpf {
    private static final zzpg zzavi;
    private static final int zzavj;

    static final class zza extends zzpg {
        zza() {
        }

        public final void zza(Throwable th, PrintStream printStream) {
            th.printStackTrace(printStream);
        }
    }

    public static void zza(Throwable th, PrintStream printStream) {
        zzavi.zza(th, printStream);
    }

    private static Integer zzmu() {
        try {
            return (Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
        } catch (Exception e) {
            System.err.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
            e.printStackTrace(System.err);
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0069  */
    static {
        /*
        r0 = 1;
        r1 = zzmu();	 Catch:{ Throwable -> 0x002c }
        if (r1 == 0) goto L_0x0015;
    L_0x0007:
        r2 = r1.intValue();	 Catch:{ Throwable -> 0x002a }
        r3 = 19;
        if (r2 < r3) goto L_0x0015;
    L_0x000f:
        r2 = new com.google.android.gms.internal.gtm.zzpk;	 Catch:{ Throwable -> 0x002a }
        r2.<init>();	 Catch:{ Throwable -> 0x002a }
        goto L_0x0064;
    L_0x0015:
        r2 = "com.google.devtools.build.android.desugar.runtime.twr_disable_mimic";
        r2 = java.lang.Boolean.getBoolean(r2);	 Catch:{ Throwable -> 0x002a }
        r2 = r2 ^ r0;
        if (r2 == 0) goto L_0x0024;
    L_0x001e:
        r2 = new com.google.android.gms.internal.gtm.zzpj;	 Catch:{ Throwable -> 0x002a }
        r2.<init>();	 Catch:{ Throwable -> 0x002a }
        goto L_0x0064;
    L_0x0024:
        r2 = new com.google.android.gms.internal.gtm.zzpf$zza;	 Catch:{ Throwable -> 0x002a }
        r2.<init>();	 Catch:{ Throwable -> 0x002a }
        goto L_0x0064;
    L_0x002a:
        r2 = move-exception;
        goto L_0x002e;
    L_0x002c:
        r2 = move-exception;
        r1 = 0;
    L_0x002e:
        r3 = java.lang.System.err;
        r4 = com.google.android.gms.internal.gtm.zzpf.zza.class;
        r4 = r4.getName();
        r5 = java.lang.String.valueOf(r4);
        r5 = r5.length();
        r5 = r5 + 133;
        r6 = new java.lang.StringBuilder;
        r6.<init>(r5);
        r5 = "An error has occurred when initializing the try-with-resources desuguring strategy. The default strategy ";
        r6.append(r5);
        r6.append(r4);
        r4 = "will be used. The error is: ";
        r6.append(r4);
        r4 = r6.toString();
        r3.println(r4);
        r3 = java.lang.System.err;
        r2.printStackTrace(r3);
        r2 = new com.google.android.gms.internal.gtm.zzpf$zza;
        r2.<init>();
    L_0x0064:
        zzavi = r2;
        if (r1 != 0) goto L_0x0069;
    L_0x0068:
        goto L_0x006d;
    L_0x0069:
        r0 = r1.intValue();
    L_0x006d:
        zzavj = r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzpf.<clinit>():void");
    }
}
