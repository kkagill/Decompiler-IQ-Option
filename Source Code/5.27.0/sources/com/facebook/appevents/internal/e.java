package com.facebook.appevents.internal;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: InAppPurchaseActivityLifecycleTracker */
public class e {
    private static final String TAG = "com.facebook.appevents.internal.e";
    private static Intent intent;
    private static final AtomicBoolean wX = new AtomicBoolean(false);
    private static Boolean wY = null;
    private static Boolean wZ = null;
    private static ServiceConnection xa;
    private static ActivityLifecycleCallbacks xb;
    private static Object xc;

    public static void update() {
        hT();
        if (wY.booleanValue() && c.jk()) {
            startTracking();
        }
    }

    private static void hT() {
        if (wY == null) {
            try {
                Class.forName("com.android.vending.billing.IInAppBillingService$Stub");
                wY = Boolean.valueOf(true);
                try {
                    Class.forName("com.android.billingclient.api.ProxyBillingActivity");
                    wZ = Boolean.valueOf(true);
                } catch (ClassNotFoundException unused) {
                    wZ = Boolean.valueOf(false);
                }
                f.jo();
                intent = new Intent("com.android.vending.billing.InAppBillingService.BIND").setPackage("com.android.vending");
                xa = new ServiceConnection() {
                    public void onServiceDisconnected(ComponentName componentName) {
                    }

                    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                        e.xc = f.a(f.getApplicationContext(), iBinder);
                    }
                };
                xb = new ActivityLifecycleCallbacks() {
                    public void onActivityCreated(Activity activity, Bundle bundle) {
                    }

                    public void onActivityDestroyed(Activity activity) {
                    }

                    public void onActivityPaused(Activity activity) {
                    }

                    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                    }

                    public void onActivityStarted(Activity activity) {
                    }

                    public void onActivityResumed(Activity activity) {
                        f.getExecutor().execute(new Runnable() {
                            public void run() {
                                Context applicationContext = f.getApplicationContext();
                                e.a(applicationContext, f.b(applicationContext, e.xc));
                                Map c = f.c(applicationContext, e.xc);
                                e.a(applicationContext, c, new HashMap());
                                Set hashSet = new HashSet();
                                c.clear();
                                Iterator it = f.a(applicationContext, e.xc, hashSet).iterator();
                                while (it.hasNext()) {
                                    c.put((String) it.next(), SubscriptionType.EXPIRE);
                                }
                                HashMap hashMap = new HashMap();
                                if (!hashSet.isEmpty()) {
                                    hashMap.put("error_code", TextUtils.join(",", hashSet));
                                }
                                e.a(applicationContext, c, hashMap);
                            }
                        });
                    }

                    public void onActivityStopped(Activity activity) {
                        if (e.wZ.booleanValue() && activity.getLocalClassName().equals("com.android.billingclient.api.ProxyBillingActivity")) {
                            f.getExecutor().execute(new Runnable() {
                                public void run() {
                                    Context applicationContext = f.getApplicationContext();
                                    ArrayList b = f.b(applicationContext, e.xc);
                                    if (b.isEmpty()) {
                                        b = f.d(applicationContext, e.xc);
                                    }
                                    e.a(applicationContext, b);
                                }
                            });
                        }
                    }
                };
            } catch (ClassNotFoundException unused2) {
                wY = Boolean.valueOf(false);
            }
        }
    }

    private static void startTracking() {
        if (wX.compareAndSet(false, true)) {
            Context applicationContext = f.getApplicationContext();
            if (applicationContext instanceof Application) {
                ((Application) applicationContext).registerActivityLifecycleCallbacks(xb);
                applicationContext.bindService(intent, xa, 1);
            }
        }
    }

    private static void a(Context context, ArrayList<String> arrayList) {
        if (!arrayList.isEmpty()) {
            HashMap hashMap = new HashMap();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                try {
                    String string = new JSONObject(str).getString("productId");
                    hashMap.put(string, str);
                    arrayList2.add(string);
                } catch (JSONException e) {
                    Log.e(TAG, "Error parsing in-app purchase data.", e);
                }
            }
            for (Entry entry : f.a(context, arrayList2, xc, false).entrySet()) {
                c.z((String) hashMap.get(entry.getKey()), (String) entry.getValue());
            }
        }
    }

    private static void a(Context context, Map<String, SubscriptionType> map, Map<String, String> map2) {
        if (!map.isEmpty()) {
            String str;
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            for (String str2 : map.keySet()) {
                try {
                    String string = new JSONObject(str2).getString("productId");
                    arrayList.add(string);
                    hashMap.put(string, str2);
                } catch (JSONException e) {
                    Log.e(TAG, "Error parsing in-app purchase data.", e);
                }
            }
            Map a = f.a(context, arrayList, xc, true);
            for (String str3 : a.keySet()) {
                str2 = (String) hashMap.get(str3);
                c.a((SubscriptionType) map.get(str2), str2, (String) a.get(str3), map2);
            }
        }
    }
}
