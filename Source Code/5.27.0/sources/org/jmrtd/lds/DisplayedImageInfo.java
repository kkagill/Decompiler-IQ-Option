package org.jmrtd.lds;

import java.io.InputStream;
import java.io.OutputStream;
import net.sf.scuba.tlv.TLVInputStream;
import net.sf.scuba.tlv.TLVOutputStream;

public class DisplayedImageInfo extends AbstractImageInfo {
    private static final long serialVersionUID = 3801320585294302721L;
    private int displayedImageTag;

    public DisplayedImageInfo(InputStream inputStream) {
        r(inputStream);
    }

    /* Access modifiers changed, original: protected */
    public void r(InputStream inputStream) {
        TLVInputStream tLVInputStream = inputStream instanceof TLVInputStream ? (TLVInputStream) inputStream : new TLVInputStream(inputStream);
        this.displayedImageTag = tLVInputStream.readTag();
        int i = this.displayedImageTag;
        if (i == 24384 || i == 24387) {
            i = mT(this.displayedImageTag);
            setType(i);
            setMimeType(mR(i));
            b(tLVInputStream, (long) tLVInputStream.readLength());
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Expected tag 0x5F40 or 0x5F43, found ");
        stringBuilder.append(Integer.toHexString(this.displayedImageTag));
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    /* Access modifiers changed, original: protected */
    public void f(OutputStream outputStream) {
        TLVOutputStream tLVOutputStream = outputStream instanceof TLVOutputStream ? (TLVOutputStream) outputStream : new TLVOutputStream(outputStream);
        tLVOutputStream.writeTag(mS(getType()));
        e(tLVOutputStream);
        tLVOutputStream.writeValueEnd();
    }

    /* Access modifiers changed, original: 0000 */
    public int bRq() {
        return this.displayedImageTag;
    }

    public int hashCode() {
        return (super.hashCode() * 31) + this.displayedImageTag;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || getClass() != obj.getClass()) {
            return false;
        }
        if (this.displayedImageTag != ((DisplayedImageInfo) obj).displayedImageTag) {
            z = false;
        }
        return z;
    }

    private static String mR(int i) {
        String str = "image/jpeg";
        if (i == 0 || i == 1) {
            return str;
        }
        if (i == 2) {
            return "image/x-wsq";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unknown type: ");
        stringBuilder.append(Integer.toHexString(i));
        throw new NumberFormatException(stringBuilder.toString());
    }

    private static int mS(int i) {
        if (i == 0) {
            return 24384;
        }
        if (i == 1) {
            return 24387;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unknown type: ");
        stringBuilder.append(Integer.toHexString(i));
        throw new NumberFormatException(stringBuilder.toString());
    }

    private static int mT(int i) {
        if (i == 24384) {
            return 0;
        }
        if (i == 24387) {
            return 1;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unknown tag: ");
        stringBuilder.append(Integer.toHexString(i));
        throw new NumberFormatException(stringBuilder.toString());
    }
}
