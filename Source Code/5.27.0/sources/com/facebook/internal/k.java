package com.facebook.internal;

import com.facebook.LoggingBehavior;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* compiled from: FileLruCache */
public final class k {
    static final String TAG = "k";
    private static final AtomicLong yB = new AtomicLong();
    private final File directory;
    private final Object lock;
    private final String tag;
    private final d yC;
    private boolean yD;
    private boolean yE;
    private AtomicLong yF = new AtomicLong(0);

    /* compiled from: FileLruCache */
    private static class a {
        private static final FilenameFilter yK = new FilenameFilter() {
            public boolean accept(File file, String str) {
                return str.startsWith("buffer") ^ 1;
            }
        };
        private static final FilenameFilter yL = new FilenameFilter() {
            public boolean accept(File file, String str) {
                return str.startsWith("buffer");
            }
        };

        static void n(File file) {
            File[] listFiles = file.listFiles(kg());
            if (listFiles != null) {
                for (File delete : listFiles) {
                    delete.delete();
                }
            }
        }

        static FilenameFilter kf() {
            return yK;
        }

        static FilenameFilter kg() {
            return yL;
        }

        static File o(File file) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("buffer");
            stringBuilder.append(Long.valueOf(k.yB.incrementAndGet()).toString());
            return new File(file, stringBuilder.toString());
        }
    }

    /* compiled from: FileLruCache */
    private static class b extends OutputStream {
        final OutputStream yM;
        final f yN;

        b(OutputStream outputStream, f fVar) {
            this.yM = outputStream;
            this.yN = fVar;
        }

        public void close() {
            try {
                this.yM.close();
            } finally {
                this.yN.onClose();
            }
        }

        public void flush() {
            this.yM.flush();
        }

        public void write(byte[] bArr, int i, int i2) {
            this.yM.write(bArr, i, i2);
        }

        public void write(byte[] bArr) {
            this.yM.write(bArr);
        }

        public void write(int i) {
            this.yM.write(i);
        }
    }

    /* compiled from: FileLruCache */
    private static final class c extends InputStream {
        final InputStream input;
        final OutputStream pt;

        public boolean markSupported() {
            return false;
        }

        c(InputStream inputStream, OutputStream outputStream) {
            this.input = inputStream;
            this.pt = outputStream;
        }

        public int available() {
            return this.input.available();
        }

        public void close() {
            try {
                this.input.close();
            } finally {
                this.pt.close();
            }
        }

        public void mark(int i) {
            throw new UnsupportedOperationException();
        }

        public int read(byte[] bArr) {
            int read = this.input.read(bArr);
            if (read > 0) {
                this.pt.write(bArr, 0, read);
            }
            return read;
        }

        public int read() {
            int read = this.input.read();
            if (read >= 0) {
                this.pt.write(read);
            }
            return read;
        }

        public int read(byte[] bArr, int i, int i2) {
            i2 = this.input.read(bArr, i, i2);
            if (i2 > 0) {
                this.pt.write(bArr, i, i2);
            }
            return i2;
        }

        public synchronized void reset() {
            throw new UnsupportedOperationException();
        }

        public long skip(long j) {
            byte[] bArr = new byte[1024];
            long j2 = 0;
            while (j2 < j) {
                int read = read(bArr, 0, (int) Math.min(j - j2, (long) bArr.length));
                if (read < 0) {
                    return j2;
                }
                j2 += (long) read;
            }
            return j2;
        }
    }

    /* compiled from: FileLruCache */
    public static final class d {
        private int yO = 1048576;
        private int yP = 1024;

        /* Access modifiers changed, original: 0000 */
        public int getByteCount() {
            return this.yO;
        }

        /* Access modifiers changed, original: 0000 */
        public int kh() {
            return this.yP;
        }
    }

    /* compiled from: FileLruCache */
    private static final class e implements Comparable<e> {
        private final File file;
        private final long yQ;

        e(File file) {
            this.file = file;
            this.yQ = file.lastModified();
        }

        /* Access modifiers changed, original: 0000 */
        public File fI() {
            return this.file;
        }

        /* Access modifiers changed, original: 0000 */
        public long ki() {
            return this.yQ;
        }

        /* renamed from: a */
        public int compareTo(e eVar) {
            if (ki() < eVar.ki()) {
                return -1;
            }
            if (ki() > eVar.ki()) {
                return 1;
            }
            return fI().compareTo(eVar.fI());
        }

        public boolean equals(Object obj) {
            return (obj instanceof e) && compareTo((e) obj) == 0;
        }

        public int hashCode() {
            return ((1073 + this.file.hashCode()) * 37) + ((int) (this.yQ % 2147483647L));
        }
    }

    /* compiled from: FileLruCache */
    private interface f {
        void onClose();
    }

    /* compiled from: FileLruCache */
    private static final class g {
        static void a(OutputStream outputStream, JSONObject jSONObject) {
            byte[] bytes = jSONObject.toString().getBytes();
            outputStream.write(0);
            outputStream.write((bytes.length >> 16) & 255);
            outputStream.write((bytes.length >> 8) & 255);
            outputStream.write((bytes.length >> 0) & 255);
            outputStream.write(bytes);
        }

        static JSONObject c(InputStream inputStream) {
            if (inputStream.read() != 0) {
                return null;
            }
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < 3; i3++) {
                int read = inputStream.read();
                if (read == -1) {
                    s.a(LoggingBehavior.CACHE, k.TAG, "readHeader: stream.read returned -1 while reading header size");
                    return null;
                }
                i2 = (i2 << 8) + (read & 255);
            }
            byte[] bArr = new byte[i2];
            while (i < bArr.length) {
                i2 = inputStream.read(bArr, i, bArr.length - i);
                if (i2 < 1) {
                    LoggingBehavior loggingBehavior = LoggingBehavior.CACHE;
                    String str = k.TAG;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("readHeader: stream.read stopped at ");
                    stringBuilder.append(Integer.valueOf(i));
                    stringBuilder.append(" when expected ");
                    stringBuilder.append(bArr.length);
                    s.a(loggingBehavior, str, stringBuilder.toString());
                    return null;
                }
                i += i2;
            }
            try {
                Object nextValue = new JSONTokener(new String(bArr)).nextValue();
                if (nextValue instanceof JSONObject) {
                    return (JSONObject) nextValue;
                }
                LoggingBehavior loggingBehavior2 = LoggingBehavior.CACHE;
                String str2 = k.TAG;
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("readHeader: expected JSONObject, got ");
                stringBuilder2.append(nextValue.getClass().getCanonicalName());
                s.a(loggingBehavior2, str2, stringBuilder2.toString());
                return null;
            } catch (JSONException e) {
                throw new IOException(e.getMessage());
            }
        }
    }

    public k(String str, d dVar) {
        this.tag = str;
        this.yC = dVar;
        this.directory = new File(com.facebook.f.getCacheDir(), str);
        this.lock = new Object();
        if (this.directory.mkdirs() || this.directory.isDirectory()) {
            a.n(this.directory);
        }
    }

    public InputStream bi(String str) {
        return B(str, null);
    }

    public InputStream B(String str, String str2) {
        File file = new File(this.directory, z.bo(str));
        InputStream inputStream = null;
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file), 8192);
            try {
                JSONObject c = g.c(bufferedInputStream);
                if (c == null) {
                    return inputStream;
                }
                String optString = c.optString("key");
                if (optString != null) {
                    if (optString.equals(str)) {
                        str = c.optString("tag", null);
                        if ((str2 != null || str == null) && (str2 == null || str2.equals(str))) {
                            long time = new Date().getTime();
                            inputStream = LoggingBehavior.CACHE;
                            String str3 = TAG;
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("Setting lastModified to ");
                            stringBuilder.append(Long.valueOf(time));
                            stringBuilder.append(" for ");
                            stringBuilder.append(file.getName());
                            s.a(inputStream, str3, stringBuilder.toString());
                            file.setLastModified(time);
                            return bufferedInputStream;
                        }
                        bufferedInputStream.close();
                        return null;
                    }
                }
                bufferedInputStream.close();
                return null;
            } finally {
                bufferedInputStream.close();
            }
        } catch (IOException unused) {
            return null;
        }
    }

    public OutputStream bj(String str) {
        return C(str, null);
    }

    public OutputStream C(String str, String str2) {
        LoggingBehavior loggingBehavior;
        String str3;
        final File o = a.o(this.directory);
        o.delete();
        if (o.createNewFile()) {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(o);
                final long currentTimeMillis = System.currentTimeMillis();
                final String str4 = str;
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new b(fileOutputStream, new f() {
                    public void onClose() {
                        if (currentTimeMillis < k.this.yF.get()) {
                            o.delete();
                        } else {
                            k.this.a(str4, o);
                        }
                    }
                }), 8192);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("key", str);
                    if (!z.aB(str2)) {
                        jSONObject.put("tag", str2);
                    }
                    g.a(bufferedOutputStream, jSONObject);
                    return bufferedOutputStream;
                } catch (JSONException e) {
                    loggingBehavior = LoggingBehavior.CACHE;
                    str3 = TAG;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Error creating JSON header for cache file: ");
                    stringBuilder.append(e);
                    s.a(loggingBehavior, 5, str3, stringBuilder.toString());
                    throw new IOException(e.getMessage());
                } catch (Throwable th) {
                    bufferedOutputStream.close();
                }
            } catch (FileNotFoundException e2) {
                loggingBehavior = LoggingBehavior.CACHE;
                str3 = TAG;
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("Error creating buffer output stream: ");
                stringBuilder2.append(e2);
                s.a(loggingBehavior, 5, str3, stringBuilder2.toString());
                throw new IOException(e2.getMessage());
            }
        }
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append("Could not create file at ");
        stringBuilder3.append(o.getAbsolutePath());
        throw new IOException(stringBuilder3.toString());
    }

    private void a(String str, File file) {
        if (!file.renameTo(new File(this.directory, z.bo(str)))) {
            file.delete();
        }
        kc();
    }

    public InputStream a(String str, InputStream inputStream) {
        return new c(inputStream, bj(str));
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{FileLruCache: tag:");
        stringBuilder.append(this.tag);
        stringBuilder.append(" file:");
        stringBuilder.append(this.directory.getName());
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    private void kc() {
        synchronized (this.lock) {
            if (!this.yD) {
                this.yD = true;
                com.facebook.f.getExecutor().execute(new Runnable() {
                    public void run() {
                        k.this.kd();
                    }
                });
            }
        }
    }

    private void kd() {
        synchronized (this.lock) {
            this.yD = false;
            this.yE = true;
        }
        try {
            long j;
            s.a(LoggingBehavior.CACHE, TAG, "trim started");
            PriorityQueue priorityQueue = new PriorityQueue();
            File[] listFiles = this.directory.listFiles(a.kf());
            long j2 = 0;
            if (listFiles != null) {
                long j3 = 0;
                j = j3;
                for (File file : listFiles) {
                    e eVar = new e(file);
                    priorityQueue.add(eVar);
                    LoggingBehavior loggingBehavior = LoggingBehavior.CACHE;
                    String str = TAG;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("  trim considering time=");
                    stringBuilder.append(Long.valueOf(eVar.ki()));
                    stringBuilder.append(" name=");
                    stringBuilder.append(eVar.fI().getName());
                    s.a(loggingBehavior, str, stringBuilder.toString());
                    j3 += file.length();
                    j++;
                }
                j2 = j3;
            } else {
                j = 0;
            }
            while (true) {
                if (j2 > ((long) this.yC.getByteCount()) || j > ((long) this.yC.kh())) {
                    File fI = ((e) priorityQueue.remove()).fI();
                    LoggingBehavior loggingBehavior2 = LoggingBehavior.CACHE;
                    String str2 = TAG;
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("  trim removing ");
                    stringBuilder2.append(fI.getName());
                    s.a(loggingBehavior2, str2, stringBuilder2.toString());
                    j2 -= fI.length();
                    j--;
                    fI.delete();
                } else {
                    synchronized (this.lock) {
                        this.yE = false;
                        this.lock.notifyAll();
                    }
                    return;
                }
            }
        } catch (Throwable th) {
            synchronized (this.lock) {
                this.yE = false;
                this.lock.notifyAll();
            }
        }
    }
}
