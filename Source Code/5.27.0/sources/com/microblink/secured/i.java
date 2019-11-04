package com.microblink.secured;

import com.microblink.util.Log;

/* compiled from: line */
public class i {
    private static boolean ewf = false;
    private static Error ewg;

    public static boolean bed() {
        if (!ewf) {
            try {
                if (aa.bew()) {
                    for (String str : af.eyp) {
                        Log.a(i.class, "Loading lib{}.so", str);
                        System.loadLibrary(str);
                    }
                    ewf = true;
                } else {
                    throw new UnsatisfiedLinkError("Incompatible CPU!");
                }
            } catch (Error e) {
                ewf = false;
                Log.a(i.class, e, "error loading native library", new Object[0]);
                ewg = e;
            }
        }
        return ewf;
    }

    public static boolean bee() {
        return ewf;
    }

    public static Error bef() {
        return ewg;
    }

    public static void beg() {
        if (!bed()) {
            Error error = ewg;
            if (error != null) {
                throw error;
            }
            throw new RuntimeException("Native library is not loaded");
        }
    }
}
