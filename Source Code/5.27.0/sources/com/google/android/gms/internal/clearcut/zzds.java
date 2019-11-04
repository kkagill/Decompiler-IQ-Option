package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzcg.zzg;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import sun.misc.Unsafe;

final class zzds<T> implements zzef<T> {
    private static final Unsafe zzmh = zzfd.zzef();
    private final int[] zzmi;
    private final Object[] zzmj;
    private final int zzmk;
    private final int zzml;
    private final int zzmm;
    private final zzdo zzmn;
    private final boolean zzmo;
    private final boolean zzmp;
    private final boolean zzmq;
    private final boolean zzmr;
    private final int[] zzms;
    private final int[] zzmt;
    private final int[] zzmu;
    private final zzdw zzmv;
    private final zzcy zzmw;
    private final zzex<?, ?> zzmx;
    private final zzbu<?> zzmy;
    private final zzdj zzmz;

    private zzds(int[] iArr, Object[] objArr, int i, int i2, int i3, zzdo zzdo, boolean z, boolean z2, int[] iArr2, int[] iArr3, int[] iArr4, zzdw zzdw, zzcy zzcy, zzex<?, ?> zzex, zzbu<?> zzbu, zzdj zzdj) {
        zzdo zzdo2 = zzdo;
        zzbu<?> zzbu2 = zzbu;
        this.zzmi = iArr;
        this.zzmj = objArr;
        this.zzmk = i;
        this.zzml = i2;
        this.zzmm = i3;
        this.zzmp = zzdo2 instanceof zzcg;
        this.zzmq = z;
        boolean z3 = zzbu2 != null && zzbu2.zze(zzdo);
        this.zzmo = z3;
        this.zzmr = false;
        this.zzms = iArr2;
        this.zzmt = iArr3;
        this.zzmu = iArr4;
        this.zzmv = zzdw;
        this.zzmw = zzcy;
        this.zzmx = zzex;
        this.zzmy = zzbu2;
        this.zzmn = zzdo2;
        this.zzmz = zzdj;
    }

    private static int zza(int i, byte[] bArr, int i2, int i3, Object obj, zzay zzay) {
        return zzax.zza(i, bArr, i2, i3, zzn(obj), zzay);
    }

    private static int zza(zzef<?> zzef, int i, byte[] bArr, int i2, int i3, zzcn<?> zzcn, zzay zzay) {
        i2 = zza((zzef) zzef, bArr, i2, i3, zzay);
        while (true) {
            zzcn.add(zzay.zzff);
            if (i2 >= i3) {
                break;
            }
            int zza = zzax.zza(bArr, i2, zzay);
            if (i != zzay.zzfd) {
                break;
            }
            i2 = zza((zzef) zzef, bArr, zza, i3, zzay);
        }
        return i2;
    }

    private static int zza(zzef zzef, byte[] bArr, int i, int i2, int i3, zzay zzay) {
        zzds zzds = (zzds) zzef;
        Object newInstance = zzds.newInstance();
        int zza = zzds.zza(newInstance, bArr, i, i2, i3, zzay);
        zzds.zzc(newInstance);
        zzay.zzff = newInstance;
        return zza;
    }

    private static int zza(zzef zzef, byte[] bArr, int i, int i2, zzay zzay) {
        int i3 = i + 1;
        i = bArr[i];
        if (i < 0) {
            i3 = zzax.zza(i, bArr, i3, zzay);
            i = zzay.zzfd;
        }
        int i4 = i3;
        if (i < 0 || i > i2 - i4) {
            throw zzco.zzbl();
        }
        Object newInstance = zzef.newInstance();
        i += i4;
        zzef.zza(newInstance, bArr, i4, i, zzay);
        zzef.zzc(newInstance);
        zzay.zzff = newInstance;
        return i;
    }

    private static <UT, UB> int zza(zzex<UT, UB> zzex, T t) {
        return zzex.zzm(zzex.zzq(t));
    }

    /* JADX WARNING: Missing block: B:27:0x00b9, code skipped:
            r2 = r2 + r4;
     */
    /* JADX WARNING: Missing block: B:60:0x0143, code skipped:
            r3 = java.lang.Integer.valueOf(r3);
     */
    /* JADX WARNING: Missing block: B:63:0x0150, code skipped:
            r3 = java.lang.Long.valueOf(r3);
     */
    /* JADX WARNING: Missing block: B:64:0x0154, code skipped:
            r12.putObject(r1, r9, r3);
     */
    /* JADX WARNING: Missing block: B:67:0x0162, code skipped:
            r12.putObject(r1, r9, r2);
            r2 = r4 + 4;
     */
    /* JADX WARNING: Missing block: B:71:0x0173, code skipped:
            r12.putObject(r1, r9, r2);
            r2 = r4 + 8;
     */
    /* JADX WARNING: Missing block: B:72:0x0178, code skipped:
            r12.putInt(r1, r13, r8);
     */
    /* JADX WARNING: Missing block: B:74:?, code skipped:
            return r4;
     */
    /* JADX WARNING: Missing block: B:76:?, code skipped:
            return r2;
     */
    private final int zza(T r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, int r25, long r26, int r28, com.google.android.gms.internal.clearcut.zzay r29) {
        /*
        r16 = this;
        r0 = r16;
        r1 = r17;
        r3 = r18;
        r4 = r19;
        r2 = r21;
        r8 = r22;
        r5 = r23;
        r9 = r26;
        r6 = r28;
        r11 = r29;
        r12 = zzmh;
        r7 = r0.zzmi;
        r13 = r6 + 2;
        r7 = r7[r13];
        r13 = 1048575; // 0xfffff float:1.469367E-39 double:5.18065E-318;
        r7 = r7 & r13;
        r13 = (long) r7;
        r7 = 5;
        r15 = 2;
        switch(r25) {
            case 51: goto L_0x0168;
            case 52: goto L_0x0158;
            case 53: goto L_0x0148;
            case 54: goto L_0x0148;
            case 55: goto L_0x013b;
            case 56: goto L_0x012f;
            case 57: goto L_0x0124;
            case 58: goto L_0x010e;
            case 59: goto L_0x00e2;
            case 60: goto L_0x00bc;
            case 61: goto L_0x00a4;
            case 62: goto L_0x013b;
            case 63: goto L_0x0076;
            case 64: goto L_0x0124;
            case 65: goto L_0x012f;
            case 66: goto L_0x0068;
            case 67: goto L_0x005a;
            case 68: goto L_0x0028;
            default: goto L_0x0026;
        };
    L_0x0026:
        goto L_0x017c;
    L_0x0028:
        r7 = 3;
        if (r5 != r7) goto L_0x017c;
    L_0x002b:
        r2 = r2 & -8;
        r7 = r2 | 4;
        r2 = r0.zzad(r6);
        r3 = r18;
        r4 = r19;
        r5 = r20;
        r6 = r7;
        r7 = r29;
        r2 = zza(r2, r3, r4, r5, r6, r7);
        r3 = r12.getInt(r1, r13);
        if (r3 != r8) goto L_0x004b;
    L_0x0046:
        r15 = r12.getObject(r1, r9);
        goto L_0x004c;
    L_0x004b:
        r15 = 0;
    L_0x004c:
        if (r15 != 0) goto L_0x0052;
    L_0x004e:
        r3 = r11.zzff;
        goto L_0x0154;
    L_0x0052:
        r3 = r11.zzff;
        r3 = com.google.android.gms.internal.clearcut.zzci.zza(r15, r3);
        goto L_0x0154;
    L_0x005a:
        if (r5 != 0) goto L_0x017c;
    L_0x005c:
        r2 = com.google.android.gms.internal.clearcut.zzax.zzb(r3, r4, r11);
        r3 = r11.zzfe;
        r3 = com.google.android.gms.internal.clearcut.zzbk.zza(r3);
        goto L_0x0150;
    L_0x0068:
        if (r5 != 0) goto L_0x017c;
    L_0x006a:
        r2 = com.google.android.gms.internal.clearcut.zzax.zza(r3, r4, r11);
        r3 = r11.zzfd;
        r3 = com.google.android.gms.internal.clearcut.zzbk.zzm(r3);
        goto L_0x0143;
    L_0x0076:
        if (r5 != 0) goto L_0x017c;
    L_0x0078:
        r3 = com.google.android.gms.internal.clearcut.zzax.zza(r3, r4, r11);
        r4 = r11.zzfd;
        r5 = r0.zzaf(r6);
        if (r5 == 0) goto L_0x009a;
    L_0x0084:
        r5 = r5.zzb(r4);
        if (r5 == 0) goto L_0x008b;
    L_0x008a:
        goto L_0x009a;
    L_0x008b:
        r1 = zzn(r17);
        r4 = (long) r4;
        r4 = java.lang.Long.valueOf(r4);
        r1.zzb(r2, r4);
        r2 = r3;
        goto L_0x017d;
    L_0x009a:
        r2 = java.lang.Integer.valueOf(r4);
        r12.putObject(r1, r9, r2);
        r2 = r3;
        goto L_0x0178;
    L_0x00a4:
        if (r5 != r15) goto L_0x017c;
    L_0x00a6:
        r2 = com.google.android.gms.internal.clearcut.zzax.zza(r3, r4, r11);
        r4 = r11.zzfd;
        if (r4 != 0) goto L_0x00b2;
    L_0x00ae:
        r3 = com.google.android.gms.internal.clearcut.zzbb.zzfi;
        goto L_0x0154;
    L_0x00b2:
        r3 = com.google.android.gms.internal.clearcut.zzbb.zzb(r3, r2, r4);
        r12.putObject(r1, r9, r3);
    L_0x00b9:
        r2 = r2 + r4;
        goto L_0x0178;
    L_0x00bc:
        if (r5 != r15) goto L_0x017c;
    L_0x00be:
        r2 = r0.zzad(r6);
        r5 = r20;
        r2 = zza(r2, r3, r4, r5, r11);
        r3 = r12.getInt(r1, r13);
        if (r3 != r8) goto L_0x00d3;
    L_0x00ce:
        r15 = r12.getObject(r1, r9);
        goto L_0x00d4;
    L_0x00d3:
        r15 = 0;
    L_0x00d4:
        if (r15 != 0) goto L_0x00da;
    L_0x00d6:
        r3 = r11.zzff;
        goto L_0x0154;
    L_0x00da:
        r3 = r11.zzff;
        r3 = com.google.android.gms.internal.clearcut.zzci.zza(r15, r3);
        goto L_0x0154;
    L_0x00e2:
        if (r5 != r15) goto L_0x017c;
    L_0x00e4:
        r2 = com.google.android.gms.internal.clearcut.zzax.zza(r3, r4, r11);
        r4 = r11.zzfd;
        if (r4 != 0) goto L_0x00ef;
    L_0x00ec:
        r3 = "";
        goto L_0x0154;
    L_0x00ef:
        r5 = 536870912; // 0x20000000 float:1.0842022E-19 double:2.652494739E-315;
        r5 = r24 & r5;
        if (r5 == 0) goto L_0x0103;
    L_0x00f5:
        r5 = r2 + r4;
        r5 = com.google.android.gms.internal.clearcut.zzff.zze(r3, r2, r5);
        if (r5 == 0) goto L_0x00fe;
    L_0x00fd:
        goto L_0x0103;
    L_0x00fe:
        r1 = com.google.android.gms.internal.clearcut.zzco.zzbp();
        throw r1;
    L_0x0103:
        r5 = new java.lang.String;
        r6 = com.google.android.gms.internal.clearcut.zzci.UTF_8;
        r5.<init>(r3, r2, r4, r6);
        r12.putObject(r1, r9, r5);
        goto L_0x00b9;
    L_0x010e:
        if (r5 != 0) goto L_0x017c;
    L_0x0110:
        r2 = com.google.android.gms.internal.clearcut.zzax.zzb(r3, r4, r11);
        r3 = r11.zzfe;
        r5 = 0;
        r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r7 == 0) goto L_0x011e;
    L_0x011c:
        r15 = 1;
        goto L_0x011f;
    L_0x011e:
        r15 = 0;
    L_0x011f:
        r3 = java.lang.Boolean.valueOf(r15);
        goto L_0x0154;
    L_0x0124:
        if (r5 != r7) goto L_0x017c;
    L_0x0126:
        r2 = com.google.android.gms.internal.clearcut.zzax.zzc(r18, r19);
        r2 = java.lang.Integer.valueOf(r2);
        goto L_0x0162;
    L_0x012f:
        r2 = 1;
        if (r5 != r2) goto L_0x017c;
    L_0x0132:
        r2 = com.google.android.gms.internal.clearcut.zzax.zzd(r18, r19);
        r2 = java.lang.Long.valueOf(r2);
        goto L_0x0173;
    L_0x013b:
        if (r5 != 0) goto L_0x017c;
    L_0x013d:
        r2 = com.google.android.gms.internal.clearcut.zzax.zza(r3, r4, r11);
        r3 = r11.zzfd;
    L_0x0143:
        r3 = java.lang.Integer.valueOf(r3);
        goto L_0x0154;
    L_0x0148:
        if (r5 != 0) goto L_0x017c;
    L_0x014a:
        r2 = com.google.android.gms.internal.clearcut.zzax.zzb(r3, r4, r11);
        r3 = r11.zzfe;
    L_0x0150:
        r3 = java.lang.Long.valueOf(r3);
    L_0x0154:
        r12.putObject(r1, r9, r3);
        goto L_0x0178;
    L_0x0158:
        if (r5 != r7) goto L_0x017c;
    L_0x015a:
        r2 = com.google.android.gms.internal.clearcut.zzax.zzf(r18, r19);
        r2 = java.lang.Float.valueOf(r2);
    L_0x0162:
        r12.putObject(r1, r9, r2);
        r2 = r4 + 4;
        goto L_0x0178;
    L_0x0168:
        r2 = 1;
        if (r5 != r2) goto L_0x017c;
    L_0x016b:
        r2 = com.google.android.gms.internal.clearcut.zzax.zze(r18, r19);
        r2 = java.lang.Double.valueOf(r2);
    L_0x0173:
        r12.putObject(r1, r9, r2);
        r2 = r4 + 8;
    L_0x0178:
        r12.putInt(r1, r13, r8);
        goto L_0x017d;
    L_0x017c:
        r2 = r4;
    L_0x017d:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.zzds.zza(java.lang.Object, byte[], int, int, int, int, int, int, int, long, int, com.google.android.gms.internal.clearcut.zzay):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:77:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01d7  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01d7  */
    /* JADX WARNING: Missing block: B:58:0x013a, code skipped:
            if (r4 == 0) goto L_0x013c;
     */
    /* JADX WARNING: Missing block: B:59:0x013c, code skipped:
            r11.add(com.google.android.gms.internal.clearcut.zzbb.zzfi);
     */
    /* JADX WARNING: Missing block: B:60:0x0142, code skipped:
            r11.add(com.google.android.gms.internal.clearcut.zzbb.zzb(r3, r1, r4));
            r1 = r1 + r4;
     */
    /* JADX WARNING: Missing block: B:61:0x014a, code skipped:
            if (r1 >= r5) goto L_?;
     */
    /* JADX WARNING: Missing block: B:62:0x014c, code skipped:
            r4 = com.google.android.gms.internal.clearcut.zzax.zza(r3, r1, r7);
     */
    /* JADX WARNING: Missing block: B:63:0x0152, code skipped:
            if (r2 != r7.zzfd) goto L_?;
     */
    /* JADX WARNING: Missing block: B:64:0x0154, code skipped:
            r1 = com.google.android.gms.internal.clearcut.zzax.zza(r3, r4, r7);
            r4 = r7.zzfd;
     */
    /* JADX WARNING: Missing block: B:65:0x015a, code skipped:
            if (r4 != 0) goto L_0x0142;
     */
    /* JADX WARNING: Missing block: B:115:0x0236, code skipped:
            if (r7.zzfe != 0) goto L_0x0238;
     */
    /* JADX WARNING: Missing block: B:116:0x0238, code skipped:
            r6 = true;
     */
    /* JADX WARNING: Missing block: B:117:0x023a, code skipped:
            r6 = false;
     */
    /* JADX WARNING: Missing block: B:118:0x023b, code skipped:
            r11.addBoolean(r6);
     */
    /* JADX WARNING: Missing block: B:119:0x023e, code skipped:
            if (r4 >= r5) goto L_0x039f;
     */
    /* JADX WARNING: Missing block: B:120:0x0240, code skipped:
            r6 = com.google.android.gms.internal.clearcut.zzax.zza(r3, r4, r7);
     */
    /* JADX WARNING: Missing block: B:121:0x0246, code skipped:
            if (r2 != r7.zzfd) goto L_0x039f;
     */
    /* JADX WARNING: Missing block: B:122:0x0248, code skipped:
            r4 = com.google.android.gms.internal.clearcut.zzax.zzb(r3, r6, r7);
     */
    /* JADX WARNING: Missing block: B:123:0x0250, code skipped:
            if (r7.zzfe == 0) goto L_0x023a;
     */
    /* JADX WARNING: Missing block: B:225:?, code skipped:
            return r4;
     */
    /* JADX WARNING: Missing block: B:226:?, code skipped:
            return r2;
     */
    /* JADX WARNING: Missing block: B:227:?, code skipped:
            return r1;
     */
    /* JADX WARNING: Missing block: B:228:?, code skipped:
            return r1;
     */
    private final int zza(T r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, long r25, int r27, long r28, com.google.android.gms.internal.clearcut.zzay r30) {
        /*
        r16 = this;
        r0 = r16;
        r1 = r17;
        r3 = r18;
        r4 = r19;
        r5 = r20;
        r2 = r21;
        r6 = r23;
        r8 = r24;
        r9 = r28;
        r7 = r30;
        r11 = zzmh;
        r11 = r11.getObject(r1, r9);
        r11 = (com.google.android.gms.internal.clearcut.zzcn) r11;
        r12 = r11.zzu();
        r13 = 1;
        if (r12 != 0) goto L_0x0036;
    L_0x0023:
        r12 = r11.size();
        if (r12 != 0) goto L_0x002c;
    L_0x0029:
        r12 = 10;
        goto L_0x002d;
    L_0x002c:
        r12 = r12 << r13;
    L_0x002d:
        r11 = r11.zzi(r12);
        r12 = zzmh;
        r12.putObject(r1, r9, r11);
    L_0x0036:
        r9 = 5;
        r14 = 0;
        r10 = 2;
        switch(r27) {
            case 18: goto L_0x0361;
            case 19: goto L_0x0323;
            case 20: goto L_0x02eb;
            case 21: goto L_0x02eb;
            case 22: goto L_0x02d1;
            case 23: goto L_0x0292;
            case 24: goto L_0x0253;
            case 25: goto L_0x0202;
            case 26: goto L_0x0177;
            case 27: goto L_0x015d;
            case 28: goto L_0x0132;
            case 29: goto L_0x02d1;
            case 30: goto L_0x00fa;
            case 31: goto L_0x0253;
            case 32: goto L_0x0292;
            case 33: goto L_0x00ba;
            case 34: goto L_0x007a;
            case 35: goto L_0x0361;
            case 36: goto L_0x0323;
            case 37: goto L_0x02eb;
            case 38: goto L_0x02eb;
            case 39: goto L_0x02d1;
            case 40: goto L_0x0292;
            case 41: goto L_0x0253;
            case 42: goto L_0x0202;
            case 43: goto L_0x02d1;
            case 44: goto L_0x00fa;
            case 45: goto L_0x0253;
            case 46: goto L_0x0292;
            case 47: goto L_0x00ba;
            case 48: goto L_0x007a;
            case 49: goto L_0x003f;
            default: goto L_0x003d;
        };
    L_0x003d:
        goto L_0x039f;
    L_0x003f:
        r1 = 3;
        if (r6 != r1) goto L_0x039f;
    L_0x0042:
        r1 = r0.zzad(r8);
        r6 = r2 & -8;
        r6 = r6 | 4;
        r22 = r1;
        r23 = r18;
        r24 = r19;
        r25 = r20;
        r26 = r6;
        r27 = r30;
        r4 = zza(r22, r23, r24, r25, r26, r27);
    L_0x005a:
        r8 = r7.zzff;
        r11.add(r8);
        if (r4 >= r5) goto L_0x039f;
    L_0x0061:
        r8 = com.google.android.gms.internal.clearcut.zzax.zza(r3, r4, r7);
        r9 = r7.zzfd;
        if (r2 != r9) goto L_0x039f;
    L_0x0069:
        r22 = r1;
        r23 = r18;
        r24 = r8;
        r25 = r20;
        r26 = r6;
        r27 = r30;
        r4 = zza(r22, r23, r24, r25, r26, r27);
        goto L_0x005a;
    L_0x007a:
        if (r6 != r10) goto L_0x009e;
    L_0x007c:
        r11 = (com.google.android.gms.internal.clearcut.zzdc) r11;
        r1 = com.google.android.gms.internal.clearcut.zzax.zza(r3, r4, r7);
        r2 = r7.zzfd;
        r2 = r2 + r1;
    L_0x0085:
        if (r1 >= r2) goto L_0x0095;
    L_0x0087:
        r1 = com.google.android.gms.internal.clearcut.zzax.zzb(r3, r1, r7);
        r4 = r7.zzfe;
        r4 = com.google.android.gms.internal.clearcut.zzbk.zza(r4);
        r11.zzm(r4);
        goto L_0x0085;
    L_0x0095:
        if (r1 != r2) goto L_0x0099;
    L_0x0097:
        goto L_0x03a0;
    L_0x0099:
        r1 = com.google.android.gms.internal.clearcut.zzco.zzbl();
        throw r1;
    L_0x009e:
        if (r6 != 0) goto L_0x039f;
    L_0x00a0:
        r11 = (com.google.android.gms.internal.clearcut.zzdc) r11;
    L_0x00a2:
        r1 = com.google.android.gms.internal.clearcut.zzax.zzb(r3, r4, r7);
        r8 = r7.zzfe;
        r8 = com.google.android.gms.internal.clearcut.zzbk.zza(r8);
        r11.zzm(r8);
        if (r1 >= r5) goto L_0x03a0;
    L_0x00b1:
        r4 = com.google.android.gms.internal.clearcut.zzax.zza(r3, r1, r7);
        r6 = r7.zzfd;
        if (r2 != r6) goto L_0x03a0;
    L_0x00b9:
        goto L_0x00a2;
    L_0x00ba:
        if (r6 != r10) goto L_0x00de;
    L_0x00bc:
        r11 = (com.google.android.gms.internal.clearcut.zzch) r11;
        r1 = com.google.android.gms.internal.clearcut.zzax.zza(r3, r4, r7);
        r2 = r7.zzfd;
        r2 = r2 + r1;
    L_0x00c5:
        if (r1 >= r2) goto L_0x00d5;
    L_0x00c7:
        r1 = com.google.android.gms.internal.clearcut.zzax.zza(r3, r1, r7);
        r4 = r7.zzfd;
        r4 = com.google.android.gms.internal.clearcut.zzbk.zzm(r4);
        r11.zzac(r4);
        goto L_0x00c5;
    L_0x00d5:
        if (r1 != r2) goto L_0x00d9;
    L_0x00d7:
        goto L_0x03a0;
    L_0x00d9:
        r1 = com.google.android.gms.internal.clearcut.zzco.zzbl();
        throw r1;
    L_0x00de:
        if (r6 != 0) goto L_0x039f;
    L_0x00e0:
        r11 = (com.google.android.gms.internal.clearcut.zzch) r11;
    L_0x00e2:
        r1 = com.google.android.gms.internal.clearcut.zzax.zza(r3, r4, r7);
        r4 = r7.zzfd;
        r4 = com.google.android.gms.internal.clearcut.zzbk.zzm(r4);
        r11.zzac(r4);
        if (r1 >= r5) goto L_0x03a0;
    L_0x00f1:
        r4 = com.google.android.gms.internal.clearcut.zzax.zza(r3, r1, r7);
        r6 = r7.zzfd;
        if (r2 != r6) goto L_0x03a0;
    L_0x00f9:
        goto L_0x00e2;
    L_0x00fa:
        if (r6 != r10) goto L_0x0101;
    L_0x00fc:
        r2 = com.google.android.gms.internal.clearcut.zzax.zza(r3, r4, r11, r7);
        goto L_0x0112;
    L_0x0101:
        if (r6 != 0) goto L_0x039f;
    L_0x0103:
        r2 = r21;
        r3 = r18;
        r4 = r19;
        r5 = r20;
        r6 = r11;
        r7 = r30;
        r2 = com.google.android.gms.internal.clearcut.zzax.zza(r2, r3, r4, r5, r6, r7);
    L_0x0112:
        r1 = (com.google.android.gms.internal.clearcut.zzcg) r1;
        r3 = r1.zzjp;
        r4 = com.google.android.gms.internal.clearcut.zzey.zzea();
        if (r3 != r4) goto L_0x011d;
    L_0x011c:
        r3 = 0;
    L_0x011d:
        r4 = r0.zzaf(r8);
        r5 = r0.zzmx;
        r6 = r22;
        r3 = com.google.android.gms.internal.clearcut.zzeh.zza(r6, r11, r4, r3, r5);
        r3 = (com.google.android.gms.internal.clearcut.zzey) r3;
        if (r3 == 0) goto L_0x012f;
    L_0x012d:
        r1.zzjp = r3;
    L_0x012f:
        r1 = r2;
        goto L_0x03a0;
    L_0x0132:
        if (r6 != r10) goto L_0x039f;
    L_0x0134:
        r1 = com.google.android.gms.internal.clearcut.zzax.zza(r3, r4, r7);
        r4 = r7.zzfd;
        if (r4 != 0) goto L_0x0142;
    L_0x013c:
        r4 = com.google.android.gms.internal.clearcut.zzbb.zzfi;
        r11.add(r4);
        goto L_0x014a;
    L_0x0142:
        r6 = com.google.android.gms.internal.clearcut.zzbb.zzb(r3, r1, r4);
        r11.add(r6);
        r1 = r1 + r4;
    L_0x014a:
        if (r1 >= r5) goto L_0x03a0;
    L_0x014c:
        r4 = com.google.android.gms.internal.clearcut.zzax.zza(r3, r1, r7);
        r6 = r7.zzfd;
        if (r2 != r6) goto L_0x03a0;
    L_0x0154:
        r1 = com.google.android.gms.internal.clearcut.zzax.zza(r3, r4, r7);
        r4 = r7.zzfd;
        if (r4 != 0) goto L_0x0142;
    L_0x015c:
        goto L_0x013c;
    L_0x015d:
        if (r6 != r10) goto L_0x039f;
    L_0x015f:
        r1 = r0.zzad(r8);
        r22 = r1;
        r23 = r21;
        r24 = r18;
        r25 = r19;
        r26 = r20;
        r27 = r11;
        r28 = r30;
        r1 = zza(r22, r23, r24, r25, r26, r27, r28);
        goto L_0x03a0;
    L_0x0177:
        if (r6 != r10) goto L_0x039f;
    L_0x0179:
        r8 = 536870912; // 0x20000000 float:1.0842022E-19 double:2.652494739E-315;
        r8 = r25 & r8;
        r1 = "";
        r6 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1));
        if (r6 != 0) goto L_0x01b6;
    L_0x0184:
        r4 = com.google.android.gms.internal.clearcut.zzax.zza(r3, r4, r7);
        r6 = r7.zzfd;
        if (r6 != 0) goto L_0x0190;
    L_0x018c:
        r11.add(r1);
        goto L_0x019b;
    L_0x0190:
        r8 = new java.lang.String;
        r9 = com.google.android.gms.internal.clearcut.zzci.UTF_8;
        r8.<init>(r3, r4, r6, r9);
    L_0x0197:
        r11.add(r8);
        r4 = r4 + r6;
    L_0x019b:
        if (r4 >= r5) goto L_0x039f;
    L_0x019d:
        r6 = com.google.android.gms.internal.clearcut.zzax.zza(r3, r4, r7);
        r8 = r7.zzfd;
        if (r2 != r8) goto L_0x039f;
    L_0x01a5:
        r4 = com.google.android.gms.internal.clearcut.zzax.zza(r3, r6, r7);
        r6 = r7.zzfd;
        if (r6 != 0) goto L_0x01ae;
    L_0x01ad:
        goto L_0x018c;
    L_0x01ae:
        r8 = new java.lang.String;
        r9 = com.google.android.gms.internal.clearcut.zzci.UTF_8;
        r8.<init>(r3, r4, r6, r9);
        goto L_0x0197;
    L_0x01b6:
        r4 = com.google.android.gms.internal.clearcut.zzax.zza(r3, r4, r7);
        r6 = r7.zzfd;
        if (r6 != 0) goto L_0x01c2;
    L_0x01be:
        r11.add(r1);
        goto L_0x01d5;
    L_0x01c2:
        r8 = r4 + r6;
        r9 = com.google.android.gms.internal.clearcut.zzff.zze(r3, r4, r8);
        if (r9 == 0) goto L_0x01fd;
    L_0x01ca:
        r9 = new java.lang.String;
        r10 = com.google.android.gms.internal.clearcut.zzci.UTF_8;
        r9.<init>(r3, r4, r6, r10);
    L_0x01d1:
        r11.add(r9);
        r4 = r8;
    L_0x01d5:
        if (r4 >= r5) goto L_0x039f;
    L_0x01d7:
        r6 = com.google.android.gms.internal.clearcut.zzax.zza(r3, r4, r7);
        r8 = r7.zzfd;
        if (r2 != r8) goto L_0x039f;
    L_0x01df:
        r4 = com.google.android.gms.internal.clearcut.zzax.zza(r3, r6, r7);
        r6 = r7.zzfd;
        if (r6 != 0) goto L_0x01e8;
    L_0x01e7:
        goto L_0x01be;
    L_0x01e8:
        r8 = r4 + r6;
        r9 = com.google.android.gms.internal.clearcut.zzff.zze(r3, r4, r8);
        if (r9 == 0) goto L_0x01f8;
    L_0x01f0:
        r9 = new java.lang.String;
        r10 = com.google.android.gms.internal.clearcut.zzci.UTF_8;
        r9.<init>(r3, r4, r6, r10);
        goto L_0x01d1;
    L_0x01f8:
        r1 = com.google.android.gms.internal.clearcut.zzco.zzbp();
        throw r1;
    L_0x01fd:
        r1 = com.google.android.gms.internal.clearcut.zzco.zzbp();
        throw r1;
    L_0x0202:
        r1 = 0;
        if (r6 != r10) goto L_0x022a;
    L_0x0205:
        r11 = (com.google.android.gms.internal.clearcut.zzaz) r11;
        r2 = com.google.android.gms.internal.clearcut.zzax.zza(r3, r4, r7);
        r4 = r7.zzfd;
        r4 = r4 + r2;
    L_0x020e:
        if (r2 >= r4) goto L_0x0221;
    L_0x0210:
        r2 = com.google.android.gms.internal.clearcut.zzax.zzb(r3, r2, r7);
        r5 = r7.zzfe;
        r8 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1));
        if (r8 == 0) goto L_0x021c;
    L_0x021a:
        r5 = 1;
        goto L_0x021d;
    L_0x021c:
        r5 = 0;
    L_0x021d:
        r11.addBoolean(r5);
        goto L_0x020e;
    L_0x0221:
        if (r2 != r4) goto L_0x0225;
    L_0x0223:
        goto L_0x012f;
    L_0x0225:
        r1 = com.google.android.gms.internal.clearcut.zzco.zzbl();
        throw r1;
    L_0x022a:
        if (r6 != 0) goto L_0x039f;
    L_0x022c:
        r11 = (com.google.android.gms.internal.clearcut.zzaz) r11;
        r4 = com.google.android.gms.internal.clearcut.zzax.zzb(r3, r4, r7);
        r8 = r7.zzfe;
        r6 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1));
        if (r6 == 0) goto L_0x023a;
    L_0x0238:
        r6 = 1;
        goto L_0x023b;
    L_0x023a:
        r6 = 0;
    L_0x023b:
        r11.addBoolean(r6);
        if (r4 >= r5) goto L_0x039f;
    L_0x0240:
        r6 = com.google.android.gms.internal.clearcut.zzax.zza(r3, r4, r7);
        r8 = r7.zzfd;
        if (r2 != r8) goto L_0x039f;
    L_0x0248:
        r4 = com.google.android.gms.internal.clearcut.zzax.zzb(r3, r6, r7);
        r8 = r7.zzfe;
        r6 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1));
        if (r6 == 0) goto L_0x023a;
    L_0x0252:
        goto L_0x0238;
    L_0x0253:
        if (r6 != r10) goto L_0x0273;
    L_0x0255:
        r11 = (com.google.android.gms.internal.clearcut.zzch) r11;
        r1 = com.google.android.gms.internal.clearcut.zzax.zza(r3, r4, r7);
        r2 = r7.zzfd;
        r2 = r2 + r1;
    L_0x025e:
        if (r1 >= r2) goto L_0x026a;
    L_0x0260:
        r4 = com.google.android.gms.internal.clearcut.zzax.zzc(r3, r1);
        r11.zzac(r4);
        r1 = r1 + 4;
        goto L_0x025e;
    L_0x026a:
        if (r1 != r2) goto L_0x026e;
    L_0x026c:
        goto L_0x03a0;
    L_0x026e:
        r1 = com.google.android.gms.internal.clearcut.zzco.zzbl();
        throw r1;
    L_0x0273:
        if (r6 != r9) goto L_0x039f;
    L_0x0275:
        r11 = (com.google.android.gms.internal.clearcut.zzch) r11;
        r1 = com.google.android.gms.internal.clearcut.zzax.zzc(r18, r19);
        r11.zzac(r1);
    L_0x027e:
        r1 = r4 + 4;
        if (r1 >= r5) goto L_0x03a0;
    L_0x0282:
        r4 = com.google.android.gms.internal.clearcut.zzax.zza(r3, r1, r7);
        r6 = r7.zzfd;
        if (r2 != r6) goto L_0x03a0;
    L_0x028a:
        r1 = com.google.android.gms.internal.clearcut.zzax.zzc(r3, r4);
        r11.zzac(r1);
        goto L_0x027e;
    L_0x0292:
        if (r6 != r10) goto L_0x02b2;
    L_0x0294:
        r11 = (com.google.android.gms.internal.clearcut.zzdc) r11;
        r1 = com.google.android.gms.internal.clearcut.zzax.zza(r3, r4, r7);
        r2 = r7.zzfd;
        r2 = r2 + r1;
    L_0x029d:
        if (r1 >= r2) goto L_0x02a9;
    L_0x029f:
        r4 = com.google.android.gms.internal.clearcut.zzax.zzd(r3, r1);
        r11.zzm(r4);
        r1 = r1 + 8;
        goto L_0x029d;
    L_0x02a9:
        if (r1 != r2) goto L_0x02ad;
    L_0x02ab:
        goto L_0x03a0;
    L_0x02ad:
        r1 = com.google.android.gms.internal.clearcut.zzco.zzbl();
        throw r1;
    L_0x02b2:
        if (r6 != r13) goto L_0x039f;
    L_0x02b4:
        r11 = (com.google.android.gms.internal.clearcut.zzdc) r11;
        r8 = com.google.android.gms.internal.clearcut.zzax.zzd(r18, r19);
        r11.zzm(r8);
    L_0x02bd:
        r1 = r4 + 8;
        if (r1 >= r5) goto L_0x03a0;
    L_0x02c1:
        r4 = com.google.android.gms.internal.clearcut.zzax.zza(r3, r1, r7);
        r6 = r7.zzfd;
        if (r2 != r6) goto L_0x03a0;
    L_0x02c9:
        r8 = com.google.android.gms.internal.clearcut.zzax.zzd(r3, r4);
        r11.zzm(r8);
        goto L_0x02bd;
    L_0x02d1:
        if (r6 != r10) goto L_0x02d9;
    L_0x02d3:
        r1 = com.google.android.gms.internal.clearcut.zzax.zza(r3, r4, r11, r7);
        goto L_0x03a0;
    L_0x02d9:
        if (r6 != 0) goto L_0x039f;
    L_0x02db:
        r22 = r18;
        r23 = r19;
        r24 = r20;
        r25 = r11;
        r26 = r30;
        r1 = com.google.android.gms.internal.clearcut.zzax.zza(r21, r22, r23, r24, r25, r26);
        goto L_0x03a0;
    L_0x02eb:
        if (r6 != r10) goto L_0x030b;
    L_0x02ed:
        r11 = (com.google.android.gms.internal.clearcut.zzdc) r11;
        r1 = com.google.android.gms.internal.clearcut.zzax.zza(r3, r4, r7);
        r2 = r7.zzfd;
        r2 = r2 + r1;
    L_0x02f6:
        if (r1 >= r2) goto L_0x0302;
    L_0x02f8:
        r1 = com.google.android.gms.internal.clearcut.zzax.zzb(r3, r1, r7);
        r4 = r7.zzfe;
        r11.zzm(r4);
        goto L_0x02f6;
    L_0x0302:
        if (r1 != r2) goto L_0x0306;
    L_0x0304:
        goto L_0x03a0;
    L_0x0306:
        r1 = com.google.android.gms.internal.clearcut.zzco.zzbl();
        throw r1;
    L_0x030b:
        if (r6 != 0) goto L_0x039f;
    L_0x030d:
        r11 = (com.google.android.gms.internal.clearcut.zzdc) r11;
    L_0x030f:
        r1 = com.google.android.gms.internal.clearcut.zzax.zzb(r3, r4, r7);
        r8 = r7.zzfe;
        r11.zzm(r8);
        if (r1 >= r5) goto L_0x03a0;
    L_0x031a:
        r4 = com.google.android.gms.internal.clearcut.zzax.zza(r3, r1, r7);
        r6 = r7.zzfd;
        if (r2 != r6) goto L_0x03a0;
    L_0x0322:
        goto L_0x030f;
    L_0x0323:
        if (r6 != r10) goto L_0x0342;
    L_0x0325:
        r11 = (com.google.android.gms.internal.clearcut.zzce) r11;
        r1 = com.google.android.gms.internal.clearcut.zzax.zza(r3, r4, r7);
        r2 = r7.zzfd;
        r2 = r2 + r1;
    L_0x032e:
        if (r1 >= r2) goto L_0x033a;
    L_0x0330:
        r4 = com.google.android.gms.internal.clearcut.zzax.zzf(r3, r1);
        r11.zzc(r4);
        r1 = r1 + 4;
        goto L_0x032e;
    L_0x033a:
        if (r1 != r2) goto L_0x033d;
    L_0x033c:
        goto L_0x03a0;
    L_0x033d:
        r1 = com.google.android.gms.internal.clearcut.zzco.zzbl();
        throw r1;
    L_0x0342:
        if (r6 != r9) goto L_0x039f;
    L_0x0344:
        r11 = (com.google.android.gms.internal.clearcut.zzce) r11;
        r1 = com.google.android.gms.internal.clearcut.zzax.zzf(r18, r19);
        r11.zzc(r1);
    L_0x034d:
        r1 = r4 + 4;
        if (r1 >= r5) goto L_0x03a0;
    L_0x0351:
        r4 = com.google.android.gms.internal.clearcut.zzax.zza(r3, r1, r7);
        r6 = r7.zzfd;
        if (r2 != r6) goto L_0x03a0;
    L_0x0359:
        r1 = com.google.android.gms.internal.clearcut.zzax.zzf(r3, r4);
        r11.zzc(r1);
        goto L_0x034d;
    L_0x0361:
        if (r6 != r10) goto L_0x0380;
    L_0x0363:
        r11 = (com.google.android.gms.internal.clearcut.zzbq) r11;
        r1 = com.google.android.gms.internal.clearcut.zzax.zza(r3, r4, r7);
        r2 = r7.zzfd;
        r2 = r2 + r1;
    L_0x036c:
        if (r1 >= r2) goto L_0x0378;
    L_0x036e:
        r4 = com.google.android.gms.internal.clearcut.zzax.zze(r3, r1);
        r11.zzc(r4);
        r1 = r1 + 8;
        goto L_0x036c;
    L_0x0378:
        if (r1 != r2) goto L_0x037b;
    L_0x037a:
        goto L_0x03a0;
    L_0x037b:
        r1 = com.google.android.gms.internal.clearcut.zzco.zzbl();
        throw r1;
    L_0x0380:
        if (r6 != r13) goto L_0x039f;
    L_0x0382:
        r11 = (com.google.android.gms.internal.clearcut.zzbq) r11;
        r8 = com.google.android.gms.internal.clearcut.zzax.zze(r18, r19);
        r11.zzc(r8);
    L_0x038b:
        r1 = r4 + 8;
        if (r1 >= r5) goto L_0x03a0;
    L_0x038f:
        r4 = com.google.android.gms.internal.clearcut.zzax.zza(r3, r1, r7);
        r6 = r7.zzfd;
        if (r2 != r6) goto L_0x03a0;
    L_0x0397:
        r8 = com.google.android.gms.internal.clearcut.zzax.zze(r3, r4);
        r11.zzc(r8);
        goto L_0x038b;
    L_0x039f:
        r1 = r4;
    L_0x03a0:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.zzds.zza(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.clearcut.zzay):int");
    }

    private final <K, V> int zza(T t, byte[] bArr, int i, int i2, int i3, int i4, long j, zzay zzay) {
        Unsafe unsafe = zzmh;
        Object zzae = zzae(i3);
        Object object = unsafe.getObject(t, j);
        if (this.zzmz.zzi(object)) {
            Object zzk = this.zzmz.zzk(zzae);
            this.zzmz.zzb(zzk, object);
            unsafe.putObject(t, j, zzk);
            object = zzk;
        }
        zzdh zzl = this.zzmz.zzl(zzae);
        Map zzg = this.zzmz.zzg(object);
        i = zzax.zza(bArr, i, zzay);
        i4 = zzay.zzfd;
        if (i4 < 0 || i4 > i2 - i) {
            throw zzco.zzbl();
        }
        i4 += i;
        Object obj = zzl.zzmc;
        Object obj2 = zzl.zzdu;
        while (i < i4) {
            int i5 = i + 1;
            i = bArr[i];
            if (i < 0) {
                i5 = zzax.zza(i, bArr, i5, zzay);
                i = zzay.zzfd;
            }
            int i6 = i5;
            i5 = i >>> 3;
            int i7 = i & 7;
            if (i5 != 1) {
                if (i5 == 2 && i7 == zzl.zzmd.zzel()) {
                    i = zza(bArr, i6, i2, zzl.zzmd, zzl.zzdu.getClass(), zzay);
                    obj2 = zzay.zzff;
                }
            } else if (i7 == zzl.zzmb.zzel()) {
                i = zza(bArr, i6, i2, zzl.zzmb, null, zzay);
                obj = zzay.zzff;
            }
            i = zzax.zza(i, bArr, i6, i2, zzay);
        }
        if (i == i4) {
            zzg.put(obj, obj2);
            return i4;
        }
        throw zzco.zzbo();
    }

    /* JADX WARNING: Removed duplicated region for block: B:137:0x03b2  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x03a9  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x03ba  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0401  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x03f7  */
    /* JADX WARNING: Missing block: B:21:0x0073, code skipped:
            r5 = r4;
            r29 = r7;
     */
    /* JADX WARNING: Missing block: B:33:0x00d8, code skipped:
            r12 = r28;
     */
    /* JADX WARNING: Missing block: B:45:0x0125, code skipped:
            r13 = r30;
     */
    /* JADX WARNING: Missing block: B:49:0x013c, code skipped:
            r6 = r6 | r20;
            r13 = r30;
            r0 = r2;
     */
    /* JADX WARNING: Missing block: B:50:0x0141, code skipped:
            r1 = r9;
            r9 = r11;
     */
    /* JADX WARNING: Missing block: B:65:0x0190, code skipped:
            r10.putObject(r14, r7, r1);
     */
    /* JADX WARNING: Missing block: B:76:0x01ca, code skipped:
            r6 = r6 | r20;
            r7 = r29;
            r13 = r5;
     */
    /* JADX WARNING: Missing block: B:80:0x01f1, code skipped:
            r5 = r4;
     */
    /* JADX WARNING: Missing block: B:93:0x025a, code skipped:
            r6 = r6 | r20;
            r7 = r29;
            r13 = r30;
     */
    /* JADX WARNING: Missing block: B:94:0x0260, code skipped:
            r1 = r9;
            r9 = r11;
     */
    /* JADX WARNING: Missing block: B:95:0x0262, code skipped:
            r8 = -1;
     */
    /* JADX WARNING: Missing block: B:96:0x0263, code skipped:
            r11 = r31;
     */
    /* JADX WARNING: Missing block: B:97:0x0267, code skipped:
            r19 = r29;
            r7 = r31;
            r2 = r5;
            r20 = r6;
            r6 = r9;
            r25 = r10;
     */
    /* JADX WARNING: Missing block: B:114:0x02fa, code skipped:
            if (r0 == r15) goto L_0x035b;
     */
    /* JADX WARNING: Missing block: B:121:0x033b, code skipped:
            if (r0 == r15) goto L_0x035b;
     */
    /* JADX WARNING: Missing block: B:123:0x0359, code skipped:
            if (r0 == r15) goto L_0x035b;
     */
    /* JADX WARNING: Missing block: B:124:0x035b, code skipped:
            r6 = r29;
            r7 = r31;
            r2 = r0;
     */
    private final int zza(T r27, byte[] r28, int r29, int r30, int r31, com.google.android.gms.internal.clearcut.zzay r32) {
        /*
        r26 = this;
        r15 = r26;
        r14 = r27;
        r12 = r28;
        r13 = r30;
        r11 = r31;
        r9 = r32;
        r10 = zzmh;
        r16 = 0;
        r8 = -1;
        r0 = r29;
        r1 = 0;
        r6 = 0;
        r7 = -1;
    L_0x0016:
        r17 = 1048575; // 0xfffff float:1.469367E-39 double:5.18065E-318;
        if (r0 >= r13) goto L_0x0399;
    L_0x001b:
        r1 = r0 + 1;
        r0 = r12[r0];
        if (r0 >= 0) goto L_0x002a;
    L_0x0021:
        r0 = com.google.android.gms.internal.clearcut.zzax.zza(r0, r12, r1, r9);
        r1 = r9.zzfd;
        r4 = r0;
        r5 = r1;
        goto L_0x002c;
    L_0x002a:
        r5 = r0;
        r4 = r1;
    L_0x002c:
        r3 = r5 >>> 3;
        r2 = r5 & 7;
        r1 = r15.zzai(r3);
        if (r1 == r8) goto L_0x0361;
    L_0x0036:
        r0 = r15.zzmi;
        r18 = r1 + 1;
        r8 = r0[r18];
        r18 = 267386880; // 0xff00000 float:2.3665827E-29 double:1.321066716E-315;
        r18 = r8 & r18;
        r11 = r18 >>> 20;
        r29 = r5;
        r5 = r8 & r17;
        r12 = (long) r5;
        r5 = 17;
        r18 = r8;
        if (r11 > r5) goto L_0x0273;
    L_0x004d:
        r5 = r1 + 2;
        r0 = r0[r5];
        r5 = r0 >>> 20;
        r8 = 1;
        r20 = r8 << r5;
        r0 = r0 & r17;
        if (r0 == r7) goto L_0x0068;
    L_0x005a:
        r5 = -1;
        if (r7 == r5) goto L_0x0061;
    L_0x005d:
        r8 = (long) r7;
        r10.putInt(r14, r8, r6);
    L_0x0061:
        r6 = (long) r0;
        r6 = r10.getInt(r14, r6);
        r7 = r0;
        goto L_0x0069;
    L_0x0068:
        r5 = -1;
    L_0x0069:
        r0 = 5;
        switch(r11) {
            case 0: goto L_0x0244;
            case 1: goto L_0x022e;
            case 2: goto L_0x020a;
            case 3: goto L_0x020a;
            case 4: goto L_0x01f4;
            case 5: goto L_0x01d1;
            case 6: goto L_0x01b4;
            case 7: goto L_0x0194;
            case 8: goto L_0x0171;
            case 9: goto L_0x0145;
            case 10: goto L_0x0128;
            case 11: goto L_0x01f4;
            case 12: goto L_0x00f3;
            case 13: goto L_0x01b4;
            case 14: goto L_0x01d1;
            case 15: goto L_0x00db;
            case 16: goto L_0x00b5;
            case 17: goto L_0x0078;
            default: goto L_0x006d;
        };
    L_0x006d:
        r12 = r28;
        r9 = r29;
        r11 = r32;
    L_0x0073:
        r5 = r4;
        r29 = r7;
        goto L_0x0267;
    L_0x0078:
        r0 = 3;
        if (r2 != r0) goto L_0x00b0;
    L_0x007b:
        r0 = r3 << 3;
        r8 = r0 | 4;
        r0 = r15.zzad(r1);
        r1 = r28;
        r2 = r4;
        r3 = r30;
        r4 = r8;
        r9 = r29;
        r8 = -1;
        r5 = r32;
        r0 = zza(r0, r1, r2, r3, r4, r5);
        r1 = r6 & r20;
        if (r1 != 0) goto L_0x009b;
    L_0x0096:
        r11 = r32;
        r1 = r11.zzff;
        goto L_0x00a7;
    L_0x009b:
        r11 = r32;
        r1 = r10.getObject(r14, r12);
        r2 = r11.zzff;
        r1 = com.google.android.gms.internal.clearcut.zzci.zza(r1, r2);
    L_0x00a7:
        r10.putObject(r14, r12, r1);
        r6 = r6 | r20;
        r12 = r28;
        goto L_0x0125;
    L_0x00b0:
        r9 = r29;
        r11 = r32;
        goto L_0x00d8;
    L_0x00b5:
        r9 = r29;
        r11 = r32;
        r8 = -1;
        if (r2 != 0) goto L_0x00d8;
    L_0x00bc:
        r2 = r12;
        r12 = r28;
        r13 = com.google.android.gms.internal.clearcut.zzax.zzb(r12, r4, r11);
        r0 = r11.zzfe;
        r4 = com.google.android.gms.internal.clearcut.zzbk.zza(r0);
        r0 = r10;
        r1 = r27;
        r0.putLong(r1, r2, r4);
        r6 = r6 | r20;
        r1 = r9;
        r9 = r11;
        r0 = r13;
        r13 = r30;
        goto L_0x0263;
    L_0x00d8:
        r12 = r28;
        goto L_0x0073;
    L_0x00db:
        r9 = r29;
        r11 = r32;
        r0 = r12;
        r8 = -1;
        r12 = r28;
        if (r2 != 0) goto L_0x0073;
    L_0x00e5:
        r2 = com.google.android.gms.internal.clearcut.zzax.zza(r12, r4, r11);
        r3 = r11.zzfd;
        r3 = com.google.android.gms.internal.clearcut.zzbk.zzm(r3);
        r10.putInt(r14, r0, r3);
        goto L_0x013c;
    L_0x00f3:
        r9 = r29;
        r11 = r32;
        r21 = r12;
        r8 = -1;
        r12 = r28;
        if (r2 != 0) goto L_0x0073;
    L_0x00fe:
        r0 = com.google.android.gms.internal.clearcut.zzax.zza(r12, r4, r11);
        r2 = r11.zzfd;
        r1 = r15.zzaf(r1);
        if (r1 == 0) goto L_0x011e;
    L_0x010a:
        r1 = r1.zzb(r2);
        if (r1 == 0) goto L_0x0111;
    L_0x0110:
        goto L_0x011e;
    L_0x0111:
        r1 = zzn(r27);
        r2 = (long) r2;
        r2 = java.lang.Long.valueOf(r2);
        r1.zzb(r9, r2);
        goto L_0x0125;
    L_0x011e:
        r3 = r21;
        r10.putInt(r14, r3, r2);
        r6 = r6 | r20;
    L_0x0125:
        r13 = r30;
        goto L_0x0141;
    L_0x0128:
        r9 = r29;
        r11 = r32;
        r0 = r12;
        r3 = 2;
        r8 = -1;
        r12 = r28;
        if (r2 != r3) goto L_0x0073;
    L_0x0133:
        r2 = com.google.android.gms.internal.clearcut.zzax.zze(r12, r4, r11);
        r3 = r11.zzff;
        r10.putObject(r14, r0, r3);
    L_0x013c:
        r6 = r6 | r20;
        r13 = r30;
        r0 = r2;
    L_0x0141:
        r1 = r9;
        r9 = r11;
        goto L_0x0263;
    L_0x0145:
        r9 = r29;
        r11 = r32;
        r29 = r7;
        r7 = r12;
        r3 = 2;
        r12 = r28;
        if (r2 != r3) goto L_0x016d;
    L_0x0151:
        r0 = r15.zzad(r1);
        r5 = r30;
        r0 = zza(r0, r12, r4, r5, r11);
        r1 = r6 & r20;
        if (r1 != 0) goto L_0x0162;
    L_0x015f:
        r1 = r11.zzff;
        goto L_0x0190;
    L_0x0162:
        r1 = r10.getObject(r14, r7);
        r2 = r11.zzff;
        r1 = com.google.android.gms.internal.clearcut.zzci.zza(r1, r2);
        goto L_0x0190;
    L_0x016d:
        r5 = r30;
        goto L_0x01f1;
    L_0x0171:
        r9 = r29;
        r5 = r30;
        r11 = r32;
        r29 = r7;
        r7 = r12;
        r0 = 2;
        r12 = r28;
        if (r2 != r0) goto L_0x01f1;
    L_0x017f:
        r0 = 536870912; // 0x20000000 float:1.0842022E-19 double:2.652494739E-315;
        r0 = r18 & r0;
        if (r0 != 0) goto L_0x018a;
    L_0x0185:
        r0 = com.google.android.gms.internal.clearcut.zzax.zzc(r12, r4, r11);
        goto L_0x018e;
    L_0x018a:
        r0 = com.google.android.gms.internal.clearcut.zzax.zzd(r12, r4, r11);
    L_0x018e:
        r1 = r11.zzff;
    L_0x0190:
        r10.putObject(r14, r7, r1);
        goto L_0x01ca;
    L_0x0194:
        r9 = r29;
        r5 = r30;
        r11 = r32;
        r29 = r7;
        r7 = r12;
        r12 = r28;
        if (r2 != 0) goto L_0x01f1;
    L_0x01a1:
        r0 = com.google.android.gms.internal.clearcut.zzax.zzb(r12, r4, r11);
        r1 = r11.zzfe;
        r3 = 0;
        r17 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1));
        if (r17 == 0) goto L_0x01af;
    L_0x01ad:
        r1 = 1;
        goto L_0x01b0;
    L_0x01af:
        r1 = 0;
    L_0x01b0:
        com.google.android.gms.internal.clearcut.zzfd.zza(r14, r7, r1);
        goto L_0x01ca;
    L_0x01b4:
        r9 = r29;
        r5 = r30;
        r11 = r32;
        r29 = r7;
        r7 = r12;
        r12 = r28;
        if (r2 != r0) goto L_0x01f1;
    L_0x01c1:
        r0 = com.google.android.gms.internal.clearcut.zzax.zzc(r12, r4);
        r10.putInt(r14, r7, r0);
        r0 = r4 + 4;
    L_0x01ca:
        r6 = r6 | r20;
        r7 = r29;
        r13 = r5;
        goto L_0x0260;
    L_0x01d1:
        r9 = r29;
        r5 = r30;
        r11 = r32;
        r29 = r7;
        r7 = r12;
        r0 = 1;
        r12 = r28;
        if (r2 != r0) goto L_0x01f1;
    L_0x01df:
        r17 = com.google.android.gms.internal.clearcut.zzax.zzd(r12, r4);
        r0 = r10;
        r1 = r27;
        r2 = r7;
        r7 = r4;
        r4 = r17;
        r0.putLong(r1, r2, r4);
        r0 = r7 + 8;
        goto L_0x025a;
    L_0x01f1:
        r5 = r4;
        goto L_0x0267;
    L_0x01f4:
        r9 = r29;
        r11 = r32;
        r5 = r4;
        r29 = r7;
        r7 = r12;
        r12 = r28;
        if (r2 != 0) goto L_0x0267;
    L_0x0200:
        r0 = com.google.android.gms.internal.clearcut.zzax.zza(r12, r5, r11);
        r1 = r11.zzfd;
        r10.putInt(r14, r7, r1);
        goto L_0x025a;
    L_0x020a:
        r9 = r29;
        r11 = r32;
        r5 = r4;
        r29 = r7;
        r7 = r12;
        r12 = r28;
        if (r2 != 0) goto L_0x0267;
    L_0x0216:
        r17 = com.google.android.gms.internal.clearcut.zzax.zzb(r12, r5, r11);
        r4 = r11.zzfe;
        r0 = r10;
        r1 = r27;
        r2 = r7;
        r0.putLong(r1, r2, r4);
        r6 = r6 | r20;
        r7 = r29;
        r13 = r30;
        r1 = r9;
        r9 = r11;
        r0 = r17;
        goto L_0x0262;
    L_0x022e:
        r9 = r29;
        r11 = r32;
        r5 = r4;
        r29 = r7;
        r7 = r12;
        r12 = r28;
        if (r2 != r0) goto L_0x0267;
    L_0x023a:
        r0 = com.google.android.gms.internal.clearcut.zzax.zzf(r12, r5);
        com.google.android.gms.internal.clearcut.zzfd.zza(r14, r7, r0);
        r0 = r5 + 4;
        goto L_0x025a;
    L_0x0244:
        r9 = r29;
        r11 = r32;
        r5 = r4;
        r29 = r7;
        r7 = r12;
        r0 = 1;
        r12 = r28;
        if (r2 != r0) goto L_0x0267;
    L_0x0251:
        r0 = com.google.android.gms.internal.clearcut.zzax.zze(r12, r5);
        com.google.android.gms.internal.clearcut.zzfd.zza(r14, r7, r0);
        r0 = r5 + 8;
    L_0x025a:
        r6 = r6 | r20;
        r7 = r29;
        r13 = r30;
    L_0x0260:
        r1 = r9;
        r9 = r11;
    L_0x0262:
        r8 = -1;
    L_0x0263:
        r11 = r31;
        goto L_0x0016;
    L_0x0267:
        r19 = r29;
        r7 = r31;
        r2 = r5;
        r20 = r6;
        r6 = r9;
        r25 = r10;
        goto L_0x036f;
    L_0x0273:
        r9 = r29;
        r5 = r4;
        r19 = r7;
        r7 = r12;
        r12 = r28;
        r0 = 27;
        if (r11 != r0) goto L_0x02c8;
    L_0x027f:
        r0 = 2;
        if (r2 != r0) goto L_0x02c1;
    L_0x0282:
        r0 = r10.getObject(r14, r7);
        r0 = (com.google.android.gms.internal.clearcut.zzcn) r0;
        r2 = r0.zzu();
        if (r2 != 0) goto L_0x02a0;
    L_0x028e:
        r2 = r0.size();
        if (r2 != 0) goto L_0x0297;
    L_0x0294:
        r2 = 10;
        goto L_0x0299;
    L_0x0297:
        r2 = r2 << 1;
    L_0x0299:
        r0 = r0.zzi(r2);
        r10.putObject(r14, r7, r0);
    L_0x02a0:
        r7 = r0;
        r0 = r15.zzad(r1);
        r1 = r9;
        r2 = r28;
        r3 = r5;
        r4 = r30;
        r5 = r7;
        r20 = r6;
        r6 = r32;
        r0 = zza(r0, r1, r2, r3, r4, r5, r6);
        r13 = r30;
        r11 = r31;
        r7 = r19;
        r6 = r20;
        r8 = -1;
        r9 = r32;
        goto L_0x0016;
    L_0x02c1:
        r20 = r6;
        r15 = r5;
        r29 = r9;
        goto L_0x0368;
    L_0x02c8:
        r20 = r6;
        r0 = 49;
        if (r11 > r0) goto L_0x030e;
    L_0x02ce:
        r6 = r18;
        r13 = (long) r6;
        r0 = r26;
        r18 = r1;
        r1 = r27;
        r6 = r2;
        r2 = r28;
        r21 = r3;
        r3 = r5;
        r4 = r30;
        r15 = r5;
        r5 = r9;
        r22 = r6;
        r6 = r21;
        r23 = r7;
        r7 = r22;
        r8 = r18;
        r29 = r9;
        r25 = r10;
        r9 = r13;
        r14 = r31;
        r12 = r23;
        r14 = r32;
        r0 = r0.zza(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14);
        if (r0 != r15) goto L_0x02fe;
    L_0x02fc:
        goto L_0x035b;
    L_0x02fe:
        r15 = r26;
        r14 = r27;
        r12 = r28;
        r1 = r29;
        r13 = r30;
        r11 = r31;
        r9 = r32;
        goto L_0x0390;
    L_0x030e:
        r22 = r2;
        r21 = r3;
        r15 = r5;
        r23 = r7;
        r29 = r9;
        r25 = r10;
        r6 = r18;
        r18 = r1;
        r0 = 50;
        if (r11 != r0) goto L_0x033e;
    L_0x0321:
        r7 = r22;
        r0 = 2;
        if (r7 != r0) goto L_0x036a;
    L_0x0326:
        r0 = r26;
        r1 = r27;
        r2 = r28;
        r3 = r15;
        r4 = r30;
        r5 = r18;
        r6 = r21;
        r7 = r23;
        r9 = r32;
        r0 = r0.zza(r1, r2, r3, r4, r5, r6, r7, r9);
        if (r0 != r15) goto L_0x02fe;
    L_0x033d:
        goto L_0x035b;
    L_0x033e:
        r7 = r22;
        r0 = r26;
        r1 = r27;
        r2 = r28;
        r3 = r15;
        r4 = r30;
        r5 = r29;
        r8 = r6;
        r6 = r21;
        r9 = r11;
        r10 = r23;
        r12 = r18;
        r13 = r32;
        r0 = r0.zza(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13);
        if (r0 != r15) goto L_0x02fe;
    L_0x035b:
        r6 = r29;
        r7 = r31;
        r2 = r0;
        goto L_0x036f;
    L_0x0361:
        r15 = r4;
        r29 = r5;
        r20 = r6;
        r19 = r7;
    L_0x0368:
        r25 = r10;
    L_0x036a:
        r6 = r29;
        r7 = r31;
        r2 = r15;
    L_0x036f:
        if (r6 != r7) goto L_0x0377;
    L_0x0371:
        if (r7 != 0) goto L_0x0374;
    L_0x0373:
        goto L_0x0377;
    L_0x0374:
        r8 = r2;
        r9 = r6;
        goto L_0x03a2;
    L_0x0377:
        r0 = r6;
        r1 = r28;
        r3 = r30;
        r4 = r27;
        r5 = r32;
        r0 = zza(r0, r1, r2, r3, r4, r5);
        r15 = r26;
        r14 = r27;
        r12 = r28;
        r13 = r30;
        r9 = r32;
        r1 = r6;
        r11 = r7;
    L_0x0390:
        r7 = r19;
        r6 = r20;
        r10 = r25;
        r8 = -1;
        goto L_0x0016;
    L_0x0399:
        r20 = r6;
        r19 = r7;
        r25 = r10;
        r7 = r11;
        r8 = r0;
        r9 = r1;
    L_0x03a2:
        r0 = r19;
        r1 = r20;
        r2 = -1;
        if (r0 == r2) goto L_0x03b2;
    L_0x03a9:
        r2 = (long) r0;
        r10 = r27;
        r0 = r25;
        r0.putInt(r10, r2, r1);
        goto L_0x03b4;
    L_0x03b2:
        r10 = r27;
    L_0x03b4:
        r11 = r26;
        r12 = r11.zzmt;
        if (r12 == 0) goto L_0x03f5;
    L_0x03ba:
        r0 = 0;
        r13 = r12.length;
        r5 = r0;
        r14 = 0;
    L_0x03be:
        if (r14 >= r13) goto L_0x03ee;
    L_0x03c0:
        r1 = r12[r14];
        r6 = r11.zzmx;
        r0 = r11.zzmi;
        r2 = r0[r1];
        r0 = r11.zzag(r1);
        r0 = r0 & r17;
        r3 = (long) r0;
        r0 = com.google.android.gms.internal.clearcut.zzfd.zzo(r10, r3);
        if (r0 != 0) goto L_0x03d6;
    L_0x03d5:
        goto L_0x03e9;
    L_0x03d6:
        r4 = r11.zzaf(r1);
        if (r4 != 0) goto L_0x03dd;
    L_0x03dc:
        goto L_0x03e9;
    L_0x03dd:
        r3 = r11.zzmz;
        r3 = r3.zzg(r0);
        r0 = r26;
        r5 = r0.zza(r1, r2, r3, r4, r5, r6);
    L_0x03e9:
        r5 = (com.google.android.gms.internal.clearcut.zzey) r5;
        r14 = r14 + 1;
        goto L_0x03be;
    L_0x03ee:
        if (r5 == 0) goto L_0x03f5;
    L_0x03f0:
        r0 = r11.zzmx;
        r0.zzf(r10, r5);
    L_0x03f5:
        if (r7 != 0) goto L_0x0401;
    L_0x03f7:
        r0 = r30;
        if (r8 != r0) goto L_0x03fc;
    L_0x03fb:
        goto L_0x0407;
    L_0x03fc:
        r0 = com.google.android.gms.internal.clearcut.zzco.zzbo();
        throw r0;
    L_0x0401:
        r0 = r30;
        if (r8 > r0) goto L_0x0408;
    L_0x0405:
        if (r9 != r7) goto L_0x0408;
    L_0x0407:
        return r8;
    L_0x0408:
        r0 = com.google.android.gms.internal.clearcut.zzco.zzbo();
        goto L_0x040e;
    L_0x040d:
        throw r0;
    L_0x040e:
        goto L_0x040d;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.zzds.zza(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.clearcut.zzay):int");
    }

    /* JADX WARNING: Missing block: B:9:0x0043, code skipped:
            r2 = java.lang.Long.valueOf(r2);
     */
    /* JADX WARNING: Missing block: B:11:0x004e, code skipped:
            r2 = java.lang.Integer.valueOf(r2);
     */
    /* JADX WARNING: Missing block: B:12:0x0052, code skipped:
            r6.zzff = r2;
     */
    /* JADX WARNING: Missing block: B:16:0x006f, code skipped:
            r6.zzff = r1;
     */
    /* JADX WARNING: Missing block: B:18:0x007c, code skipped:
            r6.zzff = r1;
     */
    /* JADX WARNING: Missing block: B:27:?, code skipped:
            return r1;
     */
    /* JADX WARNING: Missing block: B:28:?, code skipped:
            return r2 + 4;
     */
    /* JADX WARNING: Missing block: B:29:?, code skipped:
            return r2 + 8;
     */
    private static int zza(byte[] r1, int r2, int r3, com.google.android.gms.internal.clearcut.zzfl r4, java.lang.Class<?> r5, com.google.android.gms.internal.clearcut.zzay r6) {
        /*
        r0 = com.google.android.gms.internal.clearcut.zzdt.zzgq;
        r4 = r4.ordinal();
        r4 = r0[r4];
        switch(r4) {
            case 1: goto L_0x0086;
            case 2: goto L_0x0081;
            case 3: goto L_0x0074;
            case 4: goto L_0x0067;
            case 5: goto L_0x0067;
            case 6: goto L_0x005e;
            case 7: goto L_0x005e;
            case 8: goto L_0x0055;
            case 9: goto L_0x0048;
            case 10: goto L_0x0048;
            case 11: goto L_0x0048;
            case 12: goto L_0x003d;
            case 13: goto L_0x003d;
            case 14: goto L_0x0030;
            case 15: goto L_0x0025;
            case 16: goto L_0x001a;
            case 17: goto L_0x0014;
            default: goto L_0x000b;
        };
    L_0x000b:
        r1 = new java.lang.RuntimeException;
        r2 = "unsupported field type.";
        r1.<init>(r2);
        throw r1;
    L_0x0014:
        r1 = com.google.android.gms.internal.clearcut.zzax.zzd(r1, r2, r6);
        goto L_0x009a;
    L_0x001a:
        r1 = com.google.android.gms.internal.clearcut.zzax.zzb(r1, r2, r6);
        r2 = r6.zzfe;
        r2 = com.google.android.gms.internal.clearcut.zzbk.zza(r2);
        goto L_0x0043;
    L_0x0025:
        r1 = com.google.android.gms.internal.clearcut.zzax.zza(r1, r2, r6);
        r2 = r6.zzfd;
        r2 = com.google.android.gms.internal.clearcut.zzbk.zzm(r2);
        goto L_0x004e;
    L_0x0030:
        r4 = com.google.android.gms.internal.clearcut.zzea.zzcm();
        r4 = r4.zze(r5);
        r1 = zza(r4, r1, r2, r3, r6);
        goto L_0x009a;
    L_0x003d:
        r1 = com.google.android.gms.internal.clearcut.zzax.zzb(r1, r2, r6);
        r2 = r6.zzfe;
    L_0x0043:
        r2 = java.lang.Long.valueOf(r2);
        goto L_0x0052;
    L_0x0048:
        r1 = com.google.android.gms.internal.clearcut.zzax.zza(r1, r2, r6);
        r2 = r6.zzfd;
    L_0x004e:
        r2 = java.lang.Integer.valueOf(r2);
    L_0x0052:
        r6.zzff = r2;
        goto L_0x009a;
    L_0x0055:
        r1 = com.google.android.gms.internal.clearcut.zzax.zzf(r1, r2);
        r1 = java.lang.Float.valueOf(r1);
        goto L_0x006f;
    L_0x005e:
        r3 = com.google.android.gms.internal.clearcut.zzax.zzd(r1, r2);
        r1 = java.lang.Long.valueOf(r3);
        goto L_0x007c;
    L_0x0067:
        r1 = com.google.android.gms.internal.clearcut.zzax.zzc(r1, r2);
        r1 = java.lang.Integer.valueOf(r1);
    L_0x006f:
        r6.zzff = r1;
        r1 = r2 + 4;
        goto L_0x009a;
    L_0x0074:
        r3 = com.google.android.gms.internal.clearcut.zzax.zze(r1, r2);
        r1 = java.lang.Double.valueOf(r3);
    L_0x007c:
        r6.zzff = r1;
        r1 = r2 + 8;
        goto L_0x009a;
    L_0x0081:
        r1 = com.google.android.gms.internal.clearcut.zzax.zze(r1, r2, r6);
        goto L_0x009a;
    L_0x0086:
        r1 = com.google.android.gms.internal.clearcut.zzax.zzb(r1, r2, r6);
        r2 = r6.zzfe;
        r4 = 0;
        r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r0 == 0) goto L_0x0094;
    L_0x0092:
        r2 = 1;
        goto L_0x0095;
    L_0x0094:
        r2 = 0;
    L_0x0095:
        r2 = java.lang.Boolean.valueOf(r2);
        goto L_0x0052;
    L_0x009a:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.zzds.zza(byte[], int, int, com.google.android.gms.internal.clearcut.zzfl, java.lang.Class, com.google.android.gms.internal.clearcut.zzay):int");
    }

    static <T> zzds<T> zza(Class<T> cls, zzdm zzdm, zzdw zzdw, zzcy zzcy, zzex<?, ?> zzex, zzbu<?> zzbu, zzdj zzdj) {
        zzdm zzdm2 = zzdm;
        if (zzdm2 instanceof zzec) {
            int i;
            int i2;
            int i3;
            int zzcq;
            zzec zzec = (zzec) zzdm2;
            boolean z = zzec.zzcf() == zzg.zzkm;
            if (zzec.getFieldCount() == 0) {
                i = 0;
                i2 = 0;
                i3 = 0;
            } else {
                int zzcp = zzec.zzcp();
                zzcq = zzec.zzcq();
                i = zzec.zzcu();
                i2 = zzcp;
                i3 = zzcq;
            }
            int[] iArr = new int[(i << 2)];
            Object[] objArr = new Object[(i << 1)];
            int[] iArr2 = zzec.zzcr() > 0 ? new int[zzec.zzcr()] : null;
            int[] iArr3 = zzec.zzcs() > 0 ? new int[zzec.zzcs()] : null;
            zzed zzco = zzec.zzco();
            if (zzco.next()) {
                zzcq = zzco.zzcx();
                i = 0;
                int i4 = 0;
                int i5 = 0;
                while (true) {
                    int i6;
                    if (zzcq >= zzec.zzcv() || i >= ((zzcq - i2) << 2)) {
                        int zza;
                        if (zzco.zzda()) {
                            zzcq = (int) zzfd.zza(zzco.zzdb());
                            zza = (int) zzfd.zza(zzco.zzdc());
                            i6 = 0;
                        } else {
                            zzcq = (int) zzfd.zza(zzco.zzdd());
                            if (zzco.zzde()) {
                                zza = (int) zzfd.zza(zzco.zzdf());
                                i6 = zzco.zzdg();
                            } else {
                                i6 = 0;
                                zza = 0;
                            }
                        }
                        iArr[i] = zzco.zzcx();
                        int i7 = i + 1;
                        iArr[i7] = (((zzco.zzdi() ? 536870912 : 0) | (zzco.zzdh() ? 268435456 : 0)) | (zzco.zzcy() << 20)) | zzcq;
                        iArr[i + 2] = (i6 << 20) | zza;
                        if (zzco.zzdl() != null) {
                            zzcq = (i / 4) << 1;
                            objArr[zzcq] = zzco.zzdl();
                            if (zzco.zzdj() != null) {
                                objArr[zzcq + 1] = zzco.zzdj();
                            } else if (zzco.zzdk() != null) {
                                objArr[zzcq + 1] = zzco.zzdk();
                            }
                        } else if (zzco.zzdj() != null) {
                            objArr[((i / 4) << 1) + 1] = zzco.zzdj();
                        } else if (zzco.zzdk() != null) {
                            objArr[((i / 4) << 1) + 1] = zzco.zzdk();
                        }
                        zzcq = zzco.zzcy();
                        if (zzcq == zzcb.MAP.ordinal()) {
                            zzcq = i4 + 1;
                            iArr2[i4] = i;
                            i4 = zzcq;
                        } else if (zzcq >= 18 && zzcq <= 49) {
                            zzcq = i5 + 1;
                            iArr3[i5] = iArr[i7] & 1048575;
                            i5 = zzcq;
                        }
                        if (!zzco.next()) {
                            break;
                        }
                        zzcq = zzco.zzcx();
                    } else {
                        for (i6 = 0; i6 < 4; i6++) {
                            iArr[i + i6] = -1;
                        }
                    }
                    i += 4;
                }
            }
            return new zzds(iArr, objArr, i2, i3, zzec.zzcv(), zzec.zzch(), z, false, zzec.zzct(), iArr2, iArr3, zzdw, zzcy, zzex, zzbu, zzdj);
        }
        ((zzes) zzdm2).zzcf();
        throw new NoSuchMethodError();
    }

    private final <K, V, UT, UB> UB zza(int i, int i2, Map<K, V> map, zzck<?> zzck, UB ub, zzex<UT, UB> zzex) {
        zzdh zzl = this.zzmz.zzl(zzae(i));
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            if (zzck.zzb(((Integer) entry.getValue()).intValue()) == null) {
                if (ub == null) {
                    ub = zzex.zzdz();
                }
                zzbg zzk = zzbb.zzk(zzdg.zza(zzl, entry.getKey(), entry.getValue()));
                try {
                    zzdg.zza(zzk.zzae(), zzl, entry.getKey(), entry.getValue());
                    zzex.zza((Object) ub, i2, zzk.zzad());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ub;
    }

    private static void zza(int i, Object obj, zzfr zzfr) {
        if (obj instanceof String) {
            zzfr.zza(i, (String) obj);
        } else {
            zzfr.zza(i, (zzbb) obj);
        }
    }

    private static <UT, UB> void zza(zzex<UT, UB> zzex, T t, zzfr zzfr) {
        zzex.zza(zzex.zzq(t), zzfr);
    }

    private final <K, V> void zza(zzfr zzfr, int i, Object obj, int i2) {
        if (obj != null) {
            zzfr.zza(i, this.zzmz.zzl(zzae(i2)), this.zzmz.zzh(obj));
        }
    }

    private final void zza(T t, T t2, int i) {
        long zzag = (long) (zzag(i) & 1048575);
        if (zza((Object) t2, i)) {
            Object zzo = zzfd.zzo(t, zzag);
            Object zzo2 = zzfd.zzo(t2, zzag);
            if (zzo == null || zzo2 == null) {
                if (zzo2 != null) {
                    zzfd.zza((Object) t, zzag, zzo2);
                    zzb((Object) t, i);
                }
                return;
            }
            zzfd.zza((Object) t, zzag, zzci.zza(zzo, zzo2));
            zzb((Object) t, i);
        }
    }

    private final boolean zza(T t, int i) {
        if (this.zzmq) {
            i = zzag(i);
            long j = (long) (i & 1048575);
            switch ((i & 267386880) >>> 20) {
                case 0:
                    return zzfd.zzn(t, j) != 0.0d;
                case 1:
                    return zzfd.zzm(t, j) != 0.0f;
                case 2:
                    return zzfd.zzk(t, j) != 0;
                case 3:
                    return zzfd.zzk(t, j) != 0;
                case 4:
                    return zzfd.zzj(t, j) != 0;
                case 5:
                    return zzfd.zzk(t, j) != 0;
                case 6:
                    return zzfd.zzj(t, j) != 0;
                case 7:
                    return zzfd.zzl(t, j);
                case 8:
                    Object zzo = zzfd.zzo(t, j);
                    if (zzo instanceof String) {
                        return !((String) zzo).isEmpty();
                    } else {
                        if (zzo instanceof zzbb) {
                            return !zzbb.zzfi.equals(zzo);
                        } else {
                            throw new IllegalArgumentException();
                        }
                    }
                case 9:
                    return zzfd.zzo(t, j) != null;
                case 10:
                    return !zzbb.zzfi.equals(zzfd.zzo(t, j));
                case 11:
                    return zzfd.zzj(t, j) != 0;
                case 12:
                    return zzfd.zzj(t, j) != 0;
                case 13:
                    return zzfd.zzj(t, j) != 0;
                case 14:
                    return zzfd.zzk(t, j) != 0;
                case 15:
                    return zzfd.zzj(t, j) != 0;
                case 16:
                    return zzfd.zzk(t, j) != 0;
                case 17:
                    return zzfd.zzo(t, j) != null;
                default:
                    throw new IllegalArgumentException();
            }
        }
        i = zzah(i);
        return (zzfd.zzj(t, (long) (i & 1048575)) & (1 << (i >>> 20))) != 0;
    }

    private final boolean zza(T t, int i, int i2) {
        return zzfd.zzj(t, (long) (zzah(i2) & 1048575)) == i;
    }

    private final boolean zza(T t, int i, int i2, int i3) {
        return this.zzmq ? zza((Object) t, i) : (i2 & i3) != 0;
    }

    private static boolean zza(Object obj, int i, zzef zzef) {
        return zzef.zzo(zzfd.zzo(obj, (long) (i & 1048575)));
    }

    private final zzef zzad(int i) {
        i = (i / 4) << 1;
        zzef zzef = (zzef) this.zzmj[i];
        if (zzef != null) {
            return zzef;
        }
        zzef = zzea.zzcm().zze((Class) this.zzmj[i + 1]);
        this.zzmj[i] = zzef;
        return zzef;
    }

    private final Object zzae(int i) {
        return this.zzmj[(i / 4) << 1];
    }

    private final zzck<?> zzaf(int i) {
        return (zzck) this.zzmj[((i / 4) << 1) + 1];
    }

    private final int zzag(int i) {
        return this.zzmi[i + 1];
    }

    private final int zzah(int i) {
        return this.zzmi[i + 2];
    }

    private final int zzai(int i) {
        int i2 = this.zzmk;
        if (i >= i2) {
            int i3 = this.zzmm;
            if (i < i3) {
                i2 = (i - i2) << 2;
                return this.zzmi[i2] == i ? i2 : -1;
            } else if (i <= this.zzml) {
                i3 -= i2;
                i2 = (this.zzmi.length / 4) - 1;
                while (i3 <= i2) {
                    int i4 = (i2 + i3) >>> 1;
                    int i5 = i4 << 2;
                    int i6 = this.zzmi[i5];
                    if (i == i6) {
                        return i5;
                    }
                    if (i < i6) {
                        i2 = i4 - 1;
                    } else {
                        i3 = i4 + 1;
                    }
                }
            }
        }
        return -1;
    }

    private final void zzb(T t, int i) {
        if (!this.zzmq) {
            i = zzah(i);
            long j = (long) (i & 1048575);
            zzfd.zza((Object) t, j, zzfd.zzj(t, j) | (1 << (i >>> 20)));
        }
    }

    private final void zzb(T t, int i, int i2) {
        zzfd.zza((Object) t, (long) (zzah(i2) & 1048575), i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0483  */
    /* JADX WARNING: Missing block: B:99:0x0276, code skipped:
            com.google.android.gms.internal.clearcut.zzeh.zze(r4, r9, r2, r14);
     */
    /* JADX WARNING: Missing block: B:101:0x0280, code skipped:
            com.google.android.gms.internal.clearcut.zzeh.zzj(r4, (java.util.List) r8.getObject(r1, r12), r2, r14);
     */
    /* JADX WARNING: Missing block: B:103:0x0290, code skipped:
            com.google.android.gms.internal.clearcut.zzeh.zzg(r4, (java.util.List) r8.getObject(r1, r12), r2, r14);
     */
    /* JADX WARNING: Missing block: B:105:0x02a0, code skipped:
            com.google.android.gms.internal.clearcut.zzeh.zzl(r4, (java.util.List) r8.getObject(r1, r12), r2, r14);
     */
    /* JADX WARNING: Missing block: B:107:0x02b0, code skipped:
            com.google.android.gms.internal.clearcut.zzeh.zzm(r4, (java.util.List) r8.getObject(r1, r12), r2, r14);
     */
    /* JADX WARNING: Missing block: B:109:0x02c0, code skipped:
            com.google.android.gms.internal.clearcut.zzeh.zzi(r4, (java.util.List) r8.getObject(r1, r12), r2, r14);
     */
    /* JADX WARNING: Missing block: B:175:0x0479, code skipped:
            r5 = r5 + 4;
     */
    private final void zzb(T r19, com.google.android.gms.internal.clearcut.zzfr r20) {
        /*
        r18 = this;
        r0 = r18;
        r1 = r19;
        r2 = r20;
        r3 = r0.zzmo;
        if (r3 == 0) goto L_0x0021;
    L_0x000a:
        r3 = r0.zzmy;
        r3 = r3.zza(r1);
        r5 = r3.isEmpty();
        if (r5 != 0) goto L_0x0021;
    L_0x0016:
        r3 = r3.iterator();
        r5 = r3.next();
        r5 = (java.util.Map.Entry) r5;
        goto L_0x0023;
    L_0x0021:
        r3 = 0;
        r5 = 0;
    L_0x0023:
        r6 = -1;
        r7 = r0.zzmi;
        r7 = r7.length;
        r8 = zzmh;
        r10 = r5;
        r5 = 0;
        r11 = 0;
    L_0x002c:
        if (r5 >= r7) goto L_0x047d;
    L_0x002e:
        r12 = r0.zzag(r5);
        r13 = r0.zzmi;
        r14 = r13[r5];
        r15 = 267386880; // 0xff00000 float:2.3665827E-29 double:1.321066716E-315;
        r15 = r15 & r12;
        r15 = r15 >>> 20;
        r4 = r0.zzmq;
        r16 = 1048575; // 0xfffff float:1.469367E-39 double:5.18065E-318;
        if (r4 != 0) goto L_0x0062;
    L_0x0042:
        r4 = 17;
        if (r15 > r4) goto L_0x0062;
    L_0x0046:
        r4 = r5 + 2;
        r4 = r13[r4];
        r13 = r4 & r16;
        if (r13 == r6) goto L_0x0056;
    L_0x004e:
        r17 = r10;
        r9 = (long) r13;
        r11 = r8.getInt(r1, r9);
        goto L_0x0059;
    L_0x0056:
        r17 = r10;
        r13 = r6;
    L_0x0059:
        r4 = r4 >>> 20;
        r6 = 1;
        r9 = r6 << r4;
        r6 = r13;
        r10 = r17;
        goto L_0x0067;
    L_0x0062:
        r17 = r10;
        r10 = r17;
        r9 = 0;
    L_0x0067:
        if (r10 == 0) goto L_0x0086;
    L_0x0069:
        r4 = r0.zzmy;
        r4 = r4.zza(r10);
        if (r4 > r14) goto L_0x0086;
    L_0x0071:
        r4 = r0.zzmy;
        r4.zza(r2, r10);
        r4 = r3.hasNext();
        if (r4 == 0) goto L_0x0084;
    L_0x007c:
        r4 = r3.next();
        r4 = (java.util.Map.Entry) r4;
        r10 = r4;
        goto L_0x0067;
    L_0x0084:
        r10 = 0;
        goto L_0x0067;
    L_0x0086:
        r4 = r12 & r16;
        r12 = (long) r4;
        switch(r15) {
            case 0: goto L_0x046d;
            case 1: goto L_0x0460;
            case 2: goto L_0x0453;
            case 3: goto L_0x0446;
            case 4: goto L_0x0439;
            case 5: goto L_0x042c;
            case 6: goto L_0x041f;
            case 7: goto L_0x0412;
            case 8: goto L_0x0404;
            case 9: goto L_0x03f2;
            case 10: goto L_0x03e2;
            case 11: goto L_0x03d4;
            case 12: goto L_0x03c6;
            case 13: goto L_0x03b8;
            case 14: goto L_0x03aa;
            case 15: goto L_0x039c;
            case 16: goto L_0x038e;
            case 17: goto L_0x037c;
            case 18: goto L_0x036c;
            case 19: goto L_0x035c;
            case 20: goto L_0x034c;
            case 21: goto L_0x033c;
            case 22: goto L_0x032c;
            case 23: goto L_0x031c;
            case 24: goto L_0x030c;
            case 25: goto L_0x02fc;
            case 26: goto L_0x02ed;
            case 27: goto L_0x02da;
            case 28: goto L_0x02cb;
            case 29: goto L_0x02bb;
            case 30: goto L_0x02ab;
            case 31: goto L_0x029b;
            case 32: goto L_0x028b;
            case 33: goto L_0x027b;
            case 34: goto L_0x026b;
            case 35: goto L_0x025b;
            case 36: goto L_0x024b;
            case 37: goto L_0x023b;
            case 38: goto L_0x022b;
            case 39: goto L_0x021b;
            case 40: goto L_0x020b;
            case 41: goto L_0x01fb;
            case 42: goto L_0x01eb;
            case 43: goto L_0x01e4;
            case 44: goto L_0x01dd;
            case 45: goto L_0x01d6;
            case 46: goto L_0x01cf;
            case 47: goto L_0x01c8;
            case 48: goto L_0x01bb;
            case 49: goto L_0x01a8;
            case 50: goto L_0x019f;
            case 51: goto L_0x0190;
            case 52: goto L_0x0181;
            case 53: goto L_0x0172;
            case 54: goto L_0x0163;
            case 55: goto L_0x0154;
            case 56: goto L_0x0145;
            case 57: goto L_0x0136;
            case 58: goto L_0x0127;
            case 59: goto L_0x0118;
            case 60: goto L_0x0105;
            case 61: goto L_0x00f5;
            case 62: goto L_0x00e7;
            case 63: goto L_0x00d9;
            case 64: goto L_0x00cb;
            case 65: goto L_0x00bd;
            case 66: goto L_0x00af;
            case 67: goto L_0x00a1;
            case 68: goto L_0x008f;
            default: goto L_0x008c;
        };
    L_0x008c:
        r15 = 0;
        goto L_0x0479;
    L_0x008f:
        r4 = r0.zza(r1, r14, r5);
        if (r4 == 0) goto L_0x008c;
    L_0x0095:
        r4 = r8.getObject(r1, r12);
        r9 = r0.zzad(r5);
        r2.zzb(r14, r4, r9);
        goto L_0x008c;
    L_0x00a1:
        r4 = r0.zza(r1, r14, r5);
        if (r4 == 0) goto L_0x008c;
    L_0x00a7:
        r12 = zzh(r1, r12);
        r2.zzb(r14, r12);
        goto L_0x008c;
    L_0x00af:
        r4 = r0.zza(r1, r14, r5);
        if (r4 == 0) goto L_0x008c;
    L_0x00b5:
        r4 = zzg(r1, r12);
        r2.zze(r14, r4);
        goto L_0x008c;
    L_0x00bd:
        r4 = r0.zza(r1, r14, r5);
        if (r4 == 0) goto L_0x008c;
    L_0x00c3:
        r12 = zzh(r1, r12);
        r2.zzj(r14, r12);
        goto L_0x008c;
    L_0x00cb:
        r4 = r0.zza(r1, r14, r5);
        if (r4 == 0) goto L_0x008c;
    L_0x00d1:
        r4 = zzg(r1, r12);
        r2.zzm(r14, r4);
        goto L_0x008c;
    L_0x00d9:
        r4 = r0.zza(r1, r14, r5);
        if (r4 == 0) goto L_0x008c;
    L_0x00df:
        r4 = zzg(r1, r12);
        r2.zzn(r14, r4);
        goto L_0x008c;
    L_0x00e7:
        r4 = r0.zza(r1, r14, r5);
        if (r4 == 0) goto L_0x008c;
    L_0x00ed:
        r4 = zzg(r1, r12);
        r2.zzd(r14, r4);
        goto L_0x008c;
    L_0x00f5:
        r4 = r0.zza(r1, r14, r5);
        if (r4 == 0) goto L_0x008c;
    L_0x00fb:
        r4 = r8.getObject(r1, r12);
        r4 = (com.google.android.gms.internal.clearcut.zzbb) r4;
        r2.zza(r14, r4);
        goto L_0x008c;
    L_0x0105:
        r4 = r0.zza(r1, r14, r5);
        if (r4 == 0) goto L_0x008c;
    L_0x010b:
        r4 = r8.getObject(r1, r12);
        r9 = r0.zzad(r5);
        r2.zza(r14, r4, r9);
        goto L_0x008c;
    L_0x0118:
        r4 = r0.zza(r1, r14, r5);
        if (r4 == 0) goto L_0x008c;
    L_0x011e:
        r4 = r8.getObject(r1, r12);
        zza(r14, r4, r2);
        goto L_0x008c;
    L_0x0127:
        r4 = r0.zza(r1, r14, r5);
        if (r4 == 0) goto L_0x008c;
    L_0x012d:
        r4 = zzi(r1, r12);
        r2.zzb(r14, r4);
        goto L_0x008c;
    L_0x0136:
        r4 = r0.zza(r1, r14, r5);
        if (r4 == 0) goto L_0x008c;
    L_0x013c:
        r4 = zzg(r1, r12);
        r2.zzf(r14, r4);
        goto L_0x008c;
    L_0x0145:
        r4 = r0.zza(r1, r14, r5);
        if (r4 == 0) goto L_0x008c;
    L_0x014b:
        r12 = zzh(r1, r12);
        r2.zzc(r14, r12);
        goto L_0x008c;
    L_0x0154:
        r4 = r0.zza(r1, r14, r5);
        if (r4 == 0) goto L_0x008c;
    L_0x015a:
        r4 = zzg(r1, r12);
        r2.zzc(r14, r4);
        goto L_0x008c;
    L_0x0163:
        r4 = r0.zza(r1, r14, r5);
        if (r4 == 0) goto L_0x008c;
    L_0x0169:
        r12 = zzh(r1, r12);
        r2.zza(r14, r12);
        goto L_0x008c;
    L_0x0172:
        r4 = r0.zza(r1, r14, r5);
        if (r4 == 0) goto L_0x008c;
    L_0x0178:
        r12 = zzh(r1, r12);
        r2.zzi(r14, r12);
        goto L_0x008c;
    L_0x0181:
        r4 = r0.zza(r1, r14, r5);
        if (r4 == 0) goto L_0x008c;
    L_0x0187:
        r4 = zzf(r1, r12);
        r2.zza(r14, r4);
        goto L_0x008c;
    L_0x0190:
        r4 = r0.zza(r1, r14, r5);
        if (r4 == 0) goto L_0x008c;
    L_0x0196:
        r12 = zze(r1, r12);
        r2.zza(r14, r12);
        goto L_0x008c;
    L_0x019f:
        r4 = r8.getObject(r1, r12);
        r0.zza(r2, r14, r4, r5);
        goto L_0x008c;
    L_0x01a8:
        r4 = r0.zzmi;
        r4 = r4[r5];
        r9 = r8.getObject(r1, r12);
        r9 = (java.util.List) r9;
        r12 = r0.zzad(r5);
        com.google.android.gms.internal.clearcut.zzeh.zzb(r4, r9, r2, r12);
        goto L_0x008c;
    L_0x01bb:
        r4 = r0.zzmi;
        r4 = r4[r5];
        r9 = r8.getObject(r1, r12);
        r9 = (java.util.List) r9;
        r14 = 1;
        goto L_0x0276;
    L_0x01c8:
        r14 = 1;
        r4 = r0.zzmi;
        r4 = r4[r5];
        goto L_0x0280;
    L_0x01cf:
        r14 = 1;
        r4 = r0.zzmi;
        r4 = r4[r5];
        goto L_0x0290;
    L_0x01d6:
        r14 = 1;
        r4 = r0.zzmi;
        r4 = r4[r5];
        goto L_0x02a0;
    L_0x01dd:
        r14 = 1;
        r4 = r0.zzmi;
        r4 = r4[r5];
        goto L_0x02b0;
    L_0x01e4:
        r14 = 1;
        r4 = r0.zzmi;
        r4 = r4[r5];
        goto L_0x02c0;
    L_0x01eb:
        r14 = 1;
        r4 = r0.zzmi;
        r4 = r4[r5];
        r9 = r8.getObject(r1, r12);
        r9 = (java.util.List) r9;
        com.google.android.gms.internal.clearcut.zzeh.zzn(r4, r9, r2, r14);
        goto L_0x008c;
    L_0x01fb:
        r14 = 1;
        r4 = r0.zzmi;
        r4 = r4[r5];
        r9 = r8.getObject(r1, r12);
        r9 = (java.util.List) r9;
        com.google.android.gms.internal.clearcut.zzeh.zzk(r4, r9, r2, r14);
        goto L_0x008c;
    L_0x020b:
        r14 = 1;
        r4 = r0.zzmi;
        r4 = r4[r5];
        r9 = r8.getObject(r1, r12);
        r9 = (java.util.List) r9;
        com.google.android.gms.internal.clearcut.zzeh.zzf(r4, r9, r2, r14);
        goto L_0x008c;
    L_0x021b:
        r14 = 1;
        r4 = r0.zzmi;
        r4 = r4[r5];
        r9 = r8.getObject(r1, r12);
        r9 = (java.util.List) r9;
        com.google.android.gms.internal.clearcut.zzeh.zzh(r4, r9, r2, r14);
        goto L_0x008c;
    L_0x022b:
        r14 = 1;
        r4 = r0.zzmi;
        r4 = r4[r5];
        r9 = r8.getObject(r1, r12);
        r9 = (java.util.List) r9;
        com.google.android.gms.internal.clearcut.zzeh.zzd(r4, r9, r2, r14);
        goto L_0x008c;
    L_0x023b:
        r14 = 1;
        r4 = r0.zzmi;
        r4 = r4[r5];
        r9 = r8.getObject(r1, r12);
        r9 = (java.util.List) r9;
        com.google.android.gms.internal.clearcut.zzeh.zzc(r4, r9, r2, r14);
        goto L_0x008c;
    L_0x024b:
        r14 = 1;
        r4 = r0.zzmi;
        r4 = r4[r5];
        r9 = r8.getObject(r1, r12);
        r9 = (java.util.List) r9;
        com.google.android.gms.internal.clearcut.zzeh.zzb(r4, r9, r2, r14);
        goto L_0x008c;
    L_0x025b:
        r14 = 1;
        r4 = r0.zzmi;
        r4 = r4[r5];
        r9 = r8.getObject(r1, r12);
        r9 = (java.util.List) r9;
        com.google.android.gms.internal.clearcut.zzeh.zza(r4, r9, r2, r14);
        goto L_0x008c;
    L_0x026b:
        r4 = r0.zzmi;
        r4 = r4[r5];
        r9 = r8.getObject(r1, r12);
        r9 = (java.util.List) r9;
        r14 = 0;
    L_0x0276:
        com.google.android.gms.internal.clearcut.zzeh.zze(r4, r9, r2, r14);
        goto L_0x008c;
    L_0x027b:
        r14 = 0;
        r4 = r0.zzmi;
        r4 = r4[r5];
    L_0x0280:
        r9 = r8.getObject(r1, r12);
        r9 = (java.util.List) r9;
        com.google.android.gms.internal.clearcut.zzeh.zzj(r4, r9, r2, r14);
        goto L_0x008c;
    L_0x028b:
        r14 = 0;
        r4 = r0.zzmi;
        r4 = r4[r5];
    L_0x0290:
        r9 = r8.getObject(r1, r12);
        r9 = (java.util.List) r9;
        com.google.android.gms.internal.clearcut.zzeh.zzg(r4, r9, r2, r14);
        goto L_0x008c;
    L_0x029b:
        r14 = 0;
        r4 = r0.zzmi;
        r4 = r4[r5];
    L_0x02a0:
        r9 = r8.getObject(r1, r12);
        r9 = (java.util.List) r9;
        com.google.android.gms.internal.clearcut.zzeh.zzl(r4, r9, r2, r14);
        goto L_0x008c;
    L_0x02ab:
        r14 = 0;
        r4 = r0.zzmi;
        r4 = r4[r5];
    L_0x02b0:
        r9 = r8.getObject(r1, r12);
        r9 = (java.util.List) r9;
        com.google.android.gms.internal.clearcut.zzeh.zzm(r4, r9, r2, r14);
        goto L_0x008c;
    L_0x02bb:
        r14 = 0;
        r4 = r0.zzmi;
        r4 = r4[r5];
    L_0x02c0:
        r9 = r8.getObject(r1, r12);
        r9 = (java.util.List) r9;
        com.google.android.gms.internal.clearcut.zzeh.zzi(r4, r9, r2, r14);
        goto L_0x008c;
    L_0x02cb:
        r4 = r0.zzmi;
        r4 = r4[r5];
        r9 = r8.getObject(r1, r12);
        r9 = (java.util.List) r9;
        com.google.android.gms.internal.clearcut.zzeh.zzb(r4, r9, r2);
        goto L_0x008c;
    L_0x02da:
        r4 = r0.zzmi;
        r4 = r4[r5];
        r9 = r8.getObject(r1, r12);
        r9 = (java.util.List) r9;
        r12 = r0.zzad(r5);
        com.google.android.gms.internal.clearcut.zzeh.zza(r4, r9, r2, r12);
        goto L_0x008c;
    L_0x02ed:
        r4 = r0.zzmi;
        r4 = r4[r5];
        r9 = r8.getObject(r1, r12);
        r9 = (java.util.List) r9;
        com.google.android.gms.internal.clearcut.zzeh.zza(r4, r9, r2);
        goto L_0x008c;
    L_0x02fc:
        r4 = r0.zzmi;
        r4 = r4[r5];
        r9 = r8.getObject(r1, r12);
        r9 = (java.util.List) r9;
        r15 = 0;
        com.google.android.gms.internal.clearcut.zzeh.zzn(r4, r9, r2, r15);
        goto L_0x0479;
    L_0x030c:
        r15 = 0;
        r4 = r0.zzmi;
        r4 = r4[r5];
        r9 = r8.getObject(r1, r12);
        r9 = (java.util.List) r9;
        com.google.android.gms.internal.clearcut.zzeh.zzk(r4, r9, r2, r15);
        goto L_0x0479;
    L_0x031c:
        r15 = 0;
        r4 = r0.zzmi;
        r4 = r4[r5];
        r9 = r8.getObject(r1, r12);
        r9 = (java.util.List) r9;
        com.google.android.gms.internal.clearcut.zzeh.zzf(r4, r9, r2, r15);
        goto L_0x0479;
    L_0x032c:
        r15 = 0;
        r4 = r0.zzmi;
        r4 = r4[r5];
        r9 = r8.getObject(r1, r12);
        r9 = (java.util.List) r9;
        com.google.android.gms.internal.clearcut.zzeh.zzh(r4, r9, r2, r15);
        goto L_0x0479;
    L_0x033c:
        r15 = 0;
        r4 = r0.zzmi;
        r4 = r4[r5];
        r9 = r8.getObject(r1, r12);
        r9 = (java.util.List) r9;
        com.google.android.gms.internal.clearcut.zzeh.zzd(r4, r9, r2, r15);
        goto L_0x0479;
    L_0x034c:
        r15 = 0;
        r4 = r0.zzmi;
        r4 = r4[r5];
        r9 = r8.getObject(r1, r12);
        r9 = (java.util.List) r9;
        com.google.android.gms.internal.clearcut.zzeh.zzc(r4, r9, r2, r15);
        goto L_0x0479;
    L_0x035c:
        r15 = 0;
        r4 = r0.zzmi;
        r4 = r4[r5];
        r9 = r8.getObject(r1, r12);
        r9 = (java.util.List) r9;
        com.google.android.gms.internal.clearcut.zzeh.zzb(r4, r9, r2, r15);
        goto L_0x0479;
    L_0x036c:
        r15 = 0;
        r4 = r0.zzmi;
        r4 = r4[r5];
        r9 = r8.getObject(r1, r12);
        r9 = (java.util.List) r9;
        com.google.android.gms.internal.clearcut.zzeh.zza(r4, r9, r2, r15);
        goto L_0x0479;
    L_0x037c:
        r15 = 0;
        r4 = r11 & r9;
        if (r4 == 0) goto L_0x0479;
    L_0x0381:
        r4 = r8.getObject(r1, r12);
        r9 = r0.zzad(r5);
        r2.zzb(r14, r4, r9);
        goto L_0x0479;
    L_0x038e:
        r15 = 0;
        r4 = r11 & r9;
        if (r4 == 0) goto L_0x0479;
    L_0x0393:
        r12 = r8.getLong(r1, r12);
        r2.zzb(r14, r12);
        goto L_0x0479;
    L_0x039c:
        r15 = 0;
        r4 = r11 & r9;
        if (r4 == 0) goto L_0x0479;
    L_0x03a1:
        r4 = r8.getInt(r1, r12);
        r2.zze(r14, r4);
        goto L_0x0479;
    L_0x03aa:
        r15 = 0;
        r4 = r11 & r9;
        if (r4 == 0) goto L_0x0479;
    L_0x03af:
        r12 = r8.getLong(r1, r12);
        r2.zzj(r14, r12);
        goto L_0x0479;
    L_0x03b8:
        r15 = 0;
        r4 = r11 & r9;
        if (r4 == 0) goto L_0x0479;
    L_0x03bd:
        r4 = r8.getInt(r1, r12);
        r2.zzm(r14, r4);
        goto L_0x0479;
    L_0x03c6:
        r15 = 0;
        r4 = r11 & r9;
        if (r4 == 0) goto L_0x0479;
    L_0x03cb:
        r4 = r8.getInt(r1, r12);
        r2.zzn(r14, r4);
        goto L_0x0479;
    L_0x03d4:
        r15 = 0;
        r4 = r11 & r9;
        if (r4 == 0) goto L_0x0479;
    L_0x03d9:
        r4 = r8.getInt(r1, r12);
        r2.zzd(r14, r4);
        goto L_0x0479;
    L_0x03e2:
        r15 = 0;
        r4 = r11 & r9;
        if (r4 == 0) goto L_0x0479;
    L_0x03e7:
        r4 = r8.getObject(r1, r12);
        r4 = (com.google.android.gms.internal.clearcut.zzbb) r4;
        r2.zza(r14, r4);
        goto L_0x0479;
    L_0x03f2:
        r15 = 0;
        r4 = r11 & r9;
        if (r4 == 0) goto L_0x0479;
    L_0x03f7:
        r4 = r8.getObject(r1, r12);
        r9 = r0.zzad(r5);
        r2.zza(r14, r4, r9);
        goto L_0x0479;
    L_0x0404:
        r15 = 0;
        r4 = r11 & r9;
        if (r4 == 0) goto L_0x0479;
    L_0x0409:
        r4 = r8.getObject(r1, r12);
        zza(r14, r4, r2);
        goto L_0x0479;
    L_0x0412:
        r15 = 0;
        r4 = r11 & r9;
        if (r4 == 0) goto L_0x0479;
    L_0x0417:
        r4 = com.google.android.gms.internal.clearcut.zzfd.zzl(r1, r12);
        r2.zzb(r14, r4);
        goto L_0x0479;
    L_0x041f:
        r15 = 0;
        r4 = r11 & r9;
        if (r4 == 0) goto L_0x0479;
    L_0x0424:
        r4 = r8.getInt(r1, r12);
        r2.zzf(r14, r4);
        goto L_0x0479;
    L_0x042c:
        r15 = 0;
        r4 = r11 & r9;
        if (r4 == 0) goto L_0x0479;
    L_0x0431:
        r12 = r8.getLong(r1, r12);
        r2.zzc(r14, r12);
        goto L_0x0479;
    L_0x0439:
        r15 = 0;
        r4 = r11 & r9;
        if (r4 == 0) goto L_0x0479;
    L_0x043e:
        r4 = r8.getInt(r1, r12);
        r2.zzc(r14, r4);
        goto L_0x0479;
    L_0x0446:
        r15 = 0;
        r4 = r11 & r9;
        if (r4 == 0) goto L_0x0479;
    L_0x044b:
        r12 = r8.getLong(r1, r12);
        r2.zza(r14, r12);
        goto L_0x0479;
    L_0x0453:
        r15 = 0;
        r4 = r11 & r9;
        if (r4 == 0) goto L_0x0479;
    L_0x0458:
        r12 = r8.getLong(r1, r12);
        r2.zzi(r14, r12);
        goto L_0x0479;
    L_0x0460:
        r15 = 0;
        r4 = r11 & r9;
        if (r4 == 0) goto L_0x0479;
    L_0x0465:
        r4 = com.google.android.gms.internal.clearcut.zzfd.zzm(r1, r12);
        r2.zza(r14, r4);
        goto L_0x0479;
    L_0x046d:
        r15 = 0;
        r4 = r11 & r9;
        if (r4 == 0) goto L_0x0479;
    L_0x0472:
        r12 = com.google.android.gms.internal.clearcut.zzfd.zzn(r1, r12);
        r2.zza(r14, r12);
    L_0x0479:
        r5 = r5 + 4;
        goto L_0x002c;
    L_0x047d:
        r17 = r10;
        r4 = r17;
    L_0x0481:
        if (r4 == 0) goto L_0x0497;
    L_0x0483:
        r5 = r0.zzmy;
        r5.zza(r2, r4);
        r4 = r3.hasNext();
        if (r4 == 0) goto L_0x0495;
    L_0x048e:
        r4 = r3.next();
        r4 = (java.util.Map.Entry) r4;
        goto L_0x0481;
    L_0x0495:
        r4 = 0;
        goto L_0x0481;
    L_0x0497:
        r3 = r0.zzmx;
        zza(r3, r1, r2);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.zzds.zzb(java.lang.Object, com.google.android.gms.internal.clearcut.zzfr):void");
    }

    private final void zzb(T t, T t2, int i) {
        int zzag = zzag(i);
        int i2 = this.zzmi[i];
        long j = (long) (zzag & 1048575);
        if (zza((Object) t2, i2, i)) {
            Object zzo = zzfd.zzo(t, j);
            Object zzo2 = zzfd.zzo(t2, j);
            if (zzo == null || zzo2 == null) {
                if (zzo2 != null) {
                    zzfd.zza((Object) t, j, zzo2);
                    zzb((Object) t, i2, i);
                }
                return;
            }
            zzfd.zza((Object) t, j, zzci.zza(zzo, zzo2));
            zzb((Object) t, i2, i);
        }
    }

    private final boolean zzc(T t, T t2, int i) {
        return zza((Object) t, i) == zza((Object) t2, i);
    }

    private static <E> List<E> zzd(Object obj, long j) {
        return (List) zzfd.zzo(obj, j);
    }

    private static <T> double zze(T t, long j) {
        return ((Double) zzfd.zzo(t, j)).doubleValue();
    }

    private static <T> float zzf(T t, long j) {
        return ((Float) zzfd.zzo(t, j)).floatValue();
    }

    private static <T> int zzg(T t, long j) {
        return ((Integer) zzfd.zzo(t, j)).intValue();
    }

    private static <T> long zzh(T t, long j) {
        return ((Long) zzfd.zzo(t, j)).longValue();
    }

    private static <T> boolean zzi(T t, long j) {
        return ((Boolean) zzfd.zzo(t, j)).booleanValue();
    }

    private static zzey zzn(Object obj) {
        zzcg zzcg = (zzcg) obj;
        zzey zzey = zzcg.zzjp;
        if (zzey != zzey.zzea()) {
            return zzey;
        }
        zzey = zzey.zzeb();
        zzcg.zzjp = zzey;
        return zzey;
    }

    /* JADX WARNING: Missing block: B:8:0x0038, code skipped:
            if (com.google.android.gms.internal.clearcut.zzeh.zzd(com.google.android.gms.internal.clearcut.zzfd.zzo(r10, r6), com.google.android.gms.internal.clearcut.zzfd.zzo(r11, r6)) != false) goto L_0x01a3;
     */
    /* JADX WARNING: Missing block: B:13:0x005c, code skipped:
            if (com.google.android.gms.internal.clearcut.zzeh.zzd(com.google.android.gms.internal.clearcut.zzfd.zzo(r10, r6), com.google.android.gms.internal.clearcut.zzfd.zzo(r11, r6)) != false) goto L_0x01a3;
     */
    /* JADX WARNING: Missing block: B:17:0x0070, code skipped:
            if (com.google.android.gms.internal.clearcut.zzfd.zzk(r10, r6) == com.google.android.gms.internal.clearcut.zzfd.zzk(r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Missing block: B:21:0x0082, code skipped:
            if (com.google.android.gms.internal.clearcut.zzfd.zzj(r10, r6) == com.google.android.gms.internal.clearcut.zzfd.zzj(r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Missing block: B:25:0x0096, code skipped:
            if (com.google.android.gms.internal.clearcut.zzfd.zzk(r10, r6) == com.google.android.gms.internal.clearcut.zzfd.zzk(r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Missing block: B:29:0x00a8, code skipped:
            if (com.google.android.gms.internal.clearcut.zzfd.zzj(r10, r6) == com.google.android.gms.internal.clearcut.zzfd.zzj(r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Missing block: B:33:0x00ba, code skipped:
            if (com.google.android.gms.internal.clearcut.zzfd.zzj(r10, r6) == com.google.android.gms.internal.clearcut.zzfd.zzj(r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Missing block: B:37:0x00cc, code skipped:
            if (com.google.android.gms.internal.clearcut.zzfd.zzj(r10, r6) == com.google.android.gms.internal.clearcut.zzfd.zzj(r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Missing block: B:41:0x00e2, code skipped:
            if (com.google.android.gms.internal.clearcut.zzeh.zzd(com.google.android.gms.internal.clearcut.zzfd.zzo(r10, r6), com.google.android.gms.internal.clearcut.zzfd.zzo(r11, r6)) != false) goto L_0x01a3;
     */
    /* JADX WARNING: Missing block: B:45:0x00f8, code skipped:
            if (com.google.android.gms.internal.clearcut.zzeh.zzd(com.google.android.gms.internal.clearcut.zzfd.zzo(r10, r6), com.google.android.gms.internal.clearcut.zzfd.zzo(r11, r6)) != false) goto L_0x01a3;
     */
    /* JADX WARNING: Missing block: B:49:0x010e, code skipped:
            if (com.google.android.gms.internal.clearcut.zzeh.zzd(com.google.android.gms.internal.clearcut.zzfd.zzo(r10, r6), com.google.android.gms.internal.clearcut.zzfd.zzo(r11, r6)) != false) goto L_0x01a3;
     */
    /* JADX WARNING: Missing block: B:53:0x0120, code skipped:
            if (com.google.android.gms.internal.clearcut.zzfd.zzl(r10, r6) == com.google.android.gms.internal.clearcut.zzfd.zzl(r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Missing block: B:57:0x0132, code skipped:
            if (com.google.android.gms.internal.clearcut.zzfd.zzj(r10, r6) == com.google.android.gms.internal.clearcut.zzfd.zzj(r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Missing block: B:61:0x0145, code skipped:
            if (com.google.android.gms.internal.clearcut.zzfd.zzk(r10, r6) == com.google.android.gms.internal.clearcut.zzfd.zzk(r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Missing block: B:65:0x0156, code skipped:
            if (com.google.android.gms.internal.clearcut.zzfd.zzj(r10, r6) == com.google.android.gms.internal.clearcut.zzfd.zzj(r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Missing block: B:69:0x0169, code skipped:
            if (com.google.android.gms.internal.clearcut.zzfd.zzk(r10, r6) == com.google.android.gms.internal.clearcut.zzfd.zzk(r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Missing block: B:73:0x017c, code skipped:
            if (com.google.android.gms.internal.clearcut.zzfd.zzk(r10, r6) == com.google.android.gms.internal.clearcut.zzfd.zzk(r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Missing block: B:77:0x018d, code skipped:
            if (com.google.android.gms.internal.clearcut.zzfd.zzj(r10, r6) == com.google.android.gms.internal.clearcut.zzfd.zzj(r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Missing block: B:81:0x01a0, code skipped:
            if (com.google.android.gms.internal.clearcut.zzfd.zzk(r10, r6) == com.google.android.gms.internal.clearcut.zzfd.zzk(r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Missing block: B:82:0x01a2, code skipped:
            r3 = false;
     */
    public final boolean equals(T r10, T r11) {
        /*
        r9 = this;
        r0 = r9.zzmi;
        r0 = r0.length;
        r1 = 0;
        r2 = 0;
    L_0x0005:
        r3 = 1;
        if (r2 >= r0) goto L_0x01aa;
    L_0x0008:
        r4 = r9.zzag(r2);
        r5 = 1048575; // 0xfffff float:1.469367E-39 double:5.18065E-318;
        r6 = r4 & r5;
        r6 = (long) r6;
        r8 = 267386880; // 0xff00000 float:2.3665827E-29 double:1.321066716E-315;
        r4 = r4 & r8;
        r4 = r4 >>> 20;
        switch(r4) {
            case 0: goto L_0x0190;
            case 1: goto L_0x017f;
            case 2: goto L_0x016c;
            case 3: goto L_0x0159;
            case 4: goto L_0x0148;
            case 5: goto L_0x0135;
            case 6: goto L_0x0124;
            case 7: goto L_0x0112;
            case 8: goto L_0x00fc;
            case 9: goto L_0x00e6;
            case 10: goto L_0x00d0;
            case 11: goto L_0x00be;
            case 12: goto L_0x00ac;
            case 13: goto L_0x009a;
            case 14: goto L_0x0086;
            case 15: goto L_0x0074;
            case 16: goto L_0x0060;
            case 17: goto L_0x004a;
            case 18: goto L_0x003c;
            case 19: goto L_0x003c;
            case 20: goto L_0x003c;
            case 21: goto L_0x003c;
            case 22: goto L_0x003c;
            case 23: goto L_0x003c;
            case 24: goto L_0x003c;
            case 25: goto L_0x003c;
            case 26: goto L_0x003c;
            case 27: goto L_0x003c;
            case 28: goto L_0x003c;
            case 29: goto L_0x003c;
            case 30: goto L_0x003c;
            case 31: goto L_0x003c;
            case 32: goto L_0x003c;
            case 33: goto L_0x003c;
            case 34: goto L_0x003c;
            case 35: goto L_0x003c;
            case 36: goto L_0x003c;
            case 37: goto L_0x003c;
            case 38: goto L_0x003c;
            case 39: goto L_0x003c;
            case 40: goto L_0x003c;
            case 41: goto L_0x003c;
            case 42: goto L_0x003c;
            case 43: goto L_0x003c;
            case 44: goto L_0x003c;
            case 45: goto L_0x003c;
            case 46: goto L_0x003c;
            case 47: goto L_0x003c;
            case 48: goto L_0x003c;
            case 49: goto L_0x003c;
            case 50: goto L_0x003c;
            case 51: goto L_0x001c;
            case 52: goto L_0x001c;
            case 53: goto L_0x001c;
            case 54: goto L_0x001c;
            case 55: goto L_0x001c;
            case 56: goto L_0x001c;
            case 57: goto L_0x001c;
            case 58: goto L_0x001c;
            case 59: goto L_0x001c;
            case 60: goto L_0x001c;
            case 61: goto L_0x001c;
            case 62: goto L_0x001c;
            case 63: goto L_0x001c;
            case 64: goto L_0x001c;
            case 65: goto L_0x001c;
            case 66: goto L_0x001c;
            case 67: goto L_0x001c;
            case 68: goto L_0x001c;
            default: goto L_0x001a;
        };
    L_0x001a:
        goto L_0x01a3;
    L_0x001c:
        r4 = r9.zzah(r2);
        r4 = r4 & r5;
        r4 = (long) r4;
        r8 = com.google.android.gms.internal.clearcut.zzfd.zzj(r10, r4);
        r4 = com.google.android.gms.internal.clearcut.zzfd.zzj(r11, r4);
        if (r8 != r4) goto L_0x01a2;
    L_0x002c:
        r4 = com.google.android.gms.internal.clearcut.zzfd.zzo(r10, r6);
        r5 = com.google.android.gms.internal.clearcut.zzfd.zzo(r11, r6);
        r4 = com.google.android.gms.internal.clearcut.zzeh.zzd(r4, r5);
        if (r4 != 0) goto L_0x01a3;
    L_0x003a:
        goto L_0x018f;
    L_0x003c:
        r3 = com.google.android.gms.internal.clearcut.zzfd.zzo(r10, r6);
        r4 = com.google.android.gms.internal.clearcut.zzfd.zzo(r11, r6);
        r3 = com.google.android.gms.internal.clearcut.zzeh.zzd(r3, r4);
        goto L_0x01a3;
    L_0x004a:
        r4 = r9.zzc(r10, r11, r2);
        if (r4 == 0) goto L_0x01a2;
    L_0x0050:
        r4 = com.google.android.gms.internal.clearcut.zzfd.zzo(r10, r6);
        r5 = com.google.android.gms.internal.clearcut.zzfd.zzo(r11, r6);
        r4 = com.google.android.gms.internal.clearcut.zzeh.zzd(r4, r5);
        if (r4 != 0) goto L_0x01a3;
    L_0x005e:
        goto L_0x01a2;
    L_0x0060:
        r4 = r9.zzc(r10, r11, r2);
        if (r4 == 0) goto L_0x01a2;
    L_0x0066:
        r4 = com.google.android.gms.internal.clearcut.zzfd.zzk(r10, r6);
        r6 = com.google.android.gms.internal.clearcut.zzfd.zzk(r11, r6);
        r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r8 == 0) goto L_0x01a3;
    L_0x0072:
        goto L_0x018f;
    L_0x0074:
        r4 = r9.zzc(r10, r11, r2);
        if (r4 == 0) goto L_0x01a2;
    L_0x007a:
        r4 = com.google.android.gms.internal.clearcut.zzfd.zzj(r10, r6);
        r5 = com.google.android.gms.internal.clearcut.zzfd.zzj(r11, r6);
        if (r4 == r5) goto L_0x01a3;
    L_0x0084:
        goto L_0x01a2;
    L_0x0086:
        r4 = r9.zzc(r10, r11, r2);
        if (r4 == 0) goto L_0x01a2;
    L_0x008c:
        r4 = com.google.android.gms.internal.clearcut.zzfd.zzk(r10, r6);
        r6 = com.google.android.gms.internal.clearcut.zzfd.zzk(r11, r6);
        r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r8 == 0) goto L_0x01a3;
    L_0x0098:
        goto L_0x018f;
    L_0x009a:
        r4 = r9.zzc(r10, r11, r2);
        if (r4 == 0) goto L_0x01a2;
    L_0x00a0:
        r4 = com.google.android.gms.internal.clearcut.zzfd.zzj(r10, r6);
        r5 = com.google.android.gms.internal.clearcut.zzfd.zzj(r11, r6);
        if (r4 == r5) goto L_0x01a3;
    L_0x00aa:
        goto L_0x01a2;
    L_0x00ac:
        r4 = r9.zzc(r10, r11, r2);
        if (r4 == 0) goto L_0x01a2;
    L_0x00b2:
        r4 = com.google.android.gms.internal.clearcut.zzfd.zzj(r10, r6);
        r5 = com.google.android.gms.internal.clearcut.zzfd.zzj(r11, r6);
        if (r4 == r5) goto L_0x01a3;
    L_0x00bc:
        goto L_0x018f;
    L_0x00be:
        r4 = r9.zzc(r10, r11, r2);
        if (r4 == 0) goto L_0x01a2;
    L_0x00c4:
        r4 = com.google.android.gms.internal.clearcut.zzfd.zzj(r10, r6);
        r5 = com.google.android.gms.internal.clearcut.zzfd.zzj(r11, r6);
        if (r4 == r5) goto L_0x01a3;
    L_0x00ce:
        goto L_0x01a2;
    L_0x00d0:
        r4 = r9.zzc(r10, r11, r2);
        if (r4 == 0) goto L_0x01a2;
    L_0x00d6:
        r4 = com.google.android.gms.internal.clearcut.zzfd.zzo(r10, r6);
        r5 = com.google.android.gms.internal.clearcut.zzfd.zzo(r11, r6);
        r4 = com.google.android.gms.internal.clearcut.zzeh.zzd(r4, r5);
        if (r4 != 0) goto L_0x01a3;
    L_0x00e4:
        goto L_0x018f;
    L_0x00e6:
        r4 = r9.zzc(r10, r11, r2);
        if (r4 == 0) goto L_0x01a2;
    L_0x00ec:
        r4 = com.google.android.gms.internal.clearcut.zzfd.zzo(r10, r6);
        r5 = com.google.android.gms.internal.clearcut.zzfd.zzo(r11, r6);
        r4 = com.google.android.gms.internal.clearcut.zzeh.zzd(r4, r5);
        if (r4 != 0) goto L_0x01a3;
    L_0x00fa:
        goto L_0x01a2;
    L_0x00fc:
        r4 = r9.zzc(r10, r11, r2);
        if (r4 == 0) goto L_0x01a2;
    L_0x0102:
        r4 = com.google.android.gms.internal.clearcut.zzfd.zzo(r10, r6);
        r5 = com.google.android.gms.internal.clearcut.zzfd.zzo(r11, r6);
        r4 = com.google.android.gms.internal.clearcut.zzeh.zzd(r4, r5);
        if (r4 != 0) goto L_0x01a3;
    L_0x0110:
        goto L_0x018f;
    L_0x0112:
        r4 = r9.zzc(r10, r11, r2);
        if (r4 == 0) goto L_0x01a2;
    L_0x0118:
        r4 = com.google.android.gms.internal.clearcut.zzfd.zzl(r10, r6);
        r5 = com.google.android.gms.internal.clearcut.zzfd.zzl(r11, r6);
        if (r4 == r5) goto L_0x01a3;
    L_0x0122:
        goto L_0x01a2;
    L_0x0124:
        r4 = r9.zzc(r10, r11, r2);
        if (r4 == 0) goto L_0x01a2;
    L_0x012a:
        r4 = com.google.android.gms.internal.clearcut.zzfd.zzj(r10, r6);
        r5 = com.google.android.gms.internal.clearcut.zzfd.zzj(r11, r6);
        if (r4 == r5) goto L_0x01a3;
    L_0x0134:
        goto L_0x018f;
    L_0x0135:
        r4 = r9.zzc(r10, r11, r2);
        if (r4 == 0) goto L_0x01a2;
    L_0x013b:
        r4 = com.google.android.gms.internal.clearcut.zzfd.zzk(r10, r6);
        r6 = com.google.android.gms.internal.clearcut.zzfd.zzk(r11, r6);
        r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r8 == 0) goto L_0x01a3;
    L_0x0147:
        goto L_0x01a2;
    L_0x0148:
        r4 = r9.zzc(r10, r11, r2);
        if (r4 == 0) goto L_0x01a2;
    L_0x014e:
        r4 = com.google.android.gms.internal.clearcut.zzfd.zzj(r10, r6);
        r5 = com.google.android.gms.internal.clearcut.zzfd.zzj(r11, r6);
        if (r4 == r5) goto L_0x01a3;
    L_0x0158:
        goto L_0x018f;
    L_0x0159:
        r4 = r9.zzc(r10, r11, r2);
        if (r4 == 0) goto L_0x01a2;
    L_0x015f:
        r4 = com.google.android.gms.internal.clearcut.zzfd.zzk(r10, r6);
        r6 = com.google.android.gms.internal.clearcut.zzfd.zzk(r11, r6);
        r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r8 == 0) goto L_0x01a3;
    L_0x016b:
        goto L_0x01a2;
    L_0x016c:
        r4 = r9.zzc(r10, r11, r2);
        if (r4 == 0) goto L_0x01a2;
    L_0x0172:
        r4 = com.google.android.gms.internal.clearcut.zzfd.zzk(r10, r6);
        r6 = com.google.android.gms.internal.clearcut.zzfd.zzk(r11, r6);
        r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r8 == 0) goto L_0x01a3;
    L_0x017e:
        goto L_0x018f;
    L_0x017f:
        r4 = r9.zzc(r10, r11, r2);
        if (r4 == 0) goto L_0x01a2;
    L_0x0185:
        r4 = com.google.android.gms.internal.clearcut.zzfd.zzj(r10, r6);
        r5 = com.google.android.gms.internal.clearcut.zzfd.zzj(r11, r6);
        if (r4 == r5) goto L_0x01a3;
    L_0x018f:
        goto L_0x01a2;
    L_0x0190:
        r4 = r9.zzc(r10, r11, r2);
        if (r4 == 0) goto L_0x01a2;
    L_0x0196:
        r4 = com.google.android.gms.internal.clearcut.zzfd.zzk(r10, r6);
        r6 = com.google.android.gms.internal.clearcut.zzfd.zzk(r11, r6);
        r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r8 == 0) goto L_0x01a3;
    L_0x01a2:
        r3 = 0;
    L_0x01a3:
        if (r3 != 0) goto L_0x01a6;
    L_0x01a5:
        return r1;
    L_0x01a6:
        r2 = r2 + 4;
        goto L_0x0005;
    L_0x01aa:
        r0 = r9.zzmx;
        r0 = r0.zzq(r10);
        r2 = r9.zzmx;
        r2 = r2.zzq(r11);
        r0 = r0.equals(r2);
        if (r0 != 0) goto L_0x01bd;
    L_0x01bc:
        return r1;
    L_0x01bd:
        r0 = r9.zzmo;
        if (r0 == 0) goto L_0x01d2;
    L_0x01c1:
        r0 = r9.zzmy;
        r10 = r0.zza(r10);
        r0 = r9.zzmy;
        r11 = r0.zza(r11);
        r10 = r10.equals(r11);
        return r10;
    L_0x01d2:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.zzds.equals(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARNING: Missing block: B:22:0x0061, code skipped:
            r3 = com.google.android.gms.internal.clearcut.zzfd.zzo(r9, r5);
            r2 = r2 * 53;
     */
    /* JADX WARNING: Missing block: B:34:0x0093, code skipped:
            r2 = r2 * 53;
            r3 = zzg(r9, r5);
     */
    /* JADX WARNING: Missing block: B:39:0x00a8, code skipped:
            r2 = r2 * 53;
            r3 = zzh(r9, r5);
     */
    /* JADX WARNING: Missing block: B:47:0x00ce, code skipped:
            if (r3 != null) goto L_0x00e2;
     */
    /* JADX WARNING: Missing block: B:48:0x00d1, code skipped:
            r2 = r2 * 53;
            r3 = com.google.android.gms.internal.clearcut.zzfd.zzo(r9, r5);
     */
    /* JADX WARNING: Missing block: B:49:0x00d7, code skipped:
            r3 = r3.hashCode();
     */
    /* JADX WARNING: Missing block: B:51:0x00e0, code skipped:
            if (r3 != null) goto L_0x00e2;
     */
    /* JADX WARNING: Missing block: B:52:0x00e2, code skipped:
            r7 = r3.hashCode();
     */
    /* JADX WARNING: Missing block: B:53:0x00e6, code skipped:
            r2 = (r2 * 53) + r7;
     */
    /* JADX WARNING: Missing block: B:54:0x00ea, code skipped:
            r2 = r2 * 53;
            r3 = ((java.lang.String) com.google.android.gms.internal.clearcut.zzfd.zzo(r9, r5)).hashCode();
     */
    /* JADX WARNING: Missing block: B:56:0x00fd, code skipped:
            r3 = com.google.android.gms.internal.clearcut.zzci.zzc(r3);
     */
    /* JADX WARNING: Missing block: B:60:0x0116, code skipped:
            r3 = java.lang.Float.floatToIntBits(r3);
     */
    /* JADX WARNING: Missing block: B:62:0x0121, code skipped:
            r3 = java.lang.Double.doubleToLongBits(r3);
     */
    /* JADX WARNING: Missing block: B:63:0x0125, code skipped:
            r3 = com.google.android.gms.internal.clearcut.zzci.zzl(r3);
     */
    /* JADX WARNING: Missing block: B:64:0x0129, code skipped:
            r2 = r2 + r3;
     */
    /* JADX WARNING: Missing block: B:65:0x012a, code skipped:
            r1 = r1 + 4;
     */
    public final int hashCode(T r9) {
        /*
        r8 = this;
        r0 = r8.zzmi;
        r0 = r0.length;
        r1 = 0;
        r2 = 0;
    L_0x0005:
        if (r1 >= r0) goto L_0x012e;
    L_0x0007:
        r3 = r8.zzag(r1);
        r4 = r8.zzmi;
        r4 = r4[r1];
        r5 = 1048575; // 0xfffff float:1.469367E-39 double:5.18065E-318;
        r5 = r5 & r3;
        r5 = (long) r5;
        r7 = 267386880; // 0xff00000 float:2.3665827E-29 double:1.321066716E-315;
        r3 = r3 & r7;
        r3 = r3 >>> 20;
        r7 = 37;
        switch(r3) {
            case 0: goto L_0x011b;
            case 1: goto L_0x0110;
            case 2: goto L_0x0109;
            case 3: goto L_0x0109;
            case 4: goto L_0x0102;
            case 5: goto L_0x0109;
            case 6: goto L_0x0102;
            case 7: goto L_0x00f7;
            case 8: goto L_0x00ea;
            case 9: goto L_0x00dc;
            case 10: goto L_0x00d1;
            case 11: goto L_0x0102;
            case 12: goto L_0x0102;
            case 13: goto L_0x0102;
            case 14: goto L_0x0109;
            case 15: goto L_0x0102;
            case 16: goto L_0x0109;
            case 17: goto L_0x00ca;
            case 18: goto L_0x00d1;
            case 19: goto L_0x00d1;
            case 20: goto L_0x00d1;
            case 21: goto L_0x00d1;
            case 22: goto L_0x00d1;
            case 23: goto L_0x00d1;
            case 24: goto L_0x00d1;
            case 25: goto L_0x00d1;
            case 26: goto L_0x00d1;
            case 27: goto L_0x00d1;
            case 28: goto L_0x00d1;
            case 29: goto L_0x00d1;
            case 30: goto L_0x00d1;
            case 31: goto L_0x00d1;
            case 32: goto L_0x00d1;
            case 33: goto L_0x00d1;
            case 34: goto L_0x00d1;
            case 35: goto L_0x00d1;
            case 36: goto L_0x00d1;
            case 37: goto L_0x00d1;
            case 38: goto L_0x00d1;
            case 39: goto L_0x00d1;
            case 40: goto L_0x00d1;
            case 41: goto L_0x00d1;
            case 42: goto L_0x00d1;
            case 43: goto L_0x00d1;
            case 44: goto L_0x00d1;
            case 45: goto L_0x00d1;
            case 46: goto L_0x00d1;
            case 47: goto L_0x00d1;
            case 48: goto L_0x00d1;
            case 49: goto L_0x00d1;
            case 50: goto L_0x00d1;
            case 51: goto L_0x00bd;
            case 52: goto L_0x00b0;
            case 53: goto L_0x00a2;
            case 54: goto L_0x009b;
            case 55: goto L_0x008d;
            case 56: goto L_0x0086;
            case 57: goto L_0x007f;
            case 58: goto L_0x0071;
            case 59: goto L_0x0069;
            case 60: goto L_0x005b;
            case 61: goto L_0x0053;
            case 62: goto L_0x004c;
            case 63: goto L_0x0045;
            case 64: goto L_0x003e;
            case 65: goto L_0x0036;
            case 66: goto L_0x002f;
            case 67: goto L_0x0027;
            case 68: goto L_0x0020;
            default: goto L_0x001e;
        };
    L_0x001e:
        goto L_0x012a;
    L_0x0020:
        r3 = r8.zza(r9, r4, r1);
        if (r3 == 0) goto L_0x012a;
    L_0x0026:
        goto L_0x0061;
    L_0x0027:
        r3 = r8.zza(r9, r4, r1);
        if (r3 == 0) goto L_0x012a;
    L_0x002d:
        goto L_0x00a8;
    L_0x002f:
        r3 = r8.zza(r9, r4, r1);
        if (r3 == 0) goto L_0x012a;
    L_0x0035:
        goto L_0x004b;
    L_0x0036:
        r3 = r8.zza(r9, r4, r1);
        if (r3 == 0) goto L_0x012a;
    L_0x003c:
        goto L_0x00a8;
    L_0x003e:
        r3 = r8.zza(r9, r4, r1);
        if (r3 == 0) goto L_0x012a;
    L_0x0044:
        goto L_0x004b;
    L_0x0045:
        r3 = r8.zza(r9, r4, r1);
        if (r3 == 0) goto L_0x012a;
    L_0x004b:
        goto L_0x0093;
    L_0x004c:
        r3 = r8.zza(r9, r4, r1);
        if (r3 == 0) goto L_0x012a;
    L_0x0052:
        goto L_0x0093;
    L_0x0053:
        r3 = r8.zza(r9, r4, r1);
        if (r3 == 0) goto L_0x012a;
    L_0x0059:
        goto L_0x00d1;
    L_0x005b:
        r3 = r8.zza(r9, r4, r1);
        if (r3 == 0) goto L_0x012a;
    L_0x0061:
        r3 = com.google.android.gms.internal.clearcut.zzfd.zzo(r9, r5);
        r2 = r2 * 53;
        goto L_0x00d7;
    L_0x0069:
        r3 = r8.zza(r9, r4, r1);
        if (r3 == 0) goto L_0x012a;
    L_0x006f:
        goto L_0x00ea;
    L_0x0071:
        r3 = r8.zza(r9, r4, r1);
        if (r3 == 0) goto L_0x012a;
    L_0x0077:
        r2 = r2 * 53;
        r3 = zzi(r9, r5);
        goto L_0x00fd;
    L_0x007f:
        r3 = r8.zza(r9, r4, r1);
        if (r3 == 0) goto L_0x012a;
    L_0x0085:
        goto L_0x0093;
    L_0x0086:
        r3 = r8.zza(r9, r4, r1);
        if (r3 == 0) goto L_0x012a;
    L_0x008c:
        goto L_0x00a8;
    L_0x008d:
        r3 = r8.zza(r9, r4, r1);
        if (r3 == 0) goto L_0x012a;
    L_0x0093:
        r2 = r2 * 53;
        r3 = zzg(r9, r5);
        goto L_0x0129;
    L_0x009b:
        r3 = r8.zza(r9, r4, r1);
        if (r3 == 0) goto L_0x012a;
    L_0x00a1:
        goto L_0x00a8;
    L_0x00a2:
        r3 = r8.zza(r9, r4, r1);
        if (r3 == 0) goto L_0x012a;
    L_0x00a8:
        r2 = r2 * 53;
        r3 = zzh(r9, r5);
        goto L_0x0125;
    L_0x00b0:
        r3 = r8.zza(r9, r4, r1);
        if (r3 == 0) goto L_0x012a;
    L_0x00b6:
        r2 = r2 * 53;
        r3 = zzf(r9, r5);
        goto L_0x0116;
    L_0x00bd:
        r3 = r8.zza(r9, r4, r1);
        if (r3 == 0) goto L_0x012a;
    L_0x00c3:
        r2 = r2 * 53;
        r3 = zze(r9, r5);
        goto L_0x0121;
    L_0x00ca:
        r3 = com.google.android.gms.internal.clearcut.zzfd.zzo(r9, r5);
        if (r3 == 0) goto L_0x00e6;
    L_0x00d0:
        goto L_0x00e2;
    L_0x00d1:
        r2 = r2 * 53;
        r3 = com.google.android.gms.internal.clearcut.zzfd.zzo(r9, r5);
    L_0x00d7:
        r3 = r3.hashCode();
        goto L_0x0129;
    L_0x00dc:
        r3 = com.google.android.gms.internal.clearcut.zzfd.zzo(r9, r5);
        if (r3 == 0) goto L_0x00e6;
    L_0x00e2:
        r7 = r3.hashCode();
    L_0x00e6:
        r2 = r2 * 53;
        r2 = r2 + r7;
        goto L_0x012a;
    L_0x00ea:
        r2 = r2 * 53;
        r3 = com.google.android.gms.internal.clearcut.zzfd.zzo(r9, r5);
        r3 = (java.lang.String) r3;
        r3 = r3.hashCode();
        goto L_0x0129;
    L_0x00f7:
        r2 = r2 * 53;
        r3 = com.google.android.gms.internal.clearcut.zzfd.zzl(r9, r5);
    L_0x00fd:
        r3 = com.google.android.gms.internal.clearcut.zzci.zzc(r3);
        goto L_0x0129;
    L_0x0102:
        r2 = r2 * 53;
        r3 = com.google.android.gms.internal.clearcut.zzfd.zzj(r9, r5);
        goto L_0x0129;
    L_0x0109:
        r2 = r2 * 53;
        r3 = com.google.android.gms.internal.clearcut.zzfd.zzk(r9, r5);
        goto L_0x0125;
    L_0x0110:
        r2 = r2 * 53;
        r3 = com.google.android.gms.internal.clearcut.zzfd.zzm(r9, r5);
    L_0x0116:
        r3 = java.lang.Float.floatToIntBits(r3);
        goto L_0x0129;
    L_0x011b:
        r2 = r2 * 53;
        r3 = com.google.android.gms.internal.clearcut.zzfd.zzn(r9, r5);
    L_0x0121:
        r3 = java.lang.Double.doubleToLongBits(r3);
    L_0x0125:
        r3 = com.google.android.gms.internal.clearcut.zzci.zzl(r3);
    L_0x0129:
        r2 = r2 + r3;
    L_0x012a:
        r1 = r1 + 4;
        goto L_0x0005;
    L_0x012e:
        r2 = r2 * 53;
        r0 = r8.zzmx;
        r0 = r0.zzq(r9);
        r0 = r0.hashCode();
        r2 = r2 + r0;
        r0 = r8.zzmo;
        if (r0 == 0) goto L_0x014c;
    L_0x013f:
        r2 = r2 * 53;
        r0 = r8.zzmy;
        r9 = r0.zza(r9);
        r9 = r9.hashCode();
        r2 = r2 + r9;
    L_0x014c:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.zzds.hashCode(java.lang.Object):int");
    }

    public final T newInstance() {
        return this.zzmv.newInstance(this.zzmn);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x04b9  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x04f7  */
    /* JADX WARNING: Removed duplicated region for block: B:351:0x0977  */
    /* JADX WARNING: Missing block: B:105:0x0385, code skipped:
            r15.zzb(r9, com.google.android.gms.internal.clearcut.zzfd.zzo(r14, (long) (r8 & 1048575)), zzad(r7));
     */
    /* JADX WARNING: Missing block: B:109:0x03a0, code skipped:
            r15.zzb(r9, r10);
     */
    /* JADX WARNING: Missing block: B:113:0x03b1, code skipped:
            r15.zze(r9, r8);
     */
    /* JADX WARNING: Missing block: B:117:0x03c2, code skipped:
            r15.zzj(r9, r10);
     */
    /* JADX WARNING: Missing block: B:121:0x03d3, code skipped:
            r15.zzm(r9, r8);
     */
    /* JADX WARNING: Missing block: B:125:0x03e4, code skipped:
            r15.zzn(r9, r8);
     */
    /* JADX WARNING: Missing block: B:129:0x03f5, code skipped:
            r15.zzd(r9, r8);
     */
    /* JADX WARNING: Missing block: B:132:0x0400, code skipped:
            r15.zza(r9, (com.google.android.gms.internal.clearcut.zzbb) com.google.android.gms.internal.clearcut.zzfd.zzo(r14, (long) (r8 & 1048575)));
     */
    /* JADX WARNING: Missing block: B:135:0x0413, code skipped:
            r15.zza(r9, com.google.android.gms.internal.clearcut.zzfd.zzo(r14, (long) (r8 & 1048575)), zzad(r7));
     */
    /* JADX WARNING: Missing block: B:138:0x0428, code skipped:
            zza(r9, com.google.android.gms.internal.clearcut.zzfd.zzo(r14, (long) (r8 & 1048575)), r15);
     */
    /* JADX WARNING: Missing block: B:142:0x043f, code skipped:
            r15.zzb(r9, r8);
     */
    /* JADX WARNING: Missing block: B:146:0x0450, code skipped:
            r15.zzf(r9, r8);
     */
    /* JADX WARNING: Missing block: B:150:0x0460, code skipped:
            r15.zzc(r9, r10);
     */
    /* JADX WARNING: Missing block: B:154:0x0470, code skipped:
            r15.zzc(r9, r8);
     */
    /* JADX WARNING: Missing block: B:158:0x0480, code skipped:
            r15.zza(r9, r10);
     */
    /* JADX WARNING: Missing block: B:162:0x0490, code skipped:
            r15.zzi(r9, r10);
     */
    /* JADX WARNING: Missing block: B:166:0x04a0, code skipped:
            r15.zza(r9, r8);
     */
    /* JADX WARNING: Missing block: B:170:0x04b0, code skipped:
            r15.zza(r9, r10);
     */
    /* JADX WARNING: Missing block: B:283:0x0843, code skipped:
            r15.zzb(r10, com.google.android.gms.internal.clearcut.zzfd.zzo(r14, (long) (r9 & 1048575)), zzad(r1));
     */
    /* JADX WARNING: Missing block: B:287:0x085e, code skipped:
            r15.zzb(r10, r11);
     */
    /* JADX WARNING: Missing block: B:291:0x086f, code skipped:
            r15.zze(r10, r9);
     */
    /* JADX WARNING: Missing block: B:295:0x0880, code skipped:
            r15.zzj(r10, r11);
     */
    /* JADX WARNING: Missing block: B:299:0x0891, code skipped:
            r15.zzm(r10, r9);
     */
    /* JADX WARNING: Missing block: B:303:0x08a2, code skipped:
            r15.zzn(r10, r9);
     */
    /* JADX WARNING: Missing block: B:307:0x08b3, code skipped:
            r15.zzd(r10, r9);
     */
    /* JADX WARNING: Missing block: B:310:0x08be, code skipped:
            r15.zza(r10, (com.google.android.gms.internal.clearcut.zzbb) com.google.android.gms.internal.clearcut.zzfd.zzo(r14, (long) (r9 & 1048575)));
     */
    /* JADX WARNING: Missing block: B:313:0x08d1, code skipped:
            r15.zza(r10, com.google.android.gms.internal.clearcut.zzfd.zzo(r14, (long) (r9 & 1048575)), zzad(r1));
     */
    /* JADX WARNING: Missing block: B:316:0x08e6, code skipped:
            zza(r10, com.google.android.gms.internal.clearcut.zzfd.zzo(r14, (long) (r9 & 1048575)), r15);
     */
    /* JADX WARNING: Missing block: B:320:0x08fd, code skipped:
            r15.zzb(r10, r9);
     */
    /* JADX WARNING: Missing block: B:324:0x090e, code skipped:
            r15.zzf(r10, r9);
     */
    /* JADX WARNING: Missing block: B:328:0x091e, code skipped:
            r15.zzc(r10, r11);
     */
    /* JADX WARNING: Missing block: B:332:0x092e, code skipped:
            r15.zzc(r10, r9);
     */
    /* JADX WARNING: Missing block: B:336:0x093e, code skipped:
            r15.zza(r10, r11);
     */
    /* JADX WARNING: Missing block: B:340:0x094e, code skipped:
            r15.zzi(r10, r11);
     */
    /* JADX WARNING: Missing block: B:344:0x095e, code skipped:
            r15.zza(r10, r9);
     */
    /* JADX WARNING: Missing block: B:348:0x096e, code skipped:
            r15.zza(r10, r11);
     */
    public final void zza(T r14, com.google.android.gms.internal.clearcut.zzfr r15) {
        /*
        r13 = this;
        r0 = r15.zzaj();
        r1 = com.google.android.gms.internal.clearcut.zzcg.zzg.zzkp;
        r2 = 267386880; // 0xff00000 float:2.3665827E-29 double:1.321066716E-315;
        r3 = 0;
        r4 = 1;
        r5 = 0;
        r6 = 1048575; // 0xfffff float:1.469367E-39 double:5.18065E-318;
        if (r0 != r1) goto L_0x04cf;
    L_0x0010:
        r0 = r13.zzmx;
        zza(r0, r14, r15);
        r0 = r13.zzmo;
        if (r0 == 0) goto L_0x0030;
    L_0x0019:
        r0 = r13.zzmy;
        r0 = r0.zza(r14);
        r1 = r0.isEmpty();
        if (r1 != 0) goto L_0x0030;
    L_0x0025:
        r0 = r0.descendingIterator();
        r1 = r0.next();
        r1 = (java.util.Map.Entry) r1;
        goto L_0x0032;
    L_0x0030:
        r0 = r3;
        r1 = r0;
    L_0x0032:
        r7 = r13.zzmi;
        r7 = r7.length;
        r7 = r7 + -4;
    L_0x0037:
        if (r7 < 0) goto L_0x04b7;
    L_0x0039:
        r8 = r13.zzag(r7);
        r9 = r13.zzmi;
        r9 = r9[r7];
    L_0x0041:
        if (r1 == 0) goto L_0x005f;
    L_0x0043:
        r10 = r13.zzmy;
        r10 = r10.zza(r1);
        if (r10 <= r9) goto L_0x005f;
    L_0x004b:
        r10 = r13.zzmy;
        r10.zza(r15, r1);
        r1 = r0.hasNext();
        if (r1 == 0) goto L_0x005d;
    L_0x0056:
        r1 = r0.next();
        r1 = (java.util.Map.Entry) r1;
        goto L_0x0041;
    L_0x005d:
        r1 = r3;
        goto L_0x0041;
    L_0x005f:
        r10 = r8 & r2;
        r10 = r10 >>> 20;
        switch(r10) {
            case 0: goto L_0x04a4;
            case 1: goto L_0x0494;
            case 2: goto L_0x0484;
            case 3: goto L_0x0474;
            case 4: goto L_0x0464;
            case 5: goto L_0x0454;
            case 6: goto L_0x0444;
            case 7: goto L_0x0433;
            case 8: goto L_0x0422;
            case 9: goto L_0x040d;
            case 10: goto L_0x03fa;
            case 11: goto L_0x03e9;
            case 12: goto L_0x03d8;
            case 13: goto L_0x03c7;
            case 14: goto L_0x03b6;
            case 15: goto L_0x03a5;
            case 16: goto L_0x0394;
            case 17: goto L_0x037f;
            case 18: goto L_0x036e;
            case 19: goto L_0x035d;
            case 20: goto L_0x034c;
            case 21: goto L_0x033b;
            case 22: goto L_0x032a;
            case 23: goto L_0x0319;
            case 24: goto L_0x0308;
            case 25: goto L_0x02f7;
            case 26: goto L_0x02e6;
            case 27: goto L_0x02d1;
            case 28: goto L_0x02c0;
            case 29: goto L_0x02af;
            case 30: goto L_0x029e;
            case 31: goto L_0x028d;
            case 32: goto L_0x027c;
            case 33: goto L_0x026b;
            case 34: goto L_0x025a;
            case 35: goto L_0x0249;
            case 36: goto L_0x0238;
            case 37: goto L_0x0227;
            case 38: goto L_0x0216;
            case 39: goto L_0x0205;
            case 40: goto L_0x01f4;
            case 41: goto L_0x01e3;
            case 42: goto L_0x01d2;
            case 43: goto L_0x01c1;
            case 44: goto L_0x01b0;
            case 45: goto L_0x019f;
            case 46: goto L_0x018e;
            case 47: goto L_0x017d;
            case 48: goto L_0x016c;
            case 49: goto L_0x0157;
            case 50: goto L_0x014c;
            case 51: goto L_0x013e;
            case 52: goto L_0x0130;
            case 53: goto L_0x0122;
            case 54: goto L_0x0114;
            case 55: goto L_0x0106;
            case 56: goto L_0x00f8;
            case 57: goto L_0x00ea;
            case 58: goto L_0x00dc;
            case 59: goto L_0x00d4;
            case 60: goto L_0x00cc;
            case 61: goto L_0x00c4;
            case 62: goto L_0x00b6;
            case 63: goto L_0x00a8;
            case 64: goto L_0x009a;
            case 65: goto L_0x008c;
            case 66: goto L_0x007e;
            case 67: goto L_0x0070;
            case 68: goto L_0x0068;
            default: goto L_0x0066;
        };
    L_0x0066:
        goto L_0x04b3;
    L_0x0068:
        r10 = r13.zza(r14, r9, r7);
        if (r10 == 0) goto L_0x04b3;
    L_0x006e:
        goto L_0x0385;
    L_0x0070:
        r10 = r13.zza(r14, r9, r7);
        if (r10 == 0) goto L_0x04b3;
    L_0x0076:
        r8 = r8 & r6;
        r10 = (long) r8;
        r10 = zzh(r14, r10);
        goto L_0x03a0;
    L_0x007e:
        r10 = r13.zza(r14, r9, r7);
        if (r10 == 0) goto L_0x04b3;
    L_0x0084:
        r8 = r8 & r6;
        r10 = (long) r8;
        r8 = zzg(r14, r10);
        goto L_0x03b1;
    L_0x008c:
        r10 = r13.zza(r14, r9, r7);
        if (r10 == 0) goto L_0x04b3;
    L_0x0092:
        r8 = r8 & r6;
        r10 = (long) r8;
        r10 = zzh(r14, r10);
        goto L_0x03c2;
    L_0x009a:
        r10 = r13.zza(r14, r9, r7);
        if (r10 == 0) goto L_0x04b3;
    L_0x00a0:
        r8 = r8 & r6;
        r10 = (long) r8;
        r8 = zzg(r14, r10);
        goto L_0x03d3;
    L_0x00a8:
        r10 = r13.zza(r14, r9, r7);
        if (r10 == 0) goto L_0x04b3;
    L_0x00ae:
        r8 = r8 & r6;
        r10 = (long) r8;
        r8 = zzg(r14, r10);
        goto L_0x03e4;
    L_0x00b6:
        r10 = r13.zza(r14, r9, r7);
        if (r10 == 0) goto L_0x04b3;
    L_0x00bc:
        r8 = r8 & r6;
        r10 = (long) r8;
        r8 = zzg(r14, r10);
        goto L_0x03f5;
    L_0x00c4:
        r10 = r13.zza(r14, r9, r7);
        if (r10 == 0) goto L_0x04b3;
    L_0x00ca:
        goto L_0x0400;
    L_0x00cc:
        r10 = r13.zza(r14, r9, r7);
        if (r10 == 0) goto L_0x04b3;
    L_0x00d2:
        goto L_0x0413;
    L_0x00d4:
        r10 = r13.zza(r14, r9, r7);
        if (r10 == 0) goto L_0x04b3;
    L_0x00da:
        goto L_0x0428;
    L_0x00dc:
        r10 = r13.zza(r14, r9, r7);
        if (r10 == 0) goto L_0x04b3;
    L_0x00e2:
        r8 = r8 & r6;
        r10 = (long) r8;
        r8 = zzi(r14, r10);
        goto L_0x043f;
    L_0x00ea:
        r10 = r13.zza(r14, r9, r7);
        if (r10 == 0) goto L_0x04b3;
    L_0x00f0:
        r8 = r8 & r6;
        r10 = (long) r8;
        r8 = zzg(r14, r10);
        goto L_0x0450;
    L_0x00f8:
        r10 = r13.zza(r14, r9, r7);
        if (r10 == 0) goto L_0x04b3;
    L_0x00fe:
        r8 = r8 & r6;
        r10 = (long) r8;
        r10 = zzh(r14, r10);
        goto L_0x0460;
    L_0x0106:
        r10 = r13.zza(r14, r9, r7);
        if (r10 == 0) goto L_0x04b3;
    L_0x010c:
        r8 = r8 & r6;
        r10 = (long) r8;
        r8 = zzg(r14, r10);
        goto L_0x0470;
    L_0x0114:
        r10 = r13.zza(r14, r9, r7);
        if (r10 == 0) goto L_0x04b3;
    L_0x011a:
        r8 = r8 & r6;
        r10 = (long) r8;
        r10 = zzh(r14, r10);
        goto L_0x0480;
    L_0x0122:
        r10 = r13.zza(r14, r9, r7);
        if (r10 == 0) goto L_0x04b3;
    L_0x0128:
        r8 = r8 & r6;
        r10 = (long) r8;
        r10 = zzh(r14, r10);
        goto L_0x0490;
    L_0x0130:
        r10 = r13.zza(r14, r9, r7);
        if (r10 == 0) goto L_0x04b3;
    L_0x0136:
        r8 = r8 & r6;
        r10 = (long) r8;
        r8 = zzf(r14, r10);
        goto L_0x04a0;
    L_0x013e:
        r10 = r13.zza(r14, r9, r7);
        if (r10 == 0) goto L_0x04b3;
    L_0x0144:
        r8 = r8 & r6;
        r10 = (long) r8;
        r10 = zze(r14, r10);
        goto L_0x04b0;
    L_0x014c:
        r8 = r8 & r6;
        r10 = (long) r8;
        r8 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r10);
        r13.zza(r15, r9, r8, r7);
        goto L_0x04b3;
    L_0x0157:
        r9 = r13.zzmi;
        r9 = r9[r7];
        r8 = r8 & r6;
        r10 = (long) r8;
        r8 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r10);
        r8 = (java.util.List) r8;
        r10 = r13.zzad(r7);
        com.google.android.gms.internal.clearcut.zzeh.zzb(r9, r8, r15, r10);
        goto L_0x04b3;
    L_0x016c:
        r9 = r13.zzmi;
        r9 = r9[r7];
        r8 = r8 & r6;
        r10 = (long) r8;
        r8 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r10);
        r8 = (java.util.List) r8;
        com.google.android.gms.internal.clearcut.zzeh.zze(r9, r8, r15, r4);
        goto L_0x04b3;
    L_0x017d:
        r9 = r13.zzmi;
        r9 = r9[r7];
        r8 = r8 & r6;
        r10 = (long) r8;
        r8 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r10);
        r8 = (java.util.List) r8;
        com.google.android.gms.internal.clearcut.zzeh.zzj(r9, r8, r15, r4);
        goto L_0x04b3;
    L_0x018e:
        r9 = r13.zzmi;
        r9 = r9[r7];
        r8 = r8 & r6;
        r10 = (long) r8;
        r8 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r10);
        r8 = (java.util.List) r8;
        com.google.android.gms.internal.clearcut.zzeh.zzg(r9, r8, r15, r4);
        goto L_0x04b3;
    L_0x019f:
        r9 = r13.zzmi;
        r9 = r9[r7];
        r8 = r8 & r6;
        r10 = (long) r8;
        r8 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r10);
        r8 = (java.util.List) r8;
        com.google.android.gms.internal.clearcut.zzeh.zzl(r9, r8, r15, r4);
        goto L_0x04b3;
    L_0x01b0:
        r9 = r13.zzmi;
        r9 = r9[r7];
        r8 = r8 & r6;
        r10 = (long) r8;
        r8 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r10);
        r8 = (java.util.List) r8;
        com.google.android.gms.internal.clearcut.zzeh.zzm(r9, r8, r15, r4);
        goto L_0x04b3;
    L_0x01c1:
        r9 = r13.zzmi;
        r9 = r9[r7];
        r8 = r8 & r6;
        r10 = (long) r8;
        r8 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r10);
        r8 = (java.util.List) r8;
        com.google.android.gms.internal.clearcut.zzeh.zzi(r9, r8, r15, r4);
        goto L_0x04b3;
    L_0x01d2:
        r9 = r13.zzmi;
        r9 = r9[r7];
        r8 = r8 & r6;
        r10 = (long) r8;
        r8 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r10);
        r8 = (java.util.List) r8;
        com.google.android.gms.internal.clearcut.zzeh.zzn(r9, r8, r15, r4);
        goto L_0x04b3;
    L_0x01e3:
        r9 = r13.zzmi;
        r9 = r9[r7];
        r8 = r8 & r6;
        r10 = (long) r8;
        r8 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r10);
        r8 = (java.util.List) r8;
        com.google.android.gms.internal.clearcut.zzeh.zzk(r9, r8, r15, r4);
        goto L_0x04b3;
    L_0x01f4:
        r9 = r13.zzmi;
        r9 = r9[r7];
        r8 = r8 & r6;
        r10 = (long) r8;
        r8 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r10);
        r8 = (java.util.List) r8;
        com.google.android.gms.internal.clearcut.zzeh.zzf(r9, r8, r15, r4);
        goto L_0x04b3;
    L_0x0205:
        r9 = r13.zzmi;
        r9 = r9[r7];
        r8 = r8 & r6;
        r10 = (long) r8;
        r8 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r10);
        r8 = (java.util.List) r8;
        com.google.android.gms.internal.clearcut.zzeh.zzh(r9, r8, r15, r4);
        goto L_0x04b3;
    L_0x0216:
        r9 = r13.zzmi;
        r9 = r9[r7];
        r8 = r8 & r6;
        r10 = (long) r8;
        r8 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r10);
        r8 = (java.util.List) r8;
        com.google.android.gms.internal.clearcut.zzeh.zzd(r9, r8, r15, r4);
        goto L_0x04b3;
    L_0x0227:
        r9 = r13.zzmi;
        r9 = r9[r7];
        r8 = r8 & r6;
        r10 = (long) r8;
        r8 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r10);
        r8 = (java.util.List) r8;
        com.google.android.gms.internal.clearcut.zzeh.zzc(r9, r8, r15, r4);
        goto L_0x04b3;
    L_0x0238:
        r9 = r13.zzmi;
        r9 = r9[r7];
        r8 = r8 & r6;
        r10 = (long) r8;
        r8 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r10);
        r8 = (java.util.List) r8;
        com.google.android.gms.internal.clearcut.zzeh.zzb(r9, r8, r15, r4);
        goto L_0x04b3;
    L_0x0249:
        r9 = r13.zzmi;
        r9 = r9[r7];
        r8 = r8 & r6;
        r10 = (long) r8;
        r8 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r10);
        r8 = (java.util.List) r8;
        com.google.android.gms.internal.clearcut.zzeh.zza(r9, r8, r15, r4);
        goto L_0x04b3;
    L_0x025a:
        r9 = r13.zzmi;
        r9 = r9[r7];
        r8 = r8 & r6;
        r10 = (long) r8;
        r8 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r10);
        r8 = (java.util.List) r8;
        com.google.android.gms.internal.clearcut.zzeh.zze(r9, r8, r15, r5);
        goto L_0x04b3;
    L_0x026b:
        r9 = r13.zzmi;
        r9 = r9[r7];
        r8 = r8 & r6;
        r10 = (long) r8;
        r8 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r10);
        r8 = (java.util.List) r8;
        com.google.android.gms.internal.clearcut.zzeh.zzj(r9, r8, r15, r5);
        goto L_0x04b3;
    L_0x027c:
        r9 = r13.zzmi;
        r9 = r9[r7];
        r8 = r8 & r6;
        r10 = (long) r8;
        r8 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r10);
        r8 = (java.util.List) r8;
        com.google.android.gms.internal.clearcut.zzeh.zzg(r9, r8, r15, r5);
        goto L_0x04b3;
    L_0x028d:
        r9 = r13.zzmi;
        r9 = r9[r7];
        r8 = r8 & r6;
        r10 = (long) r8;
        r8 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r10);
        r8 = (java.util.List) r8;
        com.google.android.gms.internal.clearcut.zzeh.zzl(r9, r8, r15, r5);
        goto L_0x04b3;
    L_0x029e:
        r9 = r13.zzmi;
        r9 = r9[r7];
        r8 = r8 & r6;
        r10 = (long) r8;
        r8 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r10);
        r8 = (java.util.List) r8;
        com.google.android.gms.internal.clearcut.zzeh.zzm(r9, r8, r15, r5);
        goto L_0x04b3;
    L_0x02af:
        r9 = r13.zzmi;
        r9 = r9[r7];
        r8 = r8 & r6;
        r10 = (long) r8;
        r8 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r10);
        r8 = (java.util.List) r8;
        com.google.android.gms.internal.clearcut.zzeh.zzi(r9, r8, r15, r5);
        goto L_0x04b3;
    L_0x02c0:
        r9 = r13.zzmi;
        r9 = r9[r7];
        r8 = r8 & r6;
        r10 = (long) r8;
        r8 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r10);
        r8 = (java.util.List) r8;
        com.google.android.gms.internal.clearcut.zzeh.zzb(r9, r8, r15);
        goto L_0x04b3;
    L_0x02d1:
        r9 = r13.zzmi;
        r9 = r9[r7];
        r8 = r8 & r6;
        r10 = (long) r8;
        r8 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r10);
        r8 = (java.util.List) r8;
        r10 = r13.zzad(r7);
        com.google.android.gms.internal.clearcut.zzeh.zza(r9, r8, r15, r10);
        goto L_0x04b3;
    L_0x02e6:
        r9 = r13.zzmi;
        r9 = r9[r7];
        r8 = r8 & r6;
        r10 = (long) r8;
        r8 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r10);
        r8 = (java.util.List) r8;
        com.google.android.gms.internal.clearcut.zzeh.zza(r9, r8, r15);
        goto L_0x04b3;
    L_0x02f7:
        r9 = r13.zzmi;
        r9 = r9[r7];
        r8 = r8 & r6;
        r10 = (long) r8;
        r8 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r10);
        r8 = (java.util.List) r8;
        com.google.android.gms.internal.clearcut.zzeh.zzn(r9, r8, r15, r5);
        goto L_0x04b3;
    L_0x0308:
        r9 = r13.zzmi;
        r9 = r9[r7];
        r8 = r8 & r6;
        r10 = (long) r8;
        r8 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r10);
        r8 = (java.util.List) r8;
        com.google.android.gms.internal.clearcut.zzeh.zzk(r9, r8, r15, r5);
        goto L_0x04b3;
    L_0x0319:
        r9 = r13.zzmi;
        r9 = r9[r7];
        r8 = r8 & r6;
        r10 = (long) r8;
        r8 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r10);
        r8 = (java.util.List) r8;
        com.google.android.gms.internal.clearcut.zzeh.zzf(r9, r8, r15, r5);
        goto L_0x04b3;
    L_0x032a:
        r9 = r13.zzmi;
        r9 = r9[r7];
        r8 = r8 & r6;
        r10 = (long) r8;
        r8 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r10);
        r8 = (java.util.List) r8;
        com.google.android.gms.internal.clearcut.zzeh.zzh(r9, r8, r15, r5);
        goto L_0x04b3;
    L_0x033b:
        r9 = r13.zzmi;
        r9 = r9[r7];
        r8 = r8 & r6;
        r10 = (long) r8;
        r8 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r10);
        r8 = (java.util.List) r8;
        com.google.android.gms.internal.clearcut.zzeh.zzd(r9, r8, r15, r5);
        goto L_0x04b3;
    L_0x034c:
        r9 = r13.zzmi;
        r9 = r9[r7];
        r8 = r8 & r6;
        r10 = (long) r8;
        r8 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r10);
        r8 = (java.util.List) r8;
        com.google.android.gms.internal.clearcut.zzeh.zzc(r9, r8, r15, r5);
        goto L_0x04b3;
    L_0x035d:
        r9 = r13.zzmi;
        r9 = r9[r7];
        r8 = r8 & r6;
        r10 = (long) r8;
        r8 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r10);
        r8 = (java.util.List) r8;
        com.google.android.gms.internal.clearcut.zzeh.zzb(r9, r8, r15, r5);
        goto L_0x04b3;
    L_0x036e:
        r9 = r13.zzmi;
        r9 = r9[r7];
        r8 = r8 & r6;
        r10 = (long) r8;
        r8 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r10);
        r8 = (java.util.List) r8;
        com.google.android.gms.internal.clearcut.zzeh.zza(r9, r8, r15, r5);
        goto L_0x04b3;
    L_0x037f:
        r10 = r13.zza(r14, r7);
        if (r10 == 0) goto L_0x04b3;
    L_0x0385:
        r8 = r8 & r6;
        r10 = (long) r8;
        r8 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r10);
        r10 = r13.zzad(r7);
        r15.zzb(r9, r8, r10);
        goto L_0x04b3;
    L_0x0394:
        r10 = r13.zza(r14, r7);
        if (r10 == 0) goto L_0x04b3;
    L_0x039a:
        r8 = r8 & r6;
        r10 = (long) r8;
        r10 = com.google.android.gms.internal.clearcut.zzfd.zzk(r14, r10);
    L_0x03a0:
        r15.zzb(r9, r10);
        goto L_0x04b3;
    L_0x03a5:
        r10 = r13.zza(r14, r7);
        if (r10 == 0) goto L_0x04b3;
    L_0x03ab:
        r8 = r8 & r6;
        r10 = (long) r8;
        r8 = com.google.android.gms.internal.clearcut.zzfd.zzj(r14, r10);
    L_0x03b1:
        r15.zze(r9, r8);
        goto L_0x04b3;
    L_0x03b6:
        r10 = r13.zza(r14, r7);
        if (r10 == 0) goto L_0x04b3;
    L_0x03bc:
        r8 = r8 & r6;
        r10 = (long) r8;
        r10 = com.google.android.gms.internal.clearcut.zzfd.zzk(r14, r10);
    L_0x03c2:
        r15.zzj(r9, r10);
        goto L_0x04b3;
    L_0x03c7:
        r10 = r13.zza(r14, r7);
        if (r10 == 0) goto L_0x04b3;
    L_0x03cd:
        r8 = r8 & r6;
        r10 = (long) r8;
        r8 = com.google.android.gms.internal.clearcut.zzfd.zzj(r14, r10);
    L_0x03d3:
        r15.zzm(r9, r8);
        goto L_0x04b3;
    L_0x03d8:
        r10 = r13.zza(r14, r7);
        if (r10 == 0) goto L_0x04b3;
    L_0x03de:
        r8 = r8 & r6;
        r10 = (long) r8;
        r8 = com.google.android.gms.internal.clearcut.zzfd.zzj(r14, r10);
    L_0x03e4:
        r15.zzn(r9, r8);
        goto L_0x04b3;
    L_0x03e9:
        r10 = r13.zza(r14, r7);
        if (r10 == 0) goto L_0x04b3;
    L_0x03ef:
        r8 = r8 & r6;
        r10 = (long) r8;
        r8 = com.google.android.gms.internal.clearcut.zzfd.zzj(r14, r10);
    L_0x03f5:
        r15.zzd(r9, r8);
        goto L_0x04b3;
    L_0x03fa:
        r10 = r13.zza(r14, r7);
        if (r10 == 0) goto L_0x04b3;
    L_0x0400:
        r8 = r8 & r6;
        r10 = (long) r8;
        r8 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r10);
        r8 = (com.google.android.gms.internal.clearcut.zzbb) r8;
        r15.zza(r9, r8);
        goto L_0x04b3;
    L_0x040d:
        r10 = r13.zza(r14, r7);
        if (r10 == 0) goto L_0x04b3;
    L_0x0413:
        r8 = r8 & r6;
        r10 = (long) r8;
        r8 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r10);
        r10 = r13.zzad(r7);
        r15.zza(r9, r8, r10);
        goto L_0x04b3;
    L_0x0422:
        r10 = r13.zza(r14, r7);
        if (r10 == 0) goto L_0x04b3;
    L_0x0428:
        r8 = r8 & r6;
        r10 = (long) r8;
        r8 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r10);
        zza(r9, r8, r15);
        goto L_0x04b3;
    L_0x0433:
        r10 = r13.zza(r14, r7);
        if (r10 == 0) goto L_0x04b3;
    L_0x0439:
        r8 = r8 & r6;
        r10 = (long) r8;
        r8 = com.google.android.gms.internal.clearcut.zzfd.zzl(r14, r10);
    L_0x043f:
        r15.zzb(r9, r8);
        goto L_0x04b3;
    L_0x0444:
        r10 = r13.zza(r14, r7);
        if (r10 == 0) goto L_0x04b3;
    L_0x044a:
        r8 = r8 & r6;
        r10 = (long) r8;
        r8 = com.google.android.gms.internal.clearcut.zzfd.zzj(r14, r10);
    L_0x0450:
        r15.zzf(r9, r8);
        goto L_0x04b3;
    L_0x0454:
        r10 = r13.zza(r14, r7);
        if (r10 == 0) goto L_0x04b3;
    L_0x045a:
        r8 = r8 & r6;
        r10 = (long) r8;
        r10 = com.google.android.gms.internal.clearcut.zzfd.zzk(r14, r10);
    L_0x0460:
        r15.zzc(r9, r10);
        goto L_0x04b3;
    L_0x0464:
        r10 = r13.zza(r14, r7);
        if (r10 == 0) goto L_0x04b3;
    L_0x046a:
        r8 = r8 & r6;
        r10 = (long) r8;
        r8 = com.google.android.gms.internal.clearcut.zzfd.zzj(r14, r10);
    L_0x0470:
        r15.zzc(r9, r8);
        goto L_0x04b3;
    L_0x0474:
        r10 = r13.zza(r14, r7);
        if (r10 == 0) goto L_0x04b3;
    L_0x047a:
        r8 = r8 & r6;
        r10 = (long) r8;
        r10 = com.google.android.gms.internal.clearcut.zzfd.zzk(r14, r10);
    L_0x0480:
        r15.zza(r9, r10);
        goto L_0x04b3;
    L_0x0484:
        r10 = r13.zza(r14, r7);
        if (r10 == 0) goto L_0x04b3;
    L_0x048a:
        r8 = r8 & r6;
        r10 = (long) r8;
        r10 = com.google.android.gms.internal.clearcut.zzfd.zzk(r14, r10);
    L_0x0490:
        r15.zzi(r9, r10);
        goto L_0x04b3;
    L_0x0494:
        r10 = r13.zza(r14, r7);
        if (r10 == 0) goto L_0x04b3;
    L_0x049a:
        r8 = r8 & r6;
        r10 = (long) r8;
        r8 = com.google.android.gms.internal.clearcut.zzfd.zzm(r14, r10);
    L_0x04a0:
        r15.zza(r9, r8);
        goto L_0x04b3;
    L_0x04a4:
        r10 = r13.zza(r14, r7);
        if (r10 == 0) goto L_0x04b3;
    L_0x04aa:
        r8 = r8 & r6;
        r10 = (long) r8;
        r10 = com.google.android.gms.internal.clearcut.zzfd.zzn(r14, r10);
    L_0x04b0:
        r15.zza(r9, r10);
    L_0x04b3:
        r7 = r7 + -4;
        goto L_0x0037;
    L_0x04b7:
        if (r1 == 0) goto L_0x04ce;
    L_0x04b9:
        r14 = r13.zzmy;
        r14.zza(r15, r1);
        r14 = r0.hasNext();
        if (r14 == 0) goto L_0x04cc;
    L_0x04c4:
        r14 = r0.next();
        r14 = (java.util.Map.Entry) r14;
        r1 = r14;
        goto L_0x04b7;
    L_0x04cc:
        r1 = r3;
        goto L_0x04b7;
    L_0x04ce:
        return;
    L_0x04cf:
        r0 = r13.zzmq;
        if (r0 == 0) goto L_0x0992;
    L_0x04d3:
        r0 = r13.zzmo;
        if (r0 == 0) goto L_0x04ee;
    L_0x04d7:
        r0 = r13.zzmy;
        r0 = r0.zza(r14);
        r1 = r0.isEmpty();
        if (r1 != 0) goto L_0x04ee;
    L_0x04e3:
        r0 = r0.iterator();
        r1 = r0.next();
        r1 = (java.util.Map.Entry) r1;
        goto L_0x04f0;
    L_0x04ee:
        r0 = r3;
        r1 = r0;
    L_0x04f0:
        r7 = r13.zzmi;
        r7 = r7.length;
        r8 = r1;
        r1 = 0;
    L_0x04f5:
        if (r1 >= r7) goto L_0x0975;
    L_0x04f7:
        r9 = r13.zzag(r1);
        r10 = r13.zzmi;
        r10 = r10[r1];
    L_0x04ff:
        if (r8 == 0) goto L_0x051d;
    L_0x0501:
        r11 = r13.zzmy;
        r11 = r11.zza(r8);
        if (r11 > r10) goto L_0x051d;
    L_0x0509:
        r11 = r13.zzmy;
        r11.zza(r15, r8);
        r8 = r0.hasNext();
        if (r8 == 0) goto L_0x051b;
    L_0x0514:
        r8 = r0.next();
        r8 = (java.util.Map.Entry) r8;
        goto L_0x04ff;
    L_0x051b:
        r8 = r3;
        goto L_0x04ff;
    L_0x051d:
        r11 = r9 & r2;
        r11 = r11 >>> 20;
        switch(r11) {
            case 0: goto L_0x0962;
            case 1: goto L_0x0952;
            case 2: goto L_0x0942;
            case 3: goto L_0x0932;
            case 4: goto L_0x0922;
            case 5: goto L_0x0912;
            case 6: goto L_0x0902;
            case 7: goto L_0x08f1;
            case 8: goto L_0x08e0;
            case 9: goto L_0x08cb;
            case 10: goto L_0x08b8;
            case 11: goto L_0x08a7;
            case 12: goto L_0x0896;
            case 13: goto L_0x0885;
            case 14: goto L_0x0874;
            case 15: goto L_0x0863;
            case 16: goto L_0x0852;
            case 17: goto L_0x083d;
            case 18: goto L_0x082c;
            case 19: goto L_0x081b;
            case 20: goto L_0x080a;
            case 21: goto L_0x07f9;
            case 22: goto L_0x07e8;
            case 23: goto L_0x07d7;
            case 24: goto L_0x07c6;
            case 25: goto L_0x07b5;
            case 26: goto L_0x07a4;
            case 27: goto L_0x078f;
            case 28: goto L_0x077e;
            case 29: goto L_0x076d;
            case 30: goto L_0x075c;
            case 31: goto L_0x074b;
            case 32: goto L_0x073a;
            case 33: goto L_0x0729;
            case 34: goto L_0x0718;
            case 35: goto L_0x0707;
            case 36: goto L_0x06f6;
            case 37: goto L_0x06e5;
            case 38: goto L_0x06d4;
            case 39: goto L_0x06c3;
            case 40: goto L_0x06b2;
            case 41: goto L_0x06a1;
            case 42: goto L_0x0690;
            case 43: goto L_0x067f;
            case 44: goto L_0x066e;
            case 45: goto L_0x065d;
            case 46: goto L_0x064c;
            case 47: goto L_0x063b;
            case 48: goto L_0x062a;
            case 49: goto L_0x0615;
            case 50: goto L_0x060a;
            case 51: goto L_0x05fc;
            case 52: goto L_0x05ee;
            case 53: goto L_0x05e0;
            case 54: goto L_0x05d2;
            case 55: goto L_0x05c4;
            case 56: goto L_0x05b6;
            case 57: goto L_0x05a8;
            case 58: goto L_0x059a;
            case 59: goto L_0x0592;
            case 60: goto L_0x058a;
            case 61: goto L_0x0582;
            case 62: goto L_0x0574;
            case 63: goto L_0x0566;
            case 64: goto L_0x0558;
            case 65: goto L_0x054a;
            case 66: goto L_0x053c;
            case 67: goto L_0x052e;
            case 68: goto L_0x0526;
            default: goto L_0x0524;
        };
    L_0x0524:
        goto L_0x0971;
    L_0x0526:
        r11 = r13.zza(r14, r10, r1);
        if (r11 == 0) goto L_0x0971;
    L_0x052c:
        goto L_0x0843;
    L_0x052e:
        r11 = r13.zza(r14, r10, r1);
        if (r11 == 0) goto L_0x0971;
    L_0x0534:
        r9 = r9 & r6;
        r11 = (long) r9;
        r11 = zzh(r14, r11);
        goto L_0x085e;
    L_0x053c:
        r11 = r13.zza(r14, r10, r1);
        if (r11 == 0) goto L_0x0971;
    L_0x0542:
        r9 = r9 & r6;
        r11 = (long) r9;
        r9 = zzg(r14, r11);
        goto L_0x086f;
    L_0x054a:
        r11 = r13.zza(r14, r10, r1);
        if (r11 == 0) goto L_0x0971;
    L_0x0550:
        r9 = r9 & r6;
        r11 = (long) r9;
        r11 = zzh(r14, r11);
        goto L_0x0880;
    L_0x0558:
        r11 = r13.zza(r14, r10, r1);
        if (r11 == 0) goto L_0x0971;
    L_0x055e:
        r9 = r9 & r6;
        r11 = (long) r9;
        r9 = zzg(r14, r11);
        goto L_0x0891;
    L_0x0566:
        r11 = r13.zza(r14, r10, r1);
        if (r11 == 0) goto L_0x0971;
    L_0x056c:
        r9 = r9 & r6;
        r11 = (long) r9;
        r9 = zzg(r14, r11);
        goto L_0x08a2;
    L_0x0574:
        r11 = r13.zza(r14, r10, r1);
        if (r11 == 0) goto L_0x0971;
    L_0x057a:
        r9 = r9 & r6;
        r11 = (long) r9;
        r9 = zzg(r14, r11);
        goto L_0x08b3;
    L_0x0582:
        r11 = r13.zza(r14, r10, r1);
        if (r11 == 0) goto L_0x0971;
    L_0x0588:
        goto L_0x08be;
    L_0x058a:
        r11 = r13.zza(r14, r10, r1);
        if (r11 == 0) goto L_0x0971;
    L_0x0590:
        goto L_0x08d1;
    L_0x0592:
        r11 = r13.zza(r14, r10, r1);
        if (r11 == 0) goto L_0x0971;
    L_0x0598:
        goto L_0x08e6;
    L_0x059a:
        r11 = r13.zza(r14, r10, r1);
        if (r11 == 0) goto L_0x0971;
    L_0x05a0:
        r9 = r9 & r6;
        r11 = (long) r9;
        r9 = zzi(r14, r11);
        goto L_0x08fd;
    L_0x05a8:
        r11 = r13.zza(r14, r10, r1);
        if (r11 == 0) goto L_0x0971;
    L_0x05ae:
        r9 = r9 & r6;
        r11 = (long) r9;
        r9 = zzg(r14, r11);
        goto L_0x090e;
    L_0x05b6:
        r11 = r13.zza(r14, r10, r1);
        if (r11 == 0) goto L_0x0971;
    L_0x05bc:
        r9 = r9 & r6;
        r11 = (long) r9;
        r11 = zzh(r14, r11);
        goto L_0x091e;
    L_0x05c4:
        r11 = r13.zza(r14, r10, r1);
        if (r11 == 0) goto L_0x0971;
    L_0x05ca:
        r9 = r9 & r6;
        r11 = (long) r9;
        r9 = zzg(r14, r11);
        goto L_0x092e;
    L_0x05d2:
        r11 = r13.zza(r14, r10, r1);
        if (r11 == 0) goto L_0x0971;
    L_0x05d8:
        r9 = r9 & r6;
        r11 = (long) r9;
        r11 = zzh(r14, r11);
        goto L_0x093e;
    L_0x05e0:
        r11 = r13.zza(r14, r10, r1);
        if (r11 == 0) goto L_0x0971;
    L_0x05e6:
        r9 = r9 & r6;
        r11 = (long) r9;
        r11 = zzh(r14, r11);
        goto L_0x094e;
    L_0x05ee:
        r11 = r13.zza(r14, r10, r1);
        if (r11 == 0) goto L_0x0971;
    L_0x05f4:
        r9 = r9 & r6;
        r11 = (long) r9;
        r9 = zzf(r14, r11);
        goto L_0x095e;
    L_0x05fc:
        r11 = r13.zza(r14, r10, r1);
        if (r11 == 0) goto L_0x0971;
    L_0x0602:
        r9 = r9 & r6;
        r11 = (long) r9;
        r11 = zze(r14, r11);
        goto L_0x096e;
    L_0x060a:
        r9 = r9 & r6;
        r11 = (long) r9;
        r9 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r11);
        r13.zza(r15, r10, r9, r1);
        goto L_0x0971;
    L_0x0615:
        r10 = r13.zzmi;
        r10 = r10[r1];
        r9 = r9 & r6;
        r11 = (long) r9;
        r9 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r11);
        r9 = (java.util.List) r9;
        r11 = r13.zzad(r1);
        com.google.android.gms.internal.clearcut.zzeh.zzb(r10, r9, r15, r11);
        goto L_0x0971;
    L_0x062a:
        r10 = r13.zzmi;
        r10 = r10[r1];
        r9 = r9 & r6;
        r11 = (long) r9;
        r9 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r11);
        r9 = (java.util.List) r9;
        com.google.android.gms.internal.clearcut.zzeh.zze(r10, r9, r15, r4);
        goto L_0x0971;
    L_0x063b:
        r10 = r13.zzmi;
        r10 = r10[r1];
        r9 = r9 & r6;
        r11 = (long) r9;
        r9 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r11);
        r9 = (java.util.List) r9;
        com.google.android.gms.internal.clearcut.zzeh.zzj(r10, r9, r15, r4);
        goto L_0x0971;
    L_0x064c:
        r10 = r13.zzmi;
        r10 = r10[r1];
        r9 = r9 & r6;
        r11 = (long) r9;
        r9 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r11);
        r9 = (java.util.List) r9;
        com.google.android.gms.internal.clearcut.zzeh.zzg(r10, r9, r15, r4);
        goto L_0x0971;
    L_0x065d:
        r10 = r13.zzmi;
        r10 = r10[r1];
        r9 = r9 & r6;
        r11 = (long) r9;
        r9 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r11);
        r9 = (java.util.List) r9;
        com.google.android.gms.internal.clearcut.zzeh.zzl(r10, r9, r15, r4);
        goto L_0x0971;
    L_0x066e:
        r10 = r13.zzmi;
        r10 = r10[r1];
        r9 = r9 & r6;
        r11 = (long) r9;
        r9 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r11);
        r9 = (java.util.List) r9;
        com.google.android.gms.internal.clearcut.zzeh.zzm(r10, r9, r15, r4);
        goto L_0x0971;
    L_0x067f:
        r10 = r13.zzmi;
        r10 = r10[r1];
        r9 = r9 & r6;
        r11 = (long) r9;
        r9 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r11);
        r9 = (java.util.List) r9;
        com.google.android.gms.internal.clearcut.zzeh.zzi(r10, r9, r15, r4);
        goto L_0x0971;
    L_0x0690:
        r10 = r13.zzmi;
        r10 = r10[r1];
        r9 = r9 & r6;
        r11 = (long) r9;
        r9 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r11);
        r9 = (java.util.List) r9;
        com.google.android.gms.internal.clearcut.zzeh.zzn(r10, r9, r15, r4);
        goto L_0x0971;
    L_0x06a1:
        r10 = r13.zzmi;
        r10 = r10[r1];
        r9 = r9 & r6;
        r11 = (long) r9;
        r9 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r11);
        r9 = (java.util.List) r9;
        com.google.android.gms.internal.clearcut.zzeh.zzk(r10, r9, r15, r4);
        goto L_0x0971;
    L_0x06b2:
        r10 = r13.zzmi;
        r10 = r10[r1];
        r9 = r9 & r6;
        r11 = (long) r9;
        r9 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r11);
        r9 = (java.util.List) r9;
        com.google.android.gms.internal.clearcut.zzeh.zzf(r10, r9, r15, r4);
        goto L_0x0971;
    L_0x06c3:
        r10 = r13.zzmi;
        r10 = r10[r1];
        r9 = r9 & r6;
        r11 = (long) r9;
        r9 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r11);
        r9 = (java.util.List) r9;
        com.google.android.gms.internal.clearcut.zzeh.zzh(r10, r9, r15, r4);
        goto L_0x0971;
    L_0x06d4:
        r10 = r13.zzmi;
        r10 = r10[r1];
        r9 = r9 & r6;
        r11 = (long) r9;
        r9 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r11);
        r9 = (java.util.List) r9;
        com.google.android.gms.internal.clearcut.zzeh.zzd(r10, r9, r15, r4);
        goto L_0x0971;
    L_0x06e5:
        r10 = r13.zzmi;
        r10 = r10[r1];
        r9 = r9 & r6;
        r11 = (long) r9;
        r9 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r11);
        r9 = (java.util.List) r9;
        com.google.android.gms.internal.clearcut.zzeh.zzc(r10, r9, r15, r4);
        goto L_0x0971;
    L_0x06f6:
        r10 = r13.zzmi;
        r10 = r10[r1];
        r9 = r9 & r6;
        r11 = (long) r9;
        r9 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r11);
        r9 = (java.util.List) r9;
        com.google.android.gms.internal.clearcut.zzeh.zzb(r10, r9, r15, r4);
        goto L_0x0971;
    L_0x0707:
        r10 = r13.zzmi;
        r10 = r10[r1];
        r9 = r9 & r6;
        r11 = (long) r9;
        r9 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r11);
        r9 = (java.util.List) r9;
        com.google.android.gms.internal.clearcut.zzeh.zza(r10, r9, r15, r4);
        goto L_0x0971;
    L_0x0718:
        r10 = r13.zzmi;
        r10 = r10[r1];
        r9 = r9 & r6;
        r11 = (long) r9;
        r9 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r11);
        r9 = (java.util.List) r9;
        com.google.android.gms.internal.clearcut.zzeh.zze(r10, r9, r15, r5);
        goto L_0x0971;
    L_0x0729:
        r10 = r13.zzmi;
        r10 = r10[r1];
        r9 = r9 & r6;
        r11 = (long) r9;
        r9 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r11);
        r9 = (java.util.List) r9;
        com.google.android.gms.internal.clearcut.zzeh.zzj(r10, r9, r15, r5);
        goto L_0x0971;
    L_0x073a:
        r10 = r13.zzmi;
        r10 = r10[r1];
        r9 = r9 & r6;
        r11 = (long) r9;
        r9 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r11);
        r9 = (java.util.List) r9;
        com.google.android.gms.internal.clearcut.zzeh.zzg(r10, r9, r15, r5);
        goto L_0x0971;
    L_0x074b:
        r10 = r13.zzmi;
        r10 = r10[r1];
        r9 = r9 & r6;
        r11 = (long) r9;
        r9 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r11);
        r9 = (java.util.List) r9;
        com.google.android.gms.internal.clearcut.zzeh.zzl(r10, r9, r15, r5);
        goto L_0x0971;
    L_0x075c:
        r10 = r13.zzmi;
        r10 = r10[r1];
        r9 = r9 & r6;
        r11 = (long) r9;
        r9 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r11);
        r9 = (java.util.List) r9;
        com.google.android.gms.internal.clearcut.zzeh.zzm(r10, r9, r15, r5);
        goto L_0x0971;
    L_0x076d:
        r10 = r13.zzmi;
        r10 = r10[r1];
        r9 = r9 & r6;
        r11 = (long) r9;
        r9 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r11);
        r9 = (java.util.List) r9;
        com.google.android.gms.internal.clearcut.zzeh.zzi(r10, r9, r15, r5);
        goto L_0x0971;
    L_0x077e:
        r10 = r13.zzmi;
        r10 = r10[r1];
        r9 = r9 & r6;
        r11 = (long) r9;
        r9 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r11);
        r9 = (java.util.List) r9;
        com.google.android.gms.internal.clearcut.zzeh.zzb(r10, r9, r15);
        goto L_0x0971;
    L_0x078f:
        r10 = r13.zzmi;
        r10 = r10[r1];
        r9 = r9 & r6;
        r11 = (long) r9;
        r9 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r11);
        r9 = (java.util.List) r9;
        r11 = r13.zzad(r1);
        com.google.android.gms.internal.clearcut.zzeh.zza(r10, r9, r15, r11);
        goto L_0x0971;
    L_0x07a4:
        r10 = r13.zzmi;
        r10 = r10[r1];
        r9 = r9 & r6;
        r11 = (long) r9;
        r9 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r11);
        r9 = (java.util.List) r9;
        com.google.android.gms.internal.clearcut.zzeh.zza(r10, r9, r15);
        goto L_0x0971;
    L_0x07b5:
        r10 = r13.zzmi;
        r10 = r10[r1];
        r9 = r9 & r6;
        r11 = (long) r9;
        r9 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r11);
        r9 = (java.util.List) r9;
        com.google.android.gms.internal.clearcut.zzeh.zzn(r10, r9, r15, r5);
        goto L_0x0971;
    L_0x07c6:
        r10 = r13.zzmi;
        r10 = r10[r1];
        r9 = r9 & r6;
        r11 = (long) r9;
        r9 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r11);
        r9 = (java.util.List) r9;
        com.google.android.gms.internal.clearcut.zzeh.zzk(r10, r9, r15, r5);
        goto L_0x0971;
    L_0x07d7:
        r10 = r13.zzmi;
        r10 = r10[r1];
        r9 = r9 & r6;
        r11 = (long) r9;
        r9 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r11);
        r9 = (java.util.List) r9;
        com.google.android.gms.internal.clearcut.zzeh.zzf(r10, r9, r15, r5);
        goto L_0x0971;
    L_0x07e8:
        r10 = r13.zzmi;
        r10 = r10[r1];
        r9 = r9 & r6;
        r11 = (long) r9;
        r9 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r11);
        r9 = (java.util.List) r9;
        com.google.android.gms.internal.clearcut.zzeh.zzh(r10, r9, r15, r5);
        goto L_0x0971;
    L_0x07f9:
        r10 = r13.zzmi;
        r10 = r10[r1];
        r9 = r9 & r6;
        r11 = (long) r9;
        r9 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r11);
        r9 = (java.util.List) r9;
        com.google.android.gms.internal.clearcut.zzeh.zzd(r10, r9, r15, r5);
        goto L_0x0971;
    L_0x080a:
        r10 = r13.zzmi;
        r10 = r10[r1];
        r9 = r9 & r6;
        r11 = (long) r9;
        r9 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r11);
        r9 = (java.util.List) r9;
        com.google.android.gms.internal.clearcut.zzeh.zzc(r10, r9, r15, r5);
        goto L_0x0971;
    L_0x081b:
        r10 = r13.zzmi;
        r10 = r10[r1];
        r9 = r9 & r6;
        r11 = (long) r9;
        r9 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r11);
        r9 = (java.util.List) r9;
        com.google.android.gms.internal.clearcut.zzeh.zzb(r10, r9, r15, r5);
        goto L_0x0971;
    L_0x082c:
        r10 = r13.zzmi;
        r10 = r10[r1];
        r9 = r9 & r6;
        r11 = (long) r9;
        r9 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r11);
        r9 = (java.util.List) r9;
        com.google.android.gms.internal.clearcut.zzeh.zza(r10, r9, r15, r5);
        goto L_0x0971;
    L_0x083d:
        r11 = r13.zza(r14, r1);
        if (r11 == 0) goto L_0x0971;
    L_0x0843:
        r9 = r9 & r6;
        r11 = (long) r9;
        r9 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r11);
        r11 = r13.zzad(r1);
        r15.zzb(r10, r9, r11);
        goto L_0x0971;
    L_0x0852:
        r11 = r13.zza(r14, r1);
        if (r11 == 0) goto L_0x0971;
    L_0x0858:
        r9 = r9 & r6;
        r11 = (long) r9;
        r11 = com.google.android.gms.internal.clearcut.zzfd.zzk(r14, r11);
    L_0x085e:
        r15.zzb(r10, r11);
        goto L_0x0971;
    L_0x0863:
        r11 = r13.zza(r14, r1);
        if (r11 == 0) goto L_0x0971;
    L_0x0869:
        r9 = r9 & r6;
        r11 = (long) r9;
        r9 = com.google.android.gms.internal.clearcut.zzfd.zzj(r14, r11);
    L_0x086f:
        r15.zze(r10, r9);
        goto L_0x0971;
    L_0x0874:
        r11 = r13.zza(r14, r1);
        if (r11 == 0) goto L_0x0971;
    L_0x087a:
        r9 = r9 & r6;
        r11 = (long) r9;
        r11 = com.google.android.gms.internal.clearcut.zzfd.zzk(r14, r11);
    L_0x0880:
        r15.zzj(r10, r11);
        goto L_0x0971;
    L_0x0885:
        r11 = r13.zza(r14, r1);
        if (r11 == 0) goto L_0x0971;
    L_0x088b:
        r9 = r9 & r6;
        r11 = (long) r9;
        r9 = com.google.android.gms.internal.clearcut.zzfd.zzj(r14, r11);
    L_0x0891:
        r15.zzm(r10, r9);
        goto L_0x0971;
    L_0x0896:
        r11 = r13.zza(r14, r1);
        if (r11 == 0) goto L_0x0971;
    L_0x089c:
        r9 = r9 & r6;
        r11 = (long) r9;
        r9 = com.google.android.gms.internal.clearcut.zzfd.zzj(r14, r11);
    L_0x08a2:
        r15.zzn(r10, r9);
        goto L_0x0971;
    L_0x08a7:
        r11 = r13.zza(r14, r1);
        if (r11 == 0) goto L_0x0971;
    L_0x08ad:
        r9 = r9 & r6;
        r11 = (long) r9;
        r9 = com.google.android.gms.internal.clearcut.zzfd.zzj(r14, r11);
    L_0x08b3:
        r15.zzd(r10, r9);
        goto L_0x0971;
    L_0x08b8:
        r11 = r13.zza(r14, r1);
        if (r11 == 0) goto L_0x0971;
    L_0x08be:
        r9 = r9 & r6;
        r11 = (long) r9;
        r9 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r11);
        r9 = (com.google.android.gms.internal.clearcut.zzbb) r9;
        r15.zza(r10, r9);
        goto L_0x0971;
    L_0x08cb:
        r11 = r13.zza(r14, r1);
        if (r11 == 0) goto L_0x0971;
    L_0x08d1:
        r9 = r9 & r6;
        r11 = (long) r9;
        r9 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r11);
        r11 = r13.zzad(r1);
        r15.zza(r10, r9, r11);
        goto L_0x0971;
    L_0x08e0:
        r11 = r13.zza(r14, r1);
        if (r11 == 0) goto L_0x0971;
    L_0x08e6:
        r9 = r9 & r6;
        r11 = (long) r9;
        r9 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r11);
        zza(r10, r9, r15);
        goto L_0x0971;
    L_0x08f1:
        r11 = r13.zza(r14, r1);
        if (r11 == 0) goto L_0x0971;
    L_0x08f7:
        r9 = r9 & r6;
        r11 = (long) r9;
        r9 = com.google.android.gms.internal.clearcut.zzfd.zzl(r14, r11);
    L_0x08fd:
        r15.zzb(r10, r9);
        goto L_0x0971;
    L_0x0902:
        r11 = r13.zza(r14, r1);
        if (r11 == 0) goto L_0x0971;
    L_0x0908:
        r9 = r9 & r6;
        r11 = (long) r9;
        r9 = com.google.android.gms.internal.clearcut.zzfd.zzj(r14, r11);
    L_0x090e:
        r15.zzf(r10, r9);
        goto L_0x0971;
    L_0x0912:
        r11 = r13.zza(r14, r1);
        if (r11 == 0) goto L_0x0971;
    L_0x0918:
        r9 = r9 & r6;
        r11 = (long) r9;
        r11 = com.google.android.gms.internal.clearcut.zzfd.zzk(r14, r11);
    L_0x091e:
        r15.zzc(r10, r11);
        goto L_0x0971;
    L_0x0922:
        r11 = r13.zza(r14, r1);
        if (r11 == 0) goto L_0x0971;
    L_0x0928:
        r9 = r9 & r6;
        r11 = (long) r9;
        r9 = com.google.android.gms.internal.clearcut.zzfd.zzj(r14, r11);
    L_0x092e:
        r15.zzc(r10, r9);
        goto L_0x0971;
    L_0x0932:
        r11 = r13.zza(r14, r1);
        if (r11 == 0) goto L_0x0971;
    L_0x0938:
        r9 = r9 & r6;
        r11 = (long) r9;
        r11 = com.google.android.gms.internal.clearcut.zzfd.zzk(r14, r11);
    L_0x093e:
        r15.zza(r10, r11);
        goto L_0x0971;
    L_0x0942:
        r11 = r13.zza(r14, r1);
        if (r11 == 0) goto L_0x0971;
    L_0x0948:
        r9 = r9 & r6;
        r11 = (long) r9;
        r11 = com.google.android.gms.internal.clearcut.zzfd.zzk(r14, r11);
    L_0x094e:
        r15.zzi(r10, r11);
        goto L_0x0971;
    L_0x0952:
        r11 = r13.zza(r14, r1);
        if (r11 == 0) goto L_0x0971;
    L_0x0958:
        r9 = r9 & r6;
        r11 = (long) r9;
        r9 = com.google.android.gms.internal.clearcut.zzfd.zzm(r14, r11);
    L_0x095e:
        r15.zza(r10, r9);
        goto L_0x0971;
    L_0x0962:
        r11 = r13.zza(r14, r1);
        if (r11 == 0) goto L_0x0971;
    L_0x0968:
        r9 = r9 & r6;
        r11 = (long) r9;
        r11 = com.google.android.gms.internal.clearcut.zzfd.zzn(r14, r11);
    L_0x096e:
        r15.zza(r10, r11);
    L_0x0971:
        r1 = r1 + 4;
        goto L_0x04f5;
    L_0x0975:
        if (r8 == 0) goto L_0x098c;
    L_0x0977:
        r1 = r13.zzmy;
        r1.zza(r15, r8);
        r1 = r0.hasNext();
        if (r1 == 0) goto L_0x098a;
    L_0x0982:
        r1 = r0.next();
        r1 = (java.util.Map.Entry) r1;
        r8 = r1;
        goto L_0x0975;
    L_0x098a:
        r8 = r3;
        goto L_0x0975;
    L_0x098c:
        r0 = r13.zzmx;
        zza(r0, r14, r15);
        return;
    L_0x0992:
        r13.zzb(r14, r15);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.zzds.zza(java.lang.Object, com.google.android.gms.internal.clearcut.zzfr):void");
    }

    /* JADX WARNING: Missing block: B:18:0x0069, code skipped:
            if (r7 == 0) goto L_0x00d0;
     */
    /* JADX WARNING: Missing block: B:21:0x0073, code skipped:
            r1 = r11.zzff;
     */
    /* JADX WARNING: Missing block: B:22:0x0075, code skipped:
            r9.putObject(r14, r2, r1);
     */
    /* JADX WARNING: Missing block: B:41:0x00ce, code skipped:
            if (r7 == 0) goto L_0x00d0;
     */
    /* JADX WARNING: Missing block: B:42:0x00d0, code skipped:
            r0 = com.google.android.gms.internal.clearcut.zzax.zza(r12, r10, r11);
            r1 = r11.zzfd;
     */
    /* JADX WARNING: Missing block: B:43:0x00d6, code skipped:
            r9.putInt(r14, r2, r1);
     */
    /* JADX WARNING: Missing block: B:46:0x00e3, code skipped:
            r9.putLong(r23, r2, r4);
            r0 = r6;
     */
    /* JADX WARNING: Missing block: B:49:0x00f5, code skipped:
            r0 = r10 + 4;
     */
    /* JADX WARNING: Missing block: B:52:0x0102, code skipped:
            r0 = r10 + 8;
     */
    /* JADX WARNING: Missing block: B:67:0x0164, code skipped:
            if (r0 == r15) goto L_0x01a3;
     */
    /* JADX WARNING: Missing block: B:72:0x0188, code skipped:
            if (r0 == r15) goto L_0x01a3;
     */
    /* JADX WARNING: Missing block: B:74:0x01a1, code skipped:
            if (r0 == r15) goto L_0x01a3;
     */
    public final void zza(T r23, byte[] r24, int r25, int r26, com.google.android.gms.internal.clearcut.zzay r27) {
        /*
        r22 = this;
        r15 = r22;
        r14 = r23;
        r12 = r24;
        r13 = r26;
        r11 = r27;
        r0 = r15.zzmq;
        if (r0 == 0) goto L_0x01ce;
    L_0x000e:
        r9 = zzmh;
        r0 = r25;
    L_0x0012:
        if (r0 >= r13) goto L_0x01c5;
    L_0x0014:
        r1 = r0 + 1;
        r0 = r12[r0];
        if (r0 >= 0) goto L_0x0024;
    L_0x001a:
        r0 = com.google.android.gms.internal.clearcut.zzax.zza(r0, r12, r1, r11);
        r1 = r11.zzfd;
        r10 = r0;
        r16 = r1;
        goto L_0x0027;
    L_0x0024:
        r16 = r0;
        r10 = r1;
    L_0x0027:
        r6 = r16 >>> 3;
        r7 = r16 & 7;
        r8 = r15.zzai(r6);
        if (r8 < 0) goto L_0x01a5;
    L_0x0031:
        r0 = r15.zzmi;
        r1 = r8 + 1;
        r5 = r0[r1];
        r0 = 267386880; // 0xff00000 float:2.3665827E-29 double:1.321066716E-315;
        r0 = r0 & r5;
        r4 = r0 >>> 20;
        r0 = 1048575; // 0xfffff float:1.469367E-39 double:5.18065E-318;
        r0 = r0 & r5;
        r2 = (long) r0;
        r0 = 17;
        r1 = 2;
        if (r4 > r0) goto L_0x0106;
    L_0x0046:
        r0 = 5;
        r6 = 1;
        switch(r4) {
            case 0: goto L_0x00f9;
            case 1: goto L_0x00ec;
            case 2: goto L_0x00db;
            case 3: goto L_0x00db;
            case 4: goto L_0x00ce;
            case 5: goto L_0x00c1;
            case 6: goto L_0x00b7;
            case 7: goto L_0x00a2;
            case 8: goto L_0x0091;
            case 9: goto L_0x0079;
            case 10: goto L_0x006d;
            case 11: goto L_0x00ce;
            case 12: goto L_0x0069;
            case 13: goto L_0x00b7;
            case 14: goto L_0x00c1;
            case 15: goto L_0x005b;
            case 16: goto L_0x004d;
            default: goto L_0x004b;
        };
    L_0x004b:
        goto L_0x01a5;
    L_0x004d:
        if (r7 != 0) goto L_0x01a5;
    L_0x004f:
        r6 = com.google.android.gms.internal.clearcut.zzax.zzb(r12, r10, r11);
        r0 = r11.zzfe;
        r4 = com.google.android.gms.internal.clearcut.zzbk.zza(r0);
        goto L_0x00e3;
    L_0x005b:
        if (r7 != 0) goto L_0x01a5;
    L_0x005d:
        r0 = com.google.android.gms.internal.clearcut.zzax.zza(r12, r10, r11);
        r1 = r11.zzfd;
        r1 = com.google.android.gms.internal.clearcut.zzbk.zzm(r1);
        goto L_0x00d6;
    L_0x0069:
        if (r7 != 0) goto L_0x01a5;
    L_0x006b:
        goto L_0x00d0;
    L_0x006d:
        if (r7 != r1) goto L_0x01a5;
    L_0x006f:
        r0 = com.google.android.gms.internal.clearcut.zzax.zze(r12, r10, r11);
    L_0x0073:
        r1 = r11.zzff;
    L_0x0075:
        r9.putObject(r14, r2, r1);
        goto L_0x0012;
    L_0x0079:
        if (r7 != r1) goto L_0x01a5;
    L_0x007b:
        r0 = r15.zzad(r8);
        r0 = zza(r0, r12, r10, r13, r11);
        r1 = r9.getObject(r14, r2);
        if (r1 != 0) goto L_0x008a;
    L_0x0089:
        goto L_0x0073;
    L_0x008a:
        r4 = r11.zzff;
        r1 = com.google.android.gms.internal.clearcut.zzci.zza(r1, r4);
        goto L_0x0075;
    L_0x0091:
        if (r7 != r1) goto L_0x01a5;
    L_0x0093:
        r0 = 536870912; // 0x20000000 float:1.0842022E-19 double:2.652494739E-315;
        r0 = r0 & r5;
        if (r0 != 0) goto L_0x009d;
    L_0x0098:
        r0 = com.google.android.gms.internal.clearcut.zzax.zzc(r12, r10, r11);
        goto L_0x0073;
    L_0x009d:
        r0 = com.google.android.gms.internal.clearcut.zzax.zzd(r12, r10, r11);
        goto L_0x0073;
    L_0x00a2:
        if (r7 != 0) goto L_0x01a5;
    L_0x00a4:
        r0 = com.google.android.gms.internal.clearcut.zzax.zzb(r12, r10, r11);
        r4 = r11.zzfe;
        r7 = 0;
        r1 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1));
        if (r1 == 0) goto L_0x00b1;
    L_0x00b0:
        goto L_0x00b2;
    L_0x00b1:
        r6 = 0;
    L_0x00b2:
        com.google.android.gms.internal.clearcut.zzfd.zza(r14, r2, r6);
        goto L_0x0012;
    L_0x00b7:
        if (r7 != r0) goto L_0x01a5;
    L_0x00b9:
        r0 = com.google.android.gms.internal.clearcut.zzax.zzc(r12, r10);
        r9.putInt(r14, r2, r0);
        goto L_0x00f5;
    L_0x00c1:
        if (r7 != r6) goto L_0x01a5;
    L_0x00c3:
        r4 = com.google.android.gms.internal.clearcut.zzax.zzd(r12, r10);
        r0 = r9;
        r1 = r23;
        r0.putLong(r1, r2, r4);
        goto L_0x0102;
    L_0x00ce:
        if (r7 != 0) goto L_0x01a5;
    L_0x00d0:
        r0 = com.google.android.gms.internal.clearcut.zzax.zza(r12, r10, r11);
        r1 = r11.zzfd;
    L_0x00d6:
        r9.putInt(r14, r2, r1);
        goto L_0x0012;
    L_0x00db:
        if (r7 != 0) goto L_0x01a5;
    L_0x00dd:
        r6 = com.google.android.gms.internal.clearcut.zzax.zzb(r12, r10, r11);
        r4 = r11.zzfe;
    L_0x00e3:
        r0 = r9;
        r1 = r23;
        r0.putLong(r1, r2, r4);
        r0 = r6;
        goto L_0x0012;
    L_0x00ec:
        if (r7 != r0) goto L_0x01a5;
    L_0x00ee:
        r0 = com.google.android.gms.internal.clearcut.zzax.zzf(r12, r10);
        com.google.android.gms.internal.clearcut.zzfd.zza(r14, r2, r0);
    L_0x00f5:
        r0 = r10 + 4;
        goto L_0x0012;
    L_0x00f9:
        if (r7 != r6) goto L_0x01a5;
    L_0x00fb:
        r0 = com.google.android.gms.internal.clearcut.zzax.zze(r12, r10);
        com.google.android.gms.internal.clearcut.zzfd.zza(r14, r2, r0);
    L_0x0102:
        r0 = r10 + 8;
        goto L_0x0012;
    L_0x0106:
        r0 = 27;
        if (r4 != r0) goto L_0x013e;
    L_0x010a:
        if (r7 != r1) goto L_0x01a5;
    L_0x010c:
        r0 = r9.getObject(r14, r2);
        r0 = (com.google.android.gms.internal.clearcut.zzcn) r0;
        r1 = r0.zzu();
        if (r1 != 0) goto L_0x012a;
    L_0x0118:
        r1 = r0.size();
        if (r1 != 0) goto L_0x0121;
    L_0x011e:
        r1 = 10;
        goto L_0x0123;
    L_0x0121:
        r1 = r1 << 1;
    L_0x0123:
        r0 = r0.zzi(r1);
        r9.putObject(r14, r2, r0);
    L_0x012a:
        r5 = r0;
        r0 = r15.zzad(r8);
        r1 = r16;
        r2 = r24;
        r3 = r10;
        r4 = r26;
        r6 = r27;
        r0 = zza(r0, r1, r2, r3, r4, r5, r6);
        goto L_0x0012;
    L_0x013e:
        r0 = 49;
        if (r4 > r0) goto L_0x0167;
    L_0x0142:
        r0 = (long) r5;
        r17 = r0;
        r0 = r22;
        r1 = r23;
        r19 = r2;
        r2 = r24;
        r3 = r10;
        r5 = r4;
        r4 = r26;
        r25 = r5;
        r5 = r16;
        r21 = r9;
        r15 = r10;
        r9 = r17;
        r11 = r25;
        r12 = r19;
        r14 = r27;
        r0 = r0.zza(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14);
        if (r0 != r15) goto L_0x01b7;
    L_0x0166:
        goto L_0x01a3;
    L_0x0167:
        r19 = r2;
        r25 = r4;
        r21 = r9;
        r15 = r10;
        r0 = 50;
        r9 = r25;
        if (r9 != r0) goto L_0x018b;
    L_0x0174:
        if (r7 != r1) goto L_0x01a8;
    L_0x0176:
        r0 = r22;
        r1 = r23;
        r2 = r24;
        r3 = r15;
        r4 = r26;
        r5 = r8;
        r7 = r19;
        r9 = r27;
        r0 = r0.zza(r1, r2, r3, r4, r5, r6, r7, r9);
        if (r0 != r15) goto L_0x01b7;
    L_0x018a:
        goto L_0x01a3;
    L_0x018b:
        r0 = r22;
        r1 = r23;
        r2 = r24;
        r3 = r15;
        r4 = r26;
        r10 = r5;
        r5 = r16;
        r12 = r8;
        r8 = r10;
        r10 = r19;
        r13 = r27;
        r0 = r0.zza(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13);
        if (r0 != r15) goto L_0x01b7;
    L_0x01a3:
        r2 = r0;
        goto L_0x01a9;
    L_0x01a5:
        r21 = r9;
        r15 = r10;
    L_0x01a8:
        r2 = r15;
    L_0x01a9:
        r0 = r16;
        r1 = r24;
        r3 = r26;
        r4 = r23;
        r5 = r27;
        r0 = zza(r0, r1, r2, r3, r4, r5);
    L_0x01b7:
        r15 = r22;
        r14 = r23;
        r12 = r24;
        r13 = r26;
        r11 = r27;
        r9 = r21;
        goto L_0x0012;
    L_0x01c5:
        r4 = r13;
        if (r0 != r4) goto L_0x01c9;
    L_0x01c8:
        return;
    L_0x01c9:
        r0 = com.google.android.gms.internal.clearcut.zzco.zzbo();
        throw r0;
    L_0x01ce:
        r4 = r13;
        r5 = 0;
        r0 = r22;
        r1 = r23;
        r2 = r24;
        r3 = r25;
        r4 = r26;
        r6 = r27;
        r0.zza(r1, r2, r3, r4, r5, r6);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.zzds.zza(java.lang.Object, byte[], int, int, com.google.android.gms.internal.clearcut.zzay):void");
    }

    public final void zzc(T t) {
        int[] iArr = this.zzmt;
        if (iArr != null) {
            for (int zzag : iArr) {
                long zzag2 = (long) (zzag(zzag) & 1048575);
                Object zzo = zzfd.zzo(t, zzag2);
                if (zzo != null) {
                    zzfd.zza((Object) t, zzag2, this.zzmz.zzj(zzo));
                }
            }
        }
        iArr = this.zzmu;
        if (iArr != null) {
            for (int i : iArr) {
                this.zzmw.zza(t, (long) i);
            }
        }
        this.zzmx.zzc(t);
        if (this.zzmo) {
            this.zzmy.zzc(t);
        }
    }

    /* JADX WARNING: Missing block: B:11:0x0031, code skipped:
            com.google.android.gms.internal.clearcut.zzfd.zza((java.lang.Object) r7, r2, com.google.android.gms.internal.clearcut.zzfd.zzo(r8, r2));
            zzb((java.lang.Object) r7, r4, r0);
     */
    /* JADX WARNING: Missing block: B:31:0x0089, code skipped:
            com.google.android.gms.internal.clearcut.zzfd.zza((java.lang.Object) r7, r2, com.google.android.gms.internal.clearcut.zzfd.zzo(r8, r2));
     */
    /* JADX WARNING: Missing block: B:41:0x00b3, code skipped:
            com.google.android.gms.internal.clearcut.zzfd.zza((java.lang.Object) r7, r2, com.google.android.gms.internal.clearcut.zzfd.zzj(r8, r2));
     */
    /* JADX WARNING: Missing block: B:46:0x00c8, code skipped:
            com.google.android.gms.internal.clearcut.zzfd.zza((java.lang.Object) r7, r2, com.google.android.gms.internal.clearcut.zzfd.zzk(r8, r2));
     */
    /* JADX WARNING: Missing block: B:53:0x00eb, code skipped:
            zzb((java.lang.Object) r7, r0);
     */
    /* JADX WARNING: Missing block: B:54:0x00ee, code skipped:
            r0 = r0 + 4;
     */
    public final void zzc(T r7, T r8) {
        /*
        r6 = this;
        if (r8 == 0) goto L_0x0105;
    L_0x0002:
        r0 = 0;
    L_0x0003:
        r1 = r6.zzmi;
        r1 = r1.length;
        if (r0 >= r1) goto L_0x00f2;
    L_0x0008:
        r1 = r6.zzag(r0);
        r2 = 1048575; // 0xfffff float:1.469367E-39 double:5.18065E-318;
        r2 = r2 & r1;
        r2 = (long) r2;
        r4 = r6.zzmi;
        r4 = r4[r0];
        r5 = 267386880; // 0xff00000 float:2.3665827E-29 double:1.321066716E-315;
        r1 = r1 & r5;
        r1 = r1 >>> 20;
        switch(r1) {
            case 0: goto L_0x00de;
            case 1: goto L_0x00d0;
            case 2: goto L_0x00c2;
            case 3: goto L_0x00bb;
            case 4: goto L_0x00ad;
            case 5: goto L_0x00a6;
            case 6: goto L_0x009f;
            case 7: goto L_0x0091;
            case 8: goto L_0x0083;
            case 9: goto L_0x007e;
            case 10: goto L_0x0077;
            case 11: goto L_0x0070;
            case 12: goto L_0x0069;
            case 13: goto L_0x0062;
            case 14: goto L_0x005a;
            case 15: goto L_0x0053;
            case 16: goto L_0x004b;
            case 17: goto L_0x007e;
            case 18: goto L_0x0044;
            case 19: goto L_0x0044;
            case 20: goto L_0x0044;
            case 21: goto L_0x0044;
            case 22: goto L_0x0044;
            case 23: goto L_0x0044;
            case 24: goto L_0x0044;
            case 25: goto L_0x0044;
            case 26: goto L_0x0044;
            case 27: goto L_0x0044;
            case 28: goto L_0x0044;
            case 29: goto L_0x0044;
            case 30: goto L_0x0044;
            case 31: goto L_0x0044;
            case 32: goto L_0x0044;
            case 33: goto L_0x0044;
            case 34: goto L_0x0044;
            case 35: goto L_0x0044;
            case 36: goto L_0x0044;
            case 37: goto L_0x0044;
            case 38: goto L_0x0044;
            case 39: goto L_0x0044;
            case 40: goto L_0x0044;
            case 41: goto L_0x0044;
            case 42: goto L_0x0044;
            case 43: goto L_0x0044;
            case 44: goto L_0x0044;
            case 45: goto L_0x0044;
            case 46: goto L_0x0044;
            case 47: goto L_0x0044;
            case 48: goto L_0x0044;
            case 49: goto L_0x0044;
            case 50: goto L_0x003d;
            case 51: goto L_0x002b;
            case 52: goto L_0x002b;
            case 53: goto L_0x002b;
            case 54: goto L_0x002b;
            case 55: goto L_0x002b;
            case 56: goto L_0x002b;
            case 57: goto L_0x002b;
            case 58: goto L_0x002b;
            case 59: goto L_0x002b;
            case 60: goto L_0x0026;
            case 61: goto L_0x001f;
            case 62: goto L_0x001f;
            case 63: goto L_0x001f;
            case 64: goto L_0x001f;
            case 65: goto L_0x001f;
            case 66: goto L_0x001f;
            case 67: goto L_0x001f;
            case 68: goto L_0x0026;
            default: goto L_0x001d;
        };
    L_0x001d:
        goto L_0x00ee;
    L_0x001f:
        r1 = r6.zza(r8, r4, r0);
        if (r1 == 0) goto L_0x00ee;
    L_0x0025:
        goto L_0x0031;
    L_0x0026:
        r6.zzb(r7, r8, r0);
        goto L_0x00ee;
    L_0x002b:
        r1 = r6.zza(r8, r4, r0);
        if (r1 == 0) goto L_0x00ee;
    L_0x0031:
        r1 = com.google.android.gms.internal.clearcut.zzfd.zzo(r8, r2);
        com.google.android.gms.internal.clearcut.zzfd.zza(r7, r2, r1);
        r6.zzb(r7, r4, r0);
        goto L_0x00ee;
    L_0x003d:
        r1 = r6.zzmz;
        com.google.android.gms.internal.clearcut.zzeh.zza(r1, r7, r8, r2);
        goto L_0x00ee;
    L_0x0044:
        r1 = r6.zzmw;
        r1.zza(r7, r8, r2);
        goto L_0x00ee;
    L_0x004b:
        r1 = r6.zza(r8, r0);
        if (r1 == 0) goto L_0x00ee;
    L_0x0051:
        goto L_0x00c8;
    L_0x0053:
        r1 = r6.zza(r8, r0);
        if (r1 == 0) goto L_0x00ee;
    L_0x0059:
        goto L_0x006f;
    L_0x005a:
        r1 = r6.zza(r8, r0);
        if (r1 == 0) goto L_0x00ee;
    L_0x0060:
        goto L_0x00c8;
    L_0x0062:
        r1 = r6.zza(r8, r0);
        if (r1 == 0) goto L_0x00ee;
    L_0x0068:
        goto L_0x006f;
    L_0x0069:
        r1 = r6.zza(r8, r0);
        if (r1 == 0) goto L_0x00ee;
    L_0x006f:
        goto L_0x00b3;
    L_0x0070:
        r1 = r6.zza(r8, r0);
        if (r1 == 0) goto L_0x00ee;
    L_0x0076:
        goto L_0x00b3;
    L_0x0077:
        r1 = r6.zza(r8, r0);
        if (r1 == 0) goto L_0x00ee;
    L_0x007d:
        goto L_0x0089;
    L_0x007e:
        r6.zza(r7, r8, r0);
        goto L_0x00ee;
    L_0x0083:
        r1 = r6.zza(r8, r0);
        if (r1 == 0) goto L_0x00ee;
    L_0x0089:
        r1 = com.google.android.gms.internal.clearcut.zzfd.zzo(r8, r2);
        com.google.android.gms.internal.clearcut.zzfd.zza(r7, r2, r1);
        goto L_0x00eb;
    L_0x0091:
        r1 = r6.zza(r8, r0);
        if (r1 == 0) goto L_0x00ee;
    L_0x0097:
        r1 = com.google.android.gms.internal.clearcut.zzfd.zzl(r8, r2);
        com.google.android.gms.internal.clearcut.zzfd.zza(r7, r2, r1);
        goto L_0x00eb;
    L_0x009f:
        r1 = r6.zza(r8, r0);
        if (r1 == 0) goto L_0x00ee;
    L_0x00a5:
        goto L_0x00b3;
    L_0x00a6:
        r1 = r6.zza(r8, r0);
        if (r1 == 0) goto L_0x00ee;
    L_0x00ac:
        goto L_0x00c8;
    L_0x00ad:
        r1 = r6.zza(r8, r0);
        if (r1 == 0) goto L_0x00ee;
    L_0x00b3:
        r1 = com.google.android.gms.internal.clearcut.zzfd.zzj(r8, r2);
        com.google.android.gms.internal.clearcut.zzfd.zza(r7, r2, r1);
        goto L_0x00eb;
    L_0x00bb:
        r1 = r6.zza(r8, r0);
        if (r1 == 0) goto L_0x00ee;
    L_0x00c1:
        goto L_0x00c8;
    L_0x00c2:
        r1 = r6.zza(r8, r0);
        if (r1 == 0) goto L_0x00ee;
    L_0x00c8:
        r4 = com.google.android.gms.internal.clearcut.zzfd.zzk(r8, r2);
        com.google.android.gms.internal.clearcut.zzfd.zza(r7, r2, r4);
        goto L_0x00eb;
    L_0x00d0:
        r1 = r6.zza(r8, r0);
        if (r1 == 0) goto L_0x00ee;
    L_0x00d6:
        r1 = com.google.android.gms.internal.clearcut.zzfd.zzm(r8, r2);
        com.google.android.gms.internal.clearcut.zzfd.zza(r7, r2, r1);
        goto L_0x00eb;
    L_0x00de:
        r1 = r6.zza(r8, r0);
        if (r1 == 0) goto L_0x00ee;
    L_0x00e4:
        r4 = com.google.android.gms.internal.clearcut.zzfd.zzn(r8, r2);
        com.google.android.gms.internal.clearcut.zzfd.zza(r7, r2, r4);
    L_0x00eb:
        r6.zzb(r7, r0);
    L_0x00ee:
        r0 = r0 + 4;
        goto L_0x0003;
    L_0x00f2:
        r0 = r6.zzmq;
        if (r0 != 0) goto L_0x0104;
    L_0x00f6:
        r0 = r6.zzmx;
        com.google.android.gms.internal.clearcut.zzeh.zza(r0, r7, r8);
        r0 = r6.zzmo;
        if (r0 == 0) goto L_0x0104;
    L_0x00ff:
        r0 = r6.zzmy;
        com.google.android.gms.internal.clearcut.zzeh.zza(r0, r7, r8);
    L_0x0104:
        return;
    L_0x0105:
        r7 = new java.lang.NullPointerException;
        r7.<init>();
        goto L_0x010c;
    L_0x010b:
        throw r7;
    L_0x010c:
        goto L_0x010b;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.zzds.zzc(java.lang.Object, java.lang.Object):void");
    }

    /* JADX WARNING: Missing block: B:37:0x00ab, code skipped:
            if ((r5 instanceof com.google.android.gms.internal.clearcut.zzbb) != false) goto L_0x030a;
     */
    /* JADX WARNING: Missing block: B:62:0x0127, code skipped:
            if (r0.zzmr != false) goto L_0x020d;
     */
    /* JADX WARNING: Missing block: B:66:0x0139, code skipped:
            if (r0.zzmr != false) goto L_0x020d;
     */
    /* JADX WARNING: Missing block: B:70:0x014b, code skipped:
            if (r0.zzmr != false) goto L_0x020d;
     */
    /* JADX WARNING: Missing block: B:74:0x015d, code skipped:
            if (r0.zzmr != false) goto L_0x020d;
     */
    /* JADX WARNING: Missing block: B:78:0x016f, code skipped:
            if (r0.zzmr != false) goto L_0x020d;
     */
    /* JADX WARNING: Missing block: B:82:0x0181, code skipped:
            if (r0.zzmr != false) goto L_0x020d;
     */
    /* JADX WARNING: Missing block: B:86:0x0193, code skipped:
            if (r0.zzmr != false) goto L_0x020d;
     */
    /* JADX WARNING: Missing block: B:90:0x01a5, code skipped:
            if (r0.zzmr != false) goto L_0x020d;
     */
    /* JADX WARNING: Missing block: B:94:0x01b6, code skipped:
            if (r0.zzmr != false) goto L_0x020d;
     */
    /* JADX WARNING: Missing block: B:98:0x01c7, code skipped:
            if (r0.zzmr != false) goto L_0x020d;
     */
    /* JADX WARNING: Missing block: B:102:0x01d8, code skipped:
            if (r0.zzmr != false) goto L_0x020d;
     */
    /* JADX WARNING: Missing block: B:106:0x01e9, code skipped:
            if (r0.zzmr != false) goto L_0x020d;
     */
    /* JADX WARNING: Missing block: B:110:0x01fa, code skipped:
            if (r0.zzmr != false) goto L_0x020d;
     */
    /* JADX WARNING: Missing block: B:114:0x020b, code skipped:
            if (r0.zzmr != false) goto L_0x020d;
     */
    /* JADX WARNING: Missing block: B:115:0x020d, code skipped:
            r2.putInt(r1, (long) r14, r5);
     */
    /* JADX WARNING: Missing block: B:116:0x0211, code skipped:
            r3 = (com.google.android.gms.internal.clearcut.zzbn.zzr(r3) + com.google.android.gms.internal.clearcut.zzbn.zzt(r5)) + r5;
     */
    /* JADX WARNING: Missing block: B:130:0x0296, code skipped:
            r13 = r13 + r3;
     */
    /* JADX WARNING: Missing block: B:133:0x029f, code skipped:
            r3 = com.google.android.gms.internal.clearcut.zzbn.zzc(r3, (com.google.android.gms.internal.clearcut.zzdo) com.google.android.gms.internal.clearcut.zzfd.zzo(r1, r5), zzad(r12));
     */
    /* JADX WARNING: Missing block: B:137:0x02b8, code skipped:
            r3 = com.google.android.gms.internal.clearcut.zzbn.zzf(r3, r5);
     */
    /* JADX WARNING: Missing block: B:141:0x02c7, code skipped:
            r3 = com.google.android.gms.internal.clearcut.zzbn.zzi(r3, r5);
     */
    /* JADX WARNING: Missing block: B:144:0x02d2, code skipped:
            r3 = com.google.android.gms.internal.clearcut.zzbn.zzh(r3, 0);
     */
    /* JADX WARNING: Missing block: B:147:0x02dd, code skipped:
            r3 = com.google.android.gms.internal.clearcut.zzbn.zzk(r3, 0);
     */
    /* JADX WARNING: Missing block: B:151:0x02ec, code skipped:
            r3 = com.google.android.gms.internal.clearcut.zzbn.zzl(r3, r5);
     */
    /* JADX WARNING: Missing block: B:155:0x02fb, code skipped:
            r3 = com.google.android.gms.internal.clearcut.zzbn.zzh(r3, r5);
     */
    /* JADX WARNING: Missing block: B:158:0x0306, code skipped:
            r5 = com.google.android.gms.internal.clearcut.zzfd.zzo(r1, r5);
     */
    /* JADX WARNING: Missing block: B:159:0x030a, code skipped:
            r3 = com.google.android.gms.internal.clearcut.zzbn.zzc(r3, (com.google.android.gms.internal.clearcut.zzbb) r5);
     */
    /* JADX WARNING: Missing block: B:162:0x0317, code skipped:
            r3 = com.google.android.gms.internal.clearcut.zzeh.zzc(r3, com.google.android.gms.internal.clearcut.zzfd.zzo(r1, r5), zzad(r12));
     */
    /* JADX WARNING: Missing block: B:166:0x0331, code skipped:
            if ((r5 instanceof com.google.android.gms.internal.clearcut.zzbb) != false) goto L_0x030a;
     */
    /* JADX WARNING: Missing block: B:167:0x0334, code skipped:
            r3 = com.google.android.gms.internal.clearcut.zzbn.zzb(r3, (java.lang.String) r5);
     */
    /* JADX WARNING: Missing block: B:170:0x0342, code skipped:
            r3 = com.google.android.gms.internal.clearcut.zzbn.zzc(r3, true);
     */
    /* JADX WARNING: Missing block: B:173:0x034e, code skipped:
            r3 = com.google.android.gms.internal.clearcut.zzbn.zzj(r3, 0);
     */
    /* JADX WARNING: Missing block: B:176:0x035a, code skipped:
            r3 = com.google.android.gms.internal.clearcut.zzbn.zzg(r3, 0);
     */
    /* JADX WARNING: Missing block: B:180:0x036a, code skipped:
            r3 = com.google.android.gms.internal.clearcut.zzbn.zzg(r3, r5);
     */
    /* JADX WARNING: Missing block: B:184:0x037a, code skipped:
            r3 = com.google.android.gms.internal.clearcut.zzbn.zze(r3, r5);
     */
    /* JADX WARNING: Missing block: B:188:0x038a, code skipped:
            r3 = com.google.android.gms.internal.clearcut.zzbn.zzd(r3, r5);
     */
    /* JADX WARNING: Missing block: B:191:0x0396, code skipped:
            r3 = com.google.android.gms.internal.clearcut.zzbn.zzb(r3, 0.0f);
     */
    /* JADX WARNING: Missing block: B:194:0x03a2, code skipped:
            r3 = com.google.android.gms.internal.clearcut.zzbn.zzb(r3, 0.0d);
     */
    /* JADX WARNING: Missing block: B:195:0x03aa, code skipped:
            r12 = r12 + 4;
            r3 = 267386880;
     */
    /* JADX WARNING: Missing block: B:220:0x0417, code skipped:
            if (zza(r1, r15, r3) != false) goto L_0x06b9;
     */
    /* JADX WARNING: Missing block: B:228:0x0437, code skipped:
            if (zza(r1, r15, r3) != false) goto L_0x06e6;
     */
    /* JADX WARNING: Missing block: B:230:0x043f, code skipped:
            if (zza(r1, r15, r3) != false) goto L_0x06f1;
     */
    /* JADX WARNING: Missing block: B:238:0x045f, code skipped:
            if (zza(r1, r15, r3) != false) goto L_0x0716;
     */
    /* JADX WARNING: Missing block: B:240:0x0467, code skipped:
            if (zza(r1, r15, r3) != false) goto L_0x0725;
     */
    /* JADX WARNING: Missing block: B:244:0x0477, code skipped:
            if ((r4 instanceof com.google.android.gms.internal.clearcut.zzbb) != false) goto L_0x071a;
     */
    /* JADX WARNING: Missing block: B:246:0x047f, code skipped:
            if (zza(r1, r15, r3) != false) goto L_0x074c;
     */
    /* JADX WARNING: Missing block: B:273:0x0517, code skipped:
            if (r0.zzmr != false) goto L_0x05fd;
     */
    /* JADX WARNING: Missing block: B:277:0x0529, code skipped:
            if (r0.zzmr != false) goto L_0x05fd;
     */
    /* JADX WARNING: Missing block: B:281:0x053b, code skipped:
            if (r0.zzmr != false) goto L_0x05fd;
     */
    /* JADX WARNING: Missing block: B:285:0x054d, code skipped:
            if (r0.zzmr != false) goto L_0x05fd;
     */
    /* JADX WARNING: Missing block: B:289:0x055f, code skipped:
            if (r0.zzmr != false) goto L_0x05fd;
     */
    /* JADX WARNING: Missing block: B:293:0x0571, code skipped:
            if (r0.zzmr != false) goto L_0x05fd;
     */
    /* JADX WARNING: Missing block: B:297:0x0583, code skipped:
            if (r0.zzmr != false) goto L_0x05fd;
     */
    /* JADX WARNING: Missing block: B:301:0x0595, code skipped:
            if (r0.zzmr != false) goto L_0x05fd;
     */
    /* JADX WARNING: Missing block: B:305:0x05a6, code skipped:
            if (r0.zzmr != false) goto L_0x05fd;
     */
    /* JADX WARNING: Missing block: B:309:0x05b7, code skipped:
            if (r0.zzmr != false) goto L_0x05fd;
     */
    /* JADX WARNING: Missing block: B:313:0x05c8, code skipped:
            if (r0.zzmr != false) goto L_0x05fd;
     */
    /* JADX WARNING: Missing block: B:317:0x05d9, code skipped:
            if (r0.zzmr != false) goto L_0x05fd;
     */
    /* JADX WARNING: Missing block: B:321:0x05ea, code skipped:
            if (r0.zzmr != false) goto L_0x05fd;
     */
    /* JADX WARNING: Missing block: B:325:0x05fb, code skipped:
            if (r0.zzmr != false) goto L_0x05fd;
     */
    /* JADX WARNING: Missing block: B:326:0x05fd, code skipped:
            r2.putInt(r1, (long) r11, r4);
     */
    /* JADX WARNING: Missing block: B:327:0x0601, code skipped:
            r9 = (com.google.android.gms.internal.clearcut.zzbn.zzr(r15) + com.google.android.gms.internal.clearcut.zzbn.zzt(r4)) + r4;
     */
    /* JADX WARNING: Missing block: B:341:0x06ac, code skipped:
            r5 = r5 + r4;
     */
    /* JADX WARNING: Missing block: B:343:0x06ae, code skipped:
            r13 = 0;
     */
    /* JADX WARNING: Missing block: B:345:0x06b7, code skipped:
            if ((r12 & r18) != 0) goto L_0x06b9;
     */
    /* JADX WARNING: Missing block: B:346:0x06b9, code skipped:
            r4 = com.google.android.gms.internal.clearcut.zzbn.zzc(r15, (com.google.android.gms.internal.clearcut.zzdo) r2.getObject(r1, r9), zzad(r3));
     */
    /* JADX WARNING: Missing block: B:350:0x06d0, code skipped:
            r4 = com.google.android.gms.internal.clearcut.zzbn.zzf(r15, r9);
     */
    /* JADX WARNING: Missing block: B:354:0x06dd, code skipped:
            r4 = com.google.android.gms.internal.clearcut.zzbn.zzi(r15, r4);
     */
    /* JADX WARNING: Missing block: B:356:0x06e4, code skipped:
            if ((r12 & r18) != 0) goto L_0x06e6;
     */
    /* JADX WARNING: Missing block: B:357:0x06e6, code skipped:
            r4 = com.google.android.gms.internal.clearcut.zzbn.zzh(r15, 0);
     */
    /* JADX WARNING: Missing block: B:359:0x06ef, code skipped:
            if ((r12 & r18) != 0) goto L_0x06f1;
     */
    /* JADX WARNING: Missing block: B:360:0x06f1, code skipped:
            r9 = com.google.android.gms.internal.clearcut.zzbn.zzk(r15, 0);
     */
    /* JADX WARNING: Missing block: B:361:0x06f6, code skipped:
            r5 = r5 + r9;
     */
    /* JADX WARNING: Missing block: B:365:0x0700, code skipped:
            r4 = com.google.android.gms.internal.clearcut.zzbn.zzl(r15, r4);
     */
    /* JADX WARNING: Missing block: B:369:0x070d, code skipped:
            r4 = com.google.android.gms.internal.clearcut.zzbn.zzh(r15, r4);
     */
    /* JADX WARNING: Missing block: B:371:0x0714, code skipped:
            if ((r12 & r18) != 0) goto L_0x0716;
     */
    /* JADX WARNING: Missing block: B:372:0x0716, code skipped:
            r4 = r2.getObject(r1, r9);
     */
    /* JADX WARNING: Missing block: B:373:0x071a, code skipped:
            r4 = com.google.android.gms.internal.clearcut.zzbn.zzc(r15, (com.google.android.gms.internal.clearcut.zzbb) r4);
     */
    /* JADX WARNING: Missing block: B:375:0x0723, code skipped:
            if ((r12 & r18) != 0) goto L_0x0725;
     */
    /* JADX WARNING: Missing block: B:376:0x0725, code skipped:
            r4 = com.google.android.gms.internal.clearcut.zzeh.zzc(r15, r2.getObject(r1, r9), zzad(r3));
     */
    /* JADX WARNING: Missing block: B:380:0x073d, code skipped:
            if ((r4 instanceof com.google.android.gms.internal.clearcut.zzbb) != false) goto L_0x071a;
     */
    /* JADX WARNING: Missing block: B:381:0x0740, code skipped:
            r4 = com.google.android.gms.internal.clearcut.zzbn.zzb(r15, (java.lang.String) r4);
     */
    /* JADX WARNING: Missing block: B:383:0x074a, code skipped:
            if ((r12 & r18) != 0) goto L_0x074c;
     */
    /* JADX WARNING: Missing block: B:384:0x074c, code skipped:
            r4 = com.google.android.gms.internal.clearcut.zzbn.zzc(r15, true);
     */
    /* JADX WARNING: Missing block: B:401:0x079c, code skipped:
            r5 = r5 + r9;
     */
    /* JADX WARNING: Missing block: B:410:0x07be, code skipped:
            r3 = r3 + 4;
            r9 = r13;
     */
    public final int zzm(T r20) {
        /*
        r19 = this;
        r0 = r19;
        r1 = r20;
        r2 = r0.zzmq;
        r3 = 267386880; // 0xff00000 float:2.3665827E-29 double:1.321066716E-315;
        r4 = 0;
        r7 = 1;
        r8 = 1048575; // 0xfffff float:1.469367E-39 double:5.18065E-318;
        r9 = 0;
        r11 = 0;
        if (r2 == 0) goto L_0x03b8;
    L_0x0012:
        r2 = zzmh;
        r12 = 0;
        r13 = 0;
    L_0x0016:
        r14 = r0.zzmi;
        r14 = r14.length;
        if (r12 >= r14) goto L_0x03b0;
    L_0x001b:
        r14 = r0.zzag(r12);
        r15 = r14 & r3;
        r15 = r15 >>> 20;
        r3 = r0.zzmi;
        r3 = r3[r12];
        r14 = r14 & r8;
        r5 = (long) r14;
        r14 = com.google.android.gms.internal.clearcut.zzcb.DOUBLE_LIST_PACKED;
        r14 = r14.id();
        if (r15 < r14) goto L_0x0041;
    L_0x0031:
        r14 = com.google.android.gms.internal.clearcut.zzcb.SINT64_LIST_PACKED;
        r14 = r14.id();
        if (r15 > r14) goto L_0x0041;
    L_0x0039:
        r14 = r0.zzmi;
        r17 = r12 + 2;
        r14 = r14[r17];
        r14 = r14 & r8;
        goto L_0x0042;
    L_0x0041:
        r14 = 0;
    L_0x0042:
        switch(r15) {
            case 0: goto L_0x039c;
            case 1: goto L_0x0390;
            case 2: goto L_0x0380;
            case 3: goto L_0x0370;
            case 4: goto L_0x0360;
            case 5: goto L_0x0354;
            case 6: goto L_0x0348;
            case 7: goto L_0x033c;
            case 8: goto L_0x0325;
            case 9: goto L_0x0311;
            case 10: goto L_0x0300;
            case 11: goto L_0x02f1;
            case 12: goto L_0x02e2;
            case 13: goto L_0x02d7;
            case 14: goto L_0x02cc;
            case 15: goto L_0x02bd;
            case 16: goto L_0x02ae;
            case 17: goto L_0x0299;
            case 18: goto L_0x028e;
            case 19: goto L_0x0285;
            case 20: goto L_0x027c;
            case 21: goto L_0x0273;
            case 22: goto L_0x026a;
            case 23: goto L_0x028e;
            case 24: goto L_0x0285;
            case 25: goto L_0x0261;
            case 26: goto L_0x0258;
            case 27: goto L_0x024b;
            case 28: goto L_0x0242;
            case 29: goto L_0x0239;
            case 30: goto L_0x0230;
            case 31: goto L_0x0285;
            case 32: goto L_0x028e;
            case 33: goto L_0x0227;
            case 34: goto L_0x021d;
            case 35: goto L_0x01fd;
            case 36: goto L_0x01ec;
            case 37: goto L_0x01db;
            case 38: goto L_0x01ca;
            case 39: goto L_0x01b9;
            case 40: goto L_0x01a8;
            case 41: goto L_0x0197;
            case 42: goto L_0x0185;
            case 43: goto L_0x0173;
            case 44: goto L_0x0161;
            case 45: goto L_0x014f;
            case 46: goto L_0x013d;
            case 47: goto L_0x012b;
            case 48: goto L_0x0119;
            case 49: goto L_0x010b;
            case 50: goto L_0x00fb;
            case 51: goto L_0x00f3;
            case 52: goto L_0x00eb;
            case 53: goto L_0x00df;
            case 54: goto L_0x00d3;
            case 55: goto L_0x00c7;
            case 56: goto L_0x00bf;
            case 57: goto L_0x00b7;
            case 58: goto L_0x00af;
            case 59: goto L_0x009f;
            case 60: goto L_0x0097;
            case 61: goto L_0x008f;
            case 62: goto L_0x0083;
            case 63: goto L_0x0077;
            case 64: goto L_0x006f;
            case 65: goto L_0x0067;
            case 66: goto L_0x005b;
            case 67: goto L_0x004f;
            case 68: goto L_0x0047;
            default: goto L_0x0045;
        };
    L_0x0045:
        goto L_0x03aa;
    L_0x0047:
        r14 = r0.zza(r1, r3, r12);
        if (r14 == 0) goto L_0x03aa;
    L_0x004d:
        goto L_0x029f;
    L_0x004f:
        r14 = r0.zza(r1, r3, r12);
        if (r14 == 0) goto L_0x03aa;
    L_0x0055:
        r5 = zzh(r1, r5);
        goto L_0x02b8;
    L_0x005b:
        r14 = r0.zza(r1, r3, r12);
        if (r14 == 0) goto L_0x03aa;
    L_0x0061:
        r5 = zzg(r1, r5);
        goto L_0x02c7;
    L_0x0067:
        r5 = r0.zza(r1, r3, r12);
        if (r5 == 0) goto L_0x03aa;
    L_0x006d:
        goto L_0x02d2;
    L_0x006f:
        r5 = r0.zza(r1, r3, r12);
        if (r5 == 0) goto L_0x03aa;
    L_0x0075:
        goto L_0x02dd;
    L_0x0077:
        r14 = r0.zza(r1, r3, r12);
        if (r14 == 0) goto L_0x03aa;
    L_0x007d:
        r5 = zzg(r1, r5);
        goto L_0x02ec;
    L_0x0083:
        r14 = r0.zza(r1, r3, r12);
        if (r14 == 0) goto L_0x03aa;
    L_0x0089:
        r5 = zzg(r1, r5);
        goto L_0x02fb;
    L_0x008f:
        r14 = r0.zza(r1, r3, r12);
        if (r14 == 0) goto L_0x03aa;
    L_0x0095:
        goto L_0x0306;
    L_0x0097:
        r14 = r0.zza(r1, r3, r12);
        if (r14 == 0) goto L_0x03aa;
    L_0x009d:
        goto L_0x0317;
    L_0x009f:
        r14 = r0.zza(r1, r3, r12);
        if (r14 == 0) goto L_0x03aa;
    L_0x00a5:
        r5 = com.google.android.gms.internal.clearcut.zzfd.zzo(r1, r5);
        r6 = r5 instanceof com.google.android.gms.internal.clearcut.zzbb;
        if (r6 == 0) goto L_0x0334;
    L_0x00ad:
        goto L_0x0333;
    L_0x00af:
        r5 = r0.zza(r1, r3, r12);
        if (r5 == 0) goto L_0x03aa;
    L_0x00b5:
        goto L_0x0342;
    L_0x00b7:
        r5 = r0.zza(r1, r3, r12);
        if (r5 == 0) goto L_0x03aa;
    L_0x00bd:
        goto L_0x034e;
    L_0x00bf:
        r5 = r0.zza(r1, r3, r12);
        if (r5 == 0) goto L_0x03aa;
    L_0x00c5:
        goto L_0x035a;
    L_0x00c7:
        r14 = r0.zza(r1, r3, r12);
        if (r14 == 0) goto L_0x03aa;
    L_0x00cd:
        r5 = zzg(r1, r5);
        goto L_0x036a;
    L_0x00d3:
        r14 = r0.zza(r1, r3, r12);
        if (r14 == 0) goto L_0x03aa;
    L_0x00d9:
        r5 = zzh(r1, r5);
        goto L_0x037a;
    L_0x00df:
        r14 = r0.zza(r1, r3, r12);
        if (r14 == 0) goto L_0x03aa;
    L_0x00e5:
        r5 = zzh(r1, r5);
        goto L_0x038a;
    L_0x00eb:
        r5 = r0.zza(r1, r3, r12);
        if (r5 == 0) goto L_0x03aa;
    L_0x00f1:
        goto L_0x0396;
    L_0x00f3:
        r5 = r0.zza(r1, r3, r12);
        if (r5 == 0) goto L_0x03aa;
    L_0x00f9:
        goto L_0x03a2;
    L_0x00fb:
        r14 = r0.zzmz;
        r5 = com.google.android.gms.internal.clearcut.zzfd.zzo(r1, r5);
        r6 = r0.zzae(r12);
        r3 = r14.zzb(r3, r5, r6);
        goto L_0x0296;
    L_0x010b:
        r5 = zzd(r1, r5);
        r6 = r0.zzad(r12);
        r3 = com.google.android.gms.internal.clearcut.zzeh.zzd(r3, r5, r6);
        goto L_0x0296;
    L_0x0119:
        r5 = r2.getObject(r1, r5);
        r5 = (java.util.List) r5;
        r5 = com.google.android.gms.internal.clearcut.zzeh.zzc(r5);
        if (r5 <= 0) goto L_0x03aa;
    L_0x0125:
        r6 = r0.zzmr;
        if (r6 == 0) goto L_0x0211;
    L_0x0129:
        goto L_0x020d;
    L_0x012b:
        r5 = r2.getObject(r1, r5);
        r5 = (java.util.List) r5;
        r5 = com.google.android.gms.internal.clearcut.zzeh.zzg(r5);
        if (r5 <= 0) goto L_0x03aa;
    L_0x0137:
        r6 = r0.zzmr;
        if (r6 == 0) goto L_0x0211;
    L_0x013b:
        goto L_0x020d;
    L_0x013d:
        r5 = r2.getObject(r1, r5);
        r5 = (java.util.List) r5;
        r5 = com.google.android.gms.internal.clearcut.zzeh.zzi(r5);
        if (r5 <= 0) goto L_0x03aa;
    L_0x0149:
        r6 = r0.zzmr;
        if (r6 == 0) goto L_0x0211;
    L_0x014d:
        goto L_0x020d;
    L_0x014f:
        r5 = r2.getObject(r1, r5);
        r5 = (java.util.List) r5;
        r5 = com.google.android.gms.internal.clearcut.zzeh.zzh(r5);
        if (r5 <= 0) goto L_0x03aa;
    L_0x015b:
        r6 = r0.zzmr;
        if (r6 == 0) goto L_0x0211;
    L_0x015f:
        goto L_0x020d;
    L_0x0161:
        r5 = r2.getObject(r1, r5);
        r5 = (java.util.List) r5;
        r5 = com.google.android.gms.internal.clearcut.zzeh.zzd(r5);
        if (r5 <= 0) goto L_0x03aa;
    L_0x016d:
        r6 = r0.zzmr;
        if (r6 == 0) goto L_0x0211;
    L_0x0171:
        goto L_0x020d;
    L_0x0173:
        r5 = r2.getObject(r1, r5);
        r5 = (java.util.List) r5;
        r5 = com.google.android.gms.internal.clearcut.zzeh.zzf(r5);
        if (r5 <= 0) goto L_0x03aa;
    L_0x017f:
        r6 = r0.zzmr;
        if (r6 == 0) goto L_0x0211;
    L_0x0183:
        goto L_0x020d;
    L_0x0185:
        r5 = r2.getObject(r1, r5);
        r5 = (java.util.List) r5;
        r5 = com.google.android.gms.internal.clearcut.zzeh.zzj(r5);
        if (r5 <= 0) goto L_0x03aa;
    L_0x0191:
        r6 = r0.zzmr;
        if (r6 == 0) goto L_0x0211;
    L_0x0195:
        goto L_0x020d;
    L_0x0197:
        r5 = r2.getObject(r1, r5);
        r5 = (java.util.List) r5;
        r5 = com.google.android.gms.internal.clearcut.zzeh.zzh(r5);
        if (r5 <= 0) goto L_0x03aa;
    L_0x01a3:
        r6 = r0.zzmr;
        if (r6 == 0) goto L_0x0211;
    L_0x01a7:
        goto L_0x020d;
    L_0x01a8:
        r5 = r2.getObject(r1, r5);
        r5 = (java.util.List) r5;
        r5 = com.google.android.gms.internal.clearcut.zzeh.zzi(r5);
        if (r5 <= 0) goto L_0x03aa;
    L_0x01b4:
        r6 = r0.zzmr;
        if (r6 == 0) goto L_0x0211;
    L_0x01b8:
        goto L_0x020d;
    L_0x01b9:
        r5 = r2.getObject(r1, r5);
        r5 = (java.util.List) r5;
        r5 = com.google.android.gms.internal.clearcut.zzeh.zze(r5);
        if (r5 <= 0) goto L_0x03aa;
    L_0x01c5:
        r6 = r0.zzmr;
        if (r6 == 0) goto L_0x0211;
    L_0x01c9:
        goto L_0x020d;
    L_0x01ca:
        r5 = r2.getObject(r1, r5);
        r5 = (java.util.List) r5;
        r5 = com.google.android.gms.internal.clearcut.zzeh.zzb(r5);
        if (r5 <= 0) goto L_0x03aa;
    L_0x01d6:
        r6 = r0.zzmr;
        if (r6 == 0) goto L_0x0211;
    L_0x01da:
        goto L_0x020d;
    L_0x01db:
        r5 = r2.getObject(r1, r5);
        r5 = (java.util.List) r5;
        r5 = com.google.android.gms.internal.clearcut.zzeh.zza(r5);
        if (r5 <= 0) goto L_0x03aa;
    L_0x01e7:
        r6 = r0.zzmr;
        if (r6 == 0) goto L_0x0211;
    L_0x01eb:
        goto L_0x020d;
    L_0x01ec:
        r5 = r2.getObject(r1, r5);
        r5 = (java.util.List) r5;
        r5 = com.google.android.gms.internal.clearcut.zzeh.zzh(r5);
        if (r5 <= 0) goto L_0x03aa;
    L_0x01f8:
        r6 = r0.zzmr;
        if (r6 == 0) goto L_0x0211;
    L_0x01fc:
        goto L_0x020d;
    L_0x01fd:
        r5 = r2.getObject(r1, r5);
        r5 = (java.util.List) r5;
        r5 = com.google.android.gms.internal.clearcut.zzeh.zzi(r5);
        if (r5 <= 0) goto L_0x03aa;
    L_0x0209:
        r6 = r0.zzmr;
        if (r6 == 0) goto L_0x0211;
    L_0x020d:
        r14 = (long) r14;
        r2.putInt(r1, r14, r5);
    L_0x0211:
        r3 = com.google.android.gms.internal.clearcut.zzbn.zzr(r3);
        r6 = com.google.android.gms.internal.clearcut.zzbn.zzt(r5);
        r3 = r3 + r6;
        r3 = r3 + r5;
        goto L_0x0296;
    L_0x021d:
        r5 = zzd(r1, r5);
        r3 = com.google.android.gms.internal.clearcut.zzeh.zzq(r3, r5, r11);
        goto L_0x0296;
    L_0x0227:
        r5 = zzd(r1, r5);
        r3 = com.google.android.gms.internal.clearcut.zzeh.zzu(r3, r5, r11);
        goto L_0x0296;
    L_0x0230:
        r5 = zzd(r1, r5);
        r3 = com.google.android.gms.internal.clearcut.zzeh.zzr(r3, r5, r11);
        goto L_0x0296;
    L_0x0239:
        r5 = zzd(r1, r5);
        r3 = com.google.android.gms.internal.clearcut.zzeh.zzt(r3, r5, r11);
        goto L_0x0296;
    L_0x0242:
        r5 = zzd(r1, r5);
        r3 = com.google.android.gms.internal.clearcut.zzeh.zzd(r3, r5);
        goto L_0x0296;
    L_0x024b:
        r5 = zzd(r1, r5);
        r6 = r0.zzad(r12);
        r3 = com.google.android.gms.internal.clearcut.zzeh.zzc(r3, r5, r6);
        goto L_0x0296;
    L_0x0258:
        r5 = zzd(r1, r5);
        r3 = com.google.android.gms.internal.clearcut.zzeh.zzc(r3, r5);
        goto L_0x0296;
    L_0x0261:
        r5 = zzd(r1, r5);
        r3 = com.google.android.gms.internal.clearcut.zzeh.zzx(r3, r5, r11);
        goto L_0x0296;
    L_0x026a:
        r5 = zzd(r1, r5);
        r3 = com.google.android.gms.internal.clearcut.zzeh.zzs(r3, r5, r11);
        goto L_0x0296;
    L_0x0273:
        r5 = zzd(r1, r5);
        r3 = com.google.android.gms.internal.clearcut.zzeh.zzp(r3, r5, r11);
        goto L_0x0296;
    L_0x027c:
        r5 = zzd(r1, r5);
        r3 = com.google.android.gms.internal.clearcut.zzeh.zzo(r3, r5, r11);
        goto L_0x0296;
    L_0x0285:
        r5 = zzd(r1, r5);
        r3 = com.google.android.gms.internal.clearcut.zzeh.zzv(r3, r5, r11);
        goto L_0x0296;
    L_0x028e:
        r5 = zzd(r1, r5);
        r3 = com.google.android.gms.internal.clearcut.zzeh.zzw(r3, r5, r11);
    L_0x0296:
        r13 = r13 + r3;
        goto L_0x03aa;
    L_0x0299:
        r14 = r0.zza(r1, r12);
        if (r14 == 0) goto L_0x03aa;
    L_0x029f:
        r5 = com.google.android.gms.internal.clearcut.zzfd.zzo(r1, r5);
        r5 = (com.google.android.gms.internal.clearcut.zzdo) r5;
        r6 = r0.zzad(r12);
        r3 = com.google.android.gms.internal.clearcut.zzbn.zzc(r3, r5, r6);
        goto L_0x0296;
    L_0x02ae:
        r14 = r0.zza(r1, r12);
        if (r14 == 0) goto L_0x03aa;
    L_0x02b4:
        r5 = com.google.android.gms.internal.clearcut.zzfd.zzk(r1, r5);
    L_0x02b8:
        r3 = com.google.android.gms.internal.clearcut.zzbn.zzf(r3, r5);
        goto L_0x0296;
    L_0x02bd:
        r14 = r0.zza(r1, r12);
        if (r14 == 0) goto L_0x03aa;
    L_0x02c3:
        r5 = com.google.android.gms.internal.clearcut.zzfd.zzj(r1, r5);
    L_0x02c7:
        r3 = com.google.android.gms.internal.clearcut.zzbn.zzi(r3, r5);
        goto L_0x0296;
    L_0x02cc:
        r5 = r0.zza(r1, r12);
        if (r5 == 0) goto L_0x03aa;
    L_0x02d2:
        r3 = com.google.android.gms.internal.clearcut.zzbn.zzh(r3, r9);
        goto L_0x0296;
    L_0x02d7:
        r5 = r0.zza(r1, r12);
        if (r5 == 0) goto L_0x03aa;
    L_0x02dd:
        r3 = com.google.android.gms.internal.clearcut.zzbn.zzk(r3, r11);
        goto L_0x0296;
    L_0x02e2:
        r14 = r0.zza(r1, r12);
        if (r14 == 0) goto L_0x03aa;
    L_0x02e8:
        r5 = com.google.android.gms.internal.clearcut.zzfd.zzj(r1, r5);
    L_0x02ec:
        r3 = com.google.android.gms.internal.clearcut.zzbn.zzl(r3, r5);
        goto L_0x0296;
    L_0x02f1:
        r14 = r0.zza(r1, r12);
        if (r14 == 0) goto L_0x03aa;
    L_0x02f7:
        r5 = com.google.android.gms.internal.clearcut.zzfd.zzj(r1, r5);
    L_0x02fb:
        r3 = com.google.android.gms.internal.clearcut.zzbn.zzh(r3, r5);
        goto L_0x0296;
    L_0x0300:
        r14 = r0.zza(r1, r12);
        if (r14 == 0) goto L_0x03aa;
    L_0x0306:
        r5 = com.google.android.gms.internal.clearcut.zzfd.zzo(r1, r5);
    L_0x030a:
        r5 = (com.google.android.gms.internal.clearcut.zzbb) r5;
        r3 = com.google.android.gms.internal.clearcut.zzbn.zzc(r3, r5);
        goto L_0x0296;
    L_0x0311:
        r14 = r0.zza(r1, r12);
        if (r14 == 0) goto L_0x03aa;
    L_0x0317:
        r5 = com.google.android.gms.internal.clearcut.zzfd.zzo(r1, r5);
        r6 = r0.zzad(r12);
        r3 = com.google.android.gms.internal.clearcut.zzeh.zzc(r3, r5, r6);
        goto L_0x0296;
    L_0x0325:
        r14 = r0.zza(r1, r12);
        if (r14 == 0) goto L_0x03aa;
    L_0x032b:
        r5 = com.google.android.gms.internal.clearcut.zzfd.zzo(r1, r5);
        r6 = r5 instanceof com.google.android.gms.internal.clearcut.zzbb;
        if (r6 == 0) goto L_0x0334;
    L_0x0333:
        goto L_0x030a;
    L_0x0334:
        r5 = (java.lang.String) r5;
        r3 = com.google.android.gms.internal.clearcut.zzbn.zzb(r3, r5);
        goto L_0x0296;
    L_0x033c:
        r5 = r0.zza(r1, r12);
        if (r5 == 0) goto L_0x03aa;
    L_0x0342:
        r3 = com.google.android.gms.internal.clearcut.zzbn.zzc(r3, r7);
        goto L_0x0296;
    L_0x0348:
        r5 = r0.zza(r1, r12);
        if (r5 == 0) goto L_0x03aa;
    L_0x034e:
        r3 = com.google.android.gms.internal.clearcut.zzbn.zzj(r3, r11);
        goto L_0x0296;
    L_0x0354:
        r5 = r0.zza(r1, r12);
        if (r5 == 0) goto L_0x03aa;
    L_0x035a:
        r3 = com.google.android.gms.internal.clearcut.zzbn.zzg(r3, r9);
        goto L_0x0296;
    L_0x0360:
        r14 = r0.zza(r1, r12);
        if (r14 == 0) goto L_0x03aa;
    L_0x0366:
        r5 = com.google.android.gms.internal.clearcut.zzfd.zzj(r1, r5);
    L_0x036a:
        r3 = com.google.android.gms.internal.clearcut.zzbn.zzg(r3, r5);
        goto L_0x0296;
    L_0x0370:
        r14 = r0.zza(r1, r12);
        if (r14 == 0) goto L_0x03aa;
    L_0x0376:
        r5 = com.google.android.gms.internal.clearcut.zzfd.zzk(r1, r5);
    L_0x037a:
        r3 = com.google.android.gms.internal.clearcut.zzbn.zze(r3, r5);
        goto L_0x0296;
    L_0x0380:
        r14 = r0.zza(r1, r12);
        if (r14 == 0) goto L_0x03aa;
    L_0x0386:
        r5 = com.google.android.gms.internal.clearcut.zzfd.zzk(r1, r5);
    L_0x038a:
        r3 = com.google.android.gms.internal.clearcut.zzbn.zzd(r3, r5);
        goto L_0x0296;
    L_0x0390:
        r5 = r0.zza(r1, r12);
        if (r5 == 0) goto L_0x03aa;
    L_0x0396:
        r3 = com.google.android.gms.internal.clearcut.zzbn.zzb(r3, r4);
        goto L_0x0296;
    L_0x039c:
        r5 = r0.zza(r1, r12);
        if (r5 == 0) goto L_0x03aa;
    L_0x03a2:
        r5 = 0;
        r3 = com.google.android.gms.internal.clearcut.zzbn.zzb(r3, r5);
        goto L_0x0296;
    L_0x03aa:
        r12 = r12 + 4;
        r3 = 267386880; // 0xff00000 float:2.3665827E-29 double:1.321066716E-315;
        goto L_0x0016;
    L_0x03b0:
        r2 = r0.zzmx;
        r1 = zza(r2, r1);
        r13 = r13 + r1;
        return r13;
    L_0x03b8:
        r2 = zzmh;
        r3 = -1;
        r3 = 0;
        r5 = 0;
        r6 = -1;
        r12 = 0;
    L_0x03bf:
        r13 = r0.zzmi;
        r13 = r13.length;
        if (r3 >= r13) goto L_0x07c5;
    L_0x03c4:
        r13 = r0.zzag(r3);
        r14 = r0.zzmi;
        r15 = r14[r3];
        r16 = 267386880; // 0xff00000 float:2.3665827E-29 double:1.321066716E-315;
        r17 = r13 & r16;
        r4 = r17 >>> 20;
        r11 = 17;
        if (r4 > r11) goto L_0x03eb;
    L_0x03d6:
        r11 = r3 + 2;
        r11 = r14[r11];
        r14 = r11 & r8;
        r18 = r11 >>> 20;
        r18 = r7 << r18;
        if (r14 == r6) goto L_0x03e8;
    L_0x03e2:
        r9 = (long) r14;
        r12 = r2.getInt(r1, r9);
        goto L_0x03e9;
    L_0x03e8:
        r14 = r6;
    L_0x03e9:
        r6 = r14;
        goto L_0x040b;
    L_0x03eb:
        r9 = r0.zzmr;
        if (r9 == 0) goto L_0x0408;
    L_0x03ef:
        r9 = com.google.android.gms.internal.clearcut.zzcb.DOUBLE_LIST_PACKED;
        r9 = r9.id();
        if (r4 < r9) goto L_0x0408;
    L_0x03f7:
        r9 = com.google.android.gms.internal.clearcut.zzcb.SINT64_LIST_PACKED;
        r9 = r9.id();
        if (r4 > r9) goto L_0x0408;
    L_0x03ff:
        r9 = r0.zzmi;
        r10 = r3 + 2;
        r9 = r9[r10];
        r11 = r9 & r8;
        goto L_0x0409;
    L_0x0408:
        r11 = 0;
    L_0x0409:
        r18 = 0;
    L_0x040b:
        r9 = r13 & r8;
        r9 = (long) r9;
        switch(r4) {
            case 0: goto L_0x07af;
            case 1: goto L_0x079f;
            case 2: goto L_0x078d;
            case 3: goto L_0x077d;
            case 4: goto L_0x076d;
            case 5: goto L_0x075e;
            case 6: goto L_0x0752;
            case 7: goto L_0x0748;
            case 8: goto L_0x0733;
            case 9: goto L_0x0721;
            case 10: goto L_0x0712;
            case 11: goto L_0x0705;
            case 12: goto L_0x06f8;
            case 13: goto L_0x06ed;
            case 14: goto L_0x06e2;
            case 15: goto L_0x06d5;
            case 16: goto L_0x06c8;
            case 17: goto L_0x06b5;
            case 18: goto L_0x06a1;
            case 19: goto L_0x0695;
            case 20: goto L_0x0689;
            case 21: goto L_0x067d;
            case 22: goto L_0x0671;
            case 23: goto L_0x06a1;
            case 24: goto L_0x0695;
            case 25: goto L_0x0665;
            case 26: goto L_0x065a;
            case 27: goto L_0x064b;
            case 28: goto L_0x0640;
            case 29: goto L_0x0634;
            case 30: goto L_0x0627;
            case 31: goto L_0x0695;
            case 32: goto L_0x06a1;
            case 33: goto L_0x061a;
            case 34: goto L_0x060d;
            case 35: goto L_0x05ed;
            case 36: goto L_0x05dc;
            case 37: goto L_0x05cb;
            case 38: goto L_0x05ba;
            case 39: goto L_0x05a9;
            case 40: goto L_0x0598;
            case 41: goto L_0x0587;
            case 42: goto L_0x0575;
            case 43: goto L_0x0563;
            case 44: goto L_0x0551;
            case 45: goto L_0x053f;
            case 46: goto L_0x052d;
            case 47: goto L_0x051b;
            case 48: goto L_0x0509;
            case 49: goto L_0x04f9;
            case 50: goto L_0x04e9;
            case 51: goto L_0x04db;
            case 52: goto L_0x04ce;
            case 53: goto L_0x04be;
            case 54: goto L_0x04ae;
            case 55: goto L_0x049e;
            case 56: goto L_0x0490;
            case 57: goto L_0x0483;
            case 58: goto L_0x047b;
            case 59: goto L_0x046b;
            case 60: goto L_0x0463;
            case 61: goto L_0x045b;
            case 62: goto L_0x044f;
            case 63: goto L_0x0443;
            case 64: goto L_0x043b;
            case 65: goto L_0x0433;
            case 66: goto L_0x0427;
            case 67: goto L_0x041b;
            case 68: goto L_0x0413;
            default: goto L_0x0411;
        };
    L_0x0411:
        goto L_0x06ad;
    L_0x0413:
        r4 = r0.zza(r1, r15, r3);
        if (r4 == 0) goto L_0x06ad;
    L_0x0419:
        goto L_0x06b9;
    L_0x041b:
        r4 = r0.zza(r1, r15, r3);
        if (r4 == 0) goto L_0x06ad;
    L_0x0421:
        r9 = zzh(r1, r9);
        goto L_0x06d0;
    L_0x0427:
        r4 = r0.zza(r1, r15, r3);
        if (r4 == 0) goto L_0x06ad;
    L_0x042d:
        r4 = zzg(r1, r9);
        goto L_0x06dd;
    L_0x0433:
        r4 = r0.zza(r1, r15, r3);
        if (r4 == 0) goto L_0x06ad;
    L_0x0439:
        goto L_0x06e6;
    L_0x043b:
        r4 = r0.zza(r1, r15, r3);
        if (r4 == 0) goto L_0x06ad;
    L_0x0441:
        goto L_0x06f1;
    L_0x0443:
        r4 = r0.zza(r1, r15, r3);
        if (r4 == 0) goto L_0x06ad;
    L_0x0449:
        r4 = zzg(r1, r9);
        goto L_0x0700;
    L_0x044f:
        r4 = r0.zza(r1, r15, r3);
        if (r4 == 0) goto L_0x06ad;
    L_0x0455:
        r4 = zzg(r1, r9);
        goto L_0x070d;
    L_0x045b:
        r4 = r0.zza(r1, r15, r3);
        if (r4 == 0) goto L_0x06ad;
    L_0x0461:
        goto L_0x0716;
    L_0x0463:
        r4 = r0.zza(r1, r15, r3);
        if (r4 == 0) goto L_0x06ad;
    L_0x0469:
        goto L_0x0725;
    L_0x046b:
        r4 = r0.zza(r1, r15, r3);
        if (r4 == 0) goto L_0x06ad;
    L_0x0471:
        r4 = r2.getObject(r1, r9);
        r9 = r4 instanceof com.google.android.gms.internal.clearcut.zzbb;
        if (r9 == 0) goto L_0x0740;
    L_0x0479:
        goto L_0x073f;
    L_0x047b:
        r4 = r0.zza(r1, r15, r3);
        if (r4 == 0) goto L_0x06ad;
    L_0x0481:
        goto L_0x074c;
    L_0x0483:
        r4 = r0.zza(r1, r15, r3);
        if (r4 == 0) goto L_0x06ad;
    L_0x0489:
        r4 = 0;
        r9 = com.google.android.gms.internal.clearcut.zzbn.zzj(r15, r4);
        goto L_0x06f6;
    L_0x0490:
        r4 = r0.zza(r1, r15, r3);
        if (r4 == 0) goto L_0x06ad;
    L_0x0496:
        r9 = 0;
        r4 = com.google.android.gms.internal.clearcut.zzbn.zzg(r15, r9);
        goto L_0x06ac;
    L_0x049e:
        r4 = r0.zza(r1, r15, r3);
        if (r4 == 0) goto L_0x06ad;
    L_0x04a4:
        r4 = zzg(r1, r9);
        r4 = com.google.android.gms.internal.clearcut.zzbn.zzg(r15, r4);
        goto L_0x06ac;
    L_0x04ae:
        r4 = r0.zza(r1, r15, r3);
        if (r4 == 0) goto L_0x06ad;
    L_0x04b4:
        r9 = zzh(r1, r9);
        r4 = com.google.android.gms.internal.clearcut.zzbn.zze(r15, r9);
        goto L_0x06ac;
    L_0x04be:
        r4 = r0.zza(r1, r15, r3);
        if (r4 == 0) goto L_0x06ad;
    L_0x04c4:
        r9 = zzh(r1, r9);
        r4 = com.google.android.gms.internal.clearcut.zzbn.zzd(r15, r9);
        goto L_0x06ac;
    L_0x04ce:
        r4 = r0.zza(r1, r15, r3);
        if (r4 == 0) goto L_0x06ad;
    L_0x04d4:
        r4 = 0;
        r9 = com.google.android.gms.internal.clearcut.zzbn.zzb(r15, r4);
        goto L_0x06f6;
    L_0x04db:
        r4 = r0.zza(r1, r15, r3);
        if (r4 == 0) goto L_0x06ad;
    L_0x04e1:
        r9 = 0;
        r4 = com.google.android.gms.internal.clearcut.zzbn.zzb(r15, r9);
        goto L_0x06ac;
    L_0x04e9:
        r4 = r0.zzmz;
        r9 = r2.getObject(r1, r9);
        r10 = r0.zzae(r3);
        r4 = r4.zzb(r15, r9, r10);
        goto L_0x06ac;
    L_0x04f9:
        r4 = r2.getObject(r1, r9);
        r4 = (java.util.List) r4;
        r9 = r0.zzad(r3);
        r4 = com.google.android.gms.internal.clearcut.zzeh.zzd(r15, r4, r9);
        goto L_0x06ac;
    L_0x0509:
        r4 = r2.getObject(r1, r9);
        r4 = (java.util.List) r4;
        r4 = com.google.android.gms.internal.clearcut.zzeh.zzc(r4);
        if (r4 <= 0) goto L_0x06ad;
    L_0x0515:
        r9 = r0.zzmr;
        if (r9 == 0) goto L_0x0601;
    L_0x0519:
        goto L_0x05fd;
    L_0x051b:
        r4 = r2.getObject(r1, r9);
        r4 = (java.util.List) r4;
        r4 = com.google.android.gms.internal.clearcut.zzeh.zzg(r4);
        if (r4 <= 0) goto L_0x06ad;
    L_0x0527:
        r9 = r0.zzmr;
        if (r9 == 0) goto L_0x0601;
    L_0x052b:
        goto L_0x05fd;
    L_0x052d:
        r4 = r2.getObject(r1, r9);
        r4 = (java.util.List) r4;
        r4 = com.google.android.gms.internal.clearcut.zzeh.zzi(r4);
        if (r4 <= 0) goto L_0x06ad;
    L_0x0539:
        r9 = r0.zzmr;
        if (r9 == 0) goto L_0x0601;
    L_0x053d:
        goto L_0x05fd;
    L_0x053f:
        r4 = r2.getObject(r1, r9);
        r4 = (java.util.List) r4;
        r4 = com.google.android.gms.internal.clearcut.zzeh.zzh(r4);
        if (r4 <= 0) goto L_0x06ad;
    L_0x054b:
        r9 = r0.zzmr;
        if (r9 == 0) goto L_0x0601;
    L_0x054f:
        goto L_0x05fd;
    L_0x0551:
        r4 = r2.getObject(r1, r9);
        r4 = (java.util.List) r4;
        r4 = com.google.android.gms.internal.clearcut.zzeh.zzd(r4);
        if (r4 <= 0) goto L_0x06ad;
    L_0x055d:
        r9 = r0.zzmr;
        if (r9 == 0) goto L_0x0601;
    L_0x0561:
        goto L_0x05fd;
    L_0x0563:
        r4 = r2.getObject(r1, r9);
        r4 = (java.util.List) r4;
        r4 = com.google.android.gms.internal.clearcut.zzeh.zzf(r4);
        if (r4 <= 0) goto L_0x06ad;
    L_0x056f:
        r9 = r0.zzmr;
        if (r9 == 0) goto L_0x0601;
    L_0x0573:
        goto L_0x05fd;
    L_0x0575:
        r4 = r2.getObject(r1, r9);
        r4 = (java.util.List) r4;
        r4 = com.google.android.gms.internal.clearcut.zzeh.zzj(r4);
        if (r4 <= 0) goto L_0x06ad;
    L_0x0581:
        r9 = r0.zzmr;
        if (r9 == 0) goto L_0x0601;
    L_0x0585:
        goto L_0x05fd;
    L_0x0587:
        r4 = r2.getObject(r1, r9);
        r4 = (java.util.List) r4;
        r4 = com.google.android.gms.internal.clearcut.zzeh.zzh(r4);
        if (r4 <= 0) goto L_0x06ad;
    L_0x0593:
        r9 = r0.zzmr;
        if (r9 == 0) goto L_0x0601;
    L_0x0597:
        goto L_0x05fd;
    L_0x0598:
        r4 = r2.getObject(r1, r9);
        r4 = (java.util.List) r4;
        r4 = com.google.android.gms.internal.clearcut.zzeh.zzi(r4);
        if (r4 <= 0) goto L_0x06ad;
    L_0x05a4:
        r9 = r0.zzmr;
        if (r9 == 0) goto L_0x0601;
    L_0x05a8:
        goto L_0x05fd;
    L_0x05a9:
        r4 = r2.getObject(r1, r9);
        r4 = (java.util.List) r4;
        r4 = com.google.android.gms.internal.clearcut.zzeh.zze(r4);
        if (r4 <= 0) goto L_0x06ad;
    L_0x05b5:
        r9 = r0.zzmr;
        if (r9 == 0) goto L_0x0601;
    L_0x05b9:
        goto L_0x05fd;
    L_0x05ba:
        r4 = r2.getObject(r1, r9);
        r4 = (java.util.List) r4;
        r4 = com.google.android.gms.internal.clearcut.zzeh.zzb(r4);
        if (r4 <= 0) goto L_0x06ad;
    L_0x05c6:
        r9 = r0.zzmr;
        if (r9 == 0) goto L_0x0601;
    L_0x05ca:
        goto L_0x05fd;
    L_0x05cb:
        r4 = r2.getObject(r1, r9);
        r4 = (java.util.List) r4;
        r4 = com.google.android.gms.internal.clearcut.zzeh.zza(r4);
        if (r4 <= 0) goto L_0x06ad;
    L_0x05d7:
        r9 = r0.zzmr;
        if (r9 == 0) goto L_0x0601;
    L_0x05db:
        goto L_0x05fd;
    L_0x05dc:
        r4 = r2.getObject(r1, r9);
        r4 = (java.util.List) r4;
        r4 = com.google.android.gms.internal.clearcut.zzeh.zzh(r4);
        if (r4 <= 0) goto L_0x06ad;
    L_0x05e8:
        r9 = r0.zzmr;
        if (r9 == 0) goto L_0x0601;
    L_0x05ec:
        goto L_0x05fd;
    L_0x05ed:
        r4 = r2.getObject(r1, r9);
        r4 = (java.util.List) r4;
        r4 = com.google.android.gms.internal.clearcut.zzeh.zzi(r4);
        if (r4 <= 0) goto L_0x06ad;
    L_0x05f9:
        r9 = r0.zzmr;
        if (r9 == 0) goto L_0x0601;
    L_0x05fd:
        r9 = (long) r11;
        r2.putInt(r1, r9, r4);
    L_0x0601:
        r9 = com.google.android.gms.internal.clearcut.zzbn.zzr(r15);
        r10 = com.google.android.gms.internal.clearcut.zzbn.zzt(r4);
        r9 = r9 + r10;
        r9 = r9 + r4;
        goto L_0x06f6;
    L_0x060d:
        r4 = r2.getObject(r1, r9);
        r4 = (java.util.List) r4;
        r11 = 0;
        r4 = com.google.android.gms.internal.clearcut.zzeh.zzq(r15, r4, r11);
        goto L_0x06ac;
    L_0x061a:
        r11 = 0;
        r4 = r2.getObject(r1, r9);
        r4 = (java.util.List) r4;
        r4 = com.google.android.gms.internal.clearcut.zzeh.zzu(r15, r4, r11);
        goto L_0x06ac;
    L_0x0627:
        r11 = 0;
        r4 = r2.getObject(r1, r9);
        r4 = (java.util.List) r4;
        r4 = com.google.android.gms.internal.clearcut.zzeh.zzr(r15, r4, r11);
        goto L_0x06ac;
    L_0x0634:
        r11 = 0;
        r4 = r2.getObject(r1, r9);
        r4 = (java.util.List) r4;
        r4 = com.google.android.gms.internal.clearcut.zzeh.zzt(r15, r4, r11);
        goto L_0x06ac;
    L_0x0640:
        r4 = r2.getObject(r1, r9);
        r4 = (java.util.List) r4;
        r4 = com.google.android.gms.internal.clearcut.zzeh.zzd(r15, r4);
        goto L_0x06ac;
    L_0x064b:
        r4 = r2.getObject(r1, r9);
        r4 = (java.util.List) r4;
        r9 = r0.zzad(r3);
        r4 = com.google.android.gms.internal.clearcut.zzeh.zzc(r15, r4, r9);
        goto L_0x06ac;
    L_0x065a:
        r4 = r2.getObject(r1, r9);
        r4 = (java.util.List) r4;
        r4 = com.google.android.gms.internal.clearcut.zzeh.zzc(r15, r4);
        goto L_0x06ac;
    L_0x0665:
        r4 = r2.getObject(r1, r9);
        r4 = (java.util.List) r4;
        r11 = 0;
        r4 = com.google.android.gms.internal.clearcut.zzeh.zzx(r15, r4, r11);
        goto L_0x06ac;
    L_0x0671:
        r11 = 0;
        r4 = r2.getObject(r1, r9);
        r4 = (java.util.List) r4;
        r4 = com.google.android.gms.internal.clearcut.zzeh.zzs(r15, r4, r11);
        goto L_0x06ac;
    L_0x067d:
        r11 = 0;
        r4 = r2.getObject(r1, r9);
        r4 = (java.util.List) r4;
        r4 = com.google.android.gms.internal.clearcut.zzeh.zzp(r15, r4, r11);
        goto L_0x06ac;
    L_0x0689:
        r11 = 0;
        r4 = r2.getObject(r1, r9);
        r4 = (java.util.List) r4;
        r4 = com.google.android.gms.internal.clearcut.zzeh.zzo(r15, r4, r11);
        goto L_0x06ac;
    L_0x0695:
        r11 = 0;
        r4 = r2.getObject(r1, r9);
        r4 = (java.util.List) r4;
        r4 = com.google.android.gms.internal.clearcut.zzeh.zzv(r15, r4, r11);
        goto L_0x06ac;
    L_0x06a1:
        r11 = 0;
        r4 = r2.getObject(r1, r9);
        r4 = (java.util.List) r4;
        r4 = com.google.android.gms.internal.clearcut.zzeh.zzw(r15, r4, r11);
    L_0x06ac:
        r5 = r5 + r4;
    L_0x06ad:
        r4 = 0;
    L_0x06ae:
        r9 = 0;
        r10 = 0;
        r13 = 0;
        goto L_0x07be;
    L_0x06b5:
        r4 = r12 & r18;
        if (r4 == 0) goto L_0x06ad;
    L_0x06b9:
        r4 = r2.getObject(r1, r9);
        r4 = (com.google.android.gms.internal.clearcut.zzdo) r4;
        r9 = r0.zzad(r3);
        r4 = com.google.android.gms.internal.clearcut.zzbn.zzc(r15, r4, r9);
        goto L_0x06ac;
    L_0x06c8:
        r4 = r12 & r18;
        if (r4 == 0) goto L_0x06ad;
    L_0x06cc:
        r9 = r2.getLong(r1, r9);
    L_0x06d0:
        r4 = com.google.android.gms.internal.clearcut.zzbn.zzf(r15, r9);
        goto L_0x06ac;
    L_0x06d5:
        r4 = r12 & r18;
        if (r4 == 0) goto L_0x06ad;
    L_0x06d9:
        r4 = r2.getInt(r1, r9);
    L_0x06dd:
        r4 = com.google.android.gms.internal.clearcut.zzbn.zzi(r15, r4);
        goto L_0x06ac;
    L_0x06e2:
        r4 = r12 & r18;
        if (r4 == 0) goto L_0x06ad;
    L_0x06e6:
        r9 = 0;
        r4 = com.google.android.gms.internal.clearcut.zzbn.zzh(r15, r9);
        goto L_0x06ac;
    L_0x06ed:
        r4 = r12 & r18;
        if (r4 == 0) goto L_0x06ad;
    L_0x06f1:
        r4 = 0;
        r9 = com.google.android.gms.internal.clearcut.zzbn.zzk(r15, r4);
    L_0x06f6:
        r5 = r5 + r9;
        goto L_0x06ad;
    L_0x06f8:
        r4 = r12 & r18;
        if (r4 == 0) goto L_0x06ad;
    L_0x06fc:
        r4 = r2.getInt(r1, r9);
    L_0x0700:
        r4 = com.google.android.gms.internal.clearcut.zzbn.zzl(r15, r4);
        goto L_0x06ac;
    L_0x0705:
        r4 = r12 & r18;
        if (r4 == 0) goto L_0x06ad;
    L_0x0709:
        r4 = r2.getInt(r1, r9);
    L_0x070d:
        r4 = com.google.android.gms.internal.clearcut.zzbn.zzh(r15, r4);
        goto L_0x06ac;
    L_0x0712:
        r4 = r12 & r18;
        if (r4 == 0) goto L_0x06ad;
    L_0x0716:
        r4 = r2.getObject(r1, r9);
    L_0x071a:
        r4 = (com.google.android.gms.internal.clearcut.zzbb) r4;
        r4 = com.google.android.gms.internal.clearcut.zzbn.zzc(r15, r4);
        goto L_0x06ac;
    L_0x0721:
        r4 = r12 & r18;
        if (r4 == 0) goto L_0x06ad;
    L_0x0725:
        r4 = r2.getObject(r1, r9);
        r9 = r0.zzad(r3);
        r4 = com.google.android.gms.internal.clearcut.zzeh.zzc(r15, r4, r9);
        goto L_0x06ac;
    L_0x0733:
        r4 = r12 & r18;
        if (r4 == 0) goto L_0x06ad;
    L_0x0737:
        r4 = r2.getObject(r1, r9);
        r9 = r4 instanceof com.google.android.gms.internal.clearcut.zzbb;
        if (r9 == 0) goto L_0x0740;
    L_0x073f:
        goto L_0x071a;
    L_0x0740:
        r4 = (java.lang.String) r4;
        r4 = com.google.android.gms.internal.clearcut.zzbn.zzb(r15, r4);
        goto L_0x06ac;
    L_0x0748:
        r4 = r12 & r18;
        if (r4 == 0) goto L_0x06ad;
    L_0x074c:
        r4 = com.google.android.gms.internal.clearcut.zzbn.zzc(r15, r7);
        goto L_0x06ac;
    L_0x0752:
        r4 = r12 & r18;
        if (r4 == 0) goto L_0x06ad;
    L_0x0756:
        r4 = 0;
        r9 = com.google.android.gms.internal.clearcut.zzbn.zzj(r15, r4);
        r5 = r5 + r9;
        goto L_0x06ae;
    L_0x075e:
        r4 = 0;
        r9 = r12 & r18;
        if (r9 == 0) goto L_0x076a;
    L_0x0763:
        r13 = 0;
        r9 = com.google.android.gms.internal.clearcut.zzbn.zzg(r15, r13);
        goto L_0x079c;
    L_0x076a:
        r13 = 0;
        goto L_0x079d;
    L_0x076d:
        r4 = 0;
        r13 = 0;
        r11 = r12 & r18;
        if (r11 == 0) goto L_0x079d;
    L_0x0774:
        r9 = r2.getInt(r1, r9);
        r9 = com.google.android.gms.internal.clearcut.zzbn.zzg(r15, r9);
        goto L_0x079c;
    L_0x077d:
        r4 = 0;
        r13 = 0;
        r11 = r12 & r18;
        if (r11 == 0) goto L_0x079d;
    L_0x0784:
        r9 = r2.getLong(r1, r9);
        r9 = com.google.android.gms.internal.clearcut.zzbn.zze(r15, r9);
        goto L_0x079c;
    L_0x078d:
        r4 = 0;
        r13 = 0;
        r11 = r12 & r18;
        if (r11 == 0) goto L_0x079d;
    L_0x0794:
        r9 = r2.getLong(r1, r9);
        r9 = com.google.android.gms.internal.clearcut.zzbn.zzd(r15, r9);
    L_0x079c:
        r5 = r5 + r9;
    L_0x079d:
        r9 = 0;
        goto L_0x07ac;
    L_0x079f:
        r4 = 0;
        r13 = 0;
        r9 = r12 & r18;
        if (r9 == 0) goto L_0x079d;
    L_0x07a6:
        r9 = 0;
        r10 = com.google.android.gms.internal.clearcut.zzbn.zzb(r15, r9);
        r5 = r5 + r10;
    L_0x07ac:
        r10 = 0;
        goto L_0x07be;
    L_0x07af:
        r4 = 0;
        r9 = 0;
        r13 = 0;
        r10 = r12 & r18;
        if (r10 == 0) goto L_0x07ac;
    L_0x07b7:
        r10 = 0;
        r15 = com.google.android.gms.internal.clearcut.zzbn.zzb(r15, r10);
        r5 = r5 + r15;
    L_0x07be:
        r3 = r3 + 4;
        r9 = r13;
        r4 = 0;
        r11 = 0;
        goto L_0x03bf;
    L_0x07c5:
        r2 = r0.zzmx;
        r2 = zza(r2, r1);
        r5 = r5 + r2;
        r2 = r0.zzmo;
        if (r2 == 0) goto L_0x07db;
    L_0x07d0:
        r2 = r0.zzmy;
        r1 = r2.zza(r1);
        r1 = r1.zzas();
        r5 = r5 + r1;
    L_0x07db:
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.zzds.zzm(java.lang.Object):int");
    }

    public final boolean zzo(T t) {
        Object obj = t;
        int[] iArr = this.zzms;
        int i = 1;
        if (iArr == null || iArr.length == 0) {
            return true;
        }
        int length = iArr.length;
        int i2 = 0;
        int i3 = -1;
        int i4 = 0;
        while (i2 < length) {
            int i5;
            int i6;
            int i7 = iArr[i2];
            int zzai = zzai(i7);
            int zzag = zzag(zzai);
            if (this.zzmq) {
                i5 = i2;
                i6 = 0;
            } else {
                i6 = this.zzmi[zzai + 2];
                int i8 = i6 & 1048575;
                i6 = i << (i6 >>> 20);
                if (i8 != i3) {
                    i5 = i2;
                    i4 = zzmh.getInt(obj, (long) i8);
                    i3 = i8;
                } else {
                    i5 = i2;
                }
            }
            if (((268435456 & zzag) != 0 ? 1 : null) != null && !zza(obj, zzai, i4, i6)) {
                return false;
            }
            i = (267386880 & zzag) >>> 20;
            if (i != 9 && i != 17) {
                zzef zzef;
                Object obj2;
                if (i != 27) {
                    if (i == 60 || i == 68) {
                        if (zza(obj, i7, zzai) && !zza(obj, zzag, zzad(zzai))) {
                            return false;
                        }
                    } else if (i != 49) {
                        if (i != 50) {
                            continue;
                        } else {
                            Map zzh = this.zzmz.zzh(zzfd.zzo(obj, (long) (zzag & 1048575)));
                            if (!zzh.isEmpty()) {
                                if (this.zzmz.zzl(zzae(zzai)).zzmd.zzek() == zzfq.MESSAGE) {
                                    zzef = null;
                                    for (Object next : zzh.values()) {
                                        if (zzef == null) {
                                            zzef = zzea.zzcm().zze(next.getClass());
                                        }
                                        if (!zzef.zzo(next)) {
                                            obj2 = null;
                                            break;
                                        }
                                    }
                                }
                            }
                            obj2 = 1;
                            if (obj2 == null) {
                                return false;
                            }
                        }
                    }
                }
                List list = (List) zzfd.zzo(obj, (long) (zzag & 1048575));
                if (!list.isEmpty()) {
                    zzef = zzad(zzai);
                    for (i7 = 0; i7 < list.size(); i7++) {
                        if (!zzef.zzo(list.get(i7))) {
                            obj2 = null;
                            break;
                        }
                    }
                }
                obj2 = 1;
                if (obj2 == null) {
                    return false;
                }
            } else if (zza(obj, zzai, i4, i6) && !zza(obj, zzag, zzad(zzai))) {
                return false;
            }
            i2 = i5 + 1;
            i = 1;
        }
        return !this.zzmo || this.zzmy.zza(obj).isInitialized();
    }
}
