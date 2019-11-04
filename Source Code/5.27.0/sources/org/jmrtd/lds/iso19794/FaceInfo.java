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

public class FaceInfo extends AbstractListInfo<FaceImageInfo> implements BiometricDataBlock {
    private static final Logger eNz = Logger.getLogger("org.jmrtd");
    private static final long serialVersionUID = -6053206262773400725L;
    private StandardBiometricHeader sbh;

    public FaceInfo(StandardBiometricHeader standardBiometricHeader, InputStream inputStream) {
        this.sbh = standardBiometricHeader;
        r(inputStream);
    }

    public void r(InputStream inputStream) {
        DataInputStream dataInputStream = inputStream instanceof DataInputStream ? (DataInputStream) inputStream : new DataInputStream(inputStream);
        int readInt = dataInputStream.readInt();
        StringBuilder stringBuilder;
        if (readInt == 1178682112) {
            readInt = dataInputStream.readInt();
            if (readInt == 808529920) {
                long readInt2 = (((long) dataInputStream.readInt()) & 4294967295L) - 14;
                long j = 0;
                int readUnsignedShort = dataInputStream.readUnsignedShort();
                for (int i = 0; i < readUnsignedShort; i++) {
                    FaceImageInfo faceImageInfo = new FaceImageInfo(inputStream);
                    j += faceImageInfo.bSa();
                    a(faceImageInfo);
                }
                if (readInt2 != j) {
                    Logger logger = eNz;
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("ConstructedDataLength and dataLength differ: dataLength = ");
                    stringBuilder.append(readInt2);
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
        stringBuilder.append("'FAC' marker expected! Found ");
        stringBuilder.append(Integer.toHexString(readInt));
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public void f(OutputStream outputStream) {
        List<FaceImageInfo> bRb = bRb();
        long j = 0;
        for (FaceImageInfo bSa : bRb) {
            j += bSa.bSa();
        }
        long j2 = ((long) 14) + j;
        DataOutputStream dataOutputStream = outputStream instanceof DataOutputStream ? (DataOutputStream) outputStream : new DataOutputStream(outputStream);
        dataOutputStream.writeInt(1178682112);
        dataOutputStream.writeInt(808529920);
        dataOutputStream.writeInt((int) (4294967295L & j2));
        dataOutputStream.writeShort(bRb.size());
        for (FaceImageInfo f : bRb) {
            f.f(dataOutputStream);
        }
    }

    public StandardBiometricHeader bRa() {
        if (this.sbh == null) {
            byte[] bArr = new byte[]{(byte) 2};
            byte[] bArr2 = new byte[]{(byte) 0};
            Object obj = new byte[]{(byte) 1, (byte) 1};
            Object obj2 = new byte[]{(byte) 0, (byte) 8};
            TreeMap treeMap = new TreeMap();
            treeMap.put(Integer.valueOf(129), bArr);
            treeMap.put(Integer.valueOf(130), bArr2);
            treeMap.put(Integer.valueOf(135), obj);
            treeMap.put(Integer.valueOf(136), obj2);
            this.sbh = new StandardBiometricHeader(treeMap);
        }
        return this.sbh;
    }
}
