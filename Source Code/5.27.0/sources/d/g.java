package d;

/* compiled from: UserAgent */
public class g {
    public final String fNf;
    public final String fNg;
    public final String fNh;
    public final String hn;

    public g(String str, String str2, String str3, String str4) {
        this.hn = str;
        this.fNf = str2;
        this.fNg = str3;
        this.fNh = str4;
    }

    /* JADX WARNING: Missing block: B:27:0x004c, code skipped:
            if (r1.equals(r5.fNh) != false) goto L_0x0056;
     */
    /* JADX WARNING: Missing block: B:29:0x0052, code skipped:
            if (r4.fNh == r5.fNh) goto L_0x0056;
     */
    public boolean equals(java.lang.Object r5) {
        /*
        r4 = this;
        r0 = 1;
        if (r5 != r4) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r1 = r5 instanceof d.g;
        r2 = 0;
        if (r1 != 0) goto L_0x000a;
    L_0x0009:
        return r2;
    L_0x000a:
        r5 = (d.g) r5;
        r1 = r4.hn;
        if (r1 == 0) goto L_0x0018;
    L_0x0010:
        r3 = r5.hn;
        r1 = r1.equals(r3);
        if (r1 != 0) goto L_0x001e;
    L_0x0018:
        r1 = r4.hn;
        r3 = r5.hn;
        if (r1 != r3) goto L_0x0055;
    L_0x001e:
        r1 = r4.fNf;
        if (r1 == 0) goto L_0x002a;
    L_0x0022:
        r3 = r5.fNf;
        r1 = r1.equals(r3);
        if (r1 != 0) goto L_0x0030;
    L_0x002a:
        r1 = r4.fNf;
        r3 = r5.fNf;
        if (r1 != r3) goto L_0x0055;
    L_0x0030:
        r1 = r4.fNg;
        if (r1 == 0) goto L_0x003c;
    L_0x0034:
        r3 = r5.fNg;
        r1 = r1.equals(r3);
        if (r1 != 0) goto L_0x0042;
    L_0x003c:
        r1 = r4.fNg;
        r3 = r5.fNg;
        if (r1 != r3) goto L_0x0055;
    L_0x0042:
        r1 = r4.fNh;
        if (r1 == 0) goto L_0x004e;
    L_0x0046:
        r3 = r5.fNh;
        r1 = r1.equals(r3);
        if (r1 != 0) goto L_0x0056;
    L_0x004e:
        r1 = r4.fNh;
        r5 = r5.fNh;
        if (r1 != r5) goto L_0x0055;
    L_0x0054:
        goto L_0x0056;
    L_0x0055:
        r0 = 0;
    L_0x0056:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: d.g.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        String str = this.hn;
        int i = 0;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.fNf;
        hashCode += str2 == null ? 0 : str2.hashCode();
        str2 = this.fNg;
        hashCode += str2 == null ? 0 : str2.hashCode();
        str2 = this.fNh;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        String str;
        String str2;
        StringBuilder stringBuilder;
        Object[] objArr = new Object[4];
        String str3 = "\"\"";
        if (this.hn == null) {
            str = str3;
        } else {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append('\"');
            stringBuilder2.append(this.hn);
            stringBuilder2.append('\"');
            str = stringBuilder2.toString();
        }
        objArr[0] = str;
        if (this.fNf == null) {
            str2 = str3;
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append('\"');
            stringBuilder.append(this.fNf);
            stringBuilder.append('\"');
            str2 = stringBuilder.toString();
        }
        objArr[1] = str2;
        if (this.fNg == null) {
            str2 = str3;
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append('\"');
            stringBuilder.append(this.fNg);
            stringBuilder.append('\"');
            str2 = stringBuilder.toString();
        }
        objArr[2] = str2;
        if (this.fNh != null) {
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append('\"');
            stringBuilder3.append(this.fNh);
            stringBuilder3.append('\"');
            str3 = stringBuilder3.toString();
        }
        objArr[3] = str3;
        return String.format("{\"family\": %s, \"major\": %s, \"minor\": %s, \"patch\": %s}", objArr);
    }
}
