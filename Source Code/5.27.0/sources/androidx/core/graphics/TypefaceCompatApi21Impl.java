package androidx.core.graphics;

import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.RestrictTo.Scope;
import java.io.File;

@RequiresApi(21)
@RestrictTo({Scope.LIBRARY_GROUP})
class TypefaceCompatApi21Impl extends TypefaceCompatBaseImpl {
    private static final String TAG = "TypefaceCompatApi21Impl";

    TypefaceCompatApi21Impl() {
    }

    private File getFile(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("/proc/self/fd/");
            stringBuilder.append(parcelFileDescriptor.getFd());
            String readlink = Os.readlink(stringBuilder.toString());
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                return new File(readlink);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x005d A:{ExcHandler: all (th java.lang.Throwable), Splitter:B:6:0x0018} */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing block: B:42:0x005d, code skipped:
            r5 = th;
     */
    /* JADX WARNING: Missing block: B:43:0x005e, code skipped:
            r7 = null;
     */
    /* JADX WARNING: Missing block: B:47:0x0062, code skipped:
            r7 = move-exception;
     */
    /* JADX WARNING: Missing block: B:48:0x0063, code skipped:
            r3 = r7;
            r7 = r5;
            r5 = r3;
     */
    public android.graphics.Typeface createFromFontInfo(android.content.Context r5, android.os.CancellationSignal r6, @androidx.annotation.NonNull androidx.core.provider.FontsContractCompat.FontInfo[] r7, int r8) {
        /*
        r4 = this;
        r0 = r7.length;
        r1 = 0;
        r2 = 1;
        if (r0 >= r2) goto L_0x0006;
    L_0x0005:
        return r1;
    L_0x0006:
        r7 = r4.findBestInfo(r7, r8);
        r8 = r5.getContentResolver();
        r7 = r7.getUri();	 Catch:{ IOException -> 0x0077 }
        r0 = "r";
        r6 = r8.openFileDescriptor(r7, r0, r6);	 Catch:{ IOException -> 0x0077 }
        r7 = r4.getFile(r6);	 Catch:{ Throwable -> 0x0060, all -> 0x005d }
        if (r7 == 0) goto L_0x002f;
    L_0x001e:
        r8 = r7.canRead();	 Catch:{ Throwable -> 0x0060, all -> 0x005d }
        if (r8 != 0) goto L_0x0025;
    L_0x0024:
        goto L_0x002f;
    L_0x0025:
        r5 = android.graphics.Typeface.createFromFile(r7);	 Catch:{ Throwable -> 0x0060, all -> 0x005d }
        if (r6 == 0) goto L_0x002e;
    L_0x002b:
        r6.close();	 Catch:{ IOException -> 0x0077 }
    L_0x002e:
        return r5;
    L_0x002f:
        r7 = new java.io.FileInputStream;	 Catch:{ Throwable -> 0x0060, all -> 0x005d }
        r8 = r6.getFileDescriptor();	 Catch:{ Throwable -> 0x0060, all -> 0x005d }
        r7.<init>(r8);	 Catch:{ Throwable -> 0x0060, all -> 0x005d }
        r5 = super.createFromInputStream(r5, r7);	 Catch:{ Throwable -> 0x0048, all -> 0x0045 }
        r7.close();	 Catch:{ Throwable -> 0x0060, all -> 0x005d }
        if (r6 == 0) goto L_0x0044;
    L_0x0041:
        r6.close();	 Catch:{ IOException -> 0x0077 }
    L_0x0044:
        return r5;
    L_0x0045:
        r5 = move-exception;
        r8 = r1;
        goto L_0x004e;
    L_0x0048:
        r5 = move-exception;
        throw r5;	 Catch:{ all -> 0x004a }
    L_0x004a:
        r8 = move-exception;
        r3 = r8;
        r8 = r5;
        r5 = r3;
    L_0x004e:
        if (r8 == 0) goto L_0x0059;
    L_0x0050:
        r7.close();	 Catch:{ Throwable -> 0x0054, all -> 0x005d }
        goto L_0x005c;
    L_0x0054:
        r7 = move-exception;
        r8.addSuppressed(r7);	 Catch:{ Throwable -> 0x0060, all -> 0x005d }
        goto L_0x005c;
    L_0x0059:
        r7.close();	 Catch:{ Throwable -> 0x0060, all -> 0x005d }
    L_0x005c:
        throw r5;	 Catch:{ Throwable -> 0x0060, all -> 0x005d }
    L_0x005d:
        r5 = move-exception;
        r7 = r1;
        goto L_0x0066;
    L_0x0060:
        r5 = move-exception;
        throw r5;	 Catch:{ all -> 0x0062 }
    L_0x0062:
        r7 = move-exception;
        r3 = r7;
        r7 = r5;
        r5 = r3;
    L_0x0066:
        if (r6 == 0) goto L_0x0076;
    L_0x0068:
        if (r7 == 0) goto L_0x0073;
    L_0x006a:
        r6.close();	 Catch:{ Throwable -> 0x006e }
        goto L_0x0076;
    L_0x006e:
        r6 = move-exception;
        r7.addSuppressed(r6);	 Catch:{ IOException -> 0x0077 }
        goto L_0x0076;
    L_0x0073:
        r6.close();	 Catch:{ IOException -> 0x0077 }
    L_0x0076:
        throw r5;	 Catch:{ IOException -> 0x0077 }
    L_0x0077:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.TypefaceCompatApi21Impl.createFromFontInfo(android.content.Context, android.os.CancellationSignal, androidx.core.provider.FontsContractCompat$FontInfo[], int):android.graphics.Typeface");
    }
}
