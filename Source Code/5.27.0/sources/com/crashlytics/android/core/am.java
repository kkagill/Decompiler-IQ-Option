package com.crashlytics.android.core;

import io.fabric.sdk.android.k;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.common.r;
import io.fabric.sdk.android.services.common.r.c;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;

/* compiled from: QueueFileLogStore */
class am implements y {
    private final File rJ;
    private final int rK;
    private r rL;

    /* compiled from: QueueFileLogStore */
    public class a {
        public final byte[] bytes;
        public final int offset;

        public a(byte[] bArr, int i) {
            this.bytes = bArr;
            this.offset = i;
        }
    }

    public am(File file, int i) {
        this.rJ = file;
        this.rK = i;
    }

    public void b(long j, String str) {
        fS();
        c(j, str);
    }

    public d fE() {
        a fR = fR();
        if (fR == null) {
            return null;
        }
        return d.c(fR.bytes, 0, fR.offset);
    }

    public byte[] fF() {
        a fR = fR();
        if (fR == null) {
            return null;
        }
        return fR.bytes;
    }

    private a fR() {
        if (!this.rJ.exists()) {
            return null;
        }
        fS();
        r rVar = this.rL;
        if (rVar == null) {
            return null;
        }
        final int[] iArr = new int[]{0};
        final byte[] bArr = new byte[rVar.bjJ()];
        try {
            this.rL.a(new c() {
                public void a(InputStream inputStream, int i) {
                    try {
                        inputStream.read(bArr, iArr[0], i);
                        int[] iArr = iArr;
                        iArr[0] = iArr[0] + i;
                    } finally {
                        inputStream.close();
                    }
                }
            });
        } catch (IOException e) {
            io.fabric.sdk.android.c.biX().e("CrashlyticsCore", "A problem occurred while reading the Crashlytics log file.", e);
        }
        return new a(bArr, iArr[0]);
    }

    public void fG() {
        CommonUtils.a(this.rL, "There was a problem closing the Crashlytics log file.");
        this.rL = null;
    }

    public void fH() {
        fG();
        this.rJ.delete();
    }

    private void fS() {
        if (this.rL == null) {
            try {
                this.rL = new r(this.rJ);
            } catch (IOException e) {
                k biX = io.fabric.sdk.android.c.biX();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Could not open log file: ");
                stringBuilder.append(this.rJ);
                biX.e("CrashlyticsCore", stringBuilder.toString(), e);
            }
        }
    }

    private void c(long j, String str) {
        String str2 = " ";
        if (this.rL != null) {
            if (str == null) {
                str = "null";
            }
            try {
                int i = this.rK / 4;
                if (str.length() > i) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("...");
                    stringBuilder.append(str.substring(str.length() - i));
                    str = stringBuilder.toString();
                }
                str = str.replaceAll("\r", str2).replaceAll("\n", str2);
                this.rL.W(String.format(Locale.US, "%d %s%n", new Object[]{Long.valueOf(j), str}).getBytes("UTF-8"));
                while (!this.rL.isEmpty() && this.rL.bjJ() > this.rK) {
                    this.rL.remove();
                }
            } catch (IOException e) {
                io.fabric.sdk.android.c.biX().e("CrashlyticsCore", "There was a problem writing to the Crashlytics log.", e);
            }
        }
    }
}
