package jumio.nv.nfc;

import com.jumio.commons.log.Log;
import com.jumio.commons.obfuscate.StringObfuscater;
import com.jumio.core.network.DownloadTask;
import com.jumio.core.network.DownloadTask.ProgressListener;
import com.jumio.nv.environment.NVEnvironment;
import com.jumio.nv.models.ServerSettingsModel;
import java.io.File;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ExecutionException;
import org.jmrtd.e;

/* compiled from: CertificateDatabase */
public class h implements ProgressListener {
    private static Map<String, X509Certificate> a;
    private static final Object c = new Object();
    private CertificateFactory b;
    private ServerSettingsModel d;

    /* compiled from: CertificateDatabase */
    class a extends DownloadTask {
        public a(String str, byte[] bArr) {
            super(str, bArr);
        }

        /* Access modifiers changed, original: protected|varargs */
        public byte[] doInBackground(Void... voidArr) {
            synchronized (h.c) {
                if (h.a != null) {
                    Log.d("CertificateDatabase", "no need to download - skip");
                    return null;
                }
                h.a = new HashMap();
                byte[] doInBackground = super.doInBackground(voidArr);
                return doInBackground;
            }
        }

        /* Access modifiers changed, original: protected */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x005f A:{Catch:{ Exception -> 0x008d }} */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0064 A:{Catch:{ Exception -> 0x008d }} */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x009e A:{SYNTHETIC, Splitter:B:42:0x009e} */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x00aa A:{SYNTHETIC, Splitter:B:49:0x00aa} */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x005f A:{Catch:{ Exception -> 0x008d }} */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0064 A:{Catch:{ Exception -> 0x008d }} */
        public byte[] processInputStream(java.io.InputStream r8, int r9) {
            /*
            r7 = this;
            r9 = "";
            r0 = "CertificateDatabase";
            r1 = 0;
            r2 = new java.util.zip.ZipInputStream;	 Catch:{ Exception -> 0x0092, all -> 0x008f }
            r2.<init>(r8);	 Catch:{ Exception -> 0x0092, all -> 0x008f }
        L_0x000a:
            r8 = r2.getNextEntry();	 Catch:{ Exception -> 0x008d }
            if (r8 == 0) goto L_0x0068;
        L_0x0010:
            r3 = r8.getName();	 Catch:{ Exception -> 0x008d }
            r4 = ".";
            r7.a(r3, r4);	 Catch:{ Exception -> 0x008d }
            r3 = new java.io.ByteArrayOutputStream;	 Catch:{ all -> 0x005a }
            r3.<init>();	 Catch:{ all -> 0x005a }
            r4 = 1024; // 0x400 float:1.435E-42 double:5.06E-321;
            r4 = new byte[r4];	 Catch:{ all -> 0x0057 }
        L_0x0022:
            r5 = r2.read(r4);	 Catch:{ all -> 0x0057 }
            r6 = -1;
            if (r5 == r6) goto L_0x002e;
        L_0x0029:
            r6 = 0;
            r3.write(r4, r6, r5);	 Catch:{ all -> 0x0057 }
            goto L_0x0022;
        L_0x002e:
            r4 = new java.io.ByteArrayInputStream;	 Catch:{ all -> 0x0057 }
            r5 = r3.toByteArray();	 Catch:{ all -> 0x0057 }
            r4.<init>(r5);	 Catch:{ all -> 0x0057 }
            r5 = jumio.nv.nfc.h.this;	 Catch:{ all -> 0x0055 }
            r5 = r5.b;	 Catch:{ all -> 0x0055 }
            r5 = r5.generateCertificate(r4);	 Catch:{ all -> 0x0055 }
            r5 = (java.security.cert.X509Certificate) r5;	 Catch:{ all -> 0x0055 }
            r6 = jumio.nv.nfc.h.a;	 Catch:{ all -> 0x0055 }
            r8 = r8.getName();	 Catch:{ all -> 0x0055 }
            r6.put(r8, r5);	 Catch:{ all -> 0x0055 }
            r4.close();	 Catch:{ Exception -> 0x008d }
            r3.close();	 Catch:{ Exception -> 0x008d }
            goto L_0x000a;
        L_0x0055:
            r8 = move-exception;
            goto L_0x005d;
        L_0x0057:
            r8 = move-exception;
            r4 = r1;
            goto L_0x005d;
        L_0x005a:
            r8 = move-exception;
            r3 = r1;
            r4 = r3;
        L_0x005d:
            if (r4 == 0) goto L_0x0062;
        L_0x005f:
            r4.close();	 Catch:{ Exception -> 0x008d }
        L_0x0062:
            if (r3 == 0) goto L_0x0067;
        L_0x0064:
            r3.close();	 Catch:{ Exception -> 0x008d }
        L_0x0067:
            throw r8;	 Catch:{ Exception -> 0x008d }
        L_0x0068:
            r8 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x008d }
            r8.<init>();	 Catch:{ Exception -> 0x008d }
            r3 = "downloaded ";
            r8.append(r3);	 Catch:{ Exception -> 0x008d }
            r3 = jumio.nv.nfc.h.a;	 Catch:{ Exception -> 0x008d }
            r3 = r3.size();	 Catch:{ Exception -> 0x008d }
            r8.append(r3);	 Catch:{ Exception -> 0x008d }
            r3 = " certificates";
            r8.append(r3);	 Catch:{ Exception -> 0x008d }
            r8 = r8.toString();	 Catch:{ Exception -> 0x008d }
            com.jumio.commons.log.Log.d(r0, r8);	 Catch:{ Exception -> 0x008d }
            r2.close();	 Catch:{ IOException -> 0x00a2 }
            goto L_0x00a6;
        L_0x008d:
            r8 = move-exception;
            goto L_0x0094;
        L_0x008f:
            r8 = move-exception;
            r2 = r1;
            goto L_0x00a8;
        L_0x0092:
            r8 = move-exception;
            r2 = r1;
        L_0x0094:
            jumio.nv.nfc.h.a = r1;	 Catch:{ all -> 0x00a7 }
            r3 = "error reading certificate files";
            com.jumio.commons.log.Log.e(r0, r3, r8);	 Catch:{ all -> 0x00a7 }
            if (r2 == 0) goto L_0x00a6;
        L_0x009e:
            r2.close();	 Catch:{ IOException -> 0x00a2 }
            goto L_0x00a6;
        L_0x00a2:
            r8 = move-exception;
            com.jumio.commons.log.Log.e(r0, r9, r8);
        L_0x00a6:
            return r1;
        L_0x00a7:
            r8 = move-exception;
        L_0x00a8:
            if (r2 == 0) goto L_0x00b2;
        L_0x00aa:
            r2.close();	 Catch:{ IOException -> 0x00ae }
            goto L_0x00b2;
        L_0x00ae:
            r1 = move-exception;
            com.jumio.commons.log.Log.e(r0, r9, r1);
        L_0x00b2:
            goto L_0x00b4;
        L_0x00b3:
            throw r8;
        L_0x00b4:
            goto L_0x00b3;
            */
            throw new UnsupportedOperationException("Method not decompiled: jumio.nv.nfc.h$a.processInputStream(java.io.InputStream, int):byte[]");
        }

        private String a(String str, String str2) {
            str = new File(str).getCanonicalPath();
            if (str.startsWith(new File(str2).getCanonicalPath())) {
                return str;
            }
            throw new IllegalStateException("File is outside extraction target directory.");
        }
    }

    public void onProgressDone(byte[] bArr) {
    }

    public void onProgressException(Exception exception) {
    }

    public void onProgressUpdate(float f) {
    }

    public h(boolean z, ServerSettingsModel serverSettingsModel) {
        this.d = serverSettingsModel;
        try {
            this.b = CertificateFactory.getInstance("X.509", e.bQZ());
        } catch (Exception unused) {
            this.b = CertificateFactory.getInstance("X.509");
        }
        Log.d("CertificateDatabase", "ctor() -> downloadIfNecessary");
        if (z) {
            synchronized (c) {
                a = null;
            }
        }
        a(true);
    }

    public h(ServerSettingsModel serverSettingsModel) {
        this(false, serverSettingsModel);
    }

    public boolean a(String str) {
        Log.d("CertificateDatabase", "contains() -> downloadIfNecessary");
        a(false);
        List b = b(str);
        if (b == null || b.isEmpty()) {
            return false;
        }
        return true;
    }

    public List<X509Certificate> b(String str) {
        Log.d("CertificateDatabase", "get() -> downloadIfNecessary");
        a(false);
        return c(str);
    }

    private List<X509Certificate> c(String str) {
        str = str.toLowerCase();
        ArrayList arrayList = new ArrayList();
        Map map = a;
        if (map != null) {
            for (Entry entry : map.entrySet()) {
                String str2 = (String) entry.getKey();
                X509Certificate x509Certificate = (X509Certificate) entry.getValue();
                if (str2.toLowerCase().startsWith(str) && str2.toLowerCase().endsWith(".cer")) {
                    arrayList.add(x509Certificate);
                }
            }
        }
        return arrayList;
    }

    private void a(boolean z) {
        String str = "CertificateDatabase";
        Log.d(str, "    starting downloadIfNecessary");
        if (a != null) {
            Log.d(str, "    don't download, already there");
            return;
        }
        ServerSettingsModel serverSettingsModel = this.d;
        if (serverSettingsModel == null || !serverSettingsModel.isCdnUsable()) {
            Log.d(str, "    don't download,cdn not usable");
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(NVEnvironment.CDN_URL);
        stringBuilder.append(StringObfuscater.format(new byte[]{(byte) 45, (byte) -7, (byte) 10, (byte) 60, (byte) 37, (byte) -100, (byte) -26, (byte) -3, (byte) 27, (byte) -41, (byte) -112, (byte) 38, (byte) -16, (byte) -62, (byte) 92, (byte) 110, (byte) 4, (byte) 43, (byte) -100, (byte) -58, (byte) 2, (byte) 47, (byte) -99, (byte) -23, (byte) 123, (byte) -18, (byte) -75, (byte) 54, (byte) -107, (byte) 125, (byte) 88, (byte) 86, (byte) -119, (byte) -110, (byte) 57, (byte) 47}, -8317973204404190915L));
        a aVar = new a(stringBuilder.toString(), this.d.getCdnPublicKey());
        aVar.setListener(this);
        if (z) {
            aVar.execute(new Void[0]);
        } else {
            try {
                aVar.execute(new Void[0]).get();
            } catch (InterruptedException | ExecutionException e) {
                Log.printStackTrace(e);
            }
        }
    }
}
