package com.jumio.core.network;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build.VERSION;
import com.jumio.commons.log.Log;
import java.security.KeyStore;
import java.security.cert.CertificateException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.X509Certificate;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

public class JumioTrustManager implements X509TrustManager {
    private static Boolean certificateCheck = Boolean.valueOf(true);
    private X509TrustManager defaultTrustManager = null;
    private String hostname;

    public JumioTrustManager(String str) {
        try {
            TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            instance.init((KeyStore) null);
            this.defaultTrustManager = (X509TrustManager) instance.getTrustManagers()[0];
            this.hostname = str;
        } catch (Exception unused) {
            this.defaultTrustManager = null;
        }
    }

    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        this.defaultTrustManager.checkClientTrusted(x509CertificateArr, str);
    }

    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        if (x509CertificateArr.length >= 2) {
            if (certificateCheck.booleanValue()) {
                if (VERSION.SDK_INT >= 24) {
                    new X509TrustManagerExtensions(this.defaultTrustManager).checkServerTrusted(x509CertificateArr, str, this.hostname);
                } else {
                    this.defaultTrustManager.checkServerTrusted(x509CertificateArr, str);
                }
            }
            checkCertificate(x509CertificateArr[0]);
            return;
        }
        throw new CertificateException("SSL Certificate Chain is not sufficient");
    }

    public X509Certificate[] getAcceptedIssuers() {
        return this.defaultTrustManager.getAcceptedIssuers();
    }

    /* Access modifiers changed, original: protected */
    public void checkCertificate(X509Certificate x509Certificate) {
        try {
            x509Certificate.checkValidity();
        } catch (CertificateNotYetValidException e) {
            try {
                Log.w("JumioTrustManager", "SSL Certificate is not yet valid", e);
            } catch (Exception e2) {
                throw new CertificateException("SSL Certificate match error", e2);
            }
        }
    }
}
