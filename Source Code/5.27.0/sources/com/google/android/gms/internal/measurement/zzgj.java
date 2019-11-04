package com.google.android.gms.internal.measurement;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

final class zzgj {
    static String zza(zzgi zzgi, String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("# ");
        stringBuilder.append(str);
        zza(zzgi, stringBuilder, 0);
        return stringBuilder.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:107:0x025d  */
    /* JADX WARNING: Missing block: B:77:0x01f2, code skipped:
            if (((java.lang.Boolean) r11).booleanValue() == false) goto L_0x01f4;
     */
    /* JADX WARNING: Missing block: B:83:0x0204, code skipped:
            if (((java.lang.Integer) r11).intValue() == 0) goto L_0x01f4;
     */
    /* JADX WARNING: Missing block: B:87:0x0215, code skipped:
            if (((java.lang.Float) r11).floatValue() == 0.0f) goto L_0x01f4;
     */
    /* JADX WARNING: Missing block: B:91:0x0227, code skipped:
            if (((java.lang.Double) r11).doubleValue() == 0.0d) goto L_0x01f4;
     */
    private static void zza(com.google.android.gms.internal.measurement.zzgi r18, java.lang.StringBuilder r19, int r20) {
        /*
        r0 = r18;
        r1 = r19;
        r2 = r20;
        r3 = new java.util.HashMap;
        r3.<init>();
        r4 = new java.util.HashMap;
        r4.<init>();
        r5 = new java.util.TreeSet;
        r5.<init>();
        r6 = r18.getClass();
        r6 = r6.getDeclaredMethods();
        r7 = r6.length;
        r8 = 0;
        r9 = 0;
    L_0x0020:
        r10 = "get";
        if (r9 >= r7) goto L_0x004f;
    L_0x0024:
        r11 = r6[r9];
        r12 = r11.getName();
        r4.put(r12, r11);
        r12 = r11.getParameterTypes();
        r12 = r12.length;
        if (r12 != 0) goto L_0x004c;
    L_0x0034:
        r12 = r11.getName();
        r3.put(r12, r11);
        r12 = r11.getName();
        r10 = r12.startsWith(r10);
        if (r10 == 0) goto L_0x004c;
    L_0x0045:
        r10 = r11.getName();
        r5.add(r10);
    L_0x004c:
        r9 = r9 + 1;
        goto L_0x0020;
    L_0x004f:
        r5 = r5.iterator();
    L_0x0053:
        r6 = r5.hasNext();
        if (r6 == 0) goto L_0x0277;
    L_0x0059:
        r6 = r5.next();
        r6 = (java.lang.String) r6;
        r7 = "";
        r9 = r6.replaceFirst(r10, r7);
        r11 = "List";
        r12 = r9.endsWith(r11);
        r13 = 1;
        if (r12 == 0) goto L_0x00c9;
    L_0x006e:
        r12 = "OrBuilderList";
        r12 = r9.endsWith(r12);
        if (r12 != 0) goto L_0x00c9;
    L_0x0076:
        r11 = r9.equals(r11);
        if (r11 != 0) goto L_0x00c9;
    L_0x007c:
        r11 = r9.substring(r8, r13);
        r11 = r11.toLowerCase();
        r11 = java.lang.String.valueOf(r11);
        r12 = r9.length();
        r12 = r12 + -4;
        r12 = r9.substring(r13, r12);
        r12 = java.lang.String.valueOf(r12);
        r14 = r12.length();
        if (r14 == 0) goto L_0x00a1;
    L_0x009c:
        r11 = r11.concat(r12);
        goto L_0x00a7;
    L_0x00a1:
        r12 = new java.lang.String;
        r12.<init>(r11);
        r11 = r12;
    L_0x00a7:
        r12 = r3.get(r6);
        r12 = (java.lang.reflect.Method) r12;
        if (r12 == 0) goto L_0x00c9;
    L_0x00af:
        r14 = r12.getReturnType();
        r15 = java.util.List.class;
        r14 = r14.equals(r15);
        if (r14 == 0) goto L_0x00c9;
    L_0x00bb:
        r6 = zzdv(r11);
        r7 = new java.lang.Object[r8];
        r7 = com.google.android.gms.internal.measurement.zzey.zza(r12, r0, r7);
        zzb(r1, r2, r6, r7);
        goto L_0x0053;
    L_0x00c9:
        r11 = "Map";
        r12 = r9.endsWith(r11);
        if (r12 == 0) goto L_0x0137;
    L_0x00d1:
        r11 = r9.equals(r11);
        if (r11 != 0) goto L_0x0137;
    L_0x00d7:
        r11 = r9.substring(r8, r13);
        r11 = r11.toLowerCase();
        r11 = java.lang.String.valueOf(r11);
        r12 = r9.length();
        r12 = r12 + -3;
        r12 = r9.substring(r13, r12);
        r12 = java.lang.String.valueOf(r12);
        r14 = r12.length();
        if (r14 == 0) goto L_0x00fc;
    L_0x00f7:
        r11 = r11.concat(r12);
        goto L_0x0102;
    L_0x00fc:
        r12 = new java.lang.String;
        r12.<init>(r11);
        r11 = r12;
    L_0x0102:
        r6 = r3.get(r6);
        r6 = (java.lang.reflect.Method) r6;
        if (r6 == 0) goto L_0x0137;
    L_0x010a:
        r12 = r6.getReturnType();
        r14 = java.util.Map.class;
        r12 = r12.equals(r14);
        if (r12 == 0) goto L_0x0137;
    L_0x0116:
        r12 = java.lang.Deprecated.class;
        r12 = r6.isAnnotationPresent(r12);
        if (r12 != 0) goto L_0x0137;
    L_0x011e:
        r12 = r6.getModifiers();
        r12 = java.lang.reflect.Modifier.isPublic(r12);
        if (r12 == 0) goto L_0x0137;
    L_0x0128:
        r7 = zzdv(r11);
        r9 = new java.lang.Object[r8];
        r6 = com.google.android.gms.internal.measurement.zzey.zza(r6, r0, r9);
        zzb(r1, r2, r7, r6);
        goto L_0x0053;
    L_0x0137:
        r6 = "set";
        r11 = java.lang.String.valueOf(r9);
        r12 = r11.length();
        if (r12 == 0) goto L_0x0148;
    L_0x0143:
        r6 = r6.concat(r11);
        goto L_0x014e;
    L_0x0148:
        r11 = new java.lang.String;
        r11.<init>(r6);
        r6 = r11;
    L_0x014e:
        r6 = r4.get(r6);
        r6 = (java.lang.reflect.Method) r6;
        if (r6 == 0) goto L_0x0053;
    L_0x0156:
        r6 = "Bytes";
        r6 = r9.endsWith(r6);
        if (r6 == 0) goto L_0x0182;
    L_0x015e:
        r6 = r9.length();
        r6 = r6 + -5;
        r6 = r9.substring(r8, r6);
        r6 = java.lang.String.valueOf(r6);
        r11 = r6.length();
        if (r11 == 0) goto L_0x0177;
    L_0x0172:
        r6 = r10.concat(r6);
        goto L_0x017c;
    L_0x0177:
        r6 = new java.lang.String;
        r6.<init>(r10);
    L_0x017c:
        r6 = r3.containsKey(r6);
        if (r6 != 0) goto L_0x0053;
    L_0x0182:
        r6 = r9.substring(r8, r13);
        r6 = r6.toLowerCase();
        r6 = java.lang.String.valueOf(r6);
        r11 = r9.substring(r13);
        r11 = java.lang.String.valueOf(r11);
        r12 = r11.length();
        if (r12 == 0) goto L_0x01a1;
    L_0x019c:
        r6 = r6.concat(r11);
        goto L_0x01a7;
    L_0x01a1:
        r11 = new java.lang.String;
        r11.<init>(r6);
        r6 = r11;
    L_0x01a7:
        r11 = java.lang.String.valueOf(r9);
        r12 = r11.length();
        if (r12 == 0) goto L_0x01b6;
    L_0x01b1:
        r11 = r10.concat(r11);
        goto L_0x01bb;
    L_0x01b6:
        r11 = new java.lang.String;
        r11.<init>(r10);
    L_0x01bb:
        r11 = r3.get(r11);
        r11 = (java.lang.reflect.Method) r11;
        r12 = "has";
        r9 = java.lang.String.valueOf(r9);
        r14 = r9.length();
        if (r14 == 0) goto L_0x01d2;
    L_0x01cd:
        r9 = r12.concat(r9);
        goto L_0x01d7;
    L_0x01d2:
        r9 = new java.lang.String;
        r9.<init>(r12);
    L_0x01d7:
        r9 = r3.get(r9);
        r9 = (java.lang.reflect.Method) r9;
        if (r11 == 0) goto L_0x0053;
    L_0x01df:
        r12 = new java.lang.Object[r8];
        r11 = com.google.android.gms.internal.measurement.zzey.zza(r11, r0, r12);
        if (r9 != 0) goto L_0x025f;
    L_0x01e7:
        r9 = r11 instanceof java.lang.Boolean;
        if (r9 == 0) goto L_0x01f9;
    L_0x01eb:
        r7 = r11;
        r7 = (java.lang.Boolean) r7;
        r7 = r7.booleanValue();
        if (r7 != 0) goto L_0x01f7;
    L_0x01f4:
        r7 = 1;
        goto L_0x025a;
    L_0x01f7:
        r7 = 0;
        goto L_0x025a;
    L_0x01f9:
        r9 = r11 instanceof java.lang.Integer;
        if (r9 == 0) goto L_0x0207;
    L_0x01fd:
        r7 = r11;
        r7 = (java.lang.Integer) r7;
        r7 = r7.intValue();
        if (r7 != 0) goto L_0x01f7;
    L_0x0206:
        goto L_0x01f4;
    L_0x0207:
        r9 = r11 instanceof java.lang.Float;
        if (r9 == 0) goto L_0x0218;
    L_0x020b:
        r7 = r11;
        r7 = (java.lang.Float) r7;
        r7 = r7.floatValue();
        r9 = 0;
        r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1));
        if (r7 != 0) goto L_0x01f7;
    L_0x0217:
        goto L_0x01f4;
    L_0x0218:
        r9 = r11 instanceof java.lang.Double;
        if (r9 == 0) goto L_0x022a;
    L_0x021c:
        r7 = r11;
        r7 = (java.lang.Double) r7;
        r14 = r7.doubleValue();
        r16 = 0;
        r7 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1));
        if (r7 != 0) goto L_0x01f7;
    L_0x0229:
        goto L_0x01f4;
    L_0x022a:
        r9 = r11 instanceof java.lang.String;
        if (r9 == 0) goto L_0x0233;
    L_0x022e:
        r7 = r11.equals(r7);
        goto L_0x025a;
    L_0x0233:
        r7 = r11 instanceof com.google.android.gms.internal.measurement.zzdp;
        if (r7 == 0) goto L_0x023e;
    L_0x0237:
        r7 = com.google.android.gms.internal.measurement.zzdp.zzadh;
        r7 = r11.equals(r7);
        goto L_0x025a;
    L_0x023e:
        r7 = r11 instanceof com.google.android.gms.internal.measurement.zzgi;
        if (r7 == 0) goto L_0x024c;
    L_0x0242:
        r7 = r11;
        r7 = (com.google.android.gms.internal.measurement.zzgi) r7;
        r7 = r7.zzuh();
        if (r11 != r7) goto L_0x01f7;
    L_0x024b:
        goto L_0x01f4;
    L_0x024c:
        r7 = r11 instanceof java.lang.Enum;
        if (r7 == 0) goto L_0x01f7;
    L_0x0250:
        r7 = r11;
        r7 = (java.lang.Enum) r7;
        r7 = r7.ordinal();
        if (r7 != 0) goto L_0x01f7;
    L_0x0259:
        goto L_0x01f4;
    L_0x025a:
        if (r7 != 0) goto L_0x025d;
    L_0x025c:
        goto L_0x026c;
    L_0x025d:
        r13 = 0;
        goto L_0x026c;
    L_0x025f:
        r7 = new java.lang.Object[r8];
        r7 = com.google.android.gms.internal.measurement.zzey.zza(r9, r0, r7);
        r7 = (java.lang.Boolean) r7;
        r7 = r7.booleanValue();
        r13 = r7;
    L_0x026c:
        if (r13 == 0) goto L_0x0053;
    L_0x026e:
        r6 = zzdv(r6);
        zzb(r1, r2, r6, r11);
        goto L_0x0053;
    L_0x0277:
        r3 = r0 instanceof com.google.android.gms.internal.measurement.zzey.zzb;
        if (r3 == 0) goto L_0x029a;
    L_0x027b:
        r3 = r0;
        r3 = (com.google.android.gms.internal.measurement.zzey.zzb) r3;
        r3 = r3.zzaic;
        r3 = r3.iterator();
        r4 = r3.hasNext();
        if (r4 != 0) goto L_0x028b;
    L_0x028a:
        goto L_0x029a;
    L_0x028b:
        r0 = r3.next();
        r0 = (java.util.Map.Entry) r0;
        r0.getKey();
        r0 = new java.lang.NoSuchMethodError;
        r0.<init>();
        throw r0;
    L_0x029a:
        r0 = (com.google.android.gms.internal.measurement.zzey) r0;
        r3 = r0.zzahz;
        if (r3 == 0) goto L_0x02a5;
    L_0x02a0:
        r0 = r0.zzahz;
        r0.zzb(r1, r2);
    L_0x02a5:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzgj.zza(com.google.android.gms.internal.measurement.zzgi, java.lang.StringBuilder, int):void");
    }

    static final void zzb(StringBuilder stringBuilder, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object zzb : (List) obj) {
                zzb(stringBuilder, i, str, zzb);
            }
        } else if (obj instanceof Map) {
            for (Entry zzb2 : ((Map) obj).entrySet()) {
                zzb(stringBuilder, i, str, zzb2);
            }
        } else {
            stringBuilder.append(10);
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                stringBuilder.append(' ');
            }
            stringBuilder.append(str);
            String str2 = ": \"";
            if (obj instanceof String) {
                stringBuilder.append(str2);
                stringBuilder.append(zzhl.zzd(zzdp.zzdq((String) obj)));
                stringBuilder.append('\"');
            } else if (obj instanceof zzdp) {
                stringBuilder.append(str2);
                stringBuilder.append(zzhl.zzd((zzdp) obj));
                stringBuilder.append('\"');
            } else {
                String str3 = "}";
                str2 = "\n";
                String str4 = " {";
                if (obj instanceof zzey) {
                    stringBuilder.append(str4);
                    zza((zzey) obj, stringBuilder, i + 2);
                    stringBuilder.append(str2);
                    while (i2 < i) {
                        stringBuilder.append(' ');
                        i2++;
                    }
                    stringBuilder.append(str3);
                } else if (obj instanceof Entry) {
                    stringBuilder.append(str4);
                    Entry entry = (Entry) obj;
                    int i4 = i + 2;
                    zzb(stringBuilder, i4, "key", entry.getKey());
                    zzb(stringBuilder, i4, ConditionalUserProperty.VALUE, entry.getValue());
                    stringBuilder.append(str2);
                    while (i2 < i) {
                        stringBuilder.append(' ');
                        i2++;
                    }
                    stringBuilder.append(str3);
                } else {
                    stringBuilder.append(": ");
                    stringBuilder.append(obj.toString());
                }
            }
        }
    }

    private static final String zzdv(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt)) {
                stringBuilder.append("_");
            }
            stringBuilder.append(Character.toLowerCase(charAt));
        }
        return stringBuilder.toString();
    }
}
