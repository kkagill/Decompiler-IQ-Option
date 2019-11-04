package com.google.android.gms.tagmanager;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Build.VERSION;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Locale;

final class zzfu implements zzbe {
    private final String zzabp;
    private final zzfx zzalb;
    private final zzfw zzalc;
    private final Context zzrm;

    @VisibleForTesting
    private zzfu(zzfx zzfx, Context context, zzfw zzfw) {
        this.zzalb = zzfx;
        this.zzrm = context.getApplicationContext();
        this.zzalc = zzfw;
        String str = VERSION.RELEASE;
        Locale locale = Locale.getDefault();
        String str2 = null;
        if (!(locale == null || locale.getLanguage() == null || locale.getLanguage().length() == 0)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(locale.getLanguage().toLowerCase());
            if (!(locale.getCountry() == null || locale.getCountry().length() == 0)) {
                stringBuilder.append("-");
                stringBuilder.append(locale.getCountry().toLowerCase());
            }
            str2 = stringBuilder.toString();
        }
        String str3 = Build.MODEL;
        String str4 = Build.ID;
        this.zzabp = String.format("%s/%s (Linux; U; Android %s; %s; %s Build/%s)", new Object[]{"GoogleTagManager", "4.00", str, str2, str3, str4});
    }

    @VisibleForTesting
    zzfu(Context context, zzfw zzfw) {
        this(new zzfv(), context, zzfw);
    }

    public final boolean zzhy() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.zzrm.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            return true;
        }
        zzdi.zzab("...no network connectivity");
        return false;
    }

    public final void zzd(List<zzbw> list) {
        int min = Math.min(list.size(), 40);
        Object obj = 1;
        for (int i = 0; i < min; i++) {
            zzbw zzbw = (zzbw) list.get(i);
            URL zzd = zzd(zzbw);
            if (zzd == null) {
                zzdi.zzac("No destination: discarding hit.");
                this.zzalc.zzb(zzbw);
            } else {
                InputStream inputStream = null;
                HttpURLConnection zzc;
                try {
                    zzc = this.zzalb.zzc(zzd);
                    if (obj != null) {
                        zzdn.zzn(this.zzrm);
                        obj = null;
                    }
                    zzc.setRequestProperty("User-Agent", this.zzabp);
                    int responseCode = zzc.getResponseCode();
                    inputStream = zzc.getInputStream();
                    if (responseCode != 200) {
                        StringBuilder stringBuilder = new StringBuilder(25);
                        stringBuilder.append("Bad response: ");
                        stringBuilder.append(responseCode);
                        zzdi.zzac(stringBuilder.toString());
                        this.zzalc.zzc(zzbw);
                    } else {
                        this.zzalc.zza(zzbw);
                    }
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    zzc.disconnect();
                } catch (IOException e) {
                    String str = "Exception sending hit: ";
                    String valueOf = String.valueOf(e.getClass().getSimpleName());
                    zzdi.zzac(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                    zzdi.zzac(e.getMessage());
                    this.zzalc.zzc(zzbw);
                } catch (Throwable th) {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    zzc.disconnect();
                }
            }
        }
    }

    @VisibleForTesting
    private static URL zzd(zzbw zzbw) {
        try {
            return new URL(zzbw.zzij());
        } catch (MalformedURLException unused) {
            zzdi.zzav("Error trying to parse the GTM url.");
            return null;
        }
    }
}
