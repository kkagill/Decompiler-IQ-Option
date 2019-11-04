package org.jmrtd.lds.iso19794;

import androidx.core.internal.view.SupportMenu;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import org.jmrtd.lds.AbstractListInfo;

public class IrisBiometricSubtypeInfo extends AbstractListInfo<IrisImageInfo> {
    private static final long serialVersionUID = -6588640634764878039L;
    private int biometricSubtype;
    private int imageFormat;

    public IrisBiometricSubtypeInfo(InputStream inputStream, int i) {
        this.imageFormat = i;
        r(inputStream);
    }

    public void r(InputStream inputStream) {
        DataInputStream dataInputStream = inputStream instanceof DataInputStream ? (DataInputStream) inputStream : new DataInputStream(inputStream);
        this.biometricSubtype = dataInputStream.readUnsignedByte();
        int readUnsignedShort = dataInputStream.readUnsignedShort();
        for (int i = 0; i < readUnsignedShort; i++) {
            IrisImageInfo irisImageInfo = new IrisImageInfo(inputStream, this.imageFormat);
            irisImageInfo.bSa();
            a(irisImageInfo);
        }
    }

    public void f(OutputStream outputStream) {
        DataOutputStream dataOutputStream = outputStream instanceof DataOutputStream ? (DataOutputStream) outputStream : new DataOutputStream(outputStream);
        dataOutputStream.writeByte(this.biometricSubtype & 255);
        List<IrisImageInfo> bRb = bRb();
        dataOutputStream.writeShort(bRb.size() & SupportMenu.USER_MASK);
        for (IrisImageInfo f : bRb) {
            f.f(dataOutputStream);
        }
    }

    public long bSa() {
        long j = 3;
        for (IrisImageInfo bSa : bRb()) {
            j += bSa.bSa();
        }
        return j;
    }

    public int hashCode() {
        return (((super.hashCode() * 31) + this.biometricSubtype) * 31) + this.imageFormat;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || getClass() != obj.getClass()) {
            return false;
        }
        IrisBiometricSubtypeInfo irisBiometricSubtypeInfo = (IrisBiometricSubtypeInfo) obj;
        if (!(this.biometricSubtype == irisBiometricSubtypeInfo.biometricSubtype && this.imageFormat == irisBiometricSubtypeInfo.imageFormat)) {
            z = false;
        }
        return z;
    }

    public String toString() {
        List bRb = bRb();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("IrisBiometricSubtypeInfo [biometric subtype: ");
        stringBuilder.append(nd(this.biometricSubtype));
        stringBuilder.append(", imageCount = ");
        stringBuilder.append(bRb.size());
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public int bSj() {
        return this.biometricSubtype;
    }

    private static String nd(int i) {
        if (i == 0) {
            return "Undefined";
        }
        if (i == 1) {
            return "Right eye";
        }
        if (i == 2) {
            return "Left eye";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unknown biometric subtype: ");
        stringBuilder.append(Integer.toHexString(i));
        throw new NumberFormatException(stringBuilder.toString());
    }
}
