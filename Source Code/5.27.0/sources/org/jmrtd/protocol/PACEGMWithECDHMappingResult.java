package org.jmrtd.protocol;

import java.math.BigInteger;
import java.security.KeyPair;
import java.security.PublicKey;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.ECPoint;

public class PACEGMWithECDHMappingResult extends PACEGMMappingResult {
    private static final long serialVersionUID = -3892431861957032423L;
    private BigInteger sharedSecretPointX;
    private BigInteger sharedSecretPointY;

    public PACEGMWithECDHMappingResult(AlgorithmParameterSpec algorithmParameterSpec, byte[] bArr, PublicKey publicKey, KeyPair keyPair, ECPoint eCPoint, AlgorithmParameterSpec algorithmParameterSpec2) {
        super(algorithmParameterSpec, bArr, publicKey, keyPair, algorithmParameterSpec2);
        this.sharedSecretPointX = eCPoint.getAffineX();
        this.sharedSecretPointY = eCPoint.getAffineY();
    }

    public int hashCode() {
        int i;
        int hashCode = super.hashCode() * 31;
        BigInteger bigInteger = this.sharedSecretPointX;
        int i2 = 0;
        if (bigInteger == null) {
            i = 0;
        } else {
            i = bigInteger.hashCode();
        }
        hashCode += i;
        bigInteger = this.sharedSecretPointY;
        if (bigInteger != null) {
            i2 = bigInteger.hashCode();
        }
        return hashCode + i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || getClass() != obj.getClass()) {
            return false;
        }
        PACEGMWithECDHMappingResult pACEGMWithECDHMappingResult = (PACEGMWithECDHMappingResult) obj;
        BigInteger bigInteger = this.sharedSecretPointX;
        if (bigInteger == null) {
            if (pACEGMWithECDHMappingResult.sharedSecretPointX != null) {
                return false;
            }
        } else if (!bigInteger.equals(pACEGMWithECDHMappingResult.sharedSecretPointX)) {
            return false;
        }
        bigInteger = this.sharedSecretPointY;
        if (bigInteger == null) {
            if (pACEGMWithECDHMappingResult.sharedSecretPointY != null) {
                return false;
            }
        } else if (!bigInteger.equals(pACEGMWithECDHMappingResult.sharedSecretPointY)) {
            return false;
        }
        return true;
    }
}
