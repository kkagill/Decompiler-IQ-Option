package com.iqoption.core.util;

import android.os.Build.VERSION;
import android.util.Base64;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.spec.PKCS8EncodedKeySpec;
import javax.crypto.Cipher;

/* compiled from: RsaUtils */
public class ac {
    private static final String TAG = "com.iqoption.core.util.ac";

    public static String ar(String str, String str2) {
        try {
            KeyFactory instance;
            String str3 = "BC";
            String str4 = "RSA";
            if (VERSION.SDK_INT >= 28) {
                instance = KeyFactory.getInstance(str4);
            } else {
                instance = KeyFactory.getInstance(str4, str3);
            }
            PrivateKey generatePrivate = instance.generatePrivate(new PKCS8EncodedKeySpec(Base64.decode(str2.getBytes(), 0)));
            Cipher instance2 = Cipher.getInstance(str4, str3);
            instance2.init(2, generatePrivate);
            return new String(instance2.doFinal(Base64.decode(str, 0)));
        } catch (Exception unused) {
            return "";
        }
    }
}
