package org.jmrtd.lds.iso19794;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.logging.Logger;
import net.sf.scuba.data.Gender;
import org.jmrtd.lds.AbstractImageInfo;

public class FaceImageInfo extends AbstractImageInfo {
    private static final Logger eNz = Logger.getLogger("org.jmrtd");
    private static final long serialVersionUID = -1751069410327594067L;
    private int colorSpace;
    private int deviceType;
    private int expression;
    private EyeColor eyeColor;
    private int faceImageType;
    private int featureMask;
    private FeaturePoint[] featurePoints;
    private Gender gender;
    private int hairColor;
    private int imageDataType;
    private int[] poseAngle;
    private int[] poseAngleUncertainty;
    private int quality;
    private long recordLength;
    private int sourceType;

    public enum EyeColor {
        UNSPECIFIED(0),
        BLACK(1),
        BLUE(2),
        BROWN(3),
        GRAY(4),
        GREEN(5),
        MULTI_COLORED(6),
        PINK(7),
        UNKNOWN(255);
        
        private int code;

        private EyeColor(int i) {
            this.code = i;
        }

        public int toInt() {
            return this.code;
        }

        static EyeColor toEyeColor(int i) {
            for (EyeColor eyeColor : values()) {
                if (eyeColor.toInt() == i) {
                    return eyeColor;
                }
            }
            return UNKNOWN;
        }
    }

    public static class FeaturePoint implements Serializable {
        private static final long serialVersionUID = -4209679423938065215L;
        private int majorCode;
        private int minorCode;
        private int type;
        private int x;
        private int y;

        public FeaturePoint(int i, int i2, int i3, int i4, int i5) {
            this.type = i;
            this.majorCode = i2;
            this.minorCode = i3;
            this.x = i4;
            this.y = i5;
        }

        FeaturePoint(int i, byte b, int i2, int i3) {
            this(i, (b & 240) >> 4, b & 15, i2, i3);
        }

        public int bSh() {
            return this.majorCode;
        }

        public int bSi() {
            return this.minorCode;
        }

        public int getType() {
            return this.type;
        }

        public int getX() {
            return this.x;
        }

        public int getY() {
            return this.y;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("( point: ");
            stringBuilder.append(bSh());
            stringBuilder.append(".");
            stringBuilder.append(bSi());
            String str = ", ";
            stringBuilder.append(str);
            stringBuilder.append("type: ");
            stringBuilder.append(Integer.toHexString(this.type));
            stringBuilder.append(str);
            stringBuilder.append("(");
            stringBuilder.append(this.x);
            stringBuilder.append(str);
            stringBuilder.append(this.y);
            str = ")";
            stringBuilder.append(str);
            stringBuilder.append(str);
            return stringBuilder.toString();
        }
    }

    public FaceImageInfo(InputStream inputStream) {
        super(0);
        r(inputStream);
    }

    public void r(InputStream inputStream) {
        DataInputStream dataInputStream = inputStream instanceof DataInputStream ? (DataInputStream) inputStream : new DataInputStream(inputStream);
        this.recordLength = ((long) dataInputStream.readInt()) & 4294967295L;
        int readUnsignedShort = dataInputStream.readUnsignedShort();
        this.gender = Gender.getInstance(dataInputStream.readUnsignedByte());
        this.eyeColor = EyeColor.toEyeColor(dataInputStream.readUnsignedByte());
        this.hairColor = dataInputStream.readUnsignedByte();
        this.featureMask = dataInputStream.readUnsignedByte();
        this.featureMask = (this.featureMask << 16) | dataInputStream.readUnsignedShort();
        this.expression = dataInputStream.readShort();
        this.poseAngle = new int[3];
        int i = 0;
        this.poseAngle[0] = dataInputStream.readUnsignedByte();
        this.poseAngle[1] = dataInputStream.readUnsignedByte();
        this.poseAngle[2] = dataInputStream.readUnsignedByte();
        this.poseAngleUncertainty = new int[3];
        this.poseAngleUncertainty[0] = dataInputStream.readUnsignedByte();
        this.poseAngleUncertainty[1] = dataInputStream.readUnsignedByte();
        this.poseAngleUncertainty[2] = dataInputStream.readUnsignedByte();
        this.featurePoints = new FeaturePoint[readUnsignedShort];
        while (i < readUnsignedShort) {
            int readUnsignedByte = dataInputStream.readUnsignedByte();
            byte readByte = dataInputStream.readByte();
            int readUnsignedShort2 = dataInputStream.readUnsignedShort();
            int readUnsignedShort3 = dataInputStream.readUnsignedShort();
            for (long j = 0; j < 2; j += dataInputStream.skip(2)) {
            }
            this.featurePoints[i] = new FeaturePoint(readUnsignedByte, readByte, readUnsignedShort2, readUnsignedShort3);
            i++;
        }
        this.faceImageType = dataInputStream.readUnsignedByte();
        this.imageDataType = dataInputStream.readUnsignedByte();
        setWidth(dataInputStream.readUnsignedShort());
        setHeight(dataInputStream.readUnsignedShort());
        this.colorSpace = dataInputStream.readUnsignedByte();
        this.sourceType = dataInputStream.readUnsignedByte();
        this.deviceType = dataInputStream.readUnsignedShort();
        this.quality = dataInputStream.readUnsignedShort();
        if (getWidth() <= 0) {
            setWidth(800);
        }
        if (getHeight() <= 0) {
            setHeight(600);
        }
        setMimeType(mZ(this.imageDataType));
        b(inputStream, ((this.recordLength - 20) - ((long) (readUnsignedShort * 8))) - 12);
    }

    public void f(OutputStream outputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        i(byteArrayOutputStream);
        byte[] toByteArray = byteArrayOutputStream.toByteArray();
        long length = ((long) toByteArray.length) + 4;
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        dataOutputStream.writeInt((int) length);
        dataOutputStream.write(toByteArray);
        dataOutputStream.flush();
    }

    public long bSa() {
        return this.recordLength;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Image size: ");
        stringBuilder.append(getWidth());
        stringBuilder.append(" x ");
        stringBuilder.append(getHeight());
        String str = "\n";
        stringBuilder.append(str);
        stringBuilder.append("Gender: ");
        Object obj = this.gender;
        if (obj == null) {
            obj = Gender.UNSPECIFIED;
        }
        stringBuilder.append(obj);
        stringBuilder.append(str);
        stringBuilder.append("Eye color: ");
        obj = this.eyeColor;
        if (obj == null) {
            obj = EyeColor.UNSPECIFIED;
        }
        stringBuilder.append(obj);
        stringBuilder.append(str);
        stringBuilder.append("Hair color: ");
        stringBuilder.append(bSb());
        stringBuilder.append(str);
        stringBuilder.append("Feature mask: ");
        stringBuilder.append(bSc());
        stringBuilder.append(str);
        stringBuilder.append("Expression: ");
        stringBuilder.append(bSd());
        stringBuilder.append(str);
        stringBuilder.append("Pose angle: ");
        stringBuilder.append(bSe());
        stringBuilder.append(str);
        stringBuilder.append("Face image type: ");
        stringBuilder.append(bSf());
        stringBuilder.append(str);
        stringBuilder.append("Source type: ");
        stringBuilder.append(bSg());
        stringBuilder.append(str);
        stringBuilder.append("Feature points: ");
        stringBuilder.append(str);
        FeaturePoint[] featurePointArr = this.featurePoints;
        if (featurePointArr == null || featurePointArr.length == 0) {
            stringBuilder.append("   (none)\n");
        } else {
            for (FeaturePoint featurePoint : featurePointArr) {
                stringBuilder.append("   ");
                stringBuilder.append(featurePoint.toString());
                stringBuilder.append(str);
            }
        }
        return stringBuilder.toString();
    }

    public int hashCode() {
        int hashCode = ((((((super.hashCode() * 31) + this.colorSpace) * 31) + this.deviceType) * 31) + this.expression) * 31;
        EyeColor eyeColor = this.eyeColor;
        int i = 0;
        hashCode = (((((((hashCode + (eyeColor == null ? 0 : eyeColor.hashCode())) * 31) + this.faceImageType) * 31) + this.featureMask) * 31) + Arrays.hashCode(this.featurePoints)) * 31;
        Gender gender = this.gender;
        if (gender != null) {
            i = gender.hashCode();
        }
        hashCode = (((((((((((hashCode + i) * 31) + this.hairColor) * 31) + this.imageDataType) * 31) + Arrays.hashCode(this.poseAngle)) * 31) + Arrays.hashCode(this.poseAngleUncertainty)) * 31) + this.quality) * 31;
        long j = this.recordLength;
        return ((hashCode + ((int) (j ^ (j >>> 32)))) * 31) + this.sourceType;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || getClass() != obj.getClass()) {
            return false;
        }
        FaceImageInfo faceImageInfo = (FaceImageInfo) obj;
        if (!(this.colorSpace == faceImageInfo.colorSpace && this.deviceType == faceImageInfo.deviceType && this.expression == faceImageInfo.expression && this.eyeColor == faceImageInfo.eyeColor && this.faceImageType == faceImageInfo.faceImageType && this.featureMask == faceImageInfo.featureMask && Arrays.equals(this.featurePoints, faceImageInfo.featurePoints) && this.gender == faceImageInfo.gender && this.hairColor == faceImageInfo.hairColor && this.imageDataType == faceImageInfo.imageDataType && Arrays.equals(this.poseAngle, faceImageInfo.poseAngle) && Arrays.equals(this.poseAngleUncertainty, faceImageInfo.poseAngleUncertainty) && this.quality == faceImageInfo.quality && this.recordLength == faceImageInfo.recordLength && this.sourceType == faceImageInfo.sourceType)) {
            z = false;
        }
        return z;
    }

    private void i(OutputStream outputStream) {
        int i;
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        dataOutputStream.writeShort(this.featurePoints.length);
        Gender gender = this.gender;
        if (gender == null) {
            gender = Gender.UNSPECIFIED;
        }
        dataOutputStream.writeByte(gender.toInt());
        EyeColor eyeColor = this.eyeColor;
        if (eyeColor == null) {
            eyeColor = EyeColor.UNSPECIFIED;
        }
        dataOutputStream.writeByte(eyeColor.toInt());
        dataOutputStream.writeByte(this.hairColor);
        dataOutputStream.writeByte((byte) ((int) ((((long) this.featureMask) & 16711680) >> 16)));
        dataOutputStream.writeByte((byte) ((int) ((((long) this.featureMask) & 65280) >> 8)));
        dataOutputStream.writeByte((byte) ((int) (((long) this.featureMask) & 255)));
        dataOutputStream.writeShort(this.expression);
        for (i = 0; i < 3; i++) {
            dataOutputStream.writeByte(this.poseAngle[i]);
        }
        for (i = 0; i < 3; i++) {
            dataOutputStream.writeByte(this.poseAngleUncertainty[i]);
        }
        for (FeaturePoint featurePoint : this.featurePoints) {
            dataOutputStream.writeByte(featurePoint.getType());
            dataOutputStream.writeByte((featurePoint.bSh() << 4) | featurePoint.bSi());
            dataOutputStream.writeShort(featurePoint.getX());
            dataOutputStream.writeShort(featurePoint.getY());
            dataOutputStream.writeShort(0);
        }
        dataOutputStream.writeByte(this.faceImageType);
        dataOutputStream.writeByte(this.imageDataType);
        dataOutputStream.writeShort(getWidth());
        dataOutputStream.writeShort(getHeight());
        dataOutputStream.writeByte(this.colorSpace);
        dataOutputStream.writeByte(this.sourceType);
        dataOutputStream.writeShort(this.deviceType);
        dataOutputStream.writeShort(this.quality);
        e(dataOutputStream);
        dataOutputStream.flush();
        dataOutputStream.close();
    }

    private String bSb() {
        switch (this.hairColor) {
            case 0:
                return "unspecified";
            case 1:
                return "bald";
            case 2:
                return "black";
            case 3:
                return "blonde";
            case 4:
                return "brown";
            case 5:
                return "gray";
            case 6:
                return "white";
            case 7:
                return "red";
            case 8:
                return "green";
            case 9:
                return "blue";
            default:
                return "unknown";
        }
    }

    private String bSc() {
        if ((this.featureMask & 1) == 0) {
            return "";
        }
        ArrayList arrayList = new ArrayList();
        if ((this.featureMask & 2) != 0) {
            arrayList.add("glasses");
        }
        if ((this.featureMask & 4) != 0) {
            arrayList.add("moustache");
        }
        if ((this.featureMask & 8) != 0) {
            arrayList.add("beard");
        }
        if ((this.featureMask & 16) != 0) {
            arrayList.add("teeth visible");
        }
        if ((this.featureMask & 32) != 0) {
            arrayList.add("blink");
        }
        if ((this.featureMask & 64) != 0) {
            arrayList.add("mouth open");
        }
        if ((this.featureMask & 128) != 0) {
            arrayList.add("left eye patch");
        }
        if ((this.featureMask & 256) != 0) {
            arrayList.add("right eye patch");
        }
        if ((this.featureMask & 512) != 0) {
            arrayList.add("dark glasses");
        }
        if ((this.featureMask & 1024) != 0) {
            arrayList.add("distorting medical condition (which could impact feature point detection)");
        }
        StringBuilder stringBuilder = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            stringBuilder.append((String) it.next());
            if (it.hasNext()) {
                stringBuilder.append(", ");
            }
        }
        return stringBuilder.toString();
    }

    private String bSd() {
        switch (this.expression) {
            case 0:
                return "unspecified";
            case 1:
                return "neutral (non-smiling) with both eyes open and mouth closed";
            case 2:
                return "a smile where the inside of the mouth and/or teeth is not exposed (closed jaw)";
            case 3:
                return "a smile where the inside of the mouth and/or teeth is exposed";
            case 4:
                return "raised eyebrows";
            case 5:
                return "eyes looking away from the camera";
            case 6:
                return "squinting";
            case 7:
                return "frowning";
            default:
                return "unknown";
        }
    }

    private String bSe() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("(");
        stringBuilder.append("y: ");
        stringBuilder.append(this.poseAngle[0]);
        String str = " (";
        String str2 = ")";
        if (this.poseAngleUncertainty[0] != 0) {
            stringBuilder.append(str);
            stringBuilder.append(this.poseAngleUncertainty[0]);
            stringBuilder.append(str2);
        }
        String str3 = ", ";
        stringBuilder.append(str3);
        stringBuilder.append("p:");
        stringBuilder.append(this.poseAngle[1]);
        if (this.poseAngleUncertainty[1] != 0) {
            stringBuilder.append(str);
            stringBuilder.append(this.poseAngleUncertainty[1]);
            stringBuilder.append(str2);
        }
        stringBuilder.append(str3);
        stringBuilder.append("r: ");
        stringBuilder.append(this.poseAngle[2]);
        if (this.poseAngleUncertainty[2] != 0) {
            stringBuilder.append(str);
            stringBuilder.append(this.poseAngleUncertainty[2]);
            stringBuilder.append(str2);
        }
        stringBuilder.append(str2);
        return stringBuilder.toString();
    }

    private String bSf() {
        int i = this.faceImageType;
        if (i == 0) {
            return "basic";
        }
        if (i != 1) {
            return i != 2 ? "unknown" : "token frontal";
        } else {
            return "full frontal";
        }
    }

    private String bSg() {
        switch (this.sourceType) {
            case 0:
                return "unspecified";
            case 1:
                return "static photograph from an unknown source";
            case 2:
                return "static photograph from a digital still-image camera";
            case 3:
                return "static photograph from a scanner";
            case 4:
                return "single video frame from an unknown source";
            case 5:
                return "single video frame from an analogue camera";
            case 6:
                return "single video frame from a digital camera";
            default:
                return "unknown";
        }
    }

    private static String mZ(int i) {
        if (i == 0) {
            return "image/jpeg";
        }
        if (i == 1) {
            return "image/jp2";
        }
        Logger logger = eNz;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unknown image type: ");
        stringBuilder.append(i);
        logger.warning(stringBuilder.toString());
        return null;
    }
}
