package com.microblink.hardware.camera.camera1.frame;

import com.microblink.secured.i;
import com.microblink.secured.o;
import com.microblink.secured.q;
import com.microblink.util.Log;

/* compiled from: line */
public class Camera1PreviewFrame extends q {
    private o euB;

    private static native long initializeNativeCamera1Frame(long j, int i, int i2, byte[] bArr, boolean z, boolean z2, int i3, float f, float f2, float f3, float f4);

    private static native double nativeGetCamera1FrameQuality(long j);

    private static native void terminateNativeCamera1Frame(long j);

    public final boolean bds() {
        return false;
    }

    public final void bdr() {
        Log.e(this, "Finalizing frame ID: {}", Long.valueOf(this.euJ));
        terminateNativeCamera1Frame(this.IlIllIlIIl);
        this.IlIllIlIIl = 0;
        super.bdr();
    }

    public final void recycle() {
        o oVar = this.euB;
        if (oVar != null) {
            oVar.ewT.a(this);
        }
    }

    public final void dispose() {
        super.dispose();
        this.euB = null;
    }

    public final boolean cD(long j) {
        if (this.IlIllIlIIl == 0) {
            this.IlIllIlIIl = initializeNativeCamera1Frame(j, this.ewX, this.ewY, this.ewW, this.euF, this.euG, this.euI.intValue(), this.euH.left, this.euH.top, this.euH.width(), this.euH.height());
            return this.IlIllIlIIl != 0;
        } else {
            throw new IllegalStateException("Native part is already initialized!");
        }
    }

    static {
        i.bed();
    }
}
