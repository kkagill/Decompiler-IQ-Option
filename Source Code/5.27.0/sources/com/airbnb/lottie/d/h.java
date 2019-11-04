package com.airbnb.lottie.d;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.os.Build.VERSION;
import android.provider.Settings.Global;
import android.provider.Settings.System;
import androidx.annotation.Nullable;
import com.airbnb.lottie.a.a.s;
import com.airbnb.lottie.a.b.c;
import com.airbnb.lottie.d;
import java.io.Closeable;

/* compiled from: Utils */
public final class h {
    private static final Path gB = new Path();
    private static final PathMeasure gy = new PathMeasure();
    private static final Path kg = new Path();
    private static final float kh = ((float) Math.sqrt(2.0d));
    private static float ki = -1.0f;
    private static final float[] points = new float[4];

    public static int a(float f, float f2, float f3, float f4) {
        int i = f != 0.0f ? (int) (((float) 527) * f) : 17;
        if (f2 != 0.0f) {
            i = (int) (((float) (i * 31)) * f2);
        }
        if (f3 != 0.0f) {
            i = (int) (((float) (i * 31)) * f3);
        }
        return f4 != 0.0f ? (int) (((float) (i * 31)) * f4) : i;
    }

    public static boolean a(int i, int i2, int i3, int i4, int i5, int i6) {
        boolean z = false;
        if (i < i4) {
            return false;
        }
        if (i > i4) {
            return true;
        }
        if (i2 < i5) {
            return false;
        }
        if (i2 > i5) {
            return true;
        }
        if (i3 >= i6) {
            z = true;
        }
        return z;
    }

    public static Path b(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 == null || pointF4 == null || (pointF3.length() == 0.0f && pointF4.length() == 0.0f)) {
            path.lineTo(pointF2.x, pointF2.y);
        } else {
            Path path2 = path;
            path2.cubicTo(pointF3.x + pointF.x, pointF.y + pointF3.y, pointF2.x + pointF4.x, pointF2.y + pointF4.y, pointF2.x, pointF2.y);
        }
        return path;
    }

    public static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static float b(Matrix matrix) {
        float[] fArr = points;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f = kh;
        fArr[2] = f;
        fArr[3] = f;
        matrix.mapPoints(fArr);
        float[] fArr2 = points;
        return ((float) Math.hypot((double) (fArr2[2] - fArr2[0]), (double) (fArr2[3] - fArr2[1]))) / 2.0f;
    }

    public static boolean c(Matrix matrix) {
        float[] fArr = points;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 37394.73f;
        fArr[3] = 39575.234f;
        matrix.mapPoints(fArr);
        float[] fArr2 = points;
        return fArr2[0] == fArr2[2] || fArr2[1] == fArr2[3];
    }

    public static void a(Path path, @Nullable s sVar) {
        if (sVar != null && !sVar.isHidden()) {
            a(path, ((c) sVar.aL()).aU() / 100.0f, ((c) sVar.aM()).aU() / 100.0f, ((c) sVar.aN()).aU() / 360.0f);
        }
    }

    public static void a(Path path, float f, float f2, float f3) {
        String str = "applyTrimPathIfNeeded";
        d.beginSection(str);
        gy.setPath(path, false);
        float length = gy.getLength();
        if (f == 1.0f && f2 == 0.0f) {
            d.k(str);
        } else if (length < 1.0f || ((double) Math.abs((f2 - f) - 1.0f)) < 0.01d) {
            d.k(str);
        } else {
            f *= length;
            f2 *= length;
            f3 *= length;
            float min = Math.min(f, f2) + f3;
            f = Math.max(f, f2) + f3;
            if (min >= length && f >= length) {
                min = (float) g.g(min, length);
                f = (float) g.g(f, length);
            }
            if (min < 0.0f) {
                min = (float) g.g(min, length);
            }
            if (f < 0.0f) {
                f = (float) g.g(f, length);
            }
            if (min == f) {
                path.reset();
                d.k(str);
                return;
            }
            if (min >= f) {
                min -= length;
            }
            gB.reset();
            gy.getSegment(min, f, gB, true);
            if (f > length) {
                kg.reset();
                gy.getSegment(0.0f, f % length, kg, true);
                gB.addPath(kg);
            } else if (min < 0.0f) {
                kg.reset();
                gy.getSegment(min + length, length, kg, true);
                gB.addPath(kg);
            }
            path.set(gB);
            d.k(str);
        }
    }

    public static float cP() {
        if (ki == -1.0f) {
            ki = Resources.getSystem().getDisplayMetrics().density;
        }
        return ki;
    }

    public static float f(Context context) {
        String str = "animator_duration_scale";
        if (VERSION.SDK_INT >= 17) {
            return Global.getFloat(context.getContentResolver(), str, 1.0f);
        }
        return System.getFloat(context.getContentResolver(), str, 1.0f);
    }

    public static Bitmap a(Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        bitmap.getWidth();
        bitmap.getHeight();
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i2, true);
        bitmap.recycle();
        return createScaledBitmap;
    }
}
