package com.google.android.gms.internal.vision;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import com.google.android.gms.dynamite.DynamiteModule;

public final class zzp {
    public static Bitmap zzb(Bitmap bitmap, zzn zzn) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (zzn.rotation != 0) {
            Matrix matrix = new Matrix();
            int i = zzn.rotation;
            if (i == 0) {
                i = 0;
            } else if (i == 1) {
                i = 90;
            } else if (i == 2) {
                i = 180;
            } else if (i == 3) {
                i = 270;
            } else {
                throw new IllegalArgumentException("Unsupported rotation degree.");
            }
            matrix.postRotate((float) i);
            bitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, false);
        }
        if (zzn.rotation == 1 || zzn.rotation == 3) {
            zzn.width = height;
            zzn.height = width;
        }
        return bitmap;
    }

    public static boolean zza(Context context, String str) {
        return DynamiteModule.getLocalVersion(context, str) > DynamiteModule.getRemoteVersion(context, "com.google.android.gms.vision.dynamite");
    }
}
