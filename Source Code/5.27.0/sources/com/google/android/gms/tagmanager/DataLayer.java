package com.google.android.gms.tagmanager;

import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@VisibleForTesting
public class DataLayer {
    public static final String EVENT_KEY = "event";
    public static final Object OBJECT_NOT_PRESENT = new Object();
    private static final String[] zzafn = "gtm.lifetime".split("\\.");
    private static final Pattern zzafo = Pattern.compile("(\\d+)\\s*([smhd]?)");
    private final ConcurrentHashMap<zzb, Integer> zzafp;
    private final Map<String, Object> zzafq;
    private final ReentrantLock zzafr;
    private final LinkedList<Map<String, Object>> zzafs;
    private final zzc zzaft;
    private final CountDownLatch zzafu;

    static final class zza {
        public final String mKey;
        public final Object mValue;

        zza(String str, Object obj) {
            this.mKey = str;
            this.mValue = obj;
        }

        public final String toString() {
            String str = this.mKey;
            String obj = this.mValue.toString();
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 13) + String.valueOf(obj).length());
            stringBuilder.append("Key: ");
            stringBuilder.append(str);
            stringBuilder.append(" value: ");
            stringBuilder.append(obj);
            return stringBuilder.toString();
        }

        public final int hashCode() {
            return Arrays.hashCode(new Integer[]{Integer.valueOf(this.mKey.hashCode()), Integer.valueOf(this.mValue.hashCode())});
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof zza)) {
                return false;
            }
            zza zza = (zza) obj;
            if (this.mKey.equals(zza.mKey) && this.mValue.equals(zza.mValue)) {
                return true;
            }
            return false;
        }
    }

    interface zzb {
        void zzc(Map<String, Object> map);
    }

    interface zzc {
        void zza(zzaq zzaq);

        void zza(List<zza> list, long j);

        void zzas(String str);
    }

    @VisibleForTesting
    DataLayer() {
        this(new zzao());
    }

    DataLayer(zzc zzc) {
        this.zzaft = zzc;
        this.zzafp = new ConcurrentHashMap();
        this.zzafq = new HashMap();
        this.zzafr = new ReentrantLock();
        this.zzafs = new LinkedList();
        this.zzafu = new CountDownLatch(1);
        this.zzaft.zza(new zzap(this));
    }

    public String toString() {
        String stringBuilder;
        synchronized (this.zzafq) {
            StringBuilder stringBuilder2 = new StringBuilder();
            for (Entry entry : this.zzafq.entrySet()) {
                stringBuilder2.append(String.format("{\n\tKey: %s\n\tValue: %s\n}\n", new Object[]{entry.getKey(), entry.getValue()}));
            }
            stringBuilder = stringBuilder2.toString();
        }
        return stringBuilder;
    }

    public void pushEvent(String str, Map<String, Object> map) {
        HashMap hashMap = new HashMap(map);
        hashMap.put("event", str);
        push(hashMap);
    }

    public void push(String str, Object obj) {
        push(zzg(str, obj));
    }

    public void push(Map<String, Object> map) {
        try {
            this.zzafu.await();
        } catch (InterruptedException unused) {
            zzdi.zzac("DataLayer.push: unexpected InterruptedException");
        }
        zze(map);
    }

    private final void zze(Map<String, Object> map) {
        this.zzafr.lock();
        try {
            Long l;
            this.zzafs.offer(map);
            int i = 0;
            if (this.zzafr.getHoldCount() == 1) {
                int i2 = 0;
                while (true) {
                    Map map2 = (Map) this.zzafs.poll();
                    if (map2 == null) {
                        break;
                    }
                    synchronized (this.zzafq) {
                        for (String str : map2.keySet()) {
                            zzb(zzg(str, map2.get(str)), this.zzafq);
                        }
                    }
                    for (zzb zzc : this.zzafp.keySet()) {
                        zzc.zzc(map2);
                    }
                    i2++;
                    if (i2 > 500) {
                        this.zzafs.clear();
                        throw new RuntimeException("Seems like an infinite loop of pushing to the data layer");
                    }
                }
            }
            String[] strArr = zzafn;
            int length = strArr.length;
            Object obj = map;
            while (true) {
                l = null;
                if (i >= length) {
                    break;
                }
                Object obj2 = strArr[i];
                if (!(obj instanceof Map)) {
                    obj = null;
                    break;
                } else {
                    obj = ((Map) obj).get(obj2);
                    i++;
                }
            }
            if (obj != null) {
                l = zzar(obj.toString());
            }
            if (l != null) {
                ArrayList arrayList = new ArrayList();
                zza(map, "", arrayList);
                this.zzaft.zza(arrayList, l.longValue());
            }
            this.zzafr.unlock();
        } catch (Throwable th) {
            this.zzafr.unlock();
        }
    }

    /* Access modifiers changed, original: final */
    public final void zzaq(String str) {
        push(str, null);
        this.zzaft.zzas(str);
    }

    private final void zza(Map<String, Object> map, String str, Collection<zza> collection) {
        for (Entry entry : map.entrySet()) {
            String str2 = str.length() == 0 ? "" : ".";
            String str3 = (String) entry.getKey();
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + str2.length()) + String.valueOf(str3).length());
            stringBuilder.append(str);
            stringBuilder.append(str2);
            stringBuilder.append(str3);
            str2 = stringBuilder.toString();
            if (entry.getValue() instanceof Map) {
                zza((Map) entry.getValue(), str2, collection);
            } else if (!str2.equals("gtm.lifetime")) {
                collection.add(new zza(str2, entry.getValue()));
            }
        }
    }

    @VisibleForTesting
    private static Long zzar(String str) {
        Matcher matcher = zzafo.matcher(str);
        String str2;
        if (matcher.matches()) {
            long parseLong;
            try {
                parseLong = Long.parseLong(matcher.group(1));
            } catch (NumberFormatException unused) {
                String str3 = "illegal number in _lifetime value: ";
                String valueOf = String.valueOf(str);
                zzdi.zzac(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
                parseLong = 0;
            }
            if (parseLong <= 0) {
                str2 = "non-positive _lifetime: ";
                str = String.valueOf(str);
                zzdi.zzaw(str.length() != 0 ? str2.concat(str) : new String(str2));
                return null;
            }
            str2 = matcher.group(2);
            if (str2.length() == 0) {
                return Long.valueOf(parseLong);
            }
            char charAt = str2.charAt(0);
            if (charAt == 'd') {
                return Long.valueOf((((parseLong * 1000) * 60) * 60) * 24);
            }
            if (charAt == 'h') {
                return Long.valueOf(((parseLong * 1000) * 60) * 60);
            }
            if (charAt == 'm') {
                return Long.valueOf((parseLong * 1000) * 60);
            }
            if (charAt == 's') {
                return Long.valueOf(parseLong * 1000);
            }
            str2 = "unknown units in _lifetime: ";
            str = String.valueOf(str);
            zzdi.zzac(str.length() != 0 ? str2.concat(str) : new String(str2));
            return null;
        }
        str2 = "unknown _lifetime: ";
        str = String.valueOf(str);
        zzdi.zzaw(str.length() != 0 ? str2.concat(str) : new String(str2));
        return null;
    }

    public Object get(String str) {
        synchronized (this.zzafq) {
            Object obj = this.zzafq;
            String[] split = str.split("\\.");
            int length = split.length;
            int i = 0;
            while (i < length) {
                Object obj2 = split[i];
                if (obj instanceof Map) {
                    obj = ((Map) obj).get(obj2);
                    if (obj == null) {
                        return null;
                    }
                    i++;
                } else {
                    return null;
                }
            }
            return obj;
        }
    }

    @VisibleForTesting
    public static Map<String, Object> mapOf(Object... objArr) {
        if (objArr.length % 2 == 0) {
            HashMap hashMap = new HashMap();
            int i = 0;
            while (i < objArr.length) {
                if (objArr[i] instanceof String) {
                    hashMap.put((String) objArr[i], objArr[i + 1]);
                    i += 2;
                } else {
                    String valueOf = String.valueOf(objArr[i]);
                    StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 21);
                    stringBuilder.append("key is not a string: ");
                    stringBuilder.append(valueOf);
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
            }
            return hashMap;
        }
        throw new IllegalArgumentException("expected even number of key-value pairs");
    }

    @VisibleForTesting
    public static List<Object> listOf(Object... objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object add : objArr) {
            arrayList.add(add);
        }
        return arrayList;
    }

    /* Access modifiers changed, original: final */
    public final void zza(zzb zzb) {
        this.zzafp.put(zzb, Integer.valueOf(0));
    }

    static Map<String, Object> zzg(String str, Object obj) {
        HashMap hashMap = new HashMap();
        String[] split = str.toString().split("\\.");
        int i = 0;
        Map map = hashMap;
        while (i < split.length - 1) {
            HashMap hashMap2 = new HashMap();
            map.put(split[i], hashMap2);
            i++;
            Object map2 = hashMap2;
        }
        map2.put(split[split.length - 1], obj);
        return hashMap;
    }

    @VisibleForTesting
    private final void zzb(Map<String, Object> map, Map<String, Object> map2) {
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj instanceof List) {
                if (!(map2.get(str) instanceof List)) {
                    map2.put(str, new ArrayList());
                }
                zza((List) obj, (List) map2.get(str));
            } else if (obj instanceof Map) {
                if (!(map2.get(str) instanceof Map)) {
                    map2.put(str, new HashMap());
                }
                zzb((Map) obj, (Map) map2.get(str));
            } else {
                map2.put(str, obj);
            }
        }
    }

    @VisibleForTesting
    private final void zza(List<Object> list, List<Object> list2) {
        while (list2.size() < list.size()) {
            list2.add(null);
        }
        for (int i = 0; i < list.size(); i++) {
            Object obj = list.get(i);
            if (obj instanceof List) {
                if (!(list2.get(i) instanceof List)) {
                    list2.set(i, new ArrayList());
                }
                zza((List) obj, (List) list2.get(i));
            } else if (obj instanceof Map) {
                if (!(list2.get(i) instanceof Map)) {
                    list2.set(i, new HashMap());
                }
                zzb((Map) obj, (Map) list2.get(i));
            } else if (obj != OBJECT_NOT_PRESENT) {
                list2.set(i, obj);
            }
        }
    }
}
