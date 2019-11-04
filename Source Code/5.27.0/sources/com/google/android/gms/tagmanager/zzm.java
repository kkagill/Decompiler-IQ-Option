package com.google.android.gms.tagmanager;

import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.gtm.zzb;
import com.google.android.gms.internal.gtm.zzl;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class zzm extends zzgh {
    private static final String ID = com.google.android.gms.internal.gtm.zza.ARBITRARY_PIXEL.toString();
    private static final String URL = zzb.URL.toString();
    private static final String zzadw = zzb.ADDITIONAL_PARAMS.toString();
    private static final String zzadx = zzb.UNREPEATABLE.toString();
    private static final String zzady;
    private static final Set<String> zzadz = new HashSet();
    private final zza zzaea;
    private final Context zzrm;

    public interface zza {
        zzbx zzgx();
    }

    public zzm(Context context) {
        this(context, new zzn(context));
    }

    @VisibleForTesting
    private zzm(Context context, zza zza) {
        super(ID, URL);
        this.zzaea = zza;
        this.zzrm = context;
    }

    public final void zzd(Map<String, zzl> map) {
        String zzc = map.get(zzadx) != null ? zzgj.zzc((zzl) map.get(zzadx)) : null;
        if (zzc == null || !zzak(zzc)) {
            String str;
            Builder buildUpon = Uri.parse(zzgj.zzc((zzl) map.get(URL))).buildUpon();
            zzl zzl = (zzl) map.get(zzadw);
            if (zzl != null) {
                Object zzh = zzgj.zzh(zzl);
                if (zzh instanceof List) {
                    for (Object next : (List) zzh) {
                        if (next instanceof Map) {
                            for (Entry entry : ((Map) next).entrySet()) {
                                buildUpon.appendQueryParameter(entry.getKey().toString(), entry.getValue().toString());
                            }
                        } else {
                            str = "ArbitraryPixel: additional params contains non-map: not sending partial hit: ";
                            zzc = String.valueOf(buildUpon.build().toString());
                            zzdi.zzav(zzc.length() != 0 ? str.concat(zzc) : new String(str));
                            return;
                        }
                    }
                }
                str = "ArbitraryPixel: additional params not a list: not sending partial hit: ";
                zzc = String.valueOf(buildUpon.build().toString());
                zzdi.zzav(zzc.length() != 0 ? str.concat(zzc) : new String(str));
                return;
            }
            str = buildUpon.build().toString();
            this.zzaea.zzgx().zzay(str);
            String str2 = "ArbitraryPixel: url = ";
            str = String.valueOf(str);
            zzdi.zzab(str.length() != 0 ? str2.concat(str) : new String(str2));
            if (zzc != null) {
                synchronized (zzm.class) {
                    zzadz.add(zzc);
                    zzft.zza(this.zzrm, zzady, zzc, "true");
                }
            }
        }
    }

    private final synchronized boolean zzak(String str) {
        if (zzadz.contains(str)) {
            return true;
        }
        if (!this.zzrm.getSharedPreferences(zzady, 0).contains(str)) {
            return false;
        }
        zzadz.add(str);
        return true;
    }

    static {
        String str = ID;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 17);
        stringBuilder.append("gtm_");
        stringBuilder.append(str);
        stringBuilder.append("_unrepeatable");
        zzady = stringBuilder.toString();
    }
}
