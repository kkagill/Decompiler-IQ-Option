package com.google.android.gms.internal.gtm;

final class zzqo {
    private static final Class<?> zzaxg = zzom();

    private static Class<?> zzom() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static zzqp zzon() {
        if (zzaxg != null) {
            try {
                return zzdc("getEmptyRegistry");
            } catch (Exception unused) {
            }
        }
        return zzqp.zzaxk;
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x000e  */
    /* JADX WARNING: Removed duplicated region for block: B:11:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0014  */
    static com.google.android.gms.internal.gtm.zzqp zzoo() {
        /*
        r0 = zzaxg;
        if (r0 == 0) goto L_0x000b;
    L_0x0004:
        r0 = "loadGeneratedRegistry";
        r0 = zzdc(r0);	 Catch:{ Exception -> 0x000b }
        goto L_0x000c;
    L_0x000b:
        r0 = 0;
    L_0x000c:
        if (r0 != 0) goto L_0x0012;
    L_0x000e:
        r0 = com.google.android.gms.internal.gtm.zzqp.zzoo();
    L_0x0012:
        if (r0 != 0) goto L_0x0018;
    L_0x0014:
        r0 = zzon();
    L_0x0018:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzqo.zzoo():com.google.android.gms.internal.gtm.zzqp");
    }

    private static final zzqp zzdc(String str) {
        return (zzqp) zzaxg.getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0]);
    }
}
