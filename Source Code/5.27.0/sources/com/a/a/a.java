package com.a.a;

import com.google.android.gms.auth.api.credentials.CredentialsApi;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* compiled from: DiskLruCache */
public final class a implements Closeable {
    static final Pattern LEGAL_KEY_PATTERN = Pattern.compile("[a-z0-9_-]{1,64}");
    private static final OutputStream Yu = new OutputStream() {
        public void write(int i) {
        }
    };
    private final int appVersion;
    private final File directory;
    private Writer etM;
    final ThreadPoolExecutor etN = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());
    private final Callable<Void> etO = new Callable<Void>() {
        /* JADX WARNING: Missing block: B:11:0x0027, code skipped:
            return null;
     */
        public java.lang.Void call() {
            /*
            r4 = this;
            r0 = com.a.a.a.this;
            monitor-enter(r0);
            r1 = com.a.a.a.this;	 Catch:{ all -> 0x0028 }
            r1 = r1.etM;	 Catch:{ all -> 0x0028 }
            r2 = 0;
            if (r1 != 0) goto L_0x000e;
        L_0x000c:
            monitor-exit(r0);	 Catch:{ all -> 0x0028 }
            return r2;
        L_0x000e:
            r1 = com.a.a.a.this;	 Catch:{ all -> 0x0028 }
            r1.trimToSize();	 Catch:{ all -> 0x0028 }
            r1 = com.a.a.a.this;	 Catch:{ all -> 0x0028 }
            r1 = r1.journalRebuildRequired();	 Catch:{ all -> 0x0028 }
            if (r1 == 0) goto L_0x0026;
        L_0x001b:
            r1 = com.a.a.a.this;	 Catch:{ all -> 0x0028 }
            r1.rebuildJournal();	 Catch:{ all -> 0x0028 }
            r1 = com.a.a.a.this;	 Catch:{ all -> 0x0028 }
            r3 = 0;
            r1.redundantOpCount = r3;	 Catch:{ all -> 0x0028 }
        L_0x0026:
            monitor-exit(r0);	 Catch:{ all -> 0x0028 }
            return r2;
        L_0x0028:
            r1 = move-exception;
            monitor-exit(r0);	 Catch:{ all -> 0x0028 }
            throw r1;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.a.a.a$AnonymousClass1.call():java.lang.Void");
        }
    };
    private final File journalFile;
    private final File journalFileBackup;
    private final File journalFileTmp;
    private final LinkedHashMap<String, b> lruEntries = new LinkedHashMap(0, 0.75f, true);
    private long maxSize;
    private long nextSequenceNumber = 0;
    private int redundantOpCount;
    private long size = 0;
    private final int valueCount;

    /* compiled from: DiskLruCache */
    public final class a {
        private final b etQ;
        private boolean etR;
        private boolean hasErrors;
        private final boolean[] written;

        /* compiled from: DiskLruCache */
        private class a extends FilterOutputStream {
            /* synthetic */ a(a aVar, OutputStream outputStream, AnonymousClass1 anonymousClass1) {
                this(outputStream);
            }

            private a(OutputStream outputStream) {
                super(outputStream);
            }

            public void write(int i) {
                try {
                    this.out.write(i);
                } catch (IOException unused) {
                    a.this.hasErrors = true;
                }
            }

            public void write(byte[] bArr, int i, int i2) {
                try {
                    this.out.write(bArr, i, i2);
                } catch (IOException unused) {
                    a.this.hasErrors = true;
                }
            }

            public void close() {
                try {
                    this.out.close();
                } catch (IOException unused) {
                    a.this.hasErrors = true;
                }
            }

            public void flush() {
                try {
                    this.out.flush();
                } catch (IOException unused) {
                    a.this.hasErrors = true;
                }
            }
        }

        /* synthetic */ a(a aVar, b bVar, AnonymousClass1 anonymousClass1) {
            this(bVar);
        }

        private a(b bVar) {
            this.etQ = bVar;
            this.written = bVar.readable ? null : new boolean[a.this.valueCount];
        }

        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0024 */
        /* JADX WARNING: Can't wrap try/catch for region: R(12:5|(1:7)|8|9|10|11|12|13|14|15|16|17) */
        public java.io.OutputStream hX(int r4) {
            /*
            r3 = this;
            r0 = com.a.a.a.this;
            monitor-enter(r0);
            r1 = r3.etQ;	 Catch:{ all -> 0x0046 }
            r1 = r1.etT;	 Catch:{ all -> 0x0046 }
            if (r1 != r3) goto L_0x0040;
        L_0x000b:
            r1 = r3.etQ;	 Catch:{ all -> 0x0046 }
            r1 = r1.readable;	 Catch:{ all -> 0x0046 }
            if (r1 != 0) goto L_0x0018;
        L_0x0013:
            r1 = r3.written;	 Catch:{ all -> 0x0046 }
            r2 = 1;
            r1[r4] = r2;	 Catch:{ all -> 0x0046 }
        L_0x0018:
            r1 = r3.etQ;	 Catch:{ all -> 0x0046 }
            r4 = r1.hZ(r4);	 Catch:{ all -> 0x0046 }
            r1 = new java.io.FileOutputStream;	 Catch:{ FileNotFoundException -> 0x0024 }
            r1.<init>(r4);	 Catch:{ FileNotFoundException -> 0x0024 }
            goto L_0x0032;
        L_0x0024:
            r1 = com.a.a.a.this;	 Catch:{ all -> 0x0046 }
            r1 = r1.directory;	 Catch:{ all -> 0x0046 }
            r1.mkdirs();	 Catch:{ all -> 0x0046 }
            r1 = new java.io.FileOutputStream;	 Catch:{ FileNotFoundException -> 0x003a }
            r1.<init>(r4);	 Catch:{ FileNotFoundException -> 0x003a }
        L_0x0032:
            r4 = new com.a.a.a$a$a;	 Catch:{ all -> 0x0046 }
            r2 = 0;
            r4.<init>(r3, r1, r2);	 Catch:{ all -> 0x0046 }
            monitor-exit(r0);	 Catch:{ all -> 0x0046 }
            return r4;
        L_0x003a:
            r4 = com.a.a.a.Yu;	 Catch:{ all -> 0x0046 }
            monitor-exit(r0);	 Catch:{ all -> 0x0046 }
            return r4;
        L_0x0040:
            r4 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x0046 }
            r4.<init>();	 Catch:{ all -> 0x0046 }
            throw r4;	 Catch:{ all -> 0x0046 }
        L_0x0046:
            r4 = move-exception;
            monitor-exit(r0);	 Catch:{ all -> 0x0046 }
            throw r4;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.a.a.a$a.hX(int):java.io.OutputStream");
        }

        public void commit() {
            if (this.hasErrors) {
                a.this.a(this, false);
                a.this.remove(this.etQ.key);
            } else {
                a.this.a(this, true);
            }
            this.etR = true;
        }

        public void abort() {
            a.this.a(this, false);
        }

        public void abortUnlessCommitted() {
            if (!this.etR) {
                try {
                    abort();
                } catch (IOException unused) {
                }
            }
        }
    }

    /* compiled from: DiskLruCache */
    private final class b {
        private a etT;
        private final String key;
        private final long[] lengths;
        private boolean readable;
        private long sequenceNumber;

        /* synthetic */ b(a aVar, String str, AnonymousClass1 anonymousClass1) {
            this(str);
        }

        private b(String str) {
            this.key = str;
            this.lengths = new long[a.this.valueCount];
        }

        public String bdi() {
            StringBuilder stringBuilder = new StringBuilder();
            for (long j : this.lengths) {
                stringBuilder.append(' ');
                stringBuilder.append(j);
            }
            return stringBuilder.toString();
        }

        private void setLengths(String[] strArr) {
            if (strArr.length == a.this.valueCount) {
                int i = 0;
                while (i < strArr.length) {
                    try {
                        this.lengths[i] = Long.parseLong(strArr[i]);
                        i++;
                    } catch (NumberFormatException unused) {
                        throw invalidLengths(strArr);
                    }
                }
                return;
            }
            throw invalidLengths(strArr);
        }

        private IOException invalidLengths(String[] strArr) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("unexpected journal line: ");
            stringBuilder.append(Arrays.toString(strArr));
            throw new IOException(stringBuilder.toString());
        }

        public File hY(int i) {
            File f = a.this.directory;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.key);
            stringBuilder.append(".");
            stringBuilder.append(i);
            return new File(f, stringBuilder.toString());
        }

        public File hZ(int i) {
            File f = a.this.directory;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.key);
            stringBuilder.append(".");
            stringBuilder.append(i);
            stringBuilder.append(".tmp");
            return new File(f, stringBuilder.toString());
        }
    }

    /* compiled from: DiskLruCache */
    public final class c implements Closeable {
        private final InputStream[] etU;
        private final String key;
        private final long[] lengths;
        private final long sequenceNumber;

        /* synthetic */ c(a aVar, String str, long j, InputStream[] inputStreamArr, long[] jArr, AnonymousClass1 anonymousClass1) {
            this(str, j, inputStreamArr, jArr);
        }

        private c(String str, long j, InputStream[] inputStreamArr, long[] jArr) {
            this.key = str;
            this.sequenceNumber = j;
            this.etU = inputStreamArr;
            this.lengths = jArr;
        }

        public InputStream ia(int i) {
            return this.etU[i];
        }

        public void close() {
            for (Closeable closeQuietly : this.etU) {
                c.closeQuietly(closeQuietly);
            }
        }
    }

    private a(File file, int i, int i2, long j) {
        File file2 = file;
        this.directory = file2;
        this.appVersion = i;
        this.journalFile = new File(file2, "journal");
        this.journalFileTmp = new File(file2, "journal.tmp");
        this.journalFileBackup = new File(file2, "journal.bkp");
        this.valueCount = i2;
        this.maxSize = j;
    }

    public static a a(File file, int i, int i2, long j) {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        } else if (i2 > 0) {
            File file2 = new File(file, "journal.bkp");
            if (file2.exists()) {
                File file3 = new File(file, "journal");
                if (file3.exists()) {
                    file2.delete();
                } else {
                    a(file2, file3, false);
                }
            }
            a aVar = new a(file, i, i2, j);
            if (aVar.journalFile.exists()) {
                try {
                    aVar.readJournal();
                    aVar.processJournal();
                    aVar.etM = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(aVar.journalFile, true), c.US_ASCII));
                    return aVar;
                } catch (IOException e) {
                    PrintStream printStream = System.out;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("DiskLruCache ");
                    stringBuilder.append(file);
                    stringBuilder.append(" is corrupt: ");
                    stringBuilder.append(e.getMessage());
                    stringBuilder.append(", removing");
                    printStream.println(stringBuilder.toString());
                    aVar.delete();
                }
            }
            file.mkdirs();
            aVar = new a(file, i, i2, j);
            aVar.rebuildJournal();
            return aVar;
        } else {
            throw new IllegalArgumentException("valueCount <= 0");
        }
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:19:0x006c=Splitter:B:19:0x006c, B:16:0x005f=Splitter:B:16:0x005f} */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x005f */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:16|17|24) */
    /* JADX WARNING: Missing block: B:17:?, code skipped:
            r9.redundantOpCount = r0 - r9.lruEntries.size();
     */
    private void readJournal() {
        /*
        r9 = this;
        r0 = ", ";
        r1 = new com.a.a.b;
        r2 = new java.io.FileInputStream;
        r3 = r9.journalFile;
        r2.<init>(r3);
        r3 = com.a.a.c.US_ASCII;
        r1.<init>(r2, r3);
        r2 = r1.readLine();	 Catch:{ all -> 0x009b }
        r3 = r1.readLine();	 Catch:{ all -> 0x009b }
        r4 = r1.readLine();	 Catch:{ all -> 0x009b }
        r5 = r1.readLine();	 Catch:{ all -> 0x009b }
        r6 = r1.readLine();	 Catch:{ all -> 0x009b }
        r7 = "libcore.io.DiskLruCache";
        r7 = r7.equals(r2);	 Catch:{ all -> 0x009b }
        if (r7 == 0) goto L_0x006c;
    L_0x002c:
        r7 = "1";
        r7 = r7.equals(r3);	 Catch:{ all -> 0x009b }
        if (r7 == 0) goto L_0x006c;
    L_0x0034:
        r7 = r9.appVersion;	 Catch:{ all -> 0x009b }
        r7 = java.lang.Integer.toString(r7);	 Catch:{ all -> 0x009b }
        r4 = r7.equals(r4);	 Catch:{ all -> 0x009b }
        if (r4 == 0) goto L_0x006c;
    L_0x0040:
        r4 = r9.valueCount;	 Catch:{ all -> 0x009b }
        r4 = java.lang.Integer.toString(r4);	 Catch:{ all -> 0x009b }
        r4 = r4.equals(r5);	 Catch:{ all -> 0x009b }
        if (r4 == 0) goto L_0x006c;
    L_0x004c:
        r4 = "";
        r4 = r4.equals(r6);	 Catch:{ all -> 0x009b }
        if (r4 == 0) goto L_0x006c;
    L_0x0054:
        r0 = 0;
    L_0x0055:
        r2 = r1.readLine();	 Catch:{ EOFException -> 0x005f }
        r9.readJournalLine(r2);	 Catch:{ EOFException -> 0x005f }
        r0 = r0 + 1;
        goto L_0x0055;
    L_0x005f:
        r2 = r9.lruEntries;	 Catch:{ all -> 0x009b }
        r2 = r2.size();	 Catch:{ all -> 0x009b }
        r0 = r0 - r2;
        r9.redundantOpCount = r0;	 Catch:{ all -> 0x009b }
        com.a.a.c.closeQuietly(r1);
        return;
    L_0x006c:
        r4 = new java.io.IOException;	 Catch:{ all -> 0x009b }
        r7 = new java.lang.StringBuilder;	 Catch:{ all -> 0x009b }
        r7.<init>();	 Catch:{ all -> 0x009b }
        r8 = "unexpected journal header: [";
        r7.append(r8);	 Catch:{ all -> 0x009b }
        r7.append(r2);	 Catch:{ all -> 0x009b }
        r7.append(r0);	 Catch:{ all -> 0x009b }
        r7.append(r3);	 Catch:{ all -> 0x009b }
        r7.append(r0);	 Catch:{ all -> 0x009b }
        r7.append(r5);	 Catch:{ all -> 0x009b }
        r7.append(r0);	 Catch:{ all -> 0x009b }
        r7.append(r6);	 Catch:{ all -> 0x009b }
        r0 = "]";
        r7.append(r0);	 Catch:{ all -> 0x009b }
        r0 = r7.toString();	 Catch:{ all -> 0x009b }
        r4.<init>(r0);	 Catch:{ all -> 0x009b }
        throw r4;	 Catch:{ all -> 0x009b }
    L_0x009b:
        r0 = move-exception;
        com.a.a.c.closeQuietly(r1);
        goto L_0x00a1;
    L_0x00a0:
        throw r0;
    L_0x00a1:
        goto L_0x00a0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.a.a.a.readJournal():void");
    }

    private void readJournalLine(String str) {
        int indexOf = str.indexOf(32);
        String str2 = "unexpected journal line: ";
        StringBuilder stringBuilder;
        if (indexOf != -1) {
            Object substring;
            int i = indexOf + 1;
            int indexOf2 = str.indexOf(32, i);
            if (indexOf2 == -1) {
                substring = str.substring(i);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    this.lruEntries.remove(substring);
                    return;
                }
            }
            substring = str.substring(i, indexOf2);
            b bVar = (b) this.lruEntries.get(substring);
            if (bVar == null) {
                bVar = new b(this, substring, null);
                this.lruEntries.put(substring, bVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                bVar.readable = true;
                bVar.etT = null;
                bVar.setLengths(split);
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                bVar.etT = new a(this, bVar, null);
            } else if (!(indexOf2 == -1 && indexOf == 4 && str.startsWith("READ"))) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str2);
                stringBuilder.append(str);
                throw new IOException(stringBuilder.toString());
            }
            return;
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append(str2);
        stringBuilder.append(str);
        throw new IOException(stringBuilder.toString());
    }

    private void processJournal() {
        u(this.journalFileTmp);
        Iterator it = this.lruEntries.values().iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            int i = 0;
            if (bVar.etT == null) {
                while (i < this.valueCount) {
                    this.size += bVar.lengths[i];
                    i++;
                }
            } else {
                bVar.etT = null;
                while (i < this.valueCount) {
                    u(bVar.hY(i));
                    u(bVar.hZ(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    private synchronized void rebuildJournal() {
        if (this.etM != null) {
            this.etM.close();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.journalFileTmp), c.US_ASCII));
        try {
            bufferedWriter.write("libcore.io.DiskLruCache");
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.appVersion));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.valueCount));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (b bVar : this.lruEntries.values()) {
                StringBuilder stringBuilder;
                if (bVar.etT != null) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("DIRTY ");
                    stringBuilder.append(bVar.key);
                    stringBuilder.append(10);
                    bufferedWriter.write(stringBuilder.toString());
                } else {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("CLEAN ");
                    stringBuilder.append(bVar.key);
                    stringBuilder.append(bVar.bdi());
                    stringBuilder.append(10);
                    bufferedWriter.write(stringBuilder.toString());
                }
            }
            if (this.journalFile.exists()) {
                a(this.journalFile, this.journalFileBackup, true);
            }
            a(this.journalFileTmp, this.journalFile, false);
            this.journalFileBackup.delete();
            this.etM = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.journalFile, true), c.US_ASCII));
        } finally {
            bufferedWriter.close();
        }
    }

    private static void u(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    private static void a(File file, File file2, boolean z) {
        if (z) {
            u(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0075 */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:32|33|28|27) */
    /* JADX WARNING: Missing block: B:21:?, code skipped:
            r11.redundantOpCount++;
            r1 = r11.etM;
            r2 = new java.lang.StringBuilder();
            r2.append("READ ");
            r2.append(r12);
            r2.append(10);
            r1.append(r2.toString());
     */
    /* JADX WARNING: Missing block: B:22:0x0059, code skipped:
            if (journalRebuildRequired() == false) goto L_0x0062;
     */
    /* JADX WARNING: Missing block: B:23:0x005b, code skipped:
            r11.etN.submit(r11.etO);
     */
    /* JADX WARNING: Missing block: B:26:0x0074, code skipped:
            return new com.a.a.a.c(r11, r12, com.a.a.a.b.e(r0), r8, com.a.a.a.b.b(r0), null);
     */
    /* JADX WARNING: Missing block: B:35:0x0086, code skipped:
            return null;
     */
    public synchronized com.a.a.a.c ic(java.lang.String r12) {
        /*
        r11 = this;
        monitor-enter(r11);
        r11.checkNotClosed();	 Catch:{ all -> 0x0087 }
        r11.validateKey(r12);	 Catch:{ all -> 0x0087 }
        r0 = r11.lruEntries;	 Catch:{ all -> 0x0087 }
        r0 = r0.get(r12);	 Catch:{ all -> 0x0087 }
        r0 = (com.a.a.a.b) r0;	 Catch:{ all -> 0x0087 }
        r1 = 0;
        if (r0 != 0) goto L_0x0014;
    L_0x0012:
        monitor-exit(r11);
        return r1;
    L_0x0014:
        r2 = r0.readable;	 Catch:{ all -> 0x0087 }
        if (r2 != 0) goto L_0x001c;
    L_0x001a:
        monitor-exit(r11);
        return r1;
    L_0x001c:
        r2 = r11.valueCount;	 Catch:{ all -> 0x0087 }
        r8 = new java.io.InputStream[r2];	 Catch:{ all -> 0x0087 }
        r2 = 0;
        r3 = 0;
    L_0x0022:
        r4 = r11.valueCount;	 Catch:{ FileNotFoundException -> 0x0075 }
        if (r3 >= r4) goto L_0x0034;
    L_0x0026:
        r4 = new java.io.FileInputStream;	 Catch:{ FileNotFoundException -> 0x0075 }
        r5 = r0.hY(r3);	 Catch:{ FileNotFoundException -> 0x0075 }
        r4.<init>(r5);	 Catch:{ FileNotFoundException -> 0x0075 }
        r8[r3] = r4;	 Catch:{ FileNotFoundException -> 0x0075 }
        r3 = r3 + 1;
        goto L_0x0022;
    L_0x0034:
        r1 = r11.redundantOpCount;	 Catch:{ all -> 0x0087 }
        r1 = r1 + 1;
        r11.redundantOpCount = r1;	 Catch:{ all -> 0x0087 }
        r1 = r11.etM;	 Catch:{ all -> 0x0087 }
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0087 }
        r2.<init>();	 Catch:{ all -> 0x0087 }
        r3 = "READ ";
        r2.append(r3);	 Catch:{ all -> 0x0087 }
        r2.append(r12);	 Catch:{ all -> 0x0087 }
        r3 = 10;
        r2.append(r3);	 Catch:{ all -> 0x0087 }
        r2 = r2.toString();	 Catch:{ all -> 0x0087 }
        r1.append(r2);	 Catch:{ all -> 0x0087 }
        r1 = r11.journalRebuildRequired();	 Catch:{ all -> 0x0087 }
        if (r1 == 0) goto L_0x0062;
    L_0x005b:
        r1 = r11.etN;	 Catch:{ all -> 0x0087 }
        r2 = r11.etO;	 Catch:{ all -> 0x0087 }
        r1.submit(r2);	 Catch:{ all -> 0x0087 }
    L_0x0062:
        r1 = new com.a.a.a$c;	 Catch:{ all -> 0x0087 }
        r6 = r0.sequenceNumber;	 Catch:{ all -> 0x0087 }
        r9 = r0.lengths;	 Catch:{ all -> 0x0087 }
        r10 = 0;
        r3 = r1;
        r4 = r11;
        r5 = r12;
        r3.<init>(r4, r5, r6, r8, r9, r10);	 Catch:{ all -> 0x0087 }
        monitor-exit(r11);
        return r1;
    L_0x0075:
        r12 = r11.valueCount;	 Catch:{ all -> 0x0087 }
        if (r2 >= r12) goto L_0x0085;
    L_0x0079:
        r12 = r8[r2];	 Catch:{ all -> 0x0087 }
        if (r12 == 0) goto L_0x0085;
    L_0x007d:
        r12 = r8[r2];	 Catch:{ all -> 0x0087 }
        com.a.a.c.closeQuietly(r12);	 Catch:{ all -> 0x0087 }
        r2 = r2 + 1;
        goto L_0x0075;
    L_0x0085:
        monitor-exit(r11);
        return r1;
    L_0x0087:
        r12 = move-exception;
        monitor-exit(r11);
        goto L_0x008b;
    L_0x008a:
        throw r12;
    L_0x008b:
        goto L_0x008a;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.a.a.a.ic(java.lang.String):com.a.a.a$c");
    }

    public a ko(String str) {
        return h(str, -1);
    }

    /* JADX WARNING: Missing block: B:9:0x0021, code skipped:
            return null;
     */
    private synchronized com.a.a.a.a h(java.lang.String r6, long r7) {
        /*
        r5 = this;
        monitor-enter(r5);
        r5.checkNotClosed();	 Catch:{ all -> 0x0061 }
        r5.validateKey(r6);	 Catch:{ all -> 0x0061 }
        r0 = r5.lruEntries;	 Catch:{ all -> 0x0061 }
        r0 = r0.get(r6);	 Catch:{ all -> 0x0061 }
        r0 = (com.a.a.a.b) r0;	 Catch:{ all -> 0x0061 }
        r1 = -1;
        r3 = 0;
        r4 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1));
        if (r4 == 0) goto L_0x0022;
    L_0x0016:
        if (r0 == 0) goto L_0x0020;
    L_0x0018:
        r1 = r0.sequenceNumber;	 Catch:{ all -> 0x0061 }
        r4 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1));
        if (r4 == 0) goto L_0x0022;
    L_0x0020:
        monitor-exit(r5);
        return r3;
    L_0x0022:
        if (r0 != 0) goto L_0x002f;
    L_0x0024:
        r0 = new com.a.a.a$b;	 Catch:{ all -> 0x0061 }
        r0.<init>(r5, r6, r3);	 Catch:{ all -> 0x0061 }
        r7 = r5.lruEntries;	 Catch:{ all -> 0x0061 }
        r7.put(r6, r0);	 Catch:{ all -> 0x0061 }
        goto L_0x0037;
    L_0x002f:
        r7 = r0.etT;	 Catch:{ all -> 0x0061 }
        if (r7 == 0) goto L_0x0037;
    L_0x0035:
        monitor-exit(r5);
        return r3;
    L_0x0037:
        r7 = new com.a.a.a$a;	 Catch:{ all -> 0x0061 }
        r7.<init>(r5, r0, r3);	 Catch:{ all -> 0x0061 }
        r0.etT = r7;	 Catch:{ all -> 0x0061 }
        r8 = r5.etM;	 Catch:{ all -> 0x0061 }
        r0 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0061 }
        r0.<init>();	 Catch:{ all -> 0x0061 }
        r1 = "DIRTY ";
        r0.append(r1);	 Catch:{ all -> 0x0061 }
        r0.append(r6);	 Catch:{ all -> 0x0061 }
        r6 = 10;
        r0.append(r6);	 Catch:{ all -> 0x0061 }
        r6 = r0.toString();	 Catch:{ all -> 0x0061 }
        r8.write(r6);	 Catch:{ all -> 0x0061 }
        r6 = r5.etM;	 Catch:{ all -> 0x0061 }
        r6.flush();	 Catch:{ all -> 0x0061 }
        monitor-exit(r5);
        return r7;
    L_0x0061:
        r6 = move-exception;
        monitor-exit(r5);
        throw r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.a.a.a.h(java.lang.String, long):com.a.a.a$a");
    }

    /* JADX WARNING: Missing block: B:43:0x0109, code skipped:
            return;
     */
    private synchronized void a(com.a.a.a.a r10, boolean r11) {
        /*
        r9 = this;
        monitor-enter(r9);
        r0 = r10.etQ;	 Catch:{ all -> 0x0110 }
        r1 = r0.etT;	 Catch:{ all -> 0x0110 }
        if (r1 != r10) goto L_0x010a;
    L_0x000b:
        r1 = 0;
        if (r11 == 0) goto L_0x004d;
    L_0x000e:
        r2 = r0.readable;	 Catch:{ all -> 0x0110 }
        if (r2 != 0) goto L_0x004d;
    L_0x0014:
        r2 = 0;
    L_0x0015:
        r3 = r9.valueCount;	 Catch:{ all -> 0x0110 }
        if (r2 >= r3) goto L_0x004d;
    L_0x0019:
        r3 = r10.written;	 Catch:{ all -> 0x0110 }
        r3 = r3[r2];	 Catch:{ all -> 0x0110 }
        if (r3 == 0) goto L_0x0033;
    L_0x0021:
        r3 = r0.hZ(r2);	 Catch:{ all -> 0x0110 }
        r3 = r3.exists();	 Catch:{ all -> 0x0110 }
        if (r3 != 0) goto L_0x0030;
    L_0x002b:
        r10.abort();	 Catch:{ all -> 0x0110 }
        monitor-exit(r9);
        return;
    L_0x0030:
        r2 = r2 + 1;
        goto L_0x0015;
    L_0x0033:
        r10.abort();	 Catch:{ all -> 0x0110 }
        r10 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x0110 }
        r11 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0110 }
        r11.<init>();	 Catch:{ all -> 0x0110 }
        r0 = "Newly created entry didn't create value for index ";
        r11.append(r0);	 Catch:{ all -> 0x0110 }
        r11.append(r2);	 Catch:{ all -> 0x0110 }
        r11 = r11.toString();	 Catch:{ all -> 0x0110 }
        r10.<init>(r11);	 Catch:{ all -> 0x0110 }
        throw r10;	 Catch:{ all -> 0x0110 }
    L_0x004d:
        r10 = r9.valueCount;	 Catch:{ all -> 0x0110 }
        if (r1 >= r10) goto L_0x0081;
    L_0x0051:
        r10 = r0.hZ(r1);	 Catch:{ all -> 0x0110 }
        if (r11 == 0) goto L_0x007b;
    L_0x0057:
        r2 = r10.exists();	 Catch:{ all -> 0x0110 }
        if (r2 == 0) goto L_0x007e;
    L_0x005d:
        r2 = r0.hY(r1);	 Catch:{ all -> 0x0110 }
        r10.renameTo(r2);	 Catch:{ all -> 0x0110 }
        r10 = r0.lengths;	 Catch:{ all -> 0x0110 }
        r3 = r10[r1];	 Catch:{ all -> 0x0110 }
        r5 = r2.length();	 Catch:{ all -> 0x0110 }
        r10 = r0.lengths;	 Catch:{ all -> 0x0110 }
        r10[r1] = r5;	 Catch:{ all -> 0x0110 }
        r7 = r9.size;	 Catch:{ all -> 0x0110 }
        r7 = r7 - r3;
        r7 = r7 + r5;
        r9.size = r7;	 Catch:{ all -> 0x0110 }
        goto L_0x007e;
    L_0x007b:
        u(r10);	 Catch:{ all -> 0x0110 }
    L_0x007e:
        r1 = r1 + 1;
        goto L_0x004d;
    L_0x0081:
        r10 = r9.redundantOpCount;	 Catch:{ all -> 0x0110 }
        r1 = 1;
        r10 = r10 + r1;
        r9.redundantOpCount = r10;	 Catch:{ all -> 0x0110 }
        r10 = 0;
        r0.etT = r10;	 Catch:{ all -> 0x0110 }
        r10 = r0.readable;	 Catch:{ all -> 0x0110 }
        r10 = r10 | r11;
        r2 = 10;
        if (r10 == 0) goto L_0x00c8;
    L_0x0094:
        r0.readable = r1;	 Catch:{ all -> 0x0110 }
        r10 = r9.etM;	 Catch:{ all -> 0x0110 }
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0110 }
        r1.<init>();	 Catch:{ all -> 0x0110 }
        r3 = "CLEAN ";
        r1.append(r3);	 Catch:{ all -> 0x0110 }
        r3 = r0.key;	 Catch:{ all -> 0x0110 }
        r1.append(r3);	 Catch:{ all -> 0x0110 }
        r3 = r0.bdi();	 Catch:{ all -> 0x0110 }
        r1.append(r3);	 Catch:{ all -> 0x0110 }
        r1.append(r2);	 Catch:{ all -> 0x0110 }
        r1 = r1.toString();	 Catch:{ all -> 0x0110 }
        r10.write(r1);	 Catch:{ all -> 0x0110 }
        if (r11 == 0) goto L_0x00ee;
    L_0x00bd:
        r10 = r9.nextSequenceNumber;	 Catch:{ all -> 0x0110 }
        r1 = 1;
        r1 = r1 + r10;
        r9.nextSequenceNumber = r1;	 Catch:{ all -> 0x0110 }
        r0.sequenceNumber = r10;	 Catch:{ all -> 0x0110 }
        goto L_0x00ee;
    L_0x00c8:
        r10 = r9.lruEntries;	 Catch:{ all -> 0x0110 }
        r11 = r0.key;	 Catch:{ all -> 0x0110 }
        r10.remove(r11);	 Catch:{ all -> 0x0110 }
        r10 = r9.etM;	 Catch:{ all -> 0x0110 }
        r11 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0110 }
        r11.<init>();	 Catch:{ all -> 0x0110 }
        r1 = "REMOVE ";
        r11.append(r1);	 Catch:{ all -> 0x0110 }
        r0 = r0.key;	 Catch:{ all -> 0x0110 }
        r11.append(r0);	 Catch:{ all -> 0x0110 }
        r11.append(r2);	 Catch:{ all -> 0x0110 }
        r11 = r11.toString();	 Catch:{ all -> 0x0110 }
        r10.write(r11);	 Catch:{ all -> 0x0110 }
    L_0x00ee:
        r10 = r9.etM;	 Catch:{ all -> 0x0110 }
        r10.flush();	 Catch:{ all -> 0x0110 }
        r10 = r9.size;	 Catch:{ all -> 0x0110 }
        r0 = r9.maxSize;	 Catch:{ all -> 0x0110 }
        r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1));
        if (r2 > 0) goto L_0x0101;
    L_0x00fb:
        r10 = r9.journalRebuildRequired();	 Catch:{ all -> 0x0110 }
        if (r10 == 0) goto L_0x0108;
    L_0x0101:
        r10 = r9.etN;	 Catch:{ all -> 0x0110 }
        r11 = r9.etO;	 Catch:{ all -> 0x0110 }
        r10.submit(r11);	 Catch:{ all -> 0x0110 }
    L_0x0108:
        monitor-exit(r9);
        return;
    L_0x010a:
        r10 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x0110 }
        r10.<init>();	 Catch:{ all -> 0x0110 }
        throw r10;	 Catch:{ all -> 0x0110 }
    L_0x0110:
        r10 = move-exception;
        monitor-exit(r9);
        goto L_0x0114;
    L_0x0113:
        throw r10;
    L_0x0114:
        goto L_0x0113;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.a.a.a.a(com.a.a.a$a, boolean):void");
    }

    private boolean journalRebuildRequired() {
        int i = this.redundantOpCount;
        return i >= CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE && i >= this.lruEntries.size();
    }

    /* JADX WARNING: Missing block: B:21:0x0090, code skipped:
            return true;
     */
    /* JADX WARNING: Missing block: B:23:0x0092, code skipped:
            return false;
     */
    public synchronized boolean remove(java.lang.String r8) {
        /*
        r7 = this;
        monitor-enter(r7);
        r7.checkNotClosed();	 Catch:{ all -> 0x0093 }
        r7.validateKey(r8);	 Catch:{ all -> 0x0093 }
        r0 = r7.lruEntries;	 Catch:{ all -> 0x0093 }
        r0 = r0.get(r8);	 Catch:{ all -> 0x0093 }
        r0 = (com.a.a.a.b) r0;	 Catch:{ all -> 0x0093 }
        r1 = 0;
        if (r0 == 0) goto L_0x0091;
    L_0x0012:
        r2 = r0.etT;	 Catch:{ all -> 0x0093 }
        if (r2 == 0) goto L_0x001a;
    L_0x0018:
        goto L_0x0091;
    L_0x001a:
        r2 = r7.valueCount;	 Catch:{ all -> 0x0093 }
        if (r1 >= r2) goto L_0x005c;
    L_0x001e:
        r2 = r0.hY(r1);	 Catch:{ all -> 0x0093 }
        r3 = r2.exists();	 Catch:{ all -> 0x0093 }
        if (r3 == 0) goto L_0x0046;
    L_0x0028:
        r3 = r2.delete();	 Catch:{ all -> 0x0093 }
        if (r3 == 0) goto L_0x002f;
    L_0x002e:
        goto L_0x0046;
    L_0x002f:
        r8 = new java.io.IOException;	 Catch:{ all -> 0x0093 }
        r0 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0093 }
        r0.<init>();	 Catch:{ all -> 0x0093 }
        r1 = "failed to delete ";
        r0.append(r1);	 Catch:{ all -> 0x0093 }
        r0.append(r2);	 Catch:{ all -> 0x0093 }
        r0 = r0.toString();	 Catch:{ all -> 0x0093 }
        r8.<init>(r0);	 Catch:{ all -> 0x0093 }
        throw r8;	 Catch:{ all -> 0x0093 }
    L_0x0046:
        r2 = r7.size;	 Catch:{ all -> 0x0093 }
        r4 = r0.lengths;	 Catch:{ all -> 0x0093 }
        r5 = r4[r1];	 Catch:{ all -> 0x0093 }
        r2 = r2 - r5;
        r7.size = r2;	 Catch:{ all -> 0x0093 }
        r2 = r0.lengths;	 Catch:{ all -> 0x0093 }
        r3 = 0;
        r2[r1] = r3;	 Catch:{ all -> 0x0093 }
        r1 = r1 + 1;
        goto L_0x001a;
    L_0x005c:
        r0 = r7.redundantOpCount;	 Catch:{ all -> 0x0093 }
        r1 = 1;
        r0 = r0 + r1;
        r7.redundantOpCount = r0;	 Catch:{ all -> 0x0093 }
        r0 = r7.etM;	 Catch:{ all -> 0x0093 }
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0093 }
        r2.<init>();	 Catch:{ all -> 0x0093 }
        r3 = "REMOVE ";
        r2.append(r3);	 Catch:{ all -> 0x0093 }
        r2.append(r8);	 Catch:{ all -> 0x0093 }
        r3 = 10;
        r2.append(r3);	 Catch:{ all -> 0x0093 }
        r2 = r2.toString();	 Catch:{ all -> 0x0093 }
        r0.append(r2);	 Catch:{ all -> 0x0093 }
        r0 = r7.lruEntries;	 Catch:{ all -> 0x0093 }
        r0.remove(r8);	 Catch:{ all -> 0x0093 }
        r8 = r7.journalRebuildRequired();	 Catch:{ all -> 0x0093 }
        if (r8 == 0) goto L_0x008f;
    L_0x0088:
        r8 = r7.etN;	 Catch:{ all -> 0x0093 }
        r0 = r7.etO;	 Catch:{ all -> 0x0093 }
        r8.submit(r0);	 Catch:{ all -> 0x0093 }
    L_0x008f:
        monitor-exit(r7);
        return r1;
    L_0x0091:
        monitor-exit(r7);
        return r1;
    L_0x0093:
        r8 = move-exception;
        monitor-exit(r7);
        goto L_0x0097;
    L_0x0096:
        throw r8;
    L_0x0097:
        goto L_0x0096;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.a.a.a.remove(java.lang.String):boolean");
    }

    private void checkNotClosed() {
        if (this.etM == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public synchronized void close() {
        if (this.etM != null) {
            Iterator it = new ArrayList(this.lruEntries.values()).iterator();
            while (it.hasNext()) {
                b bVar = (b) it.next();
                if (bVar.etT != null) {
                    bVar.etT.abort();
                }
            }
            trimToSize();
            this.etM.close();
            this.etM = null;
        }
    }

    private void trimToSize() {
        while (this.size > this.maxSize) {
            remove((String) ((Entry) this.lruEntries.entrySet().iterator().next()).getKey());
        }
    }

    public void delete() {
        close();
        c.deleteContents(this.directory);
    }

    private void validateKey(String str) {
        if (!LEGAL_KEY_PATTERN.matcher(str).matches()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("keys must match regex [a-z0-9_-]{1,64}: \"");
            stringBuilder.append(str);
            stringBuilder.append("\"");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }
}
