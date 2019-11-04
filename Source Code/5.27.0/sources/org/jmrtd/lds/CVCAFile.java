package org.jmrtd.lds;

import java.io.DataInputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class CVCAFile extends AbstractLDSFile {
    private static final long serialVersionUID = -1100904058684365703L;
    private String altCaReference;
    private String caReference;
    private short fid;

    public /* bridge */ /* synthetic */ byte[] getEncoded() {
        return super.getEncoded();
    }

    public CVCAFile(InputStream inputStream) {
        this((short) 284, inputStream);
    }

    public CVCAFile(short s, InputStream inputStream) {
        this.caReference = null;
        this.altCaReference = null;
        this.fid = s;
        r(inputStream);
    }

    public short bRn() {
        return this.fid;
    }

    /* Access modifiers changed, original: protected */
    public void r(InputStream inputStream) {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        int read = dataInputStream.read();
        if (read == 66) {
            read = dataInputStream.read();
            String str = "Wrong length";
            if (read <= 16) {
                byte[] bArr = new byte[read];
                dataInputStream.readFully(bArr);
                this.caReference = new String(bArr);
                read = dataInputStream.read();
                if (!(read == 0 || read == -1)) {
                    if (read == 66) {
                        read = dataInputStream.read();
                        if (read <= 16) {
                            bArr = new byte[read];
                            dataInputStream.readFully(bArr);
                            this.altCaReference = new String(bArr);
                            read = dataInputStream.read();
                        } else {
                            throw new IllegalArgumentException(str);
                        }
                    }
                    throw new IllegalArgumentException("Wrong tag");
                }
                while (read != -1) {
                    if (read == 0) {
                        read = dataInputStream.read();
                    } else {
                        throw new IllegalArgumentException("Bad file padding");
                    }
                }
                return;
            }
            throw new IllegalArgumentException(str);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Wrong tag, expected ");
        stringBuilder.append(Integer.toHexString(66));
        stringBuilder.append(", found ");
        stringBuilder.append(Integer.toHexString(read));
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    /* Access modifiers changed, original: protected */
    public void f(OutputStream outputStream) {
        byte[] bArr = new byte[36];
        bArr[0] = (byte) 66;
        bArr[1] = (byte) this.caReference.length();
        System.arraycopy(this.caReference.getBytes(), 0, bArr, 2, bArr[1]);
        String str = this.altCaReference;
        if (str != null) {
            int i = bArr[1] + 2;
            bArr[i] = (byte) 66;
            int i2 = i + 1;
            bArr[i2] = (byte) str.length();
            System.arraycopy(this.altCaReference.getBytes(), 0, bArr, i + 2, bArr[i2]);
        }
        outputStream.write(bArr);
    }

    public String toString() {
        String stringBuilder;
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("CA reference: \"");
        stringBuilder2.append(this.caReference);
        stringBuilder2.append("\"");
        if (this.altCaReference != null) {
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append(", Alternative CA reference: ");
            stringBuilder3.append(this.altCaReference);
            stringBuilder = stringBuilder3.toString();
        } else {
            stringBuilder = "";
        }
        stringBuilder2.append(stringBuilder);
        return stringBuilder2.toString();
    }

    /* JADX WARNING: Missing block: B:15:0x0031, code skipped:
            if (r1.equals(r4.altCaReference) != false) goto L_0x0033;
     */
    public boolean equals(java.lang.Object r4) {
        /*
        r3 = this;
        r0 = 0;
        if (r4 != 0) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r1 = r3.getClass();
        r2 = r4.getClass();
        r1 = r1.equals(r2);
        if (r1 != 0) goto L_0x0013;
    L_0x0012:
        return r0;
    L_0x0013:
        r4 = (org.jmrtd.lds.CVCAFile) r4;
        r1 = r3.caReference;
        r2 = r4.caReference;
        r1 = r1.equals(r2);
        if (r1 == 0) goto L_0x0034;
    L_0x001f:
        r1 = r3.altCaReference;
        if (r1 != 0) goto L_0x0027;
    L_0x0023:
        r1 = r4.altCaReference;
        if (r1 == 0) goto L_0x0033;
    L_0x0027:
        r1 = r3.altCaReference;
        if (r1 == 0) goto L_0x0034;
    L_0x002b:
        r4 = r4.altCaReference;
        r4 = r1.equals(r4);
        if (r4 == 0) goto L_0x0034;
    L_0x0033:
        r0 = 1;
    L_0x0034:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jmrtd.lds.CVCAFile.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int hashCode = this.caReference.hashCode() * 11;
        String str = this.altCaReference;
        return (hashCode + (str != null ? str.hashCode() * 13 : 0)) + 5;
    }
}
