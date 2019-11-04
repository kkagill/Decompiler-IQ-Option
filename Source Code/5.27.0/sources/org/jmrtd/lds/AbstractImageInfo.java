package org.jmrtd.lds;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jmrtd.io.c;

public abstract class AbstractImageInfo implements ImageInfo {
    private static final Logger eNz = Logger.getLogger("org.jmrtd");
    private static final long serialVersionUID = 2870092217269116309L;
    private transient c fEG;
    private int height;
    private byte[] imageBytes;
    private int imageLength;
    private int imagePositionInInputStream;
    private String mimeType;
    private int type;
    private int width;

    public abstract void f(OutputStream outputStream);

    public abstract void r(InputStream inputStream);

    AbstractImageInfo() {
        this(-1, 0, 0, null);
    }

    protected AbstractImageInfo(int i) {
        this(i, 0, 0, null);
    }

    protected AbstractImageInfo(int i, String str) {
        this(i, 0, 0, str);
    }

    private AbstractImageInfo(int i, int i2, int i3, String str) {
        this.type = i;
        this.mimeType = str;
        this.width = i2;
        this.height = i3;
    }

    public int getType() {
        return this.type;
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }

    public int bRg() {
        if (this.fEG != null) {
            return this.imageLength;
        }
        byte[] bArr = this.imageBytes;
        if (bArr != null) {
            return bArr.length;
        }
        throw new IllegalStateException("Cannot get length of null");
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getClass().getSimpleName());
        stringBuilder.append(" [");
        stringBuilder.append("type: ");
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(typeToString(this.type));
        stringBuilder2.append(", ");
        stringBuilder.append(stringBuilder2.toString());
        stringBuilder.append("size: ");
        stringBuilder.append(bRg());
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public int hashCode() {
        int i = -591263623 + (this.type * 5);
        String str = this.mimeType;
        return (i + (((str == null ? 1337 : str.hashCode()) * 5) + 7)) + ((bRg() * 7) + 11);
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        try {
            if (!obj.getClass().equals(getClass())) {
                return false;
            }
            AbstractImageInfo abstractImageInfo = (AbstractImageInfo) obj;
            if (Arrays.equals(bRi(), abstractImageInfo.bRi()) && (((this.mimeType == null && abstractImageInfo.mimeType == null) || (this.mimeType != null && this.mimeType.equals(abstractImageInfo.mimeType))) && this.type == abstractImageInfo.type)) {
                z = true;
            }
            return z;
        } catch (Exception e) {
            Logger logger = eNz;
            Level level = Level.WARNING;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Exception");
            stringBuilder.append(e);
            logger.log(level, stringBuilder.toString());
            return false;
        }
    }

    public byte[] getEncoded() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            f(byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            eNz.log(Level.WARNING, "Exception", e);
            return null;
        }
    }

    public InputStream bRh() {
        c cVar = this.fEG;
        if (cVar != null) {
            return cVar.ia(this.imagePositionInInputStream);
        }
        byte[] bArr = this.imageBytes;
        if (bArr != null) {
            return new ByteArrayInputStream(bArr);
        }
        throw new IllegalStateException("Both the byte buffer and the stream are null");
    }

    /* Access modifiers changed, original: protected */
    public void b(InputStream inputStream, long j) {
        this.fEG = null;
        this.imageBytes = new byte[((int) j)];
        new DataInputStream(inputStream).readFully(this.imageBytes);
    }

    /* Access modifiers changed, original: protected */
    public void e(OutputStream outputStream) {
        outputStream.write(bRi());
    }

    /* Access modifiers changed, original: protected|final */
    public final void setMimeType(String str) {
        this.mimeType = str;
    }

    /* Access modifiers changed, original: protected|final */
    public final void setType(int i) {
        this.type = i;
    }

    /* Access modifiers changed, original: protected|final */
    public final void setWidth(int i) {
        this.width = i;
    }

    /* Access modifiers changed, original: protected|final */
    public final void setHeight(int i) {
        this.height = i;
    }

    private byte[] bRi() {
        byte[] bArr = new byte[bRg()];
        new DataInputStream(bRh()).readFully(bArr);
        return bArr;
    }

    private static String typeToString(int i) {
        if (i == -1) {
            return "Unknown";
        }
        if (i == 0) {
            return "Portrait";
        }
        if (i == 1) {
            return "Signature or usual mark";
        }
        if (i == 2) {
            return "Finger";
        }
        if (i == 3) {
            return "Iris";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unknown type: ");
        stringBuilder.append(Integer.toHexString(i));
        throw new NumberFormatException(stringBuilder.toString());
    }
}
