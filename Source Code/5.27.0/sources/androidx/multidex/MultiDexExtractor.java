package androidx.multidex;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;
import android.util.Log;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

final class MultiDexExtractor implements Closeable {
    private static final int BUFFER_SIZE = 16384;
    private static final String DEX_PREFIX = "classes";
    static final String DEX_SUFFIX = ".dex";
    private static final String EXTRACTED_NAME_EXT = ".classes";
    static final String EXTRACTED_SUFFIX = ".zip";
    private static final String KEY_CRC = "crc";
    private static final String KEY_DEX_CRC = "dex.crc.";
    private static final String KEY_DEX_NUMBER = "dex.number";
    private static final String KEY_DEX_TIME = "dex.time.";
    private static final String KEY_TIME_STAMP = "timestamp";
    private static final String LOCK_FILENAME = "MultiDex.lock";
    private static final int MAX_EXTRACT_ATTEMPTS = 3;
    private static final long NO_VALUE = -1;
    private static final String PREFS_FILE = "multidex.version";
    private static final String TAG = "MultiDex";
    private final FileLock cacheLock;
    private final File dexDir;
    private final FileChannel lockChannel;
    private final RandomAccessFile lockRaf;
    private final File sourceApk;
    private final long sourceCrc;

    private static class ExtractedDex extends File {
        public long crc = -1;

        public ExtractedDex(File file, String str) {
            super(file, str);
        }
    }

    MultiDexExtractor(File file, File file2) {
        Error e;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("MultiDexExtractor(");
        stringBuilder.append(file.getPath());
        stringBuilder.append(", ");
        stringBuilder.append(file2.getPath());
        stringBuilder.append(")");
        String stringBuilder2 = stringBuilder.toString();
        String str = TAG;
        Log.i(str, stringBuilder2);
        this.sourceApk = file;
        this.dexDir = file2;
        this.sourceCrc = getZipCrc(file);
        file = new File(file2, LOCK_FILENAME);
        this.lockRaf = new RandomAccessFile(file, "rw");
        try {
            this.lockChannel = this.lockRaf.getChannel();
            try {
                StringBuilder stringBuilder3 = new StringBuilder();
                stringBuilder3.append("Blocking on lock ");
                stringBuilder3.append(file.getPath());
                Log.i(str, stringBuilder3.toString());
                this.cacheLock = this.lockChannel.lock();
                stringBuilder3 = new StringBuilder();
                stringBuilder3.append(file.getPath());
                stringBuilder3.append(" locked");
                Log.i(str, stringBuilder3.toString());
            } catch (IOException e2) {
                e = e2;
                closeQuietly(this.lockChannel);
                throw e;
            } catch (RuntimeException e3) {
                e = e3;
                closeQuietly(this.lockChannel);
                throw e;
            } catch (Error e4) {
                e = e4;
                closeQuietly(this.lockChannel);
                throw e;
            }
        } catch (IOException | Error | RuntimeException e5) {
            closeQuietly(this.lockRaf);
            throw e5;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public List<? extends File> load(Context context, String str, boolean z) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("MultiDexExtractor.load(");
        stringBuilder.append(this.sourceApk.getPath());
        String str2 = ", ";
        stringBuilder.append(str2);
        stringBuilder.append(z);
        stringBuilder.append(str2);
        stringBuilder.append(str);
        stringBuilder.append(")");
        String stringBuilder2 = stringBuilder.toString();
        str2 = TAG;
        Log.i(str2, stringBuilder2);
        if (this.cacheLock.isValid()) {
            List performExtractions;
            if (z || isModified(context, this.sourceApk, this.sourceCrc, str)) {
                if (z) {
                    Log.i(str2, "Forced extraction must be performed.");
                } else {
                    Log.i(str2, "Detected that extraction must be performed.");
                }
                performExtractions = performExtractions();
                putStoredApkInfo(context, str, getTimeStamp(this.sourceApk), this.sourceCrc, performExtractions);
            } else {
                try {
                    context = loadExistingExtractions(context, str);
                    performExtractions = context;
                } catch (IOException e) {
                    Log.w(str2, "Failed to reload existing extracted secondary dex files, falling back to fresh extraction", e);
                    performExtractions = performExtractions();
                    putStoredApkInfo(context, str, getTimeStamp(this.sourceApk), this.sourceCrc, performExtractions);
                }
            }
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append("load found ");
            stringBuilder3.append(performExtractions.size());
            stringBuilder3.append(" secondary dex files");
            Log.i(str2, stringBuilder3.toString());
            return performExtractions;
        }
        throw new IllegalStateException("MultiDexExtractor was closed");
    }

    public void close() {
        this.cacheLock.release();
        this.lockChannel.close();
        this.lockRaf.close();
    }

    private List<ExtractedDex> loadExistingExtractions(Context context, String str) {
        String str2 = str;
        Log.i(TAG, "loading existing secondary dex files");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.sourceApk.getName());
        stringBuilder.append(EXTRACTED_NAME_EXT);
        String stringBuilder2 = stringBuilder.toString();
        SharedPreferences multiDexPreferences = getMultiDexPreferences(context);
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append(str2);
        stringBuilder3.append(KEY_DEX_NUMBER);
        int i = multiDexPreferences.getInt(stringBuilder3.toString(), 1);
        ArrayList arrayList = new ArrayList(i - 1);
        int i2 = 2;
        while (i2 <= i) {
            StringBuilder stringBuilder4 = new StringBuilder();
            stringBuilder4.append(stringBuilder2);
            stringBuilder4.append(i2);
            stringBuilder4.append(EXTRACTED_SUFFIX);
            ExtractedDex extractedDex = new ExtractedDex(this.dexDir, stringBuilder4.toString());
            if (extractedDex.isFile()) {
                extractedDex.crc = getZipCrc(extractedDex);
                stringBuilder4 = new StringBuilder();
                stringBuilder4.append(str2);
                stringBuilder4.append(KEY_DEX_CRC);
                stringBuilder4.append(i2);
                long j = multiDexPreferences.getLong(stringBuilder4.toString(), -1);
                stringBuilder4 = new StringBuilder();
                stringBuilder4.append(str2);
                stringBuilder4.append(KEY_DEX_TIME);
                stringBuilder4.append(i2);
                long j2 = multiDexPreferences.getLong(stringBuilder4.toString(), -1);
                long lastModified = extractedDex.lastModified();
                if (j2 == lastModified) {
                    String str3 = stringBuilder2;
                    SharedPreferences sharedPreferences = multiDexPreferences;
                    if (j == extractedDex.crc) {
                        arrayList.add(extractedDex);
                        i2++;
                        multiDexPreferences = sharedPreferences;
                        stringBuilder2 = str3;
                    }
                }
                StringBuilder stringBuilder5 = new StringBuilder();
                stringBuilder5.append("Invalid extracted dex: ");
                stringBuilder5.append(extractedDex);
                stringBuilder5.append(" (key \"");
                stringBuilder5.append(str2);
                stringBuilder5.append("\"), expected modification time: ");
                stringBuilder5.append(j2);
                stringBuilder5.append(", modification time: ");
                stringBuilder5.append(lastModified);
                stringBuilder5.append(", expected crc: ");
                stringBuilder5.append(j);
                stringBuilder5.append(", file crc: ");
                stringBuilder5.append(extractedDex.crc);
                throw new IOException(stringBuilder5.toString());
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append("Missing extracted secondary dex file '");
            stringBuilder.append(extractedDex.getPath());
            stringBuilder.append("'");
            throw new IOException(stringBuilder.toString());
        }
        return arrayList;
    }

    private static boolean isModified(Context context, File file, long j, String str) {
        SharedPreferences multiDexPreferences = getMultiDexPreferences(context);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append("timestamp");
        if (multiDexPreferences.getLong(stringBuilder.toString(), -1) == getTimeStamp(file)) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(str);
            stringBuilder2.append(KEY_CRC);
            if (multiDexPreferences.getLong(stringBuilder2.toString(), -1) == j) {
                return false;
            }
        }
        return true;
    }

    private static long getTimeStamp(File file) {
        long lastModified = file.lastModified();
        return lastModified == -1 ? lastModified - 1 : lastModified;
    }

    private static long getZipCrc(File file) {
        long zipCrc = ZipUtil.getZipCrc(file);
        return zipCrc == -1 ? zipCrc - 1 : zipCrc;
    }

    private List<ExtractedDex> performExtractions() {
        String str = DEX_SUFFIX;
        String str2 = "Failed to close resource";
        String str3 = DEX_PREFIX;
        String str4 = TAG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.sourceApk.getName());
        stringBuilder.append(EXTRACTED_NAME_EXT);
        String stringBuilder2 = stringBuilder.toString();
        clearDexDir();
        ArrayList arrayList = new ArrayList();
        ZipFile zipFile = new ZipFile(this.sourceApk);
        ExtractedDex extractedDex;
        Object obj;
        StringBuilder stringBuilder3;
        try {
            StringBuilder stringBuilder4 = new StringBuilder();
            stringBuilder4.append(str3);
            stringBuilder4.append(2);
            stringBuilder4.append(str);
            ZipEntry entry = zipFile.getEntry(stringBuilder4.toString());
            int i = 2;
            while (entry != null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(stringBuilder2);
                stringBuilder.append(i);
                stringBuilder.append(EXTRACTED_SUFFIX);
                extractedDex = new ExtractedDex(this.dexDir, stringBuilder.toString());
                arrayList.add(extractedDex);
                stringBuilder = new StringBuilder();
                stringBuilder.append("Extraction is needed for file ");
                stringBuilder.append(extractedDex);
                Log.i(str4, stringBuilder.toString());
                int i2 = 0;
                Object obj2 = null;
                while (i2 < 3 && obj2 == null) {
                    int i3 = i2 + 1;
                    extract(zipFile, entry, extractedDex, stringBuilder2);
                    extractedDex.crc = getZipCrc(extractedDex);
                    obj = 1;
                    stringBuilder3 = new StringBuilder();
                    stringBuilder3.append("Extraction ");
                    stringBuilder3.append(obj != null ? "succeeded" : "failed");
                    stringBuilder3.append(" '");
                    stringBuilder3.append(extractedDex.getAbsolutePath());
                    stringBuilder3.append("': length ");
                    int i4 = i3;
                    stringBuilder3.append(extractedDex.length());
                    stringBuilder3.append(" - crc: ");
                    stringBuilder3.append(extractedDex.crc);
                    Log.i(str4, stringBuilder3.toString());
                    if (obj == null) {
                        extractedDex.delete();
                        if (extractedDex.exists()) {
                            StringBuilder stringBuilder5 = new StringBuilder();
                            stringBuilder5.append("Failed to delete corrupted secondary dex '");
                            stringBuilder5.append(extractedDex.getPath());
                            stringBuilder5.append("'");
                            Log.w(str4, stringBuilder5.toString());
                        }
                    }
                    obj2 = obj;
                    i2 = i4;
                }
                if (obj2 != null) {
                    i++;
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(str3);
                    stringBuilder.append(i);
                    stringBuilder.append(str);
                    entry = zipFile.getEntry(stringBuilder.toString());
                } else {
                    StringBuilder stringBuilder6 = new StringBuilder();
                    stringBuilder6.append("Could not create zip file ");
                    stringBuilder6.append(extractedDex.getAbsolutePath());
                    stringBuilder6.append(" for secondary dex (");
                    stringBuilder6.append(i);
                    stringBuilder6.append(")");
                    throw new IOException(stringBuilder6.toString());
                }
            }
            try {
                zipFile.close();
            } catch (IOException e) {
                Log.w(str4, str2, e);
            }
            return arrayList;
        } catch (IOException e2) {
            stringBuilder3 = new StringBuilder();
            stringBuilder3.append("Failed to read crc from ");
            stringBuilder3.append(extractedDex.getAbsolutePath());
            Log.w(str4, stringBuilder3.toString(), e2);
            obj = null;
        } catch (Throwable e3) {
            Throwable th = e3;
            try {
                zipFile.close();
            } catch (IOException e32) {
                Log.w(str4, str2, e32);
            }
        }
    }

    private static void putStoredApkInfo(Context context, String str, long j, long j2, List<ExtractedDex> list) {
        Editor edit = getMultiDexPreferences(context).edit();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append("timestamp");
        edit.putLong(stringBuilder.toString(), j);
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(str);
        stringBuilder2.append(KEY_CRC);
        edit.putLong(stringBuilder2.toString(), j2);
        stringBuilder2 = new StringBuilder();
        stringBuilder2.append(str);
        stringBuilder2.append(KEY_DEX_NUMBER);
        edit.putInt(stringBuilder2.toString(), list.size() + 1);
        int i = 2;
        for (ExtractedDex extractedDex : list) {
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append(str);
            stringBuilder3.append(KEY_DEX_CRC);
            stringBuilder3.append(i);
            edit.putLong(stringBuilder3.toString(), extractedDex.crc);
            stringBuilder3 = new StringBuilder();
            stringBuilder3.append(str);
            stringBuilder3.append(KEY_DEX_TIME);
            stringBuilder3.append(i);
            edit.putLong(stringBuilder3.toString(), extractedDex.lastModified());
            i++;
        }
        edit.commit();
    }

    private static SharedPreferences getMultiDexPreferences(Context context) {
        return context.getSharedPreferences(PREFS_FILE, VERSION.SDK_INT < 11 ? 0 : 4);
    }

    private void clearDexDir() {
        File[] listFiles = this.dexDir.listFiles(new FileFilter() {
            public boolean accept(File file) {
                return file.getName().equals(MultiDexExtractor.LOCK_FILENAME) ^ 1;
            }
        });
        String str = TAG;
        if (listFiles == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Failed to list secondary dex dir content (");
            stringBuilder.append(this.dexDir.getPath());
            stringBuilder.append(").");
            Log.w(str, stringBuilder.toString());
            return;
        }
        for (File file : listFiles) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Trying to delete old file ");
            stringBuilder2.append(file.getPath());
            stringBuilder2.append(" of size ");
            stringBuilder2.append(file.length());
            Log.i(str, stringBuilder2.toString());
            if (file.delete()) {
                stringBuilder2 = new StringBuilder();
                stringBuilder2.append("Deleted old file ");
                stringBuilder2.append(file.getPath());
                Log.i(str, stringBuilder2.toString());
            } else {
                stringBuilder2 = new StringBuilder();
                stringBuilder2.append("Failed to delete old file ");
                stringBuilder2.append(file.getPath());
                Log.w(str, stringBuilder2.toString());
            }
        }
    }

    private static void extract(ZipFile zipFile, ZipEntry zipEntry, File file, String str) {
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("tmp-");
        stringBuilder.append(str);
        File createTempFile = File.createTempFile(stringBuilder.toString(), EXTRACTED_SUFFIX, file.getParentFile());
        stringBuilder = new StringBuilder();
        stringBuilder.append("Extracting ");
        stringBuilder.append(createTempFile.getPath());
        String stringBuilder2 = stringBuilder.toString();
        String str2 = TAG;
        Log.i(str2, stringBuilder2);
        ZipOutputStream zipOutputStream;
        try {
            zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(createTempFile)));
            ZipEntry zipEntry2 = new ZipEntry("classes.dex");
            zipEntry2.setTime(zipEntry.getTime());
            zipOutputStream.putNextEntry(zipEntry2);
            byte[] bArr = new byte[16384];
            for (int read = inputStream.read(bArr); read != -1; read = inputStream.read(bArr)) {
                zipOutputStream.write(bArr, 0, read);
            }
            zipOutputStream.closeEntry();
            zipOutputStream.close();
            if (createTempFile.setReadOnly()) {
                StringBuilder stringBuilder3 = new StringBuilder();
                stringBuilder3.append("Renaming to ");
                stringBuilder3.append(file.getPath());
                Log.i(str2, stringBuilder3.toString());
                if (createTempFile.renameTo(file)) {
                    closeQuietly(inputStream);
                    createTempFile.delete();
                    return;
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("Failed to rename \"");
                stringBuilder.append(createTempFile.getAbsolutePath());
                stringBuilder.append("\" to \"");
                stringBuilder.append(file.getAbsolutePath());
                stringBuilder.append("\"");
                throw new IOException(stringBuilder.toString());
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append("Failed to mark readonly \"");
            stringBuilder.append(createTempFile.getAbsolutePath());
            stringBuilder.append("\" (tmp of \"");
            stringBuilder.append(file.getAbsolutePath());
            stringBuilder.append("\")");
            throw new IOException(stringBuilder.toString());
        } catch (Throwable th) {
            closeQuietly(inputStream);
            createTempFile.delete();
        }
    }

    private static void closeQuietly(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e) {
            Log.w(TAG, "Failed to close resource", e);
        }
    }
}
