package org.jmrtd.lds.iso19794;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;
import java.util.logging.Logger;
import org.jmrtd.cbeff.BiometricDataBlock;
import org.jmrtd.cbeff.StandardBiometricHeader;
import org.jmrtd.lds.AbstractListInfo;

public class IrisInfo extends AbstractListInfo<IrisBiometricSubtypeInfo> implements BiometricDataBlock {
    private static final Logger eNz = Logger.getLogger("org.jmrtd");
    private static final long serialVersionUID = -3415309711643815511L;
    private int boundaryExtraction;
    private int captureDeviceId;
    private byte[] deviceUniqueId;
    private int horizontalOrientation;
    private int imageFormat;
    private int imageTransformation;
    private int intensityDepth;
    private int irisDiameter;
    private int irisOcclusion;
    private int occlusionFilling;
    private int rawImageHeight;
    private int rawImageWidth;
    private long recordLength;
    private StandardBiometricHeader sbh;
    private int scanType;
    private int verticalOrientation;

    public IrisInfo(StandardBiometricHeader standardBiometricHeader, InputStream inputStream) {
        this.sbh = standardBiometricHeader;
        r(inputStream);
    }

    public void r(InputStream inputStream) {
        DataInputStream dataInputStream = inputStream instanceof DataInputStream ? (DataInputStream) inputStream : new DataInputStream(inputStream);
        int readInt = dataInputStream.readInt();
        StringBuilder stringBuilder;
        if (readInt == 1229541888) {
            readInt = dataInputStream.readInt();
            if (readInt == 808529920) {
                this.recordLength = (long) dataInputStream.readInt();
                long j = this.recordLength - 45;
                this.captureDeviceId = dataInputStream.readUnsignedShort();
                int readUnsignedByte = dataInputStream.readUnsignedByte();
                int readUnsignedShort = dataInputStream.readUnsignedShort();
                if (((long) readUnsignedShort) == 45) {
                    readInt = dataInputStream.readUnsignedShort();
                    this.horizontalOrientation = readInt & 3;
                    this.verticalOrientation = (readInt & 12) >> 2;
                    this.scanType = (readInt & 112) >> 4;
                    this.irisOcclusion = (readInt & 128) >> 7;
                    this.occlusionFilling = (readInt & 256) >> 8;
                    this.boundaryExtraction = (readInt & 512) >> 9;
                    this.irisDiameter = dataInputStream.readUnsignedShort();
                    this.imageFormat = dataInputStream.readUnsignedShort();
                    this.rawImageWidth = dataInputStream.readUnsignedShort();
                    this.rawImageHeight = dataInputStream.readUnsignedShort();
                    this.intensityDepth = dataInputStream.readUnsignedByte();
                    this.imageTransformation = dataInputStream.readUnsignedByte();
                    this.deviceUniqueId = new byte[16];
                    dataInputStream.readFully(this.deviceUniqueId);
                    long j2 = 0;
                    for (int i = 0; i < readUnsignedByte; i++) {
                        IrisBiometricSubtypeInfo irisBiometricSubtypeInfo = new IrisBiometricSubtypeInfo(inputStream, this.imageFormat);
                        j2 += irisBiometricSubtypeInfo.bSa();
                        a(irisBiometricSubtypeInfo);
                    }
                    if (j != j2) {
                        Logger logger = eNz;
                        StringBuilder stringBuilder2 = new StringBuilder();
                        stringBuilder2.append("ConstructedDataLength and dataLength differ: dataLength = ");
                        stringBuilder2.append(j);
                        stringBuilder2.append(", constructedDataLength = ");
                        stringBuilder2.append(j2);
                        logger.warning(stringBuilder2.toString());
                        return;
                    }
                    return;
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("Expected header length ");
                stringBuilder.append(45);
                stringBuilder.append(", found ");
                stringBuilder.append(readUnsignedShort);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append("'010' version number expected! Found ");
            stringBuilder.append(Integer.toHexString(readInt));
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("'IIR' marker expected! Found ");
        stringBuilder.append(Integer.toHexString(readInt));
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public void f(OutputStream outputStream) {
        List<IrisBiometricSubtypeInfo> bRb = bRb();
        int i = 0;
        for (IrisBiometricSubtypeInfo bSa : bRb) {
            i = (int) (((long) i) + bSa.bSa());
        }
        i += 45;
        DataOutputStream dataOutputStream = outputStream instanceof DataOutputStream ? (DataOutputStream) outputStream : new DataOutputStream(outputStream);
        dataOutputStream.writeInt(1229541888);
        dataOutputStream.writeInt(808529920);
        dataOutputStream.writeInt(i);
        dataOutputStream.writeShort(this.captureDeviceId);
        dataOutputStream.writeByte(bRb.size());
        dataOutputStream.writeShort(45);
        dataOutputStream.writeShort(((((((this.horizontalOrientation & 3) | 0) | ((this.verticalOrientation << 2) & 12)) | ((this.scanType << 4) & 112)) | ((this.irisOcclusion << 7) & 128)) | ((this.occlusionFilling << 8) & 256)) | ((this.boundaryExtraction << 9) & 512));
        dataOutputStream.writeShort(this.irisDiameter);
        dataOutputStream.writeShort(this.imageFormat);
        dataOutputStream.writeShort(this.rawImageWidth);
        dataOutputStream.writeShort(this.rawImageHeight);
        dataOutputStream.writeByte(this.intensityDepth);
        dataOutputStream.writeByte(this.imageTransformation);
        dataOutputStream.write(this.deviceUniqueId);
        for (IrisBiometricSubtypeInfo f : bRb) {
            f.f(outputStream);
        }
    }

    public StandardBiometricHeader bRa() {
        if (this.sbh == null) {
            byte[] bArr = new byte[]{(byte) 8};
            byte[] bArr2 = new byte[]{(byte) bSj()};
            Object obj = new byte[]{(byte) 1, (byte) 1};
            Object obj2 = new byte[]{(byte) 0, (byte) 9};
            TreeMap treeMap = new TreeMap();
            treeMap.put(Integer.valueOf(129), bArr);
            treeMap.put(Integer.valueOf(130), bArr2);
            treeMap.put(Integer.valueOf(135), obj);
            treeMap.put(Integer.valueOf(136), obj2);
            this.sbh = new StandardBiometricHeader(treeMap);
        }
        return this.sbh;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((((((((super.hashCode() * 31) + this.boundaryExtraction) * 31) + this.captureDeviceId) * 31) + Arrays.hashCode(this.deviceUniqueId)) * 31) + this.horizontalOrientation) * 31) + this.imageFormat) * 31) + this.imageTransformation) * 31) + this.intensityDepth) * 31) + this.irisDiameter) * 31) + this.irisOcclusion) * 31) + this.occlusionFilling) * 31) + this.rawImageHeight) * 31) + this.rawImageWidth) * 31;
        long j = this.recordLength;
        hashCode = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        StandardBiometricHeader standardBiometricHeader = this.sbh;
        return ((((hashCode + (standardBiometricHeader == null ? 0 : standardBiometricHeader.hashCode())) * 31) + this.scanType) * 31) + this.verticalOrientation;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || getClass() != obj.getClass()) {
            return false;
        }
        IrisInfo irisInfo = (IrisInfo) obj;
        StandardBiometricHeader standardBiometricHeader = this.sbh;
        if (standardBiometricHeader == null) {
            if (irisInfo.sbh != null) {
                return false;
            }
        } else if (!standardBiometricHeader.equals(irisInfo.sbh)) {
            return false;
        }
        return this.boundaryExtraction == irisInfo.boundaryExtraction && this.captureDeviceId == irisInfo.captureDeviceId && Arrays.equals(this.deviceUniqueId, irisInfo.deviceUniqueId) && this.horizontalOrientation == irisInfo.horizontalOrientation && this.imageFormat == irisInfo.imageFormat && this.imageTransformation == irisInfo.imageTransformation && this.intensityDepth == irisInfo.intensityDepth && this.irisDiameter == irisInfo.irisDiameter && this.irisOcclusion == irisInfo.irisOcclusion && this.occlusionFilling == irisInfo.occlusionFilling && this.rawImageHeight == irisInfo.rawImageHeight && this.rawImageWidth == irisInfo.rawImageWidth && this.recordLength == irisInfo.recordLength && this.scanType == irisInfo.scanType && this.verticalOrientation == irisInfo.verticalOrientation;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("IrisInfo [");
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    private int bSj() {
        int i = 0;
        for (IrisBiometricSubtypeInfo bSj : bRb()) {
            i &= bSj.bSj();
        }
        return i;
    }
}
