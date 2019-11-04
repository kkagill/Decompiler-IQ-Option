package com.google.android.gms.tagmanager;

import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.gtm.zzl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

@VisibleForTesting
public final class zzgj {
    private static final Object zzalo = null;
    private static Long zzalp = new Long(0);
    private static Double zzalq = new Double(0.0d);
    private static zzgi zzalr = zzgi.zzm(0);
    private static String zzals = new String("");
    private static Boolean zzalt = new Boolean(false);
    private static List<Object> zzalu = new ArrayList(0);
    private static Map<Object, Object> zzalv = new HashMap();
    private static zzl zzalw = zzi(zzals);

    public static Object zzjw() {
        return null;
    }

    public static Long zzjx() {
        return zzalp;
    }

    public static Double zzjy() {
        return zzalq;
    }

    public static Boolean zzjz() {
        return zzalt;
    }

    public static zzgi zzka() {
        return zzalr;
    }

    public static String zzkb() {
        return zzals;
    }

    public static zzl zzkc() {
        return zzalw;
    }

    private static String zzh(Object obj) {
        return obj == null ? zzals : obj.toString();
    }

    public static String zzc(zzl zzl) {
        return zzh(zzh(zzl));
    }

    public static zzgi zzd(zzl zzl) {
        Object zzh = zzh(zzl);
        if (zzh instanceof zzgi) {
            return (zzgi) zzh;
        }
        if (zzk(zzh)) {
            return zzgi.zzm(zzl(zzh));
        }
        if (zzj(zzh)) {
            return zzgi.zza(Double.valueOf(getDouble(zzh)));
        }
        return zzbq(zzh(zzh));
    }

    public static Long zze(zzl zzl) {
        Object zzh = zzh(zzl);
        if (zzk(zzh)) {
            return Long.valueOf(zzl(zzh));
        }
        zzgi zzbq = zzbq(zzh(zzh));
        return zzbq == zzalr ? zzalp : Long.valueOf(zzbq.longValue());
    }

    public static Double zzf(zzl zzl) {
        Object zzh = zzh(zzl);
        if (zzj(zzh)) {
            return Double.valueOf(getDouble(zzh));
        }
        zzgi zzbq = zzbq(zzh(zzh));
        return zzbq == zzalr ? zzalq : Double.valueOf(zzbq.doubleValue());
    }

    public static Boolean zzg(zzl zzl) {
        Object zzh = zzh(zzl);
        if (zzh instanceof Boolean) {
            return (Boolean) zzh;
        }
        String zzh2 = zzh(zzh);
        if ("true".equalsIgnoreCase(zzh2)) {
            return Boolean.TRUE;
        }
        if ("false".equalsIgnoreCase(zzh2)) {
            return Boolean.FALSE;
        }
        return zzalt;
    }

    public static zzl zzi(Object obj) {
        zzl zzl = new zzl();
        if (obj instanceof zzl) {
            return (zzl) obj;
        }
        boolean z = false;
        ArrayList arrayList;
        zzl zzl2;
        if (obj instanceof String) {
            zzl.type = 1;
            zzl.string = (String) obj;
        } else if (obj instanceof List) {
            zzl.type = 2;
            List<Object> list = (List) obj;
            arrayList = new ArrayList(list.size());
            boolean z2 = false;
            for (Object zzi : list) {
                zzl zzi2 = zzi(zzi);
                zzl2 = zzalw;
                if (zzi2 == zzl2) {
                    return zzl2;
                }
                z2 = z2 || zzi2.zzqw;
                arrayList.add(zzi2);
            }
            zzl.zzqn = (zzl[]) arrayList.toArray(new zzl[0]);
            z = z2;
        } else if (obj instanceof Map) {
            zzl.type = 3;
            Set<Entry> entrySet = ((Map) obj).entrySet();
            arrayList = new ArrayList(entrySet.size());
            ArrayList arrayList2 = new ArrayList(entrySet.size());
            boolean z3 = false;
            for (Entry entry : entrySet) {
                zzl zzi3 = zzi(entry.getKey());
                zzl2 = zzi(entry.getValue());
                zzl zzl3 = zzalw;
                if (zzi3 == zzl3 || zzl2 == zzl3) {
                    return zzalw;
                }
                z3 = z3 || zzi3.zzqw || zzl2.zzqw;
                arrayList.add(zzi3);
                arrayList2.add(zzl2);
            }
            zzl.zzqo = (zzl[]) arrayList.toArray(new zzl[0]);
            zzl.zzqp = (zzl[]) arrayList2.toArray(new zzl[0]);
            z = z3;
        } else if (zzj(obj)) {
            zzl.type = 1;
            zzl.string = obj.toString();
        } else if (zzk(obj)) {
            zzl.type = 6;
            zzl.zzqs = zzl(obj);
        } else if (obj instanceof Boolean) {
            zzl.type = 8;
            zzl.zzqt = ((Boolean) obj).booleanValue();
        } else {
            String str = "Converting to Value from unknown object type: ";
            if (obj == null) {
                obj = "null";
            } else {
                obj = obj.getClass().toString();
            }
            String valueOf = String.valueOf(obj);
            zzdi.zzav(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            return zzalw;
        }
        zzl.zzqw = z;
        return zzl;
    }

    public static zzl zzbp(String str) {
        zzl zzl = new zzl();
        zzl.type = 5;
        zzl.zzqr = str;
        return zzl;
    }

    private static boolean zzj(Object obj) {
        return (obj instanceof Double) || (obj instanceof Float) || ((obj instanceof zzgi) && ((zzgi) obj).zzju());
    }

    private static double getDouble(Object obj) {
        if (obj instanceof Number) {
            return ((Number) obj).doubleValue();
        }
        zzdi.zzav("getDouble received non-Number");
        return 0.0d;
    }

    private static boolean zzk(Object obj) {
        return (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long) || ((obj instanceof zzgi) && ((zzgi) obj).zzjv());
    }

    private static long zzl(Object obj) {
        if (obj instanceof Number) {
            return ((Number) obj).longValue();
        }
        zzdi.zzav("getInt64 received non-Number");
        return 0;
    }

    private static zzgi zzbq(String str) {
        Object str2;
        try {
            str2 = zzgi.zzbo(str2);
            return str2;
        } catch (NumberFormatException unused) {
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str2).length() + 33);
            stringBuilder.append("Failed to convert '");
            stringBuilder.append(str2);
            stringBuilder.append("' to a number.");
            zzdi.zzav(stringBuilder.toString());
            return zzalr;
        }
    }

    public static Object zzh(zzl zzl) {
        if (zzl == null) {
            return null;
        }
        int i = 0;
        zzl[] zzlArr;
        int length;
        Object zzh;
        switch (zzl.type) {
            case 1:
                return zzl.string;
            case 2:
                ArrayList arrayList = new ArrayList(zzl.zzqn.length);
                zzlArr = zzl.zzqn;
                length = zzlArr.length;
                while (i < length) {
                    zzh = zzh(zzlArr[i]);
                    if (zzh == null) {
                        return null;
                    }
                    arrayList.add(zzh);
                    i++;
                }
                return arrayList;
            case 3:
                if (zzl.zzqo.length != zzl.zzqp.length) {
                    String str = "Converting an invalid value to object: ";
                    String valueOf = String.valueOf(zzl.toString());
                    zzdi.zzav(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                    return null;
                }
                HashMap hashMap = new HashMap(zzl.zzqp.length);
                while (i < zzl.zzqo.length) {
                    Object zzh2 = zzh(zzl.zzqo[i]);
                    zzh = zzh(zzl.zzqp[i]);
                    if (zzh2 == null || zzh == null) {
                        return null;
                    }
                    hashMap.put(zzh2, zzh);
                    i++;
                }
                return hashMap;
            case 4:
                zzdi.zzav("Trying to convert a macro reference to object");
                return null;
            case 5:
                zzdi.zzav("Trying to convert a function id to object");
                return null;
            case 6:
                return Long.valueOf(zzl.zzqs);
            case 7:
                StringBuilder stringBuilder = new StringBuilder();
                zzlArr = zzl.zzqu;
                length = zzlArr.length;
                while (i < length) {
                    String zzh3 = zzh(zzh(zzlArr[i]));
                    if (zzh3 == zzals) {
                        return null;
                    }
                    stringBuilder.append(zzh3);
                    i++;
                }
                return stringBuilder.toString();
            case 8:
                return Boolean.valueOf(zzl.zzqt);
            default:
                int i2 = zzl.type;
                StringBuilder stringBuilder2 = new StringBuilder(46);
                stringBuilder2.append("Failed to convert a value of type: ");
                stringBuilder2.append(i2);
                zzdi.zzav(stringBuilder2.toString());
                return null;
        }
    }
}
