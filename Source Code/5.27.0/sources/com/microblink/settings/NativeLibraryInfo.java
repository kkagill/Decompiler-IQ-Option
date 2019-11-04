package com.microblink.settings;

import com.microblink.secured.IllllIIlII;
import com.microblink.secured.e;
import com.microblink.secured.i;

/* compiled from: line */
public class NativeLibraryInfo {
    private long IlIllIlIIl;

    public static native String getNativeBuildVersion();

    public static native boolean isProtectionEnabled();

    public static native boolean isWeakProtectionEnabled();

    private static native long nativeConstruct();

    private static native void nativeDestruct(long j);

    private static native String nativeGetErrorList(long j);

    private static native int nativeGetMaxImageSize(long j);

    private static native boolean nativeIsLibrarySuccessfullyInitialized(long j);

    private static native int nativeObtainProductId();

    /* Access modifiers changed, original: protected */
    public void finalize() {
        super.finalize();
        long j = this.IlIllIlIIl;
        if (j != 0) {
            nativeDestruct(j);
        }
    }

    static {
        i.bed();
        i.bed();
    }

    public NativeLibraryInfo(long j) {
        this.IlIllIlIIl = 0;
        this.IlIllIlIIl = j;
    }

    public NativeLibraryInfo() {
        this.IlIllIlIIl = 0;
        this.IlIllIlIIl = nativeConstruct();
    }

    public final boolean beH() {
        return nativeIsLibrarySuccessfullyInitialized(this.IlIllIlIIl);
    }

    public String beI() {
        String nativeGetErrorList = nativeGetErrorList(this.IlIllIlIIl);
        return nativeGetErrorList == null ? "" : nativeGetErrorList;
    }

    public static e beJ() {
        return new e(IllllIIlII.values()[nativeObtainProductId()], getNativeBuildVersion());
    }
}
