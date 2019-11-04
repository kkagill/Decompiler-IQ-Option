package com.airbnb.lottie;

import androidx.annotation.RestrictTo;
import androidx.annotation.RestrictTo.Scope;
import androidx.core.os.TraceCompat;

@RestrictTo({Scope.LIBRARY})
/* compiled from: L */
public class d {
    public static boolean DBG = false;
    private static boolean cP = false;
    private static String[] cQ;
    private static long[] cR;
    private static int cS;
    private static int cT;

    public static void beginSection(String str) {
        if (cP) {
            int i = cS;
            if (i == 20) {
                cT++;
                return;
            }
            cQ[i] = str;
            cR[i] = System.nanoTime();
            TraceCompat.beginSection(str);
            cS++;
        }
    }

    public static float k(String str) {
        int i = cT;
        if (i > 0) {
            cT = i - 1;
            return 0.0f;
        } else if (!cP) {
            return 0.0f;
        } else {
            cS--;
            i = cS;
            if (i == -1) {
                throw new IllegalStateException("Can't end trace section. There are none.");
            } else if (str.equals(cQ[i])) {
                TraceCompat.endSection();
                return ((float) (System.nanoTime() - cR[cS])) / 1000000.0f;
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unbalanced trace call ");
                stringBuilder.append(str);
                stringBuilder.append(". Expected ");
                stringBuilder.append(cQ[cS]);
                stringBuilder.append(".");
                throw new IllegalStateException(stringBuilder.toString());
            }
        }
    }
}
