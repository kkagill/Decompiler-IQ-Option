package com.jumio.commons.camera;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.core.view.ViewCompat;

public class CameraUtils {
    public static final int FULL_SIZE = -1;
    private static final String TAG = "CameraUtils";
    private static IYuvConversion yuvConversion;

    public interface IYuvConversion {
        int yuvCutRotateScale2rgb(byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, byte[] bArr2, int i7, int i8, int i9);
    }

    public static void setYuvConversion(IYuvConversion iYuvConversion) {
        yuvConversion = iYuvConversion;
    }

    public static int getImageRotation(PreviewProperties previewProperties) {
        int i = previewProperties.orientation / 90;
        if (previewProperties.frontFacing) {
            return (i == 1 || i == 3) ? (i + 2) % 4 : i;
        } else {
            return i;
        }
    }

    public static RectF surfaceToPreview(PreviewProperties previewProperties, Rect rect) {
        Matrix matrix = new Matrix();
        matrix.setScale(((float) previewProperties.preview.width) / ((float) previewProperties.scaledPreview.width), ((float) previewProperties.preview.height) / ((float) previewProperties.scaledPreview.height));
        float f = ((float) (previewProperties.scaledPreview.width - previewProperties.surface.width)) / 2.0f;
        float f2 = ((float) (previewProperties.scaledPreview.height - previewProperties.surface.height)) / 2.0f;
        RectF rectF = new RectF(rect);
        rectF.offset(f, f2);
        RectF rectF2 = new RectF();
        matrix.mapRect(rectF2, rectF);
        return rectF2;
    }

    public static RectF previewToSurface(PreviewProperties previewProperties, RectF rectF) {
        Matrix matrix = new Matrix();
        float f = ((float) previewProperties.scaledPreview.width) / ((float) previewProperties.preview.width);
        float f2 = ((float) previewProperties.scaledPreview.height) / ((float) previewProperties.preview.height);
        if (previewProperties.frontFacing) {
            matrix.setScale(f * -1.0f, f2);
            matrix.postTranslate((float) previewProperties.scaledPreview.width, 0.0f);
        } else {
            matrix.setScale(f, f2);
        }
        f = ((float) (previewProperties.scaledPreview.width - previewProperties.surface.width)) / 2.0f;
        float f3 = ((float) (previewProperties.scaledPreview.height - previewProperties.surface.height)) / 2.0f;
        RectF rectF2 = new RectF(rectF);
        rectF2.offset(-f, -f3);
        RectF rectF3 = new RectF();
        matrix.mapRect(rectF3, rectF2);
        return rectF3;
    }

    public static Bitmap yuv2bitmap(byte[] bArr, boolean z, PreviewProperties previewProperties, Rect rect, int i) {
        Size size = new Size(-1, -1);
        bArr = yuv2rgb(bArr, z, previewProperties, rect, size, i);
        return bArr != null ? rgb2bitmap(bArr, size.width, size.height) : null;
    }

    public static Bitmap yuv2bitmap(byte[] bArr, boolean z, PreviewProperties previewProperties, Rect rect, float f) {
        Size size = new Size(-1, -1);
        bArr = yuv2rgb(bArr, z, previewProperties, rect, f, size);
        return bArr != null ? rgb2bitmap(bArr, size.width, size.height) : null;
    }

    public static Bitmap yuv2bitmap(byte[] bArr, boolean z, PreviewProperties previewProperties, int i, int i2, int i3, int i4, int i5, int i6) {
        bArr = yuv2rgb(bArr, z, previewProperties, i, i2, i3, i4, i5, i6);
        return bArr != null ? rgb2bitmap(bArr, i5, i6) : null;
    }

    public static byte[] yuv2rgb(byte[] bArr, boolean z, PreviewProperties previewProperties, Rect rect, float f, Size size) {
        PreviewProperties previewProperties2 = previewProperties;
        Size size2 = size;
        if (rect == null) {
            return null;
        }
        int i;
        int i2;
        int width;
        int height;
        int i3;
        int i4;
        RectF surfaceToPreview = surfaceToPreview(previewProperties, rect);
        float height2 = ((float) rect.height()) / ((float) rect.width());
        if (z) {
            i = (int) surfaceToPreview.left;
            i2 = (int) surfaceToPreview.top;
            width = (int) surfaceToPreview.width();
            height = (int) surfaceToPreview.height();
            if (height2 >= f) {
                i3 = (int) (((float) width) * f);
                i2 += (height - i3) / 2;
            } else {
                i3 = (int) (((float) height) / f);
                i += (width - i3) / 2;
                width = i3;
                i3 = height;
            }
        } else {
            i2 = (int) surfaceToPreview.left;
            i = (int) surfaceToPreview.top;
            width = (int) surfaceToPreview.width();
            height = (int) surfaceToPreview.height();
            if (height2 <= f) {
                i3 = (int) (((float) height) / f);
                i2 += (width - i3) / 2;
                width = height;
            } else {
                i3 = (int) (((float) width) * f);
                i += (height - i3) / 2;
                i4 = width;
                width = i3;
                i3 = i4;
            }
        }
        if (size2.width == -1) {
            size2.width = z ? width : i3;
        }
        if (size2.height == -1) {
            size2.height = z ? i3 : width;
        }
        height = previewProperties2.camera.width;
        int i5 = previewProperties2.camera.height;
        int i6 = previewProperties2.orientation / 90;
        if ((previewProperties2.frontFacing || !(i6 == 2 || i6 == 4 || i6 == 3)) && !(previewProperties2.frontFacing && (i6 == 1 || i6 == 2))) {
            i4 = i2;
            i2 = i;
            i = i4;
        } else {
            i5 = (i5 - width) - i;
            i = (height - i3) - i2;
            i2 = i5;
        }
        return yuv2rgb(bArr, z, previewProperties, i3, width, i, i2, size2.width, size2.height);
    }

    public static byte[] yuv2rgb(byte[] bArr, boolean z, PreviewProperties previewProperties, Rect rect, Size size, int i) {
        int width;
        int height;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        Size size2 = size;
        int i8 = i;
        RectF surfaceToPreview = surfaceToPreview(previewProperties, rect);
        int i9;
        int i10;
        if (z) {
            i9 = (int) surfaceToPreview.left;
            i10 = (int) surfaceToPreview.top;
            width = (int) surfaceToPreview.width();
            height = (int) surfaceToPreview.height();
            i2 = height;
            i3 = i9;
            i4 = i10;
            i5 = width;
        } else {
            i9 = (int) surfaceToPreview.left;
            i10 = (int) surfaceToPreview.top;
            width = (int) surfaceToPreview.width();
            height = (int) surfaceToPreview.height();
            i5 = height;
            i4 = i9;
            i3 = i10;
            i2 = width;
        }
        if (i8 == -1 || (width <= i8 && height <= i8)) {
            i8 = width;
        } else if (width > height) {
            height = (int) (((float) i8) * (((float) height) / ((float) width)));
        } else {
            height = i8;
            i8 = (int) (((float) i8) * (((float) width) / ((float) height)));
        }
        if (size2 != null) {
            if (size2.width == -1) {
                size2.width = i8;
            } else {
                i8 = size2.width;
            }
            if (size2.height == -1) {
                size2.height = height;
            } else {
                i6 = size2.height;
                i7 = i8;
                return yuv2rgb(bArr, z, previewProperties, i2, i5, i4, i3, i7, i6);
            }
        }
        i7 = i8;
        i6 = height;
        return yuv2rgb(bArr, z, previewProperties, i2, i5, i4, i3, i7, i6);
    }

    public static byte[] yuv2rgb(byte[] bArr, boolean z, PreviewProperties previewProperties, int i, int i2, int i3, int i4, int i5, int i6) {
        PreviewProperties previewProperties2 = previewProperties;
        int i7 = previewProperties2.camera.width;
        int i8 = previewProperties2.camera.height;
        int i9 = previewProperties2.orientation / 90;
        if (previewProperties2.frontFacing && (i9 == 1 || i9 == 3)) {
            i9 = (i9 + 2) % 4;
        }
        int i10 = i9;
        byte[] bArr2 = new byte[((i5 * i6) * 3)];
        i9 = -1;
        IYuvConversion iYuvConversion = yuvConversion;
        if (iYuvConversion != null) {
            i9 = iYuvConversion.yuvCutRotateScale2rgb(bArr, i7, i8, i3, i4, i, i2, bArr2, i5, i6, i10);
        }
        return i9 != 0 ? null : bArr2;
    }

    public static Bitmap rgb2bitmap(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Config.ARGB_8888);
        int[] iArr = new int[i];
        for (int i3 = 0; i3 < i2; i3++) {
            for (int i4 = 0; i4 < i; i4++) {
                int i5 = ((i3 * i) * 3) + (i4 * 3);
                iArr[i4] = ((((bArr[i5] & 255) << 16) + ViewCompat.MEASURED_STATE_MASK) + ((bArr[i5 + 1] & 255) << 8)) + (bArr[i5 + 2] & 255);
            }
            createBitmap.setPixels(iArr, 0, i, 0, i3, i, 1);
        }
        return createBitmap;
    }

    public static Bitmap rgb2bitmap(byte[] bArr, int i, int i2, int i3) {
        Bitmap rgb2bitmap = rgb2bitmap(bArr, i, i2);
        Bitmap createBitmap = Bitmap.createBitmap(rgb2bitmap.getWidth(), rgb2bitmap.getHeight(), Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        Rect rect = new Rect(0, 0, rgb2bitmap.getWidth(), rgb2bitmap.getHeight());
        RectF rectF = new RectF(rect);
        float f = (float) i3;
        paint.setAntiAlias(true);
        canvas.drawARGB(0, 0, 0, 0);
        paint.setColor(-12434878);
        canvas.drawRoundRect(rectF, f, f, paint);
        paint.setXfermode(new PorterDuffXfermode(Mode.SRC_IN));
        canvas.drawBitmap(rgb2bitmap, rect, rect, paint);
        return createBitmap;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0020 A:{SYNTHETIC, Splitter:B:16:0x0020} */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x002b A:{SYNTHETIC, Splitter:B:21:0x002b} */
    public static void saveBitmap(android.graphics.Bitmap r3, java.io.File r4, android.graphics.Bitmap.CompressFormat r5, int r6) {
        /*
        r0 = "CameraUtils";
        r1 = 0;
        r2 = new java.io.FileOutputStream;	 Catch:{ Exception -> 0x001a }
        r2.<init>(r4);	 Catch:{ Exception -> 0x001a }
        r3.compress(r5, r6, r2);	 Catch:{ Exception -> 0x0015, all -> 0x0012 }
        r2.flush();	 Catch:{ Exception -> 0x0015, all -> 0x0012 }
        r2.close();	 Catch:{ IOException -> 0x0024 }
        goto L_0x0028;
    L_0x0012:
        r3 = move-exception;
        r1 = r2;
        goto L_0x0029;
    L_0x0015:
        r3 = move-exception;
        r1 = r2;
        goto L_0x001b;
    L_0x0018:
        r3 = move-exception;
        goto L_0x0029;
    L_0x001a:
        r3 = move-exception;
    L_0x001b:
        com.jumio.commons.log.Log.e(r0, r3);	 Catch:{ all -> 0x0018 }
        if (r1 == 0) goto L_0x0028;
    L_0x0020:
        r1.close();	 Catch:{ IOException -> 0x0024 }
        goto L_0x0028;
    L_0x0024:
        r3 = move-exception;
        com.jumio.commons.log.Log.e(r0, r3);
    L_0x0028:
        return;
    L_0x0029:
        if (r1 == 0) goto L_0x0033;
    L_0x002b:
        r1.close();	 Catch:{ IOException -> 0x002f }
        goto L_0x0033;
    L_0x002f:
        r4 = move-exception;
        com.jumio.commons.log.Log.e(r0, r4);
    L_0x0033:
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jumio.commons.camera.CameraUtils.saveBitmap(android.graphics.Bitmap, java.io.File, android.graphics.Bitmap$CompressFormat, int):void");
    }
}
