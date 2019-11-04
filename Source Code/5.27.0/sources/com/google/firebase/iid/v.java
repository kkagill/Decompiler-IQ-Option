package com.google.firebase.iid;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.util.Log;
import androidx.collection.SimpleArrayMap;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.iid.an.a;
import java.util.concurrent.ExecutionException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class v {
    private static int adc;
    private static PendingIntent adn;
    private final o acC;
    private final Context acP;
    private final SimpleArrayMap<String, TaskCompletionSource<Bundle>> ado = new SimpleArrayMap();
    private Messenger adp;
    private Messenger adq;
    private an adr;

    public v(Context context, o oVar) {
        this.acP = context;
        this.acC = oVar;
        this.adp = new Messenger(new u(this, Looper.getMainLooper()));
    }

    private final void b(Message message) {
        if (message == null || !(message.obj instanceof Intent)) {
            Log.w("FirebaseInstanceId", "Dropping invalid message");
        } else {
            Intent intent = (Intent) message.obj;
            intent.setExtrasClassLoader(new a());
            if (intent.hasExtra("google.messenger")) {
                Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                if (parcelableExtra instanceof an) {
                    this.adr = (an) parcelableExtra;
                }
                if (parcelableExtra instanceof Messenger) {
                    this.adq = (Messenger) parcelableExtra;
                }
            }
            Intent intent2 = (Intent) message.obj;
            String action = intent2.getAction();
            String valueOf;
            if ("com.google.android.c2dm.intent.REGISTRATION".equals(action)) {
                CharSequence stringExtra = intent2.getStringExtra("registration_id");
                if (stringExtra == null) {
                    stringExtra = intent2.getStringExtra("unregistered");
                }
                String str;
                if (stringExtra == null) {
                    action = intent2.getStringExtra("error");
                    if (action == null) {
                        valueOf = String.valueOf(intent2.getExtras());
                        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 49);
                        stringBuilder.append("Unexpected response, no error or registration id ");
                        stringBuilder.append(valueOf);
                        Log.w("FirebaseInstanceId", stringBuilder.toString());
                    } else {
                        if (Log.isLoggable("FirebaseInstanceId", 3)) {
                            String str2 = "Received InstanceID error ";
                            String valueOf2 = String.valueOf(action);
                            Log.d("FirebaseInstanceId", valueOf2.length() != 0 ? str2.concat(valueOf2) : new String(str2));
                        }
                        if (action.startsWith("|")) {
                            String[] split = action.split("\\|");
                            if (split.length > 2) {
                                if ("ID".equals(split[1])) {
                                    action = split[2];
                                    str = split[3];
                                    if (str.startsWith(":")) {
                                        str = str.substring(1);
                                    }
                                    f(action, intent2.putExtra("error", str).getExtras());
                                }
                            }
                            valueOf = "Unexpected structured response ";
                            action = String.valueOf(action);
                            Log.w("FirebaseInstanceId", action.length() != 0 ? valueOf.concat(action) : new String(valueOf));
                        } else {
                            synchronized (this.ado) {
                                for (int i = 0; i < this.ado.size(); i++) {
                                    f((String) this.ado.keyAt(i), intent2.getExtras());
                                }
                            }
                        }
                    }
                } else {
                    Matcher matcher = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)").matcher(stringExtra);
                    if (matcher.matches()) {
                        action = matcher.group(1);
                        str = matcher.group(2);
                        Bundle extras = intent2.getExtras();
                        extras.putString("registration_id", str);
                        f(action, extras);
                        return;
                    }
                    if (Log.isLoggable("FirebaseInstanceId", 3)) {
                        valueOf = "Unexpected response string: ";
                        action = String.valueOf(stringExtra);
                        Log.d("FirebaseInstanceId", action.length() != 0 ? valueOf.concat(action) : new String(valueOf));
                    }
                    return;
                }
            }
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                valueOf = "Unexpected response action: ";
                action = String.valueOf(action);
                Log.d("FirebaseInstanceId", action.length() != 0 ? valueOf.concat(action) : new String(valueOf));
            }
        }
    }

    private static synchronized void d(Context context, Intent intent) {
        synchronized (v.class) {
            if (adn == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                adn = PendingIntent.getBroadcast(context, 0, intent2, 0);
            }
            intent.putExtra("app", adn);
        }
    }

    private final void f(String str, Bundle bundle) {
        synchronized (this.ado) {
            TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.ado.remove(str);
            if (taskCompletionSource == null) {
                String str2 = "FirebaseInstanceId";
                String str3 = "Missing callback for ";
                str = String.valueOf(str);
                Log.w(str2, str.length() != 0 ? str3.concat(str) : new String(str3));
                return;
            }
            taskCompletionSource.setResult(bundle);
        }
    }

    /* Access modifiers changed, original: final */
    public final Bundle v(Bundle bundle) {
        if (this.acC.zzaf() < 12000000) {
            return w(bundle);
        }
        try {
            return (Bundle) Tasks.await(e.aD(this.acP).b(1, bundle));
        } catch (InterruptedException | ExecutionException e) {
            String str = "FirebaseInstanceId";
            if (Log.isLoggable(str, 3)) {
                String valueOf = String.valueOf(e);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 22);
                stringBuilder.append("Error making request: ");
                stringBuilder.append(valueOf);
                Log.d(str, stringBuilder.toString());
            }
            return ((e.getCause() instanceof zzam) && ((zzam) e.getCause()).getErrorCode() == 4) ? w(bundle) : null;
        }
    }

    private final Bundle w(Bundle bundle) {
        Bundle x = x(bundle);
        if (x == null) {
            return x;
        }
        String str = "google.messenger";
        if (!x.containsKey(str)) {
            return x;
        }
        x = x(bundle);
        return (x == null || !x.containsKey(str)) ? x : null;
    }

    private static synchronized String zzah() {
        String num;
        synchronized (v.class) {
            int i = adc;
            adc = i + 1;
            num = Integer.toString(i);
        }
        return num;
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00f1 A:{SYNTHETIC} */
    private final android.os.Bundle x(android.os.Bundle r8) {
        /*
        r7 = this;
        r0 = zzah();
        r1 = new com.google.android.gms.tasks.TaskCompletionSource;
        r1.<init>();
        r2 = r7.ado;
        monitor-enter(r2);
        r3 = r7.ado;	 Catch:{ all -> 0x0128 }
        r3.put(r0, r1);	 Catch:{ all -> 0x0128 }
        monitor-exit(r2);	 Catch:{ all -> 0x0128 }
        r2 = r7.acC;
        r2 = r2.zzac();
        if (r2 == 0) goto L_0x0120;
    L_0x001a:
        r2 = new android.content.Intent;
        r2.<init>();
        r3 = "com.google.android.gms";
        r2.setPackage(r3);
        r3 = r7.acC;
        r3 = r3.zzac();
        r4 = 2;
        if (r3 != r4) goto L_0x0033;
    L_0x002d:
        r3 = "com.google.iid.TOKEN_REQUEST";
        r2.setAction(r3);
        goto L_0x0038;
    L_0x0033:
        r3 = "com.google.android.c2dm.intent.REGISTER";
        r2.setAction(r3);
    L_0x0038:
        r2.putExtras(r8);
        r8 = r7.acP;
        d(r8, r2);
        r8 = java.lang.String.valueOf(r0);
        r8 = r8.length();
        r8 = r8 + 5;
        r3 = new java.lang.StringBuilder;
        r3.<init>(r8);
        r8 = "|ID|";
        r3.append(r8);
        r3.append(r0);
        r8 = "|";
        r3.append(r8);
        r8 = r3.toString();
        r3 = "kid";
        r2.putExtra(r3, r8);
        r8 = 3;
        r3 = "FirebaseInstanceId";
        r3 = android.util.Log.isLoggable(r3, r8);
        if (r3 == 0) goto L_0x0098;
    L_0x0070:
        r3 = r2.getExtras();
        r3 = java.lang.String.valueOf(r3);
        r5 = java.lang.String.valueOf(r3);
        r5 = r5.length();
        r5 = r5 + 8;
        r6 = new java.lang.StringBuilder;
        r6.<init>(r5);
        r5 = "Sending ";
        r6.append(r5);
        r6.append(r3);
        r3 = r6.toString();
        r5 = "FirebaseInstanceId";
        android.util.Log.d(r5, r3);
    L_0x0098:
        r3 = r7.adp;
        r5 = "google.messenger";
        r2.putExtra(r5, r3);
        r3 = r7.adq;
        if (r3 != 0) goto L_0x00a7;
    L_0x00a3:
        r3 = r7.adr;
        if (r3 == 0) goto L_0x00cd;
    L_0x00a7:
        r3 = android.os.Message.obtain();
        r3.obj = r2;
        r5 = r7.adq;	 Catch:{ RemoteException -> 0x00bd }
        if (r5 == 0) goto L_0x00b7;
    L_0x00b1:
        r5 = r7.adq;	 Catch:{ RemoteException -> 0x00bd }
        r5.send(r3);	 Catch:{ RemoteException -> 0x00bd }
        goto L_0x00e0;
    L_0x00b7:
        r5 = r7.adr;	 Catch:{ RemoteException -> 0x00bd }
        r5.send(r3);	 Catch:{ RemoteException -> 0x00bd }
        goto L_0x00e0;
        r3 = "FirebaseInstanceId";
        r8 = android.util.Log.isLoggable(r3, r8);
        if (r8 == 0) goto L_0x00cd;
    L_0x00c6:
        r8 = "FirebaseInstanceId";
        r3 = "Messenger failed, fallback to startService";
        android.util.Log.d(r8, r3);
    L_0x00cd:
        r8 = r7.acC;
        r8 = r8.zzac();
        if (r8 != r4) goto L_0x00db;
    L_0x00d5:
        r8 = r7.acP;
        r8.sendBroadcast(r2);
        goto L_0x00e0;
    L_0x00db:
        r8 = r7.acP;
        r8.startService(r2);
    L_0x00e0:
        r8 = r1.getTask();	 Catch:{ InterruptedException | TimeoutException -> 0x0104, InterruptedException | TimeoutException -> 0x0104, ExecutionException -> 0x00fd }
        r1 = 30000; // 0x7530 float:4.2039E-41 double:1.4822E-319;
        r3 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ InterruptedException | TimeoutException -> 0x0104, InterruptedException | TimeoutException -> 0x0104, ExecutionException -> 0x00fd }
        r8 = com.google.android.gms.tasks.Tasks.await(r8, r1, r3);	 Catch:{ InterruptedException | TimeoutException -> 0x0104, InterruptedException | TimeoutException -> 0x0104, ExecutionException -> 0x00fd }
        r8 = (android.os.Bundle) r8;	 Catch:{ InterruptedException | TimeoutException -> 0x0104, InterruptedException | TimeoutException -> 0x0104, ExecutionException -> 0x00fd }
        r1 = r7.ado;
        monitor-enter(r1);
        r2 = r7.ado;	 Catch:{ all -> 0x00f8 }
        r2.remove(r0);	 Catch:{ all -> 0x00f8 }
        monitor-exit(r1);	 Catch:{ all -> 0x00f8 }
        return r8;
    L_0x00f8:
        r8 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x00f8 }
        throw r8;
    L_0x00fb:
        r8 = move-exception;
        goto L_0x0113;
    L_0x00fd:
        r8 = move-exception;
        r1 = new java.io.IOException;	 Catch:{ all -> 0x00fb }
        r1.<init>(r8);	 Catch:{ all -> 0x00fb }
        throw r1;	 Catch:{ all -> 0x00fb }
    L_0x0104:
        r8 = "FirebaseInstanceId";
        r1 = "No response";
        android.util.Log.w(r8, r1);	 Catch:{ all -> 0x00fb }
        r8 = new java.io.IOException;	 Catch:{ all -> 0x00fb }
        r1 = "TIMEOUT";
        r8.<init>(r1);	 Catch:{ all -> 0x00fb }
        throw r8;	 Catch:{ all -> 0x00fb }
    L_0x0113:
        r1 = r7.ado;
        monitor-enter(r1);
        r2 = r7.ado;	 Catch:{ all -> 0x011d }
        r2.remove(r0);	 Catch:{ all -> 0x011d }
        monitor-exit(r1);	 Catch:{ all -> 0x011d }
        throw r8;
    L_0x011d:
        r8 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x011d }
        throw r8;
    L_0x0120:
        r8 = new java.io.IOException;
        r0 = "MISSING_INSTANCEID_SERVICE";
        r8.<init>(r0);
        throw r8;
    L_0x0128:
        r8 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0128 }
        throw r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.v.x(android.os.Bundle):android.os.Bundle");
    }
}
