package com.jumio.clientlib.impl.templatematcher;

public final class PixelFormatType {
    public static final PixelFormatType PIXEL_FORMAT_BGRA_8 = new PixelFormatType("PIXEL_FORMAT_BGRA_8");
    public static final PixelFormatType PIXEL_FORMAT_BGR_8 = new PixelFormatType("PIXEL_FORMAT_BGR_8");
    public static final PixelFormatType PIXEL_FORMAT_GRAY = new PixelFormatType("PIXEL_FORMAT_GRAY");
    public static final PixelFormatType PIXEL_FORMAT_RGBA_8 = new PixelFormatType("PIXEL_FORMAT_RGBA_8");
    public static final PixelFormatType PIXEL_FORMAT_RGB_8 = new PixelFormatType("PIXEL_FORMAT_RGB_8");
    public static final PixelFormatType PIXEL_FORMAT_YUV420_NV21 = new PixelFormatType("PIXEL_FORMAT_YUV420_NV21");
    private static PixelFormatType[] a = new PixelFormatType[]{PIXEL_FORMAT_RGB_8, PIXEL_FORMAT_RGBA_8, PIXEL_FORMAT_BGR_8, PIXEL_FORMAT_BGRA_8, PIXEL_FORMAT_YUV420_NV21, PIXEL_FORMAT_GRAY};
    private static int b = 0;
    private final int c;
    private final String d;

    public final int swigValue() {
        return this.c;
    }

    public String toString() {
        return this.d;
    }

    public static PixelFormatType swigToEnum(int i) {
        PixelFormatType[] pixelFormatTypeArr = a;
        if (i < pixelFormatTypeArr.length && i >= 0 && pixelFormatTypeArr[i].c == i) {
            return pixelFormatTypeArr[i];
        }
        int i2 = 0;
        while (true) {
            PixelFormatType[] pixelFormatTypeArr2 = a;
            if (i2 >= pixelFormatTypeArr2.length) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("No enum ");
                stringBuilder.append(PixelFormatType.class);
                stringBuilder.append(" with value ");
                stringBuilder.append(i);
                throw new IllegalArgumentException(stringBuilder.toString());
            } else if (pixelFormatTypeArr2[i2].c == i) {
                return pixelFormatTypeArr2[i2];
            } else {
                i2++;
            }
        }
    }

    private PixelFormatType(String str) {
        this.d = str;
        int i = b;
        b = i + 1;
        this.c = i;
    }
}
