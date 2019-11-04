package com.jumio.core.network.ale;

import com.jumio.alejwt.swig.ALECore;
import com.jumio.alejwt.swig.ALERequest;
import com.jumio.alejwt.swig.ALESettings;

public class SynchronizedAleCore extends ALECore {
    private boolean instanceValid = true;
    private final Object lock = new Object();

    protected SynchronizedAleCore(long j, boolean z) {
        super(j, z);
    }

    public SynchronizedAleCore(ALESettings aLESettings) {
        super(aLESettings);
    }

    public synchronized void delete() {
        synchronized (this.lock) {
            this.instanceValid = false;
            super.delete();
        }
    }

    public ALERequest createRequest() {
        ALERequest createRequest;
        synchronized (this.lock) {
            if (this.instanceValid) {
                createRequest = super.createRequest();
            } else {
                throw new Exception("AleCore instance not valid");
            }
        }
        return createRequest;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x000e */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:2|3|(1:5)(2:6|7)|8|9) */
    public void destroyRequest(com.jumio.alejwt.swig.ALERequest r3) {
        /*
        r2 = this;
        r0 = r2.lock;
        monitor-enter(r0);
        r1 = r2.instanceValid;	 Catch:{ all -> 0x0010 }
        if (r1 == 0) goto L_0x000b;
    L_0x0007:
        super.destroyRequest(r3);	 Catch:{ all -> 0x0010 }
        goto L_0x000e;
    L_0x000b:
        r3.delete();	 Catch:{ Exception -> 0x000e }
    L_0x000e:
        monitor-exit(r0);	 Catch:{ all -> 0x0010 }
        return;
    L_0x0010:
        r3 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0010 }
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jumio.core.network.ale.SynchronizedAleCore.destroyRequest(com.jumio.alejwt.swig.ALERequest):void");
    }
}
