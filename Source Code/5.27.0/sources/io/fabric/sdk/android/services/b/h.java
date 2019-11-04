package io.fabric.sdk.android.services.b;

import android.content.Context;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.common.r;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: QueueFileEventStorage */
public class h implements c {
    private final Context context;
    private final File eOr;
    private final String eOs;
    private r eOt = new r(this.rJ);
    private File eOu;
    private final File rJ;

    public h(Context context, File file, String str, String str2) {
        this.context = context;
        this.eOr = file;
        this.eOs = str2;
        this.rJ = new File(this.eOr, str);
        bki();
    }

    private void bki() {
        this.eOu = new File(this.eOr, this.eOs);
        if (!this.eOu.exists()) {
            this.eOu.mkdirs();
        }
    }

    public void W(byte[] bArr) {
        this.eOt.W(bArr);
    }

    public int bke() {
        return this.eOt.bjJ();
    }

    public void lw(String str) {
        this.eOt.close();
        b(this.rJ, new File(this.eOu, str));
        this.eOt = new r(this.rJ);
    }

    private void b(File file, File file2) {
        Throwable th;
        String str = "Failed to close output stream";
        String str2 = "Failed to close file input stream";
        Closeable closeable = null;
        Closeable fileInputStream;
        try {
            fileInputStream = new FileInputStream(file);
            try {
                closeable = y(file2);
                CommonUtils.a((InputStream) fileInputStream, (OutputStream) closeable, new byte[1024]);
                CommonUtils.a(fileInputStream, str2);
                CommonUtils.a(closeable, str);
                file.delete();
            } catch (Throwable th2) {
                th = th2;
                CommonUtils.a(fileInputStream, str2);
                CommonUtils.a(closeable, str);
                file.delete();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            fileInputStream = null;
            CommonUtils.a(fileInputStream, str2);
            CommonUtils.a(closeable, str);
            file.delete();
            throw th;
        }
    }

    public OutputStream y(File file) {
        return new FileOutputStream(file);
    }

    public List<File> js(int i) {
        ArrayList arrayList = new ArrayList();
        for (Object add : this.eOu.listFiles()) {
            arrayList.add(add);
            if (arrayList.size() >= i) {
                break;
            }
        }
        return arrayList;
    }

    public void bO(List<File> list) {
        for (File file : list) {
            CommonUtils.K(this.context, String.format("deleting sent analytics file %s", new Object[]{file.getName()}));
            file.delete();
        }
    }

    public List<File> bkg() {
        return Arrays.asList(this.eOu.listFiles());
    }

    public void bkh() {
        try {
            this.eOt.close();
        } catch (IOException unused) {
        }
        this.rJ.delete();
    }

    public boolean bkf() {
        return this.eOt.isEmpty();
    }

    public boolean aZ(int i, int i2) {
        return this.eOt.aX(i, i2);
    }
}
