package com.microblink.image;

import com.microblink.secured.m;

/* compiled from: line */
public class ImageFrame implements m {
    private long IlIllIlIIl = 0;
    protected Image euP;
    private long eug;

    private static native long nativeConstruct(long j, long j2);

    private static native void nativeDestruct(long j);

    public final boolean bds() {
        return true;
    }

    public ImageFrame(Image image, long j) {
        if (image != null) {
            this.euP = image;
            this.eug = j;
            return;
        }
        throw new NullPointerException("Image object cannot be null!");
    }

    public final boolean cD(long j) {
        this.IlIllIlIIl = nativeConstruct(j, this.euP.IlIllIlIIl);
        return this.IlIllIlIIl != 0;
    }

    public final void recycle() {
        nativeDestruct(this.IlIllIlIIl);
    }

    public final long bdt() {
        return this.IlIllIlIIl;
    }

    public final long bdu() {
        return this.eug;
    }

    public final void bdr() {
        throw new UnsupportedOperationException("Image frame should not be used in object pool.");
    }
}
