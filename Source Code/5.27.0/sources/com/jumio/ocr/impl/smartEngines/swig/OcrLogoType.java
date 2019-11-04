package com.jumio.ocr.impl.smartEngines.swig;

public final class OcrLogoType {
    public static final OcrLogoType OcrLogoTypeAmericanExpress = new OcrLogoType("OcrLogoTypeAmericanExpress");
    public static final OcrLogoType OcrLogoTypeDinersClub = new OcrLogoType("OcrLogoTypeDinersClub");
    public static final OcrLogoType OcrLogoTypeDiscover = new OcrLogoType("OcrLogoTypeDiscover");
    public static final OcrLogoType OcrLogoTypeMasterCard = new OcrLogoType("OcrLogoTypeMasterCard");
    public static final OcrLogoType OcrLogoTypeUnknown = new OcrLogoType("OcrLogoTypeUnknown", jniInterfaceJNI.OcrLogoTypeUnknown_get());
    public static final OcrLogoType OcrLogoTypeVisa = new OcrLogoType("OcrLogoTypeVisa");
    private static int swigNext = 0;
    private static OcrLogoType[] swigValues = new OcrLogoType[]{OcrLogoTypeUnknown, OcrLogoTypeVisa, OcrLogoTypeMasterCard, OcrLogoTypeAmericanExpress, OcrLogoTypeDiscover, OcrLogoTypeDinersClub};
    private final String swigName;
    private final int swigValue;

    public final int swigValue() {
        return this.swigValue;
    }

    public String toString() {
        return this.swigName;
    }

    public static OcrLogoType swigToEnum(int i) {
        OcrLogoType[] ocrLogoTypeArr = swigValues;
        if (i < ocrLogoTypeArr.length && i >= 0 && ocrLogoTypeArr[i].swigValue == i) {
            return ocrLogoTypeArr[i];
        }
        int i2 = 0;
        while (true) {
            OcrLogoType[] ocrLogoTypeArr2 = swigValues;
            if (i2 >= ocrLogoTypeArr2.length) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("No enum ");
                stringBuilder.append(OcrLogoType.class);
                stringBuilder.append(" with value ");
                stringBuilder.append(i);
                throw new IllegalArgumentException(stringBuilder.toString());
            } else if (ocrLogoTypeArr2[i2].swigValue == i) {
                return ocrLogoTypeArr2[i2];
            } else {
                i2++;
            }
        }
    }

    private OcrLogoType(String str) {
        this.swigName = str;
        int i = swigNext;
        swigNext = i + 1;
        this.swigValue = i;
    }

    private OcrLogoType(String str, int i) {
        this.swigName = str;
        this.swigValue = i;
        swigNext = i + 1;
    }

    private OcrLogoType(String str, OcrLogoType ocrLogoType) {
        this.swigName = str;
        this.swigValue = ocrLogoType.swigValue;
        swigNext = this.swigValue + 1;
    }
}
