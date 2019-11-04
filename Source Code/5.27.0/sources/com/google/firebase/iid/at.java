package com.google.firebase.iid;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.FirebaseApp;
import com.google.firebase.c.g;
import java.io.IOException;
import java.util.concurrent.Executor;

final class at implements b {
    private final FirebaseApp acB;
    private final o acC;
    private final v aei;
    private final g aej;
    private final Executor executor;

    at(FirebaseApp firebaseApp, o oVar, Executor executor, g gVar) {
        this(firebaseApp, oVar, executor, new v(firebaseApp.getApplicationContext(), oVar), gVar);
    }

    public final boolean wy() {
        return false;
    }

    @VisibleForTesting
    private at(FirebaseApp firebaseApp, o oVar, Executor executor, v vVar, g gVar) {
        this.acB = firebaseApp;
        this.acC = oVar;
        this.aei = vVar;
        this.executor = executor;
        this.aej = gVar;
    }

    public final boolean isAvailable() {
        return this.acC.zzac() != 0;
    }

    public final Task<String> e(String str, String str2, String str3, String str4) {
        return c(a(str, str3, str4, new Bundle()));
    }

    public final Task<Void> f(String str, String str2, String str3, String str4) {
        Bundle bundle = new Bundle();
        bundle.putString("delete", "1");
        return b(c(a(str, str3, str4, bundle)));
    }

    public final Task<Void> cc(String str) {
        Bundle bundle = new Bundle();
        String str2 = "delete";
        bundle.putString("iid-operation", str2);
        bundle.putString(str2, "1");
        str2 = "*";
        return b(c(a(str, str2, str2, bundle)));
    }

    public final Task<Void> e(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        String valueOf = String.valueOf(str3);
        String str4 = "/topics/";
        bundle.putString("gcm.topic", valueOf.length() != 0 ? str4.concat(valueOf) : new String(str4));
        str3 = String.valueOf(str3);
        return b(c(a(str, str2, str3.length() != 0 ? str4.concat(str3) : new String(str4), bundle)));
    }

    public final Task<Void> f(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        String valueOf = String.valueOf(str3);
        String str4 = "/topics/";
        bundle.putString("gcm.topic", valueOf.length() != 0 ? str4.concat(valueOf) : new String(str4));
        bundle.putString("delete", "1");
        str3 = String.valueOf(str3);
        return b(c(a(str, str2, str3.length() != 0 ? str4.concat(str3) : new String(str4), bundle)));
    }

    private final Task<Bundle> a(String str, String str2, String str3, Bundle bundle) {
        bundle.putString("scope", str3);
        bundle.putString("sender", str2);
        bundle.putString("subtype", str2);
        bundle.putString("appid", str);
        bundle.putString("gmp_app_id", this.acB.vO().go());
        bundle.putString("gmsv", Integer.toString(this.acC.zzaf()));
        bundle.putString("osv", Integer.toString(VERSION.SDK_INT));
        bundle.putString("app_ver", this.acC.wF());
        bundle.putString("app_ver_name", this.acC.wG());
        bundle.putString("cliv", "fiid-12451000");
        bundle.putString("Firebase-Client", this.aej.hu());
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.executor.execute(new as(this, bundle, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    private static String y(Bundle bundle) {
        String str = "SERVICE_NOT_AVAILABLE";
        if (bundle != null) {
            String string = bundle.getString("registration_id");
            if (string != null) {
                return string;
            }
            string = bundle.getString("unregistered");
            if (string != null) {
                return string;
            }
            string = bundle.getString("error");
            if ("RST".equals(string)) {
                throw new IOException("INSTANCE_ID_RESET");
            } else if (string != null) {
                throw new IOException(string);
            } else {
                String valueOf = String.valueOf(bundle);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 21);
                stringBuilder.append("Unexpected response: ");
                stringBuilder.append(valueOf);
                Log.w("FirebaseInstanceId", stringBuilder.toString(), new Throwable());
                throw new IOException(str);
            }
        }
        throw new IOException(str);
    }

    private final <T> Task<Void> b(Task<T> task) {
        return task.continueWith(ai.wO(), new av(this));
    }

    private final Task<String> c(Task<Bundle> task) {
        return task.continueWith(this.executor, new au(this));
    }
}
