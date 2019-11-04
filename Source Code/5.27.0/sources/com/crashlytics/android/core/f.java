package com.crashlytics.android.core;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;

/* compiled from: ClsFileOutputStream */
class f extends FileOutputStream {
    public static final FilenameFilter ps = new FilenameFilter() {
        public boolean accept(File file, String str) {
            return str.endsWith(".cls_temp");
        }
    };
    private boolean closed = false;
    private final String pp;
    private File pq;
    private File pr;

    public f(File file, String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        String str2 = ".cls_temp";
        stringBuilder.append(str2);
        super(new File(file, stringBuilder.toString()));
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(file);
        stringBuilder2.append(File.separator);
        stringBuilder2.append(str);
        this.pp = stringBuilder2.toString();
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append(this.pp);
        stringBuilder3.append(str2);
        this.pq = new File(stringBuilder3.toString());
    }

    public synchronized void close() {
        if (!this.closed) {
            this.closed = true;
            super.flush();
            super.close();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.pp);
            stringBuilder.append(".cls");
            File file = new File(stringBuilder.toString());
            if (this.pq.renameTo(file)) {
                this.pq = null;
                this.pr = file;
                return;
            }
            String str = "";
            if (file.exists()) {
                str = " (target already exists)";
            } else if (!this.pq.exists()) {
                str = " (source does not exist)";
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Could not rename temp file: ");
            stringBuilder2.append(this.pq);
            stringBuilder2.append(" -> ");
            stringBuilder2.append(file);
            stringBuilder2.append(str);
            throw new IOException(stringBuilder2.toString());
        }
    }

    public void eF() {
        if (!this.closed) {
            this.closed = true;
            super.flush();
            super.close();
        }
    }
}
