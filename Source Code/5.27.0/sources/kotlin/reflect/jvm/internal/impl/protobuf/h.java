package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/* compiled from: Internal */
public class h {
    public static final byte[] EMPTY_BYTE_ARRAY = new byte[0];
    public static final ByteBuffer fqt = ByteBuffer.wrap(EMPTY_BYTE_ARRAY);

    /* compiled from: Internal */
    public interface a {
        int getNumber();
    }

    /* compiled from: Internal */
    public interface b<T extends a> {
        T kb(int i);
    }

    public static boolean ad(byte[] bArr) {
        return u.ad(bArr);
    }

    public static String ae(byte[] bArr) {
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported?", e);
        }
    }
}
