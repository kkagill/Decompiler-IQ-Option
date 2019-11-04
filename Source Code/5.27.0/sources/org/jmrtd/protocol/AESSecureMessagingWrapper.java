package org.jmrtd.protocol;

import java.io.Serializable;
import java.security.Key;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import org.jmrtd.e;

public class AESSecureMessagingWrapper extends SecureMessagingWrapper implements Serializable {
    private static final Logger eNz = Logger.getLogger("org.jmrtd");
    private static final long serialVersionUID = 2086301081448345496L;
    private transient Cipher bcE = e.nl("AES/CBC/NoPadding");
    private transient Cipher fFv;
    private SecretKey ksEnc;
    private SecretKey ksMac;
    private transient Mac mac;
    private long ssc;

    public AESSecureMessagingWrapper(SecretKey secretKey, SecretKey secretKey2, int i, boolean z, long j) {
        super(i, z);
        this.ksEnc = secretKey;
        this.ksMac = secretKey2;
        this.ssc = j;
        this.fFv = e.a("AES/ECB/NoPadding", 1, (Key) secretKey);
        this.mac = e.a("AESCMAC", (Key) secretKey2);
    }

    public long bSl() {
        return this.ssc;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AESSecureMessagingWrapper [ ");
        stringBuilder.append(this.ksEnc.toString());
        String str = ", ";
        stringBuilder.append(str);
        stringBuilder.append(this.ksMac.toString());
        stringBuilder.append(str);
        stringBuilder.append(this.ssc);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public int hashCode() {
        SecretKey secretKey = this.ksEnc;
        int i = 0;
        int hashCode = ((secretKey == null ? 0 : secretKey.hashCode()) + 31) * 31;
        SecretKey secretKey2 = this.ksMac;
        if (secretKey2 != null) {
            i = secretKey2.hashCode();
        }
        hashCode = (hashCode + i) * 31;
        long j = this.ssc;
        return hashCode + ((int) (j ^ (j >>> 32)));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AESSecureMessagingWrapper aESSecureMessagingWrapper = (AESSecureMessagingWrapper) obj;
        SecretKey secretKey = this.ksEnc;
        if (secretKey == null) {
            if (aESSecureMessagingWrapper.ksEnc != null) {
                return false;
            }
        } else if (!secretKey.equals(aESSecureMessagingWrapper.ksEnc)) {
            return false;
        }
        secretKey = this.ksMac;
        if (secretKey == null) {
            if (aESSecureMessagingWrapper.ksMac != null) {
                return false;
            }
        } else if (!secretKey.equals(aESSecureMessagingWrapper.ksMac)) {
            return false;
        }
        return this.ssc == aESSecureMessagingWrapper.ssc;
    }
}
