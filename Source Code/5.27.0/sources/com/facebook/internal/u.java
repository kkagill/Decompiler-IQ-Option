package com.facebook.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.login.DefaultAudience;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: NativeProtocol */
public final class u {
    private static final String TAG = "com.facebook.internal.u";
    private static final List<e> zt = kv();
    private static final List<e> zu = kw();
    private static final Map<String, List<e>> zv = kx();
    private static final AtomicBoolean zw = new AtomicBoolean(false);
    private static final List<Integer> zx = Arrays.asList(new Integer[]{Integer.valueOf(20170417), Integer.valueOf(20160327), Integer.valueOf(20141218), Integer.valueOf(20141107), Integer.valueOf(20141028), Integer.valueOf(20141001), Integer.valueOf(20140701), Integer.valueOf(20140324), Integer.valueOf(20140204), Integer.valueOf(20131107), Integer.valueOf(20130618), Integer.valueOf(20130502), Integer.valueOf(20121101)});

    /* compiled from: NativeProtocol */
    private static abstract class e {
        private TreeSet<Integer> zy;

        public abstract String getPackage();

        public abstract String kC();

        private e() {
        }

        /* synthetic */ e(AnonymousClass1 anonymousClass1) {
            this();
        }

        public TreeSet<Integer> kD() {
            TreeSet treeSet = this.zy;
            if (treeSet == null || treeSet.isEmpty()) {
                G(false);
            }
            return this.zy;
        }

        /* JADX WARNING: Missing block: B:6:0x000d, code skipped:
            if (r0.zy.isEmpty() == false) goto L_0x0015;
     */
        private synchronized void G(boolean r1) {
            /*
            r0 = this;
            monitor-enter(r0);
            if (r1 != 0) goto L_0x000f;
        L_0x0003:
            r1 = r0.zy;	 Catch:{ all -> 0x0017 }
            if (r1 == 0) goto L_0x000f;
        L_0x0007:
            r1 = r0.zy;	 Catch:{ all -> 0x0017 }
            r1 = r1.isEmpty();	 Catch:{ all -> 0x0017 }
            if (r1 == 0) goto L_0x0015;
        L_0x000f:
            r1 = com.facebook.internal.u.a(r0);	 Catch:{ all -> 0x0017 }
            r0.zy = r1;	 Catch:{ all -> 0x0017 }
        L_0x0015:
            monitor-exit(r0);
            return;
        L_0x0017:
            r1 = move-exception;
            monitor-exit(r0);
            throw r1;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.u$e.G(boolean):void");
        }
    }

    /* compiled from: NativeProtocol */
    public static class f {
        private int zA;
        private e zz;

        public static f a(e eVar, int i) {
            f fVar = new f();
            fVar.zz = eVar;
            fVar.zA = i;
            return fVar;
        }

        public static f kE() {
            f fVar = new f();
            fVar.zA = -1;
            return fVar;
        }

        private f() {
        }

        public int kF() {
            return this.zA;
        }
    }

    /* compiled from: NativeProtocol */
    private static class a extends e {
        /* Access modifiers changed, original: protected */
        public String getPackage() {
            return "com.facebook.arstudio.player";
        }

        /* Access modifiers changed, original: protected */
        public String kC() {
            return null;
        }

        private a() {
            super();
        }

        /* synthetic */ a(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    /* compiled from: NativeProtocol */
    private static class b extends e {
        /* Access modifiers changed, original: protected */
        public String getPackage() {
            return "com.facebook.lite";
        }

        /* Access modifiers changed, original: protected */
        public String kC() {
            return "com.facebook.lite.platform.LoginGDPDialogActivity";
        }

        private b() {
            super();
        }

        /* synthetic */ b(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    /* compiled from: NativeProtocol */
    private static class c extends e {
        /* Access modifiers changed, original: protected */
        public String getPackage() {
            return "com.facebook.katana";
        }

        /* Access modifiers changed, original: protected */
        public String kC() {
            return "com.facebook.katana.ProxyAuth";
        }

        private c() {
            super();
        }

        /* synthetic */ c(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    /* compiled from: NativeProtocol */
    private static class d extends e {
        /* Access modifiers changed, original: protected */
        public String getPackage() {
            return "com.facebook.orca";
        }

        /* Access modifiers changed, original: protected */
        public String kC() {
            return null;
        }

        private d() {
            super();
        }

        /* synthetic */ d(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    /* compiled from: NativeProtocol */
    private static class g extends e {
        /* Access modifiers changed, original: protected */
        public String getPackage() {
            return "com.facebook.wakizashi";
        }

        /* Access modifiers changed, original: protected */
        public String kC() {
            return "com.facebook.katana.ProxyAuth";
        }

        private g() {
            super();
        }

        /* synthetic */ g(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    private static List<e> kv() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new c());
        arrayList.add(new g());
        return arrayList;
    }

    private static List<e> kw() {
        ArrayList arrayList = new ArrayList(kv());
        arrayList.add(0, new a());
        return arrayList;
    }

    private static Map<String, List<e>> kx() {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new d());
        hashMap.put("com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG", zt);
        hashMap.put("com.facebook.platform.action.request.FEED_DIALOG", zt);
        hashMap.put("com.facebook.platform.action.request.LIKE_DIALOG", zt);
        hashMap.put("com.facebook.platform.action.request.APPINVITES_DIALOG", zt);
        hashMap.put("com.facebook.platform.action.request.MESSAGE_DIALOG", arrayList);
        hashMap.put("com.facebook.platform.action.request.OGMESSAGEPUBLISH_DIALOG", arrayList);
        hashMap.put("com.facebook.platform.action.request.CAMERA_EFFECT", zu);
        hashMap.put("com.facebook.platform.action.request.SHARE_STORY", zt);
        return hashMap;
    }

    static Intent a(Context context, Intent intent, e eVar) {
        if (intent == null) {
            return null;
        }
        ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, 0);
        if (resolveActivity != null && g.u(context, resolveActivity.activityInfo.packageName)) {
            return intent;
        }
        return null;
    }

    static Intent b(Context context, Intent intent, e eVar) {
        if (intent == null) {
            return null;
        }
        ResolveInfo resolveService = context.getPackageManager().resolveService(intent, 0);
        if (resolveService != null && g.u(context, resolveService.serviceInfo.packageName)) {
            return intent;
        }
        return null;
    }

    public static Intent a(Context context, String str, Collection<String> collection, String str2, boolean z, boolean z2, DefaultAudience defaultAudience, String str3, String str4) {
        e bVar = new b();
        Context context2 = context;
        return a(context, a(bVar, str, (Collection) collection, str2, z, z2, defaultAudience, str3, str4), bVar);
    }

    private static Intent a(e eVar, String str, Collection<String> collection, String str2, boolean z, boolean z2, DefaultAudience defaultAudience, String str3, String str4) {
        String kC = eVar.kC();
        if (kC == null) {
            return null;
        }
        Intent putExtra = new Intent().setClassName(eVar.getPackage(), kC).putExtra("client_id", str);
        putExtra.putExtra("facebook_sdk_version", com.facebook.f.gV());
        if (!z.c((Collection) collection)) {
            putExtra.putExtra("scope", TextUtils.join(",", collection));
        }
        if (!z.aB(str2)) {
            putExtra.putExtra("e2e", str2);
        }
        putExtra.putExtra("state", str3);
        putExtra.putExtra("response_type", "token,signed_request");
        putExtra.putExtra("return_scopes", "true");
        if (z2) {
            putExtra.putExtra("default_audience", defaultAudience.getNativeProtocolAudience());
        }
        putExtra.putExtra("legacy_override", com.facebook.f.gU());
        putExtra.putExtra("auth_type", str4);
        return putExtra;
    }

    public static Intent b(Context context, String str, Collection<String> collection, String str2, boolean z, boolean z2, DefaultAudience defaultAudience, String str3, String str4) {
        for (e eVar : zt) {
            Context context2 = context;
            Intent a = a(context, a(eVar, str, (Collection) collection, str2, z, z2, defaultAudience, str3, str4), eVar);
            if (a != null) {
                return a;
            }
        }
        return null;
    }

    public static final int ky() {
        return ((Integer) zx.get(0)).intValue();
    }

    public static boolean W(int i) {
        return zx.contains(Integer.valueOf(i)) && i >= 20140701;
    }

    public static Intent a(Intent intent, Bundle bundle, FacebookException facebookException) {
        UUID e = e(intent);
        if (e == null) {
            return null;
        }
        Intent intent2 = new Intent();
        intent2.putExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", d(intent));
        Bundle bundle2 = new Bundle();
        bundle2.putString("action_id", e.toString());
        if (facebookException != null) {
            bundle2.putBundle("error", d(facebookException));
        }
        intent2.putExtra("com.facebook.platform.protocol.BRIDGE_ARGS", bundle2);
        if (bundle != null) {
            intent2.putExtra("com.facebook.platform.protocol.RESULT_ARGS", bundle);
        }
        return intent2;
    }

    public static Intent Y(Context context) {
        for (e eVar : zt) {
            Intent b = b(context, new Intent("com.facebook.platform.PLATFORM_SERVICE").setPackage(eVar.getPackage()).addCategory("android.intent.category.DEFAULT"), eVar);
            if (b != null) {
                return b;
            }
        }
        return null;
    }

    public static int d(Intent intent) {
        return intent.getIntExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", 0);
    }

    public static UUID e(Intent intent) {
        UUID uuid = null;
        if (intent == null) {
            return null;
        }
        String string;
        if (W(d(intent))) {
            Bundle bundleExtra = intent.getBundleExtra("com.facebook.platform.protocol.BRIDGE_ARGS");
            string = bundleExtra != null ? bundleExtra.getString("action_id") : null;
        } else {
            string = intent.getStringExtra("com.facebook.platform.protocol.CALL_ID");
        }
        if (string != null) {
            try {
                uuid = UUID.fromString(string);
            } catch (IllegalArgumentException unused) {
            }
        }
        return uuid;
    }

    public static Bundle f(Intent intent) {
        if (W(d(intent))) {
            return intent.getBundleExtra("com.facebook.platform.protocol.METHOD_ARGS");
        }
        return intent.getExtras();
    }

    public static FacebookException l(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        String string = bundle.getString("error_type");
        if (string == null) {
            string = bundle.getString("com.facebook.platform.status.ERROR_TYPE");
        }
        String string2 = bundle.getString("error_description");
        if (string2 == null) {
            string2 = bundle.getString("com.facebook.platform.status.ERROR_DESCRIPTION");
        }
        if (string == null || !string.equalsIgnoreCase("UserCanceled")) {
            return new FacebookException(string2);
        }
        return new FacebookOperationCanceledException(string2);
    }

    public static Bundle d(FacebookException facebookException) {
        if (facebookException == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("error_description", facebookException.toString());
        if (facebookException instanceof FacebookOperationCanceledException) {
            bundle.putString("error_type", "UserCanceled");
        }
        return bundle;
    }

    public static int X(int i) {
        return a(zt, new int[]{i}).kF();
    }

    private static f a(List<e> list, int[] iArr) {
        kz();
        if (list == null) {
            return f.kE();
        }
        for (e eVar : list) {
            int a = a(eVar.kD(), ky(), iArr);
            if (a != -1) {
                return f.a(eVar, a);
            }
        }
        return f.kE();
    }

    public static void kz() {
        if (zw.compareAndSet(false, true)) {
            com.facebook.f.getExecutor().execute(new Runnable() {
                public void run() {
                    try {
                        for (e a : u.zt) {
                            a.G(true);
                        }
                    } finally {
                        u.zw.set(false);
                    }
                }
            });
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0050 */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:15|16) */
    /* JADX WARNING: Missing block: B:16:?, code skipped:
            android.util.Log.e(TAG, r0);
     */
    private static java.util.TreeSet<java.lang.Integer> a(com.facebook.internal.u.e r10) {
        /*
        r0 = "Failed to query content resolver.";
        r1 = new java.util.TreeSet;
        r1.<init>();
        r2 = com.facebook.f.getApplicationContext();
        r3 = r2.getContentResolver();
        r2 = "version";
        r5 = new java.lang.String[]{r2};
        r4 = b(r10);
        r9 = 0;
        r6 = com.facebook.f.getApplicationContext();	 Catch:{ all -> 0x0073 }
        r6 = r6.getPackageManager();	 Catch:{ all -> 0x0073 }
        r7 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0073 }
        r7.<init>();	 Catch:{ all -> 0x0073 }
        r10 = r10.getPackage();	 Catch:{ all -> 0x0073 }
        r7.append(r10);	 Catch:{ all -> 0x0073 }
        r10 = ".provider.PlatformProvider";
        r7.append(r10);	 Catch:{ all -> 0x0073 }
        r10 = r7.toString();	 Catch:{ all -> 0x0073 }
        r7 = 0;
        r10 = r6.resolveContentProvider(r10, r7);	 Catch:{ RuntimeException -> 0x003e }
        goto L_0x0045;
    L_0x003e:
        r10 = move-exception;
        r6 = TAG;	 Catch:{ all -> 0x0073 }
        android.util.Log.e(r6, r0, r10);	 Catch:{ all -> 0x0073 }
        r10 = r9;
    L_0x0045:
        if (r10 == 0) goto L_0x006d;
    L_0x0047:
        r6 = 0;
        r7 = 0;
        r8 = 0;
        r10 = r3.query(r4, r5, r6, r7, r8);	 Catch:{ IllegalArgumentException | NullPointerException | SecurityException -> 0x0050, IllegalArgumentException | NullPointerException | SecurityException -> 0x0050, IllegalArgumentException | NullPointerException | SecurityException -> 0x0050 }
        r9 = r10;
        goto L_0x0055;
    L_0x0050:
        r10 = TAG;	 Catch:{ all -> 0x0073 }
        android.util.Log.e(r10, r0);	 Catch:{ all -> 0x0073 }
    L_0x0055:
        if (r9 == 0) goto L_0x006d;
    L_0x0057:
        r10 = r9.moveToNext();	 Catch:{ all -> 0x0073 }
        if (r10 == 0) goto L_0x006d;
    L_0x005d:
        r10 = r9.getColumnIndex(r2);	 Catch:{ all -> 0x0073 }
        r10 = r9.getInt(r10);	 Catch:{ all -> 0x0073 }
        r10 = java.lang.Integer.valueOf(r10);	 Catch:{ all -> 0x0073 }
        r1.add(r10);	 Catch:{ all -> 0x0073 }
        goto L_0x0057;
    L_0x006d:
        if (r9 == 0) goto L_0x0072;
    L_0x006f:
        r9.close();
    L_0x0072:
        return r1;
    L_0x0073:
        r10 = move-exception;
        if (r9 == 0) goto L_0x0079;
    L_0x0076:
        r9.close();
    L_0x0079:
        goto L_0x007b;
    L_0x007a:
        throw r10;
    L_0x007b:
        goto L_0x007a;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.u.a(com.facebook.internal.u$e):java.util.TreeSet");
    }

    public static int a(TreeSet<Integer> treeSet, int i, int[] iArr) {
        int length = iArr.length - 1;
        Iterator descendingIterator = treeSet.descendingIterator();
        int i2 = -1;
        int i3 = length;
        length = -1;
        while (descendingIterator.hasNext()) {
            int intValue = ((Integer) descendingIterator.next()).intValue();
            length = Math.max(length, intValue);
            while (i3 >= 0 && iArr[i3] > intValue) {
                i3--;
            }
            if (i3 < 0) {
                return -1;
            }
            if (iArr[i3] == intValue) {
                if (i3 % 2 == 0) {
                    i2 = Math.min(length, i);
                }
                return i2;
            }
        }
        return i2;
    }

    private static Uri b(e eVar) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("content://");
        stringBuilder.append(eVar.getPackage());
        stringBuilder.append(".provider.PlatformProvider/versions");
        return Uri.parse(stringBuilder.toString());
    }
}
