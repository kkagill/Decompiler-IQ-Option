package com.facebook.appevents.codeless;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.internal.b;
import com.facebook.f;
import com.facebook.g;
import com.facebook.internal.s;
import com.facebook.internal.z;
import com.facebook.j;
import java.io.ByteArrayOutputStream;
import java.lang.ref.WeakReference;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ViewIndexer */
public class d {
    private static final String TAG = "com.facebook.appevents.codeless.d";
    private static d wi;
    private final Handler vU = new Handler(Looper.getMainLooper());
    private WeakReference<Activity> wf;
    private Timer wg;
    private String wh = null;

    /* compiled from: ViewIndexer */
    private static class a implements Callable<String> {
        private WeakReference<View> vM;

        a(View view) {
            this.vM = new WeakReference(view);
        }

        /* renamed from: iH */
        public String call() {
            View view = (View) this.vM.get();
            if (view == null || view.getWidth() == 0 || view.getHeight() == 0) {
                return "";
            }
            Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Config.RGB_565);
            view.draw(new Canvas(createBitmap));
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            createBitmap.compress(CompressFormat.JPEG, 10, byteArrayOutputStream);
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
        }
    }

    public d(Activity activity) {
        this.wf = new WeakReference(activity);
        wi = this;
    }

    public void iF() {
        final Activity activity = (Activity) this.wf.get();
        if (activity != null) {
            final String simpleName = activity.getClass().getSimpleName();
            final AnonymousClass1 anonymousClass1 = new TimerTask() {
                /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x006e */
                /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
                public void run() {
                    /*
                    r6 = this;
                    r0 = r0;	 Catch:{ Exception -> 0x0081 }
                    r0 = r0.getWindow();	 Catch:{ Exception -> 0x0081 }
                    r0 = r0.getDecorView();	 Catch:{ Exception -> 0x0081 }
                    r0 = r0.getRootView();	 Catch:{ Exception -> 0x0081 }
                    r1 = com.facebook.appevents.internal.a.iT();	 Catch:{ Exception -> 0x0081 }
                    if (r1 != 0) goto L_0x0015;
                L_0x0014:
                    return;
                L_0x0015:
                    r1 = com.facebook.internal.q.ks();	 Catch:{ Exception -> 0x0081 }
                    if (r1 == 0) goto L_0x001f;
                L_0x001b:
                    com.facebook.appevents.codeless.internal.c.iN();	 Catch:{ Exception -> 0x0081 }
                    return;
                L_0x001f:
                    r1 = new java.util.concurrent.FutureTask;	 Catch:{ Exception -> 0x0081 }
                    r2 = new com.facebook.appevents.codeless.d$a;	 Catch:{ Exception -> 0x0081 }
                    r2.<init>(r0);	 Catch:{ Exception -> 0x0081 }
                    r1.<init>(r2);	 Catch:{ Exception -> 0x0081 }
                    r2 = com.facebook.appevents.codeless.d.this;	 Catch:{ Exception -> 0x0081 }
                    r2 = r2.vU;	 Catch:{ Exception -> 0x0081 }
                    r2.post(r1);	 Catch:{ Exception -> 0x0081 }
                    r2 = "";
                    r3 = 1;
                    r5 = java.util.concurrent.TimeUnit.SECONDS;	 Catch:{ Exception -> 0x003f }
                    r1 = r1.get(r3, r5);	 Catch:{ Exception -> 0x003f }
                    r1 = (java.lang.String) r1;	 Catch:{ Exception -> 0x003f }
                    goto L_0x004a;
                L_0x003f:
                    r1 = move-exception;
                    r3 = com.facebook.appevents.codeless.d.TAG;	 Catch:{ Exception -> 0x0081 }
                    r4 = "Failed to take screenshot.";
                    android.util.Log.e(r3, r4, r1);	 Catch:{ Exception -> 0x0081 }
                    r1 = r2;
                L_0x004a:
                    r2 = new org.json.JSONObject;	 Catch:{ Exception -> 0x0081 }
                    r2.<init>();	 Catch:{ Exception -> 0x0081 }
                    r3 = "screenname";
                    r4 = r1;	 Catch:{ JSONException -> 0x006e }
                    r2.put(r3, r4);	 Catch:{ JSONException -> 0x006e }
                    r3 = "screenshot";
                    r2.put(r3, r1);	 Catch:{ JSONException -> 0x006e }
                    r1 = new org.json.JSONArray;	 Catch:{ JSONException -> 0x006e }
                    r1.<init>();	 Catch:{ JSONException -> 0x006e }
                    r0 = com.facebook.appevents.codeless.internal.d.g(r0);	 Catch:{ JSONException -> 0x006e }
                    r1.put(r0);	 Catch:{ JSONException -> 0x006e }
                    r0 = "view";
                    r2.put(r0, r1);	 Catch:{ JSONException -> 0x006e }
                    goto L_0x0077;
                L_0x006e:
                    r0 = com.facebook.appevents.codeless.d.TAG;	 Catch:{ Exception -> 0x0081 }
                    r1 = "Failed to create JSONObject";
                    android.util.Log.e(r0, r1);	 Catch:{ Exception -> 0x0081 }
                L_0x0077:
                    r0 = r2.toString();	 Catch:{ Exception -> 0x0081 }
                    r1 = com.facebook.appevents.codeless.d.this;	 Catch:{ Exception -> 0x0081 }
                    r1.aT(r0);	 Catch:{ Exception -> 0x0081 }
                    goto L_0x008b;
                L_0x0081:
                    r0 = move-exception;
                    r1 = com.facebook.appevents.codeless.d.TAG;
                    r2 = "UI Component tree indexing failure!";
                    android.util.Log.e(r1, r2, r0);
                L_0x008b:
                    return;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.codeless.d$AnonymousClass1.run():void");
                }
            };
            f.getExecutor().execute(new Runnable() {
                public void run() {
                    try {
                        if (d.this.wg != null) {
                            d.this.wg.cancel();
                        }
                        d.this.wh = null;
                        d.this.wg = new Timer();
                        d.this.wg.scheduleAtFixedRate(anonymousClass1, 0, 1000);
                    } catch (Exception e) {
                        Log.e(d.TAG, "Error scheduling indexing job", e);
                    }
                }
            });
        }
    }

    public void iG() {
        if (((Activity) this.wf.get()) != null) {
            Timer timer = this.wg;
            if (timer != null) {
                try {
                    timer.cancel();
                    this.wg = null;
                } catch (Exception e) {
                    Log.e(TAG, "Error unscheduling indexing job", e);
                }
            }
        }
    }

    private void aT(final String str) {
        f.getExecutor().execute(new Runnable() {
            public void run() {
                String str = "is_app_indexing_enabled";
                String bo = z.bo(str);
                com.facebook.a ge = com.facebook.a.ge();
                if (bo == null || !bo.equals(d.this.wh)) {
                    g a = d.a(str, ge, f.go(), "app_indexing");
                    if (a != null) {
                        j hn = a.hn();
                        try {
                            JSONObject hH = hn.hH();
                            if (hH != null) {
                                if ("true".equals(hH.optString("success"))) {
                                    s.a(LoggingBehavior.APP_EVENTS, d.TAG, "Successfully send UI component tree to server");
                                    d.this.wh = bo;
                                }
                                if (hH.has(str)) {
                                    com.facebook.appevents.internal.a.c(Boolean.valueOf(hH.getBoolean(str)));
                                }
                            } else {
                                str = d.TAG;
                                StringBuilder stringBuilder = new StringBuilder();
                                stringBuilder.append("Error sending UI component tree to Facebook: ");
                                stringBuilder.append(hn.hG());
                                Log.e(str, stringBuilder.toString());
                            }
                        } catch (JSONException e) {
                            Log.e(d.TAG, "Error decoding server response.", e);
                        }
                    }
                }
            }
        });
    }

    @Nullable
    public static g a(String str, com.facebook.a aVar, String str2, String str3) {
        if (str == null) {
            return null;
        }
        g a = g.a(aVar, String.format(Locale.US, "%s/app_indexing", new Object[]{str2}), null, null);
        Bundle parameters = a.getParameters();
        if (parameters == null) {
            parameters = new Bundle();
        }
        parameters.putString("tree", str);
        parameters.putString("app_version", b.ji());
        parameters.putString("platform", "android");
        parameters.putString("request_type", str3);
        if (str3.equals("app_indexing")) {
            parameters.putString("device_session_id", com.facebook.appevents.internal.a.iS());
        }
        a.setParameters(parameters);
        a.a(new g.b() {
            public void a(j jVar) {
                s.a(LoggingBehavior.APP_EVENTS, d.TAG, "App index sent to FB!");
            }
        });
        return a;
    }
}
