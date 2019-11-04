package com.microblink.recognition;

import androidx.annotation.Keep;

/* compiled from: line */
public class RightsManager {
    public long IlIllIlIIl = 0;

    private static native void nativeDestruct(long j);

    public static native int nativeGetPingInterval(long j);

    public static native boolean nativeIsLicenseOk(long j);

    private static native boolean nativeIsRightEnabled(long j, int i);

    @Keep
    protected RightsManager(long j) {
        this.IlIllIlIIl = j;
    }

    public final boolean a(Right right) {
        return nativeIsRightEnabled(this.IlIllIlIIl, right.IIIIlIllIl);
    }

    /* Access modifiers changed, original: protected */
    public void finalize() {
        super.finalize();
        long j = this.IlIllIlIIl;
        if (j != 0) {
            nativeDestruct(j);
        }
    }
}
