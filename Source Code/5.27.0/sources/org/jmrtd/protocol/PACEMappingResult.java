package org.jmrtd.protocol;

import java.io.Serializable;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;

public abstract class PACEMappingResult implements Serializable {
    private static final long serialVersionUID = 2773111318950631118L;
    private transient AlgorithmParameterSpec fFx;
    private transient AlgorithmParameterSpec fFy;
    private byte[] piccNonce = null;

    public PACEMappingResult(AlgorithmParameterSpec algorithmParameterSpec, byte[] bArr, AlgorithmParameterSpec algorithmParameterSpec2) {
        this.fFx = algorithmParameterSpec;
        this.fFy = algorithmParameterSpec2;
        if (bArr != null) {
            this.piccNonce = new byte[bArr.length];
            System.arraycopy(bArr, 0, this.piccNonce, 0, bArr.length);
        }
    }

    public AlgorithmParameterSpec bSn() {
        return this.fFy;
    }

    public int hashCode() {
        AlgorithmParameterSpec algorithmParameterSpec = this.fFy;
        int i = 0;
        int hashCode = ((((algorithmParameterSpec == null ? 0 : algorithmParameterSpec.hashCode()) + 31) * 31) + Arrays.hashCode(this.piccNonce)) * 31;
        AlgorithmParameterSpec algorithmParameterSpec2 = this.fFx;
        if (algorithmParameterSpec2 != null) {
            i = algorithmParameterSpec2.hashCode();
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
        PACEMappingResult pACEMappingResult = (PACEMappingResult) obj;
        AlgorithmParameterSpec algorithmParameterSpec = this.fFy;
        if (algorithmParameterSpec == null) {
            if (pACEMappingResult.fFy != null) {
                return false;
            }
        } else if (!algorithmParameterSpec.equals(pACEMappingResult.fFy)) {
            return false;
        }
        if (!Arrays.equals(this.piccNonce, pACEMappingResult.piccNonce)) {
            return false;
        }
        algorithmParameterSpec = this.fFx;
        if (algorithmParameterSpec == null) {
            if (pACEMappingResult.fFx != null) {
                return false;
            }
        } else if (!algorithmParameterSpec.equals(pACEMappingResult.fFx)) {
            return false;
        }
        return true;
    }
}
