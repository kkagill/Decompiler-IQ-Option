package d;

/* compiled from: OS */
public class d {
    public final String fNf;
    public final String fNg;
    public final String fNh;
    public final String fNi;
    public final String hn;

    public d(String str, String str2, String str3, String str4, String str5) {
        this.hn = str;
        this.fNf = str2;
        this.fNg = str3;
        this.fNh = str4;
        this.fNi = str5;
    }

    /* JADX WARNING: Missing block: B:33:0x005e, code skipped:
            if (r1.equals(r5.fNi) != false) goto L_0x0068;
     */
    /* JADX WARNING: Missing block: B:35:0x0064, code skipped:
            if (r4.fNi == r5.fNi) goto L_0x0068;
     */
    public boolean equals(java.lang.Object r5) {
        /*
        r4 = this;
        r0 = 1;
        if (r5 != r4) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r1 = r5 instanceof d.d;
        r2 = 0;
        if (r1 != 0) goto L_0x000a;
    L_0x0009:
        return r2;
    L_0x000a:
        r5 = (d.d) r5;
        r1 = r4.hn;
        if (r1 == 0) goto L_0x0018;
    L_0x0010:
        r3 = r5.hn;
        r1 = r1.equals(r3);
        if (r1 != 0) goto L_0x001e;
    L_0x0018:
        r1 = r4.hn;
        r3 = r5.hn;
        if (r1 != r3) goto L_0x0067;
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
        if (r1 != r3) goto L_0x0067;
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
        if (r1 != r3) goto L_0x0067;
    L_0x0042:
        r1 = r4.fNh;
        if (r1 == 0) goto L_0x004e;
    L_0x0046:
        r3 = r5.fNh;
        r1 = r1.equals(r3);
        if (r1 != 0) goto L_0x0054;
    L_0x004e:
        r1 = r4.fNh;
        r3 = r5.fNh;
        if (r1 != r3) goto L_0x0067;
    L_0x0054:
        r1 = r4.fNi;
        if (r1 == 0) goto L_0x0060;
    L_0x0058:
        r3 = r5.fNi;
        r1 = r1.equals(r3);
        if (r1 != 0) goto L_0x0068;
    L_0x0060:
        r1 = r4.fNi;
        r5 = r5.fNi;
        if (r1 != r5) goto L_0x0067;
    L_0x0066:
        goto L_0x0068;
    L_0x0067:
        r0 = 0;
    L_0x0068:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: d.d.equals(java.lang.Object):boolean");
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
        hashCode += str2 == null ? 0 : str2.hashCode();
        str2 = this.fNi;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        String str;
        String str2;
        StringBuilder stringBuilder;
        Object[] objArr = new Object[5];
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
        if (this.fNh == null) {
            str2 = str3;
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append('\"');
            stringBuilder.append(this.fNh);
            stringBuilder.append('\"');
            str2 = stringBuilder.toString();
        }
        objArr[3] = str2;
        if (this.fNi != null) {
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append('\"');
            stringBuilder3.append(this.fNi);
            stringBuilder3.append('\"');
            str3 = stringBuilder3.toString();
        }
        objArr[4] = str3;
        return String.format("{\"family\": %s, \"major\": %s, \"minor\": %s, \"patch\": %s, \"patch_minor\": %s}", objArr);
    }
}
