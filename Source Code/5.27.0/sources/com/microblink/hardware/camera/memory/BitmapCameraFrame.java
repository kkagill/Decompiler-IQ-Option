package com.microblink.hardware.camera.memory;

import android.graphics.Bitmap;
import android.graphics.RectF;
import com.microblink.hardware.orientation.Orientation;
import com.microblink.secured.m;

/* compiled from: line */
public class BitmapCameraFrame implements m {
    private long IlIllIlIIl;
    private RectF euH;
    private Orientation euI;
    private long euJ;
    private Bitmap mBitmap;

    private static native long initializeNativeBitmapFrame(long j, Bitmap bitmap, int i, float f, float f2, float f3, float f4);

    private static native void terminateNativeBitmapFrame(long j);

    public final void bdr() {
    }

    public final boolean bds() {
        return true;
    }

    public final void recycle() {
        terminateNativeBitmapFrame(this.IlIllIlIIl);
        this.IlIllIlIIl = 0;
        this.mBitmap = null;
    }

    public final boolean cD(long j) {
        if (this.IlIllIlIIl == 0) {
            this.IlIllIlIIl = initializeNativeBitmapFrame(j, this.mBitmap, this.euI.intValue(), this.euH.left, this.euH.top, this.euH.width(), this.euH.height());
            return this.IlIllIlIIl != 0;
        } else {
            throw new IllegalStateException("Native part is already initialized!");
        }
    }

    public final long bdt() {
        return this.IlIllIlIIl;
    }

    public final long bdu() {
        return this.euJ;
    }
}
