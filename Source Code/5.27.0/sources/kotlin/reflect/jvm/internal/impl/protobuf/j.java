package kotlin.reflect.jvm.internal.impl.protobuf;

/* compiled from: LazyFieldLite */
public class j {
    private volatile boolean dY;
    private d fqv;
    private f fqw;
    protected volatile n fqx;

    public n h(n nVar) {
        j(nVar);
        return this.fqx;
    }

    public n i(n nVar) {
        n nVar2 = this.fqx;
        this.fqx = nVar;
        this.fqv = null;
        this.dY = true;
        return nVar2;
    }

    public int bzk() {
        if (this.dY) {
            return this.fqx.bzk();
        }
        return this.fqv.size();
    }

    /* Access modifiers changed, original: protected */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0023 */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:9|10|(1:12)(1:13)|14|15|16) */
    public void j(kotlin.reflect.jvm.internal.impl.protobuf.n r3) {
        /*
        r2 = this;
        r0 = r2.fqx;
        if (r0 == 0) goto L_0x0005;
    L_0x0004:
        return;
    L_0x0005:
        monitor-enter(r2);
        r0 = r2.fqx;	 Catch:{ all -> 0x0025 }
        if (r0 == 0) goto L_0x000c;
    L_0x000a:
        monitor-exit(r2);	 Catch:{ all -> 0x0025 }
        return;
    L_0x000c:
        r0 = r2.fqv;	 Catch:{ IOException -> 0x0023 }
        if (r0 == 0) goto L_0x0021;
    L_0x0010:
        r3 = r3.bzg();	 Catch:{ IOException -> 0x0023 }
        r0 = r2.fqv;	 Catch:{ IOException -> 0x0023 }
        r1 = r2.fqw;	 Catch:{ IOException -> 0x0023 }
        r3 = r3.c(r0, r1);	 Catch:{ IOException -> 0x0023 }
        r3 = (kotlin.reflect.jvm.internal.impl.protobuf.n) r3;	 Catch:{ IOException -> 0x0023 }
        r2.fqx = r3;	 Catch:{ IOException -> 0x0023 }
        goto L_0x0023;
    L_0x0021:
        r2.fqx = r3;	 Catch:{ IOException -> 0x0023 }
    L_0x0023:
        monitor-exit(r2);	 Catch:{ all -> 0x0025 }
        return;
    L_0x0025:
        r3 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0025 }
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.j.j(kotlin.reflect.jvm.internal.impl.protobuf.n):void");
    }
}
