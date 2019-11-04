package com.crashlytics.android.core;

import android.app.Activity;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import com.crashlytics.android.answers.o;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.common.DeliveryMechanism;
import io.fabric.sdk.android.services.common.IdManager;
import io.fabric.sdk.android.services.settings.m;
import io.fabric.sdk.android.services.settings.p;
import io.fabric.sdk.android.services.settings.q;
import io.fabric.sdk.android.services.settings.s;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;

/* compiled from: CrashlyticsController */
class j {
    static final FilenameFilter pF = new d("BeginSession") {
        public boolean accept(File file, String str) {
            return super.accept(file, str) && str.endsWith(".cls");
        }
    };
    static final FilenameFilter pG = new FilenameFilter() {
        public boolean accept(File file, String str) {
            return str.length() == 39 && str.endsWith(".cls");
        }
    };
    static final FileFilter pH = new FileFilter() {
        public boolean accept(File file) {
            return file.isDirectory() && file.getName().length() == 35;
        }
    };
    static final Comparator<File> pI = new Comparator<File>() {
        /* renamed from: a */
        public int compare(File file, File file2) {
            return file2.getName().compareTo(file.getName());
        }
    };
    static final Comparator<File> pJ = new Comparator<File>() {
        /* renamed from: a */
        public int compare(File file, File file2) {
            return file.getName().compareTo(file2.getName());
        }
    };
    private static final Pattern pK = Pattern.compile("([\\d|A-Z|a-z]{12}\\-[\\d|A-Z|a-z]{4}\\-[\\d|A-Z|a-z]{4}\\-[\\d|A-Z|a-z]{12}).+");
    private static final Map<String, String> pL = Collections.singletonMap("X-CRASHLYTICS-SEND-FLAGS", "1");
    private static final String[] pM = new String[]{"SessionUser", "SessionApp", "SessionOS", "SessionDevice"};
    private final io.fabric.sdk.android.services.c.a oa;
    private final io.fabric.sdk.android.services.network.c om;
    private final AtomicInteger pN = new AtomicInteger(0);
    private final k pO;
    private final i pP;
    private final aj pQ;
    private final a pR;
    private final g pS;
    private final aa pT;
    private final c pU;
    private final b pV;
    private final w pW;
    private final at pX;
    private final String pY;
    private final b pZ;
    private final IdManager pj;
    private final o qa;
    private r qb;

    /* compiled from: CrashlyticsController */
    private static class a implements FilenameFilter {
        private a() {
        }

        /* synthetic */ a(AnonymousClass1 anonymousClass1) {
            this();
        }

        public boolean accept(File file, String str) {
            return !j.pG.accept(file, str) && j.pK.matcher(str).matches();
        }
    }

    /* compiled from: CrashlyticsController */
    private interface b {
        void a(CodedOutputStream codedOutputStream);
    }

    /* compiled from: CrashlyticsController */
    static class d implements FilenameFilter {
        private final String string;

        public d(String str) {
            this.string = str;
        }

        public boolean accept(File file, String str) {
            return str.contains(this.string) && !str.endsWith(".cls_temp");
        }
    }

    /* compiled from: CrashlyticsController */
    private interface e {
        void a(FileOutputStream fileOutputStream);
    }

    /* compiled from: CrashlyticsController */
    static class f implements FilenameFilter {
        f() {
        }

        public boolean accept(File file, String str) {
            return f.ps.accept(file, str) || str.contains("SessionMissingBinaryImages");
        }
    }

    /* compiled from: CrashlyticsController */
    private static final class k implements Runnable {
        private final Context context;
        private final Report qM;
        private final ao qN;

        public k(Context context, Report report, ao aoVar) {
            this.context = context;
            this.qM = report;
            this.qN = aoVar;
        }

        public void run() {
            if (CommonUtils.cB(this.context)) {
                io.fabric.sdk.android.c.biX().d("CrashlyticsCore", "Attempting to send crash report at time of crash...");
                this.qN.a(this.qM);
            }
        }
    }

    /* compiled from: CrashlyticsController */
    static class l implements FilenameFilter {
        private final String qO;

        public l(String str) {
            this.qO = str;
        }

        public boolean accept(File file, String str) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.qO);
            stringBuilder.append(".cls");
            boolean z = false;
            if (str.equals(stringBuilder.toString())) {
                return false;
            }
            if (str.contains(this.qO) && !str.endsWith(".cls_temp")) {
                z = true;
            }
            return z;
        }
    }

    /* compiled from: CrashlyticsController */
    private static final class c implements b {
        private c() {
        }

        /* synthetic */ c(AnonymousClass1 anonymousClass1) {
            this();
        }

        public s fa() {
            return q.bkG().bkH();
        }
    }

    /* compiled from: CrashlyticsController */
    private static final class g implements com.crashlytics.android.core.aa.a {
        private final io.fabric.sdk.android.services.c.a qI;

        public g(io.fabric.sdk.android.services.c.a aVar) {
            this.qI = aVar;
        }

        public File fb() {
            File file = new File(this.qI.getFilesDir(), "log-files");
            if (!file.exists()) {
                file.mkdirs();
            }
            return file;
        }
    }

    /* compiled from: CrashlyticsController */
    private static final class h implements d {
        private final io.fabric.sdk.android.h nP;
        private final aj pQ;
        private final io.fabric.sdk.android.services.settings.o qJ;

        public h(io.fabric.sdk.android.h hVar, aj ajVar, io.fabric.sdk.android.services.settings.o oVar) {
            this.nP = hVar;
            this.pQ = ajVar;
            this.qJ = oVar;
        }

        public boolean fc() {
            Activity currentActivity = this.nP.bjf().getCurrentActivity();
            if (currentActivity == null || currentActivity.isFinishing()) {
                return true;
            }
            final h a = h.a(currentActivity, this.qJ, new a() {
                public void z(boolean z) {
                    h.this.pQ.B(z);
                }
            });
            currentActivity.runOnUiThread(new Runnable() {
                public void run() {
                    a.show();
                }
            });
            io.fabric.sdk.android.c.biX().d("CrashlyticsCore", "Waiting for user opt-in.");
            a.await();
            return a.eH();
        }
    }

    /* compiled from: CrashlyticsController */
    private final class i implements c {
        private i() {
        }

        /* synthetic */ i(j jVar, AnonymousClass1 anonymousClass1) {
            this();
        }

        public File[] fd() {
            return j.this.eM();
        }

        public File[] fe() {
            return j.this.eV().listFiles();
        }

        public File[] ff() {
            return j.this.eN();
        }
    }

    /* compiled from: CrashlyticsController */
    private final class j implements b {
        private j() {
        }

        /* synthetic */ j(j jVar, AnonymousClass1 anonymousClass1) {
            this();
        }

        public boolean eS() {
            return j.this.eS();
        }
    }

    j(k kVar, i iVar, io.fabric.sdk.android.services.network.c cVar, IdManager idManager, aj ajVar, io.fabric.sdk.android.services.c.a aVar, a aVar2, av avVar, b bVar, o oVar) {
        this.pO = kVar;
        this.pP = iVar;
        this.om = cVar;
        this.pj = idManager;
        this.pQ = ajVar;
        this.oa = aVar;
        this.pR = aVar2;
        this.pY = avVar.fP();
        this.pZ = bVar;
        this.qa = oVar;
        Context context = kVar.getContext();
        this.pS = new g(aVar);
        this.pT = new aa(context, this.pS);
        this.pU = new i(this, null);
        this.pV = new j(this, null);
        this.pW = new w(context);
        this.pX = new ad(1024, new an(10));
    }

    /* Access modifiers changed, original: 0000 */
    public void a(UncaughtExceptionHandler uncaughtExceptionHandler, boolean z) {
        eI();
        this.qb = new r(new a() {
            public void b(b bVar, Thread thread, Throwable th, boolean z) {
                j.this.a(bVar, thread, th, z);
            }
        }, new c(), z, uncaughtExceptionHandler);
        Thread.setDefaultUncaughtExceptionHandler(this.qb);
    }

    /* Access modifiers changed, original: declared_synchronized */
    public synchronized void a(b bVar, Thread thread, Throwable th, boolean z) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Crashlytics is handling uncaught exception \"");
        stringBuilder.append(th);
        stringBuilder.append("\" from thread ");
        stringBuilder.append(thread.getName());
        io.fabric.sdk.android.c.biX().d("CrashlyticsCore", stringBuilder.toString());
        this.pW.dispose();
        final Date date = new Date();
        final Thread thread2 = thread;
        final Throwable th2 = th;
        final b bVar2 = bVar;
        final boolean z2 = z;
        this.pP.b(new Callable<Void>() {
            public Void call() {
                p pVar;
                m mVar;
                j.this.pO.fp();
                j.this.a(date, thread2, th2);
                s fa = bVar2.fa();
                if (fa != null) {
                    pVar = fa.ePW;
                    mVar = fa.ePX;
                } else {
                    pVar = null;
                    mVar = pVar;
                }
                Object obj = null;
                Object obj2 = (mVar == null || mVar.ePD) ? 1 : null;
                if (obj2 != null || z2) {
                    j.this.n(date.getTime());
                }
                j.this.b(pVar);
                j.this.eL();
                if (pVar != null) {
                    j.this.O(pVar.ePQ);
                }
                if (io.fabric.sdk.android.services.common.k.cC(j.this.pO.getContext()).bjx() && !j.this.b(fa)) {
                    obj = 1;
                }
                if (obj != null) {
                    j.this.c(fa);
                }
                return null;
            }
        });
    }

    /* Access modifiers changed, original: 0000 */
    public void a(float f, s sVar) {
        if (sVar == null) {
            io.fabric.sdk.android.c.biX().w("CrashlyticsCore", "Could not send reports. Settings are not available.");
            return;
        }
        new ao(this.pR.oM, q(sVar.ePV.ePo, sVar.ePV.ePp), this.pU, this.pV).a(f, b(sVar) ? new h(this.pO, this.pQ, sVar.qJ) : new a());
    }

    /* Access modifiers changed, original: 0000 */
    public void b(final long j, final String str) {
        this.pP.submit(new Callable<Void>() {
            public Void call() {
                if (!j.this.eS()) {
                    j.this.pT.b(j, str);
                }
                return null;
            }
        });
    }

    /* Access modifiers changed, original: 0000 */
    public void a(final Thread thread, final Throwable th) {
        final Date date = new Date();
        this.pP.submit(new Runnable() {
            public void run() {
                if (!j.this.eS()) {
                    j.this.b(date, thread, th);
                }
            }
        });
    }

    /* Access modifiers changed, original: 0000 */
    public void a(final String str, final String str2, final String str3) {
        this.pP.submit(new Callable<Void>() {
            public Void call() {
                new ac(j.this.getFilesDir()).a(j.this.eJ(), new aw(str, str2, str3));
                return null;
            }
        });
    }

    /* Access modifiers changed, original: 0000 */
    public void eI() {
        this.pP.submit(new Callable<Void>() {
            public Void call() {
                j.this.eL();
                return null;
            }
        });
    }

    private String eJ() {
        File[] eP = eP();
        return eP.length > 0 ? e(eP[0]) : null;
    }

    private String eK() {
        File[] eP = eP();
        return eP.length > 1 ? e(eP[1]) : null;
    }

    static String e(File file) {
        return file.getName().substring(0, 35);
    }

    /* Access modifiers changed, original: 0000 */
    public boolean a(final p pVar) {
        return ((Boolean) this.pP.b(new Callable<Boolean>() {
            /* renamed from: eZ */
            public Boolean call() {
                String str = "CrashlyticsCore";
                if (j.this.eS()) {
                    io.fabric.sdk.android.c.biX().d(str, "Skipping session finalization because a crash has already occurred.");
                    return Boolean.FALSE;
                }
                io.fabric.sdk.android.c.biX().d(str, "Finalizing previously open sessions.");
                j.this.a(pVar, true);
                io.fabric.sdk.android.c.biX().d(str, "Closed all previously open sessions");
                return Boolean.TRUE;
            }
        })).booleanValue();
    }

    private void eL() {
        Date date = new Date();
        String eVar = new e(this.pj).toString();
        io.fabric.sdk.android.k biX = io.fabric.sdk.android.c.biX();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Opening a new session with ID ");
        stringBuilder.append(eVar);
        biX.d("CrashlyticsCore", stringBuilder.toString());
        a(eVar, date);
        au(eVar);
        av(eVar);
        aw(eVar);
        this.pT.aC(eVar);
    }

    /* Access modifiers changed, original: 0000 */
    public void b(p pVar) {
        a(pVar, false);
    }

    private void a(p pVar, boolean z) {
        P(z + 8);
        File[] eP = eP();
        String str = "CrashlyticsCore";
        if (eP.length <= z) {
            io.fabric.sdk.android.c.biX().d(str, "No open sessions to be closed.");
            return;
        }
        ax(e(eP[z]));
        if (pVar == null) {
            io.fabric.sdk.android.c.biX().d(str, "Unable to close session. Settings are not loaded.");
        } else {
            a(eP, (int) z, pVar.ePM);
        }
    }

    private void a(File[] fileArr, int i, int i2) {
        String str = "CrashlyticsCore";
        io.fabric.sdk.android.c.biX().d(str, "Closing open sessions.");
        while (i < fileArr.length) {
            File file = fileArr[i];
            String e = e(file);
            io.fabric.sdk.android.k biX = io.fabric.sdk.android.c.biX();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Closing session: ");
            stringBuilder.append(e);
            biX.d(str, stringBuilder.toString());
            a(file, e, i2);
            i++;
        }
    }

    private void a(f fVar) {
        if (fVar != null) {
            try {
                fVar.eF();
            } catch (IOException e) {
                io.fabric.sdk.android.c.biX().e("CrashlyticsCore", "Error closing session file stream in the presence of an exception", e);
            }
        }
    }

    private void a(Set<File> set) {
        for (File f : set) {
            f(f);
        }
    }

    private void f(File file) {
        if (file.isDirectory()) {
            for (File f : file.listFiles()) {
                f(f);
            }
        }
        file.delete();
    }

    private void as(String str) {
        for (File delete : at(str)) {
            delete.delete();
        }
    }

    private File[] at(String str) {
        return a(new l(str));
    }

    /* Access modifiers changed, original: 0000 */
    public File[] eM() {
        LinkedList linkedList = new LinkedList();
        Collections.addAll(linkedList, a(eT(), pG));
        Collections.addAll(linkedList, a(eU(), pG));
        Collections.addAll(linkedList, a(getFilesDir(), pG));
        return (File[]) linkedList.toArray(new File[linkedList.size()]);
    }

    /* Access modifiers changed, original: 0000 */
    public File[] eN() {
        return a(pH);
    }

    /* Access modifiers changed, original: 0000 */
    public File[] eO() {
        return a(pF);
    }

    private File[] eP() {
        File[] eO = eO();
        Arrays.sort(eO, pI);
        return eO;
    }

    private File[] a(FileFilter fileFilter) {
        return a(getFilesDir().listFiles(fileFilter));
    }

    private File[] a(FilenameFilter filenameFilter) {
        return a(getFilesDir(), filenameFilter);
    }

    private File[] a(File file, FilenameFilter filenameFilter) {
        return a(file.listFiles(filenameFilter));
    }

    private File[] g(File file) {
        return a(file.listFiles());
    }

    private File[] a(File[] fileArr) {
        return fileArr == null ? new File[0] : fileArr;
    }

    private void g(String str, int i) {
        File filesDir = getFilesDir();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append("SessionEvent");
        ax.a(filesDir, new d(stringBuilder.toString()), i, pJ);
    }

    /* Access modifiers changed, original: 0000 */
    public void O(int i) {
        i -= ax.a(eT(), i, pJ);
        ax.a(getFilesDir(), pG, i - ax.a(eU(), i, pJ), pJ);
    }

    private void P(int i) {
        Set hashSet = new HashSet();
        File[] eP = eP();
        i = Math.min(i, eP.length);
        for (int i2 = 0; i2 < i; i2++) {
            hashSet.add(e(eP[i2]));
        }
        this.pT.b(hashSet);
        a(a(new a()), hashSet);
    }

    private void a(File[] fileArr, Set<String> set) {
        for (File file : fileArr) {
            String name = file.getName();
            Matcher matcher = pK.matcher(name);
            String str = "CrashlyticsCore";
            io.fabric.sdk.android.k biX;
            StringBuilder stringBuilder;
            if (!matcher.matches()) {
                biX = io.fabric.sdk.android.c.biX();
                stringBuilder = new StringBuilder();
                stringBuilder.append("Deleting unknown file: ");
                stringBuilder.append(name);
                biX.d(str, stringBuilder.toString());
                file.delete();
            } else if (!set.contains(matcher.group(1))) {
                biX = io.fabric.sdk.android.c.biX();
                stringBuilder = new StringBuilder();
                stringBuilder.append("Trimming session file: ");
                stringBuilder.append(name);
                biX.d(str, stringBuilder.toString());
                file.delete();
            }
        }
    }

    private File[] a(String str, File[] fileArr, int i) {
        if (fileArr.length <= i) {
            return fileArr;
        }
        io.fabric.sdk.android.c.biX().d("CrashlyticsCore", String.format(Locale.US, "Trimming down to %d logged exceptions.", new Object[]{Integer.valueOf(i)}));
        g(str, i);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append("SessionEvent");
        return a(new d(stringBuilder.toString()));
    }

    /* Access modifiers changed, original: 0000 */
    public void eQ() {
        this.pP.submit(new Runnable() {
            public void run() {
                j jVar = j.this;
                jVar.b(jVar.a(new f()));
            }
        });
    }

    /* Access modifiers changed, original: 0000 */
    public void b(File[] fileArr) {
        String str;
        final HashSet hashSet = new HashSet();
        int length = fileArr.length;
        int i = 0;
        while (true) {
            str = "CrashlyticsCore";
            if (i >= length) {
                break;
            }
            File file = fileArr[i];
            io.fabric.sdk.android.k biX = io.fabric.sdk.android.c.biX();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Found invalid session part file: ");
            stringBuilder.append(file);
            biX.d(str, stringBuilder.toString());
            hashSet.add(e(file));
            i++;
        }
        if (!hashSet.isEmpty()) {
            File eV = eV();
            if (!eV.exists()) {
                eV.mkdir();
            }
            for (Object obj : a(new FilenameFilter() {
                public boolean accept(File file, String str) {
                    if (str.length() < 35) {
                        return false;
                    }
                    return hashSet.contains(str.substring(0, 35));
                }
            })) {
                io.fabric.sdk.android.k biX2 = io.fabric.sdk.android.c.biX();
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("Moving session file: ");
                stringBuilder2.append(obj);
                biX2.d(str, stringBuilder2.toString());
                if (!obj.renameTo(new File(eV, obj.getName()))) {
                    biX2 = io.fabric.sdk.android.c.biX();
                    stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("Could not move session file. Deleting ");
                    stringBuilder2.append(obj);
                    biX2.d(str, stringBuilder2.toString());
                    obj.delete();
                }
            }
            eR();
        }
    }

    private void eR() {
        File eV = eV();
        if (eV.exists()) {
            File[] a = a(eV, new f());
            Arrays.sort(a, Collections.reverseOrder());
            Set hashSet = new HashSet();
            for (int i = 0; i < a.length && hashSet.size() < 4; i++) {
                hashSet.add(e(a[i]));
            }
            a(g(eV), hashSet);
        }
    }

    private void a(Context context, File file, String str) {
        byte[] j = ag.j(file);
        byte[] l = ag.l(file);
        byte[] a = ag.a(file, context);
        String str2 = "CrashlyticsCore";
        if (j == null || j.length == 0) {
            io.fabric.sdk.android.k biX = io.fabric.sdk.android.c.biX();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("No minidump data found in directory ");
            stringBuilder.append(file);
            biX.w(str2, stringBuilder.toString());
            return;
        }
        s(str, "<native-crash: minidump>");
        byte[] p = p(str, "BeginSession.json");
        byte[] p2 = p(str, "SessionApp.json");
        byte[] p3 = p(str, "SessionDevice.json");
        byte[] p4 = p(str, "SessionOS.json");
        byte[] i = ag.i(new ac(getFilesDir()).aF(str));
        aa aaVar = new aa(this.pO.getContext(), this.pS, str);
        byte[] fN = aaVar.fN();
        aaVar.fO();
        byte[] i2 = ag.i(new ac(getFilesDir()).aG(str));
        File file2 = new File(this.oa.getFilesDir(), str);
        if (file2.mkdir()) {
            a(j, new File(file2, "minidump"));
            a(l, new File(file2, "metadata"));
            a(a, new File(file2, "binaryImages"));
            a(p, new File(file2, "session"));
            a(p2, new File(file2, "app"));
            a(p3, new File(file2, "device"));
            a(p4, new File(file2, "os"));
            a(i, new File(file2, "user"));
            a(fN, new File(file2, "logs"));
            a(i2, new File(file2, "keys"));
            return;
        }
        io.fabric.sdk.android.c.biX().d(str2, "Couldn't create native sessions directory");
    }

    /* Access modifiers changed, original: 0000 */
    public boolean a(final o oVar) {
        return oVar == null ? true : ((Boolean) this.pP.b(new Callable<Boolean>() {
            /* renamed from: eZ */
            public Boolean call() {
                Set set = oVar.rb;
                String e = j.this.eK();
                if (!(e == null || set.isEmpty())) {
                    File file = (File) set.first();
                    if (file != null) {
                        j jVar = j.this;
                        jVar.a(jVar.pO.getContext(), file, e);
                    }
                }
                j.this.a(set);
                return Boolean.TRUE;
            }
        })).booleanValue();
    }

    private void a(byte[] bArr, File file) {
        if (bArr != null && bArr.length > 0) {
            b(bArr, file);
        }
    }

    private void b(byte[] bArr, File file) {
        Throwable th;
        Closeable closeable = null;
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(new FileOutputStream(file));
            try {
                gZIPOutputStream.write(bArr);
                gZIPOutputStream.finish();
                CommonUtils.closeQuietly(gZIPOutputStream);
            } catch (Throwable th2) {
                th = th2;
                closeable = gZIPOutputStream;
                CommonUtils.closeQuietly(closeable);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            CommonUtils.closeQuietly(closeable);
            throw th;
        }
    }

    private void a(Date date, Thread thread, Throwable th) {
        Throwable e;
        String str = "CrashlyticsCore";
        String str2 = "Failed to close fatal exception file output stream.";
        String str3 = "Failed to flush to session begin file.";
        Flushable flushable = null;
        Closeable fVar;
        try {
            String eJ = eJ();
            if (eJ == null) {
                io.fabric.sdk.android.c.biX().e(str, "Tried to write a fatal exception while no session was open.", null);
                CommonUtils.a(null, str3);
                CommonUtils.a(null, str2);
                return;
            }
            s(eJ, th.getClass().getName());
            File filesDir = getFilesDir();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(eJ);
            stringBuilder.append("SessionCrash");
            fVar = new f(filesDir, stringBuilder.toString());
            try {
                flushable = CodedOutputStream.a((OutputStream) fVar);
                a(flushable, date, thread, th, "crash", true);
            } catch (Exception e2) {
                e = e2;
            }
            CommonUtils.a(flushable, str3);
            CommonUtils.a(fVar, str2);
        } catch (Exception e3) {
            e = e3;
            fVar = null;
            try {
                io.fabric.sdk.android.c.biX().e(str, "An error occurred in the fatal exception logger", e);
                CommonUtils.a(flushable, str3);
                CommonUtils.a(fVar, str2);
            } catch (Throwable th2) {
                e = th2;
                CommonUtils.a(flushable, str3);
                CommonUtils.a(fVar, str2);
                throw e;
            }
        } catch (Throwable th3) {
            e = th3;
            fVar = null;
            CommonUtils.a(flushable, str3);
            CommonUtils.a(fVar, str2);
            throw e;
        }
    }

    private void b(Date date, Thread thread, Throwable th) {
        Throwable e;
        String str = "Failed to close non-fatal file output stream.";
        String str2 = "Failed to flush to non-fatal file.";
        String eJ = eJ();
        Flushable flushable = null;
        String str3 = "CrashlyticsCore";
        if (eJ == null) {
            io.fabric.sdk.android.c.biX().e(str3, "Tried to write a non-fatal exception while no session was open.", null);
            return;
        }
        Closeable fVar;
        r(eJ, th.getClass().getName());
        try {
            io.fabric.sdk.android.k biX = io.fabric.sdk.android.c.biX();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Crashlytics is logging non-fatal exception \"");
            stringBuilder.append(th);
            stringBuilder.append("\" from thread ");
            stringBuilder.append(thread.getName());
            biX.d(str3, stringBuilder.toString());
            String jl = CommonUtils.jl(this.pN.getAndIncrement());
            stringBuilder = new StringBuilder();
            stringBuilder.append(eJ);
            stringBuilder.append("SessionEvent");
            stringBuilder.append(jl);
            fVar = new f(getFilesDir(), stringBuilder.toString());
            try {
                Flushable a = CodedOutputStream.a((OutputStream) fVar);
                try {
                    a(a, date, thread, th, "error", false);
                    CommonUtils.a(a, str2);
                } catch (Exception e2) {
                    e = e2;
                    flushable = a;
                    try {
                        io.fabric.sdk.android.c.biX().e(str3, "An error occurred in the non-fatal exception logger", e);
                        CommonUtils.a(flushable, str2);
                        CommonUtils.a(fVar, str);
                        g(eJ, 64);
                    } catch (Throwable th2) {
                        e = th2;
                        CommonUtils.a(flushable, str2);
                        CommonUtils.a(fVar, str);
                        throw e;
                    }
                } catch (Throwable th3) {
                    e = th3;
                    flushable = a;
                    CommonUtils.a(flushable, str2);
                    CommonUtils.a(fVar, str);
                    throw e;
                }
            } catch (Exception e3) {
                e = e3;
                io.fabric.sdk.android.c.biX().e(str3, "An error occurred in the non-fatal exception logger", e);
                CommonUtils.a(flushable, str2);
                CommonUtils.a(fVar, str);
                g(eJ, 64);
            }
        } catch (Exception e4) {
            e = e4;
            fVar = null;
            io.fabric.sdk.android.c.biX().e(str3, "An error occurred in the non-fatal exception logger", e);
            CommonUtils.a(flushable, str2);
            CommonUtils.a(fVar, str);
            g(eJ, 64);
        } catch (Throwable th4) {
            e = th4;
            fVar = null;
            CommonUtils.a(flushable, str2);
            CommonUtils.a(fVar, str);
            throw e;
        }
        CommonUtils.a(fVar, str);
        try {
            g(eJ, 64);
        } catch (Exception e5) {
            io.fabric.sdk.android.c.biX().e(str3, "An error occurred when trimming non-fatal files.", e5);
        }
    }

    private void a(String str, String str2, b bVar) {
        Throwable th;
        StringBuilder stringBuilder;
        String str3 = "Failed to close session ";
        String str4 = "Failed to flush to session ";
        String str5 = " file.";
        Flushable flushable = null;
        Closeable fVar;
        try {
            File filesDir = getFilesDir();
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(str);
            stringBuilder2.append(str2);
            fVar = new f(filesDir, stringBuilder2.toString());
            try {
                flushable = CodedOutputStream.a((OutputStream) fVar);
                bVar.a(flushable);
                StringBuilder stringBuilder3 = new StringBuilder();
                stringBuilder3.append(str4);
                stringBuilder3.append(str2);
                stringBuilder3.append(str5);
                CommonUtils.a(flushable, stringBuilder3.toString());
                stringBuilder3 = new StringBuilder();
                stringBuilder3.append(str3);
                stringBuilder3.append(str2);
                stringBuilder3.append(str5);
                CommonUtils.a(fVar, stringBuilder3.toString());
            } catch (Throwable th2) {
                th = th2;
                stringBuilder = new StringBuilder();
                stringBuilder.append(str4);
                stringBuilder.append(str2);
                stringBuilder.append(str5);
                CommonUtils.a(flushable, stringBuilder.toString());
                stringBuilder = new StringBuilder();
                stringBuilder.append(str3);
                stringBuilder.append(str2);
                stringBuilder.append(str5);
                CommonUtils.a(fVar, stringBuilder.toString());
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            fVar = null;
            stringBuilder = new StringBuilder();
            stringBuilder.append(str4);
            stringBuilder.append(str2);
            stringBuilder.append(str5);
            CommonUtils.a(flushable, stringBuilder.toString());
            stringBuilder = new StringBuilder();
            stringBuilder.append(str3);
            stringBuilder.append(str2);
            stringBuilder.append(str5);
            CommonUtils.a(fVar, stringBuilder.toString());
            throw th;
        }
    }

    private void a(String str, String str2, e eVar) {
        Throwable th;
        StringBuilder stringBuilder;
        String str3 = " file.";
        String str4 = "Failed to close ";
        Closeable closeable = null;
        try {
            File filesDir = getFilesDir();
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(str);
            stringBuilder2.append(str2);
            Closeable fileOutputStream = new FileOutputStream(new File(filesDir, stringBuilder2.toString()));
            try {
                eVar.a(fileOutputStream);
                StringBuilder stringBuilder3 = new StringBuilder();
                stringBuilder3.append(str4);
                stringBuilder3.append(str2);
                stringBuilder3.append(str3);
                CommonUtils.a(fileOutputStream, stringBuilder3.toString());
            } catch (Throwable th2) {
                th = th2;
                closeable = fileOutputStream;
                stringBuilder = new StringBuilder();
                stringBuilder.append(str4);
                stringBuilder.append(str2);
                stringBuilder.append(str3);
                CommonUtils.a(closeable, stringBuilder.toString());
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            stringBuilder = new StringBuilder();
            stringBuilder.append(str4);
            stringBuilder.append(str2);
            stringBuilder.append(str3);
            CommonUtils.a(closeable, stringBuilder.toString());
            throw th;
        }
    }

    private byte[] p(String str, String str2) {
        File filesDir = getFilesDir();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(str2);
        return ag.i(new File(filesDir, stringBuilder.toString()));
    }

    private void a(String str, Date date) {
        final String str2 = str;
        final String format = String.format(Locale.US, "Crashlytics Android SDK/%s", new Object[]{this.pO.getVersion()});
        final long time = date.getTime() / 1000;
        a(str, "BeginSession", new b() {
            public void a(CodedOutputStream codedOutputStream) {
                aq.a(codedOutputStream, str2, format, time);
            }
        });
        a(str, "BeginSession.json", new e() {
            public void a(FileOutputStream fileOutputStream) {
                fileOutputStream.write(new JSONObject(new CrashlyticsController$18$1(this)).toString().getBytes());
            }
        });
    }

    private void au(String str) {
        String bjB = this.pj.bjB();
        String str2 = this.pR.pk;
        String str3 = this.pR.versionName;
        final String str4 = bjB;
        final String str5 = str2;
        final String str6 = str3;
        final String bjA = this.pj.bjA();
        final int id = DeliveryMechanism.determineFrom(this.pR.installerPackageName).getId();
        a(str, "SessionApp", new b() {
            public void a(CodedOutputStream codedOutputStream) {
                aq.a(codedOutputStream, str4, j.this.pR.oM, str5, str6, bjA, id, j.this.pY);
            }
        });
        a(str, "SessionApp.json", new e() {
            public void a(FileOutputStream fileOutputStream) {
                fileOutputStream.write(new JSONObject(new CrashlyticsController$20$1(this)).toString().getBytes());
            }
        });
    }

    private void av(String str) {
        final boolean isRooted = CommonUtils.isRooted(this.pO.getContext());
        a(str, "SessionOS", new b() {
            public void a(CodedOutputStream codedOutputStream) {
                aq.a(codedOutputStream, VERSION.RELEASE, VERSION.CODENAME, isRooted);
            }
        });
        a(str, "SessionOS.json", new e() {
            public void a(FileOutputStream fileOutputStream) {
                fileOutputStream.write(new JSONObject(new CrashlyticsController$22$1(this)).toString().getBytes());
            }
        });
    }

    private void aw(String str) {
        String str2 = str;
        Context context = this.pO.getContext();
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        int bjs = CommonUtils.bjs();
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        long bjt = CommonUtils.bjt();
        long blockCount = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        boolean ct = CommonUtils.ct(context);
        final int i = bjs;
        final int i2 = availableProcessors;
        final long j = bjt;
        final long j2 = blockCount;
        final boolean z = ct;
        final Map eC = this.pj.eC();
        long j3 = bjt;
        b bVar = r0;
        final int cu = CommonUtils.cu(context);
        AnonymousClass15 anonymousClass15 = new b() {
            public void a(CodedOutputStream codedOutputStream) {
                aq.a(codedOutputStream, i, Build.MODEL, i2, j, j2, z, eC, cu, Build.MANUFACTURER, Build.PRODUCT);
            }
        };
        a(str2, "SessionDevice", bVar);
        j = j3;
        a(str2, "SessionDevice.json", new e() {
            public void a(FileOutputStream fileOutputStream) {
                fileOutputStream.write(new JSONObject(new CrashlyticsController$24$1(this)).toString().getBytes());
            }
        });
    }

    private void ax(String str) {
        final aw ay = ay(str);
        a(str, "SessionUser", new b() {
            public void a(CodedOutputStream codedOutputStream) {
                aq.a(codedOutputStream, ay.id, ay.name, ay.email);
            }
        });
    }

    private void a(CodedOutputStream codedOutputStream, Date date, Thread thread, Throwable th, String str, boolean z) {
        boolean z2;
        Thread[] threadArr;
        TreeMap attributes;
        Map treeMap;
        au auVar = new au(th, this.pX);
        Context context = this.pO.getContext();
        long time = date.getTime() / 1000;
        Float cq = CommonUtils.cq(context);
        int d = CommonUtils.d(context, this.pW.fA());
        boolean cr = CommonUtils.cr(context);
        int i = context.getResources().getConfiguration().orientation;
        long bjt = CommonUtils.bjt() - CommonUtils.cp(context);
        long ln = CommonUtils.ln(Environment.getDataDirectory().getPath());
        RunningAppProcessInfo f = CommonUtils.f(context.getPackageName(), context);
        List linkedList = new LinkedList();
        StackTraceElement[] stackTraceElementArr = auVar.sd;
        String str2 = this.pR.pe;
        String bjB = this.pj.bjB();
        int i2 = 0;
        if (z) {
            Map allStackTraces = Thread.getAllStackTraces();
            Thread[] threadArr2 = new Thread[allStackTraces.size()];
            for (Entry entry : allStackTraces.entrySet()) {
                threadArr2[i2] = (Thread) entry.getKey();
                linkedList.add(this.pX.a((StackTraceElement[]) entry.getValue()));
                i2++;
            }
            z2 = true;
            threadArr = threadArr2;
        } else {
            z2 = true;
            threadArr = new Thread[0];
        }
        if (CommonUtils.a(context, "com.crashlytics.CollectCustomKeys", z2)) {
            attributes = this.pO.getAttributes();
            if (attributes != null && attributes.size() > z2) {
                treeMap = new TreeMap(attributes);
                aq.a(codedOutputStream, time, str, auVar, thread, stackTraceElementArr, threadArr, linkedList, treeMap, this.pT, f, i, bjB, str2, cq, d, cr, bjt, ln);
            }
        }
        attributes = new TreeMap();
        treeMap = attributes;
        aq.a(codedOutputStream, time, str, auVar, thread, stackTraceElementArr, threadArr, linkedList, treeMap, this.pT, f, i, bjB, str2, cq, d, cr, bjt, ln);
    }

    private void a(File file, String str, int i) {
        io.fabric.sdk.android.k biX;
        StringBuilder stringBuilder;
        io.fabric.sdk.android.k biX2 = io.fabric.sdk.android.c.biX();
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("Collecting session parts for ID ");
        stringBuilder2.append(str);
        String str2 = "CrashlyticsCore";
        biX2.d(str2, stringBuilder2.toString());
        stringBuilder2 = new StringBuilder();
        stringBuilder2.append(str);
        stringBuilder2.append("SessionCrash");
        File[] a = a(new d(stringBuilder2.toString()));
        boolean z = a != null && a.length > 0;
        io.fabric.sdk.android.c.biX().d(str2, String.format(Locale.US, "Session %s has fatal exception: %s", new Object[]{str, Boolean.valueOf(z)}));
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append(str);
        stringBuilder3.append("SessionEvent");
        File[] a2 = a(new d(stringBuilder3.toString()));
        boolean z2 = a2 != null && a2.length > 0;
        io.fabric.sdk.android.c.biX().d(str2, String.format(Locale.US, "Session %s has non-fatal exceptions: %s", new Object[]{str, Boolean.valueOf(z2)}));
        if (z || z2) {
            a(file, str, a(str, a2, i), z ? a[0] : null);
        } else {
            biX = io.fabric.sdk.android.c.biX();
            stringBuilder = new StringBuilder();
            stringBuilder.append("No events present for session ID ");
            stringBuilder.append(str);
            biX.d(str2, stringBuilder.toString());
        }
        biX = io.fabric.sdk.android.c.biX();
        stringBuilder = new StringBuilder();
        stringBuilder.append("Removing session part files for ID ");
        stringBuilder.append(str);
        biX.d(str2, stringBuilder.toString());
        as(str);
    }

    private void a(File file, String str, File[] fileArr, File file2) {
        Throwable e;
        io.fabric.sdk.android.k biX;
        StringBuilder stringBuilder;
        String str2 = str;
        File file3 = file2;
        String str3 = "Failed to close CLS file";
        String str4 = "CrashlyticsCore";
        String str5 = "Error flushing session file stream";
        boolean z = file3 != null;
        File eT = z ? eT() : eU();
        if (!eT.exists()) {
            eT.mkdirs();
        }
        Closeable fVar;
        try {
            fVar = new f(eT, str2);
            try {
                Flushable a = CodedOutputStream.a((OutputStream) fVar);
                io.fabric.sdk.android.k biX2 = io.fabric.sdk.android.c.biX();
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("Collecting SessionStart data for session ID ");
                stringBuilder2.append(str2);
                biX2.d(str4, stringBuilder2.toString());
                a((CodedOutputStream) a, file);
                a.a(4, new Date().getTime() / 1000);
                a.c(5, z);
                a.b(11, 1);
                a.c(12, 3);
                a((CodedOutputStream) a, str2);
                a((CodedOutputStream) a, fileArr, str2);
                if (z) {
                    a((CodedOutputStream) a, file3);
                }
                CommonUtils.a(a, str5);
                CommonUtils.a(fVar, str3);
            } catch (Exception e2) {
                e = e2;
                try {
                    biX = io.fabric.sdk.android.c.biX();
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Failed to write session file for session ID: ");
                    stringBuilder.append(str2);
                    biX.e(str4, stringBuilder.toString(), e);
                    CommonUtils.a(null, str5);
                    a((f) fVar);
                } catch (Throwable th) {
                    e = th;
                    CommonUtils.a(null, str5);
                    CommonUtils.a(fVar, str3);
                    throw e;
                }
            }
        } catch (Exception e3) {
            e = e3;
            fVar = null;
            biX = io.fabric.sdk.android.c.biX();
            stringBuilder = new StringBuilder();
            stringBuilder.append("Failed to write session file for session ID: ");
            stringBuilder.append(str2);
            biX.e(str4, stringBuilder.toString(), e);
            CommonUtils.a(null, str5);
            a((f) fVar);
        } catch (Throwable th2) {
            e = th2;
            fVar = null;
            CommonUtils.a(null, str5);
            CommonUtils.a(fVar, str3);
            throw e;
        }
    }

    private static void a(CodedOutputStream codedOutputStream, File[] fileArr, String str) {
        String str2 = "CrashlyticsCore";
        Arrays.sort(fileArr, CommonUtils.eMV);
        for (File name : fileArr) {
            try {
                io.fabric.sdk.android.c.biX().d(str2, String.format(Locale.US, "Found Non Fatal for session ID %s in %s ", new Object[]{str, name.getName()}));
                a(codedOutputStream, name);
            } catch (Exception e) {
                io.fabric.sdk.android.c.biX().e(str2, "Error writting non-fatal to session.", e);
            }
        }
    }

    private void a(CodedOutputStream codedOutputStream, String str) {
        for (String str2 : pM) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(str2);
            stringBuilder.append(".cls");
            File[] a = a(new d(stringBuilder.toString()));
            String str3 = " data for session ID ";
            String str4 = "CrashlyticsCore";
            if (a.length == 0) {
                io.fabric.sdk.android.k biX = io.fabric.sdk.android.c.biX();
                stringBuilder = new StringBuilder();
                stringBuilder.append("Can't find ");
                stringBuilder.append(str2);
                stringBuilder.append(str3);
                stringBuilder.append(str);
                biX.e(str4, stringBuilder.toString(), null);
            } else {
                io.fabric.sdk.android.k biX2 = io.fabric.sdk.android.c.biX();
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("Collecting ");
                stringBuilder2.append(str2);
                stringBuilder2.append(str3);
                stringBuilder2.append(str);
                biX2.d(str4, stringBuilder2.toString());
                a(codedOutputStream, a[0]);
            }
        }
    }

    private static void a(CodedOutputStream codedOutputStream, File file) {
        Throwable th;
        String str = "Failed to close file input stream.";
        if (file.exists()) {
            Closeable fileInputStream;
            try {
                fileInputStream = new FileInputStream(file);
                try {
                    a((InputStream) fileInputStream, codedOutputStream, (int) file.length());
                    CommonUtils.a(fileInputStream, str);
                    return;
                } catch (Throwable th2) {
                    th = th2;
                    CommonUtils.a(fileInputStream, str);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                fileInputStream = null;
                CommonUtils.a(fileInputStream, str);
                throw th;
            }
        }
        io.fabric.sdk.android.k biX = io.fabric.sdk.android.c.biX();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Tried to include a file that doesn't exist: ");
        stringBuilder.append(file.getName());
        biX.e("CrashlyticsCore", stringBuilder.toString(), null);
    }

    private static void a(InputStream inputStream, CodedOutputStream codedOutputStream, int i) {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < bArr.length) {
            int read = inputStream.read(bArr, i2, bArr.length - i2);
            if (read < 0) {
                break;
            }
            i2 += read;
        }
        codedOutputStream.e(bArr);
    }

    private aw ay(String str) {
        if (eS()) {
            return new aw(this.pO.fh(), this.pO.getUserName(), this.pO.fi());
        }
        return new ac(getFilesDir()).aE(str);
    }

    /* Access modifiers changed, original: 0000 */
    public boolean eS() {
        r rVar = this.qb;
        return rVar != null && rVar.eS();
    }

    /* Access modifiers changed, original: 0000 */
    public File getFilesDir() {
        return this.oa.getFilesDir();
    }

    /* Access modifiers changed, original: 0000 */
    public File eT() {
        return new File(getFilesDir(), "fatal-sessions");
    }

    /* Access modifiers changed, original: 0000 */
    public File eU() {
        return new File(getFilesDir(), "nonfatal-sessions");
    }

    /* Access modifiers changed, original: 0000 */
    public File eV() {
        return new File(getFilesDir(), "invalidClsFiles");
    }

    /* Access modifiers changed, original: 0000 */
    public void a(s sVar) {
        if (sVar.ePX.ePD) {
            boolean eD = this.pZ.eD();
            io.fabric.sdk.android.k biX = io.fabric.sdk.android.c.biX();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Registered Firebase Analytics event listener for breadcrumbs: ");
            stringBuilder.append(eD);
            biX.d("CrashlyticsCore", stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void eW() {
        this.pW.initialize();
    }

    private boolean b(s sVar) {
        boolean z = false;
        if (sVar == null) {
            return false;
        }
        if (sVar.ePX.ePz && !this.pQ.fQ()) {
            z = true;
        }
        return z;
    }

    private t q(String str, String str2) {
        String L = CommonUtils.L(this.pO.getContext(), "com.crashlytics.ApiEndpoint");
        return new g(new v(this.pO, L, str, this.om), new af(this.pO, L, str2, this.om));
    }

    private void c(s sVar) {
        if (sVar == null) {
            io.fabric.sdk.android.c.biX().w("CrashlyticsCore", "Cannot send reports. Settings are unavailable.");
            return;
        }
        Context context = this.pO.getContext();
        ao aoVar = new ao(this.pR.oM, q(sVar.ePV.ePo, sVar.ePV.ePp), this.pU, this.pV);
        for (File arVar : eM()) {
            this.pP.submit(new k(context, new ar(arVar, pL), aoVar));
        }
    }

    private static void r(String str, String str2) {
        com.crashlytics.android.answers.b bVar = (com.crashlytics.android.answers.b) io.fabric.sdk.android.c.C(com.crashlytics.android.answers.b.class);
        if (bVar == null) {
            io.fabric.sdk.android.c.biX().d("CrashlyticsCore", "Answers is not available");
        } else {
            bVar.a(new io.fabric.sdk.android.services.common.i.b(str, str2));
        }
    }

    private static void s(String str, String str2) {
        com.crashlytics.android.answers.b bVar = (com.crashlytics.android.answers.b) io.fabric.sdk.android.c.C(com.crashlytics.android.answers.b.class);
        if (bVar == null) {
            io.fabric.sdk.android.c.biX().d("CrashlyticsCore", "Answers is not available");
        } else {
            bVar.a(new io.fabric.sdk.android.services.common.i.a(str, str2));
        }
    }

    private void n(long j) {
        String str = "CrashlyticsCore";
        if (eX()) {
            io.fabric.sdk.android.c.biX().d(str, "Skipping logging Crashlytics event to Firebase, FirebaseCrash exists");
            return;
        }
        if (this.qa != null) {
            io.fabric.sdk.android.c.biX().d(str, "Logging Crashlytics event to Firebase");
            Bundle bundle = new Bundle();
            bundle.putInt("_r", 1);
            bundle.putInt("fatal", 1);
            bundle.putLong("timestamp", j);
            this.qa.logEvent("clx", "_ae", bundle);
        } else {
            io.fabric.sdk.android.c.biX().d(str, "Skipping logging Crashlytics event to Firebase, no Firebase Analytics");
        }
    }

    private boolean eX() {
        try {
            Class.forName("com.google.firebase.crash.FirebaseCrash");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }
}
