package com.jumio.clientlib.impl.imagequality;

public final class PixelFormatType {
    public static final PixelFormatType PIXEL_FORMAT_BGRA_8 = new PixelFormatType("PIXEL_FORMAT_BGRA_8");
    public static final PixelFormatType PIXEL_FORMAT_BGR_8 = new PixelFormatType("PIXEL_FORMAT_BGR_8");
    public static final PixelFormatType PIXEL_FORMAT_GRAY = new PixelFormatType("PIXEL_FORMAT_GRAY");
    public static final PixelFormatType PIXEL_FORMAT_RGBA_8 = new PixelFormatType("PIXEL_FORMAT_RGBA_8");
    public static final PixelFormatType PIXEL_FORMAT_RGB_8 = new PixelFormatType("PIXEL_FORMAT_RGB_8");
    public static final PixelFormatType PIXEL_FORMAT_YUV420_NV21 = new PixelFormatType("PIXEL_FORMAT_YUV420_NV21");
    private static int swigNext = 0;
    private static PixelFormatType[] swigValues = new PixelFormatType[]{PIXEL_FORMAT_RGB_8, PIXEL_FORMAT_RGBA_8, PIXEL_FORMAT_BGR_8, PIXEL_FORMAT_BGRA_8, PIXEL_FORMAT_YUV420_NV21, PIXEL_FORMAT_GRAY};
    private final String swigName;
    private final int swigValue;

    public final int swigValue() {
        return this.swigValue;
    }

    public String toString() {
        return this.swigName;
    }

    public static PixelFormatType swigToEnum(int i) {
        PixelFormatType[] pixelFormatTypeArr = swigValues;
        if (i < pixelFormatTypeArr.length && i >= 0 && pixelFormatTypeArr[i].swigValue == i) {
            return pixelFormatTypeArr[i];
        }
        int i2 = 0;
        while (true) {
            PixelFormatType[] pixelFormatTypeArr2 = swigValues;
            if (i2 >= pixelFormatTypeArr2.length) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("No enum ");
                stringBuilder.append(PixelFormatType.class);
                stringBuilder.append(" with value ");
                stringBuilder.append(i);
                throw new IllegalArgumentException(stringBuilder.toString());
            } else if (pixelFormatTypeArr2[i2].swigValue == i) {
                return pixelFormatTypeArr2[i2];
            } else {
                i2++;
            }
        }
    }

    private PixelFormatType(String str) {
        this.swigName = str;
        int i = swigNext;
        swigNext = i + 1;
        this.swigValue = i;
    }

    private PixelFormatType(String str, int i) {
        this.swigName = str;
        this.swigValue = i;
        swigNext = i + 1;
    }

    private PixelFormatType(String str, PixelFormatType pixelFormatType) {
        this.swigName = str;
        this.swigValue = pixelFormatType.swigValue;
        swigNext = this.swigValue + 1;
    }
}
