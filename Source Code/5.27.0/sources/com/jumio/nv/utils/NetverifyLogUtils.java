package com.jumio.nv.utils;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import androidx.annotation.Nullable;
import com.jumio.commons.log.Log;
import com.jumio.commons.log.LogUtils;
import com.jumio.nv.extraction.JumioRect;
import java.io.File;
import java.util.ArrayList;

public class NetverifyLogUtils extends LogUtils {
    private static final String FILE_UPLOAD_IMAGE = "scaled";
    private static final String FILE_UPLOAD_IMAGE_WITH_COORDS = "scaled_with_coords.png";

    public static class a {
        private static ArrayList<Integer> a;

        public static void a(int i) {
            if (a == null) {
                a = new ArrayList();
            }
            a.add(Integer.valueOf(i));
        }

        public static void a() {
            ArrayList arrayList = a;
            if (arrayList == null) {
                a = new ArrayList();
            } else {
                arrayList.clear();
            }
        }

        public static void a(StringBuilder stringBuilder) {
            if (stringBuilder != null) {
                ArrayList arrayList = a;
                if (arrayList != null && arrayList.size() != 0) {
                    stringBuilder.append("Line count of the last frames:");
                    String str = "\r\n";
                    stringBuilder.append(str);
                    String str2 = "";
                    stringBuilder.append(a.toString().replace("[", str2).replace("]", str2));
                    stringBuilder.append(str);
                }
            }
        }
    }

    public static void init() {
        LogUtils.init();
    }

    public static void appendCoordinatesLog(StringBuilder stringBuilder, ArrayList<ArrayList<JumioRect>> arrayList) {
        if (arrayList != null) {
            stringBuilder.append("Coordinates");
            String str = "\r\n";
            stringBuilder.append(str);
            stringBuilder.append("left,top,width,height");
            stringBuilder.append(str);
            int i = 0;
            while (i < arrayList.size()) {
                stringBuilder.append("Line ");
                int i2 = i + 1;
                stringBuilder.append(i2);
                stringBuilder.append(str);
                ArrayList arrayList2 = (ArrayList) arrayList.get(i);
                if (arrayList2 != null) {
                    for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                        JumioRect jumioRect = (JumioRect) arrayList2.get(i3);
                        stringBuilder.append(jumioRect.left);
                        String str2 = ",";
                        stringBuilder.append(str2);
                        stringBuilder.append(jumioRect.top);
                        stringBuilder.append(str2);
                        stringBuilder.append(jumioRect.width());
                        stringBuilder.append(str2);
                        stringBuilder.append(jumioRect.height());
                        stringBuilder.append(str);
                    }
                }
                i = i2;
            }
        }
    }

    public static void logInfoInSubfolder(String str, String str2, @Nullable String str3) {
        File subFolder = LogUtils.getSubFolder(str2);
        if (subFolder != null) {
            if (str3 == null) {
                str3 = "OCRImageData.txt";
            }
            Log.i(str, subFolder, str3);
        }
    }

    public static void dumpImageInSubfolder(Bitmap bitmap, String str, CompressFormat compressFormat, int i, @Nullable String str2) {
        File subFolder = LogUtils.getSubFolder(str);
        StringBuilder stringBuilder = new StringBuilder();
        String str3 = FILE_UPLOAD_IMAGE;
        if (str2 != null) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(str2);
            stringBuilder2.append("_");
            stringBuilder2.append(str3);
            str3 = stringBuilder2.toString();
        }
        stringBuilder.append(str3);
        stringBuilder.append(".");
        stringBuilder.append(compressFormat.name().toLowerCase());
        str2 = stringBuilder.toString();
        if (subFolder != null) {
            Log.image(bitmap, subFolder, str2, compressFormat, i);
        }
    }

    public static void dumpDataInSubfolder(byte[] bArr, String str, String str2) {
        File subFolder = LogUtils.getSubFolder(str);
        if (subFolder != null) {
            Log.data(bArr, subFolder, str2);
        }
    }

    public static void dumpImageInSubfolder(Bitmap bitmap, String str, CompressFormat compressFormat, int i) {
        dumpImageInSubfolder(bitmap, str, compressFormat, i, null);
    }

    public static void dumpPictureWithCoordinates(ArrayList<ArrayList<JumioRect>> arrayList, Bitmap bitmap, String str) {
        Canvas canvas = new Canvas(bitmap);
        Paint paint = new Paint();
        paint.setStyle(Style.STROKE);
        paint.setStrokeWidth(0.0f);
        paint.setColor(-16724941);
        for (int i = 0; i < arrayList.size(); i++) {
            ArrayList arrayList2 = (ArrayList) arrayList.get(i);
            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                JumioRect jumioRect = (JumioRect) arrayList2.get(i2);
                canvas.drawRect(new Rect(jumioRect.left, jumioRect.top, jumioRect.right, jumioRect.bottom), paint);
            }
        }
        File subFolder = LogUtils.getSubFolder(str);
        if (subFolder != null) {
            Log.image(bitmap, subFolder, FILE_UPLOAD_IMAGE_WITH_COORDS, CompressFormat.PNG, 0);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x003b A:{Catch:{ Exception -> 0x0047 }} */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0040 A:{Catch:{ Exception -> 0x0047 }} */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x003b A:{Catch:{ Exception -> 0x0047 }} */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0040 A:{Catch:{ Exception -> 0x0047 }} */
    public static void copyFile(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
        /*
        r0 = new java.io.File;	 Catch:{ Exception -> 0x0047 }
        r3 = com.jumio.commons.log.LogUtils.getSubFolder(r3);	 Catch:{ Exception -> 0x0047 }
        r0.<init>(r3, r4);	 Catch:{ Exception -> 0x0047 }
        r3 = r0.getAbsolutePath();	 Catch:{ Exception -> 0x0047 }
        r4 = 0;
        r0 = new java.io.FileInputStream;	 Catch:{ all -> 0x0037 }
        r0.<init>(r2);	 Catch:{ all -> 0x0037 }
        r2 = new java.io.FileOutputStream;	 Catch:{ all -> 0x0035 }
        r2.<init>(r3);	 Catch:{ all -> 0x0035 }
        r3 = 1024; // 0x400 float:1.435E-42 double:5.06E-321;
        r3 = new byte[r3];	 Catch:{ all -> 0x0032 }
    L_0x001c:
        r4 = r0.read(r3);	 Catch:{ all -> 0x0032 }
        r1 = -1;
        if (r4 == r1) goto L_0x0028;
    L_0x0023:
        r1 = 0;
        r2.write(r3, r1, r4);	 Catch:{ all -> 0x0032 }
        goto L_0x001c;
    L_0x0028:
        r0.close();	 Catch:{ Exception -> 0x0047 }
        r2.flush();	 Catch:{ Exception -> 0x0047 }
        r2.close();	 Catch:{ Exception -> 0x0047 }
        goto L_0x004b;
    L_0x0032:
        r3 = move-exception;
        r4 = r2;
        goto L_0x0039;
    L_0x0035:
        r3 = move-exception;
        goto L_0x0039;
    L_0x0037:
        r3 = move-exception;
        r0 = r4;
    L_0x0039:
        if (r0 == 0) goto L_0x003e;
    L_0x003b:
        r0.close();	 Catch:{ Exception -> 0x0047 }
    L_0x003e:
        if (r4 == 0) goto L_0x0046;
    L_0x0040:
        r4.flush();	 Catch:{ Exception -> 0x0047 }
        r4.close();	 Catch:{ Exception -> 0x0047 }
    L_0x0046:
        throw r3;	 Catch:{ Exception -> 0x0047 }
    L_0x0047:
        r2 = move-exception;
        com.jumio.commons.log.Log.printStackTrace(r2);
    L_0x004b:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jumio.nv.utils.NetverifyLogUtils.copyFile(java.lang.String, java.lang.String, java.lang.String):void");
    }
}
