package com.appsflyer;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.hardware.SensorManager;
import android.os.Build.VERSION;
import androidx.annotation.NonNull;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class a {
    private static char[] mh = new char[]{5961, 46707, 21798, 62661, 37779, 12616, 53362, 32629, 7924, 48528, 23382, 64010, 39204, 14577, 51105, 25949, 1025, 41859, 17094, 57762, 36704, 11796, 52694, 27779, 3007, 43371, 18483, 6130, 46725, 21575, 62335, 37412, 12781, 53391, '1', 54731, 'y', 41292, 16915, 58342, 34041, 9796, 51059, 26718, 2508, 43705, 19533, 60687, 36404, 12252, 53387, 29288, 4899, 46303, 'b', 41300, 16904, 58362, 33973, 9836, 50958, 26694, 2449, 43705, 19495, 60788, 36381, 12243, 53471, 29224, 4964, 46307, 21902, 63114, 38928, 14652, 55994, 31731, 7324, 48660, 24403, 241, 41470, 17201, 58375, 34138, 11125, 35407, 26906, 51449, 44975, 3444, 60494, 17225, 8915, 33210, 26408, 50705, 42249, 1233, 64390, 22890, 14390, 40936, 32483, 56730, 45918, 4652, 61949, 20658, 14238, 56093, 31271, 39282, 14481, 24519, 64796, 7206, 45857, 53948, 29120, 38684, 13919, 21879, 62636, 3048, 43266, 51202, 28586, 36515, 11773, 17195, 57930, 384, 47412, 6158, 64347, 23224, 15854, 40757, 32271, 53512, 45202, 5115, 62825, 21587, 14170, 38557, 27101, 52013, 43601, 3505, 60572, 20433, 'a', 41307, 16910, 58349, 33979, 9824, 51034, 26717, 2502, 43704, 19558, 60777, 36393, 12227, 53391, '.', '\\', 41243, 63425, 22271, 46519, 5205, 29521, 53707, 12538, 40950, 65143, 23835, 48073, 6792, 31166, 55400, '/', 41302, 16907, 58364, 33980, 9836, '.', 41247, 16965, 58307, 33959, 9763, 50966, 26717, 2434, 43764, 'C', 41309, 16911, 58364, 33983, 9850, 51019, 26654, 2541, 43685, 19569, 60706, 36364, 12229, 53391, 29300, 4926, 'F', 41300, 16899, 58355, 33969, 9837, 50974, 26631, 2503, 43773, 19573, 60706, 36360, 12177, 53381, 29306, 4915, 46317, 21983, 63183, 38996, 14648, 56058, 31659, 7384, 48730, 24331, 227, 41380, 17185, 58451, 34067, 9923, 51120, 27002, 2635, 43805, 19654, 60848, 36649, 12392, 4469, 45122, 21260, 62148, 38312, 14184, 54872, 30976, 6358, 48035, 23909, 64561, 40751, 16083, 49540, 25445, 555, 42484, 17609, 59273, 35167, 10276, 52210, 27298, 'C', 41309, 16911, 58364, 33983, 9850, 51019, 26654, 2554, 43704, 19572, 60715, 36377, 12242, 53394, 29278, 4904, 46310, 21983, 63135, 38992, 14640, 56033, 31661, 'F', 41300, 16899, 58355, 33969, 9837, 50974, 26650, 2502, 43691, 19581, 60716, 36377, 12177, 53396, 29310, 4918, 46313, 21983, 63116, 38992, 14652, 56042, 31715, 7317, 48712, 24342, 255, 41379, 17253, 58390, 34076, 9929, 51105, 26978, 2591, 43793, 19665, 60861, 36726, 12344, 53513, 29403, 5000, 46450, 22123, 63398};
    private static long mi = 3950183758939332917L;
    private static int mj = 0;
    /* renamed from: ˋ */
    private static int f5 = 1;

    static class e extends HashMap<String, Object> {
        private static int mj = 0;
        private static char[] mk = new char[]{'a', 26975, 53805, 15327, 42125, 3696, 30515, 57596, 18876, 45920, 7255, 34051, 18161, 12248, 38016, 32086, 57875, 24432, 13896, 36115, 25815, 64392, 20834, 10278, 49141, 'k', 26972, 53780, 33572, 59930, 20825, 47237, 10179, 36155, 62516, 25514, 51951, 12333, 40733, 1603, 28047, 54483, 16949, 43387, 4277, 32683, 58667, 19484, 47952, 8911, 35279, 63288, 24163, 50675, 11519, 39464, 266, 26719, 55244, 16064, 42010, 4984, 31413, 57849, 20274, 46614, 7515, 33923, 62352, 22851, 'k', 26972, 53780, 15250, 42205, 3620, 30575, 'f', 26960, 53760, 15320, 42128, 3665, 30519, 57594, 18854, 45922, 7250, 34103, 61133, 22417, 49531, '4', 26903, 53835, 15237, 42196, '-', 26955, 53777, 15237, 42190, 'f', 26968, 53787, 15303, 42113, 3705, 30582, 57576, 18861, 45935, 7263, 34049, 61133, 22417, 49527, 10809, 37879, 64745, 26217, 53086, 14354, 41357, 2704, 29822, 56628, 18148, 44975, 6435, 33355, 60188, 21722, 48527, 9984, 36924, 63978, 25256, 52321, 13645, 40450, 1990, 28807, 55887, 17248, 44211, 'b', 26968, 53776, 15310, 42117, 3704, 30566, 57530, 18940, 45873, 7262, 34122, 61085, 22403, 49452, 10855, 37793, 64753, 10529, 16407, 64342, 4761, 36299, 10036, 24178, 51681, 24801, 39471, 13582, 44118, 51074, 32465, 59504, 886, 47795, 54781, 20267, 58900, 4442, 35011, 9188, 23838, 62540, 28549, 34511, 12305, 43813, 49770, 32173, 38127, 3617, 47447, 53397, 19406, 58624, 't', 26972, 53791, 15323, 42113, 3695, 30519, 57595, 18877, 45939, 7263, 'x', 26881, 53828, 33253, 59594, 21386, 47694, 9501, 36857, 10693, '&', 26945, 7278, 29954, '&', 26953, 17019, 11028, 36894, 31110, 59016, 19505, 13627, 41635, 2981, 61742, 24085, 50957, 44249, 5516, 33634, 26663};
        private static long ml = -7481529154018449095L;
        private static int mm = 1;
        /* renamed from: ˊ */
        private final Context f3;
        /* renamed from: ˋ */
        private final Map<String, Object> f4;

        static class a {
            private String lx;
            private final Object mn;
            private long mo;

            a() {
            }

            @NonNull
            static String ab(String str) {
                byte[] bytes = str.getBytes();
                for (int i = 0; i < bytes.length; i++) {
                    bytes[i] = (byte) (bytes[i] ^ ((i % 2) + 42));
                }
                StringBuilder stringBuilder = new StringBuilder();
                for (byte toHexString : bytes) {
                    String toHexString2 = Integer.toHexString(toHexString);
                    if (toHexString2.length() == 1) {
                        toHexString2 = "0".concat(String.valueOf(toHexString2));
                    }
                    stringBuilder.append(toHexString2);
                }
                return stringBuilder.toString();
            }

            a(long j, String str) {
                this.mn = new Object();
                this.mo = 0;
                this.lx = "";
                this.mo = j;
                this.lx = str;
            }

            a(String str) {
                this(System.currentTimeMillis(), str);
            }

            @NonNull
            static a ac(String str) {
                String str2 = "";
                if (str == null) {
                    return new a(0, str2);
                }
                String[] split = str.split(",");
                if (split.length < 2) {
                    return new a(0, str2);
                }
                return new a(Long.parseLong(split[0]), split[1]);
            }

            /* Access modifiers changed, original: final */
            public final boolean a(a aVar) {
                return a(aVar.mo, aVar.lx);
            }

            /* JADX WARNING: Missing block: B:19:0x0028, code skipped:
            return false;
     */
            private boolean a(long r9, java.lang.String r11) {
                /*
                r8 = this;
                r0 = r8.mn;
                monitor-enter(r0);
                r1 = 0;
                if (r11 == 0) goto L_0x0027;
            L_0x0006:
                r2 = r8.lx;	 Catch:{ all -> 0x0024 }
                r2 = r11.equals(r2);	 Catch:{ all -> 0x0024 }
                if (r2 != 0) goto L_0x0027;
            L_0x000e:
                r2 = r8.mo;	 Catch:{ all -> 0x0024 }
                r2 = r9 - r2;
                r4 = 2000; // 0x7d0 float:2.803E-42 double:9.88E-321;
                r6 = 1;
                r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
                if (r7 <= 0) goto L_0x001b;
            L_0x0019:
                r2 = 1;
                goto L_0x001c;
            L_0x001b:
                r2 = 0;
            L_0x001c:
                if (r2 == 0) goto L_0x0027;
            L_0x001e:
                r8.mo = r9;	 Catch:{ all -> 0x0024 }
                r8.lx = r11;	 Catch:{ all -> 0x0024 }
                monitor-exit(r0);	 Catch:{ all -> 0x0024 }
                return r6;
            L_0x0024:
                r9 = move-exception;
                monitor-exit(r0);
                throw r9;
            L_0x0027:
                monitor-exit(r0);
                return r1;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.a$e$a.a(long, java.lang.String):boolean");
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(this.mo);
                stringBuilder.append(",");
                stringBuilder.append(this.lx);
                return stringBuilder.toString();
            }

            /* Access modifiers changed, original: final */
            public final String dD() {
                return this.lx;
            }
        }

        e(Map<String, Object> map, Context context) {
            this.f4 = map;
            this.f3 = context;
            put(dD(), dE());
        }

        private static StringBuilder a(@NonNull String... strArr) {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (true) {
                if ((i < 3 ? 18 : 94) == 94) {
                    break;
                }
                arrayList.add(Integer.valueOf(strArr[i].length()));
                i++;
            }
            Collections.sort(arrayList);
            int intValue = ((Integer) arrayList.get(0)).intValue();
            StringBuilder stringBuilder = new StringBuilder();
            int i2 = mj + 15;
            mm = i2 % 128;
            i2 %= 2;
            i2 = 0;
            while (true) {
                if ((i2 < intValue ? 69 : 57) != 69) {
                    return stringBuilder;
                }
                Number number = null;
                Number number2 = number;
                for (int i3 = 0; i3 < 3; i3++) {
                    int charAt = strArr[i3].charAt(i2);
                    if (number2 == null) {
                        int i4 = mm + 15;
                        mj = i4 % 128;
                        if (i4 % 2 != 0) {
                            super.hashCode();
                        }
                    } else {
                        charAt ^= number2.intValue();
                    }
                    number2 = Integer.valueOf(charAt);
                }
                stringBuilder.append(Integer.toHexString(number2.intValue()));
                i2++;
                int i5 = mm + 67;
                mj = i5 % 128;
                i5 %= 2;
            }
        }

        @NonNull
        private String dD() {
            int i = mm + 89;
            mj = i % 128;
            i %= 2;
            StringBuilder a;
            try {
                int i2;
                String num = Integer.toString(VERSION.SDK_INT);
                String obj = this.f4.get(a(0, 12, 0).intern()).toString();
                String obj2 = this.f4.get(a(12, 5, 18067).intern()).toString();
                if ((obj2 == null ? 54 : 21) != 21) {
                    i2 = mj + 17;
                    mm = i2 % 128;
                    obj2 = ((i2 % 2 == 0 ? 1 : null) != 1 ? a(17, 8, 24382) : a(40, 36, 24382)).intern();
                }
                new StringBuilder(obj).reverse();
                a = a(num, obj2, r5.toString());
                i2 = a.length();
                if ((i2 > 4 ? null : 1) != 1) {
                    a.delete(4, i2);
                } else {
                    while (i2 < 4) {
                        int i3 = mm + 13;
                        mj = i3 % 128;
                        i3 %= 2;
                        i2++;
                        a.append('1');
                    }
                }
                a.insert(0, a(25, 3, 0).intern());
                return a.toString();
            } catch (Exception e) {
                a = new StringBuilder();
                a.append(a(28, 42, 33602).intern());
                a.append(e);
                AFLogger.G(a.toString());
                return a(70, 7, 0).intern();
            }
        }

        private String dE() {
            String obj;
            StringBuilder stringBuilder;
            String str = "";
            try {
                obj = this.f4.get(a(0, 12, 0).intern()).toString();
                String obj2 = this.f4.get(a(77, 15, 0).intern()).toString();
                String replaceAll = a(92, 5, 0).intern().replaceAll(a(97, 5, 0).intern(), str);
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append(obj);
                stringBuilder2.append(obj2);
                stringBuilder2.append(replaceAll);
                obj = ae.R(stringBuilder2.toString());
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(obj.substring(0, 16));
                str = stringBuilder.toString();
            } catch (Exception e) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(a(102, 44, 0).intern());
                stringBuilder.append(e);
                AFLogger.G(stringBuilder.toString());
                StringBuilder stringBuilder3 = new StringBuilder();
                stringBuilder3.append(str);
                stringBuilder3.append(a(146, 18, 0).intern());
                str = stringBuilder3.toString();
            }
            try {
                int i;
                int size;
                StringBuilder stringBuilder4;
                Intent registerReceiver = this.f3.registerReceiver(null, new IntentFilter(a(164, 37, 10560).intern()));
                int i2 = -2700;
                if (registerReceiver != null) {
                    i2 = registerReceiver.getIntExtra(a(201, 11, 0).intern(), -2700);
                }
                if ((this.f3.getApplicationInfo().nativeLibraryDir.contains(a(212, 3, 0).intern()) ? 1 : null) != 1) {
                    i = mm + 53;
                    mj = i % 128;
                    i %= 2;
                } else {
                    i = mm + 75;
                    mj = i % 128;
                    if ((i % 2 != 0 ? 78 : 29) != 78) {
                        i = 1;
                        size = ((SensorManager) this.f3.getSystemService(a(215, 6, 33174).intern())).getSensorList(-1).size();
                        stringBuilder4 = new StringBuilder();
                        stringBuilder4.append(a(221, 1, 10663).intern());
                        stringBuilder4.append(i2);
                        stringBuilder4.append(a(222, 2, 0).intern());
                        stringBuilder4.append(i);
                        stringBuilder4.append(a(224, 2, 7240).intern());
                        stringBuilder4.append(size);
                        stringBuilder4.append(a(226, 2, 0).intern());
                        stringBuilder4.append(this.f4.size());
                        obj = stringBuilder4.toString();
                        stringBuilder = new StringBuilder();
                        stringBuilder.append(str);
                        stringBuilder.append(a.ab(obj));
                        str = stringBuilder.toString();
                        return str;
                    }
                }
                i = 0;
                size = ((SensorManager) this.f3.getSystemService(a(215, 6, 33174).intern())).getSensorList(-1).size();
                stringBuilder4 = new StringBuilder();
                stringBuilder4.append(a(221, 1, 10663).intern());
                stringBuilder4.append(i2);
                stringBuilder4.append(a(222, 2, 0).intern());
                stringBuilder4.append(i);
                stringBuilder4.append(a(224, 2, 7240).intern());
                stringBuilder4.append(size);
                stringBuilder4.append(a(226, 2, 0).intern());
                stringBuilder4.append(this.f4.size());
                obj = stringBuilder4.toString();
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(a.ab(obj));
                str = stringBuilder.toString();
                return str;
            } catch (Exception e2) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(a(102, 44, 0).intern());
                stringBuilder.append(e2);
                AFLogger.G(stringBuilder.toString());
                StringBuilder stringBuilder5 = new StringBuilder();
                stringBuilder5.append(str);
                stringBuilder5.append(a(228, 16, 16925).intern());
                return stringBuilder5.toString();
            }
        }

        private static String a(int i, int i2, char c) {
            char[] cArr = new char[i2];
            int i3 = 0;
            int i4 = mj + 95;
            mm = i4 % 128;
            i4 %= 2;
            while (true) {
                if ((i3 < i2 ? 50 : 11) == 11) {
                    return new String(cArr);
                }
                i4 = mm + 95;
                mj = i4 % 128;
                i4 %= 2;
                cArr[i3] = (char) ((int) ((((long) mk[i + i3]) ^ (((long) i3) * ml)) ^ ((long) c)));
                i3++;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x01d9  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x01b7  */
    /* JADX WARNING: Missing block: B:26:0x0111, code skipped:
            if ((Z(a(87, 65, 11028).intern()) ? 24 : 69) != 69) goto L_0x0129;
     */
    /* JADX WARNING: Missing block: B:28:0x0127, code skipped:
            if (Z(a(86, 25, 11028).intern()) != false) goto L_0x0129;
     */
    /* JADX WARNING: Missing block: B:30:0x012e, code skipped:
            r12 = a(35, 1, 54779);
     */
    @androidx.annotation.Nullable
    static java.lang.String b(android.content.Context r12, long r13) {
        /*
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = 5928; // 0x1728 float:8.307E-42 double:2.929E-320;
        r4 = 34;
        r5 = 0;
        r3 = a(r5, r4, r3);
        r3 = r3.intern();
        r3 = Z(r3);
        r6 = 54779; // 0xd5fb float:7.6762E-41 double:2.70644E-319;
        r7 = 35;
        r8 = 1;
        if (r3 == 0) goto L_0x0031;
    L_0x0028:
        r3 = a(r4, r8, r5);
    L_0x002c:
        r3 = r3.intern();
        goto L_0x0036;
    L_0x0031:
        r3 = a(r7, r8, r6);
        goto L_0x002c;
    L_0x0036:
        r1.append(r3);
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r9 = r12.getPackageName();
        r10 = aa(r9);
        r11 = a(r4, r8, r5);
        r11 = r11.intern();
        r1.append(r11);
        r3.append(r10);
        r10 = w(r12);
        if (r10 != 0) goto L_0x0069;
    L_0x005a:
        r10 = a(r7, r8, r6);
        r10 = r10.intern();
        r1.append(r10);
        r3.append(r9);
        goto L_0x0077;
    L_0x0069:
        r10 = a(r4, r8, r5);
        r10 = r10.intern();
        r1.append(r10);
        r3.append(r9);
    L_0x0077:
        r10 = x(r12);
        if (r10 != 0) goto L_0x008c;
    L_0x007d:
        r10 = a(r7, r8, r6);
        r10 = r10.intern();
        r1.append(r10);
        r3.append(r9);
        goto L_0x009a;
    L_0x008c:
        r11 = a(r4, r8, r5);
        r11 = r11.intern();
        r1.append(r11);
        r3.append(r10);
    L_0x009a:
        r9 = o(r12, r9);
        r3.append(r9);
        r3 = r3.toString();
        r0.append(r3);
        r3 = r12.getPackageManager();	 Catch:{ NameNotFoundException -> 0x0237 }
        r12 = r12.getPackageName();	 Catch:{ NameNotFoundException -> 0x0237 }
        r12 = r3.getPackageInfo(r12, r5);	 Catch:{ NameNotFoundException -> 0x0237 }
        r9 = r12.firstInstallTime;	 Catch:{ NameNotFoundException -> 0x0237 }
        r12 = 36;
        r3 = 18;
        r12 = a(r12, r3, r5);	 Catch:{ NameNotFoundException -> 0x0237 }
        r12 = r12.intern();	 Catch:{ NameNotFoundException -> 0x0237 }
        r3 = new java.text.SimpleDateFormat;	 Catch:{ NameNotFoundException -> 0x0237 }
        r11 = java.util.Locale.US;	 Catch:{ NameNotFoundException -> 0x0237 }
        r3.<init>(r12, r11);	 Catch:{ NameNotFoundException -> 0x0237 }
        r12 = "UTC";
        r12 = java.util.TimeZone.getTimeZone(r12);	 Catch:{ NameNotFoundException -> 0x0237 }
        r3.setTimeZone(r12);	 Catch:{ NameNotFoundException -> 0x0237 }
        r12 = new java.util.Date;	 Catch:{ NameNotFoundException -> 0x0237 }
        r12.<init>(r9);	 Catch:{ NameNotFoundException -> 0x0237 }
        r12 = r3.format(r12);	 Catch:{ NameNotFoundException -> 0x0237 }
        r0.append(r12);	 Catch:{ NameNotFoundException -> 0x0237 }
        r12 = f5;
        r12 = r12 + 61;
        r3 = r12 % 128;
        mj = r3;
        r3 = 2;
        r12 = r12 % r3;
        r9 = 85;
        if (r12 == 0) goto L_0x00ef;
    L_0x00ec:
        r12 = 13;
        goto L_0x00f1;
    L_0x00ef:
        r12 = 85;
    L_0x00f1:
        r10 = 11028; // 0x2b14 float:1.5454E-41 double:5.4486E-320;
        r11 = 87;
        if (r12 == r9) goto L_0x0114;
    L_0x00f7:
        r0.append(r13);
        r12 = 65;
        r12 = a(r11, r12, r10);
        r12 = r12.intern();
        r12 = Z(r12);
        r9 = 69;
        if (r12 == 0) goto L_0x010f;
    L_0x010c:
        r12 = 24;
        goto L_0x0111;
    L_0x010f:
        r12 = 69;
    L_0x0111:
        if (r12 == r9) goto L_0x012e;
    L_0x0113:
        goto L_0x0129;
    L_0x0114:
        r0.append(r13);
        r12 = 86;
        r9 = 25;
        r12 = a(r12, r9, r10);
        r12 = r12.intern();
        r12 = Z(r12);
        if (r12 == 0) goto L_0x012e;
    L_0x0129:
        r12 = a(r4, r8, r5);
        goto L_0x0132;
    L_0x012e:
        r12 = a(r7, r8, r6);
    L_0x0132:
        r12 = r12.intern();
        r2.append(r12);
        r12 = 111; // 0x6f float:1.56E-43 double:5.5E-322;
        r9 = 23;
        r10 = 56188; // 0xdb7c float:7.8736E-41 double:2.77606E-319;
        r12 = a(r12, r9, r10);
        r12 = r12.intern();
        r12 = Z(r12);
        if (r12 == 0) goto L_0x0157;
    L_0x014e:
        r12 = a(r4, r8, r5);
        r12 = r12.intern();
        goto L_0x0167;
    L_0x0157:
        r12 = a(r7, r8, r6);
        r12 = r12.intern();
        r9 = f5;
        r9 = r9 + r11;
        r10 = r9 % 128;
        mj = r10;
        r9 = r9 % r3;
    L_0x0167:
        r2.append(r12);
        r12 = 134; // 0x86 float:1.88E-43 double:6.6E-322;
        r9 = 20;
        r10 = 47445; // 0xb955 float:6.6485E-41 double:2.3441E-319;
        r12 = a(r12, r9, r10);
        r12 = r12.intern();
        r12 = Z(r12);
        if (r12 == 0) goto L_0x019a;
    L_0x017f:
        r12 = f5;
        r12 = r12 + 107;
        r9 = r12 % 128;
        mj = r9;
        r12 = r12 % r3;
        if (r12 == 0) goto L_0x0195;
    L_0x018a:
        r12 = 72;
        r12 = a(r12, r5, r5);
        r12 = r12.intern();
        goto L_0x01a2;
    L_0x0195:
        r12 = a(r4, r8, r5);
        goto L_0x019e;
    L_0x019a:
        r12 = a(r7, r8, r6);
    L_0x019e:
        r12 = r12.intern();
    L_0x01a2:
        r2.append(r12);
        r12 = 154; // 0x9a float:2.16E-43 double:7.6E-322;
        r9 = 15;
        r12 = a(r12, r9, r5);
        r12 = r12.intern();
        r12 = Z(r12);
        if (r12 == 0) goto L_0x01d9;
    L_0x01b7:
        r12 = f5;
        r12 = r12 + 107;
        r6 = r12 % 128;
        mj = r6;
        r12 = r12 % r3;
        r6 = 29;
        if (r12 == 0) goto L_0x01c5;
    L_0x01c4:
        goto L_0x01c7;
    L_0x01c5:
        r11 = 29;
    L_0x01c7:
        if (r11 == r6) goto L_0x01d4;
    L_0x01c9:
        r12 = 122; // 0x7a float:1.71E-43 double:6.03E-322;
        r12 = a(r12, r8, r5);
        r12 = r12.intern();
        goto L_0x01e1;
    L_0x01d4:
        r12 = a(r4, r8, r5);
        goto L_0x01dd;
    L_0x01d9:
        r12 = a(r7, r8, r6);
    L_0x01dd:
        r12 = r12.intern();
    L_0x01e1:
        r2.append(r12);
        r12 = r0.toString();
        r12 = com.appsflyer.ae.R(r12);
        r12 = com.appsflyer.ae.ab(r12);
        r0 = r1.toString();
        r1 = new java.lang.StringBuilder;
        r1.<init>(r12);
        r12 = 17;
        r0 = java.lang.Integer.parseInt(r0, r3);
        r4 = 16;
        r0 = java.lang.Integer.toString(r0, r4);
        r0 = r0.charAt(r5);
        r1.setCharAt(r12, r0);
        r12 = r1.toString();
        r0 = r2.toString();
        r1 = new java.lang.StringBuilder;
        r1.<init>(r12);
        r12 = 27;
        r0 = java.lang.Integer.parseInt(r0, r3);
        r0 = java.lang.Integer.toString(r0, r4);
        r0 = r0.charAt(r5);
        r1.setCharAt(r12, r0);
        r12 = r1.toString();
        r13 = java.lang.Long.valueOf(r13);
        r12 = a(r12, r13);
        return r12;
    L_0x0237:
        r12 = 54;
        r13 = 32;
        r12 = a(r12, r13, r5);
        r12 = r12.intern();
        return r12;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.a.b(android.content.Context, long):java.lang.String");
    }

    /* JADX WARNING: Missing block: B:12:0x0024, code skipped:
            if ((r8 != null ? 51 : 60) != 51) goto L_0x00ea;
     */
    /* JADX WARNING: Missing block: B:13:0x0028, code skipped:
            if (r8 != null) goto L_0x002a;
     */
    private static java.lang.String a(java.lang.String r7, java.lang.Long r8) {
        /*
        r0 = 0;
        r1 = 1;
        if (r7 == 0) goto L_0x0006;
    L_0x0004:
        r2 = 0;
        goto L_0x0007;
    L_0x0006:
        r2 = 1;
    L_0x0007:
        r3 = 32;
        if (r2 == 0) goto L_0x000d;
    L_0x000b:
        goto L_0x00ea;
    L_0x000d:
        r2 = mj;
        r2 = r2 + 45;
        r4 = r2 % 128;
        f5 = r4;
        r2 = r2 % 2;
        if (r2 != 0) goto L_0x0028;
    L_0x0019:
        r2 = 0;
        r2 = r2.length;
        r2 = 51;
        if (r8 == 0) goto L_0x0022;
    L_0x001f:
        r4 = 51;
        goto L_0x0024;
    L_0x0022:
        r4 = 60;
    L_0x0024:
        if (r4 == r2) goto L_0x002a;
    L_0x0026:
        goto L_0x00ea;
    L_0x0028:
        if (r8 == 0) goto L_0x00ea;
    L_0x002a:
        r2 = r7.length();
        if (r2 != r3) goto L_0x00ea;
    L_0x0030:
        r2 = new java.lang.StringBuilder;
        r2.<init>(r7);
        r7 = r8.toString();
        r3 = 0;
        r8 = 0;
        r5 = 0;
    L_0x003d:
        r6 = r7.length();
        if (r8 >= r6) goto L_0x0045;
    L_0x0043:
        r6 = 0;
        goto L_0x0046;
    L_0x0045:
        r6 = 1;
    L_0x0046:
        if (r6 == r1) goto L_0x0054;
    L_0x0048:
        r6 = r7.charAt(r8);
        r6 = java.lang.Character.getNumericValue(r6);
        r5 = r5 + r6;
        r8 = r8 + 1;
        goto L_0x003d;
    L_0x0054:
        r7 = java.lang.Integer.toHexString(r5);
        r8 = r7.length();
        r5 = 7;
        r8 = r8 + r5;
        r2.replace(r5, r8, r7);
        r7 = mj;
        r7 = r7 + 77;
        r8 = r7 % 128;
        f5 = r8;
        r7 = r7 % 2;
    L_0x006b:
        r7 = r2.length();
        r8 = 35;
        if (r0 >= r7) goto L_0x0098;
    L_0x0073:
        r7 = f5;
        r7 = r7 + r8;
        r8 = r7 % 128;
        mj = r8;
        r7 = r7 % 2;
        if (r7 == 0) goto L_0x008b;
    L_0x007e:
        r7 = r2.charAt(r0);
        r7 = java.lang.Character.getNumericValue(r7);
        r7 = (long) r7;
        r3 = r3 - r7;
        r0 = r0 + 29;
        goto L_0x006b;
    L_0x008b:
        r7 = r2.charAt(r0);
        r7 = java.lang.Character.getNumericValue(r7);
        r7 = (long) r7;
        r3 = r3 + r7;
        r0 = r0 + 1;
        goto L_0x006b;
    L_0x0098:
        r5 = 100;
        r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r7 <= 0) goto L_0x00af;
    L_0x009e:
        r7 = f5;
        r7 = r7 + 89;
        r0 = r7 % 128;
        mj = r0;
        r7 = r7 % 2;
        if (r7 == 0) goto L_0x00ad;
    L_0x00aa:
        r3 = r3 * r5;
        goto L_0x0098;
    L_0x00ad:
        r3 = r3 % r5;
        goto L_0x0098;
    L_0x00af:
        r7 = (int) r3;
        r0 = 23;
        r2.insert(r0, r7);
        r5 = 10;
        r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r7 >= 0) goto L_0x00e5;
    L_0x00bb:
        r7 = f5;
        r7 = r7 + 15;
        r3 = r7 % 128;
        mj = r3;
        r7 = r7 % 2;
        r3 = 54779; // 0xd5fb float:7.6762E-41 double:2.70644E-319;
        if (r7 == 0) goto L_0x00da;
    L_0x00ca:
        r7 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
        r8 = 36;
        r8 = a(r8, r1, r3);
        r8 = r8.intern();
        r2.insert(r7, r8);
        goto L_0x00e5;
    L_0x00da:
        r7 = a(r8, r1, r3);
        r7 = r7.intern();
        r2.insert(r0, r7);
    L_0x00e5:
        r7 = r2.toString();
        return r7;
    L_0x00ea:
        r7 = 54;
        r7 = a(r7, r3, r0);
        r7 = r7.intern();
        return r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.a.a(java.lang.String, java.lang.Long):java.lang.String");
    }

    private static boolean Z(String str) {
        int i = mj + 121;
        f5 = i % 128;
        if (i % 2 == 0) {
        }
        try {
            Class.forName(str);
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private static String aa(String str) {
        int i = mj + 9;
        f5 = i % 128;
        if (i % 2 != 0) {
            if ((!str.contains(a(169, 1, 0).intern()) ? 35 : 74) == 35) {
                return str;
            }
        } else if (!str.contains(a(8832, 1, 0).intern())) {
            return str;
        }
        String[] split = str.split(a(170, 2, 0).intern());
        i = split.length;
        StringBuilder stringBuilder = new StringBuilder();
        i--;
        stringBuilder.append(split[i]);
        stringBuilder.append(a(169, 1, 0).intern());
        int i2 = 1;
        while (true) {
            if ((i2 < i ? 44 : 95) != 95) {
                int i3 = f5 + 87;
                mj = i3 % 128;
                i3 %= 2;
                stringBuilder.append(split[i2]);
                stringBuilder.append(a(169, 1, 0).intern());
                i2++;
            } else {
                stringBuilder.append(split[0]);
                return stringBuilder.toString();
            }
        }
    }

    private static String w(Context context) {
        int i = f5 + 23;
        mj = i % 128;
        i %= 2;
        if ((System.getProperties().containsKey(a(172, 14, 63403).intern()) ? null : 1) == 1) {
            return null;
        }
        i = f5 + 89;
        mj = i % 128;
        i %= 2;
        try {
            Matcher matcher = Pattern.compile(a(192, 10, 0).intern()).matcher(context.getCacheDir().getPath().replace(a(186, 6, 0).intern(), ""));
            if ((matcher.find() ? null : 1) == 1) {
                return null;
            }
            i = mj + 15;
            f5 = i % 128;
            return i % 2 == 0 ? matcher.group(0) : matcher.group(1);
        } catch (Exception e) {
            ag dT = ag.dT();
            String intern = a(202, 17, 0).intern();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(a(219, 41, 0).intern());
            stringBuilder.append(e);
            dT.m(intern, stringBuilder.toString());
            return null;
        }
    }

    private static String x(Context context) {
        PackageManager packageManager;
        String packageName;
        int i = mj + 37;
        f5 = i % 128;
        if ((i % 2 == 0 ? 0 : 29) != 29) {
            try {
                packageManager = context.getPackageManager();
                packageName = context.getPackageName();
            } catch (NameNotFoundException unused) {
                return null;
            }
        }
        packageManager = context.getPackageManager();
        packageName = context.getPackageName();
        packageName = packageManager.getPackageInfo(packageName, 0).packageName;
        i = f5 + 77;
        mj = i % 128;
        if ((i % 2 != 0 ? 45 : 88) != 45) {
            return packageName;
        }
        int i2 = 0 / 0;
        return packageName;
    }

    private static String o(Context context, String str) {
        ag dT;
        String intern;
        StringBuilder stringBuilder;
        try {
            Iterator it = ((List) PackageManager.class.getDeclaredMethod(a(260, 24, 4370).intern(), new Class[]{Integer.TYPE}).invoke(context.getPackageManager(), new Object[]{Integer.valueOf(0)})).iterator();
            while (true) {
                if ((it.hasNext() ? 1 : null) != 1) {
                    break;
                }
                int i = mj + 93;
                f5 = i % 128;
                i %= 2;
                if ((((ApplicationInfo) it.next()).packageName.equals(str) ? 1 : null) == 1) {
                    int i2 = f5 + 85;
                    mj = i2 % 128;
                    i2 %= 2;
                    return Boolean.TRUE.toString();
                }
            }
        } catch (IllegalAccessException e) {
            dT = ag.dT();
            intern = a(284, 24, 0).intern();
            stringBuilder = new StringBuilder();
            stringBuilder.append(a(308, 47, 0).intern());
            stringBuilder.append(e);
            dT.m(intern, stringBuilder.toString());
        } catch (NoSuchMethodException e2) {
            dT = ag.dT();
            intern = a(284, 24, 0).intern();
            stringBuilder = new StringBuilder();
            stringBuilder.append(a(308, 47, 0).intern());
            stringBuilder.append(e2);
            dT.m(intern, stringBuilder.toString());
        } catch (InvocationTargetException e3) {
            dT = ag.dT();
            intern = a(284, 24, 0).intern();
            stringBuilder = new StringBuilder();
            stringBuilder.append(a(308, 47, 0).intern());
            stringBuilder.append(e3);
            dT.m(intern, stringBuilder.toString());
        }
        return Boolean.FALSE.toString();
    }

    private static String a(int i, int i2, char c) {
        int i3 = mj + 103;
        f5 = i3 % 128;
        i3 %= 2;
        char[] cArr = new char[i2];
        int i4 = 0;
        while (true) {
            if ((i4 < i2 ? 1 : 0) != 1) {
                return new String(cArr);
            }
            int i5 = mj + 61;
            f5 = i5 % 128;
            i5 %= 2;
            cArr[i4] = (char) ((int) ((((long) mh[i + i4]) ^ (((long) i4) * mi)) ^ ((long) c)));
            i4++;
        }
    }
}
