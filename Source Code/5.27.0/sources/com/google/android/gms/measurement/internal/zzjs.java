package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ServiceInfo;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzp;
import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;

public final class zzjs extends zzge {
    private static final String[] zztw = new String[]{"firebase_", "google_", "ga_"};
    private static final List<String> zzua = Collections.unmodifiableList(Arrays.asList(new String[]{"source", "medium", "campaign", "term", "content"}));
    private int zzag;
    private SecureRandom zztx;
    private final AtomicLong zzty = new AtomicLong(0);
    private Integer zztz = null;

    zzjs(zzfj zzfj) {
        super(zzfj);
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean zzbk() {
        return true;
    }

    /* Access modifiers changed, original: protected|final */
    @WorkerThread
    public final void zzbl() {
        zzo();
        SecureRandom secureRandom = new SecureRandom();
        long nextLong = secureRandom.nextLong();
        if (nextLong == 0) {
            nextLong = secureRandom.nextLong();
            if (nextLong == 0) {
                zzab().zzgn().zzao("Utils falling back to Random for random id");
            }
        }
        this.zzty.set(nextLong);
    }

    public final long zzjv() {
        long nextLong;
        if (this.zzty.get() == 0) {
            synchronized (this.zzty) {
                nextLong = new Random(System.nanoTime() ^ zzx().currentTimeMillis()).nextLong();
                int i = this.zzag + 1;
                this.zzag = i;
                nextLong += (long) i;
            }
            return nextLong;
        }
        synchronized (this.zzty) {
            this.zzty.compareAndSet(-1, 1);
            nextLong = this.zzty.getAndIncrement();
        }
        return nextLong;
    }

    /* Access modifiers changed, original: final */
    @WorkerThread
    public final SecureRandom zzjw() {
        zzo();
        if (this.zztx == null) {
            this.zztx = new SecureRandom();
        }
        return this.zztx;
    }

    static boolean zzbk(String str) {
        Preconditions.checkNotEmpty(str);
        if (str.charAt(0) != '_' || str.equals("_ep")) {
            return true;
        }
        return false;
    }

    /* Access modifiers changed, original: final */
    public final Bundle zza(@NonNull Uri uri) {
        if (uri == null) {
            return null;
        }
        try {
            CharSequence queryParameter;
            CharSequence queryParameter2;
            CharSequence queryParameter3;
            CharSequence queryParameter4;
            String str = "gclid";
            if (uri.isHierarchical()) {
                queryParameter = uri.getQueryParameter("utm_campaign");
                queryParameter2 = uri.getQueryParameter("utm_source");
                queryParameter3 = uri.getQueryParameter("utm_medium");
                queryParameter4 = uri.getQueryParameter(str);
            } else {
                queryParameter = null;
                queryParameter2 = queryParameter;
                queryParameter3 = queryParameter2;
                queryParameter4 = queryParameter3;
            }
            if (TextUtils.isEmpty(queryParameter) && TextUtils.isEmpty(queryParameter2) && TextUtils.isEmpty(queryParameter3) && TextUtils.isEmpty(queryParameter4)) {
                return null;
            }
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(queryParameter)) {
                bundle.putString("campaign", queryParameter);
            }
            if (!TextUtils.isEmpty(queryParameter2)) {
                bundle.putString("source", queryParameter2);
            }
            if (!TextUtils.isEmpty(queryParameter3)) {
                bundle.putString("medium", queryParameter3);
            }
            if (!TextUtils.isEmpty(queryParameter4)) {
                bundle.putString(str, queryParameter4);
            }
            String queryParameter5 = uri.getQueryParameter("utm_term");
            if (!TextUtils.isEmpty(queryParameter5)) {
                bundle.putString("term", queryParameter5);
            }
            queryParameter5 = uri.getQueryParameter("utm_content");
            if (!TextUtils.isEmpty(queryParameter5)) {
                bundle.putString("content", queryParameter5);
            }
            queryParameter5 = "aclid";
            str = uri.getQueryParameter(queryParameter5);
            if (!TextUtils.isEmpty(str)) {
                bundle.putString(queryParameter5, str);
            }
            queryParameter5 = "cp1";
            str = uri.getQueryParameter(queryParameter5);
            if (!TextUtils.isEmpty(str)) {
                bundle.putString(queryParameter5, str);
            }
            queryParameter5 = "anid";
            String queryParameter6 = uri.getQueryParameter(queryParameter5);
            if (!TextUtils.isEmpty(queryParameter6)) {
                bundle.putString(queryParameter5, queryParameter6);
            }
            return bundle;
        } catch (UnsupportedOperationException e) {
            zzab().zzgn().zza("Install referrer url isn't a hierarchical URI", e);
            return null;
        }
    }

    static boolean zzc(Intent intent) {
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        return "android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra);
    }

    /* Access modifiers changed, original: final */
    public final boolean zzp(String str, String str2) {
        if (str2 == null) {
            zzab().zzgm().zza("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            zzab().zzgm().zza("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (Character.isLetter(codePointAt)) {
                int length = str2.length();
                codePointAt = Character.charCount(codePointAt);
                while (codePointAt < length) {
                    int codePointAt2 = str2.codePointAt(codePointAt);
                    if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                        codePointAt += Character.charCount(codePointAt2);
                    } else {
                        zzab().zzgm().zza("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                        return false;
                    }
                }
                return true;
            }
            zzab().zzgm().zza("Name must start with a letter. Type, name", str, str2);
            return false;
        }
    }

    /* Access modifiers changed, original: final */
    public final boolean zzq(String str, String str2) {
        if (str2 == null) {
            zzab().zzgm().zza("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            zzab().zzgm().zza("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (Character.isLetter(codePointAt) || codePointAt == 95) {
                int length = str2.length();
                codePointAt = Character.charCount(codePointAt);
                while (codePointAt < length) {
                    int codePointAt2 = str2.codePointAt(codePointAt);
                    if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                        codePointAt += Character.charCount(codePointAt2);
                    } else {
                        zzab().zzgm().zza("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                        return false;
                    }
                }
                return true;
            }
            zzab().zzgm().zza("Name must start with a letter or _ (underscore). Type, name", str, str2);
            return false;
        }
    }

    /* Access modifiers changed, original: final */
    public final boolean zza(String str, String[] strArr, String str2) {
        if (str2 == null) {
            zzab().zzgm().zza("Name is required and can't be null. Type", str);
            return false;
        }
        Object obj;
        Preconditions.checkNotNull(str2);
        for (String startsWith : zztw) {
            if (str2.startsWith(startsWith)) {
                obj = 1;
                break;
            }
        }
        obj = null;
        if (obj != null) {
            zzab().zzgm().zza("Name starts with reserved prefix. Type, name", str, str2);
            return false;
        }
        if (strArr != null) {
            Object obj2;
            Preconditions.checkNotNull(strArr);
            for (String zzs : strArr) {
                if (zzs(str2, zzs)) {
                    obj2 = 1;
                    break;
                }
            }
            obj2 = null;
            if (obj2 != null) {
                zzab().zzgm().zza("Name is reserved. Type, name", str, str2);
                return false;
            }
        }
        return true;
    }

    /* Access modifiers changed, original: final */
    public final boolean zza(String str, int i, String str2) {
        if (str2 == null) {
            zzab().zzgm().zza("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.codePointCount(0, str2.length()) <= i) {
            return true;
        } else {
            zzab().zzgm().zza("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i), str2);
            return false;
        }
    }

    /* Access modifiers changed, original: final */
    public final int zzbl(String str) {
        String str2 = "event";
        if (!zzq(str2, str)) {
            return 2;
        }
        if (!zza(str2, zzgj.zzpn, str)) {
            return 13;
        }
        if (zza(str2, 40, str)) {
            return 0;
        }
        return 2;
    }

    /* Access modifiers changed, original: final */
    public final int zzbm(String str) {
        String str2 = "user property";
        if (!zzq(str2, str)) {
            return 6;
        }
        if (!zza(str2, zzgl.zzpp, str)) {
            return 15;
        }
        if (zza(str2, 24, str)) {
            return 0;
        }
        return 6;
    }

    private final boolean zza(String str, String str2, int i, Object obj, boolean z) {
        if (!(obj == null || (obj instanceof Long) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Boolean) || (obj instanceof Double))) {
            if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
                String valueOf = String.valueOf(obj);
                if (valueOf.codePointCount(0, valueOf.length()) > i) {
                    zzab().zzgp().zza("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(valueOf.length()));
                    return false;
                }
            } else if ((obj instanceof Bundle) && z) {
                return true;
            } else {
                int length;
                Object obj2;
                if ((obj instanceof Parcelable[]) && z) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    length = parcelableArr.length;
                    i = 0;
                    while (i < length) {
                        obj2 = parcelableArr[i];
                        if (obj2 instanceof Bundle) {
                            i++;
                        } else {
                            zzab().zzgp().zza("All Parcelable[] elements must be of type Bundle. Value type, name", obj2.getClass(), str2);
                            return false;
                        }
                    }
                    return true;
                } else if (!(obj instanceof ArrayList) || !z) {
                    return false;
                } else {
                    ArrayList arrayList = (ArrayList) obj;
                    length = arrayList.size();
                    i = 0;
                    while (i < length) {
                        obj2 = arrayList.get(i);
                        i++;
                        if (!(obj2 instanceof Bundle)) {
                            zzab().zzgp().zza("All ArrayList elements must be of type Bundle. Value type, name", obj2.getClass(), str2);
                            return false;
                        }
                    }
                    return true;
                }
            }
        }
        return true;
    }

    /* Access modifiers changed, original: final */
    public final boolean zzr(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            if (TextUtils.isEmpty(str2)) {
                if (this.zzj.zzhw()) {
                    zzab().zzgm().zzao("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
                }
                return false;
            } else if (!zzbn(str2)) {
                zzab().zzgm().zza("Invalid admob_app_id. Analytics disabled.", zzef.zzam(str2));
                return false;
            }
        } else if (!zzbn(str)) {
            if (this.zzj.zzhw()) {
                zzab().zzgm().zza("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", zzef.zzam(str));
            }
            return false;
        }
        return true;
    }

    static boolean zza(String str, String str2, String str3, String str4) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (!isEmpty && !isEmpty2) {
            return !str.equals(str2);
        } else {
            if (isEmpty && isEmpty2) {
                return (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) ? !TextUtils.isEmpty(str4) : !str3.equals(str4);
            } else {
                if (isEmpty || !isEmpty2) {
                    return TextUtils.isEmpty(str3) || !str3.equals(str4);
                } else {
                    if (TextUtils.isEmpty(str4)) {
                        return false;
                    }
                    return TextUtils.isEmpty(str3) || !str3.equals(str4);
                }
            }
        }
    }

    @VisibleForTesting
    private static boolean zzbn(String str) {
        Preconditions.checkNotNull(str);
        return str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$");
    }

    private static Object zza(int i, Object obj, boolean z) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf((long) ((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf((long) ((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf((long) ((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(((Boolean) obj).booleanValue() ? 1 : 0);
        } else if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        } else {
            if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
                return zza(String.valueOf(obj), i, z);
            }
            return null;
        }
    }

    public static String zza(String str, int i, boolean z) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i) {
            return str;
        }
        if (z) {
            return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i))).concat("...");
        }
        return null;
    }

    /* Access modifiers changed, original: final */
    public final Object zzb(String str, Object obj) {
        int i = 256;
        if ("_ev".equals(str)) {
            return zza(256, obj, true);
        }
        if (!zzbq(str)) {
            i = 100;
        }
        return zza(i, obj, false);
    }

    static Bundle[] zzb(Object obj) {
        if (obj instanceof Bundle) {
            return new Bundle[]{(Bundle) obj};
        } else if (obj instanceof Parcelable[]) {
            Parcelable[] parcelableArr = (Parcelable[]) obj;
            return (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
        } else if (!(obj instanceof ArrayList)) {
            return null;
        } else {
            ArrayList arrayList = (ArrayList) obj;
            return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
        }
    }

    /* Access modifiers changed, original: final */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0087  */
    /* JADX WARNING: Missing block: B:23:0x0065, code skipped:
            if (zza(r2, 40, r15) == false) goto L_0x0056;
     */
    /* JADX WARNING: Missing block: B:32:0x007e, code skipped:
            if (zza(r2, 40, r15) == false) goto L_0x0071;
     */
    public final android.os.Bundle zza(java.lang.String r17, java.lang.String r18, android.os.Bundle r19, @androidx.annotation.Nullable java.util.List<java.lang.String> r20, boolean r21, boolean r22) {
        /*
        r16 = this;
        r6 = r16;
        r7 = r17;
        r8 = r19;
        r9 = r20;
        r10 = 0;
        if (r8 == 0) goto L_0x0185;
    L_0x000b:
        r11 = new android.os.Bundle;
        r11.<init>(r8);
        r0 = r16.zzad();
        r1 = com.google.android.gms.measurement.internal.zzak.zziw;
        r0 = r0.zze(r7, r1);
        if (r0 == 0) goto L_0x0026;
    L_0x001c:
        r0 = new java.util.TreeSet;
        r1 = r19.keySet();
        r0.<init>(r1);
        goto L_0x002a;
    L_0x0026:
        r0 = r19.keySet();
    L_0x002a:
        r12 = r0.iterator();
        r14 = 0;
    L_0x002f:
        r0 = r12.hasNext();
        if (r0 == 0) goto L_0x0186;
    L_0x0035:
        r0 = r12.next();
        r15 = r0;
        r15 = (java.lang.String) r15;
        r5 = 40;
        r0 = 3;
        if (r9 == 0) goto L_0x004a;
    L_0x0041:
        r1 = r9.contains(r15);
        if (r1 != 0) goto L_0x0048;
    L_0x0047:
        goto L_0x004a;
    L_0x0048:
        r1 = 0;
        goto L_0x0082;
    L_0x004a:
        r1 = 14;
        r2 = "event param";
        if (r21 == 0) goto L_0x0068;
    L_0x0050:
        r3 = r6.zzp(r2, r15);
        if (r3 != 0) goto L_0x0058;
    L_0x0056:
        r3 = 3;
        goto L_0x0069;
    L_0x0058:
        r3 = r6.zza(r2, r10, r15);
        if (r3 != 0) goto L_0x0061;
    L_0x005e:
        r3 = 14;
        goto L_0x0069;
    L_0x0061:
        r3 = r6.zza(r2, r5, r15);
        if (r3 != 0) goto L_0x0068;
    L_0x0067:
        goto L_0x0056;
    L_0x0068:
        r3 = 0;
    L_0x0069:
        if (r3 != 0) goto L_0x0081;
    L_0x006b:
        r3 = r6.zzq(r2, r15);
        if (r3 != 0) goto L_0x0073;
    L_0x0071:
        r1 = 3;
        goto L_0x0082;
    L_0x0073:
        r3 = r6.zza(r2, r10, r15);
        if (r3 != 0) goto L_0x007a;
    L_0x0079:
        goto L_0x0082;
    L_0x007a:
        r1 = r6.zza(r2, r5, r15);
        if (r1 != 0) goto L_0x0048;
    L_0x0080:
        goto L_0x0071;
    L_0x0081:
        r1 = r3;
    L_0x0082:
        r4 = "_ev";
        r3 = 1;
        if (r1 == 0) goto L_0x009e;
    L_0x0087:
        r2 = zza(r11, r1);
        if (r2 == 0) goto L_0x0099;
    L_0x008d:
        r2 = zza(r15, r5, r3);
        r11.putString(r4, r2);
        if (r1 != r0) goto L_0x0099;
    L_0x0096:
        zzb(r11, r15);
    L_0x0099:
        r11.remove(r15);
        goto L_0x013e;
    L_0x009e:
        r2 = r8.get(r15);
        r16.zzo();
        if (r22 == 0) goto L_0x00dd;
    L_0x00a7:
        r0 = r2 instanceof android.os.Parcelable[];
        if (r0 == 0) goto L_0x00b0;
    L_0x00ab:
        r0 = r2;
        r0 = (android.os.Parcelable[]) r0;
        r0 = r0.length;
        goto L_0x00bb;
    L_0x00b0:
        r0 = r2 instanceof java.util.ArrayList;
        if (r0 == 0) goto L_0x00d4;
    L_0x00b4:
        r0 = r2;
        r0 = (java.util.ArrayList) r0;
        r0 = r0.size();
    L_0x00bb:
        r1 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        if (r0 <= r1) goto L_0x00d4;
    L_0x00bf:
        r1 = r16.zzab();
        r1 = r1.zzgp();
        r0 = java.lang.Integer.valueOf(r0);
        r3 = "param";
        r5 = "Parameter array is too long; discarded. Value kind, name, array length";
        r1.zza(r5, r3, r15, r0);
        r0 = 0;
        goto L_0x00d5;
    L_0x00d4:
        r0 = 1;
    L_0x00d5:
        if (r0 != 0) goto L_0x00dd;
    L_0x00d7:
        r0 = 17;
        r13 = r4;
        r10 = 40;
        goto L_0x011e;
    L_0x00dd:
        r0 = r16.zzad();
        r0 = r0.zzn(r7);
        if (r0 == 0) goto L_0x00ed;
    L_0x00e7:
        r0 = zzbq(r18);
        if (r0 != 0) goto L_0x00f3;
    L_0x00ed:
        r0 = zzbq(r15);
        if (r0 == 0) goto L_0x0107;
    L_0x00f3:
        r3 = 256; // 0x100 float:3.59E-43 double:1.265E-321;
        r1 = "param";
        r0 = r16;
        r5 = r2;
        r2 = r15;
        r10 = 1;
        r13 = r4;
        r4 = r5;
        r10 = 40;
        r5 = r22;
        r0 = r0.zza(r1, r2, r3, r4, r5);
        goto L_0x0119;
    L_0x0107:
        r5 = r2;
        r13 = r4;
        r10 = 40;
        r3 = 100;
        r1 = "param";
        r0 = r16;
        r2 = r15;
        r4 = r5;
        r5 = r22;
        r0 = r0.zza(r1, r2, r3, r4, r5);
    L_0x0119:
        if (r0 == 0) goto L_0x011d;
    L_0x011b:
        r0 = 0;
        goto L_0x011e;
    L_0x011d:
        r0 = 4;
    L_0x011e:
        if (r0 == 0) goto L_0x0141;
    L_0x0120:
        r1 = r13.equals(r15);
        if (r1 != 0) goto L_0x0141;
    L_0x0126:
        r0 = zza(r11, r0);
        if (r0 == 0) goto L_0x013b;
    L_0x012c:
        r0 = 1;
        r0 = zza(r15, r10, r0);
        r11.putString(r13, r0);
        r0 = r8.get(r15);
        zzb(r11, r0);
    L_0x013b:
        r11.remove(r15);
    L_0x013e:
        r10 = 0;
        goto L_0x002f;
    L_0x0141:
        r0 = zzbk(r15);
        if (r0 == 0) goto L_0x0182;
    L_0x0147:
        r14 = r14 + 1;
        r0 = 25;
        if (r14 <= r0) goto L_0x0182;
    L_0x014d:
        r0 = 48;
        r1 = new java.lang.StringBuilder;
        r1.<init>(r0);
        r0 = "Event can't contain more than 25 params";
        r1.append(r0);
        r0 = r1.toString();
        r1 = r16.zzab();
        r1 = r1.zzgm();
        r2 = r16.zzy();
        r3 = r18;
        r2 = r2.zzaj(r3);
        r4 = r16.zzy();
        r4 = r4.zzc(r8);
        r1.zza(r0, r2, r4);
        r0 = 5;
        zza(r11, r0);
        r11.remove(r15);
        goto L_0x013e;
    L_0x0182:
        r3 = r18;
        goto L_0x013e;
    L_0x0185:
        r11 = 0;
    L_0x0186:
        return r11;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzjs.zza(java.lang.String, java.lang.String, android.os.Bundle, java.util.List, boolean, boolean):android.os.Bundle");
    }

    private static boolean zza(Bundle bundle, int i) {
        String str = "_err";
        if (bundle.getLong(str) != 0) {
            return false;
        }
        bundle.putLong(str, (long) i);
        return true;
    }

    private static void zzb(Bundle bundle, Object obj) {
        Preconditions.checkNotNull(bundle);
        if (obj == null) {
            return;
        }
        if ((obj instanceof String) || (obj instanceof CharSequence)) {
            bundle.putLong("_el", (long) String.valueOf(obj).length());
        }
    }

    private static int zzbo(String str) {
        if ("_ldl".equals(str)) {
            return 2048;
        }
        return "_id".equals(str) ? 256 : 36;
    }

    /* Access modifiers changed, original: final */
    public final int zzc(String str, Object obj) {
        boolean zza;
        if ("_ldl".equals(str)) {
            zza = zza("user property referrer", str, zzbo(str), obj, false);
        } else {
            zza = zza("user property", str, zzbo(str), obj, false);
        }
        return zza ? 0 : 7;
    }

    /* Access modifiers changed, original: final */
    public final Object zzd(String str, Object obj) {
        if ("_ldl".equals(str)) {
            return zza(zzbo(str), obj, true);
        }
        return zza(zzbo(str), obj, false);
    }

    /* Access modifiers changed, original: final */
    public final void zza(Bundle bundle, String str, Object obj) {
        if (bundle != null) {
            if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof String) {
                bundle.putString(str, String.valueOf(obj));
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else {
                if (str != null) {
                    zzab().zzgp().zza("Not putting event parameter. Invalid value type. name, type", zzy().zzak(str), obj != null ? obj.getClass().getSimpleName() : null);
                }
            }
        }
    }

    public final void zza(int i, String str, String str2, int i2) {
        zza(null, i, str, str2, i2);
    }

    /* Access modifiers changed, original: final */
    public final void zza(String str, int i, String str2, String str3, int i2) {
        Bundle bundle = new Bundle();
        zza(bundle, i);
        if (zzad().zze(str, zzak.zzip)) {
            if (!(TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3))) {
                bundle.putString(str2, str3);
            }
        } else if (!TextUtils.isEmpty(str2)) {
            bundle.putString(str2, str3);
        }
        if (i == 6 || i == 7 || i == 2) {
            bundle.putLong("_el", (long) i2);
        }
        this.zzj.zzae();
        this.zzj.zzq().logEvent("auto", "_err", bundle);
    }

    static MessageDigest getMessageDigest() {
        int i = 0;
        while (i < 2) {
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                if (instance != null) {
                    return instance;
                }
                i++;
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }

    @VisibleForTesting
    static long zzd(byte[] bArr) {
        Preconditions.checkNotNull(bArr);
        long j = null;
        Preconditions.checkState(bArr.length > 0);
        long j2 = 0;
        int length = bArr.length - 1;
        while (length >= 0 && length >= bArr.length - 8) {
            j2 += (((long) bArr[length]) & 255) << j;
            j += 8;
            length--;
        }
        return j2;
    }

    static boolean zzb(Context context, boolean z) {
        Preconditions.checkNotNull(context);
        if (VERSION.SDK_INT >= 24) {
            return zzb(context, "com.google.android.gms.measurement.AppMeasurementJobService");
        }
        return zzb(context, "com.google.android.gms.measurement.AppMeasurementService");
    }

    private static boolean zzb(Context context, String str) {
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 0);
            if (serviceInfo != null && serviceInfo.enabled) {
                return true;
            }
            return false;
        } catch (NameNotFoundException unused) {
        }
    }

    /* Access modifiers changed, original: final */
    @WorkerThread
    public final boolean zzbp(String str) {
        zzo();
        if (Wrappers.packageManager(getContext()).checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        zzab().zzgr().zza("Permission not granted", str);
        return false;
    }

    static boolean zzbq(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    static boolean zzs(String str, String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        return str == null ? false : str.equals(str2);
    }

    static boolean zza(Boolean bool, Boolean bool2) {
        if (bool == null && bool2 == null) {
            return true;
        }
        return bool == null ? false : bool.equals(bool2);
    }

    static boolean zzb(@Nullable List<String> list, @Nullable List<String> list2) {
        if (list == null && list2 == null) {
            return true;
        }
        return list == null ? false : list.equals(list2);
    }

    /* Access modifiers changed, original: final */
    public final boolean zzbr(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String zzbu = zzad().zzbu();
        zzae();
        return zzbu.equals(str);
    }

    /* Access modifiers changed, original: final */
    public final Bundle zzg(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object zzb = zzb(str, bundle.get(str));
                if (zzb == null) {
                    zzab().zzgp().zza("Param value can't be null", zzy().zzak(str));
                } else {
                    zza(bundle2, str, zzb);
                }
            }
        }
        return bundle2;
    }

    /* Access modifiers changed, original: final */
    public final zzai zza(String str, String str2, Bundle bundle, String str3, long j, boolean z, boolean z2) {
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (zzbl(str2) == 0) {
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            Object obj = "_o";
            bundle2.putString(obj, str3);
            return new zzai(str2, new zzah(zzg(zza(str, str2, bundle2, CollectionUtils.listOf(obj), false, false))), str3, j);
        }
        zzab().zzgk().zza("Invalid conditional property event name", zzy().zzal(str2));
        throw new IllegalArgumentException();
    }

    /* Access modifiers changed, original: final */
    @WorkerThread
    public final long zzc(Context context, String str) {
        zzo();
        Preconditions.checkNotNull(context);
        Preconditions.checkNotEmpty(str);
        PackageManager packageManager = context.getPackageManager();
        MessageDigest messageDigest = getMessageDigest();
        if (messageDigest == null) {
            zzab().zzgk().zzao("Could not get MD5 instance");
            return -1;
        }
        if (packageManager != null) {
            try {
                if (!zzd(context, str)) {
                    PackageInfo packageInfo = Wrappers.packageManager(context).getPackageInfo(getContext().getPackageName(), 64);
                    if (packageInfo.signatures != null && packageInfo.signatures.length > 0) {
                        return zzd(messageDigest.digest(packageInfo.signatures[0].toByteArray()));
                    }
                    zzab().zzgn().zzao("Could not get signatures");
                    return -1;
                }
            } catch (NameNotFoundException e) {
                zzab().zzgk().zza("Package name not found", e);
            }
        }
        return 0;
    }

    @VisibleForTesting
    private final boolean zzd(Context context, String str) {
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo packageInfo = Wrappers.packageManager(context).getPackageInfo(str, 64);
            if (!(packageInfo == null || packageInfo.signatures == null || packageInfo.signatures.length <= 0)) {
                return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(packageInfo.signatures[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
            }
        } catch (CertificateException e) {
            zzab().zzgk().zza("Error obtaining certificate", e);
        } catch (NameNotFoundException e2) {
            zzab().zzgk().zza("Package name not found", e2);
        }
        return true;
    }

    static byte[] zza(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            byte[] marshall = obtain.marshall();
            return marshall;
        } finally {
            obtain.recycle();
        }
    }

    public static Bundle zzh(Bundle bundle) {
        if (bundle == null) {
            return new Bundle();
        }
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle2.keySet()) {
            Object obj = bundle2.get(str);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str, new Bundle((Bundle) obj));
            } else {
                int i = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i < parcelableArr.length) {
                        if (parcelableArr[i] instanceof Bundle) {
                            parcelableArr[i] = new Bundle((Bundle) parcelableArr[i]);
                        }
                        i++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i < list.size()) {
                        Object obj2 = list.get(i);
                        if (obj2 instanceof Bundle) {
                            list.set(i, new Bundle((Bundle) obj2));
                        }
                        i++;
                    }
                }
            }
        }
        return bundle2;
    }

    public final int zzjx() {
        if (this.zztz == null) {
            this.zztz = Integer.valueOf(GoogleApiAvailabilityLight.getInstance().getApkVersion(getContext()) / 1000);
        }
        return this.zztz.intValue();
    }

    public final int zzd(int i) {
        return GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(getContext(), GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }

    public static long zzc(long j, long j2) {
        return (j + (j2 * 60000)) / 86400000;
    }

    /* Access modifiers changed, original: final */
    @WorkerThread
    public final String zzjy() {
        zzjw().nextBytes(new byte[16]);
        return String.format(Locale.US, "%032x", new Object[]{new BigInteger(1, r0)});
    }

    /* Access modifiers changed, original: final */
    @WorkerThread
    public final void zzb(Bundle bundle, long j) {
        String str = "_et";
        long j2 = bundle.getLong(str);
        if (j2 != 0) {
            zzab().zzgn().zza("Params already contained engagement", Long.valueOf(j2));
        }
        bundle.putLong(str, j + j2);
    }

    public final void zzb(zzp zzp, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            zzp.zzb(bundle);
        } catch (RemoteException e) {
            this.zzj.zzab().zzgn().zza("Error returning string value to wrapper", e);
        }
    }

    public final void zza(zzp zzp, long j) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j);
        try {
            zzp.zzb(bundle);
        } catch (RemoteException e) {
            this.zzj.zzab().zzgn().zza("Error returning long value to wrapper", e);
        }
    }

    public final void zza(zzp zzp, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i);
        try {
            zzp.zzb(bundle);
        } catch (RemoteException e) {
            this.zzj.zzab().zzgn().zza("Error returning int value to wrapper", e);
        }
    }

    public final void zza(zzp zzp, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            zzp.zzb(bundle);
        } catch (RemoteException e) {
            this.zzj.zzab().zzgn().zza("Error returning byte array to wrapper", e);
        }
    }

    public final void zza(zzp zzp, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z);
        try {
            zzp.zzb(bundle);
        } catch (RemoteException e) {
            this.zzj.zzab().zzgn().zza("Error returning boolean value to wrapper", e);
        }
    }

    public final void zza(zzp zzp, Bundle bundle) {
        try {
            zzp.zzb(bundle);
        } catch (RemoteException e) {
            this.zzj.zzab().zzgn().zza("Error returning bundle value to wrapper", e);
        }
    }

    public static Bundle zzc(List<zzjn> list) {
        Bundle bundle = new Bundle();
        if (list == null) {
            return bundle;
        }
        for (zzjn zzjn : list) {
            if (zzjn.zzkr != null) {
                bundle.putString(zzjn.name, zzjn.zzkr);
            } else if (zzjn.zzts != null) {
                bundle.putLong(zzjn.name, zzjn.zzts.longValue());
            } else if (zzjn.zztu != null) {
                bundle.putDouble(zzjn.name, zzjn.zztu.doubleValue());
            }
        }
        return bundle;
    }

    public final void zza(zzp zzp, ArrayList<Bundle> arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            zzp.zzb(bundle);
        } catch (RemoteException e) {
            this.zzj.zzab().zzgn().zza("Error returning bundle list to wrapper", e);
        }
    }

    public static ArrayList<Bundle> zzd(List<zzq> list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (zzq zzq : list) {
            Bundle bundle = new Bundle();
            bundle.putString("app_id", zzq.packageName);
            bundle.putString(ConditionalUserProperty.ORIGIN, zzq.origin);
            bundle.putLong(ConditionalUserProperty.CREATION_TIMESTAMP, zzq.creationTimestamp);
            bundle.putString(ConditionalUserProperty.NAME, zzq.zzdw.name);
            zzgg.zza(bundle, zzq.zzdw.getValue());
            bundle.putBoolean(ConditionalUserProperty.ACTIVE, zzq.active);
            if (zzq.triggerEventName != null) {
                bundle.putString(ConditionalUserProperty.TRIGGER_EVENT_NAME, zzq.triggerEventName);
            }
            if (zzq.zzdx != null) {
                bundle.putString(ConditionalUserProperty.TIMED_OUT_EVENT_NAME, zzq.zzdx.name);
                if (zzq.zzdx.zzfq != null) {
                    bundle.putBundle(ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, zzq.zzdx.zzfq.zzcv());
                }
            }
            bundle.putLong(ConditionalUserProperty.TRIGGER_TIMEOUT, zzq.triggerTimeout);
            if (zzq.zzdy != null) {
                bundle.putString(ConditionalUserProperty.TRIGGERED_EVENT_NAME, zzq.zzdy.name);
                if (zzq.zzdy.zzfq != null) {
                    bundle.putBundle(ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, zzq.zzdy.zzfq.zzcv());
                }
            }
            bundle.putLong(ConditionalUserProperty.TRIGGERED_TIMESTAMP, zzq.zzdw.zztr);
            bundle.putLong(ConditionalUserProperty.TIME_TO_LIVE, zzq.timeToLive);
            if (zzq.zzdz != null) {
                bundle.putString(ConditionalUserProperty.EXPIRED_EVENT_NAME, zzq.zzdz.name);
                if (zzq.zzdz.zzfq != null) {
                    bundle.putBundle(ConditionalUserProperty.EXPIRED_EVENT_PARAMS, zzq.zzdz.zzfq.zzcv());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public final URL zza(long j, @NonNull String str, @NonNull String str2) {
        try {
            Preconditions.checkNotEmpty(str2);
            Preconditions.checkNotEmpty(str);
            r1 = new Object[3];
            r1[0] = String.format("v%s.%s", new Object[]{Long.valueOf(j), Integer.valueOf(zzjx())});
            r1[1] = str2;
            r1[2] = str;
            return new URL(String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s", r1));
        } catch (IllegalArgumentException | MalformedURLException e) {
            zzab().zzgk().zza("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        }
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
