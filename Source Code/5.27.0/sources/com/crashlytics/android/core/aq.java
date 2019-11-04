package com.crashlytics.android.core;

import android.app.ActivityManager.RunningAppProcessInfo;
import io.fabric.sdk.android.c;
import io.fabric.sdk.android.services.common.IdManager.DeviceIdentifierType;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* compiled from: SessionProtobufHelper */
class aq {
    private static final d rZ = d.ar("0");
    private static final d sb = d.ar("Unity");

    public static void a(CodedOutputStream codedOutputStream, String str, String str2, long j) {
        codedOutputStream.a(1, d.ar(str2));
        codedOutputStream.a(2, d.ar(str));
        codedOutputStream.a(3, j);
    }

    public static void a(CodedOutputStream codedOutputStream, String str, String str2, String str3, String str4, String str5, int i, String str6) {
        d ar = d.ar(str);
        d ar2 = d.ar(str2);
        d ar3 = d.ar(str3);
        d ar4 = d.ar(str4);
        d ar5 = d.ar(str5);
        d ar6 = str6 != null ? d.ar(str6) : null;
        codedOutputStream.h(7, 2);
        codedOutputStream.K(a(ar, ar2, ar3, ar4, ar5, i, ar6));
        codedOutputStream.a(1, ar);
        codedOutputStream.a(2, ar3);
        codedOutputStream.a(3, ar4);
        codedOutputStream.h(5, 2);
        codedOutputStream.K(d(ar2));
        codedOutputStream.a(1, ar2);
        codedOutputStream.a(6, ar5);
        if (ar6 != null) {
            codedOutputStream.a(8, sb);
            codedOutputStream.a(9, ar6);
        }
        codedOutputStream.c(10, i);
    }

    public static void a(CodedOutputStream codedOutputStream, String str, String str2, boolean z) {
        d ar = d.ar(str);
        d ar2 = d.ar(str2);
        codedOutputStream.h(8, 2);
        codedOutputStream.K(a(ar, ar2, z));
        codedOutputStream.c(1, 3);
        codedOutputStream.a(2, ar);
        codedOutputStream.a(3, ar2);
        codedOutputStream.c(4, z);
    }

    public static void a(CodedOutputStream codedOutputStream, int i, String str, int i2, long j, long j2, boolean z, Map<DeviceIdentifierType, String> map, int i3, String str2, String str3) {
        CodedOutputStream codedOutputStream2 = codedOutputStream;
        d aJ = aJ(str);
        d aJ2 = aJ(str3);
        d aJ3 = aJ(str2);
        codedOutputStream2.h(9, 2);
        d dVar = aJ3;
        codedOutputStream2.K(a(i, aJ, i2, j, j2, z, map, i3, aJ3, aJ2));
        codedOutputStream2.c(3, i);
        codedOutputStream2.a(4, aJ);
        codedOutputStream2.b(5, i2);
        codedOutputStream2.a(6, j);
        codedOutputStream2.a(7, j2);
        codedOutputStream2.c(10, z);
        for (Entry entry : map.entrySet()) {
            codedOutputStream2.h(11, 2);
            codedOutputStream2.K(a((DeviceIdentifierType) entry.getKey(), (String) entry.getValue()));
            codedOutputStream2.c(1, ((DeviceIdentifierType) entry.getKey()).protobufIndex);
            codedOutputStream2.a(2, d.ar((String) entry.getValue()));
        }
        codedOutputStream2.b(12, i3);
        if (dVar != null) {
            codedOutputStream2.a(13, dVar);
        }
        if (aJ2 != null) {
            codedOutputStream2.a(14, aJ2);
        }
    }

    public static void a(CodedOutputStream codedOutputStream, String str, String str2, String str3) {
        if (str == null) {
            str = "";
        }
        d ar = d.ar(str);
        d aJ = aJ(str2);
        d aJ2 = aJ(str3);
        int b = CodedOutputStream.b(1, ar) + 0;
        if (str2 != null) {
            b += CodedOutputStream.b(2, aJ);
        }
        if (str3 != null) {
            b += CodedOutputStream.b(3, aJ2);
        }
        codedOutputStream.h(6, 2);
        codedOutputStream.K(b);
        codedOutputStream.a(1, ar);
        if (str2 != null) {
            codedOutputStream.a(2, aJ);
        }
        if (str3 != null) {
            codedOutputStream.a(3, aJ2);
        }
    }

    public static void a(CodedOutputStream codedOutputStream, long j, String str, au auVar, Thread thread, StackTraceElement[] stackTraceElementArr, Thread[] threadArr, List<StackTraceElement[]> list, Map<String, String> map, aa aaVar, RunningAppProcessInfo runningAppProcessInfo, int i, String str2, String str3, Float f, int i2, boolean z, long j2, long j3) {
        d dVar;
        CodedOutputStream codedOutputStream2 = codedOutputStream;
        String str4 = str3;
        d ar = d.ar(str2);
        if (str4 == null) {
            dVar = null;
        } else {
            dVar = d.ar(str4.replace("-", ""));
        }
        d dVar2 = dVar;
        d fM = aaVar.fM();
        if (fM == null) {
            c.biX().d("CrashlyticsCore", "No log data to include with this event.");
        }
        aaVar.fO();
        codedOutputStream2.h(10, 2);
        codedOutputStream2.K(a(j, str, auVar, thread, stackTraceElementArr, threadArr, (List) list, 8, (Map) map, runningAppProcessInfo, i, ar, dVar2, f, i2, z, j2, j3, fM));
        codedOutputStream2.a(1, j);
        codedOutputStream2.a(2, d.ar(str));
        d dVar3 = fM;
        a(codedOutputStream, auVar, thread, stackTraceElementArr, threadArr, list, 8, ar, dVar2, map, runningAppProcessInfo, i);
        a(codedOutputStream, f, i2, z, i, j2, j3);
        a(codedOutputStream2, dVar3);
    }

    private static void a(CodedOutputStream codedOutputStream, au auVar, Thread thread, StackTraceElement[] stackTraceElementArr, Thread[] threadArr, List<StackTraceElement[]> list, int i, d dVar, d dVar2, Map<String, String> map, RunningAppProcessInfo runningAppProcessInfo, int i2) {
        codedOutputStream.h(3, 2);
        codedOutputStream.K(a(auVar, thread, stackTraceElementArr, threadArr, (List) list, i, dVar, dVar2, (Map) map, runningAppProcessInfo, i2));
        a(codedOutputStream, auVar, thread, stackTraceElementArr, threadArr, list, i, dVar, dVar2);
        if (!(map == null || map.isEmpty())) {
            a(codedOutputStream, (Map) map);
        }
        if (runningAppProcessInfo != null) {
            codedOutputStream.c(3, runningAppProcessInfo.importance != 100);
        }
        codedOutputStream.b(4, i2);
    }

    private static void a(CodedOutputStream codedOutputStream, au auVar, Thread thread, StackTraceElement[] stackTraceElementArr, Thread[] threadArr, List<StackTraceElement[]> list, int i, d dVar, d dVar2) {
        codedOutputStream.h(1, 2);
        codedOutputStream.K(a(auVar, thread, stackTraceElementArr, threadArr, (List) list, i, dVar, dVar2));
        a(codedOutputStream, thread, stackTraceElementArr, 4, true);
        int length = threadArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            a(codedOutputStream, threadArr[i2], (StackTraceElement[]) list.get(i2), 0, false);
        }
        a(codedOutputStream, auVar, 1, i, 2);
        codedOutputStream.h(3, 2);
        codedOutputStream.K(fX());
        codedOutputStream.a(1, rZ);
        codedOutputStream.a(2, rZ);
        codedOutputStream.a(3, 0);
        codedOutputStream.h(4, 2);
        codedOutputStream.K(a(dVar, dVar2));
        codedOutputStream.a(1, 0);
        codedOutputStream.a(2, 0);
        codedOutputStream.a(3, dVar);
        if (dVar2 != null) {
            codedOutputStream.a(4, dVar2);
        }
    }

    private static void a(CodedOutputStream codedOutputStream, Map<String, String> map) {
        for (Entry entry : map.entrySet()) {
            codedOutputStream.h(2, 2);
            codedOutputStream.K(x((String) entry.getKey(), (String) entry.getValue()));
            codedOutputStream.a(1, d.ar((String) entry.getKey()));
            String str = (String) entry.getValue();
            if (str == null) {
                str = "";
            }
            codedOutputStream.a(2, d.ar(str));
        }
    }

    private static void a(CodedOutputStream codedOutputStream, au auVar, int i, int i2, int i3) {
        codedOutputStream.h(i3, 2);
        codedOutputStream.K(a(auVar, 1, i2));
        codedOutputStream.a(1, d.ar(auVar.className));
        String str = auVar.sc;
        if (str != null) {
            codedOutputStream.a(3, d.ar(str));
        }
        int i4 = 0;
        for (StackTraceElement a : auVar.sd) {
            a(codedOutputStream, 4, a, true);
        }
        auVar = auVar.se;
        if (auVar == null) {
            return;
        }
        if (i < i2) {
            a(codedOutputStream, auVar, i + 1, i2, 6);
            return;
        }
        while (auVar != null) {
            auVar = auVar.se;
            i4++;
        }
        codedOutputStream.b(7, i4);
    }

    private static void a(CodedOutputStream codedOutputStream, Thread thread, StackTraceElement[] stackTraceElementArr, int i, boolean z) {
        codedOutputStream.h(1, 2);
        codedOutputStream.K(a(thread, stackTraceElementArr, i, z));
        codedOutputStream.a(1, d.ar(thread.getName()));
        codedOutputStream.b(2, i);
        for (StackTraceElement a : stackTraceElementArr) {
            a(codedOutputStream, 3, a, z);
        }
    }

    private static void a(CodedOutputStream codedOutputStream, int i, StackTraceElement stackTraceElement, boolean z) {
        codedOutputStream.h(i, 2);
        codedOutputStream.K(a(stackTraceElement, z));
        if (stackTraceElement.isNativeMethod()) {
            codedOutputStream.a(1, (long) Math.max(stackTraceElement.getLineNumber(), 0));
        } else {
            codedOutputStream.a(1, 0);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(stackTraceElement.getClassName());
        stringBuilder.append(".");
        stringBuilder.append(stackTraceElement.getMethodName());
        codedOutputStream.a(2, d.ar(stringBuilder.toString()));
        if (stackTraceElement.getFileName() != null) {
            codedOutputStream.a(3, d.ar(stackTraceElement.getFileName()));
        }
        int i2 = 4;
        if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
            codedOutputStream.a(4, (long) stackTraceElement.getLineNumber());
        }
        if (!z) {
            i2 = 0;
        }
        codedOutputStream.b(5, i2);
    }

    private static void a(CodedOutputStream codedOutputStream, Float f, int i, boolean z, int i2, long j, long j2) {
        codedOutputStream.h(5, 2);
        codedOutputStream.K(a(f, i, z, i2, j, j2));
        if (f != null) {
            codedOutputStream.a(1, f.floatValue());
        }
        codedOutputStream.d(2, i);
        codedOutputStream.c(3, z);
        codedOutputStream.b(4, i2);
        codedOutputStream.a(5, j);
        codedOutputStream.a(6, j2);
    }

    private static void a(CodedOutputStream codedOutputStream, d dVar) {
        if (dVar != null) {
            codedOutputStream.h(6, 2);
            codedOutputStream.K(e(dVar));
            codedOutputStream.a(1, dVar);
        }
    }

    private static int a(d dVar, d dVar2, d dVar3, d dVar4, d dVar5, int i, d dVar6) {
        int b = ((CodedOutputStream.b(1, dVar) + 0) + CodedOutputStream.b(2, dVar3)) + CodedOutputStream.b(3, dVar4);
        int d = d(dVar2);
        b = (b + ((CodedOutputStream.J(5) + CodedOutputStream.L(d)) + d)) + CodedOutputStream.b(6, dVar5);
        if (dVar6 != null) {
            b = (b + CodedOutputStream.b(8, sb)) + CodedOutputStream.b(9, dVar6);
        }
        return b + CodedOutputStream.f(10, i);
    }

    private static int d(d dVar) {
        return CodedOutputStream.b(1, dVar) + 0;
    }

    private static int a(d dVar, d dVar2, boolean z) {
        return (((CodedOutputStream.f(1, 3) + 0) + CodedOutputStream.b(2, dVar)) + CodedOutputStream.b(3, dVar2)) + CodedOutputStream.d(4, z);
    }

    private static int a(DeviceIdentifierType deviceIdentifierType, String str) {
        return CodedOutputStream.f(1, deviceIdentifierType.protobufIndex) + CodedOutputStream.b(2, d.ar(str));
    }

    private static int a(int i, d dVar, int i2, long j, long j2, boolean z, Map<DeviceIdentifierType, String> map, int i3, d dVar2, d dVar3) {
        int i4;
        int i5 = 0;
        i = CodedOutputStream.f(3, i) + 0;
        if (dVar == null) {
            i4 = 0;
        } else {
            i4 = CodedOutputStream.b(4, dVar);
        }
        i = ((((i + i4) + CodedOutputStream.e(5, i2)) + CodedOutputStream.b(6, j)) + CodedOutputStream.b(7, j2)) + CodedOutputStream.d(10, z);
        if (map != null) {
            for (Entry entry : map.entrySet()) {
                i2 = a((DeviceIdentifierType) entry.getKey(), (String) entry.getValue());
                i += (CodedOutputStream.J(11) + CodedOutputStream.L(i2)) + i2;
            }
        }
        i += CodedOutputStream.e(12, i3);
        if (dVar2 == null) {
            i4 = 0;
        } else {
            i4 = CodedOutputStream.b(13, dVar2);
        }
        i += i4;
        if (dVar3 != null) {
            i5 = CodedOutputStream.b(14, dVar3);
        }
        return i + i5;
    }

    private static int a(d dVar, d dVar2) {
        int b = ((CodedOutputStream.b(1, 0) + 0) + CodedOutputStream.b(2, 0)) + CodedOutputStream.b(3, dVar);
        return dVar2 != null ? b + CodedOutputStream.b(4, dVar2) : b;
    }

    private static int a(long j, String str, au auVar, Thread thread, StackTraceElement[] stackTraceElementArr, Thread[] threadArr, List<StackTraceElement[]> list, int i, Map<String, String> map, RunningAppProcessInfo runningAppProcessInfo, int i2, d dVar, d dVar2, Float f, int i3, boolean z, long j2, long j3, d dVar3) {
        long j4 = j;
        int b = (CodedOutputStream.b(1, j) + 0) + CodedOutputStream.b(2, d.ar(str));
        int a = a(auVar, thread, stackTraceElementArr, threadArr, (List) list, i, dVar, dVar2, (Map) map, runningAppProcessInfo, i2);
        b += (CodedOutputStream.J(3) + CodedOutputStream.L(a)) + a;
        a = a(f, i3, z, i2, j2, j3);
        b += (CodedOutputStream.J(5) + CodedOutputStream.L(a)) + a;
        if (dVar3 == null) {
            return b;
        }
        a = e(dVar3);
        return b + ((CodedOutputStream.J(6) + CodedOutputStream.L(a)) + a);
    }

    private static int a(au auVar, Thread thread, StackTraceElement[] stackTraceElementArr, Thread[] threadArr, List<StackTraceElement[]> list, int i, d dVar, d dVar2, Map<String, String> map, RunningAppProcessInfo runningAppProcessInfo, int i2) {
        int a = a(auVar, thread, stackTraceElementArr, threadArr, (List) list, i, dVar, dVar2);
        int J = (CodedOutputStream.J(1) + CodedOutputStream.L(a)) + a;
        boolean z = false;
        J += 0;
        if (map != null) {
            for (Entry entry : map.entrySet()) {
                int x = x((String) entry.getKey(), (String) entry.getValue());
                J += (CodedOutputStream.J(2) + CodedOutputStream.L(x)) + x;
            }
        }
        if (runningAppProcessInfo != null) {
            if (runningAppProcessInfo.importance != 100) {
                z = true;
            }
            J += CodedOutputStream.d(3, z);
        }
        return J + CodedOutputStream.e(4, i2);
    }

    private static int a(au auVar, Thread thread, StackTraceElement[] stackTraceElementArr, Thread[] threadArr, List<StackTraceElement[]> list, int i, d dVar, d dVar2) {
        int a = a(thread, stackTraceElementArr, 4, true);
        int J = ((CodedOutputStream.J(1) + CodedOutputStream.L(a)) + a) + 0;
        int length = threadArr.length;
        int i2 = J;
        for (J = 0; J < length; J++) {
            int a2 = a(threadArr[J], (StackTraceElement[]) list.get(J), 0, false);
            i2 += (CodedOutputStream.J(1) + CodedOutputStream.L(a2)) + a2;
        }
        int a3 = a(auVar, 1, i);
        i2 += (CodedOutputStream.J(2) + CodedOutputStream.L(a3)) + a3;
        a3 = fX();
        i2 += (CodedOutputStream.J(3) + CodedOutputStream.L(a3)) + a3;
        a3 = a(dVar, dVar2);
        return i2 + ((CodedOutputStream.J(3) + CodedOutputStream.L(a3)) + a3);
    }

    private static int x(String str, String str2) {
        int b = CodedOutputStream.b(1, d.ar(str));
        if (str2 == null) {
            str2 = "";
        }
        return b + CodedOutputStream.b(2, d.ar(str2));
    }

    private static int a(Float f, int i, boolean z, int i2, long j, long j2) {
        int i3 = 0;
        if (f != null) {
            i3 = 0 + CodedOutputStream.b(1, f.floatValue());
        }
        return ((((i3 + CodedOutputStream.g(2, i)) + CodedOutputStream.d(3, z)) + CodedOutputStream.e(4, i2)) + CodedOutputStream.b(5, j)) + CodedOutputStream.b(6, j2);
    }

    private static int e(d dVar) {
        return CodedOutputStream.b(1, dVar);
    }

    private static int a(au auVar, int i, int i2) {
        int i3 = 0;
        int b = CodedOutputStream.b(1, d.ar(auVar.className)) + 0;
        String str = auVar.sc;
        if (str != null) {
            b += CodedOutputStream.b(3, d.ar(str));
        }
        int i4 = b;
        for (StackTraceElement a : auVar.sd) {
            int a2 = a(a, true);
            i4 += (CodedOutputStream.J(4) + CodedOutputStream.L(a2)) + a2;
        }
        auVar = auVar.se;
        if (auVar == null) {
            return i4;
        }
        if (i < i2) {
            int a3 = a(auVar, i + 1, i2);
            return i4 + ((CodedOutputStream.J(6) + CodedOutputStream.L(a3)) + a3);
        }
        while (auVar != null) {
            auVar = auVar.se;
            i3++;
        }
        return i4 + CodedOutputStream.e(7, i3);
    }

    private static int fX() {
        return ((CodedOutputStream.b(1, rZ) + 0) + CodedOutputStream.b(2, rZ)) + CodedOutputStream.b(3, 0);
    }

    private static int a(StackTraceElement stackTraceElement, boolean z) {
        int b;
        int i = 0;
        if (stackTraceElement.isNativeMethod()) {
            b = CodedOutputStream.b(1, (long) Math.max(stackTraceElement.getLineNumber(), 0));
        } else {
            b = CodedOutputStream.b(1, 0);
        }
        b += 0;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(stackTraceElement.getClassName());
        stringBuilder.append(".");
        stringBuilder.append(stackTraceElement.getMethodName());
        b += CodedOutputStream.b(2, d.ar(stringBuilder.toString()));
        if (stackTraceElement.getFileName() != null) {
            b += CodedOutputStream.b(3, d.ar(stackTraceElement.getFileName()));
        }
        if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
            b += CodedOutputStream.b(4, (long) stackTraceElement.getLineNumber());
        }
        if (z) {
            i = 2;
        }
        return b + CodedOutputStream.e(5, i);
    }

    private static int a(Thread thread, StackTraceElement[] stackTraceElementArr, int i, boolean z) {
        int b = CodedOutputStream.b(1, d.ar(thread.getName())) + CodedOutputStream.e(2, i);
        for (StackTraceElement a : stackTraceElementArr) {
            int a2 = a(a, z);
            b += (CodedOutputStream.J(3) + CodedOutputStream.L(a2)) + a2;
        }
        return b;
    }

    private static d aJ(String str) {
        return str == null ? null : d.ar(str);
    }
}
