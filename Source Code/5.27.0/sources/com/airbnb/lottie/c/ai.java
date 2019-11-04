package com.airbnb.lottie.c;

/* compiled from: ShapeTrimPathParser */
class ai {
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00ab  */
    static com.airbnb.lottie.model.content.ShapeTrimPath A(android.util.JsonReader r16, com.airbnb.lottie.e r17) {
        /*
        r0 = r16;
        r1 = r17;
        r3 = 0;
        r5 = r3;
        r6 = r5;
        r7 = r6;
        r8 = r7;
        r9 = r8;
        r10 = 0;
    L_0x000b:
        r3 = r16.hasNext();
        if (r3 == 0) goto L_0x00b3;
    L_0x0011:
        r3 = r16.nextName();
        r11 = r3.hashCode();
        r12 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
        r13 = 5;
        r14 = 4;
        r15 = 3;
        r4 = 2;
        r2 = 1;
        if (r11 == r12) goto L_0x0069;
    L_0x0022:
        r12 = 109; // 0x6d float:1.53E-43 double:5.4E-322;
        if (r11 == r12) goto L_0x005f;
    L_0x0026:
        r12 = 111; // 0x6f float:1.56E-43 double:5.5E-322;
        if (r11 == r12) goto L_0x0055;
    L_0x002a:
        r12 = 115; // 0x73 float:1.61E-43 double:5.7E-322;
        if (r11 == r12) goto L_0x004b;
    L_0x002e:
        r12 = 3324; // 0xcfc float:4.658E-42 double:1.6423E-320;
        if (r11 == r12) goto L_0x0041;
    L_0x0032:
        r12 = 3519; // 0xdbf float:4.931E-42 double:1.7386E-320;
        if (r11 == r12) goto L_0x0037;
    L_0x0036:
        goto L_0x0073;
    L_0x0037:
        r11 = "nm";
        r3 = r3.equals(r11);
        if (r3 == 0) goto L_0x0073;
    L_0x003f:
        r3 = 3;
        goto L_0x0074;
    L_0x0041:
        r11 = "hd";
        r3 = r3.equals(r11);
        if (r3 == 0) goto L_0x0073;
    L_0x0049:
        r3 = 5;
        goto L_0x0074;
    L_0x004b:
        r11 = "s";
        r3 = r3.equals(r11);
        if (r3 == 0) goto L_0x0073;
    L_0x0053:
        r3 = 0;
        goto L_0x0074;
    L_0x0055:
        r11 = "o";
        r3 = r3.equals(r11);
        if (r3 == 0) goto L_0x0073;
    L_0x005d:
        r3 = 2;
        goto L_0x0074;
    L_0x005f:
        r11 = "m";
        r3 = r3.equals(r11);
        if (r3 == 0) goto L_0x0073;
    L_0x0067:
        r3 = 4;
        goto L_0x0074;
    L_0x0069:
        r11 = "e";
        r3 = r3.equals(r11);
        if (r3 == 0) goto L_0x0073;
    L_0x0071:
        r3 = 1;
        goto L_0x0074;
    L_0x0073:
        r3 = -1;
    L_0x0074:
        if (r3 == 0) goto L_0x00ab;
    L_0x0076:
        if (r3 == r2) goto L_0x00a3;
    L_0x0078:
        if (r3 == r4) goto L_0x009b;
    L_0x007a:
        if (r3 == r15) goto L_0x0095;
    L_0x007c:
        if (r3 == r14) goto L_0x008b;
    L_0x007e:
        if (r3 == r13) goto L_0x0085;
    L_0x0080:
        r16.skipValue();
    L_0x0083:
        r2 = 0;
        goto L_0x000b;
    L_0x0085:
        r2 = r16.nextBoolean();
        r10 = r2;
        goto L_0x0083;
    L_0x008b:
        r2 = r16.nextInt();
        r2 = com.airbnb.lottie.model.content.ShapeTrimPath.Type.forId(r2);
        r6 = r2;
        goto L_0x0083;
    L_0x0095:
        r2 = r16.nextString();
        r5 = r2;
        goto L_0x0083;
    L_0x009b:
        r2 = 0;
        r3 = com.airbnb.lottie.c.d.a(r0, r1, r2);
        r9 = r3;
        goto L_0x000b;
    L_0x00a3:
        r2 = 0;
        r3 = com.airbnb.lottie.c.d.a(r0, r1, r2);
        r8 = r3;
        goto L_0x000b;
    L_0x00ab:
        r2 = 0;
        r3 = com.airbnb.lottie.c.d.a(r0, r1, r2);
        r7 = r3;
        goto L_0x000b;
    L_0x00b3:
        r0 = new com.airbnb.lottie.model.content.ShapeTrimPath;
        r4 = r0;
        r4.<init>(r5, r6, r7, r8, r9, r10);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.c.ai.A(android.util.JsonReader, com.airbnb.lottie.e):com.airbnb.lottie.model.content.ShapeTrimPath");
    }
}
