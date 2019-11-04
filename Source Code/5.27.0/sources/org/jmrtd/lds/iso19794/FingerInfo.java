package org.jmrtd.lds.iso19794;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.TreeMap;
import java.util.logging.Logger;
import org.jmrtd.cbeff.BiometricDataBlock;
import org.jmrtd.cbeff.StandardBiometricHeader;
import org.jmrtd.lds.AbstractListInfo;

public class FingerInfo extends AbstractListInfo<FingerImageInfo> implements BiometricDataBlock {
    private static final Logger eNz = Logger.getLogger("org.jmrtd");
    private static final long serialVersionUID = 5808625058034008176L;
    private int acquisitionLevel;
    private int captureDeviceId;
    private int compressionAlgorithm;
    private int depth;
    private int imageResolutionHorizontal;
    private int imageResolutionVertical;
    private StandardBiometricHeader sbh;
    private int scaleUnits;
    private int scanResolutionHorizontal;
    private int scanResolutionVertical;

    static String mZ(int i) {
        return (i == 0 || i == 1) ? "image/raw" : i != 2 ? i != 3 ? i != 4 ? i != 5 ? null : "image/png" : "image/jpeg2000" : "image/jpeg" : "image/x-wsq";
    }

    public FingerInfo(StandardBiometricHeader standardBiometricHeader, InputStream inputStream) {
        this.sbh = standardBiometricHeader;
        r(inputStream);
    }

    public void r(InputStream inputStream) {
        DataInputStream dataInputStream = inputStream instanceof DataInputStream ? (DataInputStream) inputStream : new DataInputStream(inputStream);
        int readInt = dataInputStream.readInt();
        StringBuilder stringBuilder;
        if (readInt == 1179210240) {
            readInt = dataInputStream.readInt();
            if (readInt == 808529920) {
                long d = d(dataInputStream, 6);
                this.captureDeviceId = dataInputStream.readUnsignedShort();
                this.acquisitionLevel = dataInputStream.readUnsignedShort();
                int readUnsignedByte = dataInputStream.readUnsignedByte();
                this.scaleUnits = dataInputStream.readUnsignedByte();
                this.scanResolutionHorizontal = dataInputStream.readUnsignedShort();
                this.scanResolutionVertical = dataInputStream.readUnsignedShort();
                this.imageResolutionHorizontal = dataInputStream.readUnsignedShort();
                this.imageResolutionVertical = dataInputStream.readUnsignedShort();
                this.depth = dataInputStream.readUnsignedByte();
                this.compressionAlgorithm = dataInputStream.readUnsignedByte();
                dataInputStream.readUnsignedShort();
                d -= 32;
                long j = 0;
                for (int i = 0; i < readUnsignedByte; i++) {
                    FingerImageInfo fingerImageInfo = new FingerImageInfo(inputStream, this.compressionAlgorithm);
                    j += fingerImageInfo.bSa();
                    a(fingerImageInfo);
                }
                if (d != j) {
                    Logger logger = eNz;
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("ConstructedDataLength and dataLength differ: dataLength = ");
                    stringBuilder.append(d);
                    stringBuilder.append(", constructedDataLength = ");
                    stringBuilder.append(j);
                    logger.warning(stringBuilder.toString());
                    return;
                }
                return;
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append("'010' version number expected! Found ");
            stringBuilder.append(Integer.toHexString(readInt));
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("'FIR' marker expected! Found ");
        stringBuilder.append(Integer.toHexString(readInt));
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public void f(OutputStream outputStream) {
        List<FingerImageInfo> bRb = bRb();
        long j = 0;
        for (FingerImageInfo bSa : bRb) {
            j += bSa.bSa();
        }
        long j2 = 32 + j;
        DataOutputStream dataOutputStream = outputStream instanceof DataOutputStream ? (DataOutputStream) outputStream : new DataOutputStream(outputStream);
        dataOutputStream.writeInt(1179210240);
        dataOutputStream.writeInt(808529920);
        a(j2, dataOutputStream, 6);
        dataOutputStream.writeShort(this.captureDeviceId);
        dataOutputStream.writeShort(this.acquisitionLevel);
        dataOutputStream.writeByte(bRb.size());
        dataOutputStream.writeByte(this.scaleUnits);
        dataOutputStream.writeShort(this.scanResolutionHorizontal);
        dataOutputStream.writeShort(this.scanResolutionVertical);
        dataOutputStream.writeShort(this.imageResolutionHorizontal);
        dataOutputStream.writeShort(this.imageResolutionVertical);
        dataOutputStream.writeByte(this.depth);
        dataOutputStream.writeByte(this.compressionAlgorithm);
        dataOutputStream.writeShort(0);
        for (FingerImageInfo f : bRb) {
            f.f(dataOutputStream);
        }
    }

    public int hashCode() {
        int hashCode = ((((((((((((super.hashCode() * 31) + this.acquisitionLevel) * 31) + this.captureDeviceId) * 31) + this.compressionAlgorithm) * 31) + this.depth) * 31) + this.imageResolutionHorizontal) * 31) + this.imageResolutionVertical) * 31;
        StandardBiometricHeader standardBiometricHeader = this.sbh;
        return ((((((hashCode + (standardBiometricHeader == null ? 0 : standardBiometricHeader.hashCode())) * 31) + this.scaleUnits) * 31) + this.scanResolutionHorizontal) * 31) + this.scanResolutionVertical;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || getClass() != obj.getClass()) {
            return false;
        }
        FingerInfo fingerInfo = (FingerInfo) obj;
        if (!(this.acquisitionLevel == fingerInfo.acquisitionLevel && this.captureDeviceId == fingerInfo.captureDeviceId && this.compressionAlgorithm == fingerInfo.compressionAlgorithm && this.depth == fingerInfo.depth && this.imageResolutionHorizontal == fingerInfo.imageResolutionHorizontal && this.imageResolutionVertical == fingerInfo.imageResolutionVertical && this.scaleUnits == fingerInfo.scaleUnits && this.scanResolutionHorizontal == fingerInfo.scanResolutionHorizontal && this.scanResolutionVertical == fingerInfo.scanResolutionVertical)) {
            z = false;
        }
        return z;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("FingerInfo [");
        for (FingerImageInfo fingerImageInfo : bRb()) {
            stringBuilder.append(fingerImageInfo.toString());
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public StandardBiometricHeader bRa() {
        if (this.sbh == null) {
            byte[] bArr = new byte[]{(byte) 8};
            byte[] bArr2 = new byte[]{(byte) bSj()};
            Object obj = new byte[]{(byte) 1, (byte) 1};
            Object obj2 = new byte[]{(byte) 0, (byte) 7};
            TreeMap treeMap = new TreeMap();
            treeMap.put(Integer.valueOf(129), bArr);
            treeMap.put(Integer.valueOf(130), bArr2);
            treeMap.put(Integer.valueOf(135), obj);
            treeMap.put(Integer.valueOf(136), obj2);
            this.sbh = new StandardBiometricHeader(treeMap);
        }
        return this.sbh;
    }

    private static long d(InputStream inputStream, int i) {
        DataInputStream dataInputStream = inputStream instanceof DataInputStream ? (DataInputStream) inputStream : new DataInputStream(inputStream);
        byte[] bArr = new byte[i];
        dataInputStream.readFully(bArr);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) + ((long) (bArr[i2] & 255));
        }
        return j;
    }

    private static void a(long j, OutputStream outputStream, int i) {
        if (i > 0) {
            for (int i2 = 0; i2 < i - 8; i2++) {
                outputStream.write(0);
            }
            if (i > 8) {
                i = 8;
            }
            for (i--; i >= 0; i--) {
                int i3 = i * 8;
                outputStream.write((byte) ((int) (((255 << i3) & j) >> i3)));
            }
        }
    }

    private int bSj() {
        int i = 0;
        Object obj = 1;
        for (FingerImageInfo bSj : bRb()) {
            int bSj2 = bSj.bSj();
            if (obj != null) {
                i = bSj2;
                obj = null;
            } else {
                i &= bSj2;
            }
        }
        return i;
    }
}
