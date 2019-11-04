package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.firebase.FirebaseApp;
import java.security.KeyPair;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

public final class o {
    private final Context acP;
    private int adg;
    private int adh = 0;
    private String zzcn;
    private String zzco;

    public o(Context context) {
        this.acP = context;
    }

    public final synchronized int zzac() {
        if (this.adh != 0) {
            return this.adh;
        }
        PackageManager packageManager = this.acP.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("FirebaseInstanceId", "Google Play services missing or without correct permission.");
            return 0;
        }
        Intent intent;
        if (!PlatformVersion.isAtLeastO()) {
            intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                this.adh = 1;
                return this.adh;
            }
        }
        intent = new Intent("com.google.iid.TOKEN_REQUEST");
        intent.setPackage("com.google.android.gms");
        List queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
        if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
            Log.w("FirebaseInstanceId", "Failed to resolve IID implementation package, falling back");
            if (PlatformVersion.isAtLeastO()) {
                this.adh = 2;
            } else {
                this.adh = 1;
            }
            return this.adh;
        }
        this.adh = 2;
        return this.adh;
    }

    public static String c(FirebaseApp firebaseApp) {
        String vU = firebaseApp.vO().vU();
        if (vU != null) {
            return vU;
        }
        String go = firebaseApp.vO().go();
        if (!go.startsWith("1:")) {
            return go;
        }
        String[] split = go.split(":");
        if (split.length < 2) {
            return null;
        }
        go = split[1];
        if (go.isEmpty()) {
            return null;
        }
        return go;
    }

    public static String a(KeyPair keyPair) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(keyPair.getPublic().getEncoded());
            digest[0] = (byte) ((digest[0] & 15) + 112);
            return Base64.encodeToString(digest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            Log.w("FirebaseInstanceId", "Unexpected error, device missing required algorithms");
            return null;
        }
    }

    public final synchronized String wF() {
        if (this.zzcn == null) {
            zzag();
        }
        return this.zzcn;
    }

    public final synchronized String wG() {
        if (this.zzco == null) {
            zzag();
        }
        return this.zzco;
    }

    public final synchronized int zzaf() {
        if (this.adg == 0) {
            PackageInfo cd = cd("com.google.android.gms");
            if (cd != null) {
                this.adg = cd.versionCode;
            }
        }
        return this.adg;
    }

    private final synchronized void zzag() {
        PackageInfo cd = cd(this.acP.getPackageName());
        if (cd != null) {
            this.zzcn = Integer.toString(cd.versionCode);
            this.zzco = cd.versionName;
        }
    }

    private final PackageInfo cd(String str) {
        try {
            return this.acP.getPackageManager().getPackageInfo(str, 0);
        } catch (NameNotFoundException e) {
            str = String.valueOf(e);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 23);
            stringBuilder.append("Failed to find package ");
            stringBuilder.append(str);
            Log.w("FirebaseInstanceId", stringBuilder.toString());
            return null;
        }
    }
}
