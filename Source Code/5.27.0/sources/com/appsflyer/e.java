package com.appsflyer;

import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import android.security.KeyPairGeneratorSpec;
import android.security.keystore.KeyGenParameterSpec.Builder;
import java.io.IOException;
import java.math.BigInteger;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Calendar;
import java.util.Enumeration;
import javax.security.auth.x500.X500Principal;

class e {
    private final Object kW = new Object();
    private KeyStore kX;
    private Context kY;
    private String kZ;
    /* renamed from: ॱ */
    private int f8;

    public e(Context context) {
        this.kY = context;
        this.kZ = "";
        this.f8 = 0;
        AFLogger.J("Initialising KeyStore..");
        try {
            this.kX = KeyStore.getInstance("AndroidKeyStore");
            this.kX.load(null);
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException e) {
            AFLogger.c("Couldn't load keystore instance of type: AndroidKeyStore", e);
        }
    }

    /* Access modifiers changed, original: final */
    public final void D(String str) {
        this.kZ = str;
        this.f8 = 0;
        E(dk());
    }

    /* Access modifiers changed, original: final */
    public final void di() {
        String dk = dk();
        synchronized (this.kW) {
            this.f8++;
            AFLogger.J("Deleting key with alias: ".concat(String.valueOf(dk)));
            try {
                synchronized (this.kW) {
                    this.kX.deleteEntry(dk);
                }
            } catch (KeyStoreException e) {
                StringBuilder stringBuilder = new StringBuilder("Exception ");
                stringBuilder.append(e.getMessage());
                stringBuilder.append(" occurred");
                AFLogger.c(stringBuilder.toString(), e);
            }
        }
        E(dk());
    }

    /* Access modifiers changed, original: final */
    public final boolean dj() {
        boolean z;
        Object th;
        StringBuilder stringBuilder;
        synchronized (this.kW) {
            z = true;
            if (this.kX != null) {
                try {
                    Enumeration aliases = this.kX.aliases();
                    while (aliases.hasMoreElements()) {
                        String str = (String) aliases.nextElement();
                        if (str != null && str.startsWith("com.appsflyer")) {
                            String[] split = str.split(",");
                            if (split.length == 3) {
                                AFLogger.J("Found a matching AF key with alias:\n".concat(String.valueOf(str)));
                                try {
                                    String[] split2 = split[1].trim().split("=");
                                    split = split[2].trim().split("=");
                                    if (split2.length == 2 && split.length == 2) {
                                        this.kZ = split2[1].trim();
                                        this.f8 = Integer.parseInt(split[1].trim());
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    stringBuilder = new StringBuilder("Couldn't list KeyStore Aliases: ");
                                    stringBuilder.append(th.getClass().getName());
                                    AFLogger.c(stringBuilder.toString(), th);
                                    return z;
                                }
                            }
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    z = false;
                    stringBuilder = new StringBuilder("Couldn't list KeyStore Aliases: ");
                    stringBuilder.append(th.getClass().getName());
                    AFLogger.c(stringBuilder.toString(), th);
                    return z;
                }
            }
            z = false;
        }
        return z;
    }

    private void E(String str) {
        AFLogger.J("Creating a new key with alias: ".concat(String.valueOf(str)));
        try {
            Calendar instance = Calendar.getInstance();
            Calendar instance2 = Calendar.getInstance();
            instance2.add(1, 5);
            AlgorithmParameterSpec algorithmParameterSpec = null;
            synchronized (this.kW) {
                if (this.kX.containsAlias(str)) {
                    AFLogger.J("Alias already exists: ".concat(String.valueOf(str)));
                } else {
                    if (VERSION.SDK_INT >= 23) {
                        algorithmParameterSpec = new Builder(str, 3).setCertificateSubject(new X500Principal("CN=AndroidSDK, O=AppsFlyer")).setCertificateSerialNumber(BigInteger.ONE).setCertificateNotBefore(instance.getTime()).setCertificateNotAfter(instance2.getTime()).build();
                    } else if (VERSION.SDK_INT >= 18 && !"OPPO".equals(Build.BRAND)) {
                        algorithmParameterSpec = new KeyPairGeneratorSpec.Builder(this.kY).setAlias(str).setSubject(new X500Principal("CN=AndroidSDK, O=AppsFlyer")).setSerialNumber(BigInteger.ONE).setStartDate(instance.getTime()).setEndDate(instance2.getTime()).build();
                    }
                    KeyPairGenerator instance3 = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
                    instance3.initialize(algorithmParameterSpec);
                    instance3.generateKeyPair();
                }
            }
        } catch (Throwable th) {
            StringBuilder stringBuilder = new StringBuilder("Exception ");
            stringBuilder.append(th.getMessage());
            stringBuilder.append(" occurred");
            AFLogger.c(stringBuilder.toString(), th);
        }
    }

    private String dk() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("com.appsflyer,");
        synchronized (this.kW) {
            stringBuilder.append("KSAppsFlyerId=");
            stringBuilder.append(this.kZ);
            stringBuilder.append(",");
            stringBuilder.append("KSAppsFlyerRICounter=");
            stringBuilder.append(this.f8);
        }
        return stringBuilder.toString();
    }

    /* Access modifiers changed, original: final */
    public final String dl() {
        String str;
        synchronized (this.kW) {
            str = this.kZ;
        }
        return str;
    }

    /* Access modifiers changed, original: final */
    public final int dm() {
        int i;
        synchronized (this.kW) {
            i = this.f8;
        }
        return i;
    }
}
