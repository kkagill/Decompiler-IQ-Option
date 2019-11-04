package okhttp3;

import java.io.Closeable;
import java.io.File;
import java.nio.charset.Charset;
import okhttp3.internal.Util;
import okio.BufferedSink;
import okio.ByteString;
import okio.Okio;

public abstract class RequestBody {
    public long contentLength() {
        return -1;
    }

    public abstract MediaType contentType();

    public abstract void writeTo(BufferedSink bufferedSink);

    public static RequestBody create(MediaType mediaType, String str) {
        Charset charset = Util.UTF_8;
        if (mediaType != null) {
            charset = mediaType.charset();
            if (charset == null) {
                charset = Util.UTF_8;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(mediaType);
                stringBuilder.append("; charset=utf-8");
                mediaType = MediaType.parse(stringBuilder.toString());
            }
        }
        return create(mediaType, str.getBytes(charset));
    }

    public static RequestBody create(final MediaType mediaType, final ByteString byteString) {
        return new RequestBody() {
            public MediaType contentType() {
                return mediaType;
            }

            public long contentLength() {
                return (long) byteString.size();
            }

            public void writeTo(BufferedSink bufferedSink) {
                bufferedSink.write(byteString);
            }
        };
    }

    public static RequestBody create(MediaType mediaType, byte[] bArr) {
        return create(mediaType, bArr, 0, bArr.length);
    }

    public static RequestBody create(final MediaType mediaType, final byte[] bArr, final int i, final int i2) {
        if (bArr != null) {
            Util.checkOffsetAndCount((long) bArr.length, (long) i, (long) i2);
            return new RequestBody() {
                public MediaType contentType() {
                    return mediaType;
                }

                public long contentLength() {
                    return (long) i2;
                }

                public void writeTo(BufferedSink bufferedSink) {
                    bufferedSink.write(bArr, i, i2);
                }
            };
        }
        throw new NullPointerException("content == null");
    }

    public static RequestBody create(final MediaType mediaType, final File file) {
        if (file != null) {
            return new RequestBody() {
                public MediaType contentType() {
                    return mediaType;
                }

                public long contentLength() {
                    return file.length();
                }

                public void writeTo(BufferedSink bufferedSink) {
                    Closeable closeable = null;
                    try {
                        closeable = Okio.source(file);
                        bufferedSink.writeAll(closeable);
                    } finally {
                        Util.closeQuietly(closeable);
                    }
                }
            };
        }
        throw new NullPointerException("file == null");
    }
}
