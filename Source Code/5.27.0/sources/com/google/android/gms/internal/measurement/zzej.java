package com.google.android.gms.internal.measurement;

final class zzej {
    private static final Class<?> zzaeq = zztl();

    private static Class<?> zztl() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static zzel zztm() {
        if (zzaeq != null) {
            try {
                return zzdu("getEmptyRegistry");
            } catch (Exception unused) {
            }
        }
        return zzel.zzaev;
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x000e  */
    /* JADX WARNING: Removed duplicated region for block: B:11:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0014  */
    static com.google.android.gms.internal.measurement.zzel zztn() {
        /*
        r0 = zzaeq;
        if (r0 == 0) goto L_0x000b;
    L_0x0004:
        r0 = "loadGeneratedRegistry";
        r0 = zzdu(r0);	 Catch:{ Exception -> 0x000b }
        goto L_0x000c;
    L_0x000b:
        r0 = 0;
    L_0x000c:
        if (r0 != 0) goto L_0x0012;
    L_0x000e:
        r0 = com.google.android.gms.internal.measurement.zzel.zztn();
    L_0x0012:
        if (r0 != 0) goto L_0x0018;
    L_0x0014:
        r0 = zztm();
    L_0x0018:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzej.zztn():com.google.android.gms.internal.measurement.zzel");
    }

    private static final zzel zzdu(String str) {
        return (zzel) zzaeq.getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0]);
    }
}
