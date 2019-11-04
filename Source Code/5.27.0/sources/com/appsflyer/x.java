package com.appsflyer;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import com.android.a.a.a;
import com.android.a.a.c;
import com.android.a.a.d;
import java.util.HashMap;

final class x implements c {
    private a mu;
    private w mv;

    x() {
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(Context context, w wVar) {
        this.mv = wVar;
        try {
            this.mu = a.g(context).cW();
            this.mu.a(this);
        } catch (Throwable th) {
            AFLogger.c("referrerClient -> startConnection", th);
        }
    }

    public final void y(int i) {
        String str = "ReferrerClient: InstallReferrer is not ready";
        String str2 = "install";
        String str3 = "clk";
        String str4 = "val";
        String str5 = NotificationCompat.CATEGORY_ERROR;
        HashMap hashMap = new HashMap();
        hashMap.put("code", String.valueOf(i));
        d dVar = null;
        if (i != 0) {
            str5 = "InstallReferrer not supported";
            if (i == 1) {
                AFLogger.K(str5);
            } else if (i != 2) {
                AFLogger.K("responseCode not found.");
            } else {
                AFLogger.K(str5);
            }
        } else {
            try {
                AFLogger.I("InstallReferrer connected");
                if (this.mu.isReady()) {
                    dVar = this.mu.cV();
                    this.mu.cU();
                } else {
                    AFLogger.K(str);
                    hashMap.put(str5, str);
                }
            } catch (Throwable th) {
                StringBuilder stringBuilder = new StringBuilder("Failed to get install referrer: ");
                stringBuilder.append(th.getMessage());
                AFLogger.K(stringBuilder.toString());
                hashMap.put(str5, th.getMessage());
            }
        }
        if (dVar != null) {
            try {
                if (dVar.cZ() != null) {
                    hashMap.put(str4, dVar.cZ());
                }
                hashMap.put(str3, Long.toString(dVar.da()));
                hashMap.put(str2, Long.toString(dVar.db()));
            } catch (Exception e) {
                e.printStackTrace();
                String str6 = "-1";
                hashMap.put(str4, str6);
                hashMap.put(str3, str6);
                hashMap.put(str2, str6);
            }
        }
        w wVar = this.mv;
        if (wVar != null) {
            wVar.f(hashMap);
        }
    }

    public final void cY() {
        AFLogger.I("Install Referrer service disconnected");
    }
}
