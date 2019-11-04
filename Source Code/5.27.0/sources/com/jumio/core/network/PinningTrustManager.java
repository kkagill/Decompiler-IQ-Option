package com.jumio.core.network;

import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Arrays;

public class PinningTrustManager extends JumioTrustManager {
    private byte[] publicKey;

    public PinningTrustManager(byte[] bArr, String str) {
        super(str);
        this.publicKey = bArr;
    }

    /* Access modifiers changed, original: protected */
    public void checkCertificate(X509Certificate x509Certificate) {
        super.checkCertificate(x509Certificate);
        try {
            if (this.publicKey != null) {
                if (this.publicKey.length % 2 != 0) {
                    throw new Exception("public key must have a length multiple of 2!");
                }
            }
            if (!Arrays.equals(this.publicKey, x509Certificate.getPublicKey().getEncoded())) {
                throw new Exception("SSL pinning failed!");
            }
        } catch (Exception e) {
            throw new CertificateException("SSL Certificate match error", e);
        }
    }
}
