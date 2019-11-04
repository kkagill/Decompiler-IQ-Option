package com.jumio.commons.utils;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import java.io.ByteArrayOutputStream;
import java.io.File;

public class FileUtil {
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0029  */
    public static byte[] readFile(java.lang.String r6) {
        /*
        r0 = 0;
        r1 = new java.io.RandomAccessFile;	 Catch:{ all -> 0x0025 }
        r2 = "r";
        r1.<init>(r6, r2);	 Catch:{ all -> 0x0025 }
        r2 = r1.length();	 Catch:{ all -> 0x0023 }
        r6 = (int) r2;	 Catch:{ all -> 0x0023 }
        r4 = (long) r6;	 Catch:{ all -> 0x0023 }
        r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1));
        if (r0 != 0) goto L_0x001b;
    L_0x0012:
        r6 = new byte[r6];	 Catch:{ all -> 0x0023 }
        r1.readFully(r6);	 Catch:{ all -> 0x0023 }
        r1.close();
        return r6;
    L_0x001b:
        r6 = new java.io.IOException;	 Catch:{ all -> 0x0023 }
        r0 = "File size >= 2 GB";
        r6.<init>(r0);	 Catch:{ all -> 0x0023 }
        throw r6;	 Catch:{ all -> 0x0023 }
    L_0x0023:
        r6 = move-exception;
        goto L_0x0027;
    L_0x0025:
        r6 = move-exception;
        r1 = r0;
    L_0x0027:
        if (r1 == 0) goto L_0x002c;
    L_0x0029:
        r1.close();
    L_0x002c:
        throw r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jumio.commons.utils.FileUtil.readFile(java.lang.String):byte[]");
    }

    public static byte[] mergeBitmaps(String str, String str2, CompressFormat compressFormat, int i) {
        Bitmap decodeFile = BitmapFactory.decodeFile(str);
        Bitmap decodeFile2 = BitmapFactory.decodeFile(str2);
        int width = decodeFile.getWidth() + decodeFile2.getWidth();
        int height = decodeFile.getHeight();
        if (decodeFile2.getHeight() > height) {
            height = decodeFile2.getHeight();
        }
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawColor(-1);
        canvas.drawBitmap(decodeFile, 0.0f, 0.0f, null);
        canvas.drawBitmap(decodeFile2, (float) decodeFile.getWidth(), 0.0f, null);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        createBitmap.compress(compressFormat, i, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static boolean deleteFile(String str) {
        File file = new File(str);
        return file.exists() ? file.delete() : false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x001e  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0017  */
    public static boolean saveToFile(byte[] r3, java.io.File r4) {
        /*
        r0 = 0;
        r1 = 0;
        r2 = new java.io.FileOutputStream;	 Catch:{ IOException -> 0x001b, all -> 0x0014 }
        r2.<init>(r4, r0);	 Catch:{ IOException -> 0x001b, all -> 0x0014 }
        r2.write(r3);	 Catch:{ IOException -> 0x0012, all -> 0x000f }
        com.jumio.commons.utils.IOUtils.closeQuietly(r2);
        r0 = 1;
        goto L_0x0021;
    L_0x000f:
        r3 = move-exception;
        r1 = r2;
        goto L_0x0015;
    L_0x0012:
        r1 = r2;
        goto L_0x001c;
    L_0x0014:
        r3 = move-exception;
    L_0x0015:
        if (r1 == 0) goto L_0x001a;
    L_0x0017:
        com.jumio.commons.utils.IOUtils.closeQuietly(r1);
    L_0x001a:
        throw r3;
    L_0x001c:
        if (r1 == 0) goto L_0x0021;
    L_0x001e:
        com.jumio.commons.utils.IOUtils.closeQuietly(r1);
    L_0x0021:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jumio.commons.utils.FileUtil.saveToFile(byte[], java.io.File):boolean");
    }
}
