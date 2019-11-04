package io.fabric.sdk.android.services.common;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Build.VERSION;
import android.text.TextUtils;
import io.fabric.sdk.android.c;
import io.fabric.sdk.android.h;
import io.fabric.sdk.android.k;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.UUID;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Pattern;

public class IdManager {
    private static final Pattern eNm = Pattern.compile("[^\\p{Alnum}]");
    private static final String eNn = Pattern.quote("/");
    private final Context cO;
    private final String eMt;
    private final String eMu;
    private final ReentrantLock eNo = new ReentrantLock();
    private final q eNp;
    private final boolean eNq;
    private final boolean eNr;
    c eNs;
    b eNt;
    boolean eNu;
    p eNv;
    private final Collection<h> nJ;

    public enum DeviceIdentifierType {
        WIFI_MAC_ADDRESS(1),
        BLUETOOTH_MAC_ADDRESS(2),
        FONT_TOKEN(53),
        ANDROID_ID(100),
        ANDROID_DEVICE_ID(101),
        ANDROID_SERIAL(102),
        ANDROID_ADVERTISING_ID(103);
        
        public final int protobufIndex;

        private DeviceIdentifierType(int i) {
            this.protobufIndex = i;
        }
    }

    public IdManager(Context context, String str, String str2, Collection<h> collection) {
        if (context == null) {
            throw new IllegalArgumentException("appContext must not be null");
        } else if (str == null) {
            throw new IllegalArgumentException("appIdentifier must not be null");
        } else if (collection != null) {
            this.cO = context;
            this.eMu = str;
            this.eMt = str2;
            this.nJ = collection;
            this.eNp = new q();
            this.eNs = new c(context);
            this.eNv = new p();
            this.eNq = CommonUtils.a(context, "com.crashlytics.CollectDeviceIdentifiers", true);
            String str3 = "Fabric";
            if (!this.eNq) {
                k biX = c.biX();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Device ID collection disabled for ");
                stringBuilder.append(context.getPackageName());
                biX.d(str3, stringBuilder.toString());
            }
            this.eNr = CommonUtils.a(context, "com.crashlytics.CollectUserIdentifiers", true);
            if (!this.eNr) {
                k biX2 = c.biX();
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("User information collection disabled for ");
                stringBuilder2.append(context.getPackageName());
                biX2.d(str3, stringBuilder2.toString());
            }
        } else {
            throw new IllegalArgumentException("kits must not be null");
        }
    }

    public boolean bjz() {
        return this.eNr;
    }

    private String ls(String str) {
        return str == null ? null : eNm.matcher(str).replaceAll("").toLowerCase(Locale.US);
    }

    public String bjA() {
        String str = this.eMt;
        if (str != null) {
            return str;
        }
        SharedPreferences co = CommonUtils.co(this.cO);
        d(co);
        String string = co.getString("crashlytics.installation.id", null);
        return string == null ? c(co) : string;
    }

    public String bjB() {
        return this.eMu;
    }

    public String bjC() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(bjD());
        stringBuilder.append("/");
        stringBuilder.append(bjE());
        return stringBuilder.toString();
    }

    public String bjD() {
        return lt(VERSION.RELEASE);
    }

    public String bjE() {
        return lt(VERSION.INCREMENTAL);
    }

    public String bjF() {
        return String.format(Locale.US, "%s/%s", new Object[]{lt(Build.MANUFACTURER), lt(Build.MODEL)});
    }

    private String lt(String str) {
        return str.replaceAll(eNn, "");
    }

    @SuppressLint({"CommitPrefEdits"})
    private String c(SharedPreferences sharedPreferences) {
        String str = "crashlytics.installation.id";
        this.eNo.lock();
        try {
            String string = sharedPreferences.getString(str, null);
            if (string == null) {
                string = ls(UUID.randomUUID().toString());
                sharedPreferences.edit().putString(str, string).commit();
            }
            this.eNo.unlock();
            return string;
        } catch (Throwable th) {
            this.eNo.unlock();
        }
    }

    private void d(SharedPreferences sharedPreferences) {
        b bjl = bjl();
        if (bjl != null) {
            f(sharedPreferences, bjl.eMM);
        }
    }

    @SuppressLint({"CommitPrefEdits"})
    private void f(SharedPreferences sharedPreferences, String str) {
        String str2 = "crashlytics.advertising.id";
        this.eNo.lock();
        try {
            if (!TextUtils.isEmpty(str)) {
                String string = sharedPreferences.getString(str2, null);
                if (TextUtils.isEmpty(string)) {
                    sharedPreferences.edit().putString(str2, str).commit();
                } else if (!string.equals(str)) {
                    sharedPreferences.edit().remove("crashlytics.installation.id").putString(str2, str).commit();
                }
                this.eNo.unlock();
            }
        } finally {
            this.eNo.unlock();
        }
    }

    public Map<DeviceIdentifierType, String> eC() {
        HashMap hashMap = new HashMap();
        for (h hVar : this.nJ) {
            if (hVar instanceof l) {
                for (Entry entry : ((l) hVar).eC().entrySet()) {
                    a(hashMap, (DeviceIdentifierType) entry.getKey(), (String) entry.getValue());
                }
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }

    public String getInstallerPackageName() {
        return this.eNp.V(this.cO);
    }

    public Boolean bjG() {
        return bjH() ? bjI() : null;
    }

    private void a(Map<DeviceIdentifierType, String> map, DeviceIdentifierType deviceIdentifierType, String str) {
        if (str != null) {
            map.put(deviceIdentifierType, str);
        }
    }

    /* Access modifiers changed, original: protected */
    public boolean bjH() {
        return this.eNq && !this.eNv.cE(this.cO);
    }

    /* Access modifiers changed, original: declared_synchronized */
    public synchronized b bjl() {
        if (!this.eNu) {
            this.eNt = this.eNs.bjl();
            this.eNu = true;
        }
        return this.eNt;
    }

    private Boolean bjI() {
        b bjl = bjl();
        return bjl != null ? Boolean.valueOf(bjl.eMN) : null;
    }
}
