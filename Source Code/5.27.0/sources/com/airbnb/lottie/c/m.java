package com.airbnb.lottie.c;

/* compiled from: GradientFillParser */
class m {
    /* JADX WARNING: Removed duplicated region for block: B:73:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0091  */
    static com.airbnb.lottie.model.content.d o(android.util.JsonReader r15, com.airbnb.lottie.e r16) {
        /*
        r0 = android.graphics.Path.FillType.WINDING;
        r1 = 0;
        r2 = 0;
        r6 = r0;
        r4 = r2;
        r5 = r4;
        r7 = r5;
        r8 = r7;
        r9 = r8;
        r10 = r9;
        r13 = 0;
    L_0x000c:
        r0 = r15.hasNext();
        if (r0 == 0) goto L_0x0138;
    L_0x0012:
        r0 = r15.nextName();
        r2 = r0.hashCode();
        r3 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
        r11 = -1;
        r12 = 1;
        if (r2 == r3) goto L_0x007b;
    L_0x0020:
        r3 = 103; // 0x67 float:1.44E-43 double:5.1E-322;
        if (r2 == r3) goto L_0x0071;
    L_0x0024:
        r3 = 111; // 0x6f float:1.56E-43 double:5.5E-322;
        if (r2 == r3) goto L_0x0067;
    L_0x0028:
        r3 = 3324; // 0xcfc float:4.658E-42 double:1.6423E-320;
        if (r2 == r3) goto L_0x005d;
    L_0x002c:
        r3 = 3519; // 0xdbf float:4.931E-42 double:1.7386E-320;
        if (r2 == r3) goto L_0x0053;
    L_0x0030:
        switch(r2) {
            case 114: goto L_0x0049;
            case 115: goto L_0x003f;
            case 116: goto L_0x0034;
            default: goto L_0x0033;
        };
    L_0x0033:
        goto L_0x0085;
    L_0x0034:
        r2 = "t";
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x0085;
    L_0x003d:
        r0 = 3;
        goto L_0x0086;
    L_0x003f:
        r2 = "s";
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x0085;
    L_0x0047:
        r0 = 4;
        goto L_0x0086;
    L_0x0049:
        r2 = "r";
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x0085;
    L_0x0051:
        r0 = 6;
        goto L_0x0086;
    L_0x0053:
        r2 = "nm";
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x0085;
    L_0x005b:
        r0 = 0;
        goto L_0x0086;
    L_0x005d:
        r2 = "hd";
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x0085;
    L_0x0065:
        r0 = 7;
        goto L_0x0086;
    L_0x0067:
        r2 = "o";
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x0085;
    L_0x006f:
        r0 = 2;
        goto L_0x0086;
    L_0x0071:
        r2 = "g";
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x0085;
    L_0x0079:
        r0 = 1;
        goto L_0x0086;
    L_0x007b:
        r2 = "e";
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x0085;
    L_0x0083:
        r0 = 5;
        goto L_0x0086;
    L_0x0085:
        r0 = -1;
    L_0x0086:
        switch(r0) {
            case 0: goto L_0x012e;
            case 1: goto L_0x00db;
            case 2: goto L_0x00d1;
            case 3: goto L_0x00c0;
            case 4: goto L_0x00b6;
            case 5: goto L_0x00ac;
            case 6: goto L_0x009b;
            case 7: goto L_0x0091;
            default: goto L_0x0089;
        };
    L_0x0089:
        r2 = r15;
        r3 = r16;
        r15.skipValue();
        goto L_0x000c;
    L_0x0091:
        r0 = r15.nextBoolean();
        r2 = r15;
        r3 = r16;
        r13 = r0;
        goto L_0x000c;
    L_0x009b:
        r0 = r15.nextInt();
        if (r0 != r12) goto L_0x00a4;
    L_0x00a1:
        r0 = android.graphics.Path.FillType.WINDING;
        goto L_0x00a6;
    L_0x00a4:
        r0 = android.graphics.Path.FillType.EVEN_ODD;
    L_0x00a6:
        r2 = r15;
        r3 = r16;
        r6 = r0;
        goto L_0x000c;
    L_0x00ac:
        r0 = com.airbnb.lottie.c.d.h(r15, r16);
        r2 = r15;
        r3 = r16;
        r10 = r0;
        goto L_0x000c;
    L_0x00b6:
        r0 = com.airbnb.lottie.c.d.h(r15, r16);
        r2 = r15;
        r3 = r16;
        r9 = r0;
        goto L_0x000c;
    L_0x00c0:
        r0 = r15.nextInt();
        if (r0 != r12) goto L_0x00c9;
    L_0x00c6:
        r0 = com.airbnb.lottie.model.content.GradientType.LINEAR;
        goto L_0x00cb;
    L_0x00c9:
        r0 = com.airbnb.lottie.model.content.GradientType.RADIAL;
    L_0x00cb:
        r2 = r15;
        r3 = r16;
        r5 = r0;
        goto L_0x000c;
    L_0x00d1:
        r0 = com.airbnb.lottie.c.d.g(r15, r16);
        r2 = r15;
        r3 = r16;
        r8 = r0;
        goto L_0x000c;
    L_0x00db:
        r15.beginObject();
        r0 = -1;
    L_0x00df:
        r2 = r15.hasNext();
        if (r2 == 0) goto L_0x0126;
    L_0x00e5:
        r2 = r15.nextName();
        r3 = r2.hashCode();
        r14 = 107; // 0x6b float:1.5E-43 double:5.3E-322;
        if (r3 == r14) goto L_0x0100;
    L_0x00f1:
        r14 = 112; // 0x70 float:1.57E-43 double:5.53E-322;
        if (r3 == r14) goto L_0x00f6;
    L_0x00f5:
        goto L_0x010a;
    L_0x00f6:
        r3 = "p";
        r2 = r2.equals(r3);
        if (r2 == 0) goto L_0x010a;
    L_0x00fe:
        r2 = 0;
        goto L_0x010b;
    L_0x0100:
        r3 = "k";
        r2 = r2.equals(r3);
        if (r2 == 0) goto L_0x010a;
    L_0x0108:
        r2 = 1;
        goto L_0x010b;
    L_0x010a:
        r2 = -1;
    L_0x010b:
        if (r2 == 0) goto L_0x011e;
    L_0x010d:
        if (r2 == r12) goto L_0x0116;
    L_0x010f:
        r15.skipValue();
        r2 = r15;
        r3 = r16;
        goto L_0x00df;
    L_0x0116:
        r2 = r15;
        r3 = r16;
        r7 = com.airbnb.lottie.c.d.a(r15, r3, r0);
        goto L_0x00df;
    L_0x011e:
        r2 = r15;
        r3 = r16;
        r0 = r15.nextInt();
        goto L_0x00df;
    L_0x0126:
        r2 = r15;
        r3 = r16;
        r15.endObject();
        goto L_0x000c;
    L_0x012e:
        r2 = r15;
        r3 = r16;
        r0 = r15.nextString();
        r4 = r0;
        goto L_0x000c;
    L_0x0138:
        r0 = new com.airbnb.lottie.model.content.d;
        r11 = 0;
        r12 = 0;
        r3 = r0;
        r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.c.m.o(android.util.JsonReader, com.airbnb.lottie.e):com.airbnb.lottie.model.content.d");
    }
}
