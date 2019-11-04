package com.iqoption.system.b;

import android.content.Context;
import android.os.Build.VERSION;
import android.security.keystore.KeyGenParameterSpec.Builder;
import androidx.core.hardware.fingerprint.FingerprintManagerCompat;
import androidx.core.hardware.fingerprint.FingerprintManagerCompat.AuthenticationCallback;
import androidx.core.hardware.fingerprint.FingerprintManagerCompat.AuthenticationResult;
import androidx.core.hardware.fingerprint.FingerprintManagerCompat.CryptoObject;
import androidx.core.os.CancellationSignal;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

/* compiled from: FingerprintHelper */
public class c extends AuthenticationCallback {
    private static final String TAG = "com.iqoption.system.b.c";
    private Cipher bcE;
    private final FingerprintManagerCompat dUp;
    private final a dUq;
    private CancellationSignal dUr;
    private CryptoObject dUs;
    private KeyStore dUt;
    private boolean dUu;

    public c(Context context, a aVar) {
        this.dUp = FingerprintManagerCompat.from(context);
        this.dUq = aVar;
        try {
            if (VERSION.SDK_INT >= 23) {
                this.bcE = Cipher.getInstance("AES/CBC/PKCS7Padding");
            }
            this.dUt = KeyStore.getInstance("AndroidKeyStore");
            y("default_key", true);
        } catch (GeneralSecurityException unused) {
        }
    }

    public boolean aUC() {
        return a(this.dUp);
    }

    public static boolean bL(Context context) {
        return a(FingerprintManagerCompat.from(context));
    }

    private static boolean a(FingerprintManagerCompat fingerprintManagerCompat) {
        return fingerprintManagerCompat.isHardwareDetected() && fingerprintManagerCompat.hasEnrolledFingerprints();
    }

    public void startListening() {
        if (aUC() && a(this.bcE, "default_key")) {
            this.dUs = new CryptoObject(this.bcE);
            this.dUr = new CancellationSignal();
            this.dUu = false;
            this.dUp.authenticate(this.dUs, 0, this.dUr, this, null);
        }
    }

    public void stopListening() {
        CancellationSignal cancellationSignal = this.dUr;
        if (cancellationSignal != null) {
            this.dUu = true;
            cancellationSignal.cancel();
            this.dUr = null;
        }
    }

    public void onAuthenticationError(int i, CharSequence charSequence) {
        if (!this.dUu) {
            this.dUq.onAuthenticationError(i, charSequence);
        }
    }

    public void onAuthenticationHelp(int i, CharSequence charSequence) {
        this.dUq.onAuthenticationHelp(i, charSequence);
    }

    public void onAuthenticationFailed() {
        this.dUq.onAuthenticationFailed();
    }

    public void onAuthenticationSucceeded(AuthenticationResult authenticationResult) {
        this.dUq.azR();
    }

    private boolean a(Cipher cipher, String str) {
        if (VERSION.SDK_INT < 23) {
            return true;
        }
        try {
            this.dUt.load(null);
            cipher.init(1, (SecretKey) this.dUt.getKey(str, null));
            return true;
        } catch (IOException | GeneralSecurityException unused) {
            return false;
        }
    }

    public void y(String str, boolean z) {
        if (VERSION.SDK_INT >= 23) {
            try {
                this.dUt.load(null);
                Builder encryptionPaddings = new Builder(str, 3).setBlockModes(new String[]{"CBC"}).setUserAuthenticationRequired(true).setEncryptionPaddings(new String[]{"PKCS7Padding"});
                KeyGenerator instance = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                instance.init(encryptionPaddings.build());
                instance.generateKey();
            } catch (IOException | GeneralSecurityException unused) {
            }
        }
    }
}
