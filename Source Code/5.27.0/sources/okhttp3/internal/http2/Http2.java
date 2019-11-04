package okhttp3.internal.http2;

import java.io.IOException;
import okhttp3.internal.Util;
import okio.ByteString;

public final class Http2 {
    static final String[] BINARY = new String[256];
    static final ByteString CONNECTION_PREFACE = ByteString.encodeUtf8("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
    static final String[] FLAGS = new String[64];
    static final byte FLAG_ACK = (byte) 1;
    static final byte FLAG_COMPRESSED = (byte) 32;
    static final byte FLAG_END_HEADERS = (byte) 4;
    static final byte FLAG_END_PUSH_PROMISE = (byte) 4;
    static final byte FLAG_END_STREAM = (byte) 1;
    static final byte FLAG_NONE = (byte) 0;
    static final byte FLAG_PADDED = (byte) 8;
    static final byte FLAG_PRIORITY = (byte) 32;
    private static final String[] FRAME_NAMES = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
    static final int INITIAL_MAX_FRAME_SIZE = 16384;
    static final byte TYPE_CONTINUATION = (byte) 9;
    static final byte TYPE_DATA = (byte) 0;
    static final byte TYPE_GOAWAY = (byte) 7;
    static final byte TYPE_HEADERS = (byte) 1;
    static final byte TYPE_PING = (byte) 6;
    static final byte TYPE_PRIORITY = (byte) 2;
    static final byte TYPE_PUSH_PROMISE = (byte) 5;
    static final byte TYPE_RST_STREAM = (byte) 3;
    static final byte TYPE_SETTINGS = (byte) 4;
    static final byte TYPE_WINDOW_UPDATE = (byte) 8;

    static {
        String str;
        int i;
        int i2;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            String[] strArr = BINARY;
            if (i4 >= strArr.length) {
                break;
            }
            strArr[i4] = Util.format("%8s", Integer.toBinaryString(i4)).replace(' ', '0');
            i4++;
        }
        String[] strArr2 = FLAGS;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = new int[]{1};
        strArr2[8] = "PADDED";
        i4 = iArr.length;
        int i5 = 0;
        while (true) {
            str = "|PADDED";
            if (i5 >= i4) {
                break;
            }
            i = iArr[i5];
            String[] strArr3 = FLAGS;
            i2 = i | 8;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(FLAGS[i]);
            stringBuilder.append(str);
            strArr3[i2] = stringBuilder.toString();
            i5++;
        }
        strArr2 = FLAGS;
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        for (int i6 : new int[]{4, 32, 36}) {
            for (int i7 : iArr) {
                String[] strArr4 = FLAGS;
                int i8 = i7 | i6;
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append(FLAGS[i7]);
                stringBuilder2.append('|');
                stringBuilder2.append(FLAGS[i6]);
                strArr4[i8] = stringBuilder2.toString();
                strArr4 = FLAGS;
                i8 |= 8;
                stringBuilder2 = new StringBuilder();
                stringBuilder2.append(FLAGS[i7]);
                stringBuilder2.append('|');
                stringBuilder2.append(FLAGS[i6]);
                stringBuilder2.append(str);
                strArr4[i8] = stringBuilder2.toString();
            }
        }
        while (true) {
            strArr2 = FLAGS;
            if (i3 < strArr2.length) {
                if (strArr2[i3] == null) {
                    strArr2[i3] = BINARY[i3];
                }
                i3++;
            } else {
                return;
            }
        }
    }

    private Http2() {
    }

    static IllegalArgumentException illegalArgument(String str, Object... objArr) {
        throw new IllegalArgumentException(Util.format(str, objArr));
    }

    static IOException ioException(String str, Object... objArr) {
        throw new IOException(Util.format(str, objArr));
    }

    static String frameLog(boolean z, int i, int i2, byte b, byte b2) {
        String[] strArr = FRAME_NAMES;
        String format = b < strArr.length ? strArr[b] : Util.format("0x%02x", Byte.valueOf(b));
        String formatFlags = formatFlags(b, b2);
        Object[] objArr = new Object[5];
        objArr[0] = z ? "<<" : ">>";
        objArr[1] = Integer.valueOf(i);
        objArr[2] = Integer.valueOf(i2);
        objArr[3] = format;
        objArr[4] = formatFlags;
        return Util.format("%s 0x%08x %5d %-13s %s", objArr);
    }

    static String formatFlags(byte b, byte b2) {
        if (b2 == (byte) 0) {
            return "";
        }
        if (!(b == TYPE_PRIORITY || b == TYPE_RST_STREAM)) {
            if (b == (byte) 4 || b == TYPE_PING) {
                return b2 == (byte) 1 ? "ACK" : BINARY[b2];
            } else if (!(b == TYPE_GOAWAY || b == (byte) 8)) {
                String[] strArr = FLAGS;
                String str = b2 < strArr.length ? strArr[b2] : BINARY[b2];
                if (b == TYPE_PUSH_PROMISE && (b2 & 4) != 0) {
                    return str.replace("HEADERS", "PUSH_PROMISE");
                }
                if (b != (byte) 0 || (b2 & 32) == 0) {
                    return str;
                }
                return str.replace("PRIORITY", "COMPRESSED");
            }
        }
        return BINARY[b2];
    }
}
