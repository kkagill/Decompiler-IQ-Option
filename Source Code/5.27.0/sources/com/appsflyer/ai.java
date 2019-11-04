package com.appsflyer;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.google.android.gms.stats.CodePackage;
import com.google.firebase.iid.FirebaseInstanceIdService;
import java.lang.ref.WeakReference;

final class ai {

    static class a extends AsyncTask<Void, Void, String> {
        private String kZ;
        private final WeakReference<Context> nF;

        /* Access modifiers changed, original: protected|final|synthetic */
        public final /* synthetic */ Object doInBackground(Object[] objArr) {
            return dD();
        }

        /* Access modifiers changed, original: protected|final|synthetic */
        public final /* synthetic */ void onPostExecute(Object obj) {
            String str = (String) obj;
            if (!TextUtils.isEmpty(str)) {
                String string = m.dw().getString("afUninstallToken");
                a aVar = new a(str);
                if (string == null) {
                    ai.a((Context) this.nF.get(), aVar);
                    return;
                }
                a ac = a.ac(string);
                if (ac.a(aVar)) {
                    ai.a((Context) this.nF.get(), ac);
                }
            }
        }

        a(WeakReference<Context> weakReference) {
            this.nF = weakReference;
        }

        /* Access modifiers changed, original: protected|final */
        public final void onPreExecute() {
            super.onPreExecute();
            this.kZ = m.dw().getString("gcmProjectNumber");
        }

        private String dD() {
            String str = null;
            try {
                if (this.kZ != null) {
                    str = ai.b(this.nF, this.kZ);
                }
                return str;
            } catch (Throwable th) {
                AFLogger.c("Error registering for uninstall feature", th);
                return null;
            }
        }
    }

    static boolean j(Context context) {
        return l(context) | E(context);
    }

    /* JADX WARNING: Missing block: B:13:0x0047, code skipped:
            if ((r6.getPackageManager().queryIntentServices(r3, 0).size() > 0 ? 1 : null) != null) goto L_0x0049;
     */
    private static boolean E(android.content.Context r6) {
        /*
        r0 = "com.google.android.gms.iid.InstanceID";
        r1 = com.appsflyer.j.dq();
        r1 = r1.ds();
        r2 = 0;
        if (r1 == 0) goto L_0x000e;
    L_0x000d:
        return r2;
    L_0x000e:
        r1 = "com.google.android.gms.iid.InstanceIDListenerService";
        java.lang.Class.forName(r1);	 Catch:{ ClassNotFoundException -> 0x0098, Throwable -> 0x0091 }
        r1 = new android.content.Intent;	 Catch:{ ClassNotFoundException -> 0x0098, Throwable -> 0x0091 }
        r3 = com.appsflyer.r.class;
        r4 = 0;
        r1.<init>(r0, r4, r6, r3);	 Catch:{ ClassNotFoundException -> 0x0098, Throwable -> 0x0091 }
        r3 = new android.content.Intent;	 Catch:{ ClassNotFoundException -> 0x0098, Throwable -> 0x0091 }
        r5 = com.google.android.gms.iid.InstanceIDListenerService.class;
        r3.<init>(r0, r4, r6, r5);	 Catch:{ ClassNotFoundException -> 0x0098, Throwable -> 0x0091 }
        r0 = r6.getPackageManager();	 Catch:{ ClassNotFoundException -> 0x0098, Throwable -> 0x0091 }
        r0 = r0.queryIntentServices(r1, r2);	 Catch:{ ClassNotFoundException -> 0x0098, Throwable -> 0x0091 }
        r0 = r0.size();	 Catch:{ ClassNotFoundException -> 0x0098, Throwable -> 0x0091 }
        r1 = 1;
        if (r0 <= 0) goto L_0x0033;
    L_0x0031:
        r0 = 1;
        goto L_0x0034;
    L_0x0033:
        r0 = 0;
    L_0x0034:
        if (r0 != 0) goto L_0x0049;
    L_0x0036:
        r0 = r6.getPackageManager();	 Catch:{ ClassNotFoundException -> 0x0098, Throwable -> 0x0091 }
        r0 = r0.queryIntentServices(r3, r2);	 Catch:{ ClassNotFoundException -> 0x0098, Throwable -> 0x0091 }
        r0 = r0.size();	 Catch:{ ClassNotFoundException -> 0x0098, Throwable -> 0x0091 }
        if (r0 <= 0) goto L_0x0046;
    L_0x0044:
        r0 = 1;
        goto L_0x0047;
    L_0x0046:
        r0 = 0;
    L_0x0047:
        if (r0 == 0) goto L_0x00a0;
    L_0x0049:
        r0 = new android.content.Intent;	 Catch:{ ClassNotFoundException -> 0x0098, Throwable -> 0x0091 }
        r3 = "com.google.android.c2dm.intent.RECEIVE";
        r5 = "com.google.android.gms.gcm.GcmReceiver";
        r5 = java.lang.Class.forName(r5);	 Catch:{ ClassNotFoundException -> 0x0098, Throwable -> 0x0091 }
        r0.<init>(r3, r4, r6, r5);	 Catch:{ ClassNotFoundException -> 0x0098, Throwable -> 0x0091 }
        r3 = r6.getPackageManager();	 Catch:{ ClassNotFoundException -> 0x0098, Throwable -> 0x0091 }
        r0 = r3.queryBroadcastReceivers(r0, r2);	 Catch:{ ClassNotFoundException -> 0x0098, Throwable -> 0x0091 }
        r0 = r0.size();	 Catch:{ ClassNotFoundException -> 0x0098, Throwable -> 0x0091 }
        if (r0 <= 0) goto L_0x0066;
    L_0x0064:
        r0 = 1;
        goto L_0x0067;
    L_0x0066:
        r0 = 0;
    L_0x0067:
        if (r0 == 0) goto L_0x008b;
    L_0x0069:
        r0 = r6.getPackageName();	 Catch:{ ClassNotFoundException -> 0x0098, Throwable -> 0x0091 }
        r3 = new java.lang.StringBuilder;	 Catch:{ ClassNotFoundException -> 0x0098, Throwable -> 0x0091 }
        r3.<init>();	 Catch:{ ClassNotFoundException -> 0x0098, Throwable -> 0x0091 }
        r3.append(r0);	 Catch:{ ClassNotFoundException -> 0x0098, Throwable -> 0x0091 }
        r0 = ".permission.C2D_MESSAGE";
        r3.append(r0);	 Catch:{ ClassNotFoundException -> 0x0098, Throwable -> 0x0091 }
        r0 = r3.toString();	 Catch:{ ClassNotFoundException -> 0x0098, Throwable -> 0x0091 }
        r6 = com.appsflyer.c.1.AnonymousClass1.g(r6, r0);	 Catch:{ ClassNotFoundException -> 0x0098, Throwable -> 0x0091 }
        if (r6 == 0) goto L_0x0085;
    L_0x0084:
        return r1;
    L_0x0085:
        r6 = "Cannot verify existence of the app's \"permission.C2D_MESSAGE\" permission in the manifest. Please refer to documentation.";
        com.appsflyer.AFLogger.K(r6);	 Catch:{ ClassNotFoundException -> 0x0098, Throwable -> 0x0091 }
        goto L_0x00a0;
    L_0x008b:
        r6 = "Cannot verify existence of GcmReceiver receiver in the manifest. Please refer to documentation.";
        com.appsflyer.AFLogger.K(r6);	 Catch:{ ClassNotFoundException -> 0x0098, Throwable -> 0x0091 }
        goto L_0x00a0;
    L_0x0091:
        r6 = move-exception;
        r0 = "An error occurred while trying to verify manifest declarations: ";
        com.appsflyer.AFLogger.c(r0, r6);
        goto L_0x00a0;
    L_0x0098:
        r6 = move-exception;
        r6 = r6.getMessage();
        com.appsflyer.AFLogger.G(r6);
    L_0x00a0:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.ai.E(android.content.Context):boolean");
    }

    private static boolean l(Context context) {
        String str = "com.google.firebase.INSTANCE_ID_EVENT";
        if (j.dq().ds()) {
            return false;
        }
        try {
            Class.forName("com.google.firebase.iid.FirebaseInstanceIdService");
            Intent intent = new Intent(str, null, context, p.class);
            Intent intent2 = new Intent(str, null, context, FirebaseInstanceIdService.class);
            if ((context.getPackageManager().queryIntentServices(intent, 0).size() > 0 ? 1 : null) == null) {
                if ((context.getPackageManager().queryIntentServices(intent2, 0).size() > 0 ? 1 : null) == null) {
                    AFLogger.K("Cannot verify existence of our InstanceID Listener Service in the manifest. Please refer to documentation.");
                    return false;
                }
            }
            return true;
        } catch (ClassNotFoundException unused) {
        } catch (Throwable th) {
            AFLogger.c("An error occurred while trying to verify manifest declarations: ", th);
        }
    }

    private static String b(WeakReference<Context> weakReference, String str) {
        try {
            Class cls = Class.forName("com.google.android.gms.iid.InstanceID");
            Class.forName("com.google.android.gms.gcm.GcmReceiver");
            Object invoke = cls.getDeclaredMethod("getInstance", new Class[]{Context.class}).invoke(cls, new Object[]{weakReference.get()});
            String str2 = (String) cls.getDeclaredMethod("getToken", new Class[]{String.class, String.class}).invoke(invoke, new Object[]{str, CodePackage.GCM});
            if (str2 != null) {
                return str2;
            }
            AFLogger.K("Couldn't get token using reflection.");
            return null;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (Throwable th) {
            AFLogger.c("Couldn't get token using GoogleCloudMessaging. ", th);
            return null;
        }
    }

    static void a(Context context, a aVar) {
        StringBuilder stringBuilder = new StringBuilder("updateServerUninstallToken called with: ");
        stringBuilder.append(aVar.toString());
        AFLogger.J(stringBuilder.toString());
        String str = "afUninstallToken";
        a ac = a.ac(m.dw().getString(str));
        if (!j.p(context).getBoolean("sentRegisterRequestToAF", false) || ac.dD() == null || !ac.dD().equals(aVar.dD())) {
            m.dw().set(str, aVar.toString());
            j.dq().j(context, aVar.dD());
        }
    }
}
