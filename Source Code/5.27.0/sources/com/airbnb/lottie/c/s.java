package com.airbnb.lottie.c;

import android.graphics.Rect;
import com.airbnb.lottie.e;
import com.airbnb.lottie.model.a.l;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.model.layer.Layer.LayerType;
import com.airbnb.lottie.model.layer.Layer.MatteType;
import java.util.Collections;
import java.util.List;

/* compiled from: LayerParser */
public class s {
    public static Layer e(e eVar) {
        e eVar2 = eVar;
        Rect bounds = eVar.getBounds();
        List emptyList = Collections.emptyList();
        LayerType layerType = LayerType.PRE_COMP;
        List emptyList2 = Collections.emptyList();
        l lVar = r4;
        l lVar2 = new l();
        return new Layer(emptyList, eVar2, "__container", -1, layerType, -1, null, emptyList2, lVar, 0, 0, 0, 0.0f, 0.0f, bounds.width(), bounds.height(), null, null, Collections.emptyList(), MatteType.NONE, null, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:129:0x0287  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0264  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0264  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0287  */
    public static com.airbnb.lottie.model.layer.Layer q(android.util.JsonReader r39, com.airbnb.lottie.e r40) {
        /*
        r7 = r40;
        r0 = com.airbnb.lottie.model.layer.Layer.MatteType.NONE;
        r10 = new java.util.ArrayList;
        r10.<init>();
        r8 = new java.util.ArrayList;
        r8.<init>();
        r39.beginObject();
        r1 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r9 = java.lang.Float.valueOf(r1);
        r2 = 0;
        r11 = 0;
        r12 = java.lang.Float.valueOf(r11);
        r3 = 0;
        r4 = "UNSET";
        r5 = 0;
        r13 = -1;
        r28 = r0;
        r16 = r2;
        r17 = r16;
        r30 = r17;
        r31 = r30;
        r32 = r31;
        r33 = r32;
        r18 = r5;
        r25 = r13;
        r0 = 0;
        r1 = 0;
        r15 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r20 = 0;
        r21 = 0;
        r22 = 0;
        r23 = 0;
        r24 = 0;
        r27 = 0;
        r29 = 0;
        r14 = r33;
        r13 = r4;
    L_0x004b:
        r2 = r39.hasNext();
        if (r2 == 0) goto L_0x034d;
    L_0x0051:
        r2 = r39.nextName();
        r4 = r2.hashCode();
        r5 = "nm";
        r6 = 1;
        switch(r4) {
            case -995424086: goto L_0x015e;
            case -903568142: goto L_0x0153;
            case 104: goto L_0x0148;
            case 116: goto L_0x013c;
            case 119: goto L_0x0130;
            case 3177: goto L_0x0125;
            case 3233: goto L_0x011a;
            case 3324: goto L_0x010f;
            case 3367: goto L_0x0104;
            case 3432: goto L_0x00f8;
            case 3519: goto L_0x00ef;
            case 3553: goto L_0x00e3;
            case 3664: goto L_0x00d8;
            case 3669: goto L_0x00cd;
            case 3679: goto L_0x00c1;
            case 3681: goto L_0x00b5;
            case 3684: goto L_0x00a9;
            case 3705: goto L_0x009c;
            case 3712: goto L_0x008f;
            case 3717: goto L_0x0083;
            case 104415: goto L_0x0078;
            case 108390670: goto L_0x006d;
            case 1441620890: goto L_0x0061;
            default: goto L_0x005f;
        };
    L_0x005f:
        goto L_0x0168;
    L_0x0061:
        r4 = "masksProperties";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0168;
    L_0x0069:
        r2 = 10;
        goto L_0x0169;
    L_0x006d:
        r4 = "refId";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0168;
    L_0x0075:
        r2 = 2;
        goto L_0x0169;
    L_0x0078:
        r4 = "ind";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0168;
    L_0x0080:
        r2 = 1;
        goto L_0x0169;
    L_0x0083:
        r4 = "ty";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0168;
    L_0x008c:
        r2 = 3;
        goto L_0x0169;
    L_0x008f:
        r4 = "tt";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0168;
    L_0x0098:
        r2 = 9;
        goto L_0x0169;
    L_0x009c:
        r4 = "tm";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0168;
    L_0x00a5:
        r2 = 20;
        goto L_0x0169;
    L_0x00a9:
        r4 = "sw";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0168;
    L_0x00b2:
        r2 = 5;
        goto L_0x0169;
    L_0x00b5:
        r4 = "st";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0168;
    L_0x00bd:
        r2 = 15;
        goto L_0x0169;
    L_0x00c1:
        r4 = "sr";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0168;
    L_0x00c9:
        r2 = 14;
        goto L_0x0169;
    L_0x00cd:
        r4 = "sh";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0168;
    L_0x00d5:
        r2 = 6;
        goto L_0x0169;
    L_0x00d8:
        r4 = "sc";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0168;
    L_0x00e0:
        r2 = 7;
        goto L_0x0169;
    L_0x00e3:
        r4 = "op";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0168;
    L_0x00eb:
        r2 = 19;
        goto L_0x0169;
    L_0x00ef:
        r2 = r2.equals(r5);
        if (r2 == 0) goto L_0x0168;
    L_0x00f5:
        r2 = 0;
        goto L_0x0169;
    L_0x00f8:
        r4 = "ks";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0168;
    L_0x0100:
        r2 = 8;
        goto L_0x0169;
    L_0x0104:
        r4 = "ip";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0168;
    L_0x010c:
        r2 = 18;
        goto L_0x0169;
    L_0x010f:
        r4 = "hd";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0168;
    L_0x0117:
        r2 = 22;
        goto L_0x0169;
    L_0x011a:
        r4 = "ef";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0168;
    L_0x0122:
        r2 = 13;
        goto L_0x0169;
    L_0x0125:
        r4 = "cl";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0168;
    L_0x012d:
        r2 = 21;
        goto L_0x0169;
    L_0x0130:
        r4 = "w";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0168;
    L_0x0139:
        r2 = 16;
        goto L_0x0169;
    L_0x013c:
        r4 = "t";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0168;
    L_0x0145:
        r2 = 12;
        goto L_0x0169;
    L_0x0148:
        r4 = "h";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0168;
    L_0x0150:
        r2 = 17;
        goto L_0x0169;
    L_0x0153:
        r4 = "shapes";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0168;
    L_0x015b:
        r2 = 11;
        goto L_0x0169;
    L_0x015e:
        r4 = "parent";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0168;
    L_0x0166:
        r2 = 4;
        goto L_0x0169;
    L_0x0168:
        r2 = -1;
    L_0x0169:
        switch(r2) {
            case 0: goto L_0x0343;
            case 1: goto L_0x0339;
            case 2: goto L_0x0332;
            case 3: goto L_0x031a;
            case 4: goto L_0x0310;
            case 5: goto L_0x02ff;
            case 6: goto L_0x02ee;
            case 7: goto L_0x02e3;
            case 8: goto L_0x02db;
            case 9: goto L_0x02ca;
            case 10: goto L_0x02ab;
            case 11: goto L_0x0291;
            case 12: goto L_0x0231;
            case 13: goto L_0x01d3;
            case 14: goto L_0x01ca;
            case 15: goto L_0x01bf;
            case 16: goto L_0x01ad;
            case 17: goto L_0x019b;
            case 18: goto L_0x0192;
            case 19: goto L_0x0189;
            case 20: goto L_0x0181;
            case 21: goto L_0x0178;
            case 22: goto L_0x0173;
            default: goto L_0x016c;
        };
    L_0x016c:
        r2 = r39;
        r39.skipValue();
        goto L_0x0349;
    L_0x0173:
        r29 = r39.nextBoolean();
        goto L_0x017d;
    L_0x0178:
        r2 = r39.nextString();
        r14 = r2;
    L_0x017d:
        r2 = r39;
        goto L_0x0349;
    L_0x0181:
        r2 = r39;
        r33 = com.airbnb.lottie.c.d.a(r2, r7, r3);
        goto L_0x0349;
    L_0x0189:
        r2 = r39;
        r4 = r39.nextDouble();
        r1 = (float) r4;
        goto L_0x0349;
    L_0x0192:
        r2 = r39;
        r4 = r39.nextDouble();
        r0 = (float) r4;
        goto L_0x0349;
    L_0x019b:
        r2 = r39;
        r4 = r39.nextInt();
        r4 = (float) r4;
        r5 = com.airbnb.lottie.d.h.cP();
        r4 = r4 * r5;
        r4 = (int) r4;
        r24 = r4;
        goto L_0x0349;
    L_0x01ad:
        r2 = r39;
        r4 = r39.nextInt();
        r4 = (float) r4;
        r5 = com.airbnb.lottie.d.h.cP();
        r4 = r4 * r5;
        r4 = (int) r4;
        r23 = r4;
        goto L_0x0349;
    L_0x01bf:
        r2 = r39;
        r4 = r39.nextDouble();
        r4 = (float) r4;
        r27 = r4;
        goto L_0x0349;
    L_0x01ca:
        r2 = r39;
        r4 = r39.nextDouble();
        r15 = (float) r4;
        goto L_0x0349;
    L_0x01d3:
        r2 = r39;
        r39.beginArray();
        r4 = new java.util.ArrayList;
        r4.<init>();
    L_0x01dd:
        r6 = r39.hasNext();
        if (r6 == 0) goto L_0x0218;
    L_0x01e3:
        r39.beginObject();
    L_0x01e6:
        r6 = r39.hasNext();
        if (r6 == 0) goto L_0x0212;
    L_0x01ec:
        r6 = r39.nextName();
        r3 = r6.hashCode();
        r11 = 3519; // 0xdbf float:4.931E-42 double:1.7386E-320;
        if (r3 == r11) goto L_0x01f9;
    L_0x01f8:
        goto L_0x0201;
    L_0x01f9:
        r3 = r6.equals(r5);
        if (r3 == 0) goto L_0x0201;
    L_0x01ff:
        r3 = 0;
        goto L_0x0202;
    L_0x0201:
        r3 = -1;
    L_0x0202:
        if (r3 == 0) goto L_0x0208;
    L_0x0204:
        r39.skipValue();
        goto L_0x020f;
    L_0x0208:
        r3 = r39.nextString();
        r4.add(r3);
    L_0x020f:
        r3 = 0;
        r11 = 0;
        goto L_0x01e6;
    L_0x0212:
        r39.endObject();
        r3 = 0;
        r11 = 0;
        goto L_0x01dd;
    L_0x0218:
        r39.endArray();
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r5 = "Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: ";
        r3.append(r5);
        r3.append(r4);
        r3 = r3.toString();
        r7.l(r3);
        goto L_0x0349;
    L_0x0231:
        r2 = r39;
        r39.beginObject();
    L_0x0236:
        r3 = r39.hasNext();
        if (r3 == 0) goto L_0x028c;
    L_0x023c:
        r3 = r39.nextName();
        r4 = r3.hashCode();
        r5 = 97;
        if (r4 == r5) goto L_0x0257;
    L_0x0248:
        r5 = 100;
        if (r4 == r5) goto L_0x024d;
    L_0x024c:
        goto L_0x0261;
    L_0x024d:
        r4 = "d";
        r3 = r3.equals(r4);
        if (r3 == 0) goto L_0x0261;
    L_0x0255:
        r3 = 0;
        goto L_0x0262;
    L_0x0257:
        r4 = "a";
        r3 = r3.equals(r4);
        if (r3 == 0) goto L_0x0261;
    L_0x025f:
        r3 = 1;
        goto L_0x0262;
    L_0x0261:
        r3 = -1;
    L_0x0262:
        if (r3 == 0) goto L_0x0287;
    L_0x0264:
        if (r3 == r6) goto L_0x026a;
    L_0x0266:
        r39.skipValue();
        goto L_0x0236;
    L_0x026a:
        r39.beginArray();
        r3 = r39.hasNext();
        if (r3 == 0) goto L_0x0279;
    L_0x0273:
        r3 = com.airbnb.lottie.c.b.c(r39, r40);
        r32 = r3;
    L_0x0279:
        r3 = r39.hasNext();
        if (r3 == 0) goto L_0x0283;
    L_0x027f:
        r39.skipValue();
        goto L_0x0279;
    L_0x0283:
        r39.endArray();
        goto L_0x0236;
    L_0x0287:
        r31 = com.airbnb.lottie.c.d.k(r39, r40);
        goto L_0x0236;
    L_0x028c:
        r39.endObject();
        goto L_0x0349;
    L_0x0291:
        r2 = r39;
        r39.beginArray();
    L_0x0296:
        r3 = r39.hasNext();
        if (r3 == 0) goto L_0x02a6;
    L_0x029c:
        r3 = com.airbnb.lottie.c.g.m(r39, r40);
        if (r3 == 0) goto L_0x0296;
    L_0x02a2:
        r8.add(r3);
        goto L_0x0296;
    L_0x02a6:
        r39.endArray();
        goto L_0x0349;
    L_0x02ab:
        r2 = r39;
        r39.beginArray();
    L_0x02b0:
        r3 = r39.hasNext();
        if (r3 == 0) goto L_0x02be;
    L_0x02b6:
        r3 = com.airbnb.lottie.c.u.r(r39, r40);
        r10.add(r3);
        goto L_0x02b0;
    L_0x02be:
        r3 = r10.size();
        r7.u(r3);
        r39.endArray();
        goto L_0x0349;
    L_0x02ca:
        r2 = r39;
        r3 = com.airbnb.lottie.model.layer.Layer.MatteType.values();
        r4 = r39.nextInt();
        r28 = r3[r4];
        r7.u(r6);
        goto L_0x0349;
    L_0x02db:
        r2 = r39;
        r30 = com.airbnb.lottie.c.c.e(r39, r40);
        goto L_0x0349;
    L_0x02e3:
        r2 = r39;
        r3 = r39.nextString();
        r22 = android.graphics.Color.parseColor(r3);
        goto L_0x0349;
    L_0x02ee:
        r2 = r39;
        r3 = r39.nextInt();
        r3 = (float) r3;
        r4 = com.airbnb.lottie.d.h.cP();
        r3 = r3 * r4;
        r3 = (int) r3;
        r21 = r3;
        goto L_0x0349;
    L_0x02ff:
        r2 = r39;
        r3 = r39.nextInt();
        r3 = (float) r3;
        r4 = com.airbnb.lottie.d.h.cP();
        r3 = r3 * r4;
        r3 = (int) r3;
        r20 = r3;
        goto L_0x0349;
    L_0x0310:
        r2 = r39;
        r3 = r39.nextInt();
        r3 = (long) r3;
        r25 = r3;
        goto L_0x0349;
    L_0x031a:
        r2 = r39;
        r3 = r39.nextInt();
        r4 = com.airbnb.lottie.model.layer.Layer.LayerType.UNKNOWN;
        r4 = r4.ordinal();
        if (r3 >= r4) goto L_0x032f;
    L_0x0328:
        r4 = com.airbnb.lottie.model.layer.Layer.LayerType.values();
        r16 = r4[r3];
        goto L_0x0349;
    L_0x032f:
        r16 = com.airbnb.lottie.model.layer.Layer.LayerType.UNKNOWN;
        goto L_0x0349;
    L_0x0332:
        r2 = r39;
        r17 = r39.nextString();
        goto L_0x0349;
    L_0x0339:
        r2 = r39;
        r3 = r39.nextInt();
        r3 = (long) r3;
        r18 = r3;
        goto L_0x0349;
    L_0x0343:
        r2 = r39;
        r13 = r39.nextString();
    L_0x0349:
        r3 = 0;
        r11 = 0;
        goto L_0x004b;
    L_0x034d:
        r2 = r39;
        r39.endObject();
        r11 = r0 / r15;
        r34 = r1 / r15;
        r6 = new java.util.ArrayList;
        r6.<init>();
        r0 = 0;
        r1 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1));
        if (r1 <= 0) goto L_0x0380;
    L_0x0360:
        r5 = new com.airbnb.lottie.e.a;
        r4 = 0;
        r35 = 0;
        r37 = java.lang.Float.valueOf(r11);
        r0 = r5;
        r1 = r40;
        r2 = r12;
        r3 = r12;
        r38 = r5;
        r5 = r35;
        r35 = r15;
        r15 = r6;
        r6 = r37;
        r0.<init>(r1, r2, r3, r4, r5, r6);
        r0 = r38;
        r15.add(r0);
        goto L_0x0383;
    L_0x0380:
        r35 = r15;
        r15 = r6;
    L_0x0383:
        r0 = 0;
        r0 = (r34 > r0 ? 1 : (r34 == r0 ? 0 : -1));
        if (r0 <= 0) goto L_0x0389;
    L_0x0388:
        goto L_0x038f;
    L_0x0389:
        r0 = r40.ak();
        r34 = r0;
    L_0x038f:
        r6 = new com.airbnb.lottie.e.a;
        r4 = 0;
        r36 = java.lang.Float.valueOf(r34);
        r0 = r6;
        r1 = r40;
        r2 = r9;
        r3 = r9;
        r5 = r11;
        r9 = r6;
        r6 = r36;
        r0.<init>(r1, r2, r3, r4, r5, r6);
        r15.add(r9);
        r9 = new com.airbnb.lottie.e.a;
        r0 = 2139095039; // 0x7f7fffff float:3.4028235E38 double:1.056853372E-314;
        r6 = java.lang.Float.valueOf(r0);
        r0 = r9;
        r2 = r12;
        r3 = r12;
        r5 = r34;
        r0.<init>(r1, r2, r3, r4, r5, r6);
        r15.add(r9);
        r0 = ".ai";
        r0 = r13.endsWith(r0);
        if (r0 != 0) goto L_0x03c9;
    L_0x03c1:
        r0 = "ai";
        r0 = r0.equals(r14);
        if (r0 == 0) goto L_0x03ce;
    L_0x03c9:
        r0 = "Convert your Illustrator layers to shape layers.";
        r7.l(r0);
    L_0x03ce:
        r34 = new com.airbnb.lottie.model.layer.Layer;
        r0 = r34;
        r1 = r8;
        r2 = r40;
        r3 = r13;
        r4 = r18;
        r6 = r16;
        r7 = r25;
        r9 = r17;
        r11 = r30;
        r12 = r20;
        r13 = r21;
        r14 = r22;
        r21 = r15;
        r15 = r35;
        r16 = r27;
        r17 = r23;
        r18 = r24;
        r19 = r31;
        r20 = r32;
        r22 = r28;
        r23 = r33;
        r24 = r29;
        r0.<init>(r1, r2, r3, r4, r6, r7, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24);
        return r34;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.c.s.q(android.util.JsonReader, com.airbnb.lottie.e):com.airbnb.lottie.model.layer.Layer");
    }
}
