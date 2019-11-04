package com.google.android.gms.internal.clearcut;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.clearcut.ClearcutLogger.zza;
import com.google.android.gms.clearcut.zze;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.clearcut.zzgw.zza.zzb;
import com.google.android.gms.phenotype.Phenotype;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public final class zzp implements zza {
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private static final zzao zzaq;
    private static final zzao zzar;
    private static final ConcurrentHashMap<String, zzae<zzgw.zza>> zzas = new ConcurrentHashMap();
    private static final HashMap<String, zzae<String>> zzat = new HashMap();
    @VisibleForTesting
    private static Boolean zzau = null;
    @VisibleForTesting
    private static Long zzav = null;
    @VisibleForTesting
    private static final zzae<Boolean> zzaw = zzaq.zzc("enable_log_sampling_rules", false);
    private final Context zzh;

    static {
        String str = "com.google.android.gms.clearcut.public";
        zzaq = new zzao(Phenotype.getContentProviderUri(str)).zzc("gms:playlog:service:samplingrules_").zzd("LogSamplingRules__");
        zzar = new zzao(Phenotype.getContentProviderUri(str)).zzc("gms:playlog:service:sampling_").zzd("LogSampling__");
    }

    public zzp(Context context) {
        this.zzh = context;
        context = this.zzh;
        if (context != null) {
            zzae.maybeInit(context);
        }
    }

    @VisibleForTesting
    private static long zza(String str, long j) {
        if (str == null || str.isEmpty()) {
            return zzk.zza(ByteBuffer.allocate(8).putLong(j).array());
        }
        byte[] bytes = str.getBytes(UTF_8);
        ByteBuffer allocate = ByteBuffer.allocate(bytes.length + 8);
        allocate.put(bytes);
        allocate.putLong(j);
        return zzk.zza(allocate.array());
    }

    @VisibleForTesting
    private static zzb zza(String str) {
        if (str == null) {
            return null;
        }
        String substring;
        int indexOf = str.indexOf(44);
        if (indexOf >= 0) {
            substring = str.substring(0, indexOf);
            indexOf++;
        } else {
            substring = "";
            indexOf = 0;
        }
        int indexOf2 = str.indexOf(47, indexOf);
        String str2 = "LogSamplerImpl";
        if (indexOf2 <= 0) {
            String str3 = "Failed to parse the rule: ";
            str = String.valueOf(str);
            Log.e(str2, str.length() != 0 ? str3.concat(str) : new String(str3));
            return null;
        }
        try {
            long parseLong = Long.parseLong(str.substring(indexOf, indexOf2));
            long parseLong2 = Long.parseLong(str.substring(indexOf2 + 1));
            if (parseLong >= 0 && parseLong2 >= 0) {
                return (zzb) zzb.zzfz().zzn(substring).zzr(parseLong).zzs(parseLong2).zzbh();
            }
            StringBuilder stringBuilder = new StringBuilder(72);
            stringBuilder.append("negative values not supported: ");
            stringBuilder.append(parseLong);
            stringBuilder.append("/");
            stringBuilder.append(parseLong2);
            Log.e(str2, stringBuilder.toString());
            return null;
        } catch (NumberFormatException e) {
            substring = "parseLong() failed while parsing: ";
            str = String.valueOf(str);
            Log.e(str2, str.length() != 0 ? substring.concat(str) : new String(substring), e);
            return null;
        }
    }

    @VisibleForTesting
    private static boolean zzb(long j, long j2, long j3) {
        if (j2 >= 0 && j3 > 0) {
            if ((j >= 0 ? j % j3 : (((Long.MAX_VALUE % j3) + 1) + ((j & Long.MAX_VALUE) % j3)) % j3) >= j2) {
                return false;
            }
        }
        return true;
    }

    private static boolean zzc(Context context) {
        if (zzau == null) {
            zzau = Boolean.valueOf(Wrappers.packageManager(context).checkCallingOrSelfPermission("com.google.android.providers.gsf.permission.READ_GSERVICES") == 0);
        }
        return zzau.booleanValue();
    }

    @VisibleForTesting
    private static long zzd(Context context) {
        if (zzav == null) {
            long j = 0;
            if (context == null) {
                return 0;
            }
            if (zzc(context)) {
                j = zzy.getLong(context.getContentResolver(), "android_id", 0);
            }
            zzav = Long.valueOf(j);
        }
        return zzav.longValue();
    }

    public final boolean zza(zze zze) {
        Object obj = zze.zzag.zzj;
        int i = zze.zzag.zzk;
        int i2 = zze.zzaa != null ? zze.zzaa.zzbji : 0;
        String str = null;
        if (((Boolean) zzaw.get()).booleanValue()) {
            if (obj == null || obj.isEmpty()) {
                obj = i >= 0 ? String.valueOf(i) : null;
            }
            if (obj != null) {
                List emptyList;
                if (this.zzh == null) {
                    emptyList = Collections.emptyList();
                } else {
                    zzae zzae = (zzae) zzas.get(obj);
                    if (zzae == null) {
                        zzae = zzaq.zza(obj, zzgw.zza.zzft(), zzq.zzax);
                        zzae zzae2 = (zzae) zzas.putIfAbsent(obj, zzae);
                        if (zzae2 != null) {
                            zzae = zzae2;
                        }
                    }
                    emptyList = ((zzgw.zza) zzae.get()).zzfs();
                }
                for (zzb zzb : emptyList) {
                    if ((!zzb.zzfv() || zzb.getEventCode() == 0 || zzb.getEventCode() == i2) && !zzb(zza(zzb.zzfw(), zzd(this.zzh)), zzb.zzfx(), zzb.zzfy())) {
                        return false;
                    }
                }
            }
        } else {
            if (obj == null || obj.isEmpty()) {
                obj = i >= 0 ? String.valueOf(i) : null;
            }
            if (obj != null) {
                Context context = this.zzh;
                if (context != null && zzc(context)) {
                    zzae zzae3 = (zzae) zzat.get(obj);
                    if (zzae3 == null) {
                        zzae3 = zzar.zza(obj, null);
                        zzat.put(obj, zzae3);
                    }
                    str = (String) zzae3.get();
                }
                zzb zza = zza(str);
                if (zza != null) {
                    return zzb(zza(zza.zzfw(), zzd(this.zzh)), zza.zzfx(), zza.zzfy());
                }
            }
        }
        return true;
    }
}
