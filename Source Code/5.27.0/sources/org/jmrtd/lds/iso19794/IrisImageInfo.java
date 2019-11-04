package org.jmrtd.lds.iso19794;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import org.jmrtd.lds.AbstractImageInfo;

public class IrisImageInfo extends AbstractImageInfo {
    private static final long serialVersionUID = 833541246115625112L;
    private int imageFormat;
    private int imageNumber;
    private int quality;
    private int rotationAngle;
    private int rotationAngleUncertainty;

    private static String ne(int i) {
        return (i == 2 || i == 4) ? "image/x-wsq" : (i == 6 || i == 8 || i == 10 || i == 12) ? "image/jpeg" : (i == 14 || i == 16) ? "image/jp2" : null;
    }

    IrisImageInfo(InputStream inputStream, int i) {
        super(3);
        this.imageFormat = i;
        setMimeType(ne(i));
        r(inputStream);
    }

    public long bSa() {
        return ((long) bRg()) + 11;
    }

    public int hashCode() {
        return (((((((((super.hashCode() * 31) + this.imageFormat) * 31) + this.imageNumber) * 31) + this.quality) * 31) + this.rotationAngle) * 31) + this.rotationAngleUncertainty;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || getClass() != obj.getClass()) {
            return false;
        }
        IrisImageInfo irisImageInfo = (IrisImageInfo) obj;
        if (!(this.imageFormat == irisImageInfo.imageFormat && this.imageNumber == irisImageInfo.imageNumber && this.quality == irisImageInfo.quality && this.rotationAngle == irisImageInfo.rotationAngle && this.rotationAngleUncertainty == irisImageInfo.rotationAngleUncertainty)) {
            z = false;
        }
        return z;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("IrisImageInfo [");
        stringBuilder.append("image number: ");
        stringBuilder.append(this.imageNumber);
        String str = ", ";
        stringBuilder.append(str);
        stringBuilder.append("quality: ");
        stringBuilder.append(this.quality);
        stringBuilder.append(str);
        stringBuilder.append("image: ");
        stringBuilder.append(getWidth());
        stringBuilder.append(" x ");
        stringBuilder.append(getHeight());
        stringBuilder.append("mime-type: ");
        stringBuilder.append(ne(this.imageFormat));
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public void r(InputStream inputStream) {
        DataInputStream dataInputStream = inputStream instanceof DataInputStream ? (DataInputStream) inputStream : new DataInputStream(inputStream);
        this.imageNumber = dataInputStream.readUnsignedShort();
        this.quality = dataInputStream.readUnsignedByte();
        this.rotationAngle = dataInputStream.readShort();
        this.rotationAngleUncertainty = dataInputStream.readUnsignedShort();
        b(inputStream, ((long) dataInputStream.readInt()) & 4294967295L);
    }

    public void f(OutputStream outputStream) {
        DataOutputStream dataOutputStream = outputStream instanceof DataOutputStream ? (DataOutputStream) outputStream : new DataOutputStream(outputStream);
        dataOutputStream.writeShort(this.imageNumber);
        dataOutputStream.writeByte(this.quality);
        dataOutputStream.writeShort(this.rotationAngle);
        dataOutputStream.writeShort(this.rotationAngleUncertainty);
        dataOutputStream.writeInt(bRg());
        e(dataOutputStream);
    }
}
