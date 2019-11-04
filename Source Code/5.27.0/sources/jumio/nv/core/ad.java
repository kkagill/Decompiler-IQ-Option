package jumio.nv.core;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.Looper;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.jumio.MobileSDK;
import com.jumio.commons.log.Log;
import com.jumio.nv.IsoCountryConverter;
import com.jumio.nv.models.AdditionalDataPointsModel;
import com.jumio.nv.models.ServerSettingsModel;
import com.jumio.persistence.DataAccess;
import com.jumio.sdk.util.RootCheck;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Locale;
import java.util.TimeZone;
import java.util.UUID;
import org.json.JSONObject;

/* compiled from: DataPointsUtil */
public class ad {
    private static final a a = new a();
    private static final Object b = new Object();

    /* compiled from: DataPointsUtil */
    static class a implements LocationListener {
        private Context a;

        public void onProviderDisabled(String str) {
        }

        public void onProviderEnabled(String str) {
        }

        public void onStatusChanged(String str, int i, Bundle bundle) {
        }

        private a() {
        }

        /* synthetic */ a(AnonymousClass1 anonymousClass1) {
            this();
        }

        public void a(Context context) {
            this.a = context;
        }

        public void onLocationChanged(Location location) {
            Context context = this.a;
            if (context != null) {
                ad.b(context, location);
                ad.b(this.a);
            }
        }
    }

    public static void a(final Context context) {
        ServerSettingsModel serverSettingsModel = (ServerSettingsModel) DataAccess.load(context, ServerSettingsModel.class);
        if (serverSettingsModel != null && serverSettingsModel.isAdditionalDataPointsEnabled()) {
            new Thread(new Runnable() {
                public void run() {
                    String str = "network";
                    Serializable serializable = (AdditionalDataPointsModel) DataAccess.load(context, AdditionalDataPointsModel.class);
                    if (serializable == null) {
                        serializable = new AdditionalDataPointsModel();
                    }
                    try {
                        Locale locale;
                        String locale2;
                        String country;
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        ((Activity) context).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                        int i = displayMetrics.widthPixels;
                        int i2 = displayMetrics.heightPixels;
                        boolean isRooted = RootCheck.isRooted(context);
                        int offset = TimeZone.getDefault().getOffset(System.currentTimeMillis()) / 3600000;
                        ArrayList arrayList = new ArrayList();
                        if (VERSION.SDK_INT >= 24) {
                            LocaleList locales = ((Activity) context).getApplicationContext().getResources().getConfiguration().getLocales();
                            if (locales != null) {
                                arrayList = new ArrayList();
                                for (int i3 = 0; i3 < locales.size(); i3++) {
                                    if (locales.get(i3) != null) {
                                        arrayList.add(locales.get(i3).toString());
                                    }
                                }
                            }
                            locale = ((Activity) context).getApplicationContext().getResources().getConfiguration().getLocales().get(0);
                        } else {
                            locale = ((Activity) context).getApplicationContext().getResources().getConfiguration().locale;
                        }
                        ArrayList arrayList2 = arrayList;
                        String str2 = "";
                        if (locale != null) {
                            locale2 = locale.toString();
                            country = locale.getCountry();
                            if (!TextUtils.isEmpty(country) && country.length() == 2) {
                                str2 = IsoCountryConverter.convertToAlpha3(country);
                            }
                            country = locale2;
                            locale2 = str2;
                        } else {
                            country = str2;
                            locale2 = country;
                        }
                        serializable.setAnalyticsDataModel(country, i, i2, arrayList2, offset, isRooted, locale2);
                        DataAccess.update(context, AdditionalDataPointsModel.class, serializable);
                    } catch (Exception e) {
                        Log.e("Failed to build analytics data points model", e);
                    }
                    if (MobileSDK.hasPermissionsFor(context.getApplicationContext(), new String[]{"android.permission.ACCESS_COARSE_LOCATION"})) {
                        try {
                            LocationManager locationManager = (LocationManager) context.getSystemService("location");
                            if (locationManager.getAllProviders().contains(str)) {
                                ad.b(context, locationManager.getLastKnownLocation(str));
                                ad.a.a(context);
                                locationManager.requestSingleUpdate(str, ad.a, Looper.getMainLooper());
                            }
                        } catch (Exception e2) {
                            Log.printStackTrace(e2);
                        }
                    }
                }
            }).start();
        }
    }

    public static void b(Context context) {
        if (MobileSDK.hasPermissionsFor(context.getApplicationContext(), new String[]{"android.permission.ACCESS_COARSE_LOCATION"})) {
            try {
                LocationManager locationManager = (LocationManager) context.getSystemService("location");
                if (locationManager != null && a != null) {
                    locationManager.removeUpdates(a);
                    a.a(null);
                }
            } catch (Exception e) {
                Log.printStackTrace(e);
            }
        }
    }

    /* JADX WARNING: Missing block: B:22:0x005b, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:24:0x005d, code skipped:
            return;
     */
    private static void b(android.content.Context r8, android.location.Location r9) {
        /*
        r0 = b;
        monitor-enter(r0);
        if (r9 == 0) goto L_0x005c;
    L_0x0005:
        r1 = android.location.Geocoder.isPresent();	 Catch:{ all -> 0x005e }
        if (r1 != 0) goto L_0x000c;
    L_0x000b:
        goto L_0x005c;
    L_0x000c:
        r2 = new android.location.Geocoder;	 Catch:{ all -> 0x005e }
        r1 = java.util.Locale.US;	 Catch:{ all -> 0x005e }
        r2.<init>(r8, r1);	 Catch:{ all -> 0x005e }
        r1 = 0;
        r3 = r9.getLatitude();	 Catch:{ Exception -> 0x0022 }
        r5 = r9.getLongitude();	 Catch:{ Exception -> 0x0022 }
        r7 = 1;
        r1 = r2.getFromLocation(r3, r5, r7);	 Catch:{ Exception -> 0x0022 }
        goto L_0x0028;
    L_0x0022:
        r9 = move-exception;
        r2 = "No geocoded information available ";
        com.jumio.commons.log.Log.e(r2, r9);	 Catch:{ all -> 0x005e }
    L_0x0028:
        if (r1 == 0) goto L_0x005a;
    L_0x002a:
        r9 = r1.size();	 Catch:{ all -> 0x005e }
        if (r9 == 0) goto L_0x005a;
    L_0x0030:
        r9 = 0;
        r9 = r1.get(r9);	 Catch:{ all -> 0x005e }
        r9 = (android.location.Address) r9;	 Catch:{ all -> 0x005e }
        r1 = com.jumio.nv.models.AdditionalDataPointsModel.class;
        r1 = com.jumio.persistence.DataAccess.load(r8, r1);	 Catch:{ all -> 0x005e }
        r1 = (com.jumio.nv.models.AdditionalDataPointsModel) r1;	 Catch:{ all -> 0x005e }
        if (r1 != 0) goto L_0x0046;
    L_0x0041:
        r1 = new com.jumio.nv.models.AdditionalDataPointsModel;	 Catch:{ all -> 0x005e }
        r1.<init>();	 Catch:{ all -> 0x005e }
    L_0x0046:
        r2 = r9.getCountryCode();	 Catch:{ all -> 0x005e }
        r3 = r9.getAdminArea();	 Catch:{ all -> 0x005e }
        r9 = r9.getPostalCode();	 Catch:{ all -> 0x005e }
        r1.setGeocodedInformation(r2, r3, r9);	 Catch:{ all -> 0x005e }
        r9 = com.jumio.nv.models.AdditionalDataPointsModel.class;
        com.jumio.persistence.DataAccess.update(r8, r9, r1);	 Catch:{ all -> 0x005e }
    L_0x005a:
        monitor-exit(r0);	 Catch:{ all -> 0x005e }
        return;
    L_0x005c:
        monitor-exit(r0);	 Catch:{ all -> 0x005e }
        return;
    L_0x005e:
        r8 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x005e }
        throw r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: jumio.nv.core.ad.b(android.content.Context, android.location.Location):void");
    }

    public static void a(Context context, JSONObject jSONObject) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getApplicationContext().getSystemService("phone");
        if (telephonyManager != null) {
            try {
                String meid;
                if (VERSION.SDK_INT >= 26) {
                    meid = telephonyManager.getMeid();
                    if (TextUtils.isEmpty(meid)) {
                        meid = telephonyManager.getImei();
                    }
                } else {
                    meid = telephonyManager.getDeviceId();
                }
                a(jSONObject, "imeiMeid", meid);
                a(jSONObject, "phoneNumber", telephonyManager.getLine1Number());
                a(jSONObject, "generatedDeviceId", c(context));
            } catch (Exception e) {
                Log.printStackTrace(e);
            }
        }
    }

    private static void a(JSONObject jSONObject, String str, String str2) {
        if (str2 != null && str2.length() != 0) {
            jSONObject.put(str, str2);
        }
    }

    public static String c(Context context) {
        String str = null;
        if (context == null) {
            return null;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("Jumio01", 0);
        String str2 = "Jumio02";
        if (sharedPreferences != null) {
            str = sharedPreferences.getString(str2, null);
        }
        if (str == null || str.equals("")) {
            str = UUID.randomUUID().toString();
        }
        if (sharedPreferences != null) {
            Editor edit = sharedPreferences.edit();
            edit.putString(str2, str);
            edit.apply();
        }
        return str;
    }

    public static int a(Context context, String str) {
        if (context == null) {
            return 0;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("Jumio01", 0);
        if (sharedPreferences != null) {
            return sharedPreferences.getInt(str, 0);
        }
        return 0;
    }

    public static void b(Context context, String str) {
        a(context, str, a(context, str) + 1);
    }

    public static void a(Context context, String str, int i) {
        if (context != null) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("Jumio01", 0);
            if (sharedPreferences != null) {
                Editor edit = sharedPreferences.edit();
                edit.putInt(str, i);
                edit.apply();
            }
        }
    }

    public static void a(Context context, long j) {
        if (context != null) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("Jumio01", 0);
            if (sharedPreferences != null) {
                Editor edit = sharedPreferences.edit();
                edit.putLong("Jumio06", j);
                edit.apply();
            }
        }
    }

    public static long d(Context context) {
        long j = -1;
        if (context == null) {
            return -1;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("Jumio01", 0);
        if (sharedPreferences != null) {
            j = sharedPreferences.getLong("Jumio06", -1);
        }
        return j;
    }
}
