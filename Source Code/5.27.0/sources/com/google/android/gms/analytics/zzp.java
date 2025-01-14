package com.google.android.gms.analytics;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzad;
import com.google.android.gms.internal.gtm.zzao;
import com.google.android.gms.internal.gtm.zzas;
import com.google.android.gms.internal.gtm.zzcd;
import com.google.android.gms.internal.gtm.zzcz;
import com.google.android.gms.internal.gtm.zzq;
import java.util.HashMap;
import java.util.Map;

final class zzp implements Runnable {
    private final /* synthetic */ Map zzti;
    private final /* synthetic */ boolean zztj;
    private final /* synthetic */ String zztk;
    private final /* synthetic */ long zztl;
    private final /* synthetic */ boolean zztm;
    private final /* synthetic */ boolean zztn;
    private final /* synthetic */ String zzto;
    private final /* synthetic */ Tracker zztp;

    zzp(Tracker tracker, Map map, boolean z, String str, long j, boolean z2, boolean z3, String str2) {
        this.zztp = tracker;
        this.zzti = map;
        this.zztj = z;
        this.zztk = str;
        this.zztl = j;
        this.zztm = z2;
        this.zztn = z3;
        this.zzto = str2;
    }

    public final void run() {
        if (this.zztp.zztf.zzax()) {
            this.zzti.put("sc", "start");
        }
        Map map = this.zzti;
        GoogleAnalytics zzcr = this.zztp.zzcr();
        Preconditions.checkNotMainThread("getClientId can not be called from the main thread");
        String str = "cid";
        zzcz.zzc(map, str, zzcr.zzab().zzdh().zzeh());
        String str2 = (String) this.zzti.get("sf");
        if (str2 != null) {
            double zza = zzcz.zza(str2, 100.0d);
            if (zzcz.zza(zza, (String) this.zzti.get(str))) {
                this.zztp.zzb("Sampling enabled. Hit sampled out. sample rate", Double.valueOf(zza));
                return;
            }
        }
        zzad zzb = this.zztp.zzcx();
        String str3 = "ate";
        String str4 = "adid";
        if (this.zztj) {
            zzcz.zzb(this.zzti, str3, zzb.zzbw());
            zzcz.zzb(this.zzti, str4, zzb.zzcd());
        } else {
            this.zzti.remove(str3);
            this.zzti.remove(str4);
        }
        zzq zzdv = this.zztp.zzcy().zzdv();
        String str5 = "an";
        zzcz.zzb(this.zzti, str5, zzdv.zzaz());
        String str6 = "av";
        zzcz.zzb(this.zzti, str6, zzdv.zzba());
        String str7 = "aid";
        zzcz.zzb(this.zzti, str7, zzdv.zzbb());
        str3 = "aiid";
        zzcz.zzb(this.zzti, str3, zzdv.zzbc());
        this.zzti.put("v", "1");
        this.zzti.put("_v", zzao.zzwe);
        zzcz.zzb(this.zzti, "ul", this.zztp.zzcz().zzfa().getLanguage());
        zzcz.zzb(this.zzti, "sr", this.zztp.zzcz().zzfb());
        Object obj = (this.zztk.equals("transaction") || this.zztk.equals("item")) ? 1 : null;
        if (obj != null || this.zztp.zzte.zzfm()) {
            long zzag = zzcz.zzag((String) this.zzti.get("ht"));
            if (zzag == 0) {
                zzag = this.zztl;
            }
            long j = zzag;
            if (this.zztm) {
                this.zztp.zzco().zzc("Dry run enabled. Would have sent hit", new zzcd(this.zztp, this.zzti, j, this.zztn));
                return;
            }
            String str8 = (String) this.zzti.get(str);
            map = new HashMap();
            zzcz.zza(map, "uid", this.zzti);
            zzcz.zza(map, str5, this.zzti);
            zzcz.zza(map, str7, this.zzti);
            zzcz.zza(map, str6, this.zzti);
            zzcz.zza(map, str3, this.zzti);
            this.zzti.put("_s", String.valueOf(this.zztp.zzcs().zza(new zzas(0, str8, this.zzto, TextUtils.isEmpty((CharSequence) this.zzti.get(str4)) ^ 1, 0, map))));
            this.zztp.zzcs().zza(new zzcd(this.zztp, this.zzti, j, this.zztn));
            return;
        }
        this.zztp.zzco().zza(this.zzti, "Too many hits sent too quickly, rate limiting invoked");
    }
}
