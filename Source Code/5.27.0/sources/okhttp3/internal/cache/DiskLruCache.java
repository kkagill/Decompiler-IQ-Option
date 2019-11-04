package okhttp3.internal.cache;

import com.google.android.gms.auth.api.credentials.CredentialsApi;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import okhttp3.internal.Util;
import okhttp3.internal.io.FileSystem;
import okhttp3.internal.platform.Platform;
import okio.BufferedSink;
import okio.Okio;
import okio.Sink;
import okio.Source;

public final class DiskLruCache implements Closeable, Flushable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    static final long ANY_SEQUENCE_NUMBER = -1;
    private static final String CLEAN = "CLEAN";
    private static final String DIRTY = "DIRTY";
    static final String JOURNAL_FILE = "journal";
    static final String JOURNAL_FILE_BACKUP = "journal.bkp";
    static final String JOURNAL_FILE_TEMP = "journal.tmp";
    static final Pattern LEGAL_KEY_PATTERN = Pattern.compile("[a-z0-9_-]{1,120}");
    static final String MAGIC = "libcore.io.DiskLruCache";
    private static final String READ = "READ";
    private static final String REMOVE = "REMOVE";
    static final String VERSION_1 = "1";
    private final int appVersion;
    private final Runnable cleanupRunnable = new Runnable() {
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0033 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x001d */
        /* JADX WARNING: Can't wrap try/catch for region: R(7:11|12|13|14|15|16|(1:18)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(2:19|20) */
        /* JADX WARNING: Missing block: B:20:?, code skipped:
            r5.this$0.mostRecentRebuildFailed = true;
            r5.this$0.journalWriter = okio.Okio.buffer(okio.Okio.blackhole());
     */
        public void run() {
            /*
            r5 = this;
            r0 = okhttp3.internal.cache.DiskLruCache.this;
            monitor-enter(r0);
            r1 = okhttp3.internal.cache.DiskLruCache.this;	 Catch:{ all -> 0x0045 }
            r1 = r1.initialized;	 Catch:{ all -> 0x0045 }
            r2 = 0;
            r3 = 1;
            if (r1 != 0) goto L_0x000d;
        L_0x000b:
            r1 = 1;
            goto L_0x000e;
        L_0x000d:
            r1 = 0;
        L_0x000e:
            r4 = okhttp3.internal.cache.DiskLruCache.this;	 Catch:{ all -> 0x0045 }
            r4 = r4.closed;	 Catch:{ all -> 0x0045 }
            r1 = r1 | r4;
            if (r1 == 0) goto L_0x0017;
        L_0x0015:
            monitor-exit(r0);	 Catch:{ all -> 0x0045 }
            return;
        L_0x0017:
            r1 = okhttp3.internal.cache.DiskLruCache.this;	 Catch:{ IOException -> 0x001d }
            r1.trimToSize();	 Catch:{ IOException -> 0x001d }
            goto L_0x0021;
        L_0x001d:
            r1 = okhttp3.internal.cache.DiskLruCache.this;	 Catch:{ all -> 0x0045 }
            r1.mostRecentTrimFailed = r3;	 Catch:{ all -> 0x0045 }
        L_0x0021:
            r1 = okhttp3.internal.cache.DiskLruCache.this;	 Catch:{ IOException -> 0x0033 }
            r1 = r1.journalRebuildRequired();	 Catch:{ IOException -> 0x0033 }
            if (r1 == 0) goto L_0x0043;
        L_0x0029:
            r1 = okhttp3.internal.cache.DiskLruCache.this;	 Catch:{ IOException -> 0x0033 }
            r1.rebuildJournal();	 Catch:{ IOException -> 0x0033 }
            r1 = okhttp3.internal.cache.DiskLruCache.this;	 Catch:{ IOException -> 0x0033 }
            r1.redundantOpCount = r2;	 Catch:{ IOException -> 0x0033 }
            goto L_0x0043;
        L_0x0033:
            r1 = okhttp3.internal.cache.DiskLruCache.this;	 Catch:{ all -> 0x0045 }
            r1.mostRecentRebuildFailed = r3;	 Catch:{ all -> 0x0045 }
            r1 = okhttp3.internal.cache.DiskLruCache.this;	 Catch:{ all -> 0x0045 }
            r2 = okio.Okio.blackhole();	 Catch:{ all -> 0x0045 }
            r2 = okio.Okio.buffer(r2);	 Catch:{ all -> 0x0045 }
            r1.journalWriter = r2;	 Catch:{ all -> 0x0045 }
        L_0x0043:
            monitor-exit(r0);	 Catch:{ all -> 0x0045 }
            return;
        L_0x0045:
            r1 = move-exception;
            monitor-exit(r0);	 Catch:{ all -> 0x0045 }
            throw r1;
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.DiskLruCache$AnonymousClass1.run():void");
        }
    };
    boolean closed;
    final File directory;
    private final Executor executor;
    final FileSystem fileSystem;
    boolean hasJournalErrors;
    boolean initialized;
    private final File journalFile;
    private final File journalFileBackup;
    private final File journalFileTmp;
    BufferedSink journalWriter;
    final LinkedHashMap<String, Entry> lruEntries = new LinkedHashMap(0, 0.75f, true);
    private long maxSize;
    boolean mostRecentRebuildFailed;
    boolean mostRecentTrimFailed;
    private long nextSequenceNumber = 0;
    int redundantOpCount;
    private long size = 0;
    final int valueCount;

    public final class Editor {
        private boolean done;
        final Entry entry;
        final boolean[] written;

        Editor(Entry entry) {
            this.entry = entry;
            this.written = entry.readable ? null : new boolean[DiskLruCache.this.valueCount];
        }

        /* Access modifiers changed, original: 0000 */
        public void detach() {
            if (this.entry.currentEditor == this) {
                for (int i = 0; i < DiskLruCache.this.valueCount; i++) {
                    try {
                        DiskLruCache.this.fileSystem.delete(this.entry.dirtyFiles[i]);
                    } catch (IOException unused) {
                    }
                }
                this.entry.currentEditor = null;
            }
        }

        /* JADX WARNING: Missing block: B:18:0x0028, code skipped:
            return null;
     */
        public okio.Source newSource(int r5) {
            /*
            r4 = this;
            r0 = okhttp3.internal.cache.DiskLruCache.this;
            monitor-enter(r0);
            r1 = r4.done;	 Catch:{ all -> 0x002f }
            if (r1 != 0) goto L_0x0029;
        L_0x0007:
            r1 = r4.entry;	 Catch:{ all -> 0x002f }
            r1 = r1.readable;	 Catch:{ all -> 0x002f }
            r2 = 0;
            if (r1 == 0) goto L_0x0027;
        L_0x000e:
            r1 = r4.entry;	 Catch:{ all -> 0x002f }
            r1 = r1.currentEditor;	 Catch:{ all -> 0x002f }
            if (r1 == r4) goto L_0x0015;
        L_0x0014:
            goto L_0x0027;
        L_0x0015:
            r1 = okhttp3.internal.cache.DiskLruCache.this;	 Catch:{ FileNotFoundException -> 0x0025 }
            r1 = r1.fileSystem;	 Catch:{ FileNotFoundException -> 0x0025 }
            r3 = r4.entry;	 Catch:{ FileNotFoundException -> 0x0025 }
            r3 = r3.cleanFiles;	 Catch:{ FileNotFoundException -> 0x0025 }
            r5 = r3[r5];	 Catch:{ FileNotFoundException -> 0x0025 }
            r5 = r1.source(r5);	 Catch:{ FileNotFoundException -> 0x0025 }
            monitor-exit(r0);	 Catch:{ all -> 0x002f }
            return r5;
        L_0x0025:
            monitor-exit(r0);	 Catch:{ all -> 0x002f }
            return r2;
        L_0x0027:
            monitor-exit(r0);	 Catch:{ all -> 0x002f }
            return r2;
        L_0x0029:
            r5 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x002f }
            r5.<init>();	 Catch:{ all -> 0x002f }
            throw r5;	 Catch:{ all -> 0x002f }
        L_0x002f:
            r5 = move-exception;
            monitor-exit(r0);	 Catch:{ all -> 0x002f }
            throw r5;
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.DiskLruCache$Editor.newSource(int):okio.Source");
        }

        public Sink newSink(int i) {
            synchronized (DiskLruCache.this) {
                if (this.done) {
                    throw new IllegalStateException();
                } else if (this.entry.currentEditor != this) {
                    Sink blackhole = Okio.blackhole();
                    return blackhole;
                } else {
                    if (!this.entry.readable) {
                        this.written[i] = true;
                    }
                    try {
                        AnonymousClass1 anonymousClass1 = new FaultHidingSink(DiskLruCache.this.fileSystem.sink(this.entry.dirtyFiles[i])) {
                            /* Access modifiers changed, original: protected */
                            public void onException(IOException iOException) {
                                synchronized (DiskLruCache.this) {
                                    Editor.this.detach();
                                }
                            }
                        };
                        return anonymousClass1;
                    } catch (FileNotFoundException unused) {
                        return Okio.blackhole();
                    }
                }
            }
        }

        public void commit() {
            synchronized (DiskLruCache.this) {
                if (this.done) {
                    throw new IllegalStateException();
                }
                if (this.entry.currentEditor == this) {
                    DiskLruCache.this.completeEdit(this, true);
                }
                this.done = true;
            }
        }

        public void abort() {
            synchronized (DiskLruCache.this) {
                if (this.done) {
                    throw new IllegalStateException();
                }
                if (this.entry.currentEditor == this) {
                    DiskLruCache.this.completeEdit(this, false);
                }
                this.done = true;
            }
        }

        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0013 */
        /* JADX WARNING: Can't wrap try/catch for region: R(5:2|3|(2:7|8)|9|10) */
        public void abortUnlessCommitted() {
            /*
            r3 = this;
            r0 = okhttp3.internal.cache.DiskLruCache.this;
            monitor-enter(r0);
            r1 = r3.done;	 Catch:{ all -> 0x0015 }
            if (r1 != 0) goto L_0x0013;
        L_0x0007:
            r1 = r3.entry;	 Catch:{ all -> 0x0015 }
            r1 = r1.currentEditor;	 Catch:{ all -> 0x0015 }
            if (r1 != r3) goto L_0x0013;
        L_0x000d:
            r1 = okhttp3.internal.cache.DiskLruCache.this;	 Catch:{ IOException -> 0x0013 }
            r2 = 0;
            r1.completeEdit(r3, r2);	 Catch:{ IOException -> 0x0013 }
        L_0x0013:
            monitor-exit(r0);	 Catch:{ all -> 0x0015 }
            return;
        L_0x0015:
            r1 = move-exception;
            monitor-exit(r0);	 Catch:{ all -> 0x0015 }
            throw r1;
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.DiskLruCache$Editor.abortUnlessCommitted():void");
        }
    }

    public final class Snapshot implements Closeable {
        private final String key;
        private final long[] lengths;
        private final long sequenceNumber;
        private final Source[] sources;

        Snapshot(String str, long j, Source[] sourceArr, long[] jArr) {
            this.key = str;
            this.sequenceNumber = j;
            this.sources = sourceArr;
            this.lengths = jArr;
        }

        public String key() {
            return this.key;
        }

        public Editor edit() {
            return DiskLruCache.this.edit(this.key, this.sequenceNumber);
        }

        public Source getSource(int i) {
            return this.sources[i];
        }

        public long getLength(int i) {
            return this.lengths[i];
        }

        public void close() {
            for (Closeable closeQuietly : this.sources) {
                Util.closeQuietly(closeQuietly);
            }
        }
    }

    private final class Entry {
        final File[] cleanFiles;
        Editor currentEditor;
        final File[] dirtyFiles;
        final String key;
        final long[] lengths;
        boolean readable;
        long sequenceNumber;

        Entry(String str) {
            this.key = str;
            this.lengths = new long[DiskLruCache.this.valueCount];
            this.cleanFiles = new File[DiskLruCache.this.valueCount];
            this.dirtyFiles = new File[DiskLruCache.this.valueCount];
            StringBuilder stringBuilder = new StringBuilder(str);
            stringBuilder.append('.');
            int length = stringBuilder.length();
            for (int i = 0; i < DiskLruCache.this.valueCount; i++) {
                stringBuilder.append(i);
                this.cleanFiles[i] = new File(DiskLruCache.this.directory, stringBuilder.toString());
                stringBuilder.append(".tmp");
                this.dirtyFiles[i] = new File(DiskLruCache.this.directory, stringBuilder.toString());
                stringBuilder.setLength(length);
            }
        }

        /* Access modifiers changed, original: 0000 */
        public void setLengths(String[] strArr) {
            if (strArr.length == DiskLruCache.this.valueCount) {
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

        /* Access modifiers changed, original: 0000 */
        public void writeLengths(BufferedSink bufferedSink) {
            for (long writeDecimalLong : this.lengths) {
                bufferedSink.writeByte(32).writeDecimalLong(writeDecimalLong);
            }
        }

        private IOException invalidLengths(String[] strArr) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("unexpected journal line: ");
            stringBuilder.append(Arrays.toString(strArr));
            throw new IOException(stringBuilder.toString());
        }

        /* Access modifiers changed, original: 0000 */
        public Snapshot snapshot() {
            if (Thread.holdsLock(DiskLruCache.this)) {
                Source[] sourceArr = new Source[DiskLruCache.this.valueCount];
                long[] jArr = (long[]) this.lengths.clone();
                int i = 0;
                int i2 = 0;
                while (i2 < DiskLruCache.this.valueCount) {
                    try {
                        sourceArr[i2] = DiskLruCache.this.fileSystem.source(this.cleanFiles[i2]);
                        i2++;
                    } catch (FileNotFoundException unused) {
                        while (i < DiskLruCache.this.valueCount && sourceArr[i] != null) {
                            Util.closeQuietly(sourceArr[i]);
                            i++;
                        }
                        try {
                            DiskLruCache.this.removeEntry(this);
                        } catch (IOException unused2) {
                        }
                        return null;
                    }
                }
                return new Snapshot(this.key, this.sequenceNumber, sourceArr, jArr);
            }
            throw new AssertionError();
        }
    }

    DiskLruCache(FileSystem fileSystem, File file, int i, int i2, long j, Executor executor) {
        this.fileSystem = fileSystem;
        this.directory = file;
        this.appVersion = i;
        this.journalFile = new File(file, JOURNAL_FILE);
        this.journalFileTmp = new File(file, JOURNAL_FILE_TEMP);
        this.journalFileBackup = new File(file, JOURNAL_FILE_BACKUP);
        this.valueCount = i2;
        this.maxSize = j;
        this.executor = executor;
    }

    public synchronized void initialize() {
        if (!this.initialized) {
            if (this.fileSystem.exists(this.journalFileBackup)) {
                if (this.fileSystem.exists(this.journalFile)) {
                    this.fileSystem.delete(this.journalFileBackup);
                } else {
                    this.fileSystem.rename(this.journalFileBackup, this.journalFile);
                }
            }
            if (this.fileSystem.exists(this.journalFile)) {
                try {
                    readJournal();
                    processJournal();
                    this.initialized = true;
                    return;
                } catch (IOException e) {
                    Platform platform = Platform.get();
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("DiskLruCache ");
                    stringBuilder.append(this.directory);
                    stringBuilder.append(" is corrupt: ");
                    stringBuilder.append(e.getMessage());
                    stringBuilder.append(", removing");
                    platform.log(5, stringBuilder.toString(), e);
                    delete();
                } finally {
                    this.closed = false;
                }
            }
            rebuildJournal();
            this.initialized = true;
        }
    }

    public static DiskLruCache create(FileSystem fileSystem, File file, int i, int i2, long j) {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        } else if (i2 > 0) {
            return new DiskLruCache(fileSystem, file, i, i2, j, new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), Util.threadFactory("OkHttp DiskLruCache", true)));
        } else {
            throw new IllegalArgumentException("valueCount <= 0");
        }
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:23:0x007a=Splitter:B:23:0x007a, B:16:0x005d=Splitter:B:16:0x005d} */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x005d */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:16|17|(1:19)(1:20)|21|22) */
    /* JADX WARNING: Missing block: B:17:?, code skipped:
            r9.redundantOpCount = r0 - r9.lruEntries.size();
     */
    /* JADX WARNING: Missing block: B:18:0x006a, code skipped:
            if (r1.exhausted() == false) goto L_0x006c;
     */
    /* JADX WARNING: Missing block: B:19:0x006c, code skipped:
            rebuildJournal();
     */
    /* JADX WARNING: Missing block: B:20:0x0070, code skipped:
            r9.journalWriter = newJournalWriter();
     */
    /* JADX WARNING: Missing block: B:21:0x0076, code skipped:
            okhttp3.internal.Util.closeQuietly(r1);
     */
    /* JADX WARNING: Missing block: B:22:0x0079, code skipped:
            return;
     */
    private void readJournal() {
        /*
        r9 = this;
        r0 = ", ";
        r1 = r9.fileSystem;
        r2 = r9.journalFile;
        r1 = r1.source(r2);
        r1 = okio.Okio.buffer(r1);
        r2 = r1.readUtf8LineStrict();	 Catch:{ all -> 0x00a9 }
        r3 = r1.readUtf8LineStrict();	 Catch:{ all -> 0x00a9 }
        r4 = r1.readUtf8LineStrict();	 Catch:{ all -> 0x00a9 }
        r5 = r1.readUtf8LineStrict();	 Catch:{ all -> 0x00a9 }
        r6 = r1.readUtf8LineStrict();	 Catch:{ all -> 0x00a9 }
        r7 = "libcore.io.DiskLruCache";
        r7 = r7.equals(r2);	 Catch:{ all -> 0x00a9 }
        if (r7 == 0) goto L_0x007a;
    L_0x002a:
        r7 = "1";
        r7 = r7.equals(r3);	 Catch:{ all -> 0x00a9 }
        if (r7 == 0) goto L_0x007a;
    L_0x0032:
        r7 = r9.appVersion;	 Catch:{ all -> 0x00a9 }
        r7 = java.lang.Integer.toString(r7);	 Catch:{ all -> 0x00a9 }
        r4 = r7.equals(r4);	 Catch:{ all -> 0x00a9 }
        if (r4 == 0) goto L_0x007a;
    L_0x003e:
        r4 = r9.valueCount;	 Catch:{ all -> 0x00a9 }
        r4 = java.lang.Integer.toString(r4);	 Catch:{ all -> 0x00a9 }
        r4 = r4.equals(r5);	 Catch:{ all -> 0x00a9 }
        if (r4 == 0) goto L_0x007a;
    L_0x004a:
        r4 = "";
        r4 = r4.equals(r6);	 Catch:{ all -> 0x00a9 }
        if (r4 == 0) goto L_0x007a;
    L_0x0052:
        r0 = 0;
    L_0x0053:
        r2 = r1.readUtf8LineStrict();	 Catch:{ EOFException -> 0x005d }
        r9.readJournalLine(r2);	 Catch:{ EOFException -> 0x005d }
        r0 = r0 + 1;
        goto L_0x0053;
    L_0x005d:
        r2 = r9.lruEntries;	 Catch:{ all -> 0x00a9 }
        r2 = r2.size();	 Catch:{ all -> 0x00a9 }
        r0 = r0 - r2;
        r9.redundantOpCount = r0;	 Catch:{ all -> 0x00a9 }
        r0 = r1.exhausted();	 Catch:{ all -> 0x00a9 }
        if (r0 != 0) goto L_0x0070;
    L_0x006c:
        r9.rebuildJournal();	 Catch:{ all -> 0x00a9 }
        goto L_0x0076;
    L_0x0070:
        r0 = r9.newJournalWriter();	 Catch:{ all -> 0x00a9 }
        r9.journalWriter = r0;	 Catch:{ all -> 0x00a9 }
    L_0x0076:
        okhttp3.internal.Util.closeQuietly(r1);
        return;
    L_0x007a:
        r4 = new java.io.IOException;	 Catch:{ all -> 0x00a9 }
        r7 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00a9 }
        r7.<init>();	 Catch:{ all -> 0x00a9 }
        r8 = "unexpected journal header: [";
        r7.append(r8);	 Catch:{ all -> 0x00a9 }
        r7.append(r2);	 Catch:{ all -> 0x00a9 }
        r7.append(r0);	 Catch:{ all -> 0x00a9 }
        r7.append(r3);	 Catch:{ all -> 0x00a9 }
        r7.append(r0);	 Catch:{ all -> 0x00a9 }
        r7.append(r5);	 Catch:{ all -> 0x00a9 }
        r7.append(r0);	 Catch:{ all -> 0x00a9 }
        r7.append(r6);	 Catch:{ all -> 0x00a9 }
        r0 = "]";
        r7.append(r0);	 Catch:{ all -> 0x00a9 }
        r0 = r7.toString();	 Catch:{ all -> 0x00a9 }
        r4.<init>(r0);	 Catch:{ all -> 0x00a9 }
        throw r4;	 Catch:{ all -> 0x00a9 }
    L_0x00a9:
        r0 = move-exception;
        okhttp3.internal.Util.closeQuietly(r1);
        goto L_0x00af;
    L_0x00ae:
        throw r0;
    L_0x00af:
        goto L_0x00ae;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.DiskLruCache.readJournal():void");
    }

    private BufferedSink newJournalWriter() {
        return Okio.buffer(new FaultHidingSink(this.fileSystem.appendingSink(this.journalFile)) {
            static final /* synthetic */ boolean $assertionsDisabled = false;

            static {
                Class cls = DiskLruCache.class;
            }

            /* Access modifiers changed, original: protected */
            public void onException(IOException iOException) {
                DiskLruCache.this.hasJournalErrors = true;
            }
        });
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
                if (indexOf == 6 && str.startsWith(REMOVE)) {
                    this.lruEntries.remove(substring);
                    return;
                }
            }
            substring = str.substring(i, indexOf2);
            Entry entry = (Entry) this.lruEntries.get(substring);
            if (entry == null) {
                entry = new Entry(substring);
                this.lruEntries.put(substring, entry);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith(CLEAN)) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                entry.readable = true;
                entry.currentEditor = null;
                entry.setLengths(split);
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith(DIRTY)) {
                entry.currentEditor = new Editor(entry);
            } else if (!(indexOf2 == -1 && indexOf == 4 && str.startsWith(READ))) {
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
        this.fileSystem.delete(this.journalFileTmp);
        Iterator it = this.lruEntries.values().iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            int i = 0;
            if (entry.currentEditor == null) {
                while (i < this.valueCount) {
                    this.size += entry.lengths[i];
                    i++;
                }
            } else {
                entry.currentEditor = null;
                while (i < this.valueCount) {
                    this.fileSystem.delete(entry.cleanFiles[i]);
                    this.fileSystem.delete(entry.dirtyFiles[i]);
                    i++;
                }
                it.remove();
            }
        }
    }

    /* Access modifiers changed, original: declared_synchronized */
    public synchronized void rebuildJournal() {
        if (this.journalWriter != null) {
            this.journalWriter.close();
        }
        BufferedSink buffer = Okio.buffer(this.fileSystem.sink(this.journalFileTmp));
        try {
            buffer.writeUtf8(MAGIC).writeByte(10);
            buffer.writeUtf8(VERSION_1).writeByte(10);
            buffer.writeDecimalLong((long) this.appVersion).writeByte(10);
            buffer.writeDecimalLong((long) this.valueCount).writeByte(10);
            buffer.writeByte(10);
            for (Entry entry : this.lruEntries.values()) {
                if (entry.currentEditor != null) {
                    buffer.writeUtf8(DIRTY).writeByte(32);
                    buffer.writeUtf8(entry.key);
                    buffer.writeByte(10);
                } else {
                    buffer.writeUtf8(CLEAN).writeByte(32);
                    buffer.writeUtf8(entry.key);
                    entry.writeLengths(buffer);
                    buffer.writeByte(10);
                }
            }
            if (this.fileSystem.exists(this.journalFile)) {
                this.fileSystem.rename(this.journalFile, this.journalFileBackup);
            }
            this.fileSystem.rename(this.journalFileTmp, this.journalFile);
            this.fileSystem.delete(this.journalFileBackup);
            this.journalWriter = newJournalWriter();
            this.hasJournalErrors = false;
            this.mostRecentRebuildFailed = false;
        } finally {
            buffer.close();
        }
    }

    /* JADX WARNING: Missing block: B:16:0x004d, code skipped:
            return r0;
     */
    /* JADX WARNING: Missing block: B:18:0x004f, code skipped:
            return null;
     */
    public synchronized okhttp3.internal.cache.DiskLruCache.Snapshot get(java.lang.String r4) {
        /*
        r3 = this;
        monitor-enter(r3);
        r3.initialize();	 Catch:{ all -> 0x0050 }
        r3.checkNotClosed();	 Catch:{ all -> 0x0050 }
        r3.validateKey(r4);	 Catch:{ all -> 0x0050 }
        r0 = r3.lruEntries;	 Catch:{ all -> 0x0050 }
        r0 = r0.get(r4);	 Catch:{ all -> 0x0050 }
        r0 = (okhttp3.internal.cache.DiskLruCache.Entry) r0;	 Catch:{ all -> 0x0050 }
        r1 = 0;
        if (r0 == 0) goto L_0x004e;
    L_0x0015:
        r2 = r0.readable;	 Catch:{ all -> 0x0050 }
        if (r2 != 0) goto L_0x001a;
    L_0x0019:
        goto L_0x004e;
    L_0x001a:
        r0 = r0.snapshot();	 Catch:{ all -> 0x0050 }
        if (r0 != 0) goto L_0x0022;
    L_0x0020:
        monitor-exit(r3);
        return r1;
    L_0x0022:
        r1 = r3.redundantOpCount;	 Catch:{ all -> 0x0050 }
        r1 = r1 + 1;
        r3.redundantOpCount = r1;	 Catch:{ all -> 0x0050 }
        r1 = r3.journalWriter;	 Catch:{ all -> 0x0050 }
        r2 = "READ";
        r1 = r1.writeUtf8(r2);	 Catch:{ all -> 0x0050 }
        r2 = 32;
        r1 = r1.writeByte(r2);	 Catch:{ all -> 0x0050 }
        r4 = r1.writeUtf8(r4);	 Catch:{ all -> 0x0050 }
        r1 = 10;
        r4.writeByte(r1);	 Catch:{ all -> 0x0050 }
        r4 = r3.journalRebuildRequired();	 Catch:{ all -> 0x0050 }
        if (r4 == 0) goto L_0x004c;
    L_0x0045:
        r4 = r3.executor;	 Catch:{ all -> 0x0050 }
        r1 = r3.cleanupRunnable;	 Catch:{ all -> 0x0050 }
        r4.execute(r1);	 Catch:{ all -> 0x0050 }
    L_0x004c:
        monitor-exit(r3);
        return r0;
    L_0x004e:
        monitor-exit(r3);
        return r1;
    L_0x0050:
        r4 = move-exception;
        monitor-exit(r3);
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.DiskLruCache.get(java.lang.String):okhttp3.internal.cache.DiskLruCache$Snapshot");
    }

    public Editor edit(String str) {
        return edit(str, -1);
    }

    /* Access modifiers changed, original: declared_synchronized */
    /* JADX WARNING: Missing block: B:9:0x0022, code skipped:
            return null;
     */
    public synchronized okhttp3.internal.cache.DiskLruCache.Editor edit(java.lang.String r6, long r7) {
        /*
        r5 = this;
        monitor-enter(r5);
        r5.initialize();	 Catch:{ all -> 0x0074 }
        r5.checkNotClosed();	 Catch:{ all -> 0x0074 }
        r5.validateKey(r6);	 Catch:{ all -> 0x0074 }
        r0 = r5.lruEntries;	 Catch:{ all -> 0x0074 }
        r0 = r0.get(r6);	 Catch:{ all -> 0x0074 }
        r0 = (okhttp3.internal.cache.DiskLruCache.Entry) r0;	 Catch:{ all -> 0x0074 }
        r1 = -1;
        r3 = 0;
        r4 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1));
        if (r4 == 0) goto L_0x0023;
    L_0x0019:
        if (r0 == 0) goto L_0x0021;
    L_0x001b:
        r1 = r0.sequenceNumber;	 Catch:{ all -> 0x0074 }
        r4 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1));
        if (r4 == 0) goto L_0x0023;
    L_0x0021:
        monitor-exit(r5);
        return r3;
    L_0x0023:
        if (r0 == 0) goto L_0x002b;
    L_0x0025:
        r7 = r0.currentEditor;	 Catch:{ all -> 0x0074 }
        if (r7 == 0) goto L_0x002b;
    L_0x0029:
        monitor-exit(r5);
        return r3;
    L_0x002b:
        r7 = r5.mostRecentTrimFailed;	 Catch:{ all -> 0x0074 }
        if (r7 != 0) goto L_0x006b;
    L_0x002f:
        r7 = r5.mostRecentRebuildFailed;	 Catch:{ all -> 0x0074 }
        if (r7 == 0) goto L_0x0034;
    L_0x0033:
        goto L_0x006b;
    L_0x0034:
        r7 = r5.journalWriter;	 Catch:{ all -> 0x0074 }
        r8 = "DIRTY";
        r7 = r7.writeUtf8(r8);	 Catch:{ all -> 0x0074 }
        r8 = 32;
        r7 = r7.writeByte(r8);	 Catch:{ all -> 0x0074 }
        r7 = r7.writeUtf8(r6);	 Catch:{ all -> 0x0074 }
        r8 = 10;
        r7.writeByte(r8);	 Catch:{ all -> 0x0074 }
        r7 = r5.journalWriter;	 Catch:{ all -> 0x0074 }
        r7.flush();	 Catch:{ all -> 0x0074 }
        r7 = r5.hasJournalErrors;	 Catch:{ all -> 0x0074 }
        if (r7 == 0) goto L_0x0056;
    L_0x0054:
        monitor-exit(r5);
        return r3;
    L_0x0056:
        if (r0 != 0) goto L_0x0062;
    L_0x0058:
        r0 = new okhttp3.internal.cache.DiskLruCache$Entry;	 Catch:{ all -> 0x0074 }
        r0.<init>(r6);	 Catch:{ all -> 0x0074 }
        r7 = r5.lruEntries;	 Catch:{ all -> 0x0074 }
        r7.put(r6, r0);	 Catch:{ all -> 0x0074 }
    L_0x0062:
        r6 = new okhttp3.internal.cache.DiskLruCache$Editor;	 Catch:{ all -> 0x0074 }
        r6.<init>(r0);	 Catch:{ all -> 0x0074 }
        r0.currentEditor = r6;	 Catch:{ all -> 0x0074 }
        monitor-exit(r5);
        return r6;
    L_0x006b:
        r6 = r5.executor;	 Catch:{ all -> 0x0074 }
        r7 = r5.cleanupRunnable;	 Catch:{ all -> 0x0074 }
        r6.execute(r7);	 Catch:{ all -> 0x0074 }
        monitor-exit(r5);
        return r3;
    L_0x0074:
        r6 = move-exception;
        monitor-exit(r5);
        throw r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.DiskLruCache.edit(java.lang.String, long):okhttp3.internal.cache.DiskLruCache$Editor");
    }

    public File getDirectory() {
        return this.directory;
    }

    public synchronized long getMaxSize() {
        return this.maxSize;
    }

    public synchronized void setMaxSize(long j) {
        this.maxSize = j;
        if (this.initialized) {
            this.executor.execute(this.cleanupRunnable);
        }
    }

    public synchronized long size() {
        initialize();
        return this.size;
    }

    /* Access modifiers changed, original: declared_synchronized */
    /* JADX WARNING: Missing block: B:43:0x00f4, code skipped:
            return;
     */
    public synchronized void completeEdit(okhttp3.internal.cache.DiskLruCache.Editor r10, boolean r11) {
        /*
        r9 = this;
        monitor-enter(r9);
        r0 = r10.entry;	 Catch:{ all -> 0x00fb }
        r1 = r0.currentEditor;	 Catch:{ all -> 0x00fb }
        if (r1 != r10) goto L_0x00f5;
    L_0x0007:
        r1 = 0;
        if (r11 == 0) goto L_0x0047;
    L_0x000a:
        r2 = r0.readable;	 Catch:{ all -> 0x00fb }
        if (r2 != 0) goto L_0x0047;
    L_0x000e:
        r2 = 0;
    L_0x000f:
        r3 = r9.valueCount;	 Catch:{ all -> 0x00fb }
        if (r2 >= r3) goto L_0x0047;
    L_0x0013:
        r3 = r10.written;	 Catch:{ all -> 0x00fb }
        r3 = r3[r2];	 Catch:{ all -> 0x00fb }
        if (r3 == 0) goto L_0x002d;
    L_0x0019:
        r3 = r9.fileSystem;	 Catch:{ all -> 0x00fb }
        r4 = r0.dirtyFiles;	 Catch:{ all -> 0x00fb }
        r4 = r4[r2];	 Catch:{ all -> 0x00fb }
        r3 = r3.exists(r4);	 Catch:{ all -> 0x00fb }
        if (r3 != 0) goto L_0x002a;
    L_0x0025:
        r10.abort();	 Catch:{ all -> 0x00fb }
        monitor-exit(r9);
        return;
    L_0x002a:
        r2 = r2 + 1;
        goto L_0x000f;
    L_0x002d:
        r10.abort();	 Catch:{ all -> 0x00fb }
        r10 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x00fb }
        r11 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00fb }
        r11.<init>();	 Catch:{ all -> 0x00fb }
        r0 = "Newly created entry didn't create value for index ";
        r11.append(r0);	 Catch:{ all -> 0x00fb }
        r11.append(r2);	 Catch:{ all -> 0x00fb }
        r11 = r11.toString();	 Catch:{ all -> 0x00fb }
        r10.<init>(r11);	 Catch:{ all -> 0x00fb }
        throw r10;	 Catch:{ all -> 0x00fb }
    L_0x0047:
        r10 = r9.valueCount;	 Catch:{ all -> 0x00fb }
        if (r1 >= r10) goto L_0x007f;
    L_0x004b:
        r10 = r0.dirtyFiles;	 Catch:{ all -> 0x00fb }
        r10 = r10[r1];	 Catch:{ all -> 0x00fb }
        if (r11 == 0) goto L_0x0077;
    L_0x0051:
        r2 = r9.fileSystem;	 Catch:{ all -> 0x00fb }
        r2 = r2.exists(r10);	 Catch:{ all -> 0x00fb }
        if (r2 == 0) goto L_0x007c;
    L_0x0059:
        r2 = r0.cleanFiles;	 Catch:{ all -> 0x00fb }
        r2 = r2[r1];	 Catch:{ all -> 0x00fb }
        r3 = r9.fileSystem;	 Catch:{ all -> 0x00fb }
        r3.rename(r10, r2);	 Catch:{ all -> 0x00fb }
        r10 = r0.lengths;	 Catch:{ all -> 0x00fb }
        r3 = r10[r1];	 Catch:{ all -> 0x00fb }
        r10 = r9.fileSystem;	 Catch:{ all -> 0x00fb }
        r5 = r10.size(r2);	 Catch:{ all -> 0x00fb }
        r10 = r0.lengths;	 Catch:{ all -> 0x00fb }
        r10[r1] = r5;	 Catch:{ all -> 0x00fb }
        r7 = r9.size;	 Catch:{ all -> 0x00fb }
        r7 = r7 - r3;
        r7 = r7 + r5;
        r9.size = r7;	 Catch:{ all -> 0x00fb }
        goto L_0x007c;
    L_0x0077:
        r2 = r9.fileSystem;	 Catch:{ all -> 0x00fb }
        r2.delete(r10);	 Catch:{ all -> 0x00fb }
    L_0x007c:
        r1 = r1 + 1;
        goto L_0x0047;
    L_0x007f:
        r10 = r9.redundantOpCount;	 Catch:{ all -> 0x00fb }
        r1 = 1;
        r10 = r10 + r1;
        r9.redundantOpCount = r10;	 Catch:{ all -> 0x00fb }
        r10 = 0;
        r0.currentEditor = r10;	 Catch:{ all -> 0x00fb }
        r10 = r0.readable;	 Catch:{ all -> 0x00fb }
        r10 = r10 | r11;
        r2 = 10;
        r3 = 32;
        if (r10 == 0) goto L_0x00bb;
    L_0x0091:
        r0.readable = r1;	 Catch:{ all -> 0x00fb }
        r10 = r9.journalWriter;	 Catch:{ all -> 0x00fb }
        r1 = "CLEAN";
        r10 = r10.writeUtf8(r1);	 Catch:{ all -> 0x00fb }
        r10.writeByte(r3);	 Catch:{ all -> 0x00fb }
        r10 = r9.journalWriter;	 Catch:{ all -> 0x00fb }
        r1 = r0.key;	 Catch:{ all -> 0x00fb }
        r10.writeUtf8(r1);	 Catch:{ all -> 0x00fb }
        r10 = r9.journalWriter;	 Catch:{ all -> 0x00fb }
        r0.writeLengths(r10);	 Catch:{ all -> 0x00fb }
        r10 = r9.journalWriter;	 Catch:{ all -> 0x00fb }
        r10.writeByte(r2);	 Catch:{ all -> 0x00fb }
        if (r11 == 0) goto L_0x00d9;
    L_0x00b1:
        r10 = r9.nextSequenceNumber;	 Catch:{ all -> 0x00fb }
        r1 = 1;
        r1 = r1 + r10;
        r9.nextSequenceNumber = r1;	 Catch:{ all -> 0x00fb }
        r0.sequenceNumber = r10;	 Catch:{ all -> 0x00fb }
        goto L_0x00d9;
    L_0x00bb:
        r10 = r9.lruEntries;	 Catch:{ all -> 0x00fb }
        r11 = r0.key;	 Catch:{ all -> 0x00fb }
        r10.remove(r11);	 Catch:{ all -> 0x00fb }
        r10 = r9.journalWriter;	 Catch:{ all -> 0x00fb }
        r11 = "REMOVE";
        r10 = r10.writeUtf8(r11);	 Catch:{ all -> 0x00fb }
        r10.writeByte(r3);	 Catch:{ all -> 0x00fb }
        r10 = r9.journalWriter;	 Catch:{ all -> 0x00fb }
        r11 = r0.key;	 Catch:{ all -> 0x00fb }
        r10.writeUtf8(r11);	 Catch:{ all -> 0x00fb }
        r10 = r9.journalWriter;	 Catch:{ all -> 0x00fb }
        r10.writeByte(r2);	 Catch:{ all -> 0x00fb }
    L_0x00d9:
        r10 = r9.journalWriter;	 Catch:{ all -> 0x00fb }
        r10.flush();	 Catch:{ all -> 0x00fb }
        r10 = r9.size;	 Catch:{ all -> 0x00fb }
        r0 = r9.maxSize;	 Catch:{ all -> 0x00fb }
        r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1));
        if (r2 > 0) goto L_0x00ec;
    L_0x00e6:
        r10 = r9.journalRebuildRequired();	 Catch:{ all -> 0x00fb }
        if (r10 == 0) goto L_0x00f3;
    L_0x00ec:
        r10 = r9.executor;	 Catch:{ all -> 0x00fb }
        r11 = r9.cleanupRunnable;	 Catch:{ all -> 0x00fb }
        r10.execute(r11);	 Catch:{ all -> 0x00fb }
    L_0x00f3:
        monitor-exit(r9);
        return;
    L_0x00f5:
        r10 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x00fb }
        r10.<init>();	 Catch:{ all -> 0x00fb }
        throw r10;	 Catch:{ all -> 0x00fb }
    L_0x00fb:
        r10 = move-exception;
        monitor-exit(r9);
        goto L_0x00ff;
    L_0x00fe:
        throw r10;
    L_0x00ff:
        goto L_0x00fe;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.DiskLruCache.completeEdit(okhttp3.internal.cache.DiskLruCache$Editor, boolean):void");
    }

    /* Access modifiers changed, original: 0000 */
    public boolean journalRebuildRequired() {
        int i = this.redundantOpCount;
        return i >= CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE && i >= this.lruEntries.size();
    }

    /* JADX WARNING: Missing block: B:14:0x0028, code skipped:
            return r7;
     */
    public synchronized boolean remove(java.lang.String r7) {
        /*
        r6 = this;
        monitor-enter(r6);
        r6.initialize();	 Catch:{ all -> 0x0029 }
        r6.checkNotClosed();	 Catch:{ all -> 0x0029 }
        r6.validateKey(r7);	 Catch:{ all -> 0x0029 }
        r0 = r6.lruEntries;	 Catch:{ all -> 0x0029 }
        r7 = r0.get(r7);	 Catch:{ all -> 0x0029 }
        r7 = (okhttp3.internal.cache.DiskLruCache.Entry) r7;	 Catch:{ all -> 0x0029 }
        r0 = 0;
        if (r7 != 0) goto L_0x0017;
    L_0x0015:
        monitor-exit(r6);
        return r0;
    L_0x0017:
        r7 = r6.removeEntry(r7);	 Catch:{ all -> 0x0029 }
        if (r7 == 0) goto L_0x0027;
    L_0x001d:
        r1 = r6.size;	 Catch:{ all -> 0x0029 }
        r3 = r6.maxSize;	 Catch:{ all -> 0x0029 }
        r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1));
        if (r5 > 0) goto L_0x0027;
    L_0x0025:
        r6.mostRecentTrimFailed = r0;	 Catch:{ all -> 0x0029 }
    L_0x0027:
        monitor-exit(r6);
        return r7;
    L_0x0029:
        r7 = move-exception;
        monitor-exit(r6);
        throw r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.DiskLruCache.remove(java.lang.String):boolean");
    }

    /* Access modifiers changed, original: 0000 */
    public boolean removeEntry(Entry entry) {
        if (entry.currentEditor != null) {
            entry.currentEditor.detach();
        }
        for (int i = 0; i < this.valueCount; i++) {
            this.fileSystem.delete(entry.cleanFiles[i]);
            this.size -= entry.lengths[i];
            entry.lengths[i] = 0;
        }
        this.redundantOpCount++;
        this.journalWriter.writeUtf8(REMOVE).writeByte(32).writeUtf8(entry.key).writeByte(10);
        this.lruEntries.remove(entry.key);
        if (journalRebuildRequired()) {
            this.executor.execute(this.cleanupRunnable);
        }
        return true;
    }

    public synchronized boolean isClosed() {
        return this.closed;
    }

    private synchronized void checkNotClosed() {
        if (isClosed()) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public synchronized void flush() {
        if (this.initialized) {
            checkNotClosed();
            trimToSize();
            this.journalWriter.flush();
        }
    }

    public synchronized void close() {
        if (this.initialized) {
            if (!this.closed) {
                for (Entry entry : (Entry[]) this.lruEntries.values().toArray(new Entry[this.lruEntries.size()])) {
                    if (entry.currentEditor != null) {
                        entry.currentEditor.abort();
                    }
                }
                trimToSize();
                this.journalWriter.close();
                this.journalWriter = null;
                this.closed = true;
                return;
            }
        }
        this.closed = true;
    }

    /* Access modifiers changed, original: 0000 */
    public void trimToSize() {
        while (this.size > this.maxSize) {
            removeEntry((Entry) this.lruEntries.values().iterator().next());
        }
        this.mostRecentTrimFailed = false;
    }

    public void delete() {
        close();
        this.fileSystem.deleteContents(this.directory);
    }

    public synchronized void evictAll() {
        initialize();
        for (Entry removeEntry : (Entry[]) this.lruEntries.values().toArray(new Entry[this.lruEntries.size()])) {
            removeEntry(removeEntry);
        }
        this.mostRecentTrimFailed = false;
    }

    private void validateKey(String str) {
        if (!LEGAL_KEY_PATTERN.matcher(str).matches()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("keys must match regex [a-z0-9_-]{1,120}: \"");
            stringBuilder.append(str);
            stringBuilder.append("\"");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    public synchronized Iterator<Snapshot> snapshots() {
        initialize();
        return new Iterator<Snapshot>() {
            final Iterator<Entry> delegate = new ArrayList(DiskLruCache.this.lruEntries.values()).iterator();
            Snapshot nextSnapshot;
            Snapshot removeSnapshot;

            public boolean hasNext() {
                if (this.nextSnapshot != null) {
                    return true;
                }
                synchronized (DiskLruCache.this) {
                    if (DiskLruCache.this.closed) {
                        return false;
                    }
                    while (this.delegate.hasNext()) {
                        Snapshot snapshot = ((Entry) this.delegate.next()).snapshot();
                        if (snapshot != null) {
                            this.nextSnapshot = snapshot;
                            return true;
                        }
                    }
                    return false;
                }
            }

            public Snapshot next() {
                if (hasNext()) {
                    this.removeSnapshot = this.nextSnapshot;
                    this.nextSnapshot = null;
                    return this.removeSnapshot;
                }
                throw new NoSuchElementException();
            }

            public void remove() {
                Snapshot snapshot = this.removeSnapshot;
                if (snapshot != null) {
                    try {
                        DiskLruCache.this.remove(snapshot.key);
                    } catch (IOException unused) {
                    } catch (Throwable th) {
                        this.removeSnapshot = null;
                    }
                    this.removeSnapshot = null;
                    return;
                }
                throw new IllegalStateException("remove() before next()");
            }
        };
    }
}
