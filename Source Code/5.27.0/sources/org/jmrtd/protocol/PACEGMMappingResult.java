package org.jmrtd.protocol;

import java.security.KeyPair;
import java.security.PublicKey;
import java.security.spec.AlgorithmParameterSpec;

public abstract class PACEGMMappingResult extends PACEMappingResult {
    private static final long serialVersionUID = -3373471956987358728L;
    private KeyPair pcdMappingKeyPair;
    private PublicKey piccMappingPublicKey;

    public PACEGMMappingResult(AlgorithmParameterSpec algorithmParameterSpec, byte[] bArr, PublicKey publicKey, KeyPair keyPair, AlgorithmParameterSpec algorithmParameterSpec2) {
        super(algorithmParameterSpec, bArr, algorithmParameterSpec2);
        this.piccMappingPublicKey = publicKey;
        this.pcdMappingKeyPair = keyPair;
    }

    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        PublicKey publicKey = this.piccMappingPublicKey;
        return hashCode + (publicKey == null ? 0 : publicKey.hashCode());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || getClass() != obj.getClass()) {
            return false;
        }
        PACEGMMappingResult pACEGMMappingResult = (PACEGMMappingResult) obj;
        PublicKey publicKey = this.piccMappingPublicKey;
        if (publicKey == null) {
            if (pACEGMMappingResult.piccMappingPublicKey != null) {
                return false;
            }
        } else if (!publicKey.equals(pACEGMMappingResult.piccMappingPublicKey)) {
            return false;
        }
        KeyPair keyPair = this.pcdMappingKeyPair;
        if (keyPair == null) {
            if (pACEGMMappingResult.pcdMappingKeyPair != null) {
                return false;
            }
        } else if (!keyPair.equals(pACEGMMappingResult.pcdMappingKeyPair)) {
            return false;
        }
        return true;
    }
}
