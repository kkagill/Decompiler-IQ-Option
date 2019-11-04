package org.jmrtd.protocol;

import java.io.Serializable;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import org.jmrtd.e;

public class DESedeSecureMessagingWrapper extends SecureMessagingWrapper implements Serializable {
    private static final Logger eNz = Logger.getLogger("org.jmrtd");
    public static final IvParameterSpec fEj = new IvParameterSpec(new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0});
    private static final long serialVersionUID = -2859033943345961793L;
    private transient Cipher bcE;
    private SecretKey ksEnc;
    private SecretKey ksMac;
    private transient Mac mac;
    private long ssc;

    public DESedeSecureMessagingWrapper(SecretKey secretKey, SecretKey secretKey2, int i, boolean z, long j) {
        this(secretKey, secretKey2, "DESede/CBC/NoPadding", "ISO9797Alg3Mac", i, z, j);
    }

    private DESedeSecureMessagingWrapper(SecretKey secretKey, SecretKey secretKey2, String str, String str2, int i, boolean z, long j) {
        super(i, z);
        this.ksEnc = secretKey;
        this.ksMac = secretKey2;
        this.ssc = j;
        this.bcE = e.nl(str);
        this.mac = e.nm(str2);
    }

    public long bSl() {
        return this.ssc;
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
        DESedeSecureMessagingWrapper dESedeSecureMessagingWrapper = (DESedeSecureMessagingWrapper) obj;
        SecretKey secretKey = this.ksEnc;
        if (secretKey == null) {
            if (dESedeSecureMessagingWrapper.ksEnc != null) {
                return false;
            }
        } else if (!secretKey.equals(dESedeSecureMessagingWrapper.ksEnc)) {
            return false;
        }
        secretKey = this.ksMac;
        if (secretKey == null) {
            if (dESedeSecureMessagingWrapper.ksMac != null) {
                return false;
            }
        } else if (!secretKey.equals(dESedeSecureMessagingWrapper.ksMac)) {
            return false;
        }
        return this.ssc == dESedeSecureMessagingWrapper.ssc;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DESedeSecureMessagingWrapper [ ");
        stringBuilder.append(this.ksEnc.toString());
        String str = ", ";
        stringBuilder.append(str);
        stringBuilder.append(this.ksMac.toString());
        stringBuilder.append(str);
        stringBuilder.append(this.ssc);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
