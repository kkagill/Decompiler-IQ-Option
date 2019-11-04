package com.google.android.gms.internal.vision;

public final class zzdn extends zzjn<zzdn> {
    public Integer zzow;
    public Integer zzox;
    public Integer zzoy;
    public Boolean zzoz;
    public Boolean zzpa;
    public Float zzpb;

    public zzdn() {
        this.zzoz = null;
        this.zzpa = null;
        this.zzpb = null;
        this.zzadp = -1;
    }

    public final void zza(zzjl zzjl) {
        Integer num = this.zzow;
        if (num != null) {
            zzjl.zze(1, num.intValue());
        }
        num = this.zzox;
        if (num != null) {
            zzjl.zze(2, num.intValue());
        }
        num = this.zzoy;
        if (num != null) {
            zzjl.zze(3, num.intValue());
        }
        Boolean bool = this.zzoz;
        if (bool != null) {
            zzjl.zzb(4, bool.booleanValue());
        }
        bool = this.zzpa;
        if (bool != null) {
            zzjl.zzb(5, bool.booleanValue());
        }
        Float f = this.zzpb;
        if (f != null) {
            zzjl.zza(6, f.floatValue());
        }
        super.zza(zzjl);
    }

    /* Access modifiers changed, original: protected|final */
    public final int zzt() {
        int zzt = super.zzt();
        Integer num = this.zzow;
        if (num != null) {
            zzt += zzjl.zzi(1, num.intValue());
        }
        num = this.zzox;
        if (num != null) {
            zzt += zzjl.zzi(2, num.intValue());
        }
        num = this.zzoy;
        if (num != null) {
            zzt += zzjl.zzi(3, num.intValue());
        }
        Boolean bool = this.zzoz;
        if (bool != null) {
            bool.booleanValue();
            zzt += zzjl.zzav(4) + 1;
        }
        bool = this.zzpa;
        if (bool != null) {
            bool.booleanValue();
            zzt += zzjl.zzav(5) + 1;
        }
        Float f = this.zzpb;
        if (f == null) {
            return zzt;
        }
        f.floatValue();
        return zzt + (zzjl.zzav(6) + 4);
    }

    /* JADX WARNING: Missing block: B:37:0x00a9, code skipped:
            throw new java.lang.IllegalArgumentException(r5.toString());
     */
    /* JADX WARNING: Missing block: B:47:0x00de, code skipped:
            throw new java.lang.IllegalArgumentException(r5.toString());
     */
    private final com.google.android.gms.internal.vision.zzdn zzd(com.google.android.gms.internal.vision.zzjk r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.zzdq();
        if (r0 == 0) goto L_0x00e7;
    L_0x0006:
        r1 = 8;
        r2 = 3;
        if (r0 == r1) goto L_0x00b2;
    L_0x000b:
        r1 = 16;
        r3 = 40;
        if (r0 == r1) goto L_0x007f;
    L_0x0011:
        r1 = 24;
        if (r0 == r1) goto L_0x004b;
    L_0x0015:
        r1 = 32;
        if (r0 == r1) goto L_0x0040;
    L_0x0019:
        if (r0 == r3) goto L_0x0035;
    L_0x001b:
        r1 = 53;
        if (r0 == r1) goto L_0x0026;
    L_0x001f:
        r0 = super.zza(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x0025:
        return r6;
    L_0x0026:
        r0 = r7.zzdv();
        r0 = java.lang.Float.intBitsToFloat(r0);
        r0 = java.lang.Float.valueOf(r0);
        r6.zzpb = r0;
        goto L_0x0000;
    L_0x0035:
        r0 = r7.zzcu();
        r0 = java.lang.Boolean.valueOf(r0);
        r6.zzpa = r0;
        goto L_0x0000;
    L_0x0040:
        r0 = r7.zzcu();
        r0 = java.lang.Boolean.valueOf(r0);
        r6.zzoz = r0;
        goto L_0x0000;
    L_0x004b:
        r1 = r7.getPosition();
        r2 = r7.zzdt();	 Catch:{ IllegalArgumentException -> 0x0078 }
        if (r2 < 0) goto L_0x005f;
    L_0x0055:
        r3 = 2;
        if (r2 > r3) goto L_0x005f;
    L_0x0058:
        r2 = java.lang.Integer.valueOf(r2);	 Catch:{ IllegalArgumentException -> 0x0078 }
        r6.zzoy = r2;	 Catch:{ IllegalArgumentException -> 0x0078 }
        goto L_0x0000;
    L_0x005f:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0078 }
        r4 = 46;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0078 }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x0078 }
        r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x0078 }
        r2 = " is not a valid enum Classification";
        r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x0078 }
        r2 = r5.toString();	 Catch:{ IllegalArgumentException -> 0x0078 }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x0078 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x0078 }
    L_0x0078:
        r7.zzbt(r1);
        r6.zza(r7, r0);
        goto L_0x0000;
    L_0x007f:
        r1 = r7.getPosition();
        r4 = r7.zzdt();	 Catch:{ IllegalArgumentException -> 0x00aa }
        if (r4 < 0) goto L_0x0093;
    L_0x0089:
        if (r4 > r2) goto L_0x0093;
    L_0x008b:
        r2 = java.lang.Integer.valueOf(r4);	 Catch:{ IllegalArgumentException -> 0x00aa }
        r6.zzox = r2;	 Catch:{ IllegalArgumentException -> 0x00aa }
        goto L_0x0000;
    L_0x0093:
        r2 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x00aa }
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x00aa }
        r5.<init>(r3);	 Catch:{ IllegalArgumentException -> 0x00aa }
        r5.append(r4);	 Catch:{ IllegalArgumentException -> 0x00aa }
        r3 = " is not a valid enum Landmark";
        r5.append(r3);	 Catch:{ IllegalArgumentException -> 0x00aa }
        r3 = r5.toString();	 Catch:{ IllegalArgumentException -> 0x00aa }
        r2.<init>(r3);	 Catch:{ IllegalArgumentException -> 0x00aa }
        throw r2;	 Catch:{ IllegalArgumentException -> 0x00aa }
    L_0x00aa:
        r7.zzbt(r1);
        r6.zza(r7, r0);
        goto L_0x0000;
    L_0x00b2:
        r1 = r7.getPosition();
        r3 = r7.zzdt();	 Catch:{ IllegalArgumentException -> 0x00df }
        if (r3 < 0) goto L_0x00c6;
    L_0x00bc:
        if (r3 > r2) goto L_0x00c6;
    L_0x00be:
        r2 = java.lang.Integer.valueOf(r3);	 Catch:{ IllegalArgumentException -> 0x00df }
        r6.zzow = r2;	 Catch:{ IllegalArgumentException -> 0x00df }
        goto L_0x0000;
    L_0x00c6:
        r2 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x00df }
        r4 = 36;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x00df }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x00df }
        r5.append(r3);	 Catch:{ IllegalArgumentException -> 0x00df }
        r3 = " is not a valid enum Mode";
        r5.append(r3);	 Catch:{ IllegalArgumentException -> 0x00df }
        r3 = r5.toString();	 Catch:{ IllegalArgumentException -> 0x00df }
        r2.<init>(r3);	 Catch:{ IllegalArgumentException -> 0x00df }
        throw r2;	 Catch:{ IllegalArgumentException -> 0x00df }
    L_0x00df:
        r7.zzbt(r1);
        r6.zza(r7, r0);
        goto L_0x0000;
    L_0x00e7:
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.zzdn.zzd(com.google.android.gms.internal.vision.zzjk):com.google.android.gms.internal.vision.zzdn");
    }
}
