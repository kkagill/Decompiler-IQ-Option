package com.google.android.gms.common.server.response;

import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;
import com.google.android.gms.common.util.JsonUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Stack;

@ShowFirstParty
@KeepForSdk
public class FastParser<T extends FastJsonResponse> {
    private static final char[] zaqf = new char[]{'u', 'l', 'l'};
    private static final char[] zaqg = new char[]{'r', 'u', 'e'};
    private static final char[] zaqh = new char[]{'r', 'u', 'e', '\"'};
    private static final char[] zaqi = new char[]{'a', 'l', 's', 'e'};
    private static final char[] zaqj = new char[]{'a', 'l', 's', 'e', '\"'};
    private static final char[] zaqk = new char[]{10};
    private static final zaa<Integer> zaqm = new zaa();
    private static final zaa<Long> zaqn = new zab();
    private static final zaa<Float> zaqo = new zac();
    private static final zaa<Double> zaqp = new zad();
    private static final zaa<Boolean> zaqq = new zae();
    private static final zaa<String> zaqr = new zaf();
    private static final zaa<BigInteger> zaqs = new zag();
    private static final zaa<BigDecimal> zaqt = new zah();
    private final char[] zaqa = new char[1];
    private final char[] zaqb = new char[32];
    private final char[] zaqc = new char[1024];
    private final StringBuilder zaqd = new StringBuilder(32);
    private final StringBuilder zaqe = new StringBuilder(1024);
    private final Stack<Integer> zaql = new Stack();

    @ShowFirstParty
    @KeepForSdk
    public static class ParseException extends Exception {
        public ParseException(String str) {
            super(str);
        }

        public ParseException(String str, Throwable th) {
            super(str, th);
        }

        public ParseException(Throwable th) {
            super(th);
        }
    }

    private interface zaa<O> {
        O zah(FastParser fastParser, BufferedReader bufferedReader);
    }

    @KeepForSdk
    public void parse(InputStream inputStream, T t) {
        String str = "Failed to close reader while parsing.";
        String str2 = "FastParser";
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream), 1024);
        try {
            this.zaql.push(Integer.valueOf(0));
            char zaj = zaj(bufferedReader);
            if (zaj != 0) {
                if (zaj == '[') {
                    this.zaql.push(Integer.valueOf(5));
                    Map fieldMappings = t.getFieldMappings();
                    if (fieldMappings.size() == 1) {
                        Field field = (Field) ((Entry) fieldMappings.entrySet().iterator().next()).getValue();
                        t.addConcreteTypeArrayInternal(field, field.zapu, zaa(bufferedReader, field));
                    } else {
                        throw new ParseException("Object array response class must have a single Field");
                    }
                } else if (zaj == '{') {
                    this.zaql.push(Integer.valueOf(1));
                    zaa(bufferedReader, (FastJsonResponse) t);
                } else {
                    StringBuilder stringBuilder = new StringBuilder(19);
                    stringBuilder.append("Unexpected token: ");
                    stringBuilder.append(zaj);
                    throw new ParseException(stringBuilder.toString());
                }
                zak(0);
                try {
                    bufferedReader.close();
                    return;
                } catch (IOException unused) {
                    Log.w(str2, str);
                    return;
                }
            }
            throw new ParseException("No data to parse");
        } catch (IOException e) {
            throw new ParseException(e);
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (IOException unused2) {
                Log.w(str2, str);
            }
        }
    }

    /* JADX WARNING: Missing block: B:79:0x01b8, code skipped:
            r5 = 4;
     */
    /* JADX WARNING: Missing block: B:112:0x026f, code skipped:
            r5 = 4;
     */
    /* JADX WARNING: Missing block: B:113:0x0270, code skipped:
            zak(r5);
            zak(2);
            r5 = zaj(r17);
     */
    /* JADX WARNING: Missing block: B:114:0x027b, code skipped:
            if (r5 == ',') goto L_0x029b;
     */
    /* JADX WARNING: Missing block: B:115:0x027d, code skipped:
            if (r5 != '}') goto L_0x0282;
     */
    /* JADX WARNING: Missing block: B:116:0x027f, code skipped:
            r5 = null;
     */
    /* JADX WARNING: Missing block: B:117:0x0282, code skipped:
            r3 = new java.lang.StringBuilder(55);
            r3.append("Expected end of object or field separator, but found: ");
            r3.append(r5);
     */
    /* JADX WARNING: Missing block: B:118:0x029a, code skipped:
            throw new com.google.android.gms.common.server.response.FastParser.ParseException(r3.toString());
     */
    /* JADX WARNING: Missing block: B:119:0x029b, code skipped:
            r5 = zaa(r17);
     */
    private final boolean zaa(java.io.BufferedReader r17, com.google.android.gms.common.server.response.FastJsonResponse r18) {
        /*
        r16 = this;
        r1 = r16;
        r0 = r17;
        r2 = r18;
        r3 = "Error instantiating inner object";
        r4 = r18.getFieldMappings();
        r5 = r16.zaa(r17);
        r6 = 0;
        r7 = 1;
        r8 = java.lang.Integer.valueOf(r7);
        if (r5 != 0) goto L_0x001c;
    L_0x0018:
        r1.zak(r7);
        return r6;
    L_0x001c:
        r9 = 0;
    L_0x001d:
        if (r5 == 0) goto L_0x02a1;
    L_0x001f:
        r5 = r4.get(r5);
        r5 = (com.google.android.gms.common.server.response.FastJsonResponse.Field) r5;
        if (r5 != 0) goto L_0x002c;
    L_0x0027:
        r5 = r16.zab(r17);
        goto L_0x001d;
    L_0x002c:
        r10 = r1.zaql;
        r11 = 4;
        r12 = java.lang.Integer.valueOf(r11);
        r10.push(r12);
        r10 = r5.zapq;
        r12 = 123; // 0x7b float:1.72E-43 double:6.1E-322;
        r13 = 44;
        r14 = 125; // 0x7d float:1.75E-43 double:6.2E-322;
        r15 = 110; // 0x6e float:1.54E-43 double:5.43E-322;
        switch(r10) {
            case 0: goto L_0x025a;
            case 1: goto L_0x0244;
            case 2: goto L_0x022e;
            case 3: goto L_0x0218;
            case 4: goto L_0x0202;
            case 5: goto L_0x01ea;
            case 6: goto L_0x01d2;
            case 7: goto L_0x01bc;
            case 8: goto L_0x01a7;
            case 9: goto L_0x0195;
            case 10: goto L_0x00d2;
            case 11: goto L_0x005e;
            default: goto L_0x0043;
        };
    L_0x0043:
        r0 = new com.google.android.gms.common.server.response.FastParser$ParseException;
        r2 = r5.zapq;
        r3 = 30;
        r4 = new java.lang.StringBuilder;
        r4.<init>(r3);
        r3 = "Invalid field type ";
        r4.append(r3);
        r4.append(r2);
        r2 = r4.toString();
        r0.<init>(r2);
        throw r0;
    L_0x005e:
        r10 = r5.zapr;
        if (r10 == 0) goto L_0x0095;
    L_0x0062:
        r10 = r16.zaj(r17);
        if (r10 != r15) goto L_0x0074;
    L_0x0068:
        r10 = zaqf;
        r1.zab(r0, r10);
        r10 = r5.zapu;
        r2.addConcreteTypeArrayInternal(r5, r10, r9);
        goto L_0x026f;
    L_0x0074:
        r12 = r1.zaql;
        r15 = 5;
        r15 = java.lang.Integer.valueOf(r15);
        r12.push(r15);
        r12 = 91;
        if (r10 != r12) goto L_0x008d;
    L_0x0082:
        r10 = r5.zapu;
        r12 = r1.zaa(r0, r5);
        r2.addConcreteTypeArrayInternal(r5, r10, r12);
        goto L_0x026f;
    L_0x008d:
        r0 = new com.google.android.gms.common.server.response.FastParser$ParseException;
        r2 = "Expected array start";
        r0.<init>(r2);
        throw r0;
    L_0x0095:
        r10 = r16.zaj(r17);
        if (r10 != r15) goto L_0x00a7;
    L_0x009b:
        r10 = zaqf;
        r1.zab(r0, r10);
        r10 = r5.zapu;
        r2.addConcreteTypeInternal(r5, r10, r9);
        goto L_0x026f;
    L_0x00a7:
        r15 = r1.zaql;
        r15.push(r8);
        if (r10 != r12) goto L_0x00ca;
    L_0x00ae:
        r10 = r5.zacp();	 Catch:{ InstantiationException -> 0x00c3, IllegalAccessException -> 0x00bc }
        r1.zaa(r0, r10);	 Catch:{ InstantiationException -> 0x00c3, IllegalAccessException -> 0x00bc }
        r12 = r5.zapu;	 Catch:{ InstantiationException -> 0x00c3, IllegalAccessException -> 0x00bc }
        r2.addConcreteTypeInternal(r5, r12, r10);	 Catch:{ InstantiationException -> 0x00c3, IllegalAccessException -> 0x00bc }
        goto L_0x026f;
    L_0x00bc:
        r0 = move-exception;
        r2 = new com.google.android.gms.common.server.response.FastParser$ParseException;
        r2.<init>(r3, r0);
        throw r2;
    L_0x00c3:
        r0 = move-exception;
        r2 = new com.google.android.gms.common.server.response.FastParser$ParseException;
        r2.<init>(r3, r0);
        throw r2;
    L_0x00ca:
        r0 = new com.google.android.gms.common.server.response.FastParser$ParseException;
        r2 = "Expected start of object";
        r0.<init>(r2);
        throw r0;
    L_0x00d2:
        r10 = r16.zaj(r17);
        if (r10 != r15) goto L_0x00e0;
    L_0x00d8:
        r10 = zaqf;
        r1.zab(r0, r10);
        r10 = r9;
        goto L_0x0164;
    L_0x00e0:
        if (r10 != r12) goto L_0x018d;
    L_0x00e2:
        r10 = r1.zaql;
        r10.push(r8);
        r10 = new java.util.HashMap;
        r10.<init>();
    L_0x00ec:
        r12 = r16.zaj(r17);
        if (r12 == 0) goto L_0x0185;
    L_0x00f2:
        r15 = 34;
        if (r12 == r15) goto L_0x00fe;
    L_0x00f6:
        if (r12 == r14) goto L_0x00fa;
    L_0x00f8:
        goto L_0x0181;
    L_0x00fa:
        r1.zak(r7);
        goto L_0x0164;
    L_0x00fe:
        r12 = r1.zaqb;
        r11 = r1.zaqd;
        r11 = zab(r0, r12, r11, r9);
        r12 = r16.zaj(r17);
        r6 = 58;
        if (r12 == r6) goto L_0x012b;
    L_0x010e:
        r0 = new com.google.android.gms.common.server.response.FastParser$ParseException;
        r2 = "No map value found for key ";
        r3 = java.lang.String.valueOf(r11);
        r4 = r3.length();
        if (r4 == 0) goto L_0x0121;
    L_0x011c:
        r2 = r2.concat(r3);
        goto L_0x0127;
    L_0x0121:
        r3 = new java.lang.String;
        r3.<init>(r2);
        r2 = r3;
    L_0x0127:
        r0.<init>(r2);
        throw r0;
    L_0x012b:
        r6 = r16.zaj(r17);
        if (r6 == r15) goto L_0x014e;
    L_0x0131:
        r0 = new com.google.android.gms.common.server.response.FastParser$ParseException;
        r2 = "Expected String value for key ";
        r3 = java.lang.String.valueOf(r11);
        r4 = r3.length();
        if (r4 == 0) goto L_0x0144;
    L_0x013f:
        r2 = r2.concat(r3);
        goto L_0x014a;
    L_0x0144:
        r3 = new java.lang.String;
        r3.<init>(r2);
        r2 = r3;
    L_0x014a:
        r0.<init>(r2);
        throw r0;
    L_0x014e:
        r6 = r1.zaqb;
        r12 = r1.zaqd;
        r6 = zab(r0, r6, r12, r9);
        r10.put(r11, r6);
        r6 = r16.zaj(r17);
        if (r6 == r13) goto L_0x0181;
    L_0x015f:
        if (r6 != r14) goto L_0x0168;
    L_0x0161:
        r1.zak(r7);
    L_0x0164:
        r2.zaa(r5, r10);
        goto L_0x01b8;
    L_0x0168:
        r0 = new com.google.android.gms.common.server.response.FastParser$ParseException;
        r2 = 48;
        r3 = new java.lang.StringBuilder;
        r3.<init>(r2);
        r2 = "Unexpected character while parsing string map: ";
        r3.append(r2);
        r3.append(r6);
        r2 = r3.toString();
        r0.<init>(r2);
        throw r0;
    L_0x0181:
        r6 = 0;
        r11 = 4;
        goto L_0x00ec;
    L_0x0185:
        r0 = new com.google.android.gms.common.server.response.FastParser$ParseException;
        r2 = "Unexpected EOF";
        r0.<init>(r2);
        throw r0;
    L_0x018d:
        r0 = new com.google.android.gms.common.server.response.FastParser$ParseException;
        r2 = "Expected start of a map object";
        r0.<init>(r2);
        throw r0;
    L_0x0195:
        r6 = r1.zaqc;
        r10 = r1.zaqe;
        r11 = zaqk;
        r6 = r1.zaa(r0, r6, r10, r11);
        r6 = com.google.android.gms.common.util.Base64Utils.decodeUrlSafe(r6);
        r2.zaa(r5, r6);
        goto L_0x01b8;
    L_0x01a7:
        r6 = r1.zaqc;
        r10 = r1.zaqe;
        r11 = zaqk;
        r6 = r1.zaa(r0, r6, r10, r11);
        r6 = com.google.android.gms.common.util.Base64Utils.decode(r6);
        r2.zaa(r5, r6);
    L_0x01b8:
        r5 = 4;
        r6 = 0;
        goto L_0x0270;
    L_0x01bc:
        r6 = r5.zapr;
        if (r6 == 0) goto L_0x01ca;
    L_0x01c0:
        r6 = zaqr;
        r6 = r1.zaa(r0, r6);
        r2.zah(r5, r6);
        goto L_0x01b8;
    L_0x01ca:
        r6 = r16.zac(r17);
        r2.zaa(r5, r6);
        goto L_0x01b8;
    L_0x01d2:
        r6 = r5.zapr;
        if (r6 == 0) goto L_0x01e0;
    L_0x01d6:
        r6 = zaqq;
        r6 = r1.zaa(r0, r6);
        r2.zag(r5, r6);
        goto L_0x01b8;
    L_0x01e0:
        r6 = 0;
        r10 = r1.zaa(r0, r6);
        r2.zaa(r5, r10);
        goto L_0x026f;
    L_0x01ea:
        r10 = r5.zapr;
        if (r10 == 0) goto L_0x01f9;
    L_0x01ee:
        r10 = zaqt;
        r10 = r1.zaa(r0, r10);
        r2.zaf(r5, r10);
        goto L_0x026f;
    L_0x01f9:
        r10 = r16.zai(r17);
        r2.zaa(r5, r10);
        goto L_0x026f;
    L_0x0202:
        r10 = r5.zapr;
        if (r10 == 0) goto L_0x0210;
    L_0x0206:
        r10 = zaqp;
        r10 = r1.zaa(r0, r10);
        r2.zae(r5, r10);
        goto L_0x026f;
    L_0x0210:
        r10 = r16.zah(r17);
        r2.zaa(r5, r10);
        goto L_0x026f;
    L_0x0218:
        r10 = r5.zapr;
        if (r10 == 0) goto L_0x0226;
    L_0x021c:
        r10 = zaqo;
        r10 = r1.zaa(r0, r10);
        r2.zad(r5, r10);
        goto L_0x026f;
    L_0x0226:
        r10 = r16.zag(r17);
        r2.zaa(r5, r10);
        goto L_0x026f;
    L_0x022e:
        r10 = r5.zapr;
        if (r10 == 0) goto L_0x023c;
    L_0x0232:
        r10 = zaqn;
        r10 = r1.zaa(r0, r10);
        r2.zac(r5, r10);
        goto L_0x026f;
    L_0x023c:
        r10 = r16.zae(r17);
        r2.zaa(r5, r10);
        goto L_0x026f;
    L_0x0244:
        r10 = r5.zapr;
        if (r10 == 0) goto L_0x0252;
    L_0x0248:
        r10 = zaqs;
        r10 = r1.zaa(r0, r10);
        r2.zab(r5, r10);
        goto L_0x026f;
    L_0x0252:
        r10 = r16.zaf(r17);
        r2.zaa(r5, r10);
        goto L_0x026f;
    L_0x025a:
        r10 = r5.zapr;
        if (r10 == 0) goto L_0x0268;
    L_0x025e:
        r10 = zaqm;
        r10 = r1.zaa(r0, r10);
        r2.zaa(r5, r10);
        goto L_0x026f;
    L_0x0268:
        r10 = r16.zad(r17);
        r2.zaa(r5, r10);
    L_0x026f:
        r5 = 4;
    L_0x0270:
        r1.zak(r5);
        r5 = 2;
        r1.zak(r5);
        r5 = r16.zaj(r17);
        if (r5 == r13) goto L_0x029b;
    L_0x027d:
        if (r5 != r14) goto L_0x0282;
    L_0x027f:
        r5 = r9;
        goto L_0x001d;
    L_0x0282:
        r0 = new com.google.android.gms.common.server.response.FastParser$ParseException;
        r2 = 55;
        r3 = new java.lang.StringBuilder;
        r3.<init>(r2);
        r2 = "Expected end of object or field separator, but found: ";
        r3.append(r2);
        r3.append(r5);
        r2 = r3.toString();
        r0.<init>(r2);
        throw r0;
    L_0x029b:
        r5 = r16.zaa(r17);
        goto L_0x001d;
    L_0x02a1:
        r1.zak(r7);
        return r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.server.response.FastParser.zaa(java.io.BufferedReader, com.google.android.gms.common.server.response.FastJsonResponse):boolean");
    }

    private final String zaa(BufferedReader bufferedReader) {
        this.zaql.push(Integer.valueOf(2));
        char zaj = zaj(bufferedReader);
        if (zaj == '\"') {
            this.zaql.push(Integer.valueOf(3));
            String zab = zab(bufferedReader, this.zaqb, this.zaqd, null);
            zak(3);
            if (zaj(bufferedReader) == ':') {
                return zab;
            }
            throw new ParseException("Expected key/value separator");
        } else if (zaj == ']') {
            zak(2);
            zak(1);
            zak(5);
            return null;
        } else if (zaj == '}') {
            zak(2);
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(19);
            stringBuilder.append("Unexpected token: ");
            stringBuilder.append(zaj);
            throw new ParseException(stringBuilder.toString());
        }
    }

    private final String zab(BufferedReader bufferedReader) {
        StringBuilder stringBuilder;
        BufferedReader bufferedReader2 = bufferedReader;
        bufferedReader2.mark(1024);
        char zaj = zaj(bufferedReader);
        String str = "Unexpected token ";
        int i;
        if (zaj == '\"') {
            String str2 = "Unexpected EOF while parsing string";
            if (bufferedReader2.read(this.zaqa) != -1) {
                zaj = this.zaqa[0];
                i = 0;
                while (true) {
                    if (zaj == '\"' && i == 0) {
                        break;
                    }
                    i = zaj == '\\' ? i ^ 1 : 0;
                    if (bufferedReader2.read(this.zaqa) != -1) {
                        zaj = this.zaqa[0];
                        if (Character.isISOControl(zaj)) {
                            throw new ParseException("Unexpected control character while reading string");
                        }
                    } else {
                        throw new ParseException(str2);
                    }
                }
            }
            throw new ParseException(str2);
        } else if (zaj != ',') {
            i = 1;
            if (zaj == '[') {
                this.zaql.push(Integer.valueOf(5));
                bufferedReader2.mark(32);
                if (zaj(bufferedReader) == ']') {
                    zak(5);
                } else {
                    bufferedReader.reset();
                    int i2 = 0;
                    int i3 = 0;
                    while (i > 0) {
                        char zaj2 = zaj(bufferedReader);
                        if (zaj2 == 0) {
                            throw new ParseException("Unexpected EOF while parsing array");
                        } else if (Character.isISOControl(zaj2)) {
                            throw new ParseException("Unexpected control character while reading array");
                        } else {
                            if (zaj2 == '\"' && i2 == 0) {
                                i3 ^= 1;
                            }
                            if (zaj2 == '[' && i3 == 0) {
                                i++;
                            }
                            if (zaj2 == ']' && i3 == 0) {
                                i--;
                            }
                            i2 = (zaj2 != '\\' || i3 == 0) ? 0 : i2 ^ 1;
                        }
                    }
                    zak(5);
                }
            } else if (zaj != '{') {
                bufferedReader.reset();
                zaa(bufferedReader2, this.zaqc);
            } else {
                this.zaql.push(Integer.valueOf(1));
                bufferedReader2.mark(32);
                zaj = zaj(bufferedReader);
                if (zaj == '}') {
                    zak(1);
                } else if (zaj == '\"') {
                    bufferedReader.reset();
                    zaa(bufferedReader);
                    do {
                    } while (zab(bufferedReader) != null);
                    zak(1);
                } else {
                    stringBuilder = new StringBuilder(18);
                    stringBuilder.append(str);
                    stringBuilder.append(zaj);
                    throw new ParseException(stringBuilder.toString());
                }
            }
        } else {
            throw new ParseException("Missing value");
        }
        zaj = zaj(bufferedReader);
        if (zaj == ',') {
            zak(2);
            return zaa(bufferedReader);
        } else if (zaj == '}') {
            zak(2);
            return null;
        } else {
            stringBuilder = new StringBuilder(18);
            stringBuilder.append(str);
            stringBuilder.append(zaj);
            throw new ParseException(stringBuilder.toString());
        }
    }

    private final String zac(BufferedReader bufferedReader) {
        return zaa(bufferedReader, this.zaqb, this.zaqd, null);
    }

    private final <O> ArrayList<O> zaa(BufferedReader bufferedReader, zaa<O> zaa) {
        char zaj = zaj(bufferedReader);
        if (zaj == 'n') {
            zab(bufferedReader, zaqf);
            return null;
        } else if (zaj == '[') {
            this.zaql.push(Integer.valueOf(5));
            ArrayList arrayList = new ArrayList();
            while (true) {
                bufferedReader.mark(1024);
                char zaj2 = zaj(bufferedReader);
                if (zaj2 == 0) {
                    throw new ParseException("Unexpected EOF");
                } else if (zaj2 != ',') {
                    if (zaj2 != ']') {
                        bufferedReader.reset();
                        arrayList.add(zaa.zah(this, bufferedReader));
                    } else {
                        zak(5);
                        return arrayList;
                    }
                }
            }
        } else {
            throw new ParseException("Expected start of array");
        }
    }

    private final String zaa(BufferedReader bufferedReader, char[] cArr, StringBuilder stringBuilder, char[] cArr2) {
        char zaj = zaj(bufferedReader);
        if (zaj == '\"') {
            return zab(bufferedReader, cArr, stringBuilder, cArr2);
        }
        if (zaj == 'n') {
            zab(bufferedReader, zaqf);
            return null;
        }
        throw new ParseException("Expected string");
    }

    private static String zab(BufferedReader bufferedReader, char[] cArr, StringBuilder stringBuilder, char[] cArr2) {
        stringBuilder.setLength(0);
        bufferedReader.mark(cArr.length);
        int i = 0;
        Object obj = null;
        while (true) {
            int read = bufferedReader.read(cArr);
            if (read != -1) {
                Object obj2 = obj;
                int i2 = i;
                for (i = 0; i < read; i++) {
                    char c = cArr[i];
                    if (Character.isISOControl(c)) {
                        Object obj3;
                        if (cArr2 != null) {
                            for (char c2 : cArr2) {
                                if (c2 == c) {
                                    obj3 = 1;
                                    break;
                                }
                            }
                        }
                        obj3 = null;
                        if (obj3 == null) {
                            throw new ParseException("Unexpected control character while reading string");
                        }
                    }
                    if (c == '\"' && i2 == 0) {
                        stringBuilder.append(cArr, 0, i);
                        bufferedReader.reset();
                        bufferedReader.skip((long) (i + 1));
                        if (obj2 != null) {
                            return JsonUtils.unescapeString(stringBuilder.toString());
                        }
                        return stringBuilder.toString();
                    }
                    if (c == '\\') {
                        i2 ^= 1;
                        obj2 = 1;
                    } else {
                        i2 = 0;
                    }
                }
                stringBuilder.append(cArr, 0, read);
                bufferedReader.mark(cArr.length);
                i = i2;
                obj = obj2;
            } else {
                throw new ParseException("Unexpected EOF while parsing string");
            }
        }
    }

    private final int zad(BufferedReader bufferedReader) {
        int zaa = zaa(bufferedReader, this.zaqc);
        if (zaa == 0) {
            return 0;
        }
        char[] cArr = this.zaqc;
        if (zaa > 0) {
            int i;
            Object obj;
            int i2;
            int i3;
            if (cArr[0] == '-') {
                i = 1;
                obj = 1;
                i2 = Integer.MIN_VALUE;
            } else {
                i = 0;
                obj = null;
                i2 = -2147483647;
            }
            String str = "Unexpected non-digit character";
            if (i < zaa) {
                i3 = i + 1;
                i = Character.digit(cArr[i], 10);
                if (i >= 0) {
                    i = -i;
                } else {
                    throw new ParseException(str);
                }
            }
            i3 = i;
            i = 0;
            while (i3 < zaa) {
                int i4 = i3 + 1;
                i3 = Character.digit(cArr[i3], 10);
                if (i3 >= 0) {
                    String str2 = "Number too large";
                    if (i >= -214748364) {
                        i *= 10;
                        if (i >= i2 + i3) {
                            i -= i3;
                            i3 = i4;
                        } else {
                            throw new ParseException(str2);
                        }
                    }
                    throw new ParseException(str2);
                }
                throw new ParseException(str);
            }
            if (obj == null) {
                return -i;
            }
            if (i3 > 1) {
                return i;
            }
            throw new ParseException("No digits to parse");
        }
        throw new ParseException("No number to parse");
    }

    private final long zae(BufferedReader bufferedReader) {
        int zaa = zaa(bufferedReader, this.zaqc);
        if (zaa == 0) {
            return 0;
        }
        char[] cArr = this.zaqc;
        if (zaa > 0) {
            long j;
            Object obj;
            int i;
            int digit;
            long j2;
            int i2 = 0;
            if (cArr[0] == '-') {
                j = Long.MIN_VALUE;
                i2 = 1;
                obj = 1;
            } else {
                j = -9223372036854775807L;
                obj = null;
            }
            String str = "Unexpected non-digit character";
            if (i2 < zaa) {
                i = i2 + 1;
                digit = Character.digit(cArr[i2], 10);
                if (digit >= 0) {
                    j2 = (long) (-digit);
                } else {
                    throw new ParseException(str);
                }
            }
            j2 = 0;
            i = i2;
            while (i < zaa) {
                digit = i + 1;
                i = Character.digit(cArr[i], 10);
                if (i >= 0) {
                    String str2 = "Number too large";
                    if (j2 >= -922337203685477580L) {
                        j2 *= 10;
                        long j3 = (long) i;
                        if (j2 >= j + j3) {
                            j2 -= j3;
                            i = digit;
                        } else {
                            throw new ParseException(str2);
                        }
                    }
                    throw new ParseException(str2);
                }
                throw new ParseException(str);
            }
            if (obj == null) {
                return -j2;
            }
            if (i > 1) {
                return j2;
            }
            throw new ParseException("No digits to parse");
        }
        throw new ParseException("No number to parse");
    }

    private final BigInteger zaf(BufferedReader bufferedReader) {
        int zaa = zaa(bufferedReader, this.zaqc);
        if (zaa == 0) {
            return null;
        }
        return new BigInteger(new String(this.zaqc, 0, zaa));
    }

    private final boolean zaa(BufferedReader bufferedReader, boolean z) {
        while (true) {
            char zaj = zaj(bufferedReader);
            if (zaj != '\"') {
                if (zaj == 'f') {
                    zab(bufferedReader, z ? zaqj : zaqi);
                    return false;
                } else if (zaj == 'n') {
                    zab(bufferedReader, zaqf);
                    return false;
                } else if (zaj == 't') {
                    zab(bufferedReader, z ? zaqh : zaqg);
                    return true;
                } else {
                    StringBuilder stringBuilder = new StringBuilder(19);
                    stringBuilder.append("Unexpected token: ");
                    stringBuilder.append(zaj);
                    throw new ParseException(stringBuilder.toString());
                }
            } else if (z) {
                throw new ParseException("No boolean value found in string");
            } else {
                z = true;
            }
        }
    }

    private final float zag(BufferedReader bufferedReader) {
        int zaa = zaa(bufferedReader, this.zaqc);
        if (zaa == 0) {
            return 0.0f;
        }
        return Float.parseFloat(new String(this.zaqc, 0, zaa));
    }

    private final double zah(BufferedReader bufferedReader) {
        int zaa = zaa(bufferedReader, this.zaqc);
        if (zaa == 0) {
            return 0.0d;
        }
        return Double.parseDouble(new String(this.zaqc, 0, zaa));
    }

    private final BigDecimal zai(BufferedReader bufferedReader) {
        int zaa = zaa(bufferedReader, this.zaqc);
        if (zaa == 0) {
            return null;
        }
        return new BigDecimal(new String(this.zaqc, 0, zaa));
    }

    private final <T extends FastJsonResponse> ArrayList<T> zaa(BufferedReader bufferedReader, Field<?, ?> field) {
        String str = "Error instantiating inner object";
        ArrayList arrayList = new ArrayList();
        char zaj = zaj(bufferedReader);
        if (zaj == ']') {
            zak(5);
            return arrayList;
        } else if (zaj != 'n') {
            String str2 = "Unexpected token: ";
            StringBuilder stringBuilder;
            if (zaj == '{') {
                this.zaql.push(Integer.valueOf(1));
                while (true) {
                    try {
                        FastJsonResponse zacp = field.zacp();
                        if (!zaa(bufferedReader, zacp)) {
                            return arrayList;
                        }
                        arrayList.add(zacp);
                        zaj = zaj(bufferedReader);
                        if (zaj != ',') {
                            if (zaj == ']') {
                                zak(5);
                                return arrayList;
                            }
                            stringBuilder = new StringBuilder(19);
                            stringBuilder.append(str2);
                            stringBuilder.append(zaj);
                            throw new ParseException(stringBuilder.toString());
                        } else if (zaj(bufferedReader) == '{') {
                            this.zaql.push(Integer.valueOf(1));
                        } else {
                            throw new ParseException("Expected start of next object in array");
                        }
                    } catch (InstantiationException e) {
                        throw new ParseException(str, e);
                    } catch (IllegalAccessException e2) {
                        throw new ParseException(str, e2);
                    }
                }
            }
            stringBuilder = new StringBuilder(19);
            stringBuilder.append(str2);
            stringBuilder.append(zaj);
            throw new ParseException(stringBuilder.toString());
        } else {
            zab(bufferedReader, zaqf);
            zak(5);
            return null;
        }
    }

    private final char zaj(BufferedReader bufferedReader) {
        if (bufferedReader.read(this.zaqa) == -1) {
            return 0;
        }
        while (Character.isWhitespace(this.zaqa[0])) {
            if (bufferedReader.read(this.zaqa) == -1) {
                return 0;
            }
        }
        return this.zaqa[0];
    }

    private final int zaa(BufferedReader bufferedReader, char[] cArr) {
        char zaj = zaj(bufferedReader);
        String str = "Unexpected EOF";
        if (zaj == 0) {
            throw new ParseException(str);
        } else if (zaj == ',') {
            throw new ParseException("Missing value");
        } else if (zaj == 'n') {
            zab(bufferedReader, zaqf);
            return 0;
        } else {
            int i;
            bufferedReader.mark(1024);
            if (zaj == '\"') {
                i = 0;
                int i2 = 0;
                while (i < cArr.length && bufferedReader.read(cArr, i, 1) != -1) {
                    char c = cArr[i];
                    if (Character.isISOControl(c)) {
                        throw new ParseException("Unexpected control character while reading string");
                    } else if (c == '\"' && i2 == 0) {
                        bufferedReader.reset();
                        bufferedReader.skip((long) (i + 1));
                        return i;
                    } else {
                        i2 = c == '\\' ? i2 ^ 1 : 0;
                        i++;
                    }
                }
            } else {
                cArr[0] = zaj;
                i = 1;
                while (i < cArr.length && bufferedReader.read(cArr, i, 1) != -1) {
                    if (cArr[i] == '}' || cArr[i] == ',' || Character.isWhitespace(cArr[i]) || cArr[i] == ']') {
                        bufferedReader.reset();
                        bufferedReader.skip((long) (i - 1));
                        cArr[i] = 0;
                        return i;
                    }
                    i++;
                }
            }
            if (i == cArr.length) {
                throw new ParseException("Absurdly long value");
            }
            throw new ParseException(str);
        }
    }

    private final void zab(BufferedReader bufferedReader, char[] cArr) {
        int i = 0;
        while (i < cArr.length) {
            int read = bufferedReader.read(this.zaqb, 0, cArr.length - i);
            if (read != -1) {
                int i2 = 0;
                while (i2 < read) {
                    if (cArr[i2 + i] == this.zaqb[i2]) {
                        i2++;
                    } else {
                        throw new ParseException("Unexpected character");
                    }
                }
                i += read;
            } else {
                throw new ParseException("Unexpected EOF");
            }
        }
    }

    private final void zak(int i) {
        String str = "Expected state ";
        if (this.zaql.isEmpty()) {
            StringBuilder stringBuilder = new StringBuilder(46);
            stringBuilder.append(str);
            stringBuilder.append(i);
            stringBuilder.append(" but had empty stack");
            throw new ParseException(stringBuilder.toString());
        }
        int intValue = ((Integer) this.zaql.pop()).intValue();
        if (intValue != i) {
            StringBuilder stringBuilder2 = new StringBuilder(46);
            stringBuilder2.append(str);
            stringBuilder2.append(i);
            stringBuilder2.append(" but had ");
            stringBuilder2.append(intValue);
            throw new ParseException(stringBuilder2.toString());
        }
    }
}
