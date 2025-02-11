package io.card.payment;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.hardware.Camera;
import android.hardware.Camera.Size;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Debug;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.util.List;

/* compiled from: Util */
class m {
    private static final String TAG = "m";
    private static final boolean eLp = Build.MODEL.equals("DROID2");
    private static Boolean eLq;

    public static boolean aW(int i, int i2) {
        return (i & i2) == i2;
    }

    m() {
    }

    public static boolean bU(Context context) {
        return !eLp && context.getPackageManager().hasSystemFeature("android.hardware.camera.flash");
    }

    public static String a(ResolveInfo resolveInfo, Class cls) {
        String format;
        if (resolveInfo == null) {
            format = String.format("Didn't find %s in the AndroidManifest.xml", new Object[]{cls.getName()});
        } else if (aW(resolveInfo.activityInfo.configChanges, 128)) {
            format = null;
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(cls.getName());
            stringBuilder.append(" requires attribute android:configChanges=\"orientation\"");
            format = stringBuilder.toString();
        }
        if (format != null) {
            Log.e("card.io", format);
        }
        return format;
    }

    public static boolean biM() {
        if (eLq == null) {
            eLq = Boolean.valueOf(biN());
        }
        return eLq.booleanValue();
    }

    private static boolean biN() {
        String str = "card.io";
        if (CardScanner.biu()) {
            try {
                Camera open = Camera.open();
                if (open == null) {
                    Log.w(str, "- No camera found");
                    return false;
                }
                Object obj;
                List<Size> supportedPreviewSizes = open.getParameters().getSupportedPreviewSizes();
                open.release();
                for (Size size : supportedPreviewSizes) {
                    if (size.width == 640 && size.height == 480) {
                        obj = 1;
                        break;
                    }
                }
                obj = null;
                if (obj != null) {
                    return true;
                }
                Log.w(str, "- Camera resolution is insufficient");
                return false;
            } catch (RuntimeException e) {
                if (VERSION.SDK_INT >= 23) {
                    return true;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("- Error opening camera: ");
                stringBuilder.append(e);
                Log.w(str, stringBuilder.toString());
                throw new CameraUnavailableException();
            }
        }
        Log.w(str, "- Processor type is not supported");
        return false;
    }

    public static String biO() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("(free/alloc'd/total)");
        stringBuilder.append(Debug.getNativeHeapFreeSize());
        String str = "/";
        stringBuilder.append(str);
        stringBuilder.append(Debug.getNativeHeapAllocatedSize());
        stringBuilder.append(str);
        stringBuilder.append(Debug.getNativeHeapSize());
        return stringBuilder.toString();
    }

    public static void biP() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Native memory stats: ");
        stringBuilder.append(biO());
        Log.d("MEMORY", stringBuilder.toString());
    }

    public static Rect a(Point point, int i, int i2) {
        i /= 2;
        i2 /= 2;
        return new Rect(point.x - i, point.y - i2, point.x + i, point.y + i2);
    }

    public static void a(Paint paint) {
        paint.setColor(-1);
        paint.setStyle(Style.FILL);
        paint.setTypeface(Typeface.create(Typeface.SANS_SERIF, 1));
        paint.setAntiAlias(true);
        paint.setShadowLayer(1.5f, 0.5f, 0.0f, Color.HSVToColor(200, new float[]{0.0f, 0.0f, 0.0f}));
    }

    static void a(Intent intent, Intent intent2, i iVar) {
        if (intent.getBooleanExtra(CardIOActivity.EXTRA_RETURN_CARD_IMAGE, false) && iVar != null && iVar.getBitmap() != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            iVar.getBitmap().compress(CompressFormat.JPEG, 80, byteArrayOutputStream);
            intent2.putExtra(CardIOActivity.EXTRA_CAPTURED_CARD_IMAGE, byteArrayOutputStream.toByteArray());
        }
    }
}
