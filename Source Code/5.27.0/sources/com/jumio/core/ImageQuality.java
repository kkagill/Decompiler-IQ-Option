package com.jumio.core;

import com.jumio.clientlib.impl.imagequality.ImageQualityAcquisition;
import com.jumio.clientlib.impl.imagequality.PixelFormatType;
import com.jumio.commons.log.Log;
import com.jumio.ocr.impl.smartEngines.swig.ImageCheck;

public class ImageQuality {
    public static final float FOCUS_THRESHOLD = 0.12f;
    public static final int INTENSITY_THRESHOLD = 70;

    public static boolean isFlashNeeded(byte[] bArr, int i, int i2, boolean z) {
        return isFlashNeeded(bArr, i, i2, 70, z);
    }

    public static boolean isFlashNeeded(byte[] bArr, int i, int i2, int i3, boolean z) {
        int i4 = z ? 3 : 1;
        int i5 = z ? 3 : 1;
        r14 = new Object[6];
        int i6 = i4 * i;
        r14[4] = Integer.valueOf(i6);
        r14[5] = Integer.valueOf(i5);
        String str = "ImageCheck";
        Log.v(str, String.format("-- isFlashNeeded: len = %d, threshold=%d, w = %d, h = %d, stride = %d, ch = %d", r14));
        try {
            return ImageCheck.isFlashNeeded(bArr, i3, i, i2, i6, i5);
        } catch (Exception e) {
            Log.w(str, "isFlashNeeded failed!", e);
            return false;
        }
    }

    public static float calculateFocus(byte[] bArr, int i, int i2, boolean z) {
        String str = "ImageCheck";
        int i3 = z ? 3 : 1;
        PixelFormatType pixelFormatType = z ? PixelFormatType.PIXEL_FORMAT_RGB_8 : PixelFormatType.PIXEL_FORMAT_GRAY;
        float f = -1.0f;
        try {
            Log.v(str, String.format("-- computeFocusConfidence: len = %d, w = %d, h = %d, stride = %d, format = %s", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3 * i), pixelFormatType.toString()}));
            f = ImageQualityAcquisition.Evaluate(bArr, ((long) i3) * ((long) i), i, i2, pixelFormatType);
            return f;
        } catch (Exception e) {
            Log.w(str, "computeFocusConfidence failed!", e);
            return f;
        }
    }
}
