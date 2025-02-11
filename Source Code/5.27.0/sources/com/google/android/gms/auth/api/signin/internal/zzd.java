package com.google.android.gms.auth.api.signin.internal;

import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.PendingResults;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.StatusPendingResult;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public final class zzd implements Runnable {
    private static final Logger zzbd = new Logger("RevokeAccessOperation", new String[0]);
    private final String zzbe;
    private final StatusPendingResult zzbf = new StatusPendingResult(null);

    private zzd(String str) {
        Preconditions.checkNotEmpty(str);
        this.zzbe = str;
    }

    public final void run() {
        String valueOf;
        Result result = Status.RESULT_INTERNAL_ERROR;
        String valueOf2;
        Logger logger;
        try {
            String str = "https://accounts.google.com/o/oauth2/revoke?token=";
            valueOf2 = String.valueOf(this.zzbe);
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(valueOf2.length() != 0 ? str.concat(valueOf2) : new String(str)).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                result = Status.RESULT_SUCCESS;
            } else {
                zzbd.e("Unable to revoke access!", new Object[0]);
            }
            logger = zzbd;
            StringBuilder stringBuilder = new StringBuilder(26);
            stringBuilder.append("Response Code: ");
            stringBuilder.append(responseCode);
            logger.d(stringBuilder.toString(), new Object[0]);
        } catch (IOException e) {
            logger = zzbd;
            valueOf2 = "IOException when revoking access: ";
            valueOf = String.valueOf(e.toString());
            logger.e(valueOf.length() != 0 ? valueOf2.concat(valueOf) : new String(valueOf2), new Object[0]);
        } catch (Exception e2) {
            logger = zzbd;
            valueOf2 = "Exception when revoking access: ";
            valueOf = String.valueOf(e2.toString());
            logger.e(valueOf.length() != 0 ? valueOf2.concat(valueOf) : new String(valueOf2), new Object[0]);
        }
        this.zzbf.setResult(result);
    }

    public static PendingResult<Status> zzc(String str) {
        if (str == null) {
            return PendingResults.immediateFailedResult(new Status(4), null);
        }
        zzd zzd = new zzd(str);
        new Thread(zzd).start();
        return zzd.zzbf;
    }
}
