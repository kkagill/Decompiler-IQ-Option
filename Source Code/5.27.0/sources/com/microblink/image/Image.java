package com.microblink.image;

import android.graphics.Bitmap;
import android.graphics.Rect;
import java.nio.ByteBuffer;

/* compiled from: line */
public class Image {
    long IlIllIlIIl = 0;
    private Integer euK;
    private Integer euL;
    private Rect euM;
    private final int euN = 1;
    Object euO = null;

    private static native long nativeClone(long j);

    private static native boolean nativeCopyPixelsToBitmap(long j, Bitmap bitmap);

    private static native void nativeDestruct(long j);

    private static native int nativeGetHeight(long j);

    private static native int nativeGetImageFormat(long j);

    private static native String nativeGetImageName(long j);

    private static native int nativeGetImageOrientation(long j);

    private static native int nativeGetImageType(long j);

    private static native ByteBuffer nativeGetPixelBuffer(long j);

    private static native void nativeGetRoi(long j, int[] iArr);

    private static native int nativeGetRowStride(long j);

    private static native int nativeGetWidth(long j);

    private static native void nativeSetImageOrientation(long j, int i);

    private static native void nativeSetRoi(long j, int i, int i2, int i3, int i4);

    Image(long j) {
        this.IlIllIlIIl = j;
    }

    public void dispose() {
        long j = this.IlIllIlIIl;
        if (j != 0) {
            nativeDestruct(j);
            this.IlIllIlIIl = 0;
            this.euO = null;
        }
    }

    /* Access modifiers changed, original: protected */
    public void finalize() {
        super.finalize();
        dispose();
    }

    /* renamed from: bdv */
    public Image clone() {
        long j = this.IlIllIlIIl;
        if (j != 0) {
            return new Image(nativeClone(j));
        }
        throw new IllegalStateException("Cannot clone disposed image!");
    }

    public int getWidth() {
        long j = this.IlIllIlIIl;
        if (j != 0) {
            if (this.euK == null) {
                this.euK = Integer.valueOf(nativeGetWidth(j));
            }
            return this.euK.intValue();
        }
        throw new IllegalStateException("Cannot use disposed image!");
    }

    public int getHeight() {
        long j = this.IlIllIlIIl;
        if (j != 0) {
            if (this.euL == null) {
                this.euL = Integer.valueOf(nativeGetHeight(j));
            }
            return this.euL.intValue();
        }
        throw new IllegalStateException("Cannot use disposed image!");
    }

    public Rect bdw() {
        long j = this.IlIllIlIIl;
        if (j != 0) {
            if (this.euM == null) {
                int[] iArr = new int[4];
                nativeGetRoi(j, iArr);
                this.euM = new Rect(iArr[0], iArr[1], iArr[2], iArr[3]);
            }
            return this.euM;
        }
        throw new IllegalStateException("Cannot use disposed image!");
    }

    public boolean isDisposed() {
        return this.IlIllIlIIl == 0;
    }
}
