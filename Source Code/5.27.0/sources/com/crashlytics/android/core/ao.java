package com.crashlytics.android.core;

import io.fabric.sdk.android.k;
import io.fabric.sdk.android.services.common.h;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* compiled from: ReportUploader */
class ao {
    static final Map<String, String> rQ = Collections.singletonMap("X-CRASHLYTICS-INVALID-SESSION", "1");
    private static final short[] rR = new short[]{(short) 10, (short) 20, (short) 30, (short) 60, (short) 120, (short) 300};
    private final String oM;
    private final c pU;
    private final b pV;
    private final Object rS = new Object();
    private final t rT;
    private Thread rU;

    /* compiled from: ReportUploader */
    interface b {
        boolean eS();
    }

    /* compiled from: ReportUploader */
    interface c {
        File[] fd();

        File[] fe();

        File[] ff();
    }

    /* compiled from: ReportUploader */
    interface d {
        boolean fc();
    }

    /* compiled from: ReportUploader */
    static final class a implements d {
        public boolean fc() {
            return true;
        }

        a() {
        }
    }

    /* compiled from: ReportUploader */
    private class e extends h {
        private final float qV;
        private final d rV;

        e(float f, d dVar) {
            this.qV = f;
            this.rV = dVar;
        }

        public void fV() {
            try {
                fW();
            } catch (Exception e) {
                io.fabric.sdk.android.c.biX().e("CrashlyticsCore", "An unexpected error occurred while attempting to upload crash reports.", e);
            }
            ao.this.rU = null;
        }

        private void fW() {
            k biX = io.fabric.sdk.android.c.biX();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Starting report processing in ");
            stringBuilder.append(this.qV);
            stringBuilder.append(" second(s)...");
            String str = "CrashlyticsCore";
            biX.d(str, stringBuilder.toString());
            float f = this.qV;
            if (f > 0.0f) {
                try {
                    Thread.sleep((long) (f * 1000.0f));
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
            List<Report> fT = ao.this.fT();
            if (!ao.this.pV.eS()) {
                k biX2;
                StringBuilder stringBuilder2;
                if (fT.isEmpty() || this.rV.fc()) {
                    int i = 0;
                    while (!fT.isEmpty() && !ao.this.pV.eS()) {
                        k biX3 = io.fabric.sdk.android.c.biX();
                        StringBuilder stringBuilder3 = new StringBuilder();
                        stringBuilder3.append("Attempting to send ");
                        stringBuilder3.append(fT.size());
                        stringBuilder3.append(" report(s)");
                        biX3.d(str, stringBuilder3.toString());
                        for (Report a : fT) {
                            ao.this.a(a);
                        }
                        List fT2 = ao.this.fT();
                        if (!fT2.isEmpty()) {
                            int i2 = i + 1;
                            long j = (long) ao.rR[Math.min(i, ao.rR.length - 1)];
                            biX2 = io.fabric.sdk.android.c.biX();
                            stringBuilder2 = new StringBuilder();
                            stringBuilder2.append("Report submisson: scheduling delayed retry in ");
                            stringBuilder2.append(j);
                            stringBuilder2.append(" seconds");
                            biX2.d(str, stringBuilder2.toString());
                            try {
                                Thread.sleep(j * 1000);
                                i = i2;
                            } catch (InterruptedException unused2) {
                                Thread.currentThread().interrupt();
                                return;
                            }
                        }
                    }
                    return;
                }
                biX2 = io.fabric.sdk.android.c.biX();
                stringBuilder2 = new StringBuilder();
                stringBuilder2.append("User declined to send. Removing ");
                stringBuilder2.append(fT2.size());
                stringBuilder2.append(" Report(s).");
                biX2.d(str, stringBuilder2.toString());
                for (Report remove : fT2) {
                    remove.remove();
                }
            }
        }
    }

    public ao(String str, t tVar, c cVar, b bVar) {
        if (tVar != null) {
            this.rT = tVar;
            this.oM = str;
            this.pU = cVar;
            this.pV = bVar;
            return;
        }
        throw new IllegalArgumentException("createReportCall must not be null.");
    }

    public synchronized void a(float f, d dVar) {
        if (this.rU != null) {
            io.fabric.sdk.android.c.biX().d("CrashlyticsCore", "Report upload has already been started.");
            return;
        }
        this.rU = new Thread(new e(f, dVar), "Crashlytics Report Uploader");
        this.rU.start();
    }

    /* Access modifiers changed, original: 0000 */
    public boolean a(Report report) {
        boolean z;
        synchronized (this.rS) {
            z = false;
            StringBuilder stringBuilder;
            try {
                boolean a = this.rT.a(new s(this.oM, report));
                k biX = io.fabric.sdk.android.c.biX();
                String str = "CrashlyticsCore";
                stringBuilder = new StringBuilder();
                stringBuilder.append("Crashlytics report upload ");
                stringBuilder.append(a ? "complete: " : "FAILED: ");
                stringBuilder.append(report.getIdentifier());
                biX.i(str, stringBuilder.toString());
                if (a) {
                    report.remove();
                    z = true;
                }
            } catch (Exception e) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Error occurred sending report ");
                stringBuilder.append(report);
                io.fabric.sdk.android.c.biX().e("CrashlyticsCore", stringBuilder.toString(), e);
            }
        }
        return z;
    }

    /* Access modifiers changed, original: 0000 */
    public List<Report> fT() {
        File[] fd;
        File[] fe;
        File[] ff;
        io.fabric.sdk.android.c.biX().d("CrashlyticsCore", "Checking for crash reports...");
        synchronized (this.rS) {
            fd = this.pU.fd();
            fe = this.pU.fe();
            ff = this.pU.ff();
        }
        LinkedList linkedList = new LinkedList();
        if (fd != null) {
            for (File file : fd) {
                k biX = io.fabric.sdk.android.c.biX();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Found crash report ");
                stringBuilder.append(file.getPath());
                biX.d("CrashlyticsCore", stringBuilder.toString());
                linkedList.add(new ar(file));
            }
        }
        HashMap hashMap = new HashMap();
        if (fe != null) {
            for (File file2 : fe) {
                String e = j.e(file2);
                if (!hashMap.containsKey(e)) {
                    hashMap.put(e, new LinkedList());
                }
                ((List) hashMap.get(e)).add(file2);
            }
        }
        for (String str : hashMap.keySet()) {
            k biX2 = io.fabric.sdk.android.c.biX();
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Found invalid session: ");
            stringBuilder2.append(str);
            biX2.d("CrashlyticsCore", stringBuilder2.toString());
            List list = (List) hashMap.get(str);
            linkedList.add(new z(str, (File[]) list.toArray(new File[list.size()])));
        }
        if (ff != null) {
            for (File ahVar : ff) {
                linkedList.add(new ah(ahVar));
            }
        }
        if (linkedList.isEmpty()) {
            io.fabric.sdk.android.c.biX().d("CrashlyticsCore", "No reports found.");
        }
        return linkedList;
    }
}
