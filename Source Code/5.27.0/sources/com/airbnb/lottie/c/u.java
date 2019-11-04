package com.airbnb.lottie.c;

/* compiled from: MaskParser */
class u {
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0071  */
    static com.airbnb.lottie.model.content.Mask r(android.util.JsonReader r12, com.airbnb.lottie.e r13) {
        /*
        r12.beginObject();
        r0 = 0;
        r1 = 0;
        r2 = r1;
        r3 = r2;
        r4 = 0;
    L_0x0008:
        r5 = r12.hasNext();
        if (r5 == 0) goto L_0x00d7;
    L_0x000e:
        r5 = r12.nextName();
        r6 = r5.hashCode();
        r7 = 111; // 0x6f float:1.56E-43 double:5.5E-322;
        r8 = 3;
        r9 = -1;
        r10 = 2;
        r11 = 1;
        if (r6 == r7) goto L_0x004b;
    L_0x001e:
        r7 = 3588; // 0xe04 float:5.028E-42 double:1.7727E-320;
        if (r6 == r7) goto L_0x0041;
    L_0x0022:
        r7 = 104433; // 0x197f1 float:1.46342E-40 double:5.1597E-319;
        if (r6 == r7) goto L_0x0037;
    L_0x0027:
        r7 = 3357091; // 0x3339a3 float:4.704286E-39 double:1.6586233E-317;
        if (r6 == r7) goto L_0x002d;
    L_0x002c:
        goto L_0x0055;
    L_0x002d:
        r6 = "mode";
        r6 = r5.equals(r6);
        if (r6 == 0) goto L_0x0055;
    L_0x0035:
        r6 = 0;
        goto L_0x0056;
    L_0x0037:
        r6 = "inv";
        r6 = r5.equals(r6);
        if (r6 == 0) goto L_0x0055;
    L_0x003f:
        r6 = 3;
        goto L_0x0056;
    L_0x0041:
        r6 = "pt";
        r6 = r5.equals(r6);
        if (r6 == 0) goto L_0x0055;
    L_0x0049:
        r6 = 1;
        goto L_0x0056;
    L_0x004b:
        r6 = "o";
        r6 = r5.equals(r6);
        if (r6 == 0) goto L_0x0055;
    L_0x0053:
        r6 = 2;
        goto L_0x0056;
    L_0x0055:
        r6 = -1;
    L_0x0056:
        if (r6 == 0) goto L_0x0071;
    L_0x0058:
        if (r6 == r11) goto L_0x006c;
    L_0x005a:
        if (r6 == r10) goto L_0x0067;
    L_0x005c:
        if (r6 == r8) goto L_0x0062;
    L_0x005e:
        r12.skipValue();
        goto L_0x0008;
    L_0x0062:
        r4 = r12.nextBoolean();
        goto L_0x0008;
    L_0x0067:
        r3 = com.airbnb.lottie.c.d.g(r12, r13);
        goto L_0x0008;
    L_0x006c:
        r2 = com.airbnb.lottie.c.d.j(r12, r13);
        goto L_0x0008;
    L_0x0071:
        r1 = r12.nextString();
        r6 = r1.hashCode();
        r7 = 97;
        if (r6 == r7) goto L_0x009a;
    L_0x007d:
        r7 = 105; // 0x69 float:1.47E-43 double:5.2E-322;
        if (r6 == r7) goto L_0x0090;
    L_0x0081:
        r7 = 115; // 0x73 float:1.61E-43 double:5.7E-322;
        if (r6 == r7) goto L_0x0086;
    L_0x0085:
        goto L_0x00a3;
    L_0x0086:
        r6 = "s";
        r1 = r1.equals(r6);
        if (r1 == 0) goto L_0x00a3;
    L_0x008e:
        r9 = 1;
        goto L_0x00a3;
    L_0x0090:
        r6 = "i";
        r1 = r1.equals(r6);
        if (r1 == 0) goto L_0x00a3;
    L_0x0098:
        r9 = 2;
        goto L_0x00a3;
    L_0x009a:
        r6 = "a";
        r1 = r1.equals(r6);
        if (r1 == 0) goto L_0x00a3;
    L_0x00a2:
        r9 = 0;
    L_0x00a3:
        if (r9 == 0) goto L_0x00d3;
    L_0x00a5:
        if (r9 == r11) goto L_0x00cf;
    L_0x00a7:
        if (r9 == r10) goto L_0x00c6;
    L_0x00a9:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r6 = "Unknown mask mode ";
        r1.append(r6);
        r1.append(r5);
        r5 = ". Defaulting to Add.";
        r1.append(r5);
        r1 = r1.toString();
        com.airbnb.lottie.d.d.warning(r1);
        r1 = com.airbnb.lottie.model.content.Mask.MaskMode.MASK_MODE_ADD;
        goto L_0x0008;
    L_0x00c6:
        r1 = "Animation contains intersect masks. They are not supported but will be treated like add masks.";
        r13.l(r1);
        r1 = com.airbnb.lottie.model.content.Mask.MaskMode.MASK_MODE_INTERSECT;
        goto L_0x0008;
    L_0x00cf:
        r1 = com.airbnb.lottie.model.content.Mask.MaskMode.MASK_MODE_SUBTRACT;
        goto L_0x0008;
    L_0x00d3:
        r1 = com.airbnb.lottie.model.content.Mask.MaskMode.MASK_MODE_ADD;
        goto L_0x0008;
    L_0x00d7:
        r12.endObject();
        r12 = new com.airbnb.lottie.model.content.Mask;
        r12.<init>(r1, r2, r3, r4);
        return r12;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.c.u.r(android.util.JsonReader, com.airbnb.lottie.e):com.airbnb.lottie.model.content.Mask");
    }
}
