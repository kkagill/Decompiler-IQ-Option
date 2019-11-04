package com.facebook;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.facebook.g.b;
import com.facebook.internal.aa;
import com.facebook.internal.z;
import com.iqoption.dto.entity.position.Position;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: AccessTokenManager */
public final class c {
    private static volatile c sD;
    private final LocalBroadcastManager sE;
    private final b sF;
    private a sG;
    private AtomicBoolean sH = new AtomicBoolean(false);
    private Date sI = new Date(0);

    /* compiled from: AccessTokenManager */
    private static class a {
        public String sR;
        public int sS;
        public Long sT;

        private a() {
        }

        /* synthetic */ a(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    c(LocalBroadcastManager localBroadcastManager, b bVar) {
        aa.b((Object) localBroadcastManager, "localBroadcastManager");
        aa.b((Object) bVar, "accessTokenCache");
        this.sE = localBroadcastManager;
        this.sF = bVar;
    }

    static c gz() {
        if (sD == null) {
            synchronized (c.class) {
                if (sD == null) {
                    sD = new c(LocalBroadcastManager.getInstance(f.getApplicationContext()), new b());
                }
            }
        }
        return sD;
    }

    /* Access modifiers changed, original: 0000 */
    public a ge() {
        return this.sG;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean gA() {
        a gs = this.sF.gs();
        if (gs == null) {
            return false;
        }
        a(gs, false);
        return true;
    }

    /* Access modifiers changed, original: 0000 */
    public void a(a aVar) {
        a(aVar, true);
    }

    private void a(a aVar, boolean z) {
        a aVar2 = this.sG;
        this.sG = aVar;
        this.sH.set(false);
        this.sI = new Date(0);
        if (z) {
            if (aVar != null) {
                this.sF.d(aVar);
            } else {
                this.sF.clear();
                z.aa(f.getApplicationContext());
            }
        }
        if (!z.c((Object) aVar2, (Object) aVar)) {
            a(aVar2, aVar);
            gC();
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void gB() {
        a aVar = this.sG;
        a(aVar, aVar);
    }

    private void a(a aVar, a aVar2) {
        Intent intent = new Intent(f.getApplicationContext(), CurrentAccessTokenExpirationBroadcastReceiver.class);
        intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN", aVar);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN", aVar2);
        this.sE.sendBroadcast(intent);
    }

    private void gC() {
        Context applicationContext = f.getApplicationContext();
        a ge = a.ge();
        AlarmManager alarmManager = (AlarmManager) applicationContext.getSystemService(NotificationCompat.CATEGORY_ALARM);
        if (a.gf() && ge.gh() != null && alarmManager != null) {
            Intent intent = new Intent(applicationContext, CurrentAccessTokenExpirationBroadcastReceiver.class);
            intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
            alarmManager.set(1, ge.gh().getTime(), PendingIntent.getBroadcast(applicationContext, 0, intent, 0));
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void gD() {
        if (gE()) {
            a(null);
        }
    }

    private boolean gE() {
        boolean z = false;
        if (this.sG == null) {
            return false;
        }
        Long valueOf = Long.valueOf(new Date().getTime());
        if (this.sG.gm().canExtendToken() && valueOf.longValue() - this.sI.getTime() > 3600000 && valueOf.longValue() - this.sG.gn().getTime() > 86400000) {
            z = true;
        }
        return z;
    }

    private static g a(a aVar, b bVar) {
        return new g(aVar, "me/permissions", new Bundle(), HttpMethod.GET, bVar);
    }

    private static g b(a aVar, b bVar) {
        Bundle bundle = new Bundle();
        bundle.putString("grant_type", "fb_extend_sso_token");
        return new g(aVar, "oauth/access_token", bundle, HttpMethod.GET, bVar);
    }

    /* Access modifiers changed, original: 0000 */
    public void a(final com.facebook.a.a aVar) {
        if (Looper.getMainLooper().equals(Looper.myLooper())) {
            b(aVar);
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public void run() {
                    c.this.b(aVar);
                }
            });
        }
    }

    private void b(com.facebook.a.a aVar) {
        com.facebook.a.a aVar2 = aVar;
        a aVar3 = this.sG;
        if (aVar3 == null) {
            if (aVar2 != null) {
                aVar2.a(new FacebookException("No current access token to refresh"));
            }
        } else if (this.sH.compareAndSet(false, true)) {
            this.sI = new Date();
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            HashSet hashSet3 = new HashSet();
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            final a aVar4 = new a();
            final AtomicBoolean atomicBoolean2 = atomicBoolean;
            b bVar = r0;
            final HashSet hashSet4 = hashSet;
            g[] gVarArr = new g[2];
            final HashSet hashSet5 = hashSet2;
            HashSet hashSet6 = hashSet2;
            final HashSet hashSet7 = hashSet3;
            AnonymousClass2 anonymousClass2 = new b() {
                public void a(j jVar) {
                    JSONObject hH = jVar.hH();
                    if (hH != null) {
                        JSONArray optJSONArray = hH.optJSONArray("data");
                        if (optJSONArray != null) {
                            atomicBoolean2.set(true);
                            for (int i = 0; i < optJSONArray.length(); i++) {
                                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                                if (optJSONObject != null) {
                                    String optString = optJSONObject.optString("permission");
                                    String optString2 = optJSONObject.optString(NotificationCompat.CATEGORY_STATUS);
                                    if (!(z.aB(optString) || z.aB(optString2))) {
                                        optString2 = optString2.toLowerCase(Locale.US);
                                        if (optString2.equals("granted")) {
                                            hashSet4.add(optString);
                                        } else if (optString2.equals("declined")) {
                                            hashSet5.add(optString);
                                        } else if (optString2.equals(Position.CLOSE_REASON_EXPIRED)) {
                                            hashSet7.add(optString);
                                        } else {
                                            StringBuilder stringBuilder = new StringBuilder();
                                            stringBuilder.append("Unexpected status: ");
                                            stringBuilder.append(optString2);
                                            Log.w("AccessTokenManager", stringBuilder.toString());
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            };
            gVarArr[0] = a(aVar3, bVar);
            gVarArr[1] = b(aVar3, new b() {
                public void a(j jVar) {
                    JSONObject hH = jVar.hH();
                    if (hH != null) {
                        aVar4.sR = hH.optString("access_token");
                        aVar4.sS = hH.optInt("expires_at");
                        aVar4.sT = Long.valueOf(hH.optLong("data_access_expiration_time"));
                    }
                }
            });
            i iVar = new i(gVarArr);
            final a aVar5 = aVar3;
            final com.facebook.a.a aVar6 = aVar;
            final AtomicBoolean atomicBoolean3 = atomicBoolean;
            final a aVar7 = aVar4;
            final HashSet hashSet8 = hashSet;
            final HashSet hashSet9 = hashSet6;
            final HashSet hashSet10 = hashSet3;
            iVar.a(new com.facebook.i.a() {
                /* JADX WARNING: Unknown top exception splitter block from list: {B:18:0x0053=Splitter:B:18:0x0053, B:52:0x010d=Splitter:B:52:0x010d} */
                public void a(com.facebook.i r19) {
                    /*
                    r18 = this;
                    r1 = r18;
                    r2 = 0;
                    r0 = com.facebook.c.gz();	 Catch:{ all -> 0x0129 }
                    r0 = r0.ge();	 Catch:{ all -> 0x0129 }
                    if (r0 == 0) goto L_0x010d;
                L_0x000d:
                    r0 = com.facebook.c.gz();	 Catch:{ all -> 0x0129 }
                    r0 = r0.ge();	 Catch:{ all -> 0x0129 }
                    r0 = r0.gp();	 Catch:{ all -> 0x0129 }
                    r4 = r2;	 Catch:{ all -> 0x0129 }
                    r4 = r4.gp();	 Catch:{ all -> 0x0129 }
                    if (r0 == r4) goto L_0x0023;
                L_0x0021:
                    goto L_0x010d;
                L_0x0023:
                    r0 = r4;	 Catch:{ all -> 0x0129 }
                    r0 = r0.get();	 Catch:{ all -> 0x0129 }
                    if (r0 != 0) goto L_0x0053;
                L_0x002b:
                    r0 = r5;	 Catch:{ all -> 0x0129 }
                    r0 = r0.sR;	 Catch:{ all -> 0x0129 }
                    if (r0 != 0) goto L_0x0053;
                L_0x0031:
                    r0 = r5;	 Catch:{ all -> 0x0129 }
                    r0 = r0.sS;	 Catch:{ all -> 0x0129 }
                    if (r0 != 0) goto L_0x0053;
                L_0x0037:
                    r0 = r3;	 Catch:{ all -> 0x0129 }
                    if (r0 == 0) goto L_0x0047;
                L_0x003b:
                    r0 = r3;	 Catch:{ all -> 0x0129 }
                    r4 = new com.facebook.FacebookException;	 Catch:{ all -> 0x0129 }
                    r5 = "Failed to refresh access token";
                    r4.<init>(r5);	 Catch:{ all -> 0x0129 }
                    r0.a(r4);	 Catch:{ all -> 0x0129 }
                L_0x0047:
                    r0 = com.facebook.c.this;
                    r0 = r0.sH;
                    r0.set(r2);
                    r0 = r3;
                    return;
                L_0x0053:
                    r15 = new com.facebook.a;	 Catch:{ all -> 0x0129 }
                    r0 = r5;	 Catch:{ all -> 0x0129 }
                    r0 = r0.sR;	 Catch:{ all -> 0x0129 }
                    if (r0 == 0) goto L_0x0060;
                L_0x005b:
                    r0 = r5;	 Catch:{ all -> 0x0129 }
                    r0 = r0.sR;	 Catch:{ all -> 0x0129 }
                    goto L_0x0066;
                L_0x0060:
                    r0 = r2;	 Catch:{ all -> 0x0129 }
                    r0 = r0.getToken();	 Catch:{ all -> 0x0129 }
                L_0x0066:
                    r5 = r0;
                    r0 = r2;	 Catch:{ all -> 0x0129 }
                    r6 = r0.go();	 Catch:{ all -> 0x0129 }
                    r0 = r2;	 Catch:{ all -> 0x0129 }
                    r7 = r0.gp();	 Catch:{ all -> 0x0129 }
                    r0 = r4;	 Catch:{ all -> 0x0129 }
                    r0 = r0.get();	 Catch:{ all -> 0x0129 }
                    if (r0 == 0) goto L_0x007e;
                L_0x007b:
                    r0 = r6;	 Catch:{ all -> 0x0129 }
                    goto L_0x0084;
                L_0x007e:
                    r0 = r2;	 Catch:{ all -> 0x0129 }
                    r0 = r0.gj();	 Catch:{ all -> 0x0129 }
                L_0x0084:
                    r8 = r0;
                    r0 = r4;	 Catch:{ all -> 0x0129 }
                    r0 = r0.get();	 Catch:{ all -> 0x0129 }
                    if (r0 == 0) goto L_0x0090;
                L_0x008d:
                    r0 = r7;	 Catch:{ all -> 0x0129 }
                    goto L_0x0096;
                L_0x0090:
                    r0 = r2;	 Catch:{ all -> 0x0129 }
                    r0 = r0.gk();	 Catch:{ all -> 0x0129 }
                L_0x0096:
                    r9 = r0;
                    r0 = r4;	 Catch:{ all -> 0x0129 }
                    r0 = r0.get();	 Catch:{ all -> 0x0129 }
                    if (r0 == 0) goto L_0x00a2;
                L_0x009f:
                    r0 = r8;	 Catch:{ all -> 0x0129 }
                    goto L_0x00a8;
                L_0x00a2:
                    r0 = r2;	 Catch:{ all -> 0x0129 }
                    r0 = r0.gl();	 Catch:{ all -> 0x0129 }
                L_0x00a8:
                    r10 = r0;
                    r0 = r2;	 Catch:{ all -> 0x0129 }
                    r11 = r0.gm();	 Catch:{ all -> 0x0129 }
                    r0 = r5;	 Catch:{ all -> 0x0129 }
                    r0 = r0.sS;	 Catch:{ all -> 0x0129 }
                    r12 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
                    if (r0 == 0) goto L_0x00c4;
                L_0x00b7:
                    r0 = new java.util.Date;	 Catch:{ all -> 0x0129 }
                    r4 = r5;	 Catch:{ all -> 0x0129 }
                    r4 = r4.sS;	 Catch:{ all -> 0x0129 }
                    r3 = (long) r4;	 Catch:{ all -> 0x0129 }
                    r3 = r3 * r12;
                    r0.<init>(r3);	 Catch:{ all -> 0x0129 }
                    goto L_0x00ca;
                L_0x00c4:
                    r0 = r2;	 Catch:{ all -> 0x0129 }
                    r0 = r0.gh();	 Catch:{ all -> 0x0129 }
                L_0x00ca:
                    r3 = new java.util.Date;	 Catch:{ all -> 0x0129 }
                    r3.<init>();	 Catch:{ all -> 0x0129 }
                    r4 = r5;	 Catch:{ all -> 0x0129 }
                    r4 = r4.sT;	 Catch:{ all -> 0x0129 }
                    if (r4 == 0) goto L_0x00e5;
                L_0x00d5:
                    r4 = new java.util.Date;	 Catch:{ all -> 0x0129 }
                    r14 = r5;	 Catch:{ all -> 0x0129 }
                    r14 = r14.sT;	 Catch:{ all -> 0x0129 }
                    r16 = r14.longValue();	 Catch:{ all -> 0x0129 }
                    r12 = r12 * r16;
                    r4.<init>(r12);	 Catch:{ all -> 0x0129 }
                    goto L_0x00eb;
                L_0x00e5:
                    r4 = r2;	 Catch:{ all -> 0x0129 }
                    r4 = r4.gi();	 Catch:{ all -> 0x0129 }
                L_0x00eb:
                    r14 = r4;
                    r4 = r15;
                    r12 = r0;
                    r13 = r3;
                    r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14);	 Catch:{ all -> 0x0129 }
                    r0 = com.facebook.c.gz();	 Catch:{ all -> 0x010a }
                    r0.a(r15);	 Catch:{ all -> 0x010a }
                    r0 = com.facebook.c.this;
                    r0 = r0.sH;
                    r0.set(r2);
                    r0 = r3;
                    if (r0 == 0) goto L_0x0109;
                L_0x0106:
                    r0.c(r15);
                L_0x0109:
                    return;
                L_0x010a:
                    r0 = move-exception;
                    r3 = r15;
                    goto L_0x012b;
                L_0x010d:
                    r0 = r3;	 Catch:{ all -> 0x0129 }
                    if (r0 == 0) goto L_0x011d;
                L_0x0111:
                    r0 = r3;	 Catch:{ all -> 0x0129 }
                    r3 = new com.facebook.FacebookException;	 Catch:{ all -> 0x0129 }
                    r4 = "No current access token to refresh";
                    r3.<init>(r4);	 Catch:{ all -> 0x0129 }
                    r0.a(r3);	 Catch:{ all -> 0x0129 }
                L_0x011d:
                    r0 = com.facebook.c.this;
                    r0 = r0.sH;
                    r0.set(r2);
                    r0 = r3;
                    return;
                L_0x0129:
                    r0 = move-exception;
                    r3 = 0;
                L_0x012b:
                    r4 = com.facebook.c.this;
                    r4 = r4.sH;
                    r4.set(r2);
                    r2 = r3;
                    if (r2 == 0) goto L_0x013d;
                L_0x0138:
                    if (r3 == 0) goto L_0x013d;
                L_0x013a:
                    r2.c(r3);
                L_0x013d:
                    throw r0;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.facebook.c$AnonymousClass4.a(com.facebook.i):void");
                }
            });
            iVar.ho();
        } else {
            if (aVar2 != null) {
                aVar2.a(new FacebookException("Refresh already in progress"));
            }
        }
    }
}
