package com.facebook.a.a;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.net.nsd.NsdManager;
import android.net.nsd.NsdManager.RegistrationListener;
import android.net.nsd.NsdServiceInfo;
import android.os.Build;
import android.os.Build.VERSION;
import androidx.core.view.ViewCompat;
import com.facebook.f;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.SmartLoginOption;
import com.facebook.internal.z;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.common.b;
import java.util.EnumMap;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DeviceRequestsHelper */
public class a {
    private static final String TAG = "com.facebook.a.a.a";
    private static HashMap<String, RegistrationListener> xs = new HashMap();

    public static String jC() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("device", Build.DEVICE);
            jSONObject.put("model", Build.MODEL);
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    public static boolean aY(String str) {
        return isAvailable() ? bb(str) : false;
    }

    public static boolean isAvailable() {
        return VERSION.SDK_INT >= 16 && FetchedAppSettingsManager.bg(f.go()).jP().contains(SmartLoginOption.Enabled);
    }

    public static Bitmap aZ(String str) {
        EnumMap enumMap = new EnumMap(EncodeHintType.class);
        enumMap.put(EncodeHintType.MARGIN, Integer.valueOf(2));
        try {
            b a = new com.google.zxing.b().a(str, BarcodeFormat.QR_CODE, 200, 200, enumMap);
            int height = a.getHeight();
            int width = a.getWidth();
            int[] iArr = new int[(height * width)];
            for (int i = 0; i < height; i++) {
                int i2 = i * width;
                for (int i3 = 0; i3 < width; i3++) {
                    iArr[i2 + i3] = a.P(i3, i) ? ViewCompat.MEASURED_STATE_MASK : -1;
                }
            }
            Bitmap createBitmap = Bitmap.createBitmap(width, height, Config.ARGB_8888);
            try {
                createBitmap.setPixels(iArr, 0, width, 0, 0, width, height);
                return createBitmap;
            } catch (WriterException unused) {
                return createBitmap;
            }
        } catch (WriterException unused2) {
            return null;
        }
    }

    public static void ba(String str) {
        bc(str);
    }

    @TargetApi(16)
    private static boolean bb(final String str) {
        if (xs.containsKey(str)) {
            return true;
        }
        String replace = f.gV().replace('.', '|');
        r2 = new Object[3];
        r2[1] = String.format("%s-%s", new Object[]{"android", replace});
        r2[2] = str;
        replace = String.format("%s_%s_%s", r2);
        NsdServiceInfo nsdServiceInfo = new NsdServiceInfo();
        nsdServiceInfo.setServiceType("_fb._tcp.");
        nsdServiceInfo.setServiceName(replace);
        nsdServiceInfo.setPort(80);
        NsdManager nsdManager = (NsdManager) f.getApplicationContext().getSystemService("servicediscovery");
        AnonymousClass1 anonymousClass1 = new RegistrationListener() {
            public void onServiceUnregistered(NsdServiceInfo nsdServiceInfo) {
            }

            public void onUnregistrationFailed(NsdServiceInfo nsdServiceInfo, int i) {
            }

            public void onServiceRegistered(NsdServiceInfo nsdServiceInfo) {
                if (!replace.equals(nsdServiceInfo.getServiceName())) {
                    a.ba(str);
                }
            }

            public void onRegistrationFailed(NsdServiceInfo nsdServiceInfo, int i) {
                a.ba(str);
            }
        };
        xs.put(str, anonymousClass1);
        nsdManager.registerService(nsdServiceInfo, 1, anonymousClass1);
        return true;
    }

    @TargetApi(16)
    private static void bc(String str) {
        RegistrationListener registrationListener = (RegistrationListener) xs.get(str);
        if (registrationListener != null) {
            try {
                ((NsdManager) f.getApplicationContext().getSystemService("servicediscovery")).unregisterService(registrationListener);
            } catch (IllegalArgumentException e) {
                z.a(TAG, e);
            }
            xs.remove(str);
        }
    }
}
