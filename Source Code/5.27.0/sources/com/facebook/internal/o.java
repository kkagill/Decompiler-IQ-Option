package com.facebook.internal;

import android.graphics.Bitmap;

/* compiled from: ImageResponse */
public class o {
    private Bitmap bitmap;
    private n zd;
    private Exception zj;
    private boolean zk;

    o(n nVar, Exception exception, boolean z, Bitmap bitmap) {
        this.zd = nVar;
        this.zj = exception;
        this.bitmap = bitmap;
        this.zk = z;
    }

    public n ko() {
        return this.zd;
    }

    public Exception kp() {
        return this.zj;
    }

    public Bitmap getBitmap() {
        return this.bitmap;
    }

    public boolean kq() {
        return this.zk;
    }
}
