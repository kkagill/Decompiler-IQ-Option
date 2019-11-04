package jumio.nv.ocr;

import com.jumio.clientlib.impl.templatematcher.ImgWarp;
import com.jumio.clientlib.impl.templatematcher.PixelFormatType;
import com.jumio.commons.camera.Size;
import com.jumio.commons.log.Log;

/* compiled from: TemplateMatcherImageProcessor */
public class f {
    public static float[] a(a aVar, float f) {
        float[] d = aVar.d();
        float f2 = (((d[0] + d[2]) + d[6]) + d[4]) / 4.0f;
        float f3 = (((d[1] + d[3]) + d[7]) + d[5]) / 4.0f;
        float f4 = d[0] - f2;
        float f5 = d[1] - f3;
        float f6 = d[2] - f2;
        float f7 = d[3] - f3;
        float f8 = d[6] - f2;
        float f9 = d[7] - f3;
        float f10 = d[4] - f2;
        float f11 = d[5] - f3;
        double sqrt = Math.sqrt((double) ((f4 * f4) + (f5 * f5)));
        float f12 = f3;
        double sqrt2 = Math.sqrt((double) ((f6 * f6) + (f7 * f7)));
        float f13 = f2;
        double sqrt3 = Math.sqrt((double) ((f8 * f8) + (f9 * f9)));
        float f14 = f9;
        double sqrt4 = Math.sqrt((double) ((f10 * f10) + (f11 * f11)));
        double d2 = (double) f4;
        Double.isNaN(d2);
        f4 = (float) (d2 / sqrt);
        d2 = (double) f5;
        Double.isNaN(d2);
        float f15 = (float) (d2 / sqrt);
        double d3 = (double) f6;
        Double.isNaN(d3);
        f9 = (float) (d3 / sqrt2);
        d3 = (double) f7;
        Double.isNaN(d3);
        f5 = (float) (d3 / sqrt2);
        double d4 = (double) f8;
        Double.isNaN(d4);
        f6 = (float) (d4 / sqrt3);
        double d5 = (double) f14;
        Double.isNaN(d5);
        f14 = (float) (d5 / sqrt3);
        d5 = (double) f10;
        Double.isNaN(d5);
        f10 = (float) (d5 / sqrt4);
        d5 = (double) f11;
        Double.isNaN(d5);
        f11 = (float) (d5 / sqrt4);
        d5 = (double) f4;
        float f16 = f10;
        double d6 = (double) f;
        Double.isNaN(d6);
        sqrt *= d6;
        Double.isNaN(d5);
        f = (float) (d5 * sqrt);
        d5 = (double) f15;
        Double.isNaN(d5);
        float f17 = (float) (d5 * sqrt);
        d2 = (double) f9;
        Double.isNaN(d6);
        sqrt2 *= d6;
        Double.isNaN(d2);
        float f18 = (float) (d2 * sqrt2);
        d2 = (double) f5;
        Double.isNaN(d2);
        float f19 = (float) (d2 * sqrt2);
        double d7 = (double) f6;
        Double.isNaN(d6);
        sqrt3 *= d6;
        Double.isNaN(d7);
        f3 = (float) (d7 * sqrt3);
        d2 = (double) f14;
        Double.isNaN(d2);
        float f20 = (float) (d2 * sqrt3);
        d2 = (double) f16;
        Double.isNaN(d6);
        d6 *= sqrt4;
        Double.isNaN(d2);
        f2 = (float) (d2 * d6);
        d2 = (double) f11;
        Double.isNaN(d2);
        f10 = (float) (d2 * d6);
        d[0] = f13 + f;
        d[1] = f12 + f17;
        d[2] = f13 + f18;
        d[3] = f12 + f19;
        d[6] = f13 + f3;
        d[7] = f12 + f20;
        d[4] = f13 + f2;
        d[5] = f12 + f10;
        return d;
    }

    public static byte[] a(byte[] bArr, boolean z, a aVar) {
        float[] d = aVar.d();
        int g = (int) (z ? aVar.g() : aVar.f());
        int f = (int) (z ? aVar.f() : aVar.g());
        float o = ((float) aVar.o()) / ((float) aVar.p());
        int width = aVar.h().width();
        return a(bArr, g, f, d, width, (int) (((float) width) / o));
    }

    public static byte[] a(byte[] bArr, float f, Size size, boolean z, a aVar) {
        float[] a = a(aVar, f);
        int g = (int) (z ? aVar.g() : aVar.f());
        int f2 = (int) (z ? aVar.f() : aVar.g());
        float o = ((float) aVar.o()) / ((float) aVar.p());
        size.width = (int) (((float) aVar.h().width()) * f);
        size.height = (int) (((float) size.width) / o);
        return a(bArr, g, f2, a, size.width, size.height);
    }

    public static byte[] a(byte[] bArr, int i, int i2, float[] fArr, int i3, int i4) {
        byte[] bArr2 = bArr;
        int i5 = i;
        int i6 = i2;
        int i7 = i3;
        int i8 = i4;
        long currentTimeMillis = System.currentTimeMillis();
        byte[] bArr3 = new byte[((i4 * i3) * 3)];
        byte[] bArr4 = bArr3;
        ImgWarp.warp(bArr2, (long) i, i5, i6, PixelFormatType.PIXEL_FORMAT_YUV420_NV21, fArr[0], fArr[1], fArr[2], fArr[3], fArr[4], fArr[5], fArr[6], fArr[7], bArr3, i7, i8);
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Image warping took ");
        stringBuilder.append(currentTimeMillis2);
        stringBuilder.append(" ms");
        Log.d("TemplateMatcher", stringBuilder.toString());
        return bArr4;
    }
}
