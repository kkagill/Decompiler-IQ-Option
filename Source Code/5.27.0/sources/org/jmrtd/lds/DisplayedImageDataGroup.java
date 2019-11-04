package org.jmrtd.lds;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import net.sf.scuba.tlv.TLVInputStream;
import net.sf.scuba.tlv.TLVOutputStream;

public abstract class DisplayedImageDataGroup extends DataGroup {
    private static final Logger eNz = Logger.getLogger("org.jmrtd");
    private static final long serialVersionUID = 5994136177872308962L;
    private int displayedImageTagToUse;
    private List<DisplayedImageInfo> imageInfos;

    public DisplayedImageDataGroup(int i, InputStream inputStream) {
        super(i, inputStream);
        if (this.imageInfos == null) {
            this.imageInfos = new ArrayList();
        }
        bRp();
    }

    /* Access modifiers changed, original: protected */
    public void s(InputStream inputStream) {
        TLVInputStream tLVInputStream = inputStream instanceof TLVInputStream ? (TLVInputStream) inputStream : new TLVInputStream(inputStream);
        int readTag = tLVInputStream.readTag();
        if (readTag != 2) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Expected tag 0x02 in displayed image structure, found ");
            stringBuilder.append(Integer.toHexString(readTag));
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (tLVInputStream.readLength() == 1) {
            int i = 0;
            readTag = tLVInputStream.readValue()[0] & 255;
            while (i < readTag) {
                DisplayedImageInfo displayedImageInfo = new DisplayedImageInfo(tLVInputStream);
                if (i == 0) {
                    this.displayedImageTagToUse = displayedImageInfo.bRq();
                } else if (displayedImageInfo.bRq() != this.displayedImageTagToUse) {
                    throw new IOException("Found images with different displayed image tags inside displayed image datagroup");
                }
                a(displayedImageInfo);
                i++;
            }
        } else {
            throw new IllegalArgumentException("DISPLAYED_IMAGE_COUNT should have length 1");
        }
    }

    /* Access modifiers changed, original: protected */
    public void g(OutputStream outputStream) {
        TLVOutputStream tLVOutputStream = outputStream instanceof TLVOutputStream ? (TLVOutputStream) outputStream : new TLVOutputStream(outputStream);
        tLVOutputStream.writeTag(2);
        tLVOutputStream.writeValue(new byte[]{(byte) this.imageInfos.size()});
        for (DisplayedImageInfo f : this.imageInfos) {
            f.f(tLVOutputStream);
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getClass().getSimpleName());
        stringBuilder.append(" [");
        List<DisplayedImageInfo> list = this.imageInfos;
        if (list != null) {
            Object obj = 1;
            for (DisplayedImageInfo displayedImageInfo : list) {
                if (obj != null) {
                    obj = null;
                } else {
                    stringBuilder.append(", ");
                }
                stringBuilder.append(displayedImageInfo.toString());
            }
            stringBuilder.append("]");
            return stringBuilder.toString();
        }
        throw new IllegalStateException("imageInfos cannot be null");
    }

    public int hashCode() {
        List list = this.imageInfos;
        return ((list == null ? 1 : list.hashCode()) + 1337) + 31337;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!getClass().equals(obj.getClass())) {
            return false;
        }
        DisplayedImageDataGroup displayedImageDataGroup = (DisplayedImageDataGroup) obj;
        List list = this.imageInfos;
        List list2 = displayedImageDataGroup.imageInfos;
        if (list == list2 || (list != null && list.equals(list2))) {
            z = true;
        }
        return z;
    }

    private void a(DisplayedImageInfo displayedImageInfo) {
        if (this.imageInfos == null) {
            this.imageInfos = new ArrayList();
        }
        this.imageInfos.add(displayedImageInfo);
    }

    private void bRp() {
        for (DisplayedImageInfo displayedImageInfo : this.imageInfos) {
            if (displayedImageInfo != null) {
                int type = displayedImageInfo.getType();
                if (type != 0) {
                    if (type != 1) {
                        eNz.warning("Unsupported image type");
                    } else if (this.displayedImageTagToUse != 24387) {
                        throw new IllegalArgumentException("'Portrait' image cannot be part of a 'Signature or usual mark' displayed image datagroup");
                    }
                } else if (this.displayedImageTagToUse != 24384) {
                    throw new IllegalArgumentException("'Signature or usual mark' image cannot be part of a 'Portrait' displayed image datagroup");
                }
            } else {
                throw new IllegalArgumentException("Found a null image info");
            }
        }
    }
}
