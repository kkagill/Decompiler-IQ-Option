package com.iqoption.analytics;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.work.ListenableWorker.Result;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.iqoption.app.b;
import com.iqoption.core.microservices.event.a;
import com.iqoption.dto.Event;
import com.iqoption.util.aj;
import com.iqoption.util.w;
import java.util.Iterator;

public class EventsSendWorker extends Worker {
    private static final String TAG = "com.iqoption.analytics.EventsSendWorker";

    public EventsSendWorker(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026 A:{Catch:{ HttpException -> 0x0037, Exception -> 0x0032 }} */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0014 */
    /* JADX WARNING: Removed duplicated region for block: B:12:? A:{SYNTHETIC, ExcHandler: HttpException (unused com.iqoption.core.connect.http.HttpException), Splitter:B:1:0x0007} */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing block: B:13:?, code skipped:
            return androidx.work.ListenableWorker.Result.retry();
     */
    /* JADX WARNING: Missing block: B:15:?, code skipped:
            return androidx.work.ListenableWorker.Result.failure();
     */
    @androidx.annotation.NonNull
    public androidx.work.ListenableWorker.Result doWork() {
        /*
        r6 = this;
        com.iqoption.analytics.EventManager.BU();
        r0 = androidx.work.ListenableWorker.Result.success();
        r1 = com.iqoption.system.d.a.isInitialized();	 Catch:{ Exception -> 0x0014, HttpException -> 0x0037 }
        if (r1 != 0) goto L_0x0014;
    L_0x000d:
        r1 = com.iqoption.system.d.a.aUF();	 Catch:{ Exception -> 0x0014, HttpException -> 0x0037 }
        r1.initialize();	 Catch:{ Exception -> 0x0014, HttpException -> 0x0037 }
    L_0x0014:
        r1 = com.iqoption.analytics.EventManager.BS();	 Catch:{ HttpException -> 0x0037, Exception -> 0x0032 }
        r1 = r1.BV();	 Catch:{ HttpException -> 0x0037, Exception -> 0x0032 }
        r1 = r1.longValue();	 Catch:{ HttpException -> 0x0037, Exception -> 0x0032 }
        r3 = 0;
        r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1));
        if (r5 <= 0) goto L_0x003b;
    L_0x0026:
        r6.Cd();	 Catch:{ HttpException -> 0x0037, Exception -> 0x0032 }
        r1 = 1;
        r1 = java.lang.Boolean.valueOf(r1);	 Catch:{ HttpException -> 0x0037, Exception -> 0x0032 }
        r6.g(r1);	 Catch:{ HttpException -> 0x0037, Exception -> 0x0032 }
        goto L_0x003b;
    L_0x0032:
        r0 = androidx.work.ListenableWorker.Result.failure();
        goto L_0x003b;
    L_0x0037:
        r0 = androidx.work.ListenableWorker.Result.retry();
    L_0x003b:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.analytics.EventsSendWorker.doWork():androidx.work.ListenableWorker$Result");
    }

    private Result Cd() {
        return g(Boolean.valueOf(false));
    }

    private Result g(Boolean bool) {
        EventManager BS = EventManager.BS();
        String bO = aj.bO(getApplicationContext());
        long userId = b.DG().getUserId();
        Object aA = BS.aA(bool.booleanValue());
        while (!aA.isEmpty()) {
            Iterator it = aA.iterator();
            while (it.hasNext()) {
                Event event = (Event) it.next();
                event.device_id = bO;
                event.user_id = Long.valueOf(userId);
            }
            a.bsV.gE(w.aWM().toJson(aA));
            BS.f(aA);
            aA = BS.aA(bool.booleanValue());
        }
        return Result.success();
    }
}
