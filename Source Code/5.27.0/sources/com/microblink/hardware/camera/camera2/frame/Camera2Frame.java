package com.microblink.hardware.camera.camera2.frame;

import android.annotation.TargetApi;
import android.graphics.RectF;
import android.media.Image;
import com.microblink.hardware.orientation.Orientation;
import com.microblink.secured.i;
import com.microblink.secured.m;
import com.microblink.secured.n;
import com.microblink.secured.p;
import com.microblink.util.Log;
import java.nio.ByteBuffer;

@TargetApi(21)
/* compiled from: line */
public class Camera2Frame implements m {
    private long IlIllIlIIl;
    public Image euC;
    private p euD;
    public n euE;
    public boolean euF;
    public boolean euG;
    private RectF euH;
    private Orientation euI;
    public long euJ;

    private static native long initializeNativeCamera2Frame(long j, int i, int i2, boolean z, boolean z2, int i3, float f, float f2, float f3, float f4, ByteBuffer byteBuffer, int i4, int i5, ByteBuffer byteBuffer2, int i6, int i7, ByteBuffer byteBuffer3, int i8, int i9);

    private static native double nativeGetCamera2FrameQuality(long j);

    private static native void terminateNativeCamera2Frame(long j);

    public final boolean bds() {
        return false;
    }

    public final void bdr() {
        Log.e(this, "Finalizing frame ID: {}", Long.valueOf(this.euJ));
        terminateNativeCamera2Frame(this.IlIllIlIIl);
        this.IlIllIlIIl = 0;
        Image image = this.euC;
        if (image != null) {
            this.euE.a(image);
            this.euE = null;
        }
    }

    public final void recycle() {
        this.euD.ewV.a(this);
    }

    public final boolean cD(long j) {
        if (this.IlIllIlIIl == 0) {
            this.IlIllIlIIl = initializeNativeCamera2Frame(j, this.euC.getWidth(), this.euC.getHeight(), this.euF, this.euG, this.euI.intValue(), this.euH.left, this.euH.top, this.euH.width(), this.euH.height(), this.euC.getPlanes()[0].getBuffer(), this.euC.getPlanes()[0].getRowStride(), this.euC.getPlanes()[0].getPixelStride(), this.euC.getPlanes()[1].getBuffer(), this.euC.getPlanes()[1].getRowStride(), this.euC.getPlanes()[1].getPixelStride(), this.euC.getPlanes()[2].getBuffer(), this.euC.getPlanes()[2].getRowStride(), this.euC.getPlanes()[2].getPixelStride());
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

    static {
        i.bed();
    }
}
