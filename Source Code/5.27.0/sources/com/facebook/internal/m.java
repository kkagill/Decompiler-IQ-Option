package com.facebook.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.Map;

/* compiled from: ImageDownloader */
public class m {
    private static Handler handler;
    private static ac yT = new ac(8);
    private static ac yU = new ac(2);
    private static final Map<d, c> yV = new HashMap();

    /* compiled from: ImageDownloader */
    private static class a implements Runnable {
        private Context context;
        private d za;
        private boolean zb;

        a(Context context, d dVar, boolean z) {
            this.context = context;
            this.za = dVar;
            this.zb = z;
        }

        public void run() {
            m.a(this.za, this.context, this.zb);
        }
    }

    /* compiled from: ImageDownloader */
    private static class b implements Runnable {
        private Context context;
        private d za;

        b(Context context, d dVar) {
            this.context = context;
            this.za = dVar;
        }

        public void run() {
            m.a(this.za, this.context);
        }
    }

    /* compiled from: ImageDownloader */
    private static class c {
        com.facebook.internal.ac.a zc;
        n zd;
        boolean ze;

        private c() {
        }

        /* synthetic */ c(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    /* compiled from: ImageDownloader */
    private static class d {
        Object tag;
        Uri uri;

        d(Uri uri, Object obj) {
            this.uri = uri;
            this.tag = obj;
        }

        public int hashCode() {
            return ((1073 + this.uri.hashCode()) * 37) + this.tag.hashCode();
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (dVar.uri == this.uri && dVar.tag == this.tag) {
                return true;
            }
            return false;
        }
    }

    public static void a(n nVar) {
        if (nVar != null) {
            d dVar = new d(nVar.kj(), nVar.km());
            synchronized (yV) {
                c cVar = (c) yV.get(dVar);
                if (cVar != null) {
                    cVar.zd = nVar;
                    cVar.ze = false;
                    cVar.zc.moveToFront();
                } else {
                    a(nVar, dVar, nVar.kl());
                }
            }
        }
    }

    public static boolean b(n nVar) {
        boolean z;
        d dVar = new d(nVar.kj(), nVar.km());
        synchronized (yV) {
            c cVar = (c) yV.get(dVar);
            z = true;
            if (cVar == null) {
                z = false;
            } else if (cVar.zc.cancel()) {
                yV.remove(dVar);
            } else {
                cVar.ze = true;
            }
        }
        return z;
    }

    private static void a(n nVar, d dVar, boolean z) {
        a(nVar, dVar, yU, new a(nVar.getContext(), dVar, z));
    }

    private static void a(n nVar, d dVar) {
        a(nVar, dVar, yT, new b(nVar.getContext(), dVar));
    }

    private static void a(n nVar, d dVar, ac acVar, Runnable runnable) {
        synchronized (yV) {
            c cVar = new c();
            cVar.zd = nVar;
            yV.put(dVar, cVar);
            cVar.zc = acVar.c(runnable);
        }
    }

    private static void a(d dVar, Exception exception, Bitmap bitmap, boolean z) {
        c a = a(dVar);
        if (a != null && !a.ze) {
            final n nVar = a.zd;
            final com.facebook.internal.n.b kk = nVar.kk();
            if (kk != null) {
                final Exception exception2 = exception;
                final boolean z2 = z;
                final Bitmap bitmap2 = bitmap;
                getHandler().post(new Runnable() {
                    public void run() {
                        kk.a(new o(nVar, exception2, z2, bitmap2));
                    }
                });
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x0017  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x001f  */
    private static void a(com.facebook.internal.m.d r2, android.content.Context r3, boolean r4) {
        /*
        r0 = 0;
        r1 = 0;
        if (r4 == 0) goto L_0x0014;
    L_0x0004:
        r4 = r2.uri;
        r4 = com.facebook.internal.y.e(r4);
        if (r4 == 0) goto L_0x0014;
    L_0x000c:
        r4 = com.facebook.internal.p.a(r4, r3);
        if (r4 == 0) goto L_0x0015;
    L_0x0012:
        r0 = 1;
        goto L_0x0015;
    L_0x0014:
        r4 = r1;
    L_0x0015:
        if (r0 != 0) goto L_0x001d;
    L_0x0017:
        r4 = r2.uri;
        r4 = com.facebook.internal.p.a(r4, r3);
    L_0x001d:
        if (r4 == 0) goto L_0x002a;
    L_0x001f:
        r3 = android.graphics.BitmapFactory.decodeStream(r4);
        com.facebook.internal.z.closeQuietly(r4);
        a(r2, r1, r3, r0);
        goto L_0x0039;
    L_0x002a:
        r3 = a(r2);
        if (r3 == 0) goto L_0x0039;
    L_0x0030:
        r4 = r3.ze;
        if (r4 != 0) goto L_0x0039;
    L_0x0034:
        r3 = r3.zd;
        a(r3, r2);
    L_0x0039:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.m.a(com.facebook.internal.m$d, android.content.Context, boolean):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:55:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:55:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a2 A:{ExcHandler: all (th java.lang.Throwable), Splitter:B:3:0x0014} */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:55:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing block: B:34:0x008f, code skipped:
            r4 = e;
     */
    /* JADX WARNING: Missing block: B:35:0x0090, code skipped:
            r10 = null;
            r2 = null;
     */
    /* JADX WARNING: Missing block: B:41:0x00a2, code skipped:
            r9 = th;
     */
    private static void a(com.facebook.internal.m.d r9, android.content.Context r10) {
        /*
        r0 = 0;
        r1 = 0;
        r2 = 1;
        r3 = new java.net.URL;	 Catch:{ IOException -> 0x00b0, all -> 0x00a7 }
        r4 = r9.uri;	 Catch:{ IOException -> 0x00b0, all -> 0x00a7 }
        r4 = r4.toString();	 Catch:{ IOException -> 0x00b0, all -> 0x00a7 }
        r3.<init>(r4);	 Catch:{ IOException -> 0x00b0, all -> 0x00a7 }
        r3 = r3.openConnection();	 Catch:{ IOException -> 0x00b0, all -> 0x00a7 }
        r3 = (java.net.HttpURLConnection) r3;	 Catch:{ IOException -> 0x00b0, all -> 0x00a7 }
        r3.setInstanceFollowRedirects(r1);	 Catch:{ IOException -> 0x00a4, all -> 0x00a2 }
        r4 = r3.getResponseCode();	 Catch:{ IOException -> 0x00a4, all -> 0x00a2 }
        r5 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        if (r4 == r5) goto L_0x0093;
    L_0x001f:
        r10 = 301; // 0x12d float:4.22E-43 double:1.487E-321;
        if (r4 == r10) goto L_0x0060;
    L_0x0023:
        r10 = 302; // 0x12e float:4.23E-43 double:1.49E-321;
        if (r4 == r10) goto L_0x0060;
    L_0x0027:
        r10 = r3.getErrorStream();	 Catch:{ IOException -> 0x00a4, all -> 0x00a2 }
        r4 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x005e, all -> 0x005b }
        r4.<init>();	 Catch:{ IOException -> 0x005e, all -> 0x005b }
        if (r10 == 0) goto L_0x004a;
    L_0x0032:
        r5 = new java.io.InputStreamReader;	 Catch:{ IOException -> 0x005e, all -> 0x005b }
        r5.<init>(r10);	 Catch:{ IOException -> 0x005e, all -> 0x005b }
        r6 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        r6 = new char[r6];	 Catch:{ IOException -> 0x005e, all -> 0x005b }
    L_0x003b:
        r7 = r6.length;	 Catch:{ IOException -> 0x005e, all -> 0x005b }
        r7 = r5.read(r6, r1, r7);	 Catch:{ IOException -> 0x005e, all -> 0x005b }
        if (r7 <= 0) goto L_0x0046;
    L_0x0042:
        r4.append(r6, r1, r7);	 Catch:{ IOException -> 0x005e, all -> 0x005b }
        goto L_0x003b;
    L_0x0046:
        com.facebook.internal.z.closeQuietly(r5);	 Catch:{ IOException -> 0x005e, all -> 0x005b }
        goto L_0x004f;
    L_0x004a:
        r5 = "Unexpected error while downloading an image.";
        r4.append(r5);	 Catch:{ IOException -> 0x005e, all -> 0x005b }
    L_0x004f:
        r5 = new com.facebook.FacebookException;	 Catch:{ IOException -> 0x005e, all -> 0x005b }
        r4 = r4.toString();	 Catch:{ IOException -> 0x005e, all -> 0x005b }
        r5.<init>(r4);	 Catch:{ IOException -> 0x005e, all -> 0x005b }
        r4 = r0;
        r0 = r5;
        goto L_0x009b;
    L_0x005b:
        r9 = move-exception;
        r0 = r10;
        goto L_0x00a9;
    L_0x005e:
        r4 = move-exception;
        goto L_0x00b3;
    L_0x0060:
        r10 = "location";
        r10 = r3.getHeaderField(r10);	 Catch:{ IOException -> 0x008f, all -> 0x00a2 }
        r2 = com.facebook.internal.z.aB(r10);	 Catch:{ IOException -> 0x008f, all -> 0x00a2 }
        if (r2 != 0) goto L_0x008b;
    L_0x006c:
        r10 = android.net.Uri.parse(r10);	 Catch:{ IOException -> 0x008f, all -> 0x00a2 }
        r2 = r9.uri;	 Catch:{ IOException -> 0x008f, all -> 0x00a2 }
        com.facebook.internal.y.a(r2, r10);	 Catch:{ IOException -> 0x008f, all -> 0x00a2 }
        r2 = a(r9);	 Catch:{ IOException -> 0x008f, all -> 0x00a2 }
        if (r2 == 0) goto L_0x008b;
    L_0x007b:
        r4 = r2.ze;	 Catch:{ IOException -> 0x008f, all -> 0x00a2 }
        if (r4 != 0) goto L_0x008b;
    L_0x007f:
        r2 = r2.zd;	 Catch:{ IOException -> 0x008f, all -> 0x00a2 }
        r4 = new com.facebook.internal.m$d;	 Catch:{ IOException -> 0x008f, all -> 0x00a2 }
        r5 = r9.tag;	 Catch:{ IOException -> 0x008f, all -> 0x00a2 }
        r4.<init>(r10, r5);	 Catch:{ IOException -> 0x008f, all -> 0x00a2 }
        a(r2, r4, r1);	 Catch:{ IOException -> 0x008f, all -> 0x00a2 }
    L_0x008b:
        r10 = r0;
        r4 = r10;
        r2 = 0;
        goto L_0x009b;
    L_0x008f:
        r4 = move-exception;
        r10 = r0;
        r2 = 0;
        goto L_0x00b3;
    L_0x0093:
        r10 = com.facebook.internal.p.a(r10, r3);	 Catch:{ IOException -> 0x00a4, all -> 0x00a2 }
        r4 = android.graphics.BitmapFactory.decodeStream(r10);	 Catch:{ IOException -> 0x005e, all -> 0x005b }
    L_0x009b:
        com.facebook.internal.z.closeQuietly(r10);
        com.facebook.internal.z.a(r3);
        goto L_0x00bc;
    L_0x00a2:
        r9 = move-exception;
        goto L_0x00a9;
    L_0x00a4:
        r4 = move-exception;
        r10 = r0;
        goto L_0x00b3;
    L_0x00a7:
        r9 = move-exception;
        r3 = r0;
    L_0x00a9:
        com.facebook.internal.z.closeQuietly(r0);
        com.facebook.internal.z.a(r3);
        throw r9;
    L_0x00b0:
        r4 = move-exception;
        r10 = r0;
        r3 = r10;
    L_0x00b3:
        com.facebook.internal.z.closeQuietly(r10);
        com.facebook.internal.z.a(r3);
        r8 = r4;
        r4 = r0;
        r0 = r8;
    L_0x00bc:
        if (r2 == 0) goto L_0x00c1;
    L_0x00be:
        a(r9, r0, r4, r1);
    L_0x00c1:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.m.a(com.facebook.internal.m$d, android.content.Context):void");
    }

    private static synchronized Handler getHandler() {
        Handler handler;
        synchronized (m.class) {
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            handler = handler;
        }
        return handler;
    }

    private static c a(d dVar) {
        c cVar;
        synchronized (yV) {
            cVar = (c) yV.remove(dVar);
        }
        return cVar;
    }
}
