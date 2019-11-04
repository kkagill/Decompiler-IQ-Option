package pl.droidsonroids.gif;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import java.io.Closeable;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* compiled from: ReLinker */
class b {
    private static final String fMX = System.mapLibraryName("pl_droidsonroids_gif");

    private b() {
    }

    @SuppressLint({"UnsafeDynamicallyLoadedCode"})
    static void cJ(Context context) {
        synchronized (b.class) {
            System.load(cK(context).getAbsolutePath());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x0091 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0090 A:{Catch:{ IOException -> 0x007c, all -> 0x0078, all -> 0x00b7 }} */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0090 A:{Catch:{ IOException -> 0x007c, all -> 0x0078, all -> 0x00b7 }} */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0091 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00c5 A:{SYNTHETIC, Splitter:B:51:0x00c5} */
    /* JADX WARNING: Missing block: B:21:?, code skipped:
            c(r2);
            c(r5);
            C(r1);
     */
    private static java.io.File cK(android.content.Context r8) {
        /*
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = fMX;
        r0.append(r1);
        r1 = "1.2.16";
        r0.append(r1);
        r0 = r0.toString();
        r1 = new java.io.File;
        r2 = 0;
        r3 = "lib";
        r3 = r8.getDir(r3, r2);
        r1.<init>(r3, r0);
        r3 = r1.isFile();
        if (r3 == 0) goto L_0x0026;
    L_0x0025:
        return r1;
    L_0x0026:
        r3 = new java.io.File;
        r4 = r8.getCacheDir();
        r3.<init>(r4, r0);
        r0 = r3.isFile();
        if (r0 == 0) goto L_0x0036;
    L_0x0035:
        return r3;
    L_0x0036:
        r0 = "pl_droidsonroids_gif_surface";
        r0 = java.lang.System.mapLibraryName(r0);
        r4 = new pl.droidsonroids.gif.b$1;
        r4.<init>(r0);
        b(r1, r4);
        b(r3, r4);
        r8 = r8.getApplicationInfo();
        r0 = new java.io.File;
        r8 = r8.sourceDir;
        r0.<init>(r8);
        r8 = 0;
        r0 = B(r0);	 Catch:{ all -> 0x00bf }
    L_0x0057:
        r4 = r2 + 1;
        r5 = 5;
        if (r2 >= r5) goto L_0x00b9;
    L_0x005c:
        r2 = a(r0);	 Catch:{ all -> 0x00b7 }
        if (r2 == 0) goto L_0x0099;
    L_0x0062:
        r2 = r0.getInputStream(r2);	 Catch:{ IOException -> 0x008b, all -> 0x0082 }
        r5 = new java.io.FileOutputStream;	 Catch:{ IOException -> 0x0080, all -> 0x007e }
        r5.<init>(r1);	 Catch:{ IOException -> 0x0080, all -> 0x007e }
        d(r2, r5);	 Catch:{ IOException -> 0x007c, all -> 0x0078 }
        c(r2);	 Catch:{ all -> 0x00b7 }
        c(r5);	 Catch:{ all -> 0x00b7 }
        C(r1);	 Catch:{ all -> 0x00b7 }
        goto L_0x00b9;
    L_0x0078:
        r8 = move-exception;
        r1 = r8;
        r8 = r5;
        goto L_0x0084;
        goto L_0x008d;
    L_0x007e:
        r1 = move-exception;
        goto L_0x0084;
    L_0x0080:
        r5 = r8;
        goto L_0x008d;
    L_0x0082:
        r1 = move-exception;
        r2 = r8;
    L_0x0084:
        c(r2);	 Catch:{ all -> 0x00b7 }
        c(r8);	 Catch:{ all -> 0x00b7 }
        throw r1;	 Catch:{ all -> 0x00b7 }
    L_0x008b:
        r2 = r8;
        r5 = r2;
    L_0x008d:
        r6 = 2;
        if (r4 <= r6) goto L_0x0091;
    L_0x0090:
        r1 = r3;
    L_0x0091:
        c(r2);	 Catch:{ all -> 0x00b7 }
        c(r5);	 Catch:{ all -> 0x00b7 }
        r2 = r4;
        goto L_0x0057;
    L_0x0099:
        r8 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x00b7 }
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00b7 }
        r1.<init>();	 Catch:{ all -> 0x00b7 }
        r2 = "Library ";
        r1.append(r2);	 Catch:{ all -> 0x00b7 }
        r2 = fMX;	 Catch:{ all -> 0x00b7 }
        r1.append(r2);	 Catch:{ all -> 0x00b7 }
        r2 = " for supported ABIs not found in APK file";
        r1.append(r2);	 Catch:{ all -> 0x00b7 }
        r1 = r1.toString();	 Catch:{ all -> 0x00b7 }
        r8.<init>(r1);	 Catch:{ all -> 0x00b7 }
        throw r8;	 Catch:{ all -> 0x00b7 }
    L_0x00b7:
        r8 = move-exception;
        goto L_0x00c3;
    L_0x00b9:
        if (r0 == 0) goto L_0x00be;
    L_0x00bb:
        r0.close();	 Catch:{ IOException -> 0x00be }
    L_0x00be:
        return r1;
    L_0x00bf:
        r0 = move-exception;
        r7 = r0;
        r0 = r8;
        r8 = r7;
    L_0x00c3:
        if (r0 == 0) goto L_0x00c8;
    L_0x00c5:
        r0.close();	 Catch:{ IOException -> 0x00c8 }
    L_0x00c8:
        goto L_0x00ca;
    L_0x00c9:
        throw r8;
    L_0x00ca:
        goto L_0x00c9;
        */
        throw new UnsupportedOperationException("Method not decompiled: pl.droidsonroids.gif.b.cK(android.content.Context):java.io.File");
    }

    private static ZipEntry a(ZipFile zipFile) {
        for (String a : bWh()) {
            ZipEntry a2 = a(zipFile, a);
            if (a2 != null) {
                return a2;
            }
        }
        return null;
    }

    private static String[] bWh() {
        if (VERSION.SDK_INT >= 21) {
            return Build.SUPPORTED_ABIS;
        }
        return new String[]{Build.CPU_ABI, Build.CPU_ABI2};
    }

    private static ZipEntry a(ZipFile zipFile, String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("lib/");
        stringBuilder.append(str);
        stringBuilder.append("/");
        stringBuilder.append(fMX);
        return zipFile.getEntry(stringBuilder.toString());
    }

    private static ZipFile B(File file) {
        ZipFile zipFile;
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (i >= 5) {
                zipFile = null;
                break;
            }
            try {
                zipFile = new ZipFile(file, 1);
                break;
            } catch (IOException unused) {
                i = i2;
            }
        }
        if (zipFile != null) {
            return zipFile;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Could not open APK file: ");
        stringBuilder.append(file.getAbsolutePath());
        throw new IllegalStateException(stringBuilder.toString());
    }

    private static void b(File file, FilenameFilter filenameFilter) {
        File[] listFiles = file.getParentFile().listFiles(filenameFilter);
        if (listFiles != null) {
            for (File delete : listFiles) {
                delete.delete();
            }
        }
    }

    @SuppressLint({"SetWorldReadable"})
    private static void C(File file) {
        file.setReadable(true, false);
        file.setExecutable(true, false);
        file.setWritable(true);
    }

    private static void d(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    private static void c(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
