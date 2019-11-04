package com.airbnb.lottie.c;

/* compiled from: ContentModelParser */
class g {
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0043 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0043 A:{SYNTHETIC} */
    /* JADX WARNING: Missing block: B:49:0x00b5, code skipped:
            if (r2.equals("gs") != false) goto L_0x00e1;
     */
    @androidx.annotation.Nullable
    static com.airbnb.lottie.model.content.b m(android.util.JsonReader r9, com.airbnb.lottie.e r10) {
        /*
        r9.beginObject();
        r0 = 2;
        r1 = 2;
    L_0x0005:
        r2 = r9.hasNext();
        r3 = 0;
        r4 = -1;
        r5 = 1;
        r6 = 0;
        if (r2 == 0) goto L_0x0048;
    L_0x000f:
        r2 = r9.nextName();
        r7 = r2.hashCode();
        r8 = 100;
        if (r7 == r8) goto L_0x002b;
    L_0x001b:
        r8 = 3717; // 0xe85 float:5.209E-42 double:1.8364E-320;
        if (r7 == r8) goto L_0x0020;
    L_0x001f:
        goto L_0x0035;
    L_0x0020:
        r7 = "ty";
        r2 = r2.equals(r7);
        if (r2 == 0) goto L_0x0035;
    L_0x0029:
        r2 = 0;
        goto L_0x0036;
    L_0x002b:
        r7 = "d";
        r2 = r2.equals(r7);
        if (r2 == 0) goto L_0x0035;
    L_0x0033:
        r2 = 1;
        goto L_0x0036;
    L_0x0035:
        r2 = -1;
    L_0x0036:
        if (r2 == 0) goto L_0x0043;
    L_0x0038:
        if (r2 == r5) goto L_0x003e;
    L_0x003a:
        r9.skipValue();
        goto L_0x0005;
    L_0x003e:
        r1 = r9.nextInt();
        goto L_0x0005;
    L_0x0043:
        r2 = r9.nextString();
        goto L_0x0049;
    L_0x0048:
        r2 = r6;
    L_0x0049:
        if (r2 != 0) goto L_0x004c;
    L_0x004b:
        return r6;
    L_0x004c:
        r7 = r2.hashCode();
        switch(r7) {
            case 3239: goto L_0x00d6;
            case 3270: goto L_0x00cc;
            case 3295: goto L_0x00c2;
            case 3307: goto L_0x00b8;
            case 3308: goto L_0x00af;
            case 3488: goto L_0x00a4;
            case 3633: goto L_0x0099;
            case 3646: goto L_0x008e;
            case 3669: goto L_0x0084;
            case 3679: goto L_0x0079;
            case 3681: goto L_0x006e;
            case 3705: goto L_0x0061;
            case 3710: goto L_0x0055;
            default: goto L_0x0053;
        };
    L_0x0053:
        goto L_0x00e0;
    L_0x0055:
        r0 = "tr";
        r0 = r2.equals(r0);
        if (r0 == 0) goto L_0x00e0;
    L_0x005e:
        r0 = 5;
        goto L_0x00e1;
    L_0x0061:
        r0 = "tm";
        r0 = r2.equals(r0);
        if (r0 == 0) goto L_0x00e0;
    L_0x006a:
        r0 = 9;
        goto L_0x00e1;
    L_0x006e:
        r0 = "st";
        r0 = r2.equals(r0);
        if (r0 == 0) goto L_0x00e0;
    L_0x0076:
        r0 = 1;
        goto L_0x00e1;
    L_0x0079:
        r0 = "sr";
        r0 = r2.equals(r0);
        if (r0 == 0) goto L_0x00e0;
    L_0x0081:
        r0 = 10;
        goto L_0x00e1;
    L_0x0084:
        r0 = "sh";
        r0 = r2.equals(r0);
        if (r0 == 0) goto L_0x00e0;
    L_0x008c:
        r0 = 6;
        goto L_0x00e1;
    L_0x008e:
        r0 = "rp";
        r0 = r2.equals(r0);
        if (r0 == 0) goto L_0x00e0;
    L_0x0096:
        r0 = 12;
        goto L_0x00e1;
    L_0x0099:
        r0 = "rc";
        r0 = r2.equals(r0);
        if (r0 == 0) goto L_0x00e0;
    L_0x00a1:
        r0 = 8;
        goto L_0x00e1;
    L_0x00a4:
        r0 = "mm";
        r0 = r2.equals(r0);
        if (r0 == 0) goto L_0x00e0;
    L_0x00ac:
        r0 = 11;
        goto L_0x00e1;
    L_0x00af:
        r3 = "gs";
        r3 = r2.equals(r3);
        if (r3 == 0) goto L_0x00e0;
    L_0x00b7:
        goto L_0x00e1;
    L_0x00b8:
        r0 = "gr";
        r0 = r2.equals(r0);
        if (r0 == 0) goto L_0x00e0;
    L_0x00c0:
        r0 = 0;
        goto L_0x00e1;
    L_0x00c2:
        r0 = "gf";
        r0 = r2.equals(r0);
        if (r0 == 0) goto L_0x00e0;
    L_0x00ca:
        r0 = 4;
        goto L_0x00e1;
    L_0x00cc:
        r0 = "fl";
        r0 = r2.equals(r0);
        if (r0 == 0) goto L_0x00e0;
    L_0x00d4:
        r0 = 3;
        goto L_0x00e1;
    L_0x00d6:
        r0 = "el";
        r0 = r2.equals(r0);
        if (r0 == 0) goto L_0x00e0;
    L_0x00de:
        r0 = 7;
        goto L_0x00e1;
    L_0x00e0:
        r0 = -1;
    L_0x00e1:
        switch(r0) {
            case 0: goto L_0x013a;
            case 1: goto L_0x0135;
            case 2: goto L_0x0130;
            case 3: goto L_0x012b;
            case 4: goto L_0x0126;
            case 5: goto L_0x0121;
            case 6: goto L_0x011c;
            case 7: goto L_0x0117;
            case 8: goto L_0x0112;
            case 9: goto L_0x010d;
            case 10: goto L_0x0108;
            case 11: goto L_0x00fe;
            case 12: goto L_0x00f9;
            default: goto L_0x00e4;
        };
    L_0x00e4:
        r10 = new java.lang.StringBuilder;
        r10.<init>();
        r0 = "Unknown shape type ";
        r10.append(r0);
        r10.append(r2);
        r10 = r10.toString();
        com.airbnb.lottie.d.d.warning(r10);
        goto L_0x013e;
    L_0x00f9:
        r6 = com.airbnb.lottie.c.ab.v(r9, r10);
        goto L_0x013e;
    L_0x00fe:
        r6 = com.airbnb.lottie.c.v.e(r9);
        r0 = "Animation contains merge paths. Merge paths are only supported on KitKat+ and must be manually enabled by calling enableMergePathsForKitKatAndAbove().";
        r10.l(r0);
        goto L_0x013e;
    L_0x0108:
        r6 = com.airbnb.lottie.c.z.t(r9, r10);
        goto L_0x013e;
    L_0x010d:
        r6 = com.airbnb.lottie.c.ai.A(r9, r10);
        goto L_0x013e;
    L_0x0112:
        r6 = com.airbnb.lottie.c.aa.u(r9, r10);
        goto L_0x013e;
    L_0x0117:
        r6 = com.airbnb.lottie.c.e.b(r9, r10, r1);
        goto L_0x013e;
    L_0x011c:
        r6 = com.airbnb.lottie.c.ag.y(r9, r10);
        goto L_0x013e;
    L_0x0121:
        r6 = com.airbnb.lottie.c.c.e(r9, r10);
        goto L_0x013e;
    L_0x0126:
        r6 = com.airbnb.lottie.c.m.o(r9, r10);
        goto L_0x013e;
    L_0x012b:
        r6 = com.airbnb.lottie.c.ae.w(r9, r10);
        goto L_0x013e;
    L_0x0130:
        r6 = com.airbnb.lottie.c.n.p(r9, r10);
        goto L_0x013e;
    L_0x0135:
        r6 = com.airbnb.lottie.c.ah.z(r9, r10);
        goto L_0x013e;
    L_0x013a:
        r6 = com.airbnb.lottie.c.af.x(r9, r10);
    L_0x013e:
        r10 = r9.hasNext();
        if (r10 == 0) goto L_0x0148;
    L_0x0144:
        r9.skipValue();
        goto L_0x013e;
    L_0x0148:
        r9.endObject();
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.c.g.m(android.util.JsonReader, com.airbnb.lottie.e):com.airbnb.lottie.model.content.b");
    }
}
