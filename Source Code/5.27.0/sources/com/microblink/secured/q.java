package com.microblink.secured;

import android.graphics.RectF;
import com.microblink.hardware.orientation.Orientation;

/* compiled from: line */
public abstract class q implements m {
    protected long IlIllIlIIl;
    protected boolean euF;
    protected boolean euG;
    protected RectF euH;
    protected Orientation euI;
    protected long euJ;
    protected byte[] ewW;
    protected int ewX;
    protected int ewY;
    protected ad ewZ;

    public final byte[] bem() {
        return this.ewW;
    }

    public void dispose() {
        this.ewW = null;
        this.ewZ = null;
        this.euH = null;
        this.euI = null;
    }

    public void bdr() {
        ad adVar = this.ewZ;
        if (adVar != null) {
            adVar.a(this);
        }
        this.euH = null;
        this.euI = null;
    }

    public long bdt() {
        return this.IlIllIlIIl;
    }

    public final long bdu() {
        return this.euJ;
    }
}
