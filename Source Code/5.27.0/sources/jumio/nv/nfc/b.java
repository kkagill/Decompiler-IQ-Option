package jumio.nv.nfc;

/* compiled from: DefaultLDSProvider */
public class b implements d {
    /* JADX WARNING: Removed duplicated region for block: B:13:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0072  */
    public jumio.nv.nfc.o a(org.jmrtd.d r17, java.util.Collection<java.lang.Integer> r18, boolean r19) {
        /*
        r16 = this;
        r1 = r17;
        r2 = r18;
        r3 = ": ";
        r4 = new jumio.nv.nfc.o;
        r0 = jumio.nv.nfc.p.READ_LDS;
        r5 = jumio.nv.nfc.q.SUCCESSFUL;
        r4.<init>(r0, r5);
        r5 = "DefaultLDSProvider";
        r0 = "setting up LDS";
        jumio.nv.nfc.f.a(r5, r0);
        r6 = new jumio.nv.nfc.c;
        r6.<init>();
        r4.a(r6);
        r0 = 286; // 0x11e float:4.01E-43 double:1.413E-321;
        r7 = 1;
        r8 = 0;
        r9 = r1.e(r0);	 Catch:{ IOException -> 0x005c, IOException | CardServiceException -> 0x005a }
        r10 = r9.getLength();	 Catch:{ IOException -> 0x005c, IOException | CardServiceException -> 0x005a }
        r6.a(r0, r9, r10);	 Catch:{ IOException -> 0x005c, IOException | CardServiceException -> 0x005a }
        r6.a();	 Catch:{ IOException -> 0x005c, IOException | CardServiceException -> 0x005a }
        r0 = 285; // 0x11d float:4.0E-43 double:1.41E-321;
        r0 = r1.e(r0);	 Catch:{ IOException -> 0x005c, IOException | CardServiceException -> 0x005a }
        r9 = new org.jmrtd.lds.SODFile;	 Catch:{ IOException -> 0x005c, IOException | CardServiceException -> 0x005a }
        r9.<init>(r0);	 Catch:{ IOException -> 0x005c, IOException | CardServiceException -> 0x005a }
        r6.a(r9);	 Catch:{ IOException -> 0x0058, IOException | CardServiceException -> 0x0056 }
        r0 = 257; // 0x101 float:3.6E-43 double:1.27E-321;
        r8 = r1.e(r0);	 Catch:{ IOException -> 0x0058, IOException | CardServiceException -> 0x0056 }
        r10 = r8.getLength();	 Catch:{ IOException -> 0x0058, IOException | CardServiceException -> 0x0056 }
        r6.a(r0, r8, r10);	 Catch:{ IOException -> 0x0058, IOException | CardServiceException -> 0x0056 }
        r6.c();	 Catch:{ IOException -> 0x0058, IOException | CardServiceException -> 0x0056 }
        r0 = java.lang.Integer.valueOf(r7);	 Catch:{ IOException -> 0x0058, IOException | CardServiceException -> 0x0056 }
        r2.add(r0);	 Catch:{ IOException -> 0x0058, IOException | CardServiceException -> 0x0056 }
        goto L_0x006b;
    L_0x0056:
        r0 = move-exception;
        goto L_0x005e;
    L_0x0058:
        r0 = move-exception;
        goto L_0x005e;
    L_0x005a:
        r0 = move-exception;
        goto L_0x005d;
    L_0x005c:
        r0 = move-exception;
    L_0x005d:
        r9 = r8;
    L_0x005e:
        com.jumio.commons.log.Log.printStackTrace(r0);
        r8 = "Could not read file";
        jumio.nv.nfc.f.a(r5, r8, r0);
        r8 = jumio.nv.nfc.q.ERROR;
        r4.a(r8, r0);
    L_0x006b:
        r0 = new java.util.ArrayList;
        r0.<init>();
        if (r9 != 0) goto L_0x007f;
    L_0x0072:
        r0 = jumio.nv.nfc.q.ERROR;
        r1 = new java.lang.Throwable;
        r2 = "SOD file could not be read";
        r1.<init>(r2);
        r4.a(r0, r1);
        return r4;
    L_0x007f:
        r8 = r9.bRs();
        r8 = r8.keySet();
        r0.addAll(r8);
        java.util.Collections.sort(r0);
        r8 = new java.lang.StringBuilder;
        r8.<init>();
        r9 = "prefetching DGs: ";
        r8.append(r9);
        r8.append(r0);
        r8 = r8.toString();
        jumio.nv.nfc.f.a(r5, r8);
        r8 = new java.util.ArrayList;
        r8.<init>();
        r9 = 5;
        r9 = new java.lang.Integer[r9];
        r10 = 8;
        r10 = java.lang.Integer.valueOf(r10);
        r11 = 0;
        r9[r11] = r10;
        r10 = 9;
        r10 = java.lang.Integer.valueOf(r10);
        r9[r7] = r10;
        r10 = 10;
        r10 = java.lang.Integer.valueOf(r10);
        r12 = 2;
        r9[r12] = r10;
        r10 = 13;
        r10 = java.lang.Integer.valueOf(r10);
        r13 = 3;
        r9[r13] = r10;
        r10 = 16;
        r10 = java.lang.Integer.valueOf(r10);
        r14 = 4;
        r9[r14] = r10;
        java.util.Collections.addAll(r8, r9);
        r9 = r0.iterator();
    L_0x00dc:
        r0 = r9.hasNext();
        if (r0 == 0) goto L_0x01be;
    L_0x00e2:
        r0 = r9.next();
        r0 = (java.lang.Integer) r0;
        r10 = r0.intValue();
        r0 = java.lang.Integer.valueOf(r10);
        r0 = r8.contains(r0);
        if (r0 == 0) goto L_0x0108;
    L_0x00f6:
        r0 = new java.lang.Object[r7];
        r10 = java.lang.Integer.valueOf(r10);
        r0[r11] = r10;
        r10 = "DG%d is not valid - skipping!";
        r0 = java.lang.String.format(r10, r0);
        jumio.nv.nfc.f.b(r5, r0);
        goto L_0x00dc;
    L_0x0108:
        r0 = java.lang.Integer.valueOf(r10);
        r0 = r2.contains(r0);
        if (r0 == 0) goto L_0x0113;
    L_0x0112:
        goto L_0x00dc;
    L_0x0113:
        if (r19 != 0) goto L_0x0118;
    L_0x0115:
        if (r10 != r12) goto L_0x0118;
    L_0x0117:
        goto L_0x00dc;
    L_0x0118:
        if (r10 == r13) goto L_0x00dc;
    L_0x011a:
        if (r10 != r14) goto L_0x011d;
    L_0x011c:
        goto L_0x00dc;
    L_0x011d:
        r0 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0156, CardServiceException -> 0x0154, NumberFormatException -> 0x0152 }
        r0.<init>();	 Catch:{ IOException -> 0x0156, CardServiceException -> 0x0154, NumberFormatException -> 0x0152 }
        r15 = "reading DG";
        r0.append(r15);	 Catch:{ IOException -> 0x0156, CardServiceException -> 0x0154, NumberFormatException -> 0x0152 }
        r0.append(r10);	 Catch:{ IOException -> 0x0156, CardServiceException -> 0x0154, NumberFormatException -> 0x0152 }
        r0 = r0.toString();	 Catch:{ IOException -> 0x0156, CardServiceException -> 0x0154, NumberFormatException -> 0x0152 }
        jumio.nv.nfc.f.a(r5, r0);	 Catch:{ IOException -> 0x0156, CardServiceException -> 0x0154, NumberFormatException -> 0x0152 }
        r0 = org.jmrtd.lds.a.mX(r10);	 Catch:{ IOException -> 0x0156, CardServiceException -> 0x0154, NumberFormatException -> 0x0152 }
        r15 = r1.e(r0);	 Catch:{ IOException -> 0x0156, CardServiceException -> 0x0154, NumberFormatException -> 0x0152 }
        r7 = r15.getLength();	 Catch:{ IOException -> 0x0156, CardServiceException -> 0x0154, NumberFormatException -> 0x0152 }
        r6.a(r0, r15, r7);	 Catch:{ IOException -> 0x0156, CardServiceException -> 0x0154, NumberFormatException -> 0x0152 }
        r0 = r6.b(r0);	 Catch:{ IOException -> 0x0156, CardServiceException -> 0x0154, NumberFormatException -> 0x0152 }
        r0.getEncoded();	 Catch:{ IOException -> 0x0156, CardServiceException -> 0x0154, NumberFormatException -> 0x0152 }
        r15.close();	 Catch:{ IOException -> 0x0156, CardServiceException -> 0x0154, NumberFormatException -> 0x0152 }
        r0 = java.lang.Integer.valueOf(r10);	 Catch:{ IOException -> 0x0156, CardServiceException -> 0x0154, NumberFormatException -> 0x0152 }
        r2.add(r0);	 Catch:{ IOException -> 0x0156, CardServiceException -> 0x0154, NumberFormatException -> 0x0152 }
        goto L_0x0198;
    L_0x0152:
        r0 = move-exception;
        goto L_0x0158;
    L_0x0154:
        r0 = move-exception;
        goto L_0x0175;
    L_0x0156:
        r0 = move-exception;
        goto L_0x019b;
    L_0x0158:
        r7 = new java.lang.StringBuilder;
        r7.<init>();
        r15 = "NumberFormatException trying to get FID for DG";
        r7.append(r15);
        r7.append(r10);
        r7 = r7.toString();
        jumio.nv.nfc.f.c(r5, r7);
        com.jumio.commons.log.Log.printStackTrace(r0);
        r7 = jumio.nv.nfc.q.ERROR;
        r4.a(r7, r0);
        goto L_0x0198;
    L_0x0175:
        r7 = new java.lang.StringBuilder;
        r7.<init>();
        r15 = "Could not read DG";
        r7.append(r15);
        r7.append(r10);
        r7.append(r3);
        r10 = r0.getMessage();
        r7.append(r10);
        r7 = r7.toString();
        jumio.nv.nfc.f.c(r5, r7);
        r7 = jumio.nv.nfc.q.ERROR;
        r4.a(r7, r0);
    L_0x0198:
        r7 = 1;
        goto L_0x00dc;
    L_0x019b:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Error reading DG";
        r1.append(r2);
        r1.append(r10);
        r1.append(r3);
        r2 = r0.getMessage();
        r1.append(r2);
        r1 = r1.toString();
        jumio.nv.nfc.f.c(r5, r1);
        r1 = jumio.nv.nfc.q.ERROR;
        r4.a(r1, r0);
    L_0x01be:
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: jumio.nv.nfc.b.a(org.jmrtd.d, java.util.Collection, boolean):jumio.nv.nfc.o");
    }
}
