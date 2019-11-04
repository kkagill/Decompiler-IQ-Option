package com.jumio.ocr.impl.smartEngines.swig;

public class ConversionUtils {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public static final class ImageFormat {
        public static final ImageFormat FORMAT_JPEG = new ImageFormat("FORMAT_JPEG");
        public static final ImageFormat FORMAT_PNG = new ImageFormat("FORMAT_PNG");
        public static final ImageFormat FORMAT_TIFF = new ImageFormat("FORMAT_TIFF");
        public static final ImageFormat FORMAT_UNKNOWN = new ImageFormat("FORMAT_UNKNOWN");
        public static final ImageFormat FORMAT_WEBP = new ImageFormat("FORMAT_WEBP");
        private static int swigNext = 0;
        private static ImageFormat[] swigValues = new ImageFormat[]{FORMAT_TIFF, FORMAT_JPEG, FORMAT_PNG, FORMAT_WEBP, FORMAT_UNKNOWN};
        private final String swigName;
        private final int swigValue;

        public final int swigValue() {
            return this.swigValue;
        }

        public String toString() {
            return this.swigName;
        }

        public static ImageFormat swigToEnum(int i) {
            ImageFormat[] imageFormatArr = swigValues;
            if (i < imageFormatArr.length && i >= 0 && imageFormatArr[i].swigValue == i) {
                return imageFormatArr[i];
            }
            int i2 = 0;
            while (true) {
                ImageFormat[] imageFormatArr2 = swigValues;
                if (i2 >= imageFormatArr2.length) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("No enum ");
                    stringBuilder.append(ImageFormat.class);
                    stringBuilder.append(" with value ");
                    stringBuilder.append(i);
                    throw new IllegalArgumentException(stringBuilder.toString());
                } else if (imageFormatArr2[i2].swigValue == i) {
                    return imageFormatArr2[i2];
                } else {
                    i2++;
                }
            }
        }

        private ImageFormat(String str) {
            this.swigName = str;
            int i = swigNext;
            swigNext = i + 1;
            this.swigValue = i;
        }

        private ImageFormat(String str, int i) {
            this.swigName = str;
            this.swigValue = i;
            swigNext = i + 1;
        }

        private ImageFormat(String str, ImageFormat imageFormat) {
            this.swigName = str;
            this.swigValue = imageFormat.swigValue;
            swigNext = this.swigValue + 1;
        }
    }

    protected ConversionUtils(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    protected static long getCPtr(ConversionUtils conversionUtils) {
        return conversionUtils == null ? 0 : conversionUtils.swigCPtr;
    }

    /* Access modifiers changed, original: protected */
    public void finalize() {
        delete();
    }

    public synchronized void delete() {
        if (this.swigCPtr != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                jniInterfaceJNI.delete_ConversionUtils(this.swigCPtr);
            }
            this.swigCPtr = 0;
        }
    }

    public static int convertImage(byte[] bArr, ImageFormat imageFormat, byte[] bArr2) {
        return jniInterfaceJNI.ConversionUtils_convertImage(bArr, imageFormat.swigValue(), bArr2);
    }

    public ConversionUtils() {
        this(jniInterfaceJNI.new_ConversionUtils(), true);
    }
}
