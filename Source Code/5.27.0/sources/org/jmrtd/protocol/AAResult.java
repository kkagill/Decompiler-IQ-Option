package org.jmrtd.protocol;

import java.io.Serializable;
import java.security.PublicKey;
import java.util.Arrays;
import net.sf.scuba.util.Hex;
import org.jmrtd.e;

public class AAResult implements Serializable {
    private static final long serialVersionUID = 8800803919646625713L;
    private byte[] challenge;
    private String digestAlgorithm;
    private PublicKey publicKey;
    private byte[] response;
    private String signatureAlgorithm;

    public AAResult(PublicKey publicKey, String str, String str2, byte[] bArr, byte[] bArr2) {
        this.publicKey = publicKey;
        this.digestAlgorithm = str;
        this.signatureAlgorithm = str2;
        this.challenge = bArr;
        this.response = bArr2;
    }

    public byte[] bSk() {
        return this.response;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AAResult [");
        stringBuilder.append("publicKey: ");
        stringBuilder.append(e.a(this.publicKey));
        stringBuilder.append(", digestAlgorithm: ");
        stringBuilder.append(this.digestAlgorithm);
        stringBuilder.append(", signatureAlgorithm: ");
        stringBuilder.append(this.signatureAlgorithm);
        stringBuilder.append(", challenge: ");
        stringBuilder.append(Hex.bytesToHexString(this.challenge));
        stringBuilder.append(", response: ");
        stringBuilder.append(Hex.bytesToHexString(this.response));
        return stringBuilder.toString();
    }

    public int hashCode() {
        int hashCode = (1303377669 + Arrays.hashCode(this.challenge)) * 1991;
        String str = this.digestAlgorithm;
        int i = 0;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 1991;
        PublicKey publicKey = this.publicKey;
        hashCode = (((hashCode + (publicKey == null ? 0 : publicKey.hashCode())) * 1991) + Arrays.hashCode(this.response)) * 1991;
        str = this.signatureAlgorithm;
        if (str != null) {
            i = str.hashCode();
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
        AAResult aAResult = (AAResult) obj;
        if (!Arrays.equals(this.challenge, aAResult.challenge)) {
            return false;
        }
        String str = this.digestAlgorithm;
        if (str == null) {
            if (aAResult.digestAlgorithm != null) {
                return false;
            }
        } else if (!str.equals(aAResult.digestAlgorithm)) {
            return false;
        }
        PublicKey publicKey = this.publicKey;
        if (publicKey == null) {
            if (aAResult.publicKey != null) {
                return false;
            }
        } else if (!publicKey.equals(aAResult.publicKey)) {
            return false;
        }
        if (!Arrays.equals(this.response, aAResult.response)) {
            return false;
        }
        str = this.signatureAlgorithm;
        if (str == null) {
            if (aAResult.signatureAlgorithm != null) {
                return false;
            }
        } else if (!str.equals(aAResult.signatureAlgorithm)) {
            return false;
        }
        return true;
    }
}
