package com.google.android.gms.internal.gtm;

import com.google.android.gms.tagmanager.zzdi;
import com.google.android.gms.wallet.WalletConstants;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

final class zzpb implements zzpc {
    private HttpURLConnection zzatk;
    private InputStream zzatl = null;

    zzpb() {
    }

    public final InputStream zzcj(String str) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setReadTimeout(20000);
        httpURLConnection.setConnectTimeout(20000);
        this.zzatk = httpURLConnection;
        httpURLConnection = this.zzatk;
        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode == 200) {
            this.zzatl = httpURLConnection.getInputStream();
            return this.zzatl;
        }
        StringBuilder stringBuilder = new StringBuilder(25);
        stringBuilder.append("Bad response: ");
        stringBuilder.append(responseCode);
        str = stringBuilder.toString();
        if (responseCode == WalletConstants.ERROR_CODE_INVALID_PARAMETERS) {
            throw new FileNotFoundException(str);
        } else if (responseCode == 503) {
            throw new zzpe(str);
        } else {
            throw new IOException(str);
        }
    }

    public final void close() {
        HttpURLConnection httpURLConnection = this.zzatk;
        try {
            if (this.zzatl != null) {
                this.zzatl.close();
            }
        } catch (IOException e) {
            String str = "HttpUrlConnectionNetworkClient: Error when closing http input stream: ";
            String valueOf = String.valueOf(e.getMessage());
            zzdi.zza(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), e);
        }
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }
}
