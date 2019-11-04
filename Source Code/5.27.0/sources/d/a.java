package d;

/* compiled from: Client */
public class a {
    public final g fMZ;
    public final d fNa;
    public final b fNb;

    public a(g gVar, d dVar, b bVar) {
        this.fMZ = gVar;
        this.fNa = dVar;
        this.fNb = bVar;
    }

    /* JADX WARNING: Missing block: B:21:0x003a, code skipped:
            if (r1.equals(r5.fNb) != false) goto L_0x0044;
     */
    /* JADX WARNING: Missing block: B:23:0x0040, code skipped:
            if (r4.fNb == r5.fNb) goto L_0x0044;
     */
    public boolean equals(java.lang.Object r5) {
        /*
        r4 = this;
        r0 = 1;
        if (r5 != r4) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r1 = r5 instanceof d.a;
        r2 = 0;
        if (r1 != 0) goto L_0x000a;
    L_0x0009:
        return r2;
    L_0x000a:
        r5 = (d.a) r5;
        r1 = r4.fMZ;
        if (r1 == 0) goto L_0x0018;
    L_0x0010:
        r3 = r5.fMZ;
        r1 = r1.equals(r3);
        if (r1 != 0) goto L_0x001e;
    L_0x0018:
        r1 = r4.fMZ;
        r3 = r5.fMZ;
        if (r1 != r3) goto L_0x0043;
    L_0x001e:
        r1 = r4.fNa;
        if (r1 == 0) goto L_0x002a;
    L_0x0022:
        r3 = r5.fNa;
        r1 = r1.equals(r3);
        if (r1 != 0) goto L_0x0030;
    L_0x002a:
        r1 = r4.fNa;
        r3 = r5.fNa;
        if (r1 != r3) goto L_0x0043;
    L_0x0030:
        r1 = r4.fNb;
        if (r1 == 0) goto L_0x003c;
    L_0x0034:
        r3 = r5.fNb;
        r1 = r1.equals(r3);
        if (r1 != 0) goto L_0x0044;
    L_0x003c:
        r1 = r4.fNb;
        r5 = r5.fNb;
        if (r1 != r5) goto L_0x0043;
    L_0x0042:
        goto L_0x0044;
    L_0x0043:
        r0 = 0;
    L_0x0044:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: d.a.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        g gVar = this.fMZ;
        int i = 0;
        int hashCode = gVar == null ? 0 : gVar.hashCode();
        d dVar = this.fNa;
        hashCode += dVar == null ? 0 : dVar.hashCode();
        b bVar = this.fNb;
        if (bVar != null) {
            i = bVar.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return String.format("{\"user_agent\": %s, \"os\": %s, \"device\": %s}", new Object[]{this.fMZ, this.fNa, this.fNb});
    }
}
