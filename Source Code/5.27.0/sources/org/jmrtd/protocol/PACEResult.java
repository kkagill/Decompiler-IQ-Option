package org.jmrtd.protocol;

import java.io.Serializable;
import java.security.KeyPair;
import java.security.PublicKey;
import org.jmrtd.AccessKeySpec;
import org.jmrtd.e;
import org.jmrtd.lds.PACEInfo.MappingType;

public class PACEResult implements Serializable {
    private static final long serialVersionUID = -6819675856205885052L;
    private String agreementAlg;
    private String cipherAlg;
    private String digestAlg;
    private int keyLength;
    private PACEMappingResult mappingResult;
    private MappingType mappingType;
    private AccessKeySpec paceKey;
    private KeyPair pcdKeyPair;
    private PublicKey piccPublicKey;
    private SecureMessagingWrapper wrapper;

    public PACEResult(AccessKeySpec accessKeySpec, MappingType mappingType, String str, String str2, String str3, int i, PACEMappingResult pACEMappingResult, KeyPair keyPair, PublicKey publicKey, SecureMessagingWrapper secureMessagingWrapper) {
        this.paceKey = accessKeySpec;
        this.mappingType = mappingType;
        this.agreementAlg = str;
        this.cipherAlg = str2;
        this.digestAlg = str3;
        this.keyLength = i;
        this.mappingResult = pACEMappingResult;
        this.pcdKeyPair = keyPair;
        this.piccPublicKey = publicKey;
        this.wrapper = secureMessagingWrapper;
    }

    public AccessKeySpec bSo() {
        return this.paceKey;
    }

    public PACEMappingResult bSp() {
        return this.mappingResult;
    }

    public SecureMessagingWrapper bSm() {
        return this.wrapper;
    }

    public MappingType bSq() {
        return this.mappingType;
    }

    public String bSr() {
        return this.agreementAlg;
    }

    public String bSs() {
        return this.cipherAlg;
    }

    public String bSt() {
        return this.digestAlg;
    }

    public int getKeyLength() {
        return this.keyLength;
    }

    public KeyPair bSu() {
        return this.pcdKeyPair;
    }

    public PublicKey bSv() {
        return this.piccPublicKey;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PACEResult [");
        stringBuilder.append("paceKey: ");
        stringBuilder.append(this.paceKey);
        stringBuilder.append(", mappingType: ");
        stringBuilder.append(this.mappingType);
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(", agreementAlg: ");
        stringBuilder2.append(this.agreementAlg);
        stringBuilder.append(stringBuilder2.toString());
        stringBuilder2 = new StringBuilder();
        stringBuilder2.append(", cipherAlg: ");
        stringBuilder2.append(this.cipherAlg);
        stringBuilder.append(stringBuilder2.toString());
        stringBuilder2 = new StringBuilder();
        stringBuilder2.append(", digestAlg: ");
        stringBuilder2.append(this.digestAlg);
        stringBuilder.append(stringBuilder2.toString());
        stringBuilder2 = new StringBuilder();
        stringBuilder2.append(", keyLength: ");
        stringBuilder2.append(this.keyLength);
        stringBuilder.append(stringBuilder2.toString());
        stringBuilder2 = new StringBuilder();
        stringBuilder2.append(", mappingResult: ");
        stringBuilder2.append(this.mappingResult);
        stringBuilder.append(stringBuilder2.toString());
        stringBuilder2 = new StringBuilder();
        stringBuilder2.append(", piccPublicKey: ");
        stringBuilder2.append(e.a(this.piccPublicKey));
        stringBuilder.append(stringBuilder2.toString());
        stringBuilder2 = new StringBuilder();
        stringBuilder2.append(", pcdPrivateKey: ");
        stringBuilder2.append(e.a(this.pcdKeyPair.getPrivate()));
        stringBuilder.append(stringBuilder2.toString());
        stringBuilder2 = new StringBuilder();
        stringBuilder2.append(", pcdPublicKey: ");
        stringBuilder2.append(e.a(this.pcdKeyPair.getPublic()));
        stringBuilder.append(stringBuilder2.toString());
        return stringBuilder.toString();
    }

    public int hashCode() {
        AccessKeySpec accessKeySpec = this.paceKey;
        int i = 0;
        int hashCode = (21901 + (accessKeySpec == null ? 0 : accessKeySpec.hashCode())) * 1991;
        String str = this.agreementAlg;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 1991;
        str = this.cipherAlg;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 1991;
        str = this.digestAlg;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 1991;
        PACEMappingResult pACEMappingResult = this.mappingResult;
        hashCode = (((hashCode + (pACEMappingResult == null ? 0 : pACEMappingResult.hashCode())) * 1991) + this.keyLength) * 1991;
        MappingType mappingType = this.mappingType;
        hashCode = (hashCode + (mappingType == null ? 0 : mappingType.hashCode())) * 1991;
        KeyPair keyPair = this.pcdKeyPair;
        hashCode = (hashCode + (keyPair == null ? 0 : keyPair.hashCode())) * 1991;
        PublicKey publicKey = this.piccPublicKey;
        hashCode = (hashCode + (publicKey == null ? 0 : publicKey.hashCode())) * 1991;
        SecureMessagingWrapper secureMessagingWrapper = this.wrapper;
        if (secureMessagingWrapper != null) {
            i = secureMessagingWrapper.hashCode();
        }
        return hashCode + i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PACEResult pACEResult = (PACEResult) obj;
        AccessKeySpec accessKeySpec = this.paceKey;
        if (accessKeySpec == null) {
            if (pACEResult.paceKey != null) {
                return false;
            }
        } else if (!accessKeySpec.equals(pACEResult.paceKey)) {
            return false;
        }
        String str = this.agreementAlg;
        if (str == null) {
            if (pACEResult.agreementAlg != null) {
                return false;
            }
        } else if (!str.equals(pACEResult.agreementAlg)) {
            return false;
        }
        str = this.cipherAlg;
        if (str == null) {
            if (pACEResult.cipherAlg != null) {
                return false;
            }
        } else if (!str.equals(pACEResult.cipherAlg)) {
            return false;
        }
        str = this.digestAlg;
        if (str == null) {
            if (pACEResult.digestAlg != null) {
                return false;
            }
        } else if (!str.equals(pACEResult.digestAlg)) {
            return false;
        }
        PACEMappingResult pACEMappingResult = this.mappingResult;
        if (pACEMappingResult == null) {
            if (pACEResult.mappingResult != null) {
                return false;
            }
        } else if (!pACEMappingResult.equals(pACEResult.mappingResult)) {
            return false;
        }
        if (this.keyLength != pACEResult.keyLength || this.mappingType != pACEResult.mappingType) {
            return false;
        }
        KeyPair keyPair = this.pcdKeyPair;
        if (keyPair == null) {
            if (pACEResult.pcdKeyPair != null) {
                return false;
            }
        } else if (!keyPair.equals(pACEResult.pcdKeyPair)) {
            return false;
        }
        PublicKey publicKey = this.piccPublicKey;
        if (publicKey == null) {
            if (pACEResult.piccPublicKey != null) {
                return false;
            }
        } else if (!publicKey.equals(pACEResult.piccPublicKey)) {
            return false;
        }
        SecureMessagingWrapper secureMessagingWrapper = this.wrapper;
        if (secureMessagingWrapper == null) {
            if (pACEResult.wrapper != null) {
                return false;
            }
        } else if (!secureMessagingWrapper.equals(pACEResult.wrapper)) {
            return false;
        }
        return true;
    }
}
