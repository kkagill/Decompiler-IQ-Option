package org.jmrtd.lds;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.scuba.tlv.TLVInputStream;
import net.sf.scuba.tlv.TLVOutputStream;
import org.jmrtd.io.c;

public abstract class AbstractTaggedLDSFile extends AbstractLDSFile {
    private static final Logger eNz = Logger.getLogger("org.jmrtd");
    private static final long serialVersionUID = -4761360877353069639L;
    private int length;
    private int tag;

    public abstract void g(OutputStream outputStream);

    public abstract void s(InputStream inputStream);

    public /* bridge */ /* synthetic */ byte[] getEncoded() {
        return super.getEncoded();
    }

    protected AbstractTaggedLDSFile(int i, InputStream inputStream) {
        this.tag = i;
        r(inputStream);
    }

    /* Access modifiers changed, original: protected */
    public void r(InputStream inputStream) {
        TLVInputStream tLVInputStream = inputStream instanceof TLVInputStream ? (TLVInputStream) inputStream : new TLVInputStream(inputStream);
        int readTag = tLVInputStream.readTag();
        if (readTag == this.tag) {
            this.length = tLVInputStream.readLength();
            s(new c(inputStream, this.length));
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Was expecting tag ");
        stringBuilder.append(Integer.toHexString(this.tag));
        stringBuilder.append(", found ");
        stringBuilder.append(Integer.toHexString(readTag));
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    /* Access modifiers changed, original: protected */
    public void f(OutputStream outputStream) {
        int i;
        TLVOutputStream tLVOutputStream = outputStream instanceof TLVOutputStream ? (TLVOutputStream) outputStream : new TLVOutputStream(outputStream);
        int tag = getTag();
        if (this.tag != tag) {
            this.tag = tag;
        }
        tLVOutputStream.writeTag(tag);
        byte[] byJ = byJ();
        if (byJ == null) {
            i = 0;
        } else {
            i = byJ.length;
        }
        if (this.length != i) {
            this.length = i;
        }
        tLVOutputStream.writeValue(byJ);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TaggedLDSFile [");
        stringBuilder.append(Integer.toHexString(getTag()));
        stringBuilder.append(" (");
        stringBuilder.append(getLength());
        stringBuilder.append(")]");
        return stringBuilder.toString();
    }

    public int getTag() {
        return this.tag;
    }

    private byte[] byJ() {
        String str = "Error closing stream";
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            g(byteArrayOutputStream);
            byteArrayOutputStream.flush();
            byte[] toByteArray = byteArrayOutputStream.toByteArray();
            try {
                byteArrayOutputStream.close();
            } catch (IOException e) {
                eNz.log(Level.FINE, str, e);
            }
            return toByteArray;
        } catch (IOException e2) {
            throw new IllegalStateException("Could not get DG content", e2);
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (IOException e3) {
                eNz.log(Level.FINE, str, e3);
            }
        }
    }

    public int getLength() {
        if (this.length <= 0) {
            this.length = byJ().length;
        }
        return this.length;
    }
}
