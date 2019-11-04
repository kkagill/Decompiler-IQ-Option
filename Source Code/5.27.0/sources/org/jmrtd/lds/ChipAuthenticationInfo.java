package org.jmrtd.lds;

import java.math.BigInteger;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.DLSequence;

public class ChipAuthenticationInfo extends SecurityInfo {
    private static final Logger eNz = Logger.getLogger("org.jmrtd");
    private static final long serialVersionUID = 5591988305059068535L;
    private BigInteger keyId;
    private String oid;
    private int version;

    public ChipAuthenticationInfo(String str, int i) {
        this(str, i, null);
    }

    public ChipAuthenticationInfo(String str, int i, BigInteger bigInteger) {
        this.oid = str;
        this.version = i;
        this.keyId = bigInteger;
        bRm();
    }

    @Deprecated
    public ASN1Primitive bRj() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(new ASN1ObjectIdentifier(this.oid));
        aSN1EncodableVector.add(new ASN1Integer((long) this.version));
        BigInteger bigInteger = this.keyId;
        if (bigInteger != null) {
            aSN1EncodableVector.add(new ASN1Integer(bigInteger));
        }
        return new DLSequence(aSN1EncodableVector);
    }

    public String bRk() {
        return this.oid;
    }

    /* Access modifiers changed, original: protected */
    public void bRm() {
        try {
            StringBuilder stringBuilder;
            if (!np(this.oid)) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Wrong identifier: ");
                stringBuilder.append(this.oid);
                throw new IllegalArgumentException(stringBuilder.toString());
            } else if (this.version == 1) {
            } else {
                if (this.version != 2) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Wrong version. Was expecting 1 or 2, found ");
                    stringBuilder.append(this.version);
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
            }
        } catch (Exception e) {
            eNz.log(Level.WARNING, "Unexpected exception", e);
            throw new IllegalArgumentException("Malformed ChipAuthenticationInfo.");
        }
    }

    static boolean np(String str) {
        return fFb.equals(str) || fFc.equals(str) || "0.4.0.127.0.7.2.2.3.1.2".equals(str) || "0.4.0.127.0.7.2.2.3.1.3".equals(str) || "0.4.0.127.0.7.2.2.3.1.4".equals(str) || "0.4.0.127.0.7.2.2.3.2.2".equals(str) || "0.4.0.127.0.7.2.2.3.2.3".equals(str) || "0.4.0.127.0.7.2.2.3.2.4".equals(str);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ChipAuthenticationInfo [protocol: ");
        stringBuilder.append(nq(this.oid));
        stringBuilder.append(", version: ");
        stringBuilder.append(this.version);
        stringBuilder.append(", keyId: ");
        Object obj = this.keyId;
        if (obj == null) {
            obj = "-";
        }
        stringBuilder.append(obj);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public int hashCode() {
        String str = this.oid;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 11) + 3) + (this.version * 61);
        BigInteger bigInteger = this.keyId;
        return hashCode + ((bigInteger == null ? 111 : bigInteger.hashCode()) * 1991);
    }

    /* JADX WARNING: Missing block: B:20:0x0039, code skipped:
            if (r2.equals(r5.keyId) != false) goto L_0x003b;
     */
    public boolean equals(java.lang.Object r5) {
        /*
        r4 = this;
        r0 = 0;
        if (r5 != 0) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r1 = 1;
        if (r5 != r4) goto L_0x0008;
    L_0x0007:
        return r1;
    L_0x0008:
        r2 = org.jmrtd.lds.ChipAuthenticationInfo.class;
        r3 = r5.getClass();
        r2 = r2.equals(r3);
        if (r2 != 0) goto L_0x0015;
    L_0x0014:
        return r0;
    L_0x0015:
        r5 = (org.jmrtd.lds.ChipAuthenticationInfo) r5;
        r2 = r4.oid;
        r3 = r5.oid;
        r2 = r2.equals(r3);
        if (r2 == 0) goto L_0x003c;
    L_0x0021:
        r2 = r4.version;
        r3 = r5.version;
        if (r2 != r3) goto L_0x003c;
    L_0x0027:
        r2 = r4.keyId;
        if (r2 != 0) goto L_0x002f;
    L_0x002b:
        r2 = r5.keyId;
        if (r2 == 0) goto L_0x003b;
    L_0x002f:
        r2 = r4.keyId;
        if (r2 == 0) goto L_0x003c;
    L_0x0033:
        r5 = r5.keyId;
        r5 = r2.equals(r5);
        if (r5 == 0) goto L_0x003c;
    L_0x003b:
        r0 = 1;
    L_0x003c:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jmrtd.lds.ChipAuthenticationInfo.equals(java.lang.Object):boolean");
    }

    private static String nq(String str) {
        if (fFb.equals(str)) {
            return "id-CA-DH-3DES-CBC-CBC";
        }
        if ("0.4.0.127.0.7.2.2.3.1.2".equals(str)) {
            return "id-CA-DH-AES-CBC-CMAC-128";
        }
        if ("0.4.0.127.0.7.2.2.3.1.3".equals(str)) {
            return "id-CA-DH-AES-CBC-CMAC-192";
        }
        if ("0.4.0.127.0.7.2.2.3.1.4".equals(str)) {
            return "id-CA-DH-AES-CBC-CMAC-256";
        }
        if (fFc.equals(str)) {
            return "id-CA-ECDH-3DES-CBC-CBC";
        }
        if ("0.4.0.127.0.7.2.2.3.2.2".equals(str)) {
            return "id-CA-ECDH-AES-CBC-CMAC-128";
        }
        if ("0.4.0.127.0.7.2.2.3.2.3".equals(str)) {
            return "id-CA-ECDH-AES-CBC-CMAC-192";
        }
        if ("0.4.0.127.0.7.2.2.3.2.4".equals(str)) {
            str = "id-CA-ECDH-AES-CBC-CMAC-256";
        }
        return str;
    }
}
