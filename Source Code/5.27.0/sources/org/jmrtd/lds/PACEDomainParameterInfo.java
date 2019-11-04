package org.jmrtd.lds;

import java.math.BigInteger;
import java.util.logging.Logger;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.DLSequence;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;

public class PACEDomainParameterInfo extends SecurityInfo {
    private static final Logger eNz = Logger.getLogger("org.jmrtd");
    private static final long serialVersionUID = -5851251908152594728L;
    private transient AlgorithmIdentifier fEH;
    private String oid;
    private BigInteger parameterId;

    public PACEDomainParameterInfo(String str, AlgorithmIdentifier algorithmIdentifier) {
        this(str, algorithmIdentifier, null);
    }

    public PACEDomainParameterInfo(String str, AlgorithmIdentifier algorithmIdentifier, BigInteger bigInteger) {
        if (np(str)) {
            this.oid = str;
            this.fEH = algorithmIdentifier;
            this.parameterId = bigInteger;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Invalid protocol id: ");
        stringBuilder.append(str);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public String bRk() {
        return this.oid;
    }

    @Deprecated
    public ASN1Primitive bRj() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(new ASN1ObjectIdentifier(this.oid));
        aSN1EncodableVector.add(this.fEH);
        BigInteger bigInteger = this.parameterId;
        if (bigInteger != null) {
            aSN1EncodableVector.add(new ASN1Integer(bigInteger));
        }
        return new DLSequence(aSN1EncodableVector);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PACEDomainParameterInfo");
        stringBuilder.append("[");
        stringBuilder.append("protocol: ");
        stringBuilder.append(nq(this.oid));
        String str = ", ";
        stringBuilder.append(str);
        stringBuilder.append("domainParameter: [");
        stringBuilder.append("algorithm: ");
        stringBuilder.append(this.fEH.getAlgorithm().getId());
        stringBuilder.append(str);
        stringBuilder.append("parameters: ");
        stringBuilder.append(this.fEH.getParameters());
        if (this.parameterId == null) {
            str = "";
        } else {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(", parameterId: ");
            stringBuilder2.append(this.parameterId);
            str = stringBuilder2.toString();
        }
        stringBuilder.append(str);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public int hashCode() {
        int i;
        int hashCode = ((this.oid.hashCode() * 7) + 111111111) + (this.fEH.hashCode() * 5);
        BigInteger bigInteger = this.parameterId;
        if (bigInteger == null) {
            i = 333;
        } else {
            i = bigInteger.hashCode();
        }
        return hashCode + (i * 3);
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!PACEDomainParameterInfo.class.equals(obj.getClass())) {
            return false;
        }
        return bRj().equals(((PACEDomainParameterInfo) obj).bRj());
    }

    public static boolean np(String str) {
        return "0.4.0.127.0.7.2.2.4.1".equals(str) || "0.4.0.127.0.7.2.2.4.2".equals(str) || "0.4.0.127.0.7.2.2.4.3".equals(str) || "0.4.0.127.0.7.2.2.4.4".equals(str) || "0.4.0.127.0.7.2.2.4.6".equals(str);
    }

    private static String nq(String str) {
        if ("0.4.0.127.0.7.2.2.4.1".equals(str)) {
            return "id-PACE-DH-GM";
        }
        if ("0.4.0.127.0.7.2.2.4.2".equals(str)) {
            return "id-PACE-ECDH-GM";
        }
        if ("0.4.0.127.0.7.2.2.4.3".equals(str)) {
            return "id-PACE-DH-IM";
        }
        if ("0.4.0.127.0.7.2.2.4.4".equals(str)) {
            return "id-PACE-ECDH-IM";
        }
        if ("0.4.0.127.0.7.2.2.4.6".equals(str)) {
            str = "id-PACE-ECDH-CAM";
        }
        return str;
    }
}
