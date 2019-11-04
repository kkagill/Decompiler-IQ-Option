package com.google.android.gms.tagmanager;

import java.net.HttpURLConnection;
import java.net.URL;

final class zzfv implements zzfx {
    zzfv() {
    }

    public final HttpURLConnection zzc(URL url) {
        return (HttpURLConnection) url.openConnection();
    }
}
