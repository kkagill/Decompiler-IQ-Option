package org.jmrtd.lds;

import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.ECParameterSpec;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;
import javax.crypto.spec.DHParameterSpec;
import org.jmrtd.e;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.DLSequence;
import org.spongycastle.crypto.agreement.DHStandardGroups;
import org.spongycastle.jce.ECNamedCurveTable;

public class PACEInfo extends SecurityInfo {
    private static final DHParameterSpec fEI = e.a(DHStandardGroups.rfc5114_1024_160);
    private static final DHParameterSpec fEJ = e.a(DHStandardGroups.rfc5114_2048_224);
    private static final DHParameterSpec fEK = e.a(DHStandardGroups.rfc5114_2048_256);
    private static final ECParameterSpec fEL = e.a(ECNamedCurveTable.getParameterSpec("secp192r1"));
    private static final ECParameterSpec fEM = e.a(ECNamedCurveTable.getParameterSpec("secp224r1"));
    private static final ECParameterSpec fEN = e.a(ECNamedCurveTable.getParameterSpec("secp256r1"));
    private static final ECParameterSpec fEO = e.a(ECNamedCurveTable.getParameterSpec("secp384r1"));
    private static final ECParameterSpec fEP = e.a(ECNamedCurveTable.getParameterSpec("secp521r1"));
    private static final ECParameterSpec fEQ = e.a(ECNamedCurveTable.getParameterSpec("brainpoolp192r1"));
    private static final ECParameterSpec fER = e.a(ECNamedCurveTable.getParameterSpec("brainpoolp224r1"));
    private static final ECParameterSpec fES = e.a(ECNamedCurveTable.getParameterSpec("brainpoolp256r1"));
    private static final ECParameterSpec fET = e.a(ECNamedCurveTable.getParameterSpec("brainpoolp320r1"));
    private static final ECParameterSpec fEU = e.a(ECNamedCurveTable.getParameterSpec("brainpoolp384r1"));
    private static final ECParameterSpec fEV = e.a(ECNamedCurveTable.getParameterSpec("brainpoolp512r1"));
    private static final Set<String> fEW = new TreeSet(Arrays.asList(new String[]{"0.4.0.127.0.7.2.2.4.1.1", "0.4.0.127.0.7.2.2.4.1.2", "0.4.0.127.0.7.2.2.4.1.3", "0.4.0.127.0.7.2.2.4.1.4", "0.4.0.127.0.7.2.2.4.3.1", "0.4.0.127.0.7.2.2.4.3.2", "0.4.0.127.0.7.2.2.4.3.3", "0.4.0.127.0.7.2.2.4.3.4", "0.4.0.127.0.7.2.2.4.2.1", "0.4.0.127.0.7.2.2.4.2.2", "0.4.0.127.0.7.2.2.4.2.3", "0.4.0.127.0.7.2.2.4.2.4", "0.4.0.127.0.7.2.2.4.4.1", "0.4.0.127.0.7.2.2.4.4.2", "0.4.0.127.0.7.2.2.4.4.3", "0.4.0.127.0.7.2.2.4.4.4", "0.4.0.127.0.7.2.2.4.6.2", "0.4.0.127.0.7.2.2.4.6.3", "0.4.0.127.0.7.2.2.4.6.4"}));
    private static final long serialVersionUID = 7960925013249578359L;
    private BigInteger parameterId;
    private String protocolOID;
    private int version;

    public enum MappingType {
        GM,
        IM,
        CAM
    }

    public static class a extends DHParameterSpec {
        private BigInteger fEX;

        public a(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
            super(bigInteger, bigInteger2);
            this.fEX = bigInteger3;
        }

        public BigInteger getQ() {
            return this.fEX;
        }
    }

    public PACEInfo(String str, int i, int i2) {
        this(str, i, BigInteger.valueOf((long) i2));
    }

    public PACEInfo(String str, int i, BigInteger bigInteger) {
        if (!np(str)) {
            throw new IllegalArgumentException("Invalid OID");
        } else if (i == 2) {
            this.protocolOID = str;
            this.version = i;
            this.parameterId = bigInteger;
        } else {
            throw new IllegalArgumentException("Invalid version, must be 2");
        }
    }

    public String bRk() {
        return this.protocolOID;
    }

    public BigInteger bRr() {
        return this.parameterId;
    }

    @Deprecated
    public ASN1Primitive bRj() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(new ASN1ObjectIdentifier(this.protocolOID));
        aSN1EncodableVector.add(new ASN1Integer((long) this.version));
        BigInteger bigInteger = this.parameterId;
        if (bigInteger != null) {
            aSN1EncodableVector.add(new ASN1Integer(bigInteger));
        }
        return new DLSequence(aSN1EncodableVector);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PACEInfo [");
        stringBuilder.append("protocol: ");
        stringBuilder.append(nq(this.protocolOID));
        stringBuilder.append(", version: ");
        stringBuilder.append(this.version);
        if (this.parameterId != null) {
            stringBuilder.append(", parameterId: ");
            stringBuilder.append(c(this.parameterId));
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public int hashCode() {
        int i;
        int hashCode = ((this.protocolOID.hashCode() * 7) + 1234567891) + (this.version * 5);
        BigInteger bigInteger = this.parameterId;
        if (bigInteger == null) {
            i = 1991;
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
        if (!PACEInfo.class.equals(obj.getClass())) {
            return false;
        }
        return bRj().equals(((PACEInfo) obj).bRj());
    }

    public static boolean np(String str) {
        return fEW.contains(str);
    }

    public static MappingType ns(String str) {
        if ("0.4.0.127.0.7.2.2.4.1.1".equals(str) || "0.4.0.127.0.7.2.2.4.1.2".equals(str) || "0.4.0.127.0.7.2.2.4.1.3".equals(str) || "0.4.0.127.0.7.2.2.4.1.4".equals(str) || "0.4.0.127.0.7.2.2.4.2.1".equals(str) || "0.4.0.127.0.7.2.2.4.2.2".equals(str) || "0.4.0.127.0.7.2.2.4.2.3".equals(str) || "0.4.0.127.0.7.2.2.4.2.4".equals(str)) {
            return MappingType.GM;
        }
        if ("0.4.0.127.0.7.2.2.4.3.1".equals(str) || "0.4.0.127.0.7.2.2.4.3.2".equals(str) || "0.4.0.127.0.7.2.2.4.3.3".equals(str) || "0.4.0.127.0.7.2.2.4.3.4".equals(str) || "0.4.0.127.0.7.2.2.4.4.1".equals(str) || "0.4.0.127.0.7.2.2.4.4.2".equals(str) || "0.4.0.127.0.7.2.2.4.4.3".equals(str) || "0.4.0.127.0.7.2.2.4.4.4".equals(str)) {
            return MappingType.IM;
        }
        if ("0.4.0.127.0.7.2.2.4.6.2".equals(str) || "0.4.0.127.0.7.2.2.4.6.3".equals(str) || "0.4.0.127.0.7.2.2.4.6.4".equals(str)) {
            return MappingType.CAM;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unknown OID: \"");
        stringBuilder.append(str);
        stringBuilder.append("\"");
        throw new NumberFormatException(stringBuilder.toString());
    }

    public static String nt(String str) {
        if ("0.4.0.127.0.7.2.2.4.1.1".equals(str) || "0.4.0.127.0.7.2.2.4.1.2".equals(str) || "0.4.0.127.0.7.2.2.4.1.3".equals(str) || "0.4.0.127.0.7.2.2.4.1.4".equals(str) || "0.4.0.127.0.7.2.2.4.3.1".equals(str) || "0.4.0.127.0.7.2.2.4.3.2".equals(str) || "0.4.0.127.0.7.2.2.4.3.3".equals(str) || "0.4.0.127.0.7.2.2.4.3.4".equals(str)) {
            return "DH";
        }
        if ("0.4.0.127.0.7.2.2.4.2.1".equals(str) || "0.4.0.127.0.7.2.2.4.2.2".equals(str) || "0.4.0.127.0.7.2.2.4.2.3".equals(str) || "0.4.0.127.0.7.2.2.4.2.4".equals(str) || "0.4.0.127.0.7.2.2.4.4.1".equals(str) || "0.4.0.127.0.7.2.2.4.4.2".equals(str) || "0.4.0.127.0.7.2.2.4.4.3".equals(str) || "0.4.0.127.0.7.2.2.4.4.4".equals(str) || "0.4.0.127.0.7.2.2.4.6.2".equals(str) || "0.4.0.127.0.7.2.2.4.6.3".equals(str) || "0.4.0.127.0.7.2.2.4.6.4".equals(str)) {
            return "ECDH";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unknown OID: \"");
        stringBuilder.append(str);
        stringBuilder.append("\"");
        throw new NumberFormatException(stringBuilder.toString());
    }

    public static String nu(String str) {
        if ("0.4.0.127.0.7.2.2.4.1.1".equals(str) || "0.4.0.127.0.7.2.2.4.3.1".equals(str) || "0.4.0.127.0.7.2.2.4.2.1".equals(str) || "0.4.0.127.0.7.2.2.4.4.1".equals(str)) {
            return "DESede";
        }
        if ("0.4.0.127.0.7.2.2.4.1.2".equals(str) || "0.4.0.127.0.7.2.2.4.1.3".equals(str) || "0.4.0.127.0.7.2.2.4.1.4".equals(str) || "0.4.0.127.0.7.2.2.4.3.2".equals(str) || "0.4.0.127.0.7.2.2.4.3.3".equals(str) || "0.4.0.127.0.7.2.2.4.3.4".equals(str) || "0.4.0.127.0.7.2.2.4.2.2".equals(str) || "0.4.0.127.0.7.2.2.4.2.3".equals(str) || "0.4.0.127.0.7.2.2.4.2.4".equals(str) || "0.4.0.127.0.7.2.2.4.4.2".equals(str) || "0.4.0.127.0.7.2.2.4.4.3".equals(str) || "0.4.0.127.0.7.2.2.4.4.4".equals(str) || "0.4.0.127.0.7.2.2.4.6.2".equals(str) || "0.4.0.127.0.7.2.2.4.6.3".equals(str) || "0.4.0.127.0.7.2.2.4.6.4".equals(str)) {
            return "AES";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unknown OID: \"");
        stringBuilder.append(str);
        stringBuilder.append("\"");
        throw new NumberFormatException(stringBuilder.toString());
    }

    public static String nv(String str) {
        if ("0.4.0.127.0.7.2.2.4.1.1".equals(str) || "0.4.0.127.0.7.2.2.4.3.1".equals(str) || "0.4.0.127.0.7.2.2.4.2.1".equals(str) || "0.4.0.127.0.7.2.2.4.4.1".equals(str) || "0.4.0.127.0.7.2.2.4.1.2".equals(str) || "0.4.0.127.0.7.2.2.4.3.2".equals(str) || "0.4.0.127.0.7.2.2.4.2.2".equals(str) || "0.4.0.127.0.7.2.2.4.4.2".equals(str) || "0.4.0.127.0.7.2.2.4.6.2".equals(str)) {
            return "SHA-1";
        }
        if ("0.4.0.127.0.7.2.2.4.1.3".equals(str) || "0.4.0.127.0.7.2.2.4.3.3".equals(str) || "0.4.0.127.0.7.2.2.4.2.3".equals(str) || "0.4.0.127.0.7.2.2.4.4.3".equals(str) || "0.4.0.127.0.7.2.2.4.6.3".equals(str) || "0.4.0.127.0.7.2.2.4.1.4".equals(str) || "0.4.0.127.0.7.2.2.4.3.4".equals(str) || "0.4.0.127.0.7.2.2.4.2.4".equals(str) || "0.4.0.127.0.7.2.2.4.4.4".equals(str) || "0.4.0.127.0.7.2.2.4.6.4".equals(str)) {
            return "SHA-256";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unknown OID: \"");
        stringBuilder.append(str);
        stringBuilder.append("\"");
        throw new NumberFormatException(stringBuilder.toString());
    }

    public static int nw(String str) {
        if ("0.4.0.127.0.7.2.2.4.1.1".equals(str) || "0.4.0.127.0.7.2.2.4.3.1".equals(str) || "0.4.0.127.0.7.2.2.4.2.1".equals(str) || "0.4.0.127.0.7.2.2.4.4.1".equals(str) || "0.4.0.127.0.7.2.2.4.1.2".equals(str) || "0.4.0.127.0.7.2.2.4.3.2".equals(str) || "0.4.0.127.0.7.2.2.4.2.2".equals(str) || "0.4.0.127.0.7.2.2.4.4.2".equals(str) || "0.4.0.127.0.7.2.2.4.6.2".equals(str)) {
            return 128;
        }
        if ("0.4.0.127.0.7.2.2.4.1.3".equals(str) || "0.4.0.127.0.7.2.2.4.2.3".equals(str) || "0.4.0.127.0.7.2.2.4.3.3".equals(str) || "0.4.0.127.0.7.2.2.4.4.3".equals(str) || "0.4.0.127.0.7.2.2.4.6.3".equals(str)) {
            return 192;
        }
        if ("0.4.0.127.0.7.2.2.4.1.4".equals(str) || "0.4.0.127.0.7.2.2.4.3.4".equals(str) || "0.4.0.127.0.7.2.2.4.2.4".equals(str) || "0.4.0.127.0.7.2.2.4.4.4".equals(str) || "0.4.0.127.0.7.2.2.4.6.4".equals(str)) {
            return 256;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unknown OID: \"");
        stringBuilder.append(str);
        stringBuilder.append("\"");
        throw new NumberFormatException(stringBuilder.toString());
    }

    public static AlgorithmParameterSpec b(BigInteger bigInteger) {
        return mY(bigInteger.intValue());
    }

    public static AlgorithmParameterSpec mY(int i) {
        if (i == 0) {
            return fEI;
        }
        if (i == 1) {
            return fEJ;
        }
        if (i == 2) {
            return fEK;
        }
        switch (i) {
            case 8:
                return fEL;
            case 9:
                return fEQ;
            case 10:
                return fEM;
            case 11:
                return fER;
            case 12:
                return fEN;
            case 13:
                return fES;
            case 14:
                return fET;
            case 15:
                return fEO;
            case 16:
                return fEU;
            case 17:
                return fEV;
            case 18:
                return fEP;
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unknown standardized domain parameters ");
                stringBuilder.append(i);
                throw new NumberFormatException(stringBuilder.toString());
        }
    }

    public static String c(BigInteger bigInteger) {
        if (bigInteger == null) {
            return "null";
        }
        int intValue = bigInteger.intValue();
        if (intValue == 0) {
            return "1024-bit MODP Group with 160-bit Prime Order Subgroup";
        }
        if (intValue == 1) {
            return "2048-bit MODP Group with 224-bit Prime Order Subgroup";
        }
        if (intValue == 2) {
            return "2048-bit MODP Group with 256-bit Prime Order Subgroup";
        }
        switch (intValue) {
            case 8:
                return "NIST P-192 (secp192r1)";
            case 9:
                return "BrainpoolP192r1";
            case 10:
                return "NIST P-224 (secp224r1)";
            case 11:
                return "BrainpoolP224r1";
            case 12:
                return "NIST P-256 (secp256r1)";
            case 13:
                return "BrainpoolP256r1";
            case 14:
                return "BrainpoolP320r1";
            case 15:
                return "NIST P-384 (secp384r1)";
            case 16:
                return "BrainpoolP384r1";
            case 17:
                return "BrainpoolP512r1";
            case 18:
                return "NIST P-521 (secp521r1)";
            default:
                return bigInteger.toString();
        }
    }

    private String nq(String str) {
        if ("0.4.0.127.0.7.2.2.4.1.1".equals(str)) {
            return "id-PACE-DH-GM-3DES-CBC-CBC";
        }
        if ("0.4.0.127.0.7.2.2.4.1.2".equals(str)) {
            return "id-PACE-DH-GM-AES-CBC-CMAC-128";
        }
        if ("0.4.0.127.0.7.2.2.4.1.3".equals(str)) {
            return "id-PACE-DH-GM-AES-CBC-CMAC-192";
        }
        if ("0.4.0.127.0.7.2.2.4.1.4".equals(str)) {
            return "id-PACE-DH-GM-AES-CBC-CMAC-256";
        }
        if ("0.4.0.127.0.7.2.2.4.3.1".equals(str)) {
            return "id-PACE-DH-IM-3DES-CBC-CBC";
        }
        if ("0.4.0.127.0.7.2.2.4.3.2".equals(str)) {
            return "id-PACE-DH-IM-AES-CBC-CMAC-128";
        }
        if ("0.4.0.127.0.7.2.2.4.3.3".equals(str)) {
            return "id-PACE-DH-IM-AES-CBC-CMAC-192";
        }
        if ("0.4.0.127.0.7.2.2.4.3.4".equals(str)) {
            return "id-PACE_DH-IM-AES-CBC-CMAC-256";
        }
        if ("0.4.0.127.0.7.2.2.4.2.1".equals(str)) {
            return "id-PACE-ECDH-GM-3DES-CBC-CBC";
        }
        if ("0.4.0.127.0.7.2.2.4.2.2".equals(str)) {
            return "id-PACE-ECDH-GM-AES-CBC-CMAC-128";
        }
        if ("0.4.0.127.0.7.2.2.4.2.3".equals(str)) {
            return "id-PACE-ECDH-GM-AES-CBC-CMAC-192";
        }
        if ("0.4.0.127.0.7.2.2.4.2.4".equals(str)) {
            return "id-PACE-ECDH-GM-AES-CBC-CMAC-256";
        }
        if ("0.4.0.127.0.7.2.2.4.4.1".equals(str)) {
            return "id-PACE-ECDH-IM_3DES-CBC-CBC";
        }
        if ("0.4.0.127.0.7.2.2.4.4.2".equals(str)) {
            return "id-PACE-ECDH-IM-AES-CBC-CMAC-128";
        }
        if ("0.4.0.127.0.7.2.2.4.4.3".equals(str)) {
            return "id-PACE-ECDH-IM-AES-CBC-CMAC-192";
        }
        if ("0.4.0.127.0.7.2.2.4.4.4".equals(str)) {
            return "id-PACE-ECDH-IM-AES-CBC-CMAC-256";
        }
        if ("0.4.0.127.0.7.2.2.4.6.2".equals(str)) {
            return "id-PACE-ECDH-CAM-AES-CBC-CMAC-128";
        }
        if ("0.4.0.127.0.7.2.2.4.6.3".equals(str)) {
            return "id-PACE-ECDH-CAM-AES-CBC-CMAC-192";
        }
        if ("0.4.0.127.0.7.2.2.4.6.4".equals(str)) {
            str = "id-PACE-ECDH-CAM-AES-CBC-CMAC-256";
        }
        return str;
    }
}
