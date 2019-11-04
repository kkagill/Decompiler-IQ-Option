package com.airbnb.lottie.c;

import android.util.JsonReader;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.annotation.Nullable;
import androidx.collection.SparseArrayCompat;
import com.airbnb.lottie.e;
import com.airbnb.lottie.e.a;
import java.lang.ref.WeakReference;

/* compiled from: KeyframeParser */
class q {
    private static final Interpolator LINEAR_INTERPOLATOR = new LinearInterpolator();
    private static SparseArrayCompat<WeakReference<Interpolator>> jO;

    q() {
    }

    private static SparseArrayCompat<WeakReference<Interpolator>> cF() {
        if (jO == null) {
            jO = new SparseArrayCompat();
        }
        return jO;
    }

    @Nullable
    private static WeakReference<Interpolator> x(int i) {
        WeakReference weakReference;
        synchronized (q.class) {
            weakReference = (WeakReference) cF().get(i);
        }
        return weakReference;
    }

    private static void a(int i, WeakReference<Interpolator> weakReference) {
        synchronized (q.class) {
            jO.put(i, weakReference);
        }
    }

    static <T> a<T> a(JsonReader jsonReader, e eVar, float f, aj<T> ajVar, boolean z) {
        if (z) {
            return a(eVar, jsonReader, f, ajVar);
        }
        return a(jsonReader, f, ajVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x009f  */
    private static <T> com.airbnb.lottie.e.a<T> a(com.airbnb.lottie.e r17, android.util.JsonReader r18, float r19, com.airbnb.lottie.c.aj<T> r20) {
        /*
        r0 = r18;
        r1 = r19;
        r2 = r20;
        r18.beginObject();
        r5 = 0;
        r5 = 0;
        r6 = 0;
        r7 = 0;
        r8 = 0;
        r9 = 0;
        r12 = 0;
        r14 = 0;
        r15 = 0;
    L_0x0012:
        r10 = r18.hasNext();
        if (r10 == 0) goto L_0x00dc;
    L_0x0018:
        r10 = r18.nextName();
        r11 = -1;
        r13 = r10.hashCode();
        r3 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
        r4 = 1;
        if (r13 == r3) goto L_0x008c;
    L_0x0026:
        r3 = 111; // 0x6f float:1.56E-43 double:5.5E-322;
        if (r13 == r3) goto L_0x0082;
    L_0x002a:
        r3 = 3701; // 0xe75 float:5.186E-42 double:1.8285E-320;
        if (r13 == r3) goto L_0x0077;
    L_0x002e:
        r3 = 3707; // 0xe7b float:5.195E-42 double:1.8315E-320;
        if (r13 == r3) goto L_0x006c;
    L_0x0032:
        r3 = 104; // 0x68 float:1.46E-43 double:5.14E-322;
        if (r13 == r3) goto L_0x0062;
    L_0x0036:
        r3 = 105; // 0x69 float:1.47E-43 double:5.2E-322;
        if (r13 == r3) goto L_0x0058;
    L_0x003a:
        r3 = 115; // 0x73 float:1.61E-43 double:5.7E-322;
        if (r13 == r3) goto L_0x004e;
    L_0x003e:
        r3 = 116; // 0x74 float:1.63E-43 double:5.73E-322;
        if (r13 == r3) goto L_0x0043;
    L_0x0042:
        goto L_0x0096;
    L_0x0043:
        r3 = "t";
        r3 = r10.equals(r3);
        if (r3 == 0) goto L_0x0096;
    L_0x004c:
        r3 = 0;
        goto L_0x0097;
    L_0x004e:
        r3 = "s";
        r3 = r10.equals(r3);
        if (r3 == 0) goto L_0x0096;
    L_0x0056:
        r3 = 1;
        goto L_0x0097;
    L_0x0058:
        r3 = "i";
        r3 = r10.equals(r3);
        if (r3 == 0) goto L_0x0096;
    L_0x0060:
        r3 = 4;
        goto L_0x0097;
    L_0x0062:
        r3 = "h";
        r3 = r10.equals(r3);
        if (r3 == 0) goto L_0x0096;
    L_0x006a:
        r3 = 5;
        goto L_0x0097;
    L_0x006c:
        r3 = "to";
        r3 = r10.equals(r3);
        if (r3 == 0) goto L_0x0096;
    L_0x0075:
        r3 = 6;
        goto L_0x0097;
    L_0x0077:
        r3 = "ti";
        r3 = r10.equals(r3);
        if (r3 == 0) goto L_0x0096;
    L_0x0080:
        r3 = 7;
        goto L_0x0097;
    L_0x0082:
        r3 = "o";
        r3 = r10.equals(r3);
        if (r3 == 0) goto L_0x0096;
    L_0x008a:
        r3 = 3;
        goto L_0x0097;
    L_0x008c:
        r3 = "e";
        r3 = r10.equals(r3);
        if (r3 == 0) goto L_0x0096;
    L_0x0094:
        r3 = 2;
        goto L_0x0097;
    L_0x0096:
        r3 = -1;
    L_0x0097:
        switch(r3) {
            case 0: goto L_0x00d4;
            case 1: goto L_0x00cd;
            case 2: goto L_0x00c6;
            case 3: goto L_0x00bf;
            case 4: goto L_0x00b8;
            case 5: goto L_0x00ad;
            case 6: goto L_0x00a6;
            case 7: goto L_0x009f;
            default: goto L_0x009a;
        };
    L_0x009a:
        r18.skipValue();
        goto L_0x0012;
    L_0x009f:
        r3 = com.airbnb.lottie.c.p.g(r18, r19);
        r15 = r3;
        goto L_0x0012;
    L_0x00a6:
        r3 = com.airbnb.lottie.c.p.g(r18, r19);
        r14 = r3;
        goto L_0x0012;
    L_0x00ad:
        r3 = r18.nextInt();
        if (r3 != r4) goto L_0x00b4;
    L_0x00b3:
        goto L_0x00b5;
    L_0x00b4:
        r4 = 0;
    L_0x00b5:
        r5 = r4;
        goto L_0x0012;
    L_0x00b8:
        r3 = com.airbnb.lottie.c.p.g(r18, r19);
        r7 = r3;
        goto L_0x0012;
    L_0x00bf:
        r3 = com.airbnb.lottie.c.p.g(r18, r19);
        r6 = r3;
        goto L_0x0012;
    L_0x00c6:
        r3 = r2.b(r0, r1);
        r8 = r3;
        goto L_0x0012;
    L_0x00cd:
        r3 = r2.b(r0, r1);
        r9 = r3;
        goto L_0x0012;
    L_0x00d4:
        r3 = r18.nextDouble();
        r3 = (float) r3;
        r12 = r3;
        goto L_0x0012;
    L_0x00dc:
        r18.endObject();
        if (r5 == 0) goto L_0x00e7;
    L_0x00e1:
        r0 = LINEAR_INTERPOLATOR;
        r11 = r0;
        r10 = r9;
        goto L_0x0154;
    L_0x00e7:
        if (r6 == 0) goto L_0x0150;
    L_0x00e9:
        if (r7 == 0) goto L_0x0150;
    L_0x00eb:
        r0 = r6.x;
        r2 = -r1;
        r0 = com.airbnb.lottie.d.g.clamp(r0, r2, r1);
        r6.x = r0;
        r0 = r6.y;
        r3 = 1120403456; // 0x42c80000 float:100.0 double:5.53552857E-315;
        r4 = -1027080192; // 0xffffffffc2c80000 float:-100.0 double:NaN;
        r0 = com.airbnb.lottie.d.g.clamp(r0, r4, r3);
        r6.y = r0;
        r0 = r7.x;
        r0 = com.airbnb.lottie.d.g.clamp(r0, r2, r1);
        r7.x = r0;
        r0 = r7.y;
        r0 = com.airbnb.lottie.d.g.clamp(r0, r4, r3);
        r7.y = r0;
        r0 = r6.x;
        r2 = r6.y;
        r3 = r7.x;
        r4 = r7.y;
        r0 = com.airbnb.lottie.d.h.a(r0, r2, r3, r4);
        r2 = x(r0);
        if (r2 == 0) goto L_0x012c;
    L_0x0122:
        r3 = r2.get();
        r4 = r3;
        r4 = (android.view.animation.Interpolator) r4;
        r16 = r4;
        goto L_0x012e;
    L_0x012c:
        r16 = 0;
    L_0x012e:
        if (r2 == 0) goto L_0x0132;
    L_0x0130:
        if (r16 != 0) goto L_0x014c;
    L_0x0132:
        r2 = r6.x;
        r2 = r2 / r1;
        r3 = r6.y;
        r3 = r3 / r1;
        r4 = r7.x;
        r4 = r4 / r1;
        r5 = r7.y;
        r5 = r5 / r1;
        r1 = androidx.core.view.animation.PathInterpolatorCompat.create(r2, r3, r4, r5);
        r2 = new java.lang.ref.WeakReference;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x014a }
        r2.<init>(r1);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x014a }
        a(r0, r2);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x014a }
    L_0x014a:
        r16 = r1;
    L_0x014c:
        r10 = r8;
        r11 = r16;
        goto L_0x0154;
    L_0x0150:
        r0 = LINEAR_INTERPOLATOR;
        r11 = r0;
        r10 = r8;
    L_0x0154:
        r0 = new com.airbnb.lottie.e.a;
        r13 = 0;
        r7 = r0;
        r8 = r17;
        r7.<init>(r8, r9, r10, r11, r12, r13);
        r0.kt = r14;
        r0.ku = r15;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.c.q.a(com.airbnb.lottie.e, android.util.JsonReader, float, com.airbnb.lottie.c.aj):com.airbnb.lottie.e.a");
    }

    private static <T> a<T> a(JsonReader jsonReader, float f, aj<T> ajVar) {
        return new a(ajVar.b(jsonReader, f));
    }
}
