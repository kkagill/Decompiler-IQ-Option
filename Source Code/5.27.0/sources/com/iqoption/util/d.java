package com.iqoption.util;

/* compiled from: BitmapUtils */
public class d {
    public static int eJ(int i) {
        return (i >>> 24) | (i << 8);
    }

    public static int eK(int i) {
        return (i << 24) | (i >>> 8);
    }
}
