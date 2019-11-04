package org.jmrtd.lds;

import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DEROctetString;
import org.spongycastle.asn1.DLSequence;

public class TerminalAuthenticationInfo extends SecurityInfo {
    private static final long serialVersionUID = 6220506985707094044L;
    private transient ASN1Sequence fFp;
    private String oid;
    private int version;

    TerminalAuthenticationInfo(String str, int i, ASN1Sequence aSN1Sequence) {
        this.oid = str;
        this.version = i;
        this.fFp = aSN1Sequence;
        bRm();
    }

    TerminalAuthenticationInfo(String str, int i) {
        this(str, i, null);
    }

    public TerminalAuthenticationInfo() {
        this(fFd, 1);
    }

    @Deprecated
    public ASN1Primitive bRj() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(new ASN1ObjectIdentifier(this.oid));
        aSN1EncodableVector.add(new ASN1Integer((long) this.version));
        ASN1Sequence aSN1Sequence = this.fFp;
        if (aSN1Sequence != null) {
            aSN1EncodableVector.add(aSN1Sequence);
        }
        return new DLSequence(aSN1EncodableVector);
    }

    public String bRk() {
        return this.oid;
    }

    public int bRy() {
        return a(this.fFp);
    }

    public byte bRz() {
        return b(this.fFp);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TerminalAuthenticationInfo [");
        stringBuilder.append("protocol: ");
        stringBuilder.append(nq(this.oid));
        String str = ", ";
        stringBuilder.append(str);
        stringBuilder.append("version: ");
        stringBuilder.append(this.version);
        stringBuilder.append(str);
        stringBuilder.append("fileID: ");
        stringBuilder.append(bRy());
        stringBuilder.append(str);
        stringBuilder.append("shortFileID: ");
        stringBuilder.append(bRz());
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public int hashCode() {
        int i;
        int i2;
        String str = this.oid;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        i = ((i * 7) + 123) + (this.version * 5);
        ASN1Sequence aSN1Sequence = this.fFp;
        if (aSN1Sequence == null) {
            i2 = 1;
        } else {
            i2 = aSN1Sequence.hashCode();
        }
        return i + (i2 * 3);
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!TerminalAuthenticationInfo.class.equals(obj.getClass())) {
            return false;
        }
        TerminalAuthenticationInfo terminalAuthenticationInfo = (TerminalAuthenticationInfo) obj;
        if (this.fFp == null && terminalAuthenticationInfo.fFp != null) {
            return false;
        }
        if (this.fFp == null || terminalAuthenticationInfo.fFp != null) {
            return bRj().equals(terminalAuthenticationInfo.bRj());
        }
        return false;
    }

    static boolean np(String str) {
        return fFd.equals(str);
    }

    private void bRm() {
        try {
            StringBuilder stringBuilder;
            if (np(this.oid)) {
                if (this.version != 1) {
                    if (this.version != 2) {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("Wrong version. Was expecting 1 or 2, found ");
                        stringBuilder.append(this.version);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    }
                }
                if (this.fFp == null) {
                    return;
                }
                if (((DEROctetString) this.fFp.getObjectAt(0)).getOctets().length != 2) {
                    throw new IllegalArgumentException("Malformed FID.");
                } else if (this.fFp.size() != 2) {
                    return;
                } else {
                    if (((DEROctetString) this.fFp.getObjectAt(1)).getOctets().length != 1) {
                        throw new IllegalArgumentException("Malformed SFI.");
                    }
                    return;
                }
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append("Wrong identifier: ");
            stringBuilder.append(this.oid);
            throw new IllegalArgumentException(stringBuilder.toString());
        } catch (Exception e) {
            throw new IllegalArgumentException("Malformed TerminalAuthenticationInfo", e);
        }
    }

    private static short a(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence == null) {
            return (short) -1;
        }
        byte[] octets = ((DEROctetString) aSN1Sequence.getObjectAt(0)).getOctets();
        return (short) ((octets[1] & 255) | ((octets[0] & 255) << 8));
    }

    private static byte b(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence != null && aSN1Sequence.size() == 2) {
            return ((DEROctetString) aSN1Sequence.getObjectAt(1)).getOctets()[0];
        }
        return (byte) -1;
    }

    private String nq(String str) {
        if (fFd.equals(str)) {
            return "id-TA";
        }
        if (fFe.equals(str)) {
            return "id-TA-RSA";
        }
        if (fFf.equals(str)) {
            return "id-TA-RSA-v1-5-SHA-1";
        }
        if (fFg.equals(str)) {
            return "id-TA-RSA-v1-5-SHA-256";
        }
        if (fFh.equals(str)) {
            return "id-TA-RSA-PSS-SHA-1";
        }
        if (fFi.equals(str)) {
            return "id-TA-RSA-PSS-SHA-256";
        }
        if (fFj.equals(str)) {
            return "id-TA-ECDSA";
        }
        if (fFk.equals(str)) {
            return "id-TA-ECDSA-SHA-1";
        }
        if (fFl.equals(str)) {
            return "id-TA-ECDSA-SHA-224";
        }
        if (fFm.equals(str)) {
            str = "id-TA-ECDSA-SHA-256";
        }
        return str;
    }
}
