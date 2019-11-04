package com.google.android.gms.measurement.internal;

import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Size;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzbs.zzc;
import com.google.android.gms.internal.measurement.zzbs.zzd;
import com.google.android.gms.internal.measurement.zzbs.zze;
import com.google.android.gms.internal.measurement.zzbs.zzf;
import com.google.android.gms.internal.measurement.zzbs.zzf.zza;
import com.google.android.gms.internal.measurement.zzbs.zzg;
import com.google.android.gms.internal.measurement.zzbs.zzh;
import com.google.android.gms.internal.measurement.zzbs.zzk;
import com.google.android.gms.internal.measurement.zzey;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

final class zzhp extends zzjh {
    public zzhp(zzjg zzjg) {
        super(zzjg);
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean zzbk() {
        return false;
    }

    @WorkerThread
    public final byte[] zzb(@NonNull zzai zzai, @Size(min = 1) String str) {
        byte[] bArr;
        zzai zzai2 = zzai;
        String str2 = str;
        String str3 = "_r";
        zzo();
        this.zzj.zzl();
        Preconditions.checkNotNull(zzai);
        Preconditions.checkNotEmpty(str);
        int i = 0;
        if (zzad().zze(str2, zzak.zzio)) {
            if (!"_iap".equals(zzai2.name)) {
                if (!"_iapx".equals(zzai2.name)) {
                    zzab().zzgr().zza("Generating a payload for this event is not available. package_name, event_name", str2, zzai2.name);
                    return null;
                }
            }
            zza zznj = zzf.zznj();
            zzgy().beginTransaction();
            byte[] bArr2;
            try {
                zzf zzab = zzgy().zzab(str2);
                if (zzab == null) {
                    zzab().zzgr().zza("Log and bundle not available. package_name", str2);
                    bArr2 = new byte[0];
                    return bArr2;
                } else if (zzab.isMeasurementEnabled()) {
                    zzg.zza zzcc = zzg.zzpr().zzp(1).zzcc("android");
                    if (!TextUtils.isEmpty(zzab.zzag())) {
                        zzcc.zzch(zzab.zzag());
                    }
                    if (!TextUtils.isEmpty(zzab.zzan())) {
                        zzcc.zzcg(zzab.zzan());
                    }
                    if (!TextUtils.isEmpty(zzab.zzal())) {
                        zzcc.zzci(zzab.zzal());
                    }
                    if (zzab.zzam() != -2147483648L) {
                        zzcc.zzv((int) zzab.zzam());
                    }
                    zzcc.zzas(zzab.zzao()).zzax(zzab.zzaq());
                    if (!TextUtils.isEmpty(zzab.getGmpAppId())) {
                        zzcc.zzcm(zzab.getGmpAppId());
                    } else if (!TextUtils.isEmpty(zzab.zzah())) {
                        zzcc.zzcq(zzab.zzah());
                    }
                    zzcc.zzau(zzab.zzap());
                    if (this.zzj.isEnabled() && zzs.zzbv() && zzad().zzl(zzcc.zzag())) {
                        zzcc.zzag();
                        if (!TextUtils.isEmpty(null)) {
                            zzcc.zzcp(null);
                        }
                    }
                    Pair zzap = zzac().zzap(zzab.zzag());
                    if (!(!zzab.zzbe() || zzap == null || TextUtils.isEmpty((CharSequence) zzap.first))) {
                        zzcc.zzcj(zzo((String) zzap.first, Long.toString(zzai2.zzfu)));
                        if (zzap.second != null) {
                            zzcc.zzm(((Boolean) zzap.second).booleanValue());
                        }
                    }
                    zzw().zzbi();
                    zzg.zza zzce = zzcc.zzce(Build.MODEL);
                    zzw().zzbi();
                    zzce.zzcd(VERSION.RELEASE).zzt((int) zzw().zzcq()).zzcf(zzw().zzcr());
                    try {
                        zzf zzf;
                        zzg.zza zza;
                        zza zza2;
                        Bundle bundle;
                        zzae zzae;
                        long j;
                        zzcc.zzck(zzo(zzab.getAppInstanceId(), Long.toString(zzai2.zzfu)));
                        if (!TextUtils.isEmpty(zzab.getFirebaseInstanceId())) {
                            zzcc.zzcn(zzab.getFirebaseInstanceId());
                        }
                        String zzag = zzab.zzag();
                        List<zzjp> zzaa = zzgy().zzaa(zzag);
                        for (zzjp zzjp : zzaa) {
                            if ("_lte".equals(zzjp.name)) {
                                break;
                            }
                        }
                        zzjp zzjp2 = null;
                        if (zzjp2 == null || zzjp2.value == null) {
                            zzjp zzjp3 = new zzjp(zzag, "auto", "_lte", zzx().currentTimeMillis(), Long.valueOf(0));
                            zzaa.add(zzjp3);
                            zzgy().zza(zzjp3);
                        }
                        if (zzad().zze(zzag, zzak.zzij)) {
                            zzjo zzgw = zzgw();
                            zzgw.zzab().zzgs().zzao("Checking account type status for ad personalization signals");
                            if (zzgw.zzw().zzcu()) {
                                String zzag2 = zzab.zzag();
                                if (zzab.zzbe() && zzgw.zzgz().zzba(zzag2)) {
                                    zzgw.zzab().zzgr().zzao("Turning off ad personalization due to account type");
                                    Iterator it = zzaa.iterator();
                                    while (it.hasNext()) {
                                        if ("_npa".equals(((zzjp) it.next()).name)) {
                                            it.remove();
                                            break;
                                        }
                                    }
                                    zzaa.add(new zzjp(zzag2, "auto", "_npa", zzgw.zzx().currentTimeMillis(), Long.valueOf(1)));
                                }
                            }
                        }
                        zzk[] zzkArr = new zzk[zzaa.size()];
                        while (i < zzaa.size()) {
                            zzk.zza zzbk = zzk.zzqu().zzdb(((zzjp) zzaa.get(i)).name).zzbk(((zzjp) zzaa.get(i)).zztr);
                            zzgw().zza(zzbk, ((zzjp) zzaa.get(i)).value);
                            zzkArr[i] = (zzk) ((zzey) zzbk.zzug());
                            i++;
                        }
                        zzcc.zzb(Arrays.asList(zzkArr));
                        Bundle zzcv = zzai2.zzfq.zzcv();
                        zzcv.putLong("_c", 1);
                        zzab().zzgr().zzao("Marking in-app purchase as real-time");
                        zzcv.putLong(str3, 1);
                        zzcv.putString("_o", zzai2.origin);
                        if (zzz().zzbr(zzcc.zzag())) {
                            zzz().zza(zzcv, "_dbg", Long.valueOf(1));
                            zzz().zza(zzcv, str3, Long.valueOf(1));
                        }
                        zzae zzc = zzgy().zzc(str2, zzai2.name);
                        if (zzc == null) {
                            zzf = zzab;
                            zza = zzcc;
                            zza2 = zznj;
                            bundle = zzcv;
                            bArr = null;
                            zzae = new zzae(str, zzai2.name, 0, 0, zzai2.zzfu, 0, null, null, null, null);
                            j = 0;
                        } else {
                            zzf = zzab;
                            zza = zzcc;
                            zza2 = zznj;
                            bundle = zzcv;
                            bArr = null;
                            j = zzc.zzfj;
                            zzae = zzc.zzw(zzai2.zzfu);
                        }
                        zzgy().zza(zzae);
                        zzaf zzaf = new zzaf(this.zzj, zzai2.origin, str, zzai2.name, zzai2.zzfu, j, bundle);
                        zzc.zza zzah = zzc.zzmq().zzag(zzaf.timestamp).zzbx(zzaf.name).zzah(zzaf.zzfp);
                        Iterator it2 = zzaf.zzfq.iterator();
                        while (it2.hasNext()) {
                            String str4 = (String) it2.next();
                            zze.zza zzbz = zze.zzng().zzbz(str4);
                            zzgw().zza(zzbz, zzaf.zzfq.get(str4));
                            zzah.zza(zzbz);
                        }
                        zzce = zza;
                        zzce.zza(zzah).zza(zzh.zzpt().zza(zzd.zzms().zzak(zzae.zzfg).zzby(zzai2.name)));
                        zzce.zzc(zzgx().zza(zzf.zzag(), Collections.emptyList(), zzce.zzno()));
                        if (zzah.zzml()) {
                            zzce.zzao(zzah.getTimestampMillis()).zzap(zzah.getTimestampMillis());
                        }
                        long zzak = zzf.zzak();
                        if (zzak != 0) {
                            zzce.zzar(zzak);
                        }
                        long zzaj = zzf.zzaj();
                        if (zzaj != 0) {
                            zzce.zzaq(zzaj);
                        } else if (zzak != 0) {
                            zzce.zzaq(zzak);
                        }
                        zzf.zzau();
                        zzce.zzu((int) zzf.zzar()).zzat(zzad().zzao()).zzan(zzx().currentTimeMillis()).zzn(Boolean.TRUE.booleanValue());
                        zza zza3 = zza2;
                        zza3.zza(zzce);
                        zzf zzf2 = zzf;
                        zzf2.zze(zzce.zznq());
                        zzf2.zzf(zzce.zznr());
                        zzgy().zza(zzf2);
                        zzgy().setTransactionSuccessful();
                        zzgy().endTransaction();
                        try {
                            return zzgw().zzc(((zzf) ((zzey) zza3.zzug())).toByteArray());
                        } catch (IOException e) {
                            zzab().zzgk().zza("Data loss. Failed to bundle and serialize. appId", zzef.zzam(str), e);
                            return bArr;
                        }
                    } catch (SecurityException e2) {
                        zzab().zzgr().zza("app instance id encryption failed", e2.getMessage());
                        bArr2 = new byte[0];
                        zzgy().endTransaction();
                        return bArr2;
                    }
                } else {
                    zzab().zzgr().zza("Log and bundle disabled. package_name", str2);
                    bArr2 = new byte[0];
                    zzgy().endTransaction();
                    return bArr2;
                }
            } catch (SecurityException e22) {
                zzab().zzgr().zza("Resettable device id encryption failed", e22.getMessage());
                bArr2 = new byte[0];
                return bArr2;
            } finally {
                zzgy().endTransaction();
            }
        } else {
            zzab().zzgr().zza("Generating ScionPayload disabled. packageName", str2);
            return new byte[0];
        }
    }

    private static String zzo(String str, String str2) {
        throw new SecurityException("This implementation should not be used.");
    }
}
