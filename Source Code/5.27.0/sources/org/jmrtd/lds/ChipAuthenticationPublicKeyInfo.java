package org.jmrtd.lds;

import java.math.BigInteger;
import java.security.PublicKey;
import org.jmrtd.e;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.DLSequence;

public class ChipAuthenticationPublicKeyInfo extends SecurityInfo {
    private static final long serialVersionUID = 5687291829854501771L;
    private BigInteger keyId;
    private String oid;
    private PublicKey publicKey;

    public ChipAuthenticationPublicKeyInfo(String str, PublicKey publicKey) {
        this(str, publicKey, null);
    }

    public ChipAuthenticationPublicKeyInfo(String str, PublicKey publicKey, BigInteger bigInteger) {
        this.oid = str;
        this.publicKey = e.c(publicKey);
        this.keyId = bigInteger;
        bRm();
    }

    @Deprecated
    public ASN1Primitive bRj() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(new ASN1ObjectIdentifier(this.oid));
        aSN1EncodableVector.add(e.b(this.publicKey).toASN1Primitive());
        BigInteger bigInteger = this.keyId;
        if (bigInteger != null) {
            aSN1EncodableVector.add(new ASN1Integer(bigInteger));
        }
        return new DLSequence(aSN1EncodableVector);
    }

    public String bRk() {
        return this.oid;
    }

    public PublicKey getSubjectPublicKey() {
        return this.publicKey;
    }

    /* Access modifiers changed, original: protected */
    public void bRm() {
        try {
            if (!np(this.oid)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Wrong identifier: ");
                stringBuilder.append(this.oid);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        } catch (Exception e) {
            throw new IllegalArgumentException("Malformed ChipAuthenticationInfo", e);
        }
    }

    public static boolean np(String str) {
        return fEZ.equals(str) || fFa.equals(str);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ChipAuthenticationPublicKeyInfo [protocol: ");
        stringBuilder.append(nq(this.oid));
        String str = ", ";
        stringBuilder.append(str);
        stringBuilder.append("chipAuthenticationPublicKey: ");
        stringBuilder.append(e.a(getSubjectPublicKey()));
        stringBuilder.append(str);
        stringBuilder.append("keyId: ");
        BigInteger bigInteger = this.keyId;
        if (bigInteger == null) {
            str = "-";
        } else {
            str = bigInteger.toString();
        }
        stringBuilder.append(str);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public int hashCode() {
        int hashCode = this.oid.hashCode();
        BigInteger bigInteger = this.keyId;
        int i = 111;
        hashCode += bigInteger == null ? 111 : bigInteger.hashCode();
        PublicKey publicKey = this.publicKey;
        if (publicKey != null) {
            i = publicKey.hashCode();
        }
        return ((hashCode + i) * 1337) + 123;
    }

    /* JADX WARNING: Missing block: B:18:0x0033, code skipped:
            if (r2.equals(r5.keyId) != false) goto L_0x0035;
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
        r2 = org.jmrtd.lds.ChipAuthenticationPublicKeyInfo.class;
        r3 = r5.getClass();
        r2 = r2.equals(r3);
        if (r2 != 0) goto L_0x0015;
    L_0x0014:
        return r0;
    L_0x0015:
        r5 = (org.jmrtd.lds.ChipAuthenticationPublicKeyInfo) r5;
        r2 = r4.oid;
        r3 = r5.oid;
        r2 = r2.equals(r3);
        if (r2 == 0) goto L_0x0040;
    L_0x0021:
        r2 = r4.keyId;
        if (r2 != 0) goto L_0x0029;
    L_0x0025:
        r2 = r5.keyId;
        if (r2 == 0) goto L_0x0035;
    L_0x0029:
        r2 = r4.keyId;
        if (r2 == 0) goto L_0x0040;
    L_0x002d:
        r3 = r5.keyId;
        r2 = r2.equals(r3);
        if (r2 == 0) goto L_0x0040;
    L_0x0035:
        r2 = r4.publicKey;
        r5 = r5.publicKey;
        r5 = r2.equals(r5);
        if (r5 == 0) goto L_0x0040;
    L_0x003f:
        r0 = 1;
    L_0x0040:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jmrtd.lds.ChipAuthenticationPublicKeyInfo.equals(java.lang.Object):boolean");
    }

    private static String nq(String str) {
        if (fEZ.equals(str)) {
            return "id-PK-DH";
        }
        if (fFa.equals(str)) {
            str = "id-PK-ECDH";
        }
        return str;
    }
}
