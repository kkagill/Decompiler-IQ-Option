package com.jumio.core.network;

import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Arrays;

public class MultiPinningTrustManager extends JumioTrustManager {
    private static Boolean pinning = Boolean.valueOf(true);
    private byte[][] publicKeys;

    public MultiPinningTrustManager(byte[][] bArr, String str) {
        super(str);
        this.publicKeys = bArr;
    }

    public MultiPinningTrustManager(byte[] bArr, String str) {
        super(str);
        this.publicKeys = new byte[][]{bArr};
    }

    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        super.checkServerTrusted(x509CertificateArr, str);
    }

    /* Access modifiers changed, original: protected */
    public void checkCertificate(X509Certificate x509Certificate) {
        super.checkCertificate(x509Certificate);
        if (pinning.booleanValue()) {
            try {
                Object obj = null;
                for (byte[] bArr : this.publicKeys) {
                    if (bArr != null) {
                        if (bArr.length % 2 != 0) {
                            throw new Exception("public key must have a length multiple of 2!");
                        }
                    }
                    if (Arrays.equals(bArr, x509Certificate.getPublicKey().getEncoded())) {
                        obj = 1;
                        break;
                    }
                }
                if (obj == null) {
                    throw new Exception("SSL pinning failed!");
                }
            } catch (Exception e) {
                throw new CertificateException("SSL Certificate match error", e);
            }
        }
    }
}
