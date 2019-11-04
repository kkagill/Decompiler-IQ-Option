package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.measurement.zzbk;
import com.google.android.gms.internal.measurement.zzbk.zzb;
import com.google.android.gms.internal.measurement.zzbk.zzd;
import com.google.android.gms.internal.measurement.zzbs;
import com.google.android.gms.internal.measurement.zzbs.zzc;
import com.google.android.gms.internal.measurement.zzbs.zze;
import com.google.android.gms.internal.measurement.zzbs.zzf;
import com.google.android.gms.internal.measurement.zzbs.zzg;
import com.google.android.gms.internal.measurement.zzbs.zzi;
import com.google.android.gms.internal.measurement.zzbs.zzj;
import com.google.android.gms.internal.measurement.zzbs.zzk;
import com.google.android.gms.internal.measurement.zzbs.zzk.zza;
import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import com.iqoption.dto.event.OtnEmissionExecuted;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public final class zzjo extends zzjh {
    zzjo(zzjg zzjg) {
        super(zzjg);
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean zzbk() {
        return false;
    }

    /* Access modifiers changed, original: final */
    public final void zza(zza zza, Object obj) {
        Preconditions.checkNotNull(obj);
        zza.zzqz().zzra().zzrb();
        if (obj instanceof String) {
            zza.zzdc((String) obj);
        } else if (obj instanceof Long) {
            zza.zzbl(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            zza.zzc(((Double) obj).doubleValue());
        } else {
            zzab().zzgk().zza("Ignoring invalid (type) user attribute value", obj);
        }
    }

    /* Access modifiers changed, original: final */
    public final void zza(zze.zza zza, Object obj) {
        Preconditions.checkNotNull(obj);
        zza.zzmu().zzmv().zzmw();
        if (obj instanceof String) {
            zza.zzca((String) obj);
        } else if (obj instanceof Long) {
            zza.zzam(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            zza.zza(((Double) obj).doubleValue());
        } else {
            zzab().zzgk().zza("Ignoring invalid (type) event param value", obj);
        }
    }

    static zze zza(zzc zzc, String str) {
        for (zze zze : zzc.zzmj()) {
            if (zze.getName().equals(str)) {
                return zze;
            }
        }
        return null;
    }

    static Object zzb(zzc zzc, String str) {
        zze zza = zza(zzc, str);
        if (zza != null) {
            if (zza.zzmx()) {
                return zza.zzmy();
            }
            if (zza.zzna()) {
                return Long.valueOf(zza.zznb());
            }
            if (zza.zznd()) {
                return Double.valueOf(zza.zzne());
            }
        }
        return null;
    }

    static void zza(zzc.zza zza, String str, Object obj) {
        List zzmj = zza.zzmj();
        int i = 0;
        while (i < zzmj.size()) {
            if (str.equals(((zze) zzmj.get(i)).getName())) {
                break;
            }
            i++;
        }
        i = -1;
        zze.zza zzbz = zze.zzng().zzbz(str);
        if (obj instanceof Long) {
            zzbz.zzam(((Long) obj).longValue());
        } else if (obj instanceof String) {
            zzbz.zzca((String) obj);
        } else if (obj instanceof Double) {
            zzbz.zza(((Double) obj).doubleValue());
        }
        if (i >= 0) {
            zza.zza(i, zzbz);
        } else {
            zza.zza(zzbz);
        }
    }

    /* Access modifiers changed, original: final */
    public final String zza(zzf zzf) {
        if (zzf == null) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\nbatch {\n");
        Iterator it = zzf.zzni().iterator();
        while (true) {
            String str = "}\n";
            if (it.hasNext()) {
                zzg zzg = (zzg) it.next();
                if (zzg != null) {
                    zza(stringBuilder, 1);
                    stringBuilder.append("bundle {\n");
                    if (zzg.zznx()) {
                        zza(stringBuilder, 1, "protocol_version", Integer.valueOf(zzg.zzny()));
                    }
                    zza(stringBuilder, 1, "platform", zzg.zzom());
                    if (zzg.zzoq()) {
                        zza(stringBuilder, 1, "gmp_version", Long.valueOf(zzg.zzao()));
                    }
                    if (zzg.zzor()) {
                        zza(stringBuilder, 1, "uploading_gmp_version", Long.valueOf(zzg.zzos()));
                    }
                    if (zzg.zzpq()) {
                        zza(stringBuilder, 1, "dynamite_version", Long.valueOf(zzg.zzaq()));
                    }
                    if (zzg.zzpi()) {
                        zza(stringBuilder, 1, "config_version", Long.valueOf(zzg.zzpj()));
                    }
                    zza(stringBuilder, 1, "gmp_app_id", zzg.getGmpAppId());
                    zza(stringBuilder, 1, "admob_app_id", zzg.zzpp());
                    zza(stringBuilder, 1, "app_id", zzg.zzag());
                    zza(stringBuilder, 1, "app_version", zzg.zzal());
                    if (zzg.zzpf()) {
                        zza(stringBuilder, 1, "app_version_major", Integer.valueOf(zzg.zzpg()));
                    }
                    zza(stringBuilder, 1, "firebase_instance_id", zzg.getFirebaseInstanceId());
                    if (zzg.zzow()) {
                        zza(stringBuilder, 1, "dev_cert_hash", Long.valueOf(zzg.zzap()));
                    }
                    zza(stringBuilder, 1, "app_store", zzg.zzan());
                    if (zzg.zzoc()) {
                        zza(stringBuilder, 1, "upload_timestamp_millis", Long.valueOf(zzg.zzod()));
                    }
                    if (zzg.zzoe()) {
                        zza(stringBuilder, 1, "start_timestamp_millis", Long.valueOf(zzg.zznq()));
                    }
                    if (zzg.zzof()) {
                        zza(stringBuilder, 1, "end_timestamp_millis", Long.valueOf(zzg.zznr()));
                    }
                    if (zzg.zzog()) {
                        zza(stringBuilder, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(zzg.zzoh()));
                    }
                    if (zzg.zzoj()) {
                        zza(stringBuilder, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(zzg.zzok()));
                    }
                    zza(stringBuilder, 1, "app_instance_id", zzg.getAppInstanceId());
                    zza(stringBuilder, 1, "resettable_device_id", zzg.zzot());
                    zza(stringBuilder, 1, "device_id", zzg.zzph());
                    zza(stringBuilder, 1, "ds_id", zzg.zzpl());
                    if (zzg.zzou()) {
                        zza(stringBuilder, 1, "limited_ad_tracking", Boolean.valueOf(zzg.zzov()));
                    }
                    zza(stringBuilder, 1, "os_version", zzg.getOsVersion());
                    zza(stringBuilder, 1, "device_model", zzg.zzon());
                    zza(stringBuilder, 1, "user_default_language", zzg.zzcr());
                    if (zzg.zzoo()) {
                        zza(stringBuilder, 1, "time_zone_offset_minutes", Integer.valueOf(zzg.zzop()));
                    }
                    if (zzg.zzox()) {
                        zza(stringBuilder, 1, "bundle_sequential_index", Integer.valueOf(zzg.zzoy()));
                    }
                    if (zzg.zzpb()) {
                        zza(stringBuilder, 1, "service_upload", Boolean.valueOf(zzg.zzpc()));
                    }
                    zza(stringBuilder, 1, "health_monitor", zzg.zzoz());
                    if (zzg.zzpk() && zzg.zzbd() != 0) {
                        zza(stringBuilder, 1, "android_id", Long.valueOf(zzg.zzbd()));
                    }
                    if (zzg.zzpn()) {
                        zza(stringBuilder, 1, "retry_counter", Integer.valueOf(zzg.zzpo()));
                    }
                    List<zzk> zzno = zzg.zzno();
                    String str2 = "double_value";
                    String str3 = "int_value";
                    String str4 = "string_value";
                    String str5 = ConditionalUserProperty.NAME;
                    int i = 2;
                    if (zzno != null) {
                        for (zzk zzk : zzno) {
                            if (zzk != null) {
                                zza(stringBuilder, 2);
                                stringBuilder.append("user_property {\n");
                                zza(stringBuilder, 2, "set_timestamp_millis", zzk.zzqs() ? Long.valueOf(zzk.zzqt()) : null);
                                zza(stringBuilder, 2, str5, zzy().zzal(zzk.getName()));
                                zza(stringBuilder, 2, str4, zzk.zzmy());
                                zza(stringBuilder, 2, str3, zzk.zzna() ? Long.valueOf(zzk.zznb()) : null);
                                zza(stringBuilder, 2, str2, zzk.zznd() ? Double.valueOf(zzk.zzne()) : null);
                                zza(stringBuilder, 2);
                                stringBuilder.append(str);
                            }
                        }
                    }
                    List<zzbs.zza> zzpd = zzg.zzpd();
                    String zzag = zzg.zzag();
                    if (zzpd != null) {
                        for (zzbs.zza zza : zzpd) {
                            if (zza != null) {
                                zza(stringBuilder, i);
                                stringBuilder.append("audience_membership {\n");
                                if (zza.zzly()) {
                                    zza(stringBuilder, i, "audience_id", Integer.valueOf(zza.zzlz()));
                                }
                                if (zza.zzma()) {
                                    zza(stringBuilder, i, "new_audience", Boolean.valueOf(zza.zzmb()));
                                }
                                StringBuilder stringBuilder2 = stringBuilder;
                                String str6 = zzag;
                                zza(stringBuilder2, 2, "current_data", zza.zzlv(), str6);
                                zza(stringBuilder2, 2, "previous_data", zza.zzlx(), str6);
                                zza(stringBuilder, 2);
                                stringBuilder.append(str);
                                i = 2;
                            }
                        }
                    }
                    List<zzc> zznl = zzg.zznl();
                    if (zznl != null) {
                        for (zzc zzc : zznl) {
                            if (zzc != null) {
                                zza(stringBuilder, 2);
                                stringBuilder.append("event {\n");
                                zza(stringBuilder, 2, str5, zzy().zzaj(zzc.getName()));
                                if (zzc.zzml()) {
                                    zza(stringBuilder, 2, "timestamp_millis", Long.valueOf(zzc.getTimestampMillis()));
                                }
                                if (zzc.zzmo()) {
                                    zza(stringBuilder, 2, "previous_timestamp_millis", Long.valueOf(zzc.zzmm()));
                                }
                                if (zzc.zzmp()) {
                                    zza(stringBuilder, 2, OtnEmissionExecuted.COUNT, Integer.valueOf(zzc.getCount()));
                                }
                                if (zzc.zzmk() != 0) {
                                    List<zze> zzmj = zzc.zzmj();
                                    if (zzmj != null) {
                                        for (zze zze : zzmj) {
                                            if (zze != null) {
                                                zza(stringBuilder, 3);
                                                stringBuilder.append("param {\n");
                                                zza(stringBuilder, 3, str5, zzy().zzak(zze.getName()));
                                                zza(stringBuilder, 3, str4, zze.zzmy());
                                                zza(stringBuilder, 3, str3, zze.zzna() ? Long.valueOf(zze.zznb()) : null);
                                                zza(stringBuilder, 3, str2, zze.zznd() ? Double.valueOf(zze.zzne()) : null);
                                                zza(stringBuilder, 3);
                                                stringBuilder.append(str);
                                            }
                                        }
                                    }
                                }
                                zza(stringBuilder, 2);
                                stringBuilder.append(str);
                            }
                        }
                    }
                    zza(stringBuilder, 1);
                    stringBuilder.append(str);
                }
            } else {
                stringBuilder.append(str);
                return stringBuilder.toString();
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final String zza(zzbk.zza zza) {
        if (zza == null) {
            return "null";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\nevent_filter {\n");
        if (zza.zzkb()) {
            zza(stringBuilder, 0, "filter_id", Integer.valueOf(zza.getId()));
        }
        zza(stringBuilder, 0, "event_name", zzy().zzaj(zza.zzjz()));
        Object zza2 = zza(zza.zzkf(), zza.zzkg(), zza.zzki());
        if (!zza2.isEmpty()) {
            zza(stringBuilder, 0, "filter_type", zza2);
        }
        zza(stringBuilder, 1, "event_count_filter", zza.zzke());
        stringBuilder.append("  filters {\n");
        for (zzb zza3 : zza.zzkc()) {
            zza(stringBuilder, 2, zza3);
        }
        zza(stringBuilder, 1);
        stringBuilder.append("}\n}\n");
        return stringBuilder.toString();
    }

    /* Access modifiers changed, original: final */
    public final String zza(zzd zzd) {
        if (zzd == null) {
            return "null";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\nproperty_filter {\n");
        if (zzd.zzkb()) {
            zza(stringBuilder, 0, "filter_id", Integer.valueOf(zzd.getId()));
        }
        zza(stringBuilder, 0, "property_name", zzy().zzal(zzd.getPropertyName()));
        Object zza = zza(zzd.zzkf(), zzd.zzkg(), zzd.zzki());
        if (!zza.isEmpty()) {
            zza(stringBuilder, 0, "filter_type", zza);
        }
        zza(stringBuilder, 1, zzd.zzli());
        stringBuilder.append("}\n");
        return stringBuilder.toString();
    }

    private static String zza(boolean z, boolean z2, boolean z3) {
        StringBuilder stringBuilder = new StringBuilder();
        if (z) {
            stringBuilder.append("Dynamic ");
        }
        if (z2) {
            stringBuilder.append("Sequence ");
        }
        if (z3) {
            stringBuilder.append("Session-Scoped ");
        }
        return stringBuilder.toString();
    }

    private final void zza(StringBuilder stringBuilder, int i, String str, zzi zzi, String str2) {
        if (zzi != null) {
            int i2;
            int i3;
            zza(stringBuilder, 3);
            stringBuilder.append(str);
            stringBuilder.append(" {\n");
            String str3 = ", ";
            if (zzi.zzpz() != 0) {
                zza(stringBuilder, 4);
                stringBuilder.append("results: ");
                i2 = 0;
                for (Long l : zzi.zzpy()) {
                    i3 = i2 + 1;
                    if (i2 != 0) {
                        stringBuilder.append(str3);
                    }
                    stringBuilder.append(l);
                    i2 = i3;
                }
                stringBuilder.append(10);
            }
            if (zzi.zzpw() != 0) {
                zza(stringBuilder, 4);
                stringBuilder.append("status: ");
                i2 = 0;
                for (Long l2 : zzi.zzpv()) {
                    i3 = i2 + 1;
                    if (i2 != 0) {
                        stringBuilder.append(str3);
                    }
                    stringBuilder.append(l2);
                    i2 = i3;
                }
                stringBuilder.append(10);
            }
            boolean zzq = zzad().zzq(str2);
            str2 = "}\n";
            if (zzq) {
                if (zzi.zzqc() != 0) {
                    zza(stringBuilder, 4);
                    stringBuilder.append("dynamic_filter_timestamps: {");
                    i2 = 0;
                    for (zzbs.zzb zzb : zzi.zzqb()) {
                        i3 = i2 + 1;
                        if (i2 != 0) {
                            stringBuilder.append(str3);
                        }
                        stringBuilder.append(zzb.zzme() ? Integer.valueOf(zzb.getIndex()) : null);
                        stringBuilder.append(":");
                        stringBuilder.append(zzb.zzmf() ? Long.valueOf(zzb.zzmg()) : null);
                        i2 = i3;
                    }
                    stringBuilder.append(str2);
                }
                if (zzi.zzqf() != 0) {
                    zza(stringBuilder, 4);
                    stringBuilder.append("sequence_filter_timestamps: {");
                    int i4 = 0;
                    for (zzj zzj : zzi.zzqe()) {
                        i2 = i4 + 1;
                        if (i4 != 0) {
                            stringBuilder.append(str3);
                        }
                        stringBuilder.append(zzj.zzme() ? Integer.valueOf(zzj.getIndex()) : null);
                        stringBuilder.append(": [");
                        int i5 = 0;
                        for (Long l22 : zzj.zzqk()) {
                            long longValue = l22.longValue();
                            int i6 = i5 + 1;
                            if (i5 != 0) {
                                stringBuilder.append(str3);
                            }
                            stringBuilder.append(longValue);
                            i5 = i6;
                        }
                        stringBuilder.append("]");
                        i4 = i2;
                    }
                    stringBuilder.append(str2);
                }
            }
            zza(stringBuilder, 3);
            stringBuilder.append(str2);
        }
    }

    private final void zza(StringBuilder stringBuilder, int i, String str, zzbk.zzc zzc) {
        if (zzc != null) {
            zza(stringBuilder, i);
            stringBuilder.append(str);
            stringBuilder.append(" {\n");
            if (zzc.zzku()) {
                zza(stringBuilder, i, "comparison_type", zzc.zzkv().name());
            }
            if (zzc.zzkw()) {
                zza(stringBuilder, i, "match_as_float", Boolean.valueOf(zzc.zzkx()));
            }
            zza(stringBuilder, i, "comparison_value", zzc.zzkz());
            zza(stringBuilder, i, "min_comparison_value", zzc.zzlb());
            zza(stringBuilder, i, "max_comparison_value", zzc.zzld());
            zza(stringBuilder, i);
            stringBuilder.append("}\n");
        }
    }

    private final void zza(StringBuilder stringBuilder, int i, zzb zzb) {
        if (zzb != null) {
            zza(stringBuilder, i);
            stringBuilder.append("filter {\n");
            if (zzb.zzkp()) {
                zza(stringBuilder, i, "complement", Boolean.valueOf(zzb.zzkq()));
            }
            zza(stringBuilder, i, "param_name", zzy().zzak(zzb.zzkr()));
            int i2 = i + 1;
            zzbk.zze zzkm = zzb.zzkm();
            String str = "}\n";
            if (zzkm != null) {
                zza(stringBuilder, i2);
                stringBuilder.append("string_filter");
                stringBuilder.append(" {\n");
                if (zzkm.zzlk()) {
                    zza(stringBuilder, i2, "match_type", zzkm.zzll().name());
                }
                zza(stringBuilder, i2, "expression", zzkm.zzln());
                if (zzkm.zzlo()) {
                    zza(stringBuilder, i2, "case_sensitive", Boolean.valueOf(zzkm.zzlp()));
                }
                if (zzkm.zzlr() > 0) {
                    zza(stringBuilder, i2 + 1);
                    stringBuilder.append("expression_list {\n");
                    for (String str2 : zzkm.zzlq()) {
                        zza(stringBuilder, i2 + 2);
                        stringBuilder.append(str2);
                        stringBuilder.append("\n");
                    }
                    stringBuilder.append(str);
                }
                zza(stringBuilder, i2);
                stringBuilder.append(str);
            }
            zza(stringBuilder, i2, "number_filter", zzb.zzko());
            zza(stringBuilder, i);
            stringBuilder.append(str);
        }
    }

    private static void zza(StringBuilder stringBuilder, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            stringBuilder.append("  ");
        }
    }

    private static void zza(StringBuilder stringBuilder, int i, String str, Object obj) {
        if (obj != null) {
            zza(stringBuilder, i + 1);
            stringBuilder.append(str);
            stringBuilder.append(": ");
            stringBuilder.append(obj);
            stringBuilder.append(10);
        }
    }

    /* Access modifiers changed, original: final */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x001c */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing block: B:10:?, code skipped:
            zzab().zzgk().zzao("Failed to load parcelable from buffer");
     */
    /* JADX WARNING: Missing block: B:11:0x002c, code skipped:
            return null;
     */
    /* JADX WARNING: Missing block: B:12:0x002d, code skipped:
            r1.recycle();
     */
    public final <T extends android.os.Parcelable> T zza(byte[] r5, android.os.Parcelable.Creator<T> r6) {
        /*
        r4 = this;
        r0 = 0;
        if (r5 != 0) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r1 = android.os.Parcel.obtain();
        r2 = r5.length;	 Catch:{ ParseException -> 0x001c }
        r3 = 0;
        r1.unmarshall(r5, r3, r2);	 Catch:{ ParseException -> 0x001c }
        r1.setDataPosition(r3);	 Catch:{ ParseException -> 0x001c }
        r5 = r6.createFromParcel(r1);	 Catch:{ ParseException -> 0x001c }
        r5 = (android.os.Parcelable) r5;	 Catch:{ ParseException -> 0x001c }
        r1.recycle();
        return r5;
    L_0x001a:
        r5 = move-exception;
        goto L_0x002d;
    L_0x001c:
        r5 = r4.zzab();	 Catch:{ all -> 0x001a }
        r5 = r5.zzgk();	 Catch:{ all -> 0x001a }
        r6 = "Failed to load parcelable from buffer";
        r5.zzao(r6);	 Catch:{ all -> 0x001a }
        r1.recycle();
        return r0;
    L_0x002d:
        r1.recycle();
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzjo.zza(byte[], android.os.Parcelable$Creator):android.os.Parcelable");
    }

    /* Access modifiers changed, original: final */
    @WorkerThread
    public final boolean zze(zzai zzai, zzn zzn) {
        Preconditions.checkNotNull(zzai);
        Preconditions.checkNotNull(zzn);
        if (!TextUtils.isEmpty(zzn.zzcg) || !TextUtils.isEmpty(zzn.zzcu)) {
            return true;
        }
        zzae();
        return false;
    }

    static boolean zzbj(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    static boolean zza(List<Long> list, int i) {
        if (i < (list.size() << 6)) {
            if (((1 << (i % 64)) & ((Long) list.get(i / 64)).longValue()) != 0) {
                return true;
            }
        }
        return false;
    }

    static List<Long> zza(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            long j = 0;
            for (int i2 = 0; i2 < 64; i2++) {
                int i3 = (i << 6) + i2;
                if (i3 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i3)) {
                    j |= 1 << i2;
                }
            }
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    /* Access modifiers changed, original: final */
    public final List<Long> zza(List<Long> list, List<Integer> list2) {
        ArrayList arrayList = new ArrayList(list);
        for (Integer num : list2) {
            if (num.intValue() < 0) {
                zzab().zzgn().zza("Ignoring negative bit index to be cleared", num);
            } else {
                int intValue = num.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    zzab().zzgn().zza("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(intValue, Long.valueOf(((Long) arrayList.get(intValue)).longValue() & ((1 << (num.intValue() % 64)) ^ -1)));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i = size2;
            size2 = size;
            size = i;
            if (size >= 0 && ((Long) arrayList.get(size)).longValue() == 0) {
                size2 = size - 1;
            }
        }
        return arrayList.subList(0, size2);
    }

    /* Access modifiers changed, original: final */
    public final boolean zzb(long j, long j2) {
        return j == 0 || j2 <= 0 || Math.abs(zzx().currentTimeMillis() - j) > j2;
    }

    /* Access modifiers changed, original: final */
    @WorkerThread
    public final long zza(byte[] bArr) {
        Preconditions.checkNotNull(bArr);
        zzz().zzo();
        MessageDigest messageDigest = zzjs.getMessageDigest();
        if (messageDigest != null) {
            return zzjs.zzd(messageDigest.digest(bArr));
        }
        zzab().zzgk().zzao("Failed to get MD5");
        return 0;
    }

    /* Access modifiers changed, original: final */
    public final byte[] zzb(byte[] bArr) {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[1024];
            while (true) {
                int read = gZIPInputStream.read(bArr2);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr2, 0, read);
                } else {
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (IOException e) {
            zzab().zzgk().zza("Failed to ungzip content", e);
            throw e;
        }
    }

    /* Access modifiers changed, original: final */
    public final byte[] zzc(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            zzab().zzgk().zza("Failed to gzip content", e);
            throw e;
        }
    }

    /* Access modifiers changed, original: final */
    @Nullable
    public final List<Integer> zzju() {
        Map zzk = zzak.zzk(this.zzkz.getContext());
        if (zzk == null || zzk.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int intValue = ((Integer) zzak.zzhr.get(null)).intValue();
        for (Entry entry : zzk.entrySet()) {
            if (((String) entry.getKey()).startsWith("measurement.id.")) {
                try {
                    int parseInt = Integer.parseInt((String) entry.getValue());
                    if (parseInt != 0) {
                        arrayList.add(Integer.valueOf(parseInt));
                        if (arrayList.size() >= intValue) {
                            zzab().zzgn().zza("Too many experiment IDs. Number of IDs", Integer.valueOf(arrayList.size()));
                            break;
                        }
                    } else {
                        continue;
                    }
                } catch (NumberFormatException e) {
                    zzab().zzgn().zza("Experiment ID NumberFormatException", e);
                }
            }
        }
        if (arrayList.size() == 0) {
            return null;
        }
        return arrayList;
    }

    public final /* bridge */ /* synthetic */ zzjo zzgw() {
        return super.zzgw();
    }

    public final /* bridge */ /* synthetic */ zzp zzgx() {
        return super.zzgx();
    }

    public final /* bridge */ /* synthetic */ zzx zzgy() {
        return super.zzgy();
    }

    public final /* bridge */ /* synthetic */ zzfd zzgz() {
        return super.zzgz();
    }

    public final /* bridge */ /* synthetic */ void zzl() {
        super.zzl();
    }

    public final /* bridge */ /* synthetic */ void zzm() {
        super.zzm();
    }

    public final /* bridge */ /* synthetic */ void zzn() {
        super.zzn();
    }

    public final /* bridge */ /* synthetic */ void zzo() {
        super.zzo();
    }

    public final /* bridge */ /* synthetic */ zzac zzw() {
        return super.zzw();
    }

    public final /* bridge */ /* synthetic */ Clock zzx() {
        return super.zzx();
    }

    public final /* bridge */ /* synthetic */ Context getContext() {
        return super.getContext();
    }

    public final /* bridge */ /* synthetic */ zzed zzy() {
        return super.zzy();
    }

    public final /* bridge */ /* synthetic */ zzjs zzz() {
        return super.zzz();
    }

    public final /* bridge */ /* synthetic */ zzfc zzaa() {
        return super.zzaa();
    }

    public final /* bridge */ /* synthetic */ zzef zzab() {
        return super.zzab();
    }

    public final /* bridge */ /* synthetic */ zzeo zzac() {
        return super.zzac();
    }

    public final /* bridge */ /* synthetic */ zzs zzad() {
        return super.zzad();
    }

    public final /* bridge */ /* synthetic */ zzr zzae() {
        return super.zzae();
    }
}
