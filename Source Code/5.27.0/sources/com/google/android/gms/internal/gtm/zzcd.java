package com.google.android.gms.internal.gtm;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public final class zzcd {
    private final List<zzbk> zzaaz;
    private final long zzaba;
    private final long zzabb;
    private final int zzabc;
    private final boolean zzabd;
    private final String zzabe;
    private final Map<String, String> zztc;

    public zzcd(zzam zzam, Map<String, String> map, long j, boolean z) {
        this(zzam, map, j, z, 0, 0, null);
    }

    public zzcd(zzam zzam, Map<String, String> map, long j, boolean z, long j2, int i) {
        this(zzam, map, j, z, j2, i, null);
    }

    public zzcd(zzam zzam, Map<String, String> map, long j, boolean z, long j2, int i, List<zzbk> list) {
        List list2;
        CharSequence value;
        Preconditions.checkNotNull(zzam);
        Preconditions.checkNotNull(map);
        this.zzabb = j;
        this.zzabd = z;
        this.zzaba = j2;
        this.zzabc = i;
        if (list != null) {
            list2 = list;
        } else {
            list2 = Collections.emptyList();
        }
        this.zzaaz = list2;
        String str = null;
        if (list != null) {
            for (zzbk zzbk : list) {
                if ("appendVersion".equals(zzbk.getId())) {
                    value = zzbk.getValue();
                    break;
                }
            }
        }
        value = null;
        if (!TextUtils.isEmpty(value)) {
            str = value;
        }
        this.zzabe = str;
        Map hashMap = new HashMap();
        for (Entry entry : map.entrySet()) {
            if (zzc(entry.getKey())) {
                String zza = zza(zzam, entry.getKey());
                if (zza != null) {
                    hashMap.put(zza, zzb(zzam, entry.getValue()));
                }
            }
        }
        for (Entry entry2 : map.entrySet()) {
            if (!zzc(entry2.getKey())) {
                String zza2 = zza(zzam, entry2.getKey());
                if (zza2 != null) {
                    hashMap.put(zza2, zzb(zzam, entry2.getValue()));
                }
            }
        }
        if (!TextUtils.isEmpty(this.zzabe)) {
            zzcz.zzb(hashMap, "_v", this.zzabe);
            if (this.zzabe.equals("ma4.0.0") || this.zzabe.equals("ma4.0.1")) {
                hashMap.remove("adid");
            }
        }
        this.zztc = Collections.unmodifiableMap(hashMap);
    }

    private static boolean zzc(Object obj) {
        return obj == null ? false : obj.toString().startsWith("&");
    }

    private static String zza(zzam zzam, Object obj) {
        if (obj == null) {
            return null;
        }
        CharSequence obj2 = obj.toString();
        if (obj2.startsWith("&")) {
            obj2 = obj2.substring(1);
        }
        int length = obj2.length();
        if (length > 256) {
            obj2 = obj2.substring(0, 256);
            zzam.zzc("Hit param name is too long and will be trimmed", Integer.valueOf(length), obj2);
        }
        if (TextUtils.isEmpty(obj2)) {
            return null;
        }
        return obj2;
    }

    private static String zzb(zzam zzam, Object obj) {
        String obj2 = obj == null ? "" : obj.toString();
        int length = obj2.length();
        if (length <= 8192) {
            return obj2;
        }
        obj2 = obj2.substring(0, 8192);
        zzam.zzc("Hit param value is too long and will be trimmed", Integer.valueOf(length), obj2);
        return obj2;
    }

    public final int zzff() {
        return this.zzabc;
    }

    public final Map<String, String> zzdm() {
        return this.zztc;
    }

    public final long zzfg() {
        return this.zzaba;
    }

    public final long zzfh() {
        return this.zzabb;
    }

    public final List<zzbk> zzfi() {
        return this.zzaaz;
    }

    public final boolean zzfj() {
        return this.zzabd;
    }

    public final long zzfk() {
        return zzcz.zzag(zzd("_s", "0"));
    }

    public final String zzfl() {
        return zzd("_m", "");
    }

    private final String zzd(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkArgument(str.startsWith("&") ^ 1, "Short param name required");
        str = (String) this.zztc.get(str);
        return str != null ? str : str2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ht=");
        stringBuilder.append(this.zzabb);
        if (this.zzaba != 0) {
            stringBuilder.append(", dbId=");
            stringBuilder.append(this.zzaba);
        }
        if (this.zzabc != 0) {
            stringBuilder.append(", appUID=");
            stringBuilder.append(this.zzabc);
        }
        ArrayList arrayList = new ArrayList(this.zztc.keySet());
        Collections.sort(arrayList);
        arrayList = arrayList;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            String str = (String) obj;
            stringBuilder.append(", ");
            stringBuilder.append(str);
            stringBuilder.append("=");
            stringBuilder.append((String) this.zztc.get(str));
        }
        return stringBuilder.toString();
    }
}
