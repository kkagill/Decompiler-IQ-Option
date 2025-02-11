package org.jmrtd.lds.iso19794;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import org.jmrtd.lds.AbstractImageInfo;

public class FingerImageInfo extends AbstractImageInfo {
    private static final byte[] fFu = new byte[]{(byte) 0, (byte) 9};
    private static final long serialVersionUID = -6625447389275461027L;
    private int compressionAlgorithm;
    private int impressionType;
    private int position;
    private int quality;
    private long recordLength;
    private int viewCount;
    private int viewNumber;

    private static String na(int i) {
        switch (i) {
            case 0:
                return "Unknown finger";
            case 1:
                return "Right thumb";
            case 2:
                return "Right index finger";
            case 3:
                return "Right middle finger";
            case 4:
                return "Right ring finger";
            case 5:
                return "Right little finger";
            case 6:
                return "Left thumb";
            case 7:
                return "Left index finger";
            case 8:
                return "Left middle finger";
            case 9:
                return "Left ring finger";
            case 10:
                return "Left little finger";
            case 13:
                return "Right four fingers";
            case 14:
                return "Left four fingers";
            case 15:
                return "Plain thumbs";
            case 20:
                return "Unknown palm";
            case 21:
                return "Right full palm";
            case 22:
                return "Right writer's palm";
            case 23:
                return "Left full palm";
            case 24:
                return "Left writer's palm";
            case 25:
                return "Right lower palm";
            case 26:
                return "Right upper palm";
            case 27:
                return "Left lower palm";
            case 28:
                return "Left upper palm";
            case 29:
                return "Right other";
            case 30:
                return "Left other";
            case 31:
                return "Right interdigital";
            case 32:
                return "Right thenar";
            case 33:
                return "Right hypothenar";
            case 34:
                return "Left interdigital";
            case 35:
                return "Left thenar";
            case 36:
                return "Left hypothenar";
            default:
                return null;
        }
    }

    private static String nb(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 7 ? i != 8 ? i != 9 ? null : "Live scan contactless" : "Swipe" : "Latent" : "Non-live scan rolled" : "Non-live scan plain" : "Live scan rolled" : "Live scan plain";
    }

    private static int nc(int i) {
        switch (i) {
            case 0:
                return 0;
            case 1:
                return 5;
            case 2:
                return 9;
            case 3:
                return 13;
            case 4:
                return 17;
            case 5:
                return 21;
            case 6:
                return 6;
            case 7:
                return 10;
            case 8:
                return 14;
            case 9:
                return 18;
            case 10:
                return 22;
            case 13:
                return 1;
            case 14:
                return 2;
            case 15:
                return 4;
            case 20:
                return 0;
            case 21:
                return 1;
            case 22:
                return 0;
            case 23:
            case 24:
                return 2;
            case 25:
            case 26:
                return 1;
            case 27:
            case 28:
                return 2;
            case 29:
                return 1;
            case 30:
                return 2;
            case 31:
            case 32:
            case 33:
                return 1;
            case 34:
            case 35:
            case 36:
                return 2;
            default:
                return 0;
        }
    }

    public FingerImageInfo(InputStream inputStream, int i) {
        super(2, FingerInfo.mZ(i));
        this.compressionAlgorithm = i;
        this.compressionAlgorithm = i;
        r(inputStream);
    }

    public void r(InputStream inputStream) {
        DataInputStream dataInputStream = inputStream instanceof DataInputStream ? (DataInputStream) inputStream : new DataInputStream(inputStream);
        this.recordLength = ((long) dataInputStream.readInt()) & 4294967295L;
        this.position = dataInputStream.readUnsignedByte();
        this.viewCount = dataInputStream.readUnsignedByte();
        this.viewNumber = dataInputStream.readUnsignedByte();
        this.quality = dataInputStream.readUnsignedByte();
        this.impressionType = dataInputStream.readUnsignedByte();
        setWidth(dataInputStream.readUnsignedShort());
        setHeight(dataInputStream.readUnsignedShort());
        dataInputStream.readUnsignedByte();
        b(inputStream, this.recordLength - 14);
    }

    public void f(OutputStream outputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        e(byteArrayOutputStream);
        byteArrayOutputStream.flush();
        byte[] toByteArray = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.close();
        long length = ((long) toByteArray.length) + 14;
        DataOutputStream dataOutputStream = outputStream instanceof DataOutputStream ? (DataOutputStream) outputStream : new DataOutputStream(outputStream);
        dataOutputStream.writeInt((int) (length & 4294967295L));
        dataOutputStream.writeByte(this.position);
        dataOutputStream.writeByte(this.viewCount);
        dataOutputStream.writeByte(this.viewNumber);
        dataOutputStream.writeByte(this.quality);
        dataOutputStream.writeByte(this.impressionType);
        dataOutputStream.writeShort(getWidth());
        dataOutputStream.writeShort(getHeight());
        dataOutputStream.writeByte(0);
        dataOutputStream.write(toByteArray);
        dataOutputStream.flush();
    }

    public long bSa() {
        return this.recordLength;
    }

    public int bSj() {
        return nc(this.position);
    }

    public int hashCode() {
        int hashCode = ((((((((super.hashCode() * 31) + this.compressionAlgorithm) * 31) + this.impressionType) * 31) + this.position) * 31) + this.quality) * 31;
        long j = this.recordLength;
        return ((((hashCode + ((int) (j ^ (j >>> 32)))) * 31) + this.viewCount) * 31) + this.viewNumber;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || getClass() != obj.getClass()) {
            return false;
        }
        FingerImageInfo fingerImageInfo = (FingerImageInfo) obj;
        if (!(this.compressionAlgorithm == fingerImageInfo.compressionAlgorithm && this.impressionType == fingerImageInfo.impressionType && this.position == fingerImageInfo.position && this.quality == fingerImageInfo.quality && this.recordLength == fingerImageInfo.recordLength && this.viewCount == fingerImageInfo.viewCount && this.viewNumber == fingerImageInfo.viewNumber)) {
            z = false;
        }
        return z;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("FingerImageInfo [");
        stringBuilder.append("quality: ");
        stringBuilder.append(this.quality);
        String str = ", ";
        stringBuilder.append(str);
        stringBuilder.append("position: ");
        stringBuilder.append(na(this.position));
        stringBuilder.append(str);
        stringBuilder.append("impression type: ");
        stringBuilder.append(nb(this.impressionType));
        stringBuilder.append(str);
        stringBuilder.append("horizontal line length: ");
        stringBuilder.append(getWidth());
        stringBuilder.append(str);
        stringBuilder.append("vertical line length: ");
        stringBuilder.append(getHeight());
        stringBuilder.append(str);
        stringBuilder.append("image: ");
        stringBuilder.append(getWidth());
        stringBuilder.append(" x ");
        stringBuilder.append(getHeight());
        stringBuilder.append(" \"");
        stringBuilder.append(FingerInfo.mZ(this.compressionAlgorithm));
        stringBuilder.append("\"");
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
