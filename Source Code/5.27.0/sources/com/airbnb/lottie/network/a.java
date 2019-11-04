package com.airbnb.lottie.network;

import android.content.Context;
import androidx.annotation.Nullable;
import com.airbnb.lottie.d.d;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

/* compiled from: NetworkCache */
class a {
    private final Context cO;
    private final String url;

    a(Context context, String str) {
        this.cO = context.getApplicationContext();
        this.url = str;
    }

    /* Access modifiers changed, original: 0000 */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    @androidx.annotation.WorkerThread
    @androidx.annotation.Nullable
    public androidx.core.util.Pair<com.airbnb.lottie.network.FileExtension, java.io.InputStream> cA() {
        /*
        r5 = this;
        r0 = 0;
        r1 = r5.url;	 Catch:{ FileNotFoundException -> 0x0048 }
        r1 = r5.C(r1);	 Catch:{ FileNotFoundException -> 0x0048 }
        if (r1 != 0) goto L_0x000a;
    L_0x0009:
        return r0;
    L_0x000a:
        r2 = new java.io.FileInputStream;	 Catch:{  }
        r2.<init>(r1);	 Catch:{  }
        r0 = r1.getAbsolutePath();
        r3 = ".zip";
        r0 = r0.endsWith(r3);
        if (r0 == 0) goto L_0x001e;
    L_0x001b:
        r0 = com.airbnb.lottie.network.FileExtension.ZIP;
        goto L_0x0020;
    L_0x001e:
        r0 = com.airbnb.lottie.network.FileExtension.JSON;
    L_0x0020:
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = "Cache hit for ";
        r3.append(r4);
        r4 = r5.url;
        r3.append(r4);
        r4 = " at ";
        r3.append(r4);
        r1 = r1.getAbsolutePath();
        r3.append(r1);
        r1 = r3.toString();
        com.airbnb.lottie.d.d.q(r1);
        r1 = new androidx.core.util.Pair;
        r1.<init>(r0, r2);
        return r1;
    L_0x0048:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.network.a.cA():androidx.core.util.Pair");
    }

    /* Access modifiers changed, original: 0000 */
    public File a(InputStream inputStream, FileExtension fileExtension) {
        File file = new File(this.cO.getCacheDir(), a(this.url, fileExtension, true));
        FileOutputStream fileOutputStream;
        try {
            fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    inputStream.close();
                    return file;
                }
            }
        } catch (Throwable th) {
            inputStream.close();
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void a(FileExtension fileExtension) {
        File file = new File(this.cO.getCacheDir(), a(this.url, fileExtension, true));
        File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
        boolean renameTo = file.renameTo(file2);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Copying temp file to real file (");
        stringBuilder.append(file2);
        stringBuilder.append(")");
        d.q(stringBuilder.toString());
        if (!renameTo) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Unable to rename cache file ");
            stringBuilder2.append(file.getAbsolutePath());
            stringBuilder2.append(" to ");
            stringBuilder2.append(file2.getAbsolutePath());
            stringBuilder2.append(".");
            d.warning(stringBuilder2.toString());
        }
    }

    @Nullable
    private File C(String str) {
        File file = new File(this.cO.getCacheDir(), a(str, FileExtension.JSON, false));
        if (file.exists()) {
            return file;
        }
        file = new File(this.cO.getCacheDir(), a(str, FileExtension.ZIP, false));
        return file.exists() ? file : null;
    }

    private static String a(String str, FileExtension fileExtension, boolean z) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("lottie_cache_");
        stringBuilder.append(str.replaceAll("\\W+", ""));
        stringBuilder.append(z ? fileExtension.tempExtension() : fileExtension.extension);
        return stringBuilder.toString();
    }
}
