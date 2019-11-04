package com.google.android.gms.analytics;

import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import com.google.android.gms.analytics.ecommerce.Product;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.gtm.zzaa;
import com.google.android.gms.internal.gtm.zzab;
import com.google.android.gms.internal.gtm.zzac;
import com.google.android.gms.internal.gtm.zzam;
import com.google.android.gms.internal.gtm.zzao;
import com.google.android.gms.internal.gtm.zzap;
import com.google.android.gms.internal.gtm.zzas;
import com.google.android.gms.internal.gtm.zzcd;
import com.google.android.gms.internal.gtm.zzcz;
import com.google.android.gms.internal.gtm.zzq;
import com.google.android.gms.internal.gtm.zzr;
import com.google.android.gms.internal.gtm.zzs;
import com.google.android.gms.internal.gtm.zzt;
import com.google.android.gms.internal.gtm.zzu;
import com.google.android.gms.internal.gtm.zzv;
import com.google.android.gms.internal.gtm.zzw;
import com.google.android.gms.internal.gtm.zzx;
import com.google.android.gms.internal.gtm.zzy;
import com.google.android.gms.internal.gtm.zzz;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public final class zzb extends zzam implements zzo {
    private static DecimalFormat zzrf;
    private final zzap zzrb;
    private final String zzrg;
    private final Uri zzrh;

    public zzb(zzap zzap, String str) {
        this(zzap, str, true, false);
    }

    private zzb(zzap zzap, String str, boolean z, boolean z2) {
        super(zzap);
        Preconditions.checkNotEmpty(str);
        this.zzrb = zzap;
        this.zzrg = str;
        this.zzrh = zzb(this.zzrg);
    }

    static Uri zzb(String str) {
        Preconditions.checkNotEmpty(str);
        Builder builder = new Builder();
        builder.scheme("uri");
        builder.authority("google-analytics.com");
        builder.path(str);
        return builder.build();
    }

    public final Uri zzae() {
        return this.zzrh;
    }

    public final void zzb(zzg zzg) {
        Preconditions.checkNotNull(zzg);
        Preconditions.checkArgument(zzg.zzan(), "Can't deliver not submitted measurement");
        Preconditions.checkNotMainThread("deliver should be called on worker thread");
        zzg zzai = zzg.zzai();
        zzz zzz = (zzz) zzai.zzb(zzz.class);
        if (TextUtils.isEmpty(zzz.zzbs())) {
            zzco().zza(zzc(zzai), "Ignoring measurement without type");
        } else if (TextUtils.isEmpty(zzz.zzbt())) {
            zzco().zza(zzc(zzai), "Ignoring measurement without client id");
        } else if (!this.zzrb.zzde().getAppOptOut()) {
            double zzbz = zzz.zzbz();
            if (zzcz.zza(zzbz, zzz.zzbt())) {
                zzb("Sampling enabled. Hit sampled out. sampling rate", Double.valueOf(zzbz));
                return;
            }
            Map zzc = zzc(zzai);
            zzc.put("v", "1");
            zzc.put("_v", zzao.zzwe);
            zzc.put("tid", this.zzrg);
            if (this.zzrb.zzde().isDryRunEnabled()) {
                StringBuilder stringBuilder = new StringBuilder();
                for (Entry entry : zzc.entrySet()) {
                    if (stringBuilder.length() != 0) {
                        stringBuilder.append(", ");
                    }
                    stringBuilder.append((String) entry.getKey());
                    stringBuilder.append("=");
                    stringBuilder.append((String) entry.getValue());
                }
                zzc("Dry run is enabled. GoogleAnalytics would have sent", stringBuilder.toString());
                return;
            }
            Map hashMap = new HashMap();
            zzcz.zzb(hashMap, "uid", zzz.zzbu());
            zzq zzq = (zzq) zzg.zza(zzq.class);
            if (zzq != null) {
                zzcz.zzb(hashMap, "an", zzq.zzaz());
                zzcz.zzb(hashMap, "aid", zzq.zzbb());
                zzcz.zzb(hashMap, "av", zzq.zzba());
                zzcz.zzb(hashMap, "aiid", zzq.zzbc());
            }
            zzas zzas = new zzas(0, zzz.zzbt(), this.zzrg, TextUtils.isEmpty(zzz.zzbv()) ^ 1, 0, hashMap);
            zzc.put("_s", String.valueOf(zzcs().zza(zzas)));
            zzcs().zza(new zzcd(zzco(), zzc, zzg.zzal(), true));
        }
    }

    @VisibleForTesting
    private static Map<String, String> zzc(zzg zzg) {
        String str;
        Map hashMap = new HashMap();
        zzu zzu = (zzu) zzg.zza(zzu.class);
        if (zzu != null) {
            for (Entry entry : zzu.zzbm().entrySet()) {
                Boolean value = entry.getValue();
                Object obj = null;
                if (value != null) {
                    if (value instanceof String) {
                        str = (String) value;
                        if (!TextUtils.isEmpty(str)) {
                            obj = str;
                        }
                    } else if (value instanceof Double) {
                        Double d = (Double) value;
                        if (d.doubleValue() != 0.0d) {
                            obj = zza(d.doubleValue());
                        }
                    } else if (!(value instanceof Boolean)) {
                        obj = String.valueOf(value);
                    } else if (value != Boolean.FALSE) {
                        obj = "1";
                    }
                }
                if (obj != null) {
                    hashMap.put((String) entry.getKey(), obj);
                }
            }
        }
        zzz zzz = (zzz) zzg.zza(zzz.class);
        if (zzz != null) {
            zza(hashMap, "t", zzz.zzbs());
            zza(hashMap, "cid", zzz.zzbt());
            zza(hashMap, "uid", zzz.zzbu());
            zza(hashMap, "sc", zzz.zzbx());
            zza(hashMap, "sf", zzz.zzbz());
            zza(hashMap, "ni", zzz.zzby());
            zza(hashMap, "adid", zzz.zzbv());
            zza(hashMap, "ate", zzz.zzbw());
        }
        zzaa zzaa = (zzaa) zzg.zza(zzaa.class);
        if (zzaa != null) {
            zza(hashMap, "cd", zzaa.zzca());
            zza(hashMap, "a", (double) zzaa.zzcb());
            zza(hashMap, "dr", zzaa.zzcc());
        }
        zzx zzx = (zzx) zzg.zza(zzx.class);
        if (zzx != null) {
            zza(hashMap, "ec", zzx.zzbr());
            zza(hashMap, "ea", zzx.getAction());
            zza(hashMap, "el", zzx.getLabel());
            zza(hashMap, "ev", (double) zzx.getValue());
        }
        zzr zzr = (zzr) zzg.zza(zzr.class);
        if (zzr != null) {
            zza(hashMap, "cn", zzr.getName());
            zza(hashMap, "cs", zzr.getSource());
            zza(hashMap, "cm", zzr.zzbd());
            zza(hashMap, "ck", zzr.zzbe());
            zza(hashMap, "cc", zzr.zzbf());
            zza(hashMap, "ci", zzr.getId());
            zza(hashMap, "anid", zzr.zzbg());
            zza(hashMap, "gclid", zzr.zzbh());
            zza(hashMap, "dclid", zzr.zzbi());
            zza(hashMap, "aclid", zzr.zzbj());
        }
        zzy zzy = (zzy) zzg.zza(zzy.class);
        if (zzy != null) {
            zza(hashMap, "exd", zzy.zzuq);
            zza(hashMap, "exf", zzy.zzur);
        }
        zzab zzab = (zzab) zzg.zza(zzab.class);
        if (zzab != null) {
            zza(hashMap, "sn", zzab.zzvh);
            zza(hashMap, "sa", zzab.zzvi);
            zza(hashMap, "st", zzab.zzvj);
        }
        zzac zzac = (zzac) zzg.zza(zzac.class);
        if (zzac != null) {
            zza(hashMap, "utv", zzac.zzvk);
            zza(hashMap, "utt", (double) zzac.zzvl);
            zza(hashMap, "utc", zzac.mCategory);
            zza(hashMap, "utl", zzac.zzvm);
        }
        zzs zzs = (zzs) zzg.zza(zzs.class);
        if (zzs != null) {
            for (Entry entry2 : zzs.zzbk().entrySet()) {
                str = zzd.zze(((Integer) entry2.getKey()).intValue());
                if (!TextUtils.isEmpty(str)) {
                    hashMap.put(str, (String) entry2.getValue());
                }
            }
        }
        zzt zzt = (zzt) zzg.zza(zzt.class);
        if (zzt != null) {
            for (Entry entry22 : zzt.zzbl().entrySet()) {
                str = zzd.zzg(((Integer) entry22.getKey()).intValue());
                if (!TextUtils.isEmpty(str)) {
                    hashMap.put(str, zza(((Double) entry22.getValue()).doubleValue()));
                }
            }
        }
        zzw zzw = (zzw) zzg.zza(zzw.class);
        if (zzw != null) {
            ProductAction zzbn = zzw.zzbn();
            if (zzbn != null) {
                for (Entry entry3 : zzbn.build().entrySet()) {
                    if (((String) entry3.getKey()).startsWith("&")) {
                        hashMap.put(((String) entry3.getKey()).substring(1), (String) entry3.getValue());
                    } else {
                        hashMap.put((String) entry3.getKey(), (String) entry3.getValue());
                    }
                }
            }
            int i = 1;
            for (Promotion zzn : zzw.zzbq()) {
                hashMap.putAll(zzn.zzn(zzd.zzk(i)));
                i++;
            }
            i = 1;
            for (Product zzn2 : zzw.zzbo()) {
                hashMap.putAll(zzn2.zzn(zzd.zzi(i)));
                i++;
            }
            int i2 = 1;
            for (Entry entry32 : zzw.zzbp().entrySet()) {
                List<Product> list = (List) entry32.getValue();
                String zzn3 = zzd.zzn(i2);
                int i3 = 1;
                for (Product product : list) {
                    String valueOf = String.valueOf(zzn3);
                    String valueOf2 = String.valueOf(zzd.zzl(i3));
                    hashMap.putAll(product.zzn(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf)));
                    i3++;
                }
                if (!TextUtils.isEmpty((CharSequence) entry32.getKey())) {
                    String valueOf3 = String.valueOf(zzn3);
                    zzn3 = "nm";
                    hashMap.put(zzn3.length() != 0 ? valueOf3.concat(zzn3) : new String(valueOf3), (String) entry32.getKey());
                }
                i2++;
            }
        }
        zzv zzv = (zzv) zzg.zza(zzv.class);
        if (zzv != null) {
            zza(hashMap, "ul", zzv.getLanguage());
            zza(hashMap, "sd", (double) zzv.zzuk);
            zza(hashMap, "sr", zzv.zzul, zzv.zzum);
            zza(hashMap, "vp", zzv.zzun, zzv.zzuo);
        }
        zzq zzq = (zzq) zzg.zza(zzq.class);
        if (zzq != null) {
            zza(hashMap, "an", zzq.zzaz());
            zza(hashMap, "aid", zzq.zzbb());
            zza(hashMap, "aiid", zzq.zzbc());
            zza(hashMap, "av", zzq.zzba());
        }
        return hashMap;
    }

    private static void zza(Map<String, String> map, String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            map.put(str, str2);
        }
    }

    private static String zza(double d) {
        if (zzrf == null) {
            zzrf = new DecimalFormat("0.######");
        }
        return zzrf.format(d);
    }

    private static void zza(Map<String, String> map, String str, double d) {
        if (d != 0.0d) {
            map.put(str, zza(d));
        }
    }

    private static void zza(Map<String, String> map, String str, boolean z) {
        if (z) {
            map.put(str, "1");
        }
    }

    private static void zza(Map<String, String> map, String str, int i, int i2) {
        if (i > 0 && i2 > 0) {
            StringBuilder stringBuilder = new StringBuilder(23);
            stringBuilder.append(i);
            stringBuilder.append("x");
            stringBuilder.append(i2);
            map.put(str, stringBuilder.toString());
        }
    }
}
