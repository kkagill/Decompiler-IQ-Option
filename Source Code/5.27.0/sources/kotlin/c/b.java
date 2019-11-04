package kotlin.c;

import kotlin.TypeCastException;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0001\u001a\"\u0010\b\u001a\u0002H\t\"\n\b\u0000\u0010\t\u0018\u0001*\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\b¢\u0006\u0002\u0010\f\u001a\b\u0010\r\u001a\u00020\u0005H\u0002\"\u0010\u0010\u0000\u001a\u00020\u00018\u0000X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, bng = {"IMPLEMENTATIONS", "Lkotlin/internal/PlatformImplementations;", "apiVersionIsAtLeast", "", "major", "", "minor", "patch", "castToBaseType", "T", "", "instance", "(Ljava/lang/Object;)Ljava/lang/Object;", "getJavaVersion", "kotlin-stdlib"})
/* compiled from: PlatformImplementations.kt */
public final class b {
    public static final a eVU;

    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0060 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x0100 */
    static {
        /*
        r0 = bnv();
        r1 = "ClassCastException(\"Inst…baseTypeCL\").initCause(e)";
        r2 = ", base type classloader: ";
        r3 = "Instance classloader: ";
        r4 = "null cannot be cast to non-null type kotlin.internal.PlatformImplementations";
        r5 = "Class.forName(\"kotlin.in…entations\").newInstance()";
        r6 = 65544; // 0x10008 float:9.1847E-41 double:3.2383E-319;
        if (r0 < r6) goto L_0x00ad;
    L_0x0013:
        r6 = "kotlin.internal.jdk8.JDK8PlatformImplementations";
        r6 = java.lang.Class.forName(r6);	 Catch:{ ClassNotFoundException -> 0x0060 }
        r6 = r6.newInstance();	 Catch:{ ClassNotFoundException -> 0x0060 }
        kotlin.jvm.internal.i.e(r6, r5);	 Catch:{ ClassNotFoundException -> 0x0060 }
        if (r6 == 0) goto L_0x0028;
    L_0x0022:
        r6 = (kotlin.c.a) r6;	 Catch:{ ClassCastException -> 0x0026 }
        goto L_0x0152;
    L_0x0026:
        r7 = move-exception;
        goto L_0x002e;
    L_0x0028:
        r7 = new kotlin.TypeCastException;	 Catch:{ ClassCastException -> 0x0026 }
        r7.<init>(r4);	 Catch:{ ClassCastException -> 0x0026 }
        throw r7;	 Catch:{ ClassCastException -> 0x0026 }
    L_0x002e:
        r6 = r6.getClass();	 Catch:{ ClassNotFoundException -> 0x0060 }
        r6 = r6.getClassLoader();	 Catch:{ ClassNotFoundException -> 0x0060 }
        r8 = kotlin.c.a.class;
        r8 = r8.getClassLoader();	 Catch:{ ClassNotFoundException -> 0x0060 }
        r9 = new java.lang.ClassCastException;	 Catch:{ ClassNotFoundException -> 0x0060 }
        r10 = new java.lang.StringBuilder;	 Catch:{ ClassNotFoundException -> 0x0060 }
        r10.<init>();	 Catch:{ ClassNotFoundException -> 0x0060 }
        r10.append(r3);	 Catch:{ ClassNotFoundException -> 0x0060 }
        r10.append(r6);	 Catch:{ ClassNotFoundException -> 0x0060 }
        r10.append(r2);	 Catch:{ ClassNotFoundException -> 0x0060 }
        r10.append(r8);	 Catch:{ ClassNotFoundException -> 0x0060 }
        r6 = r10.toString();	 Catch:{ ClassNotFoundException -> 0x0060 }
        r9.<init>(r6);	 Catch:{ ClassNotFoundException -> 0x0060 }
        r7 = (java.lang.Throwable) r7;	 Catch:{ ClassNotFoundException -> 0x0060 }
        r6 = r9.initCause(r7);	 Catch:{ ClassNotFoundException -> 0x0060 }
        kotlin.jvm.internal.i.e(r6, r1);	 Catch:{ ClassNotFoundException -> 0x0060 }
        throw r6;	 Catch:{ ClassNotFoundException -> 0x0060 }
    L_0x0060:
        r6 = "kotlin.internal.JRE8PlatformImplementations";
        r6 = java.lang.Class.forName(r6);	 Catch:{ ClassNotFoundException -> 0x00ad }
        r6 = r6.newInstance();	 Catch:{ ClassNotFoundException -> 0x00ad }
        kotlin.jvm.internal.i.e(r6, r5);	 Catch:{ ClassNotFoundException -> 0x00ad }
        if (r6 == 0) goto L_0x0075;
    L_0x006f:
        r6 = (kotlin.c.a) r6;	 Catch:{ ClassCastException -> 0x0073 }
        goto L_0x0152;
    L_0x0073:
        r7 = move-exception;
        goto L_0x007b;
    L_0x0075:
        r7 = new kotlin.TypeCastException;	 Catch:{ ClassCastException -> 0x0073 }
        r7.<init>(r4);	 Catch:{ ClassCastException -> 0x0073 }
        throw r7;	 Catch:{ ClassCastException -> 0x0073 }
    L_0x007b:
        r6 = r6.getClass();	 Catch:{ ClassNotFoundException -> 0x00ad }
        r6 = r6.getClassLoader();	 Catch:{ ClassNotFoundException -> 0x00ad }
        r8 = kotlin.c.a.class;
        r8 = r8.getClassLoader();	 Catch:{ ClassNotFoundException -> 0x00ad }
        r9 = new java.lang.ClassCastException;	 Catch:{ ClassNotFoundException -> 0x00ad }
        r10 = new java.lang.StringBuilder;	 Catch:{ ClassNotFoundException -> 0x00ad }
        r10.<init>();	 Catch:{ ClassNotFoundException -> 0x00ad }
        r10.append(r3);	 Catch:{ ClassNotFoundException -> 0x00ad }
        r10.append(r6);	 Catch:{ ClassNotFoundException -> 0x00ad }
        r10.append(r2);	 Catch:{ ClassNotFoundException -> 0x00ad }
        r10.append(r8);	 Catch:{ ClassNotFoundException -> 0x00ad }
        r6 = r10.toString();	 Catch:{ ClassNotFoundException -> 0x00ad }
        r9.<init>(r6);	 Catch:{ ClassNotFoundException -> 0x00ad }
        r7 = (java.lang.Throwable) r7;	 Catch:{ ClassNotFoundException -> 0x00ad }
        r6 = r9.initCause(r7);	 Catch:{ ClassNotFoundException -> 0x00ad }
        kotlin.jvm.internal.i.e(r6, r1);	 Catch:{ ClassNotFoundException -> 0x00ad }
        throw r6;	 Catch:{ ClassNotFoundException -> 0x00ad }
    L_0x00ad:
        r6 = 65543; // 0x10007 float:9.1845E-41 double:3.23825E-319;
        if (r0 < r6) goto L_0x014d;
    L_0x00b2:
        r0 = "kotlin.c.a.a";
        r0 = java.lang.Class.forName(r0);	 Catch:{ ClassNotFoundException -> 0x0100 }
        r0 = r0.newInstance();	 Catch:{ ClassNotFoundException -> 0x0100 }
        kotlin.jvm.internal.i.e(r0, r5);	 Catch:{ ClassNotFoundException -> 0x0100 }
        if (r0 == 0) goto L_0x00c8;
    L_0x00c1:
        r6 = r0;
        r6 = (kotlin.c.a) r6;	 Catch:{ ClassCastException -> 0x00c6 }
        goto L_0x0152;
    L_0x00c6:
        r6 = move-exception;
        goto L_0x00ce;
    L_0x00c8:
        r6 = new kotlin.TypeCastException;	 Catch:{ ClassCastException -> 0x00c6 }
        r6.<init>(r4);	 Catch:{ ClassCastException -> 0x00c6 }
        throw r6;	 Catch:{ ClassCastException -> 0x00c6 }
    L_0x00ce:
        r0 = r0.getClass();	 Catch:{ ClassNotFoundException -> 0x0100 }
        r0 = r0.getClassLoader();	 Catch:{ ClassNotFoundException -> 0x0100 }
        r7 = kotlin.c.a.class;
        r7 = r7.getClassLoader();	 Catch:{ ClassNotFoundException -> 0x0100 }
        r8 = new java.lang.ClassCastException;	 Catch:{ ClassNotFoundException -> 0x0100 }
        r9 = new java.lang.StringBuilder;	 Catch:{ ClassNotFoundException -> 0x0100 }
        r9.<init>();	 Catch:{ ClassNotFoundException -> 0x0100 }
        r9.append(r3);	 Catch:{ ClassNotFoundException -> 0x0100 }
        r9.append(r0);	 Catch:{ ClassNotFoundException -> 0x0100 }
        r9.append(r2);	 Catch:{ ClassNotFoundException -> 0x0100 }
        r9.append(r7);	 Catch:{ ClassNotFoundException -> 0x0100 }
        r0 = r9.toString();	 Catch:{ ClassNotFoundException -> 0x0100 }
        r8.<init>(r0);	 Catch:{ ClassNotFoundException -> 0x0100 }
        r6 = (java.lang.Throwable) r6;	 Catch:{ ClassNotFoundException -> 0x0100 }
        r0 = r8.initCause(r6);	 Catch:{ ClassNotFoundException -> 0x0100 }
        kotlin.jvm.internal.i.e(r0, r1);	 Catch:{ ClassNotFoundException -> 0x0100 }
        throw r0;	 Catch:{ ClassNotFoundException -> 0x0100 }
    L_0x0100:
        r0 = "kotlin.internal.JRE7PlatformImplementations";
        r0 = java.lang.Class.forName(r0);	 Catch:{ ClassNotFoundException -> 0x014d }
        r0 = r0.newInstance();	 Catch:{ ClassNotFoundException -> 0x014d }
        kotlin.jvm.internal.i.e(r0, r5);	 Catch:{ ClassNotFoundException -> 0x014d }
        if (r0 == 0) goto L_0x0115;
    L_0x010f:
        r6 = r0;
        r6 = (kotlin.c.a) r6;	 Catch:{ ClassCastException -> 0x0113 }
        goto L_0x0152;
    L_0x0113:
        r4 = move-exception;
        goto L_0x011b;
    L_0x0115:
        r5 = new kotlin.TypeCastException;	 Catch:{ ClassCastException -> 0x0113 }
        r5.<init>(r4);	 Catch:{ ClassCastException -> 0x0113 }
        throw r5;	 Catch:{ ClassCastException -> 0x0113 }
    L_0x011b:
        r0 = r0.getClass();	 Catch:{ ClassNotFoundException -> 0x014d }
        r0 = r0.getClassLoader();	 Catch:{ ClassNotFoundException -> 0x014d }
        r5 = kotlin.c.a.class;
        r5 = r5.getClassLoader();	 Catch:{ ClassNotFoundException -> 0x014d }
        r6 = new java.lang.ClassCastException;	 Catch:{ ClassNotFoundException -> 0x014d }
        r7 = new java.lang.StringBuilder;	 Catch:{ ClassNotFoundException -> 0x014d }
        r7.<init>();	 Catch:{ ClassNotFoundException -> 0x014d }
        r7.append(r3);	 Catch:{ ClassNotFoundException -> 0x014d }
        r7.append(r0);	 Catch:{ ClassNotFoundException -> 0x014d }
        r7.append(r2);	 Catch:{ ClassNotFoundException -> 0x014d }
        r7.append(r5);	 Catch:{ ClassNotFoundException -> 0x014d }
        r0 = r7.toString();	 Catch:{ ClassNotFoundException -> 0x014d }
        r6.<init>(r0);	 Catch:{ ClassNotFoundException -> 0x014d }
        r4 = (java.lang.Throwable) r4;	 Catch:{ ClassNotFoundException -> 0x014d }
        r0 = r6.initCause(r4);	 Catch:{ ClassNotFoundException -> 0x014d }
        kotlin.jvm.internal.i.e(r0, r1);	 Catch:{ ClassNotFoundException -> 0x014d }
        throw r0;	 Catch:{ ClassNotFoundException -> 0x014d }
    L_0x014d:
        r6 = new kotlin.c.a;
        r6.<init>();
    L_0x0152:
        eVU = r6;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.c.b.<clinit>():void");
    }

    private static final int bnv() {
        String property = System.getProperty("java.specification.version");
        int i = 65542;
        if (property == null) {
            return 65542;
        }
        CharSequence charSequence = property;
        int a = v.a(charSequence, '.', 0, false, 6, null);
        if (a < 0) {
            try {
                i = Integer.parseInt(property) * 65536;
            } catch (NumberFormatException unused) {
            }
            return i;
        }
        int i2 = a + 1;
        int a2 = v.a(charSequence, '.', i2, false, 4, null);
        if (a2 < 0) {
            a2 = property.length();
        }
        String str = "null cannot be cast to non-null type java.lang.String";
        if (property != null) {
            String substring = property.substring(0, a);
            String str2 = "(this as java.lang.Strin…ing(startIndex, endIndex)";
            kotlin.jvm.internal.i.e(substring, str2);
            if (property != null) {
                property = property.substring(i2, a2);
                kotlin.jvm.internal.i.e(property, str2);
                try {
                    i = (Integer.parseInt(substring) * 65536) + Integer.parseInt(property);
                } catch (NumberFormatException unused2) {
                }
                return i;
            }
            throw new TypeCastException(str);
        }
        throw new TypeCastException(str);
    }
}
